package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0516 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0516";
    public static final String myFingerPrint = "e7b9f7b99b97ddc72117ae545471c286478edb24bcd3417c30a5941d8144c73b";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLString $ic23$;
    
    public static SubLObject f32529(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL == var3) {
            SubLObject var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL == var3 && NIL != var4) {
                if (NIL == f32530(var5)) {
                    var3 = (SubLObject)T;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var3);
    }
    
    public static SubLObject f32530(final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL == module0193.f12105(var5) || NIL != module0208.f13542(var5));
    }
    
    public static SubLObject f32531(final SubLObject var1, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var9;
        final SubLObject var8 = var9 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic6$);
        var10 = var9.first();
        var9 = (var11 = var9.rest());
        final SubLObject var12 = module0592.f36254(var11);
        var7.resetMultipleValues();
        final SubLObject var13 = module0235.f15474(var12, var10, (SubLObject)T, (SubLObject)T);
        final SubLObject var14 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var13) {
            final SubLObject var15 = module0233.f15361(var13, var10);
            final SubLObject var16 = module0202.f12817((SubLObject)ONE_INTEGER, var15, var1);
            return module0347.f23330(module0191.f11990((SubLObject)$ic7$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var13, var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32532(final SubLObject var1, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        SubLObject var8;
        final SubLObject var7 = var8 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic6$);
        var9 = var8.first();
        var8 = (var10 = var8.rest());
        final SubLObject var11 = module0592.f36254(var10);
        if (NIL == Strings.string_equal(var11, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0347.f23330(module0191.f11990((SubLObject)$ic7$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32533(final SubLObject var1, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f32534(var1);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (var8.isString()) {
            SubLObject var10 = (SubLObject)ONE_INTEGER;
            SubLObject var11 = (SubLObject)ZERO_INTEGER;
            SubLObject var12 = var9;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                if (var13.isString()) {
                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                    final SubLObject var14 = var13;
                    final SubLObject var15 = module0038.f2758(var14, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var16 = Numbers.divide(var15, var11);
                    var10 = Numbers.multiply(var10, var16);
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
            return var10;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32535(final SubLObject var1, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0208.f13537(module0205.f13387(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        var7.resetMultipleValues();
        final SubLObject var9 = f32534(var1);
        final SubLObject var10 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (!var9.isString()) {
            return module0052.f3708();
        }
        if (NIL != module0035.f1997(var10)) {
            var7.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var10.first(), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var12 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            return module0052.f3710(module0233.f15361(var11, var1));
        }
        var7.resetMultipleValues();
        final SubLObject var13 = f32536(var9, var10);
        final SubLObject var14 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        return f32537(var9, var10, var14, var13, var1, var8);
    }
    
    public static SubLObject f32537(final SubLObject var12, final SubLObject var19, final SubLObject var30, final SubLObject var31, final SubLObject var1, final SubLObject var27) {
        return module0052.f3689(f32538(var12, var19, var30, var31, var1, var27), (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)$ic18$);
    }
    
    public static SubLObject f32538(final SubLObject var12, final SubLObject var19, final SubLObject var30, final SubLObject var31, final SubLObject var1, final SubLObject var27) {
        return (SubLObject)ConsesLow.list(var12, var19, var30, var31, var1, var27);
    }
    
    public static SubLObject f32539(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)$ic19$);
        var33 = var32.first();
        SubLObject var39 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var34 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var35 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var36 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var37 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var38 = var39.first();
        var39 = var39.rest();
        if (NIL == var39) {
            return module0052.f3687(var36);
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic19$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32540(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)$ic19$);
        var33 = var32.first();
        SubLObject var39 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var34 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var35 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var36 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var37 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var38 = var39.first();
        var39 = var39.rest();
        if (NIL == var39) {
            SubLObject var40 = (SubLObject)NIL;
            SubLObject var41 = (SubLObject)NIL;
            while (NIL == var40 && NIL == var41) {
                if (NIL != module0052.f3687(var36)) {
                    var41 = (SubLObject)T;
                }
                else {
                    final SubLObject var42 = module0052.f3693(var36);
                    if (NIL == f32541(var42, var35)) {
                        continue;
                    }
                    final SubLObject var43 = f32542(var33, var34, var42, var38);
                    if (NIL == var43) {
                        continue;
                    }
                    var40 = module0233.f15361(var43, var37);
                }
            }
            return Values.values(var40, var32, var41);
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic19$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32543(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)$ic19$);
        var33 = var32.first();
        SubLObject var39 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var34 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var35 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var36 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var37 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var32, (SubLObject)$ic19$);
        var38 = var39.first();
        var39 = var39.rest();
        if (NIL == var39) {
            return module0052.f3696(var36);
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic19$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32534(final SubLObject var1) {
        final SubLObject var2 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0036.f2531(var2, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
        SubLObject var5;
        final SubLObject var4 = var5 = var3;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic22$);
        var6 = var5.first();
        var5 = (var7 = var5.rest());
        var7 = module0038.f2693(var7);
        var7 = f32544(var7);
        return Values.values(var6, var7);
    }
    
    public static SubLObject f32536(final SubLObject var12, final SubLObject var19) {
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        if (var19.first().isString() && NIL == module0038.f2684(var12, var19.first())) {
            return Values.values(module0052.f3708(), (SubLObject)NIL);
        }
        SubLObject var22 = var19;
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            if (var23.isString()) {
                final SubLObject var24 = var23;
                final SubLObject var25 = module0038.f2689(var24, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var25) {
                    return Values.values(module0052.f3708(), (SubLObject)NIL);
                }
                var20 = (SubLObject)ConsesLow.cons(module0052.f3770(var25), var20);
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        var20 = Sequences.nreverse(var20);
        var21 = Sequences.nreverse(var21);
        final SubLObject var26 = module0052.f3775(var20);
        return Values.values(var26, var21);
    }
    
    public static SubLObject f32541(final SubLObject var38, final SubLObject var11) {
        SubLObject var39 = var38.first();
        SubLObject var40 = var11.first();
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var51_52 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var24_54 = (SubLObject)NIL;
        var42 = var38.rest();
        var51_52 = var42.first();
        var43 = var11.rest();
        var24_54 = var43.first();
        while (NIL != var43 || NIL != var42) {
            if (!var51_52.numGE(Numbers.add(var39, Sequences.length(var40)))) {
                var41 = (SubLObject)T;
            }
            var39 = var51_52;
            var40 = var24_54;
            var42 = var42.rest();
            var51_52 = var42.first();
            var43 = var43.rest();
            var24_54 = var43.first();
        }
        return (SubLObject)makeBoolean(NIL == var41);
    }
    
    public static SubLObject f32542(final SubLObject var12, final SubLObject var19, final SubLObject var38, final SubLObject var27) {
        SubLObject var39 = var38;
        SubLObject var40 = var39.first();
        SubLObject var41 = (SubLObject)ZERO_INTEGER;
        SubLObject var42 = var40;
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = var19;
        SubLObject var45 = (SubLObject)NIL;
        var45 = var44.first();
        while (NIL != var44) {
            if (var45.isString()) {
                var41 = Numbers.add(var41, Sequences.length(var45));
                var39 = var39.rest();
                var40 = var39.first();
                var42 = (SubLObject)((NIL != var40) ? var40 : NIL);
            }
            else {
                var43 = ConsesLow.append(var43, f32545(var12, var45, var41, var42, var27));
                var41 = var42;
            }
            var44 = var44.rest();
            var45 = var44.first();
        }
        return (SubLObject)((NIL != var43) ? ((!var41.isInteger() || NIL != module0035.f1995(var12, var41, (SubLObject)UNPROVIDED)) ? var43 : NIL) : NIL);
    }
    
    public static SubLObject f32545(final SubLObject var12, final SubLObject var59, SubLObject var57, SubLObject var58, final SubLObject var27) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (var58.isInteger() && var58.numG(Sequences.length(var12))) {
            var58 = (SubLObject)NIL;
        }
        if (var57.isInteger() && var58.isInteger() && var57.numG(var58)) {
            var57 = var58;
        }
        final SubLObject var61 = module0038.f2623(var12, var57, var58);
        final SubLObject var62 = (NIL != var27) ? module0208.f13540(var61) : var61;
        var60.resetMultipleValues();
        final SubLObject var63 = module0235.f15474(var59, var62, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var64 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        return var63;
    }
    
    public static SubLObject f32544(final SubLObject var62) {
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = var62;
        SubLObject var66 = (SubLObject)NIL;
        var66 = var65.first();
        while (NIL != var65) {
            if (NIL != module0193.f12106(var66)) {
                if (NIL != var64) {
                    var63 = (SubLObject)ConsesLow.cons((SubLObject)$ic23$, var63);
                    var63 = (SubLObject)ConsesLow.cons(var66, var63);
                }
                else {
                    var63 = (SubLObject)ConsesLow.cons(var66, var63);
                }
                var64 = (SubLObject)T;
            }
            else {
                var63 = (SubLObject)ConsesLow.cons(var66, var63);
                var64 = (SubLObject)NIL;
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        return Sequences.nreverse(var63);
    }
    
    public static SubLObject f32546() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32529", "S#35969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32530", "S#35970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32531", "S#35971", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32532", "S#35972", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32533", "S#35973", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32535", "S#35974", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32537", "S#35975", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32538", "S#35976", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32539", "S#35977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32540", "S#35978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32543", "S#35979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32534", "S#35980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32536", "S#35981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32541", "S#35982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32542", "S#35983", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32545", "S#35984", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0516", "f32544", "S#35985", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32547() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32548() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0012.f419((SubLObject)$ic5$);
        module0012.f419((SubLObject)$ic8$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0012.f419((SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0012.f419((SubLObject)$ic14$);
        module0012.f419((SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32546();
    }
    
    public void initializeVariables() {
        f32547();
    }
    
    public void runTopLevelForms() {
        f32548();
    }
    
    static {
        me = (SubLFile)new module0516();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = makeKeyword("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#35969", "CYC"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35971", "CYC"), makeKeyword("SUPPORT-MT"), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")), makeKeyword("DOCUMENTATION"), makeString("(#$concatenateStrings :not-fully-bound . :fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$concatenateStrings ?X \"foo\" \"bar\")\nwill bind ?X to \"foobar\"") });
        $ic5$ = makeSymbol("S#35969", "CYC");
        $ic6$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#35986", "CYC"));
        $ic7$ = makeKeyword("OPAQUE");
        $ic8$ = makeSymbol("S#35971", "CYC");
        $ic9$ = makeKeyword("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35972", "CYC"), makeKeyword("SUPPORT-MT"), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$concatenateStrings :fully-bound . :fully-bound))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$concatenateStrings \"something unrelated\" \"foo\" \"bar\"))\nwill be provable\n    (#$not (#$concatenateStrings \"foobar\" \"foo\" \"bar\"))\nwill fail to be provable") });
        $ic11$ = makeSymbol("S#35972", "CYC");
        $ic12$ = makeKeyword("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35973", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35974", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")), makeKeyword("DOCUMENTATION"), makeString("(#$concatenateStrings :fully-bound . :not-fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$concatenateStrings \"foobar\" ?X \"o\" ?Z)\nwill bind ?X ?Z to both \"fo\" \"bar\"\nand \"f\" \"obar\".") });
        $ic14$ = makeSymbol("S#35973", "CYC");
        $ic15$ = makeSymbol("S#35974", "CYC");
        $ic16$ = makeSymbol("S#35977", "CYC");
        $ic17$ = makeSymbol("S#35978", "CYC");
        $ic18$ = makeSymbol("S#35979", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#35175", "CYC"), (SubLObject)makeSymbol("S#35987", "CYC"), (SubLObject)makeSymbol("S#35988", "CYC"), (SubLObject)makeSymbol("S#35989", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#35990", "CYC"));
        $ic20$ = makeSymbol("S#16379", "CYC");
        $ic21$ = makeSymbol("NAT-ARG1");
        $ic22$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#35175", "CYC"), (SubLObject)makeSymbol("S#35987", "CYC"));
        $ic23$ = makeString("");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 169 ms
	
	Decompiled with Procyon 0.5.32.
*/