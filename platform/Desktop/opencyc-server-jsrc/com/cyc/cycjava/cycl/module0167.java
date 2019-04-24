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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
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

public final class module0167 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0167";
    public static final String myFingerPrint = "5ee62783a3a5dceee1c227f1d0ee8d91a5634b3c40cc0335b513bd313627d961";
    private static SubLSymbol $g2181$;
    public static SubLSymbol $g2182$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLString $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    
    public static SubLObject f10786() {
        return module0052.f3724(module0065.f4763(module0167.$g2181$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0167.$ic1$), (SubLObject)module0167.UNPROVIDED);
    }
    
    public static SubLObject f10787(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0167.$ic2$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0167.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0167.$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0167.$ic3$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0167.$ic2$);
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0167.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0167.NIL;
        SubLObject var11_12 = (SubLObject)module0167.NIL;
        while (module0167.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0167.$ic2$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0167.$ic2$);
            if (module0167.NIL == conses_high.member(var11_12, (SubLObject)module0167.$ic4$, (SubLObject)module0167.UNPROVIDED, (SubLObject)module0167.UNPROVIDED)) {
                var10 = (SubLObject)module0167.T;
            }
            if (var11_12 == module0167.$ic5$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0167.NIL != var10 && module0167.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0167.$ic2$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0167.$ic6$, var4);
        final SubLObject var12 = (SubLObject)((module0167.NIL != var11) ? conses_high.cadr(var11) : module0167.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0167.$ic7$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0167.$ic8$, (SubLObject)module0167.$ic9$, var7, (SubLObject)module0167.$ic6$, var12), ConsesLow.append(var13, (SubLObject)module0167.NIL));
    }
    
    public static SubLObject f10788() {
        return module0167.$g2181$.getGlobalValue();
    }
    
    public static SubLObject f10789(final SubLObject var16, final SubLObject var17) {
        if (module0167.NIL != module0167.$g2181$.getGlobalValue()) {
            return (SubLObject)module0167.NIL;
        }
        module0167.$g2181$.setGlobalValue(module0065.f4745(var16, (SubLObject)module0167.ZERO_INTEGER));
        return (SubLObject)module0167.T;
    }
    
    public static SubLObject f10790(SubLObject var18) {
        if (var18 == module0167.UNPROVIDED) {
            var18 = (SubLObject)module0167.NIL;
        }
        f10791(var18);
        if (module0167.NIL == var18) {
            f10792();
        }
        return (SubLObject)module0167.NIL;
    }
    
    public static SubLObject f10792() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = Storage.$current_area$.currentBinding(var19);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var19);
            module0065.f4760(module0167.$g2181$.getGlobalValue(), (SubLObject)module0167.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var20, var19);
        }
        return (SubLObject)module0167.NIL;
    }
    
    public static SubLObject f10793() {
        return module0065.f4762(module0167.$g2181$.getGlobalValue());
    }
    
    public static SubLObject f10794() {
        return module0065.f4794(module0167.$g2181$.getGlobalValue());
    }
    
    public static SubLObject f10795() {
        return module0065.f4797(module0167.$g2181$.getGlobalValue());
    }
    
    public static SubLObject f10796() {
        if (module0167.NIL == module0167.$g2181$.getGlobalValue()) {
            return (SubLObject)module0167.ZERO_INTEGER;
        }
        return module0065.f4733(module0167.$g2181$.getGlobalValue());
    }
    
    public static SubLObject f10797(final SubLObject var21) {
        return module0065.f4750(module0167.$g2181$.getGlobalValue(), var21, (SubLObject)module0167.UNPROVIDED);
    }
    
    public static SubLObject f10798() {
        return module0065.f4734(module0167.$g2181$.getGlobalValue());
    }
    
    public static SubLObject f10799() {
        return module0065.f4739(module0167.$g2181$.getGlobalValue());
    }
    
    public static SubLObject f10800() {
        return module0065.f4736(f10788());
    }
    
    public static SubLObject f10801() {
        return Numbers.subtract(f10796(), f10800());
    }
    
    public static SubLObject f10802() {
        final SubLObject var22 = module0170.f10882();
        return module0065.f4799(f10788(), (SubLObject)module0167.$ic18$, var22);
    }
    
    public static SubLObject f10791(SubLObject var18) {
        if (var18 == module0167.UNPROVIDED) {
            var18 = (SubLObject)module0167.NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0167.MINUS_ONE_INTEGER;
        if (module0167.NIL != var18) {
            var20 = var18;
        }
        else {
            final SubLObject var21 = f10788();
            final SubLObject var22 = (SubLObject)module0167.$ic19$;
            final SubLObject var23 = module0065.f4733(var21);
            SubLObject var24 = (SubLObject)module0167.ZERO_INTEGER;
            assert module0167.NIL != Types.stringp(var22) : var22;
            final SubLObject var25 = module0012.$g75$.currentBinding(var19);
            final SubLObject var26 = module0012.$g76$.currentBinding(var19);
            final SubLObject var27 = module0012.$g77$.currentBinding(var19);
            final SubLObject var28 = module0012.$g78$.currentBinding(var19);
            try {
                module0012.$g75$.bind((SubLObject)module0167.ZERO_INTEGER, var19);
                module0012.$g76$.bind((SubLObject)module0167.NIL, var19);
                module0012.$g77$.bind((SubLObject)module0167.T, var19);
                module0012.$g78$.bind(Time.get_universal_time(), var19);
                module0012.f478(var22);
                final SubLObject var31_32 = var21;
                if (module0167.NIL == module0065.f4772(var31_32, (SubLObject)module0167.$ic21$)) {
                    final SubLObject var33_34 = var31_32;
                    if (module0167.NIL == module0065.f4775(var33_34, (SubLObject)module0167.$ic21$)) {
                        final SubLObject var29 = module0065.f4740(var33_34);
                        final SubLObject var30 = (SubLObject)module0167.NIL;
                        SubLObject var31;
                        SubLObject var32;
                        SubLObject var33;
                        SubLObject var34;
                        for (var31 = Sequences.length(var29), var32 = (SubLObject)module0167.NIL, var32 = (SubLObject)module0167.ZERO_INTEGER; var32.numL(var31); var32 = Numbers.add(var32, (SubLObject)module0167.ONE_INTEGER)) {
                            var33 = ((module0167.NIL != var30) ? Numbers.subtract(var31, var32, (SubLObject)module0167.ONE_INTEGER) : var32);
                            var34 = Vectors.aref(var29, var33);
                            if (module0167.NIL == module0065.f4749(var34) || module0167.NIL == module0065.f4773((SubLObject)module0167.$ic21$)) {
                                if (module0167.NIL != module0065.f4749(var34)) {
                                    var34 = (SubLObject)module0167.$ic21$;
                                }
                                module0012.note_percent_progress(var24, var23);
                                var24 = Numbers.add(var24, (SubLObject)module0167.ONE_INTEGER);
                                var20 = Numbers.max(var20, f10803(var34));
                            }
                        }
                    }
                    final SubLObject var41_42 = var31_32;
                    if (module0167.NIL == module0065.f4777(var41_42) || module0167.NIL == module0065.f4773((SubLObject)module0167.$ic21$)) {
                        final SubLObject var35 = module0065.f4738(var41_42);
                        SubLObject var36 = module0065.f4739(var41_42);
                        final SubLObject var37 = module0065.f4734(var41_42);
                        final SubLObject var38 = (SubLObject)((module0167.NIL != module0065.f4773((SubLObject)module0167.$ic21$)) ? module0167.NIL : module0167.$ic21$);
                        while (var36.numL(var37)) {
                            final SubLObject var39 = Hashtables.gethash_without_values(var36, var35, var38);
                            if (module0167.NIL == module0065.f4773((SubLObject)module0167.$ic21$) || module0167.NIL == module0065.f4749(var39)) {
                                module0012.note_percent_progress(var24, var23);
                                var24 = Numbers.add(var24, (SubLObject)module0167.ONE_INTEGER);
                                var20 = Numbers.max(var20, f10803(var39));
                            }
                            var36 = Numbers.add(var36, (SubLObject)module0167.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var28, var19);
                module0012.$g77$.rebind(var27, var19);
                module0012.$g76$.rebind(var26, var19);
                module0012.$g75$.rebind(var25, var19);
            }
        }
        final SubLObject var40 = Numbers.add(var20, (SubLObject)module0167.ONE_INTEGER);
        module0065.f4741(module0167.$g2181$.getGlobalValue(), var40);
        return var40;
    }
    
    public static SubLObject f10804(final SubLObject var40, final SubLObject var21) {
        f10805(var40, var21);
        module0065.f4753(module0167.$g2181$.getGlobalValue(), var21, var40);
        return var40;
    }
    
    public static SubLObject f10806(final SubLObject var21) {
        return module0065.f4761(module0167.$g2181$.getGlobalValue(), var21);
    }
    
    public static SubLObject f10807() {
        return module0065.f4746(module0167.$g2181$.getGlobalValue());
    }
    
    public static SubLObject f10808(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0167.$ic22$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0167.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0167.$ic22$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0167.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0167.NIL;
        SubLObject var53_54 = (SubLObject)module0167.NIL;
        while (module0167.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0167.$ic22$);
            var53_54 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0167.$ic22$);
            if (module0167.NIL == conses_high.member(var53_54, (SubLObject)module0167.$ic23$, (SubLObject)module0167.UNPROVIDED, (SubLObject)module0167.UNPROVIDED)) {
                var9 = (SubLObject)module0167.T;
            }
            if (var53_54 == module0167.$ic5$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0167.NIL != var9 && module0167.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0167.$ic22$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0167.$ic9$, var4);
        final SubLObject var11 = (SubLObject)((module0167.NIL != var10) ? conses_high.cadr(var10) : module0167.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0167.$ic6$, var4);
        final SubLObject var13 = (SubLObject)((module0167.NIL != var12) ? conses_high.cadr(var12) : module0167.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0167.$ic24$;
        return (SubLObject)ConsesLow.list((SubLObject)module0167.$ic25$, (SubLObject)ConsesLow.list(reader.bq_cons(var15, (SubLObject)module0167.$ic26$)), (SubLObject)ConsesLow.listS((SubLObject)module0167.$ic27$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0167.$ic8$, var15, (SubLObject)module0167.$ic9$, var11, (SubLObject)module0167.$ic6$, var13), ConsesLow.append(var14, (SubLObject)module0167.NIL)));
    }
    
    public static SubLObject f10809(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0167.$ic22$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0167.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0167.$ic22$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0167.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0167.NIL;
        SubLObject var64_65 = (SubLObject)module0167.NIL;
        while (module0167.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0167.$ic22$);
            var64_65 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0167.$ic22$);
            if (module0167.NIL == conses_high.member(var64_65, (SubLObject)module0167.$ic23$, (SubLObject)module0167.UNPROVIDED, (SubLObject)module0167.UNPROVIDED)) {
                var9 = (SubLObject)module0167.T;
            }
            if (var64_65 == module0167.$ic5$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0167.NIL != var9 && module0167.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0167.$ic22$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0167.$ic9$, var4);
        final SubLObject var11 = (SubLObject)((module0167.NIL != var10) ? conses_high.cadr(var10) : module0167.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0167.$ic6$, var4);
        final SubLObject var13 = (SubLObject)((module0167.NIL != var12) ? conses_high.cadr(var12) : module0167.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0167.$ic28$;
        return (SubLObject)ConsesLow.list((SubLObject)module0167.$ic25$, (SubLObject)ConsesLow.list(reader.bq_cons(var15, (SubLObject)module0167.$ic29$)), (SubLObject)ConsesLow.listS((SubLObject)module0167.$ic30$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0167.$ic8$, var15, (SubLObject)module0167.$ic9$, var11, (SubLObject)module0167.$ic6$, var13), ConsesLow.append(var14, (SubLObject)module0167.NIL)));
    }
    
    public static SubLObject f10810() {
        if (module0167.NIL != Filesys.directory_p(module0107.f7598())) {
            return module0618.f38042(module0107.f7598());
        }
        return (SubLObject)module0167.ZERO_INTEGER;
    }
    
    public static SubLObject f10811(final SubLObject var69, final SubLObject var70) {
        f10812(var69, var70, (SubLObject)module0167.ZERO_INTEGER);
        return (SubLObject)module0167.NIL;
    }
    
    public static SubLObject f10813(final SubLObject var69) {
        return (SubLObject)((var69.getClass() == $sX13601_native.class) ? module0167.T : module0167.NIL);
    }
    
    public static SubLObject f10814(final SubLObject var69) {
        assert module0167.NIL != f10813(var69) : var69;
        return var69.getField2();
    }
    
    public static SubLObject f10815(final SubLObject var69, final SubLObject var72) {
        assert module0167.NIL != f10813(var69) : var69;
        return var69.setField2(var72);
    }
    
    public static SubLObject f10816(SubLObject var73) {
        if (var73 == module0167.UNPROVIDED) {
            var73 = (SubLObject)module0167.NIL;
        }
        final SubLObject var74 = (SubLObject)new $sX13601_native();
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        for (var75 = (SubLObject)module0167.NIL, var75 = var73; module0167.NIL != var75; var75 = conses_high.cddr(var75)) {
            var76 = var75.first();
            var77 = conses_high.cadr(var75);
            var78 = var76;
            if (var78.eql((SubLObject)module0167.$ic43$)) {
                f10815(var74, var77);
            }
            else {
                Errors.error((SubLObject)module0167.$ic44$, var76);
            }
        }
        return var74;
    }
    
    public static SubLObject f10817(final SubLObject var79, final SubLObject var80) {
        Functions.funcall(var80, var79, (SubLObject)module0167.$ic45$, (SubLObject)module0167.$ic46$, (SubLObject)module0167.ONE_INTEGER);
        Functions.funcall(var80, var79, (SubLObject)module0167.$ic47$, (SubLObject)module0167.$ic43$, f10814(var79));
        Functions.funcall(var80, var79, (SubLObject)module0167.$ic48$, (SubLObject)module0167.$ic46$, (SubLObject)module0167.ONE_INTEGER);
        return var79;
    }
    
    public static SubLObject f10818(final SubLObject var79, final SubLObject var80) {
        return f10817(var79, var80);
    }
    
    public static SubLObject f10812(final SubLObject var81, final SubLObject var70, final SubLObject var82) {
        final SubLObject var83 = module0172.f10915(var81);
        final SubLObject var84 = f10803(var81);
        if (module0167.NIL != var83) {
            PrintLow.format(var70, (SubLObject)module0167.$ic50$, var83);
        }
        else if (var81.eql(module0338.f22673())) {
            PrintLow.format(var70, (SubLObject)module0167.$ic51$);
        }
        else if (var84.isFixnum()) {
            PrintLow.format(var70, (SubLObject)module0167.$ic52$, var84);
        }
        else {
            compatibility.default_struct_print_function(var81, var70, var82);
        }
        return var81;
    }
    
    public static SubLObject f10819(final SubLObject var81) {
        final SubLObject var82 = f10814(var81);
        if (var82.isInteger()) {
            return var82;
        }
        return (SubLObject)module0167.ZERO_INTEGER;
    }
    
    public static SubLObject f10820() {
        SubLObject var40 = (SubLObject)module0167.NIL;
        var40 = f10816((SubLObject)module0167.UNPROVIDED);
        return var40;
    }
    
    public static SubLObject f10821(final SubLObject var40) {
        f10815(var40, (SubLObject)module0167.NIL);
        return var40;
    }
    
    public static SubLObject f10822(final SubLObject var81) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0167.NIL != f10813(var81) && module0167.NIL != f10823(var81));
    }
    
    public static SubLObject f10824(final SubLObject var40, SubLObject var84) {
        if (var84 == module0167.UNPROVIDED) {
            var84 = (SubLObject)module0167.NIL;
        }
        module0425.f30056(var40);
        return f10822(var40);
    }
    
    public static SubLObject f10825(final SubLObject var40) {
        if (module0167.NIL != f10824(var40, (SubLObject)module0167.UNPROVIDED)) {
            final SubLObject var41 = module0171.f10901(var40);
            return module0212.f13775(var41);
        }
        return (SubLObject)module0167.NIL;
    }
    
    public static SubLObject f10826(final SubLObject var81) {
        return Types.integerp(var81);
    }
    
    public static SubLObject f10827() {
        return f10828((SubLObject)module0167.NIL);
    }
    
    public static SubLObject f10828(SubLObject var21) {
        if (var21 == module0167.UNPROVIDED) {
            var21 = (SubLObject)module0167.NIL;
        }
        if (module0167.NIL == var21) {
            var21 = f10807();
        }
        assert module0167.NIL != Types.fixnump(var21) : var21;
        final SubLObject var22 = f10820();
        f10804(var22, var21);
        return var22;
    }
    
    public static SubLObject f10829() {
        return f10827();
    }
    
    public static SubLObject f10830() {
        return f10820();
    }
    
    public static SubLObject f10831() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = f10788();
        final SubLObject var21 = (SubLObject)module0167.$ic58$;
        final SubLObject var22 = module0065.f4733(var20);
        SubLObject var23 = (SubLObject)module0167.ZERO_INTEGER;
        assert module0167.NIL != Types.stringp(var21) : var21;
        final SubLObject var24 = module0012.$g75$.currentBinding(var19);
        final SubLObject var25 = module0012.$g76$.currentBinding(var19);
        final SubLObject var26 = module0012.$g77$.currentBinding(var19);
        final SubLObject var27 = module0012.$g78$.currentBinding(var19);
        try {
            module0012.$g75$.bind((SubLObject)module0167.ZERO_INTEGER, var19);
            module0012.$g76$.bind((SubLObject)module0167.NIL, var19);
            module0012.$g77$.bind((SubLObject)module0167.T, var19);
            module0012.$g78$.bind(Time.get_universal_time(), var19);
            module0012.f478(var21);
            final SubLObject var31_86 = var20;
            if (module0167.NIL == module0065.f4772(var31_86, (SubLObject)module0167.$ic21$)) {
                final SubLObject var33_87 = var31_86;
                if (module0167.NIL == module0065.f4775(var33_87, (SubLObject)module0167.$ic21$)) {
                    final SubLObject var28 = module0065.f4740(var33_87);
                    final SubLObject var29 = (SubLObject)module0167.NIL;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    for (var30 = Sequences.length(var28), var31 = (SubLObject)module0167.NIL, var31 = (SubLObject)module0167.ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)module0167.ONE_INTEGER)) {
                        var32 = ((module0167.NIL != var29) ? Numbers.subtract(var30, var31, (SubLObject)module0167.ONE_INTEGER) : var31);
                        var33 = Vectors.aref(var28, var32);
                        if (module0167.NIL == module0065.f4749(var33) || module0167.NIL == module0065.f4773((SubLObject)module0167.$ic21$)) {
                            if (module0167.NIL != module0065.f4749(var33)) {
                                var33 = (SubLObject)module0167.$ic21$;
                            }
                            module0012.note_percent_progress(var23, var22);
                            var23 = Numbers.add(var23, (SubLObject)module0167.ONE_INTEGER);
                            module0212.f13794(var33);
                            f10821(var33);
                        }
                    }
                }
                final SubLObject var41_88 = var31_86;
                if (module0167.NIL == module0065.f4777(var41_88) || module0167.NIL == module0065.f4773((SubLObject)module0167.$ic21$)) {
                    final SubLObject var34 = module0065.f4738(var41_88);
                    SubLObject var35 = module0065.f4739(var41_88);
                    final SubLObject var36 = module0065.f4734(var41_88);
                    final SubLObject var37 = (SubLObject)((module0167.NIL != module0065.f4773((SubLObject)module0167.$ic21$)) ? module0167.NIL : module0167.$ic21$);
                    while (var35.numL(var36)) {
                        final SubLObject var38 = Hashtables.gethash_without_values(var35, var34, var37);
                        if (module0167.NIL == module0065.f4773((SubLObject)module0167.$ic21$) || module0167.NIL == module0065.f4749(var38)) {
                            module0012.note_percent_progress(var23, var22);
                            var23 = Numbers.add(var23, (SubLObject)module0167.ONE_INTEGER);
                            module0212.f13794(var38);
                            f10821(var38);
                        }
                        var35 = Numbers.add(var35, (SubLObject)module0167.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var27, var19);
            module0012.$g77$.rebind(var26, var19);
            module0012.$g76$.rebind(var25, var19);
            module0012.$g75$.rebind(var24, var19);
        }
        f10793();
        module0170.f10875();
        return (SubLObject)module0167.NIL;
    }
    
    public static SubLObject f10803(final SubLObject var40) {
        assert module0167.NIL != f10813(var40) : var40;
        return f10814(var40);
    }
    
    public static SubLObject f10805(final SubLObject var40, final SubLObject var89) {
        assert module0167.NIL != f10813(var40) : var40;
        f10815(var40, var89);
        return var40;
    }
    
    public static SubLObject f10823(final SubLObject var40) {
        return Types.integerp(f10814(var40));
    }
    
    public static SubLObject f10832(final SubLObject var21) {
        assert module0167.NIL != Types.integerp(var21) : var21;
        return f10797(var21);
    }
    
    public static SubLObject f10833() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10786", "S#13607", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0167", "f10787", "DO-NARTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10788", "DO-NARTS-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10789", "S#13608", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10790", "S#13609", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10792", "S#13610", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10793", "S#13611", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10794", "S#13612", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10795", "S#13613", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10796", "NART-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10797", "S#13614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10798", "S#13615", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10799", "S#13616", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10800", "S#13617", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10801", "S#13618", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10802", "S#13619", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10791", "S#13620", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10804", "S#13621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10806", "S#13622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10807", "S#13623", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0167", "f10808", "S#13624");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0167", "f10809", "S#13625");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10810", "S#13626", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10811", "S#13627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10813", "NART-P", 1, 0, false);
        new $f10813$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10814", "S#13628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10815", "S#13629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10816", "S#13630", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10817", "S#13631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10818", "S#13632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10812", "S#13633", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10819", "S#13603", 1, 0, false);
        new $f10819$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10820", "S#13634", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10821", "S#13635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10822", "S#13636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10824", "S#13637", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10825", "S#13638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10826", "S#13639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10827", "S#13640", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10828", "S#13641", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10829", "S#13642", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10830", "S#13643", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10831", "S#13644", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10803", "NART-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10805", "S#13645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10823", "S#13646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0167", "f10832", "FIND-NART-BY-ID", 1, 0, false);
        return (SubLObject)module0167.NIL;
    }
    
    public static SubLObject f10834() {
        module0167.$g2181$ = SubLFiles.deflexical("S#13647", (SubLObject)((module0167.NIL != Symbols.boundp((SubLObject)module0167.$ic0$)) ? module0167.$g2181$.getGlobalValue() : module0167.NIL));
        module0167.$g2182$ = SubLFiles.defconstant("S#13648", (SubLObject)module0167.$ic31$);
        return (SubLObject)module0167.NIL;
    }
    
    public static SubLObject f10835() {
        module0003.f57((SubLObject)module0167.$ic0$);
        module0012.f375((SubLObject)module0167.$ic10$, (SubLObject)module0167.$ic2$, (SubLObject)module0167.$ic11$);
        module0002.f50((SubLObject)module0167.$ic12$, (SubLObject)module0167.$ic10$);
        module0002.f50((SubLObject)module0167.$ic13$, (SubLObject)module0167.$ic14$);
        module0012.f368((SubLObject)module0167.$ic15$, (SubLObject)module0167.NIL, (SubLObject)module0167.$ic16$, (SubLObject)module0167.NIL, (SubLObject)module0167.$ic17$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0167.$ic39$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0167.$ic40$);
        Structures.def_csetf((SubLObject)module0167.$ic41$, (SubLObject)module0167.$ic42$);
        Equality.identity((SubLObject)module0167.$ic31$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0167.$ic49$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0167.$ic53$));
        module0012.f368((SubLObject)module0167.$ic32$, (SubLObject)module0167.$ic54$, (SubLObject)module0167.$ic55$, (SubLObject)module0167.NIL, (SubLObject)module0167.$ic56$);
        module0012.f368((SubLObject)module0167.$ic59$, (SubLObject)module0167.$ic60$, (SubLObject)module0167.$ic61$, (SubLObject)module0167.$ic62$, (SubLObject)module0167.$ic17$);
        module0012.f368((SubLObject)module0167.$ic64$, (SubLObject)module0167.$ic34$, (SubLObject)module0167.$ic65$, (SubLObject)module0167.$ic66$, (SubLObject)module0167.$ic67$);
        return (SubLObject)module0167.NIL;
    }
    
    public void declareFunctions() {
        f10833();
    }
    
    public void initializeVariables() {
        f10834();
    }
    
    public void runTopLevelForms() {
        f10835();
    }
    
    static {
        me = (SubLFile)new module0167();
        module0167.$g2181$ = null;
        module0167.$g2182$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#13647", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc NARTs")), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = SubLObjectFactory.makeString("mapping Cyc NARTs");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic5$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic6$ = SubLObjectFactory.makeKeyword("DONE");
        $ic7$ = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-NARTS-TABLE"));
        $ic9$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic10$ = SubLObjectFactory.makeSymbol("DO-NARTS");
        $ic11$ = SubLObjectFactory.makeString("Iterate over all HL NART datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the NART.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
        $ic12$ = SubLObjectFactory.makeSymbol("DO-NARTS-TABLE");
        $ic13$ = SubLObjectFactory.makeSymbol("S#13612", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#13649", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("NART-COUNT");
        $ic16$ = SubLObjectFactory.makeString("Return the total number of NARTs.");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic18$ = SubLObjectFactory.makeKeyword("OLD");
        $ic19$ = SubLObjectFactory.makeString("Determining maximum NART ID");
        $ic20$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic21$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic24$ = SubLObjectFactory.makeUninternedSymbol("US#4D08B3F");
        $ic25$ = SubLObjectFactory.makeSymbol("CLET");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13626", "CYC")));
        $ic27$ = SubLObjectFactory.makeSymbol("S#10463", "CYC");
        $ic28$ = SubLObjectFactory.makeUninternedSymbol("US#352B2C1");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)module0167.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13626", "CYC"))));
        $ic30$ = SubLObjectFactory.makeSymbol("S#10464", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#13601", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("NART-P");
        $ic33$ = SubLObjectFactory.makeInteger(146);
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13628", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13629", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#13633", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#13627", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#13628", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#13629", "CYC");
        $ic43$ = SubLObjectFactory.makeKeyword("ID");
        $ic44$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic45$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic46$ = SubLObjectFactory.makeSymbol("S#13630", "CYC");
        $ic47$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic48$ = SubLObjectFactory.makeKeyword("END");
        $ic49$ = SubLObjectFactory.makeSymbol("S#13632", "CYC");
        $ic50$ = SubLObjectFactory.makeString("#<~S>");
        $ic51$ = SubLObjectFactory.makeString("#<The CFASL invalid NART>");
        $ic52$ = SubLObjectFactory.makeString("#<NART ~S>");
        $ic53$ = SubLObjectFactory.makeSymbol("S#13603", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"));
        $ic55$ = SubLObjectFactory.makeString("Return T iff OBJECT is a datastructure implementing a non-atomic reified term (NART).");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic57$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic58$ = SubLObjectFactory.makeString("Freeing NARTs");
        $ic59$ = SubLObjectFactory.makeSymbol("NART-ID");
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13601", "CYC"));
        $ic61$ = SubLObjectFactory.makeString("Return the id of this NART.");
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
        $ic63$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic64$ = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $ic65$ = SubLObjectFactory.makeString("Return the NART with ID, or NIL if not present.");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
    }
    
    public static final class $sX13601_native extends SubLStructNative
    {
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $sX13601_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX13601_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX13601_native.class, module0167.$ic31$, module0167.$ic32$, module0167.$ic34$, module0167.$ic35$, new String[] { "$id" }, module0167.$ic36$, module0167.$ic37$, module0167.$ic38$);
        }
    }
    
    public static final class $f10813$UnaryFunction extends UnaryFunction
    {
        public $f10813$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NART-P"));
        }
        
        public SubLObject processItem(final SubLObject var71) {
            return module0167.f10813(var71);
        }
    }
    
    public static final class $f10819$UnaryFunction extends UnaryFunction
    {
        public $f10819$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13603"));
        }
        
        public SubLObject processItem(final SubLObject var71) {
            return module0167.f10819(var71);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0167.class
	Total time: 234 ms
	
	Decompiled with Procyon 0.5.32.
*/