package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
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
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
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

public final class module0128 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0128";
    public static final String myFingerPrint = "768766c5dc6a916ce287c45b8c46701fdc739d0b63d99d8b8ce123bec3d7a8a2";
    private static SubLSymbol $g1500$;
    public static SubLSymbol $g1501$;
    private static SubLSymbol $g1502$;
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
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
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
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLString $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLInteger $ic68$;
    private static final SubLString $ic69$;
    private static final SubLInteger $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    
    public static SubLObject f8423() {
        return module0052.f3724(module0065.f4763(module0128.$g1500$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0128.$ic1$), (SubLObject)module0128.UNPROVIDED);
    }
    
    public static SubLObject f8424(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0128.$ic2$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0128.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0128.$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0128.$ic3$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0128.$ic2$);
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0128.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0128.NIL;
        SubLObject var11_12 = (SubLObject)module0128.NIL;
        while (module0128.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0128.$ic2$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0128.$ic2$);
            if (module0128.NIL == conses_high.member(var11_12, (SubLObject)module0128.$ic4$, (SubLObject)module0128.UNPROVIDED, (SubLObject)module0128.UNPROVIDED)) {
                var10 = (SubLObject)module0128.T;
            }
            if (var11_12 == module0128.$ic5$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0128.NIL != var10 && module0128.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0128.$ic2$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0128.$ic6$, var4);
        final SubLObject var12 = (SubLObject)((module0128.NIL != var11) ? conses_high.cadr(var11) : module0128.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0128.$ic7$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0128.$ic8$, (SubLObject)module0128.$ic9$, var7, (SubLObject)module0128.$ic6$, var12), ConsesLow.append(var13, (SubLObject)module0128.NIL));
    }
    
    public static SubLObject f8425() {
        return module0128.$g1500$.getGlobalValue();
    }
    
    public static SubLObject f8426(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f8425();
        final SubLObject var19 = (SubLObject)module0128.$ic3$;
        final SubLObject var20 = module0065.f4733(var18);
        SubLObject var21 = (SubLObject)module0128.ZERO_INTEGER;
        assert module0128.NIL != Types.stringp(var19) : var19;
        final SubLObject var22 = module0012.$g75$.currentBinding(var17);
        final SubLObject var23 = module0012.$g76$.currentBinding(var17);
        final SubLObject var24 = module0012.$g77$.currentBinding(var17);
        final SubLObject var25 = module0012.$g78$.currentBinding(var17);
        try {
            module0012.$g75$.bind((SubLObject)module0128.ZERO_INTEGER, var17);
            module0012.$g76$.bind((SubLObject)module0128.NIL, var17);
            module0012.$g77$.bind((SubLObject)module0128.T, var17);
            module0012.$g78$.bind(Time.get_universal_time(), var17);
            module0012.f478(var19);
            final SubLObject var26_27 = var18;
            if (module0128.NIL == module0065.f4772(var26_27, (SubLObject)module0128.$ic14$)) {
                final SubLObject var28_29 = var26_27;
                if (module0128.NIL == module0065.f4775(var28_29, (SubLObject)module0128.$ic14$)) {
                    final SubLObject var26 = module0065.f4740(var28_29);
                    final SubLObject var27 = (SubLObject)module0128.NIL;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    for (var28 = Sequences.length(var26), var29 = (SubLObject)module0128.NIL, var29 = (SubLObject)module0128.ZERO_INTEGER; var29.numL(var28); var29 = Numbers.add(var29, (SubLObject)module0128.ONE_INTEGER)) {
                        var30 = ((module0128.NIL != var27) ? Numbers.subtract(var28, var29, (SubLObject)module0128.ONE_INTEGER) : var29);
                        var31 = Vectors.aref(var26, var30);
                        if (module0128.NIL == module0065.f4749(var31) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                            if (module0128.NIL != module0065.f4749(var31)) {
                                var31 = (SubLObject)module0128.$ic14$;
                            }
                            module0012.note_percent_progress(var21, var20);
                            var21 = Numbers.add(var21, (SubLObject)module0128.ONE_INTEGER);
                            Functions.funcall(var16, var31);
                        }
                    }
                }
                final SubLObject var36_37 = var26_27;
                if (module0128.NIL == module0065.f4777(var36_37) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                    final SubLObject var32 = module0065.f4738(var36_37);
                    SubLObject var33 = module0065.f4739(var36_37);
                    final SubLObject var34 = module0065.f4734(var36_37);
                    final SubLObject var35 = (SubLObject)((module0128.NIL != module0065.f4773((SubLObject)module0128.$ic14$)) ? module0128.NIL : module0128.$ic14$);
                    while (var33.numL(var34)) {
                        final SubLObject var36 = Hashtables.gethash_without_values(var33, var32, var35);
                        if (module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$) || module0128.NIL == module0065.f4749(var36)) {
                            module0012.note_percent_progress(var21, var20);
                            var21 = Numbers.add(var21, (SubLObject)module0128.ONE_INTEGER);
                            Functions.funcall(var16, var36);
                        }
                        var33 = Numbers.add(var33, (SubLObject)module0128.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var25, var17);
            module0012.$g77$.rebind(var24, var17);
            module0012.$g76$.rebind(var23, var17);
            module0012.$g75$.rebind(var22, var17);
        }
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8427(final SubLObject var41, final SubLObject var42) {
        if (module0128.NIL != module0128.$g1500$.getGlobalValue()) {
            return (SubLObject)module0128.NIL;
        }
        module0127.f8416();
        module0128.$g1500$.setGlobalValue(module0065.f4745(var41, (SubLObject)module0128.ZERO_INTEGER));
        return (SubLObject)module0128.T;
    }
    
    public static SubLObject f8428(SubLObject var43) {
        if (var43 == module0128.UNPROVIDED) {
            var43 = (SubLObject)module0128.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        f8429(var43);
        if (module0128.NIL == var43) {
            final SubLObject var45 = Storage.$current_area$.currentBinding(var44);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), var44);
                module0065.f4760(module0128.$g1500$.getGlobalValue(), (SubLObject)module0128.UNPROVIDED);
            }
            finally {
                Storage.$current_area$.rebind(var45, var44);
            }
        }
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8430() {
        return module0065.f4762(module0128.$g1500$.getGlobalValue());
    }
    
    public static SubLObject f8431() {
        return module0065.f4794(module0128.$g1500$.getGlobalValue());
    }
    
    public static SubLObject f8432() {
        return module0065.f4797(f8425());
    }
    
    public static SubLObject f8433() {
        if (module0128.NIL == module0128.$g1500$.getGlobalValue()) {
            return (SubLObject)module0128.ZERO_INTEGER;
        }
        return module0065.f4733(module0128.$g1500$.getGlobalValue());
    }
    
    public static SubLObject f8434(final SubLObject var44) {
        return module0065.f4750(module0128.$g1500$.getGlobalValue(), var44, (SubLObject)module0128.UNPROVIDED);
    }
    
    public static SubLObject f8435() {
        return module0065.f4734(module0128.$g1500$.getGlobalValue());
    }
    
    public static SubLObject f8436() {
        return module0065.f4739(module0128.$g1500$.getGlobalValue());
    }
    
    public static SubLObject f8437() {
        return module0065.f4736(f8425());
    }
    
    public static SubLObject f8438() {
        return Numbers.subtract(f8433(), f8437());
    }
    
    public static SubLObject f8439() {
        final SubLObject var45 = module0164.f10677();
        return module0065.f4799(f8425(), (SubLObject)module0128.$ic20$, var45);
    }
    
    public static SubLObject f8429(SubLObject var43) {
        if (var43 == module0128.UNPROVIDED) {
            var43 = (SubLObject)module0128.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0128.MINUS_ONE_INTEGER;
        if (module0128.NIL != var43) {
            var45 = var43;
        }
        else {
            final SubLObject var46 = f8425();
            final SubLObject var47 = (SubLObject)module0128.$ic21$;
            final SubLObject var48 = module0065.f4733(var46);
            SubLObject var49 = (SubLObject)module0128.ZERO_INTEGER;
            assert module0128.NIL != Types.stringp(var47) : var47;
            final SubLObject var50 = module0012.$g75$.currentBinding(var44);
            final SubLObject var51 = module0012.$g76$.currentBinding(var44);
            final SubLObject var52 = module0012.$g77$.currentBinding(var44);
            final SubLObject var53 = module0012.$g78$.currentBinding(var44);
            try {
                module0012.$g75$.bind((SubLObject)module0128.ZERO_INTEGER, var44);
                module0012.$g76$.bind((SubLObject)module0128.NIL, var44);
                module0012.$g77$.bind((SubLObject)module0128.T, var44);
                module0012.$g78$.bind(Time.get_universal_time(), var44);
                module0012.f478(var47);
                final SubLObject var26_47 = var46;
                if (module0128.NIL == module0065.f4772(var26_47, (SubLObject)module0128.$ic14$)) {
                    final SubLObject var28_48 = var26_47;
                    if (module0128.NIL == module0065.f4775(var28_48, (SubLObject)module0128.$ic14$)) {
                        final SubLObject var54 = module0065.f4740(var28_48);
                        final SubLObject var55 = (SubLObject)module0128.NIL;
                        SubLObject var56;
                        SubLObject var57;
                        SubLObject var58;
                        SubLObject var59;
                        SubLObject var60;
                        for (var56 = Sequences.length(var54), var57 = (SubLObject)module0128.NIL, var57 = (SubLObject)module0128.ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)module0128.ONE_INTEGER)) {
                            var58 = ((module0128.NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)module0128.ONE_INTEGER) : var57);
                            var59 = Vectors.aref(var54, var58);
                            if (module0128.NIL == module0065.f4749(var59) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                                if (module0128.NIL != module0065.f4749(var59)) {
                                    var59 = (SubLObject)module0128.$ic14$;
                                }
                                module0012.note_percent_progress(var49, var48);
                                var49 = Numbers.add(var49, (SubLObject)module0128.ONE_INTEGER);
                                var60 = f8440(var59);
                                var45 = Numbers.max(var45, var60);
                            }
                        }
                    }
                    final SubLObject var36_50 = var26_47;
                    if (module0128.NIL == module0065.f4777(var36_50) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                        final SubLObject var61 = module0065.f4738(var36_50);
                        SubLObject var62 = module0065.f4739(var36_50);
                        final SubLObject var63 = module0065.f4734(var36_50);
                        final SubLObject var64 = (SubLObject)((module0128.NIL != module0065.f4773((SubLObject)module0128.$ic14$)) ? module0128.NIL : module0128.$ic14$);
                        while (var62.numL(var63)) {
                            final SubLObject var65 = Hashtables.gethash_without_values(var62, var61, var64);
                            if (module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$) || module0128.NIL == module0065.f4749(var65)) {
                                module0012.note_percent_progress(var49, var48);
                                var49 = Numbers.add(var49, (SubLObject)module0128.ONE_INTEGER);
                                final SubLObject var66 = f8440(var65);
                                var45 = Numbers.max(var45, var66);
                            }
                            var62 = Numbers.add(var62, (SubLObject)module0128.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var53, var44);
                module0012.$g77$.rebind(var52, var44);
                module0012.$g76$.rebind(var51, var44);
                module0012.$g75$.rebind(var50, var44);
            }
        }
        final SubLObject var67 = Numbers.add(var45, (SubLObject)module0128.ONE_INTEGER);
        module0065.f4741(module0128.$g1500$.getGlobalValue(), var67);
        return var67;
    }
    
    public static SubLObject f8441(final SubLObject var49, final SubLObject var44) {
        f8442(var49, var44);
        module0065.f4753(module0128.$g1500$.getGlobalValue(), var44, var49);
        return var49;
    }
    
    public static SubLObject f8443(final SubLObject var44) {
        return module0065.f4761(module0128.$g1500$.getGlobalValue(), var44);
    }
    
    public static SubLObject f8444() {
        return module0065.f4746(module0128.$g1500$.getGlobalValue());
    }
    
    public static SubLObject f8445(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0128.$ic22$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0128.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0128.$ic22$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0128.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0128.NIL;
        SubLObject var58_59 = (SubLObject)module0128.NIL;
        while (module0128.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0128.$ic22$);
            var58_59 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0128.$ic22$);
            if (module0128.NIL == conses_high.member(var58_59, (SubLObject)module0128.$ic23$, (SubLObject)module0128.UNPROVIDED, (SubLObject)module0128.UNPROVIDED)) {
                var9 = (SubLObject)module0128.T;
            }
            if (var58_59 == module0128.$ic5$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0128.NIL != var9 && module0128.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0128.$ic22$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0128.$ic9$, var4);
        final SubLObject var11 = (SubLObject)((module0128.NIL != var10) ? conses_high.cadr(var10) : module0128.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0128.$ic6$, var4);
        final SubLObject var13 = (SubLObject)((module0128.NIL != var12) ? conses_high.cadr(var12) : module0128.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0128.$ic24$;
        return (SubLObject)ConsesLow.list((SubLObject)module0128.$ic25$, (SubLObject)ConsesLow.list(reader.bq_cons(var15, (SubLObject)module0128.$ic26$)), (SubLObject)ConsesLow.listS((SubLObject)module0128.$ic27$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0128.$ic8$, var15, (SubLObject)module0128.$ic9$, var11, (SubLObject)module0128.$ic6$, var13), ConsesLow.append(var14, (SubLObject)module0128.NIL)));
    }
    
    public static SubLObject f8446(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0128.$ic22$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0128.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0128.$ic22$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0128.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0128.NIL;
        SubLObject var69_70 = (SubLObject)module0128.NIL;
        while (module0128.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0128.$ic22$);
            var69_70 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0128.$ic22$);
            if (module0128.NIL == conses_high.member(var69_70, (SubLObject)module0128.$ic23$, (SubLObject)module0128.UNPROVIDED, (SubLObject)module0128.UNPROVIDED)) {
                var9 = (SubLObject)module0128.T;
            }
            if (var69_70 == module0128.$ic5$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0128.NIL != var9 && module0128.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0128.$ic22$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0128.$ic9$, var4);
        final SubLObject var11 = (SubLObject)((module0128.NIL != var10) ? conses_high.cadr(var10) : module0128.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0128.$ic6$, var4);
        final SubLObject var13 = (SubLObject)((module0128.NIL != var12) ? conses_high.cadr(var12) : module0128.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0128.$ic28$;
        return (SubLObject)ConsesLow.list((SubLObject)module0128.$ic25$, (SubLObject)ConsesLow.list(reader.bq_cons(var15, (SubLObject)module0128.$ic29$)), (SubLObject)ConsesLow.listS((SubLObject)module0128.$ic30$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0128.$ic8$, var15, (SubLObject)module0128.$ic9$, var11, (SubLObject)module0128.$ic6$, var13), ConsesLow.append(var14, (SubLObject)module0128.NIL)));
    }
    
    public static SubLObject f8447(final SubLObject var74, final SubLObject var75) {
        f8448(var74, var75, (SubLObject)module0128.ZERO_INTEGER);
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8449(final SubLObject var74) {
        return (SubLObject)((var74.getClass() == $sX10505_native.class) ? module0128.T : module0128.NIL);
    }
    
    public static SubLObject f8450(final SubLObject var74) {
        assert module0128.NIL != f8449(var74) : var74;
        return var74.getField2();
    }
    
    public static SubLObject f8451(final SubLObject var74) {
        assert module0128.NIL != f8449(var74) : var74;
        return var74.getField3();
    }
    
    public static SubLObject f8452(final SubLObject var74, final SubLObject var78) {
        assert module0128.NIL != f8449(var74) : var74;
        return var74.setField2(var78);
    }
    
    public static SubLObject f8453(final SubLObject var74, final SubLObject var78) {
        assert module0128.NIL != f8449(var74) : var74;
        return var74.setField3(var78);
    }
    
    public static SubLObject f8454(SubLObject var79) {
        if (var79 == module0128.UNPROVIDED) {
            var79 = (SubLObject)module0128.NIL;
        }
        final SubLObject var80 = (SubLObject)new $sX10505_native();
        SubLObject var81;
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var81 = (SubLObject)module0128.NIL, var81 = var79; module0128.NIL != var81; var81 = conses_high.cddr(var81)) {
            var82 = var81.first();
            var83 = conses_high.cadr(var81);
            var84 = var82;
            if (var84.eql((SubLObject)module0128.$ic45$)) {
                f8452(var80, var83);
            }
            else if (var84.eql((SubLObject)module0128.$ic46$)) {
                f8453(var80, var83);
            }
            else {
                Errors.error((SubLObject)module0128.$ic47$, var82);
            }
        }
        return var80;
    }
    
    public static SubLObject f8455(final SubLObject var85, final SubLObject var86) {
        Functions.funcall(var86, var85, (SubLObject)module0128.$ic48$, (SubLObject)module0128.$ic49$, (SubLObject)module0128.TWO_INTEGER);
        Functions.funcall(var86, var85, (SubLObject)module0128.$ic50$, (SubLObject)module0128.$ic45$, f8450(var85));
        Functions.funcall(var86, var85, (SubLObject)module0128.$ic50$, (SubLObject)module0128.$ic46$, f8451(var85));
        Functions.funcall(var86, var85, (SubLObject)module0128.$ic51$, (SubLObject)module0128.$ic49$, (SubLObject)module0128.TWO_INTEGER);
        return var85;
    }
    
    public static SubLObject f8456(final SubLObject var85, final SubLObject var86) {
        return f8455(var85, var86);
    }
    
    public static SubLObject f8448(final SubLObject var87, final SubLObject var75, final SubLObject var88) {
        final SubLObject var89 = f8451(var87);
        final SubLObject var90 = f8450(var87);
        if (var89.isString()) {
            PrintLow.format(var75, (SubLObject)module0128.$ic53$, var89);
        }
        else if (var87.eql(module0338.f22662())) {
            PrintLow.format(var75, (SubLObject)module0128.$ic54$);
        }
        else if (var90.isInteger()) {
            PrintLow.format(var75, (SubLObject)module0128.$ic55$, var90);
        }
        else {
            compatibility.default_struct_print_function(var87, var75, var88);
        }
        return var87;
    }
    
    public static SubLObject f8457(final SubLObject var87) {
        final SubLObject var88 = f8450(var87);
        if (var88.isInteger()) {
            return var88;
        }
        return (SubLObject)module0128.ZERO_INTEGER;
    }
    
    public static SubLObject f8458() {
        SubLObject var49 = (SubLObject)module0128.NIL;
        var49 = f8454((SubLObject)module0128.UNPROVIDED);
        return var49;
    }
    
    public static SubLObject f8459(final SubLObject var49) {
        f8452(var49, (SubLObject)module0128.NIL);
        return var49;
    }
    
    public static SubLObject f8460(final SubLObject var49) {
        return f8459(var49);
    }
    
    public static SubLObject f8461(final SubLObject var49) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0128.NIL != f8449(var49) && module0128.NIL != f8462(var49));
    }
    
    public static SubLObject f8463(final SubLObject var49, SubLObject var90) {
        if (var90 == module0128.UNPROVIDED) {
            var90 = (SubLObject)module0128.NIL;
        }
        module0425.f30055(var49);
        return f8461(var49);
    }
    
    public static SubLObject f8464(final SubLObject var49) {
        if (module0128.NIL != f8463(var49, (SubLObject)module0128.UNPROVIDED)) {
            final SubLObject var50 = module0166.f10743(var49);
            final SubLObject var51 = module0165.f10719(var49);
            return (SubLObject)SubLObjectFactory.makeBoolean((var50.isString() || module0128.$ic63$ == var50) && module0128.NIL != module0212.f13775(var51));
        }
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8465(final SubLObject var49, SubLObject var90) {
        if (var90 == module0128.UNPROVIDED) {
            var90 = (SubLObject)module0128.NIL;
        }
        return f8463(var49, (SubLObject)module0128.UNPROVIDED);
    }
    
    public static SubLObject f8466(final SubLObject var49) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0128.NIL != f8449(var49) && module0128.NIL == f8461(var49));
    }
    
    public static SubLObject f8467(final SubLObject var49, SubLObject var90) {
        if (var90 == module0128.UNPROVIDED) {
            var90 = (SubLObject)module0128.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0128.NIL != f8449(var49) && module0128.NIL == f8463(var49, (SubLObject)module0128.UNPROVIDED));
    }
    
    public static SubLObject f8468(final SubLObject var49) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0128.NIL != f8449(var49) && module0128.NIL == f8464(var49));
    }
    
    public static SubLObject f8469() {
        return module0030.f1625(module0128.$g1502$.getGlobalValue());
    }
    
    public static SubLObject f8470() {
        return Hashtables.clrhash(module0128.$g1502$.getGlobalValue());
    }
    
    public static SubLObject f8471(final SubLObject var89) {
        return Hashtables.gethash(var89, module0128.$g1502$.getGlobalValue(), (SubLObject)module0128.NIL);
    }
    
    public static SubLObject f8472(final SubLObject var49, final SubLObject var89) {
        return Hashtables.sethash(var89, module0128.$g1502$.getGlobalValue(), var49);
    }
    
    public static SubLObject f8473(final SubLObject var89) {
        return Hashtables.remhash(var89, module0128.$g1502$.getGlobalValue());
    }
    
    public static SubLObject f8474() {
        return (module0128.NIL != module0122.f8291()) ? f8475() : f8476();
    }
    
    public static SubLObject f8475() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f8425();
        final SubLObject var19 = (SubLObject)module0128.$ic69$;
        final SubLObject var20 = module0065.f4733(var18);
        SubLObject var21 = (SubLObject)module0128.ZERO_INTEGER;
        assert module0128.NIL != Types.stringp(var19) : var19;
        final SubLObject var22 = module0012.$g75$.currentBinding(var17);
        final SubLObject var23 = module0012.$g76$.currentBinding(var17);
        final SubLObject var24 = module0012.$g77$.currentBinding(var17);
        final SubLObject var25 = module0012.$g78$.currentBinding(var17);
        try {
            module0012.$g75$.bind((SubLObject)module0128.ZERO_INTEGER, var17);
            module0012.$g76$.bind((SubLObject)module0128.NIL, var17);
            module0012.$g77$.bind((SubLObject)module0128.T, var17);
            module0012.$g78$.bind(Time.get_universal_time(), var17);
            module0012.f478(var19);
            final SubLObject var26_92 = var18;
            if (module0128.NIL == module0065.f4772(var26_92, (SubLObject)module0128.$ic14$)) {
                final SubLObject var28_93 = var26_92;
                if (module0128.NIL == module0065.f4775(var28_93, (SubLObject)module0128.$ic14$)) {
                    final SubLObject var26 = module0065.f4740(var28_93);
                    final SubLObject var27 = (SubLObject)module0128.NIL;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    for (var28 = Sequences.length(var26), var29 = (SubLObject)module0128.NIL, var29 = (SubLObject)module0128.ZERO_INTEGER; var29.numL(var28); var29 = Numbers.add(var29, (SubLObject)module0128.ONE_INTEGER)) {
                        var30 = ((module0128.NIL != var27) ? Numbers.subtract(var28, var29, (SubLObject)module0128.ONE_INTEGER) : var29);
                        var31 = Vectors.aref(var26, var30);
                        if (module0128.NIL == module0065.f4749(var31) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                            if (module0128.NIL != module0065.f4749(var31)) {
                                var31 = (SubLObject)module0128.$ic14$;
                            }
                            module0012.note_percent_progress(var21, var20);
                            var21 = Numbers.add(var21, (SubLObject)module0128.ONE_INTEGER);
                            var32 = f8440(var31);
                            if (var32.isInteger()) {
                                f8443(var32);
                                f8442(var31, (SubLObject)module0128.NIL);
                                var33 = module0166.f10743(var31);
                                if (var33.isString()) {
                                    f8472(var31, var33);
                                }
                            }
                        }
                    }
                }
                final SubLObject var36_94 = var26_92;
                if (module0128.NIL == module0065.f4777(var36_94) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                    final SubLObject var34 = module0065.f4738(var36_94);
                    SubLObject var35 = module0065.f4739(var36_94);
                    final SubLObject var36 = module0065.f4734(var36_94);
                    final SubLObject var37 = (SubLObject)((module0128.NIL != module0065.f4773((SubLObject)module0128.$ic14$)) ? module0128.NIL : module0128.$ic14$);
                    while (var35.numL(var36)) {
                        final SubLObject var38 = Hashtables.gethash_without_values(var35, var34, var37);
                        if (module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$) || module0128.NIL == module0065.f4749(var38)) {
                            module0012.note_percent_progress(var21, var20);
                            var21 = Numbers.add(var21, (SubLObject)module0128.ONE_INTEGER);
                            final SubLObject var39 = f8440(var38);
                            if (var39.isInteger()) {
                                f8443(var39);
                                f8442(var38, (SubLObject)module0128.NIL);
                                final SubLObject var40 = module0166.f10743(var38);
                                if (var40.isString()) {
                                    f8472(var38, var40);
                                }
                            }
                        }
                        var35 = Numbers.add(var35, (SubLObject)module0128.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var25, var17);
            module0012.$g77$.rebind(var24, var17);
            module0012.$g76$.rebind(var23, var17);
            module0012.$g75$.rebind(var22, var17);
        }
        if (module0128.NIL != module0122.f8287()) {
            module0165.f10706();
            module0124.f8368();
        }
        final SubLObject var41 = module0163.f10663((SubLObject)module0128.$ic70$);
        SubLObject var42 = (SubLObject)module0128.ZERO_INTEGER;
        try {
            SubLObject var45;
            for (SubLObject var43 = (SubLObject)module0128.NIL; module0128.NIL == var43; var43 = (SubLObject)SubLObjectFactory.makeBoolean(module0128.NIL == var45)) {
                var17.resetMultipleValues();
                final SubLObject var44 = module0052.f3693(var41);
                var45 = var17.secondMultipleValue();
                var17.resetMultipleValues();
                if (module0128.NIL != var45) {
                    SubLObject var47;
                    final SubLObject var46 = var47 = var44;
                    SubLObject var48 = (SubLObject)module0128.NIL;
                    SubLObject var49 = (SubLObject)module0128.NIL;
                    SubLObject var50 = (SubLObject)module0128.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0128.$ic71$);
                    var48 = var47.first();
                    var47 = var47.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0128.$ic71$);
                    var49 = var47.first();
                    var47 = var47.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0128.$ic71$);
                    var50 = var47.first();
                    var47 = var47.rest();
                    if (module0128.NIL == var47) {
                        final SubLObject var51 = f8477(var49, (SubLObject)module0128.T);
                        if (var48.isInteger()) {
                            module0165.f10711(var51, var48);
                            if (module0128.NIL != module0122.f8287()) {
                                module0165.f10709(var51, var50);
                                module0124.f8369(var51, var49);
                            }
                            f8473(var49);
                            var42 = Numbers.add(var42, (SubLObject)module0128.ONE_INTEGER);
                        }
                        else {
                            if (f8440(var51).isInteger()) {
                                f8442(var51, (SubLObject)module0128.NIL);
                            }
                            f8472(var51, var49);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var46, (SubLObject)module0128.$ic71$);
                    }
                }
            }
        }
        finally {
            final SubLObject var52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0128.T, var17);
                module0122.f8331(var41);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var52, var17);
            }
        }
        return var42;
    }
    
    public static SubLObject f8476() {
        SubLObject var89 = (SubLObject)module0128.NIL;
        SubLObject var90 = (SubLObject)module0128.NIL;
        final Iterator var91 = Hashtables.getEntrySetIterator(module0128.$g1502$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var91)) {
                final Map.Entry var92 = Hashtables.iteratorNextEntry(var91);
                var89 = Hashtables.getEntryKey(var92);
                var90 = Hashtables.getEntryValue(var92);
                final SubLObject var93 = module0124.f8359(var89);
                if (module0128.NIL != f8449(var93)) {
                    SubLObject var95;
                    final SubLObject var94 = var95 = module0165.f10722(var93);
                    SubLObject var96 = (SubLObject)module0128.NIL;
                    SubLObject var89_109 = (SubLObject)module0128.NIL;
                    SubLObject var97 = (SubLObject)module0128.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0128.$ic71$);
                    var96 = var95.first();
                    var95 = var95.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0128.$ic71$);
                    var89_109 = var95.first();
                    var95 = var95.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0128.$ic71$);
                    var97 = var95.first();
                    var95 = var95.rest();
                    if (module0128.NIL == var95) {
                        module0165.f10713(var93);
                        module0165.f10711(var90, var96);
                        module0165.f10709(var90, var97);
                        module0124.f8369(var90, var89_109);
                        f8473(var89_109);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0128.$ic71$);
                    }
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var91);
        }
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8477(final SubLObject var89, SubLObject var110) {
        if (var110 == module0128.UNPROVIDED) {
            var110 = (SubLObject)module0128.NIL;
        }
        assert module0128.NIL != module0126.f8391(var89) : var89;
        if (module0128.NIL != var110 && var89.isString()) {
            SubLObject var111 = module0124.f8359(var89);
            if (module0128.NIL != var111) {
                return var111;
            }
            var111 = f8471(var89);
            if (module0128.NIL != var111) {
                return var111;
            }
        }
        final SubLObject var112 = f8478(var89, (SubLObject)module0128.T);
        if (var89.isString()) {
            f8472(var112, var89);
        }
        return var112;
    }
    
    public static SubLObject f8478(final SubLObject var89, final SubLObject var112) {
        SubLObject var113 = (SubLObject)module0128.NIL;
        var113 = f8458();
        f8453(var113, var89);
        return var113;
    }
    
    public static SubLObject f8479(final SubLObject var113) {
        return f8477(var113, (SubLObject)module0128.T);
    }
    
    public static SubLObject f8480(final SubLObject var89) {
        assert module0128.NIL != Types.stringp(var89) : var89;
        return f8478(var89, (SubLObject)module0128.NIL);
    }
    
    public static SubLObject f8481() {
        return f8478((SubLObject)module0128.NIL, (SubLObject)module0128.NIL);
    }
    
    public static SubLObject f8482() {
        return f8477((SubLObject)module0128.$ic63$, (SubLObject)module0128.UNPROVIDED);
    }
    
    public static SubLObject f8483() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f8425();
        final SubLObject var19 = (SubLObject)module0128.$ic73$;
        final SubLObject var20 = module0065.f4733(var18);
        SubLObject var21 = (SubLObject)module0128.ZERO_INTEGER;
        assert module0128.NIL != Types.stringp(var19) : var19;
        final SubLObject var22 = module0012.$g75$.currentBinding(var17);
        final SubLObject var23 = module0012.$g76$.currentBinding(var17);
        final SubLObject var24 = module0012.$g77$.currentBinding(var17);
        final SubLObject var25 = module0012.$g78$.currentBinding(var17);
        try {
            module0012.$g75$.bind((SubLObject)module0128.ZERO_INTEGER, var17);
            module0012.$g76$.bind((SubLObject)module0128.NIL, var17);
            module0012.$g77$.bind((SubLObject)module0128.T, var17);
            module0012.$g78$.bind(Time.get_universal_time(), var17);
            module0012.f478(var19);
            final SubLObject var26_114 = var18;
            if (module0128.NIL == module0065.f4772(var26_114, (SubLObject)module0128.$ic14$)) {
                final SubLObject var28_115 = var26_114;
                if (module0128.NIL == module0065.f4775(var28_115, (SubLObject)module0128.$ic14$)) {
                    final SubLObject var26 = module0065.f4740(var28_115);
                    final SubLObject var27 = (SubLObject)module0128.NIL;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    for (var28 = Sequences.length(var26), var29 = (SubLObject)module0128.NIL, var29 = (SubLObject)module0128.ZERO_INTEGER; var29.numL(var28); var29 = Numbers.add(var29, (SubLObject)module0128.ONE_INTEGER)) {
                        var30 = ((module0128.NIL != var27) ? Numbers.subtract(var28, var29, (SubLObject)module0128.ONE_INTEGER) : var29);
                        var31 = Vectors.aref(var26, var30);
                        if (module0128.NIL == module0065.f4749(var31) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                            if (module0128.NIL != module0065.f4749(var31)) {
                                var31 = (SubLObject)module0128.$ic14$;
                            }
                            module0012.note_percent_progress(var21, var20);
                            var21 = Numbers.add(var21, (SubLObject)module0128.ONE_INTEGER);
                            module0212.f13794(var31);
                            f8460(var31);
                        }
                    }
                }
                final SubLObject var36_116 = var26_114;
                if (module0128.NIL == module0065.f4777(var36_116) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                    final SubLObject var32 = module0065.f4738(var36_116);
                    SubLObject var33 = module0065.f4739(var36_116);
                    final SubLObject var34 = module0065.f4734(var36_116);
                    final SubLObject var35 = (SubLObject)((module0128.NIL != module0065.f4773((SubLObject)module0128.$ic14$)) ? module0128.NIL : module0128.$ic14$);
                    while (var33.numL(var34)) {
                        final SubLObject var36 = Hashtables.gethash_without_values(var33, var32, var35);
                        if (module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$) || module0128.NIL == module0065.f4749(var36)) {
                            module0012.note_percent_progress(var21, var20);
                            var21 = Numbers.add(var21, (SubLObject)module0128.ONE_INTEGER);
                            module0212.f13794(var36);
                            f8460(var36);
                        }
                        var33 = Numbers.add(var33, (SubLObject)module0128.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var25, var17);
            module0012.$g77$.rebind(var24, var17);
            module0012.$g76$.rebind(var23, var17);
            module0012.$g75$.rebind(var22, var17);
        }
        f8484();
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8440(final SubLObject var49) {
        assert module0128.NIL != f8449(var49) : var49;
        return f8450(var49);
    }
    
    public static SubLObject f8485(final SubLObject var49, final SubLObject var44) {
        assert module0128.NIL != f8449(var49) : var49;
        assert module0128.NIL != Types.integerp(var44) : var44;
        if (!f8440(var49).isInteger()) {
            f8441(var49, var44);
        }
        return var49;
    }
    
    public static SubLObject f8442(final SubLObject var49, final SubLObject var117) {
        f8452(var49, var117);
        return var49;
    }
    
    public static SubLObject f8462(final SubLObject var49) {
        return Types.integerp(f8440(var49));
    }
    
    public static SubLObject f8486(final SubLObject var44) {
        assert module0128.NIL != Types.integerp(var44) : var44;
        return f8434(var44);
    }
    
    public static SubLObject f8487(final SubLObject var41, final SubLObject var42) {
        module0165.f10698(var41, var42);
        f8427(var41, var42);
        module0164.f10667(var41, var42);
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8488(SubLObject var43) {
        if (var43 == module0128.UNPROVIDED) {
            var43 = (SubLObject)module0128.NIL;
        }
        f8428(var43);
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8484() {
        module0165.f10706();
        f8430();
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8489() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0127.f8413();
        module0124.f8368();
        final SubLObject var19 = f8425();
        final SubLObject var20 = (SubLObject)module0128.$ic75$;
        final SubLObject var21 = module0065.f4733(var19);
        SubLObject var22 = (SubLObject)module0128.ZERO_INTEGER;
        assert module0128.NIL != Types.stringp(var20) : var20;
        final SubLObject var23 = module0012.$g75$.currentBinding(var17);
        final SubLObject var24 = module0012.$g76$.currentBinding(var17);
        final SubLObject var25 = module0012.$g77$.currentBinding(var17);
        final SubLObject var26 = module0012.$g78$.currentBinding(var17);
        try {
            module0012.$g75$.bind((SubLObject)module0128.ZERO_INTEGER, var17);
            module0012.$g76$.bind((SubLObject)module0128.NIL, var17);
            module0012.$g77$.bind((SubLObject)module0128.T, var17);
            module0012.$g78$.bind(Time.get_universal_time(), var17);
            module0012.f478(var20);
            final SubLObject var26_119 = var19;
            if (module0128.NIL == module0065.f4772(var26_119, (SubLObject)module0128.$ic14$)) {
                final SubLObject var28_120 = var26_119;
                if (module0128.NIL == module0065.f4775(var28_120, (SubLObject)module0128.$ic14$)) {
                    final SubLObject var27 = module0065.f4740(var28_120);
                    final SubLObject var28 = (SubLObject)module0128.NIL;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    for (var29 = Sequences.length(var27), var30 = (SubLObject)module0128.NIL, var30 = (SubLObject)module0128.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0128.ONE_INTEGER)) {
                        var31 = ((module0128.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0128.ONE_INTEGER) : var30);
                        var32 = Vectors.aref(var27, var31);
                        if (module0128.NIL == module0065.f4749(var32) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                            if (module0128.NIL != module0065.f4749(var32)) {
                                var32 = (SubLObject)module0128.$ic14$;
                            }
                            module0012.note_percent_progress(var22, var21);
                            var22 = Numbers.add(var22, (SubLObject)module0128.ONE_INTEGER);
                            if (module0128.NIL != f8463(var32, (SubLObject)module0128.UNPROVIDED)) {
                                var33 = module0166.f10743(var32);
                                if (var33.isString()) {
                                    module0124.f8369(var32, var33);
                                }
                            }
                        }
                    }
                }
                final SubLObject var36_121 = var26_119;
                if (module0128.NIL == module0065.f4777(var36_121) || module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$)) {
                    final SubLObject var34 = module0065.f4738(var36_121);
                    SubLObject var35 = module0065.f4739(var36_121);
                    final SubLObject var36 = module0065.f4734(var36_121);
                    final SubLObject var37 = (SubLObject)((module0128.NIL != module0065.f4773((SubLObject)module0128.$ic14$)) ? module0128.NIL : module0128.$ic14$);
                    while (var35.numL(var36)) {
                        final SubLObject var38 = Hashtables.gethash_without_values(var35, var34, var37);
                        if (module0128.NIL == module0065.f4773((SubLObject)module0128.$ic14$) || module0128.NIL == module0065.f4749(var38)) {
                            module0012.note_percent_progress(var22, var21);
                            var22 = Numbers.add(var22, (SubLObject)module0128.ONE_INTEGER);
                            if (module0128.NIL != f8463(var38, (SubLObject)module0128.UNPROVIDED)) {
                                final SubLObject var39 = module0166.f10743(var38);
                                if (var39.isString()) {
                                    module0124.f8369(var38, var39);
                                }
                            }
                        }
                        var35 = Numbers.add(var35, (SubLObject)module0128.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var26, var17);
            module0012.$g77$.rebind(var25, var17);
            module0012.$g76$.rebind(var24, var17);
            module0012.$g75$.rebind(var23, var17);
        }
        SubLObject var40 = var18;
        SubLObject var41 = (SubLObject)module0128.NIL;
        var41 = var40.first();
        while (module0128.NIL != var40) {
            if (module0128.NIL == f8463(var41, (SubLObject)module0128.UNPROVIDED)) {
                final SubLObject var42 = module0166.f10743(var41);
                if (var42.isString()) {
                    module0124.f8369(var41, var42);
                }
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8490() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0128.NIL;
        final SubLObject var19 = module0126.f8404((SubLObject)module0128.T, (SubLObject)module0128.UNPROVIDED);
        SubLObject var22;
        for (SubLObject var20 = (SubLObject)module0128.NIL; module0128.NIL == var20; var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0128.NIL == var22)) {
            var17.resetMultipleValues();
            final SubLObject var21 = module0052.f3693(var19);
            var22 = var17.secondMultipleValue();
            var17.resetMultipleValues();
            if (module0128.NIL != var22 && module0128.NIL != f8466(var21)) {
                var18 = (SubLObject)ConsesLow.cons(var21, var18);
            }
        }
        module0052.f3696(var19);
        SubLObject var23 = var18;
        SubLObject var24 = (SubLObject)module0128.NIL;
        var24 = var23.first();
        while (module0128.NIL != var23) {
            final SubLObject var25 = module0166.f10743(var24);
            if (var25.isString()) {
                module0124.f8370(var24, var25);
                f8472(var24, var25);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return Sequences.length(var18);
    }
    
    public static SubLObject f8491() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8423", "S#10533", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0128", "f8424", "DO-CONSTANTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8425", "S#10534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8426", "S#10535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8427", "S#10536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8428", "S#10537", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8430", "S#10538", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8431", "S#10539", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8432", "S#10540", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8433", "CONSTANT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8434", "S#10541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8435", "S#10542", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8436", "S#10543", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8437", "S#10544", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8438", "S#10545", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8439", "S#10546", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8429", "S#10547", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8441", "S#10548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8443", "S#10549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8444", "S#10550", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0128", "f8445", "S#10551");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0128", "f8446", "S#10552");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8447", "S#10518", 2, 0, false);
        new $f8447$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8449", "CONSTANT-P", 1, 0, false);
        new $f8449$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8450", "S#10553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8451", "S#10554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8452", "S#10555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8453", "S#10556", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8454", "S#10557", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8455", "S#10558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8456", "S#10559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8448", "S#10560", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8457", "S#10520", 1, 0, false);
        new $f8457$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8458", "S#10561", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8459", "S#10562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8460", "S#10563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8461", "S#10469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8463", "VALID-CONSTANT?", 1, 1, false);
        new $f8463$UnaryFunction();
        new $f8463$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8464", "S#10564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8465", "VALID-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8466", "S#10485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8467", "S#2609", 1, 1, false);
        new $f8467$UnaryFunction();
        new $f8467$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8468", "S#10565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8469", "S#10506", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8470", "S#10566", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8471", "S#10567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8472", "S#10568", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8473", "S#10569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8474", "S#10570", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8475", "S#10571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8476", "S#10572", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8477", "S#10573", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8478", "S#10574", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8479", "S#10575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8480", "S#10576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8481", "S#10577", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8482", "S#10578", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8483", "S#10579", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8440", "CONSTANT-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8485", "S#10580", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8442", "S#10581", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8462", "S#10582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8486", "S#10583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8487", "S#10584", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8488", "S#10585", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8484", "S#10586", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8489", "S#10587", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0128", "f8490", "S#10588", 0, 0, false);
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8492() {
        module0128.$g1500$ = SubLFiles.deflexical("S#10589", (SubLObject)((module0128.NIL != Symbols.boundp((SubLObject)module0128.$ic0$)) ? module0128.$g1500$.getGlobalValue() : module0128.NIL));
        module0128.$g1501$ = SubLFiles.defconstant("S#10590", (SubLObject)module0128.$ic31$);
        module0128.$g1502$ = SubLFiles.deflexical("S#10591", (module0128.NIL != Symbols.boundp((SubLObject)module0128.$ic67$)) ? module0128.$g1502$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0128.$ic68$, Symbols.symbol_function((SubLObject)module0128.EQUAL), (SubLObject)module0128.UNPROVIDED));
        return (SubLObject)module0128.NIL;
    }
    
    public static SubLObject f8493() {
        module0003.f57((SubLObject)module0128.$ic0$);
        module0012.f375((SubLObject)module0128.$ic10$, (SubLObject)module0128.$ic2$, (SubLObject)module0128.$ic11$);
        module0002.f50((SubLObject)module0128.$ic12$, (SubLObject)module0128.$ic10$);
        module0002.f50((SubLObject)module0128.$ic15$, (SubLObject)module0128.$ic16$);
        module0012.f368((SubLObject)module0128.$ic17$, (SubLObject)module0128.NIL, (SubLObject)module0128.$ic18$, (SubLObject)module0128.NIL, (SubLObject)module0128.$ic19$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0128.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0128.$ic39$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0128.$ic40$);
        Structures.def_csetf((SubLObject)module0128.$ic41$, (SubLObject)module0128.$ic42$);
        Structures.def_csetf((SubLObject)module0128.$ic43$, (SubLObject)module0128.$ic44$);
        Equality.identity((SubLObject)module0128.$ic31$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0128.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0128.$ic52$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0128.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0128.$ic56$));
        module0012.f368((SubLObject)module0128.$ic32$, (SubLObject)module0128.$ic57$, (SubLObject)module0128.$ic58$, (SubLObject)module0128.NIL, (SubLObject)module0128.$ic59$);
        module0012.f368((SubLObject)module0128.$ic60$, (SubLObject)module0128.$ic61$, (SubLObject)module0128.$ic62$, (SubLObject)module0128.NIL, (SubLObject)module0128.$ic59$);
        module0012.f588((SubLObject)module0128.$ic64$, (SubLObject)module0128.$ic65$, (SubLObject)module0128.$ic61$, (SubLObject)module0128.$ic66$, (SubLObject)module0128.NIL, (SubLObject)module0128.$ic59$);
        module0003.f57((SubLObject)module0128.$ic67$);
        return (SubLObject)module0128.NIL;
    }
    
    public void declareFunctions() {
        f8491();
    }
    
    public void initializeVariables() {
        f8492();
    }
    
    public void runTopLevelForms() {
        f8493();
    }
    
    static {
        me = (SubLFile)new module0128();
        module0128.$g1500$ = null;
        module0128.$g1501$ = null;
        module0128.$g1502$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10589", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc constants")), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = SubLObjectFactory.makeString("mapping Cyc constants");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic5$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic6$ = SubLObjectFactory.makeKeyword("DONE");
        $ic7$ = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10534", "CYC"));
        $ic9$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic10$ = SubLObjectFactory.makeSymbol("DO-CONSTANTS");
        $ic11$ = SubLObjectFactory.makeString("Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\n   VAR is bound to each constant in turn.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
        $ic12$ = SubLObjectFactory.makeSymbol("S#10534", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic14$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic15$ = SubLObjectFactory.makeSymbol("S#10539", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#10592", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("CONSTANT-COUNT");
        $ic18$ = SubLObjectFactory.makeString("Return the total number of constants.");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic20$ = SubLObjectFactory.makeKeyword("OLD");
        $ic21$ = SubLObjectFactory.makeString("Determining maximum constant SUID");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic24$ = SubLObjectFactory.makeUninternedSymbol("US#4D08B3F");
        $ic25$ = SubLObjectFactory.makeSymbol("CLET");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10517", "CYC")));
        $ic27$ = SubLObjectFactory.makeSymbol("S#10463", "CYC");
        $ic28$ = SubLObjectFactory.makeUninternedSymbol("US#352B2C1");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)module0128.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10517", "CYC"))));
        $ic30$ = SubLObjectFactory.makeSymbol("S#10464", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#10505", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic33$ = SubLObjectFactory.makeInteger(140);
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10593", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUID"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10553", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10554", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10555", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10556", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#10560", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#10518", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#10553", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#10555", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#10554", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#10556", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("SUID");
        $ic46$ = SubLObjectFactory.makeKeyword("NAME");
        $ic47$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic48$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic49$ = SubLObjectFactory.makeSymbol("S#10557", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic51$ = SubLObjectFactory.makeKeyword("END");
        $ic52$ = SubLObjectFactory.makeSymbol("S#10559", "CYC");
        $ic53$ = SubLObjectFactory.makeString("#$~a");
        $ic54$ = SubLObjectFactory.makeString("<The CFASL invalid constant>");
        $ic55$ = SubLObjectFactory.makeString("<Constant ~a>");
        $ic56$ = SubLObjectFactory.makeSymbol("S#10520", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"));
        $ic58$ = SubLObjectFactory.makeString("Return T iff the argument is a CycL constant");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic60$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10594", "CYC"));
        $ic62$ = SubLObjectFactory.makeString("Return T if CONSTANT is a valid, fully-formed constant.");
        $ic63$ = SubLObjectFactory.makeKeyword("UNNAMED");
        $ic64$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT?"));
        $ic66$ = SubLObjectFactory.makeString("Deprecated in favor of valid-constant?\n   Return T if CONSTANT is a valid constant.");
        $ic67$ = SubLObjectFactory.makeSymbol("S#10591", "CYC");
        $ic68$ = SubLObjectFactory.makeInteger(4000);
        $ic69$ = SubLObjectFactory.makeString("clearing local constant information");
        $ic70$ = SubLObjectFactory.makeInteger(50000);
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#10492", "CYC");
        $ic73$ = SubLObjectFactory.makeString("Freeing constants");
        $ic74$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic75$ = SubLObjectFactory.makeString("Rebuilding constant completion table");
    }
    
    public static final class $sX10505_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $name;
        private static final SubLStructDeclNative structDecl;
        
        public $sX10505_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10505_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$name;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10505_native.class, module0128.$ic31$, module0128.$ic32$, module0128.$ic34$, module0128.$ic35$, new String[] { "$suid", "$name" }, module0128.$ic36$, module0128.$ic37$, module0128.$ic38$);
        }
    }
    
    public static final class $f8447$BinaryFunction extends BinaryFunction
    {
        public $f8447$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10518"));
        }
        
        public SubLObject processItem(final SubLObject var76, final SubLObject var77) {
            return module0128.f8447(var76, var77);
        }
    }
    
    public static final class $f8449$UnaryFunction extends UnaryFunction
    {
        public $f8449$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CONSTANT-P"));
        }
        
        public SubLObject processItem(final SubLObject var76) {
            return module0128.f8449(var76);
        }
    }
    
    public static final class $f8457$UnaryFunction extends UnaryFunction
    {
        public $f8457$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10520"));
        }
        
        public SubLObject processItem(final SubLObject var76) {
            return module0128.f8457(var76);
        }
    }
    
    public static final class $f8463$UnaryFunction extends UnaryFunction
    {
        public $f8463$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALID-CONSTANT?"));
        }
        
        public SubLObject processItem(final SubLObject var76) {
            return module0128.f8463(var76, (SubLObject)$f8463$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f8463$BinaryFunction extends BinaryFunction
    {
        public $f8463$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALID-CONSTANT?"));
        }
        
        public SubLObject processItem(final SubLObject var76, final SubLObject var77) {
            return module0128.f8463(var76, var77);
        }
    }
    
    public static final class $f8467$UnaryFunction extends UnaryFunction
    {
        public $f8467$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2609"));
        }
        
        public SubLObject processItem(final SubLObject var76) {
            return module0128.f8467(var76, (SubLObject)$f8467$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f8467$BinaryFunction extends BinaryFunction
    {
        public $f8467$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2609"));
        }
        
        public SubLObject processItem(final SubLObject var76, final SubLObject var77) {
            return module0128.f8467(var76, var77);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0128.class
	Total time: 376 ms
	
	Decompiled with Procyon 0.5.32.
*/