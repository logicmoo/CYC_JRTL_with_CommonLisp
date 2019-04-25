package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0234 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0234";
    public static final String myFingerPrint = "c013b9779abb89c188ebe6d5b933679a3a54334b11f3a5bf33844382220f592d";
    public static SubLSymbol $g2431$;
    public static SubLSymbol $g2432$;
    public static SubLSymbol $g2433$;
    public static SubLSymbol $g2434$;
    public static SubLSymbol $g2435$;
    public static SubLSymbol $g2436$;
    public static SubLSymbol $g2437$;
    private static SubLSymbol $g2438$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    
    public static SubLObject f15433(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0234.$ic1$, (SubLObject)module0234.$ic2$, ConsesLow.append(var5, (SubLObject)module0234.NIL));
    }
    
    public static SubLObject f15434(final SubLObject var6, final SubLObject var7) {
        return f15435(var6, var7);
    }
    
    public static SubLObject f15436(final SubLObject var6, final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0234.NIL == f15435(var6, var7));
    }
    
    public static SubLObject f15435(final SubLObject var6, final SubLObject var7) {
        if (var6.eql(var7)) {
            return (SubLObject)module0234.T;
        }
        if (module0234.NIL != module0193.f12067(var6)) {
            return (SubLObject)module0234.T;
        }
        if (module0234.NIL != module0193.f12067(var7)) {
            return (SubLObject)module0234.T;
        }
        if (module0234.NIL != f15437(var6) && module0234.NIL != f15437(var7)) {
            return f15438(var6, var7);
        }
        if (module0234.NIL != module0173.f10955(var6)) {
            return f15439(var6, var7);
        }
        if (module0234.NIL != module0173.f10955(var7)) {
            return f15439(var7, var6);
        }
        if (var6.isCons() && var7.isCons()) {
            return f15440(var6, var7);
        }
        if (var6.isAtom() && var7.isAtom()) {
            return f15441(var6, var7);
        }
        return (SubLObject)module0234.NIL;
    }
    
    public static SubLObject f15438(final SubLObject var8, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0234.NIL == module0234.$g2431$.getDynamicValue(var10)) {
            return f15441(var8, var9);
        }
        return (SubLObject)module0234.T;
    }
    
    public static SubLObject f15439(final SubLObject var11, final SubLObject var7) {
        if (module0234.NIL == var7) {
            return (SubLObject)module0234.NIL;
        }
        if (module0234.NIL != constant_handles_oc.f8449(var11)) {
            return f15442(var11, var7);
        }
        if (module0234.NIL != constant_handles_oc.f8449(var7)) {
            return f15442(var7, var11);
        }
        if (module0234.NIL != module0193.f12105(var7) && module0234.NIL != module0331.f22370(var11, var7, (SubLObject)module0234.UNPROVIDED, (SubLObject)module0234.UNPROVIDED)) {
            return (SubLObject)module0234.T;
        }
        if (var7.isCons()) {
            final SubLObject var12 = module0172.f10915(var11);
            return f15440(var12, var7);
        }
        return (SubLObject)module0234.NIL;
    }
    
    public static SubLObject f15442(final SubLObject var13, final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0234.NIL != module0193.f12105(var7) && module0234.NIL != module0331.f22370(var13, var7, (SubLObject)module0234.UNPROVIDED, (SubLObject)module0234.UNPROVIDED));
    }
    
    public static SubLObject f15440(final SubLObject var14, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0234.$g2432$.getDynamicValue(var16);
        if (var17.eql((SubLObject)module0234.$ic0$)) {
            return f15443(var14, var15);
        }
        return Functions.funcall(module0234.$g2432$.getDynamicValue(var16), var14, var15);
    }
    
    public static SubLObject f15443(final SubLObject var14, final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0234.NIL != f15435(var14.first(), var15.first()) && module0234.NIL != f15435(var14.rest(), var15.rest()));
    }
    
    public static SubLObject f15441(final SubLObject var17, final SubLObject var18) {
        return Equality.equal(var17, var18);
    }
    
    public static SubLObject f15444(final SubLObject var19, final SubLObject var20, SubLObject var21, SubLObject var22) {
        if (var21 == module0234.UNPROVIDED) {
            var21 = (SubLObject)module0234.NIL;
        }
        if (var22 == module0234.UNPROVIDED) {
            var22 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        var23.resetMultipleValues();
        final SubLObject var24 = f15445(var19, var20, var21, (SubLObject)module0234.NIL, var22);
        final SubLObject var25 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        return Values.values(var24, var25);
    }
    
    public static SubLObject f15445(SubLObject var19, final SubLObject var20, SubLObject var21, SubLObject var25, SubLObject var22) {
        if (var21 == module0234.UNPROVIDED) {
            var21 = (SubLObject)module0234.NIL;
        }
        if (var25 == module0234.UNPROVIDED) {
            var25 = (SubLObject)module0234.NIL;
        }
        if (var22 == module0234.UNPROVIDED) {
            var22 = module0234.$g2436$.getDynamicValue();
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        module0413.f28794();
        if (module0234.NIL != f15434(var19, var20)) {
            if (module0234.NIL == var21) {
                var19 = f15446(var19);
            }
            SubLObject var27 = (SubLObject)module0234.NIL;
            SubLObject var28 = (SubLObject)module0234.NIL;
            SubLObject var29 = (SubLObject)module0234.NIL;
            final SubLObject var30 = module0234.$g2436$.currentBinding(var26);
            try {
                module0234.$g2436$.bind(var22, var26);
                var26.resetMultipleValues();
                final SubLObject var30_31 = f15447(var19, var20, var25);
                final SubLObject var32_33 = var26.secondMultipleValue();
                final SubLObject var34_35 = var26.thirdMultipleValue();
                var26.resetMultipleValues();
                var27 = var30_31;
                var28 = var32_33;
                var29 = var34_35;
            }
            finally {
                module0234.$g2436$.rebind(var30, var26);
            }
            if (module0234.NIL != var29) {
                module0413.f28796();
                if (module0234.NIL == var27) {
                    return Values.values(module0233.f15403(), var28);
                }
                if (module0234.NIL != module0077.f5302(var27)) {
                    final SubLObject var31 = module0077.f5313(Symbols.symbol_function((SubLObject)module0234.EQUAL), (SubLObject)module0234.UNPROVIDED);
                    final SubLObject var32 = module0077.f5333(var27);
                    SubLObject var33;
                    SubLObject var34;
                    SubLObject var35;
                    for (var33 = module0032.f1741(var32), var34 = (SubLObject)module0234.NIL, var34 = module0032.f1742(var33, var32); module0234.NIL == module0032.f1744(var33, var34); var34 = module0032.f1743(var34)) {
                        var35 = module0032.f1745(var33, var34);
                        if (module0234.NIL != module0032.f1746(var34, var35)) {
                            assert module0234.NIL != module0233.f15349(var35) : var35;
                            module0077.f5326(Sequences.nreverse(conses_high.copy_tree(var35)), var31);
                        }
                    }
                    return Values.values(var31, var28);
                }
                return Values.values(Sequences.nreverse(conses_high.copy_tree(var27)), var28);
            }
        }
        return (SubLObject)module0234.NIL;
    }
    
    public static SubLObject f15447(final SubLObject var6, final SubLObject var7, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0234.NIL;
        SubLObject var26 = (SubLObject)module0234.NIL;
        SubLObject var27 = (SubLObject)module0234.NIL;
        SubLObject var28 = (SubLObject)module0234.NIL;
        try {
            var24.throwStack.push(module0234.$ic4$);
            var24.resetMultipleValues();
            final SubLObject var41_42 = f15448(var6, var7, var23);
            final SubLObject var43_44 = var24.secondMultipleValue();
            var24.resetMultipleValues();
            var25 = var41_42;
            var26 = var43_44;
            var27 = (SubLObject)module0234.T;
        }
        catch (Throwable var29) {
            var28 = Errors.handleThrowable(var29, (SubLObject)module0234.$ic4$);
        }
        finally {
            var24.throwStack.pop();
        }
        return Values.values(var25, var26, var27);
    }
    
    public static SubLObject f15449(final SubLObject var6, final SubLObject var7) {
        return Dynamic.sublisp_throw((SubLObject)module0234.$ic4$, (SubLObject)module0234.NIL);
    }
    
    public static SubLObject f15448(final SubLObject var6, final SubLObject var7, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0234.NIL == module0234.$g2434$.getDynamicValue(var24)) {
            return f15450(var6, var7, var23);
        }
        if (module0234.NIL == module0077.f5302(var23)) {
            return f15450(var6, var7, var23);
        }
        SubLObject var25 = (SubLObject)module0234.NIL;
        SubLObject var26 = (SubLObject)module0234.NIL;
        final SubLObject var27 = module0077.f5333(var23);
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        SubLObject var33;
        for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0234.NIL, var29 = module0032.f1742(var28, var27); module0234.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
            var30 = module0032.f1745(var28, var29);
            if (module0234.NIL != module0032.f1746(var29, var30)) {
                var24.resetMultipleValues();
                var31 = f15447(var6, var7, var30);
                var32 = var24.secondMultipleValue();
                var33 = var24.thirdMultipleValue();
                var24.resetMultipleValues();
                if (module0234.NIL != var33) {
                    var26 = (SubLObject)module0234.T;
                    var25 = f15451(var31, var25);
                }
            }
        }
        if (module0234.NIL != var26) {
            return Values.values(var25, (SubLObject)module0234.NIL);
        }
        return f15449(var6, var7);
    }
    
    public static SubLObject f15451(final SubLObject var49, SubLObject var50) {
        if (module0234.NIL != module0077.f5302(var49)) {
            final SubLObject var51 = module0077.f5333(var49);
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            for (var52 = module0032.f1741(var51), var53 = (SubLObject)module0234.NIL, var53 = module0032.f1742(var52, var51); module0234.NIL == module0032.f1744(var52, var53); var53 = module0032.f1743(var53)) {
                var54 = module0032.f1745(var52, var53);
                if (module0234.NIL != module0032.f1746(var53, var54)) {
                    assert module0234.NIL != module0233.f15349(var54) : var54;
                    var50 = f15451(var54, var50);
                }
            }
        }
        else if (module0234.NIL == var50) {
            var50 = var49;
        }
        else if (module0234.NIL != module0077.f5302(var50)) {
            module0077.f5326(var49, var50);
        }
        else {
            var50 = module0078.f5369(var50, Symbols.symbol_function((SubLObject)module0234.EQUAL));
            module0077.f5326(var49, var50);
        }
        return var50;
    }
    
    public static SubLObject f15450(final SubLObject var6, final SubLObject var7, final SubLObject var23) {
        if (var6.eql(var7)) {
            return Values.values(var23, (SubLObject)module0234.NIL);
        }
        if (module0234.NIL != module0193.f12067(var6)) {
            return f15452(var6, var7, var23);
        }
        if (module0234.NIL != module0193.f12067(var7)) {
            return f15452(var7, var6, var23);
        }
        if (module0234.NIL != f15437(var6) && module0234.NIL != f15437(var7)) {
            return f15453(var6, var7, var23);
        }
        if (module0234.NIL != module0173.f10955(var6)) {
            return f15454(var6, var7, var23);
        }
        if (module0234.NIL != module0173.f10955(var7)) {
            return f15454(var7, var6, var23);
        }
        if (var6.isCons() && var7.isCons()) {
            return f15455(var6, var7, var23);
        }
        if (var6.isAtom() && var7.isAtom()) {
            return f15456(var6, var7, var23);
        }
        return f15449(var6, var7);
    }
    
    public static SubLObject f15452(final SubLObject var52, final SubLObject var53, final SubLObject var23) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (module0234.NIL != module0233.f15367(var52, var23)) {
            return f15448(var53, module0233.f15369(var52, var23), var23);
        }
        if (module0234.NIL != module0193.f12067(var53) && module0234.NIL != module0233.f15367(var53, var23)) {
            return f15452(var53, var52, var23);
        }
        if (module0234.NIL != f15457(var52, var53, var23)) {
            return f15449(var52, var53);
        }
        if (module0234.NIL != module0234.$g2435$.getDynamicValue(var54) && (module0234.NIL == module0193.f12067(var53) || SubLObjectFactory.makeBoolean(module0234.NIL == f15458(var52)).eql((SubLObject)SubLObjectFactory.makeBoolean(module0234.NIL == f15458(var53))))) {
            return f15449(var52, var53);
        }
        return Values.values(module0233.f15345(var52, var53, var23), (SubLObject)module0234.NIL);
    }
    
    public static SubLObject f15453(final SubLObject var8, final SubLObject var9, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0234.NIL == module0234.$g2431$.getDynamicValue(var24)) {
            return f15456(var8, var9, var23);
        }
        if (module0234.NIL != module0233.f15367(var8, var23)) {
            return f15448(module0233.f15369(var8, var23), var9, var23);
        }
        if (module0234.NIL != module0233.f15367(var9, var23)) {
            return f15448(var8, module0233.f15369(var9, var23), var23);
        }
        return Values.values(module0233.f15345(var8, var9, var23), (SubLObject)module0234.NIL);
    }
    
    public static SubLObject f15454(final SubLObject var11, final SubLObject var7, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0234.NIL == var7) {
            return f15449(var11, var7);
        }
        if (module0234.NIL != constant_handles_oc.f8449(var11)) {
            return f15459(var11, var7, var23);
        }
        if (module0234.NIL != constant_handles_oc.f8449(var7)) {
            return f15459(var7, var11, var23);
        }
        if (module0234.NIL != module0193.f12105(var7) && module0234.NIL != module0331.f22370(var11, var7, (SubLObject)module0234.UNPROVIDED, (SubLObject)module0234.UNPROVIDED)) {
            return Values.values(var23, f15460(var11, var7));
        }
        if (module0234.NIL != module0234.$g2437$.getDynamicValue(var24) && var7.isCons()) {
            final SubLObject var25 = module0172.f10915(var11);
            return f15455(var25, var7, var23);
        }
        return f15449(var11, var7);
    }
    
    public static SubLObject f15459(final SubLObject var13, final SubLObject var7, final SubLObject var23) {
        if (module0234.NIL != module0193.f12105(var7) && module0234.NIL != module0331.f22370(var13, var7, (SubLObject)module0234.UNPROVIDED, (SubLObject)module0234.UNPROVIDED)) {
            return Values.values(var23, f15460(var13, var7));
        }
        return f15449(var13, var7);
    }
    
    public static SubLObject f15455(final SubLObject var14, final SubLObject var15, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0234.$g2433$.getDynamicValue(var24);
        if (var25.eql((SubLObject)module0234.$ic0$)) {
            return f15461(var14, var15, var23);
        }
        return Functions.funcall(module0234.$g2433$.getDynamicValue(var24), var14, var15, var23);
    }
    
    public static SubLObject f15461(final SubLObject var14, final SubLObject var15, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        var24.resetMultipleValues();
        final SubLObject var25 = f15448(var14.first(), var15.first(), var23);
        final SubLObject var26 = var24.secondMultipleValue();
        var24.resetMultipleValues();
        var24.resetMultipleValues();
        final SubLObject var27 = f15448(var14.rest(), var15.rest(), var25);
        final SubLObject var28 = var24.secondMultipleValue();
        var24.resetMultipleValues();
        return Values.values(var27, ConsesLow.append(var26, var28));
    }
    
    public static SubLObject f15456(final SubLObject var17, final SubLObject var18, final SubLObject var23) {
        if (var17.equal(var18)) {
            return Values.values(var23, (SubLObject)module0234.NIL);
        }
        return f15449(var17, var18);
    }
    
    public static SubLObject f15460(final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0234.NIL != module0234.$g2436$.getDynamicValue(var8)) ? ConsesLow.list(module0191.f11990((SubLObject)module0234.$ic5$, module0202.f12768(module0234.$ic6$, var6, var7), (SubLObject)module0234.UNPROVIDED, (SubLObject)module0234.UNPROVIDED)) : module0234.NIL);
    }
    
    public static SubLObject f15457(final SubLObject var52, final SubLObject var58, final SubLObject var23) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (module0234.NIL != module0018.$g623$.getDynamicValue(var59)) {
            return f15462(var52, var58, var23);
        }
        return (SubLObject)module0234.NIL;
    }
    
    public static SubLObject f15462(final SubLObject var52, final SubLObject var53, final SubLObject var23) {
        if (var52.eql(var53)) {
            return (SubLObject)module0234.T;
        }
        if (module0234.NIL == var53) {
            return (SubLObject)module0234.NIL;
        }
        if (var53.isCons()) {
            SubLObject var54;
            SubLObject var55;
            SubLObject var56;
            for (var54 = (SubLObject)module0234.NIL, var54 = var53; !var54.isAtom(); var54 = var54.rest()) {
                var55 = var54.first();
                if (module0234.NIL != f15462(var52, var55, var23)) {
                    return (SubLObject)module0234.T;
                }
                var56 = var54.rest();
                if (!var56.isList() && module0234.NIL != f15462(var52, var56, var23)) {
                    return (SubLObject)module0234.T;
                }
            }
            return (SubLObject)module0234.NIL;
        }
        if (module0234.NIL != module0193.f12067(var53) && module0234.NIL != module0233.f15367(var53, var23)) {
            return f15462(var52, module0233.f15369(var53, var23), var23);
        }
        return (SubLObject)module0234.NIL;
    }
    
    public static SubLObject f15463(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        return Numbers.numGE(module0035.f2451(Symbols.symbol_function((SubLObject)module0234.$ic8$), var53, (SubLObject)module0234.UNPROVIDED), module0234.$g2438$.getDynamicValue(var54));
    }
    
    public static SubLObject f15458(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0234.NIL != module0193.f12067(var53) && module0193.f12073(var53).numL(module0234.$g2438$.getDynamicValue(var54)));
    }
    
    public static SubLObject f15464(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0234.NIL != module0193.f12067(var53) && module0193.f12073(var53).numGE(module0234.$g2438$.getDynamicValue(var54)));
    }
    
    public static SubLObject f15465(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        assert module0234.NIL != module0193.f12067(var52) : var52;
        return module0193.f12079(Numbers.mod(module0193.f12073(var52), module0234.$g2438$.getDynamicValue(var53)));
    }
    
    public static SubLObject f15466(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        assert module0234.NIL != module0193.f12067(var52) : var52;
        return module0193.f12079(Numbers.add(Numbers.mod(module0193.f12073(var52), module0234.$g2438$.getDynamicValue(var53)), module0234.$g2438$.getDynamicValue(var53)));
    }
    
    public static SubLObject f15467(final SubLObject var52) {
        if (module0234.NIL != f15458(var52)) {
            return f15466(var52);
        }
        return f15465(var52);
    }
    
    public static SubLObject f15468(final SubLObject var53) {
        return module0036.f2531(var53, Symbols.symbol_function((SubLObject)module0234.$ic9$), Symbols.symbol_function((SubLObject)module0234.$ic10$), (SubLObject)module0234.UNPROVIDED);
    }
    
    public static SubLObject f15469(final SubLObject var53) {
        return module0036.f2531(var53, Symbols.symbol_function((SubLObject)module0234.$ic11$), Symbols.symbol_function((SubLObject)module0234.$ic12$), (SubLObject)module0234.UNPROVIDED);
    }
    
    public static SubLObject f15470(final SubLObject var53) {
        if (module0234.NIL != module0193.f12067(var53)) {
            return f15467(var53);
        }
        if (var53.isAtom()) {
            return var53;
        }
        return module0035.f2071(f15470(var53.first()), f15470(var53.rest()), var53);
    }
    
    public static SubLObject f15446(final SubLObject var53) {
        return f15468(var53);
    }
    
    public static SubLObject f15437(final SubLObject var53) {
        return module0201.f12546(var53);
    }
    
    public static SubLObject f15471() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0234", "f15433", "S#18177");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15434", "S#16454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15436", "S#18178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15435", "S#18179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15438", "S#18180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15439", "S#18181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15442", "S#18182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15440", "S#18183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15443", "S#18184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15441", "S#18185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15444", "S#18186", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15445", "S#18187", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15447", "S#18188", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15449", "S#18189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15448", "S#18190", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15451", "S#18191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15450", "S#18192", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15452", "S#18193", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15453", "S#18194", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15454", "S#18195", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15459", "S#18196", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15455", "S#18197", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15461", "S#18198", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15456", "S#18199", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15460", "S#18200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15457", "S#18201", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15462", "S#18202", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15463", "S#18203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15458", "S#18077", 1, 0, false);
        new $f15458$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15464", "S#18204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15465", "S#18205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15466", "S#18176", 1, 0, false);
        new $f15466$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15467", "S#18206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15468", "S#18207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15469", "S#18208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15470", "S#18209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15446", "S#18210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0234", "f15437", "S#18211", 1, 0, false);
        return (SubLObject)module0234.NIL;
    }
    
    public static SubLObject f15472() {
        module0234.$g2431$ = SubLFiles.defvar("S#18212", (SubLObject)module0234.T);
        module0234.$g2432$ = SubLFiles.defparameter("S#18213", (SubLObject)module0234.$ic0$);
        module0234.$g2433$ = SubLFiles.defparameter("S#18214", (SubLObject)module0234.$ic0$);
        module0234.$g2434$ = SubLFiles.defparameter("S#18215", (SubLObject)module0234.NIL);
        module0234.$g2435$ = SubLFiles.defparameter("S#18216", (SubLObject)module0234.NIL);
        module0234.$g2436$ = SubLFiles.defparameter("S#18217", (SubLObject)module0234.NIL);
        module0234.$g2437$ = SubLFiles.defparameter("S#18218", (SubLObject)module0234.T);
        module0234.$g2438$ = SubLFiles.defparameter("S#18219", (SubLObject)module0234.$ic7$);
        return (SubLObject)module0234.NIL;
    }
    
    public static SubLObject f15473() {
        return (SubLObject)module0234.NIL;
    }
    
    public void declareFunctions() {
        f15471();
    }
    
    public void initializeVariables() {
        f15472();
    }
    
    public void runTopLevelForms() {
        f15473();
    }
    
    static {
        me = (SubLFile)new module0234();
        module0234.$g2431$ = null;
        module0234.$g2432$ = null;
        module0234.$g2433$ = null;
        module0234.$g2434$ = null;
        module0234.$g2435$ = null;
        module0234.$g2436$ = null;
        module0234.$g2437$ = null;
        module0234.$g2438$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18217", "CYC"), (SubLObject)module0234.T));
        $ic3$ = SubLObjectFactory.makeSymbol("S#18087", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("UNIFY-FAILURE");
        $ic5$ = SubLObjectFactory.makeKeyword("EQUALITY");
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic7$ = SubLObjectFactory.makeInteger(100);
        $ic8$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic9$ = SubLObjectFactory.makeSymbol("S#18077", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#18176", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#18204", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#18205", "CYC");
    }
    
    public static final class $f15458$UnaryFunction extends UnaryFunction
    {
        public $f15458$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18077"));
        }
        
        public SubLObject processItem(final SubLObject var62) {
            return module0234.f15458(var62);
        }
    }
    
    public static final class $f15466$UnaryFunction extends UnaryFunction
    {
        public $f15466$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18176"));
        }
        
        public SubLObject processItem(final SubLObject var62) {
            return module0234.f15466(var62);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0234.class
	Total time: 238 ms
	
	Decompiled with Procyon 0.5.32.
*/