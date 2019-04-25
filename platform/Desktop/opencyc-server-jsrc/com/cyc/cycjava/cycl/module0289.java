package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0289 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0289";
    public static final String myFingerPrint = "3aef7a206b4b40f962acb6fe61919f3a6d4a94239631c491c2b4dff9251509e7";
    private static SubLSymbol $g2648$;
    public static SubLSymbol $g2649$;
    private static SubLSymbol $g2650$;
    private static SubLSymbol $g2651$;
    private static SubLSymbol $g2652$;
    private static SubLSymbol $g2653$;
    private static SubLSymbol $g2654$;
    public static SubLSymbol $g2655$;
    private static SubLSymbol $g2656$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLString $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLList $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
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
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    
    public static SubLObject f19394(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0289.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0289.$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0289.$ic1$, (SubLObject)module0289.$ic2$, (SubLObject)ConsesLow.listS((SubLObject)module0289.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0289.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0289.$ic5$, var5)), (SubLObject)module0289.$ic6$), ConsesLow.append(var6, (SubLObject)module0289.NIL));
    }
    
    public static SubLObject f19395(final SubLObject var7) {
        return f19396(var7);
    }
    
    public static SubLObject f19397(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0034.$g879$.getDynamicValue(var8);
        SubLObject var10 = (SubLObject)module0289.NIL;
        if (module0289.NIL == var9) {
            return f19395(var7);
        }
        var10 = module0034.f1857(var9, (SubLObject)module0289.$ic7$, (SubLObject)module0289.UNPROVIDED);
        if (module0289.NIL == var10) {
            var10 = module0034.f1807(module0034.f1842(var9), (SubLObject)module0289.$ic7$, (SubLObject)module0289.ONE_INTEGER, (SubLObject)module0289.NIL, (SubLObject)module0289.EQL, (SubLObject)module0289.UNPROVIDED);
            module0034.f1860(var9, (SubLObject)module0289.$ic7$, var10);
        }
        SubLObject var11 = module0034.f1814(var10, var7, (SubLObject)module0289.$ic8$);
        if (var11 == module0289.$ic8$) {
            var11 = Values.arg2(var8.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19395(var7)));
            module0034.f1816(var10, var7, var11, (SubLObject)module0289.UNPROVIDED);
        }
        return module0034.f1959(var11);
    }
    
    public static SubLObject f19396(SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert module0289.NIL != assertion_handles_oc.f11035(var7) : var7;
        final SubLObject var9 = module0178.f11303(var7);
        SubLObject var10 = (SubLObject)module0289.NIL;
        SubLObject var11 = (SubLObject)module0289.NIL;
        SubLObject var12 = (SubLObject)module0289.NIL;
        if (module0289.NIL != module0287.f19218(var7)) {
            final SubLObject var13 = module0205.f13145((SubLObject)module0289.$ic10$, (SubLObject)ConsesLow.cons(var9, var10), (SubLObject)module0289.T, (SubLObject)module0289.UNPROVIDED);
            final SubLObject var14 = module0287.f19195(module0287.f19211(var13), (SubLObject)module0289.UNPROVIDED);
            if (module0289.NIL != var14) {
                var7 = var14.first();
            }
        }
        try {
            var8.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var15 = Errors.$error_handler$.currentBinding(var8);
            try {
                Errors.$error_handler$.bind((SubLObject)module0289.$ic11$, var8);
                try {
                    if (module0289.NIL != f19398(var7)) {
                        if (module0289.NIL == module0289.$g2649$.getDynamicValue(var8)) {
                            var8.resetMultipleValues();
                            final SubLObject var19_20 = f19399(var7);
                            final SubLObject var21_22 = var8.secondMultipleValue();
                            var8.resetMultipleValues();
                            var11 = var19_20;
                            var10 = var21_22;
                        }
                        else {
                            var8.resetMultipleValues();
                            final SubLObject var23_24 = f19400(var7);
                            final SubLObject var25_26 = var8.secondMultipleValue();
                            var8.resetMultipleValues();
                            var11 = var23_24;
                            var10 = var25_26;
                        }
                    }
                    else {
                        var11 = module0538.f33479(conses_high.copy_tree(var9), module0178.f11348(var7));
                        var10 = module0178.f11287(var7);
                    }
                }
                catch (Throwable var16) {
                    Errors.handleThrowable(var16, (SubLObject)module0289.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var15, var8);
            }
        }
        catch (Throwable var17) {
            var12 = Errors.handleThrowable(var17, module0003.$g3$.getGlobalValue());
        }
        finally {
            var8.throwStack.pop();
        }
        if (module0289.NIL != var12) {
            var11 = module0538.f33479(conses_high.copy_tree(var9), module0178.f11348(var7));
        }
        var10 = module0205.f13144(var10);
        return Values.values(var11, var10);
    }
    
    public static SubLObject f19401(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert module0289.NIL != assertion_handles_oc.f11035(var7) : var7;
        var8.resetMultipleValues();
        final SubLObject var9 = f19396(var7);
        final SubLObject var10 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        return var10;
    }
    
    public static SubLObject f19402(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert module0289.NIL != assertion_handles_oc.f11035(var7) : var7;
        var8.resetMultipleValues();
        final SubLObject var9 = f19396(var7);
        final SubLObject var10 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        return module0202.f12782(var10, var9);
    }
    
    public static SubLObject f19398(final SubLObject var7) {
        final SubLObject var8 = module0178.f11303(var7);
        final SubLObject var9 = module0178.f11287(var7);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL != module0205.f13145((SubLObject)module0289.$ic20$, var8, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) || module0289.NIL != module0205.f13145((SubLObject)module0289.$ic21$, var9, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) || module0289.NIL != module0205.f13145((SubLObject)module0289.$ic22$, var9, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) || module0289.NIL != module0205.f13145((SubLObject)module0289.$ic23$, var8, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED));
    }
    
    public static SubLObject f19403(final SubLObject var32) {
        if (module0289.NIL != module0173.f10955(var32)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var32.eql(module0289.$ic24$) || var32.eql(module0289.$ic25$) || var32.eql(module0289.$ic26$) || var32.eql(module0289.$ic27$) || var32.eql(module0289.$ic28$) || module0289.NIL != module0210.f13584(var32));
        }
        if (module0289.NIL != module0210.f13566(var32)) {
            return (SubLObject)module0289.T;
        }
        if (module0289.NIL != module0201.f12546(var32)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(!var32.eql(f19404(var32)));
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19405(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL != module0173.f10955(var32) && module0289.NIL != module0004.f104(var32, module0289.$g2650$.getGlobalValue(), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED));
    }
    
    public static SubLObject f19406() {
        final SubLObject var34 = module0289.$g2651$.getGlobalValue();
        if (module0289.NIL != var34) {
            module0034.f1818(var34);
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19407(final SubLObject var7) {
        return module0034.f1829(module0289.$g2651$.getGlobalValue(), (SubLObject)ConsesLow.list(var7), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19408(final SubLObject var7) {
        return f19399(var7);
    }
    
    public static SubLObject f19400(final SubLObject var7) {
        SubLObject var8 = module0289.$g2651$.getGlobalValue();
        if (module0289.NIL == var8) {
            var8 = module0034.f1934((SubLObject)module0289.$ic30$, (SubLObject)module0289.$ic31$, (SubLObject)module0289.$ic32$, (SubLObject)module0289.EQL, (SubLObject)module0289.ONE_INTEGER, (SubLObject)module0289.$ic33$);
        }
        SubLObject var9 = module0034.f1814(var8, var7, (SubLObject)module0289.$ic8$);
        if (var9 == module0289.$ic8$) {
            var9 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19408(var7)));
            module0034.f1816(var8, var7, var9, (SubLObject)module0289.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f19399(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0289.NIL == module0152.$g2101$.getDynamicValue(var8)) {
            module0274.f18061();
        }
        SubLObject var9 = module0178.f11287(var7);
        SubLObject var10 = (SubLObject)module0289.NIL;
        final SubLObject var11 = module0147.$g2095$.currentBinding(var8);
        final SubLObject var12 = module0146.$g2055$.currentBinding(var8);
        try {
            module0147.$g2095$.bind(var9, var8);
            module0146.$g2055$.bind((SubLObject)module0289.NIL, var8);
            final SubLObject var13 = module0178.f11348(var7);
            final SubLObject var14 = f19409(module0202.f12765(module0178.f11282(var7)), var13);
            final SubLObject var15 = module0178.f11292(var7);
            final SubLObject var18_41 = module0289.$g2648$.currentBinding(var8);
            try {
                module0289.$g2648$.bind(module0067.f4880((SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED), var8);
                SubLObject var16 = module0204.f13084(var14, (SubLObject)module0289.UNPROVIDED);
                SubLObject var17 = (SubLObject)module0289.NIL;
                var17 = var16.first();
                while (module0289.NIL != var16) {
                    f19410(var17, var17);
                    var16 = var16.rest();
                    var17 = var16.first();
                }
                final SubLObject var18 = f19411(var14);
                final SubLObject var19 = f19412(var18);
                final SubLObject var20 = (SubLObject)((var15 == module0289.$ic34$) ? module0289.NIL : conses_high.set_difference(module0232.f15308(var18), var19, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
                final SubLObject var21 = (var15 == module0289.$ic34$) ? conses_high.set_difference(module0232.f15308(var18), var19, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED) : conses_high.set_difference(module0232.f15306(var18), var19, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
                SubLObject var22 = (SubLObject)module0289.NIL;
                var8.resetMultipleValues();
                SubLObject var23 = f19413((SubLObject)ConsesLow.list(module0232.f15326(var21, var20)), var19, var9);
                SubLObject var24 = var8.secondMultipleValue();
                var8.resetMultipleValues();
                var23 = module0285.f18925(module0285.f19028(var23));
                var23 = f19414(var23);
                var8.resetMultipleValues();
                final SubLObject var50_51 = f19415(var23, var24);
                final SubLObject var52_53 = var8.secondMultipleValue();
                var8.resetMultipleValues();
                var22 = var50_51;
                var24 = var52_53;
                var10 = f19416(var22);
                var9 = var24;
            }
            finally {
                module0289.$g2648$.rebind(var18_41, var8);
            }
        }
        finally {
            module0146.$g2055$.rebind(var12, var8);
            module0147.$g2095$.rebind(var11, var8);
        }
        return Values.values(var10, var9);
    }
    
    public static SubLObject f19414(SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = (SubLObject)module0289.$ic35$;
        SubLObject var55 = null;
        for (SubLObject var51 = (SubLObject)module0289.NIL, var52 = (SubLObject)module0289.NIL; !var48.equal(var51); var48 = module0205.f13250(var55, var52, var48, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED)) {
            var51 = var48;
            var49.resetMultipleValues();
            final SubLObject var53 = module0337.f22630(var48, var50);
            final SubLObject var54 = var49.secondMultipleValue();
            var49.resetMultipleValues();
            if (module0289.NIL != var53) {
                var55 = module0035.f2294(var54, (SubLObject)module0289.$ic36$, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
                var52 = (SubLObject)ConsesLow.list(module0289.$ic37$, (SubLObject)ConsesLow.list(module0289.$ic38$, var55));
            }
        }
        return var48;
    }
    
    public static SubLObject f19417(final SubLObject var7) {
        module0274.f18061();
        final SubLObject var8 = module0178.f11287(var7);
        final SubLObject var9 = module0178.f11282(var7);
        final SubLObject var10 = module0178.f11348(var7);
        final SubLObject var11 = f19418(var9, var8, var10);
        return Values.values(var11, var8);
    }
    
    public static SubLObject f19418(final SubLObject var5, SubLObject var13, SubLObject var38) {
        if (var13 == module0289.UNPROVIDED) {
            var13 = (SubLObject)module0289.NIL;
        }
        if (var38 == module0289.UNPROVIDED) {
            var38 = (SubLObject)module0289.NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0289.NIL;
        final SubLObject var41 = var13;
        final SubLObject var42 = module0147.$g2094$.currentBinding(var39);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var39);
        final SubLObject var44 = module0289.$g2653$.currentBinding(var39);
        final SubLObject var45 = module0146.$g2055$.currentBinding(var39);
        try {
            module0147.$g2094$.bind(module0147.f9531(var41), var39);
            module0147.$g2095$.bind(module0147.f9534(var41), var39);
            module0289.$g2653$.bind(module0289.$g2652$.getDynamicValue(var39), var39);
            module0146.$g2055$.bind((SubLObject)module0289.NIL, var39);
            final SubLObject var46 = conses_high.copy_tree(var5);
            final SubLObject var47 = f19409(var46, var38);
            final SubLObject var48 = f19411(var47);
            final SubLObject var49 = f19412(var48);
            final SubLObject var50 = conses_high.set_difference(module0232.f15308(var48), var49, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
            final SubLObject var51 = conses_high.set_difference(module0232.f15306(var48), var49, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
            final SubLObject var52 = (SubLObject)ConsesLow.list(module0232.f15326(var51, var50));
            final SubLObject var53 = f19414(module0285.f18925(module0285.f19028(f19413(var52, var49, (SubLObject)module0289.UNPROVIDED))));
            final SubLObject var54 = f19415(var53, var13);
            var40 = f19416(var54);
        }
        finally {
            module0146.$g2055$.rebind(var45, var39);
            module0289.$g2653$.rebind(var44, var39);
            module0147.$g2095$.rebind(var43, var39);
            module0147.$g2094$.rebind(var42, var39);
        }
        return var40;
    }
    
    public static SubLObject f19419(final SubLObject var66, SubLObject var13, SubLObject var38) {
        if (var13 == module0289.UNPROVIDED) {
            var13 = (SubLObject)module0289.NIL;
        }
        if (var38 == module0289.UNPROVIDED) {
            var38 = (SubLObject)module0289.NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)module0289.NIL;
        final SubLObject var69 = var13;
        final SubLObject var70 = module0147.$g2094$.currentBinding(var67);
        final SubLObject var71 = module0147.$g2095$.currentBinding(var67);
        final SubLObject var72 = module0289.$g2653$.currentBinding(var67);
        final SubLObject var73 = module0146.$g2055$.currentBinding(var67);
        try {
            module0147.$g2094$.bind(module0147.f9531(var69), var67);
            module0147.$g2095$.bind(module0147.f9534(var69), var67);
            module0289.$g2653$.bind(module0289.$g2652$.getDynamicValue(var67), var67);
            module0146.$g2055$.bind((SubLObject)module0289.NIL, var67);
            final SubLObject var74 = conses_high.copy_tree(var66);
            final SubLObject var75 = f19409(var74, var38);
            final SubLObject var76 = f19411(var75);
            final SubLObject var77 = module0035.f2269(module0035.f2077((SubLObject)module0289.$ic39$, var76), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            final SubLObject var78 = f19420(var77, var76);
            final SubLObject var79 = f19414(module0285.f18925(module0285.f19028(f19413(var78, var77, (SubLObject)module0289.UNPROVIDED))));
            final SubLObject var80 = f19415(var79, var13);
            var68 = f19416(var80);
        }
        finally {
            module0146.$g2055$.rebind(var73, var67);
            module0289.$g2653$.rebind(var72, var67);
            module0147.$g2095$.rebind(var71, var67);
            module0147.$g2094$.rebind(var70, var67);
        }
        return var68;
    }
    
    public static SubLObject f19421(final SubLObject var70) {
        final SubLObject var71 = Mapping.mapcar((SubLObject)module0289.$ic40$, var70);
        final SubLObject var72 = module0035.f2489(var71, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        final SubLObject var73 = Mapping.mapcar((SubLObject)module0289.$ic41$, var72);
        return var73;
    }
    
    public static SubLObject f19422(final SubLObject var66) {
        final SubLObject var67 = Mapping.mapcar((SubLObject)module0289.$ic42$, var66);
        final SubLObject var68 = module0035.f2489(var67, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        final SubLObject var69 = Mapping.mapcar((SubLObject)module0289.$ic41$, var68);
        return var69;
    }
    
    public static SubLObject f19423(final SubLObject var70, SubLObject var13, SubLObject var38) {
        if (var13 == module0289.UNPROVIDED) {
            var13 = (SubLObject)module0289.NIL;
        }
        if (var38 == module0289.UNPROVIDED) {
            var38 = (SubLObject)module0289.NIL;
        }
        final SubLObject var71 = f19421(var70);
        return f19419(var71, var13, var38);
    }
    
    public static SubLObject f19415(final SubLObject var48, final SubLObject var13) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0289.NIL;
        SubLObject var51 = (SubLObject)module0289.NIL;
        final SubLObject var52 = f19424(var48);
        final SubLObject var53 = module0146.$g2028$.currentBinding(var49);
        try {
            module0146.$g2028$.bind((SubLObject)module0289.NIL, var49);
            final SubLObject var54 = f19425(var52);
            final SubLObject var18_76 = module0289.$g2654$.currentBinding(var49);
            final SubLObject var55 = module0289.$g2653$.currentBinding(var49);
            final SubLObject var56 = module0289.$g2652$.currentBinding(var49);
            try {
                module0289.$g2654$.bind(f19426(var52, var54), var49);
                module0289.$g2653$.bind(f19427(var52, var54), var49);
                module0289.$g2652$.bind(ConsesLow.append(module0289.$g2652$.getDynamicValue(var49), f19428(var52)), var49);
                final SubLObject var57 = f19429(var52);
                var49.resetMultipleValues();
                final SubLObject var58 = f19430(var57, var13);
                final SubLObject var59 = var49.secondMultipleValue();
                var49.resetMultipleValues();
                final SubLObject var60 = f19431(var58);
                final SubLObject var61 = var50 = f19432(var60);
                var51 = var59;
                var49.resetMultipleValues();
                final SubLObject var81_82 = module0162.f10649(var50, var51);
                final SubLObject var83_84 = var49.secondMultipleValue();
                var49.resetMultipleValues();
                var50 = var81_82;
                var51 = var83_84;
            }
            finally {
                module0289.$g2652$.rebind(var56, var49);
                module0289.$g2653$.rebind(var55, var49);
                module0289.$g2654$.rebind(var18_76, var49);
            }
        }
        finally {
            module0146.$g2028$.rebind(var53, var49);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f19420(final SubLObject var44, final SubLObject var65) {
        if (module0289.NIL != var44) {
            SubLObject var66 = (SubLObject)module0289.NIL;
            SubLObject var67 = var65;
            SubLObject var68 = (SubLObject)module0289.NIL;
            var68 = var67.first();
            while (module0289.NIL != var67) {
                final SubLObject var69 = conses_high.set_difference(module0232.f15306(var68), var44, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
                final SubLObject var70 = conses_high.set_difference(module0232.f15308(var68), var44, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
                var66 = (SubLObject)ConsesLow.cons(module0232.f15326(var69, var70), var66);
                var67 = var67.rest();
                var68 = var67.first();
            }
            return Sequences.nreverse(var66);
        }
        return var65;
    }
    
    public static SubLObject f19433(final SubLObject var65) {
        return f19432(f19424(var65));
    }
    
    public static SubLObject f19434(final SubLObject var85) {
        return f19432(f19435(var85));
    }
    
    public static SubLObject f19436(final SubLObject var12, SubLObject var13) {
        if (var13 == module0289.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0289.NIL;
        SubLObject var16 = (SubLObject)module0289.NIL;
        final SubLObject var17 = module0146.$g2024$.currentBinding(var14);
        try {
            module0146.$g2024$.bind((SubLObject)module0289.NIL, var14);
            var16 = module0288.f19366(var12, (SubLObject)module0289.NIL, var13);
        }
        finally {
            module0146.$g2024$.rebind(var17, var14);
        }
        if (!var16.isCons()) {
            return var12;
        }
        SubLObject var18 = (SubLObject)module0289.NIL;
        final SubLObject var19 = var13;
        final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var21 = module0147.$g2095$.currentBinding(var14);
        final SubLObject var22 = module0289.$g2652$.currentBinding(var14);
        try {
            module0147.$g2094$.bind(module0147.f9531(var19), var14);
            module0147.$g2095$.bind(module0147.f9534(var19), var14);
            module0289.$g2652$.bind(module0282.f18741(var12, var13), var14);
            final SubLObject var23 = module0202.f12970(var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            var15 = f19419(var16, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL != conses_high.set_difference(module0202.f12970(var15, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED), var23, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) || module0289.NIL == module0274.f18060(var15, var13, (SubLObject)module0289.UNPROVIDED));
        }
        finally {
            module0289.$g2652$.rebind(var22, var14);
            module0147.$g2095$.rebind(var21, var14);
            module0147.$g2094$.rebind(var20, var14);
        }
        if (module0289.NIL != var18) {
            return var12;
        }
        return var15;
    }
    
    public static SubLObject f19411(SubLObject var5) {
        var5 = f19437(var5);
        var5 = f19438(var5);
        return var5;
    }
    
    public static SubLObject f19438(final SubLObject var5) {
        if (module0289.NIL != module0035.f2428(module0289.$ic43$, var5, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
            return f19439(var5);
        }
        return var5;
    }
    
    public static SubLObject f19439(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)module0289.NIL;
        SubLObject var8 = (SubLObject)module0289.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0289.$ic44$);
        var7 = var5.first();
        SubLObject var9 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var5, (SubLObject)module0289.$ic44$);
        var8 = var9.first();
        var9 = var9.rest();
        if (module0289.NIL == var9) {
            final SubLObject var10 = module0202.f12849(var8);
            final SubLObject var11 = (SubLObject)((module0289.NIL != module0035.f1997(var10)) ? var10.first() : module0289.NIL);
            final SubLObject var12 = (SubLObject)((module0289.NIL != var11) ? Sequences.remove(var11, var8, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) : module0289.NIL);
            if (module0289.NIL == var11) {
                return var5;
            }
            SubLObject var96_97;
            final SubLObject var94_95 = var96_97 = var11;
            SubLObject var13 = (SubLObject)module0289.NIL;
            SubLObject var14 = (SubLObject)module0289.NIL;
            SubLObject var15 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var96_97, var94_95, (SubLObject)module0289.$ic45$);
            var13 = var96_97.first();
            var96_97 = var96_97.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var96_97, var94_95, (SubLObject)module0289.$ic45$);
            var14 = var96_97.first();
            var96_97 = var96_97.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var96_97, var94_95, (SubLObject)module0289.$ic45$);
            var15 = var96_97.first();
            var96_97 = var96_97.rest();
            if (module0289.NIL == var96_97) {
                if (module0289.NIL != module0210.f13566(var15)) {
                    final SubLObject var16 = module0178.f11287(var15);
                    SubLObject var17 = (SubLObject)ConsesLow.list(module0289.$ic37$, (SubLObject)ConsesLow.list(module0289.$ic38$, f19396(var15)));
                    final SubLObject var18 = Mapping.mapcar((SubLObject)module0289.$ic46$, var12);
                    final SubLObject var19 = var7;
                    SubLObject var20 = ConsesLow.append(var18, var19);
                    if (module0289.NIL != var20) {
                        if (module0289.NIL != module0035.f1997(var20)) {
                            var20 = var20.first();
                        }
                        else {
                            var20 = (SubLObject)ConsesLow.cons(module0289.$ic47$, var20);
                        }
                    }
                    if (!module0147.$g2095$.getDynamicValue(var6).eql(var16)) {
                        var17 = (SubLObject)ConsesLow.list(module0289.$ic48$, var16, var17);
                    }
                    return module0204.f13033((SubLObject)ConsesLow.list(module0289.$ic49$, var20, var17));
                }
                return var5;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var94_95, (SubLObject)module0289.$ic45$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0289.$ic44$);
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19437(final SubLObject var5) {
        if (module0289.NIL == module0035.f2428(module0289.$ic50$, var5, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
            return var5;
        }
        if (module0289.NIL != module0232.f15322(var5)) {
            return f19440(var5);
        }
        return f19441(var5);
    }
    
    public static SubLObject f19440(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0232.f15308(var5).first();
        if (module0289.NIL == module0202.f12858(var7)) {
            return var5;
        }
        SubLObject var9;
        final SubLObject var8 = var9 = var7;
        SubLObject var10 = (SubLObject)module0289.NIL;
        SubLObject var11 = (SubLObject)module0289.NIL;
        SubLObject var12 = (SubLObject)module0289.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0289.$ic51$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0289.$ic51$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0289.$ic51$);
        var12 = var9.first();
        var9 = var9.rest();
        if (module0289.NIL != var9) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0289.$ic51$);
            return (SubLObject)module0289.NIL;
        }
        final SubLObject var13 = module0205.f13207(var11, (SubLObject)module0289.UNPROVIDED);
        if (module0289.NIL != module0035.f1997(var13) && module0289.NIL != module0202.f12689(var13, Symbols.symbol_function((SubLObject)module0289.$ic52$)) && module0289.NIL != module0210.f13566(var12)) {
            final SubLObject var14 = module0178.f11287(var12);
            SubLObject var15 = (SubLObject)ConsesLow.list(module0289.$ic37$, (SubLObject)ConsesLow.list(module0289.$ic38$, f19396(var12)));
            if (!module0147.$g2095$.getDynamicValue(var6).eql(var14)) {
                var15 = (SubLObject)ConsesLow.list(module0289.$ic48$, var14, var15);
            }
            return module0232.f15326((SubLObject)module0289.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0289.$ic53$, var13.first(), var15)));
        }
        return var5;
    }
    
    public static SubLObject f19441(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)module0289.NIL;
        SubLObject var8 = (SubLObject)module0289.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)module0289.$ic44$);
        var7 = var5.first();
        SubLObject var9 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var5, (SubLObject)module0289.$ic44$);
        var8 = var9.first();
        var9 = var9.rest();
        if (module0289.NIL == var9) {
            final SubLObject var10 = module0202.f12848(var8);
            final SubLObject var11 = (SubLObject)((module0289.NIL != module0035.f1997(var10)) ? var10.first() : module0289.NIL);
            final SubLObject var12 = (SubLObject)((module0289.NIL != var11) ? Sequences.remove(var11, var8, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) : module0289.NIL);
            if (module0289.NIL == var11) {
                return var5;
            }
            SubLObject var117_118;
            final SubLObject var115_116 = var117_118 = var11;
            SubLObject var13 = (SubLObject)module0289.NIL;
            SubLObject var14 = (SubLObject)module0289.NIL;
            SubLObject var15 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)module0289.$ic51$);
            var13 = var117_118.first();
            var117_118 = var117_118.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)module0289.$ic51$);
            var14 = var117_118.first();
            var117_118 = var117_118.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)module0289.$ic51$);
            var15 = var117_118.first();
            var117_118 = var117_118.rest();
            if (module0289.NIL == var117_118) {
                final SubLObject var16 = module0205.f13207(var14, (SubLObject)module0289.UNPROVIDED);
                if (module0289.NIL != module0202.f12940(var16) && module0289.NIL != module0210.f13566(var15)) {
                    final SubLObject var17 = module0178.f11287(var15);
                    SubLObject var18 = (SubLObject)ConsesLow.list(module0289.$ic37$, (SubLObject)ConsesLow.list(module0289.$ic38$, f19396(var15)));
                    final SubLObject var19 = var7;
                    final SubLObject var20 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic46$), var12);
                    SubLObject var21 = ConsesLow.append(var19, var20);
                    if (module0289.NIL != var21) {
                        if (module0289.NIL != module0035.f1997(var21)) {
                            var21 = var21.first();
                        }
                        else {
                            var21 = (SubLObject)ConsesLow.cons(module0289.$ic47$, var21);
                        }
                    }
                    if (!module0147.$g2095$.getDynamicValue(var6).eql(var17)) {
                        var18 = (SubLObject)ConsesLow.list(module0289.$ic48$, var17, var18);
                    }
                    return module0232.f15326((SubLObject)module0289.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0289.$ic54$, var21, var18)));
                }
                return var5;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var115_116, (SubLObject)module0289.$ic51$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0289.$ic44$);
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19424(final SubLObject var65) {
        final SubLObject var66 = module0035.f2227(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic55$), var65), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
        SubLObject var67 = (SubLObject)module0289.NIL;
        SubLObject var68 = (SubLObject)module0289.NIL;
        SubLObject var69 = (SubLObject)module0289.NIL;
        SubLObject var70 = var65;
        SubLObject var71 = (SubLObject)module0289.NIL;
        var71 = var70.first();
        while (module0289.NIL != var70) {
            final SubLObject var72 = module0232.f15306(var71);
            if (module0289.NIL != module0035.f2201(var66, var72, Symbols.symbol_function((SubLObject)module0289.EQUAL))) {
                var67 = (SubLObject)ConsesLow.cons(module0276.f18280(module0232.f15308(var71), (SubLObject)module0289.UNPROVIDED), var67);
            }
            else if (module0289.NIL != conses_high.subsetp(var66, var72, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED)) {
                final SubLObject var73 = conses_high.set_difference(var72, var66, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
                final SubLObject var74 = module0232.f15308(var71);
                if (module0289.NIL != var73 && module0289.NIL != var74) {
                    var68 = (SubLObject)ConsesLow.cons(module0202.f12768(module0289.$ic56$, module0276.f18287(var73, (SubLObject)module0289.T), module0276.f18280(var74, (SubLObject)module0289.T)), var68);
                }
                else if (module0289.NIL != var73) {
                    var67 = (SubLObject)ConsesLow.cons(module0276.f18280(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic57$), var73), (SubLObject)module0289.UNPROVIDED), var67);
                }
                else if (module0289.NIL != var74) {
                    var67 = (SubLObject)ConsesLow.cons(module0276.f18280(var74, (SubLObject)module0289.UNPROVIDED), var67);
                }
            }
            else {
                var69 = (SubLObject)ConsesLow.cons(module0279.f18545(var71), var69);
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        var69 = Sequences.nreverse(var69);
        var67 = ConsesLow.nconc(Sequences.nreverse(var67), Sequences.nreverse(var68));
        var69 = (SubLObject)ConsesLow.cons(module0276.f18280((SubLObject)ConsesLow.list(module0205.f13338(module0276.f18287(var66, (SubLObject)module0289.UNPROVIDED)), module0276.f18287(var67, (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED), var69);
        return module0276.f18292(module0276.f18287(var69, (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19435(final SubLObject var85) {
        SubLObject var86 = (SubLObject)module0289.NIL;
        SubLObject var87 = var85;
        SubLObject var88 = (SubLObject)module0289.NIL;
        var88 = var87.first();
        while (module0289.NIL != var87) {
            final SubLObject var89 = module0279.f18546(var88);
            var86 = (SubLObject)ConsesLow.cons(var89, var86);
            var87 = var87.rest();
            var88 = var87.first();
        }
        var86 = Sequences.nreverse(var86);
        return module0276.f18292(module0276.f18280(var86, (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19442(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (var12.isAtom()) {
            return var12;
        }
        if (module0289.NIL == module0035.f2428(module0289.$ic28$, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED)) {
            return var12;
        }
        if (module0289.NIL != module0202.f12595(var12) || module0289.NIL != module0202.f12594(var12)) {
            final SubLObject var14 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
            return (SubLObject)ConsesLow.cons(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic58$), var14));
        }
        if (module0289.NIL != module0279.f18516(var12)) {
            return f19442(module0205.f13203(var12, (SubLObject)module0289.UNPROVIDED));
        }
        if (module0289.NIL != module0202.f12606(var12) || module0289.NIL != module0202.f12604(var12)) {
            SubLObject var15 = (SubLObject)module0289.NIL;
            SubLObject var16 = (SubLObject)module0289.NIL;
            SubLObject var17 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)module0289.$ic59$);
            var15 = var12.first();
            SubLObject var18 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)module0289.$ic59$);
            var16 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)module0289.$ic59$);
            var17 = var18.first();
            var18 = var18.rest();
            if (module0289.NIL == var18) {
                return (SubLObject)ConsesLow.list(var15, var16, f19442(var17));
            }
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0289.$ic59$);
        }
        else if (module0289.NIL != module0202.f12623(var12)) {
            SubLObject var15 = (SubLObject)module0289.NIL;
            SubLObject var19 = (SubLObject)module0289.NIL;
            SubLObject var20 = (SubLObject)module0289.NIL;
            SubLObject var21 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)module0289.$ic60$);
            var15 = var12.first();
            SubLObject var22 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var12, (SubLObject)module0289.$ic60$);
            var19 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var12, (SubLObject)module0289.$ic60$);
            var20 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var12, (SubLObject)module0289.$ic60$);
            var21 = var22.first();
            var22 = var22.rest();
            if (module0289.NIL == var22) {
                return (SubLObject)ConsesLow.list(var15, var19, var20, f19442(var21));
            }
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0289.$ic60$);
        }
        else if (module0289.NIL != module0202.f12592(var12)) {
            SubLObject var23 = (SubLObject)module0289.NIL;
            SubLObject var24 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)module0289.$ic61$);
            var23 = var12.first();
            SubLObject var25 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var25, var12, (SubLObject)module0289.$ic61$);
            var24 = var25.first();
            var25 = var25.rest();
            if (module0289.NIL == var25) {
                return (SubLObject)ConsesLow.list(var23, f19442(var24));
            }
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0289.$ic61$);
        }
        else {
            if (module0289.NIL != module0202.f12597(var12)) {
                var13.resetMultipleValues();
                final SubLObject var26 = module0202.f12796(var12);
                final SubLObject var27 = var13.secondMultipleValue();
                final SubLObject var28 = var13.thirdMultipleValue();
                var13.resetMultipleValues();
                return module0202.f12774(f19442(var27), f19442(var28));
            }
            if (module0289.NIL != module0202.f12651(var12)) {
                var13.resetMultipleValues();
                final SubLObject var29 = module0202.f12796(var12);
                final SubLObject var30 = var13.secondMultipleValue();
                final SubLObject var31 = var13.thirdMultipleValue();
                var13.resetMultipleValues();
                return module0202.f12768(module0289.$ic49$, f19442(var30), f19442(var31));
            }
            if (module0289.NIL != module0202.f12937(var12)) {
                return var12;
            }
            if (module0289.NIL != module0202.f12648(var12)) {
                return var12;
            }
            module0202.f12747((SubLObject)module0289.THREE_INTEGER, (SubLObject)module0289.$ic62$, var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            return var12;
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19428(final SubLObject var12) {
        if (!var12.isAtom()) {
            if (module0289.NIL != module0035.f2428(module0289.$ic28$, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED)) {
                if (module0289.NIL != module0279.f18516(var12)) {
                    return module0202.f12974(var12);
                }
                if (module0289.NIL != module0202.f12592(var12)) {
                    return f19428(module0205.f13203(var12, (SubLObject)module0289.UNPROVIDED));
                }
                if (module0289.NIL != module0202.f12595(var12) || module0289.NIL != module0202.f12594(var12)) {
                    return Sequences.remove_duplicates(module0035.f2077(Symbols.symbol_function((SubLObject)module0289.$ic63$), module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
                }
                if (module0289.NIL != module0202.f12606(var12) || module0289.NIL != module0202.f12604(var12)) {
                    return f19428(module0205.f13204(var12, (SubLObject)module0289.UNPROVIDED));
                }
                if (module0289.NIL != module0202.f12623(var12)) {
                    return f19428(module0205.f13205(var12, (SubLObject)module0289.UNPROVIDED));
                }
            }
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19416(SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0202.f12707(var12, (SubLObject)module0289.UNPROVIDED);
        SubLObject var15 = (SubLObject)module0289.NIL;
        if (module0289.NIL != var14) {
            var12 = module0202.f12712(var12);
        }
        if (var12.isAtom()) {
            var15 = var12;
        }
        else if (module0289.NIL != module0202.f12592(var12)) {
            var15 = module0202.f12643(module0205.f13136(var12), f19416(module0205.f13203(var12, (SubLObject)module0289.UNPROVIDED)));
        }
        else if (module0289.NIL != module0202.f12595(var12) || module0289.NIL != module0202.f12594(var12)) {
            var15 = module0202.f12683(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic64$), module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED);
        }
        else if (module0289.NIL != module0202.f12604(var12) || module0289.NIL != module0202.f12606(var12)) {
            var13.resetMultipleValues();
            final SubLObject var16 = module0202.f12796(var12);
            final SubLObject var17 = var13.secondMultipleValue();
            final SubLObject var18 = var13.thirdMultipleValue();
            var13.resetMultipleValues();
            final SubLObject var19 = f19404(var17);
            final SubLObject var20 = f19416(var18);
            if (module0289.NIL == var19) {
                var15 = module0202.f12768(var16, var17, var20);
            }
            else if (var19.eql(var17)) {
                var15 = module0202.f12768(var16, var17, var20);
            }
            else if (module0289.NIL != module0035.f2428(var19, var20, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                var15 = module0202.f12768(var16, var17, var20);
            }
            else {
                var15 = conses_high.subst(var19, var17, module0202.f12768(var16, var17, var20), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            }
        }
        else if (module0289.NIL != module0202.f12623(var12)) {
            var13.resetMultipleValues();
            final SubLObject var16 = module0202.f12797(var12);
            final SubLObject var21 = var13.secondMultipleValue();
            final SubLObject var22 = var13.thirdMultipleValue();
            final SubLObject var23 = var13.fourthMultipleValue();
            var13.resetMultipleValues();
            final SubLObject var24 = f19404(var22);
            final SubLObject var25 = f19416(var23);
            if (module0289.NIL == var24) {
                var15 = module0202.f12769(var16, var21, var22, var25);
            }
            else if (var24.eql(var22)) {
                var15 = module0202.f12769(var16, var21, var22, var25);
            }
            else if (module0289.NIL != module0035.f2428(var24, var25, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                var15 = module0202.f12769(var16, var21, var22, var25);
            }
            else {
                var15 = conses_high.subst(var24, var22, module0202.f12769(var16, var21, var22, var25), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            }
        }
        else if (module0289.NIL != module0202.f12925(var12)) {
            var15 = module0202.f12683(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic64$), module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED);
        }
        else if (module0289.NIL != module0202.f12977(var12)) {
            final SubLObject var26 = module0226.f15099(module0205.f13136(var12), (SubLObject)module0289.UNPROVIDED);
            SubLObject var27 = (SubLObject)module0289.ZERO_INTEGER;
            SubLObject var28 = (SubLObject)module0289.NIL;
            SubLObject var29 = var12;
            SubLObject var30 = (SubLObject)module0289.NIL;
            var30 = var29.first();
            while (module0289.NIL != var29) {
                if (module0289.NIL != module0004.f104(var27, var26, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                    var28 = (SubLObject)ConsesLow.cons(var30, var28);
                }
                else {
                    var28 = (SubLObject)ConsesLow.cons(f19416(var30), var28);
                }
                var27 = Numbers.add(var27, (SubLObject)module0289.ONE_INTEGER);
                var29 = var29.rest();
                var30 = var29.first();
            }
            var28 = Sequences.nreverse(var28);
            var27 = (SubLObject)module0289.ZERO_INTEGER;
            var29 = var12;
            var30 = (SubLObject)module0289.NIL;
            var30 = var29.first();
            while (module0289.NIL != var29) {
                if (module0289.NIL != module0004.f104(var27, var26, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                    final SubLObject var31 = f19404(var30);
                    if (module0289.NIL != var31) {
                        if (!var31.eql(var30)) {
                            if (module0289.NIL == module0035.f2428(var31, var28, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                                var28 = conses_high.subst(var31, var30, var28, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
                            }
                        }
                    }
                }
                var27 = Numbers.add(var27, (SubLObject)module0289.ONE_INTEGER);
                var29 = var29.rest();
                var30 = var29.first();
            }
            var15 = var28;
        }
        else if (module0289.NIL != module0202.f12932(var12)) {
            var15 = module0202.f12683(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic64$), module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED);
        }
        else {
            module0202.f12747((SubLObject)module0289.FOUR_INTEGER, (SubLObject)module0289.$ic65$, var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            var15 = var12;
        }
        if (module0289.NIL != var14) {
            var15 = module0202.f12711(var14, var15);
        }
        return var15;
    }
    
    public static SubLObject f19429(SubLObject var12) {
        final SubLObject var13 = f19442(var12);
        if (!var12.equal(var13)) {
            var12 = module0282.f18667(var13);
        }
        var12 = f19443(var12);
        return var12;
    }
    
    public static SubLObject f19443(SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (var12.isAtom()) {
            return var12;
        }
        if (module0289.NIL == module0289.$g2653$.getDynamicValue(var13)) {
            return var12;
        }
        if (module0289.NIL == module0146.$g2048$.getDynamicValue(var13)) {
            return var12;
        }
        if (module0289.NIL == module0202.f12595(var12) && module0289.NIL == module0202.f12594(var12)) {
            if (module0289.NIL != module0202.f12606(var12) || module0289.NIL != module0202.f12604(var12)) {
                SubLObject var15;
                final SubLObject var14 = var15 = var12;
                SubLObject var16 = (SubLObject)module0289.NIL;
                SubLObject var17 = (SubLObject)module0289.NIL;
                SubLObject var18 = (SubLObject)module0289.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0289.$ic59$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0289.$ic59$);
                var17 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0289.$ic59$);
                var18 = var15.first();
                var15 = var15.rest();
                if (module0289.NIL == var15) {
                    return (SubLObject)ConsesLow.list(var16, var17, f19443(var18));
                }
                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0289.$ic59$);
            }
            else if (module0289.NIL != module0202.f12623(var12)) {
                SubLObject var20;
                final SubLObject var19 = var20 = var12;
                SubLObject var16 = (SubLObject)module0289.NIL;
                SubLObject var21 = (SubLObject)module0289.NIL;
                SubLObject var22 = (SubLObject)module0289.NIL;
                SubLObject var23 = (SubLObject)module0289.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0289.$ic60$);
                var16 = var20.first();
                var20 = var20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0289.$ic60$);
                var21 = var20.first();
                var20 = var20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0289.$ic60$);
                var22 = var20.first();
                var20 = var20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0289.$ic60$);
                var23 = var20.first();
                var20 = var20.rest();
                if (module0289.NIL == var20) {
                    return (SubLObject)ConsesLow.list(var16, var21, var22, f19443(var23));
                }
                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0289.$ic60$);
            }
            else {
                if (module0289.NIL != module0202.f12937(var12)) {
                    SubLObject var24 = module0289.$g2653$.getDynamicValue(var13);
                    SubLObject var25 = (SubLObject)module0289.NIL;
                    var25 = var24.first();
                    while (module0289.NIL != var24) {
                        if (module0289.NIL != module0035.f2428(var25, var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                            var12 = (SubLObject)ConsesLow.list(module0289.$ic66$, var25, var12);
                            module0289.$g2653$.setDynamicValue(Sequences.remove(var25, module0289.$g2653$.getDynamicValue(var13), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED), var13);
                        }
                        var24 = var24.rest();
                        var25 = var24.first();
                    }
                    return var12;
                }
                if (module0289.NIL != module0202.f12648(var12)) {
                    return var12;
                }
                module0202.f12747((SubLObject)module0289.THREE_INTEGER, (SubLObject)module0289.$ic62$, var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
                return var12;
            }
            return (SubLObject)module0289.NIL;
        }
        final SubLObject var26 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
        SubLObject var28;
        final SubLObject var27 = var28 = f19444(module0289.$g2653$.getDynamicValue(var13), var26, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        SubLObject var29 = (SubLObject)module0289.NIL;
        var29 = var28.first();
        while (module0289.NIL != var28) {
            var12 = (SubLObject)ConsesLow.list(module0289.$ic66$, var29, var12);
            var28 = var28.rest();
            var29 = var28.first();
        }
        module0289.$g2653$.setDynamicValue(conses_high.set_difference(module0289.$g2653$.getDynamicValue(var13), var27, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED), var13);
        if (module0289.NIL != var27) {
            return f19443(var12);
        }
        if (module0289.NIL != module0289.$g2653$.getDynamicValue(var13)) {
            return (SubLObject)ConsesLow.cons(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic67$), var26));
        }
        return var12;
    }
    
    public static SubLObject f19444(final SubLObject var159, final SubLObject var160, SubLObject var161, SubLObject var162) {
        if (var161 == module0289.UNPROVIDED) {
            var161 = Symbols.symbol_function((SubLObject)module0289.EQL);
        }
        if (var162 == module0289.UNPROVIDED) {
            var162 = Symbols.symbol_function((SubLObject)module0289.IDENTITY);
        }
        SubLObject var163 = (SubLObject)module0289.NIL;
        SubLObject var164 = var159;
        SubLObject var165 = (SubLObject)module0289.NIL;
        var165 = var164.first();
        while (module0289.NIL != var164) {
            SubLObject var166 = (SubLObject)module0289.NIL;
            SubLObject var167 = (SubLObject)module0289.NIL;
            if (module0289.NIL == var167) {
                SubLObject var168 = var160;
                SubLObject var169 = (SubLObject)module0289.NIL;
                var169 = var168.first();
                while (module0289.NIL == var167 && module0289.NIL != var168) {
                    if (module0289.NIL != module0035.f2428(var165, var169, var161, var162)) {
                        if (module0289.NIL != var166) {
                            var167 = (SubLObject)module0289.T;
                        }
                        else {
                            var166 = (SubLObject)module0289.T;
                        }
                    }
                    var168 = var168.rest();
                    var169 = var168.first();
                }
            }
            if (module0289.NIL != var167) {
                var163 = (SubLObject)ConsesLow.cons(var165, var163);
            }
            var164 = var164.rest();
            var165 = var164.first();
        }
        return var163;
    }
    
    public static SubLObject f19445(final SubLObject var75, final SubLObject var160) {
        SubLObject var161 = (SubLObject)module0289.NIL;
        SubLObject var162 = var75;
        SubLObject var163 = (SubLObject)module0289.NIL;
        var163 = var162.first();
        while (module0289.NIL != var162) {
            final SubLObject var164 = f19446(var163);
            SubLObject var165 = (SubLObject)module0289.NIL;
            SubLObject var166 = (SubLObject)module0289.NIL;
            if (module0289.NIL == var166) {
                SubLObject var167 = var160;
                SubLObject var168 = (SubLObject)module0289.NIL;
                var168 = var167.first();
                while (module0289.NIL == var166 && module0289.NIL != var167) {
                    if (module0289.NIL != module0035.f2428(var163, var168, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED) || module0289.NIL != f19447(var164, var168, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                        if (module0289.NIL != var165) {
                            var166 = (SubLObject)module0289.T;
                        }
                        else {
                            var165 = (SubLObject)module0289.T;
                        }
                    }
                    var167 = var167.rest();
                    var168 = var167.first();
                }
            }
            if (module0289.NIL != var166) {
                var161 = (SubLObject)ConsesLow.cons(var163, var161);
            }
            var162 = var162.rest();
            var163 = var162.first();
        }
        return var161;
    }
    
    public static SubLObject f19447(final SubLObject var170, final SubLObject var171, SubLObject var161, SubLObject var162) {
        if (var161 == module0289.UNPROVIDED) {
            var161 = Symbols.symbol_function((SubLObject)module0289.EQL);
        }
        if (var162 == module0289.UNPROVIDED) {
            var162 = Symbols.symbol_function((SubLObject)module0289.IDENTITY);
        }
        SubLObject var172 = (SubLObject)module0289.NIL;
        if (module0289.NIL == var172) {
            SubLObject var173;
            SubLObject var174;
            for (var173 = var170, var174 = (SubLObject)module0289.NIL, var174 = var173.first(); module0289.NIL == var172 && module0289.NIL != var173; var172 = module0035.f2428(var174, var171, var161, var162), var173 = var173.rest(), var174 = var173.first()) {}
        }
        return var172;
    }
    
    public static SubLObject f19430(SubLObject var12, SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var174_175 = f19448(var12, var13);
        final SubLObject var176_177 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        var12 = var174_175;
        var13 = var176_177;
        var12 = f19449(f19450(var12), (SubLObject)module0289.UNPROVIDED);
        return Values.values(f19451(module0276.f18293(var12, (SubLObject)module0289.UNPROVIDED)), var13);
    }
    
    public static SubLObject f19448(final SubLObject var12, final SubLObject var13) {
        if (module0289.NIL != module0205.f13220(module0289.$ic27$, var13, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
            SubLObject var14 = (SubLObject)module0289.NIL;
            SubLObject var15 = module0205.f13377(var12, (SubLObject)module0289.UNPROVIDED);
            SubLObject var16 = (SubLObject)module0289.NIL;
            var16 = var15.first();
            while (module0289.NIL != var15) {
                if (module0289.NIL != f19452(var16)) {
                    var14 = (SubLObject)ConsesLow.cons(module0205.f13380(var16, (SubLObject)module0289.UNPROVIDED), var14);
                }
                else if (module0289.NIL != module0202.f12883(var16, (SubLObject)module0289.UNPROVIDED)) {
                    var14 = (SubLObject)ConsesLow.cons(var16, var14);
                }
                else {
                    var14 = (SubLObject)ConsesLow.cons(module0202.f12782(var13, var16), var14);
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
            return Values.values(module0202.f12773(Sequences.nreverse(var14)), module0289.$ic68$);
        }
        return Values.values(var12, var13);
    }
    
    public static SubLObject f19452(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL != module0202.f12883(var32, (SubLObject)module0289.UNPROVIDED) && module0205.f13379(var32, (SubLObject)module0289.UNPROVIDED).eql(module0289.$ic68$));
    }
    
    public static SubLObject f19450(final SubLObject var12) {
        final SubLObject var13 = module0035.f2439(Symbols.symbol_function((SubLObject)module0289.$ic69$), var12, (SubLObject)module0289.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0289.NIL;
        if (module0289.NIL == var13) {
            return var12;
        }
        if (module0289.NIL == module0202.f12595(var12)) {
            return var12;
        }
        SubLObject var15 = (SubLObject)module0289.NIL;
        SubLObject var16 = (SubLObject)module0289.NIL;
        if (module0289.NIL == var16) {
            SubLObject var17 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
            SubLObject var18 = (SubLObject)module0289.NIL;
            var18 = var17.first();
            while (module0289.NIL == var16 && module0289.NIL != var17) {
                if (module0289.NIL != module0202.f12594(var18)) {
                    if (module0289.NIL != var15) {
                        var15 = conses_high.intersection(var15, module0205.f13207(var18, (SubLObject)module0289.UNPROVIDED), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
                    }
                    else {
                        var15 = module0205.f13207(var18, (SubLObject)module0289.UNPROVIDED);
                    }
                }
                else {
                    var16 = (SubLObject)module0289.T;
                }
                var17 = var17.rest();
                var18 = var17.first();
            }
        }
        if (module0289.NIL == var16) {
            SubLObject var19 = var15;
            SubLObject var20 = (SubLObject)module0289.NIL;
            var20 = var19.first();
            while (module0289.NIL != var19) {
                if (module0289.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0289.$ic69$), var20, (SubLObject)module0289.UNPROVIDED)) {
                    var15 = Sequences.remove(var20, var15, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
            if (module0289.NIL != var15) {
                var19 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
                SubLObject var18 = (SubLObject)module0289.NIL;
                var18 = var19.first();
                while (module0289.NIL != var19) {
                    var14 = (SubLObject)ConsesLow.cons(module0276.f18280(conses_high.set_difference(module0205.f13207(var18, (SubLObject)module0289.UNPROVIDED), var15, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED), var14);
                    var19 = var19.rest();
                    var18 = var19.first();
                }
                var14 = module0276.f18293(module0276.f18280(ConsesLow.append(var15, (SubLObject)ConsesLow.list(module0276.f18287(Sequences.reverse(var14), (SubLObject)module0289.UNPROVIDED))), (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED);
            }
        }
        if (module0289.NIL != var14) {
            return var14;
        }
        return var12;
    }
    
    public static SubLObject f19449(SubLObject var12, SubLObject var182) {
        if (var182 == module0289.UNPROVIDED) {
            var182 = module0202.f12911(var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        }
        if (var12.isAtom()) {
            return var12;
        }
        if (module0289.NIL == module0035.f2439(Symbols.symbol_function((SubLObject)module0289.$ic69$), var12, (SubLObject)module0289.UNPROVIDED)) {
            return var12;
        }
        if (module0289.NIL != module0202.f12595(var12) || module0289.NIL != module0202.f12594(var12)) {
            final SubLObject var183 = Sequences.remove_duplicates(module0035.f2399(var12, Symbols.symbol_function((SubLObject)module0289.$ic69$), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            SubLObject var184 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
            SubLObject var185 = f19445(var183, var184);
            SubLObject var186 = (SubLObject)module0289.NIL;
            if (module0289.NIL != var185) {
                SubLObject var187;
                var185 = (var187 = f19453(var185));
                SubLObject var188 = (SubLObject)module0289.NIL;
                var188 = var187.first();
                while (module0289.NIL != var187) {
                    SubLObject var189 = (SubLObject)module0289.NIL;
                    SubLObject var190 = (SubLObject)module0289.NIL;
                    if (module0289.NIL == var190) {
                        SubLObject var191 = var184;
                        SubLObject var192 = (SubLObject)module0289.NIL;
                        var192 = var191.first();
                        while (module0289.NIL == var190 && module0289.NIL != var191) {
                            if (module0289.NIL != module0035.f2428(var188, var192, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED)) {
                                if (module0289.NIL != var189) {
                                    var190 = (SubLObject)module0289.T;
                                }
                                else {
                                    var189 = (SubLObject)module0289.T;
                                }
                            }
                            var191 = var191.rest();
                            var192 = var191.first();
                        }
                    }
                    if (module0289.NIL == var190) {
                        SubLObject var42_187 = f19446(var188);
                        SubLObject var193 = (SubLObject)module0289.NIL;
                        var193 = var42_187.first();
                        while (module0289.NIL != var42_187) {
                            var186 = (SubLObject)ConsesLow.cons(var193, var186);
                            f19454(var193);
                            var42_187 = var42_187.rest();
                            var193 = var42_187.first();
                        }
                        var185 = Sequences.remove(var188, var185, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
                    }
                    var187 = var187.rest();
                    var188 = var187.first();
                }
            }
            SubLObject var187 = var185;
            SubLObject var188 = (SubLObject)module0289.NIL;
            var188 = var187.first();
            while (module0289.NIL != var187) {
                var12 = f19455(var188, var12);
                var187 = var187.rest();
                var188 = var187.first();
            }
            if (module0289.NIL != var185) {
                var184 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
            }
            if (module0289.NIL != var183) {
                var12 = (SubLObject)ConsesLow.cons(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic70$), var184));
            }
            var187 = var186;
            SubLObject var194 = (SubLObject)module0289.NIL;
            var194 = var187.first();
            while (module0289.NIL != var187) {
                if (module0289.NIL != f19456(var194)) {
                    var12 = (SubLObject)ConsesLow.list(module0289.$ic66$, var194, var12);
                }
                f19457(var194);
                var187 = var187.rest();
                var194 = var187.first();
            }
            var187 = f19453(var185);
            var188 = (SubLObject)module0289.NIL;
            var188 = var187.first();
            while (module0289.NIL != var187) {
                var12 = f19458(var188, var12);
                SubLObject var42_188;
                final SubLObject var195 = var42_188 = f19459(var188);
                SubLObject var196 = (SubLObject)module0289.NIL;
                var196 = var42_188.first();
                while (module0289.NIL != var42_188) {
                    var12 = (SubLObject)ConsesLow.list(module0289.$ic66$, var196, var12);
                    var42_188 = var42_188.rest();
                    var196 = var42_188.first();
                }
                var187 = var187.rest();
                var188 = var187.first();
            }
            return var12;
        }
        if (module0289.NIL != module0202.f12606(var12)) {
            SubLObject var198;
            final SubLObject var197 = var198 = var12;
            SubLObject var199 = (SubLObject)module0289.NIL;
            SubLObject var200 = (SubLObject)module0289.NIL;
            SubLObject var201 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var198, var197, (SubLObject)module0289.$ic59$);
            var199 = var198.first();
            var198 = var198.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var198, var197, (SubLObject)module0289.$ic59$);
            var200 = var198.first();
            var198 = var198.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var198, var197, (SubLObject)module0289.$ic59$);
            var201 = var198.first();
            var198 = var198.rest();
            if (module0289.NIL == var198) {
                return (SubLObject)ConsesLow.list(var199, var200, f19449(var201, (SubLObject)module0289.UNPROVIDED));
            }
            cdestructuring_bind.cdestructuring_bind_error(var197, (SubLObject)module0289.$ic59$);
        }
        else {
            if (module0289.NIL != module0202.f12604(var12)) {
                SubLObject var202 = f19453(module0035.f2399(var12, Symbols.symbol_function((SubLObject)module0289.$ic69$), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED));
                SubLObject var203 = (SubLObject)module0289.NIL;
                var203 = var202.first();
                while (module0289.NIL != var202) {
                    var12 = f19458(var203, var12);
                    SubLObject var42_189;
                    final SubLObject var204 = var42_189 = f19459(var203);
                    SubLObject var205 = (SubLObject)module0289.NIL;
                    var205 = var42_189.first();
                    while (module0289.NIL != var42_189) {
                        var12 = (SubLObject)ConsesLow.list(module0289.$ic66$, var205, var12);
                        var42_189 = var42_189.rest();
                        var205 = var42_189.first();
                    }
                    var202 = var202.rest();
                    var203 = var202.first();
                }
                return var12;
            }
            if (module0289.NIL != module0202.f12648(var12)) {
                return var12;
            }
            if (module0289.NIL != module0202.f12623(var12)) {
                SubLObject var207;
                final SubLObject var206 = var207 = var12;
                SubLObject var199 = (SubLObject)module0289.NIL;
                SubLObject var208 = (SubLObject)module0289.NIL;
                SubLObject var209 = (SubLObject)module0289.NIL;
                SubLObject var210 = (SubLObject)module0289.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0289.$ic60$);
                var199 = var207.first();
                var207 = var207.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0289.$ic60$);
                var208 = var207.first();
                var207 = var207.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0289.$ic60$);
                var209 = var207.first();
                var207 = var207.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0289.$ic60$);
                var210 = var207.first();
                var207 = var207.rest();
                if (module0289.NIL == var207) {
                    return (SubLObject)ConsesLow.list(var199, var208, var209, f19449(var210, (SubLObject)module0289.UNPROVIDED));
                }
                cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0289.$ic60$);
            }
            else {
                if (module0289.NIL != module0202.f12937(var12)) {
                    SubLObject var202 = f19453(module0035.f2399(var12, Symbols.symbol_function((SubLObject)module0289.$ic69$), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED));
                    SubLObject var203 = (SubLObject)module0289.NIL;
                    var203 = var202.first();
                    while (module0289.NIL != var202) {
                        var12 = f19458(var203, var12);
                        SubLObject var42_190;
                        final SubLObject var204 = var42_190 = f19459(var203);
                        SubLObject var205 = (SubLObject)module0289.NIL;
                        var205 = var42_190.first();
                        while (module0289.NIL != var42_190) {
                            var12 = (SubLObject)ConsesLow.list(module0289.$ic66$, var205, var12);
                            var42_190 = var42_190.rest();
                            var205 = var42_190.first();
                        }
                        var202 = var202.rest();
                        var203 = var202.first();
                    }
                    return var12;
                }
                module0202.f12747((SubLObject)module0289.THREE_INTEGER, (SubLObject)module0289.$ic62$, var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
                return var12;
            }
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19455(final SubLObject var196, final SubLObject var12) {
        final SubLObject var197 = module0287.f19154(var196);
        return conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19458(final SubLObject var196, final SubLObject var12) {
        final SubLObject var197 = module0287.f19154(var196);
        final SubLObject var198 = module0287.f19158(var196);
        if (module0289.NIL == var198) {
            return (SubLObject)ConsesLow.list(module0289.$ic71$, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
        }
        if (module0289.NIL != module0202.f12589(var198, module0289.$ic72$)) {
            final SubLObject var199 = module0205.f13277(var198, (SubLObject)module0289.UNPROVIDED);
            return (SubLObject)ConsesLow.list(module0289.$ic73$, var199, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
        }
        if (module0289.NIL != module0202.f12589(var198, module0289.$ic74$)) {
            final SubLObject var200 = module0205.f13277(var198, (SubLObject)module0289.UNPROVIDED);
            return (SubLObject)ConsesLow.list(module0289.$ic75$, var200, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
        }
        if (module0289.NIL != module0305.f20438(var198, module0289.$ic76$, (SubLObject)module0289.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(module0289.$ic77$, var198, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
        }
        if (module0289.NIL != module0131.f8560() && (module0289.NIL != module0552.f34136(var198, (SubLObject)module0289.UNPROVIDED) || (var198.isCons() && var198.first().eql(module0289.$ic78$))) && var198.isList() && module0289.THREE_INTEGER.numE(Sequences.length(var198))) {
            SubLObject var202;
            final SubLObject var201 = var202 = var198;
            SubLObject var203 = (SubLObject)module0289.NIL;
            SubLObject var204 = (SubLObject)module0289.NIL;
            SubLObject var205 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0289.$ic79$);
            var203 = var202.first();
            var202 = var202.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0289.$ic79$);
            var204 = var202.first();
            var202 = var202.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0289.$ic79$);
            var205 = var202.first();
            var202 = var202.rest();
            if (module0289.NIL == var202) {
                if (var203.eql(module0289.$ic78$)) {
                    if (var205.eql(module0289.$ic80$) && module0289.NIL != module0305.f20438(var204, module0289.$ic76$, (SubLObject)module0289.UNPROVIDED)) {
                        return (SubLObject)ConsesLow.list(module0289.$ic73$, var204, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
                    }
                    if (var204.eql((SubLObject)module0289.ZERO_INTEGER) && module0289.NIL != module0305.f20438(var205, module0289.$ic76$, (SubLObject)module0289.UNPROVIDED)) {
                        return (SubLObject)ConsesLow.list(module0289.$ic75$, var205, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
                    }
                    return (SubLObject)ConsesLow.list(module0289.$ic77$, var198, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var201, (SubLObject)module0289.$ic79$);
            }
            return (SubLObject)module0289.NIL;
        }
        return (SubLObject)ConsesLow.list(module0289.$ic77$, var198, var197, conses_high.subst(var197, var196, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
    }
    
    public static SubLObject f19431(final SubLObject var12) {
        return module0276.f18293(f19460(f19461(var12)), (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19460(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (var12.isAtom()) {
            return var12;
        }
        if (module0289.NIL != module0202.f12592(var12)) {
            SubLObject var14 = (SubLObject)module0289.NIL;
            final SubLObject var15 = module0146.$g2032$.currentBinding(var13);
            try {
                module0146.$g2032$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL == module0146.$g2032$.getDynamicValue(var13)), var13);
                var14 = f19460(module0205.f13203(var12, (SubLObject)module0289.UNPROVIDED));
            }
            finally {
                module0146.$g2032$.rebind(var15, var13);
            }
            return module0202.f12643(module0205.f13136(var12), var14);
        }
        if (module0289.NIL != f19462(var12)) {
            final SubLObject var16 = module0205.f13207(module0276.f18293(module0282.f18667(module0282.f18673(var12)), (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED);
            final SubLObject var17 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic46$), module0202.f12842(var16));
            final SubLObject var18 = module0202.f12843(var16);
            final SubLObject var19 = f19460((SubLObject)((module0289.NIL != module0035.f1997(var17)) ? var17.first() : ConsesLow.cons(module0289.$ic47$, var17)));
            final SubLObject var20 = f19460((SubLObject)((module0289.NIL != module0035.f1997(var18)) ? var18.first() : ConsesLow.cons(module0289.$ic81$, var18)));
            return module0205.f13338(module0202.f12768(module0289.$ic56$, var19, var20));
        }
        if (module0289.NIL != f19463(var12)) {
            final SubLObject var16 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
            final SubLObject var17 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic46$), module0202.f12842(var16));
            final SubLObject var18 = module0202.f12843(var16);
            final SubLObject var19 = f19460((SubLObject)((module0289.NIL != module0035.f1997(var17)) ? var17.first() : ConsesLow.cons(module0289.$ic47$, var17)));
            final SubLObject var20 = f19460((SubLObject)((module0289.NIL != module0035.f1997(var18)) ? var18.first() : ConsesLow.cons(module0289.$ic81$, var18)));
            return module0202.f12768(module0289.$ic56$, var19, var20);
        }
        if (module0289.NIL != module0202.f12595(var12) || module0289.NIL != module0202.f12594(var12) || module0289.NIL != module0202.f12648(var12)) {
            return (SubLObject)ConsesLow.cons(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic82$), module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)));
        }
        if (module0289.NIL != module0202.f12606(var12) || module0289.NIL != module0202.f12604(var12)) {
            SubLObject var21 = (SubLObject)module0289.NIL;
            SubLObject var22 = (SubLObject)module0289.NIL;
            SubLObject var23 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)module0289.$ic59$);
            var21 = var12.first();
            SubLObject var24 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var24, var12, (SubLObject)module0289.$ic59$);
            var22 = var24.first();
            var24 = var24.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var24, var12, (SubLObject)module0289.$ic59$);
            var23 = var24.first();
            var24 = var24.rest();
            if (module0289.NIL == var24) {
                return (SubLObject)ConsesLow.list(var21, var22, f19460(var23));
            }
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0289.$ic59$);
        }
        else if (module0289.NIL != module0202.f12623(var12)) {
            SubLObject var21 = (SubLObject)module0289.NIL;
            SubLObject var25 = (SubLObject)module0289.NIL;
            SubLObject var26 = (SubLObject)module0289.NIL;
            SubLObject var27 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)module0289.$ic60$);
            var21 = var12.first();
            SubLObject var28 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var12, (SubLObject)module0289.$ic60$);
            var25 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var12, (SubLObject)module0289.$ic60$);
            var26 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var12, (SubLObject)module0289.$ic60$);
            var27 = var28.first();
            var28 = var28.rest();
            if (module0289.NIL == var28) {
                return (SubLObject)ConsesLow.list(var21, var25, var26, f19460(var27));
            }
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0289.$ic60$);
        }
        else {
            if (module0289.NIL != module0202.f12925(var12)) {
                return var12;
            }
            return var12;
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19463(final SubLObject var12) {
        if (module0289.NIL != module0202.f12594(var12)) {
            SubLObject var13 = (SubLObject)module0289.NIL;
            SubLObject var14 = (SubLObject)module0289.NIL;
            if (module0289.NIL == var13) {
                SubLObject var15 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
                SubLObject var16 = (SubLObject)module0289.NIL;
                var16 = var15.first();
                while (module0289.NIL == var13 && module0289.NIL != var15) {
                    if (module0289.NIL != module0202.f12592(var16)) {
                        var13 = (SubLObject)module0289.T;
                    }
                    else {
                        var14 = (SubLObject)module0289.T;
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            if (module0289.NIL != var13 && module0289.NIL == var14) {
                SubLObject var15 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
                SubLObject var16 = (SubLObject)module0289.NIL;
                var16 = var15.first();
                while (module0289.NIL == var14 && module0289.NIL != var15) {
                    if (module0289.NIL == module0202.f12592(var16)) {
                        var14 = (SubLObject)module0289.T;
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL != var13 && module0289.NIL != var14);
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19462(final SubLObject var12) {
        if (module0289.NIL != module0279.f18527() && module0289.NIL != module0202.f12595(var12)) {
            return f19463(module0276.f18292(module0282.f18667(module0282.f18673(var12)), (SubLObject)module0289.UNPROVIDED));
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19461(SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0202.f12707(var12, (SubLObject)module0289.UNPROVIDED);
        SubLObject var15 = (SubLObject)module0289.NIL;
        if (module0289.NIL != var14) {
            var12 = module0202.f12712(var12);
        }
        if (module0289.NIL != module0279.f18520(var12)) {
            var15 = module0279.f18522(var12, (SubLObject)module0289.UNPROVIDED);
        }
        else if (var12.isAtom()) {
            var15 = var12;
        }
        else if (module0289.NIL != module0202.f12592(var12)) {
            var15 = var12;
        }
        else if (module0289.NIL != module0202.f12595(var12) && Sequences.length(module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)).numL(module0289.$g2655$.getDynamicValue(var13))) {
            final SubLObject var16 = module0282.f18725(module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED));
            final SubLObject var17 = (SubLObject)((module0289.NIL != var16) ? Sequences.remove(var16, module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) : module0289.NIL);
            if (module0289.NIL != var17) {
                var15 = f19461((SubLObject)ConsesLow.cons(module0289.$ic81$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic83$), module0282.f18744(var17, var16.rest(), (SubLObject)module0289.UNPROVIDED))));
            }
            else {
                var15 = (SubLObject)ConsesLow.cons(module0289.$ic47$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic83$), module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)));
            }
        }
        else if (module0289.NIL != module0202.f12594(var12)) {
            var15 = (SubLObject)ConsesLow.cons(module0289.$ic81$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic83$), module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED)));
        }
        else if (module0289.NIL != module0202.f12937(var12)) {
            var15 = var12;
        }
        else if (module0289.NIL != f19464(var12)) {
            var15 = var12;
        }
        else if (module0289.NIL != module0202.f12935(var12)) {
            var15 = var12;
        }
        else {
            module0202.f12747((SubLObject)module0289.FOUR_INTEGER, (SubLObject)module0289.$ic84$, var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            var15 = var12;
        }
        if (module0289.NIL != var14) {
            var15 = module0202.f12711(var14, var15);
        }
        return var15;
    }
    
    public static SubLObject f19464(final SubLObject var12) {
        if (module0289.NIL != module0210.f13576(var12, (SubLObject)module0289.UNPROVIDED)) {
            return module0303.f20150(var12, (SubLObject)module0289.UNPROVIDED);
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19432(final SubLObject var31) {
        if (module0289.NIL == module0205.f13145((SubLObject)module0289.$ic85$, var31, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
            return var31;
        }
        return module0205.f13147(var31, (SubLObject)module0289.$ic86$, (SubLObject)module0289.$ic87$, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19465(final SubLObject var32) {
        if (module0289.NIL != module0202.f12883(var32, (SubLObject)module0289.UNPROVIDED)) {
            return module0202.f12883(module0202.f12887(var32), (SubLObject)module0289.UNPROVIDED);
        }
        if (module0289.NIL == module0202.f12595(var32)) {
            return (SubLObject)module0289.NIL;
        }
        if (module0289.NIL != module0035.f2370((SubLObject)module0289.$ic85$, module0205.f13207(var32, (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED)) {
            SubLObject var33 = (SubLObject)module0289.NIL;
            SubLObject var35;
            final SubLObject var34 = var35 = module0205.f13207(var32, (SubLObject)module0289.$ic88$);
            SubLObject var36 = (SubLObject)module0289.NIL;
            var36 = var35.first();
            while (module0289.NIL != var35) {
                final SubLObject var37 = module0202.f12906(var36);
                if (module0289.NIL == var33) {
                    var33 = var37;
                }
                else if (module0289.NIL == module0161.f10514(var37, var33)) {
                    return (SubLObject)module0289.NIL;
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
            return module0035.sublisp_boolean(var33);
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19466(final SubLObject var32) {
        if (module0289.NIL != module0202.f12883(var32, (SubLObject)module0289.UNPROVIDED)) {
            if (module0289.NIL != module0202.f12883(module0202.f12887(var32), (SubLObject)module0289.UNPROVIDED)) {
                return module0202.f12887(var32);
            }
        }
        else if (module0289.NIL != module0202.f12595(var32)) {
            if (module0289.NIL != module0035.f2370((SubLObject)module0289.$ic85$, module0205.f13207(var32, (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED)) {
                final SubLObject var33 = module0202.f12906(module0205.f13203(var32, (SubLObject)module0289.UNPROVIDED));
                SubLObject var34 = (SubLObject)module0289.NIL;
                SubLObject var36;
                final SubLObject var35 = var36 = module0205.f13207(var32, (SubLObject)module0289.$ic88$);
                SubLObject var37 = (SubLObject)module0289.NIL;
                var37 = var36.first();
                while (module0289.NIL != var36) {
                    final SubLObject var38 = module0202.f12887(var37);
                    var34 = (SubLObject)ConsesLow.cons(var38, var34);
                    var36 = var36.rest();
                    var37 = var36.first();
                }
                var34 = Sequences.nreverse(var34);
                return (SubLObject)ConsesLow.list(module0289.$ic48$, var33, reader.bq_cons(module0289.$ic47$, ConsesLow.append(var34, (SubLObject)module0289.NIL)));
            }
        }
        else {
            Errors.error((SubLObject)module0289.$ic89$, var32);
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19451(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (var12.isAtom()) {
            return var12;
        }
        if (module0289.NIL == module0035.f2428(module0289.$ic66$, var12, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED)) {
            return var12;
        }
        if (module0289.NIL != module0202.f12595(var12) || module0289.NIL != module0202.f12594(var12)) {
            final SubLObject var14 = module0205.f13207(var12, (SubLObject)module0289.UNPROVIDED);
            return (SubLObject)ConsesLow.cons(module0205.f13136(var12), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic90$), var14));
        }
        if (module0289.NIL != module0202.f12604(var12)) {
            SubLObject var15 = (SubLObject)module0289.NIL;
            SubLObject var16 = (SubLObject)module0289.NIL;
            SubLObject var17 = (SubLObject)module0289.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)module0289.$ic59$);
            var15 = var12.first();
            SubLObject var18 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)module0289.$ic59$);
            var16 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)module0289.$ic59$);
            var17 = var18.first();
            var18 = var18.rest();
            if (module0289.NIL != var18) {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0289.$ic59$);
                return (SubLObject)module0289.NIL;
            }
            if (module0289.NIL != module0004.f104(var16, module0289.$g2652$.getDynamicValue(var13), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                return module0202.f12768(var15, var16, f19451(var17));
            }
            return f19451(var17);
        }
        else {
            if (module0289.NIL != module0202.f12606(var12) || module0289.NIL != module0202.f12623(var12)) {
                return var12;
            }
            if (module0289.NIL != module0202.f12937(var12)) {
                return var12;
            }
            if (module0289.NIL != module0202.f12648(var12)) {
                return var12;
            }
            module0202.f12747((SubLObject)module0289.THREE_INTEGER, (SubLObject)module0289.$ic62$, var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            return var12;
        }
    }
    
    public static SubLObject f19427(final SubLObject var12, SubLObject var75) {
        if (var75 == module0289.UNPROVIDED) {
            var75 = f19425(var12);
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (module0289.NIL != var75 || module0289.$g2654$.getDynamicValue(var76).isHashtable()) {
            final SubLObject var77 = module0202.f12911(var12, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            final SubLObject var78 = Mapping.mapcar((SubLObject)module0289.$ic91$, var75);
            final SubLObject var79 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0289.$ic92$), Mapping.mapcar((SubLObject)module0289.$ic93$, var75), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            SubLObject var80 = (SubLObject)module0289.NIL;
            SubLObject var81 = var77;
            SubLObject var82 = (SubLObject)module0289.NIL;
            var82 = var81.first();
            while (module0289.NIL != var81) {
                if (module0289.NIL == module0004.f104(var82, var78, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL == module0004.f104(var82, var79, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL == Hashtables.gethash(var82, module0289.$g2654$.getDynamicValue(var76), (SubLObject)module0289.UNPROVIDED)) {
                    var80 = (SubLObject)ConsesLow.cons(var82, var80);
                }
                var81 = var81.rest();
                var82 = var81.first();
            }
            return var80;
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19454(final SubLObject var154) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var154, module0289.$g2654$.getDynamicValue(var155), (SubLObject)ConsesLow.cons(var154, Hashtables.gethash(var154, module0289.$g2654$.getDynamicValue(var155), (SubLObject)module0289.UNPROVIDED)));
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19456(final SubLObject var154) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        if (Hashtables.gethash(var154, module0289.$g2654$.getDynamicValue(var155), (SubLObject)module0289.UNPROVIDED).equal((SubLObject)ConsesLow.list(var154))) {
            return (SubLObject)module0289.T;
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19457(final SubLObject var154) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var154, module0289.$g2654$.getDynamicValue(var155), conses_high.set_difference(Hashtables.gethash(var154, module0289.$g2654$.getDynamicValue(var155), (SubLObject)module0289.UNPROVIDED), (SubLObject)ConsesLow.list(var154), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED));
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19446(final SubLObject var228) {
        return module0287.f19156(var228);
    }
    
    public static SubLObject f19425(final SubLObject var12) {
        return Sequences.remove_duplicates(module0035.f2399(var12, Symbols.symbol_function((SubLObject)module0289.$ic69$), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19426(final SubLObject var12, SubLObject var75) {
        if (var75 == module0289.UNPROVIDED) {
            var75 = f19425(var12);
        }
        final SubLObject var76 = Hashtables.make_hash_table((SubLObject)module0289.TWENTY_INTEGER, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        SubLObject var77 = var75;
        SubLObject var78 = (SubLObject)module0289.NIL;
        var78 = var77.first();
        while (module0289.NIL != var77) {
            SubLObject var42_230;
            final SubLObject var79 = var42_230 = f19446(var78);
            SubLObject var80 = (SubLObject)module0289.NIL;
            var80 = var42_230.first();
            while (module0289.NIL != var42_230) {
                Hashtables.sethash(var80, var76, (SubLObject)ConsesLow.cons(var78, Hashtables.gethash(var80, var76, (SubLObject)module0289.UNPROVIDED)));
                var42_230 = var42_230.rest();
                var80 = var42_230.first();
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        return var76;
    }
    
    public static SubLObject f19459(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f19446(var16);
        SubLObject var19 = (SubLObject)module0289.NIL;
        SubLObject var20 = var18;
        SubLObject var21 = (SubLObject)module0289.NIL;
        var21 = var20.first();
        while (module0289.NIL != var20) {
            final SubLObject var22 = conses_high.set_difference(Hashtables.gethash(var21, module0289.$g2654$.getDynamicValue(var17), (SubLObject)module0289.UNPROVIDED), (SubLObject)ConsesLow.list(var16), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
            Hashtables.sethash(var21, module0289.$g2654$.getDynamicValue(var17), var22);
            if (module0289.NIL == var22) {
                var19 = (SubLObject)ConsesLow.cons(var21, var19);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return var19;
    }
    
    public static SubLObject f19467(final SubLObject var16) {
        return Sequences.length(f19446(var16));
    }
    
    public static SubLObject f19453(final SubLObject var75) {
        return Sort.sort(var75, Symbols.symbol_function((SubLObject)module0289.$ic94$), Symbols.symbol_function((SubLObject)module0289.$ic95$));
    }
    
    public static SubLObject f19409(SubLObject var32, final SubLObject var38) {
        var32 = module0279.f18493(var32);
        SubLObject var39 = (SubLObject)module0289.NIL;
        SubLObject var40 = (SubLObject)module0289.NIL;
        SubLObject var41 = (SubLObject)module0289.NIL;
        var39 = var38;
        var40 = var39.first();
        for (var41 = (SubLObject)module0289.ZERO_INTEGER; module0289.NIL != var39; var39 = var39.rest(), var40 = var39.first(), var41 = Numbers.add((SubLObject)module0289.ONE_INTEGER, var41)) {
            final SubLObject var42 = module0193.f12079(var41);
            var32 = conses_high.nsubst(var40, var42, var32, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        }
        return var32;
    }
    
    public static SubLObject f19468(SubLObject var65, SubLObject var44, SubLObject var13) {
        if (var44 == module0289.UNPROVIDED) {
            var44 = module0202.f12845(module0035.f2077(Symbols.symbol_function((SubLObject)module0289.$ic55$), var65));
        }
        if (var13 == module0289.UNPROVIDED) {
            var13 = (SubLObject)module0289.NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = f19469(var65, var13);
        SubLObject var68 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic96$), var67);
        var65 = module0036.f2547(var65, Symbols.symbol_function((SubLObject)module0289.$ic97$), Symbols.symbol_function((SubLObject)module0289.$ic96$), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        var13 = module0036.f2547(var13, Symbols.symbol_function((SubLObject)module0289.$ic97$), Symbols.symbol_function((SubLObject)module0289.$ic96$), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        SubLObject var69;
        SubLObject var70;
        for (var69 = (SubLObject)module0289.NIL, var70 = (SubLObject)module0289.NIL, var69 = var44, var70 = var69.first(); module0289.NIL != var70; var70 = var69.first()) {
            var65 = f19470(var70, var65);
            if (module0289.NIL != module0210.f13577(conses_high.third(var70))) {
                var68 = (SubLObject)ConsesLow.cons(conses_high.third(var70), var68);
            }
            var69 = f19470(var70, var69.rest());
        }
        SubLObject var71 = var68;
        SubLObject var72 = (SubLObject)module0289.NIL;
        var72 = var71.first();
        while (module0289.NIL != var71) {
            var66.resetMultipleValues();
            final SubLObject var241_242 = f19471(var65, var72, var13);
            final SubLObject var243_244 = var66.secondMultipleValue();
            var66.resetMultipleValues();
            var65 = var241_242;
            var13 = var243_244;
            var71 = var71.rest();
            var72 = var71.first();
        }
        var65 = module0036.f2531(var65, Symbols.symbol_function((SubLObject)module0289.$ic98$), Symbols.symbol_function((SubLObject)module0289.$ic96$), (SubLObject)module0289.UNPROVIDED);
        var13 = module0036.f2531(var13, (SubLObject)module0289.$ic98$, (SubLObject)module0289.$ic96$, (SubLObject)module0289.UNPROVIDED);
        return Values.values(var65, var13);
    }
    
    public static SubLObject f19469(final SubLObject var65, SubLObject var13) {
        if (var13 == module0289.UNPROVIDED) {
            var13 = (SubLObject)module0289.NIL;
        }
        SubLObject var66 = (SubLObject)module0289.NIL;
        var66 = module0205.f13183(module0036.f2547((SubLObject)ConsesLow.cons(var13, var65), Symbols.symbol_function((SubLObject)module0289.$ic99$), Symbols.symbol_function((SubLObject)module0289.$ic100$), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.$ic97$, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        return var66;
    }
    
    public static SubLObject f19472(final SubLObject var65, SubLObject var44, SubLObject var13) {
        if (var44 == module0289.UNPROVIDED) {
            var44 = module0202.f12845(module0035.f2077(Symbols.symbol_function((SubLObject)module0289.$ic55$), var65));
        }
        if (var13 == module0289.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        return f19468(f19473(var65, var13), var44, var13);
    }
    
    public static SubLObject f19473(final SubLObject var65, SubLObject var13) {
        if (var13 == module0289.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0289.NIL;
        final SubLObject var68 = var13;
        final SubLObject var69 = module0147.$g2094$.currentBinding(var66);
        final SubLObject var70 = module0147.$g2095$.currentBinding(var66);
        try {
            module0147.$g2094$.bind(module0147.f9531(var68), var66);
            module0147.$g2095$.bind(module0147.f9534(var68), var66);
            var67 = module0036.f2531(var65, Symbols.symbol_function((SubLObject)module0289.$ic101$), Symbols.symbol_function((SubLObject)module0289.$ic102$), (SubLObject)module0289.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var70, var66);
            module0147.$g2094$.rebind(var69, var66);
        }
        return var67;
    }
    
    public static SubLObject f19474(final SubLObject var7) {
        final SubLObject var8 = f19396(var7);
        final SubLObject var9 = module0178.f11287(var7);
        return (SubLObject)ConsesLow.list(module0289.$ic37$, (SubLObject)ConsesLow.list(module0289.$ic38$, module0202.f12768(module0289.$ic48$, var9, var8)));
    }
    
    public static SubLObject f19470(final SubLObject var235, final SubLObject var246) {
        return conses_high.subst(conses_high.third(var235), conses_high.second(var235), var246, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19471(final SubLObject var65, final SubLObject var240, final SubLObject var13) {
        final SubLObject var241 = module0205.f13276(var240);
        SubLObject var242 = module0287.f19192(var241);
        if (module0289.NIL != var241 && module0289.NIL != var242) {
            final SubLObject var243 = module0287.f19154(var242);
            final SubLObject var244 = f19475(var243, var240, var65, var13);
            var242 = f19476(var244, var243, module0202.f12763(var242), (SubLObject)module0289.UNPROVIDED);
            SubLObject var246;
            final SubLObject var245 = var246 = conses_high.second(var242);
            SubLObject var247 = (SubLObject)module0289.NIL;
            var247 = var246.first();
            while (module0289.NIL != var246) {
                final SubLObject var248 = f19477(var247, var240, var65, var13);
                var242 = f19476(var248, var247, module0202.f12763(var242), (SubLObject)module0289.UNPROVIDED);
                var246 = var246.rest();
                var247 = var246.first();
            }
            return Values.values(f19476(var242, var240, var65, Symbols.symbol_function((SubLObject)module0289.EQUAL)), f19476(var242, var240, var13, Symbols.symbol_function((SubLObject)module0289.EQUAL)));
        }
        return Values.values(var65, var13);
    }
    
    public static SubLObject f19476(final SubLObject var253, final SubLObject var254, final SubLObject var246, SubLObject var161) {
        if (var161 == module0289.UNPROVIDED) {
            var161 = Symbols.symbol_function((SubLObject)module0289.EQL);
        }
        final SubLThread var255 = SubLProcess.currentSubLThread();
        if (module0289.NIL != Functions.funcall(var161, var253, var254)) {
            return var246;
        }
        SubLObject var256 = (SubLObject)module0289.NIL;
        final SubLObject var257 = module0205.$g2314$.currentBinding(var255);
        try {
            module0205.$g2314$.bind((SubLObject)module0289.$ic103$, var255);
            var256 = module0205.f13250(var253, var254, var246, var161, (SubLObject)module0289.UNPROVIDED);
        }
        finally {
            module0205.$g2314$.rebind(var257, var255);
        }
        return var256;
    }
    
    public static SubLObject f19477(final SubLObject var251, final SubLObject var240, SubLObject var65, SubLObject var13) {
        if (var65 == module0289.UNPROVIDED) {
            var65 = (SubLObject)module0289.NIL;
        }
        if (var13 == module0289.UNPROVIDED) {
            var13 = (SubLObject)module0289.NIL;
        }
        SubLObject var252 = (SubLObject)module0289.NIL;
        SubLObject var253 = (SubLObject)module0289.NIL;
        var253 = f19404(var251);
        if (!var251.eql(var253) && module0289.NIL != module0035.f2428(var253, (SubLObject)ConsesLow.cons(var13, var65), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
            var252 = var253;
        }
        if (module0289.NIL == var252) {
            var252 = var251;
        }
        return var252;
    }
    
    public static SubLObject f19475(final SubLObject var197, final SubLObject var240, SubLObject var65, SubLObject var13) {
        if (var65 == module0289.UNPROVIDED) {
            var65 = (SubLObject)module0289.NIL;
        }
        if (var13 == module0289.UNPROVIDED) {
            var13 = (SubLObject)module0289.NIL;
        }
        final SubLThread var241 = SubLProcess.currentSubLThread();
        SubLObject var242 = (SubLObject)module0289.NIL;
        SubLObject var243 = (SubLObject)module0289.NIL;
        if (module0289.NIL == module0035.f2428(var197, (SubLObject)ConsesLow.cons(var13, var65), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
            var243 = f19404(var197);
            if (!var197.eql(var243) && module0289.NIL == module0035.f2428(var243, (SubLObject)ConsesLow.cons(var13, var65), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)) {
                var242 = var243;
            }
        }
        if (module0289.NIL == var242) {
            final SubLObject var244 = conses_high.assoc(var197, module0146.$g2011$.getDynamicValue(var241), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            if (module0289.NIL != var244 && !var240.eql(var244.rest())) {
                final SubLObject var245 = conses_high.rassoc(var240, module0146.$g2011$.getDynamicValue(var241), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
                if (module0289.NIL != var245) {
                    var242 = var245.first();
                }
                else {
                    var242 = f19478(var197);
                }
            }
        }
        if (module0289.NIL == var242) {
            var242 = var197;
        }
        final SubLObject var246 = (SubLObject)ConsesLow.cons(var242, var240);
        if (module0289.NIL == conses_high.member(var246, module0146.$g2011$.getDynamicValue(var241), Symbols.symbol_function((SubLObject)module0289.EQUAL), Symbols.symbol_function((SubLObject)module0289.IDENTITY))) {
            module0146.$g2011$.setDynamicValue((SubLObject)ConsesLow.cons(var246, module0146.$g2011$.getDynamicValue(var241)), var241);
        }
        if (module0289.NIL != module0287.f19232(module0205.f13276(var240))) {
            module0287.f19233(var242, var197);
        }
        return var242;
    }
    
    public static SubLObject f19478(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = module0289.$g2656$.getGlobalValue();
        SubLObject var46 = (SubLObject)module0289.NIL;
        var46 = var45.first();
        while (module0289.NIL != var45) {
            if (module0289.NIL == module0004.f104(var46, module0146.$g2011$.getDynamicValue(var44), Symbols.symbol_function((SubLObject)module0289.EQL), Symbols.symbol_function((SubLObject)module0289.$ic105$))) {
                return var46;
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return module0285.f19070(var43);
    }
    
    public static SubLObject f19404(final SubLObject var234) {
        final SubLThread var235 = SubLProcess.currentSubLThread();
        if (module0289.NIL == module0146.$g2047$.getDynamicValue(var235)) {
            return var234;
        }
        if (module0289.NIL == module0201.f12546(var234)) {
            return var234;
        }
        final SubLObject var236 = module0201.f12548(var234);
        final SubLObject var237 = module0038.f2720(Symbols.symbol_function((SubLObject)module0289.$ic106$), var236, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        final SubLObject var238 = (SubLObject)((module0289.NIL != var237) ? module0038.f2720(Symbols.symbol_function((SubLObject)module0289.$ic107$), var236, var237, (SubLObject)module0289.UNPROVIDED) : module0289.NIL);
        SubLObject var239 = (SubLObject)module0289.NIL;
        if (module0289.NIL != var237 && module0289.NIL == var238 && var237.numG((SubLObject)module0289.ZERO_INTEGER)) {
            if (module0289.NIL != Characters.alpha_char_p(Vectors.aref(var236, Numbers.subtract(var237, (SubLObject)module0289.ONE_INTEGER)))) {
                var239 = module0201.f12550(module0038.f2623(var236, (SubLObject)module0289.ZERO_INTEGER, var237));
            }
            else {
                var239 = module0201.f12550(module0038.f2623(var236, (SubLObject)module0289.ZERO_INTEGER, Numbers.subtract(var237, (SubLObject)module0289.ONE_INTEGER)));
            }
        }
        if (module0289.NIL == var239) {
            return var234;
        }
        if (module0289.NIL != f19479(var234, var239)) {
            return var234;
        }
        f19410(var234, var239);
        return var239;
    }
    
    public static SubLObject f19410(final SubLObject var263, final SubLObject var264) {
        final SubLThread var265 = SubLProcess.currentSubLThread();
        SubLObject var266 = (SubLObject)module0289.NIL;
        if (module0289.NIL != module0067.f4852(module0289.$g2648$.getDynamicValue(var265))) {
            var266 = module0067.f4886(module0289.$g2648$.getDynamicValue(var265), var263, var264);
            if (module0289.NIL != var266 && !var263.eql(var264)) {
                var266 = module0067.f4886(module0289.$g2648$.getDynamicValue(var265), var264, (SubLObject)module0289.$ic108$);
            }
        }
        return var266;
    }
    
    public static SubLObject f19479(final SubLObject var263, final SubLObject var264) {
        final SubLThread var265 = SubLProcess.currentSubLThread();
        if (var263.eql(var264)) {
            return (SubLObject)module0289.NIL;
        }
        if (module0289.NIL != module0067.f4852(module0289.$g2648$.getDynamicValue(var265))) {
            final SubLObject var266 = module0067.f4884(module0289.$g2648$.getDynamicValue(var265), var263, (SubLObject)module0289.UNPROVIDED);
            final SubLObject var267 = module0067.f4884(module0289.$g2648$.getDynamicValue(var265), var264, (SubLObject)module0289.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(var266.eql((SubLObject)module0289.$ic108$) || (module0289.NIL != var267 && !var266.eql(var264)));
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19480(final SubLObject var16, SubLObject var13, final SubLObject var268) {
        final SubLObject var269 = module0287.f19195(var16, (SubLObject)module0289.UNPROVIDED);
        final SubLObject var270 = (SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL == var268 && module0289.NIL == f19481(var269));
        SubLObject var271 = (SubLObject)module0289.NIL;
        if (module0289.NIL != var268) {
            var13 = var268;
        }
        SubLObject var272 = var269;
        SubLObject var273 = (SubLObject)module0289.NIL;
        var273 = var272.first();
        while (module0289.NIL != var272) {
            final SubLObject var274 = (module0289.NIL != var268) ? var268 : module0178.f11287(var273);
            final SubLObject var275 = module0538.f33479(module0202.f12765(module0178.f11282(var273)), module0178.f11348(var273));
            final SubLObject var276 = f19412(var275);
            SubLObject var277 = conses_high.set_difference(module0232.f15308(var275), var276, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
            SubLObject var278 = conses_high.set_difference(module0232.f15306(var275), var276, Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
            if (module0289.NIL != var270) {
                SubLObject var279 = (SubLObject)module0289.NIL;
                SubLObject var280 = (SubLObject)module0289.NIL;
                SubLObject var42_274 = var277;
                SubLObject var281 = (SubLObject)module0289.NIL;
                var281 = var42_274.first();
                while (module0289.NIL != var42_274) {
                    var279 = (SubLObject)ConsesLow.cons(f19482(var274, var281, var13), var279);
                    var42_274 = var42_274.rest();
                    var281 = var42_274.first();
                }
                SubLObject var42_275 = var278;
                SubLObject var282 = (SubLObject)module0289.NIL;
                var282 = var42_275.first();
                while (module0289.NIL != var42_275) {
                    var280 = (SubLObject)ConsesLow.cons(f19482(var274, var282, var13), var280);
                    var42_275 = var42_275.rest();
                    var282 = var42_275.first();
                }
                var277 = var279;
                var278 = var280;
            }
            final SubLObject var283 = f19468((SubLObject)ConsesLow.list(module0232.f15326(var278, var277)), var276, var13);
            var271 = conses_high.nunion(var271, var283, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            var272 = var272.rest();
            var273 = var272.first();
        }
        return var271;
    }
    
    public static SubLObject f19482(final SubLObject var277, final SubLObject var31, final SubLObject var278) {
        final SubLObject var279 = (module0289.NIL != module0161.f10514(var277, var278)) ? var31 : module0202.f12782(var277, var31);
        return var279;
    }
    
    public static SubLObject f19481(final SubLObject var269) {
        SubLObject var270 = (SubLObject)module0289.NIL;
        SubLObject var271 = (SubLObject)module0289.NIL;
        if (module0289.NIL == var270) {
            SubLObject var272 = var269;
            SubLObject var273 = (SubLObject)module0289.NIL;
            var273 = var272.first();
            while (module0289.NIL == var270 && module0289.NIL != var272) {
                final SubLObject var274 = module0178.f11287(var273);
                if (module0289.NIL == var271) {
                    var271 = var274;
                }
                else if (module0289.NIL == module0161.f10514(var274, var271)) {
                    var270 = (SubLObject)module0289.T;
                }
                var272 = var272.rest();
                var273 = var272.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0289.NIL == var270);
    }
    
    public static SubLObject f19413(final SubLObject var65, SubLObject var44, SubLObject var13) {
        if (var44 == module0289.UNPROVIDED) {
            var44 = module0202.f12845(module0035.f2077(Symbols.symbol_function((SubLObject)module0289.$ic55$), var65));
        }
        if (var13 == module0289.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0289.NIL;
        SubLObject var68 = (SubLObject)module0289.NIL;
        final SubLObject var69 = module0146.$g2011$.currentBinding(var66);
        try {
            module0146.$g2011$.bind((SubLObject)module0289.NIL, var66);
            var66.resetMultipleValues();
            final SubLObject var282_283 = f19472(var65, var44, var13);
            final SubLObject var284_285 = var66.secondMultipleValue();
            var66.resetMultipleValues();
            var67 = var282_283;
            var68 = var284_285;
            SubLObject var70 = (SubLObject)module0289.NIL;
            final SubLObject var18_287 = module0205.$g2314$.currentBinding(var66);
            try {
                module0205.$g2314$.bind((SubLObject)module0289.$ic103$, var66);
                var70 = Mapping.mapcar((SubLObject)module0289.$ic109$, module0205.f13183((SubLObject)ConsesLow.cons(var13, var65), (SubLObject)module0289.$ic97$, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED));
            }
            finally {
                module0205.$g2314$.rebind(var18_287, var66);
            }
            SubLObject var71 = var44;
            SubLObject var72 = (SubLObject)module0289.NIL;
            var72 = var71.first();
            while (module0289.NIL != var71) {
                if (module0289.NIL != module0210.f13577(conses_high.third(var72))) {
                    var70 = (SubLObject)ConsesLow.cons(module0205.f13276(conses_high.third(var72)), var70);
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
            if (module0289.NIL != var70) {
                final SubLObject var73 = module0287.f19212(var70);
                if (module0289.NIL != var73) {
                    var68 = var73;
                }
                final SubLObject var74 = var70.first();
                var67 = conses_high.nunion(var67, f19480(var74, var13, var73), Symbols.symbol_function((SubLObject)module0289.EQUAL), (SubLObject)module0289.UNPROVIDED);
            }
        }
        finally {
            module0146.$g2011$.rebind(var69, var66);
        }
        return Values.values(var67, var68);
    }
    
    public static SubLObject f19483(final SubLObject var7) {
        final SubLObject var8 = module0178.f11348(var7);
        SubLObject var9 = module0178.f11282(var7);
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)module0289.NIL;
        var11 = var10.first();
        while (module0289.NIL != var10) {
            var9 = conses_high.nsubst(module0193.f12079(Sequences.position(var11, var8, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED)), var11, var9, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19412(final SubLObject var290) {
        return ConsesLow.append(f19484(var290), f19485(var290), f19486(var290));
    }
    
    public static SubLObject f19484(final SubLObject var290) {
        final SubLThread var291 = SubLProcess.currentSubLThread();
        SubLObject var292 = (SubLObject)module0289.NIL;
        SubLObject var293 = (SubLObject)module0289.NIL;
        SubLObject var295;
        final SubLObject var294 = var295 = module0035.remove_if_not((SubLObject)module0289.$ic110$, module0202.f12845(module0232.f15306(var290)), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        SubLObject var296 = (SubLObject)module0289.NIL;
        var296 = var295.first();
        while (module0289.NIL != var295) {
            if (module0289.NIL != module0210.f13577(module0202.f12835(var296, (SubLObject)module0289.UNPROVIDED))) {
                var293 = conses_high.nunion(var293, conses_high.copy_list(module0205.f13304(module0202.f12835(var296, (SubLObject)module0289.UNPROVIDED), (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            }
            var295 = var295.rest();
            var296 = var295.first();
        }
        final SubLObject var297 = module0146.$g2012$.currentBinding(var291);
        try {
            module0146.$g2012$.bind((SubLObject)module0289.T, var291);
            SubLObject var298 = var294;
            SubLObject var299 = (SubLObject)module0289.NIL;
            var299 = var298.first();
            while (module0289.NIL != var298) {
                if (module0289.NIL != module0201.f12580(module0202.f12834(var299, (SubLObject)module0289.UNPROVIDED)) && module0289.NIL == module0004.f104(module0202.f12834(var299, (SubLObject)module0289.UNPROVIDED), var293, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0035.f2441(module0202.f12834(var299, (SubLObject)module0289.UNPROVIDED), var290, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED).numG((SubLObject)module0289.ONE_INTEGER)) {
                    var292 = (SubLObject)ConsesLow.cons(var299, var292);
                }
                var298 = var298.rest();
                var299 = var298.first();
            }
        }
        finally {
            module0146.$g2012$.rebind(var297, var291);
        }
        return var292;
    }
    
    public static SubLObject f19487(final SubLObject var294) {
        final SubLObject var295 = module0205.f13388(var294, (SubLObject)module0289.UNPROVIDED);
        final SubLObject var296 = (SubLObject)((module0289.NIL != module0202.f12659(var295)) ? module0205.f13276(var295) : module0289.NIL);
        if (module0289.NIL != module0269.f17790(var296)) {
            return (SubLObject)module0289.T;
        }
        if (module0289.NIL != module0173.f10955(var296)) {
            return (SubLObject)module0289.T;
        }
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19485(final SubLObject var290) {
        final SubLObject var291 = module0202.f12847(module0232.f15306(var290));
        final SubLObject var292 = module0035.f2196(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic111$), var291), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        final SubLObject var293 = f19488(var290, (SubLObject)module0289.UNPROVIDED);
        final SubLObject var294 = module0202.f12911(module0232.f15308(var290), (SubLObject)module0289.NIL, (SubLObject)module0289.$ic92$, (SubLObject)module0289.UNPROVIDED);
        SubLObject var295 = (SubLObject)module0289.NIL;
        SubLObject var296 = (SubLObject)module0289.NIL;
        SubLObject var297 = var291;
        SubLObject var298 = (SubLObject)module0289.NIL;
        var298 = var297.first();
        while (module0289.NIL != var297) {
            if (module0289.NIL != module0210.f13577(conses_high.third(var298))) {
                var296 = conses_high.nunion(var296, conses_high.copy_list(module0205.f13304(conses_high.third(var298), (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            }
            var297 = var297.rest();
            var298 = var297.first();
        }
        var297 = var291;
        var298 = (SubLObject)module0289.NIL;
        var298 = var297.first();
        while (module0289.NIL != var297) {
            final SubLObject var299 = module0202.f12834(var298, (SubLObject)module0289.UNPROVIDED);
            if (module0289.NIL != module0201.f12580(var299) && module0289.NIL == module0004.f104(var299, var296, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL == module0004.f104(var299, var292, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL == module0004.f104(var299, var293, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL == module0004.f104(var299, var294, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL != module0229.f15238(module0202.f12835(var298, (SubLObject)module0289.UNPROVIDED)) && module0035.f2441(var299, var290, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED).numE((SubLObject)module0289.TWO_INTEGER) && module0289.NIL == f19489(var299, var290)) {
                var295 = (SubLObject)ConsesLow.cons(var298, var295);
            }
            var297 = var297.rest();
            var298 = var297.first();
        }
        return var295;
    }
    
    public static SubLObject f19489(final SubLObject var236, final SubLObject var290) {
        SubLObject var291 = (SubLObject)module0289.NIL;
        SubLObject var292 = module0232.f15308(var290);
        SubLObject var293 = (SubLObject)module0289.NIL;
        var293 = var292.first();
        while (module0289.NIL != var292) {
            final SubLObject var294 = module0202.f12833(var293, (SubLObject)module0289.UNPROVIDED);
            final SubLObject var295 = module0205.f13357(var293, var236, (SubLObject)module0289.UNPROVIDED);
            if (module0289.NIL == var291) {
                SubLObject var296 = var295;
                SubLObject var297 = (SubLObject)module0289.NIL;
                var297 = var296.first();
                while (module0289.NIL == var291 && module0289.NIL != var296) {
                    if (module0289.NIL != module0279.f18486(var294, var297, (SubLObject)module0289.UNPROVIDED)) {
                        var291 = (SubLObject)module0289.T;
                    }
                    var296 = var296.rest();
                    var297 = var296.first();
                }
            }
            var292 = var292.rest();
            var293 = var292.first();
        }
        return var291;
    }
    
    public static SubLObject f19488(final SubLObject var290, SubLObject var305) {
        if (var305 == module0289.UNPROVIDED) {
            var305 = (SubLObject)module0289.NIL;
        }
        SubLObject var306 = (SubLObject)module0289.NIL;
        if (module0289.NIL != var305 && var290.isList()) {
            return module0205.f13183(var290, (SubLObject)module0289.$ic112$, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        }
        if (module0289.NIL != var305 && module0289.NIL != module0206.f13497(var290)) {
            if (module0289.NIL == conses_high.member(var290, var306, Symbols.symbol_function((SubLObject)module0289.EQL), Symbols.symbol_function((SubLObject)module0289.IDENTITY))) {
                var306 = (SubLObject)ConsesLow.cons(var290, var306);
            }
        }
        else if (var290.isList() && module0289.NIL != module0173.f10955(module0205.f13132(var290)) && module0289.NIL != module0269.f17726(module0205.f13132(var290))) {
            SubLObject var308;
            final SubLObject var307 = var308 = module0205.f13207(var290, (SubLObject)module0289.$ic88$);
            SubLObject var309 = (SubLObject)module0289.NIL;
            var309 = var308.first();
            while (module0289.NIL != var308) {
                SubLObject var42_306 = f19488(var309, (SubLObject)module0289.T);
                SubLObject var310 = (SubLObject)module0289.NIL;
                var310 = var42_306.first();
                while (module0289.NIL != var42_306) {
                    final SubLObject var311 = var310;
                    if (module0289.NIL == conses_high.member(var311, var306, Symbols.symbol_function((SubLObject)module0289.EQL), Symbols.symbol_function((SubLObject)module0289.IDENTITY))) {
                        var306 = (SubLObject)ConsesLow.cons(var311, var306);
                    }
                    var42_306 = var42_306.rest();
                    var310 = var42_306.first();
                }
                var308 = var308.rest();
                var309 = var308.first();
            }
        }
        else if (var290.isList()) {
            SubLObject var312 = module0205.f13180(var290, (SubLObject)module0289.UNPROVIDED);
            SubLObject var313 = (SubLObject)module0289.NIL;
            var313 = var312.first();
            while (module0289.NIL != var312) {
                SubLObject var42_307 = f19488(var313, (SubLObject)module0289.UNPROVIDED);
                SubLObject var314 = (SubLObject)module0289.NIL;
                var314 = var42_307.first();
                while (module0289.NIL != var42_307) {
                    final SubLObject var315 = var314;
                    if (module0289.NIL == conses_high.member(var315, var306, Symbols.symbol_function((SubLObject)module0289.EQL), Symbols.symbol_function((SubLObject)module0289.IDENTITY))) {
                        var306 = (SubLObject)ConsesLow.cons(var315, var306);
                    }
                    var42_307 = var42_307.rest();
                    var314 = var42_307.first();
                }
                var312 = var312.rest();
                var313 = var312.first();
            }
        }
        return var306;
    }
    
    public static SubLObject f19486(final SubLObject var290) {
        final SubLObject var291 = module0202.f12846(module0232.f15306(var290));
        final SubLObject var292 = module0035.f2196(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0289.$ic111$), var291), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
        SubLObject var293 = (SubLObject)module0289.NIL;
        SubLObject var294 = (SubLObject)module0289.NIL;
        SubLObject var295 = var291;
        SubLObject var296 = (SubLObject)module0289.NIL;
        var296 = var295.first();
        while (module0289.NIL != var295) {
            if (module0289.NIL != module0210.f13577(conses_high.third(var296))) {
                var294 = conses_high.nunion(var294, conses_high.copy_list(module0205.f13304(conses_high.third(var296), (SubLObject)module0289.UNPROVIDED)), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
            }
            var295 = var295.rest();
            var296 = var295.first();
        }
        var295 = var291;
        var296 = (SubLObject)module0289.NIL;
        var296 = var295.first();
        while (module0289.NIL != var295) {
            if (module0289.NIL != module0201.f12580(module0202.f12834(var296, (SubLObject)module0289.UNPROVIDED)) && module0289.NIL == module0004.f104(module0202.f12834(var296, (SubLObject)module0289.UNPROVIDED), var294, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL == module0004.f104(module0202.f12834(var296, (SubLObject)module0289.UNPROVIDED), var292, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED) && module0289.NIL != module0229.f15238(module0202.f12835(var296, (SubLObject)module0289.UNPROVIDED)) && module0035.f2441(module0202.f12834(var296, (SubLObject)module0289.UNPROVIDED), var290, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED).numG((SubLObject)module0289.ONE_INTEGER)) {
                var293 = (SubLObject)ConsesLow.cons(var296, var293);
            }
            var295 = var295.rest();
            var296 = var295.first();
        }
        return var293;
    }
    
    public static SubLObject f19490(final SubLObject var31) {
        return f19491(var31);
    }
    
    public static SubLObject f19491(SubLObject var32) {
        if (var32.isCons()) {
            var32 = conses_high.copy_tree(var32);
        }
        return module0036.f2532(var32, Symbols.symbol_function((SubLObject)module0289.$ic113$), Symbols.symbol_function((SubLObject)module0289.$ic114$), (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED, (SubLObject)module0289.UNPROVIDED);
    }
    
    public static SubLObject f19492() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0289", "f19394", "S#22005");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19395", "S#22006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19397", "S#22007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19396", "ASSERTION-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19401", "S#14711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19402", "ASSERTION-EL-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19398", "S#22008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19403", "S#22003", 1, 0, false);
        new $f19403$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19405", "S#22004", 1, 0, false);
        new $f19405$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19406", "S#22009", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19407", "S#22010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19408", "S#22011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19400", "S#22012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19399", "S#22013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19414", "S#22014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19417", "S#22015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19418", "S#22016", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19419", "S#21053", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19421", "S#22017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19422", "S#22018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19423", "S#22019", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19415", "S#22020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19420", "S#22021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19433", "S#21464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19434", "S#21466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19436", "EL-VERSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19411", "S#22022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19438", "S#22023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19439", "S#22024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19437", "S#22025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19440", "S#22026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19441", "S#22027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19424", "S#22028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19435", "S#22029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19442", "S#22030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19428", "S#22031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19416", "S#22032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19429", "S#22033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19443", "S#22034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19444", "S#22035", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19445", "S#22036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19447", "S#22037", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19430", "S#22038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19448", "S#22039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19452", "S#22040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19450", "S#22041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19449", "S#22042", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19455", "S#22043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19458", "S#22044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19431", "S#21242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19460", "S#22045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19463", "S#22046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19462", "S#22047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19461", "S#22048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19464", "S#22049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19432", "S#22050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19465", "S#22051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19466", "S#22052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19451", "S#22053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19427", "S#22054", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19454", "S#22055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19456", "S#22056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19457", "S#22057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19446", "S#22058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19425", "S#22059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19426", "S#22060", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19459", "S#22061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19467", "S#22062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19453", "S#22063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19409", "S#22064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19468", "S#22065", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19469", "S#22066", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19472", "S#22067", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19473", "S#22068", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19474", "S#22069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19470", "S#22070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19471", "S#22071", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19476", "S#22072", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19477", "S#22073", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19475", "S#22074", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19478", "S#22075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19404", "S#22076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19410", "S#22077", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19479", "S#22078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19480", "S#22079", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19482", "S#22080", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19481", "S#22081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19413", "S#22082", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19483", "S#22083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19412", "S#22084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19484", "S#21740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19487", "S#22085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19485", "S#22086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19489", "S#22087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19488", "S#22088", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19486", "S#22089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19490", "S#22090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0289", "f19491", "S#22091", 1, 0, false);
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19493() {
        module0289.$g2648$ = SubLFiles.defparameter("S#22092", (SubLObject)module0289.NIL);
        module0289.$g2649$ = SubLFiles.defparameter("S#22093", (SubLObject)module0289.NIL);
        module0289.$g2650$ = SubLFiles.deflexical("S#22094", (SubLObject)module0289.$ic29$);
        module0289.$g2651$ = SubLFiles.deflexical("S#22095", (SubLObject)module0289.NIL);
        module0289.$g2652$ = SubLFiles.defparameter("S#22096", (SubLObject)module0289.NIL);
        module0289.$g2653$ = SubLFiles.defparameter("S#22097", (SubLObject)module0289.NIL);
        module0289.$g2654$ = SubLFiles.defparameter("S#22098", (SubLObject)module0289.NIL);
        module0289.$g2655$ = SubLFiles.defparameter("S#22099", (SubLObject)module0289.FIVE_INTEGER);
        module0289.$g2656$ = SubLFiles.deflexical("S#22100", (SubLObject)module0289.$ic104$);
        return (SubLObject)module0289.NIL;
    }
    
    public static SubLObject f19494() {
        module0034.f1895((SubLObject)module0289.$ic7$);
        module0012.f368((SubLObject)module0289.$ic12$, (SubLObject)module0289.$ic13$, (SubLObject)module0289.$ic14$, (SubLObject)module0289.$ic15$, (SubLObject)module0289.$ic16$);
        module0012.f368((SubLObject)module0289.$ic17$, (SubLObject)module0289.$ic13$, (SubLObject)module0289.$ic18$, (SubLObject)module0289.$ic15$, (SubLObject)module0289.$ic19$);
        module0034.f1909((SubLObject)module0289.$ic30$);
        return (SubLObject)module0289.NIL;
    }
    
    public void declareFunctions() {
        f19492();
    }
    
    public void initializeVariables() {
        f19493();
    }
    
    public void runTopLevelForms() {
        f19494();
    }
    
    static {
        me = (SubLFile)new module0289();
        module0289.$g2648$ = null;
        module0289.$g2649$ = null;
        module0289.$g2650$ = null;
        module0289.$g2651$ = null;
        module0289.$g2652$ = null;
        module0289.$g2653$ = null;
        module0289.$g2654$ = null;
        module0289.$g2655$ = null;
        module0289.$g2656$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22092", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))));
        $ic3$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic4$ = SubLObjectFactory.makeSymbol("VAR", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#15982", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22077", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC")));
        $ic7$ = SubLObjectFactory.makeSymbol("S#22007", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic9$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic10$ = SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION-P");
        $ic11$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("ASSERTION-EL-FORMULA");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"));
        $ic14$ = SubLObjectFactory.makeString("Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic17$ = SubLObjectFactory.makeSymbol("ASSERTION-EL-IST-FORMULA");
        $ic18$ = SubLObjectFactory.makeString("Return the el formula in #$ist format for ASSERTION.");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"));
        $ic20$ = SubLObjectFactory.makeSymbol("S#22003", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#16405", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#22004", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#21051", "CYC");
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $ic29$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn")));
        $ic30$ = SubLObjectFactory.makeSymbol("S#22012", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#22095", "CYC");
        $ic32$ = SubLObjectFactory.makeInteger(2048);
        $ic33$ = SubLObjectFactory.makeInteger(1024);
        $ic34$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TREE-FIND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UncanonicalizerAssertionFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#22101", "CYC")))));
        $ic36$ = SubLObjectFactory.makeSymbol("S#22101", "CYC");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UncanonicalizerAssertionFn"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#22084", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#15970", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#15971", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#15969", "CYC");
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22102", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16446", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"));
        $ic46$ = SubLObjectFactory.makeSymbol("NEGATE");
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22103", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"));
        $ic52$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic53$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exceptFor"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exceptWhen"));
        $ic55$ = SubLObjectFactory.makeSymbol("NEG-LITS");
        $ic56$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic57$ = SubLObjectFactory.makeSymbol("S#16020", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#22030", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22106", "CYC"));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22106", "CYC"));
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22107", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22108", "CYC"));
        $ic62$ = SubLObjectFactory.makeString("unanticipated formula: ~s");
        $ic63$ = SubLObjectFactory.makeSymbol("S#22031", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#22032", "CYC");
        $ic65$ = SubLObjectFactory.makeString("~S is not well formed.");
        $ic66$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic67$ = SubLObjectFactory.makeSymbol("S#22034", "CYC");
        $ic68$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#15529", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#22042", "CYC");
        $ic71$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic72$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMinFn"));
        $ic73$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $ic74$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn"));
        $ic75$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistAtMost"));
        $ic76$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Integer"));
        $ic77$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistExactly"));
        $ic78$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Unity"));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PlusInfinity"));
        $ic81$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#22045", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#22048", "CYC");
        $ic84$ = SubLObjectFactory.makeString("~s is not well formed.");
        $ic85$ = SubLObjectFactory.makeSymbol("S#13483", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#22051", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#22052", "CYC");
        $ic88$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic89$ = SubLObjectFactory.makeString("unable to simplify #$ist expression ~s");
        $ic90$ = SubLObjectFactory.makeSymbol("S#22053", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#21748", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic93$ = SubLObjectFactory.makeSymbol("S#21682", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol(">");
        $ic95$ = SubLObjectFactory.makeSymbol("S#22062", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("TERM-OF-UNIT");
        $ic97$ = SubLObjectFactory.makeSymbol("S#16403", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("NART-P");
        $ic99$ = SubLObjectFactory.makeSymbol("S#16402", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("FIND-NART");
        $ic101$ = SubLObjectFactory.makeSymbol("S#16400", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#22069", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#16053", "CYC");
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?A"), (SubLObject)SubLObjectFactory.makeSymbol("?B"), (SubLObject)SubLObjectFactory.makeSymbol("?C"), (SubLObject)SubLObjectFactory.makeSymbol("?D"), (SubLObject)SubLObjectFactory.makeSymbol("?E"));
        $ic105$ = SubLObjectFactory.makeSymbol("S#18076", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $ic107$ = SubLObjectFactory.makeSymbol("S#3936", "CYC");
        $ic108$ = SubLObjectFactory.makeKeyword("UNUNUNIQUIFIABLE");
        $ic109$ = SubLObjectFactory.makeSymbol("NAT-FUNCTOR");
        $ic110$ = SubLObjectFactory.makeSymbol("S#22085", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#15729", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $ic113$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic114$ = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
    }
    
    public static final class $f19403$UnaryFunction extends UnaryFunction
    {
        public $f19403$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22003"));
        }
        
        public SubLObject processItem(final SubLObject var33) {
            return module0289.f19403(var33);
        }
    }
    
    public static final class $f19405$UnaryFunction extends UnaryFunction
    {
        public $f19405$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22004"));
        }
        
        public SubLObject processItem(final SubLObject var33) {
            return module0289.f19405(var33);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0289.class
	Total time: 820 ms
	
	Decompiled with Procyon 0.5.32.
*/