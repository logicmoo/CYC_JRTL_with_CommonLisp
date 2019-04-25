package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0807 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0807";
    public static final String myFingerPrint = "e2534fad98c1109e686035d0743e4ae0f155d482c511bb9310af394e84a1f8db";
    private static SubLSymbol $g6411$;
    private static SubLSymbol $g6412$;
    private static SubLSymbol $g6413$;
    public static SubLSymbol $g6414$;
    private static SubLSymbol $g6415$;
    private static SubLSymbol $g6416$;
    private static SubLSymbol $g6417$;
    private static SubLSymbol $g6418$;
    public static SubLSymbol $g6419$;
    public static SubLSymbol $g6420$;
    public static SubLSymbol $g6421$;
    public static SubLSymbol $g6422$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLFloat $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLFloat $ic74$;
    private static final SubLList $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLInteger $ic85$;
    private static final SubLInteger $ic86$;
    private static final SubLFloat $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLFloat $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLInteger $ic103$;
    private static final SubLInteger $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLList $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLList $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLInteger $ic167$;
    private static final SubLString $ic168$;
    private static final SubLInteger $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLList $ic172$;
    private static final SubLList $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLList $ic177$;
    
    
    public static SubLObject f51330(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12671(var1) && NIL != module0202.f12734(var1, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic0$), module0205.f13207(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51331(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12671(var1) && NIL != module0202.f12734(var1, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic0$), module0205.f13207(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51332(final SubLObject var1) {
        if (NIL == module0202.f12589(var1, $ic3$) || NIL == module0202.f12734(var1, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        final SubLObject var2 = module0205.f13134(var1, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
        if (!var2.isNumber()) {
            module0229.f15259();
        }
        return var2;
    }
    
    public static SubLObject f51333(final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        try {
            var6.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var9 = Errors.$error_handler$.currentBinding(var6);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var6);
                try {
                    var7 = f51334(var3, var4, var5);
                }
                catch (Throwable var10) {
                    Errors.handleThrowable(var10, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var9, var6);
            }
        }
        catch (Throwable var11) {
            var8 = Errors.handleThrowable(var11, module0003.$g3$.getGlobalValue());
        }
        finally {
            var6.throwStack.pop();
        }
        if (NIL != var8) {
            module0229.f15259();
        }
        return var7;
    }
    
    public static SubLObject f51334(final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        var6.resetMultipleValues();
        final SubLObject var7 = module0337.f22630((SubLObject)ConsesLow.list(var3, var4, var5), (SubLObject)$ic7$);
        final SubLObject var8 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        if (NIL != var7) {
            final SubLObject var9 = module0035.f2294(var8, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var10 = module0035.f2294(var8, (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var11 = module0035.f2294(var8, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var12 = module0035.f2294(var8, (SubLObject)$ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var13 = module0035.f2294(var8, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var14 = module0035.f2294(var8, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var15 = Numbers.divide(Numbers.subtract(Numbers.divide(Numbers.subtract(var13, var9), Numbers.subtract(var14, var10)), Numbers.divide(Numbers.subtract(var13, var11), Numbers.subtract(var14, var12))), Numbers.subtract(Numbers.divide(Numbers.subtract(module0048.f3282(var12), module0048.f3282(var14)), Numbers.subtract(var14, var12)), Numbers.divide(Numbers.subtract(module0048.f3282(var10), module0048.f3282(var14)), Numbers.subtract(var14, var10))));
            SubLObject var16 = Numbers.add(Numbers.divide(Numbers.multiply(var15, Numbers.subtract(module0048.f3282(var12), module0048.f3282(var14))), Numbers.subtract(var14, var12)), Numbers.divide(Numbers.subtract(var13, var11), Numbers.subtract(var14, var12)));
            SubLObject var17 = Numbers.subtract(var13, Numbers.multiply(var15, module0048.f3282(var14)), Numbers.multiply(var16, var14));
            var15 = module0048.f3306(var15);
            var16 = module0048.f3306(var16);
            var17 = module0048.f3306(var17);
            return module0202.f12787((SubLObject)ConsesLow.list(var15, var16, var17), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51335(final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = (SubLObject)$ic21$;
        if (NIL == module0337.f22628(var24, var22) || NIL == module0337.f22628(var24, var23)) {
            module0229.f15259();
        }
        final SubLObject var25 = module0205.f13207(var22, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0205.f13207(var23, (SubLObject)UNPROVIDED);
        return f51336(var25, var26);
    }
    
    public static SubLObject f51336(final SubLObject var25, final SubLObject var26) {
        if (NIL == var25) {
            return (SubLObject)makeBoolean(NIL != var26);
        }
        if (NIL == var26) {
            return (SubLObject)NIL;
        }
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)$ic23$);
        var27 = var25.first();
        final SubLObject var29 = var28 = var25.rest();
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var26, (SubLObject)$ic24$);
        var30 = var26.first();
        final SubLObject var33_34 = var31 = var26.rest();
        if (NIL != f51337(var27, var30)) {
            return (SubLObject)T;
        }
        if (NIL != f51337(var30, var27)) {
            return (SubLObject)NIL;
        }
        return f51336(var28, var31);
    }
    
    public static SubLObject f51337(final SubLObject var37, final SubLObject var38) {
        final SubLObject var39 = (SubLObject)$ic25$;
        if (NIL != module0337.f22628(var39, var37) && NIL != module0337.f22628(var39, var38)) {
            final SubLObject var40 = module0205.f13134(var37, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var41 = module0205.f13134(var38, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
            if (NIL != module0609.f37187(var40, var41)) {
                return (SubLObject)T;
            }
            if (NIL != module0609.f37187(var41, var40)) {
                return (SubLObject)NIL;
            }
            final SubLObject var42 = module0205.f13134(var37, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var43 = module0205.f13134(var38, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            if (NIL != module0609.f37187(var42, var43)) {
                return (SubLObject)T;
            }
            if (NIL != module0609.f37187(var43, var42)) {
                return (SubLObject)NIL;
            }
            final SubLObject var44 = module0205.f13134(var37, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var45 = module0205.f13134(var38, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            if (NIL != module0609.f37187(var44, var45)) {
                return (SubLObject)T;
            }
            if (NIL != module0609.f37187(var45, var44)) {
                return (SubLObject)NIL;
            }
            final SubLObject var46 = module0205.f13134(var37, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var47 = module0205.f13134(var38, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            if (NIL != module0609.f37187(var46, var47)) {
                return (SubLObject)T;
            }
            if (NIL != module0609.f37187(var47, var46)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51338(final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = (SubLObject)$ic28$;
        if (NIL == module0337.f22628(var49, var47) || NIL == module0337.f22628(var49, var48)) {
            module0229.f15259();
        }
        return f51339(var47, var48);
    }
    
    public static SubLObject f51339(final SubLObject var47, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        var49.resetMultipleValues();
        final SubLObject var50 = module0337.f22630(var47, (SubLObject)$ic31$);
        final SubLObject var51 = var49.secondMultipleValue();
        var49.resetMultipleValues();
        if (NIL != var50) {
            final SubLObject var52 = module0035.f2294(var51, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var53 = module0035.f2294(var51, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var54 = module0035.f2294(var51, (SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var55 = module0035.f2294(var51, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var56 = module0035.f2294(var51, (SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var57 = module0035.f2294(var51, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var58 = module0035.f2294(var51, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var59 = module0035.f2294(var51, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var60 = module0035.f2294(var51, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var49.resetMultipleValues();
            final SubLObject var11_59 = module0337.f22630(var48, (SubLObject)$ic41$);
            final SubLObject var12_60 = var49.secondMultipleValue();
            var49.resetMultipleValues();
            if (NIL != var11_59) {
                final SubLObject var61 = module0035.f2294(var12_60, (SubLObject)$ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var62 = module0035.f2294(var12_60, (SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var63 = module0035.f2294(var12_60, (SubLObject)$ic44$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var64 = module0035.f2294(var12_60, (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var65 = module0035.f2294(var12_60, (SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var66 = module0035.f2294(var12_60, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var67 = module0035.f2294(var12_60, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var68 = module0035.f2294(var12_60, (SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var69 = module0035.f2294(var12_60, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)makeBoolean(NIL != module0048.f3460(var60, var69, $g6411$.getGlobalValue()) && NIL != module0048.f3460(var59, var68, $g6412$.getGlobalValue()) && NIL != module0048.f3460(var58, var67, $g6413$.getGlobalValue()) && NIL != module0048.f3460(var57, var66, $g6411$.getGlobalValue()) && NIL != module0048.f3460(var56, var65, $g6412$.getGlobalValue()) && NIL != module0048.f3460(var55, var64, $g6413$.getGlobalValue()) && NIL != module0048.f3460(var54, var63, $g6411$.getGlobalValue()) && NIL != module0048.f3460(var53, var62, $g6412$.getGlobalValue()) && NIL != module0048.f3460(var52, var61, $g6413$.getGlobalValue()));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51340(final SubLObject var70, final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        final SubLObject var73 = (SubLObject)$ic25$;
        final SubLObject var74 = (SubLObject)$ic28$;
        if (NIL == module0337.f22628(var73, var70) || NIL == module0337.f22628(var74, var71)) {
            module0229.f15259();
        }
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        try {
            var72.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var77 = Errors.$error_handler$.currentBinding(var72);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var72);
                try {
                    var75 = f51341(var70, var71);
                }
                catch (Throwable var78) {
                    Errors.handleThrowable(var78, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var77, var72);
            }
        }
        catch (Throwable var79) {
            var76 = Errors.handleThrowable(var79, module0003.$g3$.getGlobalValue());
        }
        finally {
            var72.throwStack.pop();
        }
        if (NIL != var76) {
            module0229.f15259();
        }
        return var75;
    }
    
    public static SubLObject f51341(final SubLObject var70, final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        var72.resetMultipleValues();
        final SubLObject var73 = module0337.f22630(var71, (SubLObject)$ic53$);
        final SubLObject var74 = var72.secondMultipleValue();
        var72.resetMultipleValues();
        if (NIL != var73) {
            final SubLObject var75 = module0035.f2294(var74, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var76 = module0035.f2294(var74, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var77 = module0035.f2294(var74, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var78 = module0035.f2294(var74, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var79 = module0035.f2294(var74, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var80 = module0035.f2294(var74, (SubLObject)$ic59$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var81 = module0035.f2294(var74, (SubLObject)$ic60$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var82 = module0035.f2294(var74, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var83 = module0035.f2294(var74, (SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var72.resetMultipleValues();
            final SubLObject var11_83 = module0337.f22630(var70, (SubLObject)$ic63$);
            final SubLObject var12_84 = var72.secondMultipleValue();
            var72.resetMultipleValues();
            if (NIL != var11_83) {
                final SubLObject var84 = module0035.f2294(var12_84, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var85 = module0035.f2294(var12_84, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var86 = module0035.f2294(var12_84, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var87 = module0035.f2294(var12_84, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var88 = module0610.f37231(var87, (SubLObject)$ic68$);
                final SubLObject var89 = module0610.f37231(var86, (SubLObject)$ic68$);
                final SubLObject var90 = module0610.f37231(var85, (SubLObject)$ic68$);
                final SubLObject var91 = module0610.f37231(var84, (SubLObject)$ic69$);
                final SubLObject var92 = Numbers.add(Numbers.multiply(var83, Numbers.expt(var91, (SubLObject)TWO_INTEGER)), Numbers.multiply(var82, var91), var81);
                final SubLObject var93 = Numbers.add(Numbers.multiply(var80, Numbers.expt(var91, (SubLObject)TWO_INTEGER)), Numbers.multiply(var79, var91), var78);
                final SubLObject var94 = Numbers.add(Numbers.multiply(var77, Numbers.expt(var91, (SubLObject)TWO_INTEGER)), Numbers.multiply(var76, var91), var75);
                return (SubLObject)makeBoolean(NIL != module0048.f3460(var88, var92, $g6413$.getGlobalValue()) && NIL != module0048.f3460(var89, var93, $g6413$.getGlobalValue()) && NIL != module0048.f3460(var90, var94, $g6413$.getGlobalValue()));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51342(final SubLObject var96, final SubLObject var97, final SubLObject var98, final SubLObject var99) {
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var96, var96, (SubLObject)$ic71$);
        var100 = var96.first();
        SubLObject var102 = var96.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var102, var96, (SubLObject)$ic71$);
        var101 = var102.first();
        var102 = var102.rest();
        final SubLObject var103 = (SubLObject)(var102.isCons() ? var102.first() : ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var102, var96, (SubLObject)$ic71$);
        var102 = var102.rest();
        if (NIL == var102) {
            SubLObject var104 = (SubLObject)NIL;
            SubLObject var105 = (SubLObject)NIL;
            SubLObject var106 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var97, var97, (SubLObject)$ic72$);
            var104 = var97.first();
            SubLObject var107_108 = var97.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var107_108, var97, (SubLObject)$ic72$);
            var105 = var107_108.first();
            var107_108 = var107_108.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var107_108, var97, (SubLObject)$ic72$);
            var106 = var107_108.first();
            var107_108 = var107_108.rest();
            if (NIL == var107_108) {
                SubLObject var107 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var98, var98, (SubLObject)$ic73$);
                var107 = var98.first();
                SubLObject var114_115 = var98.rest();
                final SubLObject var108 = (SubLObject)(var114_115.isCons() ? var114_115.first() : ZERO_INTEGER);
                cdestructuring_bind.destructuring_bind_must_listp(var114_115, var98, (SubLObject)$ic73$);
                var114_115 = var114_115.rest();
                final SubLObject var109 = (SubLObject)(var114_115.isCons() ? var114_115.first() : $ic74$);
                cdestructuring_bind.destructuring_bind_must_listp(var114_115, var98, (SubLObject)$ic73$);
                var114_115 = var114_115.rest();
                if (NIL == var114_115) {
                    SubLObject var110 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var99, var99, (SubLObject)$ic75$);
                    var110 = var99.first();
                    SubLObject var121_122 = var99.rest();
                    final SubLObject var111 = var121_122.isCons() ? var121_122.first() : var108;
                    cdestructuring_bind.destructuring_bind_must_listp(var121_122, var99, (SubLObject)$ic75$);
                    var121_122 = var121_122.rest();
                    final SubLObject var112 = (SubLObject)(var121_122.isCons() ? var121_122.first() : ONE_INTEGER);
                    cdestructuring_bind.destructuring_bind_must_listp(var121_122, var99, (SubLObject)$ic75$);
                    var121_122 = var121_122.rest();
                    if (NIL == var121_122) {
                        final SubLObject var113 = Numbers.subtract(var104, var100);
                        final SubLObject var114 = Numbers.subtract(var105, var101);
                        final SubLObject var115 = Numbers.sqrt(Numbers.add(module0048.f3282(var113), module0048.f3282(var114)));
                        final SubLObject var116 = Numbers.multiply(Numbers.sin(var106), var107);
                        final SubLObject var117 = Numbers.multiply(Numbers.cos(var106), var107);
                        final SubLObject var118 = Numbers.multiply(var117, Numbers.divide(var113, var115));
                        final SubLObject var119 = Numbers.multiply(var117, Numbers.divide(var114, var115));
                        SubLObject var120 = (SubLObject)NIL;
                        SubLObject var121 = var111;
                        SubLObject var122;
                        SubLObject var123;
                        SubLObject var124;
                        SubLObject var125;
                        SubLObject var126;
                        for (var122 = (SubLObject)NIL, var122 = (SubLObject)ZERO_INTEGER; var122.numL(var110); var122 = Numbers.add(var122, (SubLObject)ONE_INTEGER)) {
                            var123 = Numbers.subtract(var121, var108);
                            var124 = Numbers.add(var100, Numbers.multiply(var123, var118));
                            var125 = Numbers.add(var101, Numbers.multiply(var123, var119));
                            var126 = Numbers.add(var103, Numbers.multiply(var123, var116), Numbers.multiply(module0048.f3282(var123), var109));
                            var120 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic3$, (SubLObject)ConsesLow.list($ic76$, module0048.f3302(var124, (SubLObject)FIVE_INTEGER)), (SubLObject)ConsesLow.list($ic76$, module0048.f3302(var125, (SubLObject)FIVE_INTEGER)), (SubLObject)ConsesLow.list($ic76$, module0048.f3302(var126, (SubLObject)FIVE_INTEGER)), (SubLObject)ConsesLow.list($ic77$, module0048.f3302(var121, (SubLObject)FIVE_INTEGER))), var120);
                            var121 = Numbers.add(var121, var112);
                        }
                        return Sequences.nreverse(var120);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)$ic75$);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)$ic73$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var97, (SubLObject)$ic72$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var96, (SubLObject)$ic71$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51343(final SubLObject var140, final SubLObject var123) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(var140) : var140;
        assert NIL != module0004.f106(var123) : var123;
        final SubLObject var142 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic83$, var123);
        final SubLObject var143 = module0075.f5176(var140, var142, (SubLObject)$ic84$);
        final SubLObject var144 = (SubLObject)$ic74$;
        final SubLObject var145 = (SubLObject)ZERO_INTEGER;
        final SubLObject var146 = (SubLObject)$ic85$;
        final SubLObject var147 = (SubLObject)ZERO_INTEGER;
        final SubLObject var148 = (SubLObject)ZERO_INTEGER;
        final SubLObject var149 = (SubLObject)$ic86$;
        final SubLObject var150 = (SubLObject)ZERO_INTEGER;
        final SubLObject var151 = (SubLObject)ZERO_INTEGER;
        final SubLObject var152 = (SubLObject)$ic87$;
        final SubLObject var153 = (SubLObject)ZERO_INTEGER;
        final SubLObject var154 = (SubLObject)ONE_INTEGER;
        final SubLObject var155 = f51342((SubLObject)ConsesLow.list(var146, var147, var148), (SubLObject)ConsesLow.list(var150, var151, var152), (SubLObject)ConsesLow.list(var149, var145, var144), (SubLObject)ConsesLow.list(var123, var153, var154));
        final SubLObject var156 = f51344($ic88$, var155);
        SubLObject var157 = (SubLObject)NIL;
        try {
            final SubLObject var158 = stream_macros.$stream_requires_locking$.currentBinding(var141);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var141);
                var157 = compatibility.open_text(var143, (SubLObject)$ic89$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var158, var141);
            }
            if (!var157.isStream()) {
                Errors.error((SubLObject)$ic90$, var143);
            }
            final SubLObject var146_147 = var157;
            final SubLObject var159 = reader.$read_default_float_format$.currentBinding(var141);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic91$, var141);
                PrintLow.format(var146_147, (SubLObject)$ic92$);
                PrintLow.format(var146_147, (SubLObject)$ic93$);
                PrintLow.format(var146_147, (SubLObject)$ic94$, var123);
                PrintLow.format(var146_147, (SubLObject)$ic95$, var153);
                PrintLow.format(var146_147, (SubLObject)$ic96$, var154);
                SubLObject var160 = var156;
                SubLObject var161 = (SubLObject)NIL;
                var161 = var160.first();
                while (NIL != var160) {
                    streams_high.terpri(var146_147);
                    module0194.f12114(var161, var146_147, (SubLObject)UNPROVIDED);
                    var160 = var160.rest();
                    var161 = var160.first();
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(var159, var141);
            }
        }
        finally {
            final SubLObject var162 = Threads.$is_thread_performing_cleanupP$.currentBinding(var141);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var141);
                if (var157.isStream()) {
                    streams_high.close(var157, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var162, var141);
            }
        }
        return var143;
    }
    
    public static SubLObject f51345(final SubLObject var140, final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(var140) : var140;
        assert NIL != module0004.f106(var150) : var150;
        final SubLObject var152 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic83$, var150);
        final SubLObject var153 = module0075.f5176(var140, var152, (SubLObject)$ic84$);
        final SubLObject var154 = (SubLObject)$ic74$;
        final SubLObject var155 = (SubLObject)ZERO_INTEGER;
        final SubLObject var156 = (SubLObject)$ic85$;
        final SubLObject var157 = (SubLObject)ZERO_INTEGER;
        final SubLObject var158 = (SubLObject)ZERO_INTEGER;
        final SubLObject var159 = (SubLObject)$ic86$;
        final SubLObject var160 = (SubLObject)ZERO_INTEGER;
        final SubLObject var161 = (SubLObject)ZERO_INTEGER;
        final SubLObject var162 = (SubLObject)$ic87$;
        final SubLObject var163 = (SubLObject)$ic98$;
        final SubLObject var164 = (SubLObject)ZERO_INTEGER;
        final SubLObject var165 = Numbers.divide(var163, module0048.f_1_(var150));
        final SubLObject var166 = var165.numG((SubLObject)ONE_INTEGER) ? Numbers.truncate(var165, (SubLObject)UNPROVIDED) : var165;
        final SubLObject var167 = f51342((SubLObject)ConsesLow.list(var156, var157, var158), (SubLObject)ConsesLow.list(var160, var161, var162), (SubLObject)ConsesLow.list(var159, var155, var154), (SubLObject)ConsesLow.list(var150, var164, var166));
        final SubLObject var168 = f51344($ic88$, var167);
        SubLObject var169 = (SubLObject)NIL;
        try {
            final SubLObject var170 = stream_macros.$stream_requires_locking$.currentBinding(var151);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var151);
                var169 = compatibility.open_text(var153, (SubLObject)$ic89$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var170, var151);
            }
            if (!var169.isStream()) {
                Errors.error((SubLObject)$ic90$, var153);
            }
            final SubLObject var146_154 = var169;
            final SubLObject var171 = reader.$read_default_float_format$.currentBinding(var151);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic91$, var151);
                PrintLow.format(var146_154, (SubLObject)$ic92$);
                PrintLow.format(var146_154, (SubLObject)$ic99$);
                PrintLow.format(var146_154, (SubLObject)$ic94$, var150);
                PrintLow.format(var146_154, (SubLObject)$ic95$, var164);
                PrintLow.format(var146_154, (SubLObject)$ic100$, module0048.f3306(var166));
                SubLObject var172 = var168;
                SubLObject var173 = (SubLObject)NIL;
                var173 = var172.first();
                while (NIL != var172) {
                    streams_high.terpri(var146_154);
                    module0194.f12114(var173, var146_154, (SubLObject)UNPROVIDED);
                    var172 = var172.rest();
                    var173 = var172.first();
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(var171, var151);
            }
        }
        finally {
            final SubLObject var174 = Threads.$is_thread_performing_cleanupP$.currentBinding(var151);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var151);
                if (var169.isStream()) {
                    streams_high.close(var169, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var174, var151);
            }
        }
        return var153;
    }
    
    public static SubLObject f51346(final SubLObject var140, final SubLObject var155, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(var140) : var140;
        assert NIL != module0004.f106(var155) : var155;
        assert NIL != module0004.f106(var156) : var156;
        final SubLObject var158 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic102$, var155, var156);
        final SubLObject var159 = module0075.f5176(var140, var158, (SubLObject)$ic84$);
        final SubLObject var160 = (SubLObject)$ic74$;
        final SubLObject var161 = (SubLObject)ZERO_INTEGER;
        final SubLObject var162 = (SubLObject)$ic86$;
        final SubLObject var163 = Numbers.multiply(var155, var156);
        final SubLObject var164 = (SubLObject)$ic98$;
        final SubLObject var165 = (SubLObject)ZERO_INTEGER;
        final SubLObject var166 = Numbers.divide(var164, module0048.f_1_(var156));
        final SubLObject var167 = var166.numG((SubLObject)ONE_INTEGER) ? Numbers.truncate(var166, (SubLObject)UNPROVIDED) : var166;
        SubLObject var168 = (SubLObject)NIL;
        SubLObject var169;
        SubLObject var170;
        SubLObject var171;
        SubLObject var172;
        SubLObject var173;
        SubLObject var174;
        SubLObject var175;
        SubLObject var176;
        SubLObject var177;
        SubLObject var179;
        SubLObject var178;
        SubLObject var180;
        for (var169 = (SubLObject)NIL, var169 = (SubLObject)ZERO_INTEGER; var169.numL(var155); var169 = Numbers.add(var169, (SubLObject)ONE_INTEGER)) {
            var170 = Numbers.add(Numbers.multiply((SubLObject)$ic103$, Numbers.expt(var169, (SubLObject)TWO_INTEGER)), Numbers.multiply((SubLObject)$ic104$, var169));
            var171 = (SubLObject)$ic85$;
            var172 = var170;
            var173 = (SubLObject)ZERO_INTEGER;
            var174 = (SubLObject)ZERO_INTEGER;
            var175 = var170;
            var176 = (SubLObject)$ic87$;
            var177 = f51342((SubLObject)ConsesLow.list(var171, var172, var173), (SubLObject)ConsesLow.list(var174, var175, var176), (SubLObject)ConsesLow.list(var162, var161, var160), (SubLObject)ConsesLow.list(var156, var165, var167));
            var178 = (var179 = f51344($ic88$, var177));
            var180 = (SubLObject)NIL;
            var180 = var179.first();
            while (NIL != var179) {
                var168 = (SubLObject)ConsesLow.cons(var180, var168);
                var179 = var179.rest();
                var180 = var179.first();
            }
        }
        var168 = Sort.sort(var168, Symbols.symbol_function((SubLObject)$ic105$), (SubLObject)UNPROVIDED);
        SubLObject var181 = (SubLObject)NIL;
        try {
            final SubLObject var182 = stream_macros.$stream_requires_locking$.currentBinding(var157);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var157);
                var181 = compatibility.open_text(var159, (SubLObject)$ic89$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var182, var157);
            }
            if (!var181.isStream()) {
                Errors.error((SubLObject)$ic90$, var159);
            }
            final SubLObject var146_162 = var181;
            final SubLObject var183 = reader.$read_default_float_format$.currentBinding(var157);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic91$, var157);
                PrintLow.format(var146_162, (SubLObject)$ic92$);
                PrintLow.format(var146_162, (SubLObject)$ic106$);
                PrintLow.format(var146_162, (SubLObject)$ic107$, var155);
                PrintLow.format(var146_162, (SubLObject)$ic108$, var156, var163);
                PrintLow.format(var146_162, (SubLObject)$ic95$, var165);
                PrintLow.format(var146_162, (SubLObject)$ic100$, module0048.f3306(var167));
                SubLObject var184 = var168;
                SubLObject var185 = (SubLObject)NIL;
                var185 = var184.first();
                while (NIL != var184) {
                    streams_high.terpri(var146_162);
                    module0194.f12114(var185, var146_162, (SubLObject)UNPROVIDED);
                    var184 = var184.rest();
                    var185 = var184.first();
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(var183, var157);
            }
        }
        finally {
            final SubLObject var186 = Threads.$is_thread_performing_cleanupP$.currentBinding(var157);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var157);
                if (var181.isStream()) {
                    streams_high.close(var181, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var186, var157);
            }
        }
        return var159;
    }
    
    public static SubLObject f51347(final SubLObject var163, final SubLObject var164) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        var165.resetMultipleValues();
        final SubLObject var166 = module0337.f22630(var163, (SubLObject)$ic109$);
        final SubLObject var167 = var165.secondMultipleValue();
        var165.resetMultipleValues();
        if (NIL != var166) {
            final SubLObject var168 = module0035.f2294(var167, (SubLObject)$ic110$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var169 = module0035.f2294(var167, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var165.resetMultipleValues();
            final SubLObject var11_165 = module0337.f22630(var164, (SubLObject)$ic112$);
            final SubLObject var12_166 = var165.secondMultipleValue();
            var165.resetMultipleValues();
            if (NIL != var11_165) {
                final SubLObject var170 = module0035.f2294(var12_166, (SubLObject)$ic113$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var171 = module0035.f2294(var12_166, (SubLObject)$ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var168.numL(var170)) {
                    return (SubLObject)T;
                }
                if (var170.numL(var168)) {
                    return (SubLObject)NIL;
                }
                if (var169.numL(var171)) {
                    return (SubLObject)T;
                }
                if (var171.numL(var169)) {
                    return (SubLObject)NIL;
                }
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51348(SubLObject var167) {
        if (var167 == UNPROVIDED) {
            var167 = $g6414$.getGlobalValue();
        }
        final SubLObject var168 = module0219.f14524(var167);
        SubLObject var169 = (SubLObject)ZERO_INTEGER;
        SubLObject var170 = var168;
        SubLObject var171 = (SubLObject)NIL;
        var171 = var170.first();
        while (NIL != var170) {
            if (NIL != module0178.f11375(var171) && NIL != assertion_handles_oc.f11041(var171, (SubLObject)UNPROVIDED)) {
                module0342.f23126(var171);
                var169 = Numbers.add(var169, (SubLObject)ONE_INTEGER);
            }
            var170 = var170.rest();
            var171 = var170.first();
        }
        return var169;
    }
    
    public static SubLObject f51349(final SubLObject var171, SubLObject var172) {
        if (var172 == UNPROVIDED) {
            var172 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var173 = f51350(var171);
        return f51351(var173, var172);
    }
    
    public static SubLObject f51351(final SubLObject var144, SubLObject var172) {
        if (var172 == UNPROVIDED) {
            var172 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var173 = SubLProcess.currentSubLThread();
        if (NIL != var172 && !areAssertionsDisabledFor(me) && NIL == Types.streamp(var172)) {
            throw new AssertionError(var172);
        }
        final SubLObject var174 = $g6414$.getGlobalValue();
        SubLObject var175 = (SubLObject)NIL;
        SubLObject var176 = (SubLObject)NIL;
        f51348(var174);
        if (NIL != var172) {
            module0413.f28859();
        }
        Storage.gc_ephemeral();
        final SubLObject var177 = Time.get_internal_real_time();
        module0012.$g82$.setDynamicValue((SubLObject)$ic119$, var173);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var173);
        module0012.$g83$.setDynamicValue(Sequences.length(var144), var173);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var173);
        final SubLObject var178 = module0012.$g75$.currentBinding(var173);
        final SubLObject var179 = module0012.$g76$.currentBinding(var173);
        final SubLObject var180 = module0012.$g77$.currentBinding(var173);
        final SubLObject var181 = module0012.$g78$.currentBinding(var173);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var173);
            module0012.$g76$.bind((SubLObject)NIL, var173);
            module0012.$g77$.bind((SubLObject)T, var173);
            module0012.$g78$.bind(Time.get_universal_time(), var173);
            module0012.f478(module0012.$g82$.getDynamicValue(var173));
            SubLObject var182 = var144;
            SubLObject var183 = (SubLObject)NIL;
            var183 = var182.first();
            while (NIL != var182) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var173), module0012.$g83$.getDynamicValue(var173));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var173), (SubLObject)ONE_INTEGER), var173);
                final SubLObject var8_182 = module0528.$g3893$.currentBinding(var173);
                final SubLObject var178_183 = module0532.$g3906$.currentBinding(var173);
                try {
                    module0528.$g3893$.bind((SubLObject)T, var173);
                    module0532.$g3906$.bind((SubLObject)TWO_INTEGER, var173);
                    module0540.f33517(var183, var174, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0532.$g3906$.rebind(var178_183, var173);
                    module0528.$g3893$.rebind(var8_182, var173);
                }
                var175 = module0409.f28506((SubLObject)$ic120$, $ic121$, (SubLObject)$ic122$);
                var182 = var182.rest();
                var183 = var182.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var181, var173);
            module0012.$g77$.rebind(var180, var173);
            module0012.$g76$.rebind(var179, var173);
            module0012.$g75$.rebind(var178, var173);
        }
        var176 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var177), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL != var172) {
            streams_high.terpri(var172);
            PrintLow.format(var172, (SubLObject)$ic123$, module0048.f3302(var176, (SubLObject)FOUR_INTEGER));
            module0413.f28860(var172);
            streams_high.terpri(var172);
        }
        return var175;
    }
    
    public static SubLObject f51352(final SubLObject var184, final SubLObject var143, SubLObject var172) {
        if (var172 == UNPROVIDED) {
            var172 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var185 = f51344(var184, var143);
        return f51351(var185, var172);
    }
    
    public static SubLObject f51353() {
        final SubLObject var185 = $g6415$.getGlobalValue();
        if (NIL != var185) {
            module0034.f1818(var185);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51354(final SubLObject var171) {
        return module0034.f1829($g6415$.getGlobalValue(), (SubLObject)ConsesLow.list(var171), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51355(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var171) : var171;
        SubLObject var173 = (SubLObject)NIL;
        SubLObject var174 = (SubLObject)NIL;
        try {
            final SubLObject var175 = stream_macros.$stream_requires_locking$.currentBinding(var172);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var172);
                var174 = compatibility.open_text(var171, (SubLObject)$ic126$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var175, var172);
            }
            if (!var174.isStream()) {
                Errors.error((SubLObject)$ic90$, var171);
            }
            final SubLObject var146_187 = var174;
            final SubLObject var176 = reader.$read_default_float_format$.currentBinding(var172);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic91$, var172);
                SubLObject var177;
                for (var177 = (SubLObject)NIL, var177 = reader.read(var146_187, (SubLObject)NIL, (SubLObject)$ic127$, (SubLObject)UNPROVIDED); var177 != $ic127$; var177 = reader.read(var146_187, (SubLObject)NIL, (SubLObject)$ic127$, (SubLObject)UNPROVIDED)) {
                    var173 = (SubLObject)ConsesLow.cons(var177, var173);
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(var176, var172);
            }
        }
        finally {
            final SubLObject var178 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var172);
                if (var174.isStream()) {
                    streams_high.close(var174, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var178, var172);
            }
        }
        return Sequences.nreverse(var173);
    }
    
    public static SubLObject f51350(final SubLObject var171) {
        SubLObject var172 = $g6415$.getGlobalValue();
        if (NIL == var172) {
            var172 = module0034.f1934((SubLObject)$ic124$, (SubLObject)$ic128$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var173 = module0034.f1814(var172, var171, (SubLObject)$ic129$);
        if (var173 == $ic129$) {
            var173 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51355(var171)));
            module0034.f1816(var172, var171, var173, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var173);
    }
    
    public static SubLObject f51344(final SubLObject var184, final SubLObject var143) {
        SubLObject var185 = (SubLObject)NIL;
        SubLObject var186 = var143;
        SubLObject var187 = (SubLObject)NIL;
        var187 = var186.first();
        while (NIL != var186) {
            final SubLObject var188 = module0202.f12768($ic130$, var184, var187);
            var185 = (SubLObject)ConsesLow.cons(var188, var185);
            var186 = var186.rest();
            var187 = var186.first();
        }
        return Sequences.nreverse(var185);
    }
    
    public static SubLObject f51356(final SubLObject var141) {
        return module0559.f34397(var141, $g6416$.getGlobalValue());
    }
    
    public static SubLObject f51357(final SubLObject var1) {
        return module0035.f2169(var1, $g6418$.getGlobalValue());
    }
    
    public static SubLObject f51358(final SubLObject var190, final SubLObject var191) {
        SubLObject var193;
        final SubLObject var192 = var193 = var190.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var193, var192, (SubLObject)$ic135$);
        final SubLObject var194 = var193.rest();
        var193 = var193.first();
        SubLObject var195 = (SubLObject)NIL;
        SubLObject var196 = var193;
        SubLObject var197 = (SubLObject)NIL;
        SubLObject var198_199 = (SubLObject)NIL;
        while (NIL != var196) {
            cdestructuring_bind.destructuring_bind_must_consp(var196, var192, (SubLObject)$ic135$);
            var198_199 = var196.first();
            var196 = var196.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var196, var192, (SubLObject)$ic135$);
            if (NIL == conses_high.member(var198_199, (SubLObject)$ic136$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var197 = (SubLObject)T;
            }
            if (var198_199 == $ic137$) {
                var195 = var196.first();
            }
            var196 = var196.rest();
        }
        if (NIL != var197 && NIL == var195) {
            cdestructuring_bind.cdestructuring_bind_error(var192, (SubLObject)$ic135$);
        }
        final SubLObject var198 = cdestructuring_bind.property_list_member((SubLObject)$ic138$, var193);
        final SubLObject var199 = (SubLObject)((NIL != var198) ? conses_high.cadr(var198) : NIL);
        final SubLObject var200 = cdestructuring_bind.property_list_member((SubLObject)$ic139$, var193);
        final SubLObject var201 = (SubLObject)((NIL != var200) ? conses_high.cadr(var200) : NIL);
        final SubLObject var202;
        var193 = (var202 = var194);
        final SubLObject var203 = (SubLObject)$ic140$;
        final SubLObject var204 = (SubLObject)$ic141$;
        final SubLObject var205 = (SubLObject)$ic142$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic143$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var203, var199), (SubLObject)ConsesLow.list(var204, var201)), (SubLObject)ConsesLow.listS((SubLObject)$ic144$, var203, (SubLObject)$ic145$), (SubLObject)ConsesLow.listS((SubLObject)$ic144$, var204, (SubLObject)$ic146$), (SubLObject)ConsesLow.listS((SubLObject)$ic147$, (SubLObject)ConsesLow.listS((SubLObject)$ic148$, (SubLObject)ConsesLow.listS(var205, var204, (SubLObject)$ic149$), (SubLObject)ConsesLow.list((SubLObject)$ic150$, (SubLObject)$ic151$, var205), (SubLObject)ConsesLow.list((SubLObject)$ic150$, (SubLObject)$ic152$, var203), (SubLObject)ConsesLow.list((SubLObject)$ic153$, var203, var205), ConsesLow.append(var202, (SubLObject)NIL)), (SubLObject)$ic154$));
    }
    
    public static SubLObject f51359(final SubLObject var141, SubLObject var206, SubLObject var207) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)ONE_INTEGER;
        }
        if (var207 == UNPROVIDED) {
            var207 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var208 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var141) : var141;
        assert NIL != module0004.f105(var206) : var206;
        assert NIL != module0004.f106(var207) : var207;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var208) && NIL == Filesys.probe_file(var141)) {
            Errors.error((SubLObject)$ic156$, var141);
        }
        final SubLObject var209 = Numbers.add(var207, var206);
        final SubLObject var210 = Sequences.cconcatenate((SubLObject)$ic157$, new SubLObject[] { module0006.f203(var209), $ic158$, module0006.f203((SubLObject)(var209.numG((SubLObject)ONE_INTEGER) ? $ic159$ : $ic160$)), $ic161$ });
        SubLObject var211 = (SubLObject)NIL;
        module0012.$g82$.setDynamicValue(var210, var208);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var208);
        module0012.$g83$.setDynamicValue(var209, var208);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var208);
        final SubLObject var212 = module0012.$g75$.currentBinding(var208);
        final SubLObject var213 = module0012.$g76$.currentBinding(var208);
        final SubLObject var214 = module0012.$g77$.currentBinding(var208);
        final SubLObject var215 = module0012.$g78$.currentBinding(var208);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var208);
            module0012.$g76$.bind((SubLObject)NIL, var208);
            module0012.$g77$.bind((SubLObject)T, var208);
            module0012.$g78$.bind(Time.get_universal_time(), var208);
            module0012.f478(module0012.$g82$.getDynamicValue(var208));
            SubLObject var216;
            SubLObject var217;
            SubLObject var218;
            SubLObject var219;
            for (var216 = (SubLObject)NIL, var216 = (SubLObject)ZERO_INTEGER; var216.numL(module0012.$g83$.getDynamicValue(var208)); var216 = Numbers.add(var216, (SubLObject)ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var208), module0012.$g83$.getDynamicValue(var208));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var208), (SubLObject)ONE_INTEGER), var208);
                var217 = f51360(var141, (SubLObject)T);
                var218 = f51360(var141, (SubLObject)NIL);
                var219 = Numbers.subtract(var218, var217);
                if (!var216.numL(var207)) {
                    var211 = (SubLObject)ConsesLow.cons(var219, var211);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var215, var208);
            module0012.$g77$.rebind(var214, var208);
            module0012.$g76$.rebind(var213, var208);
            module0012.$g75$.rebind(var212, var208);
        }
        var211 = Sequences.nreverse(var211);
        final SubLObject var220 = module0048.f3387(var211, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var208.resetMultipleValues();
        final SubLObject var221 = module0048.f3401(var211);
        final SubLObject var222 = var208.secondMultipleValue();
        var208.resetMultipleValues();
        return Values.values(var220, var222, var221);
    }
    
    public static SubLObject f51360(final SubLObject var141, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        SubLObject var220 = (SubLObject)NIL;
        Storage.gc_ephemeral();
        SubLObject var221 = (SubLObject)NIL;
        try {
            final SubLObject var222 = stream_macros.$stream_requires_locking$.currentBinding(var219);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var219);
                var221 = compatibility.open_binary(var141, (SubLObject)$ic126$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var222, var219);
            }
            if (!var221.isStream()) {
                Errors.error((SubLObject)$ic90$, var141);
            }
            final SubLObject var146_221 = var221;
            final SubLObject var223 = module0021.$g747$.currentBinding(var219);
            final SubLObject var224 = module0021.$g748$.currentBinding(var219);
            try {
                module0021.$g747$.bind((SubLObject)T, var219);
                module0021.$g748$.bind((SubLObject)NIL, var219);
                final SubLObject var226;
                final SubLObject var225 = var226 = module0021.f1060(var146_221, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var226.eql((SubLObject)$ic162$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51361(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (var226.eql((SubLObject)$ic163$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51362(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (var226.eql((SubLObject)$ic164$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51363(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (var226.eql((SubLObject)$ic165$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51364(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else {
                    Errors.error((SubLObject)$ic166$, var225);
                }
            }
            finally {
                module0021.$g748$.rebind(var224, var219);
                module0021.$g747$.rebind(var223, var219);
            }
        }
        finally {
            final SubLObject var228 = Threads.$is_thread_performing_cleanupP$.currentBinding(var219);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var219);
                if (var221.isStream()) {
                    streams_high.close(var221, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var228, var219);
            }
        }
        return var220;
    }
    
    public static SubLObject f51365(final SubLObject var223, final SubLObject var224) {
        if (NIL != module0018.$g728$.getGlobalValue()) {
            final SubLObject var225 = module0361.f23996(var224);
            final SubLObject var226 = Sxhash.sxhash(var223);
            module0021.f1038(var225, module0018.$g728$.getGlobalValue());
            module0021.f1038(var223, module0018.$g728$.getGlobalValue());
            module0021.f1038(var226, module0018.$g728$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51361(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while ($ic127$ != module0021.f1088(var146, (SubLObject)NIL, (SubLObject)$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var223;
            final SubLObject var222 = var223 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var218) {
                SubLObject var224;
                for (var224 = (SubLObject)NIL, var224 = (SubLObject)ZERO_INTEGER; var224.numL($g6419$.getDynamicValue(var219)); var224 = Numbers.add(var224, (SubLObject)ONE_INTEGER)) {
                    var223 = Sxhash.sxhash(var221);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var222.numE(var223)) {
                Errors.error((SubLObject)$ic168$, var223, var222);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51366(final SubLObject var228, final SubLObject var229, final SubLObject var230, final SubLObject var231) {
        if (NIL != module0018.$g728$.getGlobalValue()) {
            final SubLObject var232 = module0373.f26109();
            if (NIL != module0363.f24478(var232)) {
                final SubLObject var233 = module0363.f24507(var232);
                final SubLObject var234 = module0361.f23996(var233);
                final SubLObject var235 = module0363.f24508(var232);
                module0021.f1038(var234, module0018.$g728$.getGlobalValue());
                module0021.f1038(var235, module0018.$g728$.getGlobalValue());
                module0021.f1038(var228, module0018.$g728$.getGlobalValue());
                module0021.f1038(var229, module0018.$g728$.getGlobalValue());
                module0021.f1038(var230, module0018.$g728$.getGlobalValue());
                module0021.f1038(var231, module0018.$g728$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51362(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while ($ic127$ != module0021.f1088(var146, (SubLObject)NIL, (SubLObject)$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var222 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var223 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var224 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var226;
            final SubLObject var225 = var226 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var218) {
                SubLObject var227;
                for (var227 = (SubLObject)NIL, var227 = (SubLObject)ZERO_INTEGER; var227.numL($g6420$.getDynamicValue(var219)); var227 = Numbers.add(var227, (SubLObject)ONE_INTEGER)) {
                    var226 = module0234.f15445(var222, var223, var224, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var225.equal(var226)) {
                Errors.error((SubLObject)$ic170$, var226, var225);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51367(final SubLObject var24, final SubLObject var235, final SubLObject var236, final SubLObject var2, final SubLObject var237) {
        if (NIL != module0018.$g728$.getGlobalValue()) {
            module0021.f1038(var24, module0018.$g728$.getGlobalValue());
            module0021.f1038(var235, module0018.$g728$.getGlobalValue());
            module0021.f1038(var236, module0018.$g728$.getGlobalValue());
            module0021.f1038(var2, module0018.$g728$.getGlobalValue());
            module0021.f1038(var237, module0018.$g728$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51363(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while ($ic127$ != module0021.f1088(var146, (SubLObject)NIL, (SubLObject)$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var222 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var223 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var224 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var225 = var223;
            SubLObject var226 = var224;
            if (NIL == var218) {
                if (NIL != var222) {
                    SubLObject var227;
                    SubLObject var240_241;
                    SubLObject var242_243;
                    for (var227 = (SubLObject)NIL, var227 = (SubLObject)ZERO_INTEGER; var227.numL($g6421$.getDynamicValue(var219)); var227 = Numbers.add(var227, (SubLObject)ONE_INTEGER)) {
                        var219.resetMultipleValues();
                        var240_241 = module0337.f22626(var220, var221);
                        var242_243 = var219.secondMultipleValue();
                        var219.resetMultipleValues();
                        var225 = var240_241;
                        var226 = var242_243;
                    }
                }
                else {
                    SubLObject var227;
                    for (var227 = (SubLObject)NIL, var227 = (SubLObject)ZERO_INTEGER; var227.numL($g6421$.getDynamicValue(var219)); var227 = Numbers.add(var227, (SubLObject)ONE_INTEGER)) {
                        var225 = module0337.f22628(var220, var221);
                    }
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var223.eql(var225)) {
                Errors.error((SubLObject)$ic171$, var225, var223);
            }
            if (NIL != var222 && NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var224.equal(var226)) {
                Errors.error((SubLObject)$ic170$, var226, var224);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51368(final SubLObject var244, final SubLObject var167, final SubLObject var245, final SubLObject var246, final SubLObject var247) {
        if (NIL != module0018.$g728$.getGlobalValue()) {
            final SubLObject var248 = f51369(var244);
            final SubLObject var249 = f51370(var247);
            module0021.f1038(var248, module0018.$g728$.getGlobalValue());
            module0021.f1038(var167, module0018.$g728$.getGlobalValue());
            module0021.f1038(var245, module0018.$g728$.getGlobalValue());
            module0021.f1038(var246, module0018.$g728$.getGlobalValue());
            module0021.f1038((SubLObject)NIL, module0018.$g728$.getGlobalValue());
            module0021.f1038((SubLObject)T, module0018.$g728$.getGlobalValue());
            module0021.f1038(var249, module0018.$g728$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51364(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while ($ic127$ != module0021.f1088(var146, (SubLObject)NIL, (SubLObject)$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var222 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var223 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var224 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var225 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var226 = module0021.f1060(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var227 = f51371(var220);
            final SubLObject var228 = f51372(var226);
            SubLObject var230;
            final SubLObject var229 = var230 = var228;
            final SubLObject var231 = module0147.f9540(var221);
            final SubLObject var232 = module0147.$g2095$.currentBinding(var219);
            final SubLObject var233 = module0147.$g2094$.currentBinding(var219);
            final SubLObject var234 = module0147.$g2096$.currentBinding(var219);
            try {
                module0147.$g2095$.bind(module0147.f9545(var231), var219);
                module0147.$g2094$.bind(module0147.f9546(var231), var219);
                module0147.$g2096$.bind(module0147.f9549(var231), var219);
                if (NIL == var218) {
                    SubLObject var235;
                    for (var235 = (SubLObject)NIL, var235 = (SubLObject)ZERO_INTEGER; var235.numL($g6422$.getDynamicValue(var219)); var235 = Numbers.add(var235, (SubLObject)ONE_INTEGER)) {
                        var230 = module0376.f26668(var227, var222, var223);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var234, var219);
                module0147.$g2094$.rebind(var233, var219);
                module0147.$g2095$.rebind(var232, var219);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && NIL == f51373(var229, var230)) {
                Errors.error((SubLObject)$ic171$, var230, var229);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51373(final SubLObject var253, final SubLObject var254) {
        if (NIL == module0035.f2004(var253, var254)) {
            return (SubLObject)NIL;
        }
        SubLObject var255 = (SubLObject)NIL;
        SubLObject var256_257 = (SubLObject)NIL;
        SubLObject var256 = (SubLObject)NIL;
        SubLObject var259_260 = (SubLObject)NIL;
        var255 = var253;
        var256_257 = var255.first();
        var256 = var254;
        var259_260 = var256.first();
        while (NIL != var256 || NIL != var255) {
            if (NIL == f51374(var256_257, var259_260)) {
                return (SubLObject)NIL;
            }
            var255 = var255.rest();
            var256_257 = var255.first();
            var256 = var256.rest();
            var259_260 = var256.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f51374(final SubLObject var256, final SubLObject var259) {
        SubLObject var260 = (SubLObject)NIL;
        SubLObject var261 = (SubLObject)NIL;
        SubLObject var262 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var256, var256, (SubLObject)$ic172$);
        var260 = var256.first();
        SubLObject var263 = var256.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var263, var256, (SubLObject)$ic172$);
        var261 = var263.first();
        var263 = var263.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var263, var256, (SubLObject)$ic172$);
        var262 = var263.first();
        var263 = var263.rest();
        if (NIL == var263) {
            SubLObject var264 = (SubLObject)NIL;
            SubLObject var265 = (SubLObject)NIL;
            SubLObject var266 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var259, var259, (SubLObject)$ic173$);
            var264 = var259.first();
            SubLObject var268_269 = var259.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var268_269, var259, (SubLObject)$ic173$);
            var265 = var268_269.first();
            var268_269 = var268_269.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var268_269, var259, (SubLObject)$ic173$);
            var266 = var268_269.first();
            var268_269 = var268_269.rest();
            if (NIL == var268_269) {
                if (!var260.equal(var264) || !var262.equal(var266)) {
                    return (SubLObject)NIL;
                }
                return (SubLObject)makeBoolean(var261.equal(var265) || NIL != module0035.f2169(module0340.f22825(var260), (SubLObject)$ic174$));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var259, (SubLObject)$ic173$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var256, (SubLObject)$ic172$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51369(final SubLObject var244) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic175$), var244);
    }
    
    public static SubLObject f51371(final SubLObject var248) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)$ic176$), var248);
    }
    
    public static SubLObject f51370(final SubLObject var247) {
        SubLObject var248 = (SubLObject)NIL;
        SubLObject var249 = var247;
        SubLObject var250 = (SubLObject)NIL;
        var250 = var249.first();
        while (NIL != var249) {
            SubLObject var252;
            final SubLObject var251 = var252 = var250;
            SubLObject var253 = (SubLObject)NIL;
            SubLObject var254 = (SubLObject)NIL;
            SubLObject var255 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic177$);
            var253 = var252.first();
            var252 = var252.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic177$);
            var254 = var252.first();
            var252 = var252.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)$ic177$);
            var255 = var252.first();
            var252 = var252.rest();
            if (NIL == var252) {
                var248 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0340.f22825(var253), var254, var255), var248);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var251, (SubLObject)$ic177$);
            }
            var249 = var249.rest();
            var250 = var249.first();
        }
        return Sequences.nreverse(var248);
    }
    
    public static SubLObject f51372(final SubLObject var249) {
        SubLObject var250 = var249;
        SubLObject var251 = (SubLObject)NIL;
        var251 = var250.first();
        while (NIL != var250) {
            ConsesLow.rplaca(var251, module0340.f22786(var251.first()));
            var250 = var250.rest();
            var251 = var250.first();
        }
        return var249;
    }
    
    public static SubLObject f51375() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51330", "CYC-LIST-OF-2-REAL-NUMBERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51331", "CYC-LIST-OF-3-REAL-NUMBERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51332", "CYC-POINT-4-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51333", "CYC-QUAD-COEFF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51334", "S#55926", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51335", "CYC-ARBITRARY-PATH-4D-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51336", "S#55927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51337", "S#55928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51338", "CYC-EQUALS-QUAD-3D", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51339", "S#55929", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51340", "CYC-POINT-MATCHES-QUAD-3D", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51341", "S#55930", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51342", "S#55931", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51343", "ACIP-GENERATE-TEST-SUITE-1-SIMULATION-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51345", "ACIP-GENERATE-TEST-SUITE-2-SIMULATION-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51346", "ACIP-GENERATE-TEST-SUITE-3-SIMULATION-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51347", "S#55932", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51348", "S#55933", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51349", "ACIP-RUN-DEFENDER-SIMULATION-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51351", "S#55934", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51352", "S#55935", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51353", "S#55936", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51354", "S#55937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51355", "S#55938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51350", "S#55939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51344", "S#55940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51356", "SAVE-ACIP-PARTITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51357", "S#55941", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0807", "f51358", "S#55942");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51359", "S#55943", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51360", "S#55944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51365", "S#55945", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51361", "S#55946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51366", "S#55947", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51362", "S#55948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51367", "S#55949", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51363", "S#55950", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51368", "S#55951", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51364", "S#55952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51373", "S#55953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51374", "S#55954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51369", "S#55955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51371", "S#55956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51370", "S#55957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0807", "f51372", "S#55958", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51376() {
        $g6411$ = SubLFiles.deflexical("S#55959", (SubLObject)$ic30$);
        $g6412$ = SubLFiles.deflexical("S#55960", (SubLObject)ONE_INTEGER);
        $g6413$ = SubLFiles.deflexical("S#55961", (SubLObject)TEN_INTEGER);
        $g6414$ = SubLFiles.deflexical("S#55962", (NIL != Symbols.boundp((SubLObject)$ic115$)) ? $g6414$.getGlobalValue() : $ic116$);
        $g6415$ = SubLFiles.deflexical("S#55963", (SubLObject)NIL);
        $g6416$ = SubLFiles.deflexical("S#55964", (SubLObject)$ic131$);
        $g6417$ = SubLFiles.deflexical("S#55965", (SubLObject)$ic133$);
        $g6418$ = SubLFiles.deflexical("S#55966", (SubLObject)$ic134$);
        $g6419$ = SubLFiles.defparameter("S#55967", (SubLObject)$ic167$);
        $g6420$ = SubLFiles.defparameter("S#55968", (SubLObject)$ic169$);
        $g6421$ = SubLFiles.defparameter("S#55969", (SubLObject)$ic169$);
        $g6422$ = SubLFiles.defparameter("S#55970", (SubLObject)$ic103$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51377() {
        module0012.f416((SubLObject)$ic1$);
        module0012.f416((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic4$);
        module0012.f416((SubLObject)$ic6$);
        module0027.f1449((SubLObject)$ic6$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, Symbols.symbol_function((SubLObject)EQUAL), $ic15$, NIL, $ic16$, NIL, $ic17$, $ic18$, $ic19$, T }), (SubLObject)$ic20$);
        module0012.f416((SubLObject)$ic22$);
        module0027.f1449((SubLObject)$ic22$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, NIL, $ic15$, NIL, $ic16$, NIL, $ic17$, $ic26$, $ic19$, T }), (SubLObject)$ic27$);
        module0012.f416((SubLObject)$ic29$);
        module0027.f1449((SubLObject)$ic29$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, NIL, $ic15$, NIL, $ic16$, NIL, $ic17$, $ic26$, $ic19$, T }), (SubLObject)$ic51$);
        module0012.f416((SubLObject)$ic52$);
        module0027.f1449((SubLObject)$ic52$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, NIL, $ic15$, NIL, $ic16$, NIL, $ic17$, $ic26$, $ic19$, T }), (SubLObject)$ic70$);
        module0027.f1449((SubLObject)$ic78$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, Symbols.symbol_function((SubLObject)EQUAL), $ic15$, NIL, $ic16$, NIL, $ic17$, $ic26$, $ic19$, T }), (SubLObject)$ic79$);
        module0002.f38((SubLObject)$ic80$);
        module0002.f38((SubLObject)$ic97$);
        module0002.f38((SubLObject)$ic101$);
        module0012.f419((SubLObject)$ic105$);
        module0003.f57((SubLObject)$ic115$);
        module0002.f38((SubLObject)$ic117$);
        module0034.f1909((SubLObject)$ic124$);
        module0002.f38((SubLObject)$ic132$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f51375();
    }
    
    public void initializeVariables() {
        f51376();
    }
    
    public void runTopLevelForms() {
        f51377();
    }
    
    static {
        me = (SubLFile)new module0807();
        $g6411$ = null;
        $g6412$ = null;
        $g6413$ = null;
        $g6414$ = null;
        $g6415$ = null;
        $g6416$ = null;
        $g6417$ = null;
        $g6418$ = null;
        $g6419$ = null;
        $g6420$ = null;
        $g6421$ = null;
        $g6422$ = null;
        $ic0$ = makeSymbol("NUMBERP");
        $ic1$ = makeSymbol("CYC-LIST-OF-2-REAL-NUMBERS");
        $ic2$ = makeSymbol("CYC-LIST-OF-3-REAL-NUMBERS");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("Point4Fn"));
        $ic4$ = makeSymbol("CYC-POINT-4-TIME");
        $ic5$ = makeSymbol("S#38", "CYC");
        $ic6$ = makeSymbol("CYC-QUAD-COEFF");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55971", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55972", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55973", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55974", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55975", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55976", "CYC"))));
        $ic8$ = makeSymbol("S#55976", "CYC");
        $ic9$ = makeSymbol("S#55975", "CYC");
        $ic10$ = makeSymbol("S#55974", "CYC");
        $ic11$ = makeSymbol("S#55973", "CYC");
        $ic12$ = makeSymbol("S#55972", "CYC");
        $ic13$ = makeSymbol("S#55971", "CYC");
        $ic14$ = makeKeyword("TEST");
        $ic15$ = makeKeyword("OWNER");
        $ic16$ = makeKeyword("CLASSES");
        $ic17$ = makeKeyword("KB");
        $ic18$ = makeKeyword("TINY");
        $ic19$ = makeKeyword("WORKING?");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ONE_INTEGER, (SubLObject)makeInteger(900)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)TWO_INTEGER, (SubLObject)makeInteger(800))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(-100), (SubLObject)makeInteger(1000))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ONE_INTEGER, (SubLObject)makeInteger(1100)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)TWO_INTEGER, (SubLObject)makeInteger(1190))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeInteger(-5), (SubLObject)makeInteger(105), (SubLObject)makeInteger(1000))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(10000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ONE_INTEGER, (SubLObject)makeInteger(9520)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)TWO_INTEGER, (SubLObject)makeInteger(9040))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(-480), (SubLObject)makeInteger(10000))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ONE_INTEGER, (SubLObject)makeDouble(630.2)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)TWO_INTEGER, (SubLObject)makeDouble(1240.8))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeDouble(-9.8), (SubLObject)makeInteger(640), (SubLObject)ZERO_INTEGER)));
        $ic21$ = ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("Path4Fn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic22$ = makeSymbol("CYC-ARBITRARY-PATH-4D-ORDERING");
        $ic23$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#55977", "CYC"), (SubLObject)makeSymbol("S#55978", "CYC"));
        $ic24$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#55979", "CYC"), (SubLObject)makeSymbol("S#55980", "CYC"));
        $ic25$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic26$ = makeKeyword("FULL");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Path4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(900)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1100)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ONE_INTEGER))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Path4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(900)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1100)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)TWO_INTEGER)))), (SubLObject)T));
        $ic28$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP"))));
        $ic29$ = makeSymbol("CYC-EQUALS-QUAD-3D");
        $ic30$ = (SubLFloat)makeDouble(0.1);
        $ic31$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55981", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55982", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55983", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55984", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55985", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55986", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55987", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55988", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55989", "CYC"))));
        $ic32$ = makeSymbol("S#55989", "CYC");
        $ic33$ = makeSymbol("S#55988", "CYC");
        $ic34$ = makeSymbol("S#55987", "CYC");
        $ic35$ = makeSymbol("S#55986", "CYC");
        $ic36$ = makeSymbol("S#55985", "CYC");
        $ic37$ = makeSymbol("S#55984", "CYC");
        $ic38$ = makeSymbol("S#55983", "CYC");
        $ic39$ = makeSymbol("S#55982", "CYC");
        $ic40$ = makeSymbol("S#55981", "CYC");
        $ic41$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55990", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55992", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55993", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55994", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55995", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55996", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55997", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55998", "CYC"))));
        $ic42$ = makeSymbol("S#55998", "CYC");
        $ic43$ = makeSymbol("S#55997", "CYC");
        $ic44$ = makeSymbol("S#55996", "CYC");
        $ic45$ = makeSymbol("S#55995", "CYC");
        $ic46$ = makeSymbol("S#55994", "CYC");
        $ic47$ = makeSymbol("S#55993", "CYC");
        $ic48$ = makeSymbol("S#55992", "CYC");
        $ic49$ = makeSymbol("S#55991", "CYC");
        $ic50$ = makeSymbol("S#55990", "CYC");
        $ic51$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(-100), (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeInteger(-5), (SubLObject)makeInteger(105), (SubLObject)makeInteger(1000))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeDouble(0.1), (SubLObject)makeInteger(-101), (SubLObject)makeInteger(1010)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeDouble(0.1), (SubLObject)ONE_INTEGER, (SubLObject)TEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeDouble(-5.1), (SubLObject)makeInteger(106), (SubLObject)makeInteger(1010)))), (SubLObject)T));
        $ic52$ = makeSymbol("CYC-POINT-MATCHES-QUAD-3D");
        $ic53$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55999", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56000", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56001", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56002", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56003", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56004", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56005", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56006", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56007", "CYC"))));
        $ic54$ = makeSymbol("S#56007", "CYC");
        $ic55$ = makeSymbol("S#56006", "CYC");
        $ic56$ = makeSymbol("S#56005", "CYC");
        $ic57$ = makeSymbol("S#56004", "CYC");
        $ic58$ = makeSymbol("S#56003", "CYC");
        $ic59$ = makeSymbol("S#56002", "CYC");
        $ic60$ = makeSymbol("S#56001", "CYC");
        $ic61$ = makeSymbol("S#56000", "CYC");
        $ic62$ = makeSymbol("S#55999", "CYC");
        $ic63$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56008", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56009", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56010", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56011", "CYC")));
        $ic64$ = makeSymbol("S#56011", "CYC");
        $ic65$ = makeSymbol("S#56010", "CYC");
        $ic66$ = makeSymbol("S#56009", "CYC");
        $ic67$ = makeSymbol("S#56008", "CYC");
        $ic68$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ONE_INTEGER);
        $ic69$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ONE_INTEGER);
        $ic70$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(910)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)TEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1110)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(-100), (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheList")), (SubLObject)makeInteger(-5), (SubLObject)makeInteger(105), (SubLObject)makeInteger(1000)))), (SubLObject)T));
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#56012", "CYC"), (SubLObject)makeSymbol("S#56013", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56014", "CYC"), (SubLObject)ZERO_INTEGER));
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#56015", "CYC"), (SubLObject)makeSymbol("S#56016", "CYC"), (SubLObject)makeSymbol("S#56017", "CYC"));
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("S#56018", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5849", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56019", "CYC"), (SubLObject)makeDouble(-9.8)));
        $ic74$ = (SubLFloat)makeDouble(-9.8);
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#56020", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56021", "CYC"), (SubLObject)makeSymbol("S#5849", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56022", "CYC"), (SubLObject)ONE_INTEGER));
        $ic76$ = constant_handles_oc.f8479((SubLObject)makeString("Meter"));
        $ic77$ = constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration"));
        $ic78$ = makeSymbol("S#55931", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(1000), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)makeDouble(0.8097835725701669)), (SubLObject)ConsesLow.list((SubLObject)makeInteger(145), (SubLObject)ZERO_INTEGER, (SubLObject)makeInteger(-5)), (SubLObject)ConsesLow.list((SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(1000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(900)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(100)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(800)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(190)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)TWO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(10000), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)makeDouble(0.9272952180016123)), (SubLObject)ConsesLow.list((SubLObject)makeInteger(800), (SubLObject)ZERO_INTEGER, (SubLObject)makeDouble(-9.8)), (SubLObject)ConsesLow.list((SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(10000)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(9520)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeDouble(630.2)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeInteger(9040)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)makeDouble(1240.8)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)TWO_INTEGER)))));
        $ic80$ = makeSymbol("ACIP-GENERATE-TEST-SUITE-1-SIMULATION-FILE");
        $ic81$ = makeSymbol("DIRECTORY-P");
        $ic82$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic83$ = makeString("observations-~3,'0D");
        $ic84$ = makeString("txt");
        $ic85$ = makeInteger(10000);
        $ic86$ = makeInteger(800);
        $ic87$ = (SubLFloat)makeDouble(0.9272952180016123);
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("ACIP-Radar-001"));
        $ic89$ = makeKeyword("OUTPUT");
        $ic90$ = makeString("Unable to open ~S");
        $ic91$ = makeSymbol("DOUBLE-FLOAT");
        $ic92$ = makeString(";; ACIP Defender Observation Simulation File");
        $ic93$ = makeString("~%;; Test Suite 1 :");
        $ic94$ = makeString("~%;;   observations       : ~D total");
        $ic95$ = makeString("~%;;   first observation  : ~D second~:P");
        $ic96$ = makeString("~%;;   observation freq.  : ~D second~:P");
        $ic97$ = makeSymbol("ACIP-GENERATE-TEST-SUITE-2-SIMULATION-FILE");
        $ic98$ = (SubLFloat)makeDouble(65.3);
        $ic99$ = makeString("~%;; Test Suite 2 :");
        $ic100$ = makeString("~%;;   observation freq.  : ~S second~:P");
        $ic101$ = makeSymbol("ACIP-GENERATE-TEST-SUITE-3-SIMULATION-FILE");
        $ic102$ = makeString("observations-~2,'0D-~3,'0D");
        $ic103$ = makeInteger(100);
        $ic104$ = makeInteger(1000);
        $ic105$ = makeSymbol("S#55932", "CYC");
        $ic106$ = makeString("~%;; Test Suite 3 :");
        $ic107$ = makeString("~%;;   traces             : ~D total");
        $ic108$ = makeString("~%;;   observations       : ~D per trace, ~D total");
        $ic109$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("sensorObservation")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56023", "CYC"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56024", "CYC")))));
        $ic110$ = makeSymbol("S#56024", "CYC");
        $ic111$ = makeSymbol("S#56023", "CYC");
        $ic112$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("sensorObservation")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Point4Fn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Meter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56025", "CYC"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#56026", "CYC")))));
        $ic113$ = makeSymbol("S#56026", "CYC");
        $ic114$ = makeSymbol("S#56025", "CYC");
        $ic115$ = makeSymbol("S#55962", "CYC");
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("ACIPDefenderObservationMt"));
        $ic117$ = makeSymbol("ACIP-RUN-DEFENDER-SIMULATION-FILE");
        $ic118$ = makeSymbol("STREAMP");
        $ic119$ = makeString("cdolist");
        $ic120$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ballisticPathSensorCorroborationCount")), (SubLObject)makeSymbol("?PATH"), (SubLObject)makeSymbol("?NUM"));
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("ACIPDefenderModelMt"));
        $ic122$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)makeDouble(1.0), (SubLObject)makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("PATH"), (SubLObject)makeSymbol("?PATH"), (SubLObject)makeKeyword("OBSERVATIONS"), (SubLObject)makeSymbol("?NUM"))));
        $ic123$ = makeString("~%Total time                         : ~6,' D seconds");
        $ic124$ = makeSymbol("S#55939", "CYC");
        $ic125$ = makeSymbol("STRINGP");
        $ic126$ = makeKeyword("INPUT");
        $ic127$ = makeKeyword("EOF");
        $ic128$ = makeSymbol("S#55963", "CYC");
        $ic129$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic130$ = constant_handles_oc.f8479((SubLObject)makeString("sensorObservation"));
        $ic131$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIPWorldBackgroundMt"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIPGameBackgroundMt"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIPGameDataMt"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIPDefenderTheoryMt"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIPDefenderWorldStateMt"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIPDefenderObservationMt"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIPDefenderModelMt"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ListOf2RealNumbers"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ListOf3RealNumbers"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Path-4D"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Place-4D"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("QuadraticCurve-3D"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("RailroadGun"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Dora-RailroadGun"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Darla-RailroadGun"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ANSPS-49-Radar"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("QuantityNumberFn"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Point4Fn"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Path4Fn"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Quad3DFn"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Point4TimeFn"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("QuadCoeffFn"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("arbitraryPath4DOrdering"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ballisticPathSensorCorroborationCount"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("candidatePath"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("candidatePathTriple"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("equals-Quad3D"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("implausibleBallisticPathCoefficients"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("onBallisticPath"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("place4Altitude"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("place4Latitude"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("place4Longitude"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("place4Time"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("plausibleBallisticPath"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("point4LaterThan"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("pointMatchesQuad3D"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("representativeBallisticPath"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("sensorObservation"))), ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("ACIP-Radar-001"))) });
        $ic132$ = makeSymbol("SAVE-ACIP-PARTITION");
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("Meter"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM"), constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration"))));
        $ic134$ = ConsesLow.list((SubLObject)makeKeyword("LIST-HASHING"), (SubLObject)makeKeyword("UNIFICATION"), (SubLObject)makeKeyword("PATTERN-MATCH"), (SubLObject)makeKeyword("TACTIC-GENERATION"));
        $ic135$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#56027", "CYC"), (SubLObject)makeSymbol("S#885", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic136$ = ConsesLow.list((SubLObject)makeKeyword("SUBKERNEL"), (SubLObject)makeKeyword("FILENAME"));
        $ic137$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic138$ = makeKeyword("SUBKERNEL");
        $ic139$ = makeKeyword("FILENAME");
        $ic140$ = makeUninternedSymbol("US#52E0C26");
        $ic141$ = makeUninternedSymbol("US#2150FF3");
        $ic142$ = makeUninternedSymbol("US#541F852");
        $ic143$ = makeSymbol("CLET");
        $ic144$ = makeSymbol("CHECK-TYPE");
        $ic145$ = ConsesLow.list((SubLObject)makeSymbol("S#55941", "CYC"));
        $ic146$ = ConsesLow.list((SubLObject)makeSymbol("STRINGP"));
        $ic147$ = makeSymbol("CUNWIND-PROTECT");
        $ic148$ = makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic149$ = ConsesLow.list((SubLObject)makeKeyword("OUTPUT"));
        $ic150$ = makeSymbol("CSETQ");
        $ic151$ = makeSymbol("S#1952", "CYC");
        $ic152$ = makeSymbol("S#1951", "CYC");
        $ic153$ = makeSymbol("S#2094", "CYC");
        $ic154$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#1952", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#1951", "CYC"), (SubLObject)NIL));
        $ic155$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic156$ = makeString("File ~S not found.");
        $ic157$ = makeString("Performing ");
        $ic158$ = makeString(" trial");
        $ic159$ = makeString("s");
        $ic160$ = makeString("");
        $ic161$ = makeString(" of subkernel");
        $ic162$ = makeKeyword("LIST-HASHING");
        $ic163$ = makeKeyword("UNIFICATION");
        $ic164$ = makeKeyword("PATTERN-MATCH");
        $ic165$ = makeKeyword("TACTIC-GENERATION");
        $ic166$ = makeString("Time to support ~S subkernel.");
        $ic167$ = makeInteger(2000);
        $ic168$ = makeString("Actual hash code ~S differs from expected hash code ~S");
        $ic169$ = makeInteger(200);
        $ic170$ = makeString("Actual bindings ~S differs from expected bindings ~S");
        $ic171$ = makeString("Actual result ~S differs from expected result ~S");
        $ic172$ = ConsesLow.list((SubLObject)makeSymbol("S#56028", "CYC"), (SubLObject)makeSymbol("S#56029", "CYC"), (SubLObject)makeSymbol("S#56030", "CYC"));
        $ic173$ = ConsesLow.list((SubLObject)makeSymbol("S#56031", "CYC"), (SubLObject)makeSymbol("S#56032", "CYC"), (SubLObject)makeSymbol("S#56033", "CYC"));
        $ic174$ = ConsesLow.list((SubLObject)makeKeyword("REMOVAL-LOOKUP-POS"));
        $ic175$ = makeSymbol("HL-MODULE-NAME");
        $ic176$ = makeSymbol("S#14901", "CYC");
        $ic177$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#26071", "CYC"), (SubLObject)makeSymbol("S#25691", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 773 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/