package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0236 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0236";
    public static final String myFingerPrint = "1df0df186cdc421aaed8bb7dbe263defd8d69a0944616d601e4abb21381cc671";
    private static SubLSymbol $g2441$;
    public static SubLSymbol $g2442$;
    public static SubLSymbol $g2443$;
    private static final SubLString $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
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
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLInteger $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    
    public static SubLObject f15524(final SubLObject var1, final SubLObject var2) {
        f15525(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15526(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX18283_native.class) ? T : NIL);
    }
    
    public static SubLObject f15527(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f15528(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f15529(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f15530(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f15531(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f15532(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f15533(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f15534(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f15535(final SubLObject var1) {
        assert NIL != f15526(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f15536(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f15537(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f15538(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f15539(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f15540(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f15541(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f15542(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f15543(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f15544(final SubLObject var1, final SubLObject var4) {
        assert NIL != f15526(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f15545(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX18283_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic32$)) {
                f15536(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic33$)) {
                f15537(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic34$)) {
                f15538(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f15539(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f15540(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic37$)) {
                f15541(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f15542(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f15543(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f15544(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic41$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f15546(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)NINE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic32$, f15527(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic33$, f15528(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic34$, f15529(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic35$, f15530(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic36$, f15531(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic37$, f15532(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic38$, f15533(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic39$, f15534(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic40$, f15535(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic43$, (SubLObject)NINE_INTEGER);
        return var11;
    }
    
    public static SubLObject f15547(final SubLObject var11, final SubLObject var12) {
        return f15546(var11, var12);
    }
    
    public static SubLObject f15548(final SubLObject var13, SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = module0093.$g1217$.getDynamicValue();
        }
        if (var17 == UNPROVIDED) {
            var17 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic47$;
        }
        final SubLObject var19 = f15545((SubLObject)UNPROVIDED);
        f15538(var19, var13);
        f15539(var19, var14);
        f15540(var19, var15);
        f15541(var19, var16);
        f15542(var19, var17);
        f15543(var19, var18);
        f15544(var19, (SubLObject)NIL);
        f15549(var19);
        return var19;
    }
    
    public static SubLObject f15525(final SubLObject var20, final SubLObject var2, final SubLObject var21) {
        if (NIL != f15526(var20)) {
            PrintLow.format(var2, (SubLObject)$ic48$, f15529(var20));
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic49$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15549(final SubLObject var22) {
        assert NIL != f15526(var22) : var22;
        return f15550(var22, (SubLObject)NIL);
    }
    
    public static SubLObject f15550(final SubLObject var22, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (NIL == var23) {
            f15537(var22, Hashtables.make_hash_table((SubLObject)ZERO_INTEGER, f15533(var22), (SubLObject)UNPROVIDED));
        }
        if (NIL == Filesys.probe_file(f15529(var22))) {
            return (SubLObject)NIL;
        }
        final SubLObject var25 = module0093.$g1217$.currentBinding(var24);
        try {
            module0093.$g1217$.bind(f15532(var22), var24);
            f15536(var22, module0093.f6613(f15529(var22), f15533(var22), f15534(var22)));
            if (NIL == var23 && NIL != f15530(var22)) {
                f15551(var22);
            }
        }
        finally {
            module0093.$g1217$.rebind(var25, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15552(final SubLObject var22, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != f15526(var22) : var22;
        final SubLObject var28 = $g2441$.getGlobalValue();
        SubLObject var29 = (SubLObject)NIL;
        try {
            var29 = Locks.seize_lock(var28);
            SubLObject var30 = (SubLObject)NIL;
            try {
                var27.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var31 = Errors.$error_handler$.currentBinding(var27);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic50$, var27);
                    try {
                        f15544(var22, (SubLObject)T);
                        if (NIL != var26) {
                            f15538(var22, var26);
                        }
                        final SubLObject var32 = (SubLObject)T;
                        f15550(var22, var32);
                    }
                    catch (Throwable var33) {
                        Errors.handleThrowable(var33, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var31, var27);
                }
            }
            catch (Throwable var34) {
                var30 = Errors.handleThrowable(var34, module0003.$g3$.getGlobalValue());
            }
            finally {
                var27.throwStack.pop();
            }
            if (NIL != var30) {
                Errors.warn(var30);
            }
            f15544(var22, (SubLObject)NIL);
        }
        finally {
            if (NIL != var29) {
                Locks.release_lock(var28);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15553(final SubLObject var22, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != f15526(var22) : var22;
        final SubLObject var28 = $g2441$.getGlobalValue();
        SubLObject var29 = (SubLObject)NIL;
        try {
            var29 = Locks.seize_lock(var28);
            SubLObject var30 = (SubLObject)NIL;
            try {
                var27.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var31 = Errors.$error_handler$.currentBinding(var27);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic50$, var27);
                    try {
                        f15544(var22, (SubLObject)T);
                        if (NIL != f15527(var22)) {
                            module0093.f6615(f15527(var22));
                        }
                        if (NIL != var26) {
                            f15538(var22, var26);
                        }
                        f15536(var22, (SubLObject)NIL);
                        f15537(var22, (SubLObject)NIL);
                        f15549(var22);
                    }
                    catch (Throwable var32) {
                        Errors.handleThrowable(var32, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var31, var27);
                }
            }
            catch (Throwable var33) {
                var30 = Errors.handleThrowable(var33, module0003.$g3$.getGlobalValue());
            }
            finally {
                var27.throwStack.pop();
            }
            if (NIL != var30) {
                Errors.warn(var30);
            }
            f15544(var22, (SubLObject)NIL);
        }
        finally {
            if (NIL != var29) {
                Locks.release_lock(var28);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15554(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = $g2441$.getGlobalValue();
        SubLObject var25 = (SubLObject)NIL;
        try {
            var25 = Locks.seize_lock(var24);
            SubLObject var26 = (SubLObject)NIL;
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var27 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic50$, var23);
                    try {
                        if (NIL != f15527(var22)) {
                            module0093.f6615(f15527(var22));
                        }
                        f15536(var22, (SubLObject)NIL);
                        f15537(var22, (SubLObject)NIL);
                    }
                    catch (Throwable var28) {
                        Errors.handleThrowable(var28, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var27, var23);
                }
            }
            catch (Throwable var29) {
                var26 = Errors.handleThrowable(var29, module0003.$g3$.getGlobalValue());
            }
            finally {
                var23.throwStack.pop();
            }
            if (NIL != var26) {
                Errors.warn(var26);
            }
        }
        finally {
            if (NIL != var25) {
                Locks.release_lock(var24);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15555(final SubLObject var22, final SubLObject var36) {
        final SubLObject var37 = $g2441$.getGlobalValue();
        SubLObject var38 = (SubLObject)NIL;
        try {
            var38 = Locks.seize_lock(var37);
            f15536(var22, module0093.f6495(f15527(var22), var36));
        }
        finally {
            if (NIL != var38) {
                Locks.release_lock(var37);
            }
        }
        return var22;
    }
    
    public static SubLObject f15556(final SubLObject var22) {
        module0093.f6496(f15527(var22));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15557(final SubLObject var22) {
        return module0093.f6497(f15527(var22));
    }
    
    public static SubLObject f15551(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert NIL != f15526(var22) : var22;
        if (!f15532(var22).numGE((SubLObject)$ic51$)) {
            return (SubLObject)NIL;
        }
        if (NIL != f15531(var22)) {
            final SubLObject var24 = f15527(var22);
            final SubLObject var25 = (SubLObject)$ic52$;
            final SubLObject var26 = module0173.f10962();
            SubLObject var27 = (SubLObject)ZERO_INTEGER;
            final SubLObject var28 = module0012.$g75$.currentBinding(var23);
            final SubLObject var29 = module0012.$g76$.currentBinding(var23);
            final SubLObject var30 = module0012.$g77$.currentBinding(var23);
            final SubLObject var31 = module0012.$g78$.currentBinding(var23);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var23);
                module0012.$g76$.bind((SubLObject)NIL, var23);
                module0012.$g77$.bind((SubLObject)T, var23);
                module0012.$g78$.bind(Time.get_universal_time(), var23);
                module0012.f478(var25);
                SubLObject var32 = module0173.f10961();
                SubLObject var33 = (SubLObject)NIL;
                var33 = var32.first();
                while (NIL != var32) {
                    final SubLObject var34 = var33;
                    if (NIL == module0065.f4772(var34, (SubLObject)$ic53$)) {
                        final SubLObject var49_50 = var34;
                        if (NIL == module0065.f4775(var49_50, (SubLObject)$ic53$)) {
                            final SubLObject var35 = module0065.f4740(var49_50);
                            final SubLObject var36 = (SubLObject)NIL;
                            SubLObject var37;
                            SubLObject var38;
                            SubLObject var39;
                            SubLObject var40;
                            for (var37 = Sequences.length(var35), var38 = (SubLObject)NIL, var38 = (SubLObject)ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER)) {
                                var39 = ((NIL != var36) ? Numbers.subtract(var37, var38, (SubLObject)ONE_INTEGER) : var38);
                                var40 = Vectors.aref(var35, var39);
                                if (NIL == module0065.f4749(var40) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                                    if (NIL != module0065.f4749(var40)) {
                                        var40 = (SubLObject)$ic53$;
                                    }
                                    var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var27, var26);
                                    module0093.f6621(var40, var24, (SubLObject)UNPROVIDED);
                                }
                            }
                        }
                        final SubLObject var57_58 = var34;
                        if (NIL == module0065.f4777(var57_58) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                            final SubLObject var41 = module0065.f4738(var57_58);
                            SubLObject var42 = module0065.f4739(var57_58);
                            final SubLObject var43 = module0065.f4734(var57_58);
                            final SubLObject var44 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic53$)) ? NIL : $ic53$);
                            while (var42.numL(var43)) {
                                final SubLObject var45 = Hashtables.gethash_without_values(var42, var41, var44);
                                if (NIL == module0065.f4773((SubLObject)$ic53$) || NIL == module0065.f4749(var45)) {
                                    var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var27, var26);
                                    module0093.f6621(var45, var24, (SubLObject)UNPROVIDED);
                                }
                                var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    var32 = var32.rest();
                    var33 = var32.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var31, var23);
                module0012.$g77$.rebind(var30, var23);
                module0012.$g76$.rebind(var29, var23);
                module0012.$g75$.rebind(var28, var23);
            }
        }
        else {
            SubLObject var46 = (SubLObject)NIL;
            SubLObject var50;
            for (SubLObject var47 = (SubLObject)NIL; NIL == var47; var47 = Types.sublisp_null(var50)) {
                var23.resetMultipleValues();
                final SubLObject var48 = module0093.f6665(f15527(var22), var46, (SubLObject)NIL);
                final SubLObject var49 = var23.secondMultipleValue();
                var50 = var23.thirdMultipleValue();
                var23.resetMultipleValues();
                if (NIL != var50) {
                    final SubLObject var51 = var48;
                    final SubLObject var52 = var49;
                }
                var46 = var50;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15558(final SubLObject var67, final SubLObject var22, SubLObject var69, SubLObject var70) {
        if (var69 == UNPROVIDED) {
            var69 = (SubLObject)$ic54$;
        }
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)T;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        while (NIL != f15535(var22)) {
            Threads.sleep((SubLObject)ZERO_INTEGER);
        }
        final SubLObject var72 = Hashtables.gethash(var67, f15528(var22), (SubLObject)$ic55$);
        if (var72 != $ic55$) {
            return var72;
        }
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        final SubLObject var75 = f15527(var22);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var71) && NIL == module0093.f6457(var75)) {
            Errors.error((SubLObject)$ic56$, var22);
        }
        try {
            var71.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var76 = Errors.$error_handler$.currentBinding(var71);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic50$, var71);
                try {
                    var74 = module0093.f6621(var67, var75, var69);
                }
                catch (Throwable var77) {
                    Errors.handleThrowable(var77, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var76, var71);
            }
        }
        catch (Throwable var78) {
            var73 = Errors.handleThrowable(var78, module0003.$g3$.getGlobalValue());
        }
        finally {
            var71.throwStack.pop();
        }
        if (NIL != var73) {
            if (NIL == var70) {
                Errors.error(var73);
            }
            SubLObject var79 = (SubLObject)NIL;
            try {
                var71.throwStack.push($ic57$);
                final SubLObject var80 = Errors.$error_handler$.currentBinding(var71);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic58$), var71);
                    try {
                        module0093.f6615(var75);
                    }
                    catch (Throwable var81) {
                        Errors.handleThrowable(var81, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var80, var71);
                }
            }
            catch (Throwable var82) {
                var79 = Errors.handleThrowable(var82, (SubLObject)$ic57$);
            }
            finally {
                var71.throwStack.pop();
            }
            f15549(var22);
            var74 = module0093.f6621(var67, var75, var69);
        }
        return var74;
    }
    
    public static SubLObject f15559(final SubLObject var67, final SubLObject var68, final SubLObject var22) {
        while (NIL != f15535(var22)) {
            Threads.sleep((SubLObject)ZERO_INTEGER);
        }
        return Hashtables.sethash(var67, f15528(var22), var68);
    }
    
    public static SubLObject f15560(final SubLObject var22) {
        return f15529(var22);
    }
    
    public static SubLObject f15561(final SubLObject var22) {
        return Hashtables.hash_table_count(f15528(var22));
    }
    
    public static SubLObject f15562(final SubLObject var22, final SubLObject var73, SubLObject var74, SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var74 == UNPROVIDED) {
            var74 = (SubLObject)NIL;
        }
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)$ic59$;
        }
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)NIL;
        }
        assert NIL != f15526(var22) : var22;
        if (NIL != module0012.f421(var74)) {
            var74 = module0021.f1153();
        }
        if (NIL != module0012.f421(var75)) {
            var75 = module0021.f1153();
        }
        return f15563(var22, var73, var74, var75, var76, var77);
    }
    
    public static SubLObject f15563(final SubLObject var22, final SubLObject var73, final SubLObject var74, final SubLObject var75, final SubLObject var76, final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = f15533(var22);
        final SubLObject var80 = f15534(var22);
        final SubLObject var81 = f15528(var22);
        final SubLObject var82 = Symbols.make_symbol((SubLObject)$ic60$);
        SubLObject var83 = (SubLObject)NIL;
        final SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = module0021.$g777$.currentBinding(var78);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var78);
            module0021.f1151(var75);
            var83 = module0093.f6656(var73, var76, var79, var80);
        }
        finally {
            module0021.$g777$.rebind(var85, var78);
        }
        var85 = module0021.$g777$.currentBinding(var78);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var78);
            module0021.f1151(var74);
            final SubLObject var86 = f15527(var22);
            module0012.$g82$.setDynamicValue(var77, var78);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var78);
            module0012.$g83$.setDynamicValue(module0093.f6612(var86), var78);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var78);
            final SubLObject var25_84 = module0012.$g75$.currentBinding(var78);
            final SubLObject var87 = module0012.$g76$.currentBinding(var78);
            final SubLObject var88 = module0012.$g77$.currentBinding(var78);
            final SubLObject var89 = module0012.$g78$.currentBinding(var78);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var78);
                module0012.$g76$.bind((SubLObject)NIL, var78);
                module0012.$g77$.bind((SubLObject)T, var78);
                module0012.$g78$.bind(Time.get_universal_time(), var78);
                module0012.f478(module0012.$g82$.getDynamicValue(var78));
                SubLObject var90 = (SubLObject)NIL;
                SubLObject var94;
                for (SubLObject var91 = (SubLObject)NIL; NIL == var91; var91 = Types.sublisp_null(var94)) {
                    var78.resetMultipleValues();
                    final SubLObject var92 = module0093.f6632(var86, var90, (SubLObject)NIL);
                    final SubLObject var93 = var78.secondMultipleValue();
                    var94 = var78.thirdMultipleValue();
                    var78.resetMultipleValues();
                    if (NIL != var94) {
                        final SubLObject var95 = var92;
                        final SubLObject var96 = var93;
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var78), module0012.$g83$.getDynamicValue(var78));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var78), (SubLObject)ONE_INTEGER), var78);
                        final SubLObject var97 = Hashtables.gethash_without_values(var95, var81, var82);
                        final SubLObject var98 = var82.eql(var97) ? var96 : var97;
                        final SubLObject var25_85 = module0021.$g777$.currentBinding(var78);
                        try {
                            module0021.$g777$.bind((SubLObject)NIL, var78);
                            module0021.f1151(var75);
                            module0093.f6657(var95, var83, var96);
                        }
                        finally {
                            module0021.$g777$.rebind(var25_85, var78);
                        }
                    }
                    var90 = var94;
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var89, var78);
                module0012.$g77$.rebind(var88, var78);
                module0012.$g76$.rebind(var87, var78);
                module0012.$g75$.rebind(var25_84, var78);
            }
        }
        finally {
            module0021.$g777$.rebind(var85, var78);
        }
        module0093.f6658(var83, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var73;
    }
    
    public static SubLObject f15564() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15524", "S#18285", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15526", "S#18284", 1, 0, false);
        new $f15526$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15527", "S#18286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15528", "S#18287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15529", "S#18288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15530", "S#18289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15531", "S#18290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15532", "S#18291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15533", "S#18292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15534", "S#18293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15535", "S#18294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15536", "S#18295", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15537", "S#18296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15538", "S#18297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15539", "S#18298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15540", "S#18299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15541", "S#18300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15542", "S#18301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15543", "S#18302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15544", "S#18303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15545", "S#18304", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15546", "S#18305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15547", "S#18306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15548", "S#18307", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15525", "S#18308", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15549", "S#18309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15550", "S#18310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15552", "S#18311", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15553", "S#18312", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15554", "S#18313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15555", "S#18314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15556", "S#18315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15557", "S#18316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15551", "S#18317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15558", "S#18318", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15559", "S#18319", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15560", "S#18320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15561", "S#18321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15562", "S#18322", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0236", "f15563", "S#18323", 6, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15565() {
        $g2441$ = SubLFiles.deflexical("S#18324", Locks.make_lock((SubLObject)$ic0$));
        $g2442$ = SubLFiles.deflexical("S#18325", module0073.f5143((SubLObject)($ic1$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic1$) : $ic1$), (SubLObject)$ic2$, (SubLObject)($ic3$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic3$) : $ic3$), (SubLObject)$ic4$, (SubLObject)UNPROVIDED));
        $g2443$ = SubLFiles.defconstant("S#18326", (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15566() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2443$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic12$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Structures.def_csetf((SubLObject)$ic26$, (SubLObject)$ic27$);
        Structures.def_csetf((SubLObject)$ic28$, (SubLObject)$ic29$);
        Structures.def_csetf((SubLObject)$ic30$, (SubLObject)$ic31$);
        Equality.identity((SubLObject)$ic5$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2443$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic46$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15564();
    }
    
    public void initializeVariables() {
        f15565();
    }
    
    public void runTopLevelForms() {
        f15566();
    }
    
    static {
        me = (SubLFile)new module0236();
        $g2441$ = null;
        $g2442$ = null;
        $g2443$ = null;
        $ic0$ = makeString("fbc-reset-lock");
        $ic1$ = ConsesLow.list((SubLObject)makeString("application.file-backed-cache.base-path"));
        $ic2$ = makeSymbol("S#18325", "CYC");
        $ic3$ = makeString("data/caches/");
        $ic4$ = makeKeyword("LEXICAL");
        $ic5$ = makeSymbol("S#18283", "CYC");
        $ic6$ = makeSymbol("S#18284", "CYC");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#18327", "CYC"), makeSymbol("S#18328", "CYC"), makeSymbol("S#8188", "CYC"), makeSymbol("S#18329", "CYC"), makeSymbol("S#18330", "CYC"), makeSymbol("S#18331", "CYC"), makeSymbol("S#122", "CYC"), makeSymbol("S#4785", "CYC"), makeSymbol("S#18332", "CYC") });
        $ic8$ = ConsesLow.list(new SubLObject[] { makeKeyword("FILE-HASH-TABLE-CACHE"), makeKeyword("LOCAL-CACHE"), makeKeyword("FILE-HASH-TABLE-PATH"), makeKeyword("SHOULD-PRELOAD-CACHE"), makeKeyword("IS-FORT-CACHE"), makeKeyword("FHT-CACHE-PERCENTAGE"), makeKeyword("TEST"), makeKeyword("MODE"), makeKeyword("IS-BUSY") });
        $ic9$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#18286", "CYC"), makeSymbol("S#18287", "CYC"), makeSymbol("S#18288", "CYC"), makeSymbol("S#18289", "CYC"), makeSymbol("S#18290", "CYC"), makeSymbol("S#18291", "CYC"), makeSymbol("S#18292", "CYC"), makeSymbol("S#18293", "CYC"), makeSymbol("S#18294", "CYC") });
        $ic10$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#18295", "CYC"), makeSymbol("S#18296", "CYC"), makeSymbol("S#18297", "CYC"), makeSymbol("S#18298", "CYC"), makeSymbol("S#18299", "CYC"), makeSymbol("S#18300", "CYC"), makeSymbol("S#18301", "CYC"), makeSymbol("S#18302", "CYC"), makeSymbol("S#18303", "CYC") });
        $ic11$ = makeSymbol("S#18308", "CYC");
        $ic12$ = makeSymbol("S#18285", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#18284", "CYC"));
        $ic14$ = makeSymbol("S#18286", "CYC");
        $ic15$ = makeSymbol("S#18295", "CYC");
        $ic16$ = makeSymbol("S#18287", "CYC");
        $ic17$ = makeSymbol("S#18296", "CYC");
        $ic18$ = makeSymbol("S#18288", "CYC");
        $ic19$ = makeSymbol("S#18297", "CYC");
        $ic20$ = makeSymbol("S#18289", "CYC");
        $ic21$ = makeSymbol("S#18298", "CYC");
        $ic22$ = makeSymbol("S#18290", "CYC");
        $ic23$ = makeSymbol("S#18299", "CYC");
        $ic24$ = makeSymbol("S#18291", "CYC");
        $ic25$ = makeSymbol("S#18300", "CYC");
        $ic26$ = makeSymbol("S#18292", "CYC");
        $ic27$ = makeSymbol("S#18301", "CYC");
        $ic28$ = makeSymbol("S#18293", "CYC");
        $ic29$ = makeSymbol("S#18302", "CYC");
        $ic30$ = makeSymbol("S#18294", "CYC");
        $ic31$ = makeSymbol("S#18303", "CYC");
        $ic32$ = makeKeyword("FILE-HASH-TABLE-CACHE");
        $ic33$ = makeKeyword("LOCAL-CACHE");
        $ic34$ = makeKeyword("FILE-HASH-TABLE-PATH");
        $ic35$ = makeKeyword("SHOULD-PRELOAD-CACHE");
        $ic36$ = makeKeyword("IS-FORT-CACHE");
        $ic37$ = makeKeyword("FHT-CACHE-PERCENTAGE");
        $ic38$ = makeKeyword("TEST");
        $ic39$ = makeKeyword("MODE");
        $ic40$ = makeKeyword("IS-BUSY");
        $ic41$ = makeString("Invalid slot ~S for construction function");
        $ic42$ = makeKeyword("BEGIN");
        $ic43$ = makeSymbol("S#18304", "CYC");
        $ic44$ = makeKeyword("SLOT");
        $ic45$ = makeKeyword("END");
        $ic46$ = makeSymbol("S#18306", "CYC");
        $ic47$ = makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $ic48$ = makeString("<FILE-BACKED-CACHE ~A>");
        $ic49$ = makeString("<INVALID FILE-BACKED-CACHE>");
        $ic50$ = makeSymbol("S#38", "CYC");
        $ic51$ = makeInteger(100);
        $ic52$ = makeString("Preloading file-backed cache.");
        $ic53$ = makeKeyword("SKIP");
        $ic54$ = makeKeyword("NOT-FOUND");
        $ic55$ = makeKeyword("FBC-NOT-FOUND-VALUE");
        $ic56$ = makeString("~S has no associated file hash table.");
        $ic57$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic58$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic59$ = makeString("tmp/");
        $ic60$ = makeString("The Not Present Marker");
    }
    
    public static final class $sX18283_native extends SubLStructNative
    {
        public SubLObject $file_hash_table_cache;
        public SubLObject $local_cache;
        public SubLObject $file_hash_table_path;
        public SubLObject $should_preload_cache;
        public SubLObject $is_fort_cache;
        public SubLObject $fht_cache_percentage;
        public SubLObject $test;
        public SubLObject $mode;
        public SubLObject $is_busy;
        private static final SubLStructDeclNative structDecl;
        
        public $sX18283_native() {
            this.$file_hash_table_cache = (SubLObject)CommonSymbols.NIL;
            this.$local_cache = (SubLObject)CommonSymbols.NIL;
            this.$file_hash_table_path = (SubLObject)CommonSymbols.NIL;
            this.$should_preload_cache = (SubLObject)CommonSymbols.NIL;
            this.$is_fort_cache = (SubLObject)CommonSymbols.NIL;
            this.$fht_cache_percentage = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$mode = (SubLObject)CommonSymbols.NIL;
            this.$is_busy = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX18283_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$file_hash_table_cache;
        }
        
        public SubLObject getField3() {
            return this.$local_cache;
        }
        
        public SubLObject getField4() {
            return this.$file_hash_table_path;
        }
        
        public SubLObject getField5() {
            return this.$should_preload_cache;
        }
        
        public SubLObject getField6() {
            return this.$is_fort_cache;
        }
        
        public SubLObject getField7() {
            return this.$fht_cache_percentage;
        }
        
        public SubLObject getField8() {
            return this.$test;
        }
        
        public SubLObject getField9() {
            return this.$mode;
        }
        
        public SubLObject getField10() {
            return this.$is_busy;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$file_hash_table_cache = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$local_cache = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$file_hash_table_path = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$should_preload_cache = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$is_fort_cache = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$fht_cache_percentage = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$mode = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$is_busy = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX18283_native.class, $ic5$, $ic6$, $ic7$, $ic8$, new String[] { "$file_hash_table_cache", "$local_cache", "$file_hash_table_path", "$should_preload_cache", "$is_fort_cache", "$fht_cache_percentage", "$test", "$mode", "$is_busy" }, $ic9$, $ic10$, $ic11$);
        }
    }
    
    public static final class $f15526$UnaryFunction extends UnaryFunction
    {
        public $f15526$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18284"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f15526(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 273 ms
	
	Decompiled with Procyon 0.5.32.
*/