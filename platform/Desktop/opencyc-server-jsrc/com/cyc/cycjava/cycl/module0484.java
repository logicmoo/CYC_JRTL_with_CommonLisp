package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0484 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0484";
    public static final String myFingerPrint = "920442aa96cdbfa70f663829c76d54dde32f1d7230dcfef44b020719c1a69429";
    private static SubLSymbol $g3703$;
    private static SubLSymbol $g3704$;
    private static SubLSymbol $g3705$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    
    public static SubLObject f31899(final SubLObject var1, SubLObject var2) {
        if (var2 == module0484.UNPROVIDED) {
            var2 = (SubLObject)module0484.NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)module0484.UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)module0484.UNPROVIDED);
        if (module0484.NIL != f31900(var3, var4)) {
            final SubLObject var5 = f31901(var3, var4);
            module0347.f23330(var5, (SubLObject)module0484.UNPROVIDED, (SubLObject)module0484.UNPROVIDED);
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31901(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = (SubLObject)ConsesLow.list(module0484.$ic2$, var3, var4);
        return module0191.f11990((SubLObject)module0484.$ic3$, var6, module0147.$g2095$.getDynamicValue(var5), (SubLObject)module0484.$ic4$);
    }
    
    public static SubLObject f31902(final SubLObject var1, SubLObject var2) {
        if (var2 == module0484.UNPROVIDED) {
            var2 = (SubLObject)module0484.NIL;
        }
        final SubLObject var3 = module0202.f12834(var1, (SubLObject)module0484.UNPROVIDED);
        final SubLObject var4 = module0202.f12835(var1, (SubLObject)module0484.UNPROVIDED);
        if (module0484.NIL != f31903(var3, var4)) {
            final SubLObject var5 = f31904(var3, var4);
            module0347.f23330(var5, (SubLObject)module0484.UNPROVIDED, (SubLObject)module0484.UNPROVIDED);
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31904(final SubLObject var8, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = (SubLObject)ConsesLow.list(module0484.$ic7$, var8, var9);
        return module0191.f11990((SubLObject)module0484.$ic3$, var11, module0147.$g2095$.getDynamicValue(var10), (SubLObject)module0484.$ic4$);
    }
    
    public static SubLObject f31903(final SubLObject var8, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0484.NIL;
        SubLObject var12 = (SubLObject)module0484.NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var13 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)module0484.$ic8$, var10);
                try {
                    final SubLObject var12_13 = module0484.$g3705$.currentBinding(var10);
                    try {
                        module0484.$g3705$.bind((SubLObject)module0484.NIL, var10);
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0484.NIL != f31905(var8, var9, (SubLObject)module0484.NIL) && module0484.NIL != f31905(var9, var8, (SubLObject)module0484.NIL));
                    }
                    finally {
                        module0484.$g3705$.rebind(var12_13, var10);
                    }
                }
                catch (Throwable var14) {
                    Errors.handleThrowable(var14, (SubLObject)module0484.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var13, var10);
            }
        }
        catch (Throwable var15) {
            var11 = Errors.handleThrowable(var15, module0003.$g3$.getGlobalValue());
        }
        finally {
            var10.throwStack.pop();
        }
        if (module0484.NIL != var11) {
            return (SubLObject)module0484.NIL;
        }
        return var12;
    }
    
    public static SubLObject f31900(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0484.NIL;
        SubLObject var7 = (SubLObject)module0484.NIL;
        try {
            var5.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var8 = Errors.$error_handler$.currentBinding(var5);
            try {
                Errors.$error_handler$.bind((SubLObject)module0484.$ic8$, var5);
                try {
                    final SubLObject var12_16 = module0484.$g3705$.currentBinding(var5);
                    try {
                        module0484.$g3705$.bind((SubLObject)module0484.NIL, var5);
                        var7 = f31905(var3, var4, (SubLObject)module0484.NIL);
                    }
                    finally {
                        module0484.$g3705$.rebind(var12_16, var5);
                    }
                }
                catch (Throwable var9) {
                    Errors.handleThrowable(var9, (SubLObject)module0484.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var8, var5);
            }
        }
        catch (Throwable var10) {
            var6 = Errors.handleThrowable(var10, module0003.$g3$.getGlobalValue());
        }
        finally {
            var5.throwStack.pop();
        }
        if (module0484.NIL != var6) {
            return (SubLObject)module0484.NIL;
        }
        return var7;
    }
    
    public static SubLObject f31906(final SubLObject var3, final SubLObject var4, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)module0484.NIL;
        final SubLObject var20 = module0147.f9540(var17);
        final SubLObject var21 = module0147.$g2095$.currentBinding(var18);
        final SubLObject var22 = module0147.$g2094$.currentBinding(var18);
        final SubLObject var23 = module0147.$g2096$.currentBinding(var18);
        try {
            module0147.$g2095$.bind(module0147.f9545(var20), var18);
            module0147.$g2094$.bind(module0147.f9546(var20), var18);
            module0147.$g2096$.bind(module0147.f9549(var20), var18);
            var19 = f31900(var3, var4);
        }
        finally {
            module0147.$g2096$.rebind(var23, var18);
            module0147.$g2094$.rebind(var22, var18);
            module0147.$g2095$.rebind(var21, var18);
        }
        return var19;
    }
    
    public static SubLObject f31907(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = conses_high.assoc(var22, module0484.$g3705$.getDynamicValue(var23), (SubLObject)module0484.UNPROVIDED, (SubLObject)module0484.UNPROVIDED);
        if (module0484.NIL != var24) {
            return var24.rest();
        }
        final SubLObject var25 = module0269.f17760(var22);
        module0484.$g3705$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var22, var25), module0484.$g3705$.getDynamicValue(var23)), var23);
        return var25;
    }
    
    public static SubLObject f31905(SubLObject var3, SubLObject var4, final SubLObject var24) {
        if (var3.equal(var4)) {
            return (SubLObject)module0484.T;
        }
        if (module0484.NIL != module0167.f10813(var3)) {
            return f31905(module0172.f10915(var3), var4, var24);
        }
        if (module0484.NIL != module0167.f10813(var4)) {
            return f31905(var3, module0172.f10915(var4), var24);
        }
        if (var3.isAtom()) {
            return f31908(var3, var4, var24);
        }
        var3 = f31909(f31910(var3));
        var4 = f31909(f31910(var4));
        final SubLObject var26;
        final SubLObject var25 = var26 = var3.first();
        if (var26.eql(module0484.$ic9$)) {
            return f31911(var3, var4, var24);
        }
        if (var26.eql(module0484.$ic10$)) {
            return f31912(var3, var4, var24);
        }
        if (var26.eql(module0484.$ic11$)) {
            return f31913(var3, var4, var24);
        }
        if (var26.eql(module0484.$ic12$)) {
            return f31914(var3, var4, var24);
        }
        if (var26.eql(module0484.$ic13$)) {
            return f31915(var3, var4, var24);
        }
        if (var26.eql(module0484.$ic14$)) {
            return f31916(var3, var4, var24);
        }
        return f31917(var3, var4, var24);
    }
    
    public static SubLObject f31909(final SubLObject var27) {
        if (module0484.$ic11$.eql(module0205.f13136(var27)) && module0484.$ic11$.eql(module0205.f13136(module0205.f13203(var27, (SubLObject)module0484.UNPROVIDED)))) {
            return f31909(module0205.f13203(module0205.f13203(var27, (SubLObject)module0484.UNPROVIDED), (SubLObject)module0484.UNPROVIDED));
        }
        return var27;
    }
    
    public static SubLObject f31910(final SubLObject var27) {
        return (SubLObject)(module0484.$ic15$.eql(module0205.f13136(var27)) ? ConsesLow.list(module0484.$ic10$, (SubLObject)ConsesLow.list(module0484.$ic11$, module0205.f13203(var27, (SubLObject)module0484.UNPROVIDED)), module0205.f13204(var27, (SubLObject)module0484.UNPROVIDED)) : var27);
    }
    
    public static SubLObject f31908(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (module0484.NIL != module0193.f12067(var3)) {
            return module0193.f12067(var4);
        }
        if (module0484.NIL != module0193.f12067(var4)) {
            return (SubLObject)module0484.NIL;
        }
        if (module0484.NIL != module0201.f12546(var3)) {
            return module0201.f12546(var4);
        }
        if (module0484.NIL != module0201.f12546(var4)) {
            return (SubLObject)module0484.NIL;
        }
        if (var4.isAtom()) {
            return module0331.f22370(var3, var4, (SubLObject)module0484.UNPROVIDED, (SubLObject)module0484.UNPROVIDED);
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31911(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var25 = var3.rest();
        final SubLObject var27;
        final SubLObject var26 = var27 = var4.first();
        if (var27.eql(module0484.$ic9$)) {
            SubLObject var29;
            final SubLObject var28 = var29 = var4.rest();
            SubLObject var30 = (SubLObject)module0484.NIL;
            var30 = var29.first();
            while (module0484.NIL != var29) {
                SubLObject var31 = (SubLObject)module0484.NIL;
                if (module0484.NIL == var31) {
                    SubLObject var32;
                    SubLObject var33;
                    for (var32 = var25, var33 = (SubLObject)module0484.NIL, var33 = var32.first(); module0484.NIL == var31 && module0484.NIL != var32; var31 = f31905(var30, var33, var24), var32 = var32.rest(), var33 = var32.first()) {}
                }
                if (module0484.NIL == var31) {
                    return (SubLObject)module0484.NIL;
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
            return (SubLObject)module0484.T;
        }
        SubLObject var34 = var25;
        SubLObject var35 = (SubLObject)module0484.NIL;
        var35 = var34.first();
        while (module0484.NIL != var34) {
            if (module0484.NIL != f31905(var35, var4, var24)) {
                return (SubLObject)module0484.T;
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31912(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var25 = var3.rest();
        final SubLObject var27;
        final SubLObject var26 = var27 = var4.first();
        if (var27.eql(module0484.$ic10$)) {
            final SubLObject var28 = var4.rest();
            SubLObject var29 = var25;
            SubLObject var30 = (SubLObject)module0484.NIL;
            var30 = var29.first();
            while (module0484.NIL != var29) {
                SubLObject var31 = (SubLObject)module0484.NIL;
                if (module0484.NIL == var31) {
                    SubLObject var32;
                    SubLObject var33;
                    for (var32 = var28, var33 = (SubLObject)module0484.NIL, var33 = var32.first(); module0484.NIL == var31 && module0484.NIL != var32; var31 = f31905(var30, var33, var24), var32 = var32.rest(), var33 = var32.first()) {}
                }
                if (module0484.NIL == var31) {
                    return (SubLObject)module0484.NIL;
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
            return (SubLObject)module0484.T;
        }
        SubLObject var34 = var25;
        SubLObject var35 = (SubLObject)module0484.NIL;
        var35 = var34.first();
        while (module0484.NIL != var34) {
            if (module0484.NIL == f31905(var35, var4, var24)) {
                return (SubLObject)module0484.NIL;
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        return (SubLObject)module0484.T;
    }
    
    public static SubLObject f31913(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var25 = conses_high.second(var3);
        final SubLObject var27;
        final SubLObject var26 = var27 = var4.first();
        if (var27.eql(module0484.$ic11$)) {
            final SubLObject var28 = conses_high.second(var4);
            return f31905(var28, var25, var24);
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31914(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var25 = conses_high.second(var3);
        final SubLObject var26 = conses_high.third(var3);
        if (module0484.NIL != f31905(var26, var4, var24)) {
            return (SubLObject)module0484.T;
        }
        final SubLObject var28;
        final SubLObject var27 = var28 = var4.first();
        if (var28.eql(module0484.$ic12$)) {
            final SubLObject var29 = conses_high.second(var4);
            final SubLObject var30 = conses_high.third(var4);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0484.NIL != f31908(var25, var29, var24) && module0484.NIL != f31905(var26, var30, var24));
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31915(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var25 = conses_high.second(var3);
        final SubLObject var26 = conses_high.third(var3);
        final SubLObject var28;
        final SubLObject var27 = var28 = var4.first();
        if (var28.eql(module0484.$ic13$)) {
            final SubLObject var29 = conses_high.second(var4);
            final SubLObject var30 = conses_high.third(var4);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0484.NIL != f31908(var25, var29, var24) && module0484.NIL != f31905(var26, var30, var24));
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31916(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var25 = conses_high.second(var3);
        final SubLObject var26 = conses_high.third(var3);
        final SubLObject var28;
        final SubLObject var27 = var28 = var4.first();
        if (var28.eql(module0484.$ic14$)) {
            final SubLObject var29 = conses_high.second(var4);
            final SubLObject var30 = conses_high.third(var4);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0484.NIL != f31908(var25, var29, var24) && module0484.NIL != f31905(var26, var30, var24));
        }
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31917(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var26;
        final SubLObject var25 = var26 = var4.first();
        if (var26.eql(module0484.$ic10$)) {
            SubLObject var28;
            final SubLObject var27 = var28 = var4.rest();
            SubLObject var29 = (SubLObject)module0484.NIL;
            var29 = var28.first();
            while (module0484.NIL != var28) {
                if (module0484.NIL != f31905(var3, var29, var24)) {
                    return (SubLObject)module0484.T;
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
            return (SubLObject)module0484.NIL;
        }
        if (var26.eql(module0484.$ic9$)) {
            SubLObject var28;
            final SubLObject var30 = var28 = var4.rest();
            SubLObject var31 = (SubLObject)module0484.NIL;
            var31 = var28.first();
            while (module0484.NIL != var28) {
                if (module0484.NIL == f31905(var3, var31, var24)) {
                    return (SubLObject)module0484.NIL;
                }
                var28 = var28.rest();
                var31 = var28.first();
            }
            return (SubLObject)module0484.T;
        }
        return f31918(var3, var4, var24);
    }
    
    public static SubLObject f31918(final SubLObject var3, final SubLObject var4, final SubLObject var24) {
        if (var4.isAtom()) {
            return (SubLObject)module0484.NIL;
        }
        final SubLObject var25 = var3.first();
        SubLObject var26 = var3.rest();
        final SubLObject var27 = Sequences.length(var26);
        final SubLObject var28 = var4.first();
        SubLObject var29 = var4.rest();
        final SubLObject var30 = Sequences.length(var29);
        if (!var27.numE(var30)) {
            return (SubLObject)module0484.NIL;
        }
        if (module0484.NIL == f31905(var25, var28, var24)) {
            return (SubLObject)module0484.NIL;
        }
        if (module0484.NIL == module0173.f10955(var25) || module0484.NIL == f31907(var25)) {
            while (module0484.NIL != var26) {
                final SubLObject var31 = var26.first();
                final SubLObject var32 = var29.first();
                if (module0484.NIL == f31905(var31, var32, var24)) {
                    return (SubLObject)module0484.NIL;
                }
                var26 = var26.rest();
                var29 = var29.rest();
            }
            return (SubLObject)module0484.T;
        }
        SubLObject var33 = var26;
        SubLObject var34 = (SubLObject)module0484.NIL;
        var34 = var33.first();
        while (module0484.NIL != var33) {
            SubLObject var35 = (SubLObject)module0484.NIL;
            if (module0484.NIL == var35) {
                SubLObject var36;
                SubLObject var37;
                for (var36 = var29, var37 = (SubLObject)module0484.NIL, var37 = var36.first(); module0484.NIL == var35 && module0484.NIL != var36; var35 = f31905(var34, var37, var24), var36 = var36.rest(), var37 = var36.first()) {}
            }
            if (module0484.NIL == var35) {
                return (SubLObject)module0484.NIL;
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        var33 = var29;
        SubLObject var32 = (SubLObject)module0484.NIL;
        var32 = var33.first();
        while (module0484.NIL != var33) {
            SubLObject var35 = (SubLObject)module0484.NIL;
            if (module0484.NIL == var35) {
                SubLObject var36;
                SubLObject var38;
                for (var36 = var26, var38 = (SubLObject)module0484.NIL, var38 = var36.first(); module0484.NIL == var35 && module0484.NIL != var36; var35 = f31905(var32, var38, var24), var36 = var36.rest(), var38 = var36.first()) {}
            }
            if (module0484.NIL == var35) {
                return (SubLObject)module0484.NIL;
            }
            var33 = var33.rest();
            var32 = var33.first();
        }
        return (SubLObject)module0484.T;
    }
    
    public static SubLObject f31919() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31899", "S#35238", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31901", "S#35239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31902", "S#35240", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31904", "S#35241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31903", "S#35242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31900", "S#35243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31906", "S#35244", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31907", "S#35245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31905", "S#35246", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31909", "S#35247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31910", "S#35248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31908", "S#35249", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31911", "S#35250", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31912", "S#35251", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31913", "S#35252", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31914", "S#35253", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31915", "S#35254", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31916", "S#35255", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31917", "S#35256", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0484", "f31918", "S#35257", 3, 0, false);
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31920() {
        module0484.$g3703$ = SubLFiles.defparameter("S#35258", module0018.$g658$.getDynamicValue());
        module0484.$g3704$ = SubLFiles.defparameter("S#35259", module0018.$g658$.getDynamicValue());
        module0484.$g3705$ = SubLFiles.defparameter("S#35260", (SubLObject)module0484.NIL);
        return (SubLObject)module0484.NIL;
    }
    
    public static SubLObject f31921() {
        module0340.f22941((SubLObject)module0484.$ic0$, (SubLObject)module0484.$ic1$);
        module0340.f22941((SubLObject)module0484.$ic5$, (SubLObject)module0484.$ic6$);
        module0340.f22938(module0484.$ic7$);
        module0340.f22938(module0484.$ic2$);
        return (SubLObject)module0484.NIL;
    }
    
    public void declareFunctions() {
        f31919();
    }
    
    public void initializeVariables() {
        f31920();
    }
    
    public void runTopLevelForms() {
        f31921();
    }
    
    static {
        me = (SubLFile)new module0484();
        module0484.$g3703$ = null;
        module0484.$g3704$ = null;
        module0484.$g3705$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("REMOVAL-FORMULA-IMPLIES-POS-CHECK");
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceImplies")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceImplies")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35258", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35238", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sentenceImplies ANTE CONSEQ)\nwhere ANTE and CONSEQ are both fully-bound formulas\nby checking for trivial syntactic truth-preserving transformations"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sentenceImplies\n  (#$thereExists ?DOG\n    (#$and\n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$thereExists ?ANIMAL\n    (#$isa ?ANIMAL #$Dog))))") });
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceImplies"));
        $ic3$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic4$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-FORMULA-EQUIV-POS-CHECK");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceEquiv")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceEquiv")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35259", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35240", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sentenceEquiv FORMULA-1 FORMULA-2)\nwhere FORMULA-1 and FORMULA-2 are both fully-bound formulas\nby checking for trivial syntactic truth-preserving transformations"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sentenceEquiv\n  (#$thereExists ?DOG\n    (#$and\n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$thereExists ?ANIMAL\n    (#$and\n      (#$colorOfObject ?ANIMAL #$RedColor)\n      (#$isa ?ANIMAL #$Dog)))))") });
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceEquiv"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0484.class
	Total time: 149 ms
	
	Decompiled with Procyon 0.5.32.
*/