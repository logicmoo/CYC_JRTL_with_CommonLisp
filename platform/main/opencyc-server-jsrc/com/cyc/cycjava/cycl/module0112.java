package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0112 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0112";
    public static final String myFingerPrint = "a38d021f10032abc2a4aeb4cb0d019c7e3e8d1c40df859c997b5634215ccc1a2";
    public static SubLSymbol $g1410$;
    private static SubLSymbol $g1411$;
    private static SubLSymbol $g1412$;
    public static SubLSymbol $g1413$;
    private static SubLSymbol $g1414$;
    private static SubLSymbol $g1415$;
    private static SubLSymbol $g1416$;
    private static SubLSymbol $g1417$;
    public static SubLSymbol $g1418$;
    public static SubLSymbol $g1419$;
    private static SubLSymbol $g1420$;
    private static SubLSymbol $g1421$;
    private static SubLSymbol $g1422$;
    private static SubLSymbol $g1423$;
    private static SubLSymbol $g1424$;
    private static SubLSymbol $g1425$;
    private static SubLSymbol $g1426$;
    public static SubLSymbol $g1427$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
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
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLList $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
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
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLList $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLList $ic194$;
    private static final SubLList $ic195$;
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
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLList $ic222$;
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
    private static final SubLList $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLList $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLList $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLList $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLList $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLString $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLList $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLString $ic272$;
    private static final SubLList $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLList $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLList $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLList $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLList $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLList $ic302$;
    private static final SubLList $ic303$;
    private static final SubLString $ic304$;
    private static final SubLList $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLString $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLString $ic316$;
    private static final SubLList $ic317$;
    private static final SubLString $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLList $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLList $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLString $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLString $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLList $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLList $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLList $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLString $ic361$;
    private static final SubLList $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLSymbol $ic365$;
    private static final SubLString $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLString $ic370$;
    private static final SubLSymbol $ic371$;
    
    public static SubLObject f7688(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != $g1410$.getDynamicValue(var2)) {
            return f7689(var1);
        }
        return f7690(var1);
    }
    
    public static SubLObject f7691(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != $g1410$.getDynamicValue(var2)) {
            return f7689(var1);
        }
        return Eval.eval(var1);
    }
    
    public static SubLObject f7692(final SubLObject var3, final SubLObject var4) {
        if (var3.isFunctionSpec()) {
            return Functions.apply(var3, var4);
        }
        return f7688(reader.bq_cons(var3, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic0$), var4), (SubLObject)NIL)));
    }
    
    public static SubLObject f7693(final SubLObject var5) {
        return (SubLObject)makeBoolean(var5.isFunctionSpec() || (var5.isSymbol() && NIL != f7694(var5)));
    }
    
    public static SubLObject f7695(final SubLObject var3, final SubLObject var6) {
        if (var3.isFunctionSpec()) {
            return module0004.f98(var3, var6);
        }
        return f7688((SubLObject)ConsesLow.list(var3, module0035.f2241(var6)));
    }
    
    public static SubLObject f7696(final SubLObject var3, final SubLObject var6, final SubLObject var7) {
        if (var3.isFunctionSpec()) {
            return module0004.f99(var3, var6, var7);
        }
        return f7688((SubLObject)ConsesLow.list(var3, module0035.f2241(var6), module0035.f2241(var7)));
    }
    
    public static SubLObject f7697(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        if (var3.isFunctionSpec()) {
            return module0004.f100(var3, var6, var7, var8);
        }
        return f7688((SubLObject)ConsesLow.list(var3, module0035.f2241(var6), module0035.f2241(var7), module0035.f2241(var8)));
    }
    
    public static SubLObject f7698(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        if (var3.isFunctionSpec()) {
            return module0004.f101(var3, var6, var7, var8, var9);
        }
        return f7688((SubLObject)ConsesLow.list(var3, module0035.f2241(var6), module0035.f2241(var7), module0035.f2241(var8), module0035.f2241(var9)));
    }
    
    public static SubLObject f7699(final SubLObject var10) {
        $g1411$.setGlobalValue((SubLObject)ConsesLow.cons(var10, $g1411$.getGlobalValue()));
        return var10;
    }
    
    public static SubLObject f7700(final SubLObject var5) {
        return module0004.f104(var5, $g1411$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7701(final SubLObject var10) {
        $g1412$.setGlobalValue((SubLObject)ConsesLow.cons(var10, $g1412$.getGlobalValue()));
        return var10;
    }
    
    public static SubLObject f7702(final SubLObject var5) {
        return module0004.f104(var5, $g1412$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7703(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(var5.isSymbol() && NIL != module0035.sublisp_boolean(conses_high.assoc(var5, $g1413$.getDynamicValue(var6), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f7704(final SubLObject var5) {
        return (SubLObject)makeBoolean(var5.isSymbol() && NIL == f7703(var5) && NIL != f7700(var5));
    }
    
    public static SubLObject f7705(final SubLObject var11) {
        return module0035.sublisp_boolean(Hashtables.gethash(var11, $g1414$.getGlobalValue(), (SubLObject)NIL));
    }
    
    public static SubLObject f7706(final SubLObject var11) {
        return Hashtables.gethash(var11, $g1414$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7707(final SubLObject var11, final SubLObject var12) {
        Hashtables.sethash(var11, $g1414$.getGlobalValue(), var12);
        return var11;
    }
    
    public static SubLObject f7694(final SubLObject var11) {
        return module0035.sublisp_boolean(Hashtables.gethash(var11, $g1415$.getGlobalValue(), (SubLObject)NIL));
    }
    
    public static SubLObject f7708(final SubLObject var11) {
        return Hashtables.gethash(var11, $g1415$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7709(final SubLObject var11, final SubLObject var12) {
        Hashtables.sethash(var11, $g1415$.getGlobalValue(), var12);
        return var11;
    }
    
    public static SubLObject f7710(final SubLObject var11) {
        return module0035.sublisp_boolean(Hashtables.gethash(var11, $g1416$.getGlobalValue(), (SubLObject)NIL));
    }
    
    public static SubLObject f7711(final SubLObject var11) {
        return Hashtables.gethash(var11, $g1416$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7712(final SubLObject var11, final SubLObject var13) {
        Hashtables.sethash(var11, $g1416$.getGlobalValue(), var13);
        return var11;
    }
    
    public static SubLObject f7713(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic7$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic7$);
        var19 = var17.first();
        final SubLObject var20;
        var17 = (var20 = var17.rest());
        final SubLObject var21 = (SubLObject)$ic8$;
        final SubLObject var22 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic9$, var18), (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var22, (SubLObject)ConsesLow.list(var21), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var19, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var21), ConsesLow.append(var20, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var22)));
    }
    
    public static SubLObject f7714(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic7$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic7$);
        var19 = var17.first();
        final SubLObject var20;
        var17 = (var20 = var17.rest());
        final SubLObject var21 = (SubLObject)$ic16$;
        final SubLObject var22 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic17$, var18), (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var22, (SubLObject)ConsesLow.list(var21), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var19, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var21), ConsesLow.append(var20, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var22)));
    }
    
    public static SubLObject f7715(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)$ic22$, ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f7690(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = Eval.$evaluator_method$.currentBinding(var22);
        try {
            Eval.$evaluator_method$.bind($g1417$.getGlobalValue(), var22);
            var23 = Functions.funcall($g1417$.getGlobalValue(), var21);
        }
        finally {
            Eval.$evaluator_method$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f7716(final SubLObject var29, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = Eval.$evaluator_method$.currentBinding(var31);
        try {
            Eval.$evaluator_method$.bind($g1417$.getGlobalValue(), var31);
            var32 = Functions.apply(var29, var30);
        }
        finally {
            Eval.$evaluator_method$.rebind(var33, var31);
        }
        return var32;
    }
    
    public static SubLObject f7717(final SubLObject var29, SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var9) {
        final SubLObject var30 = (SubLObject)makeBoolean(var6 != UNPROVIDED);
        final SubLObject var31 = (SubLObject)makeBoolean(var7 != UNPROVIDED);
        final SubLObject var32 = (SubLObject)makeBoolean(var8 != UNPROVIDED);
        final SubLObject var33 = (SubLObject)makeBoolean(var9 != UNPROVIDED);
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)NIL;
        final SubLObject var36 = Eval.$evaluator_method$.currentBinding(var34);
        try {
            Eval.$evaluator_method$.bind($g1417$.getGlobalValue(), var34);
            if (NIL != var33) {
                var35 = Functions.funcall(var29, var6, var7, var8, var9);
            }
            else if (NIL != var32) {
                var35 = Functions.funcall(var29, var6, var7, var8);
            }
            else if (NIL != var31) {
                var35 = Functions.funcall(var29, var6, var7);
            }
            else if (NIL != var30) {
                var35 = Functions.funcall(var29, var6);
            }
            else {
                var35 = Functions.funcall(var29);
            }
        }
        finally {
            Eval.$evaluator_method$.rebind(var36, var34);
        }
        return var35;
    }
    
    public static SubLObject f7718(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)$ic23$, ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f7719() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7689(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = $g1420$.currentBinding(var22);
        final SubLObject var25 = $g1421$.currentBinding(var22);
        final SubLObject var26 = $g1422$.currentBinding(var22);
        try {
            $g1420$.bind((SubLObject)MINUS_ONE_INTEGER, var22);
            $g1421$.bind((SubLObject)MINUS_ONE_INTEGER, var22);
            $g1422$.bind((SubLObject)NIL, var22);
            SubLObject var27 = (SubLObject)NIL;
            final SubLObject var28 = Sequences.length($g1413$.getDynamicValue(var22));
            try {
                var22.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var28_42 = Errors.$error_handler$.currentBinding(var22);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic26$, var22);
                    try {
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var21)));
                    }
                    catch (Throwable var29) {
                        Errors.handleThrowable(var29, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var28_42, var22);
                }
            }
            catch (Throwable var30) {
                var27 = Errors.handleThrowable(var30, module0003.$g3$.getGlobalValue());
            }
            finally {
                var22.throwStack.pop();
            }
            if (NIL != var27) {
                while (Sequences.length($g1413$.getDynamicValue(var22)).numG(var28)) {
                    $g1413$.setDynamicValue($g1413$.getDynamicValue(var22).rest(), var22);
                }
                Errors.error(var27);
            }
        }
        finally {
            $g1422$.rebind(var26, var22);
            $g1421$.rebind(var25, var22);
            $g1420$.rebind(var24, var22);
        }
        return module0004.values_list(var23);
    }
    
    public static SubLObject f7721(final SubLObject var11) {
        assert NIL != Types.symbolp(var11) : var11;
        return (SubLObject)makeBoolean(NIL != f7722(var11) || NIL != f7723(var11) || NIL != module0012.f377(var11));
    }
    
    public static SubLObject f7722(final SubLObject var11) {
        assert NIL != Types.symbolp(var11) : var11;
        return (SubLObject)makeBoolean(NIL != f7694(var11) || NIL != module0012.f380(var11) || NIL != module0002.f40(var11));
    }
    
    public static SubLObject f7723(final SubLObject var11) {
        assert NIL != Types.symbolp(var11) : var11;
        return (SubLObject)makeBoolean(NIL != f7710(var11) || NIL != module0012.f381(var11));
    }
    
    public static SubLObject f7720(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = $g1420$.currentBinding(var22);
        try {
            $g1420$.bind(module0048.f_1X($g1420$.getDynamicValue(var22)), var22);
            if (var21.isCons()) {
                SubLObject var25 = (SubLObject)NIL;
                SubLObject var26 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var21, (SubLObject)$ic44$);
                var25 = var21.first();
                final SubLObject var27 = var26 = var21.rest();
                if (!var25.isSymbol()) {
                    f7724((SubLObject)$ic45$, var25, (SubLObject)UNPROVIDED);
                }
                else if (NIL != module0012.f377(var25)) {
                    final SubLObject var28 = module0012.f378(var25);
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7725(var25, var28, var21)));
                }
                else if (NIL != f7710(var25)) {
                    final SubLObject var29 = f7711(var25);
                    final SubLObject var30 = f7726(var29, var21);
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var30)));
                }
                else if (NIL != f7694(var25)) {
                    final SubLObject var31 = f7708(var25);
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7727(var25, var31, f7728(var26))));
                }
                else if (NIL != module0012.f381(var25)) {
                    final SubLObject var28_50 = $g1422$.currentBinding(var22);
                    try {
                        $g1422$.bind((SubLObject)ConsesLow.cons(var25, $g1422$.getDynamicValue(var22)), var22);
                        final SubLObject var30 = f7729(var21);
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var30)));
                    }
                    finally {
                        $g1422$.rebind(var28_50, var22);
                    }
                }
                else if (NIL != module0012.f380(var25) || NIL != module0012.f411(var25)) {
                    if (NIL != module0035.f1997(var26)) {
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7730(var25, Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var26.first()))))));
                    }
                    else {
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7731(var25, f7728(var26))));
                    }
                }
                else if (var25.isFunctionSpec() && !var25.isMacroOperator() && (NIL != module0002.f39(var25) || NIL != module0002.f52(var25, $g1422$.getDynamicValue(var22)))) {
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7731(var25, f7728(var26))));
                }
                else if (var25.isMacroOperator() && (NIL != module0002.f39(var25) || NIL != module0002.f52(var25, $g1422$.getDynamicValue(var22)))) {
                    final SubLObject var28_51 = $g1422$.currentBinding(var22);
                    try {
                        $g1422$.bind((SubLObject)ConsesLow.cons(var25, $g1422$.getDynamicValue(var22)), var22);
                        final SubLObject var30 = f7729(var21);
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var30)));
                    }
                    finally {
                        $g1422$.rebind(var28_51, var22);
                    }
                }
                else {
                    f7724((SubLObject)$ic46$, var25, (SubLObject)UNPROVIDED);
                }
            }
            else if (!var21.isSymbol()) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7732(var21)));
            }
            else if (NIL != Eval.constantp(var21, (SubLObject)UNPROVIDED)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7732(var21)));
            }
            else if (NIL != f7703(var21)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7733(var21)));
            }
            else if (NIL != f7734(var21)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7735(var21)));
            }
            else if (NIL != f7704(var21) || NIL != f7702(var21)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7736(var21)));
            }
            else {
                f7724((SubLObject)$ic47$, var21, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            $g1420$.rebind(var24, var22);
        }
        return module0004.values_list(var23);
    }
    
    public static SubLObject f7728(final SubLObject var4) {
        final SubLObject var5 = (SubLObject)ConsesLow.make_list(Sequences.length(var4), (SubLObject)UNPROVIDED);
        SubLObject var6;
        SubLObject var7;
        for (var6 = (SubLObject)NIL, var7 = (SubLObject)NIL, var6 = var4, var7 = var5; NIL != var6; var6 = var6.rest(), var7 = var7.rest()) {
            ConsesLow.rplaca(var7, f7720(var6.first()));
        }
        return var5;
    }
    
    public static SubLObject f7724(SubLObject var55, SubLObject var6, SubLObject var7) {
        if (var55 == UNPROVIDED) {
            var55 = (SubLObject)$ic48$;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return Errors.error(var55, var6, var7);
    }
    
    public static SubLObject f7732(final SubLObject var5) {
        return var5;
    }
    
    public static SubLObject f7736(final SubLObject var56) {
        if (NIL != Symbols.boundp(var56)) {
            return Symbols.symbol_value(var56);
        }
        if (NIL != Symbols.fboundp(var56)) {
            return Symbols.symbol_function(var56);
        }
        f7724((SubLObject)$ic49$, var56, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7733(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        return conses_high.assoc(var56, $g1413$.getDynamicValue(var57), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f7731(final SubLObject var11, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        final SubLObject var66 = $g1421$.currentBinding(var58);
        try {
            $g1421$.bind(module0048.f_1X($g1421$.getDynamicValue(var58)), var58);
            if (NIL != f7737(var11)) {
                f7738(var11, var57);
            }
            SubLObject var67 = $g1413$.getDynamicValue(var58);
            SubLObject var68 = (SubLObject)NIL;
            var68 = var67.first();
            while (NIL != var67) {
                var63 = var68.first();
                var61 = (SubLObject)ConsesLow.cons(var63, var61);
                var64 = var68.rest();
                var62 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var64)), var62);
                var67 = var67.rest();
                var68 = var67.first();
            }
            var67 = var57;
            SubLObject var69 = (SubLObject)NIL;
            var69 = var67.first();
            while (NIL != var67) {
                var65 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic15$, var69), var65);
                var67 = var67.rest();
                var69 = var67.first();
            }
            var65 = Sequences.nreverse(var65);
            var60 = (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic50$, (SubLObject)ConsesLow.listS((SubLObject)$ic21$, var62, (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, reader.bq_cons(var11, ConsesLow.append(var65, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var61)), (SubLObject)$ic50$));
            var59 = f7690(var60);
            if (NIL != f7737(var11)) {
                f7739(var59);
            }
        }
        finally {
            $g1421$.rebind(var66, var58);
        }
        return module0004.values_list(var59);
    }
    
    public static SubLObject f7730(final SubLObject var11, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        final SubLObject var77 = $g1421$.currentBinding(var69);
        try {
            $g1421$.bind(module0048.f_1X($g1421$.getDynamicValue(var69)), var69);
            if (NIL != f7737(var11)) {
                f7738(var11, var68);
            }
            SubLObject var78 = $g1413$.getDynamicValue(var69);
            SubLObject var79 = (SubLObject)NIL;
            var79 = var78.first();
            while (NIL != var78) {
                var74 = var79.first();
                var72 = (SubLObject)ConsesLow.cons(var74, var72);
                var75 = var79.rest();
                var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var74, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var75)), var73);
                var78 = var78.rest();
                var79 = var78.first();
            }
            var76 = (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var68));
            var71 = (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic50$, (SubLObject)ConsesLow.listS((SubLObject)$ic21$, var73, (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list(var11, var76))), (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var72)), (SubLObject)$ic50$));
            var70 = f7690(var71);
            if (NIL != f7737(var11)) {
                f7739(var70);
            }
        }
        finally {
            $g1421$.rebind(var77, var69);
        }
        return module0004.values_list(var70);
    }
    
    public static SubLObject f7729(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = $g1413$.getDynamicValue(var22);
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            var27 = var30.first();
            var26 = (SubLObject)ConsesLow.cons(var27, var26);
            var28 = var30.rest();
            var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var28)), var26);
            var29 = var29.rest();
            var30 = var29.first();
        }
        var25 = Sequences.nreverse(var25);
        var26 = Sequences.nreverse(var26);
        var23 = (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic56$, (SubLObject)ConsesLow.listS((SubLObject)$ic21$, var25, (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)$ic57$, (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var21))), (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var25)), (SubLObject)$ic56$));
        var24 = f7690(var23);
        return var24;
    }
    
    public static SubLObject f7725(final SubLObject var11, final SubLObject var22, final SubLObject var21) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = $g1421$.currentBinding(var23);
        try {
            $g1421$.bind($g1421$.getDynamicValue(var23), var23);
            if (NIL != f7737(var11)) {
                $g1421$.setDynamicValue(Numbers.add($g1421$.getDynamicValue(var23), (SubLObject)ONE_INTEGER), var23);
                f7738(var21.first(), var21.rest());
            }
            var24 = Values.arg2(var23.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7717(var22, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            if (NIL != f7737(var11)) {
                f7739(var24);
            }
        }
        finally {
            $g1421$.rebind(var25, var23);
        }
        return module0004.values_list(var24);
    }
    
    public static SubLObject f7740(final SubLObject var11, final SubLObject var22, final SubLObject var21) {
        SubLObject var23 = (SubLObject)NIL;
        var23 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7717(var22, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        return module0004.values_list(var23);
    }
    
    public static SubLObject f7727(final SubLObject var11, final SubLObject var49, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)NIL;
        final SubLObject var60 = Sequences.length($g1413$.getDynamicValue(var58));
        final SubLObject var61 = $g1421$.currentBinding(var58);
        try {
            $g1421$.bind($g1421$.getDynamicValue(var58), var58);
            if (NIL != f7737(var11)) {
                $g1421$.setDynamicValue(Numbers.add($g1421$.getDynamicValue(var58), (SubLObject)ONE_INTEGER), var58);
                f7738(var11, var57);
            }
            try {
                var58.throwStack.push($ic59$);
                var59 = Values.arg2(var58.resetMultipleValues(), (SubLObject)Values.multiple_value_list(var49.isCons() ? f7741(var49, var57) : f7716(var49, var57)));
            }
            catch (Throwable var62) {
                var59 = Errors.handleThrowable(var62, (SubLObject)$ic59$);
            }
            finally {
                var58.throwStack.pop();
            }
            if (NIL != f7737(var11)) {
                f7739(var59);
            }
            while (Sequences.length($g1413$.getDynamicValue(var58)).numG(var60)) {
                $g1413$.setDynamicValue($g1413$.getDynamicValue(var58).rest(), var58);
            }
        }
        finally {
            $g1421$.rebind(var61, var58);
        }
        return module0004.values_list(var59);
    }
    
    public static SubLObject f7741(final SubLObject var69, final SubLObject var57) {
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = conses_high.second(var69);
        final SubLObject var72 = var69.rest().rest();
        SubLObject var73 = (SubLObject)NIL;
        var73 = Eval.macroexpand_1((SubLObject)ConsesLow.listS((SubLObject)$ic12$, var71, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var57), ConsesLow.append(var72, (SubLObject)NIL)), (SubLObject)UNPROVIDED);
        var70 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var73)));
        return module0004.values_list(var70);
    }
    
    public static SubLObject f7726(final SubLObject var47, final SubLObject var21) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = Sequences.length($g1413$.getDynamicValue(var48));
        try {
            var48.throwStack.push($ic59$);
            var49 = Values.arg2(var48.resetMultipleValues(), (SubLObject)Values.multiple_value_list(var47.isCons() ? f7741(var47, (SubLObject)ConsesLow.list(var21)) : f7717(var47, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        }
        catch (Throwable var51) {
            var49 = Errors.handleThrowable(var51, (SubLObject)$ic59$);
        }
        finally {
            var48.throwStack.pop();
        }
        while (Sequences.length($g1413$.getDynamicValue(var48)).numG(var50)) {
            $g1413$.setDynamicValue($g1413$.getDynamicValue(var48).rest(), var48);
        }
        return module0004.values_list(var49);
    }
    
    public static SubLObject f7742(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var18));
    }
    
    public static SubLObject f7743(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = $g1413$.getDynamicValue(var21);
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            var26 = var29.first();
            var24 = (SubLObject)ConsesLow.cons(var26, var24);
            var27 = var29.rest();
            var25 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var27)), var25);
            var28 = var28.rest();
            var29 = var28.first();
        }
        var24 = Sequences.nreverse(var24);
        var25 = Sequences.nreverse(var25);
        var23 = (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic61$, (SubLObject)ConsesLow.listS((SubLObject)$ic21$, var25, (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)$ic62$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var20)))), (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var24)), (SubLObject)$ic61$));
        f7744((SubLObject)$ic64$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var22 = f7690(var23);
        return module0004.values_list(var22);
    }
    
    public static SubLObject f7745(final SubLObject var60) {
        SubLObject var61 = var60;
        SubLObject var62 = (SubLObject)NIL;
        var62 = var61.first();
        while (NIL != var61) {
            if (NIL != Symbols.boundp(var62)) {
                final SubLObject var63 = (SubLObject)ConsesLow.list((SubLObject)$ic15$, Symbols.symbol_value(var62));
                f7746(var62, var63, (SubLObject)UNPROVIDED);
            }
            var61 = var61.rest();
            var62 = var61.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7747(final SubLObject var21, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)NIL;
        final SubLObject var78 = $g1424$.currentBinding(var76);
        final SubLObject var79 = $g1425$.currentBinding(var76);
        final SubLObject var80 = $g1423$.currentBinding(var76);
        try {
            $g1424$.bind((SubLObject)NIL, var76);
            $g1425$.bind((SubLObject)NIL, var76);
            $g1423$.bind(var75, var76);
            var77 = module0035.f2269(f7748(var21), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            $g1423$.rebind(var80, var76);
            $g1425$.rebind(var79, var76);
            $g1424$.rebind(var78, var76);
        }
        return var77;
    }
    
    public static SubLObject f7749(final SubLObject var19) {
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = var19;
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            var20 = ConsesLow.nconc(var20, f7748(var22));
            var21 = var21.rest();
            var22 = var21.first();
        }
        return var20;
    }
    
    public static SubLObject f7748(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        if (var21.isCons()) {
            SubLObject var24 = (SubLObject)NIL;
            SubLObject var25 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var21, (SubLObject)$ic44$);
            var24 = var21.first();
            final SubLObject var26 = var25 = var21.rest();
            if (!var24.isSymbol()) {
                if (NIL != $g1423$.getDynamicValue(var22)) {
                    Errors.warn((SubLObject)$ic45$, var24);
                }
                var23 = (SubLObject)ConsesLow.cons(var24, var23);
            }
            else if (NIL != module0012.f377(var24)) {
                final SubLObject var27 = f7706(var24);
                if (NIL != var27) {
                    var23 = ConsesLow.nconc(var23, f7725(var24, var27, var21));
                }
                else {
                    var23 = (SubLObject)ConsesLow.cons(var24, var23);
                    if (NIL != $g1423$.getDynamicValue(var22)) {
                        Errors.warn((SubLObject)$ic66$, var24);
                    }
                }
            }
            else if (NIL != f7710(var24)) {
                final SubLObject var28 = f7711(var24);
                final SubLObject var29 = f7726(var28, var21);
                var23 = ConsesLow.nconc(var23, f7748(var29));
            }
            else if (NIL != f7694(var24)) {
                final SubLObject var30 = f7708(var24);
                var23 = ConsesLow.nconc(var23, f7748(var25));
            }
            else if (NIL != module0012.f381(var24)) {
                final SubLObject var31 = $g1426$.currentBinding(var22);
                try {
                    $g1426$.bind((SubLObject)ConsesLow.cons(var24, $g1426$.getDynamicValue(var22)), var22);
                    final SubLObject var29 = f7729(var21);
                    var23 = ConsesLow.nconc(var23, f7748(var29));
                }
                finally {
                    $g1426$.rebind(var31, var22);
                }
            }
            else if (NIL != module0012.f380(var24) || NIL != module0012.f411(var24)) {
                if (NIL != module0035.f1997(var25)) {
                    var23 = ConsesLow.nconc(var23, f7748(var25.first()));
                }
                else {
                    var23 = ConsesLow.nconc(var23, f7749(var25));
                }
            }
            else if (var24.isFunctionSpec() && !var24.isMacroOperator() && (NIL != module0002.f52(var24, $g1426$.getDynamicValue(var22)) || NIL != module0002.f39(var24))) {
                var23 = ConsesLow.nconc(var23, f7749(var25));
            }
            else if (var24.isMacroOperator() && (NIL != module0002.f39(var24) || NIL != module0002.f52(var24, $g1426$.getDynamicValue(var22)))) {
                final SubLObject var31 = $g1426$.currentBinding(var22);
                try {
                    $g1426$.bind((SubLObject)ConsesLow.cons(var24, $g1426$.getDynamicValue(var22)), var22);
                    final SubLObject var29 = f7729(var21);
                    var23 = ConsesLow.nconc(var23, f7748(var29));
                }
                finally {
                    $g1426$.rebind(var31, var22);
                }
            }
            else if (NIL == module0004.f104(var24, $g1425$.getDynamicValue(var22), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                if (NIL != $g1423$.getDynamicValue(var22)) {
                    Errors.warn((SubLObject)$ic46$, var24);
                }
                var23 = (SubLObject)ConsesLow.cons(var24, var23);
            }
        }
        else {
            var23 = ConsesLow.nconc(var23, f7750(var21));
        }
        return var23;
    }
    
    public static SubLObject f7750(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)NIL;
        if (var56.isSymbol()) {
            if (NIL == Eval.constantp(var56, (SubLObject)UNPROVIDED)) {
                if (NIL == f7703(var56)) {
                    if (NIL == f7734(var56)) {
                        if (NIL == f7704(var56)) {
                            if (NIL == f7702(var56)) {
                                if (NIL == module0004.f104(var56, $g1424$.getDynamicValue(var57), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                                    if (NIL != $g1423$.getDynamicValue(var57)) {
                                        Errors.warn((SubLObject)$ic47$, var56);
                                    }
                                    var58 = (SubLObject)ConsesLow.cons(var56, var58);
                                }
                            }
                        }
                    }
                }
            }
        }
        return var58;
    }
    
    public static SubLObject f7751(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            SubLObject var82 = (SubLObject)NIL;
            var82 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var81)));
            return Dynamic.sublisp_throw((SubLObject)$ic59$, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7752(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic68$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7753(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)$ic72$, var82, ConsesLow.append(var83, (SubLObject)NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7754(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7756(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)$ic72$, var82, ConsesLow.append(var83, (SubLObject)NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7757(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7758(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)$ic72$, var82, ConsesLow.append(var83, (SubLObject)NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7759(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7760(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)$ic72$, var82, ConsesLow.append(var83, (SubLObject)NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7761(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7762(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var21_103 = (SubLObject)$ic84$;
        final SubLObject var84 = (SubLObject)ConsesLow.list((SubLObject)$ic72$, (SubLObject)ConsesLow.list(var21_103), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var82, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var21_103), ConsesLow.append(var83, (SubLObject)NIL)));
        f7712(var81, var84);
        return var81;
    }
    
    public static SubLObject f7763(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7764(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var21_108 = (SubLObject)$ic88$;
        final SubLObject var84 = (SubLObject)ConsesLow.list((SubLObject)$ic72$, (SubLObject)ConsesLow.list(var21_108), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var82, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var21_108), ConsesLow.append(var83, (SubLObject)NIL)));
        f7712(var81, var84);
        return var81;
    }
    
    public static SubLObject f7765(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7766(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var21_113 = (SubLObject)$ic92$;
        final SubLObject var84 = (SubLObject)ConsesLow.list((SubLObject)$ic72$, (SubLObject)ConsesLow.list(var21_113), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var82, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var21_113), ConsesLow.append(var83, (SubLObject)NIL)));
        f7712(var81, var84);
        return var81;
    }
    
    public static SubLObject f7767(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7755(final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = $g1424$.currentBinding(var21);
        try {
            $g1424$.bind($g1424$.getDynamicValue(var21), var21);
            $g1425$.setDynamicValue((SubLObject)ConsesLow.cons(var18, $g1425$.getDynamicValue(var21)), var21);
            SubLObject var24 = var19;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                if (var25.isSymbol()) {
                    $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var25, $g1424$.getDynamicValue(var21)), var21);
                }
                else if (var25.isCons()) {
                    $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var25.first(), $g1424$.getDynamicValue(var21)), var21);
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
            var22 = ConsesLow.nconc(var22, f7749(var20));
        }
        finally {
            $g1424$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f7768(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic96$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic96$);
        var82 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            final SubLObject var83;
            var80 = (var83 = var81);
            return f7769(var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic96$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7770(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic99$);
        final SubLObject var85 = var84.rest();
        var84 = var84.first();
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic99$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        var84 = var85;
        if (NIL == var84) {
            return (SubLObject)NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic99$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7769(final SubLObject var18, final SubLObject var120) {
        return f7720((SubLObject)ConsesLow.listS((SubLObject)$ic101$, (SubLObject)ConsesLow.list(var18), ConsesLow.append(var120, (SubLObject)NIL)));
    }
    
    public static SubLObject f7771(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic102$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7689(f7689(var81));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7772(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic102$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7750(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7773(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic106$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic106$);
        var82 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7774(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7775(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic106$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic106$);
        var87 = var85.first();
        var85 = var85.rest();
        if (NIL == var85) {
            $g1425$.setDynamicValue((SubLObject)ConsesLow.cons(var86, $g1425$.getDynamicValue(var83)), var83);
            return f7748(var87);
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7776(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic106$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic106$);
        var82 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7774(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7777(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic106$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic106$);
        var87 = var85.first();
        var85 = var85.rest();
        if (NIL == var85) {
            $g1425$.setDynamicValue((SubLObject)ConsesLow.cons(var86, $g1425$.getDynamicValue(var83)), var83);
            return f7748(var87);
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7774(final SubLObject var56, final SubLObject var130) {
        if (NIL == f7734(var56)) {
            f7778(var56, var130);
        }
        return var56;
    }
    
    public static SubLObject f7734(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != module0067.f4852($g1427$.getGlobalValue()) && NIL != module0084.f5808($g1427$.getGlobalValue(), var10));
    }
    
    public static SubLObject f7779() {
        if (NIL != $g1427$.getGlobalValue()) {
            module0067.f4881($g1427$.getGlobalValue());
        }
        else {
            $g1427$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7778(final SubLObject var10, final SubLObject var130) {
        if (NIL == $g1427$.getGlobalValue()) {
            $g1427$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g1427$.getGlobalValue(), var10, var130);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7735(final SubLObject var10) {
        if (NIL == $g1427$.getGlobalValue()) {
            $g1427$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        return module0067.f4884($g1427$.getGlobalValue(), var10, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7780(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic106$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic106$);
        var82 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7746(f7689(var81), var82, (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7781(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic106$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic106$);
        var86 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7750(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7782(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic125$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic125$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7746(var81, var82, var83);
    }
    
    public static SubLObject f7783(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic125$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic125$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return ConsesLow.nconc(f7750(var85), f7748(var86), f7749(var87));
    }
    
    public static SubLObject f7746(final SubLObject var10, final SubLObject var130, SubLObject var143) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = f7720(var130);
        if (!var10.isSymbol()) {
            f7724((SubLObject)$ic128$, var10, (SubLObject)UNPROVIDED);
        }
        else {
            if (NIL != f7704(var10)) {
                Symbols.set(var10, var145);
                return var145;
            }
            if (NIL == f7703(var10)) {
                if (NIL != f7734(var10)) {
                    f7778(var10, var145);
                    return var145;
                }
                if ($g1420$.getDynamicValue(var144).eql((SubLObject)ZERO_INTEGER)) {
                    $g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var10), $g1413$.getDynamicValue(var144)), var144);
                }
                else {
                    f7724((SubLObject)$ic129$, var10, (SubLObject)UNPROVIDED);
                }
            }
        }
        ConsesLow.rplacd(conses_high.assoc(var10, $g1413$.getDynamicValue(var144), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var145);
        if (NIL != var143) {
            var145 = f7746(var143.first(), conses_high.second(var143), conses_high.cddr(var143));
        }
        return var145;
    }
    
    public static SubLObject f7784(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic130$);
        var82 = var81.first();
        var81 = var81.rest();
        final SubLObject var83 = (SubLObject)(var81.isCons() ? var81.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var81, var80, (SubLObject)$ic130$);
        var81 = var81.rest();
        if (NIL == var81) {
            if (NIL == f7703(var82)) {
                f7724((SubLObject)$ic131$, var82, (SubLObject)UNPROVIDED);
            }
            final SubLObject var84 = f7733(var82);
            final SubLObject var85 = Numbers.add(var84, var83);
            ConsesLow.rplacd(conses_high.assoc(var82, $g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var85);
            return var82;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)$ic130$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7785(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic130$);
        var85 = var84.first();
        var84 = var84.rest();
        final SubLObject var86 = (SubLObject)(var84.isCons() ? var84.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var84, var83, (SubLObject)$ic130$);
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic130$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7786(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic130$);
        var82 = var81.first();
        var81 = var81.rest();
        final SubLObject var83 = (SubLObject)(var81.isCons() ? var81.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var81, var80, (SubLObject)$ic130$);
        var81 = var81.rest();
        if (NIL == var81) {
            if (NIL == f7703(var82)) {
                f7724((SubLObject)$ic131$, var82, (SubLObject)UNPROVIDED);
            }
            final SubLObject var84 = f7733(var82);
            final SubLObject var85 = Numbers.subtract(var84, var83);
            ConsesLow.rplacd(conses_high.assoc(var82, $g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var85);
            return var82;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)$ic130$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7787(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic130$);
        var85 = var84.first();
        var84 = var84.rest();
        final SubLObject var86 = (SubLObject)(var84.isCons() ? var84.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var84, var83, (SubLObject)$ic130$);
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic130$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7788(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic138$);
        var82 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic138$);
        var83 = var81.first();
        var81 = var81.rest();
        if (NIL == var81) {
            if (NIL == f7703(var83)) {
                f7724((SubLObject)$ic131$, var83, (SubLObject)UNPROVIDED);
            }
            final SubLObject var84 = f7733(var83);
            final SubLObject var85 = f7720(var82);
            final SubLObject var86 = ConsesLow.append((SubLObject)ConsesLow.list(var85), var84);
            ConsesLow.rplacd(conses_high.assoc(var83, $g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var86);
            return var83;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)$ic138$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7789(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic138$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic138$);
        var86 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic138$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7790(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic142$);
        var82 = var81.first();
        var81 = var81.rest();
        if (NIL == var81) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var79) && NIL == f7703(var82)) {
                Errors.error((SubLObject)$ic131$, var82);
            }
            final SubLObject var83 = f7733(var82);
            final SubLObject var84 = var83.rest();
            ConsesLow.rplacd(conses_high.assoc(var82, $g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var84);
            return var84;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)$ic142$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7791(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic142$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic142$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7792(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var21_172 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic146$);
        var21_172 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7689(f7689(var21_172));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7793(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var21_175 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic146$);
        var21_175 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var21_175);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7794(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var21_178 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic146$);
        var21_178 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7720(f7720(var21_178));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7795(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var21_181 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic146$);
        var21_181 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var21_181);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7796(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var21_184 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic146$);
        var21_184 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7720(f7720(var21_184));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7797(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var21_187 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic146$);
        var21_187 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var21_187);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7798(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic156$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic156$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7799(var81, var82, var83);
    }
    
    public static SubLObject f7800(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic156$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic156$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7748(var86), f7749(var87));
    }
    
    public static SubLObject f7799(final SubLObject var29, final SubLObject var190, final SubLObject var30) {
        final SubLObject var191 = f7720(var29);
        if (NIL != f7801(var191)) {
            final SubLObject var192 = f7720(var190);
            final SubLObject var193 = f7728(var30);
            final SubLObject var194 = (SubLObject)ConsesLow.listS(var191, var192, var193);
            return f7716(Symbols.symbol_function((SubLObject)$ic157$), var194);
        }
        if (NIL != f7802(var191)) {
            final SubLObject var192 = f7720(var190);
            final SubLObject var193 = f7728(var30);
            SubLObject var195 = (SubLObject)NIL;
            if (NIL != var193) {
                var195 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic15$, var192), var195);
                SubLObject var196 = var193;
                SubLObject var197 = (SubLObject)NIL;
                var197 = var196.first();
                while (NIL != var196) {
                    var195 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic15$, var197), var195);
                    var196 = var196.rest();
                    var197 = var196.first();
                }
            }
            else {
                SubLObject var196 = var192;
                SubLObject var197 = (SubLObject)NIL;
                var197 = var196.first();
                while (NIL != var196) {
                    var195 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic15$, var197), var195);
                    var196 = var196.rest();
                    var197 = var196.first();
                }
            }
            var195 = Sequences.nreverse(var195);
            return f7720(reader.bq_cons(var191.first(), ConsesLow.append(var195, (SubLObject)NIL)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7802(final SubLObject var21) {
        return (SubLObject)makeBoolean(var21.isCons() && var21.first().isSymbol() && NIL != f7803(var21.first()) && conses_high.second(var21).isCons() && conses_high.second(var21).first() == $ic72$);
    }
    
    public static SubLObject f7803(final SubLObject var29) {
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator($g1415$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                if (var29.eql(var31)) {
                    var30 = (SubLObject)T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var30;
    }
    
    public static SubLObject f7801(final SubLObject var29) {
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(module0012.$g40$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                if (NIL != Symbols.fboundp(var31) && var29.eql(Symbols.symbol_function(var31))) {
                    var30 = (SubLObject)T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var30;
    }
    
    public static SubLObject f7804(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != f7801(var29) || NIL != f7803(var29) || NIL != f7802(var29) || NIL != module0002.f40(var29));
    }
    
    public static SubLObject f7805(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic160$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return (SubLObject)makeBoolean(NIL != f7803(var81) || NIL != f7801(var81));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic160$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7806(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic160$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic160$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7807(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic164$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7799(var81, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var82), (SubLObject)NIL);
    }
    
    public static SubLObject f7808(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic164$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7809(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var81)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7810(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic68$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7811(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        final SubLObject var81;
        final SubLObject var80 = var81 = var79;
        return f7812(var81);
    }
    
    public static SubLObject f7813(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7812(final SubLObject var215) {
        final SubLThread var216 = SubLProcess.currentSubLThread();
        if (NIL == var215) {
            return $g1418$.getDynamicValue(var216);
        }
        SubLObject var217 = var215;
        SubLObject var218 = (SubLObject)NIL;
        var218 = var217.first();
        while (NIL != var217) {
            final SubLObject var219 = var218;
            if (NIL == conses_high.member(var219, $g1418$.getDynamicValue(var216), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                $g1418$.setDynamicValue((SubLObject)ConsesLow.cons(var219, $g1418$.getDynamicValue(var216)), var216);
            }
            var217 = var217.rest();
            var218 = var217.first();
        }
        return var215;
    }
    
    public static SubLObject f7814(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        final SubLObject var81;
        final SubLObject var80 = var81 = var79;
        return f7815(var81);
    }
    
    public static SubLObject f7816(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7815(final SubLObject var215) {
        final SubLThread var216 = SubLProcess.currentSubLThread();
        if (NIL != var215) {
            SubLObject var217 = var215;
            SubLObject var218 = (SubLObject)NIL;
            var218 = var217.first();
            while (NIL != var217) {
                $g1418$.setDynamicValue(Sequences.remove(var218, $g1418$.getDynamicValue(var216), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var216);
                var217 = var217.rest();
                var218 = var217.first();
            }
        }
        else {
            $g1418$.setDynamicValue((SubLObject)NIL, var216);
        }
        return var215;
    }
    
    public static SubLObject f7737(final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        return module0004.f104(var218, $g1418$.getDynamicValue(var219), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7738(final SubLObject var218, final SubLObject var4) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        if (NIL == $g1419$.getDynamicValue(var219)) {
            $g1419$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic176$), var219);
        }
        final SubLObject var220 = Strings.make_string(Numbers.multiply((SubLObject)TWO_INTEGER, module0048.f_1X($g1421$.getDynamicValue(var219))), (SubLObject)UNPROVIDED);
        final SubLObject var221 = (SubLObject)ConsesLow.cons(var218, var4);
        $g1419$.setDynamicValue(Sequences.cconcatenate($g1419$.getDynamicValue(var219), PrintLow.format((SubLObject)NIL, (SubLObject)$ic177$, new SubLObject[] { var220, $g1421$.getDynamicValue(var219), var221 })), var219);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7739(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = Strings.make_string(Numbers.multiply((SubLObject)TWO_INTEGER, module0048.f_1X($g1421$.getDynamicValue(var59))), (SubLObject)UNPROVIDED);
        SubLObject var61 = (SubLObject)$ic178$;
        SubLObject var62 = var58;
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            var61 = Sequences.cconcatenate(var61, PrintLow.format((SubLObject)NIL, (SubLObject)$ic179$, var63));
            var62 = var62.rest();
            var63 = var62.first();
        }
        $g1419$.setDynamicValue(Sequences.cconcatenate($g1419$.getDynamicValue(var59), PrintLow.format((SubLObject)NIL, (SubLObject)$ic180$, new SubLObject[] { var60, $g1421$.getDynamicValue(var59), var61 })), var59);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7817(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = var78.rest();
        if (NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)NIL);
        }
        SubLObject var81 = (SubLObject)NIL;
        var81 = ((NIL != $g1419$.getDynamicValue(var79)) ? $g1419$.getDynamicValue(var79) : PrintLow.format((SubLObject)NIL, (SubLObject)$ic176$));
        f7818();
        return var81;
    }
    
    public static SubLObject f7819(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7820(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        if (NIL != var79) {
            cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)NIL);
        }
        return f7818();
    }
    
    public static SubLObject f7821(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7818() {
        $g1419$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7822(final SubLObject var149) {
        assert NIL != Types.numberp(var149) : var149;
        return module0048.f_1X(var149);
    }
    
    public static SubLObject f7823(final SubLObject var149) {
        assert NIL != Types.numberp(var149) : var149;
        return module0048.f_1_(var149);
    }
    
    public static SubLObject f7824(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        final SubLObject var81;
        final SubLObject var80 = var81 = var79;
        return f7825(var81);
    }
    
    public static SubLObject f7826(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        return f7749(var85);
    }
    
    public static SubLObject f7825(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = f7720(var23);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f7827(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic190$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7828(var81, var82);
    }
    
    public static SubLObject f7829(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic190$);
        var86 = var85.first();
        final SubLObject var87;
        var85 = (var87 = var85.rest());
        SubLObject var88 = (SubLObject)NIL;
        final SubLObject var89 = $g1424$.currentBinding(var83);
        try {
            $g1424$.bind($g1424$.getDynamicValue(var83), var83);
            SubLObject var90 = var86;
            SubLObject var91 = (SubLObject)NIL;
            var91 = var90.first();
            while (NIL != var90) {
                if (var91.isSymbol()) {
                    $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var91, $g1424$.getDynamicValue(var83)), var83);
                }
                else if (NIL != module0035.f1997(var91)) {
                    $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var91.first(), $g1424$.getDynamicValue(var83)), var83);
                }
                else if (NIL != module0035.f1998(var91)) {
                    var88 = ConsesLow.nconc(var88, f7748(conses_high.second(var91)));
                    $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var91.first(), $g1424$.getDynamicValue(var83)), var83);
                }
                else {
                    Errors.error((SubLObject)$ic192$);
                }
                var90 = var90.rest();
                var91 = var90.first();
            }
            var88 = ConsesLow.nconc(var88, f7749(var87));
        }
        finally {
            $g1424$.rebind(var89, var83);
        }
        return var88;
    }
    
    public static SubLObject f7828(final SubLObject var237, final SubLObject var20) {
        return f7830(var237, var20);
    }
    
    public static SubLObject f7744(SubLObject var240, SubLObject var241, SubLObject var242, SubLObject var243) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var241 == UNPROVIDED) {
            var241 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        if (var243 == UNPROVIDED) {
            var243 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7830(final SubLObject var237, final SubLObject var20) {
        final SubLThread var238 = SubLProcess.currentSubLThread();
        if (NIL == var237) {
            SubLObject var239 = (SubLObject)NIL;
            var239 = f7825(var20);
            return var239;
        }
        SubLObject var240 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var237, var237, (SubLObject)$ic194$);
        var240 = var237.first();
        final SubLObject var242;
        final SubLObject var241 = var242 = var237.rest();
        SubLObject var243 = (SubLObject)NIL;
        SubLObject var244 = (SubLObject)NIL;
        if (var240.isCons()) {
            var243 = var240.first();
            var244 = conses_high.second(var240);
        }
        else {
            var243 = var240;
            var244 = (SubLObject)NIL;
        }
        final SubLObject var245 = f7720(var244);
        SubLObject var246 = (SubLObject)NIL;
        $g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var243, var245), $g1413$.getDynamicValue(var238)), var238);
        var246 = f7830(var242, var20);
        $g1413$.setDynamicValue($g1413$.getDynamicValue(var238).rest(), var238);
        return var246;
    }
    
    public static SubLObject f7831(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic195$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic195$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7832(var81, var82, var83);
    }
    
    public static SubLObject f7833(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic195$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic195$);
        var87 = var85.first();
        final SubLObject var88;
        var85 = (var88 = var85.rest());
        SubLObject var89 = (SubLObject)NIL;
        final SubLObject var90 = $g1424$.currentBinding(var83);
        try {
            $g1424$.bind($g1424$.getDynamicValue(var83), var83);
            SubLObject var91 = var86;
            SubLObject var92 = (SubLObject)NIL;
            var92 = var91.first();
            while (NIL != var91) {
                $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var92, $g1424$.getDynamicValue(var83)), var83);
                var91 = var91.rest();
                var92 = var91.first();
            }
            var89 = ConsesLow.nconc(f7748(var87), f7749(var88));
        }
        finally {
            $g1424$.rebind(var90, var83);
        }
        return var89;
    }
    
    public static SubLObject f7832(final SubLObject var252, final SubLObject var253, final SubLObject var20) {
        SubLObject var254 = (SubLObject)NIL;
        SubLObject var255 = (SubLObject)NIL;
        SubLObject var256 = (SubLObject)NIL;
        SubLObject var257 = (SubLObject)NIL;
        var254 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var253)));
        SubLObject var258 = var252;
        SubLObject var259 = (SubLObject)NIL;
        var259 = var258.first();
        while (NIL != var258) {
            if (NIL != var254) {
                var255 = var254.first();
                var254 = var254.rest();
            }
            else {
                var255 = (SubLObject)NIL;
            }
            var256 = (SubLObject)ConsesLow.list(var259, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var255));
            var257 = (SubLObject)ConsesLow.cons(var256, var257);
            var258 = var258.rest();
            var259 = var258.first();
        }
        var257 = Sequences.nreverse(var257);
        return f7830(var257, var20);
    }
    
    public static SubLObject f7834(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        final SubLObject var81;
        final SubLObject var80 = var81 = var79;
        SubLObject var82 = (SubLObject)T;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            var82 = f7720(var84);
            if (NIL == var82) {
                return (SubLObject)NIL;
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7835(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        return f7749(var85);
    }
    
    public static SubLObject f7836(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        final SubLObject var81;
        final SubLObject var80 = var81 = var79;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            var82 = f7720(var84);
            if (NIL != var82) {
                return (SubLObject)T;
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7837(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        return f7749(var85);
    }
    
    public static SubLObject f7838(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return (SubLObject)makeBoolean(NIL == f7720(var81));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7839(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        return f7748(var85.first());
    }
    
    public static SubLObject f7840(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        final SubLObject var81;
        final SubLObject var80 = var81 = var79;
        final SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            SubLObject var275_276;
            final SubLObject var273_274 = var275_276 = var84;
            SubLObject var85 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var275_276, var273_274, (SubLObject)$ic208$);
            var85 = var275_276.first();
            final SubLObject var86;
            var275_276 = (var86 = var275_276.rest());
            if (NIL != f7720(var85)) {
                return f7825(var86);
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        return var82;
    }
    
    public static SubLObject f7841(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = var85;
        SubLObject var88 = (SubLObject)NIL;
        var88 = var87.first();
        while (NIL != var87) {
            SubLObject var282_283;
            final SubLObject var280_281 = var282_283 = var88;
            SubLObject var89 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var282_283, var280_281, (SubLObject)$ic208$);
            var89 = var282_283.first();
            final SubLObject var90;
            var282_283 = (var90 = var282_283.rest());
            var86 = ConsesLow.nconc(var86, f7748(var89), f7749(var90));
            var87 = var87.rest();
            var88 = var87.first();
        }
        return var86;
    }
    
    public static SubLObject f7842(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic212$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic212$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic212$);
        var83 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7843(var81, var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic212$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7844(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic212$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic212$);
        var86 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic212$);
        var87 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86), f7748(var87));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic212$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7843(final SubLObject var277, final SubLObject var286, final SubLObject var287) {
        if (NIL != f7720(var277)) {
            return f7720(var286);
        }
        return f7720(var287);
    }
    
    public static SubLObject f7845(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic212$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic212$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic212$);
        var83 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7843(var81, var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic212$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7846(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic212$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic212$);
        var86 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic212$);
        var87 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86), f7748(var87));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic212$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7847(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (NIL != f7720(var81)) {
            return f7825(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7848(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7849(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic222$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic222$);
        var82 = var80.first();
        var80 = var80.rest();
        if (NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic222$);
            return (SubLObject)NIL;
        }
        if (NIL != f7720(var81)) {
            return f7720(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7850(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic222$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic222$);
        var86 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic222$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7851(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (NIL != f7720(var81)) {
            return f7825(var82);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7852(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7853(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (NIL != f7720(var81)) {
            return (SubLObject)NIL;
        }
        return f7825(var82);
    }
    
    public static SubLObject f7854(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7855(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (NIL != f7720(var81)) {
            return (SubLObject)NIL;
        }
        return f7825(var82);
    }
    
    public static SubLObject f7856(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7857(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        SubLObject var83 = (SubLObject)NIL;
        while (NIL != f7720(var81)) {
            var83 = f7825(var82);
        }
        return var83;
    }
    
    public static SubLObject f7858(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7859(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        SubLObject var83 = (SubLObject)NIL;
        while (NIL == f7720(var81)) {
            var83 = f7825(var82);
        }
        return var83;
    }
    
    public static SubLObject f7860(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7861(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic241$);
        var82 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic241$);
        var83 = var81.first();
        final SubLObject var84;
        var81 = (var84 = var81.rest());
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = var82;
        SubLObject var88 = (SubLObject)NIL;
        var88 = var87.first();
        while (NIL != var87) {
            if (!var88.isList() || !Sequences.length(var88).numE((SubLObject)THREE_INTEGER)) {
                f7724((SubLObject)$ic242$, var88, (SubLObject)UNPROVIDED);
            }
            $g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var88.first(), f7720(conses_high.second(var88))), $g1413$.getDynamicValue(var79)), var79);
            var87 = var87.rest();
            var88 = var87.first();
        }
        if (NIL == f7720(var83.first())) {
            f7825(var84);
            while (NIL == var85) {
                var87 = var82;
                var88 = (SubLObject)NIL;
                var88 = var87.first();
                while (NIL != var87) {
                    f7746(var88.first(), conses_high.third(var88), (SubLObject)UNPROVIDED);
                    var87 = var87.rest();
                    var88 = var87.first();
                }
                var85 = f7720(var83.first());
                if (NIL == var85) {
                    f7825(var84);
                }
            }
        }
        var86 = f7825(var83.rest());
        var87 = var82;
        var88 = (SubLObject)NIL;
        var88 = var87.first();
        while (NIL != var87) {
            $g1413$.setDynamicValue($g1413$.getDynamicValue(var79).rest(), var79);
            var87 = var87.rest();
            var88 = var87.first();
        }
        return var86;
    }
    
    public static SubLObject f7862(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic241$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic241$);
        var87 = var85.first();
        final SubLObject var88;
        var85 = (var88 = var85.rest());
        SubLObject var89 = (SubLObject)NIL;
        final SubLObject var90 = $g1424$.currentBinding(var83);
        try {
            $g1424$.bind($g1424$.getDynamicValue(var83), var83);
            SubLObject var91 = var86;
            SubLObject var92 = (SubLObject)NIL;
            var92 = var91.first();
            while (NIL != var91) {
                if (var92.isList() && Sequences.length(var92).numE((SubLObject)THREE_INTEGER)) {
                    $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var92.first(), $g1424$.getDynamicValue(var83)), var83);
                    var89 = ConsesLow.nconc(var89, f7748(conses_high.second(var92)), f7748(conses_high.third(var92)));
                }
                var91 = var91.rest();
                var92 = var91.first();
            }
            var89 = ConsesLow.nconc(var89, f7749(var87), f7749(var88));
        }
        finally {
            $g1424$.rebind(var90, var83);
        }
        return var89;
    }
    
    public static SubLObject f7863(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic246$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic246$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic246$);
        var83 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            final SubLObject var84;
            var80 = (var84 = var81);
            return f7864(var82, var83, var84);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic246$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7865(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic246$);
        final SubLObject var86 = var85.rest();
        var85 = var85.first();
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic246$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic246$);
        var88 = var85.first();
        var85 = var85.rest();
        if (NIL == var85) {
            final SubLObject var89;
            var85 = (var89 = var86);
            SubLObject var90 = (SubLObject)NIL;
            final SubLObject var91 = $g1424$.currentBinding(var83);
            try {
                $g1424$.bind($g1424$.getDynamicValue(var83), var83);
                $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var87, $g1424$.getDynamicValue(var83)), var83);
                var90 = ConsesLow.nconc(f7748(var88), f7749(var89));
            }
            finally {
                $g1424$.rebind(var91, var83);
            }
            return var90;
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic246$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7864(final SubLObject var247, final SubLObject var331, final SubLObject var20) {
        final SubLThread var332 = SubLProcess.currentSubLThread();
        SubLObject var333 = f7720(var331);
        SubLObject var334 = (SubLObject)NIL;
        var334 = var333.first();
        while (NIL != var333) {
            $g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var247, var334), $g1413$.getDynamicValue(var332)), var332);
            f7825(var20);
            $g1413$.setDynamicValue($g1413$.getDynamicValue(var332).rest(), var332);
            var333 = var333.rest();
            var334 = var333.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7866(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic250$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic250$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic250$);
        var83 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            final SubLObject var84;
            var80 = (var84 = var81);
            return f7867(var82, var83, var84);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic250$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7868(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic250$);
        final SubLObject var86 = var85.rest();
        var85 = var85.first();
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic250$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic250$);
        var88 = var85.first();
        var85 = var85.rest();
        if (NIL == var85) {
            final SubLObject var89;
            var85 = (var89 = var86);
            SubLObject var90 = (SubLObject)NIL;
            final SubLObject var91 = $g1424$.currentBinding(var83);
            try {
                $g1424$.bind($g1424$.getDynamicValue(var83), var83);
                $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var87, $g1424$.getDynamicValue(var83)), var83);
                var90 = f7748(var88);
                var90 = f7749(var89);
            }
            finally {
                $g1424$.rebind(var91, var83);
            }
            return var90;
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic250$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7867(final SubLObject var247, final SubLObject var338, final SubLObject var20) {
        final SubLThread var339 = SubLProcess.currentSubLThread();
        SubLObject var340;
        SubLObject var341;
        for (var340 = f7720(var338), var341 = (SubLObject)NIL, var341 = (SubLObject)ZERO_INTEGER; var341.numL(var340); var341 = Numbers.add(var341, (SubLObject)ONE_INTEGER)) {
            $g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var247, var341), $g1413$.getDynamicValue(var339)), var339);
            f7825(var20);
            $g1413$.setDynamicValue($g1413$.getDynamicValue(var339).rest(), var339);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7869(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic254$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic254$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic254$);
        var83 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic254$);
        var84 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            final SubLObject var85;
            var80 = (var85 = var81);
            return f7870(var82, var83, var84, var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic254$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7871(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic254$);
        final SubLObject var86 = var85.rest();
        var85 = var85.first();
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = (SubLObject)NIL;
        SubLObject var89 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic254$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic254$);
        var88 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic254$);
        var89 = var85.first();
        var85 = var85.rest();
        if (NIL == var85) {
            final SubLObject var90;
            var85 = (var90 = var86);
            SubLObject var91 = (SubLObject)NIL;
            final SubLObject var92 = $g1424$.currentBinding(var83);
            try {
                $g1424$.bind($g1424$.getDynamicValue(var83), var83);
                $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var87, $g1424$.getDynamicValue(var83)), var83);
                $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var88, $g1424$.getDynamicValue(var83)), var83);
                var91 = ConsesLow.nconc(f7748(var89), f7749(var90));
            }
            finally {
                $g1424$.rebind(var92, var83);
            }
            return var91;
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic254$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7870(final SubLObject var347, final SubLObject var348, final SubLObject var349, final SubLObject var20) {
        final SubLThread var350 = SubLProcess.currentSubLThread();
        final SubLObject var351 = f7720(var349);
        SubLObject var352 = (SubLObject)NIL;
        SubLObject var353 = (SubLObject)NIL;
        final Iterator var354 = Hashtables.getEntrySetIterator(var351);
        try {
            while (Hashtables.iteratorHasNext(var354)) {
                final Map.Entry var355 = Hashtables.iteratorNextEntry(var354);
                var352 = Hashtables.getEntryKey(var355);
                var353 = Hashtables.getEntryValue(var355);
                $g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var347, var352), $g1413$.getDynamicValue(var350)), var350);
                $g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var348, var353), $g1413$.getDynamicValue(var350)), var350);
                f7825(var20);
                $g1413$.setDynamicValue($g1413$.getDynamicValue(var350).rest(), var350);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var354);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7872(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic258$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7873(var81, var82);
    }
    
    public static SubLObject f7874(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic258$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7873(final SubLObject var29, final SubLObject var358) {
        if (NIL == f7804(f7720(var29))) {
            f7724((SubLObject)$ic262$, var29, (SubLObject)UNPROVIDED);
        }
        final SubLObject var359 = f7720(var29);
        final SubLObject var360 = f7728(var358);
        if (NIL != conses_high.member((SubLObject)NIL, var360, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL == var360.rest()) {
            final SubLObject var361 = var360.first();
            return (SubLObject)ConsesLow.cons(Functions.funcall(var359, var361.first()), f7873(var29, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic15$, var361.rest()))));
        }
        return (SubLObject)ConsesLow.cons(Functions.apply(var359, f7873(Symbols.symbol_function((SubLObject)$ic263$), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic15$, var360)))), Functions.apply(Symbols.symbol_function((SubLObject)$ic264$), var29, (SubLObject)ConsesLow.list(f7875(f7873(Symbols.symbol_function((SubLObject)$ic265$), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic15$, var360)))))));
    }
    
    public static SubLObject f7875(final SubLObject var4) {
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic15$, var7), var5);
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f7876(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic266$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic266$);
        var82 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7877(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic266$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7878(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic266$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic266$);
        var86 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic266$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7877(final SubLObject var365, final SubLObject var3) {
        final SubLObject var366 = f7720(var365);
        final SubLObject var367 = f7720(var3);
        if (NIL == f7804(var367)) {
            f7724((SubLObject)$ic262$, var3, (SubLObject)UNPROVIDED);
        }
        final SubLObject var368 = module0067.f4860(var366);
        if (var368 == $ic270$) {
            f7879(var366, var3);
        }
        else if (var368 == $ic271$) {
            f7880(var366, var3);
        }
        else {
            Errors.error((SubLObject)$ic272$, var368);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7879(final SubLObject var365, final SubLObject var3) {
        SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)NIL;
        var367 = var366.first();
        while (NIL != var366) {
            f7720((SubLObject)ConsesLow.list((SubLObject)$ic165$, var3, var367.first(), var367.rest()));
            var366 = var366.rest();
            var367 = var366.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7880(final SubLObject var365, final SubLObject var3) {
        final SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)NIL;
        SubLObject var368 = (SubLObject)NIL;
        final Iterator var369 = Hashtables.getEntrySetIterator(var366);
        try {
            while (Hashtables.iteratorHasNext(var369)) {
                final Map.Entry var370 = Hashtables.iteratorNextEntry(var369);
                var367 = Hashtables.getEntryKey(var370);
                var368 = Hashtables.getEntryValue(var370);
                f7720((SubLObject)ConsesLow.list((SubLObject)$ic165$, var3, var367, var368));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var369);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7881(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic273$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic273$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic273$);
        var83 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7882(var81, var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic273$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7883(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic273$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic273$);
        var86 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic273$);
        var87 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7750(var86), f7749(var87));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic273$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7882(final SubLObject var365, final SubLObject var3, final SubLObject var4) {
        final SubLObject var366 = f7720(var365);
        final SubLObject var367 = f7720(var3);
        final SubLObject var368 = f7728(f7720(var4));
        if (NIL == f7804(var367)) {
            f7724((SubLObject)$ic262$, var3, (SubLObject)UNPROVIDED);
        }
        f7744((SubLObject)$ic277$, var366, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f7744((SubLObject)$ic278$, var367, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f7744((SubLObject)$ic279$, var368, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var369 = module0067.f4860(var366);
        if (var369 == $ic270$) {
            f7884(var366, var3, var368);
        }
        else if (var369 == $ic271$) {
            f7885(var366, var3, var368);
        }
        else {
            Errors.error((SubLObject)$ic272$, var369);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7884(final SubLObject var365, final SubLObject var3, final SubLObject var4) {
        SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)NIL;
        var367 = var366.first();
        while (NIL != var366) {
            f7720((SubLObject)ConsesLow.list((SubLObject)$ic165$, var3, var367.first(), var367.rest(), var4));
            var366 = var366.rest();
            var367 = var366.first();
        }
        return var4;
    }
    
    public static SubLObject f7885(final SubLObject var365, final SubLObject var3, final SubLObject var4) {
        final SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)NIL;
        SubLObject var368 = (SubLObject)NIL;
        final Iterator var369 = Hashtables.getEntrySetIterator(var366);
        try {
            while (Hashtables.iteratorHasNext(var369)) {
                final Map.Entry var370 = Hashtables.iteratorNextEntry(var369);
                var367 = Hashtables.getEntryKey(var370);
                var368 = Hashtables.getEntryValue(var370);
                f7720((SubLObject)ConsesLow.list((SubLObject)$ic165$, var3, var367, var368, var4));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var369);
        }
        return var4;
    }
    
    public static SubLObject f7886(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic280$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic280$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7887(var81, var82, var83);
    }
    
    public static SubLObject f7888(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic280$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic280$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7750(var86), f7749(var87));
    }
    
    public static SubLObject f7887(final SubLObject var378, final SubLObject var379, final SubLObject var20) {
        final SubLThread var380 = SubLProcess.currentSubLThread();
        final SubLObject var381 = Sequences.length($g1413$.getDynamicValue(var380));
        SubLObject var382 = (SubLObject)NIL;
        var382 = (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic284$, (SubLObject)ConsesLow.list((SubLObject)$ic281$, var378, (SubLObject)$ic285$, (SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var20))), (SubLObject)ConsesLow.listS((SubLObject)$ic286$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var379), (SubLObject)$ic284$));
        f7690(var382);
        while (Sequences.length($g1413$.getDynamicValue(var380)).numG(var381)) {
            $g1413$.setDynamicValue($g1413$.getDynamicValue(var380).rest(), var380);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7889(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic287$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic287$);
        var82 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7890(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic287$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7891(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic287$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic287$);
        var86 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic287$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7890(final SubLObject var378, final SubLObject var37) {
        f7690((SubLObject)ConsesLow.list((SubLObject)$ic288$, var378, (SubLObject)ConsesLow.list((SubLObject)$ic291$, var37)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7892(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        final SubLObject var81;
        final SubLObject var80 = var81 = var79;
        return f7893(var81);
    }
    
    public static SubLObject f7894(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        final SubLObject var85;
        final SubLObject var84 = var85 = var83;
        return f7749(var85);
    }
    
    public static SubLObject f7893(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = Sequences.length($g1413$.getDynamicValue(var21));
        SubLObject var24 = (SubLObject)NIL;
        var24 = (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)$ic295$, (SubLObject)ConsesLow.list((SubLObject)$ic292$, (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)$ic296$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var20))))), (SubLObject)$ic295$);
        var22 = f7690(var24);
        while (Sequences.length($g1413$.getDynamicValue(var21)).numG(var23)) {
            $g1413$.setDynamicValue($g1413$.getDynamicValue(var21).rest(), var21);
        }
        if (NIL != var22) {
            return module0004.values_list(var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7895(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic297$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7896(var81, var82);
    }
    
    public static SubLObject f7897(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic297$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7896(final SubLObject var392, final SubLObject var20) {
        final SubLThread var393 = SubLProcess.currentSubLThread();
        final SubLObject var394 = Sequences.length($g1413$.getDynamicValue(var393));
        SubLObject var395 = (SubLObject)NIL;
        var395 = (SubLObject)ConsesLow.list((SubLObject)$ic298$, (SubLObject)ConsesLow.list((SubLObject)$ic291$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var392)), (SubLObject)ConsesLow.listS((SubLObject)$ic235$, (SubLObject)ConsesLow.list((SubLObject)$ic301$, (SubLObject)$ic302$, var394), (SubLObject)$ic303$), (SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var20)));
        f7744((SubLObject)$ic304$, var395, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f7690(var395);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7898(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic305$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7899(var81);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic305$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7900(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic305$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic305$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7899(final SubLObject var397) {
        final SubLThread var398 = SubLProcess.currentSubLThread();
        final SubLObject var399 = f7720(var397);
        assert NIL != Types.stringp(var399) : var399;
        SubLObject var400 = (SubLObject)NIL;
        SubLObject var401 = (SubLObject)NIL;
        try {
            final SubLObject var402;
            var401 = (var402 = StreamsLow.open(var399, new SubLObject[] { $ic310$, $ic311$, $ic312$, NIL }));
            if (!var402.isStream()) {
                Errors.error((SubLObject)$ic313$, var399);
            }
            while (NIL == var400) {
                var398.resetMultipleValues();
                final SubLObject var403 = reader.read_ignoring_errors(var402, (SubLObject)NIL, (SubLObject)$ic314$);
                final SubLObject var404 = var398.secondMultipleValue();
                var398.resetMultipleValues();
                if (var404 == $ic315$) {
                    if (var403 != $ic314$) {
                        Errors.error((SubLObject)$ic316$, streams_high.file_position(var402, (SubLObject)UNPROVIDED), var399);
                    }
                    var400 = (SubLObject)T;
                }
                else {
                    f7689(var403);
                }
            }
        }
        finally {
            final SubLObject var405 = Threads.$is_thread_performing_cleanupP$.currentBinding(var398);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var398);
                if (NIL != var401) {
                    streams_high.close(var401, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var405, var398);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7901(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic317$);
        var82 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic317$);
        var83 = var81.first();
        var81 = var81.rest();
        if (NIL == var81) {
            if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var79) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var79) && NIL == f7689((SubLObject)ConsesLow.list(var83, var82))) {
                Errors.error((SubLObject)$ic318$, var82, var83);
            }
            return (SubLObject)NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)$ic317$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7902(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic317$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic317$);
        var86 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            SubLObject var87 = (SubLObject)NIL;
            var87 = ConsesLow.nconc(var87, f7748(var85));
            if (NIL == f7722(var86)) {
                final SubLObject var88 = var86;
                if (NIL == conses_high.member(var88, var87, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var87 = (SubLObject)ConsesLow.cons(var88, var87);
                }
            }
            return var87;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic317$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7903(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return var81;
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7904(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic68$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return (SubLObject)NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7905(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic102$);
        var82 = var81.first();
        var81 = var81.rest();
        if (NIL == var81) {
            return module0035.sublisp_boolean(conses_high.assoc(f7720(var82), $g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7906(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic102$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7750(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7907(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic120$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            final SubLObject var82 = f7720(var81);
            SubLObject var83 = (SubLObject)NIL;
            var83 = f7720(var82);
            return var83;
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic120$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7908(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic120$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic120$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7909(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic330$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return f7910(var81);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic330$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7911(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic330$);
        var86 = var85.first();
        var85 = var85.rest();
        if (NIL != var85) {
            cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic330$);
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f2169(var86, $g1425$.getDynamicValue(var83)) || NIL != f7721(var86)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(var86);
    }
    
    public static SubLObject f7910(final SubLObject var218) {
        return (SubLObject)((NIL != f7803(var218)) ? ConsesLow.list(var218, f7708(var218)) : f7690((SubLObject)ConsesLow.list((SubLObject)$ic331$, var218)));
    }
    
    public static SubLObject f7912(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic334$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        final SubLObject var83 = (SubLObject)ConsesLow.cons(var81, f7728(var82));
        return f7716(Symbols.symbol_function((SubLObject)$ic335$), var83);
    }
    
    public static SubLObject f7913(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic334$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7914(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic334$);
        var82 = var81.first();
        final SubLObject var83;
        var81 = (var83 = var81.rest());
        SubLObject var84 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic176$);
        SubLObject var85 = $g1413$.getDynamicValue(var79);
        SubLObject var86 = (SubLObject)NIL;
        var86 = var85.first();
        while (NIL != var85) {
            var84 = Sequences.cconcatenate(var84, PrintLow.format((SubLObject)NIL, (SubLObject)$ic338$, var86));
            var85 = var85.rest();
            var86 = var85.first();
        }
        final SubLObject var87 = Sequences.cconcatenate(var84, new SubLObject[] { $ic176$, var82 });
        final SubLObject var88 = (SubLObject)ConsesLow.cons(var87, f7728(var83));
        return f7716(Symbols.symbol_function((SubLObject)$ic339$), var88);
    }
    
    public static SubLObject f7915(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic334$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7916(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = var78.rest();
        if (NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)NIL);
        }
        if ($g1420$.getDynamicValue(var79).eql((SubLObject)ZERO_INTEGER)) {
            $g1413$.setDynamicValue((SubLObject)NIL, var79);
        }
        else {
            f7724((SubLObject)$ic342$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7917(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7918(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = var78.rest();
        if (NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)NIL);
        }
        SubLObject var81 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic176$);
        SubLObject var82 = $g1413$.getDynamicValue(var79);
        SubLObject var83 = (SubLObject)NIL;
        var83 = var82.first();
        while (NIL != var82) {
            var81 = Sequences.cconcatenate(var81, PrintLow.format((SubLObject)NIL, (SubLObject)$ic338$, var83));
            var82 = var82.rest();
            var83 = var82.first();
        }
        return var81;
    }
    
    public static SubLObject f7919(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7920(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic349$);
        var81 = var80.first();
        var80 = var80.rest();
        if (NIL == var80) {
            return var81;
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic349$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7921(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic349$);
        var85 = var84.first();
        var84 = var84.rest();
        if (NIL == var84) {
            return (SubLObject)NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic349$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7922(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic353$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7923(var81, var82);
    }
    
    public static SubLObject f7924(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic353$);
        var86 = var85.first();
        final SubLObject var87;
        var85 = (var87 = var85.rest());
        SubLObject var88 = (SubLObject)NIL;
        final SubLObject var89 = $g1424$.currentBinding(var83);
        try {
            $g1424$.bind($g1424$.getDynamicValue(var83), var83);
            $g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var86, $g1424$.getDynamicValue(var83)), var83);
            var88 = f7749(var87);
        }
        finally {
            $g1424$.rebind(var89, var83);
        }
        return var88;
    }
    
    public static SubLObject f7923(final SubLObject var10, final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        var21 = (SubLObject)ConsesLow.list((SubLObject)$ic357$, (SubLObject)$ic358$, (SubLObject)ConsesLow.list((SubLObject)$ic354$, (SubLObject)$ic359$, reader.bq_cons((SubLObject)$ic360$, ConsesLow.append(var20, (SubLObject)NIL))), (SubLObject)ConsesLow.listS((SubLObject)$ic286$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var10), (SubLObject)$ic358$));
        f7744((SubLObject)$ic361$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f7690(var21);
    }
    
    public static SubLObject f7925(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic362$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7926(var81, var82);
    }
    
    public static SubLObject f7927(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic362$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7926(final SubLObject var453, final SubLObject var20) {
        SubLObject var454 = (SubLObject)NIL;
        var454 = (SubLObject)ConsesLow.list((SubLObject)$ic363$, (SubLObject)ConsesLow.list((SubLObject)$ic291$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var453)), reader.bq_cons((SubLObject)$ic360$, ConsesLow.append(var20, (SubLObject)NIL)));
        f7744((SubLObject)$ic366$, var454, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f7690(var454);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7928(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic362$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7929(var81, var82);
    }
    
    public static SubLObject f7930(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic362$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7929(final SubLObject var453, final SubLObject var20) {
        SubLObject var454 = (SubLObject)NIL;
        var454 = (SubLObject)ConsesLow.list((SubLObject)$ic367$, (SubLObject)ConsesLow.list((SubLObject)$ic291$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var453)), reader.bq_cons((SubLObject)$ic360$, ConsesLow.append(var20, (SubLObject)NIL)));
        f7744((SubLObject)$ic370$, var454, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f7690(var454);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7931() {
        $g1413$.setDynamicValue((SubLObject)NIL);
        module0012.f387((SubLObject)$ic371$);
        module0012.f369((SubLObject)$ic371$);
        module0012.f387((SubLObject)$ic319$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7932() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7688", "S#5237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7691", "S#9690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7692", "S#6015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7693", "S#6012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7695", "S#3858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7696", "S#3859", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7697", "S#6013", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7698", "S#6014", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7699", "S#9691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7700", "API-MUTABLE-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7701", "S#9692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7702", "S#9693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7703", "API-LEXICAL-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7704", "API-DYNAMIC-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7705", "S#9694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7706", "S#9695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7707", "S#9696", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7694", "S#9697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7708", "S#9698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7709", "S#9699", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7710", "S#9700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7711", "S#9701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7712", "S#9702", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0112", "f7713", "S#9703");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0112", "f7714", "S#9704");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0112", "f7715", "S#9705");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7690", "S#9706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7716", "S#9707", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7717", "S#9708", 1, 4, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0112", "f7718", "S#9709");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7719", "S#9710", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7689", "S#9711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7721", "VALID-API-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7722", "VALID-API-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7723", "VALID-API-MACRO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7720", "S#9712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7728", "S#9713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7724", "S#9714", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7732", "S#9715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7736", "S#9716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7733", "S#9717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7731", "S#9718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7730", "S#9719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7729", "S#9720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7725", "S#9721", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7740", "S#9722", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7727", "S#9723", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7741", "S#9724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7726", "S#9725", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0112", "f7742", "S#9726");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7743", "S#9727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7745", "S#9728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7747", "VERIFY-IN-API", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7749", "S#9729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7748", "S#9730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7750", "S#9731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7751", "S#9732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7752", "S#9733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7753", "S#9734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7754", "S#9735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7756", "S#9736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7757", "S#9737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7758", "S#9738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7759", "S#9739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7760", "S#9740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7761", "S#9741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7762", "S#9742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7763", "S#9743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7764", "S#9744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7765", "S#9745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7766", "S#9746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7767", "S#9747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7755", "S#9748", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7768", "S#9749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7770", "S#9750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7769", "S#9751", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7771", "S#9752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7772", "S#9753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7773", "S#9754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7775", "S#9755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7776", "S#9756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7777", "S#9757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7774", "S#9758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7734", "S#9759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7779", "CLEAR-API-USER-VARIABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7778", "PUT-API-USER-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7735", "GET-API-USER-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7780", "S#9760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7781", "S#9761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7782", "S#9762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7783", "S#9763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7746", "S#9764", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7784", "S#9765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7785", "S#9766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7786", "S#9767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7787", "S#9768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7788", "S#9769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7789", "S#9770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7790", "S#9771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7791", "S#9772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7792", "S#9773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7793", "S#9774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7794", "S#9775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7795", "S#9776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7796", "S#9777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7797", "S#9778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7798", "S#9779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7800", "S#9780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7799", "S#9781", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7802", "S#9782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7803", "EVAL-IN-API-USER-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7801", "EVAL-IN-API-PREDEFINED-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7804", "S#9783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7805", "S#9784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7806", "S#9785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7807", "S#9786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7808", "S#9787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7809", "S#9788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7810", "S#9789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7811", "S#9790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7813", "S#9791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7812", "S#9792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7814", "S#9793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7816", "S#9794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7815", "S#9795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7737", "S#9796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7738", "S#9797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7739", "S#9798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7817", "S#9799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7819", "S#9800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7820", "S#9801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7821", "S#9802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7818", "S#9803", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7822", "ADD1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7823", "SUB1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7824", "S#9804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7826", "S#9805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7825", "S#9806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7827", "S#9807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7829", "S#9808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7828", "S#9809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7744", "TRACE-ME", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7830", "S#9810", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7831", "S#9811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7833", "S#9812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7832", "S#9813", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7834", "S#9814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7835", "S#9815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7836", "S#9816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7837", "S#9817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7838", "S#9818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7839", "S#9819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7840", "S#9820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7841", "S#9821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7842", "S#9822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7844", "S#9823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7843", "S#9824", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7845", "S#9825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7846", "S#9826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7847", "S#9827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7848", "S#9828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7849", "S#9829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7850", "S#9830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7851", "S#9831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7852", "S#9832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7853", "S#9833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7854", "S#9834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7855", "S#9835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7856", "S#9836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7857", "S#9837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7858", "S#9838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7859", "S#9839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7860", "S#9840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7861", "S#9841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7862", "S#9842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7863", "S#9843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7865", "S#9844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7864", "S#9845", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7866", "S#9846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7868", "S#9847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7867", "S#9848", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7869", "S#9849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7871", "S#9850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7870", "S#9851", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7872", "S#9852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7874", "S#9853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7873", "S#9854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7875", "S#9855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7876", "S#9856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7878", "S#9857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7877", "S#9858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7879", "S#9859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7880", "S#9860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7881", "S#9861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7883", "S#9862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7882", "S#9863", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7884", "S#9864", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7885", "S#9865", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7886", "S#9866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7888", "S#9867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7887", "S#9868", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7889", "S#9869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7891", "S#9870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7890", "S#9871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7892", "S#9872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7894", "S#9873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7893", "S#9874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7895", "S#9875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7897", "S#9876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7896", "S#9877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7898", "S#9878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7900", "S#9879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7899", "S#9880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7901", "S#9881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7902", "S#9882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7903", "S#9883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7904", "S#9884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7905", "S#9885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7906", "S#9886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7907", "S#9887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7908", "S#9888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7909", "S#9889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7911", "S#9890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7910", "S#9891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7912", "S#9892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7913", "S#9893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7914", "S#9894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7915", "S#9895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7916", "S#9896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7917", "S#9897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7918", "S#9898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7919", "S#9899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7920", "S#9900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7921", "S#9901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7922", "S#9902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7924", "S#9903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7923", "S#9904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7925", "S#9905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7927", "S#9906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7926", "S#9907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7928", "S#9908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7930", "S#9909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7929", "S#9910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0112", "f7931", "S#9536", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7933() {
        $g1410$ = SubLFiles.defvar("*EVAL-IN-API?*", (SubLObject)NIL);
        $g1411$ = SubLFiles.deflexical("S#9911", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g1411$.getGlobalValue() : NIL));
        $g1412$ = SubLFiles.deflexical("S#9912", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g1412$.getGlobalValue() : NIL));
        $g1413$ = SubLFiles.defparameter("S#9913", (SubLObject)NIL);
        $g1414$ = SubLFiles.deflexical("S#9914", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g1414$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)TEN_INTEGER, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g1415$ = SubLFiles.deflexical("S#9915", (NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g1415$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g1416$ = SubLFiles.deflexical("S#9916", (NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g1416$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)TEN_INTEGER, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g1417$ = SubLFiles.deflexical("S#9917", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g1417$.getGlobalValue() : $ic20$));
        $g1418$ = SubLFiles.defparameter("S#9918", (SubLObject)NIL);
        $g1419$ = SubLFiles.defparameter("S#9919", (SubLObject)NIL);
        $g1420$ = SubLFiles.defparameter("S#9920", (SubLObject)MINUS_ONE_INTEGER);
        $g1421$ = SubLFiles.defparameter("S#9921", (SubLObject)MINUS_ONE_INTEGER);
        $g1422$ = SubLFiles.defparameter("S#9922", (SubLObject)NIL);
        $g1423$ = SubLFiles.defparameter("S#9923", (SubLObject)NIL);
        $g1424$ = SubLFiles.defparameter("S#9924", (SubLObject)NIL);
        $g1425$ = SubLFiles.defparameter("S#9925", (SubLObject)NIL);
        $g1426$ = SubLFiles.defparameter("S#9926", (SubLObject)NIL);
        $g1427$ = SubLFiles.deflexical("S#9927", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7934() {
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic19$);
        module0002.f50((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)$ic32$);
        module0012.f368((SubLObject)$ic33$, (SubLObject)$ic29$, (SubLObject)$ic34$, (SubLObject)$ic31$, (SubLObject)$ic32$);
        module0012.f368((SubLObject)$ic35$, (SubLObject)$ic29$, (SubLObject)$ic36$, (SubLObject)$ic31$, (SubLObject)$ic32$);
        module0027.f1449((SubLObject)$ic28$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic37$, Symbols.symbol_function((SubLObject)EQ), $ic38$, NIL, $ic39$, NIL, $ic40$, $ic41$, $ic42$, T }), (SubLObject)$ic43$);
        module0002.f38((SubLObject)$ic65$);
        module0027.f1449((SubLObject)$ic65$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic37$, Symbols.symbol_function((SubLObject)EQUAL), $ic38$, NIL, $ic39$, NIL, $ic40$, $ic41$, $ic42$, T }), (SubLObject)$ic67$);
        module0012.f379((SubLObject)$ic69$, (SubLObject)$ic70$);
        f7707((SubLObject)$ic69$, (SubLObject)$ic71$);
        module0012.f379((SubLObject)$ic73$, (SubLObject)$ic74$);
        f7707((SubLObject)$ic73$, (SubLObject)$ic75$);
        module0012.f379((SubLObject)$ic76$, (SubLObject)$ic77$);
        f7707((SubLObject)$ic76$, (SubLObject)$ic78$);
        module0012.f379((SubLObject)$ic79$, (SubLObject)$ic80$);
        f7707((SubLObject)$ic79$, (SubLObject)$ic81$);
        module0012.f379((SubLObject)$ic11$, (SubLObject)$ic82$);
        f7707((SubLObject)$ic11$, (SubLObject)$ic83$);
        module0012.f379((SubLObject)$ic85$, (SubLObject)$ic86$);
        f7707((SubLObject)$ic85$, (SubLObject)$ic87$);
        module0012.f379((SubLObject)$ic89$, (SubLObject)$ic90$);
        f7707((SubLObject)$ic89$, (SubLObject)$ic91$);
        module0012.f379((SubLObject)$ic93$, (SubLObject)$ic94$);
        f7707((SubLObject)$ic93$, (SubLObject)$ic95$);
        module0012.f379((SubLObject)$ic97$, (SubLObject)$ic98$);
        f7707((SubLObject)$ic97$, (SubLObject)$ic100$);
        module0012.f379((SubLObject)$ic103$, (SubLObject)$ic104$);
        f7707((SubLObject)$ic103$, (SubLObject)$ic105$);
        module0012.f379((SubLObject)$ic107$, (SubLObject)$ic108$);
        f7707((SubLObject)$ic107$, (SubLObject)$ic109$);
        module0012.f379((SubLObject)$ic110$, (SubLObject)$ic111$);
        f7707((SubLObject)$ic110$, (SubLObject)$ic112$);
        module0012.f368((SubLObject)$ic113$, (SubLObject)NIL, (SubLObject)$ic114$, (SubLObject)NIL, (SubLObject)$ic115$);
        module0012.f368((SubLObject)$ic116$, (SubLObject)$ic117$, (SubLObject)$ic118$, (SubLObject)NIL, (SubLObject)$ic115$);
        module0012.f368((SubLObject)$ic119$, (SubLObject)$ic120$, (SubLObject)$ic121$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f379((SubLObject)$ic122$, (SubLObject)$ic123$);
        f7707((SubLObject)$ic122$, (SubLObject)$ic124$);
        module0012.f379((SubLObject)$ic51$, (SubLObject)$ic126$);
        f7707((SubLObject)$ic51$, (SubLObject)$ic127$);
        module0012.f379((SubLObject)$ic132$, (SubLObject)$ic133$);
        f7707((SubLObject)$ic132$, (SubLObject)$ic134$);
        module0012.f379((SubLObject)$ic135$, (SubLObject)$ic136$);
        f7707((SubLObject)$ic135$, (SubLObject)$ic137$);
        module0012.f379((SubLObject)$ic139$, (SubLObject)$ic140$);
        f7707((SubLObject)$ic139$, (SubLObject)$ic141$);
        module0012.f379((SubLObject)$ic143$, (SubLObject)$ic144$);
        f7707((SubLObject)$ic143$, (SubLObject)$ic145$);
        module0012.f379((SubLObject)$ic20$, (SubLObject)$ic147$);
        f7707((SubLObject)$ic148$, (SubLObject)$ic149$);
        module0012.f379((SubLObject)$ic150$, (SubLObject)$ic151$);
        f7707((SubLObject)$ic150$, (SubLObject)$ic152$);
        module0012.f379((SubLObject)$ic153$, (SubLObject)$ic154$);
        f7707((SubLObject)$ic153$, (SubLObject)$ic155$);
        module0012.f379((SubLObject)$ic157$, (SubLObject)$ic158$);
        f7707((SubLObject)$ic157$, (SubLObject)$ic159$);
        module0012.f379((SubLObject)$ic161$, (SubLObject)$ic162$);
        f7707((SubLObject)$ic161$, (SubLObject)$ic163$);
        module0012.f379((SubLObject)$ic165$, (SubLObject)$ic166$);
        f7707((SubLObject)$ic165$, (SubLObject)$ic167$);
        module0012.f379((SubLObject)$ic53$, (SubLObject)$ic168$);
        f7707((SubLObject)$ic53$, (SubLObject)$ic169$);
        module0012.f379((SubLObject)$ic170$, (SubLObject)$ic171$);
        f7707((SubLObject)$ic170$, (SubLObject)$ic172$);
        module0012.f379((SubLObject)$ic173$, (SubLObject)$ic174$);
        f7707((SubLObject)$ic173$, (SubLObject)$ic175$);
        module0012.f379((SubLObject)$ic181$, (SubLObject)$ic182$);
        f7707((SubLObject)$ic181$, (SubLObject)$ic183$);
        module0012.f379((SubLObject)$ic184$, (SubLObject)$ic185$);
        f7707((SubLObject)$ic184$, (SubLObject)$ic186$);
        module0012.f379((SubLObject)$ic10$, (SubLObject)$ic188$);
        f7707((SubLObject)$ic10$, (SubLObject)$ic189$);
        module0012.f379((SubLObject)$ic21$, (SubLObject)$ic191$);
        f7707((SubLObject)$ic21$, (SubLObject)$ic193$);
        module0012.f379((SubLObject)$ic196$, (SubLObject)$ic197$);
        f7707((SubLObject)$ic196$, (SubLObject)$ic198$);
        module0012.f379((SubLObject)$ic199$, (SubLObject)$ic200$);
        f7707((SubLObject)$ic199$, (SubLObject)$ic201$);
        module0012.f379((SubLObject)$ic202$, (SubLObject)$ic203$);
        f7707((SubLObject)$ic202$, (SubLObject)$ic204$);
        module0012.f379((SubLObject)$ic205$, (SubLObject)$ic206$);
        f7707((SubLObject)$ic205$, (SubLObject)$ic207$);
        module0012.f379((SubLObject)$ic209$, (SubLObject)$ic210$);
        f7707((SubLObject)$ic209$, (SubLObject)$ic211$);
        module0012.f379((SubLObject)$ic213$, (SubLObject)$ic214$);
        f7707((SubLObject)$ic213$, (SubLObject)$ic215$);
        module0012.f379((SubLObject)$ic216$, (SubLObject)$ic217$);
        f7707((SubLObject)$ic216$, (SubLObject)$ic218$);
        module0012.f379((SubLObject)$ic219$, (SubLObject)$ic220$);
        f7707((SubLObject)$ic219$, (SubLObject)$ic221$);
        module0012.f379((SubLObject)$ic223$, (SubLObject)$ic224$);
        f7707((SubLObject)$ic223$, (SubLObject)$ic225$);
        module0012.f379((SubLObject)$ic226$, (SubLObject)$ic227$);
        f7707((SubLObject)$ic226$, (SubLObject)$ic228$);
        module0012.f379((SubLObject)$ic229$, (SubLObject)$ic230$);
        f7707((SubLObject)$ic229$, (SubLObject)$ic231$);
        module0012.f379((SubLObject)$ic232$, (SubLObject)$ic233$);
        f7707((SubLObject)$ic232$, (SubLObject)$ic234$);
        module0012.f379((SubLObject)$ic235$, (SubLObject)$ic236$);
        f7707((SubLObject)$ic235$, (SubLObject)$ic237$);
        module0012.f379((SubLObject)$ic238$, (SubLObject)$ic239$);
        f7707((SubLObject)$ic238$, (SubLObject)$ic240$);
        module0012.f379((SubLObject)$ic243$, (SubLObject)$ic244$);
        f7707((SubLObject)$ic243$, (SubLObject)$ic245$);
        module0012.f379((SubLObject)$ic247$, (SubLObject)$ic248$);
        f7707((SubLObject)$ic247$, (SubLObject)$ic249$);
        module0012.f379((SubLObject)$ic251$, (SubLObject)$ic252$);
        f7707((SubLObject)$ic251$, (SubLObject)$ic253$);
        module0012.f379((SubLObject)$ic255$, (SubLObject)$ic256$);
        f7707((SubLObject)$ic255$, (SubLObject)$ic257$);
        module0012.f379((SubLObject)$ic259$, (SubLObject)$ic260$);
        f7707((SubLObject)$ic259$, (SubLObject)$ic261$);
        module0012.f379((SubLObject)$ic267$, (SubLObject)$ic268$);
        f7707((SubLObject)$ic267$, (SubLObject)$ic269$);
        module0012.f379((SubLObject)$ic274$, (SubLObject)$ic275$);
        f7707((SubLObject)$ic274$, (SubLObject)$ic276$);
        module0012.f379((SubLObject)$ic281$, (SubLObject)$ic282$);
        f7707((SubLObject)$ic281$, (SubLObject)$ic283$);
        module0012.f379((SubLObject)$ic288$, (SubLObject)$ic289$);
        f7707((SubLObject)$ic288$, (SubLObject)$ic290$);
        module0012.f379((SubLObject)$ic292$, (SubLObject)$ic293$);
        f7707((SubLObject)$ic292$, (SubLObject)$ic294$);
        module0012.f379((SubLObject)$ic298$, (SubLObject)$ic299$);
        f7707((SubLObject)$ic298$, (SubLObject)$ic300$);
        module0012.f379((SubLObject)$ic306$, (SubLObject)$ic307$);
        f7707((SubLObject)$ic306$, (SubLObject)$ic308$);
        module0012.f379((SubLObject)$ic319$, (SubLObject)$ic320$);
        f7707((SubLObject)$ic319$, (SubLObject)$ic321$);
        module0012.f379((SubLObject)$ic15$, (SubLObject)$ic322$);
        f7707((SubLObject)$ic15$, (SubLObject)$ic323$);
        module0012.f379((SubLObject)$ic324$, (SubLObject)$ic325$);
        f7707((SubLObject)$ic324$, (SubLObject)$ic326$);
        module0012.f379((SubLObject)$ic327$, (SubLObject)$ic328$);
        f7707((SubLObject)$ic327$, (SubLObject)$ic329$);
        module0012.f379((SubLObject)$ic331$, (SubLObject)$ic332$);
        f7707((SubLObject)$ic331$, (SubLObject)$ic333$);
        module0012.f379((SubLObject)$ic335$, (SubLObject)$ic336$);
        f7707((SubLObject)$ic335$, (SubLObject)$ic337$);
        module0012.f379((SubLObject)$ic339$, (SubLObject)$ic340$);
        f7707((SubLObject)$ic339$, (SubLObject)$ic341$);
        module0012.f379((SubLObject)$ic343$, (SubLObject)$ic344$);
        f7707((SubLObject)$ic343$, (SubLObject)$ic345$);
        module0012.f379((SubLObject)$ic346$, (SubLObject)$ic347$);
        f7707((SubLObject)$ic346$, (SubLObject)$ic348$);
        module0012.f379((SubLObject)$ic350$, (SubLObject)$ic351$);
        f7707((SubLObject)$ic350$, (SubLObject)$ic352$);
        module0012.f379((SubLObject)$ic354$, (SubLObject)$ic355$);
        f7707((SubLObject)$ic354$, (SubLObject)$ic356$);
        module0012.f379((SubLObject)$ic363$, (SubLObject)$ic364$);
        f7707((SubLObject)$ic363$, (SubLObject)$ic365$);
        module0012.f379((SubLObject)$ic367$, (SubLObject)$ic368$);
        f7707((SubLObject)$ic367$, (SubLObject)$ic369$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f7932();
    }
    
    public void initializeVariables() {
        f7933();
    }
    
    public void runTopLevelForms() {
        f7934();
    }
    
    static {
        me = (SubLFile)new module0112();
        $g1410$ = null;
        $g1411$ = null;
        $g1412$ = null;
        $g1413$ = null;
        $g1414$ = null;
        $g1415$ = null;
        $g1416$ = null;
        $g1417$ = null;
        $g1418$ = null;
        $g1419$ = null;
        $g1420$ = null;
        $g1421$ = null;
        $g1422$ = null;
        $g1423$ = null;
        $g1424$ = null;
        $g1425$ = null;
        $g1426$ = null;
        $g1427$ = null;
        $ic0$ = makeSymbol("S#2613", "CYC");
        $ic1$ = makeSymbol("S#9911", "CYC");
        $ic2$ = makeSymbol("S#9912", "CYC");
        $ic3$ = makeSymbol("S#9914", "CYC");
        $ic4$ = makeSymbol("S#9915", "CYC");
        $ic5$ = makeInteger(100);
        $ic6$ = makeSymbol("S#9916", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic8$ = makeUninternedSymbol("US#53E30DA");
        $ic9$ = makeString("API-SPECIAL-~A");
        $ic10$ = makeSymbol("PROGN");
        $ic11$ = makeSymbol("DEFINE-PRIVATE");
        $ic12$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic13$ = makeSymbol("CDR");
        $ic14$ = makeSymbol("S#378", "CYC");
        $ic15$ = makeSymbol("QUOTE");
        $ic16$ = makeUninternedSymbol("US#53E30DA");
        $ic17$ = makeString("API-SPECIAL-~A-VERIFY");
        $ic18$ = makeSymbol("S#9696", "CYC");
        $ic19$ = makeSymbol("S#9917", "CYC");
        $ic20$ = makeSymbol("EVAL");
        $ic21$ = makeSymbol("CLET");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*%EVALUATOR-METHOD*", "SUBLISP"), (SubLObject)makeSymbol("S#9917", "CYC")));
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9913", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9710", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9918", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9919", "CYC"), (SubLObject)makeString("")));
        $ic24$ = makeSymbol("S#9710", "CYC");
        $ic25$ = makeSymbol("S#9928", "CYC");
        $ic26$ = makeSymbol("S#38", "CYC");
        $ic27$ = makeSymbol("SYMBOLP");
        $ic28$ = makeSymbol("VALID-API-OPERATOR-P");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"));
        $ic30$ = makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR or use\nas a MACRO would success in the most restricted version of the API");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("SYMBOLP")));
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic33$ = makeSymbol("VALID-API-FUNCTION-P");
        $ic34$ = makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
        $ic35$ = makeSymbol("VALID-API-MACRO-P");
        $ic36$ = makeString("@return boolean T iff macro expansion of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
        $ic37$ = makeKeyword("TEST");
        $ic38$ = makeKeyword("OWNER");
        $ic39$ = makeKeyword("CLASSES");
        $ic40$ = makeKeyword("KB");
        $ic41$ = makeKeyword("TINY");
        $ic42$ = makeKeyword("WORKING?");
        $ic43$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VALID-API-OPERATOR-P")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("WITH-ALL-MTS")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("+")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CDESTRUCTURING-BIND")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CPUSH")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("EXPRESSION-FIND-IF")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("SYMBOL-PACKAGE")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9712", "CYC")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9726", "CYC")), (SubLObject)NIL) });
        $ic44$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic45$ = makeString("Operator ~S was not a symbol");
        $ic46$ = makeString("Operator ~S is not defined in the API");
        $ic47$ = makeString("Variable ~S is unbound");
        $ic48$ = makeString("API ERROR");
        $ic49$ = makeString("Attempt to obtain the value of symbol ~S which is unbound");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("S#9929", "CYC"));
        $ic51$ = makeSymbol("CSETQ");
        $ic52$ = makeSymbol("S#9929", "CYC");
        $ic53$ = makeSymbol("MULTIPLE-VALUE-LIST");
        $ic54$ = makeSymbol("S#9728", "CYC");
        $ic55$ = makeSymbol("VALUES-LIST");
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#9930", "CYC"));
        $ic57$ = makeSymbol("S#9930", "CYC");
        $ic58$ = makeSymbol("MACROEXPAND-1");
        $ic59$ = makeKeyword("EVAL-IN-API-RET");
        $ic60$ = makeSymbol("S#9727", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#9931", "CYC"));
        $ic62$ = makeSymbol("S#9931", "CYC");
        $ic63$ = makeSymbol("S#9806", "CYC");
        $ic64$ = makeString("with-eval-in-api-env-int");
        $ic65$ = makeSymbol("VERIFY-IN-API");
        $ic66$ = makeString("don't know how to handle special ~A");
        $ic67$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER))))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEFINE"), (SubLObject)makeSymbol("S#9932", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9932", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)makeSymbol("S#9932", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9932", "CYC"), (SubLObject)ONE_INTEGER))))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEFINE-PUBLIC"), (SubLObject)makeSymbol("S#4835", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CHECK-TYPE"), (SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9933", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#9933", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4835", "CYC"), (SubLObject)makeSymbol("S#770", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)makeSymbol("S#9933", "CYC"))))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PIF"), (SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NULL"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NULL"), (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)makeSymbol("*THE-CYCLIST*")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEFVAR"), (SubLObject)makeSymbol("S#9934", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEFMACRO"), (SubLObject)makeSymbol("S#9935", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9936", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9934", "CYC"), (SubLObject)makeSymbol("S#9936", "CYC"))), (SubLObject)makeSymbol("S#5", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEFINE"), (SubLObject)makeSymbol("S#9937", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9936", "CYC"), (SubLObject)makeSymbol("S#9938", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9935", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9936", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9932", "CYC"), (SubLObject)makeSymbol("S#9936", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEFINE"), (SubLObject)makeSymbol("S#9932", "CYC"), (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)NIL)))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("FBOUNDP"))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("MULTIPLE-VALUE-LIST"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("VALUES"), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)FIVE_INTEGER, (SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PRINT"), (SubLObject)makeString("a")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9939", "CYC"), (SubLObject)makeSymbol("MIN"), (SubLObject)makeSymbol("S#9940", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-DECODED-TIME")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FORMAT"), (SubLObject)T, (SubLObject)makeString("~A:~A"), (SubLObject)makeSymbol("S#9940", "CYC"), (SubLObject)makeSymbol("MIN")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CINC"), (SubLObject)makeSymbol("S#770", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PRINT"), (SubLObject)makeString("a"))))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9941", "CYC"), (SubLObject)ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)ONE_INTEGER, (SubLObject)makeSymbol("S#9941", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9942", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)makeSymbol("S#9942", "CYC"), (SubLObject)TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9943", "CYC"), (SubLObject)makeInteger(-10), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("-"), (SubLObject)makeSymbol("S#9943", "CYC"), (SubLObject)ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(">"), (SubLObject)makeSymbol("S#9941", "CYC"), (SubLObject)THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FORMAT"), (SubLObject)T, (SubLObject)makeString("~%x=~S y=~S z=~S"), (SubLObject)makeSymbol("S#9941", "CYC"), (SubLObject)makeSymbol("S#9942", "CYC"), (SubLObject)makeSymbol("S#9943", "CYC")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9932", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CCATCH"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAKE-KEYWORD"), (SubLObject)makeString("a")), (SubLObject)makeSymbol("S#9932", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("THROW"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAKE-KEYWORD"), (SubLObject)makeString("a")), (SubLObject)makeString("b"))), (SubLObject)makeSymbol("S#9932", "CYC"))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DO-CONSTANTS"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9181", "CYC")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DO-NARTS"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DO-FORTS"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9179", "CYC")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DO-ASSERTIONS"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#173", "CYC")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DO-DEDUCTIONS"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9178", "CYC")))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#9944", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DO-GAF-ARG-INDEX"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#173", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#9945", "CYC")), (SubLObject)makeKeyword("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#9946", "CYC")), (SubLObject)makeKeyword("INDEX"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PRINT"), (SubLObject)makeSymbol("S#173", "CYC"))))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DO-GAF-ARG-INDEX"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#173", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#9945", "CYC")), (SubLObject)makeKeyword("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#9946", "CYC")), (SubLObject)makeKeyword("INDEX"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PRINT"), (SubLObject)makeSymbol("S#173", "CYC"))))), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEFINE-EVALUATION-DEFN"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NULL"), (SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("THROW-UNEVALUATABLE"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)makeSymbol("OBJECT", "CYC")))), (SubLObject)NIL) });
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#63", "CYC"));
        $ic69$ = makeSymbol("RET");
        $ic70$ = makeSymbol("S#9732", "CYC");
        $ic71$ = makeSymbol("S#9733", "CYC");
        $ic72$ = makeSymbol("LAMBDA");
        $ic73$ = makeSymbol("DEFINE");
        $ic74$ = makeSymbol("S#9734", "CYC");
        $ic75$ = makeSymbol("S#9735", "CYC");
        $ic76$ = makeSymbol("DEFINE-PUBLIC");
        $ic77$ = makeSymbol("S#9736", "CYC");
        $ic78$ = makeSymbol("S#9737", "CYC");
        $ic79$ = makeSymbol("DEFINE-PROTECTED");
        $ic80$ = makeSymbol("S#9738", "CYC");
        $ic81$ = makeSymbol("S#9739", "CYC");
        $ic82$ = makeSymbol("S#9740", "CYC");
        $ic83$ = makeSymbol("S#9741", "CYC");
        $ic84$ = makeUninternedSymbol("US#53E30DA");
        $ic85$ = makeSymbol("DEFMACRO");
        $ic86$ = makeSymbol("S#9742", "CYC");
        $ic87$ = makeSymbol("S#9743", "CYC");
        $ic88$ = makeUninternedSymbol("US#53E30DA");
        $ic89$ = makeSymbol("DEFMACRO-PUBLIC");
        $ic90$ = makeSymbol("S#9744", "CYC");
        $ic91$ = makeSymbol("S#9745", "CYC");
        $ic92$ = makeUninternedSymbol("US#53E30DA");
        $ic93$ = makeSymbol("DEFMACRO-PROTECTED");
        $ic94$ = makeSymbol("S#9746", "CYC");
        $ic95$ = makeSymbol("S#9747", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#4498", "CYC"));
        $ic97$ = makeSymbol("DEFSTRUCT");
        $ic98$ = makeSymbol("S#9749", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#4498", "CYC")));
        $ic100$ = makeSymbol("S#9750", "CYC");
        $ic101$ = makeSymbol("DEFSTRUCT-VECTOR");
        $ic102$ = ConsesLow.list((SubLObject)makeSymbol("SYMBOL"));
        $ic103$ = makeSymbol("S#9947", "CYC");
        $ic104$ = makeSymbol("S#9752", "CYC");
        $ic105$ = makeSymbol("S#9753", "CYC");
        $ic106$ = ConsesLow.list((SubLObject)makeSymbol("SYMBOL"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic107$ = makeSymbol("DEFVAR");
        $ic108$ = makeSymbol("S#9754", "CYC");
        $ic109$ = makeSymbol("S#9755", "CYC");
        $ic110$ = makeSymbol("DEFVAR-PRIVATE");
        $ic111$ = makeSymbol("S#9756", "CYC");
        $ic112$ = makeSymbol("S#9757", "CYC");
        $ic113$ = makeSymbol("CLEAR-API-USER-VARIABLES");
        $ic114$ = makeString("Removes all user variables.");
        $ic115$ = ConsesLow.list((SubLObject)NIL);
        $ic116$ = makeSymbol("PUT-API-USER-VARIABLE");
        $ic117$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic118$ = makeString("Sets the value of a the user variable VAR to the given VALUE.");
        $ic119$ = makeSymbol("GET-API-USER-VARIABLE");
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"));
        $ic121$ = makeString("Gets the value of a the user variable VAR.");
        $ic122$ = makeSymbol("S#9948", "CYC");
        $ic123$ = makeSymbol("S#9760", "CYC");
        $ic124$ = makeSymbol("S#9761", "CYC");
        $ic125$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#9949", "CYC"));
        $ic126$ = makeSymbol("S#9762", "CYC");
        $ic127$ = makeSymbol("S#9763", "CYC");
        $ic128$ = makeString("~S is not a symbol");
        $ic129$ = makeString("~S is not defined");
        $ic130$ = ConsesLow.list((SubLObject)makeSymbol("S#9941", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#126", "CYC"), (SubLObject)ONE_INTEGER));
        $ic131$ = makeString("~S is not an api variable");
        $ic132$ = makeSymbol("CINC");
        $ic133$ = makeSymbol("S#9765", "CYC");
        $ic134$ = makeSymbol("S#9766", "CYC");
        $ic135$ = makeSymbol("CDEC");
        $ic136$ = makeSymbol("S#9767", "CYC");
        $ic137$ = makeSymbol("S#9768", "CYC");
        $ic138$ = ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"));
        $ic139$ = makeSymbol("CPUSH");
        $ic140$ = makeSymbol("S#9769", "CYC");
        $ic141$ = makeSymbol("S#9770", "CYC");
        $ic142$ = ConsesLow.list((SubLObject)makeSymbol("S#169", "CYC"));
        $ic143$ = makeSymbol("CPOP");
        $ic144$ = makeSymbol("S#9771", "CYC");
        $ic145$ = makeSymbol("S#9772", "CYC");
        $ic146$ = ConsesLow.list((SubLObject)makeSymbol("S#151", "CYC"));
        $ic147$ = makeSymbol("S#9773", "CYC");
        $ic148$ = makeSymbol("S#9711", "CYC");
        $ic149$ = makeSymbol("S#9774", "CYC");
        $ic150$ = makeSymbol("S#9950", "CYC");
        $ic151$ = makeSymbol("S#9775", "CYC");
        $ic152$ = makeSymbol("S#9776", "CYC");
        $ic153$ = makeSymbol("S#9951", "CYC");
        $ic154$ = makeSymbol("S#9777", "CYC");
        $ic155$ = makeSymbol("S#9778", "CYC");
        $ic156$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#9952", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#160", "CYC"));
        $ic157$ = makeSymbol("APPLY");
        $ic158$ = makeSymbol("S#9779", "CYC");
        $ic159$ = makeSymbol("S#9780", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"));
        $ic161$ = makeSymbol("FBOUNDP");
        $ic162$ = makeSymbol("S#9784", "CYC");
        $ic163$ = makeSymbol("S#9785", "CYC");
        $ic164$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#160", "CYC"));
        $ic165$ = makeSymbol("FUNCALL");
        $ic166$ = makeSymbol("S#9786", "CYC");
        $ic167$ = makeSymbol("S#9787", "CYC");
        $ic168$ = makeSymbol("S#9788", "CYC");
        $ic169$ = makeSymbol("S#9789", "CYC");
        $ic170$ = makeSymbol("TRACE");
        $ic171$ = makeSymbol("S#9790", "CYC");
        $ic172$ = makeSymbol("S#9791", "CYC");
        $ic173$ = makeSymbol("UNTRACE");
        $ic174$ = makeSymbol("S#9793", "CYC");
        $ic175$ = makeSymbol("S#9794", "CYC");
        $ic176$ = makeString("~%");
        $ic177$ = makeString("~A~D: ~S~%");
        $ic178$ = makeString("");
        $ic179$ = makeString("~S ");
        $ic180$ = makeString("~A~D: returned ~A~%");
        $ic181$ = makeSymbol("S#9953", "CYC");
        $ic182$ = makeSymbol("S#9799", "CYC");
        $ic183$ = makeSymbol("S#9800", "CYC");
        $ic184$ = makeSymbol("S#9954", "CYC");
        $ic185$ = makeSymbol("S#9801", "CYC");
        $ic186$ = makeSymbol("S#9802", "CYC");
        $ic187$ = makeSymbol("NUMBERP");
        $ic188$ = makeSymbol("S#9804", "CYC");
        $ic189$ = makeSymbol("S#9805", "CYC");
        $ic190$ = ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic191$ = makeSymbol("S#9807", "CYC");
        $ic192$ = makeString("clet error");
        $ic193$ = makeSymbol("S#9808", "CYC");
        $ic194$ = ConsesLow.list((SubLObject)makeSymbol("S#9955", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#9956", "CYC"));
        $ic195$ = ConsesLow.list((SubLObject)makeSymbol("S#4", "CYC"), (SubLObject)makeSymbol("S#9957", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic196$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic197$ = makeSymbol("S#9811", "CYC");
        $ic198$ = makeSymbol("S#9812", "CYC");
        $ic199$ = makeSymbol("CAND");
        $ic200$ = makeSymbol("S#9814", "CYC");
        $ic201$ = makeSymbol("S#9815", "CYC");
        $ic202$ = makeSymbol("COR");
        $ic203$ = makeSymbol("S#9816", "CYC");
        $ic204$ = makeSymbol("S#9817", "CYC");
        $ic205$ = makeSymbol("CNOT");
        $ic206$ = makeSymbol("S#9818", "CYC");
        $ic207$ = makeSymbol("S#9819", "CYC");
        $ic208$ = ConsesLow.list((SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic209$ = makeSymbol("PCOND");
        $ic210$ = makeSymbol("S#9820", "CYC");
        $ic211$ = makeSymbol("S#9821", "CYC");
        $ic212$ = ConsesLow.list((SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("S#163", "CYC"), (SubLObject)makeSymbol("S#164", "CYC"));
        $ic213$ = makeSymbol("PIF");
        $ic214$ = makeSymbol("S#9822", "CYC");
        $ic215$ = makeSymbol("S#9823", "CYC");
        $ic216$ = makeSymbol("FIF");
        $ic217$ = makeSymbol("S#9825", "CYC");
        $ic218$ = makeSymbol("S#9826", "CYC");
        $ic219$ = makeSymbol("PWHEN");
        $ic220$ = makeSymbol("S#9827", "CYC");
        $ic221$ = makeSymbol("S#9828", "CYC");
        $ic222$ = ConsesLow.list((SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("S#163", "CYC"));
        $ic223$ = makeSymbol("WHEN");
        $ic224$ = makeSymbol("S#9829", "CYC");
        $ic225$ = makeSymbol("S#9830", "CYC");
        $ic226$ = makeSymbol("FWHEN");
        $ic227$ = makeSymbol("S#9831", "CYC");
        $ic228$ = makeSymbol("S#9832", "CYC");
        $ic229$ = makeSymbol("PUNLESS");
        $ic230$ = makeSymbol("S#9833", "CYC");
        $ic231$ = makeSymbol("S#9834", "CYC");
        $ic232$ = makeSymbol("FUNLESS");
        $ic233$ = makeSymbol("S#9835", "CYC");
        $ic234$ = makeSymbol("S#9836", "CYC");
        $ic235$ = makeSymbol("WHILE");
        $ic236$ = makeSymbol("S#9837", "CYC");
        $ic237$ = makeSymbol("S#9838", "CYC");
        $ic238$ = makeSymbol("UNTIL");
        $ic239$ = makeSymbol("S#9839", "CYC");
        $ic240$ = makeSymbol("S#9840", "CYC");
        $ic241$ = ConsesLow.list((SubLObject)makeSymbol("S#4", "CYC"), (SubLObject)makeSymbol("S#9958", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic242$ = makeString("~S is not a valid cdo variable specification in SubL");
        $ic243$ = makeSymbol("CDO");
        $ic244$ = makeSymbol("S#9841", "CYC");
        $ic245$ = makeSymbol("S#9842", "CYC");
        $ic246$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#140", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic247$ = makeSymbol("CDOLIST");
        $ic248$ = makeSymbol("S#9843", "CYC");
        $ic249$ = makeSymbol("S#9844", "CYC");
        $ic250$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("INTEGER")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic251$ = makeSymbol("CDOTIMES");
        $ic252$ = makeSymbol("S#9846", "CYC");
        $ic253$ = makeSymbol("S#9847", "CYC");
        $ic254$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#704", "CYC"), (SubLObject)makeSymbol("S#705", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic255$ = makeSymbol("CDOHASH");
        $ic256$ = makeSymbol("S#9849", "CYC");
        $ic257$ = makeSymbol("S#9850", "CYC");
        $ic258$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#9959", "CYC"));
        $ic259$ = makeSymbol("MAPCAR");
        $ic260$ = makeSymbol("S#9852", "CYC");
        $ic261$ = makeSymbol("S#9853", "CYC");
        $ic262$ = makeString("~S does not evaluate to an api function object");
        $ic263$ = makeSymbol("FIRST");
        $ic264$ = makeSymbol("S#9854", "CYC");
        $ic265$ = makeSymbol("REST");
        $ic266$ = ConsesLow.list((SubLObject)makeSymbol("S#9960", "CYC"), (SubLObject)makeSymbol("S#168", "CYC"));
        $ic267$ = makeSymbol("S#6458", "CYC");
        $ic268$ = makeSymbol("S#9856", "CYC");
        $ic269$ = makeSymbol("S#9857", "CYC");
        $ic270$ = makeKeyword("ALIST");
        $ic271$ = makeKeyword("HASHTABLE");
        $ic272$ = makeString("Corrupted dictionary; unsupported style ~S.~%");
        $ic273$ = ConsesLow.list((SubLObject)makeSymbol("S#9960", "CYC"), (SubLObject)makeSymbol("S#168", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic274$ = makeSymbol("S#6459", "CYC");
        $ic275$ = makeSymbol("S#9861", "CYC");
        $ic276$ = makeSymbol("S#9862", "CYC");
        $ic277$ = makeString("evaluated-dict");
        $ic278$ = makeString("evaluated-func");
        $ic279$ = makeString("evaluated-args");
        $ic280$ = ConsesLow.list((SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#768", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic281$ = makeSymbol("CCATCH");
        $ic282$ = makeSymbol("S#9866", "CYC");
        $ic283$ = makeSymbol("S#9867", "CYC");
        $ic284$ = ConsesLow.list((SubLObject)makeSymbol("S#9961", "CYC"));
        $ic285$ = makeSymbol("S#9961", "CYC");
        $ic286$ = makeSymbol("S#9764", "CYC");
        $ic287$ = ConsesLow.list((SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#3267", "CYC"));
        $ic288$ = makeSymbol("THROW");
        $ic289$ = makeSymbol("S#9869", "CYC");
        $ic290$ = makeSymbol("S#9870", "CYC");
        $ic291$ = makeSymbol("S#9712", "CYC");
        $ic292$ = makeSymbol("IGNORE-ERRORS");
        $ic293$ = makeSymbol("S#9872", "CYC");
        $ic294$ = makeSymbol("S#9873", "CYC");
        $ic295$ = ConsesLow.list((SubLObject)makeSymbol("S#9962", "CYC"));
        $ic296$ = makeSymbol("S#9962", "CYC");
        $ic297$ = ConsesLow.list((SubLObject)makeSymbol("S#152", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic298$ = makeSymbol("CUNWIND-PROTECT");
        $ic299$ = makeSymbol("S#9875", "CYC");
        $ic300$ = makeSymbol("S#9876", "CYC");
        $ic301$ = makeSymbol(">");
        $ic302$ = ConsesLow.list((SubLObject)makeSymbol("LENGTH"), (SubLObject)makeSymbol("S#9913", "CYC"));
        $ic303$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CPOP"), (SubLObject)makeSymbol("S#9913", "CYC")));
        $ic304$ = makeString("eval-in-api-cunwind-protect");
        $ic305$ = ConsesLow.list((SubLObject)makeSymbol("S#885", "CYC"));
        $ic306$ = makeSymbol("LOAD");
        $ic307$ = makeSymbol("S#9878", "CYC");
        $ic308$ = makeSymbol("S#9879", "CYC");
        $ic309$ = makeSymbol("STRINGP");
        $ic310$ = makeKeyword("DIRECTION");
        $ic311$ = makeKeyword("INPUT");
        $ic312$ = makeKeyword("IF-DOES-NOT-EXIST");
        $ic313$ = makeString("~S does not exist, cannot load");
        $ic314$ = makeKeyword("EOF");
        $ic315$ = makeKeyword("ERROR");
        $ic316$ = makeString("~%Read error occured at position ~A of file ~A");
        $ic317$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic318$ = makeString("~A is not a ~A");
        $ic319$ = makeSymbol("CHECK-TYPE");
        $ic320$ = makeSymbol("S#9881", "CYC");
        $ic321$ = makeSymbol("S#9882", "CYC");
        $ic322$ = makeSymbol("S#9883", "CYC");
        $ic323$ = makeSymbol("S#9884", "CYC");
        $ic324$ = makeSymbol("BOUNDP");
        $ic325$ = makeSymbol("S#9885", "CYC");
        $ic326$ = makeSymbol("S#9886", "CYC");
        $ic327$ = makeSymbol("SYMBOL-VALUE");
        $ic328$ = makeSymbol("S#9887", "CYC");
        $ic329$ = makeSymbol("S#9888", "CYC");
        $ic330$ = ConsesLow.list((SubLObject)makeSymbol("S#9963", "CYC"));
        $ic331$ = makeSymbol("FUNCTION");
        $ic332$ = makeSymbol("S#9889", "CYC");
        $ic333$ = makeSymbol("S#9890", "CYC");
        $ic334$ = ConsesLow.list((SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#160", "CYC"));
        $ic335$ = makeSymbol("ERROR");
        $ic336$ = makeSymbol("S#9892", "CYC");
        $ic337$ = makeSymbol("S#9893", "CYC");
        $ic338$ = makeString("~%~S");
        $ic339$ = makeSymbol("BREAK");
        $ic340$ = makeSymbol("S#9894", "CYC");
        $ic341$ = makeSymbol("S#9895", "CYC");
        $ic342$ = makeString("Can only clear the environment from the top level");
        $ic343$ = makeSymbol("S#9964", "CYC");
        $ic344$ = makeSymbol("S#9896", "CYC");
        $ic345$ = makeSymbol("S#9897", "CYC");
        $ic346$ = makeSymbol("S#9965", "CYC");
        $ic347$ = makeSymbol("S#9898", "CYC");
        $ic348$ = makeSymbol("S#9899", "CYC");
        $ic349$ = ConsesLow.list((SubLObject)makeSymbol("PACKAGE"));
        $ic350$ = makeSymbol("IN-PACKAGE");
        $ic351$ = makeSymbol("S#9900", "CYC");
        $ic352$ = makeSymbol("S#9901", "CYC");
        $ic353$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic354$ = makeSymbol("CTIME");
        $ic355$ = makeSymbol("S#9902", "CYC");
        $ic356$ = makeSymbol("S#9903", "CYC");
        $ic357$ = makeSymbol("S#1", "CYC");
        $ic358$ = ConsesLow.list((SubLObject)makeSymbol("S#9966", "CYC"));
        $ic359$ = makeSymbol("S#9966", "CYC");
        $ic360$ = makeSymbol("S#9726", "CYC");
        $ic361$ = makeString("eval-in-api-ctime");
        $ic362$ = ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic363$ = makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic364$ = makeSymbol("S#9905", "CYC");
        $ic365$ = makeSymbol("S#9906", "CYC");
        $ic366$ = makeString("eval-in-api-noting-percent-progress");
        $ic367$ = makeSymbol("NOTING-ACTIVITY");
        $ic368$ = makeSymbol("S#9908", "CYC");
        $ic369$ = makeSymbol("S#9909", "CYC");
        $ic370$ = makeString("eval-in-api-noting-activity");
        $ic371$ = makeSymbol("MUST");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1296 ms
	
	Decompiled with Procyon 0.5.32.
*/