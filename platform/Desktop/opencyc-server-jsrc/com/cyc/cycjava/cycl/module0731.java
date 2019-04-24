package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0731 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0731";
    public static final String myFingerPrint = "e5c67479d038b7ea633b2ef48cb92b5e19bf357b477dc5857aba511854b7d048";
    private static SubLSymbol $g5757$;
    private static SubLSymbol $g5758$;
    private static SubLSymbol $g5759$;
    private static SubLSymbol $g5760$;
    private static SubLSymbol $g5761$;
    private static SubLSymbol $g5762$;
    private static SubLSymbol $g5763$;
    private static SubLSymbol $g5764$;
    private static SubLSymbol $g5765$;
    private static SubLSymbol $g5766$;
    private static SubLSymbol $g5767$;
    private static SubLSymbol $g5768$;
    private static SubLSymbol $g5769$;
    private static SubLSymbol $g5770$;
    private static SubLSymbol $g5771$;
    private static SubLSymbol $g5772$;
    private static SubLSymbol $g5773$;
    private static SubLSymbol $g5774$;
    private static SubLSymbol $g5775$;
    private static SubLSymbol $g5776$;
    private static SubLSymbol $g5777$;
    private static SubLSymbol $g5778$;
    private static SubLSymbol $g5779$;
    private static SubLSymbol $g5780$;
    private static SubLSymbol $g5781$;
    private static SubLSymbol $g5782$;
    private static SubLSymbol $g5783$;
    private static SubLSymbol $g5784$;
    public static SubLSymbol $g5785$;
    private static SubLSymbol $g5786$;
    private static SubLSymbol $g5787$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLInteger $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLObject $ic78$;
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
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLInteger $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLList $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLList $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLInteger $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLObject $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLObject $ic168$;
    private static final SubLList $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLList $ic180$;
    private static final SubLString $ic181$;
    private static final SubLList $ic182$;
    private static final SubLList $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLObject $ic187$;
    private static final SubLObject $ic188$;
    private static final SubLObject $ic189$;
    private static final SubLObject $ic190$;
    private static final SubLObject $ic191$;
    private static final SubLObject $ic192$;
    private static final SubLObject $ic193$;
    private static final SubLObject $ic194$;
    private static final SubLObject $ic195$;
    private static final SubLObject $ic196$;
    private static final SubLString $ic197$;
    private static final SubLList $ic198$;
    private static final SubLList $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLList $ic206$;
    private static final SubLString $ic207$;
    private static final SubLList $ic208$;
    private static final SubLList $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLList $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLList $ic216$;
    private static final SubLString $ic217$;
    private static final SubLList $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLObject $ic220$;
    private static final SubLObject $ic221$;
    private static final SubLObject $ic222$;
    private static final SubLString $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLObject $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLList $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLList $ic231$;
    private static final SubLList $ic232$;
    private static final SubLList $ic233$;
    private static final SubLList $ic234$;
    private static final SubLObject $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLObject $ic237$;
    private static final SubLObject $ic238$;
    private static final SubLObject $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLObject $ic242$;
    private static final SubLObject $ic243$;
    private static final SubLObject $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLList $ic246$;
    private static final SubLList $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLObject $ic249$;
    private static final SubLObject $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLObject $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLObject $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLObject $ic260$;
    private static final SubLObject $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLList $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLObject $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLObject $ic272$;
    private static final SubLObject $ic273$;
    private static final SubLObject $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLObject $ic278$;
    private static final SubLList $ic279$;
    private static final SubLObject $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLList $ic283$;
    private static final SubLList $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLList $ic290$;
    private static final SubLObject $ic291$;
    private static final SubLObject $ic292$;
    private static final SubLObject $ic293$;
    private static final SubLObject $ic294$;
    private static final SubLList $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLList $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLList $ic306$;
    private static final SubLString $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    
    public static SubLObject f44644(final SubLObject var1, final SubLObject var2) {
        if (var1.equal(var2) || var2.eql(module0731.$ic0$) || var1.eql(module0731.$ic1$)) {
            return (SubLObject)module0731.T;
        }
        return f44645(var1, var2);
    }
    
    public static SubLObject f44646() {
        final SubLObject var3 = module0731.$g5757$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44647(final SubLObject var1, final SubLObject var2) {
        return module0034.f1829(module0731.$g5757$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var2), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44648(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0731.NIL;
        final SubLObject var5 = module0147.f9540(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var8 = module0147.$g2096$.currentBinding(var3);
        try {
            module0147.$g2095$.bind(module0147.f9545(var5), var3);
            module0147.$g2094$.bind(module0147.f9546(var5), var3);
            module0147.$g2096$.bind(module0147.f9549(var5), var3);
            var4 = module0147.f9507(var2);
        }
        finally {
            module0147.$g2096$.rebind(var8, var3);
            module0147.$g2094$.rebind(var7, var3);
            module0147.$g2095$.rebind(var6, var3);
        }
        return var4;
    }
    
    public static SubLObject f44645(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0731.$g5757$.getGlobalValue();
        if (module0731.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0731.$ic2$, (SubLObject)module0731.$ic3$, (SubLObject)module0731.$ic4$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
            module0034.f1943((SubLObject)module0731.$ic5$);
        }
        final SubLObject var4 = module0034.f1782(var1, var2);
        final SubLObject var5 = module0034.f1814(var3, var4, (SubLObject)module0731.UNPROVIDED);
        if (var5 != module0731.$ic6$) {
            SubLObject var6 = var5;
            SubLObject var7 = (SubLObject)module0731.NIL;
            var7 = var6.first();
            while (module0731.NIL != var6) {
                SubLObject var8 = var7.first();
                final SubLObject var9 = conses_high.second(var7);
                if (var1.equal(var8.first())) {
                    var8 = var8.rest();
                    if (module0731.NIL != var8 && module0731.NIL == var8.rest() && var2.equal(var8.first())) {
                        return module0034.f1959(var9);
                    }
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        final SubLObject var10 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44648(var1, var2)));
        module0034.f1836(var3, var4, var5, var10, (SubLObject)ConsesLow.list(var1, var2));
        return module0034.f1959(var10);
    }
    
    public static SubLObject f44649() {
        f44650();
        f44651();
        f44652();
        f44653();
        f44654();
        return (SubLObject)module0731.$ic7$;
    }
    
    public static SubLObject f44655(SubLObject var18, final SubLObject var19, SubLObject var20) {
        if (var20 == module0731.UNPROVIDED) {
            var20 = (SubLObject)module0731.NIL;
        }
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        if (var18 == module0731.$ic9$) {
            var18 = f44657();
        }
        final SubLObject var21 = (module0731.NIL != var20) ? f44658(var19) : f44659(var19);
        return (SubLObject)((module0731.NIL != var18 && module0731.NIL != var21) ? module0732.f44942(var18, var21, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED) : module0731.NIL);
    }
    
    public static SubLObject f44657() {
        return (SubLObject)ConsesLow.list(module0584.$g4425$.getGlobalValue());
    }
    
    public static SubLObject f44650() {
        f44660();
        f44661();
        f44662();
        module0732.f44936();
        f44663();
        f44664();
        f44665();
        f44666();
        return (SubLObject)module0731.$ic10$;
    }
    
    public static SubLObject f44667(final SubLObject var18, final SubLObject var19, final SubLObject var22, SubLObject var20) {
        if (var20 == module0731.UNPROVIDED) {
            var20 = (SubLObject)module0731.NIL;
        }
        return (SubLObject)((module0731.NIL != module0018.f971()) ? conses_high.copy_list(f44668(var18, var19, var22, var20)) : module0731.NIL);
    }
    
    public static SubLObject f44660() {
        final SubLObject var3 = module0731.$g5758$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44669(final SubLObject var18, final SubLObject var19, final SubLObject var22, final SubLObject var20) {
        return module0034.f1829(module0731.$g5758$.getGlobalValue(), (SubLObject)ConsesLow.list(var18, var19, var22, var20), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44670(final SubLObject var18, final SubLObject var19, final SubLObject var22, final SubLObject var20) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f44655(var18, var19, var20);
        SubLObject var25 = (SubLObject)module0731.NIL;
        final SubLObject var26 = module0147.$g2095$.currentBinding(var23);
        final SubLObject var27 = module0147.$g2094$.currentBinding(var23);
        final SubLObject var28 = module0147.$g2096$.currentBinding(var23);
        try {
            module0147.$g2095$.bind(module0147.f9545(var22), var23);
            module0147.$g2094$.bind(module0147.f9546(var22), var23);
            module0147.$g2096$.bind(module0147.f9549(var22), var23);
            final SubLObject var29 = f44671(var24, (SubLObject)module0731.UNPROVIDED);
            var25 = ((module0731.NIL != var29) ? var29 : var24);
        }
        finally {
            module0147.$g2096$.rebind(var28, var23);
            module0147.$g2094$.rebind(var27, var23);
            module0147.$g2095$.rebind(var26, var23);
        }
        return var25;
    }
    
    public static SubLObject f44668(final SubLObject var18, final SubLObject var19, final SubLObject var22, final SubLObject var20) {
        SubLObject var23 = module0731.$g5758$.getGlobalValue();
        if (module0731.NIL == var23) {
            var23 = module0034.f1934((SubLObject)module0731.$ic11$, (SubLObject)module0731.$ic12$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQUAL, (SubLObject)module0731.FOUR_INTEGER, (SubLObject)module0731.$ic13$);
        }
        final SubLObject var24 = module0034.f1780(var18, var19, var22, var20);
        final SubLObject var25 = module0034.f1814(var23, var24, (SubLObject)module0731.UNPROVIDED);
        if (var25 != module0731.$ic6$) {
            SubLObject var26 = var25;
            SubLObject var27 = (SubLObject)module0731.NIL;
            var27 = var26.first();
            while (module0731.NIL != var26) {
                SubLObject var28 = var27.first();
                final SubLObject var29 = conses_high.second(var27);
                if (var18.equal(var28.first())) {
                    var28 = var28.rest();
                    if (var19.equal(var28.first())) {
                        var28 = var28.rest();
                        if (var22.equal(var28.first())) {
                            var28 = var28.rest();
                            if (module0731.NIL != var28 && module0731.NIL == var28.rest() && var20.equal(var28.first())) {
                                return module0034.f1959(var29);
                            }
                        }
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        final SubLObject var30 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44670(var18, var19, var22, var20)));
        module0034.f1836(var23, var24, var25, var30, (SubLObject)ConsesLow.list(var18, var19, var22, var20));
        return module0034.f1959(var30);
    }
    
    public static SubLObject f44658(final SubLObject var19) {
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        SubLObject var20 = (SubLObject)module0731.NIL;
        SubLObject var21 = module0256.f16552(var19, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        SubLObject var22 = (SubLObject)module0731.NIL;
        var22 = var21.first();
        while (module0731.NIL != var21) {
            SubLObject var13_26 = module0732.f44924(var22, (SubLObject)module0731.UNPROVIDED);
            SubLObject var23 = (SubLObject)module0731.NIL;
            var23 = var13_26.first();
            while (module0731.NIL != var13_26) {
                final SubLObject var24 = var23;
                if (module0731.NIL == conses_high.member(var24, var20, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                    var20 = (SubLObject)ConsesLow.cons(var24, var20);
                }
                var13_26 = var13_26.rest();
                var23 = var13_26.first();
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return var20;
    }
    
    public static SubLObject f44661() {
        final SubLObject var3 = module0731.$g5759$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44672(final SubLObject var19) {
        return module0034.f1829(module0731.$g5759$.getGlobalValue(), (SubLObject)ConsesLow.list(var19), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44673(final SubLObject var19) {
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        return f44674(module0732.f44924(var19, (SubLObject)module0731.UNPROVIDED));
    }
    
    public static SubLObject f44659(final SubLObject var19) {
        SubLObject var20 = module0731.$g5759$.getGlobalValue();
        if (module0731.NIL == var20) {
            var20 = module0034.f1934((SubLObject)module0731.$ic14$, (SubLObject)module0731.$ic15$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQL, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
            module0034.f1947((SubLObject)module0731.$ic16$);
        }
        SubLObject var21 = module0034.f1814(var20, var19, (SubLObject)module0731.$ic6$);
        if (var21 == module0731.$ic6$) {
            var21 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44673(var19)));
            module0034.f1816(var20, var19, var21, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var21);
    }
    
    public static SubLObject f44662() {
        final SubLObject var3 = module0731.$g5760$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44675(final SubLObject var19) {
        return module0034.f1829(module0731.$g5760$.getGlobalValue(), (SubLObject)ConsesLow.list(var19), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44676(final SubLObject var19) {
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        return f44674(module0732.f44934(var19));
    }
    
    public static SubLObject f44677(final SubLObject var19) {
        SubLObject var20 = module0731.$g5760$.getGlobalValue();
        if (module0731.NIL == var20) {
            var20 = module0034.f1934((SubLObject)module0731.$ic17$, (SubLObject)module0731.$ic18$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQL, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
            module0034.f1947((SubLObject)module0731.$ic19$);
        }
        SubLObject var21 = module0034.f1814(var20, var19, (SubLObject)module0731.$ic6$);
        if (var21 == module0731.$ic6$) {
            var21 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44676(var19)));
            module0034.f1816(var20, var19, var21, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var21);
    }
    
    public static SubLObject f44674(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0731.NIL;
        final SubLObject var35;
        final SubLObject var34 = var35 = module0034.f1888();
        final SubLObject var36 = module0034.$g879$.currentBinding(var32);
        try {
            module0034.$g879$.bind(var35, var32);
            SubLObject var37 = (SubLObject)module0731.NIL;
            if (module0731.NIL != var35 && module0731.NIL == module0034.f1842(var35)) {
                var37 = module0034.f1869(var35);
                final SubLObject var38 = Threads.current_process();
                if (module0731.NIL == var37) {
                    module0034.f1873(var35, var38);
                }
                else if (!var37.eql(var38)) {
                    Errors.error((SubLObject)module0731.$ic20$);
                }
            }
            try {
                final SubLObject var7_36 = module0147.$g2094$.currentBinding(var32);
                final SubLObject var39 = module0147.$g2095$.currentBinding(var32);
                try {
                    module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var32);
                    module0147.$g2095$.bind(module0731.$ic22$, var32);
                    SubLObject var40;
                    SubLObject var42;
                    SubLObject var41;
                    SubLObject var43;
                    SubLObject var44;
                    SubLObject var45;
                    SubLObject var46;
                    SubLObject var47;
                    for (var40 = (SubLObject)module0731.NIL, var40 = var31; module0731.NIL != var40; var40 = var40.rest()) {
                        var41 = (var42 = var40);
                        var43 = (SubLObject)module0731.NIL;
                        var44 = (SubLObject)module0731.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0731.$ic23$);
                        var43 = var42.first();
                        var42 = (var44 = var42.rest());
                        var45 = (SubLObject)module0731.NIL;
                        if (module0731.NIL == var45) {
                            var46 = var44;
                            var47 = (SubLObject)module0731.NIL;
                            var47 = var46.first();
                            while (module0731.NIL == var45 && module0731.NIL != var46) {
                                if (module0731.NIL != module0004.f104(var43, f44678(var47), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) {
                                    var45 = (SubLObject)module0731.T;
                                }
                                var46 = var46.rest();
                                var47 = var46.first();
                            }
                        }
                        if (module0731.NIL == var45) {
                            var46 = var33;
                            var47 = (SubLObject)module0731.NIL;
                            var47 = var46.first();
                            while (module0731.NIL == var45 && module0731.NIL != var46) {
                                if (module0731.NIL != module0004.f104(var43, f44678(var47), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) {
                                    var45 = (SubLObject)module0731.T;
                                }
                                var46 = var46.rest();
                                var47 = var46.first();
                            }
                        }
                        if (module0731.NIL == var45) {
                            var33 = (SubLObject)ConsesLow.cons(var43, var33);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var39, var32);
                    module0147.$g2094$.rebind(var7_36, var32);
                }
            }
            finally {
                final SubLObject var7_37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var32);
                    if (module0731.NIL != var35 && module0731.NIL == var37) {
                        module0034.f1873(var35, (SubLObject)module0731.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_37, var32);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var36, var32);
        }
        return var33;
    }
    
    public static SubLObject f44679(final SubLObject var46) {
        return module0260.f17034(var46, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44678(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0034.$g879$.getDynamicValue(var47);
        SubLObject var49 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var48) {
            return f44679(var46);
        }
        var49 = module0034.f1857(var48, (SubLObject)module0731.$ic24$, (SubLObject)module0731.UNPROVIDED);
        if (module0731.NIL == var49) {
            var49 = module0034.f1807(module0034.f1842(var48), (SubLObject)module0731.$ic24$, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.NIL, (SubLObject)module0731.EQL, (SubLObject)module0731.UNPROVIDED);
            module0034.f1860(var48, (SubLObject)module0731.$ic24$, var49);
        }
        SubLObject var50 = module0034.f1814(var49, var46, (SubLObject)module0731.$ic6$);
        if (var50 == module0731.$ic6$) {
            var50 = Values.arg2(var47.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44679(var46)));
            module0034.f1816(var49, var46, var50, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var50);
    }
    
    public static SubLObject f44671(final SubLObject var21, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0147.$g2095$.getDynamicValue();
        }
        return conses_high.copy_list(f44680(var21, var22));
    }
    
    public static SubLObject f44663() {
        final SubLObject var3 = module0731.$g5761$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44681(final SubLObject var21, final SubLObject var22) {
        return module0034.f1829(module0731.$g5761$.getGlobalValue(), (SubLObject)ConsesLow.list(var21, var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44682(final SubLObject var21, final SubLObject var22) {
        return module0260.f17086(var21, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44680(final SubLObject var21, final SubLObject var22) {
        SubLObject var23 = module0731.$g5761$.getGlobalValue();
        if (module0731.NIL == var23) {
            var23 = module0034.f1934((SubLObject)module0731.$ic25$, (SubLObject)module0731.$ic26$, (SubLObject)module0731.$ic27$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
            module0034.f1947((SubLObject)module0731.$ic28$);
        }
        final SubLObject var24 = module0034.f1782(var21, var22);
        final SubLObject var25 = module0034.f1814(var23, var24, (SubLObject)module0731.UNPROVIDED);
        if (var25 != module0731.$ic6$) {
            SubLObject var26 = var25;
            SubLObject var27 = (SubLObject)module0731.NIL;
            var27 = var26.first();
            while (module0731.NIL != var26) {
                SubLObject var28 = var27.first();
                final SubLObject var29 = conses_high.second(var27);
                if (var21.equal(var28.first())) {
                    var28 = var28.rest();
                    if (module0731.NIL != var28 && module0731.NIL == var28.rest() && var22.equal(var28.first())) {
                        return module0034.f1959(var29);
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        final SubLObject var30 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44682(var21, var22)));
        module0034.f1836(var23, var24, var25, var30, (SubLObject)ConsesLow.list(var21, var22));
        return module0034.f1959(var30);
    }
    
    public static SubLObject f44683(final SubLObject var21, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLObject var23 = f44684(var21, var22);
        return conses_high.copy_list(var23);
    }
    
    public static SubLObject f44664() {
        final SubLObject var3 = module0731.$g5762$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44685(final SubLObject var21, final SubLObject var22) {
        return module0034.f1829(module0731.$g5762$.getGlobalValue(), (SubLObject)ConsesLow.list(var21, var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44686(final SubLObject var21, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0731.NIL;
        final SubLObject var25 = module0147.f9540(var22);
        final SubLObject var26 = module0147.$g2095$.currentBinding(var23);
        final SubLObject var27 = module0147.$g2094$.currentBinding(var23);
        final SubLObject var28 = module0147.$g2096$.currentBinding(var23);
        try {
            module0147.$g2095$.bind(module0147.f9545(var25), var23);
            module0147.$g2094$.bind(module0147.f9546(var25), var23);
            module0147.$g2096$.bind(module0147.f9549(var25), var23);
            var24 = module0260.f17087(var21, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var28, var23);
            module0147.$g2094$.rebind(var27, var23);
            module0147.$g2095$.rebind(var26, var23);
        }
        return var24;
    }
    
    public static SubLObject f44684(final SubLObject var21, final SubLObject var22) {
        SubLObject var23 = module0731.$g5762$.getGlobalValue();
        if (module0731.NIL == var23) {
            var23 = module0034.f1934((SubLObject)module0731.$ic29$, (SubLObject)module0731.$ic30$, (SubLObject)module0731.$ic27$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
            module0034.f1947((SubLObject)module0731.$ic31$);
        }
        final SubLObject var24 = module0034.f1782(var21, var22);
        final SubLObject var25 = module0034.f1814(var23, var24, (SubLObject)module0731.UNPROVIDED);
        if (var25 != module0731.$ic6$) {
            SubLObject var26 = var25;
            SubLObject var27 = (SubLObject)module0731.NIL;
            var27 = var26.first();
            while (module0731.NIL != var26) {
                SubLObject var28 = var27.first();
                final SubLObject var29 = conses_high.second(var27);
                if (var21.equal(var28.first())) {
                    var28 = var28.rest();
                    if (module0731.NIL != var28 && module0731.NIL == var28.rest() && var22.equal(var28.first())) {
                        return module0034.f1959(var29);
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        final SubLObject var30 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44686(var21, var22)));
        module0034.f1836(var23, var24, var25, var30, (SubLObject)ConsesLow.list(var21, var22));
        return module0034.f1959(var30);
    }
    
    public static SubLObject f44687() {
        final SubLObject var3 = module0731.$g5763$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44688(final SubLObject var27) {
        return module0034.f1829(module0731.$g5763$.getGlobalValue(), (SubLObject)ConsesLow.list(var27), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44689(final SubLObject var27) {
        assert module0731.NIL != f44690(var27, (SubLObject)module0731.UNPROVIDED) : var27;
        return (SubLObject)((module0731.NIL != module0212.f13762(var27) && module0731.NIL != module0128.f8463(module0731.$ic34$, (SubLObject)module0731.UNPROVIDED)) ? Sort.sort(module0220.f14565(var27, module0731.$ic34$, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.UNPROVIDED), (SubLObject)module0731.$ic35$, (SubLObject)module0731.UNPROVIDED).first() : module0731.NIL);
    }
    
    public static SubLObject f44691(final SubLObject var27) {
        SubLObject var28 = module0731.$g5763$.getGlobalValue();
        if (module0731.NIL == var28) {
            var28 = module0034.f1934((SubLObject)module0731.$ic32$, (SubLObject)module0731.$ic36$, (SubLObject)module0731.$ic37$, (SubLObject)module0731.EQL, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic13$);
        }
        SubLObject var29 = module0034.f1814(var28, var27, (SubLObject)module0731.$ic6$);
        if (var29 == module0731.$ic6$) {
            var29 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44689(var27)));
            module0034.f1816(var28, var27, var29, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var29);
    }
    
    public static SubLObject f44692(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        if (module0731.NIL == module0128.f8463(module0731.$ic38$, (SubLObject)module0731.UNPROVIDED) || module0731.NIL == module0256.f16598(var19, module0731.$ic38$)) {
            return (SubLObject)module0731.NIL;
        }
        SubLObject var21 = (SubLObject)module0731.NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var20);
            module0147.$g2095$.bind(module0731.$ic22$, var20);
            if (module0731.NIL != module0128.f8463(module0731.$ic39$, (SubLObject)module0731.UNPROVIDED) && module0731.NIL == var21) {
                SubLObject var24 = module0732.f44924(var19, (SubLObject)module0731.UNPROVIDED);
                SubLObject var25 = (SubLObject)module0731.NIL;
                var25 = var24.first();
                while (module0731.NIL == var21 && module0731.NIL != var24) {
                    if (module0731.NIL != module0260.f17091(var25, module0731.$ic39$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) {
                        var21 = var25;
                    }
                    var24 = var24.rest();
                    var25 = var24.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var23, var20);
            module0147.$g2094$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f44693(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        if (module0731.NIL == module0128.f8463(module0731.$ic38$, (SubLObject)module0731.UNPROVIDED) || module0731.NIL == module0256.f16598(var19, module0731.$ic38$)) {
            return (SubLObject)module0731.NIL;
        }
        SubLObject var21 = (SubLObject)module0731.NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var20);
            module0147.$g2095$.bind(module0731.$ic22$, var20);
            if (module0731.NIL != module0128.f8463(module0731.$ic40$, (SubLObject)module0731.UNPROVIDED) && module0731.NIL == var21) {
                SubLObject var24 = module0732.f44924(var19, (SubLObject)module0731.UNPROVIDED);
                SubLObject var25 = (SubLObject)module0731.NIL;
                var25 = var24.first();
                while (module0731.NIL == var21 && module0731.NIL != var24) {
                    if (module0731.NIL != module0260.f17091(var25, module0731.$ic40$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) {
                        var21 = var25;
                    }
                    var24 = var24.rest();
                    var25 = var24.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var23, var20);
            module0147.$g2094$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f44694() {
        return module0731.$g5764$.getGlobalValue();
    }
    
    public static SubLObject f44665() {
        module0728.f44448();
        return Hashtables.clrhash(module0731.$g5764$.getGlobalValue());
    }
    
    public static SubLObject f44651() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f44665();
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var4);
            module0147.$g2095$.bind(module0731.$ic22$, var4);
            if (module0731.NIL != module0128.f8463(module0731.$ic43$, (SubLObject)module0731.UNPROVIDED)) {
                final SubLObject var7 = module0731.$ic43$;
                if (module0731.NIL != module0158.f10038(var7)) {
                    final SubLObject var8 = (SubLObject)module0731.NIL;
                    final SubLObject var7_52 = module0012.$g73$.currentBinding(var4);
                    final SubLObject var8_53 = module0012.$g65$.currentBinding(var4);
                    final SubLObject var9 = module0012.$g67$.currentBinding(var4);
                    final SubLObject var10 = module0012.$g68$.currentBinding(var4);
                    final SubLObject var11 = module0012.$g66$.currentBinding(var4);
                    final SubLObject var12 = module0012.$g69$.currentBinding(var4);
                    final SubLObject var13 = module0012.$g70$.currentBinding(var4);
                    final SubLObject var14 = module0012.$silent_progressP$.currentBinding(var4);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var4);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
                        module0012.$g67$.bind((SubLObject)module0731.ONE_INTEGER, var4);
                        module0012.$g68$.bind((SubLObject)module0731.ZERO_INTEGER, var4);
                        module0012.$g66$.bind((SubLObject)module0731.ZERO_INTEGER, var4);
                        module0012.$g69$.bind((SubLObject)module0731.ZERO_INTEGER, var4);
                        module0012.$g70$.bind((SubLObject)module0731.T, var4);
                        module0012.$silent_progressP$.bind((SubLObject)((module0731.NIL != var8) ? module0012.$silent_progressP$.getDynamicValue(var4) : module0731.T), var4);
                        module0012.f474(var8);
                        final SubLObject var15 = module0158.f10039(var7);
                        SubLObject var16 = (SubLObject)module0731.NIL;
                        final SubLObject var17 = (SubLObject)module0731.NIL;
                        while (module0731.NIL == var16) {
                            final SubLObject var18 = module0052.f3695(var15, var17);
                            final SubLObject var19 = (SubLObject)SubLObjectFactory.makeBoolean(!var17.eql(var18));
                            if (module0731.NIL != var19) {
                                module0012.f476();
                                SubLObject var20 = (SubLObject)module0731.NIL;
                                try {
                                    var20 = module0158.f10316(var18, (SubLObject)module0731.$ic44$, (SubLObject)module0731.NIL, (SubLObject)module0731.NIL);
                                    SubLObject var60_65 = (SubLObject)module0731.NIL;
                                    final SubLObject var61_66 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var60_65) {
                                        final SubLObject var21 = module0052.f3695(var20, var61_66);
                                        final SubLObject var63_68 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_66.eql(var21));
                                        if (module0731.NIL != var63_68) {
                                            final SubLObject var22 = module0178.f11334(var21);
                                            final SubLObject var23 = module0178.f11287(var21);
                                            module0030.f1600(var22, var23, module0731.$g5764$.getGlobalValue(), (SubLObject)module0731.UNPROVIDED);
                                        }
                                        var60_65 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_68);
                                    }
                                }
                                finally {
                                    final SubLObject var7_53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var4);
                                        if (module0731.NIL != var20) {
                                            module0158.f10319(var20);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_53, var4);
                                    }
                                }
                            }
                            var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var19);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var14, var4);
                        module0012.$g70$.rebind(var13, var4);
                        module0012.$g69$.rebind(var12, var4);
                        module0012.$g66$.rebind(var11, var4);
                        module0012.$g68$.rebind(var10, var4);
                        module0012.$g67$.rebind(var9, var4);
                        module0012.$g65$.rebind(var8_53, var4);
                        module0012.$g73$.rebind(var7_52, var4);
                    }
                }
            }
            if (module0731.NIL != module0128.f8463(module0731.$ic45$, (SubLObject)module0731.UNPROVIDED) && module0731.NIL != module0128.f8463(module0731.$ic34$, (SubLObject)module0731.UNPROVIDED)) {
                SubLObject var24 = module0731.$ic45$;
                final SubLObject var25 = (SubLObject)module0731.$ic48$;
                final SubLObject var26 = module0056.f4145(var25);
                final SubLObject var7_54 = module0139.$g1635$.currentBinding(var4);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var4);
                    final SubLObject var27 = (SubLObject)module0731.NIL;
                    final SubLObject var7_55 = module0141.$g1714$.currentBinding(var4);
                    final SubLObject var8_54 = module0141.$g1715$.currentBinding(var4);
                    try {
                        module0141.$g1714$.bind((module0731.NIL != var27) ? var27 : module0141.f9283(), var4);
                        module0141.$g1715$.bind((SubLObject)((module0731.NIL != var27) ? module0731.$ic49$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                        if (module0731.NIL != var27 && module0731.NIL != module0136.f8864() && module0731.NIL == module0141.f9279(var27)) {
                            final SubLObject var28 = module0136.$g1591$.getDynamicValue(var4);
                            if (var28.eql((SubLObject)module0731.$ic50$)) {
                                module0136.f8870((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic51$, var27, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var28.eql((SubLObject)module0731.$ic53$)) {
                                module0136.f8871((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var27, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var28.eql((SubLObject)module0731.$ic55$)) {
                                Errors.warn((SubLObject)module0731.$ic51$, var27, (SubLObject)module0731.$ic52$);
                            }
                            else {
                                Errors.warn((SubLObject)module0731.$ic56$, module0136.$g1591$.getDynamicValue(var4));
                                Errors.cerror((SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var27, (SubLObject)module0731.$ic52$);
                            }
                        }
                        final SubLObject var7_56 = module0141.$g1670$.currentBinding(var4);
                        final SubLObject var8_55 = module0141.$g1671$.currentBinding(var4);
                        final SubLObject var29 = module0141.$g1672$.currentBinding(var4);
                        final SubLObject var30 = module0141.$g1674$.currentBinding(var4);
                        final SubLObject var31 = module0137.$g1605$.currentBinding(var4);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0731.$ic57$), var4);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                            module0137.$g1605$.bind(module0137.f8955(module0731.$ic57$), var4);
                            if (module0731.NIL != module0136.f8865() || module0731.NIL != module0244.f15795(module0731.$ic45$, module0137.f8955((SubLObject)module0731.UNPROVIDED))) {
                                final SubLObject var7_57 = module0141.$g1677$.currentBinding(var4);
                                final SubLObject var8_56 = module0138.$g1619$.currentBinding(var4);
                                final SubLObject var9_83 = module0141.$g1674$.currentBinding(var4);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var4);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0731.$ic57$)), var4);
                                    module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                    module0249.f16055(var24, (SubLObject)module0731.UNPROVIDED);
                                    while (module0731.NIL != var24) {
                                        final SubLObject var32 = var24;
                                        final SubLObject var33 = module0731.$ic34$;
                                        if (module0731.NIL != module0158.f10010(var32, (SubLObject)module0731.NIL, var33)) {
                                            final SubLObject var34 = module0158.f10011(var32, (SubLObject)module0731.NIL, var33);
                                            SubLObject var35 = (SubLObject)module0731.NIL;
                                            final SubLObject var36 = (SubLObject)module0731.NIL;
                                            while (module0731.NIL == var35) {
                                                final SubLObject var37 = module0052.f3695(var34, var36);
                                                final SubLObject var38 = (SubLObject)SubLObjectFactory.makeBoolean(!var36.eql(var37));
                                                if (module0731.NIL != var38) {
                                                    SubLObject var39 = (SubLObject)module0731.NIL;
                                                    try {
                                                        var39 = module0158.f10316(var37, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                                        SubLObject var60_66 = (SubLObject)module0731.NIL;
                                                        final SubLObject var61_67 = (SubLObject)module0731.NIL;
                                                        while (module0731.NIL == var60_66) {
                                                            final SubLObject var40 = module0052.f3695(var39, var61_67);
                                                            final SubLObject var63_69 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_67.eql(var40));
                                                            if (module0731.NIL != var63_69) {
                                                                final SubLObject var41 = module0178.f11335(var40);
                                                                final SubLObject var42 = module0178.f11287(var40);
                                                                module0030.f1600(var41, var42, module0731.$g5764$.getGlobalValue(), (SubLObject)module0731.UNPROVIDED);
                                                            }
                                                            var60_66 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_69);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var7_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var4);
                                                            if (module0731.NIL != var39) {
                                                                module0158.f10319(var39);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_58, var4);
                                                        }
                                                    }
                                                }
                                                var35 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var38);
                                            }
                                        }
                                        SubLObject var44;
                                        final SubLObject var43 = var44 = module0200.f12443(module0137.f8955(module0731.$ic57$));
                                        SubLObject var45 = (SubLObject)module0731.NIL;
                                        var45 = var44.first();
                                        while (module0731.NIL != var44) {
                                            final SubLObject var7_59 = module0137.$g1605$.currentBinding(var4);
                                            final SubLObject var8_57 = module0141.$g1674$.currentBinding(var4);
                                            try {
                                                module0137.$g1605$.bind(var45, var4);
                                                module0141.$g1674$.bind((SubLObject)((module0731.NIL != module0141.f9205((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0731.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                final SubLObject var46 = module0228.f15229(var24);
                                                if (module0731.NIL != module0138.f8992(var46)) {
                                                    final SubLObject var47 = module0242.f15664(var46, module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                    if (module0731.NIL != var47) {
                                                        final SubLObject var48 = module0245.f15834(var47, module0138.f8979(), module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                        if (module0731.NIL != var48) {
                                                            SubLObject var49;
                                                            for (var49 = module0066.f4838(module0067.f4891(var48)); module0731.NIL == module0066.f4841(var49); var49 = module0066.f4840(var49)) {
                                                                var4.resetMultipleValues();
                                                                final SubLObject var50 = module0066.f4839(var49);
                                                                final SubLObject var51 = var4.secondMultipleValue();
                                                                var4.resetMultipleValues();
                                                                if (module0731.NIL != module0147.f9507(var50)) {
                                                                    final SubLObject var7_60 = module0138.$g1623$.currentBinding(var4);
                                                                    try {
                                                                        module0138.$g1623$.bind(var50, var4);
                                                                        SubLObject var98_102;
                                                                        for (var98_102 = module0066.f4838(module0067.f4891(var51)); module0731.NIL == module0066.f4841(var98_102); var98_102 = module0066.f4840(var98_102)) {
                                                                            var4.resetMultipleValues();
                                                                            final SubLObject var52 = module0066.f4839(var98_102);
                                                                            final SubLObject var53 = var4.secondMultipleValue();
                                                                            var4.resetMultipleValues();
                                                                            if (module0731.NIL != module0141.f9289(var52)) {
                                                                                final SubLObject var7_61 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var52, var4);
                                                                                    final SubLObject var54 = var53;
                                                                                    if (module0731.NIL != module0077.f5302(var54)) {
                                                                                        final SubLObject var55 = module0077.f5333(var54);
                                                                                        SubLObject var56;
                                                                                        SubLObject var57;
                                                                                        SubLObject var58;
                                                                                        for (var56 = module0032.f1741(var55), var57 = (SubLObject)module0731.NIL, var57 = module0032.f1742(var56, var55); module0731.NIL == module0032.f1744(var56, var57); var57 = module0032.f1743(var57)) {
                                                                                            var58 = module0032.f1745(var56, var57);
                                                                                            if (module0731.NIL != module0032.f1746(var57, var58) && module0731.NIL == module0249.f16059(var58, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var58, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var58, var26);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var54.isList()) {
                                                                                        SubLObject var59 = var54;
                                                                                        SubLObject var60 = (SubLObject)module0731.NIL;
                                                                                        var60 = var59.first();
                                                                                        while (module0731.NIL != var59) {
                                                                                            if (module0731.NIL == module0249.f16059(var60, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var60, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var60, var26);
                                                                                            }
                                                                                            var59 = var59.rest();
                                                                                            var60 = var59.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0731.$ic59$, var54);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_61, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var98_102);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_60, var4);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var49);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic60$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0731.NIL != module0155.f9785(var46, (SubLObject)module0731.UNPROVIDED)) {
                                                    SubLObject var13_112;
                                                    final SubLObject var61 = var13_112 = ((module0731.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED)));
                                                    SubLObject var62 = (SubLObject)module0731.NIL;
                                                    var62 = var13_112.first();
                                                    while (module0731.NIL != var13_112) {
                                                        final SubLObject var7_62 = module0138.$g1625$.currentBinding(var4);
                                                        try {
                                                            module0138.$g1625$.bind(var62, var4);
                                                            final SubLObject var64;
                                                            final SubLObject var63 = var64 = Functions.funcall(var62, var46);
                                                            if (module0731.NIL != module0077.f5302(var64)) {
                                                                final SubLObject var65 = module0077.f5333(var64);
                                                                SubLObject var66;
                                                                SubLObject var67;
                                                                SubLObject var68;
                                                                for (var66 = module0032.f1741(var65), var67 = (SubLObject)module0731.NIL, var67 = module0032.f1742(var66, var65); module0731.NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                    var68 = module0032.f1745(var66, var67);
                                                                    if (module0731.NIL != module0032.f1746(var67, var68) && module0731.NIL == module0249.f16059(var68, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var68, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var68, var26);
                                                                    }
                                                                }
                                                            }
                                                            else if (var64.isList()) {
                                                                SubLObject var69 = var64;
                                                                SubLObject var70 = (SubLObject)module0731.NIL;
                                                                var70 = var69.first();
                                                                while (module0731.NIL != var69) {
                                                                    if (module0731.NIL == module0249.f16059(var70, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var70, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var70, var26);
                                                                    }
                                                                    var69 = var69.rest();
                                                                    var70 = var69.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0731.$ic59$, var64);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_62, var4);
                                                        }
                                                        var13_112 = var13_112.rest();
                                                        var62 = var13_112.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_57, var4);
                                                module0137.$g1605$.rebind(var7_59, var4);
                                            }
                                            var44 = var44.rest();
                                            var45 = var44.first();
                                        }
                                        var24 = module0056.f4150(var26);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var9_83, var4);
                                    module0138.$g1619$.rebind(var8_56, var4);
                                    module0141.$g1677$.rebind(var7_57, var4);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.$ic61$, module0731.$ic45$, module0244.f15748(module0137.f8955((SubLObject)module0731.UNPROVIDED)), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var31, var4);
                            module0141.$g1674$.rebind(var30, var4);
                            module0141.$g1672$.rebind(var29, var4);
                            module0141.$g1671$.rebind(var8_55, var4);
                            module0141.$g1670$.rebind(var7_56, var4);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_54, var4);
                        module0141.$g1714$.rebind(var7_55, var4);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1635$.rebind(var7_54, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return module0731.$g5764$.getGlobalValue();
    }
    
    public static SubLObject f44695(final SubLObject var115, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        if (!Hashtables.hash_table_count(module0731.$g5764$.getGlobalValue()).isPositive()) {
            f44651();
        }
        final SubLObject var116 = Hashtables.gethash(var115, module0731.$g5764$.getGlobalValue(), (SubLObject)module0731.UNPROVIDED);
        SubLObject var117 = Equality.eq(var22, module0731.$ic1$);
        if (module0731.NIL == var117) {
            SubLObject var118;
            SubLObject var119;
            for (var118 = var116, var119 = (SubLObject)module0731.NIL, var119 = var118.first(); module0731.NIL == var117 && module0731.NIL != var118; var117 = f44644(var22, var119), var118 = var118.rest(), var119 = var118.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != var116 && module0731.NIL != var117);
    }
    
    public static SubLObject f44696(final SubLObject var27, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic62$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0731.NIL;
        if (module0731.NIL != f44695(var27, var22)) {
            final SubLObject var30 = module0147.f9540(var22);
            final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
            final SubLObject var32 = module0147.$g2094$.currentBinding(var28);
            final SubLObject var33 = module0147.$g2096$.currentBinding(var28);
            try {
                module0147.$g2095$.bind(module0147.f9545(var30), var28);
                module0147.$g2094$.bind(module0147.f9546(var30), var28);
                module0147.$g2096$.bind(module0147.f9549(var30), var28);
                final SubLObject var34 = module0731.$ic43$;
                if (module0731.NIL != module0158.f10010(var27, (SubLObject)module0731.ONE_INTEGER, var34)) {
                    final SubLObject var35 = module0158.f10011(var27, (SubLObject)module0731.ONE_INTEGER, var34);
                    SubLObject var36 = (SubLObject)module0731.NIL;
                    final SubLObject var37 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var36) {
                        final SubLObject var38 = module0052.f3695(var35, var37);
                        final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                        if (module0731.NIL != var39) {
                            SubLObject var40 = (SubLObject)module0731.NIL;
                            try {
                                var40 = module0158.f10316(var38, (SubLObject)module0731.$ic44$, (SubLObject)module0731.NIL, (SubLObject)module0731.NIL);
                                SubLObject var60_120 = (SubLObject)module0731.NIL;
                                final SubLObject var61_121 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_120) {
                                    final SubLObject var41 = module0052.f3695(var40, var61_121);
                                    final SubLObject var63_123 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_121.eql(var41));
                                    if (module0731.NIL != var63_123) {
                                        final SubLObject var42 = module0178.f11335(var41);
                                        var29 = conses_high.union(var29, f44696(var42, (SubLObject)module0731.UNPROVIDED), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                    }
                                    var60_120 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_123);
                                }
                            }
                            finally {
                                final SubLObject var7_125 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var28);
                                    if (module0731.NIL != var40) {
                                        module0158.f10319(var40);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_125, var28);
                                }
                            }
                        }
                        var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var39);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var33, var28);
                module0147.$g2094$.rebind(var32, var28);
                module0147.$g2095$.rebind(var31, var28);
            }
        }
        return (SubLObject)((module0731.NIL != var29) ? var29 : ConsesLow.list(var27));
    }
    
    public static SubLObject f44697(final SubLObject var126, final SubLObject var127) {
        SubLObject var129;
        final SubLObject var128 = var129 = var126.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var129, var128, (SubLObject)module0731.$ic64$);
        final SubLObject var130 = var129.rest();
        var129 = var129.first();
        SubLObject var131 = (SubLObject)module0731.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var129, var128, (SubLObject)module0731.$ic64$);
        var131 = var129.first();
        var129 = var129.rest();
        SubLObject var132 = (SubLObject)module0731.NIL;
        SubLObject var133 = var129;
        SubLObject var134 = (SubLObject)module0731.NIL;
        SubLObject var134_135 = (SubLObject)module0731.NIL;
        while (module0731.NIL != var133) {
            cdestructuring_bind.destructuring_bind_must_consp(var133, var128, (SubLObject)module0731.$ic64$);
            var134_135 = var133.first();
            var133 = var133.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var133, var128, (SubLObject)module0731.$ic64$);
            if (module0731.NIL == conses_high.member(var134_135, (SubLObject)module0731.$ic65$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) {
                var134 = (SubLObject)module0731.T;
            }
            if (var134_135 == module0731.$ic66$) {
                var132 = var133.first();
            }
            var133 = var133.rest();
        }
        if (module0731.NIL != var134 && module0731.NIL == var132) {
            cdestructuring_bind.cdestructuring_bind_error(var128, (SubLObject)module0731.$ic64$);
        }
        final SubLObject var135 = cdestructuring_bind.property_list_member((SubLObject)module0731.$ic67$, var129);
        final SubLObject var136 = (module0731.NIL != var135) ? conses_high.cadr(var135) : module0731.$ic1$;
        final SubLObject var137 = cdestructuring_bind.property_list_member((SubLObject)module0731.$ic68$, var129);
        final SubLObject var138 = (SubLObject)((module0731.NIL != var137) ? conses_high.cadr(var137) : module0731.NIL);
        final SubLObject var139;
        var129 = (var139 = var130);
        final SubLObject var140 = (SubLObject)module0731.$ic69$;
        return (SubLObject)ConsesLow.list((SubLObject)module0731.$ic70$, (SubLObject)module0731.$ic71$, (SubLObject)ConsesLow.list((SubLObject)module0731.$ic72$, (SubLObject)ConsesLow.list(var131, var140, (SubLObject)module0731.$ic63$, var138), (SubLObject)ConsesLow.listS((SubLObject)module0731.$ic73$, (SubLObject)ConsesLow.list((SubLObject)module0731.$ic74$, (SubLObject)ConsesLow.listS((SubLObject)module0731.EQ, var136, (SubLObject)module0731.$ic75$), (SubLObject)ConsesLow.list((SubLObject)module0731.$ic76$, var136, var140)), ConsesLow.append(var139, (SubLObject)module0731.NIL))));
    }
    
    public static SubLObject f44698() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0067.f4852(module0731.$g5765$.getGlobalValue()) && module0731.NIL == module0067.f4882(module0731.$g5765$.getGlobalValue()));
    }
    
    public static SubLObject f44666() {
        if (module0731.NIL == module0067.f4852(module0731.$g5765$.getGlobalValue())) {
            module0731.$g5765$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0731.EQ), (SubLObject)module0731.$ic42$));
        }
        return module0067.f4881(module0731.$g5765$.getGlobalValue());
    }
    
    public static SubLObject f44654() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f44666();
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var4);
            module0147.$g2095$.bind(module0731.$ic22$, var4);
            if (module0731.NIL != module0128.f8463(module0731.$ic77$, (SubLObject)module0731.UNPROVIDED)) {
                SubLObject var7 = module0731.$ic77$;
                final SubLObject var8 = (SubLObject)module0731.$ic48$;
                final SubLObject var9 = module0056.f4145(var8);
                final SubLObject var7_141 = module0139.$g1635$.currentBinding(var4);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var4);
                    final SubLObject var10 = (SubLObject)module0731.NIL;
                    final SubLObject var7_142 = module0141.$g1714$.currentBinding(var4);
                    final SubLObject var8_143 = module0141.$g1715$.currentBinding(var4);
                    try {
                        module0141.$g1714$.bind((module0731.NIL != var10) ? var10 : module0141.f9283(), var4);
                        module0141.$g1715$.bind((SubLObject)((module0731.NIL != var10) ? module0731.$ic49$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                        if (module0731.NIL != var10 && module0731.NIL != module0136.f8864() && module0731.NIL == module0141.f9279(var10)) {
                            final SubLObject var11 = module0136.$g1591$.getDynamicValue(var4);
                            if (var11.eql((SubLObject)module0731.$ic50$)) {
                                module0136.f8870((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0731.$ic53$)) {
                                module0136.f8871((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0731.$ic55$)) {
                                Errors.warn((SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                            }
                            else {
                                Errors.warn((SubLObject)module0731.$ic56$, module0136.$g1591$.getDynamicValue(var4));
                                Errors.cerror((SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                            }
                        }
                        final SubLObject var7_143 = module0141.$g1670$.currentBinding(var4);
                        final SubLObject var8_144 = module0141.$g1671$.currentBinding(var4);
                        final SubLObject var12 = module0141.$g1672$.currentBinding(var4);
                        final SubLObject var13 = module0141.$g1674$.currentBinding(var4);
                        final SubLObject var14 = module0137.$g1605$.currentBinding(var4);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0731.$ic57$), var4);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                            module0137.$g1605$.bind(module0137.f8955(module0731.$ic57$), var4);
                            if (module0731.NIL != module0136.f8865() || module0731.NIL != module0244.f15795(module0731.$ic77$, module0137.f8955((SubLObject)module0731.UNPROVIDED))) {
                                final SubLObject var7_144 = module0141.$g1677$.currentBinding(var4);
                                final SubLObject var8_145 = module0138.$g1619$.currentBinding(var4);
                                final SubLObject var9_148 = module0141.$g1674$.currentBinding(var4);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var4);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0731.$ic57$)), var4);
                                    module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                    module0249.f16055(var7, (SubLObject)module0731.UNPROVIDED);
                                    while (module0731.NIL != var7) {
                                        final SubLObject var15 = var7;
                                        final SubLObject var16 = module0731.$ic78$;
                                        if (module0731.NIL != module0158.f10010(var15, (SubLObject)module0731.TWO_INTEGER, var16)) {
                                            final SubLObject var17 = module0158.f10011(var15, (SubLObject)module0731.TWO_INTEGER, var16);
                                            SubLObject var18 = (SubLObject)module0731.NIL;
                                            final SubLObject var19 = (SubLObject)module0731.NIL;
                                            while (module0731.NIL == var18) {
                                                final SubLObject var20 = module0052.f3695(var17, var19);
                                                final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                                if (module0731.NIL != var21) {
                                                    SubLObject var22 = (SubLObject)module0731.NIL;
                                                    try {
                                                        var22 = module0158.f10316(var20, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                                        SubLObject var60_150 = (SubLObject)module0731.NIL;
                                                        final SubLObject var61_151 = (SubLObject)module0731.NIL;
                                                        while (module0731.NIL == var60_150) {
                                                            final SubLObject var23 = module0052.f3695(var22, var61_151);
                                                            final SubLObject var63_152 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_151.eql(var23));
                                                            if (module0731.NIL != var63_152) {
                                                                final SubLObject var24 = module0178.f11334(var23);
                                                                final SubLObject var25 = module0178.f11287(var23);
                                                                module0084.f5762(module0731.$g5765$.getGlobalValue(), var24, var25);
                                                                module0735.f45260(var24);
                                                            }
                                                            var60_150 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_152);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var7_145 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var4);
                                                            if (module0731.NIL != var22) {
                                                                module0158.f10319(var22);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_145, var4);
                                                        }
                                                    }
                                                }
                                                var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var21);
                                            }
                                        }
                                        SubLObject var27;
                                        final SubLObject var26 = var27 = module0200.f12443(module0137.f8955(module0731.$ic57$));
                                        SubLObject var28 = (SubLObject)module0731.NIL;
                                        var28 = var27.first();
                                        while (module0731.NIL != var27) {
                                            final SubLObject var7_146 = module0137.$g1605$.currentBinding(var4);
                                            final SubLObject var8_146 = module0141.$g1674$.currentBinding(var4);
                                            try {
                                                module0137.$g1605$.bind(var28, var4);
                                                module0141.$g1674$.bind((SubLObject)((module0731.NIL != module0141.f9205((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0731.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                final SubLObject var29 = module0228.f15229(var7);
                                                if (module0731.NIL != module0138.f8992(var29)) {
                                                    final SubLObject var30 = module0242.f15664(var29, module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                    if (module0731.NIL != var30) {
                                                        final SubLObject var31 = module0245.f15834(var30, module0138.f8979(), module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                        if (module0731.NIL != var31) {
                                                            SubLObject var32;
                                                            for (var32 = module0066.f4838(module0067.f4891(var31)); module0731.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
                                                                var4.resetMultipleValues();
                                                                final SubLObject var33 = module0066.f4839(var32);
                                                                final SubLObject var34 = var4.secondMultipleValue();
                                                                var4.resetMultipleValues();
                                                                if (module0731.NIL != module0147.f9507(var33)) {
                                                                    final SubLObject var7_147 = module0138.$g1623$.currentBinding(var4);
                                                                    try {
                                                                        module0138.$g1623$.bind(var33, var4);
                                                                        SubLObject var98_157;
                                                                        for (var98_157 = module0066.f4838(module0067.f4891(var34)); module0731.NIL == module0066.f4841(var98_157); var98_157 = module0066.f4840(var98_157)) {
                                                                            var4.resetMultipleValues();
                                                                            final SubLObject var35 = module0066.f4839(var98_157);
                                                                            final SubLObject var36 = var4.secondMultipleValue();
                                                                            var4.resetMultipleValues();
                                                                            if (module0731.NIL != module0141.f9289(var35)) {
                                                                                final SubLObject var7_148 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var35, var4);
                                                                                    final SubLObject var37 = var36;
                                                                                    if (module0731.NIL != module0077.f5302(var37)) {
                                                                                        final SubLObject var38 = module0077.f5333(var37);
                                                                                        SubLObject var39;
                                                                                        SubLObject var40;
                                                                                        SubLObject var41;
                                                                                        for (var39 = module0032.f1741(var38), var40 = (SubLObject)module0731.NIL, var40 = module0032.f1742(var39, var38); module0731.NIL == module0032.f1744(var39, var40); var40 = module0032.f1743(var40)) {
                                                                                            var41 = module0032.f1745(var39, var40);
                                                                                            if (module0731.NIL != module0032.f1746(var40, var41) && module0731.NIL == module0249.f16059(var41, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var41, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var41, var9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var37.isList()) {
                                                                                        SubLObject var42 = var37;
                                                                                        SubLObject var43 = (SubLObject)module0731.NIL;
                                                                                        var43 = var42.first();
                                                                                        while (module0731.NIL != var42) {
                                                                                            if (module0731.NIL == module0249.f16059(var43, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var43, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var43, var9);
                                                                                            }
                                                                                            var42 = var42.rest();
                                                                                            var43 = var42.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0731.$ic59$, var37);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_148, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var98_157);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_147, var4);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var32);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic60$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0731.NIL != module0155.f9785(var29, (SubLObject)module0731.UNPROVIDED)) {
                                                    SubLObject var13_159;
                                                    final SubLObject var44 = var13_159 = ((module0731.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED)));
                                                    SubLObject var45 = (SubLObject)module0731.NIL;
                                                    var45 = var13_159.first();
                                                    while (module0731.NIL != var13_159) {
                                                        final SubLObject var7_149 = module0138.$g1625$.currentBinding(var4);
                                                        try {
                                                            module0138.$g1625$.bind(var45, var4);
                                                            final SubLObject var47;
                                                            final SubLObject var46 = var47 = Functions.funcall(var45, var29);
                                                            if (module0731.NIL != module0077.f5302(var47)) {
                                                                final SubLObject var48 = module0077.f5333(var47);
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                for (var49 = module0032.f1741(var48), var50 = (SubLObject)module0731.NIL, var50 = module0032.f1742(var49, var48); module0731.NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                    var51 = module0032.f1745(var49, var50);
                                                                    if (module0731.NIL != module0032.f1746(var50, var51) && module0731.NIL == module0249.f16059(var51, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var51, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var51, var9);
                                                                    }
                                                                }
                                                            }
                                                            else if (var47.isList()) {
                                                                SubLObject var52 = var47;
                                                                SubLObject var53 = (SubLObject)module0731.NIL;
                                                                var53 = var52.first();
                                                                while (module0731.NIL != var52) {
                                                                    if (module0731.NIL == module0249.f16059(var53, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var53, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var53, var9);
                                                                    }
                                                                    var52 = var52.rest();
                                                                    var53 = var52.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0731.$ic59$, var47);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_149, var4);
                                                        }
                                                        var13_159 = var13_159.rest();
                                                        var45 = var13_159.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_146, var4);
                                                module0137.$g1605$.rebind(var7_146, var4);
                                            }
                                            var27 = var27.rest();
                                            var28 = var27.first();
                                        }
                                        var7 = module0056.f4150(var9);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var9_148, var4);
                                    module0138.$g1619$.rebind(var8_145, var4);
                                    module0141.$g1677$.rebind(var7_144, var4);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.$ic61$, module0731.$ic77$, module0244.f15748(module0137.f8955((SubLObject)module0731.UNPROVIDED)), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var14, var4);
                            module0141.$g1674$.rebind(var13, var4);
                            module0141.$g1672$.rebind(var12, var4);
                            module0141.$g1671$.rebind(var8_144, var4);
                            module0141.$g1670$.rebind(var7_143, var4);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_143, var4);
                        module0141.$g1714$.rebind(var7_142, var4);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1635$.rebind(var7_141, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return module0731.$g5765$.getGlobalValue();
    }
    
    public static SubLObject f44699() {
        if (module0731.NIL == f44698()) {
            f44654();
        }
        return (SubLObject)module0731.$ic7$;
    }
    
    public static SubLObject f44690(final SubLObject var115, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        f44699();
        final SubLObject var116 = module0067.f4885(module0731.$g5765$.getGlobalValue(), var115, (SubLObject)module0731.UNPROVIDED);
        SubLObject var117 = Equality.eq(var22, module0731.$ic1$);
        if (module0731.NIL == var117) {
            SubLObject var118;
            SubLObject var119;
            for (var118 = var116, var119 = (SubLObject)module0731.NIL, var119 = var118.first(); module0731.NIL == var117 && module0731.NIL != var118; var117 = f44644(var22, var119), var118 = var118.rest(), var119 = var118.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != var116 && module0731.NIL != var117);
    }
    
    public static SubLObject f44700(SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        f44699();
        if (var22.eql(module0731.$ic1$)) {
            return module0067.f4902(module0731.$g5765$.getGlobalValue());
        }
        SubLObject var24 = (SubLObject)module0731.NIL;
        SubLObject var25;
        for (var25 = module0066.f4838(module0067.f4891(module0731.$g5765$.getGlobalValue())); module0731.NIL == module0066.f4841(var25); var25 = module0066.f4840(var25)) {
            var23.resetMultipleValues();
            final SubLObject var26 = module0066.f4839(var25);
            final SubLObject var27 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            SubLObject var28 = (SubLObject)module0731.NIL;
            if (module0731.NIL == var28) {
                SubLObject var29;
                SubLObject var30;
                for (var29 = var27, var30 = (SubLObject)module0731.NIL, var30 = var29.first(); module0731.NIL == var28 && module0731.NIL != var29; var28 = f44644(var22, var30), var29 = var29.rest(), var30 = var29.first()) {}
            }
            if (module0731.NIL != var28) {
                var24 = (SubLObject)ConsesLow.cons(var26, var24);
            }
        }
        module0066.f4842(var25);
        return var24;
    }
    
    public static SubLObject f44701(final SubLObject var166, final SubLObject var167, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return f44702(var167, var166, var22);
    }
    
    public static SubLObject f44703() {
        final SubLObject var3 = module0731.$g5766$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44704(final SubLObject var166, final SubLObject var167, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0731.$g5766$.getGlobalValue(), (SubLObject)ConsesLow.list(var166, var167, var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44705(final SubLObject var166, final SubLObject var167, final SubLObject var22) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        if (var166.equal(var167)) {
            return (SubLObject)module0731.T;
        }
        SubLObject var169 = (SubLObject)module0731.NIL;
        final SubLObject var170 = module0147.f9540(var22);
        final SubLObject var171 = module0147.$g2095$.currentBinding(var168);
        final SubLObject var172 = module0147.$g2094$.currentBinding(var168);
        final SubLObject var173 = module0147.$g2096$.currentBinding(var168);
        try {
            module0147.$g2095$.bind(module0147.f9545(var170), var168);
            module0147.$g2094$.bind(module0147.f9546(var170), var168);
            module0147.$g2096$.bind(module0147.f9549(var170), var168);
            var169 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0173.f10955(var166) && module0731.NIL != module0260.f17091(var166, var167, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
        }
        finally {
            module0147.$g2096$.rebind(var173, var168);
            module0147.$g2094$.rebind(var172, var168);
            module0147.$g2095$.rebind(var171, var168);
        }
        return var169;
    }
    
    public static SubLObject f44702(final SubLObject var166, final SubLObject var167, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var168 = module0731.$g5766$.getGlobalValue();
        if (module0731.NIL == var168) {
            var168 = module0034.f1934((SubLObject)module0731.$ic79$, (SubLObject)module0731.$ic80$, (SubLObject)module0731.$ic4$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.THREE_INTEGER, (SubLObject)module0731.$ic37$);
            module0034.f1947((SubLObject)module0731.$ic81$);
        }
        final SubLObject var169 = module0034.f1781(var166, var167, var22);
        final SubLObject var170 = module0034.f1814(var168, var169, (SubLObject)module0731.UNPROVIDED);
        if (var170 != module0731.$ic6$) {
            SubLObject var171 = var170;
            SubLObject var172 = (SubLObject)module0731.NIL;
            var172 = var171.first();
            while (module0731.NIL != var171) {
                SubLObject var173 = var172.first();
                final SubLObject var174 = conses_high.second(var172);
                if (var166.equal(var173.first())) {
                    var173 = var173.rest();
                    if (var167.equal(var173.first())) {
                        var173 = var173.rest();
                        if (module0731.NIL != var173 && module0731.NIL == var173.rest() && var22.equal(var173.first())) {
                            return module0034.f1959(var174);
                        }
                    }
                }
                var171 = var171.rest();
                var172 = var171.first();
            }
        }
        final SubLObject var175 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44705(var166, var167, var22)));
        module0034.f1836(var168, var169, var170, var175, (SubLObject)ConsesLow.list(var166, var167, var22));
        return module0034.f1959(var175);
    }
    
    public static SubLObject f44706() {
        final SubLObject var3 = module0731.$g5767$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44707(final SubLObject var166, final SubLObject var167, SubLObject var168) {
        if (var168 == module0731.UNPROVIDED) {
            var168 = module0584.f35776();
        }
        return module0034.f1829(module0731.$g5767$.getGlobalValue(), (SubLObject)ConsesLow.list(var166, var167, var168), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44708(final SubLObject var166, final SubLObject var167, final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        SubLObject var170 = (SubLObject)module0731.NIL;
        if (module0731.NIL != module0147.f9491(var168, (SubLObject)module0731.$ic21$)) {
            final SubLObject var171 = module0147.$g2094$.currentBinding(var169);
            final SubLObject var172 = module0147.$g2095$.currentBinding(var169);
            try {
                module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var169);
                module0147.$g2095$.bind(module0731.$ic22$, var169);
                var170 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0173.f10955(var166) && module0731.NIL != module0260.f17091(var166, var167, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
            }
            finally {
                module0147.$g2095$.rebind(var172, var169);
                module0147.$g2094$.rebind(var171, var169);
            }
        }
        else if (module0731.NIL != module0147.f9491(var168, (SubLObject)module0731.$ic83$)) {
            final SubLObject var171 = module0147.$g2094$.currentBinding(var169);
            final SubLObject var172 = module0147.$g2095$.currentBinding(var169);
            try {
                module0147.$g2094$.bind((SubLObject)module0731.$ic83$, var169);
                module0147.$g2095$.bind(module0731.$ic1$, var169);
                var170 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0173.f10955(var166) && module0731.NIL != module0260.f17091(var166, var167, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
            }
            finally {
                module0147.$g2095$.rebind(var172, var169);
                module0147.$g2094$.rebind(var171, var169);
            }
        }
        else if (module0731.NIL != module0161.f10488(var168)) {
            final SubLObject var171 = module0147.$g2094$.currentBinding(var169);
            final SubLObject var172 = module0147.$g2096$.currentBinding(var169);
            try {
                module0147.$g2094$.bind((SubLObject)module0731.$ic84$, var169);
                module0147.$g2096$.bind(module0161.f10522(var168), var169);
                var170 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0173.f10955(var166) && module0731.NIL != module0260.f17091(var166, var167, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
            }
            finally {
                module0147.$g2096$.rebind(var172, var169);
                module0147.$g2094$.rebind(var171, var169);
            }
        }
        else {
            final SubLObject var171 = module0147.$g2094$.currentBinding(var169);
            final SubLObject var172 = module0147.$g2095$.currentBinding(var169);
            try {
                module0147.$g2094$.bind((SubLObject)module0731.$ic85$, var169);
                module0147.$g2095$.bind(var168, var169);
                var170 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0173.f10955(var166) && module0731.NIL != module0260.f17091(var166, var167, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
            }
            finally {
                module0147.$g2095$.rebind(var172, var169);
                module0147.$g2094$.rebind(var171, var169);
            }
        }
        return var170;
    }
    
    public static SubLObject f44709(final SubLObject var166, final SubLObject var167, SubLObject var168) {
        if (var168 == module0731.UNPROVIDED) {
            var168 = module0584.f35776();
        }
        SubLObject var169 = module0731.$g5767$.getGlobalValue();
        if (module0731.NIL == var169) {
            var169 = module0034.f1934((SubLObject)module0731.$ic82$, (SubLObject)module0731.$ic86$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQUAL, (SubLObject)module0731.THREE_INTEGER, (SubLObject)module0731.$ic37$);
            module0034.f1947((SubLObject)module0731.$ic87$);
        }
        final SubLObject var170 = module0034.f1781(var166, var167, var168);
        final SubLObject var171 = module0034.f1814(var169, var170, (SubLObject)module0731.UNPROVIDED);
        if (var171 != module0731.$ic6$) {
            SubLObject var172 = var171;
            SubLObject var173 = (SubLObject)module0731.NIL;
            var173 = var172.first();
            while (module0731.NIL != var172) {
                SubLObject var174 = var173.first();
                final SubLObject var175 = conses_high.second(var173);
                if (var166.equal(var174.first())) {
                    var174 = var174.rest();
                    if (var167.equal(var174.first())) {
                        var174 = var174.rest();
                        if (module0731.NIL != var174 && module0731.NIL == var174.rest() && var168.equal(var174.first())) {
                            return module0034.f1959(var175);
                        }
                    }
                }
                var172 = var172.rest();
                var173 = var172.first();
            }
        }
        final SubLObject var176 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44708(var166, var167, var168)));
        module0034.f1836(var169, var170, var171, var176, (SubLObject)ConsesLow.list(var166, var167, var168));
        return module0034.f1959(var176);
    }
    
    public static SubLObject f44710(final SubLObject var169, final SubLObject var170, final SubLObject var27, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44690(var27, (SubLObject)module0731.UNPROVIDED) : var27;
        return module0004.f104(var170, module0730.f44573(var169, var27, var22), (SubLObject)module0731.$ic89$, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44711(final SubLObject var171, final SubLObject var19, SubLObject var172, SubLObject var173, SubLObject var22) {
        if (var172 == module0731.UNPROVIDED) {
            var172 = (SubLObject)module0731.$ic9$;
        }
        if (var173 == module0731.UNPROVIDED) {
            var173 = (SubLObject)module0731.NIL;
        }
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        final SubLObject var175 = f44667(var172, var19, var22, (SubLObject)module0731.NIL);
        SubLObject var176 = (SubLObject)module0731.NIL;
        final SubLObject var177 = var22;
        final SubLObject var178 = module0147.$g2094$.currentBinding(var174);
        final SubLObject var179 = module0147.$g2095$.currentBinding(var174);
        try {
            module0147.$g2094$.bind(module0147.f9531(var177), var174);
            module0147.$g2095$.bind(module0147.f9534(var177), var174);
            if (module0731.NIL != var175) {
                var176 = module0730.f44561(var171, var175, var173, (SubLObject)module0731.UNPROVIDED);
            }
            if (module0731.NIL != module0128.f8463(module0731.$ic90$, (SubLObject)module0731.UNPROVIDED) && module0731.NIL != module0128.f8463(module0731.$ic91$, (SubLObject)module0731.UNPROVIDED) && module0731.NIL != f44712(var19, (SubLObject)module0731.UNPROVIDED)) {
                SubLObject var180 = module0219.f14509(var171, (SubLObject)module0731.ONE_INTEGER, module0731.$ic91$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                SubLObject var181 = (SubLObject)module0731.NIL;
                var181 = var180.first();
                while (module0731.NIL != var180) {
                    if (module0731.NIL != f44713(module0178.f11335(var181), var19, (SubLObject)module0731.UNPROVIDED)) {
                        final SubLObject var182 = module0178.f11336(var181);
                        if (module0731.NIL == conses_high.member(var182, var176, Symbols.symbol_function((SubLObject)module0731.EQUALP), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                            var176 = (SubLObject)ConsesLow.cons(var182, var176);
                        }
                    }
                    var180 = var180.rest();
                    var181 = var180.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var179, var174);
            module0147.$g2094$.rebind(var178, var174);
        }
        return var176;
    }
    
    public static SubLObject f44714() {
        final SubLObject var3 = module0731.$g5768$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44715(final SubLObject var171, final SubLObject var19, SubLObject var172, SubLObject var173, SubLObject var22) {
        if (var172 == module0731.UNPROVIDED) {
            var172 = (SubLObject)module0731.$ic9$;
        }
        if (var173 == module0731.UNPROVIDED) {
            var173 = (SubLObject)module0731.NIL;
        }
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0731.$g5768$.getGlobalValue(), (SubLObject)ConsesLow.list(var171, var19, var172, var173, var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44716(final SubLObject var171, final SubLObject var19, final SubLObject var172, final SubLObject var173, final SubLObject var22) {
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        return f44711(var171, var19, var172, var173, var22);
    }
    
    public static SubLObject f44717(final SubLObject var171, final SubLObject var19, SubLObject var172, SubLObject var173, SubLObject var22) {
        if (var172 == module0731.UNPROVIDED) {
            var172 = (SubLObject)module0731.$ic9$;
        }
        if (var173 == module0731.UNPROVIDED) {
            var173 = (SubLObject)module0731.NIL;
        }
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var174 = module0731.$g5768$.getGlobalValue();
        if (module0731.NIL == var174) {
            var174 = module0034.f1934((SubLObject)module0731.$ic92$, (SubLObject)module0731.$ic93$, (SubLObject)module0731.$ic27$, (SubLObject)module0731.EQL, (SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic42$);
        }
        final SubLObject var175 = module0034.f1779(var171, var19, var172, var173, var22);
        final SubLObject var176 = module0034.f1814(var174, var175, (SubLObject)module0731.UNPROVIDED);
        if (var176 != module0731.$ic6$) {
            SubLObject var177 = var176;
            SubLObject var178 = (SubLObject)module0731.NIL;
            var178 = var177.first();
            while (module0731.NIL != var177) {
                SubLObject var179 = var178.first();
                final SubLObject var180 = conses_high.second(var178);
                if (var171.eql(var179.first())) {
                    var179 = var179.rest();
                    if (var19.eql(var179.first())) {
                        var179 = var179.rest();
                        if (var172.eql(var179.first())) {
                            var179 = var179.rest();
                            if (var173.eql(var179.first())) {
                                var179 = var179.rest();
                                if (module0731.NIL != var179 && module0731.NIL == var179.rest() && var22.eql(var179.first())) {
                                    return module0034.f1959(var180);
                                }
                            }
                        }
                    }
                }
                var177 = var177.rest();
                var178 = var177.first();
            }
        }
        final SubLObject var181 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44716(var171, var19, var172, var173, var22)));
        module0034.f1836(var174, var175, var176, var181, (SubLObject)ConsesLow.list(var171, var19, var172, var173, var22));
        return module0034.f1959(var181);
    }
    
    public static SubLObject f44718(final SubLObject var170, final SubLObject var171, final SubLObject var19, SubLObject var22, SubLObject var175, SubLObject var176) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        if (var175 == module0731.UNPROVIDED) {
            var175 = (SubLObject)module0731.$ic95$;
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44719(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        if (module0731.NIL == f44720(var171, var19, (SubLObject)module0731.UNPROVIDED)) {
            return (SubLObject)module0731.NIL;
        }
        if (module0731.NIL == f44721(var176) && module0731.NIL != f44722(var170, var171, var19, var22)) {
            return (SubLObject)module0731.T;
        }
        SubLObject var177 = (SubLObject)module0731.NIL;
        if (module0731.NIL == f44721(var176)) {
            final SubLObject var178 = var175;
            if (var178.eql((SubLObject)module0731.$ic95$)) {
                var177 = f44711(var171, var19, (SubLObject)module0731.$ic9$, (SubLObject)module0731.NIL, var22);
            }
            else if (var178.eql((SubLObject)module0731.$ic92$)) {
                var177 = f44717(var171, var19, (SubLObject)module0731.$ic9$, (SubLObject)module0731.NIL, var22);
            }
            else {
                var177 = Functions.funcall(var175, var171, var19, (SubLObject)module0731.$ic9$, (SubLObject)module0731.NIL, var22);
            }
        }
        if (module0731.NIL != module0004.f104(var170, var177, Symbols.symbol_function((SubLObject)module0731.EQUALP), (SubLObject)module0731.UNPROVIDED)) {
            return (SubLObject)module0731.T;
        }
        if (var176 == module0731.$ic98$) {
            return (SubLObject)module0731.NIL;
        }
        final SubLObject var179 = module0788.f50498(var170, var19);
        return module0004.f104(var171, var179, Symbols.symbol_function((SubLObject)module0731.$ic99$), (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44723(final SubLObject var170, final SubLObject var171, final SubLObject var19, SubLObject var22, SubLObject var175, SubLObject var176) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        if (var175 == module0731.UNPROVIDED) {
            var175 = (SubLObject)module0731.$ic95$;
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var177 = SubLProcess.currentSubLThread();
        final SubLObject var178 = module0034.$g879$.getDynamicValue(var177);
        SubLObject var179 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var178) {
            return f44718(var170, var171, var19, var22, var175, var176);
        }
        var179 = module0034.f1857(var178, (SubLObject)module0731.$ic94$, (SubLObject)module0731.UNPROVIDED);
        if (module0731.NIL == var179) {
            var179 = module0034.f1807(module0034.f1842(var178), (SubLObject)module0731.$ic94$, (SubLObject)module0731.SIX_INTEGER, (SubLObject)module0731.NIL, (SubLObject)module0731.EQUAL, (SubLObject)module0731.UNPROVIDED);
            module0034.f1860(var178, (SubLObject)module0731.$ic94$, var179);
        }
        final SubLObject var180 = module0034.f1778(var170, var171, var19, var22, var175, var176);
        final SubLObject var181 = module0034.f1814(var179, var180, (SubLObject)module0731.UNPROVIDED);
        if (var181 != module0731.$ic6$) {
            SubLObject var182 = var181;
            SubLObject var183 = (SubLObject)module0731.NIL;
            var183 = var182.first();
            while (module0731.NIL != var182) {
                SubLObject var184 = var183.first();
                final SubLObject var185 = conses_high.second(var183);
                if (var170.equal(var184.first())) {
                    var184 = var184.rest();
                    if (var171.equal(var184.first())) {
                        var184 = var184.rest();
                        if (var19.equal(var184.first())) {
                            var184 = var184.rest();
                            if (var22.equal(var184.first())) {
                                var184 = var184.rest();
                                if (var175.equal(var184.first())) {
                                    var184 = var184.rest();
                                    if (module0731.NIL != var184 && module0731.NIL == var184.rest() && var176.equal(var184.first())) {
                                        return module0034.f1959(var185);
                                    }
                                }
                            }
                        }
                    }
                }
                var182 = var182.rest();
                var183 = var182.first();
            }
        }
        final SubLObject var186 = Values.arg2(var177.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44718(var170, var171, var19, var22, var175, var176)));
        module0034.f1836(var179, var180, var181, var186, (SubLObject)ConsesLow.list(var170, var171, var19, var22, var175, var176));
        return module0034.f1959(var186);
    }
    
    public static SubLObject f44722(final SubLObject var170, final SubLObject var171, final SubLObject var19, final SubLObject var22) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        SubLObject var173 = (SubLObject)module0731.NIL;
        final SubLObject var174 = module0034.f1881();
        final SubLObject var175 = module0585.$g4450$.currentBinding(var172);
        try {
            module0585.$g4450$.bind((module0731.NIL != var174) ? var174 : module0585.f35841(), var172);
            final SubLObject var176 = module0585.$g4450$.getDynamicValue(var172);
            final SubLObject var7_185 = module0034.$g879$.currentBinding(var172);
            try {
                module0034.$g879$.bind(var176, var172);
                SubLObject var177 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var176 && module0731.NIL == module0034.f1842(var176)) {
                    var177 = module0034.f1869(var176);
                    final SubLObject var178 = Threads.current_process();
                    if (module0731.NIL == var177) {
                        module0034.f1873(var176, var178);
                    }
                    else if (!var177.eql(var178)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    final SubLObject var7_186 = module0147.$g2094$.currentBinding(var172);
                    final SubLObject var179 = module0147.$g2095$.currentBinding(var172);
                    try {
                        module0147.$g2094$.bind(module0147.f9531(var22), var172);
                        module0147.$g2095$.bind(module0147.f9534(var22), var172);
                        f44699();
                        SubLObject var180;
                        for (var180 = module0066.f4838(module0067.f4891(module0731.$g5765$.getGlobalValue())); module0731.NIL == var173 && module0731.NIL == module0066.f4841(var180); var180 = module0066.f4840(var180)) {
                            var172.resetMultipleValues();
                            final SubLObject var181 = module0066.f4839(var180);
                            final SubLObject var182 = var172.secondMultipleValue();
                            var172.resetMultipleValues();
                            if (module0731.$ic1$.eql(module0731.$ic1$) || module0731.NIL != f44644(module0731.$ic1$, var182)) {
                                final SubLObject var183 = var181;
                                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.ONE_INTEGER, var183)) {
                                    final SubLObject var184 = module0158.f10011(var171, (SubLObject)module0731.ONE_INTEGER, var183);
                                    SubLObject var185 = var173;
                                    final SubLObject var186 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var185) {
                                        final SubLObject var187 = module0052.f3695(var184, var186);
                                        final SubLObject var188 = (SubLObject)SubLObjectFactory.makeBoolean(!var186.eql(var187));
                                        if (module0731.NIL != var188) {
                                            SubLObject var189 = (SubLObject)module0731.NIL;
                                            try {
                                                var189 = module0158.f10316(var187, (SubLObject)module0731.$ic44$, (SubLObject)module0731.NIL, (SubLObject)module0731.NIL);
                                                SubLObject var60_188 = var173;
                                                final SubLObject var61_189 = (SubLObject)module0731.NIL;
                                                while (module0731.NIL == var60_188) {
                                                    final SubLObject var190 = module0052.f3695(var189, var61_189);
                                                    final SubLObject var63_190 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_189.eql(var190));
                                                    if (module0731.NIL != var63_190 && module0178.f11335(var190).equalp(var170)) {
                                                        final SubLObject var191 = f44691(var181);
                                                        final SubLObject var192 = (SubLObject)((module0731.NIL != var19) ? f44713(var191, var19, (SubLObject)module0731.UNPROVIDED) : module0731.NIL);
                                                        if (module0731.NIL != var192) {
                                                            var173 = (SubLObject)module0731.T;
                                                        }
                                                    }
                                                    var60_188 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_190 || module0731.NIL != var173);
                                                }
                                            }
                                            finally {
                                                final SubLObject var7_187 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                                                    if (module0731.NIL != var189) {
                                                        module0158.f10319(var189);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_187, var172);
                                                }
                                            }
                                        }
                                        var185 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var188 || module0731.NIL != var173);
                                    }
                                }
                            }
                        }
                        module0066.f4842(var180);
                    }
                    finally {
                        module0147.$g2095$.rebind(var179, var172);
                        module0147.$g2094$.rebind(var7_186, var172);
                    }
                }
                finally {
                    final SubLObject var7_188 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                        if (module0731.NIL != var176 && module0731.NIL == var177) {
                            module0034.f1873(var176, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_188, var172);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_185, var172);
            }
        }
        finally {
            module0585.$g4450$.rebind(var175, var172);
        }
        return var173;
    }
    
    public static SubLObject f44724(final SubLObject var170, final SubLObject var171, final SubLObject var27, SubLObject var22, SubLObject var176) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var177 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44719(var171) : var171;
        assert module0731.NIL != f44690(var27, (SubLObject)module0731.UNPROVIDED) : var27;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var178 = (SubLObject)module0731.NIL;
        final SubLObject var179 = module0034.f1881();
        final SubLObject var180 = module0585.$g4450$.currentBinding(var177);
        try {
            module0585.$g4450$.bind((module0731.NIL != var179) ? var179 : module0585.f35841(), var177);
            final SubLObject var181 = module0585.$g4450$.getDynamicValue(var177);
            final SubLObject var7_196 = module0034.$g879$.currentBinding(var177);
            try {
                module0034.$g879$.bind(var181, var177);
                SubLObject var182 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var181 && module0731.NIL == module0034.f1842(var181)) {
                    var182 = module0034.f1869(var181);
                    final SubLObject var183 = Threads.current_process();
                    if (module0731.NIL == var182) {
                        module0034.f1873(var181, var183);
                    }
                    else if (!var182.eql(var183)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        final SubLObject var184 = f44725(var170, var171, module0584.$g4389$.getDynamicValue(var177), var22, (SubLObject)module0731.$ic98$);
                        if (module0731.NIL == var178) {
                            SubLObject var185 = var184;
                            SubLObject var186 = (SubLObject)module0731.NIL;
                            var186 = var185.first();
                            while (module0731.NIL == var178 && module0731.NIL != var185) {
                                if (module0731.NIL != f44702(var186, var27, var22)) {
                                    var178 = (SubLObject)module0731.T;
                                }
                                var185 = var185.rest();
                                var186 = var185.first();
                            }
                        }
                    }
                }
                finally {
                    final SubLObject var7_197 = Threads.$is_thread_performing_cleanupP$.currentBinding(var177);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var177);
                        if (module0731.NIL == var178 && var176 != module0731.$ic98$) {
                            final SubLObject var187 = module0788.f50502(var170, var171);
                            if (module0731.NIL == var178) {
                                SubLObject var188 = var187;
                                SubLObject var189 = (SubLObject)module0731.NIL;
                                var189 = var188.first();
                                while (module0731.NIL == var178 && module0731.NIL != var188) {
                                    if (module0731.NIL != f44702(var189, var27, var22)) {
                                        var178 = (SubLObject)module0731.T;
                                    }
                                    var188 = var188.rest();
                                    var189 = var188.first();
                                }
                            }
                        }
                        if (module0731.NIL != var181 && module0731.NIL == var182) {
                            module0034.f1873(var181, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_197, var177);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_196, var177);
            }
        }
        finally {
            module0585.$g4450$.rebind(var180, var177);
        }
        return var178;
    }
    
    public static SubLObject f44726(final SubLObject var170, final SubLObject var19) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        SubLObject var172 = (SubLObject)module0731.NIL;
        final SubLObject var173 = module0584.$g4390$.currentBinding(var171);
        try {
            module0584.$g4390$.bind((SubLObject)module0731.$ic100$, var171);
            var172 = f44727(var170, var19, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        finally {
            module0584.$g4390$.rebind(var173, var171);
        }
        return var172.first();
    }
    
    public static SubLObject f44728(final SubLObject var170, final SubLObject var201, final SubLObject var19) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        final SubLObject var203 = f44729(var170, var201, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        SubLObject var204 = (SubLObject)module0731.NIL;
        final SubLObject var205 = module0147.f9540(module0584.$g4396$.getDynamicValue(var202));
        final SubLObject var206 = module0147.$g2095$.currentBinding(var202);
        final SubLObject var207 = module0147.$g2094$.currentBinding(var202);
        final SubLObject var208 = module0147.$g2096$.currentBinding(var202);
        try {
            module0147.$g2095$.bind(module0147.f9545(var205), var202);
            module0147.$g2094$.bind(module0147.f9546(var205), var202);
            module0147.$g2096$.bind(module0147.f9549(var205), var202);
            var204 = Sequences.find(var19, var203, (SubLObject)module0731.$ic101$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var208, var202);
            module0147.$g2094$.rebind(var207, var202);
            module0147.$g2095$.rebind(var206, var202);
        }
        return var204;
    }
    
    public static SubLObject f44730(final SubLObject var170, final SubLObject var27, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44690(var27, (SubLObject)module0731.UNPROVIDED) : var27;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var206 = (SubLObject)module0731.NIL;
        if (module0731.NIL != module0038.f2611(var170)) {
            final SubLObject var207 = module0034.f1881();
            final SubLObject var208 = module0585.$g4450$.currentBinding(var205);
            try {
                module0585.$g4450$.bind((module0731.NIL != var207) ? var207 : module0585.f35841(), var205);
                final SubLObject var209 = module0585.$g4450$.getDynamicValue(var205);
                final SubLObject var7_205 = module0034.$g879$.currentBinding(var205);
                try {
                    module0034.$g879$.bind(var209, var205);
                    SubLObject var210 = (SubLObject)module0731.NIL;
                    if (module0731.NIL != var209 && module0731.NIL == module0034.f1842(var209)) {
                        var210 = module0034.f1869(var209);
                        final SubLObject var211 = Threads.current_process();
                        if (module0731.NIL == var210) {
                            module0034.f1873(var209, var211);
                        }
                        else if (!var210.eql(var211)) {
                            Errors.error((SubLObject)module0731.$ic20$);
                        }
                    }
                    try {
                        if (module0731.NIL == f44721(var176)) {
                            var206 = module0738.f45744(var170, var27, var203, var204, (SubLObject)module0731.UNPROVIDED);
                        }
                    }
                    finally {
                        final SubLObject var7_206 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                            if (module0731.NIL != f44731(var206, var176)) {
                                var206 = Sequences.delete_duplicates(ConsesLow.append(var206, module0788.f50500(var170, var27)), Symbols.symbol_function((SubLObject)module0731.EQUAL), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            if (module0731.NIL != Characters.upper_case_p(module0038.f2636(var170)) && module0731.NIL != f44713(f44691(var27), module0731.$ic45$, var204)) {
                                var206 = Sequences.delete_duplicates(ConsesLow.append(var206, f44730(Strings.string_downcase(var170, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED), module0732.f44949(var27), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0731.EQUAL), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            if (module0731.NIL != var209 && module0731.NIL == var210) {
                                module0034.f1873(var209, (SubLObject)module0731.NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_206, var205);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var7_205, var205);
                }
            }
            finally {
                module0585.$g4450$.rebind(var208, var205);
            }
        }
        return var206;
    }
    
    public static SubLObject f44732() {
        final SubLObject var3 = module0731.$g5769$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44733(final SubLObject var207, SubLObject var208) {
        if (var208 == module0731.UNPROVIDED) {
            var208 = module0731.$ic102$;
        }
        return module0034.f1829(module0731.$g5769$.getGlobalValue(), (SubLObject)ConsesLow.list(var207, var208), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44734(final SubLObject var207, final SubLObject var208) {
        assert module0731.NIL != Types.keywordp(var207) : var207;
        SubLObject var209 = (SubLObject)module0731.NIL;
        if (var207.eql((SubLObject)module0731.$ic105$)) {
            var209 = module0256.f16552(module0731.$ic38$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic106$)) {
            var209 = (SubLObject)module0731.$ic107$;
        }
        else if (var207.eql((SubLObject)module0731.$ic108$)) {
            var209 = (SubLObject)module0731.$ic109$;
        }
        else if (var207.eql((SubLObject)module0731.$ic110$)) {
            var209 = module0256.f16552(module0731.$ic111$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic112$)) {
            var209 = module0256.f16552(module0731.$ic113$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic114$)) {
            var209 = module0256.f16552(module0731.$ic115$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic116$)) {
            var209 = module0256.f16552(module0731.$ic117$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic118$)) {
            var209 = module0256.f16552(module0731.$ic45$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic119$)) {
            var209 = (SubLObject)module0731.$ic120$;
        }
        else if (var207.eql((SubLObject)module0731.$ic121$)) {
            var209 = module0256.f16552(module0731.$ic122$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic123$)) {
            var209 = module0256.f16552(module0731.$ic124$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic125$)) {
            var209 = module0256.f16552(module0731.$ic126$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic127$)) {
            var209 = module0256.f16552(module0731.$ic128$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic129$)) {
            var209 = module0256.f16552(module0731.$ic130$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic131$)) {
            var209 = module0256.f16552(module0731.$ic132$, var208, (SubLObject)module0731.UNPROVIDED);
        }
        else if (var207.eql((SubLObject)module0731.$ic133$)) {
            var209 = f44735(var208);
        }
        return var209;
    }
    
    public static SubLObject f44736(final SubLObject var207, SubLObject var208) {
        if (var208 == module0731.UNPROVIDED) {
            var208 = module0731.$ic102$;
        }
        SubLObject var209 = module0731.$g5769$.getGlobalValue();
        if (module0731.NIL == var209) {
            var209 = module0034.f1934((SubLObject)module0731.$ic103$, (SubLObject)module0731.$ic134$, (SubLObject)module0731.$ic135$, (SubLObject)module0731.EQL, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.TWELVE_INTEGER);
        }
        final SubLObject var210 = module0034.f1782(var207, var208);
        final SubLObject var211 = module0034.f1814(var209, var210, (SubLObject)module0731.UNPROVIDED);
        if (var211 != module0731.$ic6$) {
            SubLObject var212 = var211;
            SubLObject var213 = (SubLObject)module0731.NIL;
            var213 = var212.first();
            while (module0731.NIL != var212) {
                SubLObject var214 = var213.first();
                final SubLObject var215 = conses_high.second(var213);
                if (var207.eql(var214.first())) {
                    var214 = var214.rest();
                    if (module0731.NIL != var214 && module0731.NIL == var214.rest() && var208.eql(var214.first())) {
                        return module0034.f1959(var215);
                    }
                }
                var212 = var212.rest();
                var213 = var212.first();
            }
        }
        final SubLObject var216 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44734(var207, var208)));
        module0034.f1836(var209, var210, var211, var216, (SubLObject)ConsesLow.list(var207, var208));
        return module0034.f1959(var216);
    }
    
    public static SubLObject f44737(final SubLObject var170, final SubLObject var207, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var208 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != Types.keywordp(var207) : var207;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var209 = (SubLObject)module0731.NIL;
        SubLObject var210 = (SubLObject)module0731.NIL;
        SubLObject var211 = (SubLObject)module0731.NIL;
        final SubLObject var212 = module0034.f1881();
        final SubLObject var213 = module0585.$g4450$.currentBinding(var208);
        try {
            module0585.$g4450$.bind((module0731.NIL != var212) ? var212 : module0585.f35841(), var208);
            final SubLObject var214 = module0585.$g4450$.getDynamicValue(var208);
            final SubLObject var7_212 = module0034.$g879$.currentBinding(var208);
            try {
                module0034.$g879$.bind(var214, var208);
                SubLObject var215 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var214 && module0731.NIL == module0034.f1842(var214)) {
                    var215 = module0034.f1869(var214);
                    final SubLObject var216 = Threads.current_process();
                    if (module0731.NIL == var215) {
                        module0034.f1873(var214, var216);
                    }
                    else if (!var215.eql(var216)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var208.resetMultipleValues();
                        final SubLObject var213_214 = module0738.f45746(var170, var207, var203, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var215_216 = var208.secondMultipleValue();
                        final SubLObject var217_218 = var208.thirdMultipleValue();
                        var208.resetMultipleValues();
                        var209 = var213_214;
                        var210 = var215_216;
                        var211 = var217_218;
                        if (Sequences.remove_duplicates(var211, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED).equal((SubLObject)module0731.$ic136$)) {
                            var209 = (SubLObject)module0731.NIL;
                            var210 = (SubLObject)module0731.NIL;
                            var211 = (SubLObject)module0731.NIL;
                        }
                    }
                }
                finally {
                    final SubLObject var7_213 = Threads.$is_thread_performing_cleanupP$.currentBinding(var208);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var208);
                        if (module0731.NIL != f44731(var209, var176)) {
                            var208.resetMultipleValues();
                            final SubLObject var217 = module0788.f50499(var170, var207, var204);
                            final SubLObject var218 = var208.secondMultipleValue();
                            final SubLObject var219 = var208.thirdMultipleValue();
                            var208.resetMultipleValues();
                            var209 = ConsesLow.append(var209, var217);
                            var210 = ConsesLow.append(var210, var218);
                            var211 = ConsesLow.append(var211, var219);
                        }
                        if (module0731.NIL != var214 && module0731.NIL == var215) {
                            module0034.f1873(var214, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_213, var208);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_212, var208);
            }
        }
        finally {
            module0585.$g4450$.rebind(var213, var208);
        }
        return Values.values(var209, var210, var211);
    }
    
    public static SubLObject f44727(final SubLObject var170, final SubLObject var19, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_223 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var205.resetMultipleValues();
                        final SubLObject var224_225 = module0738.f45747(var170, var19, var203, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var226_227 = var205.secondMultipleValue();
                        var205.resetMultipleValues();
                        var206 = var224_225;
                        var207 = var226_227;
                    }
                }
                finally {
                    final SubLObject var7_224 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != f44731(var206, var176)) {
                            var205.resetMultipleValues();
                            final SubLObject var213 = module0788.f50498(var170, var19);
                            final SubLObject var214 = var205.secondMultipleValue();
                            var205.resetMultipleValues();
                            var206 = ConsesLow.append(var206, var213);
                            var207 = ConsesLow.append(var207, Mapping.mapcan((SubLObject)module0731.IDENTITY, var214, module0731.EMPTY_SUBL_OBJECT_ARRAY));
                        }
                        if (module0731.NIL != Characters.upper_case_p(module0038.f2636(var170)) && module0731.NIL != f44713(var19, module0731.$ic45$, var204)) {
                            var205.resetMultipleValues();
                            final SubLObject var215 = f44727(Strings.string_downcase(var170, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED), module0732.f45029(var19), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            final SubLObject var216 = var205.secondMultipleValue();
                            var205.resetMultipleValues();
                            var206 = ConsesLow.append(var206, var215);
                            var207 = ConsesLow.append(var207, Mapping.mapcar((SubLObject)module0731.$ic137$, var216));
                        }
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_224, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_223, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return Values.values(var206, var207);
    }
    
    public static SubLObject f44725(final SubLObject var170, final SubLObject var169, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        return (SubLObject)((module0731.NIL != module0018.f971()) ? conses_high.copy_list(f44738(var170, var169, var203, var204, var176)) : module0731.NIL);
    }
    
    public static SubLObject f44739() {
        return f44740();
    }
    
    public static SubLObject f44740() {
        final SubLObject var3 = module0731.$g5770$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44741(final SubLObject var170, final SubLObject var169, final SubLObject var203, final SubLObject var204, final SubLObject var176) {
        return module0034.f1829(module0731.$g5770$.getGlobalValue(), (SubLObject)ConsesLow.list(var170, var169, var203, var204, var176), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44742(final SubLObject var170, final SubLObject var169, final SubLObject var203, final SubLObject var204, final SubLObject var176) {
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44719(var169) : var169;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var205 = (SubLObject)module0731.NIL;
        if (module0731.NIL == f44721(var176)) {
            var205 = module0738.f45748(var170, var169, var203, var204, (SubLObject)module0731.UNPROVIDED);
        }
        if (module0731.NIL != f44731(var205, var176)) {
            var205 = Sequences.delete_duplicates(ConsesLow.append(var205, module0788.f50502(var170, var169)), Symbols.symbol_function((SubLObject)module0731.EQ), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        return var205;
    }
    
    public static SubLObject f44738(final SubLObject var170, final SubLObject var169, final SubLObject var203, final SubLObject var204, final SubLObject var176) {
        SubLObject var205 = module0731.$g5770$.getGlobalValue();
        if (module0731.NIL == var205) {
            var205 = module0034.f1934((SubLObject)module0731.$ic138$, (SubLObject)module0731.$ic139$, (SubLObject)module0731.$ic42$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
        }
        final SubLObject var206 = module0034.f1779(var170, var169, var203, var204, var176);
        final SubLObject var207 = module0034.f1814(var205, var206, (SubLObject)module0731.UNPROVIDED);
        if (var207 != module0731.$ic6$) {
            SubLObject var208 = var207;
            SubLObject var209 = (SubLObject)module0731.NIL;
            var209 = var208.first();
            while (module0731.NIL != var208) {
                SubLObject var210 = var209.first();
                final SubLObject var211 = conses_high.second(var209);
                if (var170.equal(var210.first())) {
                    var210 = var210.rest();
                    if (var169.equal(var210.first())) {
                        var210 = var210.rest();
                        if (var203.equal(var210.first())) {
                            var210 = var210.rest();
                            if (var204.equal(var210.first())) {
                                var210 = var210.rest();
                                if (module0731.NIL != var210 && module0731.NIL == var210.rest() && var176.equal(var210.first())) {
                                    return module0034.f1959(var211);
                                }
                            }
                        }
                    }
                }
                var208 = var208.rest();
                var209 = var208.first();
            }
        }
        final SubLObject var212 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44742(var170, var169, var203, var204, var176)));
        module0034.f1836(var205, var206, var207, var212, (SubLObject)ConsesLow.list(var170, var169, var203, var204, var176));
        return module0034.f1959(var212);
    }
    
    public static SubLObject f44743(final SubLObject var171, SubLObject var203, SubLObject var204) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != f44719(var171) : var171;
        SubLObject var206 = (SubLObject)module0731.NIL;
        final SubLObject var207 = (SubLObject)module0731.$ic140$;
        final SubLObject var208 = (SubLObject)ConsesLow.list((SubLObject)module0731.$ic141$, (SubLObject)module0731.ZERO_INTEGER);
        final SubLObject var209 = module0584.$g4389$.currentBinding(var205);
        try {
            module0584.$g4389$.bind(var203, var205);
            if (module0731.NIL != module0128.f8463(module0731.$ic91$, (SubLObject)module0731.UNPROVIDED)) {
                var206 = module0434.f30578(var207, (SubLObject)ConsesLow.list(module0731.$ic91$, var171, (SubLObject)module0731.$ic142$, var207), var204, var208);
            }
        }
        finally {
            module0584.$g4389$.rebind(var209, var205);
        }
        return Sequences.remove_duplicates(var206, Symbols.symbol_function((SubLObject)module0731.EQUAL), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44744(final SubLObject var19) {
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        if (var19.eql(module0731.$ic143$)) {
            return module0584.f35811(module0731.$ic144$);
        }
        if (var19.eql(module0731.$ic126$)) {
            return module0259.f16848(module0731.$ic145$, module0731.$ic144$, (SubLObject)module0731.UNPROVIDED);
        }
        if (var19.eql(module0731.$ic146$)) {
            return (SubLObject)module0731.$ic147$;
        }
        if (var19.eql(module0731.$ic148$)) {
            return (SubLObject)module0731.$ic147$;
        }
        if (var19.eql(module0731.$ic111$)) {
            return module0259.f16848(module0731.$ic149$, module0731.$ic144$, (SubLObject)module0731.UNPROVIDED);
        }
        if (var19.eql(module0731.$ic150$)) {
            return Sequences.delete(module0731.$ic151$, module0259.f16848(module0731.$ic149$, module0731.$ic144$, (SubLObject)module0731.UNPROVIDED), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        if (var19.eql(module0731.$ic124$)) {
            return Sequences.delete(module0731.$ic152$, module0259.f16848(module0731.$ic152$, module0731.$ic144$, (SubLObject)module0731.UNPROVIDED), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44745(final SubLObject var170, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        SubLObject var206 = (SubLObject)module0731.NIL;
        final SubLObject var207 = module0034.f1881();
        final SubLObject var208 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var207) ? var207 : module0585.f35841(), var205);
            final SubLObject var209 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_233 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var209, var205);
                SubLObject var210 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var209 && module0731.NIL == module0034.f1842(var209)) {
                    var210 = module0034.f1869(var209);
                    final SubLObject var211 = Threads.current_process();
                    if (module0731.NIL == var210) {
                        module0034.f1873(var209, var211);
                    }
                    else if (!var210.eql(var211)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var206 = module0738.f45751(var170, var203, var204, (SubLObject)module0731.UNPROVIDED);
                    }
                }
                finally {
                    final SubLObject var7_234 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != f44731(var206, var176)) {
                            var206 = Sequences.delete_duplicates(ConsesLow.append(var206, module0788.f50503(var170)), Symbols.symbol_function((SubLObject)module0731.EQ), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                        }
                        if (module0731.NIL != var209 && module0731.NIL == var210) {
                            module0034.f1873(var209, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_234, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_233, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var208, var205);
        }
        return var206;
    }
    
    public static SubLObject f44746(final SubLObject var170, final SubLObject var19, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var206 = (SubLObject)module0731.NIL;
        final SubLObject var207 = module0034.f1881();
        final SubLObject var208 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var207) ? var207 : module0585.f35841(), var205);
            final SubLObject var209 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_235 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var209, var205);
                SubLObject var210 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var209 && module0731.NIL == module0034.f1842(var209)) {
                    var210 = module0034.f1869(var209);
                    final SubLObject var211 = Threads.current_process();
                    if (module0731.NIL == var210) {
                        module0034.f1873(var209, var211);
                    }
                    else if (!var210.eql(var211)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var206 = module0738.f45742(var170, var19, var203, var204);
                }
                finally {
                    final SubLObject var7_236 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL == var206 && var176 != module0731.$ic98$) {
                            var206 = module0788.f50508(var170, var19);
                        }
                        if (module0731.NIL != var209 && module0731.NIL == var210) {
                            module0034.f1873(var209, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_236, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_235, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var208, var205);
        }
        return var206;
    }
    
    public static SubLObject f44747(final SubLObject var170, SubLObject var203, SubLObject var204) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        return f44746(var170, module0731.$ic122$, var203, var204, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44748() {
        Hashtables.clrhash(module0731.$g5771$.getGlobalValue());
        Hashtables.clrhash(module0731.$g5772$.getGlobalValue());
        return module0731.$g5771$.getGlobalValue();
    }
    
    public static SubLObject f44652() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f44748();
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var4);
            module0147.$g2095$.bind(module0731.$ic22$, var4);
            if (module0731.NIL != module0128.f8463(module0731.$ic90$, (SubLObject)module0731.UNPROVIDED)) {
                SubLObject var7 = module0731.$ic90$;
                final SubLObject var8 = (SubLObject)module0731.$ic48$;
                final SubLObject var9 = module0056.f4145(var8);
                final SubLObject var7_237 = module0139.$g1635$.currentBinding(var4);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var4);
                    final SubLObject var10 = (SubLObject)module0731.NIL;
                    final SubLObject var7_238 = module0141.$g1714$.currentBinding(var4);
                    final SubLObject var8_239 = module0141.$g1715$.currentBinding(var4);
                    try {
                        module0141.$g1714$.bind((module0731.NIL != var10) ? var10 : module0141.f9283(), var4);
                        module0141.$g1715$.bind((SubLObject)((module0731.NIL != var10) ? module0731.$ic49$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                        if (module0731.NIL != var10 && module0731.NIL != module0136.f8864() && module0731.NIL == module0141.f9279(var10)) {
                            final SubLObject var11 = module0136.$g1591$.getDynamicValue(var4);
                            if (var11.eql((SubLObject)module0731.$ic50$)) {
                                module0136.f8870((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0731.$ic53$)) {
                                module0136.f8871((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0731.$ic55$)) {
                                Errors.warn((SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                            }
                            else {
                                Errors.warn((SubLObject)module0731.$ic56$, module0136.$g1591$.getDynamicValue(var4));
                                Errors.cerror((SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                            }
                        }
                        final SubLObject var7_239 = module0141.$g1670$.currentBinding(var4);
                        final SubLObject var8_240 = module0141.$g1671$.currentBinding(var4);
                        final SubLObject var12 = module0141.$g1672$.currentBinding(var4);
                        final SubLObject var13 = module0141.$g1674$.currentBinding(var4);
                        final SubLObject var14 = module0137.$g1605$.currentBinding(var4);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0731.$ic57$), var4);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                            module0137.$g1605$.bind(module0137.f8955(module0731.$ic57$), var4);
                            if (module0731.NIL != module0136.f8865() || module0731.NIL != module0244.f15795(module0731.$ic90$, module0137.f8955((SubLObject)module0731.UNPROVIDED))) {
                                final SubLObject var7_240 = module0141.$g1677$.currentBinding(var4);
                                final SubLObject var8_241 = module0138.$g1619$.currentBinding(var4);
                                final SubLObject var9_244 = module0141.$g1674$.currentBinding(var4);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var4);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0731.$ic57$)), var4);
                                    module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                    module0249.f16055(var7, (SubLObject)module0731.UNPROVIDED);
                                    while (module0731.NIL != var7) {
                                        final SubLObject var15 = var7;
                                        final SubLObject var16 = module0731.$ic91$;
                                        if (module0731.NIL != module0158.f10010(var15, (SubLObject)module0731.TWO_INTEGER, var16)) {
                                            final SubLObject var17 = module0158.f10011(var15, (SubLObject)module0731.TWO_INTEGER, var16);
                                            SubLObject var18 = (SubLObject)module0731.NIL;
                                            final SubLObject var19 = (SubLObject)module0731.NIL;
                                            while (module0731.NIL == var18) {
                                                final SubLObject var20 = module0052.f3695(var17, var19);
                                                final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                                if (module0731.NIL != var21) {
                                                    SubLObject var22 = (SubLObject)module0731.NIL;
                                                    try {
                                                        var22 = module0158.f10316(var20, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                                        SubLObject var60_245 = (SubLObject)module0731.NIL;
                                                        final SubLObject var61_246 = (SubLObject)module0731.NIL;
                                                        while (module0731.NIL == var60_245) {
                                                            final SubLObject var23 = module0052.f3695(var22, var61_246);
                                                            final SubLObject var63_247 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_246.eql(var23));
                                                            if (module0731.NIL != var63_247) {
                                                                final SubLObject var24 = module0178.f11336(var23);
                                                                final SubLObject var25 = module0178.f11287(var23);
                                                                module0030.f1600(var24, var25, module0731.$g5771$.getGlobalValue(), (SubLObject)module0731.UNPROVIDED);
                                                                module0030.f1600(var24, var25, module0731.$g5772$.getGlobalValue(), (SubLObject)module0731.UNPROVIDED);
                                                            }
                                                            var60_245 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_247);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var7_241 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var4);
                                                            if (module0731.NIL != var22) {
                                                                module0158.f10319(var22);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_241, var4);
                                                        }
                                                    }
                                                }
                                                var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var21);
                                            }
                                        }
                                        SubLObject var27;
                                        final SubLObject var26 = var27 = module0200.f12443(module0137.f8955(module0731.$ic57$));
                                        SubLObject var28 = (SubLObject)module0731.NIL;
                                        var28 = var27.first();
                                        while (module0731.NIL != var27) {
                                            final SubLObject var7_242 = module0137.$g1605$.currentBinding(var4);
                                            final SubLObject var8_242 = module0141.$g1674$.currentBinding(var4);
                                            try {
                                                module0137.$g1605$.bind(var28, var4);
                                                module0141.$g1674$.bind((SubLObject)((module0731.NIL != module0141.f9205((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0731.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                final SubLObject var29 = module0228.f15229(var7);
                                                if (module0731.NIL != module0138.f8992(var29)) {
                                                    final SubLObject var30 = module0242.f15664(var29, module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                    if (module0731.NIL != var30) {
                                                        final SubLObject var31 = module0245.f15834(var30, module0138.f8979(), module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                        if (module0731.NIL != var31) {
                                                            SubLObject var32;
                                                            for (var32 = module0066.f4838(module0067.f4891(var31)); module0731.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
                                                                var4.resetMultipleValues();
                                                                final SubLObject var33 = module0066.f4839(var32);
                                                                final SubLObject var34 = var4.secondMultipleValue();
                                                                var4.resetMultipleValues();
                                                                if (module0731.NIL != module0147.f9507(var33)) {
                                                                    final SubLObject var7_243 = module0138.$g1623$.currentBinding(var4);
                                                                    try {
                                                                        module0138.$g1623$.bind(var33, var4);
                                                                        SubLObject var98_252;
                                                                        for (var98_252 = module0066.f4838(module0067.f4891(var34)); module0731.NIL == module0066.f4841(var98_252); var98_252 = module0066.f4840(var98_252)) {
                                                                            var4.resetMultipleValues();
                                                                            final SubLObject var35 = module0066.f4839(var98_252);
                                                                            final SubLObject var36 = var4.secondMultipleValue();
                                                                            var4.resetMultipleValues();
                                                                            if (module0731.NIL != module0141.f9289(var35)) {
                                                                                final SubLObject var7_244 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var35, var4);
                                                                                    final SubLObject var37 = var36;
                                                                                    if (module0731.NIL != module0077.f5302(var37)) {
                                                                                        final SubLObject var38 = module0077.f5333(var37);
                                                                                        SubLObject var39;
                                                                                        SubLObject var40;
                                                                                        SubLObject var41;
                                                                                        for (var39 = module0032.f1741(var38), var40 = (SubLObject)module0731.NIL, var40 = module0032.f1742(var39, var38); module0731.NIL == module0032.f1744(var39, var40); var40 = module0032.f1743(var40)) {
                                                                                            var41 = module0032.f1745(var39, var40);
                                                                                            if (module0731.NIL != module0032.f1746(var40, var41) && module0731.NIL == module0249.f16059(var41, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var41, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var41, var9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var37.isList()) {
                                                                                        SubLObject var42 = var37;
                                                                                        SubLObject var43 = (SubLObject)module0731.NIL;
                                                                                        var43 = var42.first();
                                                                                        while (module0731.NIL != var42) {
                                                                                            if (module0731.NIL == module0249.f16059(var43, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var43, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var43, var9);
                                                                                            }
                                                                                            var42 = var42.rest();
                                                                                            var43 = var42.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0731.$ic59$, var37);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_244, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var98_252);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_243, var4);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var32);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic60$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0731.NIL != module0155.f9785(var29, (SubLObject)module0731.UNPROVIDED)) {
                                                    SubLObject var13_254;
                                                    final SubLObject var44 = var13_254 = ((module0731.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED)));
                                                    SubLObject var45 = (SubLObject)module0731.NIL;
                                                    var45 = var13_254.first();
                                                    while (module0731.NIL != var13_254) {
                                                        final SubLObject var7_245 = module0138.$g1625$.currentBinding(var4);
                                                        try {
                                                            module0138.$g1625$.bind(var45, var4);
                                                            final SubLObject var47;
                                                            final SubLObject var46 = var47 = Functions.funcall(var45, var29);
                                                            if (module0731.NIL != module0077.f5302(var47)) {
                                                                final SubLObject var48 = module0077.f5333(var47);
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                for (var49 = module0032.f1741(var48), var50 = (SubLObject)module0731.NIL, var50 = module0032.f1742(var49, var48); module0731.NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                    var51 = module0032.f1745(var49, var50);
                                                                    if (module0731.NIL != module0032.f1746(var50, var51) && module0731.NIL == module0249.f16059(var51, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var51, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var51, var9);
                                                                    }
                                                                }
                                                            }
                                                            else if (var47.isList()) {
                                                                SubLObject var52 = var47;
                                                                SubLObject var53 = (SubLObject)module0731.NIL;
                                                                var53 = var52.first();
                                                                while (module0731.NIL != var52) {
                                                                    if (module0731.NIL == module0249.f16059(var53, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var53, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var53, var9);
                                                                    }
                                                                    var52 = var52.rest();
                                                                    var53 = var52.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0731.$ic59$, var47);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_245, var4);
                                                        }
                                                        var13_254 = var13_254.rest();
                                                        var45 = var13_254.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_242, var4);
                                                module0137.$g1605$.rebind(var7_242, var4);
                                            }
                                            var27 = var27.rest();
                                            var28 = var27.first();
                                        }
                                        var7 = module0056.f4150(var9);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var9_244, var4);
                                    module0138.$g1619$.rebind(var8_241, var4);
                                    module0141.$g1677$.rebind(var7_240, var4);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.$ic61$, module0731.$ic90$, module0244.f15748(module0137.f8955((SubLObject)module0731.UNPROVIDED)), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var14, var4);
                            module0141.$g1674$.rebind(var13, var4);
                            module0141.$g1672$.rebind(var12, var4);
                            module0141.$g1671$.rebind(var8_240, var4);
                            module0141.$g1670$.rebind(var7_239, var4);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_239, var4);
                        module0141.$g1714$.rebind(var7_238, var4);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1635$.rebind(var7_237, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return module0731.$g5771$.getGlobalValue();
    }
    
    public static SubLObject f44749(final SubLObject var170, final SubLObject var22, final SubLObject var256) {
        assert module0731.NIL != Types.stringp(var170) : var170;
        if (!Hashtables.hash_table_count(module0731.$g5771$.getGlobalValue()).isPositive()) {
            f44652();
        }
        final SubLObject var257 = (module0731.NIL != var256) ? module0731.$g5771$.getGlobalValue() : module0731.$g5772$.getGlobalValue();
        final SubLObject var258 = Hashtables.gethash(var170, var257, (SubLObject)module0731.UNPROVIDED);
        SubLObject var259 = Equality.eq(var22, module0731.$ic1$);
        if (module0731.NIL == var259) {
            SubLObject var260;
            SubLObject var261;
            for (var260 = var258, var261 = (SubLObject)module0731.NIL, var261 = var260.first(); module0731.NIL == var259 && module0731.NIL != var260; var259 = f44644(var22, var261), var260 = var260.rest(), var261 = var260.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != var258 && module0731.NIL != var259);
    }
    
    public static SubLObject f44750(final SubLObject var170, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        return f44749(var170, var22, (SubLObject)module0731.T);
    }
    
    public static SubLObject f44751(final SubLObject var170, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        return f44749(var170, var22, (SubLObject)module0731.NIL);
    }
    
    public static SubLObject f44752(final SubLObject var170, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != f44750(var170, var22) && module0731.NIL == f44746(var170, module0731.$ic155$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
    }
    
    public static SubLObject f44753(final SubLObject var170) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        SubLObject var172 = (SubLObject)module0731.NIL;
        final SubLObject var173 = module0038.$g918$.currentBinding(var171);
        try {
            module0038.$g918$.bind(module0038.$g914$.getGlobalValue(), var171);
            SubLObject var175;
            final SubLObject var174 = var175 = module0038.f2661(var170, (SubLObject)module0731.$ic156$, (SubLObject)module0731.UNPROVIDED);
            SubLObject var176 = (SubLObject)module0731.NIL;
            var176 = var175.first();
            while (module0731.NIL != var175) {
                if (module0731.NIL != f44750(var176, (SubLObject)module0731.UNPROVIDED)) {
                    var172 = (SubLObject)module0731.T;
                }
                var175 = var175.rest();
                var176 = var175.first();
            }
        }
        finally {
            module0038.$g918$.rebind(var173, var171);
        }
        return var172;
    }
    
    public static SubLObject f44754() {
        final SubLObject var3 = module0731.$g5773$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44755(SubLObject var204) {
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0731.$g5773$.getGlobalValue(), (SubLObject)ConsesLow.list(var204), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44756(final SubLObject var204) {
        SubLObject var205 = (SubLObject)module0731.NIL;
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final Iterator var208 = Hashtables.getEntrySetIterator(module0731.$g5771$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var208)) {
                final Map.Entry var209 = Hashtables.iteratorNextEntry(var208);
                var206 = Hashtables.getEntryKey(var209);
                var207 = Hashtables.getEntryValue(var209);
                SubLObject var210 = Equality.eq(var204, module0731.$ic1$);
                if (module0731.NIL == var210) {
                    SubLObject var211;
                    SubLObject var212;
                    for (var211 = var207, var212 = (SubLObject)module0731.NIL, var212 = var211.first(); module0731.NIL == var210 && module0731.NIL != var211; var210 = f44644(var204, var212), var211 = var211.rest(), var212 = var211.first()) {}
                }
                if (module0731.NIL != var210) {
                    var205 = (SubLObject)ConsesLow.cons(var206, var205);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var208);
        }
        return var205;
    }
    
    public static SubLObject f44757(SubLObject var204) {
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var205 = module0731.$g5773$.getGlobalValue();
        if (module0731.NIL == var205) {
            var205 = module0034.f1934((SubLObject)module0731.$ic157$, (SubLObject)module0731.$ic158$, (SubLObject)module0731.$ic13$, (SubLObject)module0731.EQ, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.FOUR_INTEGER);
        }
        SubLObject var206 = module0034.f1814(var205, var204, (SubLObject)module0731.$ic6$);
        if (var206 == module0731.$ic6$) {
            var206 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44756(var204)));
            module0034.f1816(var205, var204, var206, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var206);
    }
    
    public static SubLObject f44712(final SubLObject var115, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return module0004.f104(var115, f44758(var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44759() {
        final SubLObject var3 = module0731.$g5774$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44760(SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0731.$g5774$.getGlobalValue(), (SubLObject)ConsesLow.list(var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44761(final SubLObject var22) {
        return module0256.f16552(module0731.$ic90$, var22, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44758(SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var23 = module0731.$g5774$.getGlobalValue();
        if (module0731.NIL == var23) {
            var23 = module0034.f1934((SubLObject)module0731.$ic159$, (SubLObject)module0731.$ic160$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQL, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.EIGHT_INTEGER);
        }
        SubLObject var24 = module0034.f1814(var23, var22, (SubLObject)module0731.$ic6$);
        if (var24 == module0731.$ic6$) {
            var24 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44761(var22)));
            module0034.f1816(var23, var22, var24, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f44762() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (!Hashtables.hash_table_count(module0731.$g5775$.getDynamicValue(var4)).isPositive()) {
            if (module0731.NIL != module0128.f8463(module0731.$ic128$, (SubLObject)module0731.UNPROVIDED)) {
                final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
                final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
                try {
                    module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var4);
                    module0147.$g2095$.bind(module0731.$ic22$, var4);
                    SubLObject var7 = module0731.$ic128$;
                    final SubLObject var8 = (SubLObject)module0731.$ic48$;
                    final SubLObject var9 = module0056.f4145(var8);
                    final SubLObject var7_265 = module0139.$g1635$.currentBinding(var4);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var4);
                        final SubLObject var10 = (SubLObject)module0731.NIL;
                        final SubLObject var7_266 = module0141.$g1714$.currentBinding(var4);
                        final SubLObject var8_267 = module0141.$g1715$.currentBinding(var4);
                        try {
                            module0141.$g1714$.bind((module0731.NIL != var10) ? var10 : module0141.f9283(), var4);
                            module0141.$g1715$.bind((SubLObject)((module0731.NIL != var10) ? module0731.$ic49$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                            if (module0731.NIL != var10 && module0731.NIL != module0136.f8864() && module0731.NIL == module0141.f9279(var10)) {
                                final SubLObject var11 = module0136.$g1591$.getDynamicValue(var4);
                                if (var11.eql((SubLObject)module0731.$ic50$)) {
                                    module0136.f8870((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                }
                                else if (var11.eql((SubLObject)module0731.$ic53$)) {
                                    module0136.f8871((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                }
                                else if (var11.eql((SubLObject)module0731.$ic55$)) {
                                    Errors.warn((SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0731.$ic56$, module0136.$g1591$.getDynamicValue(var4));
                                    Errors.cerror((SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                                }
                            }
                            final SubLObject var7_267 = module0141.$g1670$.currentBinding(var4);
                            final SubLObject var8_268 = module0141.$g1671$.currentBinding(var4);
                            final SubLObject var12 = module0141.$g1672$.currentBinding(var4);
                            final SubLObject var13 = module0141.$g1674$.currentBinding(var4);
                            final SubLObject var14 = module0137.$g1605$.currentBinding(var4);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0731.$ic57$), var4);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0731.$ic57$)), var4);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0731.$ic57$)), var4);
                                module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                module0137.$g1605$.bind(module0137.f8955(module0731.$ic57$), var4);
                                if (module0731.NIL != module0136.f8865() || module0731.NIL != module0244.f15795(module0731.$ic128$, module0137.f8955((SubLObject)module0731.UNPROVIDED))) {
                                    final SubLObject var7_268 = module0141.$g1677$.currentBinding(var4);
                                    final SubLObject var8_269 = module0138.$g1619$.currentBinding(var4);
                                    final SubLObject var9_272 = module0141.$g1674$.currentBinding(var4);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var4);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0731.$ic57$)), var4);
                                        module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                        module0249.f16055(var7, (SubLObject)module0731.UNPROVIDED);
                                        while (module0731.NIL != var7) {
                                            final SubLObject var15 = var7;
                                            final SubLObject var16 = module0731.$ic91$;
                                            if (module0731.NIL != module0158.f10010(var15, (SubLObject)module0731.TWO_INTEGER, var16)) {
                                                final SubLObject var17 = module0158.f10011(var15, (SubLObject)module0731.TWO_INTEGER, var16);
                                                SubLObject var18 = (SubLObject)module0731.NIL;
                                                final SubLObject var19 = (SubLObject)module0731.NIL;
                                                while (module0731.NIL == var18) {
                                                    final SubLObject var20 = module0052.f3695(var17, var19);
                                                    final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                                    if (module0731.NIL != var21) {
                                                        SubLObject var22 = (SubLObject)module0731.NIL;
                                                        try {
                                                            var22 = module0158.f10316(var20, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                                            SubLObject var60_273 = (SubLObject)module0731.NIL;
                                                            final SubLObject var61_274 = (SubLObject)module0731.NIL;
                                                            while (module0731.NIL == var60_273) {
                                                                final SubLObject var23 = module0052.f3695(var22, var61_274);
                                                                final SubLObject var63_275 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_274.eql(var23));
                                                                if (module0731.NIL != var63_275) {
                                                                    final SubLObject var24 = module0178.f11336(var23);
                                                                    final SubLObject var25 = module0178.f11287(var23);
                                                                    module0030.f1600(var24, var25, module0731.$g5775$.getDynamicValue(var4), (SubLObject)module0731.UNPROVIDED);
                                                                }
                                                                var60_273 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_275);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var7_269 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var4);
                                                                if (module0731.NIL != var22) {
                                                                    module0158.f10319(var22);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_269, var4);
                                                            }
                                                        }
                                                    }
                                                    var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var21);
                                                }
                                            }
                                            SubLObject var27;
                                            final SubLObject var26 = var27 = module0200.f12443(module0137.f8955(module0731.$ic57$));
                                            SubLObject var28 = (SubLObject)module0731.NIL;
                                            var28 = var27.first();
                                            while (module0731.NIL != var27) {
                                                final SubLObject var7_270 = module0137.$g1605$.currentBinding(var4);
                                                final SubLObject var8_270 = module0141.$g1674$.currentBinding(var4);
                                                try {
                                                    module0137.$g1605$.bind(var28, var4);
                                                    module0141.$g1674$.bind((SubLObject)((module0731.NIL != module0141.f9205((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0731.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                    final SubLObject var29 = module0228.f15229(var7);
                                                    if (module0731.NIL != module0138.f8992(var29)) {
                                                        final SubLObject var30 = module0242.f15664(var29, module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                        if (module0731.NIL != var30) {
                                                            final SubLObject var31 = module0245.f15834(var30, module0138.f8979(), module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                            if (module0731.NIL != var31) {
                                                                SubLObject var32;
                                                                for (var32 = module0066.f4838(module0067.f4891(var31)); module0731.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
                                                                    var4.resetMultipleValues();
                                                                    final SubLObject var33 = module0066.f4839(var32);
                                                                    final SubLObject var34 = var4.secondMultipleValue();
                                                                    var4.resetMultipleValues();
                                                                    if (module0731.NIL != module0147.f9507(var33)) {
                                                                        final SubLObject var7_271 = module0138.$g1623$.currentBinding(var4);
                                                                        try {
                                                                            module0138.$g1623$.bind(var33, var4);
                                                                            SubLObject var98_280;
                                                                            for (var98_280 = module0066.f4838(module0067.f4891(var34)); module0731.NIL == module0066.f4841(var98_280); var98_280 = module0066.f4840(var98_280)) {
                                                                                var4.resetMultipleValues();
                                                                                final SubLObject var35 = module0066.f4839(var98_280);
                                                                                final SubLObject var36 = var4.secondMultipleValue();
                                                                                var4.resetMultipleValues();
                                                                                if (module0731.NIL != module0141.f9289(var35)) {
                                                                                    final SubLObject var7_272 = module0138.$g1624$.currentBinding(var4);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var35, var4);
                                                                                        final SubLObject var37 = var36;
                                                                                        if (module0731.NIL != module0077.f5302(var37)) {
                                                                                            final SubLObject var38 = module0077.f5333(var37);
                                                                                            SubLObject var39;
                                                                                            SubLObject var40;
                                                                                            SubLObject var41;
                                                                                            for (var39 = module0032.f1741(var38), var40 = (SubLObject)module0731.NIL, var40 = module0032.f1742(var39, var38); module0731.NIL == module0032.f1744(var39, var40); var40 = module0032.f1743(var40)) {
                                                                                                var41 = module0032.f1745(var39, var40);
                                                                                                if (module0731.NIL != module0032.f1746(var40, var41) && module0731.NIL == module0249.f16059(var41, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                    module0249.f16055(var41, (SubLObject)module0731.UNPROVIDED);
                                                                                                    module0056.f4149(var41, var9);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var37.isList()) {
                                                                                            SubLObject var42 = var37;
                                                                                            SubLObject var43 = (SubLObject)module0731.NIL;
                                                                                            var43 = var42.first();
                                                                                            while (module0731.NIL != var42) {
                                                                                                if (module0731.NIL == module0249.f16059(var43, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                    module0249.f16055(var43, (SubLObject)module0731.UNPROVIDED);
                                                                                                    module0056.f4149(var43, var9);
                                                                                                }
                                                                                                var42 = var42.rest();
                                                                                                var43 = var42.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0731.$ic59$, var37);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var7_272, var4);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var98_280);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var7_271, var4);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var32);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic60$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0731.NIL != module0155.f9785(var29, (SubLObject)module0731.UNPROVIDED)) {
                                                        SubLObject var13_282;
                                                        final SubLObject var44 = var13_282 = ((module0731.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED)));
                                                        SubLObject var45 = (SubLObject)module0731.NIL;
                                                        var45 = var13_282.first();
                                                        while (module0731.NIL != var13_282) {
                                                            final SubLObject var7_273 = module0138.$g1625$.currentBinding(var4);
                                                            try {
                                                                module0138.$g1625$.bind(var45, var4);
                                                                final SubLObject var47;
                                                                final SubLObject var46 = var47 = Functions.funcall(var45, var29);
                                                                if (module0731.NIL != module0077.f5302(var47)) {
                                                                    final SubLObject var48 = module0077.f5333(var47);
                                                                    SubLObject var49;
                                                                    SubLObject var50;
                                                                    SubLObject var51;
                                                                    for (var49 = module0032.f1741(var48), var50 = (SubLObject)module0731.NIL, var50 = module0032.f1742(var49, var48); module0731.NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                        var51 = module0032.f1745(var49, var50);
                                                                        if (module0731.NIL != module0032.f1746(var50, var51) && module0731.NIL == module0249.f16059(var51, (SubLObject)module0731.UNPROVIDED)) {
                                                                            module0249.f16055(var51, (SubLObject)module0731.UNPROVIDED);
                                                                            module0056.f4149(var51, var9);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var47.isList()) {
                                                                    SubLObject var52 = var47;
                                                                    SubLObject var53 = (SubLObject)module0731.NIL;
                                                                    var53 = var52.first();
                                                                    while (module0731.NIL != var52) {
                                                                        if (module0731.NIL == module0249.f16059(var53, (SubLObject)module0731.UNPROVIDED)) {
                                                                            module0249.f16055(var53, (SubLObject)module0731.UNPROVIDED);
                                                                            module0056.f4149(var53, var9);
                                                                        }
                                                                        var52 = var52.rest();
                                                                        var53 = var52.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0731.$ic59$, var47);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var7_273, var4);
                                                            }
                                                            var13_282 = var13_282.rest();
                                                            var45 = var13_282.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var8_270, var4);
                                                    module0137.$g1605$.rebind(var7_270, var4);
                                                }
                                                var27 = var27.rest();
                                                var28 = var27.first();
                                            }
                                            var7 = module0056.f4150(var9);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var9_272, var4);
                                        module0138.$g1619$.rebind(var8_269, var4);
                                        module0141.$g1677$.rebind(var7_268, var4);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.$ic61$, module0731.$ic128$, module0244.f15748(module0137.f8955((SubLObject)module0731.UNPROVIDED)), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var14, var4);
                                module0141.$g1674$.rebind(var13, var4);
                                module0141.$g1672$.rebind(var12, var4);
                                module0141.$g1671$.rebind(var8_268, var4);
                                module0141.$g1670$.rebind(var7_267, var4);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var8_267, var4);
                            module0141.$g1714$.rebind(var7_266, var4);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
                    }
                    finally {
                        module0139.$g1635$.rebind(var7_265, var4);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var6, var4);
                    module0147.$g2094$.rebind(var5, var4);
                }
            }
            return module0731.$g5775$.getDynamicValue(var4);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44763(final SubLObject var170, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        final SubLThread var171 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        f44762();
        final SubLObject var172 = Hashtables.gethash(var170, module0731.$g5775$.getDynamicValue(var171), (SubLObject)module0731.UNPROVIDED);
        SubLObject var173 = Equality.eq(var22, module0731.$ic1$);
        if (module0731.NIL == var173) {
            SubLObject var174;
            SubLObject var175;
            for (var174 = var172, var175 = (SubLObject)module0731.NIL, var175 = var174.first(); module0731.NIL == var173 && module0731.NIL != var174; var173 = f44644(var22, var175), var174 = var174.rest(), var175 = var174.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != var172 && module0731.NIL != var173);
    }
    
    public static SubLObject f44764(final SubLObject var115, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return f44765(var115, var22);
    }
    
    public static SubLObject f44765(final SubLObject var115, final SubLObject var22) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        SubLObject var117 = (SubLObject)module0731.NIL;
        if (module0731.NIL != module0173.f10955(var115)) {
            final SubLObject var118 = module0147.$g2095$.currentBinding(var116);
            final SubLObject var119 = module0147.$g2094$.currentBinding(var116);
            final SubLObject var120 = module0147.$g2096$.currentBinding(var116);
            try {
                module0147.$g2095$.bind(module0147.f9545(var22), var116);
                module0147.$g2094$.bind(module0147.f9546(var22), var116);
                module0147.$g2096$.bind(module0147.f9549(var22), var116);
                if (module0731.NIL == var117) {
                    SubLObject var121;
                    SubLObject var122;
                    for (var121 = module0731.$g5776$.getGlobalValue(), var122 = (SubLObject)module0731.NIL, var122 = var121.first(); module0731.NIL == var117 && module0731.NIL != var121; var117 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0222.f14640(var122, var115, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.UNPROVIDED) && module0731.NIL != module0220.f14544(var115, var122, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.UNPROVIDED)), var121 = var121.rest(), var122 = var121.first()) {}
                }
            }
            finally {
                module0147.$g2096$.rebind(var120, var116);
                module0147.$g2094$.rebind(var119, var116);
                module0147.$g2095$.rebind(var118, var116);
            }
        }
        else if (!var115.isAtom()) {
            var117 = f44766(var115);
        }
        return var117;
    }
    
    public static SubLObject f44766(final SubLObject var115) {
        return module0337.f22630(var115, (SubLObject)module0731.$ic162$);
    }
    
    public static SubLObject f44767(final SubLObject var115) {
        return module0259.f16891(var115, module0731.$ic163$);
    }
    
    public static SubLObject f44719(final SubLObject var115) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        final SubLObject var117 = module0034.$g879$.getDynamicValue(var116);
        SubLObject var118 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var117) {
            return f44767(var115);
        }
        var118 = module0034.f1857(var117, (SubLObject)module0731.$ic96$, (SubLObject)module0731.UNPROVIDED);
        if (module0731.NIL == var118) {
            var118 = module0034.f1807(module0034.f1842(var117), (SubLObject)module0731.$ic96$, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic164$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.UNPROVIDED);
            module0034.f1860(var117, (SubLObject)module0731.$ic96$, var118);
        }
        SubLObject var119 = module0034.f1814(var118, var115, (SubLObject)module0731.$ic6$);
        if (var119 == module0731.$ic6$) {
            var119 = Values.arg2(var116.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44767(var115)));
            module0034.f1816(var118, var115, var119, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var119);
    }
    
    public static SubLObject f44768(final SubLObject var115) {
        return module0259.f16891(var115, module0731.$ic166$);
    }
    
    public static SubLObject f44769(final SubLObject var115) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        final SubLObject var117 = module0034.$g879$.getDynamicValue(var116);
        SubLObject var118 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var117) {
            return f44768(var115);
        }
        var118 = module0034.f1857(var117, (SubLObject)module0731.$ic165$, (SubLObject)module0731.UNPROVIDED);
        if (module0731.NIL == var118) {
            var118 = module0034.f1807(module0034.f1842(var117), (SubLObject)module0731.$ic165$, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.NIL, (SubLObject)module0731.EQUAL, (SubLObject)module0731.UNPROVIDED);
            module0034.f1860(var117, (SubLObject)module0731.$ic165$, var118);
        }
        SubLObject var119 = module0034.f1814(var118, var115, (SubLObject)module0731.$ic6$);
        if (var119 == module0731.$ic6$) {
            var119 = Values.arg2(var116.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44768(var115)));
            module0034.f1816(var118, var115, var119, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var119);
    }
    
    public static SubLObject f44770() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0077.f5328(module0731.$g5777$.getGlobalValue());
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var4);
            module0147.$g2095$.bind(module0731.$ic22$, var4);
            if (module0731.NIL != module0128.f8463(module0731.$ic168$, (SubLObject)module0731.UNPROVIDED)) {
                final SubLObject var7 = module0731.$ic168$;
                final SubLObject var7_286 = module0137.$g1605$.currentBinding(var4);
                final SubLObject var8_287 = module0139.$g1636$.currentBinding(var4);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0731.$ic78$), var4);
                    module0139.$g1636$.bind(module0139.f9007(), var4);
                    SubLObject var71_288 = var7;
                    final SubLObject var8 = (SubLObject)module0731.$ic48$;
                    final SubLObject var9 = module0056.f4145(var8);
                    final SubLObject var7_287 = module0139.$g1635$.currentBinding(var4);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var4);
                        final SubLObject var10 = (SubLObject)module0731.NIL;
                        final SubLObject var7_288 = module0141.$g1714$.currentBinding(var4);
                        final SubLObject var8_288 = module0141.$g1715$.currentBinding(var4);
                        try {
                            module0141.$g1714$.bind((module0731.NIL != var10) ? var10 : module0141.f9283(), var4);
                            module0141.$g1715$.bind((SubLObject)((module0731.NIL != var10) ? module0731.$ic49$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                            if (module0731.NIL != var10 && module0731.NIL != module0136.f8864() && module0731.NIL == module0141.f9279(var10)) {
                                final SubLObject var11 = module0136.$g1591$.getDynamicValue(var4);
                                if (var11.eql((SubLObject)module0731.$ic50$)) {
                                    module0136.f8870((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                }
                                else if (var11.eql((SubLObject)module0731.$ic53$)) {
                                    module0136.f8871((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                }
                                else if (var11.eql((SubLObject)module0731.$ic55$)) {
                                    Errors.warn((SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0731.$ic56$, module0136.$g1591$.getDynamicValue(var4));
                                    Errors.cerror((SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                                }
                            }
                            final SubLObject var7_289 = module0141.$g1670$.currentBinding(var4);
                            final SubLObject var8_289 = module0141.$g1671$.currentBinding(var4);
                            final SubLObject var12 = module0141.$g1672$.currentBinding(var4);
                            final SubLObject var13 = module0141.$g1674$.currentBinding(var4);
                            final SubLObject var14 = module0137.$g1605$.currentBinding(var4);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0731.$ic78$)), var4);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0731.$ic78$))), var4);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0731.$ic78$))), var4);
                                module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0731.$ic78$)), var4);
                                if (module0731.NIL != module0136.f8865() || module0731.NIL != module0244.f15795(var7, module0137.f8955((SubLObject)module0731.UNPROVIDED))) {
                                    final SubLObject var7_290 = module0141.$g1677$.currentBinding(var4);
                                    final SubLObject var8_290 = module0138.$g1619$.currentBinding(var4);
                                    final SubLObject var9_296 = module0141.$g1674$.currentBinding(var4);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var4);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0731.$ic78$))), var4);
                                        module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                        module0249.f16055(var71_288, (SubLObject)module0731.UNPROVIDED);
                                        while (module0731.NIL != var71_288) {
                                            final SubLObject var15 = var71_288;
                                            SubLObject var17;
                                            final SubLObject var16 = var17 = module0200.f12443(module0137.f8955(module0731.$ic78$));
                                            SubLObject var18 = (SubLObject)module0731.NIL;
                                            var18 = var17.first();
                                            while (module0731.NIL != var17) {
                                                final SubLObject var7_291 = module0137.$g1605$.currentBinding(var4);
                                                final SubLObject var8_291 = module0141.$g1674$.currentBinding(var4);
                                                try {
                                                    module0137.$g1605$.bind(var18, var4);
                                                    module0141.$g1674$.bind((SubLObject)((module0731.NIL != module0141.f9205((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0731.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                    final SubLObject var19 = module0228.f15229(var15);
                                                    if (module0731.NIL != module0138.f8992(var19)) {
                                                        final SubLObject var20 = module0242.f15664(var19, module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                        if (module0731.NIL != var20) {
                                                            final SubLObject var21 = module0245.f15834(var20, module0244.f15780(module0137.f8955(module0731.$ic78$)), module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                            if (module0731.NIL != var21) {
                                                                SubLObject var22;
                                                                for (var22 = module0066.f4838(module0067.f4891(var21)); module0731.NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
                                                                    var4.resetMultipleValues();
                                                                    final SubLObject var23 = module0066.f4839(var22);
                                                                    final SubLObject var24 = var4.secondMultipleValue();
                                                                    var4.resetMultipleValues();
                                                                    if (module0731.NIL != module0147.f9507(var23)) {
                                                                        final SubLObject var7_292 = module0138.$g1623$.currentBinding(var4);
                                                                        try {
                                                                            module0138.$g1623$.bind(var23, var4);
                                                                            SubLObject var98_302;
                                                                            for (var98_302 = module0066.f4838(module0067.f4891(var24)); module0731.NIL == module0066.f4841(var98_302); var98_302 = module0066.f4840(var98_302)) {
                                                                                var4.resetMultipleValues();
                                                                                final SubLObject var25 = module0066.f4839(var98_302);
                                                                                final SubLObject var26 = var4.secondMultipleValue();
                                                                                var4.resetMultipleValues();
                                                                                if (module0731.NIL != module0141.f9289(var25)) {
                                                                                    final SubLObject var7_293 = module0138.$g1624$.currentBinding(var4);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var25, var4);
                                                                                        final SubLObject var27 = var26;
                                                                                        if (module0731.NIL != module0077.f5302(var27)) {
                                                                                            final SubLObject var28 = module0077.f5333(var27);
                                                                                            SubLObject var29;
                                                                                            SubLObject var30;
                                                                                            SubLObject var31;
                                                                                            for (var29 = module0032.f1741(var28), var30 = (SubLObject)module0731.NIL, var30 = module0032.f1742(var29, var28); module0731.NIL == module0032.f1744(var29, var30); var30 = module0032.f1743(var30)) {
                                                                                                var31 = module0032.f1745(var29, var30);
                                                                                                if (module0731.NIL != module0032.f1746(var30, var31) && module0731.NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var4))) {
                                                                                                    module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var4));
                                                                                                    if (module0731.NIL != module0173.f10955(var31)) {
                                                                                                        module0077.f5326(var31, module0731.$g5777$.getGlobalValue());
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var27.isList()) {
                                                                                            SubLObject var32 = var27;
                                                                                            SubLObject var33 = (SubLObject)module0731.NIL;
                                                                                            var33 = var32.first();
                                                                                            while (module0731.NIL != var32) {
                                                                                                if (module0731.NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var4))) {
                                                                                                    module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var4));
                                                                                                    if (module0731.NIL != module0173.f10955(var33)) {
                                                                                                        module0077.f5326(var33, module0731.$g5777$.getGlobalValue());
                                                                                                    }
                                                                                                }
                                                                                                var32 = var32.rest();
                                                                                                var33 = var32.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0731.$ic59$, var27);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var7_293, var4);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var98_302);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var7_292, var4);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var22);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic60$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                                        }
                                                        if (module0731.NIL != module0200.f12419(var19, module0137.f8955((SubLObject)module0731.UNPROVIDED))) {
                                                            SubLObject var34 = module0248.f15995(var19);
                                                            SubLObject var35 = (SubLObject)module0731.NIL;
                                                            var35 = var34.first();
                                                            while (module0731.NIL != var34) {
                                                                SubLObject var37;
                                                                final SubLObject var36 = var37 = var35;
                                                                SubLObject var38 = (SubLObject)module0731.NIL;
                                                                SubLObject var39 = (SubLObject)module0731.NIL;
                                                                SubLObject var40 = (SubLObject)module0731.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0731.$ic169$);
                                                                var38 = var37.first();
                                                                var37 = var37.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0731.$ic169$);
                                                                var39 = var37.first();
                                                                var37 = var37.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0731.$ic169$);
                                                                var40 = var37.first();
                                                                var37 = var37.rest();
                                                                if (module0731.NIL == var37) {
                                                                    if (module0731.NIL != module0147.f9507(var39)) {
                                                                        final SubLObject var7_294 = module0138.$g1623$.currentBinding(var4);
                                                                        try {
                                                                            module0138.$g1623$.bind(var39, var4);
                                                                            if (module0731.NIL != module0141.f9289(var40)) {
                                                                                final SubLObject var7_295 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var40, var4);
                                                                                    final SubLObject var27;
                                                                                    final SubLObject var41 = var27 = (SubLObject)ConsesLow.list(var38);
                                                                                    if (module0731.NIL != module0077.f5302(var27)) {
                                                                                        final SubLObject var28 = module0077.f5333(var27);
                                                                                        SubLObject var29;
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        for (var29 = module0032.f1741(var28), var30 = (SubLObject)module0731.NIL, var30 = module0032.f1742(var29, var28); module0731.NIL == module0032.f1744(var29, var30); var30 = module0032.f1743(var30)) {
                                                                                            var31 = module0032.f1745(var29, var30);
                                                                                            if (module0731.NIL != module0032.f1746(var30, var31) && module0731.NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var4))) {
                                                                                                module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var4));
                                                                                                if (module0731.NIL != module0173.f10955(var31)) {
                                                                                                    module0077.f5326(var31, module0731.$g5777$.getGlobalValue());
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var27.isList()) {
                                                                                        SubLObject var43_313 = var27;
                                                                                        SubLObject var33 = (SubLObject)module0731.NIL;
                                                                                        var33 = var43_313.first();
                                                                                        while (module0731.NIL != var43_313) {
                                                                                            if (module0731.NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var4))) {
                                                                                                module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var4));
                                                                                                if (module0731.NIL != module0173.f10955(var33)) {
                                                                                                    module0077.f5326(var33, module0731.$g5777$.getGlobalValue());
                                                                                                }
                                                                                            }
                                                                                            var43_313 = var43_313.rest();
                                                                                            var33 = var43_313.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0731.$ic59$, var27);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_295, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var7_294, var4);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var36, (SubLObject)module0731.$ic169$);
                                                                }
                                                                var34 = var34.rest();
                                                                var35 = var34.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0731.NIL != module0155.f9785(var19, (SubLObject)module0731.UNPROVIDED)) {
                                                        SubLObject var13_314;
                                                        final SubLObject var42 = var13_314 = ((module0731.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0731.$ic78$)), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0731.$ic78$)), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED)));
                                                        SubLObject var43 = (SubLObject)module0731.NIL;
                                                        var43 = var13_314.first();
                                                        while (module0731.NIL != var13_314) {
                                                            final SubLObject var7_296 = module0138.$g1625$.currentBinding(var4);
                                                            try {
                                                                module0138.$g1625$.bind(var43, var4);
                                                                final SubLObject var45;
                                                                final SubLObject var44 = var45 = Functions.funcall(var43, var19);
                                                                if (module0731.NIL != module0077.f5302(var45)) {
                                                                    final SubLObject var46 = module0077.f5333(var45);
                                                                    SubLObject var47;
                                                                    SubLObject var48;
                                                                    SubLObject var49;
                                                                    for (var47 = module0032.f1741(var46), var48 = (SubLObject)module0731.NIL, var48 = module0032.f1742(var47, var46); module0731.NIL == module0032.f1744(var47, var48); var48 = module0032.f1743(var48)) {
                                                                        var49 = module0032.f1745(var47, var48);
                                                                        if (module0731.NIL != module0032.f1746(var48, var49) && module0731.NIL == module0249.f16059(var49, module0139.$g1636$.getDynamicValue(var4))) {
                                                                            module0249.f16055(var49, module0139.$g1636$.getDynamicValue(var4));
                                                                            if (module0731.NIL != module0173.f10955(var49)) {
                                                                                module0077.f5326(var49, module0731.$g5777$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var45.isList()) {
                                                                    SubLObject var50 = var45;
                                                                    SubLObject var51 = (SubLObject)module0731.NIL;
                                                                    var51 = var50.first();
                                                                    while (module0731.NIL != var50) {
                                                                        if (module0731.NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var4))) {
                                                                            module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var4));
                                                                            if (module0731.NIL != module0173.f10955(var51)) {
                                                                                module0077.f5326(var51, module0731.$g5777$.getGlobalValue());
                                                                            }
                                                                        }
                                                                        var50 = var50.rest();
                                                                        var51 = var50.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0731.$ic59$, var45);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var7_296, var4);
                                                            }
                                                            var13_314 = var13_314.rest();
                                                            var43 = var13_314.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var8_291, var4);
                                                    module0137.$g1605$.rebind(var7_291, var4);
                                                }
                                                var17 = var17.rest();
                                                var18 = var17.first();
                                            }
                                            SubLObject var53;
                                            final SubLObject var52 = var53 = module0200.f12443(module0244.f15771(module0137.f8955(module0731.$ic78$)));
                                            SubLObject var54 = (SubLObject)module0731.NIL;
                                            var54 = var53.first();
                                            while (module0731.NIL != var53) {
                                                final SubLObject var7_297 = module0137.$g1605$.currentBinding(var4);
                                                final SubLObject var8_292 = module0141.$g1674$.currentBinding(var4);
                                                try {
                                                    module0137.$g1605$.bind(var54, var4);
                                                    module0141.$g1674$.bind((SubLObject)((module0731.NIL != module0141.f9205((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0731.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                    final SubLObject var55 = module0228.f15229(var71_288);
                                                    if (module0731.NIL != module0138.f8992(var55)) {
                                                        final SubLObject var56 = module0242.f15664(var55, module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                        if (module0731.NIL != var56) {
                                                            final SubLObject var57 = module0245.f15834(var56, module0138.f8979(), module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                            if (module0731.NIL != var57) {
                                                                SubLObject var58;
                                                                for (var58 = module0066.f4838(module0067.f4891(var57)); module0731.NIL == module0066.f4841(var58); var58 = module0066.f4840(var58)) {
                                                                    var4.resetMultipleValues();
                                                                    final SubLObject var59 = module0066.f4839(var58);
                                                                    final SubLObject var60 = var4.secondMultipleValue();
                                                                    var4.resetMultipleValues();
                                                                    if (module0731.NIL != module0147.f9507(var59)) {
                                                                        final SubLObject var7_298 = module0138.$g1623$.currentBinding(var4);
                                                                        try {
                                                                            module0138.$g1623$.bind(var59, var4);
                                                                            SubLObject var98_303;
                                                                            for (var98_303 = module0066.f4838(module0067.f4891(var60)); module0731.NIL == module0066.f4841(var98_303); var98_303 = module0066.f4840(var98_303)) {
                                                                                var4.resetMultipleValues();
                                                                                final SubLObject var61 = module0066.f4839(var98_303);
                                                                                final SubLObject var62 = var4.secondMultipleValue();
                                                                                var4.resetMultipleValues();
                                                                                if (module0731.NIL != module0141.f9289(var61)) {
                                                                                    final SubLObject var7_299 = module0138.$g1624$.currentBinding(var4);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var61, var4);
                                                                                        final SubLObject var63 = var62;
                                                                                        if (module0731.NIL != module0077.f5302(var63)) {
                                                                                            final SubLObject var64 = module0077.f5333(var63);
                                                                                            SubLObject var65;
                                                                                            SubLObject var66;
                                                                                            SubLObject var67;
                                                                                            for (var65 = module0032.f1741(var64), var66 = (SubLObject)module0731.NIL, var66 = module0032.f1742(var65, var64); module0731.NIL == module0032.f1744(var65, var66); var66 = module0032.f1743(var66)) {
                                                                                                var67 = module0032.f1745(var65, var66);
                                                                                                if (module0731.NIL != module0032.f1746(var66, var67) && module0731.NIL == module0249.f16059(var67, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                    module0249.f16055(var67, (SubLObject)module0731.UNPROVIDED);
                                                                                                    module0056.f4149(var67, var9);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var63.isList()) {
                                                                                            SubLObject var68 = var63;
                                                                                            SubLObject var69 = (SubLObject)module0731.NIL;
                                                                                            var69 = var68.first();
                                                                                            while (module0731.NIL != var68) {
                                                                                                if (module0731.NIL == module0249.f16059(var69, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                    module0249.f16055(var69, (SubLObject)module0731.UNPROVIDED);
                                                                                                    module0056.f4149(var69, var9);
                                                                                                }
                                                                                                var68 = var68.rest();
                                                                                                var69 = var68.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0731.$ic59$, var63);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var7_299, var4);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var98_303);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var7_298, var4);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var58);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic60$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0731.NIL != module0155.f9785(var55, (SubLObject)module0731.UNPROVIDED)) {
                                                        SubLObject var13_315;
                                                        final SubLObject var70 = var13_315 = ((module0731.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED)));
                                                        SubLObject var71 = (SubLObject)module0731.NIL;
                                                        var71 = var13_315.first();
                                                        while (module0731.NIL != var13_315) {
                                                            final SubLObject var7_300 = module0138.$g1625$.currentBinding(var4);
                                                            try {
                                                                module0138.$g1625$.bind(var71, var4);
                                                                final SubLObject var73;
                                                                final SubLObject var72 = var73 = Functions.funcall(var71, var55);
                                                                if (module0731.NIL != module0077.f5302(var73)) {
                                                                    final SubLObject var74 = module0077.f5333(var73);
                                                                    SubLObject var75;
                                                                    SubLObject var76;
                                                                    SubLObject var77;
                                                                    for (var75 = module0032.f1741(var74), var76 = (SubLObject)module0731.NIL, var76 = module0032.f1742(var75, var74); module0731.NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
                                                                        var77 = module0032.f1745(var75, var76);
                                                                        if (module0731.NIL != module0032.f1746(var76, var77) && module0731.NIL == module0249.f16059(var77, (SubLObject)module0731.UNPROVIDED)) {
                                                                            module0249.f16055(var77, (SubLObject)module0731.UNPROVIDED);
                                                                            module0056.f4149(var77, var9);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var73.isList()) {
                                                                    SubLObject var78 = var73;
                                                                    SubLObject var79 = (SubLObject)module0731.NIL;
                                                                    var79 = var78.first();
                                                                    while (module0731.NIL != var78) {
                                                                        if (module0731.NIL == module0249.f16059(var79, (SubLObject)module0731.UNPROVIDED)) {
                                                                            module0249.f16055(var79, (SubLObject)module0731.UNPROVIDED);
                                                                            module0056.f4149(var79, var9);
                                                                        }
                                                                        var78 = var78.rest();
                                                                        var79 = var78.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0731.$ic59$, var73);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var7_300, var4);
                                                            }
                                                            var13_315 = var13_315.rest();
                                                            var71 = var13_315.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var8_292, var4);
                                                    module0137.$g1605$.rebind(var7_297, var4);
                                                }
                                                var53 = var53.rest();
                                                var54 = var53.first();
                                            }
                                            var71_288 = module0056.f4150(var9);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var9_296, var4);
                                        module0138.$g1619$.rebind(var8_290, var4);
                                        module0141.$g1677$.rebind(var7_290, var4);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.$ic61$, var7, module0244.f15748(module0137.f8955((SubLObject)module0731.UNPROVIDED)), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var14, var4);
                                module0141.$g1674$.rebind(var13, var4);
                                module0141.$g1672$.rebind(var12, var4);
                                module0141.$g1671$.rebind(var8_289, var4);
                                module0141.$g1670$.rebind(var7_289, var4);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var8_288, var4);
                            module0141.$g1714$.rebind(var7_288, var4);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
                    }
                    finally {
                        module0139.$g1635$.rebind(var7_287, var4);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1636$.rebind(var8_287, var4);
                    module0137.$g1605$.rebind(var7_286, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return (SubLObject)module0731.$ic7$;
    }
    
    public static SubLObject f44771(final SubLObject var115) {
        if (module0731.NIL != module0077.f5316(module0731.$g5777$.getGlobalValue())) {
            f44770();
        }
        return module0077.f5320(var115, module0731.$g5777$.getGlobalValue());
    }
    
    public static SubLObject f44729(final SubLObject var170, final SubLObject var169, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44719(var169) : var169;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var206 = (SubLObject)module0731.NIL;
        final SubLObject var207 = module0034.f1881();
        final SubLObject var208 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var207) ? var207 : module0585.f35841(), var205);
            final SubLObject var209 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_323 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var209, var205);
                SubLObject var210 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var209 && module0731.NIL == module0034.f1842(var209)) {
                    var210 = module0034.f1869(var209);
                    final SubLObject var211 = Threads.current_process();
                    if (module0731.NIL == var210) {
                        module0034.f1873(var209, var211);
                    }
                    else if (!var210.eql(var211)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var206 = module0738.f45752(var170, var169, var203, var204, (SubLObject)module0731.UNPROVIDED);
                    }
                }
                finally {
                    final SubLObject var7_324 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != f44731(var206, var176)) {
                            var206 = Sequences.delete_duplicates(ConsesLow.append(var206, module0788.f50504(var170, var169)), Symbols.symbol_function((SubLObject)module0731.EQ), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                        }
                        if (module0731.NIL != var209 && module0731.NIL == var210) {
                            module0034.f1873(var209, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_324, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_323, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var208, var205);
        }
        return var206;
    }
    
    public static SubLObject f44772() {
        f44773();
        module0770.f49102((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        f44774();
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44774() {
        f44773();
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44773() {
        module0584.f35778();
        f44775();
        module0732.f44937();
        f44706();
        f44687();
        module0732.f44927();
        f44759();
        f44776();
        module0732.f44969();
        module0732.f44975();
        f44777();
        f44740();
        module0737.f45553();
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44778(final SubLObject var171, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0731.NIL != f44719(var171) : var171;
        SubLObject var173 = (SubLObject)module0731.NIL;
        final SubLObject var174 = module0034.f1881();
        final SubLObject var175 = module0585.$g4450$.currentBinding(var172);
        try {
            module0585.$g4450$.bind((module0731.NIL != var174) ? var174 : module0585.f35841(), var172);
            final SubLObject var176 = module0585.$g4450$.getDynamicValue(var172);
            final SubLObject var7_325 = module0034.$g879$.currentBinding(var172);
            try {
                module0034.$g879$.bind(var176, var172);
                SubLObject var177 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var176 && module0731.NIL == module0034.f1842(var176)) {
                    var177 = module0034.f1869(var176);
                    final SubLObject var178 = Threads.current_process();
                    if (module0731.NIL == var177) {
                        module0034.f1873(var176, var178);
                    }
                    else if (!var177.eql(var178)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL != module0173.f10955(var171)) {
                        final SubLObject var179 = module0147.f9540(var22);
                        final SubLObject var7_326 = module0147.$g2095$.currentBinding(var172);
                        final SubLObject var180 = module0147.$g2094$.currentBinding(var172);
                        final SubLObject var181 = module0147.$g2096$.currentBinding(var172);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var179), var172);
                            module0147.$g2094$.bind(module0147.f9546(var179), var172);
                            module0147.$g2096$.bind(module0147.f9549(var179), var172);
                            SubLObject var182 = module0731.$g5776$.getGlobalValue();
                            SubLObject var183 = (SubLObject)module0731.NIL;
                            var183 = var182.first();
                            while (module0731.NIL != var182) {
                                if (module0731.NIL != module0212.f13762(var183)) {
                                    var173 = ConsesLow.append(var173, module0220.f14562(var171, var183, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
                                }
                                var182 = var182.rest();
                                var183 = var182.first();
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var181, var172);
                            module0147.$g2094$.rebind(var180, var172);
                            module0147.$g2095$.rebind(var7_326, var172);
                        }
                    }
                    else if (module0731.NIL != module0172.f10917(var171)) {
                        final SubLObject var184 = module0732.f45135(var171, (SubLObject)module0731.UNPROVIDED);
                        var173 = module0786.f50459(var184, (SubLObject)module0731.UNPROVIDED);
                    }
                    else {
                        Errors.warn((SubLObject)module0731.$ic170$, var171);
                        var173 = (SubLObject)module0731.NIL;
                    }
                }
                finally {
                    final SubLObject var7_327 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                        if (module0731.NIL != var176 && module0731.NIL == var177) {
                            module0034.f1873(var176, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_327, var172);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_325, var172);
            }
        }
        finally {
            module0585.$g4450$.rebind(var175, var172);
        }
        return var173;
    }
    
    public static SubLObject f44720(final SubLObject var171, final SubLObject var19, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0731.NIL != f44719(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        SubLObject var173 = (SubLObject)module0731.NIL;
        final SubLObject var174 = var22;
        final SubLObject var175 = module0147.$g2094$.currentBinding(var172);
        final SubLObject var176 = module0147.$g2095$.currentBinding(var172);
        try {
            module0147.$g2094$.bind(module0147.f9531(var174), var172);
            module0147.$g2095$.bind(module0147.f9534(var174), var172);
            if (module0731.NIL == var173) {
                SubLObject var177;
                SubLObject var178;
                for (var177 = f44778(var171, var22), var178 = (SubLObject)module0731.NIL, var178 = var177.first(); module0731.NIL == var173 && module0731.NIL != var177; var173 = ((module0731.NIL != var22) ? f44713(var178, var19, var22) : f44713(var178, var19, module0147.$g2095$.getDynamicValue(var172))), var177 = var177.rest(), var178 = var177.first()) {}
            }
        }
        finally {
            module0147.$g2095$.rebind(var176, var172);
            module0147.$g2094$.rebind(var175, var172);
        }
        return var173;
    }
    
    public static SubLObject f44776() {
        final SubLObject var3 = module0731.$g5778$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44779(final SubLObject var170) {
        return module0034.f1829(module0731.$g5778$.getGlobalValue(), (SubLObject)ConsesLow.list(var170), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44780(final SubLObject var170) {
        final SubLObject var171 = f44745(var170, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        if (module0731.NIL == var171) {
            return (SubLObject)module0731.NIL;
        }
        SubLObject var172 = var171;
        SubLObject var173 = (SubLObject)module0731.NIL;
        var173 = var172.first();
        while (module0731.NIL != var172) {
            if (module0731.NIL == f44713(var173, module0731.$ic143$, (SubLObject)module0731.UNPROVIDED)) {
                return (SubLObject)module0731.NIL;
            }
            var172 = var172.rest();
            var173 = var172.first();
        }
        return (SubLObject)module0731.T;
    }
    
    public static SubLObject f44781(final SubLObject var170) {
        SubLObject var171 = module0731.$g5778$.getGlobalValue();
        if (module0731.NIL == var171) {
            var171 = module0034.f1934((SubLObject)module0731.$ic171$, (SubLObject)module0731.$ic172$, (SubLObject)module0731.$ic27$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic42$);
        }
        SubLObject var172 = module0034.f1814(var171, var170, (SubLObject)module0731.$ic6$);
        if (var172 == module0731.$ic6$) {
            var172 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44780(var170)));
            module0034.f1816(var171, var170, var172, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var172);
    }
    
    public static SubLObject f44782(final SubLObject var170, final SubLObject var330, SubLObject var331, SubLObject var332, SubLObject var203, SubLObject var333, SubLObject var204, SubLObject var334, SubLObject var176, SubLObject var335) {
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var333 == module0731.UNPROVIDED) {
            var333 = (SubLObject)module0731.NIL;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var334 == module0731.UNPROVIDED) {
            var334 = module0731.$ic1$;
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        if (var335 == module0731.UNPROVIDED) {
            var335 = module0584.$g4411$.getDynamicValue();
        }
        final SubLThread var336 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != module0210.f13565(var330) : var330;
        assert module0731.NIL != Types.listp(var331) : var331;
        assert module0731.NIL != Types.keywordp(var332) : var332;
        assert module0731.NIL != Types.booleanp(var203) : var203;
        assert module0731.NIL != Types.booleanp(var333) : var333;
        assert module0731.NIL != module0161.f10499(var204) : var204;
        assert module0731.NIL != module0161.f10499(var334) : var334;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        assert module0731.NIL != module0077.f5302(var335) : var335;
        SubLObject var337 = (SubLObject)module0731.NIL;
        final SubLObject var338 = module0034.f1881();
        final SubLObject var339 = module0585.$g4450$.currentBinding(var336);
        try {
            module0585.$g4450$.bind((module0731.NIL != var338) ? var338 : module0585.f35841(), var336);
            final SubLObject var340 = module0585.$g4450$.getDynamicValue(var336);
            final SubLObject var7_336 = module0034.$g879$.currentBinding(var336);
            try {
                module0034.$g879$.bind(var340, var336);
                SubLObject var341 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var340 && module0731.NIL == module0034.f1842(var340)) {
                    var341 = module0034.f1869(var340);
                    final SubLObject var342 = Threads.current_process();
                    if (module0731.NIL == var341) {
                        module0034.f1873(var340, var342);
                    }
                    else if (!var341.eql(var342)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var336.resetMultipleValues();
                    final SubLObject var343 = f44783(var170, var331, var332, var203, var333, var204, var176, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var344 = var336.secondMultipleValue();
                    var336.resetMultipleValues();
                    SubLObject var345 = (SubLObject)module0731.NIL;
                    SubLObject var340_341 = (SubLObject)module0731.NIL;
                    SubLObject var346 = (SubLObject)module0731.NIL;
                    SubLObject var21_343 = (SubLObject)module0731.NIL;
                    var345 = var343;
                    var340_341 = var345.first();
                    var346 = var344;
                    var21_343 = var346.first();
                    while (module0731.NIL != var346 || module0731.NIL != var345) {
                        if (module0731.NIL != f44784(var21_343, var335)) {
                            final SubLObject var347 = module0147.f9540(var334);
                            final SubLObject var7_337 = module0147.$g2095$.currentBinding(var336);
                            final SubLObject var348 = module0147.$g2094$.currentBinding(var336);
                            final SubLObject var349 = module0147.$g2096$.currentBinding(var336);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var347), var336);
                                module0147.$g2094$.bind(module0147.f9546(var347), var336);
                                module0147.$g2096$.bind(module0147.f9549(var347), var336);
                                if (module0731.NIL != f44785(var340_341, var330, (SubLObject)module0731.UNPROVIDED)) {
                                    final SubLObject var350 = var340_341;
                                    if (module0731.NIL == conses_high.member(var350, var337, Symbols.symbol_function((SubLObject)module0731.EQUAL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                        var337 = (SubLObject)ConsesLow.cons(var350, var337);
                                    }
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var349, var336);
                                module0147.$g2094$.rebind(var348, var336);
                                module0147.$g2095$.rebind(var7_337, var336);
                            }
                        }
                        var345 = var345.rest();
                        var340_341 = var345.first();
                        var346 = var346.rest();
                        var21_343 = var346.first();
                    }
                }
                finally {
                    final SubLObject var7_338 = Threads.$is_thread_performing_cleanupP$.currentBinding(var336);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var336);
                        if (module0731.NIL != var340 && module0731.NIL == var341) {
                            module0034.f1873(var340, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_338, var336);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_336, var336);
            }
        }
        finally {
            module0585.$g4450$.rebind(var339, var336);
        }
        return var337;
    }
    
    public static SubLObject f44784(final SubLObject var21, final SubLObject var335) {
        SubLObject var336 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var336) {
            SubLObject var337 = var21;
            SubLObject var338 = (SubLObject)module0731.NIL;
            var338 = var337.first();
            while (module0731.NIL == var336 && module0731.NIL != var337) {
                if (module0731.NIL == module0077.f5320(var338, var335)) {
                    var336 = (SubLObject)module0731.T;
                }
                var337 = var337.rest();
                var338 = var337.first();
            }
        }
        return var336;
    }
    
    public static SubLObject f44786(final SubLObject var340, final SubLObject var330, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var341 = SubLProcess.currentSubLThread();
        SubLObject var342 = (SubLObject)module0731.NIL;
        final SubLObject var343 = module0147.f9540(var22);
        final SubLObject var344 = module0147.$g2095$.currentBinding(var341);
        final SubLObject var345 = module0147.$g2094$.currentBinding(var341);
        final SubLObject var346 = module0147.$g2096$.currentBinding(var341);
        try {
            module0147.$g2095$.bind(module0147.f9545(var343), var341);
            module0147.$g2094$.bind(module0147.f9546(var343), var341);
            module0147.$g2096$.bind(module0147.f9549(var343), var341);
            if (module0731.NIL != module0305.f20445(var340, var330, var22)) {
                var342 = (SubLObject)module0731.T;
            }
            else if (module0731.NIL != module0173.f10955(var340) && module0731.NIL != module0259.f16941(var340, var330, (SubLObject)module0731.UNPROVIDED)) {
                var342 = (SubLObject)module0731.T;
            }
        }
        finally {
            module0147.$g2096$.rebind(var346, var341);
            module0147.$g2094$.rebind(var345, var341);
            module0147.$g2095$.rebind(var344, var341);
        }
        return var342;
    }
    
    public static SubLObject f44785(final SubLObject var340, final SubLObject var330, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var341 = SubLProcess.currentSubLThread();
        final SubLObject var342 = module0034.$g879$.getDynamicValue(var341);
        SubLObject var343 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var342) {
            return f44786(var340, var330, var22);
        }
        var343 = module0034.f1857(var342, (SubLObject)module0731.$ic184$, (SubLObject)module0731.UNPROVIDED);
        if (module0731.NIL == var343) {
            var343 = module0034.f1807(module0034.f1842(var342), (SubLObject)module0731.$ic184$, (SubLObject)module0731.THREE_INTEGER, (SubLObject)module0731.NIL, (SubLObject)module0731.EQUAL, (SubLObject)module0731.UNPROVIDED);
            module0034.f1860(var342, (SubLObject)module0731.$ic184$, var343);
        }
        final SubLObject var344 = module0034.f1781(var340, var330, var22);
        final SubLObject var345 = module0034.f1814(var343, var344, (SubLObject)module0731.UNPROVIDED);
        if (var345 != module0731.$ic6$) {
            SubLObject var346 = var345;
            SubLObject var347 = (SubLObject)module0731.NIL;
            var347 = var346.first();
            while (module0731.NIL != var346) {
                SubLObject var348 = var347.first();
                final SubLObject var349 = conses_high.second(var347);
                if (var340.equal(var348.first())) {
                    var348 = var348.rest();
                    if (var330.equal(var348.first())) {
                        var348 = var348.rest();
                        if (module0731.NIL != var348 && module0731.NIL == var348.rest() && var22.equal(var348.first())) {
                            return module0034.f1959(var349);
                        }
                    }
                }
                var346 = var346.rest();
                var347 = var346.first();
            }
        }
        final SubLObject var350 = Values.arg2(var341.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44786(var340, var330, var22)));
        module0034.f1836(var343, var344, var345, var350, (SubLObject)ConsesLow.list(var340, var330, var22));
        return module0034.f1959(var350);
    }
    
    public static SubLObject f44787(final SubLObject var340, final SubLObject var330) {
        if (module0731.NIL != f44785(var340, var330, (SubLObject)module0731.UNPROVIDED)) {
            return (SubLObject)module0731.T;
        }
        SubLObject var341 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var341) {
            SubLObject var342;
            SubLObject var343;
            for (var342 = module0259.f16821(var340, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED), var343 = (SubLObject)module0731.NIL, var343 = var342.first(); module0731.NIL == var341 && module0731.NIL != var342; var341 = module0257.f16689(var343, var330, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED), var342 = var342.rest(), var343 = var342.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var341);
    }
    
    public static SubLObject f44788(final SubLObject var340, final SubLObject var330) {
        final SubLThread var341 = SubLProcess.currentSubLThread();
        final SubLObject var342 = module0034.$g879$.getDynamicValue(var341);
        SubLObject var343 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var342) {
            return f44787(var340, var330);
        }
        var343 = module0034.f1857(var342, (SubLObject)module0731.$ic185$, (SubLObject)module0731.UNPROVIDED);
        if (module0731.NIL == var343) {
            var343 = module0034.f1807(module0034.f1842(var342), (SubLObject)module0731.$ic185$, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.NIL, (SubLObject)module0731.EQUAL, (SubLObject)module0731.UNPROVIDED);
            module0034.f1860(var342, (SubLObject)module0731.$ic185$, var343);
        }
        final SubLObject var344 = module0034.f1782(var340, var330);
        final SubLObject var345 = module0034.f1814(var343, var344, (SubLObject)module0731.UNPROVIDED);
        if (var345 != module0731.$ic6$) {
            SubLObject var346 = var345;
            SubLObject var347 = (SubLObject)module0731.NIL;
            var347 = var346.first();
            while (module0731.NIL != var346) {
                SubLObject var348 = var347.first();
                final SubLObject var349 = conses_high.second(var347);
                if (var340.equal(var348.first())) {
                    var348 = var348.rest();
                    if (module0731.NIL != var348 && module0731.NIL == var348.rest() && var330.equal(var348.first())) {
                        return module0034.f1959(var349);
                    }
                }
                var346 = var346.rest();
                var347 = var346.first();
            }
        }
        final SubLObject var350 = Values.arg2(var341.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44787(var340, var330)));
        module0034.f1836(var343, var344, var345, var350, (SubLObject)ConsesLow.list(var340, var330));
        return module0034.f1959(var350);
    }
    
    public static SubLObject f44789(final SubLObject var170, final SubLObject var348, final SubLObject var349, SubLObject var350, SubLObject var331, SubLObject var332, SubLObject var203, SubLObject var333, SubLObject var204, SubLObject var334, SubLObject var335) {
        if (var350 == module0731.UNPROVIDED) {
            var350 = (SubLObject)module0731.NIL;
        }
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var333 == module0731.UNPROVIDED) {
            var333 = (SubLObject)module0731.NIL;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var334 == module0731.UNPROVIDED) {
            var334 = module0731.$ic1$;
        }
        if (var335 == module0731.UNPROVIDED) {
            var335 = module0584.$g4411$.getDynamicValue();
        }
        final SubLThread var351 = SubLProcess.currentSubLThread();
        SubLObject var352 = (SubLObject)module0731.NIL;
        final SubLObject var353 = module0034.f1881();
        final SubLObject var354 = module0585.$g4450$.currentBinding(var351);
        try {
            module0585.$g4450$.bind((module0731.NIL != var353) ? var353 : module0585.f35841(), var351);
            final SubLObject var355 = module0585.$g4450$.getDynamicValue(var351);
            final SubLObject var7_351 = module0034.$g879$.currentBinding(var351);
            try {
                module0034.$g879$.bind(var355, var351);
                SubLObject var356 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var355 && module0731.NIL == module0034.f1842(var355)) {
                    var356 = module0034.f1869(var355);
                    final SubLObject var357 = Threads.current_process();
                    if (module0731.NIL == var356) {
                        module0034.f1873(var355, var357);
                    }
                    else if (!var356.eql(var357)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var351.resetMultipleValues();
                    final SubLObject var358 = f44783(var170, var331, var332, var203, var333, var204, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var359 = var351.secondMultipleValue();
                    var351.resetMultipleValues();
                    SubLObject var360 = (SubLObject)module0731.NIL;
                    SubLObject var340_353 = (SubLObject)module0731.NIL;
                    SubLObject var361 = (SubLObject)module0731.NIL;
                    SubLObject var21_355 = (SubLObject)module0731.NIL;
                    var360 = var358;
                    var340_353 = var360.first();
                    var361 = var359;
                    var21_355 = var361.first();
                    while (module0731.NIL != var361 || module0731.NIL != var360) {
                        if (module0731.NIL != f44784(var21_355, var335)) {
                            final SubLObject var362 = (module0731.NIL != var350) ? Symbols.symbol_function((SubLObject)module0731.$ic186$) : Symbols.symbol_function((SubLObject)module0731.$ic184$);
                            SubLObject var363 = (SubLObject)module0731.NIL;
                            SubLObject var364 = (SubLObject)module0731.NIL;
                            final SubLObject var365 = module0147.f9540(var334);
                            final SubLObject var7_352 = module0147.$g2095$.currentBinding(var351);
                            final SubLObject var366 = module0147.$g2094$.currentBinding(var351);
                            final SubLObject var367 = module0147.$g2096$.currentBinding(var351);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var365), var351);
                                module0147.$g2094$.bind(module0147.f9546(var365), var351);
                                module0147.$g2096$.bind(module0147.f9549(var365), var351);
                                if (module0731.NIL == var363) {
                                    SubLObject var368 = var348;
                                    SubLObject var369 = (SubLObject)module0731.NIL;
                                    var369 = var368.first();
                                    while (module0731.NIL == var363 && module0731.NIL != var368) {
                                        if (module0731.NIL == Functions.funcall(var362, var340_353, var369)) {
                                            var363 = (SubLObject)module0731.T;
                                        }
                                        var368 = var368.rest();
                                        var369 = var368.first();
                                    }
                                }
                                if (module0731.NIL == var363 && module0731.NIL == var364) {
                                    SubLObject var368 = var349;
                                    SubLObject var370 = (SubLObject)module0731.NIL;
                                    var370 = var368.first();
                                    while (module0731.NIL == var364 && module0731.NIL != var368) {
                                        if (module0731.NIL != Functions.funcall(var362, var340_353, var370)) {
                                            var364 = (SubLObject)module0731.T;
                                        }
                                        var368 = var368.rest();
                                        var370 = var368.first();
                                    }
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var367, var351);
                                module0147.$g2094$.rebind(var366, var351);
                                module0147.$g2095$.rebind(var7_352, var351);
                            }
                            if (module0731.NIL == var363 && module0731.NIL == var364) {
                                var352 = (SubLObject)ConsesLow.cons(var340_353, var352);
                            }
                        }
                        var360 = var360.rest();
                        var340_353 = var360.first();
                        var361 = var361.rest();
                        var21_355 = var361.first();
                    }
                }
                finally {
                    final SubLObject var7_353 = Threads.$is_thread_performing_cleanupP$.currentBinding(var351);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var351);
                        if (module0731.NIL != var355 && module0731.NIL == var356) {
                            module0034.f1873(var355, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_353, var351);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_351, var351);
            }
        }
        finally {
            module0585.$g4450$.rebind(var354, var351);
        }
        return var352;
    }
    
    public static SubLObject f44790(final SubLObject var170, final SubLObject var330, final SubLObject var363, SubLObject var331, SubLObject var332, SubLObject var203, SubLObject var333, SubLObject var204, SubLObject var334) {
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var333 == module0731.UNPROVIDED) {
            var333 = (SubLObject)module0731.NIL;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var334 == module0731.UNPROVIDED) {
            var334 = module0731.$ic1$;
        }
        final SubLThread var364 = SubLProcess.currentSubLThread();
        SubLObject var365 = (SubLObject)module0731.NIL;
        final SubLObject var366 = module0034.f1881();
        final SubLObject var367 = module0585.$g4450$.currentBinding(var364);
        try {
            module0585.$g4450$.bind((module0731.NIL != var366) ? var366 : module0585.f35841(), var364);
            final SubLObject var368 = module0585.$g4450$.getDynamicValue(var364);
            final SubLObject var7_364 = module0034.$g879$.currentBinding(var364);
            try {
                module0034.$g879$.bind(var368, var364);
                SubLObject var369 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var368 && module0731.NIL == module0034.f1842(var368)) {
                    var369 = module0034.f1869(var368);
                    final SubLObject var370 = Threads.current_process();
                    if (module0731.NIL == var369) {
                        module0034.f1873(var368, var370);
                    }
                    else if (!var369.eql(var370)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    SubLObject var372;
                    final SubLObject var371 = var372 = f44782(var170, var330, var331, var332, var203, var333, var204, var334, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                    SubLObject var373 = (SubLObject)module0731.NIL;
                    var373 = var372.first();
                    while (module0731.NIL != var372) {
                        if (module0731.NIL != f44791(var373, var363, var334)) {
                            var365 = (SubLObject)ConsesLow.cons(var373, var365);
                        }
                        var372 = var372.rest();
                        var373 = var372.first();
                    }
                    if (module0731.NIL == var365 && var330.equal(module0731.$ic187$) && module0731.NIL != module0256.f16596(var330, module0731.$ic188$, var334, (SubLObject)module0731.UNPROVIDED)) {
                        var365 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0731.$ic189$, var170, var363), var365);
                    }
                    if (module0731.NIL == var365) {
                        var365 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0731.$ic190$, var170, (SubLObject)ConsesLow.list(module0731.$ic191$, var330, module0731.$ic192$, var363)), var365);
                    }
                }
                finally {
                    final SubLObject var7_365 = Threads.$is_thread_performing_cleanupP$.currentBinding(var364);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var364);
                        if (module0731.NIL != var368 && module0731.NIL == var369) {
                            module0034.f1873(var368, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_365, var364);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_364, var364);
            }
        }
        finally {
            module0585.$g4450$.rebind(var367, var364);
        }
        return var365;
    }
    
    public static SubLObject f44791(final SubLObject var363, final SubLObject var367, final SubLObject var22) {
        final SubLThread var368 = SubLProcess.currentSubLThread();
        SubLObject var369 = (SubLObject)module0731.NIL;
        final SubLObject var370 = module0147.$g2095$.currentBinding(var368);
        final SubLObject var371 = module0147.$g2094$.currentBinding(var368);
        final SubLObject var372 = module0147.$g2096$.currentBinding(var368);
        try {
            module0147.$g2095$.bind(module0147.f9545(var22), var368);
            module0147.$g2094$.bind(module0147.f9546(var22), var368);
            module0147.$g2096$.bind(module0147.f9549(var22), var368);
            final SubLObject var373 = module0259.f16854(var363, module0731.$ic188$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            final SubLObject var374 = module0259.f16854(var367, module0731.$ic188$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            final SubLObject var375 = module0259.f16854(var363, module0731.$ic193$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            final SubLObject var376 = module0259.f16854(var367, module0731.$ic193$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            if (module0731.NIL != var374 && module0731.NIL != var373 && module0731.NIL != f44792(var367, var363, var22)) {
                var369 = (SubLObject)module0731.T;
            }
            else if (module0731.NIL != var375 && module0731.NIL != var376 && module0731.NIL != f44793(var367, var363, var22)) {
                var369 = (SubLObject)module0731.T;
            }
            else {
                if (module0731.NIL != var374 && module0731.NIL != var375) {
                    if (module0731.NIL == var369) {
                        SubLObject var377;
                        SubLObject var378;
                        for (var377 = f44794(var367), var378 = (SubLObject)module0731.NIL, var378 = var377.first(); module0731.NIL == var369 && module0731.NIL != var377; var369 = f44793(var378, var363, var22), var377 = var377.rest(), var378 = var377.first()) {}
                    }
                    if (module0731.NIL == var369 && module0731.NIL == var369) {
                        SubLObject var377;
                        SubLObject var379;
                        for (var377 = f44795(var363), var379 = (SubLObject)module0731.NIL, var379 = var377.first(); module0731.NIL == var369 && module0731.NIL != var377; var369 = f44792(var367, var379, var22), var377 = var377.rest(), var379 = var377.first()) {}
                    }
                }
                if (module0731.NIL != var376 && module0731.NIL != var373 && module0731.NIL == var369) {
                    if (module0731.NIL == var369) {
                        SubLObject var377;
                        SubLObject var378;
                        for (var377 = f44795(var367), var378 = (SubLObject)module0731.NIL, var378 = var377.first(); module0731.NIL == var369 && module0731.NIL != var377; var369 = f44793(var378, var363, var22), var377 = var377.rest(), var378 = var377.first()) {}
                    }
                    if (module0731.NIL == var369 && module0731.NIL == var369) {
                        SubLObject var377;
                        SubLObject var380;
                        for (var377 = f44795(var367), var380 = (SubLObject)module0731.NIL, var380 = var377.first(); module0731.NIL == var369 && module0731.NIL != var377; var369 = f44792(var380, var363, var22), var377 = var377.rest(), var380 = var377.first()) {}
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var372, var368);
            module0147.$g2094$.rebind(var371, var368);
            module0147.$g2095$.rebind(var370, var368);
        }
        return var369;
    }
    
    public static SubLObject f44792(final SubLObject var375, final SubLObject var376, final SubLObject var22) {
        return module0540.f33526(module0409.f28506((SubLObject)ConsesLow.list(module0731.$ic194$, var375, var376), var22, (SubLObject)module0731.UNPROVIDED));
    }
    
    public static SubLObject f44793(final SubLObject var375, final SubLObject var376, final SubLObject var22) {
        return module0540.f33526(module0409.f28506((SubLObject)ConsesLow.list(module0731.$ic195$, var375, var376), var22, (SubLObject)module0731.UNPROVIDED));
    }
    
    public static SubLObject f44794(final SubLObject var367) {
        return module0220.f14562(var367, module0731.$ic196$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44795(final SubLObject var377) {
        return module0220.f14562(module0172.f10922(var377), module0731.$ic196$, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44796(SubLObject var170, SubLObject var204, SubLObject var378, SubLObject var379) {
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var378 == module0731.UNPROVIDED) {
            var378 = (SubLObject)module0731.T;
        }
        if (var379 == module0731.UNPROVIDED) {
            var379 = (SubLObject)module0731.EQUALP;
        }
        final SubLThread var380 = SubLProcess.currentSubLThread();
        if (module0731.NIL != var378 && !module0038.f2676((SubLObject)module0731.ONE_INTEGER, var170).equal((SubLObject)module0731.$ic197$)) {
            var170 = Sequences.cconcatenate(var170, (SubLObject)module0731.$ic197$);
        }
        SubLObject var381 = (SubLObject)module0731.NIL;
        final SubLObject var382 = module0034.f1881();
        final SubLObject var383 = module0585.$g4450$.currentBinding(var380);
        try {
            module0585.$g4450$.bind((module0731.NIL != var382) ? var382 : module0585.f35841(), var380);
            final SubLObject var384 = module0585.$g4450$.getDynamicValue(var380);
            final SubLObject var7_380 = module0034.$g879$.currentBinding(var380);
            try {
                module0034.$g879$.bind(var384, var380);
                SubLObject var385 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var384 && module0731.NIL == module0034.f1842(var384)) {
                    var385 = module0034.f1869(var384);
                    final SubLObject var386 = Threads.current_process();
                    if (module0731.NIL == var385) {
                        module0034.f1873(var384, var386);
                    }
                    else if (!var385.eql(var386)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    final SubLObject var387 = Strings.string_left_trim((SubLObject)module0731.$ic198$, var170);
                    SubLObject var388 = module0038.f2738(var387, (SubLObject)module0731.$ic199$, (SubLObject)module0731.NIL, (SubLObject)module0731.T, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var389 = module0738.f45835(var388.first(), (SubLObject)module0731.$ic200$);
                    final SubLObject var390 = var388.first();
                    final SubLObject var391 = Sequences.length(var388.first());
                    SubLObject var392 = (SubLObject)module0731.NIL;
                    var388 = var388.rest();
                    if (module0035.f2114(var388).equal((SubLObject)module0731.$ic201$)) {
                        var388 = conses_high.butlast(var388, (SubLObject)module0731.UNPROVIDED);
                    }
                    var392 = Sequences.length(var388);
                    SubLObject var393 = var389;
                    SubLObject var394 = (SubLObject)module0731.NIL;
                    var394 = var393.first();
                    while (module0731.NIL != var393) {
                        final SubLObject var395 = module0738.f45818(var394);
                        final SubLObject var396 = module0738.f45817(var394);
                        final SubLObject var397 = Sequences.search(var390, var395, var379, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                        SubLObject var398 = (SubLObject)module0731.ZERO_INTEGER;
                        SubLObject var399 = (SubLObject)module0731.NIL;
                        SubLObject var400 = (SubLObject)module0731.NIL;
                        SubLObject var401 = (SubLObject)module0731.NIL;
                        if (module0731.NIL != var397) {
                            var399 = Numbers.add(var397, var391);
                        }
                        else {
                            var401 = (SubLObject)module0731.T;
                        }
                        while (var398.numL(var392) && module0731.NIL == var401) {
                            var400 = ConsesLow.nth(var398, var388);
                            if (var400.equal((SubLObject)module0731.$ic201$)) {
                                var398 = Numbers.add(var398, (SubLObject)module0731.ONE_INTEGER);
                            }
                            else if (module0731.NIL != var400 && !var400.equal((SubLObject)module0731.$ic197$)) {
                                final SubLObject var402 = Sequences.search(var400, var395, var379, (SubLObject)module0731.IDENTITY, (SubLObject)module0731.ZERO_INTEGER, (SubLObject)module0731.NIL, var399, (SubLObject)module0731.UNPROVIDED);
                                if (module0731.NIL == var402) {
                                    continue;
                                }
                                var399 = Numbers.add(var402, Sequences.length(var400));
                                var398 = Numbers.add(var398, (SubLObject)module0731.ONE_INTEGER);
                            }
                            else if (var400.equal((SubLObject)module0731.$ic197$)) {
                                var398 = Numbers.add(var398, (SubLObject)module0731.ONE_INTEGER);
                                var400 = ConsesLow.nth(var398, var388);
                                if (module0731.NIL == var400) {
                                    var381 = (SubLObject)ConsesLow.cons(var396, var381);
                                }
                                else {
                                    final SubLObject var402 = Sequences.search(var400, var395, var379, (SubLObject)module0731.IDENTITY, (SubLObject)module0731.ZERO_INTEGER, (SubLObject)module0731.NIL, var399, (SubLObject)module0731.UNPROVIDED);
                                    if (module0731.NIL != var402) {
                                        var399 = Numbers.add(var402, Sequences.length(var400));
                                        var398 = Numbers.add(var398, (SubLObject)module0731.ONE_INTEGER);
                                    }
                                    else {
                                        var401 = (SubLObject)module0731.T;
                                    }
                                }
                            }
                            else {
                                if (var399.eql(Sequences.length(var395))) {
                                    continue;
                                }
                                var401 = (SubLObject)module0731.T;
                                Errors.warn((SubLObject)module0731.$ic202$);
                            }
                        }
                        if (var392.eql(var398) && var399.eql(Sequences.length(var395))) {
                            var381 = (SubLObject)ConsesLow.cons(var396, var381);
                        }
                        var393 = var393.rest();
                        var394 = var393.first();
                    }
                }
                finally {
                    final SubLObject var7_381 = Threads.$is_thread_performing_cleanupP$.currentBinding(var380);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var380);
                        if (module0731.NIL != var384 && module0731.NIL == var385) {
                            module0034.f1873(var384, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_381, var380);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_380, var380);
            }
        }
        finally {
            module0585.$g4450$.rebind(var383, var380);
        }
        return Sequences.delete_duplicates(var381, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44797(final SubLObject var170, SubLObject var396, SubLObject var397, SubLObject var176) {
        if (var396 == module0731.UNPROVIDED) {
            var396 = (SubLObject)module0731.NIL;
        }
        if (var397 == module0731.UNPROVIDED) {
            var397 = (SubLObject)module0731.$ic203$;
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var398 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != module0269.f17717(var396) : var396;
        assert module0731.NIL != Types.keywordp(var397) : var397;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var399 = (SubLObject)module0731.NIL;
        SubLObject var400 = (SubLObject)module0731.NIL;
        final SubLObject var401 = module0034.f1881();
        final SubLObject var402 = module0585.$g4450$.currentBinding(var398);
        try {
            module0585.$g4450$.bind((module0731.NIL != var401) ? var401 : module0585.f35841(), var398);
            final SubLObject var403 = module0585.$g4450$.getDynamicValue(var398);
            final SubLObject var7_399 = module0034.$g879$.currentBinding(var398);
            try {
                module0034.$g879$.bind(var403, var398);
                SubLObject var404 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var403 && module0731.NIL == module0034.f1842(var403)) {
                    var404 = module0034.f1869(var403);
                    final SubLObject var405 = Threads.current_process();
                    if (module0731.NIL == var404) {
                        module0034.f1873(var403, var405);
                    }
                    else if (!var404.eql(var405)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    SubLObject var407;
                    final SubLObject var406 = var407 = module0738.f45759(var170, var396, var397, var176);
                    SubLObject var408 = (SubLObject)module0731.NIL;
                    var408 = var407.first();
                    while (module0731.NIL != var407) {
                        if (module0731.NIL != module0782.f50334(var408)) {
                            var399 = (SubLObject)ConsesLow.cons(var408, var399);
                        }
                        else {
                            final SubLObject var409 = module0038.f2641(module0782.f50333(var408));
                            if (module0731.NIL != var409) {
                                var399 = (SubLObject)ConsesLow.cons(module0782.f50332(module0782.f50333(var408), var409), var399);
                            }
                            else {
                                var400 = (SubLObject)ConsesLow.cons(var408, var400);
                            }
                        }
                        var407 = var407.rest();
                        var408 = var407.first();
                    }
                }
                finally {
                    final SubLObject var7_400 = Threads.$is_thread_performing_cleanupP$.currentBinding(var398);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var398);
                        if (module0731.NIL != var403 && module0731.NIL == var404) {
                            module0034.f1873(var403, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_400, var398);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_399, var398);
            }
        }
        finally {
            module0585.$g4450$.rebind(var402, var398);
        }
        return Values.values(Sequences.nreverse(var399), Sequences.nreverse(var400));
    }
    
    public static SubLObject f44798(final SubLObject var170, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_405 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var205.resetMultipleValues();
                        final SubLObject var406_407 = module0738.f45753(var170, var203, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var408_409 = var205.secondMultipleValue();
                        var205.resetMultipleValues();
                        var206 = var406_407;
                        var207 = var408_409;
                    }
                }
                finally {
                    final SubLObject var7_406 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != f44731(var206, var176)) {
                            var205.resetMultipleValues();
                            final SubLObject var213 = module0788.f50493(var170, (SubLObject)module0731.UNPROVIDED);
                            final SubLObject var214 = var205.secondMultipleValue();
                            var205.resetMultipleValues();
                            var206 = ConsesLow.append(var206, var213);
                            var207 = ConsesLow.append(var207, var214);
                        }
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_406, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_405, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return Values.values(var206, var207);
    }
    
    public static SubLObject f44799(final SubLObject var170, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_413 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var205.resetMultipleValues();
                        final SubLObject var414_415 = module0738.f45755(var170, (SubLObject)module0731.$ic210$, (SubLObject)module0731.$ic211$, var203, (SubLObject)module0731.NIL, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var416_417 = var205.secondMultipleValue();
                        var205.resetMultipleValues();
                        var206 = var414_415;
                        var207 = var416_417;
                    }
                }
                finally {
                    final SubLObject var7_414 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != f44731(var206, var176)) {
                            var205.resetMultipleValues();
                            final SubLObject var213 = module0788.f50493(var170, (SubLObject)module0731.UNPROVIDED);
                            final SubLObject var214 = var205.secondMultipleValue();
                            var205.resetMultipleValues();
                            var206 = ConsesLow.append(var206, var213);
                            var207 = ConsesLow.append(var207, var214);
                        }
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_414, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_413, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return Values.values(var206, var207);
    }
    
    public static SubLObject f44800(final SubLObject var170, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var206 = (SubLObject)module0731.NIL;
        final SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_420 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var205.resetMultipleValues();
                        final SubLObject var213 = module0738.f45755(var170, (SubLObject)module0731.$ic210$, (SubLObject)module0731.$ic173$, var203, var207, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var214 = var205.secondMultipleValue();
                        var205.resetMultipleValues();
                        var206 = var213;
                        final SubLObject var215 = reader.read_from_string_ignoring_errors(var170, (SubLObject)module0731.NIL, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                        if (module0731.NIL != module0552.f34074(var215)) {
                            var206 = (SubLObject)ConsesLow.cons(var215, var206);
                        }
                    }
                }
                finally {
                    final SubLObject var7_421 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != f44731(var206, var176)) {
                            var206 = module0279.f18561(ConsesLow.append(var206, module0788.f50493(var170, (SubLObject)module0731.UNPROVIDED)));
                        }
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_421, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_420, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return var206;
    }
    
    public static SubLObject f44783(final SubLObject var170, SubLObject var331, SubLObject var332, SubLObject var203, SubLObject var333, SubLObject var204, SubLObject var176, SubLObject var422, SubLObject var423) {
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var333 == module0731.UNPROVIDED) {
            var333 = (SubLObject)module0731.NIL;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        if (var422 == module0731.UNPROVIDED) {
            var422 = (SubLObject)module0731.T;
        }
        if (var423 == module0731.UNPROVIDED) {
            var423 = (SubLObject)module0731.NIL;
        }
        final SubLThread var424 = SubLProcess.currentSubLThread();
        assert module0731.NIL != module0209.f13550(var170) : var170;
        assert module0731.NIL != Types.listp(var331) : var331;
        assert module0731.NIL != Types.keywordp(var332) : var332;
        assert module0731.NIL != Types.booleanp(var203) : var203;
        assert module0731.NIL != Types.booleanp(var333) : var333;
        assert module0731.NIL != f44801(var204) : var204;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var425 = (SubLObject)module0731.NIL;
        SubLObject var426 = (SubLObject)module0731.NIL;
        final SubLObject var427 = module0034.f1881();
        final SubLObject var428 = module0585.$g4450$.currentBinding(var424);
        try {
            module0585.$g4450$.bind((module0731.NIL != var427) ? var427 : module0585.f35841(), var424);
            final SubLObject var429 = module0585.$g4450$.getDynamicValue(var424);
            final SubLObject var7_424 = module0034.$g879$.currentBinding(var424);
            try {
                module0034.$g879$.bind(var429, var424);
                SubLObject var430 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var429 && module0731.NIL == module0034.f1842(var429)) {
                    var430 = module0034.f1869(var429);
                    final SubLObject var431 = Threads.current_process();
                    if (module0731.NIL == var430) {
                        module0034.f1873(var429, var431);
                    }
                    else if (!var430.eql(var431)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (var204.isString()) {
                        var204 = f44802(module0732.f45160(var204));
                    }
                }
                finally {
                    final SubLObject var7_425 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var424);
                        final SubLObject var7_426 = module0584.$g4396$.currentBinding(var424);
                        try {
                            module0584.$g4396$.bind(var204, var424);
                            if (module0731.NIL == f44721(var176)) {
                                var424.resetMultipleValues();
                                final SubLObject var427_428 = module0738.f45755(var170, var331, var332, var203, var333, var204, (SubLObject)module0731.UNPROVIDED);
                                final SubLObject var429_430 = var424.secondMultipleValue();
                                var424.resetMultipleValues();
                                var425 = var427_428;
                                var426 = var429_430;
                                if (module0731.NIL != var422 && var170.isString()) {
                                    final SubLObject var432 = f44803(var170);
                                    var424.resetMultipleValues();
                                    final SubLObject var432_433 = f44804(var425, var426, var432, (SubLObject)ConsesLow.make_list(Sequences.length(var432), (SubLObject)module0731.$ic214$));
                                    final SubLObject var434_435 = var424.secondMultipleValue();
                                    var424.resetMultipleValues();
                                    var425 = var432_433;
                                    var426 = var434_435;
                                }
                            }
                            if (var170.isString() && module0731.NIL != f44731(var425, var176)) {
                                var424.resetMultipleValues();
                                final SubLObject var433 = module0788.f50493(var170, (SubLObject)module0731.UNPROVIDED);
                                final SubLObject var434 = var424.secondMultipleValue();
                                var424.resetMultipleValues();
                                var424.resetMultipleValues();
                                final SubLObject var436_437 = f44804(var425, var426, var433, var434);
                                final SubLObject var438_439 = var424.secondMultipleValue();
                                var424.resetMultipleValues();
                                var425 = var436_437;
                                var426 = var438_439;
                            }
                        }
                        finally {
                            module0584.$g4396$.rebind(var7_426, var424);
                        }
                        if (module0731.NIL != var429 && module0731.NIL == var430) {
                            module0034.f1873(var429, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_425, var424);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_424, var424);
            }
        }
        finally {
            module0585.$g4450$.rebind(var428, var424);
        }
        return Values.values(var425, var426);
    }
    
    public static SubLObject f44801(final SubLObject var115) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0161.f10481(var115) || (var115.isString() && module0731.NIL != module0732.f45160(var115)));
    }
    
    public static SubLObject f44802(final SubLObject var440) {
        final SubLObject var441 = module0220.f14556(var440, module0731.$ic220$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        final SubLObject var442 = (module0731.NIL != var441) ? var441 : module0732.f45156(var440);
        return module0162.f10628(module0202.f12768(module0731.$ic221$, var442, module0731.$ic222$));
    }
    
    public static SubLObject f44804(final SubLObject var337, final SubLObject var404, final SubLObject var443, final SubLObject var444) {
        SubLObject var445 = var337;
        SubLObject var446 = var404;
        SubLObject var447 = (SubLObject)module0731.NIL;
        SubLObject var340_448 = (SubLObject)module0731.NIL;
        SubLObject var448 = (SubLObject)module0731.NIL;
        SubLObject var450_451 = (SubLObject)module0731.NIL;
        var447 = var443;
        var340_448 = var447.first();
        var448 = var444;
        var450_451 = var448.first();
        while (module0731.NIL != var448 || module0731.NIL != var447) {
            final SubLObject var449 = Sequences.position(var340_448, var445, Symbols.symbol_function((SubLObject)module0731.EQUAL), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            if (module0731.NIL == var449) {
                var445 = module0035.f2083(var340_448, var445);
                var446 = module0035.f2083(var450_451, var446);
            }
            else {
                ConsesLow.set_nth(var449, var446, conses_high.union(ConsesLow.nth(var449, var446), var450_451, Symbols.symbol_function((SubLObject)module0731.EQUAL), (SubLObject)module0731.UNPROVIDED));
            }
            var447 = var447.rest();
            var340_448 = var447.first();
            var448 = var448.rest();
            var450_451 = var448.first();
        }
        return Values.values(var445, var446);
    }
    
    public static SubLObject f44803(final SubLObject var170) {
        final SubLObject var171 = module0612.f37548(var170, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        final SubLObject var172 = (SubLObject)module0731.NIL;
        return module0035.f2116(var172, var171);
    }
    
    public static SubLObject f44805(final SubLObject var170, final SubLObject var27, SubLObject var331, SubLObject var332, SubLObject var203, SubLObject var204, SubLObject var455, SubLObject var176) {
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var455 == module0731.UNPROVIDED) {
            var455 = (SubLObject)module0731.NIL;
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        assert module0731.NIL != module0584.f35771(var176) : var176;
        if (module0731.NIL != f44690(var27, (SubLObject)module0731.UNPROVIDED)) {
            return f44806(var170, var27, var331, var332, var203, var204, var176);
        }
        if (module0731.NIL != module0584.f35795(var27)) {
            return f44807(var170, var27, var203, var204, var455);
        }
        Errors.error((SubLObject)module0731.$ic223$, var27);
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44807(final SubLObject var170, final SubLObject var456, SubLObject var203, SubLObject var204, SubLObject var455) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var455 == module0731.UNPROVIDED) {
            var455 = (SubLObject)module0731.NIL;
        }
        final SubLThread var457 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != module0584.f35795(var456) : var456;
        SubLObject var458 = (SubLObject)module0731.NIL;
        SubLObject var459 = (SubLObject)module0731.NIL;
        var457.resetMultipleValues();
        final SubLObject var460 = f44808(var170, var203, var204, var455);
        final SubLObject var461 = var457.secondMultipleValue();
        var457.resetMultipleValues();
        SubLObject var462 = (SubLObject)module0731.NIL;
        SubLObject var340_460 = (SubLObject)module0731.NIL;
        SubLObject var463 = (SubLObject)module0731.NIL;
        SubLObject var462_463 = (SubLObject)module0731.NIL;
        var462 = var460;
        var340_460 = var462.first();
        var463 = var461;
        var462_463 = var463.first();
        while (module0731.NIL != var463 || module0731.NIL != var462) {
            SubLObject var464 = var462_463;
            SubLObject var465 = (SubLObject)module0731.NIL;
            var465 = var464.first();
            while (module0731.NIL != var464) {
                SubLObject var466 = (SubLObject)module0731.NIL;
                if (module0731.NIL != f44702(var465, var456, (SubLObject)module0731.UNPROVIDED)) {
                    var466 = (SubLObject)ConsesLow.cons(var465, var466);
                }
                if (module0731.NIL != var466) {
                    var459 = (SubLObject)ConsesLow.cons(var466, var459);
                    var458 = (SubLObject)ConsesLow.cons(var340_460, var458);
                }
                var464 = var464.rest();
                var465 = var464.first();
            }
            var462 = var462.rest();
            var340_460 = var462.first();
            var463 = var463.rest();
            var462_463 = var463.first();
        }
        return Values.values(Sequences.nreverse(var458), Sequences.nreverse(var459));
    }
    
    public static SubLObject f44806(final SubLObject var170, final SubLObject var465, SubLObject var331, SubLObject var332, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var466 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44690(var465, (SubLObject)module0731.UNPROVIDED) : var465;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var467 = (SubLObject)module0731.NIL;
        SubLObject var468 = (SubLObject)module0731.NIL;
        final SubLObject var469 = module0034.f1881();
        final SubLObject var470 = module0585.$g4450$.currentBinding(var466);
        try {
            module0585.$g4450$.bind((module0731.NIL != var469) ? var469 : module0585.f35841(), var466);
            final SubLObject var471 = module0585.$g4450$.getDynamicValue(var466);
            final SubLObject var7_466 = module0034.$g879$.currentBinding(var466);
            try {
                module0034.$g879$.bind(var471, var466);
                SubLObject var472 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var471 && module0731.NIL == module0034.f1842(var471)) {
                    var472 = module0034.f1869(var471);
                    final SubLObject var473 = Threads.current_process();
                    if (module0731.NIL == var472) {
                        module0034.f1873(var471, var473);
                    }
                    else if (!var472.eql(var473)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var466.resetMultipleValues();
                        final SubLObject var467_468 = module0738.f45764(var170, var465, var331, var332, var203, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var469_470 = var466.secondMultipleValue();
                        var466.resetMultipleValues();
                        var467 = var467_468;
                        var468 = var469_470;
                    }
                }
                finally {
                    final SubLObject var7_467 = Threads.$is_thread_performing_cleanupP$.currentBinding(var466);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var466);
                        if (module0731.NIL != f44731(var467, var176)) {
                            var466.resetMultipleValues();
                            final SubLObject var474 = module0788.f50494(var170, var465, var204, (SubLObject)module0731.UNPROVIDED);
                            final SubLObject var475 = var466.secondMultipleValue();
                            var466.resetMultipleValues();
                            var467 = ConsesLow.append(var467, var474);
                            var468 = ConsesLow.append(var468, var475);
                        }
                        if (module0731.NIL != var471 && module0731.NIL == var472) {
                            module0034.f1873(var471, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_467, var466);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_466, var466);
            }
        }
        finally {
            module0585.$g4450$.rebind(var470, var466);
        }
        return Values.values(var467, var468);
    }
    
    public static SubLObject f44809(final SubLObject var170, final SubLObject var19, SubLObject var331, SubLObject var332, SubLObject var203, SubLObject var204, SubLObject var176) {
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var333 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var334 = (SubLObject)module0731.NIL;
        SubLObject var335 = (SubLObject)module0731.NIL;
        final SubLObject var336 = module0034.f1881();
        final SubLObject var337 = module0585.$g4450$.currentBinding(var333);
        try {
            module0585.$g4450$.bind((module0731.NIL != var336) ? var336 : module0585.f35841(), var333);
            final SubLObject var338 = module0585.$g4450$.getDynamicValue(var333);
            final SubLObject var7_472 = module0034.$g879$.currentBinding(var333);
            try {
                module0034.$g879$.bind(var338, var333);
                SubLObject var339 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var338 && module0731.NIL == module0034.f1842(var338)) {
                    var339 = module0034.f1869(var338);
                    final SubLObject var340 = Threads.current_process();
                    if (module0731.NIL == var339) {
                        module0034.f1873(var338, var340);
                    }
                    else if (!var339.eql(var340)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var333.resetMultipleValues();
                        final SubLObject var473_474 = module0738.f45763(var170, var19, var331, var332, var203, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var475_476 = var333.secondMultipleValue();
                        var333.resetMultipleValues();
                        var334 = var473_474;
                        var335 = var475_476;
                    }
                }
                finally {
                    final SubLObject var7_473 = Threads.$is_thread_performing_cleanupP$.currentBinding(var333);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var333);
                        if (module0731.NIL != f44731(var334, var176)) {
                            var333.resetMultipleValues();
                            final SubLObject var341 = module0788.f50495(var170, var19, (SubLObject)module0731.UNPROVIDED);
                            final SubLObject var342 = var333.secondMultipleValue();
                            var333.resetMultipleValues();
                            var334 = ConsesLow.append(var334, var341);
                            var335 = ConsesLow.append(var335, var342);
                        }
                        if (module0731.NIL != var338 && module0731.NIL == var339) {
                            module0034.f1873(var338, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_473, var333);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_472, var333);
            }
        }
        finally {
            module0585.$g4450$.rebind(var337, var333);
        }
        return Values.values(var334, var335);
    }
    
    public static SubLObject f44810(final SubLObject var170, final SubLObject var207, SubLObject var332, SubLObject var203, SubLObject var331, SubLObject var204, SubLObject var176) {
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        if (var203 == module0731.UNPROVIDED) {
            var203 = (SubLObject)module0731.T;
        }
        if (var331 == module0731.UNPROVIDED) {
            var331 = (SubLObject)module0731.NIL;
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var333 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var170) : var170;
        assert module0731.NIL != Types.keywordp(var207) : var207;
        assert module0731.NIL != module0584.f35771(var176) : var176;
        SubLObject var334 = (SubLObject)module0731.NIL;
        SubLObject var335 = (SubLObject)module0731.NIL;
        final SubLObject var336 = module0034.f1881();
        final SubLObject var337 = module0585.$g4450$.currentBinding(var333);
        try {
            module0585.$g4450$.bind((module0731.NIL != var336) ? var336 : module0585.f35841(), var333);
            final SubLObject var338 = module0585.$g4450$.getDynamicValue(var333);
            final SubLObject var7_478 = module0034.$g879$.currentBinding(var333);
            try {
                module0034.$g879$.bind(var338, var333);
                SubLObject var339 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var338 && module0731.NIL == module0034.f1842(var338)) {
                    var339 = module0034.f1869(var338);
                    final SubLObject var340 = Threads.current_process();
                    if (module0731.NIL == var339) {
                        module0034.f1873(var338, var340);
                    }
                    else if (!var339.eql(var340)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    if (module0731.NIL == f44721(var176)) {
                        var333.resetMultipleValues();
                        final SubLObject var479_480 = module0738.f45761(var170, var207, var331, var332, var203, var204, (SubLObject)module0731.UNPROVIDED);
                        final SubLObject var481_482 = var333.secondMultipleValue();
                        var333.resetMultipleValues();
                        var334 = var479_480;
                        var335 = var481_482;
                    }
                }
                finally {
                    final SubLObject var7_479 = Threads.$is_thread_performing_cleanupP$.currentBinding(var333);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var333);
                        if (module0731.NIL != f44731(var334, var176)) {
                            var333.resetMultipleValues();
                            final SubLObject var341 = module0788.f50496(var170, var207, var204, (SubLObject)module0731.UNPROVIDED);
                            final SubLObject var342 = var333.secondMultipleValue();
                            var333.resetMultipleValues();
                            var334 = ConsesLow.append(var334, var341);
                            var335 = ConsesLow.append(var335, var342);
                        }
                        if (module0731.NIL != var338 && module0731.NIL == var339) {
                            module0034.f1873(var338, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_479, var333);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_478, var333);
            }
        }
        finally {
            module0585.$g4450$.rebind(var337, var333);
        }
        return Values.values(var334, var335);
    }
    
    public static SubLObject f44808(final SubLObject var170, SubLObject var203, SubLObject var204, SubLObject var455) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        if (var455 == module0731.UNPROVIDED) {
            var455 = (SubLObject)module0731.NIL;
        }
        final SubLThread var456 = SubLProcess.currentSubLThread();
        SubLObject var457 = (SubLObject)module0731.NIL;
        SubLObject var458 = (SubLObject)module0731.NIL;
        final SubLObject var459 = module0034.f1881();
        final SubLObject var460 = module0585.$g4450$.currentBinding(var456);
        try {
            module0585.$g4450$.bind((module0731.NIL != var459) ? var459 : module0585.f35841(), var456);
            final SubLObject var461 = module0585.$g4450$.getDynamicValue(var456);
            final SubLObject var7_484 = module0034.$g879$.currentBinding(var456);
            try {
                module0034.$g879$.bind(var461, var456);
                SubLObject var462 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var461 && module0731.NIL == module0034.f1842(var461)) {
                    var462 = module0034.f1869(var461);
                    final SubLObject var463 = Threads.current_process();
                    if (module0731.NIL == var462) {
                        module0034.f1873(var461, var463);
                    }
                    else if (!var462.eql(var463)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var456.resetMultipleValues();
                    final SubLObject var485_486 = module0738.f45765(var170, var203, var204, var455, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var487_488 = var456.secondMultipleValue();
                    var456.resetMultipleValues();
                    var457 = var485_486;
                    var458 = var487_488;
                }
                finally {
                    final SubLObject var7_485 = Threads.$is_thread_performing_cleanupP$.currentBinding(var456);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var456);
                        if (module0731.NIL != var461 && module0731.NIL == var462) {
                            module0034.f1873(var461, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_485, var456);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_484, var456);
            }
        }
        finally {
            module0585.$g4450$.rebind(var460, var456);
        }
        return Values.values(var457, var458);
    }
    
    public static SubLObject f44811(final SubLObject var170, SubLObject var203, SubLObject var204) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        return f44808(var170, var203, var204, (SubLObject)module0731.T);
    }
    
    public static SubLObject f44812(final SubLObject var201, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var202 = SubLProcess.currentSubLThread();
        SubLObject var203 = (SubLObject)module0731.NIL;
        final SubLObject var204 = module0147.f9540(var22);
        final SubLObject var205 = module0147.$g2095$.currentBinding(var202);
        final SubLObject var206 = module0147.$g2094$.currentBinding(var202);
        final SubLObject var207 = module0147.$g2096$.currentBinding(var202);
        try {
            module0147.$g2095$.bind(module0147.f9545(var204), var202);
            module0147.$g2094$.bind(module0147.f9546(var204), var202);
            module0147.$g2096$.bind(module0147.f9549(var204), var202);
            SubLObject var209;
            final SubLObject var208 = var209 = module0737.f45529();
            SubLObject var210 = (SubLObject)module0731.NIL;
            var210 = var209.first();
            while (module0731.NIL != var209) {
                if (module0731.NIL == module0732.f45015(var210)) {
                    final SubLObject var211 = module0732.f45009(var210);
                    final SubLObject var212 = module0732.f44992(var210);
                    SubLObject var13_494 = module0219.f14509(var201, var211, var210, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                    SubLObject var213 = (SubLObject)module0731.NIL;
                    var213 = var13_494.first();
                    while (module0731.NIL != var13_494) {
                        var203 = (SubLObject)ConsesLow.cons(module0205.f13134(var213, var212, (SubLObject)module0731.UNPROVIDED), var203);
                        var13_494 = var13_494.rest();
                        var213 = var13_494.first();
                    }
                }
                var209 = var209.rest();
                var210 = var209.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var207, var202);
            module0147.$g2094$.rebind(var206, var202);
            module0147.$g2095$.rebind(var205, var202);
        }
        return var203;
    }
    
    public static SubLObject f44731(final SubLObject var496, final SubLObject var497) {
        if (var497.eql((SubLObject)module0731.$ic225$) || var497.eql((SubLObject)module0731.$ic226$)) {
            return (SubLObject)module0731.T;
        }
        if (var497.eql((SubLObject)module0731.$ic100$)) {
            return Types.sublisp_null(var496);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44721(final SubLObject var497) {
        return Equality.eq(var497, (SubLObject)module0731.$ic225$);
    }
    
    public static SubLObject f44813(final SubLObject var170, SubLObject var203, SubLObject var204) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_498 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var205.resetMultipleValues();
                    final SubLObject var499_500 = module0738.f45769(var170, var203, var204, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var501_502 = var205.secondMultipleValue();
                    var205.resetMultipleValues();
                    var206 = var499_500;
                    var207 = var501_502;
                }
                finally {
                    final SubLObject var7_499 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_499, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_498, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return Values.values(var206, var207);
    }
    
    public static SubLObject f44814(final SubLObject var170, SubLObject var203, SubLObject var204) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_504 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var205.resetMultipleValues();
                    final SubLObject var505_506 = module0738.f45774(var170, var203, var204, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var507_508 = var205.secondMultipleValue();
                    var205.resetMultipleValues();
                    var206 = var505_506;
                    var207 = var507_508;
                }
                finally {
                    final SubLObject var7_505 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_505, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_504, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return Values.values(var206, var207);
    }
    
    public static SubLObject f44815(final SubLObject var170, SubLObject var203, SubLObject var204) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_510 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var205.resetMultipleValues();
                    final SubLObject var511_512 = module0738.f45775(var170, var203, var204, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var513_514 = var205.secondMultipleValue();
                    var205.resetMultipleValues();
                    var206 = var511_512;
                    var207 = var513_514;
                }
                finally {
                    final SubLObject var7_511 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_511, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_510, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return Values.values(var206, var207);
    }
    
    public static SubLObject f44816(final SubLObject var170, SubLObject var203, SubLObject var204) {
        if (var203 == module0731.UNPROVIDED) {
            var203 = module0584.$g4389$.getDynamicValue();
        }
        if (var204 == module0731.UNPROVIDED) {
            var204 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var205 = SubLProcess.currentSubLThread();
        SubLObject var206 = (SubLObject)module0731.NIL;
        SubLObject var207 = (SubLObject)module0731.NIL;
        final SubLObject var208 = module0034.f1881();
        final SubLObject var209 = module0585.$g4450$.currentBinding(var205);
        try {
            module0585.$g4450$.bind((module0731.NIL != var208) ? var208 : module0585.f35841(), var205);
            final SubLObject var210 = module0585.$g4450$.getDynamicValue(var205);
            final SubLObject var7_516 = module0034.$g879$.currentBinding(var205);
            try {
                module0034.$g879$.bind(var210, var205);
                SubLObject var211 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var210 && module0731.NIL == module0034.f1842(var210)) {
                    var211 = module0034.f1869(var210);
                    final SubLObject var212 = Threads.current_process();
                    if (module0731.NIL == var211) {
                        module0034.f1873(var210, var212);
                    }
                    else if (!var211.eql(var212)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var205.resetMultipleValues();
                    final SubLObject var517_518 = module0738.f45771(var170, var203, var204, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var519_520 = var205.secondMultipleValue();
                    var205.resetMultipleValues();
                    var206 = var517_518;
                    var207 = var519_520;
                }
                finally {
                    final SubLObject var7_517 = Threads.$is_thread_performing_cleanupP$.currentBinding(var205);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var205);
                        if (module0731.NIL != var210 && module0731.NIL == var211) {
                            module0034.f1873(var210, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_517, var205);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_516, var205);
            }
        }
        finally {
            module0585.$g4450$.rebind(var209, var205);
        }
        return Values.values(var206, var207);
    }
    
    public static SubLObject f44817(final SubLObject var388) {
        final SubLThread var389 = SubLProcess.currentSubLThread();
        assert module0731.NIL != Types.stringp(var388) : var388;
        final SubLObject var390 = module0259.f16848(module0731.$ic227$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        SubLObject var391 = (SubLObject)module0731.NIL;
        SubLObject var392 = (SubLObject)module0731.NIL;
        SubLObject var393 = (SubLObject)module0731.NIL;
        SubLObject var394 = (SubLObject)module0731.NIL;
        final SubLObject var395 = module0034.f1881();
        final SubLObject var396 = module0585.$g4450$.currentBinding(var389);
        try {
            module0585.$g4450$.bind((module0731.NIL != var395) ? var395 : module0585.f35841(), var389);
            final SubLObject var397 = module0585.$g4450$.getDynamicValue(var389);
            final SubLObject var7_524 = module0034.$g879$.currentBinding(var389);
            try {
                module0034.$g879$.bind(var397, var389);
                SubLObject var398 = (SubLObject)module0731.NIL;
                if (module0731.NIL != var397 && module0731.NIL == module0034.f1842(var397)) {
                    var398 = module0034.f1869(var397);
                    final SubLObject var399 = Threads.current_process();
                    if (module0731.NIL == var398) {
                        module0034.f1873(var397, var399);
                    }
                    else if (!var398.eql(var399)) {
                        Errors.error((SubLObject)module0731.$ic20$);
                    }
                }
                try {
                    var389.resetMultipleValues();
                    final SubLObject var525_526 = f44783(var388, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                    final SubLObject var527_528 = var389.secondMultipleValue();
                    var389.resetMultipleValues();
                    var392 = var525_526;
                    var394 = var527_528;
                }
                finally {
                    final SubLObject var7_525 = Threads.$is_thread_performing_cleanupP$.currentBinding(var389);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var389);
                        var393 = module0035.f2119(var394);
                        if (module0731.NIL != var392 && module0731.NIL == conses_high.set_difference(var393, var390, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) {
                            var391 = (SubLObject)module0731.T;
                        }
                        if (module0731.NIL != var397 && module0731.NIL == var398) {
                            module0034.f1873(var397, (SubLObject)module0731.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_525, var389);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_524, var389);
            }
        }
        finally {
            module0585.$g4450$.rebind(var396, var389);
        }
        return var391;
    }
    
    public static SubLObject f44818(final SubLObject var332) {
        if (var332.eql((SubLObject)module0731.$ic228$)) {
            return (SubLObject)module0731.$ic229$;
        }
        if (var332.eql((SubLObject)module0731.$ic230$)) {
            return (SubLObject)module0731.$ic231$;
        }
        if (var332.eql((SubLObject)module0731.$ic211$)) {
            return (SubLObject)module0731.$ic232$;
        }
        if (var332.eql((SubLObject)module0731.$ic133$)) {
            return (SubLObject)module0731.$ic233$;
        }
        return (SubLObject)module0731.$ic234$;
    }
    
    public static SubLObject f44819(final SubLObject var332) {
        if (var332.eql((SubLObject)module0731.$ic173$)) {
            return module0731.$ic235$;
        }
        if (var332.eql((SubLObject)module0731.$ic236$)) {
            return module0731.$ic237$;
        }
        if (var332.eql((SubLObject)module0731.$ic211$)) {
            return module0731.$ic238$;
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44820(final SubLObject var332, final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var531 = SubLProcess.currentSubLThread();
        final SubLObject var532 = f44818(var332);
        SubLObject var533 = (SubLObject)module0731.NIL;
        final SubLObject var534 = module0147.f9540(var22);
        final SubLObject var535 = module0147.$g2095$.currentBinding(var531);
        final SubLObject var536 = module0147.$g2094$.currentBinding(var531);
        final SubLObject var537 = module0147.$g2096$.currentBinding(var531);
        try {
            module0147.$g2095$.bind(module0147.f9545(var534), var531);
            module0147.$g2094$.bind(module0147.f9546(var534), var531);
            module0147.$g2096$.bind(module0147.f9549(var534), var531);
            SubLObject var538 = var532;
            SubLObject var539 = (SubLObject)module0731.NIL;
            var539 = var538.first();
            while (module0731.NIL != var538) {
                final SubLObject var540 = var539;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var540)) {
                    final SubLObject var541 = module0158.f10011(var171, (SubLObject)module0731.NIL, var540);
                    SubLObject var542 = (SubLObject)module0731.NIL;
                    final SubLObject var543 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var542) {
                        final SubLObject var544 = module0052.f3695(var541, var543);
                        final SubLObject var545 = (SubLObject)SubLObjectFactory.makeBoolean(!var543.eql(var544));
                        if (module0731.NIL != var545) {
                            SubLObject var546 = (SubLObject)module0731.NIL;
                            try {
                                var546 = module0158.f10316(var544, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_532 = (SubLObject)module0731.NIL;
                                final SubLObject var61_533 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_532) {
                                    final SubLObject var547 = module0052.f3695(var546, var61_533);
                                    final SubLObject var63_534 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_533.eql(var547));
                                    if (module0731.NIL != var63_534 && module0178.f11335(var547).eql(var19) && module0178.f11336(var547).eql(var530)) {
                                        final SubLObject var548 = module0178.f11337(var547);
                                        if (module0731.NIL == conses_high.member(var548, var533, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                            var533 = (SubLObject)ConsesLow.cons(var548, var533);
                                        }
                                    }
                                    var60_532 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_534);
                                }
                            }
                            finally {
                                final SubLObject var7_535 = Threads.$is_thread_performing_cleanupP$.currentBinding(var531);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var531);
                                    if (module0731.NIL != var546) {
                                        module0158.f10319(var546);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_535, var531);
                                }
                            }
                        }
                        var542 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var545);
                    }
                }
                var538 = var538.rest();
                var539 = var538.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var537, var531);
            module0147.$g2094$.rebind(var536, var531);
            module0147.$g2095$.rebind(var535, var531);
        }
        return var533;
    }
    
    public static SubLObject f44821(final SubLObject var536, final SubLObject var332, final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var537 = SubLProcess.currentSubLThread();
        final SubLObject var538 = f44818(var332);
        SubLObject var539 = (SubLObject)module0731.NIL;
        final SubLObject var540 = module0147.f9540(var22);
        final SubLObject var541 = module0147.$g2095$.currentBinding(var537);
        final SubLObject var542 = module0147.$g2094$.currentBinding(var537);
        final SubLObject var543 = module0147.$g2096$.currentBinding(var537);
        try {
            module0147.$g2095$.bind(module0147.f9545(var540), var537);
            module0147.$g2094$.bind(module0147.f9546(var540), var537);
            module0147.$g2096$.bind(module0147.f9549(var540), var537);
            if (module0731.NIL == var539) {
                SubLObject var544 = var538;
                SubLObject var545 = (SubLObject)module0731.NIL;
                var545 = var544.first();
                while (module0731.NIL == var539 && module0731.NIL != var544) {
                    final SubLObject var546 = var545;
                    if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var546)) {
                        final SubLObject var547 = module0158.f10011(var171, (SubLObject)module0731.NIL, var546);
                        SubLObject var548 = var539;
                        final SubLObject var549 = (SubLObject)module0731.NIL;
                        while (module0731.NIL == var548) {
                            final SubLObject var550 = module0052.f3695(var547, var549);
                            final SubLObject var551 = (SubLObject)SubLObjectFactory.makeBoolean(!var549.eql(var550));
                            if (module0731.NIL != var551) {
                                SubLObject var552 = (SubLObject)module0731.NIL;
                                try {
                                    var552 = module0158.f10316(var550, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                    SubLObject var60_537 = var539;
                                    final SubLObject var61_538 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var60_537) {
                                        final SubLObject var553 = module0052.f3695(var552, var61_538);
                                        final SubLObject var63_539 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_538.eql(var553));
                                        if (module0731.NIL != var63_539 && module0178.f11335(var553).eql(var19) && module0178.f11336(var553).eql(var530) && module0178.f11337(var553).equal(var536)) {
                                            var539 = (SubLObject)module0731.T;
                                        }
                                        var60_537 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_539 || module0731.NIL != var539);
                                    }
                                }
                                finally {
                                    final SubLObject var7_540 = Threads.$is_thread_performing_cleanupP$.currentBinding(var537);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var537);
                                        if (module0731.NIL != var552) {
                                            module0158.f10319(var552);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_540, var537);
                                    }
                                }
                            }
                            var548 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var551 || module0731.NIL != var539);
                        }
                    }
                    var544 = var544.rest();
                    var545 = var544.first();
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var543, var537);
            module0147.$g2094$.rebind(var542, var537);
            module0147.$g2095$.rebind(var541, var537);
        }
        return var539;
    }
    
    public static SubLObject f44822(final SubLObject var340, final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return f44821(var340, (SubLObject)module0731.$ic173$, var171, var19, var530, var22);
    }
    
    public static SubLObject f44823(final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return f44820((SubLObject)module0731.$ic173$, var171, var19, var530, var22);
    }
    
    public static SubLObject f44824(final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return f44823(var171, var19, var530, var22);
    }
    
    public static SubLObject f44825(final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return f44820((SubLObject)module0731.$ic228$, var171, var19, var530, var22);
    }
    
    public static SubLObject f44826(final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return f44820((SubLObject)module0731.$ic230$, var171, var19, var530, var22);
    }
    
    public static SubLObject f44827(final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var332) {
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        final SubLThread var531 = SubLProcess.currentSubLThread();
        final SubLObject var532 = f44818(var332);
        SubLObject var533 = (SubLObject)module0731.NIL;
        SubLObject var534 = var532;
        SubLObject var535 = (SubLObject)module0731.NIL;
        var535 = var534.first();
        while (module0731.NIL != var534) {
            final SubLObject var536 = module0147.$g2094$.currentBinding(var531);
            final SubLObject var537 = module0147.$g2095$.currentBinding(var531);
            try {
                module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var531);
                module0147.$g2095$.bind(module0731.$ic22$, var531);
                final SubLObject var538 = var535;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var538)) {
                    final SubLObject var539 = module0158.f10011(var171, (SubLObject)module0731.NIL, var538);
                    SubLObject var540 = (SubLObject)module0731.NIL;
                    final SubLObject var541 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var540) {
                        final SubLObject var542 = module0052.f3695(var539, var541);
                        final SubLObject var543 = (SubLObject)SubLObjectFactory.makeBoolean(!var541.eql(var542));
                        if (module0731.NIL != var543) {
                            SubLObject var544 = (SubLObject)module0731.NIL;
                            try {
                                var544 = module0158.f10316(var542, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_541 = (SubLObject)module0731.NIL;
                                final SubLObject var61_542 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_541) {
                                    final SubLObject var545 = module0052.f3695(var544, var61_542);
                                    final SubLObject var63_543 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_542.eql(var545));
                                    if (module0731.NIL != var63_543 && module0178.f11335(var545).eql(var19) && module0178.f11336(var545).eql(var530)) {
                                        final SubLObject var546 = (SubLObject)ConsesLow.cons(module0178.f11337(var545), module0178.f11287(var545));
                                        if (module0731.NIL == conses_high.member(var546, var533, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                            var533 = (SubLObject)ConsesLow.cons(var546, var533);
                                        }
                                    }
                                    var60_541 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_543);
                                }
                            }
                            finally {
                                final SubLObject var7_544 = Threads.$is_thread_performing_cleanupP$.currentBinding(var531);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var531);
                                    if (module0731.NIL != var544) {
                                        module0158.f10319(var544);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_544, var531);
                                }
                            }
                        }
                        var540 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var543);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var537, var531);
                module0147.$g2094$.rebind(var536, var531);
            }
            var534 = var534.rest();
            var535 = var534.first();
        }
        return var533;
    }
    
    public static SubLObject f44828(final SubLObject var171, final SubLObject var19, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = (SubLObject)module0731.NIL;
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        SubLObject var173 = (SubLObject)module0731.NIL;
        final SubLObject var174 = module0147.$g2094$.currentBinding(var172);
        final SubLObject var175 = module0147.$g2095$.currentBinding(var172);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var172);
            module0147.$g2095$.bind(module0731.$ic22$, var172);
            SubLObject var176 = (SubLObject)ConsesLow.cons(module0731.$ic239$, f44818((SubLObject)module0731.$ic133$));
            SubLObject var177 = (SubLObject)module0731.NIL;
            var177 = var176.first();
            while (module0731.NIL != var176) {
                final SubLObject var178 = var177;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var178)) {
                    final SubLObject var179 = module0158.f10011(var171, (SubLObject)module0731.NIL, var178);
                    SubLObject var180 = (SubLObject)module0731.NIL;
                    final SubLObject var181 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var180) {
                        final SubLObject var182 = module0052.f3695(var179, var181);
                        final SubLObject var183 = (SubLObject)SubLObjectFactory.makeBoolean(!var181.eql(var182));
                        if (module0731.NIL != var183) {
                            SubLObject var184 = (SubLObject)module0731.NIL;
                            try {
                                var184 = module0158.f10316(var182, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_546 = (SubLObject)module0731.NIL;
                                final SubLObject var61_547 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_546) {
                                    final SubLObject var185 = module0052.f3695(var184, var61_547);
                                    final SubLObject var63_548 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_547.eql(var185));
                                    if (module0731.NIL != var63_548 && (module0731.NIL == var22 || module0731.NIL != f44644(var22, module0178.f11287(var185))) && module0178.f11335(var185).eql(var19)) {
                                        final SubLObject var186 = module0178.f11336(var185);
                                        if (module0731.NIL == conses_high.member(var186, var173, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                            var173 = (SubLObject)ConsesLow.cons(var186, var173);
                                        }
                                    }
                                    var60_546 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_548);
                                }
                            }
                            finally {
                                final SubLObject var7_549 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                                    if (module0731.NIL != var184) {
                                        module0158.f10319(var184);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_549, var172);
                                }
                            }
                        }
                        var180 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var183);
                    }
                }
                var176 = var176.rest();
                var177 = var176.first();
            }
            final SubLObject var187 = f44829(var19, (SubLObject)module0731.UNPROVIDED);
            if (module0731.NIL != var187) {
                final SubLObject var188 = var187;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var188)) {
                    final SubLObject var189 = module0158.f10011(var171, (SubLObject)module0731.NIL, var188);
                    SubLObject var190 = (SubLObject)module0731.NIL;
                    final SubLObject var191 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var190) {
                        final SubLObject var192 = module0052.f3695(var189, var191);
                        final SubLObject var193 = (SubLObject)SubLObjectFactory.makeBoolean(!var191.eql(var192));
                        if (module0731.NIL != var193) {
                            SubLObject var194 = (SubLObject)module0731.NIL;
                            try {
                                var194 = module0158.f10316(var192, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_547 = (SubLObject)module0731.NIL;
                                final SubLObject var61_548 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_547) {
                                    final SubLObject var195 = module0052.f3695(var194, var61_548);
                                    final SubLObject var63_549 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_548.eql(var195));
                                    if (module0731.NIL != var63_549 && (module0731.NIL == var22 || module0731.NIL != f44644(var22, module0178.f11287(var195)))) {
                                        final SubLObject var196 = module0178.f11335(var195);
                                        if (module0731.NIL == conses_high.member(var196, var173, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                            var173 = (SubLObject)ConsesLow.cons(var196, var173);
                                        }
                                    }
                                    var60_547 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_549);
                                }
                            }
                            finally {
                                final SubLObject var7_550 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                                    if (module0731.NIL != var194) {
                                        module0158.f10319(var194);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_550, var172);
                                }
                            }
                        }
                        var190 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var193);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var175, var172);
            module0147.$g2094$.rebind(var174, var172);
        }
        return Sort.sort(var173, (SubLObject)module0731.$ic240$, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44830(final SubLObject var555) {
        final SubLThread var556 = SubLProcess.currentSubLThread();
        assert module0731.NIL != module0173.f10955(var555) : var555;
        SubLObject var557 = (SubLObject)module0731.NIL;
        final SubLObject var558 = module0147.f9540(module0584.$g4396$.getDynamicValue(var556));
        final SubLObject var559 = module0147.$g2095$.currentBinding(var556);
        final SubLObject var560 = module0147.$g2094$.currentBinding(var556);
        final SubLObject var561 = module0147.$g2096$.currentBinding(var556);
        try {
            module0147.$g2095$.bind(module0147.f9545(var558), var556);
            module0147.$g2094$.bind(module0147.f9546(var558), var556);
            module0147.$g2096$.bind(module0147.f9549(var558), var556);
            var557 = module0220.f14553(var555, module0731.$ic242$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var561, var556);
            module0147.$g2094$.rebind(var560, var556);
            module0147.$g2095$.rebind(var559, var556);
        }
        return var557;
    }
    
    public static SubLObject f44831(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0731.NIL != module0173.f10955(var171) : var171;
        SubLObject var173 = (SubLObject)module0731.NIL;
        if (module0731.NIL != module0220.f14547(var171, module0731.$ic239$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) {
            final SubLObject var174 = module0147.f9540(module0584.$g4396$.getDynamicValue(var172));
            final SubLObject var175 = module0147.$g2095$.currentBinding(var172);
            final SubLObject var176 = module0147.$g2094$.currentBinding(var172);
            final SubLObject var177 = module0147.$g2096$.currentBinding(var172);
            try {
                module0147.$g2095$.bind(module0147.f9545(var174), var172);
                module0147.$g2094$.bind(module0147.f9546(var174), var172);
                module0147.$g2096$.bind(module0147.f9549(var174), var172);
                var173 = module0220.f14562(var171, module0731.$ic239$, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.FOUR_INTEGER, (SubLObject)module0731.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var177, var172);
                module0147.$g2094$.rebind(var176, var172);
                module0147.$g2095$.rebind(var175, var172);
            }
        }
        return var173;
    }
    
    public static SubLObject f44832(final SubLObject var171, final SubLObject var19) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0731.NIL != module0173.f10955(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        SubLObject var173 = (SubLObject)module0731.NIL;
        if (module0731.NIL != f44831(var171)) {
            final SubLObject var174 = module0147.f9540(module0584.$g4396$.getDynamicValue(var172));
            final SubLObject var175 = module0147.$g2095$.currentBinding(var172);
            final SubLObject var176 = module0147.$g2094$.currentBinding(var172);
            final SubLObject var177 = module0147.$g2096$.currentBinding(var172);
            try {
                module0147.$g2095$.bind(module0147.f9545(var174), var172);
                module0147.$g2094$.bind(module0147.f9546(var174), var172);
                module0147.$g2096$.bind(module0147.f9549(var174), var172);
                final SubLObject var178 = module0731.$ic239$;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.ONE_INTEGER, var178)) {
                    final SubLObject var179 = module0158.f10011(var171, (SubLObject)module0731.ONE_INTEGER, var178);
                    SubLObject var180 = (SubLObject)module0731.NIL;
                    final SubLObject var181 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var180) {
                        final SubLObject var182 = module0052.f3695(var179, var181);
                        final SubLObject var183 = (SubLObject)SubLObjectFactory.makeBoolean(!var181.eql(var182));
                        if (module0731.NIL != var183) {
                            SubLObject var184 = (SubLObject)module0731.NIL;
                            try {
                                var184 = module0158.f10316(var182, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_556 = (SubLObject)module0731.NIL;
                                final SubLObject var61_557 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_556) {
                                    final SubLObject var185 = module0052.f3695(var184, var61_557);
                                    final SubLObject var63_558 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_557.eql(var185));
                                    if (module0731.NIL != var63_558 && module0178.f11335(var185).equal(var19)) {
                                        final SubLObject var186 = module0178.f11337(var185);
                                        if (module0731.NIL == conses_high.member(var186, var173, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                            var173 = (SubLObject)ConsesLow.cons(var186, var173);
                                        }
                                    }
                                    var60_556 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_558);
                                }
                            }
                            finally {
                                final SubLObject var7_559 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                                    if (module0731.NIL != var184) {
                                        module0158.f10319(var184);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_559, var172);
                                }
                            }
                        }
                        var180 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var183);
                    }
                }
                final SubLObject var187 = f44829(var19, (SubLObject)module0731.UNPROVIDED);
                if (module0731.NIL != var187) {
                    final SubLObject var188 = var187;
                    if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.ONE_INTEGER, var188)) {
                        final SubLObject var189 = module0158.f10011(var171, (SubLObject)module0731.ONE_INTEGER, var188);
                        SubLObject var190 = (SubLObject)module0731.NIL;
                        final SubLObject var191 = (SubLObject)module0731.NIL;
                        while (module0731.NIL == var190) {
                            final SubLObject var192 = module0052.f3695(var189, var191);
                            final SubLObject var193 = (SubLObject)SubLObjectFactory.makeBoolean(!var191.eql(var192));
                            if (module0731.NIL != var193) {
                                SubLObject var194 = (SubLObject)module0731.NIL;
                                try {
                                    var194 = module0158.f10316(var192, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                    SubLObject var60_557 = (SubLObject)module0731.NIL;
                                    final SubLObject var61_558 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var60_557) {
                                        final SubLObject var195 = module0052.f3695(var194, var61_558);
                                        final SubLObject var63_559 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_558.eql(var195));
                                        if (module0731.NIL != var63_559) {
                                            final SubLObject var196 = module0178.f11336(var195);
                                            if (module0731.NIL == conses_high.member(var196, var173, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                                var173 = (SubLObject)ConsesLow.cons(var196, var173);
                                            }
                                        }
                                        var60_557 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_559);
                                    }
                                }
                                finally {
                                    final SubLObject var7_560 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                                        if (module0731.NIL != var194) {
                                            module0158.f10319(var194);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_560, var172);
                                    }
                                }
                            }
                            var190 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var193);
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var177, var172);
                module0147.$g2094$.rebind(var176, var172);
                module0147.$g2095$.rebind(var175, var172);
            }
        }
        return var173;
    }
    
    public static SubLObject f44833(final SubLObject var171, final SubLObject var19, final SubLObject var340) {
        assert module0731.NIL != module0173.f10955(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        SubLObject var341 = (SubLObject)module0731.NIL;
        if (module0731.NIL != f44831(var171)) {
            SubLObject var342 = f44828(var171, var19, (SubLObject)module0731.UNPROVIDED);
            SubLObject var343 = (SubLObject)module0731.NIL;
            var343 = var342.first();
            while (module0731.NIL != var342) {
                if (module0731.NIL != f44822(var340, var171, var19, var343, (SubLObject)module0731.UNPROVIDED)) {
                    SubLObject var13_565 = f44834(var171, var19, var343, (SubLObject)module0731.UNPROVIDED);
                    SubLObject var344 = (SubLObject)module0731.NIL;
                    var344 = var13_565.first();
                    while (module0731.NIL != var13_565) {
                        final SubLObject var345 = var344;
                        if (module0731.NIL == conses_high.member(var345, var341, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                            var341 = (SubLObject)ConsesLow.cons(var345, var341);
                        }
                        var13_565 = var13_565.rest();
                        var344 = var13_565.first();
                    }
                }
                var342 = var342.rest();
                var343 = var342.first();
            }
        }
        return var341;
    }
    
    public static SubLObject f44834(final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var531 = SubLProcess.currentSubLThread();
        assert module0731.NIL != module0173.f10955(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        SubLObject var532 = (SubLObject)module0731.NIL;
        final SubLObject var533 = module0147.f9540(var22);
        final SubLObject var534 = module0147.$g2095$.currentBinding(var531);
        final SubLObject var535 = module0147.$g2094$.currentBinding(var531);
        final SubLObject var536 = module0147.$g2096$.currentBinding(var531);
        try {
            module0147.$g2095$.bind(module0147.f9545(var533), var531);
            module0147.$g2094$.bind(module0147.f9546(var533), var531);
            module0147.$g2096$.bind(module0147.f9549(var533), var531);
            final SubLObject var537 = module0731.$ic239$;
            if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.ONE_INTEGER, var537)) {
                final SubLObject var538 = module0158.f10011(var171, (SubLObject)module0731.ONE_INTEGER, var537);
                SubLObject var539 = (SubLObject)module0731.NIL;
                final SubLObject var540 = (SubLObject)module0731.NIL;
                while (module0731.NIL == var539) {
                    final SubLObject var541 = module0052.f3695(var538, var540);
                    final SubLObject var542 = (SubLObject)SubLObjectFactory.makeBoolean(!var540.eql(var541));
                    if (module0731.NIL != var542) {
                        SubLObject var543 = (SubLObject)module0731.NIL;
                        try {
                            var543 = module0158.f10316(var541, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                            SubLObject var60_566 = (SubLObject)module0731.NIL;
                            final SubLObject var61_567 = (SubLObject)module0731.NIL;
                            while (module0731.NIL == var60_566) {
                                final SubLObject var544 = module0052.f3695(var543, var61_567);
                                final SubLObject var63_568 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_567.eql(var544));
                                if (module0731.NIL != var63_568 && module0178.f11335(var544).equal(var19) && module0178.f11336(var544).equal(var530)) {
                                    final SubLObject var545 = module0178.f11337(var544);
                                    if (module0731.NIL == conses_high.member(var545, var532, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                        var532 = (SubLObject)ConsesLow.cons(var545, var532);
                                    }
                                }
                                var60_566 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_568);
                            }
                        }
                        finally {
                            final SubLObject var7_569 = Threads.$is_thread_performing_cleanupP$.currentBinding(var531);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var531);
                                if (module0731.NIL != var543) {
                                    module0158.f10319(var543);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_569, var531);
                            }
                        }
                    }
                    var539 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var542);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var536, var531);
            module0147.$g2094$.rebind(var535, var531);
            module0147.$g2095$.rebind(var534, var531);
        }
        return var532;
    }
    
    public static SubLObject f44835(final SubLObject var171, final SubLObject var19, final SubLObject var530) {
        final SubLThread var531 = SubLProcess.currentSubLThread();
        SubLObject var532 = (SubLObject)module0731.NIL;
        final SubLObject var533 = module0147.f9540(module0584.$g4396$.getDynamicValue(var531));
        final SubLObject var534 = module0147.$g2095$.currentBinding(var531);
        final SubLObject var535 = module0147.$g2094$.currentBinding(var531);
        final SubLObject var536 = module0147.$g2096$.currentBinding(var531);
        try {
            module0147.$g2095$.bind(module0147.f9545(var533), var531);
            module0147.$g2094$.bind(module0147.f9546(var533), var531);
            module0147.$g2096$.bind(module0147.f9549(var533), var531);
            final SubLObject var537 = module0731.$ic239$;
            if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.ONE_INTEGER, var537)) {
                final SubLObject var538 = module0158.f10011(var171, (SubLObject)module0731.ONE_INTEGER, var537);
                SubLObject var539 = (SubLObject)module0731.NIL;
                final SubLObject var540 = (SubLObject)module0731.NIL;
                while (module0731.NIL == var539) {
                    final SubLObject var541 = module0052.f3695(var538, var540);
                    final SubLObject var542 = (SubLObject)SubLObjectFactory.makeBoolean(!var540.eql(var541));
                    if (module0731.NIL != var542) {
                        SubLObject var543 = (SubLObject)module0731.NIL;
                        try {
                            var543 = module0158.f10316(var541, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                            SubLObject var60_570 = (SubLObject)module0731.NIL;
                            final SubLObject var61_571 = (SubLObject)module0731.NIL;
                            while (module0731.NIL == var60_570) {
                                final SubLObject var544 = module0052.f3695(var543, var61_571);
                                final SubLObject var63_572 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_571.eql(var544));
                                if (module0731.NIL != var63_572 && module0178.f11335(var544).equal(var19) && module0178.f11336(var544).equal(var530)) {
                                    final SubLObject var545 = (SubLObject)ConsesLow.cons(module0178.f11337(var544), module0178.f11287(var544));
                                    if (module0731.NIL == conses_high.member(var545, var532, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                        var532 = (SubLObject)ConsesLow.cons(var545, var532);
                                    }
                                }
                                var60_570 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_572);
                            }
                        }
                        finally {
                            final SubLObject var7_573 = Threads.$is_thread_performing_cleanupP$.currentBinding(var531);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var531);
                                if (module0731.NIL != var543) {
                                    module0158.f10319(var543);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_573, var531);
                            }
                        }
                    }
                    var539 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var542);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var536, var531);
            module0147.$g2094$.rebind(var535, var531);
            module0147.$g2095$.rebind(var534, var531);
        }
        return var532;
    }
    
    public static SubLObject f44836() {
        return module0731.$ic243$;
    }
    
    public static SubLObject f44837() {
        return module0731.$ic244$;
    }
    
    public static SubLObject f44838(final SubLObject var574, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0178.f11287(var574);
        }
        return (SubLObject)((module0731.NIL != module0211.f13700(var574)) ? module0347.f23344((SubLObject)module0731.$ic245$, (SubLObject)ConsesLow.listS(f44836(), var574, (SubLObject)module0731.$ic246$), var22, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED) : module0731.NIL);
    }
    
    public static SubLObject f44839(final SubLObject var574, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0178.f11287(var574);
        }
        return (SubLObject)((module0731.NIL != module0211.f13700(var574)) ? module0347.f23344((SubLObject)module0731.$ic245$, (SubLObject)ConsesLow.listS(f44837(), var574, (SubLObject)module0731.$ic246$), var22, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED) : module0731.NIL);
    }
    
    public static SubLObject f44840(final SubLObject var575) {
        return module0004.f104(var575, (SubLObject)module0731.$ic247$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44841(final SubLObject var576) {
        return module0035.sublisp_boolean(Sequences.find_if((SubLObject)module0731.$ic248$, var576, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
    }
    
    public static SubLObject f44842(final SubLObject var574) {
        final SubLObject var575 = f44838(var574, (SubLObject)module0731.UNPROVIDED);
        return f44841(var575);
    }
    
    public static SubLObject f44843(final SubLObject var574) {
        return module0004.f104(module0731.$ic249$, f44839(var574, (SubLObject)module0731.UNPROVIDED), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44844(final SubLObject var574) {
        return module0004.f104(module0731.$ic250$, f44839(var574, (SubLObject)module0731.UNPROVIDED), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44845() {
        final SubLObject var3 = module0731.$g5779$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44846(final SubLObject var574) {
        return module0034.f1829(module0731.$g5779$.getGlobalValue(), (SubLObject)ConsesLow.list(var574), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44847(final SubLObject var574) {
        return module0259.f16854(module0205.f13132(var574), module0731.$ic252$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44848(final SubLObject var574) {
        SubLObject var575 = module0731.$g5779$.getGlobalValue();
        if (module0731.NIL == var575) {
            var575 = module0034.f1934((SubLObject)module0731.$ic251$, (SubLObject)module0731.$ic253$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQL, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0731.$ic254$);
        }
        SubLObject var576 = module0034.f1814(var575, var574, (SubLObject)module0731.$ic6$);
        if (var576 == module0731.$ic6$) {
            var576 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44847(var574)));
            module0034.f1816(var575, var574, var576, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var576);
    }
    
    public static SubLObject f44849(final SubLObject var574) {
        final SubLThread var575 = SubLProcess.currentSubLThread();
        if (module0731.NIL != module0584.$g4392$.getDynamicValue(var575) && module0731.NIL != f44842(var574)) {
            return (SubLObject)module0731.T;
        }
        if (module0731.NIL != module0584.$g4393$.getDynamicValue(var575) && module0731.NIL != f44843(var574)) {
            return (SubLObject)module0731.T;
        }
        if (module0731.NIL != module0584.$g4394$.getDynamicValue(var575) && module0731.NIL != f44844(var574)) {
            return (SubLObject)module0731.T;
        }
        if (module0731.NIL != module0584.$g4395$.getDynamicValue(var575) && module0731.NIL != f44848(var574)) {
            return (SubLObject)module0731.T;
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44850(final SubLObject var169, final SubLObject var577, final SubLObject var578) {
        final SubLThread var579 = SubLProcess.currentSubLThread();
        SubLObject var580 = (SubLObject)module0731.NIL;
        final SubLObject var581 = module0147.$g2094$.currentBinding(var579);
        final SubLObject var582 = module0147.$g2095$.currentBinding(var579);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var579);
            module0147.$g2095$.bind(module0731.$ic22$, var579);
            SubLObject var583 = f44818((SubLObject)module0731.$ic133$);
            SubLObject var584 = (SubLObject)module0731.NIL;
            var584 = var583.first();
            while (module0731.NIL != var583) {
                SubLObject var13_580 = module0219.f14509(var169, (SubLObject)module0731.ONE_INTEGER, var584, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                SubLObject var585 = (SubLObject)module0731.NIL;
                var585 = var13_580.first();
                while (module0731.NIL != var13_580) {
                    if (module0731.NIL != module0178.f11284(var585) && f44851(var585).eql(var577) && f44852(var585).eql(var578)) {
                        var580 = (SubLObject)ConsesLow.cons(var585, var580);
                    }
                    var13_580 = var13_580.rest();
                    var585 = var13_580.first();
                }
                var583 = var583.rest();
                var584 = var583.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var582, var579);
            module0147.$g2094$.rebind(var581, var579);
        }
        return var580;
    }
    
    public static SubLObject f44853(final SubLObject var169, final SubLObject var577, final SubLObject var564) {
        assert module0731.NIL != module0173.f10955(var169) : var169;
        assert module0731.NIL != f44656(var577, (SubLObject)module0731.UNPROVIDED) : var577;
        assert module0731.NIL != Types.integerp(var564) : var564;
        SubLObject var578 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var578) {
            SubLObject var579;
            SubLObject var580;
            for (var579 = f44850(var169, var577, var564), var580 = (SubLObject)module0731.NIL, var580 = var579.first(); module0731.NIL == var578 && module0731.NIL != var579; var578 = f44842(var580), var579 = var579.rest(), var580 = var579.first()) {}
        }
        return var578;
    }
    
    public static SubLObject f44854(final SubLObject var169, final SubLObject var577, final SubLObject var564) {
        assert module0731.NIL != module0173.f10955(var169) : var169;
        assert module0731.NIL != f44656(var577, (SubLObject)module0731.UNPROVIDED) : var577;
        assert module0731.NIL != Types.integerp(var564) : var564;
        if (module0731.NIL == module0584.f35774()) {
            return (SubLObject)module0731.NIL;
        }
        SubLObject var578 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var578) {
            SubLObject var579;
            SubLObject var580;
            for (var579 = f44850(var169, var577, var564), var580 = (SubLObject)module0731.NIL, var580 = var579.first(); module0731.NIL == var578 && module0731.NIL != var579; var578 = f44849(var580), var579 = var579.rest(), var580 = var579.first()) {}
        }
        return var578;
    }
    
    public static SubLObject f44855(final SubLObject var171, final SubLObject var19, final SubLObject var530) {
        assert module0731.NIL != module0173.f10955(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        assert module0731.NIL != Types.integerp(var530) : var530;
        return f44856(var171, var19, var530, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44857(final SubLObject var171, final SubLObject var19, SubLObject var555) {
        if (var555 == module0731.UNPROVIDED) {
            var555 = (SubLObject)module0731.NIL;
        }
        assert module0731.NIL != module0173.f10955(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        return f44856(var171, var19, (SubLObject)module0731.NIL, var555);
    }
    
    public static SubLObject f44856(final SubLObject var171, final SubLObject var19, final SubLObject var530, SubLObject var555) {
        if (var555 == module0731.UNPROVIDED) {
            var555 = (SubLObject)module0731.NIL;
        }
        final SubLThread var556 = SubLProcess.currentSubLThread();
        final SubLObject var557 = f44829(var19, (SubLObject)module0731.UNPROVIDED);
        SubLObject var558 = (SubLObject)module0731.NIL;
        if (module0731.NIL != var557) {
            final SubLObject var559 = module0147.f9540(module0584.$g4396$.getDynamicValue(var556));
            final SubLObject var560 = module0147.$g2095$.currentBinding(var556);
            final SubLObject var561 = module0147.$g2094$.currentBinding(var556);
            final SubLObject var562 = module0147.$g2096$.currentBinding(var556);
            try {
                module0147.$g2095$.bind(module0147.f9545(var559), var556);
                module0147.$g2094$.bind(module0147.f9546(var559), var556);
                module0147.$g2096$.bind(module0147.f9549(var559), var556);
                final SubLObject var563 = var557;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var563)) {
                    final SubLObject var564 = module0158.f10011(var171, (SubLObject)module0731.NIL, var563);
                    SubLObject var565 = (SubLObject)module0731.NIL;
                    final SubLObject var566 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var565) {
                        final SubLObject var567 = module0052.f3695(var564, var566);
                        final SubLObject var568 = (SubLObject)SubLObjectFactory.makeBoolean(!var566.eql(var567));
                        if (module0731.NIL != var568) {
                            SubLObject var569 = (SubLObject)module0731.NIL;
                            try {
                                var569 = module0158.f10316(var567, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_583 = (SubLObject)module0731.NIL;
                                final SubLObject var61_584 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_583) {
                                    final SubLObject var570 = module0052.f3695(var569, var61_584);
                                    final SubLObject var63_585 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_584.eql(var570));
                                    if (module0731.NIL != var63_585) {
                                        final SubLObject var571 = module0178.f11335(var570);
                                        final SubLObject var572 = module0178.f11336(var570);
                                        if ((module0731.NIL == var530 || var571.eql(var530)) && (module0731.NIL == var555 || var572.eql(var555)) && module0731.NIL == f44849(var570) && module0731.NIL == f44854(var171, var19, var571)) {
                                            final SubLObject var573 = module0732.f44995(var557);
                                            final SubLObject var574 = f44858(var570, var573);
                                            final SubLObject var575 = module0172.f10922(var574);
                                            if (module0731.NIL == conses_high.member(var575, var558, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                                var558 = (SubLObject)ConsesLow.cons(var575, var558);
                                            }
                                        }
                                    }
                                    var60_583 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_585);
                                }
                            }
                            finally {
                                final SubLObject var7_590 = Threads.$is_thread_performing_cleanupP$.currentBinding(var556);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var556);
                                    if (module0731.NIL != var569) {
                                        module0158.f10319(var569);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_590, var556);
                                }
                            }
                        }
                        var565 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var568);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var562, var556);
                module0147.$g2094$.rebind(var561, var556);
                module0147.$g2095$.rebind(var560, var556);
            }
        }
        return var558;
    }
    
    public static SubLObject f44858(final SubLObject var67, SubLObject var591) {
        if (var591 == module0731.UNPROVIDED) {
            var591 = (SubLObject)module0731.NIL;
        }
        assert module0731.NIL != module0178.f11284(var67) : var67;
        if (module0731.NIL == var591) {
            final SubLObject var592 = module0178.f11333(var67);
            var591 = module0732.f44995(var592);
        }
        final SubLObject var593 = module0178.f11331(var67, var591);
        return (module0731.NIL != module0202.f12589(var593, module0731.$ic257$)) ? module0205.f13203(var593, (SubLObject)module0731.UNPROVIDED) : var593;
    }
    
    public static SubLObject f44859(final SubLObject var171, final SubLObject var19) {
        final SubLObject var172 = (SubLObject)module0731.NIL;
        return var172;
    }
    
    public static SubLObject f44860(final SubLObject var171, SubLObject var19) {
        if (var19 == module0731.UNPROVIDED) {
            var19 = (SubLObject)module0731.NIL;
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        SubLObject var173 = (SubLObject)module0731.NIL;
        final SubLObject var174 = module0147.f9540(module0584.$g4396$.getDynamicValue(var172));
        final SubLObject var175 = module0147.$g2095$.currentBinding(var172);
        final SubLObject var176 = module0147.$g2094$.currentBinding(var172);
        final SubLObject var177 = module0147.$g2096$.currentBinding(var172);
        try {
            module0147.$g2095$.bind(module0147.f9545(var174), var172);
            module0147.$g2094$.bind(module0147.f9546(var174), var172);
            module0147.$g2096$.bind(module0147.f9549(var174), var172);
            final SubLObject var178 = module0731.$ic235$;
            if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var178)) {
                final SubLObject var179 = module0158.f10011(var171, (SubLObject)module0731.NIL, var178);
                SubLObject var180 = (SubLObject)module0731.NIL;
                final SubLObject var181 = (SubLObject)module0731.NIL;
                while (module0731.NIL == var180) {
                    final SubLObject var182 = module0052.f3695(var179, var181);
                    final SubLObject var183 = (SubLObject)SubLObjectFactory.makeBoolean(!var181.eql(var182));
                    if (module0731.NIL != var183) {
                        SubLObject var184 = (SubLObject)module0731.NIL;
                        try {
                            var184 = module0158.f10316(var182, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                            SubLObject var60_594 = (SubLObject)module0731.NIL;
                            final SubLObject var61_595 = (SubLObject)module0731.NIL;
                            while (module0731.NIL == var60_594) {
                                final SubLObject var185 = module0052.f3695(var184, var61_595);
                                final SubLObject var63_597 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_595.eql(var185));
                                if (module0731.NIL != var63_597 && (module0731.NIL == var19 || module0731.NIL != f44713(module0178.f11335(var185), var19, (SubLObject)module0731.UNPROVIDED))) {
                                    final SubLObject var186 = (SubLObject)ConsesLow.cons(module0178.f11337(var185), module0178.f11336(var185));
                                    if (module0731.NIL == conses_high.member(var186, var173, Symbols.symbol_function((SubLObject)module0731.EQUAL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                        var173 = (SubLObject)ConsesLow.cons(var186, var173);
                                    }
                                }
                                var60_594 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_597);
                            }
                        }
                        finally {
                            final SubLObject var7_598 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var172);
                                if (module0731.NIL != var184) {
                                    module0158.f10319(var184);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_598, var172);
                            }
                        }
                    }
                    var180 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var183);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var177, var172);
            module0147.$g2094$.rebind(var176, var172);
            module0147.$g2095$.rebind(var175, var172);
        }
        return Values.values(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0731.$ic258$), var173), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0731.$ic259$), var173));
    }
    
    public static SubLObject f44861(final SubLObject var171, final SubLObject var19, SubLObject var530) {
        if (var530 == module0731.UNPROVIDED) {
            var530 = (SubLObject)module0731.NIL;
        }
        final SubLThread var531 = SubLProcess.currentSubLThread();
        assert module0731.NIL != f44719(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        final SubLObject var532 = f44829(var19, (SubLObject)module0731.UNPROVIDED);
        SubLObject var533 = (SubLObject)module0731.NIL;
        if (module0731.NIL != var532 && module0731.NIL != module0212.f13762(var171)) {
            final SubLObject var534 = module0147.f9540(module0584.$g4396$.getDynamicValue(var531));
            final SubLObject var535 = module0147.$g2095$.currentBinding(var531);
            final SubLObject var536 = module0147.$g2094$.currentBinding(var531);
            final SubLObject var537 = module0147.$g2096$.currentBinding(var531);
            try {
                module0147.$g2095$.bind(module0147.f9545(var534), var531);
                module0147.$g2094$.bind(module0147.f9546(var534), var531);
                module0147.$g2096$.bind(module0147.f9549(var534), var531);
                final SubLObject var538 = var532;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var538)) {
                    final SubLObject var539 = module0158.f10011(var171, (SubLObject)module0731.NIL, var538);
                    SubLObject var540 = (SubLObject)module0731.NIL;
                    final SubLObject var541 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var540) {
                        final SubLObject var542 = module0052.f3695(var539, var541);
                        final SubLObject var543 = (SubLObject)SubLObjectFactory.makeBoolean(!var541.eql(var542));
                        if (module0731.NIL != var543) {
                            SubLObject var544 = (SubLObject)module0731.NIL;
                            try {
                                var544 = module0158.f10316(var542, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_599 = (SubLObject)module0731.NIL;
                                final SubLObject var61_600 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_599) {
                                    final SubLObject var545 = module0052.f3695(var544, var61_600);
                                    final SubLObject var63_601 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_600.eql(var545));
                                    if (module0731.NIL != var63_601) {
                                        final SubLObject var546 = module0178.f11335(var545);
                                        if ((module0731.NIL == var530 || var546.eql(var530)) && module0731.NIL == f44849(var545) && module0731.NIL == f44854(var171, var19, var546)) {
                                            final SubLObject var547 = var545;
                                            if (module0731.NIL == conses_high.member(var547, var533, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                                var533 = (SubLObject)ConsesLow.cons(var547, var533);
                                            }
                                        }
                                    }
                                    var60_599 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_601);
                                }
                            }
                            finally {
                                final SubLObject var7_602 = Threads.$is_thread_performing_cleanupP$.currentBinding(var531);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var531);
                                    if (module0731.NIL != var544) {
                                        module0158.f10319(var544);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_602, var531);
                                }
                            }
                        }
                        var540 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var543);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var537, var531);
                module0147.$g2094$.rebind(var536, var531);
                module0147.$g2095$.rebind(var535, var531);
            }
        }
        return var533;
    }
    
    public static SubLObject f44862(final SubLObject var171, final SubLObject var19, SubLObject var530) {
        if (var530 == module0731.UNPROVIDED) {
            var530 = (SubLObject)module0731.NIL;
        }
        final SubLThread var531 = SubLProcess.currentSubLThread();
        assert module0731.NIL != module0173.f10955(var171) : var171;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        SubLObject var532 = (SubLObject)module0731.NIL;
        final SubLObject var533 = module0584.$g4392$.currentBinding(var531);
        final SubLObject var534 = module0584.$g4393$.currentBinding(var531);
        try {
            module0584.$g4392$.bind((SubLObject)module0731.NIL, var531);
            module0584.$g4393$.bind((SubLObject)module0731.NIL, var531);
            var532 = f44861(var171, var19, var530);
        }
        finally {
            module0584.$g4393$.rebind(var534, var531);
            module0584.$g4392$.rebind(var533, var531);
        }
        return var532;
    }
    
    public static SubLObject f44863(final SubLObject var604) {
        final SubLThread var605 = SubLProcess.currentSubLThread();
        SubLObject var606 = (SubLObject)module0731.NIL;
        final SubLObject var607 = module0147.f9540(module0584.$g4396$.getDynamicValue(var605));
        final SubLObject var608 = module0147.$g2095$.currentBinding(var605);
        final SubLObject var609 = module0147.$g2094$.currentBinding(var605);
        final SubLObject var610 = module0147.$g2096$.currentBinding(var605);
        try {
            module0147.$g2095$.bind(module0147.f9545(var607), var605);
            module0147.$g2094$.bind(module0147.f9546(var607), var605);
            module0147.$g2096$.bind(module0147.f9549(var607), var605);
            var606 = (SubLObject)((module0731.NIL != module0259.f16854(var604, module0731.$ic260$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED) || module0731.NIL != module0259.f16854(var604, module0731.$ic261$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? module0730.f44560(module0038.f2703(module0166.f10743(var604), (SubLObject)Characters.CHAR_hyphen), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED) : module0731.NIL);
        }
        finally {
            module0147.$g2096$.rebind(var610, var605);
            module0147.$g2094$.rebind(var609, var605);
            module0147.$g2095$.rebind(var608, var605);
        }
        return var606;
    }
    
    public static SubLObject f44864(final SubLObject var67) {
        final SubLObject var68 = module0178.f11333(var67);
        final SubLObject var69 = module0732.f44992(var68);
        return (SubLObject)((module0731.NIL != var69) ? module0178.f11331(var67, var69) : module0731.NIL);
    }
    
    public static SubLObject f44851(final SubLObject var67) {
        final SubLObject var68 = module0178.f11333(var67);
        final SubLObject var69 = module0732.f44998(var68);
        return (SubLObject)((module0731.NIL != var69) ? module0178.f11331(var67, var69) : module0731.NIL);
    }
    
    public static SubLObject f44852(final SubLObject var574) {
        final SubLObject var575 = module0178.f11333(var574);
        final SubLObject var576 = module0732.f44998(var575);
        final SubLObject var577 = (SubLObject)((module0731.NIL != var576) ? module0048.f_1X(var576) : module0731.NIL);
        final SubLObject var578 = (SubLObject)((module0731.NIL != var577) ? module0178.f11331(var574, var577) : module0731.NIL);
        return (SubLObject)(var578.isInteger() ? var578 : module0731.NIL);
    }
    
    public static SubLObject f44775() {
        final SubLObject var3 = module0731.$g5780$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44865(final SubLObject var170) {
        return module0034.f1829(module0731.$g5780$.getGlobalValue(), (SubLObject)ConsesLow.list(var170), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44866(final SubLObject var170) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        if (var170.equal((SubLObject)module0731.$ic201$)) {
            return (SubLObject)module0731.$ic263$;
        }
        SubLObject var172 = (SubLObject)module0731.NIL;
        SubLObject var173 = module0730.f44560(var170, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        SubLObject var174 = (SubLObject)module0731.NIL;
        var174 = var173.first();
        while (module0731.NIL != var173) {
            SubLObject var13_608 = f44867(var174);
            SubLObject var175 = (SubLObject)module0731.NIL;
            var175 = var13_608.first();
            while (module0731.NIL != var13_608) {
                var172 = (SubLObject)ConsesLow.cons(var175, var172);
                var13_608 = var13_608.rest();
                var175 = var13_608.first();
            }
            var173 = var173.rest();
            var174 = var173.first();
        }
        final SubLObject var176 = module0147.f9540(module0584.$g4396$.getDynamicValue(var171));
        final SubLObject var177 = module0147.$g2095$.currentBinding(var171);
        final SubLObject var178 = module0147.$g2094$.currentBinding(var171);
        final SubLObject var179 = module0147.$g2096$.currentBinding(var171);
        try {
            module0147.$g2095$.bind(module0147.f9545(var176), var171);
            module0147.$g2094$.bind(module0147.f9546(var176), var171);
            module0147.$g2096$.bind(module0147.f9549(var176), var171);
            final SubLObject var180 = f44671(var172, (SubLObject)module0731.UNPROVIDED);
            var172 = ((module0731.NIL != var180) ? var180 : var172);
        }
        finally {
            module0147.$g2096$.rebind(var179, var171);
            module0147.$g2094$.rebind(var178, var171);
            module0147.$g2095$.rebind(var177, var171);
        }
        return var172;
    }
    
    public static SubLObject f44868(final SubLObject var170) {
        SubLObject var171 = module0731.$g5780$.getGlobalValue();
        if (module0731.NIL == var171) {
            var171 = module0034.f1934((SubLObject)module0731.$ic262$, (SubLObject)module0731.$ic264$, (SubLObject)module0731.$ic135$, (SubLObject)module0731.EQUALP, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.SIXTEEN_INTEGER);
        }
        SubLObject var172 = module0034.f1814(var171, var170, (SubLObject)module0731.$ic6$);
        if (var172 == module0731.$ic6$) {
            var172 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44866(var170)));
            module0034.f1816(var171, var170, var172, (SubLObject)module0731.UNPROVIDED);
        }
        return module0034.f1959(var172);
    }
    
    public static SubLObject f44867(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        SubLObject var173 = (SubLObject)module0731.NIL;
        if (module0731.NIL != module0212.f13762(var171)) {
            final SubLObject var174 = module0147.f9540(module0584.$g4396$.getDynamicValue(var172));
            final SubLObject var175 = module0147.$g2095$.currentBinding(var172);
            final SubLObject var176 = module0147.$g2094$.currentBinding(var172);
            final SubLObject var177 = module0147.$g2096$.currentBinding(var172);
            try {
                module0147.$g2095$.bind(module0147.f9545(var174), var172);
                module0147.$g2094$.bind(module0147.f9546(var174), var172);
                module0147.$g2096$.bind(module0147.f9549(var174), var172);
                var173 = module0220.f14562(var171, module0731.$ic265$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var177, var172);
                module0147.$g2094$.rebind(var176, var172);
                module0147.$g2095$.rebind(var175, var172);
            }
        }
        return var173;
    }
    
    public static SubLObject f44869(final SubLObject var171, final SubLObject var577, SubLObject var332) {
        if (var332 == module0731.UNPROVIDED) {
            var332 = (SubLObject)module0731.$ic173$;
        }
        final SubLThread var578 = SubLProcess.currentSubLThread();
        final SubLObject var579 = f44818(var332);
        SubLObject var580 = (SubLObject)module0731.NIL;
        SubLObject var581 = var579;
        SubLObject var582 = (SubLObject)module0731.NIL;
        var582 = var581.first();
        while (module0731.NIL != var581) {
            final SubLObject var583 = module0147.f9540(module0584.$g4396$.getDynamicValue(var578));
            final SubLObject var584 = module0147.$g2095$.currentBinding(var578);
            final SubLObject var585 = module0147.$g2094$.currentBinding(var578);
            final SubLObject var586 = module0147.$g2096$.currentBinding(var578);
            try {
                module0147.$g2095$.bind(module0147.f9545(var583), var578);
                module0147.$g2094$.bind(module0147.f9546(var583), var578);
                module0147.$g2096$.bind(module0147.f9549(var583), var578);
                final SubLObject var587 = var582;
                if (module0731.NIL != module0158.f10010(var171, (SubLObject)module0731.NIL, var587)) {
                    final SubLObject var588 = module0158.f10011(var171, (SubLObject)module0731.NIL, var587);
                    SubLObject var589 = (SubLObject)module0731.NIL;
                    final SubLObject var590 = (SubLObject)module0731.NIL;
                    while (module0731.NIL == var589) {
                        final SubLObject var591 = module0052.f3695(var588, var590);
                        final SubLObject var592 = (SubLObject)SubLObjectFactory.makeBoolean(!var590.eql(var591));
                        if (module0731.NIL != var592) {
                            SubLObject var593 = (SubLObject)module0731.NIL;
                            try {
                                var593 = module0158.f10316(var591, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                SubLObject var60_609 = (SubLObject)module0731.NIL;
                                final SubLObject var61_610 = (SubLObject)module0731.NIL;
                                while (module0731.NIL == var60_609) {
                                    final SubLObject var594 = module0052.f3695(var593, var61_610);
                                    final SubLObject var63_612 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_610.eql(var594));
                                    if (module0731.NIL != var63_612 && var577.eql(module0178.f11335(var594))) {
                                        final SubLObject var595 = module0178.f11336(var594);
                                        if (module0731.NIL == conses_high.member(var595, var580, Symbols.symbol_function((SubLObject)module0731.EQL), Symbols.symbol_function((SubLObject)module0731.IDENTITY))) {
                                            var580 = (SubLObject)ConsesLow.cons(var595, var580);
                                        }
                                    }
                                    var60_609 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_612);
                                }
                            }
                            finally {
                                final SubLObject var7_613 = Threads.$is_thread_performing_cleanupP$.currentBinding(var578);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var578);
                                    if (module0731.NIL != var593) {
                                        module0158.f10319(var593);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_613, var578);
                                }
                            }
                        }
                        var589 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var592);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var586, var578);
                module0147.$g2094$.rebind(var585, var578);
                module0147.$g2095$.rebind(var584, var578);
            }
            var581 = var581.rest();
            var582 = var581.first();
        }
        return var580;
    }
    
    public static SubLObject f44829(final SubLObject var19, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        if (module0731.NIL == f44656(var19, (SubLObject)module0731.UNPROVIDED)) {
            return (SubLObject)module0731.NIL;
        }
        return f44870(var19, var22);
    }
    
    public static SubLObject f44871() {
        final SubLObject var3 = module0731.$g5781$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44872(final SubLObject var19, final SubLObject var22) {
        return module0034.f1829(module0731.$g5781$.getGlobalValue(), (SubLObject)ConsesLow.list(var19, var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44873(final SubLObject var19, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0731.NIL;
        final SubLObject var25 = module0147.f9540(var22);
        final SubLObject var26 = module0147.$g2095$.currentBinding(var23);
        final SubLObject var27 = module0147.$g2094$.currentBinding(var23);
        final SubLObject var28 = module0147.$g2096$.currentBinding(var23);
        try {
            module0147.$g2095$.bind(module0147.f9545(var25), var23);
            module0147.$g2094$.bind(module0147.f9546(var25), var23);
            module0147.$g2096$.bind(module0147.f9549(var25), var23);
            var24 = module0220.f14553(var19, module0731.$ic267$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            if (module0731.NIL == var24) {
                SubLObject var29;
                SubLObject var30;
                for (var29 = module0220.f14562(var19, module0731.$ic57$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED), var30 = (SubLObject)module0731.NIL, var30 = var29.first(); module0731.NIL == var24 && module0731.NIL != var29; var24 = f44829(var30, var22), var29 = var29.rest(), var30 = var29.first()) {}
            }
        }
        finally {
            module0147.$g2096$.rebind(var28, var23);
            module0147.$g2094$.rebind(var27, var23);
            module0147.$g2095$.rebind(var26, var23);
        }
        return var24;
    }
    
    public static SubLObject f44870(final SubLObject var19, final SubLObject var22) {
        SubLObject var23 = module0731.$g5781$.getGlobalValue();
        if (module0731.NIL == var23) {
            var23 = module0034.f1934((SubLObject)module0731.$ic266$, (SubLObject)module0731.$ic268$, (SubLObject)module0731.$ic135$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0731.$ic269$);
        }
        final SubLObject var24 = module0034.f1782(var19, var22);
        final SubLObject var25 = module0034.f1814(var23, var24, (SubLObject)module0731.UNPROVIDED);
        if (var25 != module0731.$ic6$) {
            SubLObject var26 = var25;
            SubLObject var27 = (SubLObject)module0731.NIL;
            var27 = var26.first();
            while (module0731.NIL != var26) {
                SubLObject var28 = var27.first();
                final SubLObject var29 = conses_high.second(var27);
                if (var19.equal(var28.first())) {
                    var28 = var28.rest();
                    if (module0731.NIL != var28 && module0731.NIL == var28.rest() && var22.equal(var28.first())) {
                        return module0034.f1959(var29);
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        final SubLObject var30 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44873(var19, var22)));
        module0034.f1836(var23, var24, var25, var30, (SubLObject)ConsesLow.list(var19, var22));
        return module0034.f1959(var30);
    }
    
    public static SubLObject f44874() {
        final SubLObject var3 = module0731.$g5782$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44875(final SubLObject var27, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0731.$g5782$.getGlobalValue(), (SubLObject)ConsesLow.list(var27, var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44876(final SubLObject var27, final SubLObject var22) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0731.NIL;
        final SubLObject var30 = module0147.f9540(var22);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
        final SubLObject var32 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var33 = module0147.$g2096$.currentBinding(var28);
        try {
            module0147.$g2095$.bind(module0147.f9545(var30), var28);
            module0147.$g2094$.bind(module0147.f9546(var30), var28);
            module0147.$g2096$.bind(module0147.f9549(var30), var28);
            var29 = Sort.sort(module0220.f14562(var27, module0731.$ic267$, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.UNPROVIDED), Symbols.symbol_function((SubLObject)module0731.$ic101$), (SubLObject)module0731.UNPROVIDED).first();
        }
        finally {
            module0147.$g2096$.rebind(var33, var28);
            module0147.$g2094$.rebind(var32, var28);
            module0147.$g2095$.rebind(var31, var28);
        }
        return var29;
    }
    
    public static SubLObject f44877(final SubLObject var27, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var28 = module0731.$g5782$.getGlobalValue();
        if (module0731.NIL == var28) {
            var28 = module0034.f1934((SubLObject)module0731.$ic270$, (SubLObject)module0731.$ic271$, (SubLObject)module0731.$ic37$, (SubLObject)module0731.EQUAL, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
        }
        final SubLObject var29 = module0034.f1782(var27, var22);
        final SubLObject var30 = module0034.f1814(var28, var29, (SubLObject)module0731.UNPROVIDED);
        if (var30 != module0731.$ic6$) {
            SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0731.NIL;
            var32 = var31.first();
            while (module0731.NIL != var31) {
                SubLObject var33 = var32.first();
                final SubLObject var34 = conses_high.second(var32);
                if (var27.equal(var33.first())) {
                    var33 = var33.rest();
                    if (module0731.NIL != var33 && module0731.NIL == var33.rest() && var22.equal(var33.first())) {
                        return module0034.f1959(var34);
                    }
                }
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        final SubLObject var35 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44876(var27, var22)));
        module0034.f1836(var28, var29, var30, var35, (SubLObject)ConsesLow.list(var27, var22));
        return module0034.f1959(var35);
    }
    
    public static SubLObject f44878(final SubLObject var615) {
        final SubLThread var616 = SubLProcess.currentSubLThread();
        SubLObject var617 = (SubLObject)module0731.NIL;
        final SubLObject var618 = module0147.f9540(module0584.$g4396$.getDynamicValue(var616));
        final SubLObject var619 = module0147.$g2095$.currentBinding(var616);
        final SubLObject var620 = module0147.$g2094$.currentBinding(var616);
        final SubLObject var621 = module0147.$g2096$.currentBinding(var616);
        try {
            module0147.$g2095$.bind(module0147.f9545(var618), var616);
            module0147.$g2094$.bind(module0147.f9546(var618), var616);
            module0147.$g2096$.bind(module0147.f9549(var618), var616);
            var617 = module0220.f14562(var615, module0731.$ic272$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var621, var616);
            module0147.$g2094$.rebind(var620, var616);
            module0147.$g2095$.rebind(var619, var616);
        }
        return var617;
    }
    
    public static SubLObject f44879(final SubLObject var615) {
        final SubLThread var616 = SubLProcess.currentSubLThread();
        SubLObject var617 = (SubLObject)module0731.NIL;
        final SubLObject var618 = module0147.f9540(module0584.$g4396$.getDynamicValue(var616));
        final SubLObject var619 = module0147.$g2095$.currentBinding(var616);
        final SubLObject var620 = module0147.$g2094$.currentBinding(var616);
        final SubLObject var621 = module0147.$g2096$.currentBinding(var616);
        try {
            module0147.$g2095$.bind(module0147.f9545(var618), var616);
            module0147.$g2094$.bind(module0147.f9546(var618), var616);
            module0147.$g2096$.bind(module0147.f9549(var618), var616);
            var617 = module0220.f14562(var615, module0731.$ic273$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var621, var616);
            module0147.$g2094$.rebind(var620, var616);
            module0147.$g2095$.rebind(var619, var616);
        }
        return var617;
    }
    
    public static SubLObject f44880(final SubLObject var616, final SubLObject var617) {
        final SubLThread var618 = SubLProcess.currentSubLThread();
        SubLObject var619 = (SubLObject)module0731.NIL;
        final SubLObject var620 = module0147.$g2094$.currentBinding(var618);
        final SubLObject var621 = module0147.$g2095$.currentBinding(var618);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var618);
            module0147.$g2095$.bind(module0731.$ic22$, var618);
            var619 = module0004.f104(module0731.$ic274$, module0226.f14882(var616, var617, (SubLObject)module0731.UNPROVIDED), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var621, var618);
            module0147.$g2094$.rebind(var620, var618);
        }
        return var619;
    }
    
    public static SubLObject f44881() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != module0067.f4852(module0731.$g5783$.getGlobalValue()) && module0731.NIL == module0067.f4882(module0731.$g5783$.getGlobalValue()));
    }
    
    public static SubLObject f44882() {
        if (module0731.NIL == module0067.f4852(module0731.$g5783$.getGlobalValue())) {
            module0731.$g5783$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0731.EQ), (SubLObject)module0731.$ic42$));
        }
        f44773();
        return module0067.f4881(module0731.$g5783$.getGlobalValue());
    }
    
    public static SubLObject f44653() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f44882();
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var4);
            module0147.$g2095$.bind(module0731.$ic22$, var4);
            if (module0731.NIL != module0128.f8463(module0731.$ic274$, (SubLObject)module0731.UNPROVIDED)) {
                SubLObject var7 = module0731.$ic274$;
                final SubLObject var8 = (SubLObject)module0731.$ic48$;
                final SubLObject var9 = module0056.f4145(var8);
                final SubLObject var7_618 = module0139.$g1635$.currentBinding(var4);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var4);
                    final SubLObject var10 = (SubLObject)module0731.NIL;
                    final SubLObject var7_619 = module0141.$g1714$.currentBinding(var4);
                    final SubLObject var8_620 = module0141.$g1715$.currentBinding(var4);
                    try {
                        module0141.$g1714$.bind((module0731.NIL != var10) ? var10 : module0141.f9283(), var4);
                        module0141.$g1715$.bind((SubLObject)((module0731.NIL != var10) ? module0731.$ic49$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                        if (module0731.NIL != var10 && module0731.NIL != module0136.f8864() && module0731.NIL == module0141.f9279(var10)) {
                            final SubLObject var11 = module0136.$g1591$.getDynamicValue(var4);
                            if (var11.eql((SubLObject)module0731.$ic50$)) {
                                module0136.f8870((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0731.$ic53$)) {
                                module0136.f8871((SubLObject)module0731.ONE_INTEGER, (SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0731.$ic55$)) {
                                Errors.warn((SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                            }
                            else {
                                Errors.warn((SubLObject)module0731.$ic56$, module0136.$g1591$.getDynamicValue(var4));
                                Errors.cerror((SubLObject)module0731.$ic54$, (SubLObject)module0731.$ic51$, var10, (SubLObject)module0731.$ic52$);
                            }
                        }
                        final SubLObject var7_620 = module0141.$g1670$.currentBinding(var4);
                        final SubLObject var8_621 = module0141.$g1671$.currentBinding(var4);
                        final SubLObject var12 = module0141.$g1672$.currentBinding(var4);
                        final SubLObject var13 = module0141.$g1674$.currentBinding(var4);
                        final SubLObject var14 = module0137.$g1605$.currentBinding(var4);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0731.$ic57$), var4);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0731.$ic57$)), var4);
                            module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                            module0137.$g1605$.bind(module0137.f8955(module0731.$ic57$), var4);
                            if (module0731.NIL != module0136.f8865() || module0731.NIL != module0244.f15795(module0731.$ic274$, module0137.f8955((SubLObject)module0731.UNPROVIDED))) {
                                final SubLObject var7_621 = module0141.$g1677$.currentBinding(var4);
                                final SubLObject var8_622 = module0138.$g1619$.currentBinding(var4);
                                final SubLObject var9_625 = module0141.$g1674$.currentBinding(var4);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var4);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0731.$ic57$)), var4);
                                    module0141.$g1674$.bind((SubLObject)module0731.NIL, var4);
                                    module0249.f16055(var7, (SubLObject)module0731.UNPROVIDED);
                                    while (module0731.NIL != var7) {
                                        final SubLObject var15 = var7;
                                        final SubLObject var16 = module0731.$ic78$;
                                        if (module0731.NIL != module0158.f10010(var15, (SubLObject)module0731.TWO_INTEGER, var16)) {
                                            final SubLObject var17 = module0158.f10011(var15, (SubLObject)module0731.TWO_INTEGER, var16);
                                            SubLObject var18 = (SubLObject)module0731.NIL;
                                            final SubLObject var19 = (SubLObject)module0731.NIL;
                                            while (module0731.NIL == var18) {
                                                final SubLObject var20 = module0052.f3695(var17, var19);
                                                final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                                if (module0731.NIL != var21) {
                                                    SubLObject var22 = (SubLObject)module0731.NIL;
                                                    try {
                                                        var22 = module0158.f10316(var20, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                                        SubLObject var60_626 = (SubLObject)module0731.NIL;
                                                        final SubLObject var61_627 = (SubLObject)module0731.NIL;
                                                        while (module0731.NIL == var60_626) {
                                                            final SubLObject var23 = module0052.f3695(var22, var61_627);
                                                            final SubLObject var63_628 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_627.eql(var23));
                                                            if (module0731.NIL != var63_628) {
                                                                final SubLObject var24 = module0178.f11334(var23);
                                                                final SubLObject var25 = module0178.f11287(var23);
                                                                module0084.f5762(module0731.$g5783$.getGlobalValue(), var24, var25);
                                                            }
                                                            var60_626 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_628);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var7_622 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var4);
                                                            if (module0731.NIL != var22) {
                                                                module0158.f10319(var22);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_622, var4);
                                                        }
                                                    }
                                                }
                                                var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var21);
                                            }
                                        }
                                        SubLObject var27;
                                        final SubLObject var26 = var27 = module0200.f12443(module0137.f8955(module0731.$ic57$));
                                        SubLObject var28 = (SubLObject)module0731.NIL;
                                        var28 = var27.first();
                                        while (module0731.NIL != var27) {
                                            final SubLObject var7_623 = module0137.$g1605$.currentBinding(var4);
                                            final SubLObject var8_623 = module0141.$g1674$.currentBinding(var4);
                                            try {
                                                module0137.$g1605$.bind(var28, var4);
                                                module0141.$g1674$.bind((SubLObject)((module0731.NIL != module0141.f9205((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0731.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                final SubLObject var29 = module0228.f15229(var7);
                                                if (module0731.NIL != module0138.f8992(var29)) {
                                                    final SubLObject var30 = module0242.f15664(var29, module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                    if (module0731.NIL != var30) {
                                                        final SubLObject var31 = module0245.f15834(var30, module0138.f8979(), module0137.f8955((SubLObject)module0731.UNPROVIDED));
                                                        if (module0731.NIL != var31) {
                                                            SubLObject var32;
                                                            for (var32 = module0066.f4838(module0067.f4891(var31)); module0731.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
                                                                var4.resetMultipleValues();
                                                                final SubLObject var33 = module0066.f4839(var32);
                                                                final SubLObject var34 = var4.secondMultipleValue();
                                                                var4.resetMultipleValues();
                                                                if (module0731.NIL != module0147.f9507(var33)) {
                                                                    final SubLObject var7_624 = module0138.$g1623$.currentBinding(var4);
                                                                    try {
                                                                        module0138.$g1623$.bind(var33, var4);
                                                                        SubLObject var98_633;
                                                                        for (var98_633 = module0066.f4838(module0067.f4891(var34)); module0731.NIL == module0066.f4841(var98_633); var98_633 = module0066.f4840(var98_633)) {
                                                                            var4.resetMultipleValues();
                                                                            final SubLObject var35 = module0066.f4839(var98_633);
                                                                            final SubLObject var36 = var4.secondMultipleValue();
                                                                            var4.resetMultipleValues();
                                                                            if (module0731.NIL != module0141.f9289(var35)) {
                                                                                final SubLObject var7_625 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var35, var4);
                                                                                    final SubLObject var37 = var36;
                                                                                    if (module0731.NIL != module0077.f5302(var37)) {
                                                                                        final SubLObject var38 = module0077.f5333(var37);
                                                                                        SubLObject var39;
                                                                                        SubLObject var40;
                                                                                        SubLObject var41;
                                                                                        for (var39 = module0032.f1741(var38), var40 = (SubLObject)module0731.NIL, var40 = module0032.f1742(var39, var38); module0731.NIL == module0032.f1744(var39, var40); var40 = module0032.f1743(var40)) {
                                                                                            var41 = module0032.f1745(var39, var40);
                                                                                            if (module0731.NIL != module0032.f1746(var40, var41) && module0731.NIL == module0249.f16059(var41, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var41, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var41, var9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var37.isList()) {
                                                                                        SubLObject var42 = var37;
                                                                                        SubLObject var43 = (SubLObject)module0731.NIL;
                                                                                        var43 = var42.first();
                                                                                        while (module0731.NIL != var42) {
                                                                                            if (module0731.NIL == module0249.f16059(var43, (SubLObject)module0731.UNPROVIDED)) {
                                                                                                module0249.f16055(var43, (SubLObject)module0731.UNPROVIDED);
                                                                                                module0056.f4149(var43, var9);
                                                                                            }
                                                                                            var42 = var42.rest();
                                                                                            var43 = var42.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0731.$ic59$, var37);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_625, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var98_633);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_624, var4);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var32);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0731.FIVE_INTEGER, (SubLObject)module0731.$ic60$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0731.NIL != module0155.f9785(var29, (SubLObject)module0731.UNPROVIDED)) {
                                                    SubLObject var13_635;
                                                    final SubLObject var44 = var13_635 = ((module0731.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0731.UNPROVIDED)));
                                                    SubLObject var45 = (SubLObject)module0731.NIL;
                                                    var45 = var13_635.first();
                                                    while (module0731.NIL != var13_635) {
                                                        final SubLObject var7_626 = module0138.$g1625$.currentBinding(var4);
                                                        try {
                                                            module0138.$g1625$.bind(var45, var4);
                                                            final SubLObject var47;
                                                            final SubLObject var46 = var47 = Functions.funcall(var45, var29);
                                                            if (module0731.NIL != module0077.f5302(var47)) {
                                                                final SubLObject var48 = module0077.f5333(var47);
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                for (var49 = module0032.f1741(var48), var50 = (SubLObject)module0731.NIL, var50 = module0032.f1742(var49, var48); module0731.NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                    var51 = module0032.f1745(var49, var50);
                                                                    if (module0731.NIL != module0032.f1746(var50, var51) && module0731.NIL == module0249.f16059(var51, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var51, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var51, var9);
                                                                    }
                                                                }
                                                            }
                                                            else if (var47.isList()) {
                                                                SubLObject var52 = var47;
                                                                SubLObject var53 = (SubLObject)module0731.NIL;
                                                                var53 = var52.first();
                                                                while (module0731.NIL != var52) {
                                                                    if (module0731.NIL == module0249.f16059(var53, (SubLObject)module0731.UNPROVIDED)) {
                                                                        module0249.f16055(var53, (SubLObject)module0731.UNPROVIDED);
                                                                        module0056.f4149(var53, var9);
                                                                    }
                                                                    var52 = var52.rest();
                                                                    var53 = var52.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0731.$ic59$, var47);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_626, var4);
                                                        }
                                                        var13_635 = var13_635.rest();
                                                        var45 = var13_635.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_623, var4);
                                                module0137.$g1605$.rebind(var7_623, var4);
                                            }
                                            var27 = var27.rest();
                                            var28 = var27.first();
                                        }
                                        var7 = module0056.f4150(var9);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var9_625, var4);
                                    module0138.$g1619$.rebind(var8_622, var4);
                                    module0141.$g1677$.rebind(var7_621, var4);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.$ic61$, module0731.$ic274$, module0244.f15748(module0137.f8955((SubLObject)module0731.UNPROVIDED)), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var14, var4);
                            module0141.$g1674$.rebind(var13, var4);
                            module0141.$g1672$.rebind(var12, var4);
                            module0141.$g1671$.rebind(var8_621, var4);
                            module0141.$g1670$.rebind(var7_620, var4);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_620, var4);
                        module0141.$g1714$.rebind(var7_619, var4);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1635$.rebind(var7_618, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
        return module0731.$g5783$.getGlobalValue();
    }
    
    public static SubLObject f44656(final SubLObject var115, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        f44883();
        final SubLObject var116 = module0067.f4885(module0731.$g5783$.getGlobalValue(), var115, (SubLObject)module0731.UNPROVIDED);
        SubLObject var117 = Equality.eq(var22, module0731.$ic1$);
        if (module0731.NIL == var117) {
            SubLObject var118;
            SubLObject var119;
            for (var118 = var116, var119 = (SubLObject)module0731.NIL, var119 = var118.first(); module0731.NIL == var117 && module0731.NIL != var118; var117 = f44644(var22, var119), var118 = var118.rest(), var119 = var118.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != var116 && module0731.NIL != var117);
    }
    
    public static SubLObject f44883() {
        if (module0731.NIL == f44881()) {
            f44653();
        }
        return (SubLObject)module0731.$ic7$;
    }
    
    public static SubLObject f44735(SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0731.$ic1$;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        f44883();
        if (var22.eql(module0731.$ic1$)) {
            return module0067.f4902(module0731.$g5783$.getGlobalValue());
        }
        SubLObject var24 = (SubLObject)module0731.NIL;
        SubLObject var25;
        for (var25 = module0066.f4838(module0067.f4891(module0731.$g5783$.getGlobalValue())); module0731.NIL == module0066.f4841(var25); var25 = module0066.f4840(var25)) {
            var23.resetMultipleValues();
            final SubLObject var26 = module0066.f4839(var25);
            final SubLObject var27 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            SubLObject var28 = (SubLObject)module0731.NIL;
            if (module0731.NIL == var28) {
                SubLObject var29;
                SubLObject var30;
                for (var29 = var27, var30 = (SubLObject)module0731.NIL, var30 = var29.first(); module0731.NIL == var28 && module0731.NIL != var29; var28 = f44644(var22, var30), var29 = var29.rest(), var30 = var29.first()) {}
            }
            if (module0731.NIL != var28) {
                var24 = (SubLObject)ConsesLow.cons(var26, var24);
            }
        }
        module0066.f4842(var25);
        return var24;
    }
    
    public static SubLObject f44777() {
        final SubLObject var3 = module0731.$g5784$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44884(final SubLObject var25, final SubLObject var614, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = (SubLObject)module0731.NIL;
        }
        return module0034.f1829(module0731.$g5784$.getGlobalValue(), (SubLObject)ConsesLow.list(var25, var614, var22), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44885(final SubLObject var25, final SubLObject var614, final SubLObject var22) {
        final SubLThread var615 = SubLProcess.currentSubLThread();
        SubLObject var616 = (SubLObject)module0731.NIL;
        if (module0731.NIL != var22) {
            final SubLObject var617 = module0147.f9540(var22);
            final SubLObject var618 = module0147.$g2095$.currentBinding(var615);
            final SubLObject var619 = module0147.$g2094$.currentBinding(var615);
            final SubLObject var620 = module0147.$g2096$.currentBinding(var615);
            try {
                module0147.$g2095$.bind(module0147.f9545(var617), var615);
                module0147.$g2094$.bind(module0147.f9546(var617), var615);
                module0147.$g2096$.bind(module0147.f9549(var617), var615);
                var616 = module0256.f16605(var614, var25, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var620, var615);
                module0147.$g2094$.rebind(var619, var615);
                module0147.$g2095$.rebind(var618, var615);
            }
        }
        else {
            final SubLObject var621 = module0147.$g2094$.currentBinding(var615);
            final SubLObject var622 = module0147.$g2095$.currentBinding(var615);
            try {
                module0147.$g2094$.bind((SubLObject)module0731.$ic21$, var615);
                module0147.$g2095$.bind(module0731.$ic22$, var615);
                var616 = module0256.f16605(var614, var25, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var622, var615);
                module0147.$g2094$.rebind(var621, var615);
            }
        }
        return var616;
    }
    
    public static SubLObject f44713(final SubLObject var25, final SubLObject var614, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = (SubLObject)module0731.NIL;
        }
        SubLObject var615 = module0731.$g5784$.getGlobalValue();
        if (module0731.NIL == var615) {
            var615 = module0034.f1934((SubLObject)module0731.$ic276$, (SubLObject)module0731.$ic277$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQUAL, (SubLObject)module0731.THREE_INTEGER, (SubLObject)module0731.$ic37$);
        }
        final SubLObject var616 = module0034.f1781(var25, var614, var22);
        final SubLObject var617 = module0034.f1814(var615, var616, (SubLObject)module0731.UNPROVIDED);
        if (var617 != module0731.$ic6$) {
            SubLObject var618 = var617;
            SubLObject var619 = (SubLObject)module0731.NIL;
            var619 = var618.first();
            while (module0731.NIL != var618) {
                SubLObject var620 = var619.first();
                final SubLObject var621 = conses_high.second(var619);
                if (var25.equal(var620.first())) {
                    var620 = var620.rest();
                    if (var614.equal(var620.first())) {
                        var620 = var620.rest();
                        if (module0731.NIL != var620 && module0731.NIL == var620.rest() && var22.equal(var620.first())) {
                            return module0034.f1959(var621);
                        }
                    }
                }
                var618 = var618.rest();
                var619 = var618.first();
            }
        }
        final SubLObject var622 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44885(var25, var614, var22)));
        module0034.f1836(var615, var616, var617, var622, (SubLObject)ConsesLow.list(var25, var614, var22));
        return module0034.f1959(var622);
    }
    
    public static SubLObject f44886(final SubLObject var25, final SubLObject var637) {
        SubLObject var638 = (SubLObject)module0731.NIL;
        if (module0731.NIL == var638) {
            SubLObject var639 = var637;
            SubLObject var640 = (SubLObject)module0731.NIL;
            var640 = var639.first();
            while (module0731.NIL == var638 && module0731.NIL != var639) {
                if (module0731.NIL != f44713(var25, var640, (SubLObject)module0731.UNPROVIDED)) {
                    var638 = (SubLObject)module0731.T;
                }
                var639 = var639.rest();
                var640 = var639.first();
            }
        }
        return var638;
    }
    
    public static SubLObject f44887(final SubLObject var639, final SubLObject var640) {
        return f44713(var640, var639, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44888(final SubLObject var19) {
        return Equality.equalp(f44889(var19), (SubLObject)module0731.$ic279$);
    }
    
    public static SubLObject f44890(final SubLObject var19) {
        return f44891(var19, module0731.$ic280$, module0731.$ic143$);
    }
    
    public static SubLObject f44892(final SubLObject var19) {
        return f44891(var19, module0731.$ic280$, module0731.$ic38$);
    }
    
    public static SubLObject f44891(final SubLObject var641, final SubLObject var642, final SubLObject var614) {
        if (module0731.NIL != module0172.f10917(var641)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0205.f13276(var641).eql(var642) && module0731.NIL != f44713(module0205.f13277(var641, (SubLObject)module0731.UNPROVIDED), var614, (SubLObject)module0731.UNPROVIDED));
        }
        if (module0731.NIL != module0173.f10955(var641)) {
            final SubLObject var643 = f44893(var642, var614);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL != var643 && module0731.NIL != f44713(var641, var643, (SubLObject)module0731.UNPROVIDED));
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44894() {
        final SubLObject var3 = module0731.$g5786$.getGlobalValue();
        if (module0731.NIL != var3) {
            module0034.f1818(var3);
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44895(final SubLObject var642, final SubLObject var614) {
        return module0034.f1829(module0731.$g5786$.getGlobalValue(), (SubLObject)ConsesLow.list(var642, var614), (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44896(final SubLObject var642, final SubLObject var614) {
        return module0172.f10921(module0202.f12643(var642, var614));
    }
    
    public static SubLObject f44893(final SubLObject var642, final SubLObject var614) {
        SubLObject var643 = module0731.$g5786$.getGlobalValue();
        if (module0731.NIL == var643) {
            var643 = module0034.f1934((SubLObject)module0731.$ic281$, (SubLObject)module0731.$ic282$, (SubLObject)module0731.NIL, (SubLObject)module0731.EQL, (SubLObject)module0731.TWO_INTEGER, (SubLObject)module0731.ZERO_INTEGER);
        }
        final SubLObject var644 = module0034.f1782(var642, var614);
        final SubLObject var645 = module0034.f1814(var643, var644, (SubLObject)module0731.UNPROVIDED);
        if (var645 != module0731.$ic6$) {
            SubLObject var646 = var645;
            SubLObject var647 = (SubLObject)module0731.NIL;
            var647 = var646.first();
            while (module0731.NIL != var646) {
                SubLObject var648 = var647.first();
                final SubLObject var649 = conses_high.second(var647);
                if (var642.eql(var648.first())) {
                    var648 = var648.rest();
                    if (module0731.NIL != var648 && module0731.NIL == var648.rest() && var614.eql(var648.first())) {
                        return module0034.f1959(var649);
                    }
                }
                var646 = var646.rest();
                var647 = var646.first();
            }
        }
        final SubLObject var650 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44896(var642, var614)));
        module0034.f1836(var643, var644, var645, var650, (SubLObject)ConsesLow.list(var642, var614));
        return module0034.f1959(var650);
    }
    
    public static SubLObject f44897(final SubLObject var19) {
        return module0004.f104(f44889(var19), (SubLObject)module0731.$ic283$, Symbols.symbol_function((SubLObject)module0731.EQUALP), (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44898(final SubLObject var19) {
        return module0004.f104(f44889(var19), (SubLObject)module0731.$ic284$, Symbols.symbol_function((SubLObject)module0731.EQUALP), (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44889(final SubLObject var115) {
        return (module0731.NIL != module0167.f10813(var115)) ? module0172.f10915(var115) : var115;
    }
    
    public static SubLObject f44899(final SubLObject var644, final SubLObject var201, final SubLObject var645, final SubLObject var19, SubLObject var646, SubLObject var27, SubLObject var208, SubLObject var647) {
        if (var646 == module0731.UNPROVIDED) {
            var646 = (SubLObject)module0731.$ic285$;
        }
        if (var27 == module0731.UNPROVIDED) {
            var27 = (SubLObject)module0731.$ic133$;
        }
        if (var208 == module0731.UNPROVIDED) {
            var208 = module0584.$g4396$.getDynamicValue();
        }
        if (var647 == module0731.UNPROVIDED) {
            var647 = module0584.$g4396$.getDynamicValue();
        }
        assert module0731.NIL != Types.listp(var644) : var644;
        assert module0731.NIL != module0173.f10955(var201) : var201;
        assert module0731.NIL != Types.listp(var645) : var645;
        assert module0731.NIL != f44656(var19, (SubLObject)module0731.UNPROVIDED) : var19;
        final SubLObject var648 = (SubLObject)((var27 == module0731.$ic133$) ? f44900(var644, var201, var645, var19, var208) : ConsesLow.list(var27));
        SubLObject var649 = (SubLObject)module0731.NIL;
        if (module0731.NIL != f44713(var19, module0731.$ic38$, (SubLObject)module0731.UNPROVIDED)) {
            SubLObject var650 = var648;
            SubLObject var651 = (SubLObject)module0731.NIL;
            var651 = var650.first();
            while (module0731.NIL != var650) {
                if (module0731.NIL != module0226.f14807(var651)) {
                    SubLObject var13_650;
                    final SubLObject var652 = var13_650 = f44901(var644, var201, var645, var19, var651, var208);
                    SubLObject var653 = (SubLObject)module0731.NIL;
                    var653 = var13_650.first();
                    while (module0731.NIL != var13_650) {
                        SubLObject var654 = (SubLObject)module0731.NIL;
                        final SubLObject var655 = f44902(var651, var653, var647);
                        final SubLObject var656 = Numbers.subtract((SubLObject)module0731.THREE_INTEGER, var653);
                        final SubLObject var657 = (SubLObject)((var646 == module0731.$ic285$) ? f44903(var651, var656, var647) : module0731.NIL);
                        if (module0731.NIL != var655) {
                            if (var646 != module0731.$ic285$) {
                                var654 = f44904((SubLObject)module0731.NIL, var653);
                            }
                            else if (module0731.NIL != var657) {
                                var654 = f44904((SubLObject)module0731.T, var653);
                            }
                        }
                        if (module0731.NIL != var654) {
                            final SubLObject var658 = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)module0731.$ic286$, var655), reader.bq_cons((SubLObject)module0731.$ic287$, var651), reader.bq_cons((SubLObject)module0731.$ic288$, var646), reader.bq_cons((SubLObject)module0731.$ic289$, var657));
                            final SubLObject var659 = module0205.f13257(var658, var654, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
                            var649 = (SubLObject)ConsesLow.cons(var659, var649);
                        }
                        var13_650 = var13_650.rest();
                        var653 = var13_650.first();
                    }
                }
                var650 = var650.rest();
                var651 = var650.first();
            }
            return var649;
        }
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44904(final SubLObject var656, final SubLObject var651) {
        return module0035.f2293(module0035.f2293(module0731.$g5787$.getGlobalValue(), var656, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED), var651, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44901(final SubLObject var644, final SubLObject var201, final SubLObject var645, final SubLObject var19, final SubLObject var27, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var646 = SubLProcess.currentSubLThread();
        SubLObject var647 = (SubLObject)module0731.NIL;
        final SubLObject var648 = module0147.f9540(var22);
        final SubLObject var649 = module0147.$g2095$.currentBinding(var646);
        final SubLObject var650 = module0147.$g2094$.currentBinding(var646);
        final SubLObject var651 = module0147.$g2096$.currentBinding(var646);
        try {
            module0147.$g2095$.bind(module0147.f9545(var648), var646);
            module0147.$g2094$.bind(module0147.f9546(var648), var646);
            module0147.$g2096$.bind(module0147.f9549(var648), var646);
            if (module0731.NIL != var644 && module0731.NIL != var645) {
                final SubLObject var652 = module0731.$ic291$;
                if (module0217.f14221(var201, (SubLObject)module0731.TWO_INTEGER, var652, (SubLObject)module0731.UNPROVIDED).isPositive()) {
                    final SubLObject var653 = var652;
                    if (module0731.NIL != module0158.f10010(var27, (SubLObject)module0731.FIVE_INTEGER, var653)) {
                        final SubLObject var654 = module0158.f10011(var27, (SubLObject)module0731.FIVE_INTEGER, var653);
                        SubLObject var655 = (SubLObject)module0731.NIL;
                        final SubLObject var656 = (SubLObject)module0731.NIL;
                        while (module0731.NIL == var655) {
                            final SubLObject var657 = module0052.f3695(var654, var656);
                            final SubLObject var658 = (SubLObject)SubLObjectFactory.makeBoolean(!var656.eql(var657));
                            if (module0731.NIL != var658) {
                                SubLObject var659 = (SubLObject)module0731.NIL;
                                try {
                                    var659 = module0158.f10316(var657, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                    SubLObject var60_658 = (SubLObject)module0731.NIL;
                                    final SubLObject var61_659 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var60_658) {
                                        final SubLObject var660 = module0052.f3695(var659, var61_659);
                                        final SubLObject var63_660 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_659.eql(var660));
                                        if (module0731.NIL != var63_660) {
                                            var646.resetMultipleValues();
                                            final SubLObject var661 = module0732.f45023(module0178.f11285(var660), (SubLObject)module0731.UNPROVIDED);
                                            final SubLObject var662 = var646.secondMultipleValue();
                                            final SubLObject var663 = var646.thirdMultipleValue();
                                            final SubLObject var664 = var646.fourthMultipleValue();
                                            var646.resetMultipleValues();
                                            if (var664.eql(var19) && var662.eql(var201) && var661.equal(var644) && var663.equal(var645)) {
                                                var647 = (SubLObject)ConsesLow.cons(module0178.f11331(var660, (SubLObject)module0731.SIX_INTEGER), var647);
                                            }
                                        }
                                        var60_658 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_660);
                                    }
                                }
                                finally {
                                    final SubLObject var7_665 = Threads.$is_thread_performing_cleanupP$.currentBinding(var646);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var646);
                                        if (module0731.NIL != var659) {
                                            module0158.f10319(var659);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_665, var646);
                                    }
                                }
                            }
                            var655 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var658);
                        }
                    }
                }
            }
            else if (module0731.NIL != var644) {
                final SubLObject var652 = module0731.$ic292$;
                if (module0217.f14221(var201, (SubLObject)module0731.TWO_INTEGER, var652, (SubLObject)module0731.UNPROVIDED).isPositive()) {
                    final SubLObject var653 = var652;
                    if (module0731.NIL != module0158.f10010(var27, (SubLObject)module0731.FOUR_INTEGER, var653)) {
                        final SubLObject var654 = module0158.f10011(var27, (SubLObject)module0731.FOUR_INTEGER, var653);
                        SubLObject var655 = (SubLObject)module0731.NIL;
                        final SubLObject var656 = (SubLObject)module0731.NIL;
                        while (module0731.NIL == var655) {
                            final SubLObject var657 = module0052.f3695(var654, var656);
                            final SubLObject var658 = (SubLObject)SubLObjectFactory.makeBoolean(!var656.eql(var657));
                            if (module0731.NIL != var658) {
                                SubLObject var659 = (SubLObject)module0731.NIL;
                                try {
                                    var659 = module0158.f10316(var657, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                    SubLObject var60_659 = (SubLObject)module0731.NIL;
                                    final SubLObject var61_660 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var60_659) {
                                        final SubLObject var660 = module0052.f3695(var659, var61_660);
                                        final SubLObject var63_661 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_660.eql(var660));
                                        if (module0731.NIL != var63_661) {
                                            var646.resetMultipleValues();
                                            final SubLObject var661 = module0732.f45023(module0178.f11285(var660), (SubLObject)module0731.UNPROVIDED);
                                            final SubLObject var662 = var646.secondMultipleValue();
                                            final SubLObject var663 = var646.thirdMultipleValue();
                                            final SubLObject var664 = var646.fourthMultipleValue();
                                            var646.resetMultipleValues();
                                            if (var664.eql(var19) && var662.eql(var201) && var661.equal(var644)) {
                                                var647 = (SubLObject)ConsesLow.cons(module0178.f11338(var660), var647);
                                            }
                                        }
                                        var60_659 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_661);
                                    }
                                }
                                finally {
                                    final SubLObject var7_666 = Threads.$is_thread_performing_cleanupP$.currentBinding(var646);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var646);
                                        if (module0731.NIL != var659) {
                                            module0158.f10319(var659);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_666, var646);
                                    }
                                }
                            }
                            var655 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var658);
                        }
                    }
                }
            }
            else if (module0731.NIL != var645) {
                final SubLObject var652 = module0731.$ic293$;
                if (module0217.f14221(var201, (SubLObject)module0731.ONE_INTEGER, var652, (SubLObject)module0731.UNPROVIDED).isPositive()) {
                    final SubLObject var653 = var652;
                    if (module0731.NIL != module0158.f10010(var27, (SubLObject)module0731.FOUR_INTEGER, var653)) {
                        final SubLObject var654 = module0158.f10011(var27, (SubLObject)module0731.FOUR_INTEGER, var653);
                        SubLObject var655 = (SubLObject)module0731.NIL;
                        final SubLObject var656 = (SubLObject)module0731.NIL;
                        while (module0731.NIL == var655) {
                            final SubLObject var657 = module0052.f3695(var654, var656);
                            final SubLObject var658 = (SubLObject)SubLObjectFactory.makeBoolean(!var656.eql(var657));
                            if (module0731.NIL != var658) {
                                SubLObject var659 = (SubLObject)module0731.NIL;
                                try {
                                    var659 = module0158.f10316(var657, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                    SubLObject var60_660 = (SubLObject)module0731.NIL;
                                    final SubLObject var61_661 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var60_660) {
                                        final SubLObject var660 = module0052.f3695(var659, var61_661);
                                        final SubLObject var63_662 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_661.eql(var660));
                                        if (module0731.NIL != var63_662) {
                                            var646.resetMultipleValues();
                                            final SubLObject var661 = module0732.f45023(module0178.f11285(var660), (SubLObject)module0731.UNPROVIDED);
                                            final SubLObject var662 = var646.secondMultipleValue();
                                            final SubLObject var663 = var646.thirdMultipleValue();
                                            final SubLObject var664 = var646.fourthMultipleValue();
                                            var646.resetMultipleValues();
                                            if (var664.eql(var19) && var662.eql(var201) && var663.equal(var645)) {
                                                var647 = (SubLObject)ConsesLow.cons(module0178.f11338(var660), var647);
                                            }
                                        }
                                        var60_660 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_662);
                                    }
                                }
                                finally {
                                    final SubLObject var7_667 = Threads.$is_thread_performing_cleanupP$.currentBinding(var646);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var646);
                                        if (module0731.NIL != var659) {
                                            module0158.f10319(var659);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_667, var646);
                                    }
                                }
                            }
                            var655 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var658);
                        }
                    }
                }
            }
            else {
                final SubLObject var652 = module0731.$ic294$;
                if (module0217.f14221(var201, (SubLObject)module0731.ONE_INTEGER, var652, (SubLObject)module0731.UNPROVIDED).isPositive()) {
                    final SubLObject var653 = var652;
                    if (module0731.NIL != module0158.f10010(var201, (SubLObject)module0731.NIL, var653)) {
                        final SubLObject var654 = module0158.f10011(var201, (SubLObject)module0731.NIL, var653);
                        SubLObject var655 = (SubLObject)module0731.NIL;
                        final SubLObject var656 = (SubLObject)module0731.NIL;
                        while (module0731.NIL == var655) {
                            final SubLObject var657 = module0052.f3695(var654, var656);
                            final SubLObject var658 = (SubLObject)SubLObjectFactory.makeBoolean(!var656.eql(var657));
                            if (module0731.NIL != var658) {
                                SubLObject var659 = (SubLObject)module0731.NIL;
                                try {
                                    var659 = module0158.f10316(var657, (SubLObject)module0731.$ic44$, (SubLObject)module0731.$ic58$, (SubLObject)module0731.NIL);
                                    SubLObject var60_661 = (SubLObject)module0731.NIL;
                                    final SubLObject var61_662 = (SubLObject)module0731.NIL;
                                    while (module0731.NIL == var60_661) {
                                        final SubLObject var660 = module0052.f3695(var659, var61_662);
                                        final SubLObject var63_663 = (SubLObject)SubLObjectFactory.makeBoolean(!var61_662.eql(var660));
                                        if (module0731.NIL != var63_663) {
                                            var646.resetMultipleValues();
                                            final SubLObject var661 = module0732.f45023(module0178.f11285(var660), (SubLObject)module0731.UNPROVIDED);
                                            final SubLObject var662 = var646.secondMultipleValue();
                                            final SubLObject var663 = var646.thirdMultipleValue();
                                            final SubLObject var664 = var646.fourthMultipleValue();
                                            final SubLObject var665 = var646.fifthMultipleValue();
                                            var646.resetMultipleValues();
                                            if (var664.eql(var19) && var665.equal(var27) && var662.eql(var201)) {
                                                var647 = (SubLObject)ConsesLow.cons(module0178.f11337(var660), var647);
                                            }
                                        }
                                        var60_661 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var63_663);
                                    }
                                }
                                finally {
                                    final SubLObject var7_668 = Threads.$is_thread_performing_cleanupP$.currentBinding(var646);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0731.T, var646);
                                        if (module0731.NIL != var659) {
                                            module0158.f10319(var659);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_668, var646);
                                    }
                                }
                            }
                            var655 = (SubLObject)SubLObjectFactory.makeBoolean(module0731.NIL == var658);
                        }
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var651, var646);
            module0147.$g2094$.rebind(var650, var646);
            module0147.$g2095$.rebind(var649, var646);
        }
        if (module0731.NIL != module0035.f2013(var647) && module0731.NIL != module0173.f10955(var27) && module0731.NIL != module0269.f17804(var27)) {
            var647 = (SubLObject)module0731.$ic295$;
        }
        return var647;
    }
    
    public static SubLObject f44900(final SubLObject var644, final SubLObject var201, final SubLObject var645, final SubLObject var19, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        if (module0731.NIL != var644 && module0731.NIL != var645) {
            return module0434.f30579((SubLObject)module0731.$ic296$, (SubLObject)ConsesLow.listS(module0731.$ic291$, var644, var201, var645, var19, (SubLObject)module0731.$ic297$), var22, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        if (module0731.NIL != var644) {
            return module0434.f30579((SubLObject)module0731.$ic296$, (SubLObject)ConsesLow.listS(module0731.$ic292$, var644, var201, var19, (SubLObject)module0731.$ic297$), var22, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        if (module0731.NIL != var645) {
            return module0434.f30579((SubLObject)module0731.$ic296$, (SubLObject)ConsesLow.listS(module0731.$ic293$, var201, var645, var19, (SubLObject)module0731.$ic297$), var22, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
        }
        return module0434.f30579((SubLObject)module0731.$ic296$, (SubLObject)ConsesLow.listS(module0731.$ic294$, var201, var19, (SubLObject)module0731.$ic297$), var22, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED);
    }
    
    public static SubLObject f44902(final SubLObject var27, final SubLObject var679, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLObject var680 = module0226.f14917(var27, var679, var22).first();
        return (module0731.NIL != var680) ? var680 : module0731.$ic298$;
    }
    
    public static SubLObject f44903(final SubLObject var27, final SubLObject var679, SubLObject var22) {
        if (var22 == module0731.UNPROVIDED) {
            var22 = module0584.$g4396$.getDynamicValue();
        }
        final SubLObject var680 = module0226.f14917(var27, var679, var22).first();
        return (module0731.NIL != var680) ? var680 : module0731.$ic298$;
    }
    
    public static SubLObject f44905(final SubLObject var681, final SubLObject var682) {
        SubLObject var683 = var682;
        SubLObject var684 = (SubLObject)module0731.NIL;
        var684 = var683.first();
        while (module0731.NIL != var683) {
            if (module0731.NIL == module0004.f104(module0172.f10922(var684), module0172.f10922(var681), (SubLObject)module0731.EQUAL, (SubLObject)module0731.UNPROVIDED)) {
                Errors.warn((SubLObject)module0731.$ic307$, var684);
                return (SubLObject)module0731.NIL;
            }
            var683 = var683.rest();
            var684 = var683.first();
        }
        return (SubLObject)module0731.T;
    }
    
    public static SubLObject f44906(final SubLObject var170, SubLObject var396, SubLObject var397, SubLObject var176) {
        if (var396 == module0731.UNPROVIDED) {
            var396 = (SubLObject)module0731.NIL;
        }
        if (var397 == module0731.UNPROVIDED) {
            var397 = (SubLObject)module0731.$ic203$;
        }
        if (var176 == module0731.UNPROVIDED) {
            var176 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var398 = SubLProcess.currentSubLThread();
        var398.resetMultipleValues();
        SubLObject var399 = f44797(var170, var396, var397, var176);
        final SubLObject var400 = var398.secondMultipleValue();
        var398.resetMultipleValues();
        var399 = module0036.f2531(var399, (SubLObject)module0731.$ic308$, (SubLObject)module0731.$ic309$, (SubLObject)module0731.UNPROVIDED);
        return Values.values(var399, var400);
    }
    
    public static SubLObject f44907() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44644", "S#48750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44646", "S#48896", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44647", "S#48897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44648", "S#48898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44645", "S#48899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44649", "S#48900", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44655", "S#48901", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44657", "S#48746", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44650", "S#48902", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44667", "S#48903", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44660", "S#48904", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44669", "S#48905", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44670", "S#48906", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44668", "S#48907", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44658", "S#48908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44661", "S#48909", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44672", "S#48910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44673", "S#48911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44659", "S#48912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44662", "S#48913", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44675", "S#48914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44676", "S#48915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44677", "S#48916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44674", "S#48917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44679", "S#48918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44678", "S#48919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44671", "S#48920", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44663", "S#48921", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44681", "S#48922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44682", "S#48923", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44680", "S#48924", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44683", "S#48748", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44664", "S#48925", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44685", "S#48926", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44686", "S#48927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44684", "S#48928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44687", "S#48929", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44688", "S#48930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44689", "S#48931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44691", "S#48575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44692", "S#48597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44693", "S#48595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44694", "S#39566", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44665", "S#48932", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44651", "S#48933", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44695", "S#39567", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44696", "S#48934", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0731", "f44697", "S#48935");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44698", "S#48936", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44666", "S#48937", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44654", "S#48938", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44699", "S#48939", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44690", "S#39429", 1, 1, false);
        new $f44690$UnaryFunction();
        new $f44690$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44700", "S#39430", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44701", "SPEC-POS-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44703", "S#48940", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44704", "S#48941", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44705", "S#48942", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44702", "S#48593", 2, 1, false);
        new $f44702$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44706", "S#48943", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44707", "S#48944", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44708", "S#48945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44709", "S#48946", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44710", "S#48947", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44711", "GET-STRINGS-OF-TYPE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44714", "S#48948", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44715", "S#48949", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44716", "S#48950", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44717", "S#48951", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44718", "S#48952", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44723", "STRING-IS-POS-ON-WU?", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44722", "S#48953", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44724", "S#48954", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44726", "S#48955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44728", "S#48956", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44730", "WORDS-OF-STRING&PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44732", "S#48957", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44733", "S#48958", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44734", "S#48959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44736", "POS-FOR-KEYWORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44737", "WORDS-OF-STRING&POS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44727", "WORDS-OF-STRING&SPEECH-PART", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44725", "PREDS-OF-STRING&WORD", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44739", "S#48960", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44740", "S#48961", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44741", "S#48962", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44742", "S#48963", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44738", "S#48964", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44743", "S#48747", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44744", "S#48965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44745", "POS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44746", "S#48601", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44747", "S#48966", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44748", "S#48967", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44652", "S#48968", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44749", "S#48969", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44750", "S#3944", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44751", "S#48970", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44752", "S#3943", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44753", "S#48971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44754", "S#48972", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44755", "S#48973", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44756", "S#48974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44757", "S#48975", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44712", "S#48976", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44759", "S#48977", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44760", "S#48978", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44761", "S#48979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44758", "S#48980", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44762", "S#48981", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44763", "S#48735", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44764", "S#48609", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44765", "S#48982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44766", "S#48983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44767", "S#48984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44719", "S#48745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44768", "S#48985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44769", "S#48986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44770", "S#48987", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44771", "S#48988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44729", "POS-OF-STRING&WORD", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44772", "S#48989", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44774", "S#48990", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44773", "S#48755", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44778", "S#48991", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44720", "WORD-HAS-POS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44776", "S#48992", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44779", "S#48993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44780", "S#48994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44781", "S#48995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44782", "TYPED-DENOTS-OF-STRING", 2, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44784", "S#48996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44786", "S#48997", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44785", "S#48409", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44787", "S#48998", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44788", "S#48999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44789", "S#49000", 3, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44790", "TYPED-DENOTS-OF-STRING-AT-PLACE", 3, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44791", "S#49001", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44792", "S#49002", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44793", "S#49003", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44794", "S#49004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44795", "S#49005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44796", "DENOTS-OF-PARTIAL-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44797", "DENOTATION-MAPPER", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44798", "ALL-DENOTS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44799", "S#44186", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44800", "S#35481", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44783", "DENOTS-OF-STRING", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44801", "S#49006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44802", "DENOTS-MT-FOR-LANGUAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44804", "S#49007", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44803", "S#49008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44805", "DENOTS-OF-STRING&PRED", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44807", "S#49009", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44806", "S#49010", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44809", "S#48754", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44810", "DENOTS-OF-STRING&POS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44808", "DENOTS-OF-NAME-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44811", "S#49011", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44812", "S#49012", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44731", "S#48743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44721", "S#49013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44813", "S#48599", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44814", "S#49014", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44815", "S#49015", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44816", "DENOTS-OF-ABBREVIATION-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44817", "S#49016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44818", "DETERMINE-DENOTATION-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44819", "S#49017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44820", "S#49018", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44821", "S#49019", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44822", "S#49020", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44823", "S#49021", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44824", "S#49022", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44825", "RELATED-DENOTS-OF-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44826", "PLACEHOLDER-DENOTS-OF-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44827", "S#49023", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44828", "S#49024", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44830", "S#49025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44831", "S#49026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44832", "S#49027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44833", "S#49028", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44834", "S#49029", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44835", "S#49030", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44836", "S#49031", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44837", "S#49032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44838", "S#49033", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44839", "S#49034", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44840", "S#48558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44841", "S#49035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44842", "S#49036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44843", "S#49037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44844", "S#49038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44845", "S#49039", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44846", "S#49040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44847", "S#49041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44848", "S#49042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44849", "S#38929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44850", "S#49043", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44853", "S#49044", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44854", "S#49045", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44855", "S#49046", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44857", "S#49047", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44856", "S#49048", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44858", "S#49049", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44859", "S#49050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44860", "S#49051", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44861", "S#49052", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44862", "S#49053", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44863", "S#49054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44864", "S#45280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44851", "S#49055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44852", "S#49056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44775", "S#49057", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44865", "S#49058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44866", "S#49059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44868", "S#49060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44867", "S#49061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44869", "DENOT-WS-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44829", "S#49062", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44871", "S#48895", 0, 0, false);
        new $f44871$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44872", "S#49063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44873", "S#49064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44870", "S#49065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44874", "S#49066", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44875", "S#49067", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44876", "S#49068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44877", "S#49069", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44878", "S#49070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44879", "S#49071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44880", "S#49072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44881", "S#49073", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44882", "S#49074", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44653", "S#49075", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44656", "S#49076", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44883", "S#49077", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44735", "S#49078", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44777", "S#40636", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44884", "S#49079", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44885", "S#49080", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44713", "S#48751", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44886", "S#49081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44887", "S#49082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44888", "S#49083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44890", "S#49084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44892", "S#49085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44891", "S#49086", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44894", "S#49087", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44895", "S#49088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44896", "S#49089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44893", "S#49090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44897", "S#49091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44898", "S#49092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44889", "S#49093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44899", "S#49094", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44904", "S#49095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44901", "RELATIONAL-NOUN-POSSESSED-ARGNUMS", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44900", "S#49096", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44902", "S#49097", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44903", "S#49098", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44905", "S#49099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0731", "f44906", "S#49100", 1, 3, false);
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44908() {
        module0731.$g5757$ = SubLFiles.deflexical("S#49101", (SubLObject)module0731.NIL);
        module0731.$g5758$ = SubLFiles.deflexical("S#49102", (SubLObject)module0731.NIL);
        module0731.$g5759$ = SubLFiles.deflexical("S#49103", (SubLObject)module0731.NIL);
        module0731.$g5760$ = SubLFiles.deflexical("S#49104", (SubLObject)module0731.NIL);
        module0731.$g5761$ = SubLFiles.deflexical("S#49105", (SubLObject)module0731.NIL);
        module0731.$g5762$ = SubLFiles.deflexical("S#49106", (SubLObject)module0731.NIL);
        module0731.$g5763$ = SubLFiles.deflexical("S#49107", (SubLObject)module0731.NIL);
        module0731.$g5764$ = SubLFiles.deflexical("S#49108", (module0731.NIL != Symbols.boundp((SubLObject)module0731.$ic41$)) ? module0731.$g5764$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0731.$ic42$, (SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
        module0731.$g5765$ = SubLFiles.deflexical("S#49109", (module0731.NIL != Symbols.boundp((SubLObject)module0731.$ic63$)) ? module0731.$g5765$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0731.EQ), (SubLObject)module0731.$ic42$));
        module0731.$g5766$ = SubLFiles.deflexical("S#49110", (SubLObject)module0731.NIL);
        module0731.$g5767$ = SubLFiles.deflexical("S#49111", (SubLObject)module0731.NIL);
        module0731.$g5768$ = SubLFiles.deflexical("S#49112", (SubLObject)module0731.NIL);
        module0731.$g5769$ = SubLFiles.deflexical("S#49113", (SubLObject)module0731.NIL);
        module0731.$g5770$ = SubLFiles.deflexical("S#49114", (SubLObject)module0731.NIL);
        module0731.$g5771$ = SubLFiles.deflexical("S#49115", (module0731.NIL != Symbols.boundp((SubLObject)module0731.$ic153$)) ? module0731.$g5771$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0731.$ic27$, Symbols.symbol_function((SubLObject)module0731.EQUAL), (SubLObject)module0731.UNPROVIDED));
        module0731.$g5772$ = SubLFiles.deflexical("S#49116", (module0731.NIL != Symbols.boundp((SubLObject)module0731.$ic154$)) ? module0731.$g5772$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0731.$ic27$, Symbols.symbol_function((SubLObject)module0731.EQUALP), (SubLObject)module0731.UNPROVIDED));
        module0731.$g5773$ = SubLFiles.deflexical("S#49117", (SubLObject)module0731.NIL);
        module0731.$g5774$ = SubLFiles.deflexical("S#49118", (SubLObject)module0731.NIL);
        module0731.$g5775$ = SubLFiles.defparameter("S#49119", Hashtables.make_hash_table((SubLObject)module0731.$ic135$, Symbols.symbol_function((SubLObject)module0731.EQUALP), (SubLObject)module0731.UNPROVIDED));
        module0731.$g5776$ = SubLFiles.deflexical("S#49120", (SubLObject)module0731.$ic161$);
        module0731.$g5777$ = SubLFiles.deflexical("S#49121", (module0731.NIL != Symbols.boundp((SubLObject)module0731.$ic167$)) ? module0731.$g5777$.getGlobalValue() : module0077.f5313((SubLObject)module0731.UNPROVIDED, (SubLObject)module0731.UNPROVIDED));
        module0731.$g5778$ = SubLFiles.deflexical("S#49122", (SubLObject)module0731.NIL);
        module0731.$g5779$ = SubLFiles.deflexical("S#49123", (SubLObject)module0731.NIL);
        module0731.$g5780$ = SubLFiles.deflexical("S#49124", (SubLObject)module0731.NIL);
        module0731.$g5781$ = SubLFiles.deflexical("S#49125", (SubLObject)module0731.NIL);
        module0731.$g5782$ = SubLFiles.deflexical("S#49126", (SubLObject)module0731.NIL);
        module0731.$g5783$ = SubLFiles.deflexical("S#49127", (module0731.NIL != Symbols.boundp((SubLObject)module0731.$ic275$)) ? module0731.$g5783$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0731.EQ), (SubLObject)module0731.$ic42$));
        module0731.$g5784$ = SubLFiles.deflexical("S#49128", (SubLObject)module0731.NIL);
        module0731.$g5785$ = SubLFiles.deflexical("S#49129", module0731.$ic278$);
        module0731.$g5786$ = SubLFiles.deflexical("S#49130", (SubLObject)module0731.NIL);
        module0731.$g5787$ = SubLFiles.deflexical("S#49131", (SubLObject)module0731.$ic290$);
        return (SubLObject)module0731.NIL;
    }
    
    public static SubLObject f44909() {
        module0034.f1909((SubLObject)module0731.$ic2$);
        module0034.f1909((SubLObject)module0731.$ic11$);
        module0034.f1909((SubLObject)module0731.$ic14$);
        module0034.f1909((SubLObject)module0731.$ic17$);
        module0034.f1895((SubLObject)module0731.$ic24$);
        module0034.f1909((SubLObject)module0731.$ic25$);
        module0034.f1909((SubLObject)module0731.$ic29$);
        module0034.f1909((SubLObject)module0731.$ic32$);
        module0003.f57((SubLObject)module0731.$ic41$);
        module0003.f57((SubLObject)module0731.$ic63$);
        module0034.f1909((SubLObject)module0731.$ic79$);
        module0034.f1909((SubLObject)module0731.$ic82$);
        module0034.f1909((SubLObject)module0731.$ic92$);
        module0034.f1895((SubLObject)module0731.$ic94$);
        module0034.f1909((SubLObject)module0731.$ic103$);
        module0034.f1909((SubLObject)module0731.$ic138$);
        module0003.f57((SubLObject)module0731.$ic153$);
        module0003.f57((SubLObject)module0731.$ic154$);
        module0034.f1909((SubLObject)module0731.$ic157$);
        module0034.f1909((SubLObject)module0731.$ic159$);
        module0034.f1895((SubLObject)module0731.$ic96$);
        module0034.f1895((SubLObject)module0731.$ic165$);
        module0003.f57((SubLObject)module0731.$ic167$);
        module0034.f1909((SubLObject)module0731.$ic171$);
        module0012.f368((SubLObject)module0731.$ic179$, (SubLObject)module0731.$ic180$, (SubLObject)module0731.$ic181$, (SubLObject)module0731.$ic182$, (SubLObject)module0731.$ic183$);
        module0034.f1895((SubLObject)module0731.$ic184$);
        module0034.f1895((SubLObject)module0731.$ic185$);
        module0012.f368((SubLObject)module0731.$ic205$, (SubLObject)module0731.$ic206$, (SubLObject)module0731.$ic207$, (SubLObject)module0731.$ic208$, (SubLObject)module0731.$ic209$);
        module0012.f368((SubLObject)module0731.$ic215$, (SubLObject)module0731.$ic216$, (SubLObject)module0731.$ic217$, (SubLObject)module0731.$ic218$, (SubLObject)module0731.NIL);
        module0002.f38((SubLObject)module0731.$ic219$);
        module0034.f1909((SubLObject)module0731.$ic251$);
        module0034.f1909((SubLObject)module0731.$ic262$);
        module0034.f1909((SubLObject)module0731.$ic266$);
        module0034.f1909((SubLObject)module0731.$ic270$);
        module0003.f57((SubLObject)module0731.$ic275$);
        module0034.f1909((SubLObject)module0731.$ic276$);
        module0034.f1909((SubLObject)module0731.$ic281$);
        module0027.f1449((SubLObject)module0731.$ic215$, (SubLObject)ConsesLow.list(new SubLObject[] { module0731.$ic299$, module0731.$ic300$, module0731.$ic301$, module0731.NIL, module0731.$ic302$, module0731.NIL, module0731.$ic303$, module0731.$ic304$, module0731.$ic305$, module0731.T }), (SubLObject)module0731.$ic306$);
        return (SubLObject)module0731.NIL;
    }
    
    public void declareFunctions() {
        f44907();
    }
    
    public void initializeVariables() {
        f44908();
    }
    
    public void runTopLevelForms() {
        f44909();
    }
    
    static {
        me = (SubLFile)new module0731();
        module0731.$g5757$ = null;
        module0731.$g5758$ = null;
        module0731.$g5759$ = null;
        module0731.$g5760$ = null;
        module0731.$g5761$ = null;
        module0731.$g5762$ = null;
        module0731.$g5763$ = null;
        module0731.$g5764$ = null;
        module0731.$g5765$ = null;
        module0731.$g5766$ = null;
        module0731.$g5767$ = null;
        module0731.$g5768$ = null;
        module0731.$g5769$ = null;
        module0731.$g5770$ = null;
        module0731.$g5771$ = null;
        module0731.$g5772$ = null;
        module0731.$g5773$ = null;
        module0731.$g5774$ = null;
        module0731.$g5775$ = null;
        module0731.$g5776$ = null;
        module0731.$g5777$ = null;
        module0731.$g5778$ = null;
        module0731.$g5779$ = null;
        module0731.$g5780$ = null;
        module0731.$g5781$ = null;
        module0731.$g5782$ = null;
        module0731.$g5783$ = null;
        module0731.$g5784$ = null;
        module0731.$g5785$ = null;
        module0731.$g5786$ = null;
        module0731.$g5787$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#48899", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#49101", "CYC");
        $ic4$ = SubLObjectFactory.makeInteger(4096);
        $ic5$ = SubLObjectFactory.makeSymbol("S#48896", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic7$ = SubLObjectFactory.makeKeyword("INITIALIZED");
        $ic8$ = SubLObjectFactory.makeSymbol("S#49076", "CYC");
        $ic9$ = SubLObjectFactory.makeKeyword("ALL");
        $ic10$ = SubLObjectFactory.makeKeyword("CLEARED");
        $ic11$ = SubLObjectFactory.makeSymbol("S#48907", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#49102", "CYC");
        $ic13$ = SubLObjectFactory.makeInteger(32);
        $ic14$ = SubLObjectFactory.makeSymbol("S#48912", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#49103", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#48909", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#48916", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#49104", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#48913", "CYC");
        $ic20$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic21$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic23$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#49132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39540", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#48919", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#48924", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#49105", "CYC");
        $ic27$ = SubLObjectFactory.makeInteger(512);
        $ic28$ = SubLObjectFactory.makeSymbol("S#48921", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#48928", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#49106", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#48925", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#48575", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#39429", "CYC");
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("speechPartPreds"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#49082", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#49107", "CYC");
        $ic37$ = SubLObjectFactory.makeInteger(128);
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Noun"));
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#49108", "CYC");
        $ic42$ = SubLObjectFactory.makeInteger(256);
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $ic44$ = SubLObjectFactory.makeKeyword("GAF");
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $ic46$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic47$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic48$ = SubLObjectFactory.makeKeyword("STACK");
        $ic49$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic51$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic52$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic54$ = SubLObjectFactory.makeString("continue anyway");
        $ic55$ = SubLObjectFactory.makeKeyword("WARN");
        $ic56$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic58$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic59$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic60$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic61$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic62$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $ic63$ = SubLObjectFactory.makeSymbol("S#49109", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)module0731.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic66$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic67$ = SubLObjectFactory.makeKeyword("MT");
        $ic68$ = SubLObjectFactory.makeKeyword("DONE");
        $ic69$ = SubLObjectFactory.makeUninternedSymbol("US#46D73F5");
        $ic70$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48939", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic73$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic74$ = SubLObjectFactory.makeSymbol("COR");
        $ic75$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC")));
        $ic76$ = SubLObjectFactory.makeSymbol("S#48750", "CYC");
        $ic77$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpeechPartPredicate"));
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#48593", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#49110", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#48940", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#48946", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#12280", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#49111", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#48943", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic89$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic90$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ClosedClassWord"));
        $ic91$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $ic92$ = SubLObjectFactory.makeSymbol("S#48951", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#49112", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("STRING-IS-POS-ON-WU?");
        $ic95$ = SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE");
        $ic96$ = SubLObjectFactory.makeSymbol("S#48745", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#39431", "CYC");
        $ic98$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic99$ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $ic100$ = SubLObjectFactory.makeKeyword("AS-FALLBACK");
        $ic101$ = SubLObjectFactory.makeSymbol("SPEC?");
        $ic102$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $ic103$ = SubLObjectFactory.makeSymbol("POS-FOR-KEYWORD");
        $ic104$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic105$ = SubLObjectFactory.makeKeyword("ALL-NOUN-FORMS");
        $ic106$ = SubLObjectFactory.makeKeyword("NOUN");
        $ic107$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("AgentiveNoun")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("MassNoun")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("GerundiveNoun")));
        $ic108$ = SubLObjectFactory.makeKeyword("MASS-NOUN");
        $ic109$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MassNoun")));
        $ic110$ = SubLObjectFactory.makeKeyword("SIMPLE-NOUN");
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $ic112$ = SubLObjectFactory.makeKeyword("DEVERBAL-NOUN");
        $ic113$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DeVerbalNoun"));
        $ic114$ = SubLObjectFactory.makeKeyword("AGENTIVE-NOUN");
        $ic115$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AgentiveNoun"));
        $ic116$ = SubLObjectFactory.makeKeyword("GERUNDIVE-NOUN");
        $ic117$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GerundiveNoun"));
        $ic118$ = SubLObjectFactory.makeKeyword("PROPER-NOUN");
        $ic119$ = SubLObjectFactory.makeKeyword("VERB");
        $ic120$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Verb")));
        $ic121$ = SubLObjectFactory.makeKeyword("AUX");
        $ic122$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AuxVerb"));
        $ic123$ = SubLObjectFactory.makeKeyword("ADJECTIVE");
        $ic124$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $ic125$ = SubLObjectFactory.makeKeyword("ADVERB");
        $ic126$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $ic127$ = SubLObjectFactory.makeKeyword("PREP");
        $ic128$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $ic129$ = SubLObjectFactory.makeKeyword("DET");
        $ic130$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic131$ = SubLObjectFactory.makeKeyword("CONJ");
        $ic132$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Conjunction"));
        $ic133$ = SubLObjectFactory.makeKeyword("ANY");
        $ic134$ = SubLObjectFactory.makeSymbol("S#49113", "CYC");
        $ic135$ = SubLObjectFactory.makeInteger(64);
        $ic136$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord")));
        $ic137$ = SubLObjectFactory.makeSymbol("S#49133", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#48964", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#49114", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("?STRING");
        $ic141$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic142$ = SubLObjectFactory.makeSymbol("?POS");
        $ic143$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic144$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $ic145$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FrameForAdverbs"));
        $ic146$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"));
        $ic147$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DefiniteDeterminerFrame")));
        $ic148$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperMassNoun"));
        $ic149$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FrameForNouns"));
        $ic150$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MassNoun"));
        $ic151$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ZeroArticleFrame"));
        $ic152$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FrameForAdjectives"));
        $ic153$ = SubLObjectFactory.makeSymbol("S#49115", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("S#49116", "CYC");
        $ic155$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $ic156$ = SubLObjectFactory.makeSymbol("S#3960", "CYC");
        $ic157$ = SubLObjectFactory.makeSymbol("S#48975", "CYC");
        $ic158$ = SubLObjectFactory.makeSymbol("S#49117", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#48980", "CYC");
        $ic160$ = SubLObjectFactory.makeSymbol("S#49118", "CYC");
        $ic161$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("posForms")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("posBaseForms")));
        $ic162$ = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("WordWithPrefixFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("WordWithSuffixFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CompoundWordFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("WordFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CompoundWordFn-HeadMedial")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CompoundWordFn-HeadInitial"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic163$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LexicalWord"));
        $ic164$ = SubLObjectFactory.makeInteger(1000);
        $ic165$ = SubLObjectFactory.makeSymbol("S#48986", "CYC");
        $ic166$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DerivedWord"));
        $ic167$ = SubLObjectFactory.makeSymbol("S#49121", "CYC");
        $ic168$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InherentlyVulgarWord"));
        $ic169$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic170$ = SubLObjectFactory.makeString("The word-unit ~S is neither a FORT nor a NAUT.");
        $ic171$ = SubLObjectFactory.makeSymbol("S#48995", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("S#49122", "CYC");
        $ic173$ = SubLObjectFactory.makeKeyword("DENOT");
        $ic174$ = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $ic175$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic176$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic177$ = SubLObjectFactory.makeSymbol("S#13265", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#6920", "CYC");
        $ic179$ = SubLObjectFactory.makeSymbol("TYPED-DENOTS-OF-STRING");
        $ic180$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49134", "CYC"), (SubLObject)module0731.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49135", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48843", "CYC"), (SubLObject)module0731.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49136", "CYC"), (SubLObject)module0731.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49137", "CYC"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48845", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39486", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39502", "CYC")) });
        $ic181$ = SubLObjectFactory.makeString("@param STRING string\n   @param TYPE collection\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return list; a list of denotata for STRING that are instances of TYPE\n   note that this function does some parsing, if the type sent in is appropriate");
        $ic182$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49135", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48843", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49136", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48845", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39431", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6920", "CYC")) });
        $ic183$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic184$ = SubLObjectFactory.makeSymbol("S#48409", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#48999", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#22916", "CYC");
        $ic187$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("City"));
        $ic188$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeopoliticalEntity"));
        $ic189$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CityNamedFn"));
        $ic190$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $ic191$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $ic192$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("inRegion"));
        $ic193$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeographicalRegion"));
        $ic194$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision"));
        $ic195$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions"));
        $ic196$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("territoryOf"));
        $ic197$ = SubLObjectFactory.makeString("*");
        $ic198$ = ConsesLow.list((SubLObject)Characters.CHAR_asterisk);
        $ic199$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("*"));
        $ic200$ = SubLObjectFactory.makeKeyword("INFIX");
        $ic201$ = SubLObjectFactory.makeString("");
        $ic202$ = SubLObjectFactory.makeString("I should never be called...");
        $ic203$ = SubLObjectFactory.makeKeyword("GREEDY");
        $ic204$ = SubLObjectFactory.makeSymbol("S#20281", "CYC");
        $ic205$ = SubLObjectFactory.makeSymbol("DENOTATION-MAPPER");
        $ic206$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#49139", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("GREEDY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48845", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39486", "CYC")));
        $ic207$ = SubLObjectFactory.makeString("@param STRING string; the string to map to its denotations\n   @param EXCLUDED-PREDS list; a list of semantic predicates which should be ignored when computing mappings \n   @param MODE keyword; :greedy or :diligent\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return 0 LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring \n                    of STRING and as its STRING-TOKEN-VALUE a denotatum for that string\n   @return 1 LISTP; a list of STRING-TOKENS for which no denotatum could be found");
        $ic208$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49139", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20281", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48845", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39431", "CYC")));
        $ic209$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#49140", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#49140", "CYC")));
        $ic210$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $ic211$ = SubLObjectFactory.makeKeyword("RELATED");
        $ic212$ = SubLObjectFactory.makeSymbol("S#3935", "CYC");
        $ic213$ = SubLObjectFactory.makeSymbol("S#49006", "CYC");
        $ic214$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")));
        $ic215$ = SubLObjectFactory.makeSymbol("DENOTS-OF-STRING");
        $ic216$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49134", "CYC"), (SubLObject)module0731.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49135", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48843", "CYC"), (SubLObject)module0731.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49136", "CYC"), (SubLObject)module0731.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48845", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39486", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49141", "CYC"), (SubLObject)module0731.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49142", "CYC"), (SubLObject)module0731.NIL) });
        $ic217$ = SubLObjectFactory.makeString("@param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @param abbrev-types; listp: if it includes :abbrevs, include abbreviations;\n                               if it includes :acronyms, include acronyms\n   @param denot-type; keywordp: \n      :denot =  #$denotation assertions  (parsing)\n      :related = #$denotation and #$denotationRelatedTo (generation)\n      :any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\n   @param LOOKUP-MT: Lexical microtheory or ISO language code such as 'en'.\n   @param PARSE-DATES-AND-NUMBERS? booleanp; if set to NIL, DENOTS-OF-STRING will only perform lexical lookup, and \n      not try to parse any dates or numbers\n   @param LEXICON term-lexicon-p; if present, LOOKUP-MT will be ignored and LEXICON will be used instead.\n   @return 0. LISTP ; CycL denotational terms serving as denotations for the phrase\n   @return 1. LISTP ; list of predicate lists for each denotation");
        $ic218$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#3935", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49135", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48843", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49136", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#49006", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48845", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39431", "CYC")));
        $ic219$ = SubLObjectFactory.makeSymbol("DENOTS-MT-FOR-LANGUAGE");
        $ic220$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("validatedLexicalPSCForLanguage"));
        $ic221$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $ic222$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $ic223$ = SubLObjectFactory.makeString("~S passes neither SPEECH-PART-PRED? nor NAME-STRING-PRED?");
        $ic224$ = SubLObjectFactory.makeSymbol("S#39454", "CYC");
        $ic225$ = SubLObjectFactory.makeKeyword("ONLY");
        $ic226$ = SubLObjectFactory.makeKeyword("ALWAYS");
        $ic227$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Strict"));
        $ic228$ = SubLObjectFactory.makeKeyword("JUST-RELATED");
        $ic229$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")));
        $ic230$ = SubLObjectFactory.makeKeyword("JUST-PLACEHOLDER");
        $ic231$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")));
        $ic232$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation")));
        $ic233$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation")));
        $ic234$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation")));
        $ic235$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation"));
        $ic236$ = SubLObjectFactory.makeKeyword("PLACEHOLDER");
        $ic237$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder"));
        $ic238$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo"));
        $ic239$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subcatFrame"));
        $ic240$ = SubLObjectFactory.makeSymbol("<");
        $ic241$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic242$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("subcatFrameArity"));
        $ic243$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("politenessOfWS"));
        $ic244$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formalityOfWS"));
        $ic245$ = SubLObjectFactory.makeSymbol("?LEVEL");
        $ic246$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LEVEL"));
        $ic247$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("RudeSpeech")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("VulgarSpeech")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ObjectionableSpeech")));
        $ic248$ = SubLObjectFactory.makeSymbol("S#48558", "CYC");
        $ic249$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SlangSpeech"));
        $ic250$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArchaicSpeech"));
        $ic251$ = SubLObjectFactory.makeSymbol("S#49042", "CYC");
        $ic252$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DenotationPredicate-ExcludedFromNPParser"));
        $ic253$ = SubLObjectFactory.makeSymbol("S#49123", "CYC");
        $ic254$ = SubLObjectFactory.makeSymbol("S#49039", "CYC");
        $ic255$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic256$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic257$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic258$ = SubLObjectFactory.makeSymbol("CAR");
        $ic259$ = SubLObjectFactory.makeSymbol("CDR");
        $ic260$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TransitivePPFrameType"));
        $ic261$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DitransitivePPFrameType"));
        $ic262$ = SubLObjectFactory.makeSymbol("S#49060", "CYC");
        $ic263$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")));
        $ic264$ = SubLObjectFactory.makeSymbol("S#49124", "CYC");
        $ic265$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("determinerAgreement"));
        $ic266$ = SubLObjectFactory.makeSymbol("S#49065", "CYC");
        $ic267$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("semTransPredForPOS"));
        $ic268$ = SubLObjectFactory.makeSymbol("S#49125", "CYC");
        $ic269$ = SubLObjectFactory.makeSymbol("S#48895", "CYC");
        $ic270$ = SubLObjectFactory.makeSymbol("S#49069", "CYC");
        $ic271$ = SubLObjectFactory.makeSymbol("S#49126", "CYC");
        $ic272$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("commonNickname"));
        $ic273$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameSpelling"));
        $ic274$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpeechPart"));
        $ic275$ = SubLObjectFactory.makeSymbol("S#49127", "CYC");
        $ic276$ = SubLObjectFactory.makeSymbol("S#48751", "CYC");
        $ic277$ = SubLObjectFactory.makeSymbol("S#49128", "CYC");
        $ic278$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLWordForm"));
        $ic279$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Adjective")));
        $ic280$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1"));
        $ic281$ = SubLObjectFactory.makeSymbol("S#49090", "CYC");
        $ic282$ = SubLObjectFactory.makeSymbol("S#49130", "CYC");
        $ic283$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Noun"))), module0128.f8479((SubLObject)SubLObjectFactory.makeString("NounPhrase")));
        $ic284$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Preposition"))), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase")));
        $ic285$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic286$ = SubLObjectFactory.makeKeyword("POSSESSED-TYPE");
        $ic287$ = SubLObjectFactory.makeKeyword("DENOTED-PRED");
        $ic288$ = SubLObjectFactory.makeKeyword("POSSESSOR");
        $ic289$ = SubLObjectFactory.makeKeyword("POSSESSOR-TYPE");
        $ic290$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0731.T, (SubLObject)ConsesLow.list((SubLObject)module0731.ONE_INTEGER, module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR-TYPE")), (SubLObject)ConsesLow.list((SubLObject)module0731.TWO_INTEGER, module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR-TYPE"))), (SubLObject)ConsesLow.list((SubLObject)module0731.NIL, (SubLObject)ConsesLow.list((SubLObject)module0731.ONE_INTEGER, module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR")), (SubLObject)ConsesLow.list((SubLObject)module0731.TWO_INTEGER, module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"))));
        $ic291$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("headMedialStringDenotesArgInReln"));
        $ic292$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("multiWordStringDenotesArgInReln"));
        $ic293$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("compoundStringDenotesArgInReln"));
        $ic294$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotesArgInReln"));
        $ic295$ = ConsesLow.list((SubLObject)module0731.ONE_INTEGER);
        $ic296$ = SubLObjectFactory.makeSymbol("?PRED");
        $ic297$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?ARGNUM"));
        $ic298$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic299$ = SubLObjectFactory.makeKeyword("TEST");
        $ic300$ = SubLObjectFactory.makeSymbol("SETS-EQUAL-EQUAL?");
        $ic301$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic302$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic303$ = SubLObjectFactory.makeKeyword("KB");
        $ic304$ = SubLObjectFactory.makeKeyword("FULL");
        $ic305$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic306$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ABEDA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49134", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArabBankForEconomicDevelopmentInAfrica"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("acronymString"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("platform")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Platform-Military")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ComputerProcessor")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PoliticalBeliefSystem")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Platform"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chemical engineering")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ChemicalEngineering"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("massNumber"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("heart attack")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u99ac;")), (SubLObject)module0731.NIL, (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)module0731.NIL, (SubLObject)module0731.NIL, module0128.f8479((SubLObject)SubLObjectFactory.makeString("ChineseLexicalMt"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Horse")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("YoYoMa-Cellist"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("familyName"))))));
        $ic307$ = SubLObjectFactory.makeString("missing: ~S");
        $ic308$ = SubLObjectFactory.makeSymbol("S#16026", "CYC");
        $ic309$ = SubLObjectFactory.makeSymbol("S#16027", "CYC");
    }
    
    public static final class $f44690$UnaryFunction extends UnaryFunction
    {
        public $f44690$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39429"));
        }
        
        public SubLObject processItem(final SubLObject var161) {
            return module0731.f44690(var161, (SubLObject)$f44690$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f44690$BinaryFunction extends BinaryFunction
    {
        public $f44690$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39429"));
        }
        
        public SubLObject processItem(final SubLObject var161, final SubLObject var162) {
            return module0731.f44690(var161, var162);
        }
    }
    
    public static final class $f44702$BinaryFunction extends BinaryFunction
    {
        public $f44702$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48593"));
        }
        
        public SubLObject processItem(final SubLObject var161, final SubLObject var162) {
            return module0731.f44702(var161, var162, (SubLObject)$f44702$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f44871$ZeroArityFunction extends ZeroArityFunction
    {
        public $f44871$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48895"));
        }
        
        public SubLObject processItem() {
            return module0731.f44871();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0731.class
	Total time: 5862 ms
	
	Decompiled with Procyon 0.5.32.
*/