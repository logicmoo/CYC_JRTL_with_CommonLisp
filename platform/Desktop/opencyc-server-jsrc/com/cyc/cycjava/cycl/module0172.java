package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0172 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0172";
    public static final String myFingerPrint = "1a85bcc9d97bdc8da50c1a8d69a1dc0186728d769e4ebb3dd20d85dddb53d3e0";
    public static SubLSymbol $g2190$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    
    public static SubLObject f10915(final SubLObject var1) {
        assert module0172.NIL != module0167.f10813(var1) : var1;
        return (SubLObject)((module0172.NIL != module0167.f10823(var1)) ? module0168.f10840(var1) : module0172.NIL);
    }
    
    public static SubLObject f10916(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0172.NIL == module0018.$g574$.getDynamicValue(var4)) {
            final SubLObject var5 = module0205.f13276(var3);
            if (module0172.NIL == module0279.f18533(var5, (SubLObject)module0172.UNPROVIDED)) {
                return (SubLObject)module0172.NIL;
            }
            if (module0172.NIL == module0193.f12105(var3)) {
                return (SubLObject)module0172.NIL;
            }
        }
        return module0168.f10841(var3);
    }
    
    public static SubLObject f10917(final SubLObject var6) {
        if (module0172.NIL != module0202.f12659(var6)) {
            return module0206.f13453(var6);
        }
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10918(final SubLObject var1, SubLObject var7) {
        if (var7 == module0172.UNPROVIDED) {
            var7 = (SubLObject)module0172.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL != module0167.f10813(var1) && module0172.NIL == module0167.f10824(var1, (SubLObject)module0172.UNPROVIDED));
    }
    
    public static SubLObject f10919(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL != module0167.f10813(var1) && module0172.NIL == module0167.f10825(var1));
    }
    
    public static SubLObject f10920(final SubLObject var1) {
        assert module0172.NIL != module0167.f10813(var1) : var1;
        return module0036.f2531(var1, Symbols.symbol_function((SubLObject)module0172.$ic0$), Symbols.symbol_function((SubLObject)module0172.$ic1$), (SubLObject)module0172.UNPROVIDED);
    }
    
    public static SubLObject f10921(final SubLObject var3) {
        assert module0172.NIL != module0202.f12659(var3) : var3;
        final SubLObject var4 = f10922(var3);
        return (SubLObject)((module0172.NIL != module0167.f10813(var4)) ? var4 : module0172.NIL);
    }
    
    public static SubLObject f10923(SubLObject var8) {
        if (var8 == module0172.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0172.$ic13$);
        }
        if (module0167.f10796().numG((SubLObject)module0172.ZERO_INTEGER)) {
            final SubLObject var9 = module0167.f10798();
            SubLObject var10;
            SubLObject var11;
            for (var10 = (SubLObject)module0172.NIL; module0172.NIL == var10; var10 = var11) {
                var11 = module0167.f10832(random.random(var9));
                if (module0172.NIL != var11 && module0172.NIL != Functions.funcall(var8, var11)) {}
            }
            return var10;
        }
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10924(SubLObject var12, SubLObject var13, SubLObject var8) {
        if (var12 == module0172.UNPROVIDED) {
            var12 = (SubLObject)module0172.$ic18$;
        }
        if (var13 == module0172.UNPROVIDED) {
            var13 = (SubLObject)module0172.NIL;
        }
        if (var8 == module0172.UNPROVIDED) {
            var8 = Symbols.symbol_function((SubLObject)module0172.$ic13$);
        }
        assert module0172.NIL != module0004.f106(var12) : var12;
        if (module0172.NIL != var13) {
            SubLObject var14 = (SubLObject)module0172.NIL;
            SubLObject var15;
            for (var15 = (SubLObject)module0172.NIL, var15 = (SubLObject)module0172.ZERO_INTEGER; var15.numL(var12); var15 = Numbers.add(var15, (SubLObject)module0172.ONE_INTEGER)) {
                var14 = (SubLObject)ConsesLow.cons(f10923(var8), var14);
            }
            return var14;
        }
        SubLObject var14;
        for (var14 = module0032.f1726(var12, Symbols.symbol_function((SubLObject)module0172.EQL)); module0032.f1728(var14).numL(var12); var14 = module0032.f1736(f10923(var8), var14, Symbols.symbol_function((SubLObject)module0172.EQL))) {}
        return module0032.f1753(var14);
    }
    
    public static SubLObject f10925(final SubLObject var3) {
        assert module0172.NIL != module0202.f12659(var3) : var3;
        return module0285.f18993(var3, (SubLObject)module0172.UNPROVIDED);
    }
    
    public static SubLObject f10926(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0172.NIL;
        final SubLObject var19 = module0131.$g1531$.currentBinding(var17);
        try {
            module0131.$g1531$.bind((SubLObject)module0172.NIL, var17);
            var18 = module0285.f18993(module0290.f19514(var16), (SubLObject)module0172.UNPROVIDED);
        }
        finally {
            module0131.$g1531$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f10927(final SubLObject var3) {
        return f10925(var3);
    }
    
    public static SubLObject f10928(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert module0172.NIL != module0173.f10955(var18) : var18;
        SubLObject var21;
        final SubLObject var20 = var21 = module0230.f15279(var18);
        SubLObject var22 = (SubLObject)module0172.NIL;
        var22 = var21.first();
        while (module0172.NIL != var21) {
            if (module0172.NIL != module0167.f10824(var22, (SubLObject)module0172.UNPROVIDED)) {
                if (module0172.NIL == Errors.$ignore_mustsP$.getDynamicValue(var19) && var18.eql(var22)) {
                    Errors.error((SubLObject)module0172.$ic25$, var18);
                }
                module0540.f33510(var22);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10929(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0172.NIL != module0167.f10813(var1) : var1;
        final SubLObject var3 = module0123.$g1493$.currentBinding(var2);
        try {
            module0123.$g1493$.bind((SubLObject)ConsesLow.cons(var1, module0123.$g1493$.getDynamicValue(var2)), var2);
            if (module0172.NIL != module0131.f8563() && module0172.NIL != module0324.f21952(var1)) {
                module0327.f22135(var1);
            }
            f10928(var1);
            module0217.f14370(var1);
            module0183.f11626(var1);
            module0549.f33953(var1);
        }
        finally {
            module0123.$g1493$.rebind(var3, var2);
        }
        if (module0172.NIL != module0342.f23111(var1)) {
            return var1;
        }
        return module0168.f10839(var1);
    }
    
    public static SubLObject f10930(SubLObject var6) {
        if (module0172.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0172.$ic0$), var6, (SubLObject)module0172.UNPROVIDED)) {
            var6 = module0036.f2531(var6, Symbols.symbol_function((SubLObject)module0172.$ic0$), Symbols.symbol_function((SubLObject)module0172.$ic10$), (SubLObject)module0172.UNPROVIDED);
        }
        return var6;
    }
    
    public static SubLObject f10922(final SubLObject var6) {
        if (module0172.NIL == module0202.f12659(var6)) {
            return var6;
        }
        return f10931(var6);
    }
    
    public static SubLObject f10931(final SubLObject var22) {
        if (module0172.NIL != module0202.f12639(var22)) {
            return var22;
        }
        SubLObject var23 = (SubLObject)module0172.NIL;
        if (module0172.NIL != f10932(var22)) {
            final SubLObject var24 = conses_high.copy_list(var22);
            SubLObject var25;
            SubLObject var26;
            SubLObject var27;
            for (var25 = (SubLObject)module0172.NIL, var25 = var24; !var25.isAtom(); var25 = var25.rest()) {
                var26 = var25.first();
                if (module0172.NIL != module0228.f15225(var26)) {
                    var27 = f10931(var26);
                    if (module0172.NIL != var27) {
                        ConsesLow.rplaca(var25, var27);
                    }
                }
            }
            var23 = var24;
        }
        else {
            var23 = var22;
        }
        final SubLObject var28 = f10916(var23);
        return (module0172.NIL != module0167.f10813(var28)) ? var28 : var23;
    }
    
    public static SubLObject f10932(final SubLObject var24) {
        SubLObject var25;
        SubLObject var26;
        for (var25 = (SubLObject)module0172.NIL, var25 = var24; !var25.isAtom(); var25 = var25.rest()) {
            var26 = var25.first();
            if (module0172.NIL != module0228.f15225(var26)) {
                return (SubLObject)module0172.T;
            }
        }
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10933(final SubLObject var5, final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL != module0167.f10813(var6) && var5.eql(module0205.f13276(var6)));
    }
    
    public static SubLObject f10934(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL != module0035.f2014(var6) && module0172.NIL != module0035.f1995(var6, (SubLObject)module0172.TWO_INTEGER, (SubLObject)module0172.UNPROVIDED) && module0172.NIL != module0035.f2370((SubLObject)module0172.$ic19$, var6, (SubLObject)module0172.UNPROVIDED));
    }
    
    public static SubLObject f10935() {
        final SubLObject var28 = module0167.f10796();
        final SubLObject var29 = module0167.f10798();
        return (SubLObject)ConsesLow.list(var28, var29);
    }
    
    public static SubLObject f10936(final SubLObject var30) {
        SubLObject var31 = (SubLObject)module0172.NIL;
        SubLObject var32 = (SubLObject)module0172.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)module0172.$ic29$);
        var31 = var30.first();
        SubLObject var33 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var30, (SubLObject)module0172.$ic29$);
        var32 = var33.first();
        var33 = var33.rest();
        if (module0172.NIL == var33) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var31.numE(module0167.f10796()) && var32.numE(module0167.f10798()));
        }
        cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0172.$ic29$);
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10937(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0167.f10803(var1);
        final SubLObject var4 = module0172.$g2190$.getDynamicValue(var2);
        if (module0172.NIL != var4) {
            var3 = module0065.f4750(var4, var3, (SubLObject)module0172.UNPROVIDED);
        }
        return var3;
    }
    
    public static SubLObject f10938(final SubLObject var37) {
        return module0167.f10832(var37);
    }
    
    public static SubLObject f10939(final SubLObject var38, final SubLObject var39) {
        final SubLObject var40 = var38.rest();
        final SubLObject var42;
        final SubLObject var41 = var42 = var40;
        return (SubLObject)ConsesLow.listS((SubLObject)module0172.$ic30$, (SubLObject)module0172.$ic31$, ConsesLow.append(var42, (SubLObject)module0172.NIL));
    }
    
    public static SubLObject f10940(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL != module0167.f10813(var1) && module0172.NIL != module0228.f15225(f10915(var1)) && (module0172.NIL != f10941(var1) || module0172.NIL != f10942(var1) || module0172.NIL != f10943(var1)));
    }
    
    public static SubLObject f10944(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL != module0167.f10813(var1) && module0172.NIL == f10940(var1));
    }
    
    public static SubLObject f10941(final SubLObject var1) {
        return module0226.f15111(var1);
    }
    
    public static SubLObject f10942(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL != module0226.f14877(module0205.f13276(var1)) || module0172.NIL != f10945(module0205.f13276(var1)));
    }
    
    public static SubLObject f10945(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var6);
        try {
            module0147.$g2094$.bind((SubLObject)module0172.$ic32$, var6);
            module0147.$g2095$.bind(module0172.$ic33$, var6);
            if (module0172.NIL != module0158.f10175(var5, (SubLObject)module0172.NIL)) {
                final SubLObject var9 = module0158.f10176(var5, (SubLObject)module0172.NIL);
                SubLObject var10 = (SubLObject)module0172.NIL;
                final SubLObject var11 = (SubLObject)module0172.NIL;
                while (module0172.NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)SubLObjectFactory.makeBoolean(!var11.eql(var12));
                    if (module0172.NIL != var13) {
                        SubLObject var14 = (SubLObject)module0172.NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)module0172.$ic34$, (SubLObject)module0172.NIL, (SubLObject)module0172.NIL);
                            SubLObject var45_50 = (SubLObject)module0172.NIL;
                            final SubLObject var46_51 = (SubLObject)module0172.NIL;
                            while (module0172.NIL == var45_50) {
                                final SubLObject var15 = module0052.f3695(var14, var46_51);
                                final SubLObject var48_53 = (SubLObject)SubLObjectFactory.makeBoolean(!var46_51.eql(var15));
                                if (module0172.NIL != var48_53 && module0172.NIL != module0220.f14578(module0172.$ic35$, var5, var15, (SubLObject)module0172.UNPROVIDED, (SubLObject)module0172.UNPROVIDED, (SubLObject)module0172.UNPROVIDED)) {
                                    return (SubLObject)module0172.T;
                                }
                                var45_50 = (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL == var48_53);
                            }
                        }
                        finally {
                            final SubLObject var17_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0172.T, var6);
                                if (module0172.NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_54, var6);
                            }
                        }
                    }
                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL == var13);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var8, var6);
            module0147.$g2094$.rebind(var7, var6);
        }
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10943(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0172.NIL != module0167.f10813(var1) : var1;
        final SubLObject var3 = module0228.f15206(var1);
        if (module0172.NIL != var3) {
            SubLObject var4 = (SubLObject)module0172.NIL;
            final SubLObject var5 = module0018.$g587$.currentBinding(var2);
            final SubLObject var6 = module0018.$g584$.currentBinding(var2);
            try {
                module0018.$g587$.bind(oc_assertions_low.f11272(var3), var2);
                module0018.$g584$.bind(Hashtables.make_hash_table(Numbers.integerDivide(module0217.f14357(var1), (SubLObject)module0172.FOUR_INTEGER), (SubLObject)module0172.UNPROVIDED, (SubLObject)module0172.UNPROVIDED), var2);
                final SubLObject var17_57 = module0147.$g2094$.currentBinding(var2);
                final SubLObject var43_58 = module0147.$g2095$.currentBinding(var2);
                try {
                    module0147.$g2094$.bind((SubLObject)module0172.$ic32$, var2);
                    module0147.$g2095$.bind(module0172.$ic33$, var2);
                    module0219.f14491(Symbols.symbol_function((SubLObject)module0172.$ic37$), var1);
                }
                finally {
                    module0147.$g2095$.rebind(var43_58, var2);
                    module0147.$g2094$.rebind(var17_57, var2);
                }
                var4 = module0030.f1625(module0018.$g584$.getDynamicValue(var2));
            }
            finally {
                module0018.$g584$.rebind(var6, var2);
                module0018.$g587$.rebind(var5, var2);
            }
            return var4;
        }
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10946(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0172.NIL == Hashtables.gethash(var59, module0018.$g587$.getDynamicValue(var60), (SubLObject)module0172.UNPROVIDED)) {
            Hashtables.sethash(var59, module0018.$g584$.getDynamicValue(var60), (SubLObject)module0172.T);
        }
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10947(final SubLObject var3) {
        final SubLObject var4 = f10916(var3);
        return (SubLObject)((module0172.NIL != module0167.f10813(var4)) ? module0167.f10803(var4) : module0172.NIL);
    }
    
    public static SubLObject f10948(final SubLObject var1) {
        return module0202.f12590(f10915(var1));
    }
    
    public static SubLObject f10949() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0172.NIL;
        final SubLObject var6 = module0167.f10788();
        final SubLObject var7 = (SubLObject)module0172.$ic38$;
        final SubLObject var8 = module0065.f4733(var6);
        SubLObject var9 = (SubLObject)module0172.ZERO_INTEGER;
        assert module0172.NIL != Types.stringp(var7) : var7;
        final SubLObject var10 = module0012.$g75$.currentBinding(var4);
        final SubLObject var11 = module0012.$g76$.currentBinding(var4);
        final SubLObject var12 = module0012.$g77$.currentBinding(var4);
        final SubLObject var13 = module0012.$g78$.currentBinding(var4);
        try {
            module0012.$g75$.bind((SubLObject)module0172.ZERO_INTEGER, var4);
            module0012.$g76$.bind((SubLObject)module0172.NIL, var4);
            module0012.$g77$.bind((SubLObject)module0172.T, var4);
            module0012.$g78$.bind(Time.get_universal_time(), var4);
            module0012.f478(var7);
            final SubLObject var67_68 = var6;
            if (module0172.NIL == module0065.f4772(var67_68, (SubLObject)module0172.$ic40$)) {
                final SubLObject var69_70 = var67_68;
                if (module0172.NIL == module0065.f4775(var69_70, (SubLObject)module0172.$ic40$)) {
                    final SubLObject var14 = module0065.f4740(var69_70);
                    final SubLObject var15 = (SubLObject)module0172.NIL;
                    final SubLObject var16 = Sequences.length(var14);
                    SubLObject var18;
                    final SubLObject var17 = var18 = (SubLObject)((module0172.NIL != var15) ? ConsesLow.list(Numbers.subtract(var16, (SubLObject)module0172.ONE_INTEGER), (SubLObject)module0172.MINUS_ONE_INTEGER, (SubLObject)module0172.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)module0172.ZERO_INTEGER, var16, (SubLObject)module0172.ONE_INTEGER));
                    SubLObject var19 = (SubLObject)module0172.NIL;
                    SubLObject var20 = (SubLObject)module0172.NIL;
                    SubLObject var21 = (SubLObject)module0172.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0172.$ic41$);
                    var19 = var18.first();
                    var18 = var18.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0172.$ic41$);
                    var20 = var18.first();
                    var18 = var18.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0172.$ic41$);
                    var21 = var18.first();
                    var18 = var18.rest();
                    if (module0172.NIL == var18) {
                        if (module0172.NIL == var5) {
                            SubLObject var22;
                            SubLObject var23;
                            SubLObject var24;
                            for (var22 = var20, var23 = (SubLObject)module0172.NIL, var23 = var19; module0172.NIL == var5 && module0172.NIL == module0005.f124(var23, var21, var22); var23 = Numbers.add(var23, var21)) {
                                var24 = Vectors.aref(var14, var23);
                                if (module0172.NIL == module0065.f4749(var24) || module0172.NIL == module0065.f4773((SubLObject)module0172.$ic40$)) {
                                    if (module0172.NIL != module0065.f4749(var24)) {
                                        var24 = (SubLObject)module0172.$ic40$;
                                    }
                                    module0012.note_percent_progress(var9, var8);
                                    var9 = Numbers.add(var9, (SubLObject)module0172.ONE_INTEGER);
                                    if (module0172.NIL == f10948(var24)) {
                                        var5 = (SubLObject)module0172.T;
                                    }
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0172.$ic41$);
                    }
                }
                final SubLObject var81_82 = var67_68;
                if (module0172.NIL == module0065.f4777(var81_82) || module0172.NIL == module0065.f4773((SubLObject)module0172.$ic40$)) {
                    final SubLObject var25 = module0065.f4738(var81_82);
                    SubLObject var26 = module0065.f4739(var81_82);
                    final SubLObject var27 = module0065.f4734(var81_82);
                    final SubLObject var28 = (SubLObject)((module0172.NIL != module0065.f4773((SubLObject)module0172.$ic40$)) ? module0172.NIL : module0172.$ic40$);
                    while (var26.numL(var27) && module0172.NIL == var5) {
                        final SubLObject var29 = Hashtables.gethash_without_values(var26, var25, var28);
                        if (module0172.NIL == module0065.f4773((SubLObject)module0172.$ic40$) || module0172.NIL == module0065.f4749(var29)) {
                            module0012.note_percent_progress(var9, var8);
                            var9 = Numbers.add(var9, (SubLObject)module0172.ONE_INTEGER);
                            if (module0172.NIL == f10948(var29)) {
                                var5 = (SubLObject)module0172.T;
                            }
                        }
                        var26 = Numbers.add(var26, (SubLObject)module0172.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var13, var4);
            module0012.$g77$.rebind(var12, var4);
            module0012.$g76$.rebind(var11, var4);
            module0012.$g75$.rebind(var10, var4);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0172.NIL == var5);
    }
    
    public static SubLObject f10950() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0172.NIL;
        final SubLObject var6 = module0167.f10788();
        final SubLObject var7 = (SubLObject)module0172.$ic38$;
        final SubLObject var8 = module0065.f4733(var6);
        SubLObject var9 = (SubLObject)module0172.ZERO_INTEGER;
        assert module0172.NIL != Types.stringp(var7) : var7;
        final SubLObject var10 = module0012.$g75$.currentBinding(var4);
        final SubLObject var11 = module0012.$g76$.currentBinding(var4);
        final SubLObject var12 = module0012.$g77$.currentBinding(var4);
        final SubLObject var13 = module0012.$g78$.currentBinding(var4);
        try {
            module0012.$g75$.bind((SubLObject)module0172.ZERO_INTEGER, var4);
            module0012.$g76$.bind((SubLObject)module0172.NIL, var4);
            module0012.$g77$.bind((SubLObject)module0172.T, var4);
            module0012.$g78$.bind(Time.get_universal_time(), var4);
            module0012.f478(var7);
            final SubLObject var67_87 = var6;
            if (module0172.NIL == module0065.f4772(var67_87, (SubLObject)module0172.$ic40$)) {
                final SubLObject var69_88 = var67_87;
                if (module0172.NIL == module0065.f4775(var69_88, (SubLObject)module0172.$ic40$)) {
                    final SubLObject var14 = module0065.f4740(var69_88);
                    final SubLObject var15 = (SubLObject)module0172.NIL;
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var19;
                    for (var16 = Sequences.length(var14), var17 = (SubLObject)module0172.NIL, var17 = (SubLObject)module0172.ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)module0172.ONE_INTEGER)) {
                        var18 = ((module0172.NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)module0172.ONE_INTEGER) : var17);
                        var19 = Vectors.aref(var14, var18);
                        if (module0172.NIL == module0065.f4749(var19) || module0172.NIL == module0065.f4773((SubLObject)module0172.$ic40$)) {
                            if (module0172.NIL != module0065.f4749(var19)) {
                                var19 = (SubLObject)module0172.$ic40$;
                            }
                            module0012.note_percent_progress(var9, var8);
                            var9 = Numbers.add(var9, (SubLObject)module0172.ONE_INTEGER);
                            if (module0172.NIL == f10948(var19)) {
                                var5 = (SubLObject)ConsesLow.cons(var19, var5);
                            }
                        }
                    }
                }
                final SubLObject var81_90 = var67_87;
                if (module0172.NIL == module0065.f4777(var81_90) || module0172.NIL == module0065.f4773((SubLObject)module0172.$ic40$)) {
                    final SubLObject var20 = module0065.f4738(var81_90);
                    SubLObject var21 = module0065.f4739(var81_90);
                    final SubLObject var22 = module0065.f4734(var81_90);
                    final SubLObject var23 = (SubLObject)((module0172.NIL != module0065.f4773((SubLObject)module0172.$ic40$)) ? module0172.NIL : module0172.$ic40$);
                    while (var21.numL(var22)) {
                        final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                        if (module0172.NIL == module0065.f4773((SubLObject)module0172.$ic40$) || module0172.NIL == module0065.f4749(var24)) {
                            module0012.note_percent_progress(var9, var8);
                            var9 = Numbers.add(var9, (SubLObject)module0172.ONE_INTEGER);
                            if (module0172.NIL == f10948(var24)) {
                                var5 = (SubLObject)ConsesLow.cons(var24, var5);
                            }
                        }
                        var21 = Numbers.add(var21, (SubLObject)module0172.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var13, var4);
            module0012.$g77$.rebind(var12, var4);
            module0012.$g76$.rebind(var11, var4);
            module0012.$g75$.rebind(var10, var4);
        }
        return var5;
    }
    
    public static SubLObject f10951(final SubLObject var1) {
        final SubLObject var2 = f10915(var1);
        final SubLObject var3 = f10921(var2);
        return Equality.eql(var1, var3);
    }
    
    public static SubLObject f10952() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10915", "NART-HL-FORMULA", 1, 0, false);
        new $f10915$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10916", "S#13726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10917", "NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10918", "S#13727", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10919", "S#13728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10920", "NART-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10921", "FIND-NART", 1, 0, false);
        new $f10921$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10923", "RANDOM-NART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10924", "S#13729", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10925", "HL-FIND-OR-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10926", "S#13730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10927", "S#13731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10928", "S#13556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10929", "REMOVE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10930", "S#13732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10922", "NART-SUBSTITUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10931", "S#13733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10932", "S#13734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10933", "S#13735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10934", "S#13736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10935", "S#13737", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10936", "S#13738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10937", "S#13739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10938", "S#13740", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0172", "f10939", "S#13649");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10940", "S#13741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10944", "USELESS-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10941", "S#13742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10942", "S#13743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10945", "S#13744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10943", "S#13745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10946", "S#13746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10947", "S#13747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10948", "S#13748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10949", "S#13749", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10950", "S#13750", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0172", "f10951", "S#13751", 1, 0, false);
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10953() {
        module0172.$g2190$ = SubLFiles.defparameter("S#13752", (SubLObject)module0172.NIL);
        return (SubLObject)module0172.NIL;
    }
    
    public static SubLObject f10954() {
        module0012.f368((SubLObject)module0172.$ic1$, (SubLObject)module0172.$ic2$, (SubLObject)module0172.$ic3$, (SubLObject)module0172.$ic4$, (SubLObject)module0172.$ic5$);
        module0012.f368((SubLObject)module0172.$ic6$, (SubLObject)module0172.$ic7$, (SubLObject)module0172.$ic8$, (SubLObject)module0172.NIL, (SubLObject)module0172.$ic9$);
        module0012.f368((SubLObject)module0172.$ic10$, (SubLObject)module0172.$ic2$, (SubLObject)module0172.$ic11$, (SubLObject)module0172.$ic4$, (SubLObject)module0172.$ic5$);
        module0012.f368((SubLObject)module0172.$ic14$, (SubLObject)module0172.$ic15$, (SubLObject)module0172.$ic16$, (SubLObject)module0172.NIL, (SubLObject)module0172.$ic17$);
        module0002.f35((SubLObject)module0172.$ic20$, (SubLObject)module0172.$ic21$);
        module0002.f35((SubLObject)module0172.$ic22$, (SubLObject)module0172.$ic23$);
        module0012.f368((SubLObject)module0172.$ic26$, (SubLObject)module0172.$ic2$, (SubLObject)module0172.$ic27$, (SubLObject)module0172.$ic4$, (SubLObject)module0172.$ic28$);
        return (SubLObject)module0172.NIL;
    }
    
    public void declareFunctions() {
        f10952();
    }
    
    public void initializeVariables() {
        f10953();
    }
    
    public void runTopLevelForms() {
        f10954();
    }
    
    static {
        me = (SubLFile)new module0172();
        module0172.$g2190$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("NART-P");
        $ic1$ = SubLObjectFactory.makeSymbol("NART-HL-FORMULA");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13601", "CYC"));
        $ic3$ = SubLObjectFactory.makeString("Return the hl formula of this NART.");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")));
        $ic6$ = SubLObjectFactory.makeSymbol("NAUT-P");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic8$ = SubLObjectFactory.makeString("Return T iff OBJECT is a datastructure implementing a non-atomic unreified term (NAUT).\n   By definition, this satisies @xref CYCL-NAT-P but not @xref NART-P.");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic10$ = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
        $ic11$ = SubLObjectFactory.makeString("Return the el formula of this NART.");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12761", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic14$ = SubLObjectFactory.makeSymbol("RANDOM-NART");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"))));
        $ic16$ = SubLObjectFactory.makeString("Return a randomly chosen NART that satisfies TEST");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-P"));
        $ic18$ = SubLObjectFactory.makeInteger(500);
        $ic19$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic20$ = SubLObjectFactory.makeSymbol("HL-FIND-OR-CREATE-NART");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE-NART"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#13731", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-FIND-OR-CREATE-NART"));
        $ic24$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic25$ = SubLObjectFactory.makeString("A horrible and gross circularity has occurred -- ~s is a dependent of itself!");
        $ic26$ = SubLObjectFactory.makeSymbol("REMOVE-NART");
        $ic27$ = SubLObjectFactory.makeString("Remove NART from the KB.");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13597", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13598", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("CLET");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13752", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13612", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9677", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13739", "CYC"))));
        $ic32$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic33$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic34$ = SubLObjectFactory.makeKeyword("RULE");
        $ic35$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("forwardReificationRule"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#13746", "CYC");
        $ic38$ = SubLObjectFactory.makeString("Looking for bad narts");
        $ic39$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic40$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#352B2C1"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#13A2892"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1160044"));
    }
    
    public static final class $f10915$UnaryFunction extends UnaryFunction
    {
        public $f10915$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NART-HL-FORMULA"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0172.f10915(var2);
        }
    }
    
    public static final class $f10921$UnaryFunction extends UnaryFunction
    {
        public $f10921$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FIND-NART"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0172.f10921(var2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0172.class
	Total time: 319 ms
	
	Decompiled with Procyon 0.5.32.
*/