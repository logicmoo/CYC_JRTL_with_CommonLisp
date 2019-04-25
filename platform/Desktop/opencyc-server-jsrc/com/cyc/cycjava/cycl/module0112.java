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
        if (module0112.NIL != module0112.$g1410$.getDynamicValue(var2)) {
            return f7689(var1);
        }
        return f7690(var1);
    }
    
    public static SubLObject f7691(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0112.NIL != module0112.$g1410$.getDynamicValue(var2)) {
            return f7689(var1);
        }
        return Eval.eval(var1);
    }
    
    public static SubLObject f7692(final SubLObject var3, final SubLObject var4) {
        if (var3.isFunctionSpec()) {
            return Functions.apply(var3, var4);
        }
        return f7688(reader.bq_cons(var3, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0112.$ic0$), var4), (SubLObject)module0112.NIL)));
    }
    
    public static SubLObject f7693(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var5.isFunctionSpec() || (var5.isSymbol() && module0112.NIL != f7694(var5)));
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
        module0112.$g1411$.setGlobalValue((SubLObject)ConsesLow.cons(var10, module0112.$g1411$.getGlobalValue()));
        return var10;
    }
    
    public static SubLObject f7700(final SubLObject var5) {
        return module0004.f104(var5, module0112.$g1411$.getGlobalValue(), (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
    }
    
    public static SubLObject f7701(final SubLObject var10) {
        module0112.$g1412$.setGlobalValue((SubLObject)ConsesLow.cons(var10, module0112.$g1412$.getGlobalValue()));
        return var10;
    }
    
    public static SubLObject f7702(final SubLObject var5) {
        return module0004.f104(var5, module0112.$g1412$.getGlobalValue(), (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
    }
    
    public static SubLObject f7703(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var5.isSymbol() && module0112.NIL != module0035.sublisp_boolean(conses_high.assoc(var5, module0112.$g1413$.getDynamicValue(var6), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED)));
    }
    
    public static SubLObject f7704(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var5.isSymbol() && module0112.NIL == f7703(var5) && module0112.NIL != f7700(var5));
    }
    
    public static SubLObject f7705(final SubLObject var11) {
        return module0035.sublisp_boolean(Hashtables.gethash(var11, module0112.$g1414$.getGlobalValue(), (SubLObject)module0112.NIL));
    }
    
    public static SubLObject f7706(final SubLObject var11) {
        return Hashtables.gethash(var11, module0112.$g1414$.getGlobalValue(), (SubLObject)module0112.UNPROVIDED);
    }
    
    public static SubLObject f7707(final SubLObject var11, final SubLObject var12) {
        Hashtables.sethash(var11, module0112.$g1414$.getGlobalValue(), var12);
        return var11;
    }
    
    public static SubLObject f7694(final SubLObject var11) {
        return module0035.sublisp_boolean(Hashtables.gethash(var11, module0112.$g1415$.getGlobalValue(), (SubLObject)module0112.NIL));
    }
    
    public static SubLObject f7708(final SubLObject var11) {
        return Hashtables.gethash(var11, module0112.$g1415$.getGlobalValue(), (SubLObject)module0112.UNPROVIDED);
    }
    
    public static SubLObject f7709(final SubLObject var11, final SubLObject var12) {
        Hashtables.sethash(var11, module0112.$g1415$.getGlobalValue(), var12);
        return var11;
    }
    
    public static SubLObject f7710(final SubLObject var11) {
        return module0035.sublisp_boolean(Hashtables.gethash(var11, module0112.$g1416$.getGlobalValue(), (SubLObject)module0112.NIL));
    }
    
    public static SubLObject f7711(final SubLObject var11) {
        return Hashtables.gethash(var11, module0112.$g1416$.getGlobalValue(), (SubLObject)module0112.UNPROVIDED);
    }
    
    public static SubLObject f7712(final SubLObject var11, final SubLObject var13) {
        Hashtables.sethash(var11, module0112.$g1416$.getGlobalValue(), var13);
        return var11;
    }
    
    public static SubLObject f7713(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0112.NIL;
        SubLObject var19 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0112.$ic7$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0112.$ic7$);
        var19 = var17.first();
        final SubLObject var20;
        var17 = (var20 = var17.rest());
        final SubLObject var21 = (SubLObject)module0112.$ic8$;
        final SubLObject var22 = Packages.intern(PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic9$, var18), (SubLObject)module0112.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)module0112.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic11$, var22, (SubLObject)ConsesLow.list(var21), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic12$, var19, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic13$, var21), ConsesLow.append(var20, (SubLObject)module0112.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var18), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var22)));
    }
    
    public static SubLObject f7714(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0112.NIL;
        SubLObject var19 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0112.$ic7$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0112.$ic7$);
        var19 = var17.first();
        final SubLObject var20;
        var17 = (var20 = var17.rest());
        final SubLObject var21 = (SubLObject)module0112.$ic16$;
        final SubLObject var22 = Packages.intern(PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic17$, var18), (SubLObject)module0112.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)module0112.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic11$, var22, (SubLObject)ConsesLow.list(var21), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic12$, var19, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic13$, var21), ConsesLow.append(var20, (SubLObject)module0112.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var18), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var22)));
    }
    
    public static SubLObject f7715(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic22$, ConsesLow.append(var18, (SubLObject)module0112.NIL));
    }
    
    public static SubLObject f7690(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0112.NIL;
        final SubLObject var24 = Eval.$evaluator_method$.currentBinding(var22);
        try {
            Eval.$evaluator_method$.bind(module0112.$g1417$.getGlobalValue(), var22);
            var23 = Functions.funcall(module0112.$g1417$.getGlobalValue(), var21);
        }
        finally {
            Eval.$evaluator_method$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f7716(final SubLObject var29, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0112.NIL;
        final SubLObject var33 = Eval.$evaluator_method$.currentBinding(var31);
        try {
            Eval.$evaluator_method$.bind(module0112.$g1417$.getGlobalValue(), var31);
            var32 = Functions.apply(var29, var30);
        }
        finally {
            Eval.$evaluator_method$.rebind(var33, var31);
        }
        return var32;
    }
    
    public static SubLObject f7717(final SubLObject var29, SubLObject var6, SubLObject var7, SubLObject var8, SubLObject var9) {
        final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(var6 != module0112.UNPROVIDED);
        final SubLObject var31 = (SubLObject)SubLObjectFactory.makeBoolean(var7 != module0112.UNPROVIDED);
        final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(var8 != module0112.UNPROVIDED);
        final SubLObject var33 = (SubLObject)SubLObjectFactory.makeBoolean(var9 != module0112.UNPROVIDED);
        if (var6 == module0112.UNPROVIDED) {
            var6 = (SubLObject)module0112.NIL;
        }
        if (var7 == module0112.UNPROVIDED) {
            var7 = (SubLObject)module0112.NIL;
        }
        if (var8 == module0112.UNPROVIDED) {
            var8 = (SubLObject)module0112.NIL;
        }
        if (var9 == module0112.UNPROVIDED) {
            var9 = (SubLObject)module0112.NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0112.NIL;
        final SubLObject var36 = Eval.$evaluator_method$.currentBinding(var34);
        try {
            Eval.$evaluator_method$.bind(module0112.$g1417$.getGlobalValue(), var34);
            if (module0112.NIL != var33) {
                var35 = Functions.funcall(var29, var6, var7, var8, var9);
            }
            else if (module0112.NIL != var32) {
                var35 = Functions.funcall(var29, var6, var7, var8);
            }
            else if (module0112.NIL != var31) {
                var35 = Functions.funcall(var29, var6, var7);
            }
            else if (module0112.NIL != var30) {
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
        return (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic23$, ConsesLow.append(var18, (SubLObject)module0112.NIL));
    }
    
    public static SubLObject f7719() {
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7689(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0112.NIL;
        final SubLObject var24 = module0112.$g1420$.currentBinding(var22);
        final SubLObject var25 = module0112.$g1421$.currentBinding(var22);
        final SubLObject var26 = module0112.$g1422$.currentBinding(var22);
        try {
            module0112.$g1420$.bind((SubLObject)module0112.MINUS_ONE_INTEGER, var22);
            module0112.$g1421$.bind((SubLObject)module0112.MINUS_ONE_INTEGER, var22);
            module0112.$g1422$.bind((SubLObject)module0112.NIL, var22);
            SubLObject var27 = (SubLObject)module0112.NIL;
            final SubLObject var28 = Sequences.length(module0112.$g1413$.getDynamicValue(var22));
            try {
                var22.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var28_42 = Errors.$error_handler$.currentBinding(var22);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0112.$ic26$, var22);
                    try {
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var21)));
                    }
                    catch (Throwable var29) {
                        Errors.handleThrowable(var29, (SubLObject)module0112.NIL);
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
            if (module0112.NIL != var27) {
                while (Sequences.length(module0112.$g1413$.getDynamicValue(var22)).numG(var28)) {
                    module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var22).rest(), var22);
                }
                Errors.error(var27);
            }
        }
        finally {
            module0112.$g1422$.rebind(var26, var22);
            module0112.$g1421$.rebind(var25, var22);
            module0112.$g1420$.rebind(var24, var22);
        }
        return module0004.values_list(var23);
    }
    
    public static SubLObject f7721(final SubLObject var11) {
        assert module0112.NIL != Types.symbolp(var11) : var11;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0112.NIL != f7722(var11) || module0112.NIL != f7723(var11) || module0112.NIL != module0012.f377(var11));
    }
    
    public static SubLObject f7722(final SubLObject var11) {
        assert module0112.NIL != Types.symbolp(var11) : var11;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0112.NIL != f7694(var11) || module0112.NIL != module0012.f380(var11) || module0112.NIL != module0002.f40(var11));
    }
    
    public static SubLObject f7723(final SubLObject var11) {
        assert module0112.NIL != Types.symbolp(var11) : var11;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0112.NIL != f7710(var11) || module0112.NIL != module0012.f381(var11));
    }
    
    public static SubLObject f7720(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0112.NIL;
        final SubLObject var24 = module0112.$g1420$.currentBinding(var22);
        try {
            module0112.$g1420$.bind(module0048.f_1X(module0112.$g1420$.getDynamicValue(var22)), var22);
            if (var21.isCons()) {
                SubLObject var25 = (SubLObject)module0112.NIL;
                SubLObject var26 = (SubLObject)module0112.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var21, (SubLObject)module0112.$ic44$);
                var25 = var21.first();
                final SubLObject var27 = var26 = var21.rest();
                if (!var25.isSymbol()) {
                    f7724((SubLObject)module0112.$ic45$, var25, (SubLObject)module0112.UNPROVIDED);
                }
                else if (module0112.NIL != module0012.f377(var25)) {
                    final SubLObject var28 = module0012.f378(var25);
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7725(var25, var28, var21)));
                }
                else if (module0112.NIL != f7710(var25)) {
                    final SubLObject var29 = f7711(var25);
                    final SubLObject var30 = f7726(var29, var21);
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var30)));
                }
                else if (module0112.NIL != f7694(var25)) {
                    final SubLObject var31 = f7708(var25);
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7727(var25, var31, f7728(var26))));
                }
                else if (module0112.NIL != module0012.f381(var25)) {
                    final SubLObject var28_50 = module0112.$g1422$.currentBinding(var22);
                    try {
                        module0112.$g1422$.bind((SubLObject)ConsesLow.cons(var25, module0112.$g1422$.getDynamicValue(var22)), var22);
                        final SubLObject var30 = f7729(var21);
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var30)));
                    }
                    finally {
                        module0112.$g1422$.rebind(var28_50, var22);
                    }
                }
                else if (module0112.NIL != module0012.f380(var25) || module0112.NIL != module0012.f411(var25)) {
                    if (module0112.NIL != module0035.f1997(var26)) {
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7730(var25, Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var26.first()))))));
                    }
                    else {
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7731(var25, f7728(var26))));
                    }
                }
                else if (var25.isFunctionSpec() && !var25.isMacroOperator() && (module0112.NIL != module0002.f39(var25) || module0112.NIL != module0002.f52(var25, module0112.$g1422$.getDynamicValue(var22)))) {
                    var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7731(var25, f7728(var26))));
                }
                else if (var25.isMacroOperator() && (module0112.NIL != module0002.f39(var25) || module0112.NIL != module0002.f52(var25, module0112.$g1422$.getDynamicValue(var22)))) {
                    final SubLObject var28_51 = module0112.$g1422$.currentBinding(var22);
                    try {
                        module0112.$g1422$.bind((SubLObject)ConsesLow.cons(var25, module0112.$g1422$.getDynamicValue(var22)), var22);
                        final SubLObject var30 = f7729(var21);
                        var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var30)));
                    }
                    finally {
                        module0112.$g1422$.rebind(var28_51, var22);
                    }
                }
                else {
                    f7724((SubLObject)module0112.$ic46$, var25, (SubLObject)module0112.UNPROVIDED);
                }
            }
            else if (!var21.isSymbol()) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7732(var21)));
            }
            else if (module0112.NIL != Eval.constantp(var21, (SubLObject)module0112.UNPROVIDED)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7732(var21)));
            }
            else if (module0112.NIL != f7703(var21)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7733(var21)));
            }
            else if (module0112.NIL != f7734(var21)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7735(var21)));
            }
            else if (module0112.NIL != f7704(var21) || module0112.NIL != f7702(var21)) {
                var23 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7736(var21)));
            }
            else {
                f7724((SubLObject)module0112.$ic47$, var21, (SubLObject)module0112.UNPROVIDED);
            }
        }
        finally {
            module0112.$g1420$.rebind(var24, var22);
        }
        return module0004.values_list(var23);
    }
    
    public static SubLObject f7728(final SubLObject var4) {
        final SubLObject var5 = (SubLObject)ConsesLow.make_list(Sequences.length(var4), (SubLObject)module0112.UNPROVIDED);
        SubLObject var6;
        SubLObject var7;
        for (var6 = (SubLObject)module0112.NIL, var7 = (SubLObject)module0112.NIL, var6 = var4, var7 = var5; module0112.NIL != var6; var6 = var6.rest(), var7 = var7.rest()) {
            ConsesLow.rplaca(var7, f7720(var6.first()));
        }
        return var5;
    }
    
    public static SubLObject f7724(SubLObject var55, SubLObject var6, SubLObject var7) {
        if (var55 == module0112.UNPROVIDED) {
            var55 = (SubLObject)module0112.$ic48$;
        }
        if (var6 == module0112.UNPROVIDED) {
            var6 = (SubLObject)module0112.NIL;
        }
        if (var7 == module0112.UNPROVIDED) {
            var7 = (SubLObject)module0112.NIL;
        }
        return Errors.error(var55, var6, var7);
    }
    
    public static SubLObject f7732(final SubLObject var5) {
        return var5;
    }
    
    public static SubLObject f7736(final SubLObject var56) {
        if (module0112.NIL != Symbols.boundp(var56)) {
            return Symbols.symbol_value(var56);
        }
        if (module0112.NIL != Symbols.fboundp(var56)) {
            return Symbols.symbol_function(var56);
        }
        f7724((SubLObject)module0112.$ic49$, var56, (SubLObject)module0112.UNPROVIDED);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7733(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        return conses_high.assoc(var56, module0112.$g1413$.getDynamicValue(var57), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED).rest();
    }
    
    public static SubLObject f7731(final SubLObject var11, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0112.NIL;
        SubLObject var60 = (SubLObject)module0112.NIL;
        SubLObject var61 = (SubLObject)module0112.NIL;
        SubLObject var62 = (SubLObject)module0112.NIL;
        SubLObject var63 = (SubLObject)module0112.NIL;
        SubLObject var64 = (SubLObject)module0112.NIL;
        SubLObject var65 = (SubLObject)module0112.NIL;
        final SubLObject var66 = module0112.$g1421$.currentBinding(var58);
        try {
            module0112.$g1421$.bind(module0048.f_1X(module0112.$g1421$.getDynamicValue(var58)), var58);
            if (module0112.NIL != f7737(var11)) {
                f7738(var11, var57);
            }
            SubLObject var67 = module0112.$g1413$.getDynamicValue(var58);
            SubLObject var68 = (SubLObject)module0112.NIL;
            var68 = var67.first();
            while (module0112.NIL != var67) {
                var63 = var68.first();
                var61 = (SubLObject)ConsesLow.cons(var63, var61);
                var64 = var68.rest();
                var62 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var64)), var62);
                var67 = var67.rest();
                var68 = var67.first();
            }
            var67 = var57;
            SubLObject var69 = (SubLObject)module0112.NIL;
            var69 = var67.first();
            while (module0112.NIL != var67) {
                var65 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var69), var65);
                var67 = var67.rest();
                var69 = var67.first();
            }
            var65 = Sequences.nreverse(var65);
            var60 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic50$, (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic21$, var62, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic51$, (SubLObject)module0112.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic53$, reader.bq_cons(var11, ConsesLow.append(var65, (SubLObject)module0112.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var61)), (SubLObject)module0112.$ic50$));
            var59 = f7690(var60);
            if (module0112.NIL != f7737(var11)) {
                f7739(var59);
            }
        }
        finally {
            module0112.$g1421$.rebind(var66, var58);
        }
        return module0004.values_list(var59);
    }
    
    public static SubLObject f7730(final SubLObject var11, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)module0112.NIL;
        SubLObject var71 = (SubLObject)module0112.NIL;
        SubLObject var72 = (SubLObject)module0112.NIL;
        SubLObject var73 = (SubLObject)module0112.NIL;
        SubLObject var74 = (SubLObject)module0112.NIL;
        SubLObject var75 = (SubLObject)module0112.NIL;
        SubLObject var76 = (SubLObject)module0112.NIL;
        final SubLObject var77 = module0112.$g1421$.currentBinding(var69);
        try {
            module0112.$g1421$.bind(module0048.f_1X(module0112.$g1421$.getDynamicValue(var69)), var69);
            if (module0112.NIL != f7737(var11)) {
                f7738(var11, var68);
            }
            SubLObject var78 = module0112.$g1413$.getDynamicValue(var69);
            SubLObject var79 = (SubLObject)module0112.NIL;
            var79 = var78.first();
            while (module0112.NIL != var78) {
                var74 = var79.first();
                var72 = (SubLObject)ConsesLow.cons(var74, var72);
                var75 = var79.rest();
                var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var74, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var75)), var73);
                var78 = var78.rest();
                var79 = var78.first();
            }
            var76 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic55$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var68));
            var71 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic50$, (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic21$, var73, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic51$, (SubLObject)module0112.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic53$, (SubLObject)ConsesLow.list(var11, var76))), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var72)), (SubLObject)module0112.$ic50$));
            var70 = f7690(var71);
            if (module0112.NIL != f7737(var11)) {
                f7739(var70);
            }
        }
        finally {
            module0112.$g1421$.rebind(var77, var69);
        }
        return module0004.values_list(var70);
    }
    
    public static SubLObject f7729(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0112.NIL;
        SubLObject var24 = (SubLObject)module0112.NIL;
        SubLObject var25 = (SubLObject)module0112.NIL;
        SubLObject var26 = (SubLObject)module0112.NIL;
        SubLObject var27 = (SubLObject)module0112.NIL;
        SubLObject var28 = (SubLObject)module0112.NIL;
        SubLObject var29 = module0112.$g1413$.getDynamicValue(var22);
        SubLObject var30 = (SubLObject)module0112.NIL;
        var30 = var29.first();
        while (module0112.NIL != var29) {
            var27 = var30.first();
            var26 = (SubLObject)ConsesLow.cons(var27, var26);
            var28 = var30.rest();
            var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var28)), var26);
            var29 = var29.rest();
            var30 = var29.first();
        }
        var25 = Sequences.nreverse(var25);
        var26 = Sequences.nreverse(var26);
        var23 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic56$, (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic21$, var25, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic51$, (SubLObject)module0112.$ic57$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic58$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var21))), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var25)), (SubLObject)module0112.$ic56$));
        var24 = f7690(var23);
        return var24;
    }
    
    public static SubLObject f7725(final SubLObject var11, final SubLObject var22, final SubLObject var21) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0112.NIL;
        final SubLObject var25 = module0112.$g1421$.currentBinding(var23);
        try {
            module0112.$g1421$.bind(module0112.$g1421$.getDynamicValue(var23), var23);
            if (module0112.NIL != f7737(var11)) {
                module0112.$g1421$.setDynamicValue(Numbers.add(module0112.$g1421$.getDynamicValue(var23), (SubLObject)module0112.ONE_INTEGER), var23);
                f7738(var21.first(), var21.rest());
            }
            var24 = Values.arg2(var23.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7717(var22, var21, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED)));
            if (module0112.NIL != f7737(var11)) {
                f7739(var24);
            }
        }
        finally {
            module0112.$g1421$.rebind(var25, var23);
        }
        return module0004.values_list(var24);
    }
    
    public static SubLObject f7740(final SubLObject var11, final SubLObject var22, final SubLObject var21) {
        SubLObject var23 = (SubLObject)module0112.NIL;
        var23 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7717(var22, var21, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED)));
        return module0004.values_list(var23);
    }
    
    public static SubLObject f7727(final SubLObject var11, final SubLObject var49, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0112.NIL;
        final SubLObject var60 = Sequences.length(module0112.$g1413$.getDynamicValue(var58));
        final SubLObject var61 = module0112.$g1421$.currentBinding(var58);
        try {
            module0112.$g1421$.bind(module0112.$g1421$.getDynamicValue(var58), var58);
            if (module0112.NIL != f7737(var11)) {
                module0112.$g1421$.setDynamicValue(Numbers.add(module0112.$g1421$.getDynamicValue(var58), (SubLObject)module0112.ONE_INTEGER), var58);
                f7738(var11, var57);
            }
            try {
                var58.throwStack.push(module0112.$ic59$);
                var59 = Values.arg2(var58.resetMultipleValues(), (SubLObject)Values.multiple_value_list(var49.isCons() ? f7741(var49, var57) : f7716(var49, var57)));
            }
            catch (Throwable var62) {
                var59 = Errors.handleThrowable(var62, (SubLObject)module0112.$ic59$);
            }
            finally {
                var58.throwStack.pop();
            }
            if (module0112.NIL != f7737(var11)) {
                f7739(var59);
            }
            while (Sequences.length(module0112.$g1413$.getDynamicValue(var58)).numG(var60)) {
                module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var58).rest(), var58);
            }
        }
        finally {
            module0112.$g1421$.rebind(var61, var58);
        }
        return module0004.values_list(var59);
    }
    
    public static SubLObject f7741(final SubLObject var69, final SubLObject var57) {
        SubLObject var70 = (SubLObject)module0112.NIL;
        final SubLObject var71 = conses_high.second(var69);
        final SubLObject var72 = var69.rest().rest();
        SubLObject var73 = (SubLObject)module0112.NIL;
        var73 = Eval.macroexpand_1((SubLObject)ConsesLow.listS((SubLObject)module0112.$ic12$, var71, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var57), ConsesLow.append(var72, (SubLObject)module0112.NIL)), (SubLObject)module0112.UNPROVIDED);
        var70 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var73)));
        return module0004.values_list(var70);
    }
    
    public static SubLObject f7726(final SubLObject var47, final SubLObject var21) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0112.NIL;
        final SubLObject var50 = Sequences.length(module0112.$g1413$.getDynamicValue(var48));
        try {
            var48.throwStack.push(module0112.$ic59$);
            var49 = Values.arg2(var48.resetMultipleValues(), (SubLObject)Values.multiple_value_list(var47.isCons() ? f7741(var47, (SubLObject)ConsesLow.list(var21)) : f7717(var47, var21, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED)));
        }
        catch (Throwable var51) {
            var49 = Errors.handleThrowable(var51, (SubLObject)module0112.$ic59$);
        }
        finally {
            var48.throwStack.pop();
        }
        while (Sequences.length(module0112.$g1413$.getDynamicValue(var48)).numG(var50)) {
            module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var48).rest(), var48);
        }
        return module0004.values_list(var49);
    }
    
    public static SubLObject f7742(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.list((SubLObject)module0112.$ic60$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var18));
    }
    
    public static SubLObject f7743(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0112.NIL;
        SubLObject var23 = (SubLObject)module0112.NIL;
        SubLObject var24 = (SubLObject)module0112.NIL;
        SubLObject var25 = (SubLObject)module0112.NIL;
        SubLObject var26 = (SubLObject)module0112.NIL;
        SubLObject var27 = (SubLObject)module0112.NIL;
        SubLObject var28 = module0112.$g1413$.getDynamicValue(var21);
        SubLObject var29 = (SubLObject)module0112.NIL;
        var29 = var28.first();
        while (module0112.NIL != var28) {
            var26 = var29.first();
            var24 = (SubLObject)ConsesLow.cons(var26, var24);
            var27 = var29.rest();
            var25 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var27)), var25);
            var28 = var28.rest();
            var29 = var28.first();
        }
        var24 = Sequences.nreverse(var24);
        var25 = Sequences.nreverse(var25);
        var23 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic61$, (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic21$, var25, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic51$, (SubLObject)module0112.$ic62$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic53$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var20)))), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var24)), (SubLObject)module0112.$ic61$));
        f7744((SubLObject)module0112.$ic64$, var23, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        var22 = f7690(var23);
        return module0004.values_list(var22);
    }
    
    public static SubLObject f7745(final SubLObject var60) {
        SubLObject var61 = var60;
        SubLObject var62 = (SubLObject)module0112.NIL;
        var62 = var61.first();
        while (module0112.NIL != var61) {
            if (module0112.NIL != Symbols.boundp(var62)) {
                final SubLObject var63 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, Symbols.symbol_value(var62));
                f7746(var62, var63, (SubLObject)module0112.UNPROVIDED);
            }
            var61 = var61.rest();
            var62 = var61.first();
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7747(final SubLObject var21, SubLObject var75) {
        if (var75 == module0112.UNPROVIDED) {
            var75 = (SubLObject)module0112.NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)module0112.NIL;
        final SubLObject var78 = module0112.$g1424$.currentBinding(var76);
        final SubLObject var79 = module0112.$g1425$.currentBinding(var76);
        final SubLObject var80 = module0112.$g1423$.currentBinding(var76);
        try {
            module0112.$g1424$.bind((SubLObject)module0112.NIL, var76);
            module0112.$g1425$.bind((SubLObject)module0112.NIL, var76);
            module0112.$g1423$.bind(var75, var76);
            var77 = module0035.f2269(f7748(var21), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        }
        finally {
            module0112.$g1423$.rebind(var80, var76);
            module0112.$g1425$.rebind(var79, var76);
            module0112.$g1424$.rebind(var78, var76);
        }
        return var77;
    }
    
    public static SubLObject f7749(final SubLObject var19) {
        SubLObject var20 = (SubLObject)module0112.NIL;
        SubLObject var21 = var19;
        SubLObject var22 = (SubLObject)module0112.NIL;
        var22 = var21.first();
        while (module0112.NIL != var21) {
            var20 = ConsesLow.nconc(var20, f7748(var22));
            var21 = var21.rest();
            var22 = var21.first();
        }
        return var20;
    }
    
    public static SubLObject f7748(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0112.NIL;
        if (var21.isCons()) {
            SubLObject var24 = (SubLObject)module0112.NIL;
            SubLObject var25 = (SubLObject)module0112.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var21, (SubLObject)module0112.$ic44$);
            var24 = var21.first();
            final SubLObject var26 = var25 = var21.rest();
            if (!var24.isSymbol()) {
                if (module0112.NIL != module0112.$g1423$.getDynamicValue(var22)) {
                    Errors.warn((SubLObject)module0112.$ic45$, var24);
                }
                var23 = (SubLObject)ConsesLow.cons(var24, var23);
            }
            else if (module0112.NIL != module0012.f377(var24)) {
                final SubLObject var27 = f7706(var24);
                if (module0112.NIL != var27) {
                    var23 = ConsesLow.nconc(var23, f7725(var24, var27, var21));
                }
                else {
                    var23 = (SubLObject)ConsesLow.cons(var24, var23);
                    if (module0112.NIL != module0112.$g1423$.getDynamicValue(var22)) {
                        Errors.warn((SubLObject)module0112.$ic66$, var24);
                    }
                }
            }
            else if (module0112.NIL != f7710(var24)) {
                final SubLObject var28 = f7711(var24);
                final SubLObject var29 = f7726(var28, var21);
                var23 = ConsesLow.nconc(var23, f7748(var29));
            }
            else if (module0112.NIL != f7694(var24)) {
                final SubLObject var30 = f7708(var24);
                var23 = ConsesLow.nconc(var23, f7748(var25));
            }
            else if (module0112.NIL != module0012.f381(var24)) {
                final SubLObject var31 = module0112.$g1426$.currentBinding(var22);
                try {
                    module0112.$g1426$.bind((SubLObject)ConsesLow.cons(var24, module0112.$g1426$.getDynamicValue(var22)), var22);
                    final SubLObject var29 = f7729(var21);
                    var23 = ConsesLow.nconc(var23, f7748(var29));
                }
                finally {
                    module0112.$g1426$.rebind(var31, var22);
                }
            }
            else if (module0112.NIL != module0012.f380(var24) || module0112.NIL != module0012.f411(var24)) {
                if (module0112.NIL != module0035.f1997(var25)) {
                    var23 = ConsesLow.nconc(var23, f7748(var25.first()));
                }
                else {
                    var23 = ConsesLow.nconc(var23, f7749(var25));
                }
            }
            else if (var24.isFunctionSpec() && !var24.isMacroOperator() && (module0112.NIL != module0002.f52(var24, module0112.$g1426$.getDynamicValue(var22)) || module0112.NIL != module0002.f39(var24))) {
                var23 = ConsesLow.nconc(var23, f7749(var25));
            }
            else if (var24.isMacroOperator() && (module0112.NIL != module0002.f39(var24) || module0112.NIL != module0002.f52(var24, module0112.$g1426$.getDynamicValue(var22)))) {
                final SubLObject var31 = module0112.$g1426$.currentBinding(var22);
                try {
                    module0112.$g1426$.bind((SubLObject)ConsesLow.cons(var24, module0112.$g1426$.getDynamicValue(var22)), var22);
                    final SubLObject var29 = f7729(var21);
                    var23 = ConsesLow.nconc(var23, f7748(var29));
                }
                finally {
                    module0112.$g1426$.rebind(var31, var22);
                }
            }
            else if (module0112.NIL == module0004.f104(var24, module0112.$g1425$.getDynamicValue(var22), Symbols.symbol_function((SubLObject)module0112.EQL), (SubLObject)module0112.UNPROVIDED)) {
                if (module0112.NIL != module0112.$g1423$.getDynamicValue(var22)) {
                    Errors.warn((SubLObject)module0112.$ic46$, var24);
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
        SubLObject var58 = (SubLObject)module0112.NIL;
        if (var56.isSymbol()) {
            if (module0112.NIL == Eval.constantp(var56, (SubLObject)module0112.UNPROVIDED)) {
                if (module0112.NIL == f7703(var56)) {
                    if (module0112.NIL == f7734(var56)) {
                        if (module0112.NIL == f7704(var56)) {
                            if (module0112.NIL == f7702(var56)) {
                                if (module0112.NIL == module0004.f104(var56, module0112.$g1424$.getDynamicValue(var57), Symbols.symbol_function((SubLObject)module0112.EQL), (SubLObject)module0112.UNPROVIDED)) {
                                    if (module0112.NIL != module0112.$g1423$.getDynamicValue(var57)) {
                                        Errors.warn((SubLObject)module0112.$ic47$, var56);
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
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            SubLObject var82 = (SubLObject)module0112.NIL;
            var82 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var81)));
            return Dynamic.sublisp_throw((SubLObject)module0112.$ic59$, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic68$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7752(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic68$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic68$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7753(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic72$, var82, ConsesLow.append(var83, (SubLObject)module0112.NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7754(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7756(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic72$, var82, ConsesLow.append(var83, (SubLObject)module0112.NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7757(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7758(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic72$, var82, ConsesLow.append(var83, (SubLObject)module0112.NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7759(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7760(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var84 = (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic72$, var82, ConsesLow.append(var83, (SubLObject)module0112.NIL));
        f7709(var81, var84);
        return var81;
    }
    
    public static SubLObject f7761(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7762(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var21_103 = (SubLObject)module0112.$ic84$;
        final SubLObject var84 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic72$, (SubLObject)ConsesLow.list(var21_103), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic12$, var82, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic13$, var21_103), ConsesLow.append(var83, (SubLObject)module0112.NIL)));
        f7712(var81, var84);
        return var81;
    }
    
    public static SubLObject f7763(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7764(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var21_108 = (SubLObject)module0112.$ic88$;
        final SubLObject var84 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic72$, (SubLObject)ConsesLow.list(var21_108), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic12$, var82, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic13$, var21_108), ConsesLow.append(var83, (SubLObject)module0112.NIL)));
        f7712(var81, var84);
        return var81;
    }
    
    public static SubLObject f7765(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7766(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic7$);
        var82 = var80.first();
        SubLObject var83;
        var80 = (var83 = var80.rest());
        if (var83.first().isString()) {
            var83 = var83.rest();
        }
        final SubLObject var21_113 = (SubLObject)module0112.$ic92$;
        final SubLObject var84 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic72$, (SubLObject)ConsesLow.list(var21_113), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic12$, var82, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic13$, var21_113), ConsesLow.append(var83, (SubLObject)module0112.NIL)));
        f7712(var81, var84);
        return var81;
    }
    
    public static SubLObject f7767(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic7$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return f7755(var85, var86, var87);
    }
    
    public static SubLObject f7755(final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0112.NIL;
        final SubLObject var23 = module0112.$g1424$.currentBinding(var21);
        try {
            module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var21), var21);
            module0112.$g1425$.setDynamicValue((SubLObject)ConsesLow.cons(var18, module0112.$g1425$.getDynamicValue(var21)), var21);
            SubLObject var24 = var19;
            SubLObject var25 = (SubLObject)module0112.NIL;
            var25 = var24.first();
            while (module0112.NIL != var24) {
                if (var25.isSymbol()) {
                    module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var25, module0112.$g1424$.getDynamicValue(var21)), var21);
                }
                else if (var25.isCons()) {
                    module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var25.first(), module0112.$g1424$.getDynamicValue(var21)), var21);
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
            var22 = ConsesLow.nconc(var22, f7749(var20));
        }
        finally {
            module0112.$g1424$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f7768(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic96$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic96$);
        var82 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            final SubLObject var83;
            var80 = (var83 = var81);
            return f7769(var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic96$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7770(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic99$);
        final SubLObject var85 = var84.rest();
        var84 = var84.first();
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic99$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        var84 = var85;
        if (module0112.NIL == var84) {
            return (SubLObject)module0112.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic99$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7769(final SubLObject var18, final SubLObject var120) {
        return f7720((SubLObject)ConsesLow.listS((SubLObject)module0112.$ic101$, (SubLObject)ConsesLow.list(var18), ConsesLow.append(var120, (SubLObject)module0112.NIL)));
    }
    
    public static SubLObject f7771(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic102$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7689(f7689(var81));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic102$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7772(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic102$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7750(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic102$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7773(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic106$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic106$);
        var82 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7774(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic106$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7775(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic106$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic106$);
        var87 = var85.first();
        var85 = var85.rest();
        if (module0112.NIL == var85) {
            module0112.$g1425$.setDynamicValue((SubLObject)ConsesLow.cons(var86, module0112.$g1425$.getDynamicValue(var83)), var83);
            return f7748(var87);
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0112.$ic106$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7776(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic106$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic106$);
        var82 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7774(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic106$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7777(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic106$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic106$);
        var87 = var85.first();
        var85 = var85.rest();
        if (module0112.NIL == var85) {
            module0112.$g1425$.setDynamicValue((SubLObject)ConsesLow.cons(var86, module0112.$g1425$.getDynamicValue(var83)), var83);
            return f7748(var87);
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0112.$ic106$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7774(final SubLObject var56, final SubLObject var130) {
        if (module0112.NIL == f7734(var56)) {
            f7778(var56, var130);
        }
        return var56;
    }
    
    public static SubLObject f7734(final SubLObject var10) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0112.NIL != module0067.f4852(module0112.$g1427$.getGlobalValue()) && module0112.NIL != module0084.f5808(module0112.$g1427$.getGlobalValue(), var10));
    }
    
    public static SubLObject f7779() {
        if (module0112.NIL != module0112.$g1427$.getGlobalValue()) {
            module0067.f4881(module0112.$g1427$.getGlobalValue());
        }
        else {
            module0112.$g1427$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0112.EQUAL), (SubLObject)module0112.UNPROVIDED));
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7778(final SubLObject var10, final SubLObject var130) {
        if (module0112.NIL == module0112.$g1427$.getGlobalValue()) {
            module0112.$g1427$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0112.EQUAL), (SubLObject)module0112.UNPROVIDED));
        }
        module0067.f4886(module0112.$g1427$.getGlobalValue(), var10, var130);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7735(final SubLObject var10) {
        if (module0112.NIL == module0112.$g1427$.getGlobalValue()) {
            module0112.$g1427$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0112.EQUAL), (SubLObject)module0112.UNPROVIDED));
        }
        return module0067.f4884(module0112.$g1427$.getGlobalValue(), var10, (SubLObject)module0112.UNPROVIDED);
    }
    
    public static SubLObject f7780(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic106$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic106$);
        var82 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7746(f7689(var81), var82, (SubLObject)module0112.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic106$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7781(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic106$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic106$);
        var86 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7750(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic106$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7782(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic125$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic125$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7746(var81, var82, var83);
    }
    
    public static SubLObject f7783(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic125$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic125$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return ConsesLow.nconc(f7750(var85), f7748(var86), f7749(var87));
    }
    
    public static SubLObject f7746(final SubLObject var10, final SubLObject var130, SubLObject var143) {
        if (var143 == module0112.UNPROVIDED) {
            var143 = (SubLObject)module0112.NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = f7720(var130);
        if (!var10.isSymbol()) {
            f7724((SubLObject)module0112.$ic128$, var10, (SubLObject)module0112.UNPROVIDED);
        }
        else {
            if (module0112.NIL != f7704(var10)) {
                Symbols.set(var10, var145);
                return var145;
            }
            if (module0112.NIL == f7703(var10)) {
                if (module0112.NIL != f7734(var10)) {
                    f7778(var10, var145);
                    return var145;
                }
                if (module0112.$g1420$.getDynamicValue(var144).eql((SubLObject)module0112.ZERO_INTEGER)) {
                    module0112.$g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var10), module0112.$g1413$.getDynamicValue(var144)), var144);
                }
                else {
                    f7724((SubLObject)module0112.$ic129$, var10, (SubLObject)module0112.UNPROVIDED);
                }
            }
        }
        ConsesLow.rplacd(conses_high.assoc(var10, module0112.$g1413$.getDynamicValue(var144), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED), var145);
        if (module0112.NIL != var143) {
            var145 = f7746(var143.first(), conses_high.second(var143), conses_high.cddr(var143));
        }
        return var145;
    }
    
    public static SubLObject f7784(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic130$);
        var82 = var81.first();
        var81 = var81.rest();
        final SubLObject var83 = (SubLObject)(var81.isCons() ? var81.first() : module0112.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var81, var80, (SubLObject)module0112.$ic130$);
        var81 = var81.rest();
        if (module0112.NIL == var81) {
            if (module0112.NIL == f7703(var82)) {
                f7724((SubLObject)module0112.$ic131$, var82, (SubLObject)module0112.UNPROVIDED);
            }
            final SubLObject var84 = f7733(var82);
            final SubLObject var85 = Numbers.add(var84, var83);
            ConsesLow.rplacd(conses_high.assoc(var82, module0112.$g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED), var85);
            return var82;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.$ic130$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7785(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic130$);
        var85 = var84.first();
        var84 = var84.rest();
        final SubLObject var86 = (SubLObject)(var84.isCons() ? var84.first() : module0112.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var84, var83, (SubLObject)module0112.$ic130$);
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic130$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7786(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic130$);
        var82 = var81.first();
        var81 = var81.rest();
        final SubLObject var83 = (SubLObject)(var81.isCons() ? var81.first() : module0112.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var81, var80, (SubLObject)module0112.$ic130$);
        var81 = var81.rest();
        if (module0112.NIL == var81) {
            if (module0112.NIL == f7703(var82)) {
                f7724((SubLObject)module0112.$ic131$, var82, (SubLObject)module0112.UNPROVIDED);
            }
            final SubLObject var84 = f7733(var82);
            final SubLObject var85 = Numbers.subtract(var84, var83);
            ConsesLow.rplacd(conses_high.assoc(var82, module0112.$g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED), var85);
            return var82;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.$ic130$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7787(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic130$);
        var85 = var84.first();
        var84 = var84.rest();
        final SubLObject var86 = (SubLObject)(var84.isCons() ? var84.first() : module0112.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var84, var83, (SubLObject)module0112.$ic130$);
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic130$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7788(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic138$);
        var82 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic138$);
        var83 = var81.first();
        var81 = var81.rest();
        if (module0112.NIL == var81) {
            if (module0112.NIL == f7703(var83)) {
                f7724((SubLObject)module0112.$ic131$, var83, (SubLObject)module0112.UNPROVIDED);
            }
            final SubLObject var84 = f7733(var83);
            final SubLObject var85 = f7720(var82);
            final SubLObject var86 = ConsesLow.append((SubLObject)ConsesLow.list(var85), var84);
            ConsesLow.rplacd(conses_high.assoc(var83, module0112.$g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED), var86);
            return var83;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.$ic138$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7789(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic138$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic138$);
        var86 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic138$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7790(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic142$);
        var82 = var81.first();
        var81 = var81.rest();
        if (module0112.NIL == var81) {
            if (module0112.NIL == Errors.$ignore_mustsP$.getDynamicValue(var79) && module0112.NIL == f7703(var82)) {
                Errors.error((SubLObject)module0112.$ic131$, var82);
            }
            final SubLObject var83 = f7733(var82);
            final SubLObject var84 = var83.rest();
            ConsesLow.rplacd(conses_high.assoc(var82, module0112.$g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED), var84);
            return var84;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.$ic142$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7791(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic142$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic142$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7792(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var21_172 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic146$);
        var21_172 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7689(f7689(var21_172));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic146$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7793(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var21_175 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic146$);
        var21_175 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var21_175);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic146$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7794(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var21_178 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic146$);
        var21_178 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7720(f7720(var21_178));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic146$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7795(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var21_181 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic146$);
        var21_181 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var21_181);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic146$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7796(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var21_184 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic146$);
        var21_184 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7720(f7720(var21_184));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic146$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7797(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var21_187 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic146$);
        var21_187 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var21_187);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic146$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7798(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic156$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic156$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7799(var81, var82, var83);
    }
    
    public static SubLObject f7800(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic156$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic156$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7748(var86), f7749(var87));
    }
    
    public static SubLObject f7799(final SubLObject var29, final SubLObject var190, final SubLObject var30) {
        final SubLObject var191 = f7720(var29);
        if (module0112.NIL != f7801(var191)) {
            final SubLObject var192 = f7720(var190);
            final SubLObject var193 = f7728(var30);
            final SubLObject var194 = (SubLObject)ConsesLow.listS(var191, var192, var193);
            return f7716(Symbols.symbol_function((SubLObject)module0112.$ic157$), var194);
        }
        if (module0112.NIL != f7802(var191)) {
            final SubLObject var192 = f7720(var190);
            final SubLObject var193 = f7728(var30);
            SubLObject var195 = (SubLObject)module0112.NIL;
            if (module0112.NIL != var193) {
                var195 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var192), var195);
                SubLObject var196 = var193;
                SubLObject var197 = (SubLObject)module0112.NIL;
                var197 = var196.first();
                while (module0112.NIL != var196) {
                    var195 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var197), var195);
                    var196 = var196.rest();
                    var197 = var196.first();
                }
            }
            else {
                SubLObject var196 = var192;
                SubLObject var197 = (SubLObject)module0112.NIL;
                var197 = var196.first();
                while (module0112.NIL != var196) {
                    var195 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var197), var195);
                    var196 = var196.rest();
                    var197 = var196.first();
                }
            }
            var195 = Sequences.nreverse(var195);
            return f7720(reader.bq_cons(var191.first(), ConsesLow.append(var195, (SubLObject)module0112.NIL)));
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7802(final SubLObject var21) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var21.isCons() && var21.first().isSymbol() && module0112.NIL != f7803(var21.first()) && conses_high.second(var21).isCons() && conses_high.second(var21).first() == module0112.$ic72$);
    }
    
    public static SubLObject f7803(final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0112.NIL;
        SubLObject var31 = (SubLObject)module0112.NIL;
        SubLObject var32 = (SubLObject)module0112.NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(module0112.$g1415$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                if (var29.eql(var31)) {
                    var30 = (SubLObject)module0112.T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var30;
    }
    
    public static SubLObject f7801(final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0112.NIL;
        SubLObject var31 = (SubLObject)module0112.NIL;
        SubLObject var32 = (SubLObject)module0112.NIL;
        final Iterator var33 = Hashtables.getEntrySetIterator(module0012.$g40$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var33)) {
                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                var31 = Hashtables.getEntryKey(var34);
                var32 = Hashtables.getEntryValue(var34);
                if (module0112.NIL != Symbols.fboundp(var31) && var29.eql(Symbols.symbol_function(var31))) {
                    var30 = (SubLObject)module0112.T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var33);
        }
        return var30;
    }
    
    public static SubLObject f7804(final SubLObject var29) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0112.NIL != f7801(var29) || module0112.NIL != f7803(var29) || module0112.NIL != f7802(var29) || module0112.NIL != module0002.f40(var29));
    }
    
    public static SubLObject f7805(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic160$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0112.NIL != f7803(var81) || module0112.NIL != f7801(var81));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic160$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7806(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic160$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic160$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7807(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic164$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7799(var81, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var82), (SubLObject)module0112.NIL);
    }
    
    public static SubLObject f7808(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic164$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7809(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var81)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic68$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7810(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic68$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic68$);
        return (SubLObject)module0112.NIL;
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
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7812(final SubLObject var215) {
        final SubLThread var216 = SubLProcess.currentSubLThread();
        if (module0112.NIL == var215) {
            return module0112.$g1418$.getDynamicValue(var216);
        }
        SubLObject var217 = var215;
        SubLObject var218 = (SubLObject)module0112.NIL;
        var218 = var217.first();
        while (module0112.NIL != var217) {
            final SubLObject var219 = var218;
            if (module0112.NIL == conses_high.member(var219, module0112.$g1418$.getDynamicValue(var216), Symbols.symbol_function((SubLObject)module0112.EQL), Symbols.symbol_function((SubLObject)module0112.IDENTITY))) {
                module0112.$g1418$.setDynamicValue((SubLObject)ConsesLow.cons(var219, module0112.$g1418$.getDynamicValue(var216)), var216);
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
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7815(final SubLObject var215) {
        final SubLThread var216 = SubLProcess.currentSubLThread();
        if (module0112.NIL != var215) {
            SubLObject var217 = var215;
            SubLObject var218 = (SubLObject)module0112.NIL;
            var218 = var217.first();
            while (module0112.NIL != var217) {
                module0112.$g1418$.setDynamicValue(Sequences.remove(var218, module0112.$g1418$.getDynamicValue(var216), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED), var216);
                var217 = var217.rest();
                var218 = var217.first();
            }
        }
        else {
            module0112.$g1418$.setDynamicValue((SubLObject)module0112.NIL, var216);
        }
        return var215;
    }
    
    public static SubLObject f7737(final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        return module0004.f104(var218, module0112.$g1418$.getDynamicValue(var219), (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
    }
    
    public static SubLObject f7738(final SubLObject var218, final SubLObject var4) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        if (module0112.NIL == module0112.$g1419$.getDynamicValue(var219)) {
            module0112.$g1419$.setDynamicValue(PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic176$), var219);
        }
        final SubLObject var220 = Strings.make_string(Numbers.multiply((SubLObject)module0112.TWO_INTEGER, module0048.f_1X(module0112.$g1421$.getDynamicValue(var219))), (SubLObject)module0112.UNPROVIDED);
        final SubLObject var221 = (SubLObject)ConsesLow.cons(var218, var4);
        module0112.$g1419$.setDynamicValue(Sequences.cconcatenate(module0112.$g1419$.getDynamicValue(var219), PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic177$, new SubLObject[] { var220, module0112.$g1421$.getDynamicValue(var219), var221 })), var219);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7739(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = Strings.make_string(Numbers.multiply((SubLObject)module0112.TWO_INTEGER, module0048.f_1X(module0112.$g1421$.getDynamicValue(var59))), (SubLObject)module0112.UNPROVIDED);
        SubLObject var61 = (SubLObject)module0112.$ic178$;
        SubLObject var62 = var58;
        SubLObject var63 = (SubLObject)module0112.NIL;
        var63 = var62.first();
        while (module0112.NIL != var62) {
            var61 = Sequences.cconcatenate(var61, PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic179$, var63));
            var62 = var62.rest();
            var63 = var62.first();
        }
        module0112.$g1419$.setDynamicValue(Sequences.cconcatenate(module0112.$g1419$.getDynamicValue(var59), PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic180$, new SubLObject[] { var60, module0112.$g1421$.getDynamicValue(var59), var61 })), var59);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7817(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = var78.rest();
        if (module0112.NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.NIL);
        }
        SubLObject var81 = (SubLObject)module0112.NIL;
        var81 = ((module0112.NIL != module0112.$g1419$.getDynamicValue(var79)) ? module0112.$g1419$.getDynamicValue(var79) : PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic176$));
        f7818();
        return var81;
    }
    
    public static SubLObject f7819(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (module0112.NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.NIL);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7820(final SubLObject var78) {
        final SubLObject var79 = var78.rest();
        if (module0112.NIL != var79) {
            cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.NIL);
        }
        return f7818();
    }
    
    public static SubLObject f7821(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (module0112.NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.NIL);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7818() {
        module0112.$g1419$.setDynamicValue((SubLObject)module0112.NIL);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7822(final SubLObject var149) {
        assert module0112.NIL != Types.numberp(var149) : var149;
        return module0048.f_1X(var149);
    }
    
    public static SubLObject f7823(final SubLObject var149) {
        assert module0112.NIL != Types.numberp(var149) : var149;
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
        SubLObject var21 = (SubLObject)module0112.NIL;
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)module0112.NIL;
        var23 = var22.first();
        while (module0112.NIL != var22) {
            var21 = f7720(var23);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f7827(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic190$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7828(var81, var82);
    }
    
    public static SubLObject f7829(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic190$);
        var86 = var85.first();
        final SubLObject var87;
        var85 = (var87 = var85.rest());
        SubLObject var88 = (SubLObject)module0112.NIL;
        final SubLObject var89 = module0112.$g1424$.currentBinding(var83);
        try {
            module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var83), var83);
            SubLObject var90 = var86;
            SubLObject var91 = (SubLObject)module0112.NIL;
            var91 = var90.first();
            while (module0112.NIL != var90) {
                if (var91.isSymbol()) {
                    module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var91, module0112.$g1424$.getDynamicValue(var83)), var83);
                }
                else if (module0112.NIL != module0035.f1997(var91)) {
                    module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var91.first(), module0112.$g1424$.getDynamicValue(var83)), var83);
                }
                else if (module0112.NIL != module0035.f1998(var91)) {
                    var88 = ConsesLow.nconc(var88, f7748(conses_high.second(var91)));
                    module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var91.first(), module0112.$g1424$.getDynamicValue(var83)), var83);
                }
                else {
                    Errors.error((SubLObject)module0112.$ic192$);
                }
                var90 = var90.rest();
                var91 = var90.first();
            }
            var88 = ConsesLow.nconc(var88, f7749(var87));
        }
        finally {
            module0112.$g1424$.rebind(var89, var83);
        }
        return var88;
    }
    
    public static SubLObject f7828(final SubLObject var237, final SubLObject var20) {
        return f7830(var237, var20);
    }
    
    public static SubLObject f7744(SubLObject var240, SubLObject var241, SubLObject var242, SubLObject var243) {
        if (var240 == module0112.UNPROVIDED) {
            var240 = (SubLObject)module0112.NIL;
        }
        if (var241 == module0112.UNPROVIDED) {
            var241 = (SubLObject)module0112.NIL;
        }
        if (var242 == module0112.UNPROVIDED) {
            var242 = (SubLObject)module0112.NIL;
        }
        if (var243 == module0112.UNPROVIDED) {
            var243 = (SubLObject)module0112.NIL;
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7830(final SubLObject var237, final SubLObject var20) {
        final SubLThread var238 = SubLProcess.currentSubLThread();
        if (module0112.NIL == var237) {
            SubLObject var239 = (SubLObject)module0112.NIL;
            var239 = f7825(var20);
            return var239;
        }
        SubLObject var240 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var237, var237, (SubLObject)module0112.$ic194$);
        var240 = var237.first();
        final SubLObject var242;
        final SubLObject var241 = var242 = var237.rest();
        SubLObject var243 = (SubLObject)module0112.NIL;
        SubLObject var244 = (SubLObject)module0112.NIL;
        if (var240.isCons()) {
            var243 = var240.first();
            var244 = conses_high.second(var240);
        }
        else {
            var243 = var240;
            var244 = (SubLObject)module0112.NIL;
        }
        final SubLObject var245 = f7720(var244);
        SubLObject var246 = (SubLObject)module0112.NIL;
        module0112.$g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var243, var245), module0112.$g1413$.getDynamicValue(var238)), var238);
        var246 = f7830(var242, var20);
        module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var238).rest(), var238);
        return var246;
    }
    
    public static SubLObject f7831(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic195$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic195$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7832(var81, var82, var83);
    }
    
    public static SubLObject f7833(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic195$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic195$);
        var87 = var85.first();
        final SubLObject var88;
        var85 = (var88 = var85.rest());
        SubLObject var89 = (SubLObject)module0112.NIL;
        final SubLObject var90 = module0112.$g1424$.currentBinding(var83);
        try {
            module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var83), var83);
            SubLObject var91 = var86;
            SubLObject var92 = (SubLObject)module0112.NIL;
            var92 = var91.first();
            while (module0112.NIL != var91) {
                module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var92, module0112.$g1424$.getDynamicValue(var83)), var83);
                var91 = var91.rest();
                var92 = var91.first();
            }
            var89 = ConsesLow.nconc(f7748(var87), f7749(var88));
        }
        finally {
            module0112.$g1424$.rebind(var90, var83);
        }
        return var89;
    }
    
    public static SubLObject f7832(final SubLObject var252, final SubLObject var253, final SubLObject var20) {
        SubLObject var254 = (SubLObject)module0112.NIL;
        SubLObject var255 = (SubLObject)module0112.NIL;
        SubLObject var256 = (SubLObject)module0112.NIL;
        SubLObject var257 = (SubLObject)module0112.NIL;
        var254 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7720(var253)));
        SubLObject var258 = var252;
        SubLObject var259 = (SubLObject)module0112.NIL;
        var259 = var258.first();
        while (module0112.NIL != var258) {
            if (module0112.NIL != var254) {
                var255 = var254.first();
                var254 = var254.rest();
            }
            else {
                var255 = (SubLObject)module0112.NIL;
            }
            var256 = (SubLObject)ConsesLow.list(var259, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var255));
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
        SubLObject var82 = (SubLObject)module0112.T;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)module0112.NIL;
        var84 = var83.first();
        while (module0112.NIL != var83) {
            var82 = f7720(var84);
            if (module0112.NIL == var82) {
                return (SubLObject)module0112.NIL;
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        return (SubLObject)module0112.T;
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
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)module0112.NIL;
        var84 = var83.first();
        while (module0112.NIL != var83) {
            var82 = f7720(var84);
            if (module0112.NIL != var82) {
                return (SubLObject)module0112.T;
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        return (SubLObject)module0112.NIL;
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
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0112.NIL == f7720(var81));
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic68$);
        return (SubLObject)module0112.NIL;
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
        final SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)module0112.NIL;
        var84 = var83.first();
        while (module0112.NIL != var83) {
            SubLObject var275_276;
            final SubLObject var273_274 = var275_276 = var84;
            SubLObject var85 = (SubLObject)module0112.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var275_276, var273_274, (SubLObject)module0112.$ic208$);
            var85 = var275_276.first();
            final SubLObject var86;
            var275_276 = (var86 = var275_276.rest());
            if (module0112.NIL != f7720(var85)) {
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
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = var85;
        SubLObject var88 = (SubLObject)module0112.NIL;
        var88 = var87.first();
        while (module0112.NIL != var87) {
            SubLObject var282_283;
            final SubLObject var280_281 = var282_283 = var88;
            SubLObject var89 = (SubLObject)module0112.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var282_283, var280_281, (SubLObject)module0112.$ic208$);
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
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic212$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic212$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic212$);
        var83 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7843(var81, var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic212$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7844(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic212$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic212$);
        var86 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic212$);
        var87 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86), f7748(var87));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic212$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7843(final SubLObject var277, final SubLObject var286, final SubLObject var287) {
        if (module0112.NIL != f7720(var277)) {
            return f7720(var286);
        }
        return f7720(var287);
    }
    
    public static SubLObject f7845(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic212$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic212$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic212$);
        var83 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7843(var81, var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic212$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7846(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic212$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic212$);
        var86 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic212$);
        var87 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86), f7748(var87));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic212$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7847(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (module0112.NIL != f7720(var81)) {
            return f7825(var82);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7848(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7849(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic222$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic222$);
        var82 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic222$);
            return (SubLObject)module0112.NIL;
        }
        if (module0112.NIL != f7720(var81)) {
            return f7720(var82);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7850(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic222$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic222$);
        var86 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic222$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7851(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (module0112.NIL != f7720(var81)) {
            return f7825(var82);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7852(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7853(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (module0112.NIL != f7720(var81)) {
            return (SubLObject)module0112.NIL;
        }
        return f7825(var82);
    }
    
    public static SubLObject f7854(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7855(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        if (module0112.NIL != f7720(var81)) {
            return (SubLObject)module0112.NIL;
        }
        return f7825(var82);
    }
    
    public static SubLObject f7856(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7857(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        SubLObject var83 = (SubLObject)module0112.NIL;
        while (module0112.NIL != f7720(var81)) {
            var83 = f7825(var82);
        }
        return var83;
    }
    
    public static SubLObject f7858(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7859(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic208$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        SubLObject var83 = (SubLObject)module0112.NIL;
        while (module0112.NIL == f7720(var81)) {
            var83 = f7825(var82);
        }
        return var83;
    }
    
    public static SubLObject f7860(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic208$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7861(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic241$);
        var82 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic241$);
        var83 = var81.first();
        final SubLObject var84;
        var81 = (var84 = var81.rest());
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = var82;
        SubLObject var88 = (SubLObject)module0112.NIL;
        var88 = var87.first();
        while (module0112.NIL != var87) {
            if (!var88.isList() || !Sequences.length(var88).numE((SubLObject)module0112.THREE_INTEGER)) {
                f7724((SubLObject)module0112.$ic242$, var88, (SubLObject)module0112.UNPROVIDED);
            }
            module0112.$g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var88.first(), f7720(conses_high.second(var88))), module0112.$g1413$.getDynamicValue(var79)), var79);
            var87 = var87.rest();
            var88 = var87.first();
        }
        if (module0112.NIL == f7720(var83.first())) {
            f7825(var84);
            while (module0112.NIL == var85) {
                var87 = var82;
                var88 = (SubLObject)module0112.NIL;
                var88 = var87.first();
                while (module0112.NIL != var87) {
                    f7746(var88.first(), conses_high.third(var88), (SubLObject)module0112.UNPROVIDED);
                    var87 = var87.rest();
                    var88 = var87.first();
                }
                var85 = f7720(var83.first());
                if (module0112.NIL == var85) {
                    f7825(var84);
                }
            }
        }
        var86 = f7825(var83.rest());
        var87 = var82;
        var88 = (SubLObject)module0112.NIL;
        var88 = var87.first();
        while (module0112.NIL != var87) {
            module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var79).rest(), var79);
            var87 = var87.rest();
            var88 = var87.first();
        }
        return var86;
    }
    
    public static SubLObject f7862(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic241$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic241$);
        var87 = var85.first();
        final SubLObject var88;
        var85 = (var88 = var85.rest());
        SubLObject var89 = (SubLObject)module0112.NIL;
        final SubLObject var90 = module0112.$g1424$.currentBinding(var83);
        try {
            module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var83), var83);
            SubLObject var91 = var86;
            SubLObject var92 = (SubLObject)module0112.NIL;
            var92 = var91.first();
            while (module0112.NIL != var91) {
                if (var92.isList() && Sequences.length(var92).numE((SubLObject)module0112.THREE_INTEGER)) {
                    module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var92.first(), module0112.$g1424$.getDynamicValue(var83)), var83);
                    var89 = ConsesLow.nconc(var89, f7748(conses_high.second(var92)), f7748(conses_high.third(var92)));
                }
                var91 = var91.rest();
                var92 = var91.first();
            }
            var89 = ConsesLow.nconc(var89, f7749(var87), f7749(var88));
        }
        finally {
            module0112.$g1424$.rebind(var90, var83);
        }
        return var89;
    }
    
    public static SubLObject f7863(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic246$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic246$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic246$);
        var83 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            final SubLObject var84;
            var80 = (var84 = var81);
            return f7864(var82, var83, var84);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic246$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7865(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic246$);
        final SubLObject var86 = var85.rest();
        var85 = var85.first();
        SubLObject var87 = (SubLObject)module0112.NIL;
        SubLObject var88 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic246$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic246$);
        var88 = var85.first();
        var85 = var85.rest();
        if (module0112.NIL == var85) {
            final SubLObject var89;
            var85 = (var89 = var86);
            SubLObject var90 = (SubLObject)module0112.NIL;
            final SubLObject var91 = module0112.$g1424$.currentBinding(var83);
            try {
                module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var83), var83);
                module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var87, module0112.$g1424$.getDynamicValue(var83)), var83);
                var90 = ConsesLow.nconc(f7748(var88), f7749(var89));
            }
            finally {
                module0112.$g1424$.rebind(var91, var83);
            }
            return var90;
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0112.$ic246$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7864(final SubLObject var247, final SubLObject var331, final SubLObject var20) {
        final SubLThread var332 = SubLProcess.currentSubLThread();
        SubLObject var333 = f7720(var331);
        SubLObject var334 = (SubLObject)module0112.NIL;
        var334 = var333.first();
        while (module0112.NIL != var333) {
            module0112.$g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var247, var334), module0112.$g1413$.getDynamicValue(var332)), var332);
            f7825(var20);
            module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var332).rest(), var332);
            var333 = var333.rest();
            var334 = var333.first();
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7866(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic250$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic250$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic250$);
        var83 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            final SubLObject var84;
            var80 = (var84 = var81);
            return f7867(var82, var83, var84);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic250$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7868(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic250$);
        final SubLObject var86 = var85.rest();
        var85 = var85.first();
        SubLObject var87 = (SubLObject)module0112.NIL;
        SubLObject var88 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic250$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic250$);
        var88 = var85.first();
        var85 = var85.rest();
        if (module0112.NIL == var85) {
            final SubLObject var89;
            var85 = (var89 = var86);
            SubLObject var90 = (SubLObject)module0112.NIL;
            final SubLObject var91 = module0112.$g1424$.currentBinding(var83);
            try {
                module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var83), var83);
                module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var87, module0112.$g1424$.getDynamicValue(var83)), var83);
                var90 = f7748(var88);
                var90 = f7749(var89);
            }
            finally {
                module0112.$g1424$.rebind(var91, var83);
            }
            return var90;
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0112.$ic250$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7867(final SubLObject var247, final SubLObject var338, final SubLObject var20) {
        final SubLThread var339 = SubLProcess.currentSubLThread();
        SubLObject var340;
        SubLObject var341;
        for (var340 = f7720(var338), var341 = (SubLObject)module0112.NIL, var341 = (SubLObject)module0112.ZERO_INTEGER; var341.numL(var340); var341 = Numbers.add(var341, (SubLObject)module0112.ONE_INTEGER)) {
            module0112.$g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var247, var341), module0112.$g1413$.getDynamicValue(var339)), var339);
            f7825(var20);
            module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var339).rest(), var339);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7869(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic254$);
        final SubLObject var81 = var80.rest();
        var80 = var80.first();
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        SubLObject var84 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic254$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic254$);
        var83 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic254$);
        var84 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            final SubLObject var85;
            var80 = (var85 = var81);
            return f7870(var82, var83, var84, var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic254$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7871(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic254$);
        final SubLObject var86 = var85.rest();
        var85 = var85.first();
        SubLObject var87 = (SubLObject)module0112.NIL;
        SubLObject var88 = (SubLObject)module0112.NIL;
        SubLObject var89 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic254$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic254$);
        var88 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic254$);
        var89 = var85.first();
        var85 = var85.rest();
        if (module0112.NIL == var85) {
            final SubLObject var90;
            var85 = (var90 = var86);
            SubLObject var91 = (SubLObject)module0112.NIL;
            final SubLObject var92 = module0112.$g1424$.currentBinding(var83);
            try {
                module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var83), var83);
                module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var87, module0112.$g1424$.getDynamicValue(var83)), var83);
                module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var88, module0112.$g1424$.getDynamicValue(var83)), var83);
                var91 = ConsesLow.nconc(f7748(var89), f7749(var90));
            }
            finally {
                module0112.$g1424$.rebind(var92, var83);
            }
            return var91;
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0112.$ic254$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7870(final SubLObject var347, final SubLObject var348, final SubLObject var349, final SubLObject var20) {
        final SubLThread var350 = SubLProcess.currentSubLThread();
        final SubLObject var351 = f7720(var349);
        SubLObject var352 = (SubLObject)module0112.NIL;
        SubLObject var353 = (SubLObject)module0112.NIL;
        final Iterator var354 = Hashtables.getEntrySetIterator(var351);
        try {
            while (Hashtables.iteratorHasNext(var354)) {
                final Map.Entry var355 = Hashtables.iteratorNextEntry(var354);
                var352 = Hashtables.getEntryKey(var355);
                var353 = Hashtables.getEntryValue(var355);
                module0112.$g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var347, var352), module0112.$g1413$.getDynamicValue(var350)), var350);
                module0112.$g1413$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var348, var353), module0112.$g1413$.getDynamicValue(var350)), var350);
                f7825(var20);
                module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var350).rest(), var350);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var354);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7872(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic258$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7873(var81, var82);
    }
    
    public static SubLObject f7874(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic258$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7873(final SubLObject var29, final SubLObject var358) {
        if (module0112.NIL == f7804(f7720(var29))) {
            f7724((SubLObject)module0112.$ic262$, var29, (SubLObject)module0112.UNPROVIDED);
        }
        final SubLObject var359 = f7720(var29);
        final SubLObject var360 = f7728(var358);
        if (module0112.NIL != conses_high.member((SubLObject)module0112.NIL, var360, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED)) {
            return (SubLObject)module0112.NIL;
        }
        if (module0112.NIL == var360.rest()) {
            final SubLObject var361 = var360.first();
            return (SubLObject)ConsesLow.cons(Functions.funcall(var359, var361.first()), f7873(var29, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var361.rest()))));
        }
        return (SubLObject)ConsesLow.cons(Functions.apply(var359, f7873(Symbols.symbol_function((SubLObject)module0112.$ic263$), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var360)))), Functions.apply(Symbols.symbol_function((SubLObject)module0112.$ic264$), var29, (SubLObject)ConsesLow.list(f7875(f7873(Symbols.symbol_function((SubLObject)module0112.$ic265$), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var360)))))));
    }
    
    public static SubLObject f7875(final SubLObject var4) {
        SubLObject var5 = (SubLObject)module0112.NIL;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0112.NIL;
        var7 = var6.first();
        while (module0112.NIL != var6) {
            var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var7), var5);
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f7876(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic266$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic266$);
        var82 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7877(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic266$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7878(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic266$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic266$);
        var86 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic266$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7877(final SubLObject var365, final SubLObject var3) {
        final SubLObject var366 = f7720(var365);
        final SubLObject var367 = f7720(var3);
        if (module0112.NIL == f7804(var367)) {
            f7724((SubLObject)module0112.$ic262$, var3, (SubLObject)module0112.UNPROVIDED);
        }
        final SubLObject var368 = module0067.f4860(var366);
        if (var368 == module0112.$ic270$) {
            f7879(var366, var3);
        }
        else if (var368 == module0112.$ic271$) {
            f7880(var366, var3);
        }
        else {
            Errors.error((SubLObject)module0112.$ic272$, var368);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7879(final SubLObject var365, final SubLObject var3) {
        SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)module0112.NIL;
        var367 = var366.first();
        while (module0112.NIL != var366) {
            f7720((SubLObject)ConsesLow.list((SubLObject)module0112.$ic165$, var3, var367.first(), var367.rest()));
            var366 = var366.rest();
            var367 = var366.first();
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7880(final SubLObject var365, final SubLObject var3) {
        final SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)module0112.NIL;
        SubLObject var368 = (SubLObject)module0112.NIL;
        final Iterator var369 = Hashtables.getEntrySetIterator(var366);
        try {
            while (Hashtables.iteratorHasNext(var369)) {
                final Map.Entry var370 = Hashtables.iteratorNextEntry(var369);
                var367 = Hashtables.getEntryKey(var370);
                var368 = Hashtables.getEntryValue(var370);
                f7720((SubLObject)ConsesLow.list((SubLObject)module0112.$ic165$, var3, var367, var368));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var369);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7881(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic273$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic273$);
        var82 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic273$);
        var83 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7882(var81, var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic273$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7883(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        SubLObject var87 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic273$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic273$);
        var86 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic273$);
        var87 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7750(var86), f7749(var87));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic273$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7882(final SubLObject var365, final SubLObject var3, final SubLObject var4) {
        final SubLObject var366 = f7720(var365);
        final SubLObject var367 = f7720(var3);
        final SubLObject var368 = f7728(f7720(var4));
        if (module0112.NIL == f7804(var367)) {
            f7724((SubLObject)module0112.$ic262$, var3, (SubLObject)module0112.UNPROVIDED);
        }
        f7744((SubLObject)module0112.$ic277$, var366, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        f7744((SubLObject)module0112.$ic278$, var367, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        f7744((SubLObject)module0112.$ic279$, var368, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        final SubLObject var369 = module0067.f4860(var366);
        if (var369 == module0112.$ic270$) {
            f7884(var366, var3, var368);
        }
        else if (var369 == module0112.$ic271$) {
            f7885(var366, var3, var368);
        }
        else {
            Errors.error((SubLObject)module0112.$ic272$, var369);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7884(final SubLObject var365, final SubLObject var3, final SubLObject var4) {
        SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)module0112.NIL;
        var367 = var366.first();
        while (module0112.NIL != var366) {
            f7720((SubLObject)ConsesLow.list((SubLObject)module0112.$ic165$, var3, var367.first(), var367.rest(), var4));
            var366 = var366.rest();
            var367 = var366.first();
        }
        return var4;
    }
    
    public static SubLObject f7885(final SubLObject var365, final SubLObject var3, final SubLObject var4) {
        final SubLObject var366 = module0067.f4891(var365);
        SubLObject var367 = (SubLObject)module0112.NIL;
        SubLObject var368 = (SubLObject)module0112.NIL;
        final Iterator var369 = Hashtables.getEntrySetIterator(var366);
        try {
            while (Hashtables.iteratorHasNext(var369)) {
                final Map.Entry var370 = Hashtables.iteratorNextEntry(var369);
                var367 = Hashtables.getEntryKey(var370);
                var368 = Hashtables.getEntryValue(var370);
                f7720((SubLObject)ConsesLow.list((SubLObject)module0112.$ic165$, var3, var367, var368, var4));
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
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic280$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic280$);
        var82 = var80.first();
        final SubLObject var83;
        var80 = (var83 = var80.rest());
        return f7887(var81, var82, var83);
    }
    
    public static SubLObject f7888(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic280$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic280$);
        var86 = var84.first();
        final SubLObject var87;
        var84 = (var87 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7750(var86), f7749(var87));
    }
    
    public static SubLObject f7887(final SubLObject var378, final SubLObject var379, final SubLObject var20) {
        final SubLThread var380 = SubLProcess.currentSubLThread();
        final SubLObject var381 = Sequences.length(module0112.$g1413$.getDynamicValue(var380));
        SubLObject var382 = (SubLObject)module0112.NIL;
        var382 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic284$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic281$, var378, (SubLObject)module0112.$ic285$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var20))), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic286$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var379), (SubLObject)module0112.$ic284$));
        f7690(var382);
        while (Sequences.length(module0112.$g1413$.getDynamicValue(var380)).numG(var381)) {
            module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var380).rest(), var380);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7889(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic287$);
        var81 = var80.first();
        var80 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic287$);
        var82 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7890(var81, var82);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic287$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7891(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic287$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic287$);
        var86 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return ConsesLow.nconc(f7748(var85), f7748(var86));
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic287$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7890(final SubLObject var378, final SubLObject var37) {
        f7690((SubLObject)ConsesLow.list((SubLObject)module0112.$ic288$, var378, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic291$, var37)));
        return (SubLObject)module0112.NIL;
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
        SubLObject var22 = (SubLObject)module0112.NIL;
        final SubLObject var23 = Sequences.length(module0112.$g1413$.getDynamicValue(var21));
        SubLObject var24 = (SubLObject)module0112.NIL;
        var24 = (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic295$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic292$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic51$, (SubLObject)module0112.$ic296$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic53$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var20))))), (SubLObject)module0112.$ic295$);
        var22 = f7690(var24);
        while (Sequences.length(module0112.$g1413$.getDynamicValue(var21)).numG(var23)) {
            module0112.$g1413$.setDynamicValue(module0112.$g1413$.getDynamicValue(var21).rest(), var21);
        }
        if (module0112.NIL != var22) {
            return module0004.values_list(var22);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7895(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic297$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7896(var81, var82);
    }
    
    public static SubLObject f7897(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic297$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7896(final SubLObject var392, final SubLObject var20) {
        final SubLThread var393 = SubLProcess.currentSubLThread();
        final SubLObject var394 = Sequences.length(module0112.$g1413$.getDynamicValue(var393));
        SubLObject var395 = (SubLObject)module0112.NIL;
        var395 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic298$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic291$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var392)), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic235$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic301$, (SubLObject)module0112.$ic302$, var394), (SubLObject)module0112.$ic303$), (SubLObject)ConsesLow.list((SubLObject)module0112.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var20)));
        f7744((SubLObject)module0112.$ic304$, var395, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        f7690(var395);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7898(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic305$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7899(var81);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic305$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7900(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic305$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic305$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7899(final SubLObject var397) {
        final SubLThread var398 = SubLProcess.currentSubLThread();
        final SubLObject var399 = f7720(var397);
        assert module0112.NIL != Types.stringp(var399) : var399;
        SubLObject var400 = (SubLObject)module0112.NIL;
        SubLObject var401 = (SubLObject)module0112.NIL;
        try {
            final SubLObject var402;
            var401 = (var402 = StreamsLow.open(var399, new SubLObject[] { module0112.$ic310$, module0112.$ic311$, module0112.$ic312$, module0112.NIL }));
            if (!var402.isStream()) {
                Errors.error((SubLObject)module0112.$ic313$, var399);
            }
            while (module0112.NIL == var400) {
                var398.resetMultipleValues();
                final SubLObject var403 = reader.read_ignoring_errors(var402, (SubLObject)module0112.NIL, (SubLObject)module0112.$ic314$);
                final SubLObject var404 = var398.secondMultipleValue();
                var398.resetMultipleValues();
                if (var404 == module0112.$ic315$) {
                    if (var403 != module0112.$ic314$) {
                        Errors.error((SubLObject)module0112.$ic316$, streams_high.file_position(var402, (SubLObject)module0112.UNPROVIDED), var399);
                    }
                    var400 = (SubLObject)module0112.T;
                }
                else {
                    f7689(var403);
                }
            }
        }
        finally {
            final SubLObject var405 = Threads.$is_thread_performing_cleanupP$.currentBinding(var398);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0112.T, var398);
                if (module0112.NIL != var401) {
                    streams_high.close(var401, (SubLObject)module0112.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var405, var398);
            }
        }
        return (SubLObject)module0112.T;
    }
    
    public static SubLObject f7901(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        SubLObject var83 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic317$);
        var82 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic317$);
        var83 = var81.first();
        var81 = var81.rest();
        if (module0112.NIL == var81) {
            if (module0112.NIL == Types.$suspend_type_checkingP$.getDynamicValue(var79) && module0112.NIL == Errors.$ignore_mustsP$.getDynamicValue(var79) && module0112.NIL == f7689((SubLObject)ConsesLow.list(var83, var82))) {
                Errors.error((SubLObject)module0112.$ic318$, var82, var83);
            }
            return (SubLObject)module0112.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.$ic317$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7902(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic317$);
        var85 = var84.first();
        var84 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic317$);
        var86 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            SubLObject var87 = (SubLObject)module0112.NIL;
            var87 = ConsesLow.nconc(var87, f7748(var85));
            if (module0112.NIL == f7722(var86)) {
                final SubLObject var88 = var86;
                if (module0112.NIL == conses_high.member(var88, var87, Symbols.symbol_function((SubLObject)module0112.EQL), Symbols.symbol_function((SubLObject)module0112.IDENTITY))) {
                    var87 = (SubLObject)ConsesLow.cons(var88, var87);
                }
            }
            return var87;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic317$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7903(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic68$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return var81;
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic68$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7904(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic68$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return (SubLObject)module0112.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic68$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7905(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic102$);
        var82 = var81.first();
        var81 = var81.rest();
        if (module0112.NIL == var81) {
            return module0035.sublisp_boolean(conses_high.assoc(f7720(var82), module0112.$g1413$.getDynamicValue(var79), Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.$ic102$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7906(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic102$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7750(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic102$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7907(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic120$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            final SubLObject var82 = f7720(var81);
            SubLObject var83 = (SubLObject)module0112.NIL;
            var83 = f7720(var82);
            return var83;
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic120$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7908(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic120$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return f7748(var85);
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic120$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7909(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic330$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return f7910(var81);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic330$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7911(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic330$);
        var86 = var85.first();
        var85 = var85.rest();
        if (module0112.NIL != var85) {
            cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0112.$ic330$);
            return (SubLObject)module0112.NIL;
        }
        if (module0112.NIL != module0035.f2169(var86, module0112.$g1425$.getDynamicValue(var83)) || module0112.NIL != f7721(var86)) {
            return (SubLObject)module0112.NIL;
        }
        return (SubLObject)ConsesLow.list(var86);
    }
    
    public static SubLObject f7910(final SubLObject var218) {
        return (SubLObject)((module0112.NIL != f7803(var218)) ? ConsesLow.list(var218, f7708(var218)) : f7690((SubLObject)ConsesLow.list((SubLObject)module0112.$ic331$, var218)));
    }
    
    public static SubLObject f7912(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic334$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        final SubLObject var83 = (SubLObject)ConsesLow.cons(var81, f7728(var82));
        return f7716(Symbols.symbol_function((SubLObject)module0112.$ic335$), var83);
    }
    
    public static SubLObject f7913(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic334$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7914(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var81;
        final SubLObject var80 = var81 = var78.rest();
        SubLObject var82 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0112.$ic334$);
        var82 = var81.first();
        final SubLObject var83;
        var81 = (var83 = var81.rest());
        SubLObject var84 = PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic176$);
        SubLObject var85 = module0112.$g1413$.getDynamicValue(var79);
        SubLObject var86 = (SubLObject)module0112.NIL;
        var86 = var85.first();
        while (module0112.NIL != var85) {
            var84 = Sequences.cconcatenate(var84, PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic338$, var86));
            var85 = var85.rest();
            var86 = var85.first();
        }
        final SubLObject var87 = Sequences.cconcatenate(var84, new SubLObject[] { module0112.$ic176$, var82 });
        final SubLObject var88 = (SubLObject)ConsesLow.cons(var87, f7728(var83));
        return f7716(Symbols.symbol_function((SubLObject)module0112.$ic339$), var88);
    }
    
    public static SubLObject f7915(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic334$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7916(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = var78.rest();
        if (module0112.NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.NIL);
        }
        if (module0112.$g1420$.getDynamicValue(var79).eql((SubLObject)module0112.ZERO_INTEGER)) {
            module0112.$g1413$.setDynamicValue((SubLObject)module0112.NIL, var79);
        }
        else {
            f7724((SubLObject)module0112.$ic342$, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7917(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (module0112.NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.NIL);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7918(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = var78.rest();
        if (module0112.NIL != var80) {
            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0112.NIL);
        }
        SubLObject var81 = PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic176$);
        SubLObject var82 = module0112.$g1413$.getDynamicValue(var79);
        SubLObject var83 = (SubLObject)module0112.NIL;
        var83 = var82.first();
        while (module0112.NIL != var82) {
            var81 = Sequences.cconcatenate(var81, PrintLow.format((SubLObject)module0112.NIL, (SubLObject)module0112.$ic338$, var83));
            var82 = var82.rest();
            var83 = var82.first();
        }
        return var81;
    }
    
    public static SubLObject f7919(final SubLObject var82) {
        final SubLObject var83 = var82.rest();
        if (module0112.NIL != var83) {
            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.NIL);
        }
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7920(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic349$);
        var81 = var80.first();
        var80 = var80.rest();
        if (module0112.NIL == var80) {
            return var81;
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0112.$ic349$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7921(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic349$);
        var85 = var84.first();
        var84 = var84.rest();
        if (module0112.NIL == var84) {
            return (SubLObject)module0112.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0112.$ic349$);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7922(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic353$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7923(var81, var82);
    }
    
    public static SubLObject f7924(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var85;
        final SubLObject var84 = var85 = var82.rest();
        SubLObject var86 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0112.$ic353$);
        var86 = var85.first();
        final SubLObject var87;
        var85 = (var87 = var85.rest());
        SubLObject var88 = (SubLObject)module0112.NIL;
        final SubLObject var89 = module0112.$g1424$.currentBinding(var83);
        try {
            module0112.$g1424$.bind(module0112.$g1424$.getDynamicValue(var83), var83);
            module0112.$g1424$.setDynamicValue((SubLObject)ConsesLow.cons(var86, module0112.$g1424$.getDynamicValue(var83)), var83);
            var88 = f7749(var87);
        }
        finally {
            module0112.$g1424$.rebind(var89, var83);
        }
        return var88;
    }
    
    public static SubLObject f7923(final SubLObject var10, final SubLObject var20) {
        SubLObject var21 = (SubLObject)module0112.NIL;
        var21 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic357$, (SubLObject)module0112.$ic358$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic354$, (SubLObject)module0112.$ic359$, reader.bq_cons((SubLObject)module0112.$ic360$, ConsesLow.append(var20, (SubLObject)module0112.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0112.$ic286$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var10), (SubLObject)module0112.$ic358$));
        f7744((SubLObject)module0112.$ic361$, var21, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        return f7690(var21);
    }
    
    public static SubLObject f7925(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic362$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7926(var81, var82);
    }
    
    public static SubLObject f7927(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic362$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7926(final SubLObject var453, final SubLObject var20) {
        SubLObject var454 = (SubLObject)module0112.NIL;
        var454 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic363$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic291$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var453)), reader.bq_cons((SubLObject)module0112.$ic360$, ConsesLow.append(var20, (SubLObject)module0112.NIL)));
        f7744((SubLObject)module0112.$ic366$, var454, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        f7690(var454);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7928(final SubLObject var78) {
        SubLObject var80;
        final SubLObject var79 = var80 = var78.rest();
        SubLObject var81 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0112.$ic362$);
        var81 = var80.first();
        final SubLObject var82;
        var80 = (var82 = var80.rest());
        return f7929(var81, var82);
    }
    
    public static SubLObject f7930(final SubLObject var82) {
        SubLObject var84;
        final SubLObject var83 = var84 = var82.rest();
        SubLObject var85 = (SubLObject)module0112.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0112.$ic362$);
        var85 = var84.first();
        final SubLObject var86;
        var84 = (var86 = var84.rest());
        return ConsesLow.nconc(f7748(var85), f7749(var86));
    }
    
    public static SubLObject f7929(final SubLObject var453, final SubLObject var20) {
        SubLObject var454 = (SubLObject)module0112.NIL;
        var454 = (SubLObject)ConsesLow.list((SubLObject)module0112.$ic367$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic291$, (SubLObject)ConsesLow.list((SubLObject)module0112.$ic15$, var453)), reader.bq_cons((SubLObject)module0112.$ic360$, ConsesLow.append(var20, (SubLObject)module0112.NIL)));
        f7744((SubLObject)module0112.$ic370$, var454, (SubLObject)module0112.UNPROVIDED, (SubLObject)module0112.UNPROVIDED);
        f7690(var454);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7931() {
        module0112.$g1413$.setDynamicValue((SubLObject)module0112.NIL);
        module0012.f387((SubLObject)module0112.$ic371$);
        module0012.f369((SubLObject)module0112.$ic371$);
        module0012.f387((SubLObject)module0112.$ic319$);
        return (SubLObject)module0112.NIL;
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
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7933() {
        module0112.$g1410$ = SubLFiles.defvar("*EVAL-IN-API?*", (SubLObject)module0112.NIL);
        module0112.$g1411$ = SubLFiles.deflexical("S#9911", (SubLObject)((module0112.NIL != Symbols.boundp((SubLObject)module0112.$ic1$)) ? module0112.$g1411$.getGlobalValue() : module0112.NIL));
        module0112.$g1412$ = SubLFiles.deflexical("S#9912", (SubLObject)((module0112.NIL != Symbols.boundp((SubLObject)module0112.$ic2$)) ? module0112.$g1412$.getGlobalValue() : module0112.NIL));
        module0112.$g1413$ = SubLFiles.defparameter("S#9913", (SubLObject)module0112.NIL);
        module0112.$g1414$ = SubLFiles.deflexical("S#9914", (module0112.NIL != Symbols.boundp((SubLObject)module0112.$ic3$)) ? module0112.$g1414$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0112.TEN_INTEGER, Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED));
        module0112.$g1415$ = SubLFiles.deflexical("S#9915", (module0112.NIL != Symbols.boundp((SubLObject)module0112.$ic4$)) ? module0112.$g1415$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0112.$ic5$, Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED));
        module0112.$g1416$ = SubLFiles.deflexical("S#9916", (module0112.NIL != Symbols.boundp((SubLObject)module0112.$ic6$)) ? module0112.$g1416$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0112.TEN_INTEGER, Symbols.symbol_function((SubLObject)module0112.EQ), (SubLObject)module0112.UNPROVIDED));
        module0112.$g1417$ = SubLFiles.deflexical("S#9917", (SubLObject)((module0112.NIL != Symbols.boundp((SubLObject)module0112.$ic19$)) ? module0112.$g1417$.getGlobalValue() : module0112.$ic20$));
        module0112.$g1418$ = SubLFiles.defparameter("S#9918", (SubLObject)module0112.NIL);
        module0112.$g1419$ = SubLFiles.defparameter("S#9919", (SubLObject)module0112.NIL);
        module0112.$g1420$ = SubLFiles.defparameter("S#9920", (SubLObject)module0112.MINUS_ONE_INTEGER);
        module0112.$g1421$ = SubLFiles.defparameter("S#9921", (SubLObject)module0112.MINUS_ONE_INTEGER);
        module0112.$g1422$ = SubLFiles.defparameter("S#9922", (SubLObject)module0112.NIL);
        module0112.$g1423$ = SubLFiles.defparameter("S#9923", (SubLObject)module0112.NIL);
        module0112.$g1424$ = SubLFiles.defparameter("S#9924", (SubLObject)module0112.NIL);
        module0112.$g1425$ = SubLFiles.defparameter("S#9925", (SubLObject)module0112.NIL);
        module0112.$g1426$ = SubLFiles.defparameter("S#9926", (SubLObject)module0112.NIL);
        module0112.$g1427$ = SubLFiles.deflexical("S#9927", (SubLObject)module0112.NIL);
        return (SubLObject)module0112.NIL;
    }
    
    public static SubLObject f7934() {
        module0003.f57((SubLObject)module0112.$ic1$);
        module0003.f57((SubLObject)module0112.$ic2$);
        module0003.f57((SubLObject)module0112.$ic3$);
        module0003.f57((SubLObject)module0112.$ic4$);
        module0003.f57((SubLObject)module0112.$ic6$);
        module0003.f57((SubLObject)module0112.$ic19$);
        module0002.f50((SubLObject)module0112.$ic24$, (SubLObject)module0112.$ic25$);
        module0012.f368((SubLObject)module0112.$ic28$, (SubLObject)module0112.$ic29$, (SubLObject)module0112.$ic30$, (SubLObject)module0112.$ic31$, (SubLObject)module0112.$ic32$);
        module0012.f368((SubLObject)module0112.$ic33$, (SubLObject)module0112.$ic29$, (SubLObject)module0112.$ic34$, (SubLObject)module0112.$ic31$, (SubLObject)module0112.$ic32$);
        module0012.f368((SubLObject)module0112.$ic35$, (SubLObject)module0112.$ic29$, (SubLObject)module0112.$ic36$, (SubLObject)module0112.$ic31$, (SubLObject)module0112.$ic32$);
        module0027.f1449((SubLObject)module0112.$ic28$, (SubLObject)ConsesLow.list(new SubLObject[] { module0112.$ic37$, Symbols.symbol_function((SubLObject)module0112.EQ), module0112.$ic38$, module0112.NIL, module0112.$ic39$, module0112.NIL, module0112.$ic40$, module0112.$ic41$, module0112.$ic42$, module0112.T }), (SubLObject)module0112.$ic43$);
        module0002.f38((SubLObject)module0112.$ic65$);
        module0027.f1449((SubLObject)module0112.$ic65$, (SubLObject)ConsesLow.list(new SubLObject[] { module0112.$ic37$, Symbols.symbol_function((SubLObject)module0112.EQUAL), module0112.$ic38$, module0112.NIL, module0112.$ic39$, module0112.NIL, module0112.$ic40$, module0112.$ic41$, module0112.$ic42$, module0112.T }), (SubLObject)module0112.$ic67$);
        module0012.f379((SubLObject)module0112.$ic69$, (SubLObject)module0112.$ic70$);
        f7707((SubLObject)module0112.$ic69$, (SubLObject)module0112.$ic71$);
        module0012.f379((SubLObject)module0112.$ic73$, (SubLObject)module0112.$ic74$);
        f7707((SubLObject)module0112.$ic73$, (SubLObject)module0112.$ic75$);
        module0012.f379((SubLObject)module0112.$ic76$, (SubLObject)module0112.$ic77$);
        f7707((SubLObject)module0112.$ic76$, (SubLObject)module0112.$ic78$);
        module0012.f379((SubLObject)module0112.$ic79$, (SubLObject)module0112.$ic80$);
        f7707((SubLObject)module0112.$ic79$, (SubLObject)module0112.$ic81$);
        module0012.f379((SubLObject)module0112.$ic11$, (SubLObject)module0112.$ic82$);
        f7707((SubLObject)module0112.$ic11$, (SubLObject)module0112.$ic83$);
        module0012.f379((SubLObject)module0112.$ic85$, (SubLObject)module0112.$ic86$);
        f7707((SubLObject)module0112.$ic85$, (SubLObject)module0112.$ic87$);
        module0012.f379((SubLObject)module0112.$ic89$, (SubLObject)module0112.$ic90$);
        f7707((SubLObject)module0112.$ic89$, (SubLObject)module0112.$ic91$);
        module0012.f379((SubLObject)module0112.$ic93$, (SubLObject)module0112.$ic94$);
        f7707((SubLObject)module0112.$ic93$, (SubLObject)module0112.$ic95$);
        module0012.f379((SubLObject)module0112.$ic97$, (SubLObject)module0112.$ic98$);
        f7707((SubLObject)module0112.$ic97$, (SubLObject)module0112.$ic100$);
        module0012.f379((SubLObject)module0112.$ic103$, (SubLObject)module0112.$ic104$);
        f7707((SubLObject)module0112.$ic103$, (SubLObject)module0112.$ic105$);
        module0012.f379((SubLObject)module0112.$ic107$, (SubLObject)module0112.$ic108$);
        f7707((SubLObject)module0112.$ic107$, (SubLObject)module0112.$ic109$);
        module0012.f379((SubLObject)module0112.$ic110$, (SubLObject)module0112.$ic111$);
        f7707((SubLObject)module0112.$ic110$, (SubLObject)module0112.$ic112$);
        module0012.f368((SubLObject)module0112.$ic113$, (SubLObject)module0112.NIL, (SubLObject)module0112.$ic114$, (SubLObject)module0112.NIL, (SubLObject)module0112.$ic115$);
        module0012.f368((SubLObject)module0112.$ic116$, (SubLObject)module0112.$ic117$, (SubLObject)module0112.$ic118$, (SubLObject)module0112.NIL, (SubLObject)module0112.$ic115$);
        module0012.f368((SubLObject)module0112.$ic119$, (SubLObject)module0112.$ic120$, (SubLObject)module0112.$ic121$, (SubLObject)module0112.NIL, (SubLObject)module0112.NIL);
        module0012.f379((SubLObject)module0112.$ic122$, (SubLObject)module0112.$ic123$);
        f7707((SubLObject)module0112.$ic122$, (SubLObject)module0112.$ic124$);
        module0012.f379((SubLObject)module0112.$ic51$, (SubLObject)module0112.$ic126$);
        f7707((SubLObject)module0112.$ic51$, (SubLObject)module0112.$ic127$);
        module0012.f379((SubLObject)module0112.$ic132$, (SubLObject)module0112.$ic133$);
        f7707((SubLObject)module0112.$ic132$, (SubLObject)module0112.$ic134$);
        module0012.f379((SubLObject)module0112.$ic135$, (SubLObject)module0112.$ic136$);
        f7707((SubLObject)module0112.$ic135$, (SubLObject)module0112.$ic137$);
        module0012.f379((SubLObject)module0112.$ic139$, (SubLObject)module0112.$ic140$);
        f7707((SubLObject)module0112.$ic139$, (SubLObject)module0112.$ic141$);
        module0012.f379((SubLObject)module0112.$ic143$, (SubLObject)module0112.$ic144$);
        f7707((SubLObject)module0112.$ic143$, (SubLObject)module0112.$ic145$);
        module0012.f379((SubLObject)module0112.$ic20$, (SubLObject)module0112.$ic147$);
        f7707((SubLObject)module0112.$ic148$, (SubLObject)module0112.$ic149$);
        module0012.f379((SubLObject)module0112.$ic150$, (SubLObject)module0112.$ic151$);
        f7707((SubLObject)module0112.$ic150$, (SubLObject)module0112.$ic152$);
        module0012.f379((SubLObject)module0112.$ic153$, (SubLObject)module0112.$ic154$);
        f7707((SubLObject)module0112.$ic153$, (SubLObject)module0112.$ic155$);
        module0012.f379((SubLObject)module0112.$ic157$, (SubLObject)module0112.$ic158$);
        f7707((SubLObject)module0112.$ic157$, (SubLObject)module0112.$ic159$);
        module0012.f379((SubLObject)module0112.$ic161$, (SubLObject)module0112.$ic162$);
        f7707((SubLObject)module0112.$ic161$, (SubLObject)module0112.$ic163$);
        module0012.f379((SubLObject)module0112.$ic165$, (SubLObject)module0112.$ic166$);
        f7707((SubLObject)module0112.$ic165$, (SubLObject)module0112.$ic167$);
        module0012.f379((SubLObject)module0112.$ic53$, (SubLObject)module0112.$ic168$);
        f7707((SubLObject)module0112.$ic53$, (SubLObject)module0112.$ic169$);
        module0012.f379((SubLObject)module0112.$ic170$, (SubLObject)module0112.$ic171$);
        f7707((SubLObject)module0112.$ic170$, (SubLObject)module0112.$ic172$);
        module0012.f379((SubLObject)module0112.$ic173$, (SubLObject)module0112.$ic174$);
        f7707((SubLObject)module0112.$ic173$, (SubLObject)module0112.$ic175$);
        module0012.f379((SubLObject)module0112.$ic181$, (SubLObject)module0112.$ic182$);
        f7707((SubLObject)module0112.$ic181$, (SubLObject)module0112.$ic183$);
        module0012.f379((SubLObject)module0112.$ic184$, (SubLObject)module0112.$ic185$);
        f7707((SubLObject)module0112.$ic184$, (SubLObject)module0112.$ic186$);
        module0012.f379((SubLObject)module0112.$ic10$, (SubLObject)module0112.$ic188$);
        f7707((SubLObject)module0112.$ic10$, (SubLObject)module0112.$ic189$);
        module0012.f379((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic191$);
        f7707((SubLObject)module0112.$ic21$, (SubLObject)module0112.$ic193$);
        module0012.f379((SubLObject)module0112.$ic196$, (SubLObject)module0112.$ic197$);
        f7707((SubLObject)module0112.$ic196$, (SubLObject)module0112.$ic198$);
        module0012.f379((SubLObject)module0112.$ic199$, (SubLObject)module0112.$ic200$);
        f7707((SubLObject)module0112.$ic199$, (SubLObject)module0112.$ic201$);
        module0012.f379((SubLObject)module0112.$ic202$, (SubLObject)module0112.$ic203$);
        f7707((SubLObject)module0112.$ic202$, (SubLObject)module0112.$ic204$);
        module0012.f379((SubLObject)module0112.$ic205$, (SubLObject)module0112.$ic206$);
        f7707((SubLObject)module0112.$ic205$, (SubLObject)module0112.$ic207$);
        module0012.f379((SubLObject)module0112.$ic209$, (SubLObject)module0112.$ic210$);
        f7707((SubLObject)module0112.$ic209$, (SubLObject)module0112.$ic211$);
        module0012.f379((SubLObject)module0112.$ic213$, (SubLObject)module0112.$ic214$);
        f7707((SubLObject)module0112.$ic213$, (SubLObject)module0112.$ic215$);
        module0012.f379((SubLObject)module0112.$ic216$, (SubLObject)module0112.$ic217$);
        f7707((SubLObject)module0112.$ic216$, (SubLObject)module0112.$ic218$);
        module0012.f379((SubLObject)module0112.$ic219$, (SubLObject)module0112.$ic220$);
        f7707((SubLObject)module0112.$ic219$, (SubLObject)module0112.$ic221$);
        module0012.f379((SubLObject)module0112.$ic223$, (SubLObject)module0112.$ic224$);
        f7707((SubLObject)module0112.$ic223$, (SubLObject)module0112.$ic225$);
        module0012.f379((SubLObject)module0112.$ic226$, (SubLObject)module0112.$ic227$);
        f7707((SubLObject)module0112.$ic226$, (SubLObject)module0112.$ic228$);
        module0012.f379((SubLObject)module0112.$ic229$, (SubLObject)module0112.$ic230$);
        f7707((SubLObject)module0112.$ic229$, (SubLObject)module0112.$ic231$);
        module0012.f379((SubLObject)module0112.$ic232$, (SubLObject)module0112.$ic233$);
        f7707((SubLObject)module0112.$ic232$, (SubLObject)module0112.$ic234$);
        module0012.f379((SubLObject)module0112.$ic235$, (SubLObject)module0112.$ic236$);
        f7707((SubLObject)module0112.$ic235$, (SubLObject)module0112.$ic237$);
        module0012.f379((SubLObject)module0112.$ic238$, (SubLObject)module0112.$ic239$);
        f7707((SubLObject)module0112.$ic238$, (SubLObject)module0112.$ic240$);
        module0012.f379((SubLObject)module0112.$ic243$, (SubLObject)module0112.$ic244$);
        f7707((SubLObject)module0112.$ic243$, (SubLObject)module0112.$ic245$);
        module0012.f379((SubLObject)module0112.$ic247$, (SubLObject)module0112.$ic248$);
        f7707((SubLObject)module0112.$ic247$, (SubLObject)module0112.$ic249$);
        module0012.f379((SubLObject)module0112.$ic251$, (SubLObject)module0112.$ic252$);
        f7707((SubLObject)module0112.$ic251$, (SubLObject)module0112.$ic253$);
        module0012.f379((SubLObject)module0112.$ic255$, (SubLObject)module0112.$ic256$);
        f7707((SubLObject)module0112.$ic255$, (SubLObject)module0112.$ic257$);
        module0012.f379((SubLObject)module0112.$ic259$, (SubLObject)module0112.$ic260$);
        f7707((SubLObject)module0112.$ic259$, (SubLObject)module0112.$ic261$);
        module0012.f379((SubLObject)module0112.$ic267$, (SubLObject)module0112.$ic268$);
        f7707((SubLObject)module0112.$ic267$, (SubLObject)module0112.$ic269$);
        module0012.f379((SubLObject)module0112.$ic274$, (SubLObject)module0112.$ic275$);
        f7707((SubLObject)module0112.$ic274$, (SubLObject)module0112.$ic276$);
        module0012.f379((SubLObject)module0112.$ic281$, (SubLObject)module0112.$ic282$);
        f7707((SubLObject)module0112.$ic281$, (SubLObject)module0112.$ic283$);
        module0012.f379((SubLObject)module0112.$ic288$, (SubLObject)module0112.$ic289$);
        f7707((SubLObject)module0112.$ic288$, (SubLObject)module0112.$ic290$);
        module0012.f379((SubLObject)module0112.$ic292$, (SubLObject)module0112.$ic293$);
        f7707((SubLObject)module0112.$ic292$, (SubLObject)module0112.$ic294$);
        module0012.f379((SubLObject)module0112.$ic298$, (SubLObject)module0112.$ic299$);
        f7707((SubLObject)module0112.$ic298$, (SubLObject)module0112.$ic300$);
        module0012.f379((SubLObject)module0112.$ic306$, (SubLObject)module0112.$ic307$);
        f7707((SubLObject)module0112.$ic306$, (SubLObject)module0112.$ic308$);
        module0012.f379((SubLObject)module0112.$ic319$, (SubLObject)module0112.$ic320$);
        f7707((SubLObject)module0112.$ic319$, (SubLObject)module0112.$ic321$);
        module0012.f379((SubLObject)module0112.$ic15$, (SubLObject)module0112.$ic322$);
        f7707((SubLObject)module0112.$ic15$, (SubLObject)module0112.$ic323$);
        module0012.f379((SubLObject)module0112.$ic324$, (SubLObject)module0112.$ic325$);
        f7707((SubLObject)module0112.$ic324$, (SubLObject)module0112.$ic326$);
        module0012.f379((SubLObject)module0112.$ic327$, (SubLObject)module0112.$ic328$);
        f7707((SubLObject)module0112.$ic327$, (SubLObject)module0112.$ic329$);
        module0012.f379((SubLObject)module0112.$ic331$, (SubLObject)module0112.$ic332$);
        f7707((SubLObject)module0112.$ic331$, (SubLObject)module0112.$ic333$);
        module0012.f379((SubLObject)module0112.$ic335$, (SubLObject)module0112.$ic336$);
        f7707((SubLObject)module0112.$ic335$, (SubLObject)module0112.$ic337$);
        module0012.f379((SubLObject)module0112.$ic339$, (SubLObject)module0112.$ic340$);
        f7707((SubLObject)module0112.$ic339$, (SubLObject)module0112.$ic341$);
        module0012.f379((SubLObject)module0112.$ic343$, (SubLObject)module0112.$ic344$);
        f7707((SubLObject)module0112.$ic343$, (SubLObject)module0112.$ic345$);
        module0012.f379((SubLObject)module0112.$ic346$, (SubLObject)module0112.$ic347$);
        f7707((SubLObject)module0112.$ic346$, (SubLObject)module0112.$ic348$);
        module0012.f379((SubLObject)module0112.$ic350$, (SubLObject)module0112.$ic351$);
        f7707((SubLObject)module0112.$ic350$, (SubLObject)module0112.$ic352$);
        module0012.f379((SubLObject)module0112.$ic354$, (SubLObject)module0112.$ic355$);
        f7707((SubLObject)module0112.$ic354$, (SubLObject)module0112.$ic356$);
        module0012.f379((SubLObject)module0112.$ic363$, (SubLObject)module0112.$ic364$);
        f7707((SubLObject)module0112.$ic363$, (SubLObject)module0112.$ic365$);
        module0012.f379((SubLObject)module0112.$ic367$, (SubLObject)module0112.$ic368$);
        f7707((SubLObject)module0112.$ic367$, (SubLObject)module0112.$ic369$);
        return (SubLObject)module0112.NIL;
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
        module0112.$g1410$ = null;
        module0112.$g1411$ = null;
        module0112.$g1412$ = null;
        module0112.$g1413$ = null;
        module0112.$g1414$ = null;
        module0112.$g1415$ = null;
        module0112.$g1416$ = null;
        module0112.$g1417$ = null;
        module0112.$g1418$ = null;
        module0112.$g1419$ = null;
        module0112.$g1420$ = null;
        module0112.$g1421$ = null;
        module0112.$g1422$ = null;
        module0112.$g1423$ = null;
        module0112.$g1424$ = null;
        module0112.$g1425$ = null;
        module0112.$g1426$ = null;
        module0112.$g1427$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#2613", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#9911", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#9912", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#9914", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#9915", "CYC");
        $ic5$ = SubLObjectFactory.makeInteger(100);
        $ic6$ = SubLObjectFactory.makeSymbol("S#9916", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic8$ = SubLObjectFactory.makeUninternedSymbol("US#53E30DA");
        $ic9$ = SubLObjectFactory.makeString("API-SPECIAL-~A");
        $ic10$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic11$ = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $ic12$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic13$ = SubLObjectFactory.makeSymbol("CDR");
        $ic14$ = SubLObjectFactory.makeSymbol("S#378", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic16$ = SubLObjectFactory.makeUninternedSymbol("US#53E30DA");
        $ic17$ = SubLObjectFactory.makeString("API-SPECIAL-~A-VERIFY");
        $ic18$ = SubLObjectFactory.makeSymbol("S#9696", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#9917", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("EVAL");
        $ic21$ = SubLObjectFactory.makeSymbol("CLET");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*%EVALUATOR-METHOD*", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("S#9917", "CYC")));
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9913", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9710", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9918", "CYC"), (SubLObject)module0112.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9919", "CYC"), (SubLObject)SubLObjectFactory.makeString("")));
        $ic24$ = SubLObjectFactory.makeSymbol("S#9710", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#9928", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic28$ = SubLObjectFactory.makeSymbol("VALID-API-OPERATOR-P");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"));
        $ic30$ = SubLObjectFactory.makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR or use\nas a MACRO would success in the most restricted version of the API");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic33$ = SubLObjectFactory.makeSymbol("VALID-API-FUNCTION-P");
        $ic34$ = SubLObjectFactory.makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
        $ic35$ = SubLObjectFactory.makeSymbol("VALID-API-MACRO-P");
        $ic36$ = SubLObjectFactory.makeString("@return boolean T iff macro expansion of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
        $ic37$ = SubLObjectFactory.makeKeyword("TEST");
        $ic38$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic39$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic40$ = SubLObjectFactory.makeKeyword("KB");
        $ic41$ = SubLObjectFactory.makeKeyword("TINY");
        $ic42$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic43$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-API-OPERATOR-P")), (SubLObject)module0112.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS")), (SubLObject)module0112.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+")), (SubLObject)module0112.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND")), (SubLObject)module0112.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH")), (SubLObject)module0112.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION-FIND-IF")), (SubLObject)module0112.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-PACKAGE")), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9712", "CYC")), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9726", "CYC")), (SubLObject)module0112.NIL) });
        $ic44$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic45$ = SubLObjectFactory.makeString("Operator ~S was not a symbol");
        $ic46$ = SubLObjectFactory.makeString("Operator ~S is not defined in the API");
        $ic47$ = SubLObjectFactory.makeString("Variable ~S is unbound");
        $ic48$ = SubLObjectFactory.makeString("API ERROR");
        $ic49$ = SubLObjectFactory.makeString("Attempt to obtain the value of symbol ~S which is unbound");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9929", "CYC"));
        $ic51$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic52$ = SubLObjectFactory.makeSymbol("S#9929", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $ic54$ = SubLObjectFactory.makeSymbol("S#9728", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("VALUES-LIST");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9930", "CYC"));
        $ic57$ = SubLObjectFactory.makeSymbol("S#9930", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("MACROEXPAND-1");
        $ic59$ = SubLObjectFactory.makeKeyword("EVAL-IN-API-RET");
        $ic60$ = SubLObjectFactory.makeSymbol("S#9727", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9931", "CYC"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#9931", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#9806", "CYC");
        $ic64$ = SubLObjectFactory.makeString("with-eval-in-api-env-int");
        $ic65$ = SubLObjectFactory.makeSymbol("VERIFY-IN-API");
        $ic66$ = SubLObjectFactory.makeString("don't know how to handle special ~A");
        $ic67$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)module0112.ONE_INTEGER, (SubLObject)module0112.ONE_INTEGER))))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"), (SubLObject)module0112.ONE_INTEGER))))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-PUBLIC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4835", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9933", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#9933", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4835", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("S#9933", "CYC"))))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)module0112.NIL, (SubLObject)module0112.T, (SubLObject)module0112.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)module0112.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)module0112.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)module0112.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0112.T, (SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFVAR"), (SubLObject)SubLObjectFactory.makeSymbol("S#9934", "CYC"), (SubLObject)module0112.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFMACRO"), (SubLObject)SubLObjectFactory.makeSymbol("S#9935", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9936", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9934", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9936", "CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9937", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9936", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9938", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9935", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9936", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9936", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"), (SubLObject)module0112.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0112.NIL)))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FBOUNDP"))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)module0112.ONE_INTEGER, (SubLObject)module0112.TWO_INTEGER, (SubLObject)module0112.THREE_INTEGER))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)module0112.FIVE_INTEGER, (SubLObject)module0112.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeString("a")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9939", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("S#9940", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DECODED-TIME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)module0112.T, (SubLObject)SubLObjectFactory.makeString("~A:~A"), (SubLObject)SubLObjectFactory.makeSymbol("S#9940", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MIN")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)module0112.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)module0112.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeString("a"))))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9941", "CYC"), (SubLObject)module0112.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)module0112.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("S#9941", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9942", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)module0112.ZERO_INTEGER, (SubLObject)module0112.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("S#9942", "CYC"), (SubLObject)module0112.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9943", "CYC"), (SubLObject)SubLObjectFactory.makeInteger(-10), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("S#9943", "CYC"), (SubLObject)module0112.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("S#9941", "CYC"), (SubLObject)module0112.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)module0112.T, (SubLObject)SubLObjectFactory.makeString("~%x=~S y=~S z=~S"), (SubLObject)SubLObjectFactory.makeSymbol("S#9941", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9942", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9943", "CYC")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-KEYWORD"), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-KEYWORD"), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)SubLObjectFactory.makeString("b"))), (SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-CONSTANTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-NARTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-FORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ASSERTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DEDUCTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9944", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9945", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9946", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)module0112.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9945", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9946", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)module0112.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"))))), (SubLObject)module0112.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-EVALUATION-DEFN"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC")))), (SubLObject)module0112.NIL) });
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#63", "CYC"));
        $ic69$ = SubLObjectFactory.makeSymbol("RET");
        $ic70$ = SubLObjectFactory.makeSymbol("S#9732", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#9733", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("LAMBDA");
        $ic73$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic74$ = SubLObjectFactory.makeSymbol("S#9734", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#9735", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#9736", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#9737", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $ic80$ = SubLObjectFactory.makeSymbol("S#9738", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#9739", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#9740", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#9741", "CYC");
        $ic84$ = SubLObjectFactory.makeUninternedSymbol("US#53E30DA");
        $ic85$ = SubLObjectFactory.makeSymbol("DEFMACRO");
        $ic86$ = SubLObjectFactory.makeSymbol("S#9742", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#9743", "CYC");
        $ic88$ = SubLObjectFactory.makeUninternedSymbol("US#53E30DA");
        $ic89$ = SubLObjectFactory.makeSymbol("DEFMACRO-PUBLIC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#9744", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#9745", "CYC");
        $ic92$ = SubLObjectFactory.makeUninternedSymbol("US#53E30DA");
        $ic93$ = SubLObjectFactory.makeSymbol("DEFMACRO-PROTECTED");
        $ic94$ = SubLObjectFactory.makeSymbol("S#9746", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#9747", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#4498", "CYC"));
        $ic97$ = SubLObjectFactory.makeSymbol("DEFSTRUCT");
        $ic98$ = SubLObjectFactory.makeSymbol("S#9749", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#4498", "CYC")));
        $ic100$ = SubLObjectFactory.makeSymbol("S#9750", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("DEFSTRUCT-VECTOR");
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"));
        $ic103$ = SubLObjectFactory.makeSymbol("S#9947", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#9752", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#9753", "CYC");
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic107$ = SubLObjectFactory.makeSymbol("DEFVAR");
        $ic108$ = SubLObjectFactory.makeSymbol("S#9754", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#9755", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("DEFVAR-PRIVATE");
        $ic111$ = SubLObjectFactory.makeSymbol("S#9756", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#9757", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("CLEAR-API-USER-VARIABLES");
        $ic114$ = SubLObjectFactory.makeString("Removes all user variables.");
        $ic115$ = ConsesLow.list((SubLObject)module0112.NIL);
        $ic116$ = SubLObjectFactory.makeSymbol("PUT-API-USER-VARIABLE");
        $ic117$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic118$ = SubLObjectFactory.makeString("Sets the value of a the user variable VAR to the given VALUE.");
        $ic119$ = SubLObjectFactory.makeSymbol("GET-API-USER-VARIABLE");
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"));
        $ic121$ = SubLObjectFactory.makeString("Gets the value of a the user variable VAR.");
        $ic122$ = SubLObjectFactory.makeSymbol("S#9948", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#9760", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("S#9761", "CYC");
        $ic125$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#9949", "CYC"));
        $ic126$ = SubLObjectFactory.makeSymbol("S#9762", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#9763", "CYC");
        $ic128$ = SubLObjectFactory.makeString("~S is not a symbol");
        $ic129$ = SubLObjectFactory.makeString("~S is not defined");
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9941", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#126", "CYC"), (SubLObject)module0112.ONE_INTEGER));
        $ic131$ = SubLObjectFactory.makeString("~S is not an api variable");
        $ic132$ = SubLObjectFactory.makeSymbol("CINC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#9765", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#9766", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("CDEC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#9767", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#9768", "CYC");
        $ic138$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"));
        $ic139$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic140$ = SubLObjectFactory.makeSymbol("S#9769", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#9770", "CYC");
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"));
        $ic143$ = SubLObjectFactory.makeSymbol("CPOP");
        $ic144$ = SubLObjectFactory.makeSymbol("S#9771", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#9772", "CYC");
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"));
        $ic147$ = SubLObjectFactory.makeSymbol("S#9773", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#9711", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#9774", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#9950", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#9775", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#9776", "CYC");
        $ic153$ = SubLObjectFactory.makeSymbol("S#9951", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("S#9777", "CYC");
        $ic155$ = SubLObjectFactory.makeSymbol("S#9778", "CYC");
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#160", "CYC"));
        $ic157$ = SubLObjectFactory.makeSymbol("APPLY");
        $ic158$ = SubLObjectFactory.makeSymbol("S#9779", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#9780", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"));
        $ic161$ = SubLObjectFactory.makeSymbol("FBOUNDP");
        $ic162$ = SubLObjectFactory.makeSymbol("S#9784", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#9785", "CYC");
        $ic164$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#160", "CYC"));
        $ic165$ = SubLObjectFactory.makeSymbol("FUNCALL");
        $ic166$ = SubLObjectFactory.makeSymbol("S#9786", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#9787", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#9788", "CYC");
        $ic169$ = SubLObjectFactory.makeSymbol("S#9789", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("TRACE");
        $ic171$ = SubLObjectFactory.makeSymbol("S#9790", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("S#9791", "CYC");
        $ic173$ = SubLObjectFactory.makeSymbol("UNTRACE");
        $ic174$ = SubLObjectFactory.makeSymbol("S#9793", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#9794", "CYC");
        $ic176$ = SubLObjectFactory.makeString("~%");
        $ic177$ = SubLObjectFactory.makeString("~A~D: ~S~%");
        $ic178$ = SubLObjectFactory.makeString("");
        $ic179$ = SubLObjectFactory.makeString("~S ");
        $ic180$ = SubLObjectFactory.makeString("~A~D: returned ~A~%");
        $ic181$ = SubLObjectFactory.makeSymbol("S#9953", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#9799", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#9800", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#9954", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#9801", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#9802", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic188$ = SubLObjectFactory.makeSymbol("S#9804", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#9805", "CYC");
        $ic190$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic191$ = SubLObjectFactory.makeSymbol("S#9807", "CYC");
        $ic192$ = SubLObjectFactory.makeString("clet error");
        $ic193$ = SubLObjectFactory.makeSymbol("S#9808", "CYC");
        $ic194$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9955", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#9956", "CYC"));
        $ic195$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9957", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic196$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic197$ = SubLObjectFactory.makeSymbol("S#9811", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#9812", "CYC");
        $ic199$ = SubLObjectFactory.makeSymbol("CAND");
        $ic200$ = SubLObjectFactory.makeSymbol("S#9814", "CYC");
        $ic201$ = SubLObjectFactory.makeSymbol("S#9815", "CYC");
        $ic202$ = SubLObjectFactory.makeSymbol("COR");
        $ic203$ = SubLObjectFactory.makeSymbol("S#9816", "CYC");
        $ic204$ = SubLObjectFactory.makeSymbol("S#9817", "CYC");
        $ic205$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic206$ = SubLObjectFactory.makeSymbol("S#9818", "CYC");
        $ic207$ = SubLObjectFactory.makeSymbol("S#9819", "CYC");
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic209$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic210$ = SubLObjectFactory.makeSymbol("S#9820", "CYC");
        $ic211$ = SubLObjectFactory.makeSymbol("S#9821", "CYC");
        $ic212$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#163", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#164", "CYC"));
        $ic213$ = SubLObjectFactory.makeSymbol("PIF");
        $ic214$ = SubLObjectFactory.makeSymbol("S#9822", "CYC");
        $ic215$ = SubLObjectFactory.makeSymbol("S#9823", "CYC");
        $ic216$ = SubLObjectFactory.makeSymbol("FIF");
        $ic217$ = SubLObjectFactory.makeSymbol("S#9825", "CYC");
        $ic218$ = SubLObjectFactory.makeSymbol("S#9826", "CYC");
        $ic219$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic220$ = SubLObjectFactory.makeSymbol("S#9827", "CYC");
        $ic221$ = SubLObjectFactory.makeSymbol("S#9828", "CYC");
        $ic222$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#163", "CYC"));
        $ic223$ = SubLObjectFactory.makeSymbol("WHEN");
        $ic224$ = SubLObjectFactory.makeSymbol("S#9829", "CYC");
        $ic225$ = SubLObjectFactory.makeSymbol("S#9830", "CYC");
        $ic226$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic227$ = SubLObjectFactory.makeSymbol("S#9831", "CYC");
        $ic228$ = SubLObjectFactory.makeSymbol("S#9832", "CYC");
        $ic229$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic230$ = SubLObjectFactory.makeSymbol("S#9833", "CYC");
        $ic231$ = SubLObjectFactory.makeSymbol("S#9834", "CYC");
        $ic232$ = SubLObjectFactory.makeSymbol("FUNLESS");
        $ic233$ = SubLObjectFactory.makeSymbol("S#9835", "CYC");
        $ic234$ = SubLObjectFactory.makeSymbol("S#9836", "CYC");
        $ic235$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic236$ = SubLObjectFactory.makeSymbol("S#9837", "CYC");
        $ic237$ = SubLObjectFactory.makeSymbol("S#9838", "CYC");
        $ic238$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic239$ = SubLObjectFactory.makeSymbol("S#9839", "CYC");
        $ic240$ = SubLObjectFactory.makeSymbol("S#9840", "CYC");
        $ic241$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9958", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic242$ = SubLObjectFactory.makeString("~S is not a valid cdo variable specification in SubL");
        $ic243$ = SubLObjectFactory.makeSymbol("CDO");
        $ic244$ = SubLObjectFactory.makeSymbol("S#9841", "CYC");
        $ic245$ = SubLObjectFactory.makeSymbol("S#9842", "CYC");
        $ic246$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic247$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic248$ = SubLObjectFactory.makeSymbol("S#9843", "CYC");
        $ic249$ = SubLObjectFactory.makeSymbol("S#9844", "CYC");
        $ic250$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic251$ = SubLObjectFactory.makeSymbol("CDOTIMES");
        $ic252$ = SubLObjectFactory.makeSymbol("S#9846", "CYC");
        $ic253$ = SubLObjectFactory.makeSymbol("S#9847", "CYC");
        $ic254$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic255$ = SubLObjectFactory.makeSymbol("CDOHASH");
        $ic256$ = SubLObjectFactory.makeSymbol("S#9849", "CYC");
        $ic257$ = SubLObjectFactory.makeSymbol("S#9850", "CYC");
        $ic258$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#9959", "CYC"));
        $ic259$ = SubLObjectFactory.makeSymbol("MAPCAR");
        $ic260$ = SubLObjectFactory.makeSymbol("S#9852", "CYC");
        $ic261$ = SubLObjectFactory.makeSymbol("S#9853", "CYC");
        $ic262$ = SubLObjectFactory.makeString("~S does not evaluate to an api function object");
        $ic263$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic264$ = SubLObjectFactory.makeSymbol("S#9854", "CYC");
        $ic265$ = SubLObjectFactory.makeSymbol("REST");
        $ic266$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9960", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"));
        $ic267$ = SubLObjectFactory.makeSymbol("S#6458", "CYC");
        $ic268$ = SubLObjectFactory.makeSymbol("S#9856", "CYC");
        $ic269$ = SubLObjectFactory.makeSymbol("S#9857", "CYC");
        $ic270$ = SubLObjectFactory.makeKeyword("ALIST");
        $ic271$ = SubLObjectFactory.makeKeyword("HASHTABLE");
        $ic272$ = SubLObjectFactory.makeString("Corrupted dictionary; unsupported style ~S.~%");
        $ic273$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9960", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic274$ = SubLObjectFactory.makeSymbol("S#6459", "CYC");
        $ic275$ = SubLObjectFactory.makeSymbol("S#9861", "CYC");
        $ic276$ = SubLObjectFactory.makeSymbol("S#9862", "CYC");
        $ic277$ = SubLObjectFactory.makeString("evaluated-dict");
        $ic278$ = SubLObjectFactory.makeString("evaluated-func");
        $ic279$ = SubLObjectFactory.makeString("evaluated-args");
        $ic280$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#768", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic281$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic282$ = SubLObjectFactory.makeSymbol("S#9866", "CYC");
        $ic283$ = SubLObjectFactory.makeSymbol("S#9867", "CYC");
        $ic284$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9961", "CYC"));
        $ic285$ = SubLObjectFactory.makeSymbol("S#9961", "CYC");
        $ic286$ = SubLObjectFactory.makeSymbol("S#9764", "CYC");
        $ic287$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"));
        $ic288$ = SubLObjectFactory.makeSymbol("THROW");
        $ic289$ = SubLObjectFactory.makeSymbol("S#9869", "CYC");
        $ic290$ = SubLObjectFactory.makeSymbol("S#9870", "CYC");
        $ic291$ = SubLObjectFactory.makeSymbol("S#9712", "CYC");
        $ic292$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $ic293$ = SubLObjectFactory.makeSymbol("S#9872", "CYC");
        $ic294$ = SubLObjectFactory.makeSymbol("S#9873", "CYC");
        $ic295$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9962", "CYC"));
        $ic296$ = SubLObjectFactory.makeSymbol("S#9962", "CYC");
        $ic297$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#152", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic298$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic299$ = SubLObjectFactory.makeSymbol("S#9875", "CYC");
        $ic300$ = SubLObjectFactory.makeSymbol("S#9876", "CYC");
        $ic301$ = SubLObjectFactory.makeSymbol(">");
        $ic302$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("S#9913", "CYC"));
        $ic303$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("S#9913", "CYC")));
        $ic304$ = SubLObjectFactory.makeString("eval-in-api-cunwind-protect");
        $ic305$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"));
        $ic306$ = SubLObjectFactory.makeSymbol("LOAD");
        $ic307$ = SubLObjectFactory.makeSymbol("S#9878", "CYC");
        $ic308$ = SubLObjectFactory.makeSymbol("S#9879", "CYC");
        $ic309$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic310$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic311$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic312$ = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $ic313$ = SubLObjectFactory.makeString("~S does not exist, cannot load");
        $ic314$ = SubLObjectFactory.makeKeyword("EOF");
        $ic315$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic316$ = SubLObjectFactory.makeString("~%Read error occured at position ~A of file ~A");
        $ic317$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic318$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic319$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic320$ = SubLObjectFactory.makeSymbol("S#9881", "CYC");
        $ic321$ = SubLObjectFactory.makeSymbol("S#9882", "CYC");
        $ic322$ = SubLObjectFactory.makeSymbol("S#9883", "CYC");
        $ic323$ = SubLObjectFactory.makeSymbol("S#9884", "CYC");
        $ic324$ = SubLObjectFactory.makeSymbol("BOUNDP");
        $ic325$ = SubLObjectFactory.makeSymbol("S#9885", "CYC");
        $ic326$ = SubLObjectFactory.makeSymbol("S#9886", "CYC");
        $ic327$ = SubLObjectFactory.makeSymbol("SYMBOL-VALUE");
        $ic328$ = SubLObjectFactory.makeSymbol("S#9887", "CYC");
        $ic329$ = SubLObjectFactory.makeSymbol("S#9888", "CYC");
        $ic330$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9963", "CYC"));
        $ic331$ = SubLObjectFactory.makeSymbol("FUNCTION");
        $ic332$ = SubLObjectFactory.makeSymbol("S#9889", "CYC");
        $ic333$ = SubLObjectFactory.makeSymbol("S#9890", "CYC");
        $ic334$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#159", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#160", "CYC"));
        $ic335$ = SubLObjectFactory.makeSymbol("ERROR");
        $ic336$ = SubLObjectFactory.makeSymbol("S#9892", "CYC");
        $ic337$ = SubLObjectFactory.makeSymbol("S#9893", "CYC");
        $ic338$ = SubLObjectFactory.makeString("~%~S");
        $ic339$ = SubLObjectFactory.makeSymbol("BREAK");
        $ic340$ = SubLObjectFactory.makeSymbol("S#9894", "CYC");
        $ic341$ = SubLObjectFactory.makeSymbol("S#9895", "CYC");
        $ic342$ = SubLObjectFactory.makeString("Can only clear the environment from the top level");
        $ic343$ = SubLObjectFactory.makeSymbol("S#9964", "CYC");
        $ic344$ = SubLObjectFactory.makeSymbol("S#9896", "CYC");
        $ic345$ = SubLObjectFactory.makeSymbol("S#9897", "CYC");
        $ic346$ = SubLObjectFactory.makeSymbol("S#9965", "CYC");
        $ic347$ = SubLObjectFactory.makeSymbol("S#9898", "CYC");
        $ic348$ = SubLObjectFactory.makeSymbol("S#9899", "CYC");
        $ic349$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PACKAGE"));
        $ic350$ = SubLObjectFactory.makeSymbol("IN-PACKAGE");
        $ic351$ = SubLObjectFactory.makeSymbol("S#9900", "CYC");
        $ic352$ = SubLObjectFactory.makeSymbol("S#9901", "CYC");
        $ic353$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic354$ = SubLObjectFactory.makeSymbol("CTIME");
        $ic355$ = SubLObjectFactory.makeSymbol("S#9902", "CYC");
        $ic356$ = SubLObjectFactory.makeSymbol("S#9903", "CYC");
        $ic357$ = SubLObjectFactory.makeSymbol("S#1", "CYC");
        $ic358$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9966", "CYC"));
        $ic359$ = SubLObjectFactory.makeSymbol("S#9966", "CYC");
        $ic360$ = SubLObjectFactory.makeSymbol("S#9726", "CYC");
        $ic361$ = SubLObjectFactory.makeString("eval-in-api-ctime");
        $ic362$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic363$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic364$ = SubLObjectFactory.makeSymbol("S#9905", "CYC");
        $ic365$ = SubLObjectFactory.makeSymbol("S#9906", "CYC");
        $ic366$ = SubLObjectFactory.makeString("eval-in-api-noting-percent-progress");
        $ic367$ = SubLObjectFactory.makeSymbol("NOTING-ACTIVITY");
        $ic368$ = SubLObjectFactory.makeSymbol("S#9908", "CYC");
        $ic369$ = SubLObjectFactory.makeSymbol("S#9909", "CYC");
        $ic370$ = SubLObjectFactory.makeString("eval-in-api-noting-activity");
        $ic371$ = SubLObjectFactory.makeSymbol("MUST");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0112.class
	Total time: 1296 ms
	
	Decompiled with Procyon 0.5.32.
*/