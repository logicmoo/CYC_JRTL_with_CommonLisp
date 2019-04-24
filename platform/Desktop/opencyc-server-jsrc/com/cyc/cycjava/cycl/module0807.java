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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0807.NIL != module0202.f12671(var1) && module0807.NIL != module0202.f12734(var1, (SubLObject)module0807.TWO_INTEGER, (SubLObject)module0807.UNPROVIDED) && module0807.NIL != module0035.f2370(Symbols.symbol_function((SubLObject)module0807.$ic0$), module0205.f13207(var1, (SubLObject)module0807.UNPROVIDED), (SubLObject)module0807.UNPROVIDED));
    }
    
    public static SubLObject f51331(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0807.NIL != module0202.f12671(var1) && module0807.NIL != module0202.f12734(var1, (SubLObject)module0807.THREE_INTEGER, (SubLObject)module0807.UNPROVIDED) && module0807.NIL != module0035.f2370(Symbols.symbol_function((SubLObject)module0807.$ic0$), module0205.f13207(var1, (SubLObject)module0807.UNPROVIDED), (SubLObject)module0807.UNPROVIDED));
    }
    
    public static SubLObject f51332(final SubLObject var1) {
        if (module0807.NIL == module0202.f12589(var1, module0807.$ic3$) || module0807.NIL == module0202.f12734(var1, (SubLObject)module0807.FOUR_INTEGER, (SubLObject)module0807.UNPROVIDED)) {
            module0229.f15259();
        }
        final SubLObject var2 = module0205.f13134(var1, (SubLObject)module0807.FOUR_INTEGER, (SubLObject)module0807.UNPROVIDED);
        if (!var2.isNumber()) {
            module0229.f15259();
        }
        return var2;
    }
    
    public static SubLObject f51333(final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)module0807.NIL;
        SubLObject var8 = (SubLObject)module0807.NIL;
        try {
            var6.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var9 = Errors.$error_handler$.currentBinding(var6);
            try {
                Errors.$error_handler$.bind((SubLObject)module0807.$ic5$, var6);
                try {
                    var7 = f51334(var3, var4, var5);
                }
                catch (Throwable var10) {
                    Errors.handleThrowable(var10, (SubLObject)module0807.NIL);
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
        if (module0807.NIL != var8) {
            module0229.f15259();
        }
        return var7;
    }
    
    public static SubLObject f51334(final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        var6.resetMultipleValues();
        final SubLObject var7 = module0337.f22630((SubLObject)ConsesLow.list(var3, var4, var5), (SubLObject)module0807.$ic7$);
        final SubLObject var8 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        if (module0807.NIL != var7) {
            final SubLObject var9 = module0035.f2294(var8, (SubLObject)module0807.$ic8$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var10 = module0035.f2294(var8, (SubLObject)module0807.$ic9$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var11 = module0035.f2294(var8, (SubLObject)module0807.$ic10$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var12 = module0035.f2294(var8, (SubLObject)module0807.$ic11$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var13 = module0035.f2294(var8, (SubLObject)module0807.$ic12$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var14 = module0035.f2294(var8, (SubLObject)module0807.$ic13$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            SubLObject var15 = Numbers.divide(Numbers.subtract(Numbers.divide(Numbers.subtract(var13, var9), Numbers.subtract(var14, var10)), Numbers.divide(Numbers.subtract(var13, var11), Numbers.subtract(var14, var12))), Numbers.subtract(Numbers.divide(Numbers.subtract(module0048.f3282(var12), module0048.f3282(var14)), Numbers.subtract(var14, var12)), Numbers.divide(Numbers.subtract(module0048.f3282(var10), module0048.f3282(var14)), Numbers.subtract(var14, var10))));
            SubLObject var16 = Numbers.add(Numbers.divide(Numbers.multiply(var15, Numbers.subtract(module0048.f3282(var12), module0048.f3282(var14))), Numbers.subtract(var14, var12)), Numbers.divide(Numbers.subtract(var13, var11), Numbers.subtract(var14, var12)));
            SubLObject var17 = Numbers.subtract(var13, Numbers.multiply(var15, module0048.f3282(var14)), Numbers.multiply(var16, var14));
            var15 = module0048.f3306(var15);
            var16 = module0048.f3306(var16);
            var17 = module0048.f3306(var17);
            return module0202.f12787((SubLObject)ConsesLow.list(var15, var16, var17), (SubLObject)module0807.UNPROVIDED);
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51335(final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = (SubLObject)module0807.$ic21$;
        if (module0807.NIL == module0337.f22628(var24, var22) || module0807.NIL == module0337.f22628(var24, var23)) {
            module0229.f15259();
        }
        final SubLObject var25 = module0205.f13207(var22, (SubLObject)module0807.UNPROVIDED);
        final SubLObject var26 = module0205.f13207(var23, (SubLObject)module0807.UNPROVIDED);
        return f51336(var25, var26);
    }
    
    public static SubLObject f51336(final SubLObject var25, final SubLObject var26) {
        if (module0807.NIL == var25) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0807.NIL != var26);
        }
        if (module0807.NIL == var26) {
            return (SubLObject)module0807.NIL;
        }
        SubLObject var27 = (SubLObject)module0807.NIL;
        SubLObject var28 = (SubLObject)module0807.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)module0807.$ic23$);
        var27 = var25.first();
        final SubLObject var29 = var28 = var25.rest();
        SubLObject var30 = (SubLObject)module0807.NIL;
        SubLObject var31 = (SubLObject)module0807.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var26, (SubLObject)module0807.$ic24$);
        var30 = var26.first();
        final SubLObject var33_34 = var31 = var26.rest();
        if (module0807.NIL != f51337(var27, var30)) {
            return (SubLObject)module0807.T;
        }
        if (module0807.NIL != f51337(var30, var27)) {
            return (SubLObject)module0807.NIL;
        }
        return f51336(var28, var31);
    }
    
    public static SubLObject f51337(final SubLObject var37, final SubLObject var38) {
        final SubLObject var39 = (SubLObject)module0807.$ic25$;
        if (module0807.NIL != module0337.f22628(var39, var37) && module0807.NIL != module0337.f22628(var39, var38)) {
            final SubLObject var40 = module0205.f13134(var37, (SubLObject)module0807.FOUR_INTEGER, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var41 = module0205.f13134(var38, (SubLObject)module0807.FOUR_INTEGER, (SubLObject)module0807.UNPROVIDED);
            if (module0807.NIL != module0609.f37187(var40, var41)) {
                return (SubLObject)module0807.T;
            }
            if (module0807.NIL != module0609.f37187(var41, var40)) {
                return (SubLObject)module0807.NIL;
            }
            final SubLObject var42 = module0205.f13134(var37, (SubLObject)module0807.ONE_INTEGER, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var43 = module0205.f13134(var38, (SubLObject)module0807.ONE_INTEGER, (SubLObject)module0807.UNPROVIDED);
            if (module0807.NIL != module0609.f37187(var42, var43)) {
                return (SubLObject)module0807.T;
            }
            if (module0807.NIL != module0609.f37187(var43, var42)) {
                return (SubLObject)module0807.NIL;
            }
            final SubLObject var44 = module0205.f13134(var37, (SubLObject)module0807.TWO_INTEGER, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var45 = module0205.f13134(var38, (SubLObject)module0807.TWO_INTEGER, (SubLObject)module0807.UNPROVIDED);
            if (module0807.NIL != module0609.f37187(var44, var45)) {
                return (SubLObject)module0807.T;
            }
            if (module0807.NIL != module0609.f37187(var45, var44)) {
                return (SubLObject)module0807.NIL;
            }
            final SubLObject var46 = module0205.f13134(var37, (SubLObject)module0807.THREE_INTEGER, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var47 = module0205.f13134(var38, (SubLObject)module0807.THREE_INTEGER, (SubLObject)module0807.UNPROVIDED);
            if (module0807.NIL != module0609.f37187(var46, var47)) {
                return (SubLObject)module0807.T;
            }
            if (module0807.NIL != module0609.f37187(var47, var46)) {
                return (SubLObject)module0807.NIL;
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51338(final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = (SubLObject)module0807.$ic28$;
        if (module0807.NIL == module0337.f22628(var49, var47) || module0807.NIL == module0337.f22628(var49, var48)) {
            module0229.f15259();
        }
        return f51339(var47, var48);
    }
    
    public static SubLObject f51339(final SubLObject var47, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        var49.resetMultipleValues();
        final SubLObject var50 = module0337.f22630(var47, (SubLObject)module0807.$ic31$);
        final SubLObject var51 = var49.secondMultipleValue();
        var49.resetMultipleValues();
        if (module0807.NIL != var50) {
            final SubLObject var52 = module0035.f2294(var51, (SubLObject)module0807.$ic32$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var53 = module0035.f2294(var51, (SubLObject)module0807.$ic33$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var54 = module0035.f2294(var51, (SubLObject)module0807.$ic34$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var55 = module0035.f2294(var51, (SubLObject)module0807.$ic35$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var56 = module0035.f2294(var51, (SubLObject)module0807.$ic36$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var57 = module0035.f2294(var51, (SubLObject)module0807.$ic37$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var58 = module0035.f2294(var51, (SubLObject)module0807.$ic38$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var59 = module0035.f2294(var51, (SubLObject)module0807.$ic39$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var60 = module0035.f2294(var51, (SubLObject)module0807.$ic40$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            var49.resetMultipleValues();
            final SubLObject var11_59 = module0337.f22630(var48, (SubLObject)module0807.$ic41$);
            final SubLObject var12_60 = var49.secondMultipleValue();
            var49.resetMultipleValues();
            if (module0807.NIL != var11_59) {
                final SubLObject var61 = module0035.f2294(var12_60, (SubLObject)module0807.$ic42$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var62 = module0035.f2294(var12_60, (SubLObject)module0807.$ic43$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var63 = module0035.f2294(var12_60, (SubLObject)module0807.$ic44$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var64 = module0035.f2294(var12_60, (SubLObject)module0807.$ic45$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var65 = module0035.f2294(var12_60, (SubLObject)module0807.$ic46$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var66 = module0035.f2294(var12_60, (SubLObject)module0807.$ic47$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var67 = module0035.f2294(var12_60, (SubLObject)module0807.$ic48$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var68 = module0035.f2294(var12_60, (SubLObject)module0807.$ic49$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var69 = module0035.f2294(var12_60, (SubLObject)module0807.$ic50$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                return (SubLObject)SubLObjectFactory.makeBoolean(module0807.NIL != module0048.f3460(var60, var69, module0807.$g6411$.getGlobalValue()) && module0807.NIL != module0048.f3460(var59, var68, module0807.$g6412$.getGlobalValue()) && module0807.NIL != module0048.f3460(var58, var67, module0807.$g6413$.getGlobalValue()) && module0807.NIL != module0048.f3460(var57, var66, module0807.$g6411$.getGlobalValue()) && module0807.NIL != module0048.f3460(var56, var65, module0807.$g6412$.getGlobalValue()) && module0807.NIL != module0048.f3460(var55, var64, module0807.$g6413$.getGlobalValue()) && module0807.NIL != module0048.f3460(var54, var63, module0807.$g6411$.getGlobalValue()) && module0807.NIL != module0048.f3460(var53, var62, module0807.$g6412$.getGlobalValue()) && module0807.NIL != module0048.f3460(var52, var61, module0807.$g6413$.getGlobalValue()));
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51340(final SubLObject var70, final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        final SubLObject var73 = (SubLObject)module0807.$ic25$;
        final SubLObject var74 = (SubLObject)module0807.$ic28$;
        if (module0807.NIL == module0337.f22628(var73, var70) || module0807.NIL == module0337.f22628(var74, var71)) {
            module0229.f15259();
        }
        SubLObject var75 = (SubLObject)module0807.NIL;
        SubLObject var76 = (SubLObject)module0807.NIL;
        try {
            var72.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var77 = Errors.$error_handler$.currentBinding(var72);
            try {
                Errors.$error_handler$.bind((SubLObject)module0807.$ic5$, var72);
                try {
                    var75 = f51341(var70, var71);
                }
                catch (Throwable var78) {
                    Errors.handleThrowable(var78, (SubLObject)module0807.NIL);
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
        if (module0807.NIL != var76) {
            module0229.f15259();
        }
        return var75;
    }
    
    public static SubLObject f51341(final SubLObject var70, final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        var72.resetMultipleValues();
        final SubLObject var73 = module0337.f22630(var71, (SubLObject)module0807.$ic53$);
        final SubLObject var74 = var72.secondMultipleValue();
        var72.resetMultipleValues();
        if (module0807.NIL != var73) {
            final SubLObject var75 = module0035.f2294(var74, (SubLObject)module0807.$ic54$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var76 = module0035.f2294(var74, (SubLObject)module0807.$ic55$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var77 = module0035.f2294(var74, (SubLObject)module0807.$ic56$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var78 = module0035.f2294(var74, (SubLObject)module0807.$ic57$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var79 = module0035.f2294(var74, (SubLObject)module0807.$ic58$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var80 = module0035.f2294(var74, (SubLObject)module0807.$ic59$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var81 = module0035.f2294(var74, (SubLObject)module0807.$ic60$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var82 = module0035.f2294(var74, (SubLObject)module0807.$ic61$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var83 = module0035.f2294(var74, (SubLObject)module0807.$ic62$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            var72.resetMultipleValues();
            final SubLObject var11_83 = module0337.f22630(var70, (SubLObject)module0807.$ic63$);
            final SubLObject var12_84 = var72.secondMultipleValue();
            var72.resetMultipleValues();
            if (module0807.NIL != var11_83) {
                final SubLObject var84 = module0035.f2294(var12_84, (SubLObject)module0807.$ic64$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var85 = module0035.f2294(var12_84, (SubLObject)module0807.$ic65$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var86 = module0035.f2294(var12_84, (SubLObject)module0807.$ic66$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var87 = module0035.f2294(var12_84, (SubLObject)module0807.$ic67$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var88 = module0610.f37231(var87, (SubLObject)module0807.$ic68$);
                final SubLObject var89 = module0610.f37231(var86, (SubLObject)module0807.$ic68$);
                final SubLObject var90 = module0610.f37231(var85, (SubLObject)module0807.$ic68$);
                final SubLObject var91 = module0610.f37231(var84, (SubLObject)module0807.$ic69$);
                final SubLObject var92 = Numbers.add(Numbers.multiply(var83, Numbers.expt(var91, (SubLObject)module0807.TWO_INTEGER)), Numbers.multiply(var82, var91), var81);
                final SubLObject var93 = Numbers.add(Numbers.multiply(var80, Numbers.expt(var91, (SubLObject)module0807.TWO_INTEGER)), Numbers.multiply(var79, var91), var78);
                final SubLObject var94 = Numbers.add(Numbers.multiply(var77, Numbers.expt(var91, (SubLObject)module0807.TWO_INTEGER)), Numbers.multiply(var76, var91), var75);
                return (SubLObject)SubLObjectFactory.makeBoolean(module0807.NIL != module0048.f3460(var88, var92, module0807.$g6413$.getGlobalValue()) && module0807.NIL != module0048.f3460(var89, var93, module0807.$g6413$.getGlobalValue()) && module0807.NIL != module0048.f3460(var90, var94, module0807.$g6413$.getGlobalValue()));
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51342(final SubLObject var96, final SubLObject var97, final SubLObject var98, final SubLObject var99) {
        SubLObject var100 = (SubLObject)module0807.NIL;
        SubLObject var101 = (SubLObject)module0807.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var96, var96, (SubLObject)module0807.$ic71$);
        var100 = var96.first();
        SubLObject var102 = var96.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var102, var96, (SubLObject)module0807.$ic71$);
        var101 = var102.first();
        var102 = var102.rest();
        final SubLObject var103 = (SubLObject)(var102.isCons() ? var102.first() : module0807.ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var102, var96, (SubLObject)module0807.$ic71$);
        var102 = var102.rest();
        if (module0807.NIL == var102) {
            SubLObject var104 = (SubLObject)module0807.NIL;
            SubLObject var105 = (SubLObject)module0807.NIL;
            SubLObject var106 = (SubLObject)module0807.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var97, var97, (SubLObject)module0807.$ic72$);
            var104 = var97.first();
            SubLObject var107_108 = var97.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var107_108, var97, (SubLObject)module0807.$ic72$);
            var105 = var107_108.first();
            var107_108 = var107_108.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var107_108, var97, (SubLObject)module0807.$ic72$);
            var106 = var107_108.first();
            var107_108 = var107_108.rest();
            if (module0807.NIL == var107_108) {
                SubLObject var107 = (SubLObject)module0807.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var98, var98, (SubLObject)module0807.$ic73$);
                var107 = var98.first();
                SubLObject var114_115 = var98.rest();
                final SubLObject var108 = (SubLObject)(var114_115.isCons() ? var114_115.first() : module0807.ZERO_INTEGER);
                cdestructuring_bind.destructuring_bind_must_listp(var114_115, var98, (SubLObject)module0807.$ic73$);
                var114_115 = var114_115.rest();
                final SubLObject var109 = (SubLObject)(var114_115.isCons() ? var114_115.first() : module0807.$ic74$);
                cdestructuring_bind.destructuring_bind_must_listp(var114_115, var98, (SubLObject)module0807.$ic73$);
                var114_115 = var114_115.rest();
                if (module0807.NIL == var114_115) {
                    SubLObject var110 = (SubLObject)module0807.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var99, var99, (SubLObject)module0807.$ic75$);
                    var110 = var99.first();
                    SubLObject var121_122 = var99.rest();
                    final SubLObject var111 = var121_122.isCons() ? var121_122.first() : var108;
                    cdestructuring_bind.destructuring_bind_must_listp(var121_122, var99, (SubLObject)module0807.$ic75$);
                    var121_122 = var121_122.rest();
                    final SubLObject var112 = (SubLObject)(var121_122.isCons() ? var121_122.first() : module0807.ONE_INTEGER);
                    cdestructuring_bind.destructuring_bind_must_listp(var121_122, var99, (SubLObject)module0807.$ic75$);
                    var121_122 = var121_122.rest();
                    if (module0807.NIL == var121_122) {
                        final SubLObject var113 = Numbers.subtract(var104, var100);
                        final SubLObject var114 = Numbers.subtract(var105, var101);
                        final SubLObject var115 = Numbers.sqrt(Numbers.add(module0048.f3282(var113), module0048.f3282(var114)));
                        final SubLObject var116 = Numbers.multiply(Numbers.sin(var106), var107);
                        final SubLObject var117 = Numbers.multiply(Numbers.cos(var106), var107);
                        final SubLObject var118 = Numbers.multiply(var117, Numbers.divide(var113, var115));
                        final SubLObject var119 = Numbers.multiply(var117, Numbers.divide(var114, var115));
                        SubLObject var120 = (SubLObject)module0807.NIL;
                        SubLObject var121 = var111;
                        SubLObject var122;
                        SubLObject var123;
                        SubLObject var124;
                        SubLObject var125;
                        SubLObject var126;
                        for (var122 = (SubLObject)module0807.NIL, var122 = (SubLObject)module0807.ZERO_INTEGER; var122.numL(var110); var122 = Numbers.add(var122, (SubLObject)module0807.ONE_INTEGER)) {
                            var123 = Numbers.subtract(var121, var108);
                            var124 = Numbers.add(var100, Numbers.multiply(var123, var118));
                            var125 = Numbers.add(var101, Numbers.multiply(var123, var119));
                            var126 = Numbers.add(var103, Numbers.multiply(var123, var116), Numbers.multiply(module0048.f3282(var123), var109));
                            var120 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0807.$ic3$, (SubLObject)ConsesLow.list(module0807.$ic76$, module0048.f3302(var124, (SubLObject)module0807.FIVE_INTEGER)), (SubLObject)ConsesLow.list(module0807.$ic76$, module0048.f3302(var125, (SubLObject)module0807.FIVE_INTEGER)), (SubLObject)ConsesLow.list(module0807.$ic76$, module0048.f3302(var126, (SubLObject)module0807.FIVE_INTEGER)), (SubLObject)ConsesLow.list(module0807.$ic77$, module0048.f3302(var121, (SubLObject)module0807.FIVE_INTEGER))), var120);
                            var121 = Numbers.add(var121, var112);
                        }
                        return Sequences.nreverse(var120);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)module0807.$ic75$);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)module0807.$ic73$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var97, (SubLObject)module0807.$ic72$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var96, (SubLObject)module0807.$ic71$);
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51343(final SubLObject var140, final SubLObject var123) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        assert module0807.NIL != Filesys.directory_p(var140) : var140;
        assert module0807.NIL != module0004.f106(var123) : var123;
        final SubLObject var142 = PrintLow.format((SubLObject)module0807.NIL, (SubLObject)module0807.$ic83$, var123);
        final SubLObject var143 = module0075.f5176(var140, var142, (SubLObject)module0807.$ic84$);
        final SubLObject var144 = (SubLObject)module0807.$ic74$;
        final SubLObject var145 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var146 = (SubLObject)module0807.$ic85$;
        final SubLObject var147 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var148 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var149 = (SubLObject)module0807.$ic86$;
        final SubLObject var150 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var151 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var152 = (SubLObject)module0807.$ic87$;
        final SubLObject var153 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var154 = (SubLObject)module0807.ONE_INTEGER;
        final SubLObject var155 = f51342((SubLObject)ConsesLow.list(var146, var147, var148), (SubLObject)ConsesLow.list(var150, var151, var152), (SubLObject)ConsesLow.list(var149, var145, var144), (SubLObject)ConsesLow.list(var123, var153, var154));
        final SubLObject var156 = f51344(module0807.$ic88$, var155);
        SubLObject var157 = (SubLObject)module0807.NIL;
        try {
            final SubLObject var158 = stream_macros.$stream_requires_locking$.currentBinding(var141);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0807.NIL, var141);
                var157 = compatibility.open_text(var143, (SubLObject)module0807.$ic89$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var158, var141);
            }
            if (!var157.isStream()) {
                Errors.error((SubLObject)module0807.$ic90$, var143);
            }
            final SubLObject var146_147 = var157;
            final SubLObject var159 = reader.$read_default_float_format$.currentBinding(var141);
            try {
                reader.$read_default_float_format$.bind((SubLObject)module0807.$ic91$, var141);
                PrintLow.format(var146_147, (SubLObject)module0807.$ic92$);
                PrintLow.format(var146_147, (SubLObject)module0807.$ic93$);
                PrintLow.format(var146_147, (SubLObject)module0807.$ic94$, var123);
                PrintLow.format(var146_147, (SubLObject)module0807.$ic95$, var153);
                PrintLow.format(var146_147, (SubLObject)module0807.$ic96$, var154);
                SubLObject var160 = var156;
                SubLObject var161 = (SubLObject)module0807.NIL;
                var161 = var160.first();
                while (module0807.NIL != var160) {
                    streams_high.terpri(var146_147);
                    module0194.f12114(var161, var146_147, (SubLObject)module0807.UNPROVIDED);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0807.T, var141);
                if (var157.isStream()) {
                    streams_high.close(var157, (SubLObject)module0807.UNPROVIDED);
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
        assert module0807.NIL != Filesys.directory_p(var140) : var140;
        assert module0807.NIL != module0004.f106(var150) : var150;
        final SubLObject var152 = PrintLow.format((SubLObject)module0807.NIL, (SubLObject)module0807.$ic83$, var150);
        final SubLObject var153 = module0075.f5176(var140, var152, (SubLObject)module0807.$ic84$);
        final SubLObject var154 = (SubLObject)module0807.$ic74$;
        final SubLObject var155 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var156 = (SubLObject)module0807.$ic85$;
        final SubLObject var157 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var158 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var159 = (SubLObject)module0807.$ic86$;
        final SubLObject var160 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var161 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var162 = (SubLObject)module0807.$ic87$;
        final SubLObject var163 = (SubLObject)module0807.$ic98$;
        final SubLObject var164 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var165 = Numbers.divide(var163, module0048.f_1_(var150));
        final SubLObject var166 = var165.numG((SubLObject)module0807.ONE_INTEGER) ? Numbers.truncate(var165, (SubLObject)module0807.UNPROVIDED) : var165;
        final SubLObject var167 = f51342((SubLObject)ConsesLow.list(var156, var157, var158), (SubLObject)ConsesLow.list(var160, var161, var162), (SubLObject)ConsesLow.list(var159, var155, var154), (SubLObject)ConsesLow.list(var150, var164, var166));
        final SubLObject var168 = f51344(module0807.$ic88$, var167);
        SubLObject var169 = (SubLObject)module0807.NIL;
        try {
            final SubLObject var170 = stream_macros.$stream_requires_locking$.currentBinding(var151);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0807.NIL, var151);
                var169 = compatibility.open_text(var153, (SubLObject)module0807.$ic89$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var170, var151);
            }
            if (!var169.isStream()) {
                Errors.error((SubLObject)module0807.$ic90$, var153);
            }
            final SubLObject var146_154 = var169;
            final SubLObject var171 = reader.$read_default_float_format$.currentBinding(var151);
            try {
                reader.$read_default_float_format$.bind((SubLObject)module0807.$ic91$, var151);
                PrintLow.format(var146_154, (SubLObject)module0807.$ic92$);
                PrintLow.format(var146_154, (SubLObject)module0807.$ic99$);
                PrintLow.format(var146_154, (SubLObject)module0807.$ic94$, var150);
                PrintLow.format(var146_154, (SubLObject)module0807.$ic95$, var164);
                PrintLow.format(var146_154, (SubLObject)module0807.$ic100$, module0048.f3306(var166));
                SubLObject var172 = var168;
                SubLObject var173 = (SubLObject)module0807.NIL;
                var173 = var172.first();
                while (module0807.NIL != var172) {
                    streams_high.terpri(var146_154);
                    module0194.f12114(var173, var146_154, (SubLObject)module0807.UNPROVIDED);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0807.T, var151);
                if (var169.isStream()) {
                    streams_high.close(var169, (SubLObject)module0807.UNPROVIDED);
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
        assert module0807.NIL != Filesys.directory_p(var140) : var140;
        assert module0807.NIL != module0004.f106(var155) : var155;
        assert module0807.NIL != module0004.f106(var156) : var156;
        final SubLObject var158 = PrintLow.format((SubLObject)module0807.NIL, (SubLObject)module0807.$ic102$, var155, var156);
        final SubLObject var159 = module0075.f5176(var140, var158, (SubLObject)module0807.$ic84$);
        final SubLObject var160 = (SubLObject)module0807.$ic74$;
        final SubLObject var161 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var162 = (SubLObject)module0807.$ic86$;
        final SubLObject var163 = Numbers.multiply(var155, var156);
        final SubLObject var164 = (SubLObject)module0807.$ic98$;
        final SubLObject var165 = (SubLObject)module0807.ZERO_INTEGER;
        final SubLObject var166 = Numbers.divide(var164, module0048.f_1_(var156));
        final SubLObject var167 = var166.numG((SubLObject)module0807.ONE_INTEGER) ? Numbers.truncate(var166, (SubLObject)module0807.UNPROVIDED) : var166;
        SubLObject var168 = (SubLObject)module0807.NIL;
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
        for (var169 = (SubLObject)module0807.NIL, var169 = (SubLObject)module0807.ZERO_INTEGER; var169.numL(var155); var169 = Numbers.add(var169, (SubLObject)module0807.ONE_INTEGER)) {
            var170 = Numbers.add(Numbers.multiply((SubLObject)module0807.$ic103$, Numbers.expt(var169, (SubLObject)module0807.TWO_INTEGER)), Numbers.multiply((SubLObject)module0807.$ic104$, var169));
            var171 = (SubLObject)module0807.$ic85$;
            var172 = var170;
            var173 = (SubLObject)module0807.ZERO_INTEGER;
            var174 = (SubLObject)module0807.ZERO_INTEGER;
            var175 = var170;
            var176 = (SubLObject)module0807.$ic87$;
            var177 = f51342((SubLObject)ConsesLow.list(var171, var172, var173), (SubLObject)ConsesLow.list(var174, var175, var176), (SubLObject)ConsesLow.list(var162, var161, var160), (SubLObject)ConsesLow.list(var156, var165, var167));
            var178 = (var179 = f51344(module0807.$ic88$, var177));
            var180 = (SubLObject)module0807.NIL;
            var180 = var179.first();
            while (module0807.NIL != var179) {
                var168 = (SubLObject)ConsesLow.cons(var180, var168);
                var179 = var179.rest();
                var180 = var179.first();
            }
        }
        var168 = Sort.sort(var168, Symbols.symbol_function((SubLObject)module0807.$ic105$), (SubLObject)module0807.UNPROVIDED);
        SubLObject var181 = (SubLObject)module0807.NIL;
        try {
            final SubLObject var182 = stream_macros.$stream_requires_locking$.currentBinding(var157);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0807.NIL, var157);
                var181 = compatibility.open_text(var159, (SubLObject)module0807.$ic89$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var182, var157);
            }
            if (!var181.isStream()) {
                Errors.error((SubLObject)module0807.$ic90$, var159);
            }
            final SubLObject var146_162 = var181;
            final SubLObject var183 = reader.$read_default_float_format$.currentBinding(var157);
            try {
                reader.$read_default_float_format$.bind((SubLObject)module0807.$ic91$, var157);
                PrintLow.format(var146_162, (SubLObject)module0807.$ic92$);
                PrintLow.format(var146_162, (SubLObject)module0807.$ic106$);
                PrintLow.format(var146_162, (SubLObject)module0807.$ic107$, var155);
                PrintLow.format(var146_162, (SubLObject)module0807.$ic108$, var156, var163);
                PrintLow.format(var146_162, (SubLObject)module0807.$ic95$, var165);
                PrintLow.format(var146_162, (SubLObject)module0807.$ic100$, module0048.f3306(var167));
                SubLObject var184 = var168;
                SubLObject var185 = (SubLObject)module0807.NIL;
                var185 = var184.first();
                while (module0807.NIL != var184) {
                    streams_high.terpri(var146_162);
                    module0194.f12114(var185, var146_162, (SubLObject)module0807.UNPROVIDED);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0807.T, var157);
                if (var181.isStream()) {
                    streams_high.close(var181, (SubLObject)module0807.UNPROVIDED);
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
        final SubLObject var166 = module0337.f22630(var163, (SubLObject)module0807.$ic109$);
        final SubLObject var167 = var165.secondMultipleValue();
        var165.resetMultipleValues();
        if (module0807.NIL != var166) {
            final SubLObject var168 = module0035.f2294(var167, (SubLObject)module0807.$ic110$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var169 = module0035.f2294(var167, (SubLObject)module0807.$ic111$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            var165.resetMultipleValues();
            final SubLObject var11_165 = module0337.f22630(var164, (SubLObject)module0807.$ic112$);
            final SubLObject var12_166 = var165.secondMultipleValue();
            var165.resetMultipleValues();
            if (module0807.NIL != var11_165) {
                final SubLObject var170 = module0035.f2294(var12_166, (SubLObject)module0807.$ic113$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                final SubLObject var171 = module0035.f2294(var12_166, (SubLObject)module0807.$ic114$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                if (var168.numL(var170)) {
                    return (SubLObject)module0807.T;
                }
                if (var170.numL(var168)) {
                    return (SubLObject)module0807.NIL;
                }
                if (var169.numL(var171)) {
                    return (SubLObject)module0807.T;
                }
                if (var171.numL(var169)) {
                    return (SubLObject)module0807.NIL;
                }
                return (SubLObject)module0807.NIL;
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51348(SubLObject var167) {
        if (var167 == module0807.UNPROVIDED) {
            var167 = module0807.$g6414$.getGlobalValue();
        }
        final SubLObject var168 = module0219.f14524(var167);
        SubLObject var169 = (SubLObject)module0807.ZERO_INTEGER;
        SubLObject var170 = var168;
        SubLObject var171 = (SubLObject)module0807.NIL;
        var171 = var170.first();
        while (module0807.NIL != var170) {
            if (module0807.NIL != module0178.f11375(var171) && module0807.NIL != module0174.f11041(var171, (SubLObject)module0807.UNPROVIDED)) {
                module0342.f23126(var171);
                var169 = Numbers.add(var169, (SubLObject)module0807.ONE_INTEGER);
            }
            var170 = var170.rest();
            var171 = var170.first();
        }
        return var169;
    }
    
    public static SubLObject f51349(final SubLObject var171, SubLObject var172) {
        if (var172 == module0807.UNPROVIDED) {
            var172 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var173 = f51350(var171);
        return f51351(var173, var172);
    }
    
    public static SubLObject f51351(final SubLObject var144, SubLObject var172) {
        if (var172 == module0807.UNPROVIDED) {
            var172 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var173 = SubLProcess.currentSubLThread();
        if (module0807.NIL != var172 && !module0807.areAssertionsDisabledFor(me) && module0807.NIL == Types.streamp(var172)) {
            throw new AssertionError(var172);
        }
        final SubLObject var174 = module0807.$g6414$.getGlobalValue();
        SubLObject var175 = (SubLObject)module0807.NIL;
        SubLObject var176 = (SubLObject)module0807.NIL;
        f51348(var174);
        if (module0807.NIL != var172) {
            module0413.f28859();
        }
        Storage.gc_ephemeral();
        final SubLObject var177 = Time.get_internal_real_time();
        module0012.$g82$.setDynamicValue((SubLObject)module0807.$ic119$, var173);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var173);
        module0012.$g83$.setDynamicValue(Sequences.length(var144), var173);
        module0012.$g84$.setDynamicValue((SubLObject)module0807.ZERO_INTEGER, var173);
        final SubLObject var178 = module0012.$g75$.currentBinding(var173);
        final SubLObject var179 = module0012.$g76$.currentBinding(var173);
        final SubLObject var180 = module0012.$g77$.currentBinding(var173);
        final SubLObject var181 = module0012.$g78$.currentBinding(var173);
        try {
            module0012.$g75$.bind((SubLObject)module0807.ZERO_INTEGER, var173);
            module0012.$g76$.bind((SubLObject)module0807.NIL, var173);
            module0012.$g77$.bind((SubLObject)module0807.T, var173);
            module0012.$g78$.bind(Time.get_universal_time(), var173);
            module0012.f478(module0012.$g82$.getDynamicValue(var173));
            SubLObject var182 = var144;
            SubLObject var183 = (SubLObject)module0807.NIL;
            var183 = var182.first();
            while (module0807.NIL != var182) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var173), module0012.$g83$.getDynamicValue(var173));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var173), (SubLObject)module0807.ONE_INTEGER), var173);
                final SubLObject var8_182 = module0528.$g3893$.currentBinding(var173);
                final SubLObject var178_183 = module0532.$g3906$.currentBinding(var173);
                try {
                    module0528.$g3893$.bind((SubLObject)module0807.T, var173);
                    module0532.$g3906$.bind((SubLObject)module0807.TWO_INTEGER, var173);
                    module0540.f33517(var183, var174, (SubLObject)module0807.UNPROVIDED);
                }
                finally {
                    module0532.$g3906$.rebind(var178_183, var173);
                    module0528.$g3893$.rebind(var8_182, var173);
                }
                var175 = module0409.f28506((SubLObject)module0807.$ic120$, module0807.$ic121$, (SubLObject)module0807.$ic122$);
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
        if (module0807.NIL != var172) {
            streams_high.terpri(var172);
            PrintLow.format(var172, (SubLObject)module0807.$ic123$, module0048.f3302(var176, (SubLObject)module0807.FOUR_INTEGER));
            module0413.f28860(var172);
            streams_high.terpri(var172);
        }
        return var175;
    }
    
    public static SubLObject f51352(final SubLObject var184, final SubLObject var143, SubLObject var172) {
        if (var172 == module0807.UNPROVIDED) {
            var172 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var185 = f51344(var184, var143);
        return f51351(var185, var172);
    }
    
    public static SubLObject f51353() {
        final SubLObject var185 = module0807.$g6415$.getGlobalValue();
        if (module0807.NIL != var185) {
            module0034.f1818(var185);
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51354(final SubLObject var171) {
        return module0034.f1829(module0807.$g6415$.getGlobalValue(), (SubLObject)ConsesLow.list(var171), (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
    }
    
    public static SubLObject f51355(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0807.NIL != Types.stringp(var171) : var171;
        SubLObject var173 = (SubLObject)module0807.NIL;
        SubLObject var174 = (SubLObject)module0807.NIL;
        try {
            final SubLObject var175 = stream_macros.$stream_requires_locking$.currentBinding(var172);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0807.NIL, var172);
                var174 = compatibility.open_text(var171, (SubLObject)module0807.$ic126$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var175, var172);
            }
            if (!var174.isStream()) {
                Errors.error((SubLObject)module0807.$ic90$, var171);
            }
            final SubLObject var146_187 = var174;
            final SubLObject var176 = reader.$read_default_float_format$.currentBinding(var172);
            try {
                reader.$read_default_float_format$.bind((SubLObject)module0807.$ic91$, var172);
                SubLObject var177;
                for (var177 = (SubLObject)module0807.NIL, var177 = reader.read(var146_187, (SubLObject)module0807.NIL, (SubLObject)module0807.$ic127$, (SubLObject)module0807.UNPROVIDED); var177 != module0807.$ic127$; var177 = reader.read(var146_187, (SubLObject)module0807.NIL, (SubLObject)module0807.$ic127$, (SubLObject)module0807.UNPROVIDED)) {
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0807.T, var172);
                if (var174.isStream()) {
                    streams_high.close(var174, (SubLObject)module0807.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var178, var172);
            }
        }
        return Sequences.nreverse(var173);
    }
    
    public static SubLObject f51350(final SubLObject var171) {
        SubLObject var172 = module0807.$g6415$.getGlobalValue();
        if (module0807.NIL == var172) {
            var172 = module0034.f1934((SubLObject)module0807.$ic124$, (SubLObject)module0807.$ic128$, (SubLObject)module0807.NIL, (SubLObject)module0807.EQUAL, (SubLObject)module0807.ONE_INTEGER, (SubLObject)module0807.ZERO_INTEGER);
        }
        SubLObject var173 = module0034.f1814(var172, var171, (SubLObject)module0807.$ic129$);
        if (var173 == module0807.$ic129$) {
            var173 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51355(var171)));
            module0034.f1816(var172, var171, var173, (SubLObject)module0807.UNPROVIDED);
        }
        return module0034.f1959(var173);
    }
    
    public static SubLObject f51344(final SubLObject var184, final SubLObject var143) {
        SubLObject var185 = (SubLObject)module0807.NIL;
        SubLObject var186 = var143;
        SubLObject var187 = (SubLObject)module0807.NIL;
        var187 = var186.first();
        while (module0807.NIL != var186) {
            final SubLObject var188 = module0202.f12768(module0807.$ic130$, var184, var187);
            var185 = (SubLObject)ConsesLow.cons(var188, var185);
            var186 = var186.rest();
            var187 = var186.first();
        }
        return Sequences.nreverse(var185);
    }
    
    public static SubLObject f51356(final SubLObject var141) {
        return module0559.f34397(var141, module0807.$g6416$.getGlobalValue());
    }
    
    public static SubLObject f51357(final SubLObject var1) {
        return module0035.f2169(var1, module0807.$g6418$.getGlobalValue());
    }
    
    public static SubLObject f51358(final SubLObject var190, final SubLObject var191) {
        SubLObject var193;
        final SubLObject var192 = var193 = var190.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var193, var192, (SubLObject)module0807.$ic135$);
        final SubLObject var194 = var193.rest();
        var193 = var193.first();
        SubLObject var195 = (SubLObject)module0807.NIL;
        SubLObject var196 = var193;
        SubLObject var197 = (SubLObject)module0807.NIL;
        SubLObject var198_199 = (SubLObject)module0807.NIL;
        while (module0807.NIL != var196) {
            cdestructuring_bind.destructuring_bind_must_consp(var196, var192, (SubLObject)module0807.$ic135$);
            var198_199 = var196.first();
            var196 = var196.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var196, var192, (SubLObject)module0807.$ic135$);
            if (module0807.NIL == conses_high.member(var198_199, (SubLObject)module0807.$ic136$, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED)) {
                var197 = (SubLObject)module0807.T;
            }
            if (var198_199 == module0807.$ic137$) {
                var195 = var196.first();
            }
            var196 = var196.rest();
        }
        if (module0807.NIL != var197 && module0807.NIL == var195) {
            cdestructuring_bind.cdestructuring_bind_error(var192, (SubLObject)module0807.$ic135$);
        }
        final SubLObject var198 = cdestructuring_bind.property_list_member((SubLObject)module0807.$ic138$, var193);
        final SubLObject var199 = (SubLObject)((module0807.NIL != var198) ? conses_high.cadr(var198) : module0807.NIL);
        final SubLObject var200 = cdestructuring_bind.property_list_member((SubLObject)module0807.$ic139$, var193);
        final SubLObject var201 = (SubLObject)((module0807.NIL != var200) ? conses_high.cadr(var200) : module0807.NIL);
        final SubLObject var202;
        var193 = (var202 = var194);
        final SubLObject var203 = (SubLObject)module0807.$ic140$;
        final SubLObject var204 = (SubLObject)module0807.$ic141$;
        final SubLObject var205 = (SubLObject)module0807.$ic142$;
        return (SubLObject)ConsesLow.list((SubLObject)module0807.$ic143$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var203, var199), (SubLObject)ConsesLow.list(var204, var201)), (SubLObject)ConsesLow.listS((SubLObject)module0807.$ic144$, var203, (SubLObject)module0807.$ic145$), (SubLObject)ConsesLow.listS((SubLObject)module0807.$ic144$, var204, (SubLObject)module0807.$ic146$), (SubLObject)ConsesLow.listS((SubLObject)module0807.$ic147$, (SubLObject)ConsesLow.listS((SubLObject)module0807.$ic148$, (SubLObject)ConsesLow.listS(var205, var204, (SubLObject)module0807.$ic149$), (SubLObject)ConsesLow.list((SubLObject)module0807.$ic150$, (SubLObject)module0807.$ic151$, var205), (SubLObject)ConsesLow.list((SubLObject)module0807.$ic150$, (SubLObject)module0807.$ic152$, var203), (SubLObject)ConsesLow.list((SubLObject)module0807.$ic153$, var203, var205), ConsesLow.append(var202, (SubLObject)module0807.NIL)), (SubLObject)module0807.$ic154$));
    }
    
    public static SubLObject f51359(final SubLObject var141, SubLObject var206, SubLObject var207) {
        if (var206 == module0807.UNPROVIDED) {
            var206 = (SubLObject)module0807.ONE_INTEGER;
        }
        if (var207 == module0807.UNPROVIDED) {
            var207 = (SubLObject)module0807.ZERO_INTEGER;
        }
        final SubLThread var208 = SubLProcess.currentSubLThread();
        assert module0807.NIL != Types.stringp(var141) : var141;
        assert module0807.NIL != module0004.f105(var206) : var206;
        assert module0807.NIL != module0004.f106(var207) : var207;
        if (module0807.NIL == Errors.$ignore_mustsP$.getDynamicValue(var208) && module0807.NIL == Filesys.probe_file(var141)) {
            Errors.error((SubLObject)module0807.$ic156$, var141);
        }
        final SubLObject var209 = Numbers.add(var207, var206);
        final SubLObject var210 = Sequences.cconcatenate((SubLObject)module0807.$ic157$, new SubLObject[] { module0006.f203(var209), module0807.$ic158$, module0006.f203((SubLObject)(var209.numG((SubLObject)module0807.ONE_INTEGER) ? module0807.$ic159$ : module0807.$ic160$)), module0807.$ic161$ });
        SubLObject var211 = (SubLObject)module0807.NIL;
        module0012.$g82$.setDynamicValue(var210, var208);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var208);
        module0012.$g83$.setDynamicValue(var209, var208);
        module0012.$g84$.setDynamicValue((SubLObject)module0807.ZERO_INTEGER, var208);
        final SubLObject var212 = module0012.$g75$.currentBinding(var208);
        final SubLObject var213 = module0012.$g76$.currentBinding(var208);
        final SubLObject var214 = module0012.$g77$.currentBinding(var208);
        final SubLObject var215 = module0012.$g78$.currentBinding(var208);
        try {
            module0012.$g75$.bind((SubLObject)module0807.ZERO_INTEGER, var208);
            module0012.$g76$.bind((SubLObject)module0807.NIL, var208);
            module0012.$g77$.bind((SubLObject)module0807.T, var208);
            module0012.$g78$.bind(Time.get_universal_time(), var208);
            module0012.f478(module0012.$g82$.getDynamicValue(var208));
            SubLObject var216;
            SubLObject var217;
            SubLObject var218;
            SubLObject var219;
            for (var216 = (SubLObject)module0807.NIL, var216 = (SubLObject)module0807.ZERO_INTEGER; var216.numL(module0012.$g83$.getDynamicValue(var208)); var216 = Numbers.add(var216, (SubLObject)module0807.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var208), module0012.$g83$.getDynamicValue(var208));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var208), (SubLObject)module0807.ONE_INTEGER), var208);
                var217 = f51360(var141, (SubLObject)module0807.T);
                var218 = f51360(var141, (SubLObject)module0807.NIL);
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
        final SubLObject var220 = module0048.f3387(var211, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
        var208.resetMultipleValues();
        final SubLObject var221 = module0048.f3401(var211);
        final SubLObject var222 = var208.secondMultipleValue();
        var208.resetMultipleValues();
        return Values.values(var220, var222, var221);
    }
    
    public static SubLObject f51360(final SubLObject var141, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        SubLObject var220 = (SubLObject)module0807.NIL;
        Storage.gc_ephemeral();
        SubLObject var221 = (SubLObject)module0807.NIL;
        try {
            final SubLObject var222 = stream_macros.$stream_requires_locking$.currentBinding(var219);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0807.NIL, var219);
                var221 = compatibility.open_binary(var141, (SubLObject)module0807.$ic126$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var222, var219);
            }
            if (!var221.isStream()) {
                Errors.error((SubLObject)module0807.$ic90$, var141);
            }
            final SubLObject var146_221 = var221;
            final SubLObject var223 = module0021.$g747$.currentBinding(var219);
            final SubLObject var224 = module0021.$g748$.currentBinding(var219);
            try {
                module0021.$g747$.bind((SubLObject)module0807.T, var219);
                module0021.$g748$.bind((SubLObject)module0807.NIL, var219);
                final SubLObject var226;
                final SubLObject var225 = var226 = module0021.f1060(var146_221, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
                if (var226.eql((SubLObject)module0807.$ic162$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51361(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (var226.eql((SubLObject)module0807.$ic163$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51362(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (var226.eql((SubLObject)module0807.$ic164$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51363(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (var226.eql((SubLObject)module0807.$ic165$)) {
                    final SubLObject var227 = Time.get_internal_real_time();
                    f51364(var146_221, var218);
                    var220 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var227), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else {
                    Errors.error((SubLObject)module0807.$ic166$, var225);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0807.T, var219);
                if (var221.isStream()) {
                    streams_high.close(var221, (SubLObject)module0807.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var228, var219);
            }
        }
        return var220;
    }
    
    public static SubLObject f51365(final SubLObject var223, final SubLObject var224) {
        if (module0807.NIL != module0018.$g728$.getGlobalValue()) {
            final SubLObject var225 = module0361.f23996(var224);
            final SubLObject var226 = Sxhash.sxhash(var223);
            module0021.f1038(var225, module0018.$g728$.getGlobalValue());
            module0021.f1038(var223, module0018.$g728$.getGlobalValue());
            module0021.f1038(var226, module0018.$g728$.getGlobalValue());
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51361(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while (module0807.$ic127$ != module0021.f1088(var146, (SubLObject)module0807.NIL, (SubLObject)module0807.$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            SubLObject var223;
            final SubLObject var222 = var223 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            if (module0807.NIL == var218) {
                SubLObject var224;
                for (var224 = (SubLObject)module0807.NIL, var224 = (SubLObject)module0807.ZERO_INTEGER; var224.numL(module0807.$g6419$.getDynamicValue(var219)); var224 = Numbers.add(var224, (SubLObject)module0807.ONE_INTEGER)) {
                    var223 = Sxhash.sxhash(var221);
                }
            }
            if (module0807.NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var222.numE(var223)) {
                Errors.error((SubLObject)module0807.$ic168$, var223, var222);
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51366(final SubLObject var228, final SubLObject var229, final SubLObject var230, final SubLObject var231) {
        if (module0807.NIL != module0018.$g728$.getGlobalValue()) {
            final SubLObject var232 = module0373.f26109();
            if (module0807.NIL != module0363.f24478(var232)) {
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
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51362(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while (module0807.$ic127$ != module0021.f1088(var146, (SubLObject)module0807.NIL, (SubLObject)module0807.$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var222 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var223 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var224 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            SubLObject var226;
            final SubLObject var225 = var226 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            if (module0807.NIL == var218) {
                SubLObject var227;
                for (var227 = (SubLObject)module0807.NIL, var227 = (SubLObject)module0807.ZERO_INTEGER; var227.numL(module0807.$g6420$.getDynamicValue(var219)); var227 = Numbers.add(var227, (SubLObject)module0807.ONE_INTEGER)) {
                    var226 = module0234.f15445(var222, var223, var224, (SubLObject)module0807.NIL, (SubLObject)module0807.UNPROVIDED);
                }
            }
            if (module0807.NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var225.equal(var226)) {
                Errors.error((SubLObject)module0807.$ic170$, var226, var225);
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51367(final SubLObject var24, final SubLObject var235, final SubLObject var236, final SubLObject var2, final SubLObject var237) {
        if (module0807.NIL != module0018.$g728$.getGlobalValue()) {
            module0021.f1038(var24, module0018.$g728$.getGlobalValue());
            module0021.f1038(var235, module0018.$g728$.getGlobalValue());
            module0021.f1038(var236, module0018.$g728$.getGlobalValue());
            module0021.f1038(var2, module0018.$g728$.getGlobalValue());
            module0021.f1038(var237, module0018.$g728$.getGlobalValue());
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51363(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while (module0807.$ic127$ != module0021.f1088(var146, (SubLObject)module0807.NIL, (SubLObject)module0807.$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var222 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var223 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var224 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            SubLObject var225 = var223;
            SubLObject var226 = var224;
            if (module0807.NIL == var218) {
                if (module0807.NIL != var222) {
                    SubLObject var227;
                    SubLObject var240_241;
                    SubLObject var242_243;
                    for (var227 = (SubLObject)module0807.NIL, var227 = (SubLObject)module0807.ZERO_INTEGER; var227.numL(module0807.$g6421$.getDynamicValue(var219)); var227 = Numbers.add(var227, (SubLObject)module0807.ONE_INTEGER)) {
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
                    for (var227 = (SubLObject)module0807.NIL, var227 = (SubLObject)module0807.ZERO_INTEGER; var227.numL(module0807.$g6421$.getDynamicValue(var219)); var227 = Numbers.add(var227, (SubLObject)module0807.ONE_INTEGER)) {
                        var225 = module0337.f22628(var220, var221);
                    }
                }
            }
            if (module0807.NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var223.eql(var225)) {
                Errors.error((SubLObject)module0807.$ic171$, var225, var223);
            }
            if (module0807.NIL != var222 && module0807.NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && !var224.equal(var226)) {
                Errors.error((SubLObject)module0807.$ic170$, var226, var224);
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51368(final SubLObject var244, final SubLObject var167, final SubLObject var245, final SubLObject var246, final SubLObject var247) {
        if (module0807.NIL != module0018.$g728$.getGlobalValue()) {
            final SubLObject var248 = f51369(var244);
            final SubLObject var249 = f51370(var247);
            module0021.f1038(var248, module0018.$g728$.getGlobalValue());
            module0021.f1038(var167, module0018.$g728$.getGlobalValue());
            module0021.f1038(var245, module0018.$g728$.getGlobalValue());
            module0021.f1038(var246, module0018.$g728$.getGlobalValue());
            module0021.f1038((SubLObject)module0807.NIL, module0018.$g728$.getGlobalValue());
            module0021.f1038((SubLObject)module0807.T, module0018.$g728$.getGlobalValue());
            module0021.f1038(var249, module0018.$g728$.getGlobalValue());
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51364(final SubLObject var146, final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        while (module0807.$ic127$ != module0021.f1088(var146, (SubLObject)module0807.NIL, (SubLObject)module0807.$ic127$)) {
            final SubLObject var220 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var221 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var222 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var223 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var224 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var225 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
            final SubLObject var226 = module0021.f1060(var146, (SubLObject)module0807.UNPROVIDED, (SubLObject)module0807.UNPROVIDED);
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
                if (module0807.NIL == var218) {
                    SubLObject var235;
                    for (var235 = (SubLObject)module0807.NIL, var235 = (SubLObject)module0807.ZERO_INTEGER; var235.numL(module0807.$g6422$.getDynamicValue(var219)); var235 = Numbers.add(var235, (SubLObject)module0807.ONE_INTEGER)) {
                        var230 = module0376.f26668(var227, var222, var223);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var234, var219);
                module0147.$g2094$.rebind(var233, var219);
                module0147.$g2095$.rebind(var232, var219);
            }
            if (module0807.NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && module0807.NIL == f51373(var229, var230)) {
                Errors.error((SubLObject)module0807.$ic171$, var230, var229);
            }
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51373(final SubLObject var253, final SubLObject var254) {
        if (module0807.NIL == module0035.f2004(var253, var254)) {
            return (SubLObject)module0807.NIL;
        }
        SubLObject var255 = (SubLObject)module0807.NIL;
        SubLObject var256_257 = (SubLObject)module0807.NIL;
        SubLObject var256 = (SubLObject)module0807.NIL;
        SubLObject var259_260 = (SubLObject)module0807.NIL;
        var255 = var253;
        var256_257 = var255.first();
        var256 = var254;
        var259_260 = var256.first();
        while (module0807.NIL != var256 || module0807.NIL != var255) {
            if (module0807.NIL == f51374(var256_257, var259_260)) {
                return (SubLObject)module0807.NIL;
            }
            var255 = var255.rest();
            var256_257 = var255.first();
            var256 = var256.rest();
            var259_260 = var256.first();
        }
        return (SubLObject)module0807.T;
    }
    
    public static SubLObject f51374(final SubLObject var256, final SubLObject var259) {
        SubLObject var260 = (SubLObject)module0807.NIL;
        SubLObject var261 = (SubLObject)module0807.NIL;
        SubLObject var262 = (SubLObject)module0807.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var256, var256, (SubLObject)module0807.$ic172$);
        var260 = var256.first();
        SubLObject var263 = var256.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var263, var256, (SubLObject)module0807.$ic172$);
        var261 = var263.first();
        var263 = var263.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var263, var256, (SubLObject)module0807.$ic172$);
        var262 = var263.first();
        var263 = var263.rest();
        if (module0807.NIL == var263) {
            SubLObject var264 = (SubLObject)module0807.NIL;
            SubLObject var265 = (SubLObject)module0807.NIL;
            SubLObject var266 = (SubLObject)module0807.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var259, var259, (SubLObject)module0807.$ic173$);
            var264 = var259.first();
            SubLObject var268_269 = var259.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var268_269, var259, (SubLObject)module0807.$ic173$);
            var265 = var268_269.first();
            var268_269 = var268_269.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var268_269, var259, (SubLObject)module0807.$ic173$);
            var266 = var268_269.first();
            var268_269 = var268_269.rest();
            if (module0807.NIL == var268_269) {
                if (!var260.equal(var264) || !var262.equal(var266)) {
                    return (SubLObject)module0807.NIL;
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(var261.equal(var265) || module0807.NIL != module0035.f2169(module0340.f22825(var260), (SubLObject)module0807.$ic174$));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var259, (SubLObject)module0807.$ic173$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var256, (SubLObject)module0807.$ic172$);
        }
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51369(final SubLObject var244) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0807.$ic175$), var244);
    }
    
    public static SubLObject f51371(final SubLObject var248) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0807.$ic176$), var248);
    }
    
    public static SubLObject f51370(final SubLObject var247) {
        SubLObject var248 = (SubLObject)module0807.NIL;
        SubLObject var249 = var247;
        SubLObject var250 = (SubLObject)module0807.NIL;
        var250 = var249.first();
        while (module0807.NIL != var249) {
            SubLObject var252;
            final SubLObject var251 = var252 = var250;
            SubLObject var253 = (SubLObject)module0807.NIL;
            SubLObject var254 = (SubLObject)module0807.NIL;
            SubLObject var255 = (SubLObject)module0807.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)module0807.$ic177$);
            var253 = var252.first();
            var252 = var252.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)module0807.$ic177$);
            var254 = var252.first();
            var252 = var252.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var252, var251, (SubLObject)module0807.$ic177$);
            var255 = var252.first();
            var252 = var252.rest();
            if (module0807.NIL == var252) {
                var248 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0340.f22825(var253), var254, var255), var248);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var251, (SubLObject)module0807.$ic177$);
            }
            var249 = var249.rest();
            var250 = var249.first();
        }
        return Sequences.nreverse(var248);
    }
    
    public static SubLObject f51372(final SubLObject var249) {
        SubLObject var250 = var249;
        SubLObject var251 = (SubLObject)module0807.NIL;
        var251 = var250.first();
        while (module0807.NIL != var250) {
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
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51376() {
        module0807.$g6411$ = SubLFiles.deflexical("S#55959", (SubLObject)module0807.$ic30$);
        module0807.$g6412$ = SubLFiles.deflexical("S#55960", (SubLObject)module0807.ONE_INTEGER);
        module0807.$g6413$ = SubLFiles.deflexical("S#55961", (SubLObject)module0807.TEN_INTEGER);
        module0807.$g6414$ = SubLFiles.deflexical("S#55962", (module0807.NIL != Symbols.boundp((SubLObject)module0807.$ic115$)) ? module0807.$g6414$.getGlobalValue() : module0807.$ic116$);
        module0807.$g6415$ = SubLFiles.deflexical("S#55963", (SubLObject)module0807.NIL);
        module0807.$g6416$ = SubLFiles.deflexical("S#55964", (SubLObject)module0807.$ic131$);
        module0807.$g6417$ = SubLFiles.deflexical("S#55965", (SubLObject)module0807.$ic133$);
        module0807.$g6418$ = SubLFiles.deflexical("S#55966", (SubLObject)module0807.$ic134$);
        module0807.$g6419$ = SubLFiles.defparameter("S#55967", (SubLObject)module0807.$ic167$);
        module0807.$g6420$ = SubLFiles.defparameter("S#55968", (SubLObject)module0807.$ic169$);
        module0807.$g6421$ = SubLFiles.defparameter("S#55969", (SubLObject)module0807.$ic169$);
        module0807.$g6422$ = SubLFiles.defparameter("S#55970", (SubLObject)module0807.$ic103$);
        return (SubLObject)module0807.NIL;
    }
    
    public static SubLObject f51377() {
        module0012.f416((SubLObject)module0807.$ic1$);
        module0012.f416((SubLObject)module0807.$ic2$);
        module0012.f416((SubLObject)module0807.$ic4$);
        module0012.f416((SubLObject)module0807.$ic6$);
        module0027.f1449((SubLObject)module0807.$ic6$, (SubLObject)ConsesLow.list(new SubLObject[] { module0807.$ic14$, Symbols.symbol_function((SubLObject)module0807.EQUAL), module0807.$ic15$, module0807.NIL, module0807.$ic16$, module0807.NIL, module0807.$ic17$, module0807.$ic18$, module0807.$ic19$, module0807.T }), (SubLObject)module0807.$ic20$);
        module0012.f416((SubLObject)module0807.$ic22$);
        module0027.f1449((SubLObject)module0807.$ic22$, (SubLObject)ConsesLow.list(new SubLObject[] { module0807.$ic14$, module0807.NIL, module0807.$ic15$, module0807.NIL, module0807.$ic16$, module0807.NIL, module0807.$ic17$, module0807.$ic26$, module0807.$ic19$, module0807.T }), (SubLObject)module0807.$ic27$);
        module0012.f416((SubLObject)module0807.$ic29$);
        module0027.f1449((SubLObject)module0807.$ic29$, (SubLObject)ConsesLow.list(new SubLObject[] { module0807.$ic14$, module0807.NIL, module0807.$ic15$, module0807.NIL, module0807.$ic16$, module0807.NIL, module0807.$ic17$, module0807.$ic26$, module0807.$ic19$, module0807.T }), (SubLObject)module0807.$ic51$);
        module0012.f416((SubLObject)module0807.$ic52$);
        module0027.f1449((SubLObject)module0807.$ic52$, (SubLObject)ConsesLow.list(new SubLObject[] { module0807.$ic14$, module0807.NIL, module0807.$ic15$, module0807.NIL, module0807.$ic16$, module0807.NIL, module0807.$ic17$, module0807.$ic26$, module0807.$ic19$, module0807.T }), (SubLObject)module0807.$ic70$);
        module0027.f1449((SubLObject)module0807.$ic78$, (SubLObject)ConsesLow.list(new SubLObject[] { module0807.$ic14$, Symbols.symbol_function((SubLObject)module0807.EQUAL), module0807.$ic15$, module0807.NIL, module0807.$ic16$, module0807.NIL, module0807.$ic17$, module0807.$ic26$, module0807.$ic19$, module0807.T }), (SubLObject)module0807.$ic79$);
        module0002.f38((SubLObject)module0807.$ic80$);
        module0002.f38((SubLObject)module0807.$ic97$);
        module0002.f38((SubLObject)module0807.$ic101$);
        module0012.f419((SubLObject)module0807.$ic105$);
        module0003.f57((SubLObject)module0807.$ic115$);
        module0002.f38((SubLObject)module0807.$ic117$);
        module0034.f1909((SubLObject)module0807.$ic124$);
        module0002.f38((SubLObject)module0807.$ic132$);
        return (SubLObject)module0807.NIL;
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
        module0807.$g6411$ = null;
        module0807.$g6412$ = null;
        module0807.$g6413$ = null;
        module0807.$g6414$ = null;
        module0807.$g6415$ = null;
        module0807.$g6416$ = null;
        module0807.$g6417$ = null;
        module0807.$g6418$ = null;
        module0807.$g6419$ = null;
        module0807.$g6420$ = null;
        module0807.$g6421$ = null;
        module0807.$g6422$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic1$ = SubLObjectFactory.makeSymbol("CYC-LIST-OF-2-REAL-NUMBERS");
        $ic2$ = SubLObjectFactory.makeSymbol("CYC-LIST-OF-3-REAL-NUMBERS");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn"));
        $ic4$ = SubLObjectFactory.makeSymbol("CYC-POINT-4-TIME");
        $ic5$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("CYC-QUAD-COEFF");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55971", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55972", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55973", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55974", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55975", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55976", "CYC"))));
        $ic8$ = SubLObjectFactory.makeSymbol("S#55976", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#55975", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#55974", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#55973", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#55972", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#55971", "CYC");
        $ic14$ = SubLObjectFactory.makeKeyword("TEST");
        $ic15$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic16$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic17$ = SubLObjectFactory.makeKeyword("KB");
        $ic18$ = SubLObjectFactory.makeKeyword("TINY");
        $ic19$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(900)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(800))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-100), (SubLObject)SubLObjectFactory.makeInteger(1000))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ONE_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.TWO_INTEGER, (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1100)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1190))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeInteger(-5), (SubLObject)SubLObjectFactory.makeInteger(105), (SubLObject)SubLObjectFactory.makeInteger(1000))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(10000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(9520)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(9040))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-480), (SubLObject)SubLObjectFactory.makeInteger(10000))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ONE_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.TWO_INTEGER, (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(630.2)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(1240.8))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeDouble(-9.8), (SubLObject)SubLObjectFactory.makeInteger(640), (SubLObject)module0807.ZERO_INTEGER)));
        $ic21$ = ConsesLow.listS(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Path4Fn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic22$ = SubLObjectFactory.makeSymbol("CYC-ARBITRARY-PATH-4D-ORDERING");
        $ic23$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#55977", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55978", "CYC"));
        $ic24$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#55979", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55980", "CYC"));
        $ic25$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic26$ = SubLObjectFactory.makeKeyword("FULL");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Path4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(900)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1100)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ONE_INTEGER))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Path4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(900)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1100)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.TWO_INTEGER)))), (SubLObject)module0807.T));
        $ic28$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"))));
        $ic29$ = SubLObjectFactory.makeSymbol("CYC-EQUALS-QUAD-3D");
        $ic30$ = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $ic31$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55981", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55982", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55983", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55984", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55985", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55986", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55987", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55988", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55989", "CYC"))));
        $ic32$ = SubLObjectFactory.makeSymbol("S#55989", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#55988", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#55987", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#55986", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#55985", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#55984", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#55983", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#55982", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#55981", "CYC");
        $ic41$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55990", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55991", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55992", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55993", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55994", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55995", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55996", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55997", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55998", "CYC"))));
        $ic42$ = SubLObjectFactory.makeSymbol("S#55998", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#55997", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#55996", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#55995", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#55994", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#55993", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#55992", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#55991", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#55990", "CYC");
        $ic51$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-100), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeInteger(-5), (SubLObject)SubLObjectFactory.makeInteger(105), (SubLObject)SubLObjectFactory.makeInteger(1000))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeDouble(0.1), (SubLObject)SubLObjectFactory.makeInteger(-101), (SubLObject)SubLObjectFactory.makeInteger(1010)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeDouble(0.1), (SubLObject)module0807.ONE_INTEGER, (SubLObject)module0807.TEN_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeDouble(-5.1), (SubLObject)SubLObjectFactory.makeInteger(106), (SubLObject)SubLObjectFactory.makeInteger(1010)))), (SubLObject)module0807.T));
        $ic52$ = SubLObjectFactory.makeSymbol("CYC-POINT-MATCHES-QUAD-3D");
        $ic53$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#55999", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56000", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56001", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56002", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56003", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56004", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56005", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56006", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56007", "CYC"))));
        $ic54$ = SubLObjectFactory.makeSymbol("S#56007", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#56006", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#56005", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#56004", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#56003", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#56002", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#56001", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#56000", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#55999", "CYC");
        $ic63$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56008", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56009", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56010", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56011", "CYC")));
        $ic64$ = SubLObjectFactory.makeSymbol("S#56011", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#56010", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#56009", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#56008", "CYC");
        $ic68$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ONE_INTEGER);
        $ic69$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ONE_INTEGER);
        $ic70$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(910)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.TEN_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1110)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ONE_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-100), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeInteger(-5), (SubLObject)SubLObjectFactory.makeInteger(105), (SubLObject)SubLObjectFactory.makeInteger(1000)))), (SubLObject)module0807.T));
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56012", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56013", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56014", "CYC"), (SubLObject)module0807.ZERO_INTEGER));
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56015", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56016", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56017", "CYC"));
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56018", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5849", "CYC"), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56019", "CYC"), (SubLObject)SubLObjectFactory.makeDouble(-9.8)));
        $ic74$ = (SubLFloat)SubLObjectFactory.makeDouble(-9.8);
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56020", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56021", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5849", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56022", "CYC"), (SubLObject)module0807.ONE_INTEGER));
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter"));
        $ic77$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration"));
        $ic78$ = SubLObjectFactory.makeSymbol("S#55931", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.8097835725701669)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(145), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-5)), (SubLObject)ConsesLow.list((SubLObject)module0807.THREE_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(900)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(100)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ONE_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(800)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(190)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.TWO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(10000), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.9272952180016123)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(800), (SubLObject)module0807.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(-9.8)), (SubLObject)ConsesLow.list((SubLObject)module0807.THREE_INTEGER, (SubLObject)module0807.ZERO_INTEGER, (SubLObject)module0807.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(10000)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ZERO_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(9520)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeDouble(630.2)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.ONE_INTEGER)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeInteger(9040)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)module0807.ZERO_INTEGER), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)SubLObjectFactory.makeDouble(1240.8)), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)module0807.TWO_INTEGER)))));
        $ic80$ = SubLObjectFactory.makeSymbol("ACIP-GENERATE-TEST-SUITE-1-SIMULATION-FILE");
        $ic81$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic82$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic83$ = SubLObjectFactory.makeString("observations-~3,'0D");
        $ic84$ = SubLObjectFactory.makeString("txt");
        $ic85$ = SubLObjectFactory.makeInteger(10000);
        $ic86$ = SubLObjectFactory.makeInteger(800);
        $ic87$ = (SubLFloat)SubLObjectFactory.makeDouble(0.9272952180016123);
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIP-Radar-001"));
        $ic89$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic90$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic91$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic92$ = SubLObjectFactory.makeString(";; ACIP Defender Observation Simulation File");
        $ic93$ = SubLObjectFactory.makeString("~%;; Test Suite 1 :");
        $ic94$ = SubLObjectFactory.makeString("~%;;   observations       : ~D total");
        $ic95$ = SubLObjectFactory.makeString("~%;;   first observation  : ~D second~:P");
        $ic96$ = SubLObjectFactory.makeString("~%;;   observation freq.  : ~D second~:P");
        $ic97$ = SubLObjectFactory.makeSymbol("ACIP-GENERATE-TEST-SUITE-2-SIMULATION-FILE");
        $ic98$ = (SubLFloat)SubLObjectFactory.makeDouble(65.3);
        $ic99$ = SubLObjectFactory.makeString("~%;; Test Suite 2 :");
        $ic100$ = SubLObjectFactory.makeString("~%;;   observation freq.  : ~S second~:P");
        $ic101$ = SubLObjectFactory.makeSymbol("ACIP-GENERATE-TEST-SUITE-3-SIMULATION-FILE");
        $ic102$ = SubLObjectFactory.makeString("observations-~2,'0D-~3,'0D");
        $ic103$ = SubLObjectFactory.makeInteger(100);
        $ic104$ = SubLObjectFactory.makeInteger(1000);
        $ic105$ = SubLObjectFactory.makeSymbol("S#55932", "CYC");
        $ic106$ = SubLObjectFactory.makeString("~%;; Test Suite 3 :");
        $ic107$ = SubLObjectFactory.makeString("~%;;   traces             : ~D total");
        $ic108$ = SubLObjectFactory.makeString("~%;;   observations       : ~D per trace, ~D total");
        $ic109$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sensorObservation")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56023", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56024", "CYC")))));
        $ic110$ = SubLObjectFactory.makeSymbol("S#56024", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#56023", "CYC");
        $ic112$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sensorObservation")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56025", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56026", "CYC")))));
        $ic113$ = SubLObjectFactory.makeSymbol("S#56026", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#56025", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#55962", "CYC");
        $ic116$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPDefenderObservationMt"));
        $ic117$ = SubLObjectFactory.makeSymbol("ACIP-RUN-DEFENDER-SIMULATION-FILE");
        $ic118$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic119$ = SubLObjectFactory.makeString("cdolist");
        $ic120$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ballisticPathSensorCorroborationCount")), (SubLObject)SubLObjectFactory.makeSymbol("?PATH"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM"));
        $ic121$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPDefenderModelMt"));
        $ic122$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0807.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)SubLObjectFactory.makeDouble(1.0), (SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PATH"), (SubLObject)SubLObjectFactory.makeSymbol("?PATH"), (SubLObject)SubLObjectFactory.makeKeyword("OBSERVATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM"))));
        $ic123$ = SubLObjectFactory.makeString("~%Total time                         : ~6,' D seconds");
        $ic124$ = SubLObjectFactory.makeSymbol("S#55939", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic126$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic127$ = SubLObjectFactory.makeKeyword("EOF");
        $ic128$ = SubLObjectFactory.makeSymbol("S#55963", "CYC");
        $ic129$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic130$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("sensorObservation"));
        $ic131$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPWorldBackgroundMt"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPGameBackgroundMt"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPGameDataMt"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPDefenderTheoryMt"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPDefenderWorldStateMt"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPDefenderObservationMt"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIPDefenderModelMt"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ListOf2RealNumbers"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ListOf3RealNumbers"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Path-4D"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Place-4D"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuadraticCurve-3D"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("RailroadGun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Dora-RailroadGun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Darla-RailroadGun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ANSPS-49-Radar"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuantityNumberFn"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4Fn"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Path4Fn"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quad3DFn"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Point4TimeFn"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuadCoeffFn"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("arbitraryPath4DOrdering"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ballisticPathSensorCorroborationCount"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("candidatePath"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("candidatePathTriple"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals-Quad3D"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("implausibleBallisticPathCoefficients"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("onBallisticPath"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("place4Altitude"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("place4Latitude"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("place4Longitude"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("place4Time"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("plausibleBallisticPath"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("point4LaterThan"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("pointMatchesQuad3D"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("representativeBallisticPath"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("sensorObservation"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ACIP-Radar-001"))) });
        $ic132$ = SubLObjectFactory.makeSymbol("SAVE-ACIP-PARTITION");
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Meter"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration"))));
        $ic134$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LIST-HASHING"), (SubLObject)SubLObjectFactory.makeKeyword("UNIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("PATTERN-MATCH"), (SubLObject)SubLObjectFactory.makeKeyword("TACTIC-GENERATION"));
        $ic135$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#56027", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic136$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBKERNEL"), (SubLObject)SubLObjectFactory.makeKeyword("FILENAME"));
        $ic137$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic138$ = SubLObjectFactory.makeKeyword("SUBKERNEL");
        $ic139$ = SubLObjectFactory.makeKeyword("FILENAME");
        $ic140$ = SubLObjectFactory.makeUninternedSymbol("US#52E0C26");
        $ic141$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic142$ = SubLObjectFactory.makeUninternedSymbol("US#541F852");
        $ic143$ = SubLObjectFactory.makeSymbol("CLET");
        $ic144$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic145$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55941", "CYC"));
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $ic147$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic148$ = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic149$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT"));
        $ic150$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic151$ = SubLObjectFactory.makeSymbol("S#1952", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#1951", "CYC");
        $ic153$ = SubLObjectFactory.makeSymbol("S#2094", "CYC");
        $ic154$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#1952", "CYC"), (SubLObject)module0807.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#1951", "CYC"), (SubLObject)module0807.NIL));
        $ic155$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic156$ = SubLObjectFactory.makeString("File ~S not found.");
        $ic157$ = SubLObjectFactory.makeString("Performing ");
        $ic158$ = SubLObjectFactory.makeString(" trial");
        $ic159$ = SubLObjectFactory.makeString("s");
        $ic160$ = SubLObjectFactory.makeString("");
        $ic161$ = SubLObjectFactory.makeString(" of subkernel");
        $ic162$ = SubLObjectFactory.makeKeyword("LIST-HASHING");
        $ic163$ = SubLObjectFactory.makeKeyword("UNIFICATION");
        $ic164$ = SubLObjectFactory.makeKeyword("PATTERN-MATCH");
        $ic165$ = SubLObjectFactory.makeKeyword("TACTIC-GENERATION");
        $ic166$ = SubLObjectFactory.makeString("Time to support ~S subkernel.");
        $ic167$ = SubLObjectFactory.makeInteger(2000);
        $ic168$ = SubLObjectFactory.makeString("Actual hash code ~S differs from expected hash code ~S");
        $ic169$ = SubLObjectFactory.makeInteger(200);
        $ic170$ = SubLObjectFactory.makeString("Actual bindings ~S differs from expected bindings ~S");
        $ic171$ = SubLObjectFactory.makeString("Actual result ~S differs from expected result ~S");
        $ic172$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56028", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56029", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56030", "CYC"));
        $ic173$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56031", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56032", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56033", "CYC"));
        $ic174$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS"));
        $ic175$ = SubLObjectFactory.makeSymbol("HL-MODULE-NAME");
        $ic176$ = SubLObjectFactory.makeSymbol("S#14901", "CYC");
        $ic177$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25691", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0807.class
	Total time: 773 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/