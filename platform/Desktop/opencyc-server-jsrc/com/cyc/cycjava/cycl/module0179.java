package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0179 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0179";
    public static final String myFingerPrint = "4b46bee05cba7cd4cd41bd72161499d8daec9fb027eb7cbf4c0e2035d61e9bd6";
    private static SubLSymbol $g2212$;
    public static SubLSymbol $g2214$;
    public static SubLSymbol $g2215$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    
    public static SubLObject f11396() {
        return module0052.f3724(module0065.f4763(module0179.$g2212$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0179.$ic1$), (SubLObject)module0179.UNPROVIDED);
    }
    
    public static SubLObject f11397(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0179.$ic2$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0179.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0179.$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0179.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0179.NIL;
        SubLObject var10_11 = (SubLObject)module0179.NIL;
        while (module0179.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0179.$ic2$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0179.$ic2$);
            if (module0179.NIL == conses_high.member(var10_11, (SubLObject)module0179.$ic3$, (SubLObject)module0179.UNPROVIDED, (SubLObject)module0179.UNPROVIDED)) {
                var9 = (SubLObject)module0179.T;
            }
            if (var10_11 == module0179.$ic4$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0179.NIL != var9 && module0179.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0179.$ic2$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0179.$ic5$, var4);
        final SubLObject var11 = (SubLObject)((module0179.NIL != var10) ? conses_high.cadr(var10) : module0179.$ic6$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0179.$ic7$, var4);
        final SubLObject var13 = (SubLObject)((module0179.NIL != var12) ? conses_high.cadr(var12) : module0179.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0179.$ic8$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0179.$ic9$, (SubLObject)module0179.$ic5$, var11, (SubLObject)module0179.$ic7$, var13), ConsesLow.append(var14, (SubLObject)module0179.NIL));
    }
    
    public static SubLObject f11398() {
        return module0179.$g2212$.getGlobalValue();
    }
    
    public static SubLObject f11399(final SubLObject var17) {
        final SubLObject var18 = module0182.f11508(var17);
        final SubLObject var19 = module0182.f11503(var18);
        return var19;
    }
    
    public static SubLObject f11400(final SubLObject var17) {
        final SubLObject var18 = module0182.f11508(var17);
        final SubLObject var19 = module0182.f11503(var18);
        return (SubLObject)ConsesLow.list(var19);
    }
    
    public static SubLObject f11401(final SubLObject var17) {
        final SubLObject var18 = module0182.f11508(var17);
        final SubLObject var19 = module0182.f11504(var18);
        return module0032.f1753(var19);
    }
    
    public static SubLObject f11402() {
        if (module0179.NIL != module0182.$g2213$.getGlobalValue()) {
            return (SubLObject)module0179.NIL;
        }
        module0182.$g2213$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0179.EQ), (SubLObject)module0179.UNPROVIDED));
        return (SubLObject)module0179.T;
    }
    
    public static SubLObject f11403(final SubLObject var21, final SubLObject var22) {
        if (module0179.NIL == module0179.$g2212$.getGlobalValue()) {
            module0179.$g2212$.setGlobalValue(module0065.f4745(var21, (SubLObject)module0179.ZERO_INTEGER));
        }
        module0181.f11463(var21, var22);
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11404(SubLObject var23) {
        if (var23 == module0179.UNPROVIDED) {
            var23 = (SubLObject)module0179.NIL;
        }
        f11405(var23);
        if (module0179.NIL == var23) {
            f11406();
        }
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11406() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = Storage.$current_area$.currentBinding(var24);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var24);
            module0065.f4760(module0179.$g2212$.getGlobalValue(), (SubLObject)module0179.UNPROVIDED);
            module0181.f11464(module0065.f4733(module0179.$g2212$.getGlobalValue()));
        }
        finally {
            Storage.$current_area$.rebind(var25, var24);
        }
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11407() {
        module0065.f4762(module0179.$g2212$.getGlobalValue());
        module0181.f11465();
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11408() {
        return module0065.f4794(module0179.$g2212$.getGlobalValue());
    }
    
    public static SubLObject f11409() {
        return (SubLObject)((module0179.NIL != module0179.$g2212$.getGlobalValue()) ? module0065.f4733(module0179.$g2212$.getGlobalValue()) : module0179.ZERO_INTEGER);
    }
    
    public static SubLObject f11410(final SubLObject var26) {
        return module0065.f4750(module0179.$g2212$.getGlobalValue(), var26, (SubLObject)module0179.UNPROVIDED);
    }
    
    public static SubLObject f11411() {
        return module0065.f4734(module0179.$g2212$.getGlobalValue());
    }
    
    public static SubLObject f11412() {
        return module0065.f4739(module0179.$g2212$.getGlobalValue());
    }
    
    public static SubLObject f11413() {
        return module0065.f4736(module0179.$g2212$.getGlobalValue());
    }
    
    public static SubLObject f11414() {
        return Numbers.subtract(f11409(), f11413());
    }
    
    public static SubLObject f11405(SubLObject var23) {
        if (var23 == module0179.UNPROVIDED) {
            var23 = (SubLObject)module0179.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0179.MINUS_ONE_INTEGER;
        if (module0179.NIL != var23) {
            var25 = var23;
        }
        else {
            final SubLObject var26 = f11398();
            final SubLObject var27 = (SubLObject)module0179.$ic14$;
            final SubLObject var28 = module0065.f4733(var26);
            SubLObject var29 = (SubLObject)module0179.ZERO_INTEGER;
            assert module0179.NIL != Types.stringp(var27) : var27;
            final SubLObject var30 = module0012.$g75$.currentBinding(var24);
            final SubLObject var31 = module0012.$g76$.currentBinding(var24);
            final SubLObject var32 = module0012.$g77$.currentBinding(var24);
            final SubLObject var33 = module0012.$g78$.currentBinding(var24);
            try {
                module0012.$g75$.bind((SubLObject)module0179.ZERO_INTEGER, var24);
                module0012.$g76$.bind((SubLObject)module0179.NIL, var24);
                module0012.$g77$.bind((SubLObject)module0179.T, var24);
                module0012.$g78$.bind(Time.get_universal_time(), var24);
                module0012.f478(var27);
                final SubLObject var35_36 = var26;
                if (module0179.NIL == module0065.f4772(var35_36, (SubLObject)module0179.$ic16$)) {
                    final SubLObject var37_38 = var35_36;
                    if (module0179.NIL == module0065.f4775(var37_38, (SubLObject)module0179.$ic16$)) {
                        final SubLObject var34 = module0065.f4740(var37_38);
                        final SubLObject var35 = (SubLObject)module0179.NIL;
                        SubLObject var36;
                        SubLObject var37;
                        SubLObject var38;
                        SubLObject var39;
                        for (var36 = Sequences.length(var34), var37 = (SubLObject)module0179.NIL, var37 = (SubLObject)module0179.ZERO_INTEGER; var37.numL(var36); var37 = Numbers.add(var37, (SubLObject)module0179.ONE_INTEGER)) {
                            var38 = ((module0179.NIL != var35) ? Numbers.subtract(var36, var37, (SubLObject)module0179.ONE_INTEGER) : var37);
                            var39 = Vectors.aref(var34, var38);
                            if (module0179.NIL == module0065.f4749(var39) || module0179.NIL == module0065.f4773((SubLObject)module0179.$ic16$)) {
                                if (module0179.NIL != module0065.f4749(var39)) {
                                    var39 = (SubLObject)module0179.$ic16$;
                                }
                                module0012.note_percent_progress(var29, var28);
                                var29 = Numbers.add(var29, (SubLObject)module0179.ONE_INTEGER);
                                var25 = Numbers.max(var25, f11415(var39));
                            }
                        }
                    }
                    final SubLObject var44_45 = var35_36;
                    if (module0179.NIL == module0065.f4777(var44_45) || module0179.NIL == module0065.f4773((SubLObject)module0179.$ic16$)) {
                        final SubLObject var40 = module0065.f4738(var44_45);
                        SubLObject var41 = module0065.f4739(var44_45);
                        final SubLObject var42 = module0065.f4734(var44_45);
                        final SubLObject var43 = (SubLObject)((module0179.NIL != module0065.f4773((SubLObject)module0179.$ic16$)) ? module0179.NIL : module0179.$ic16$);
                        while (var41.numL(var42)) {
                            final SubLObject var44 = Hashtables.gethash_without_values(var41, var40, var43);
                            if (module0179.NIL == module0065.f4773((SubLObject)module0179.$ic16$) || module0179.NIL == module0065.f4749(var44)) {
                                module0012.note_percent_progress(var29, var28);
                                var29 = Numbers.add(var29, (SubLObject)module0179.ONE_INTEGER);
                                var25 = Numbers.max(var25, f11415(var44));
                            }
                            var41 = Numbers.add(var41, (SubLObject)module0179.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var33, var24);
                module0012.$g77$.rebind(var32, var24);
                module0012.$g76$.rebind(var31, var24);
                module0012.$g75$.rebind(var30, var24);
            }
        }
        final SubLObject var45 = Numbers.add(var25, (SubLObject)module0179.ONE_INTEGER);
        module0065.f4741(module0179.$g2212$.getGlobalValue(), var45);
        return var45;
    }
    
    public static SubLObject f11416(final SubLObject var26, final SubLObject var17) {
        f11417(var17, var26);
        return module0065.f4753(module0179.$g2212$.getGlobalValue(), var26, var17);
    }
    
    public static SubLObject f11418(final SubLObject var26) {
        return module0065.f4761(module0179.$g2212$.getGlobalValue(), var26);
    }
    
    public static SubLObject f11419() {
        return module0065.f4746(module0179.$g2212$.getGlobalValue());
    }
    
    public static SubLObject f11420(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0179.$ic17$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0179.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0179.$ic17$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0179.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0179.NIL;
        SubLObject var56_57 = (SubLObject)module0179.NIL;
        while (module0179.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0179.$ic17$);
            var56_57 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0179.$ic17$);
            if (module0179.NIL == conses_high.member(var56_57, (SubLObject)module0179.$ic3$, (SubLObject)module0179.UNPROVIDED, (SubLObject)module0179.UNPROVIDED)) {
                var9 = (SubLObject)module0179.T;
            }
            if (var56_57 == module0179.$ic4$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0179.NIL != var9 && module0179.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0179.$ic17$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0179.$ic5$, var4);
        final SubLObject var11 = (SubLObject)((module0179.NIL != var10) ? conses_high.cadr(var10) : module0179.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0179.$ic7$, var4);
        final SubLObject var13 = (SubLObject)((module0179.NIL != var12) ? conses_high.cadr(var12) : module0179.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0179.$ic18$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0179.$ic9$, (SubLObject)module0179.$ic5$, var11, (SubLObject)module0179.$ic7$, var13), ConsesLow.append(var14, (SubLObject)module0179.NIL));
    }
    
    public static SubLObject f11421(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0179.$ic17$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0179.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0179.$ic17$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0179.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0179.NIL;
        SubLObject var66_67 = (SubLObject)module0179.NIL;
        while (module0179.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0179.$ic17$);
            var66_67 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0179.$ic17$);
            if (module0179.NIL == conses_high.member(var66_67, (SubLObject)module0179.$ic3$, (SubLObject)module0179.UNPROVIDED, (SubLObject)module0179.UNPROVIDED)) {
                var9 = (SubLObject)module0179.T;
            }
            if (var66_67 == module0179.$ic4$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0179.NIL != var9 && module0179.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0179.$ic17$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0179.$ic5$, var4);
        final SubLObject var11 = (SubLObject)((module0179.NIL != var10) ? conses_high.cadr(var10) : module0179.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0179.$ic7$, var4);
        final SubLObject var13 = (SubLObject)((module0179.NIL != var12) ? conses_high.cadr(var12) : module0179.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0179.$ic19$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0179.$ic9$, (SubLObject)module0179.$ic5$, var11, (SubLObject)module0179.$ic7$, var13), ConsesLow.append(var14, (SubLObject)module0179.NIL));
    }
    
    public static SubLObject f11422(final SubLObject var70, final SubLObject var71) {
        f11423(var70, var71, (SubLObject)module0179.ZERO_INTEGER);
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11424(final SubLObject var70) {
        return (SubLObject)((var70.getClass() == $sX14196_native.class) ? module0179.T : module0179.NIL);
    }
    
    public static SubLObject f11425(final SubLObject var70) {
        assert module0179.NIL != f11424(var70) : var70;
        return var70.getField2();
    }
    
    public static SubLObject f11426(final SubLObject var70, final SubLObject var73) {
        assert module0179.NIL != f11424(var70) : var70;
        return var70.setField2(var73);
    }
    
    public static SubLObject f11427(SubLObject var74) {
        if (var74 == module0179.UNPROVIDED) {
            var74 = (SubLObject)module0179.NIL;
        }
        final SubLObject var75 = (SubLObject)new $sX14196_native();
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        for (var76 = (SubLObject)module0179.NIL, var76 = var74; module0179.NIL != var76; var76 = conses_high.cddr(var76)) {
            var77 = var76.first();
            var78 = conses_high.cadr(var76);
            var79 = var77;
            if (var79.eql((SubLObject)module0179.$ic31$)) {
                f11426(var75, var78);
            }
            else {
                Errors.error((SubLObject)module0179.$ic32$, var77);
            }
        }
        return var75;
    }
    
    public static SubLObject f11428(final SubLObject var80, final SubLObject var81) {
        Functions.funcall(var81, var80, (SubLObject)module0179.$ic33$, (SubLObject)module0179.$ic34$, (SubLObject)module0179.ONE_INTEGER);
        Functions.funcall(var81, var80, (SubLObject)module0179.$ic35$, (SubLObject)module0179.$ic31$, f11425(var80));
        Functions.funcall(var81, var80, (SubLObject)module0179.$ic36$, (SubLObject)module0179.$ic34$, (SubLObject)module0179.ONE_INTEGER);
        return var80;
    }
    
    public static SubLObject f11429(final SubLObject var80, final SubLObject var81) {
        return f11428(var80, var81);
    }
    
    public static SubLObject f11423(final SubLObject var82, final SubLObject var71, final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        if (var82.eql(module0338.f22703())) {
            PrintLow.format(var71, (SubLObject)module0179.$ic38$);
        }
        else if (module0179.NIL != module0179.$g2215$.getDynamicValue(var84) && module0179.NIL != f11430(var82, (SubLObject)module0179.UNPROVIDED)) {
            PrintLow.format(var71, (SubLObject)module0179.$ic39$, module0182.f11516(var82));
        }
        else {
            PrintLow.format(var71, (SubLObject)module0179.$ic40$, f11425(var82));
        }
        return var82;
    }
    
    public static SubLObject f11431(final SubLObject var82) {
        final SubLObject var83 = f11425(var82);
        return (SubLObject)(var83.isInteger() ? var83 : module0179.$ic41$);
    }
    
    public static SubLObject f11432() {
        SubLObject var17 = (SubLObject)module0179.NIL;
        var17 = f11427((SubLObject)module0179.UNPROVIDED);
        return var17;
    }
    
    public static SubLObject f11433(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0179.NIL;
        var27 = f11427((SubLObject)module0179.UNPROVIDED);
        f11426(var27, var26);
        return var27;
    }
    
    public static SubLObject f11434(final SubLObject var17) {
        f11426(var17, (SubLObject)module0179.NIL);
        return var17;
    }
    
    public static SubLObject f11435(final SubLObject var17) {
        return f11425(var17);
    }
    
    public static SubLObject f11436(final SubLObject var84) {
        return Sequences.remove(var84, module0333.f22434(var84), Symbols.symbol_function((SubLObject)module0179.EQUAL), (SubLObject)module0179.UNPROVIDED, (SubLObject)module0179.UNPROVIDED, (SubLObject)module0179.UNPROVIDED, (SubLObject)module0179.UNPROVIDED);
    }
    
    public static SubLObject f11437(final SubLObject var82) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0179.NIL != f11424(var82) && module0179.NIL != f11438(var82));
    }
    
    public static SubLObject f11430(final SubLObject var82, SubLObject var85) {
        if (var85 == module0179.UNPROVIDED) {
            var85 = (SubLObject)module0179.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0179.NIL != f11437(var82) && (module0179.NIL == var85 || module0179.NIL != module0182.f11525(module0182.f11508(var82), var85)));
    }
    
    public static SubLObject f11439(SubLObject var26) {
        if (module0179.NIL == var26) {
            var26 = f11419();
        }
        assert module0179.NIL != Types.fixnump(var26) : var26;
        final SubLObject var27 = f11432();
        f11416(var26, var27);
        return var27;
    }
    
    public static SubLObject f11440() {
        return f11427((SubLObject)module0179.UNPROVIDED);
    }
    
    public static SubLObject f11441() {
        return f11427((SubLObject)module0179.UNPROVIDED);
    }
    
    public static SubLObject f11442() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        module0182.f11541();
        final SubLObject var25 = f11398();
        final SubLObject var26 = (SubLObject)module0179.$ic47$;
        final SubLObject var27 = module0065.f4733(var25);
        SubLObject var28 = (SubLObject)module0179.ZERO_INTEGER;
        assert module0179.NIL != Types.stringp(var26) : var26;
        final SubLObject var29 = module0012.$g75$.currentBinding(var24);
        final SubLObject var30 = module0012.$g76$.currentBinding(var24);
        final SubLObject var31 = module0012.$g77$.currentBinding(var24);
        final SubLObject var32 = module0012.$g78$.currentBinding(var24);
        try {
            module0012.$g75$.bind((SubLObject)module0179.ZERO_INTEGER, var24);
            module0012.$g76$.bind((SubLObject)module0179.NIL, var24);
            module0012.$g77$.bind((SubLObject)module0179.T, var24);
            module0012.$g78$.bind(Time.get_universal_time(), var24);
            module0012.f478(var26);
            final SubLObject var35_86 = var25;
            if (module0179.NIL == module0065.f4772(var35_86, (SubLObject)module0179.$ic16$)) {
                final SubLObject var37_87 = var35_86;
                if (module0179.NIL == module0065.f4775(var37_87, (SubLObject)module0179.$ic16$)) {
                    final SubLObject var33 = module0065.f4740(var37_87);
                    final SubLObject var34 = (SubLObject)module0179.NIL;
                    SubLObject var35;
                    SubLObject var36;
                    SubLObject var37;
                    SubLObject var38;
                    SubLObject var39;
                    for (var35 = Sequences.length(var33), var36 = (SubLObject)module0179.NIL, var36 = (SubLObject)module0179.ZERO_INTEGER; var36.numL(var35); var36 = Numbers.add(var36, (SubLObject)module0179.ONE_INTEGER)) {
                        var37 = ((module0179.NIL != var34) ? Numbers.subtract(var35, var36, (SubLObject)module0179.ONE_INTEGER) : var36);
                        var38 = Vectors.aref(var33, var37);
                        if (module0179.NIL == module0065.f4749(var38) || module0179.NIL == module0065.f4773((SubLObject)module0179.$ic16$)) {
                            if (module0179.NIL != module0065.f4749(var38)) {
                                var38 = (SubLObject)module0179.$ic16$;
                            }
                            module0012.note_percent_progress(var28, var27);
                            var28 = Numbers.add(var28, (SubLObject)module0179.ONE_INTEGER);
                            var39 = module0182.f11508(var38);
                            f11434(var38);
                            if (module0179.NIL != var39) {
                                module0182.f11502(var39);
                            }
                        }
                    }
                }
                final SubLObject var44_88 = var35_86;
                if (module0179.NIL == module0065.f4777(var44_88) || module0179.NIL == module0065.f4773((SubLObject)module0179.$ic16$)) {
                    final SubLObject var40 = module0065.f4738(var44_88);
                    SubLObject var41 = module0065.f4739(var44_88);
                    final SubLObject var42 = module0065.f4734(var44_88);
                    final SubLObject var43 = (SubLObject)((module0179.NIL != module0065.f4773((SubLObject)module0179.$ic16$)) ? module0179.NIL : module0179.$ic16$);
                    while (var41.numL(var42)) {
                        final SubLObject var44 = Hashtables.gethash_without_values(var41, var40, var43);
                        if (module0179.NIL == module0065.f4773((SubLObject)module0179.$ic16$) || module0179.NIL == module0065.f4749(var44)) {
                            module0012.note_percent_progress(var28, var27);
                            var28 = Numbers.add(var28, (SubLObject)module0179.ONE_INTEGER);
                            final SubLObject var45 = module0182.f11508(var44);
                            f11434(var44);
                            if (module0179.NIL != var45) {
                                module0182.f11502(var45);
                            }
                        }
                        var41 = Numbers.add(var41, (SubLObject)module0179.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var32, var24);
            module0012.$g77$.rebind(var31, var24);
            module0012.$g76$.rebind(var30, var24);
            module0012.$g75$.rebind(var29, var24);
        }
        f11407();
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11415(final SubLObject var17) {
        return f11435(var17);
    }
    
    public static SubLObject f11417(final SubLObject var17, final SubLObject var89) {
        f11426(var17, var89);
        return var17;
    }
    
    public static SubLObject f11438(final SubLObject var17) {
        return Types.integerp(f11435(var17));
    }
    
    public static SubLObject f11443(final SubLObject var26) {
        return f11410(var26);
    }
    
    public static SubLObject f11444() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11396", "S#14204", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0179", "f11397", "S#14205");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11398", "S#14206", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11399", "S#14207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11400", "S#14208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11401", "S#14209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11402", "S#14210", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11403", "S#14211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11404", "S#14212", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11406", "S#14213", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11407", "S#14214", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11408", "S#14215", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11409", "S#14216", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11410", "S#14217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11411", "S#14218", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11412", "S#14219", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11413", "S#14220", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11414", "S#14221", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11405", "S#14222", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11416", "S#14223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11418", "S#14224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11419", "S#14225", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0179", "f11420", "S#14226");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0179", "f11421", "S#14227");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11422", "S#14228", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11424", "KB-HL-SUPPORT-P", 1, 0, false);
        new $f11424$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11425", "S#14229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11426", "S#14230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11427", "S#14231", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11428", "S#14232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11429", "S#14233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11423", "S#14234", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11431", "S#14199", 1, 0, false);
        new $f11431$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11432", "S#14235", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11433", "S#14236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11434", "S#14237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11435", "S#14238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11436", "S#14239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11437", "S#14240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11430", "S#14241", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11439", "S#14242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11440", "S#14243", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11441", "S#14244", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11442", "S#14245", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11415", "S#14246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11417", "S#14247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11438", "S#14248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0179", "f11443", "S#14249", 1, 0, false);
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11445() {
        module0179.$g2212$ = SubLFiles.deflexical("S#14250", (SubLObject)((module0179.NIL != Symbols.boundp((SubLObject)module0179.$ic0$)) ? module0179.$g2212$.getGlobalValue() : module0179.NIL));
        module0179.$g2214$ = SubLFiles.defconstant("S#14251", (SubLObject)module0179.$ic20$);
        module0179.$g2215$ = SubLFiles.defparameter("S#14252", (SubLObject)module0179.T);
        return (SubLObject)module0179.NIL;
    }
    
    public static SubLObject f11446() {
        module0003.f57((SubLObject)module0179.$ic0$);
        module0002.f50((SubLObject)module0179.$ic10$, (SubLObject)module0179.$ic11$);
        module0002.f50((SubLObject)module0179.$ic12$, (SubLObject)module0179.$ic13$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0179.$g2214$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0179.$ic27$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0179.$ic28$);
        Structures.def_csetf((SubLObject)module0179.$ic29$, (SubLObject)module0179.$ic30$);
        Equality.identity((SubLObject)module0179.$ic20$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0179.$g2214$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0179.$ic37$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0179.$g2214$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0179.$ic42$));
        module0012.f368((SubLObject)module0179.$ic21$, (SubLObject)module0179.$ic43$, (SubLObject)module0179.$ic44$, (SubLObject)module0179.NIL, (SubLObject)module0179.$ic45$);
        return (SubLObject)module0179.NIL;
    }
    
    public void declareFunctions() {
        f11444();
    }
    
    public void initializeVariables() {
        f11445();
    }
    
    public void runTopLevelForms() {
        f11446();
    }
    
    static {
        me = (SubLFile)new module0179();
        module0179.$g2212$ = null;
        module0179.$g2214$ = null;
        module0179.$g2215$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#14250", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc KB HL supports")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic4$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic5$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic6$ = SubLObjectFactory.makeString("mapping Cyc KB HL supports");
        $ic7$ = SubLObjectFactory.makeKeyword("DONE");
        $ic8$ = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14206", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#14206", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#14205", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#14215", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#14253", "CYC");
        $ic14$ = SubLObjectFactory.makeString("Determining maximum KB HL support ID");
        $ic15$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic16$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("S#10461", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#10462", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#14196", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14229", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14230", "CYC"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#14234", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#14228", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P"));
        $ic29$ = SubLObjectFactory.makeSymbol("S#14229", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#14230", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("ID");
        $ic32$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic33$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic34$ = SubLObjectFactory.makeSymbol("S#14231", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic36$ = SubLObjectFactory.makeKeyword("END");
        $ic37$ = SubLObjectFactory.makeSymbol("S#14233", "CYC");
        $ic38$ = SubLObjectFactory.makeString("<The CFASL invalid KB HL support>");
        $ic39$ = SubLObjectFactory.makeString("#<~s>");
        $ic40$ = SubLObjectFactory.makeString("#<KB HL SUPPORT ~s>");
        $ic41$ = SubLObjectFactory.makeInteger(787);
        $ic42$ = SubLObjectFactory.makeSymbol("S#14199", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic44$ = SubLObjectFactory.makeString("Return T iff OBJECT is a CycL KB HL support");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic46$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic47$ = SubLObjectFactory.makeString("Freeing KB HL supports");
    }
    
    public static final class $sX14196_native extends SubLStructNative
    {
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $sX14196_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX14196_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX14196_native.class, module0179.$ic20$, module0179.$ic21$, module0179.$ic22$, module0179.$ic23$, new String[] { "$id" }, module0179.$ic24$, module0179.$ic25$, module0179.$ic26$);
        }
    }
    
    public static final class $f11424$UnaryFunction extends UnaryFunction
    {
        public $f11424$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KB-HL-SUPPORT-P"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0179.f11424(var72);
        }
    }
    
    public static final class $f11431$UnaryFunction extends UnaryFunction
    {
        public $f11431$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14199"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0179.f11431(var72);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0179.class
	Total time: 206 ms
	
	Decompiled with Procyon 0.5.32.
*/