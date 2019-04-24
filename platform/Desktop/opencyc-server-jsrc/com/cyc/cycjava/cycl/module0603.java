package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0603 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0603";
    public static final String myFingerPrint = "599eb351bb1f978dc76cf1357048a2f21e22db8f2bc5456936832c1781d618b7";
    public static SubLSymbol $g4665$;
    private static SubLSymbol $g4666$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLString $ic14$;
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
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    
    public static SubLObject f36837(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0603.NIL;
        SubLObject var4 = (SubLObject)module0603.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0603.$ic0$, var2);
            module0147.$g2095$.bind(module0603.$ic1$, var2);
            PrintLow.format((SubLObject)module0603.T, (SubLObject)module0603.$ic2$);
            SubLObject var7 = var1;
            SubLObject var8 = (SubLObject)module0603.NIL;
            var8 = var7.first();
            while (module0603.NIL != var7) {
                PrintLow.format((SubLObject)module0603.T, (SubLObject)module0603.$ic3$, var8);
                final SubLObject var9 = module0259.f16848(var8, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
                final SubLObject var10 = Sequences.length(var9);
                var3 = conses_high.union(var3, var9, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
                PrintLow.format((SubLObject)module0603.T, (SubLObject)module0603.$ic4$, var10);
                var7 = var7.rest();
                var8 = var7.first();
            }
            if (module0603.NIL != UserIO.user_confirm(PrintLow.format((SubLObject)module0603.NIL, (SubLObject)module0603.$ic5$, Sequences.length(var3)))) {
                var7 = var3;
                SubLObject var11 = (SubLObject)module0603.NIL;
                var11 = var7.first();
                while (module0603.NIL != var7) {
                    if ((module0603.NIL != module0173.f10955(var11) || (module0603.NIL != module0210.f13594(var11) && module0603.NIL != module0172.f10921(var11))) && module0603.NIL == module0259.f16891(var11, module0603.$ic6$)) {
                        module0538.f33365(var11);
                        var4 = Numbers.add(var4, (SubLObject)module0603.ONE_INTEGER);
                        if (Numbers.mod(var4, (SubLObject)module0603.TEN_INTEGER).numE((SubLObject)module0603.ZERO_INTEGER)) {
                            PrintLow.format((SubLObject)module0603.T, (SubLObject)module0603.$ic7$, var4);
                        }
                    }
                    var7 = var7.rest();
                    var11 = var7.first();
                }
                var7 = var3;
                var11 = (SubLObject)module0603.NIL;
                var11 = var7.first();
                while (module0603.NIL != var7) {
                    if ((module0603.NIL != module0173.f10955(var11) || (module0603.NIL != module0210.f13594(var11) && module0603.NIL != module0172.f10921(var11))) && module0603.NIL != module0259.f16891(var11, module0603.$ic6$)) {
                        module0538.f33365(var11);
                        var4 = Numbers.add(var4, (SubLObject)module0603.ONE_INTEGER);
                        if (Numbers.mod(var4, (SubLObject)module0603.TEN_INTEGER).numE((SubLObject)module0603.ZERO_INTEGER)) {
                            PrintLow.format((SubLObject)module0603.T, (SubLObject)module0603.$ic7$, var4);
                        }
                    }
                    var7 = var7.rest();
                    var11 = var7.first();
                }
                PrintLow.format((SubLObject)module0603.T, (SubLObject)module0603.$ic8$);
            }
            else {
                PrintLow.format((SubLObject)module0603.T, (SubLObject)module0603.$ic9$);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var2);
            module0147.$g2094$.rebind(var5, var2);
        }
        return (SubLObject)module0603.$ic10$;
    }
    
    public static SubLObject f36838(final SubLObject var12) {
        if (module0603.NIL != module0174.f11035(var12)) {
            return f36838(module0538.f33478(var12, (SubLObject)module0603.UNPROVIDED));
        }
        if (var12.isCons()) {
            final SubLObject var13 = module0035.f2439(Symbols.symbol_function((SubLObject)module0603.$ic11$), var12, (SubLObject)module0603.UNPROVIDED);
            if (module0603.NIL != var13) {
                return f36838(conses_high.subst(module0538.f33478(var13, (SubLObject)module0603.UNPROVIDED), var13, var12, Symbols.symbol_function((SubLObject)module0603.EQUAL), (SubLObject)module0603.UNPROVIDED));
            }
            final SubLObject var14 = module0035.f2439(Symbols.symbol_function((SubLObject)module0603.$ic12$), var12, (SubLObject)module0603.UNPROVIDED);
            if (module0603.NIL != var14) {
                return f36838(conses_high.subst(module0172.f10915(var14), var14, var12, Symbols.symbol_function((SubLObject)module0603.EQUAL), (SubLObject)module0603.UNPROVIDED));
            }
            return var12;
        }
        else {
            if (module0603.NIL != module0167.f10813(var12)) {
                return f36838(module0172.f10915(var12));
            }
            return var12;
        }
    }
    
    public static SubLObject f36839(final SubLObject var15) {
        final SubLObject var16 = module0174.f11053(var15);
        if (module0603.NIL != var16) {
            return f36838(var16);
        }
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36840(final SubLObject var12) {
        return module0166.f10743(var12.first());
    }
    
    public static SubLObject f36841(final SubLObject var16) {
        return f36842(var16);
    }
    
    public static SubLObject f36842(final SubLObject var16) {
        final SubLObject var17 = Structures.method_func(var16, module0603.$g4665$.getGlobalValue());
        if (module0603.NIL != var17) {
            return Functions.funcall(var17, var16);
        }
        Errors.error((SubLObject)module0603.$ic14$, var16);
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36843(final SubLObject var16) {
        return Values.values((SubLObject)module0603.$ic15$, module0166.f10749(var16));
    }
    
    public static SubLObject f36844(final SubLObject var16) {
        return f36845(var16);
    }
    
    public static SubLObject f36845(final SubLObject var14) {
        return Values.values((SubLObject)module0603.$ic18$, module0167.f10803(var14));
    }
    
    public static SubLObject f36846(final SubLObject var16) {
        return Values.values((SubLObject)module0603.$ic19$, module0193.f12073(var16));
    }
    
    public static SubLObject f36847(final SubLObject var16) {
        return Values.values((SubLObject)module0603.$ic21$, module0174.f11025(var16));
    }
    
    public static SubLObject f36848(final SubLObject var16) {
        return Values.values((SubLObject)module0603.$ic23$, module0184.f11649(var16));
    }
    
    public static SubLObject f36849(final SubLObject var18, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = conses_high.second(conses_high.assoc(var18, module0603.$g4666$.getDynamicValue(var20), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED));
        if (module0603.NIL != var21) {
            return Functions.funcall(var21, var19);
        }
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36850(final SubLObject var18, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        module0603.$g4666$.setDynamicValue(Sequences.delete(var18, module0603.$g4666$.getDynamicValue(var21), Symbols.symbol_function((SubLObject)module0603.EQL), Symbols.symbol_function((SubLObject)module0603.$ic25$), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED), var21);
        module0603.$g4666$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var18, var20), module0603.$g4666$.getDynamicValue(var21)), var21);
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36851(SubLObject var16) {
        var16 = module0228.f15229(var16);
        SubLObject var17 = (SubLObject)module0603.NIL;
        if (module0603.NIL == var17) {
            SubLObject var18;
            SubLObject var19;
            for (var18 = (SubLObject)module0603.$ic31$, var19 = (SubLObject)module0603.NIL, var19 = var18.first(); module0603.NIL == var17 && module0603.NIL != var18; var17 = Functions.funcall(var19, var16), var18 = var18.rest(), var19 = var18.first()) {}
        }
        return (SubLObject)((module0603.NIL != var17) ? Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f36841(var16))) : module0603.NIL);
    }
    
    public static SubLObject f36852(final SubLObject var19, SubLObject var18) {
        if (var18 == module0603.UNPROVIDED) {
            var18 = (SubLObject)module0603.$ic15$;
        }
        assert module0603.NIL != Types.integerp(var19) : var19;
        assert module0603.NIL != Types.keywordp(var18) : var18;
        return f36838(f36849(var18, var19));
    }
    
    public static SubLObject f36853(SubLObject var24) {
        var24 = module0228.f15229(var24);
        if (module0603.NIL == module0173.f10969(var24)) {
            return (SubLObject)module0603.NIL;
        }
        if (module0603.NIL != module0167.f10813(var24)) {
            return Numbers.minus(module0167.f10803(var24));
        }
        if (module0603.NIL != module0128.f8449(var24)) {
            return module0166.f10749(var24);
        }
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36854(final SubLObject var19) {
        if (!var19.isInteger()) {
            return (SubLObject)module0603.NIL;
        }
        SubLObject var20 = (SubLObject)module0603.NIL;
        if (var19.isNegative()) {
            var20 = module0167.f10832(Numbers.minus(var19));
        }
        else {
            var20 = module0166.f10752(var19);
        }
        return f36838(var20);
    }
    
    public static SubLObject f36855(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL == module0128.f8449(var26));
    }
    
    public static SubLObject f36856(final SubLObject var12) {
        if (module0603.NIL != f36857(var12)) {
            return (SubLObject)ConsesLow.list(var12);
        }
        return module0035.f2257(var12, Symbols.symbol_function((SubLObject)module0603.$ic34$), Symbols.symbol_function((SubLObject)module0603.EQUAL), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
    }
    
    public static SubLObject f36857(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL != module0173.f10969(var26) || (module0603.NIL != module0210.f13594(var26) && module0603.NIL != module0173.f10969(module0172.f10921(var26))));
    }
    
    public static SubLObject f36858(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL != module0210.f13594(var26) || module0603.NIL != module0210.f13594(module0228.f15230(var26)));
    }
    
    public static SubLObject f36859(final SubLObject var27) {
        module0342.f23136(var27, (SubLObject)module0603.UNPROVIDED);
        return f36860(var27);
    }
    
    public static SubLObject f36860(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0603.NIL;
        final SubLObject var30 = module0158.f10289(var27);
        if (var30.eql((SubLObject)module0603.$ic35$)) {
            if (module0603.NIL != module0158.f10270(var27, (SubLObject)module0603.NIL)) {
                final SubLObject var31 = module0158.f10271(var27);
                SubLObject var32 = (SubLObject)module0603.NIL;
                try {
                    var32 = module0158.f10316(var31, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL);
                    SubLObject var33 = var29;
                    final SubLObject var34 = (SubLObject)module0603.NIL;
                    while (module0603.NIL == var33) {
                        final SubLObject var35 = module0052.f3695(var32, var34);
                        final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                        if (module0603.NIL != var36) {
                            var29 = (SubLObject)module0603.T;
                        }
                        var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL == var36 || module0603.NIL != var29);
                    }
                }
                finally {
                    final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0603.T, var28);
                        if (module0603.NIL != var32) {
                            module0158.f10319(var32);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var37, var28);
                    }
                }
            }
        }
        else if (var30.eql((SubLObject)module0603.$ic36$) && module0603.NIL != module0158.f10286(var27, (SubLObject)module0603.NIL)) {
            SubLObject var38 = (SubLObject)module0603.NIL;
            try {
                var28.throwStack.push(module0603.$ic37$);
                final SubLObject var39 = module0174.f11010();
                final SubLObject var40 = (SubLObject)module0603.$ic38$;
                final SubLObject var41 = module0065.f4733(var39);
                SubLObject var42 = (SubLObject)module0603.ZERO_INTEGER;
                assert module0603.NIL != Types.stringp(var40) : var40;
                final SubLObject var43 = module0012.$g75$.currentBinding(var28);
                final SubLObject var44 = module0012.$g76$.currentBinding(var28);
                final SubLObject var45 = module0012.$g77$.currentBinding(var28);
                final SubLObject var46 = module0012.$g78$.currentBinding(var28);
                try {
                    module0012.$g75$.bind((SubLObject)module0603.ZERO_INTEGER, var28);
                    module0012.$g76$.bind((SubLObject)module0603.NIL, var28);
                    module0012.$g77$.bind((SubLObject)module0603.T, var28);
                    module0012.$g78$.bind(Time.get_universal_time(), var28);
                    module0012.f478(var40);
                    final SubLObject var43_44 = var39;
                    if (module0603.NIL == module0065.f4772(var43_44, (SubLObject)module0603.$ic40$)) {
                        final SubLObject var45_46 = var43_44;
                        if (module0603.NIL == module0065.f4775(var45_46, (SubLObject)module0603.$ic40$)) {
                            final SubLObject var47 = module0065.f4740(var45_46);
                            final SubLObject var48 = (SubLObject)module0603.NIL;
                            SubLObject var49;
                            SubLObject var50;
                            SubLObject var51;
                            SubLObject var52;
                            for (var49 = Sequences.length(var47), var50 = (SubLObject)module0603.NIL, var50 = (SubLObject)module0603.ZERO_INTEGER; var50.numL(var49); var50 = Numbers.add(var50, (SubLObject)module0603.ONE_INTEGER)) {
                                var51 = ((module0603.NIL != var48) ? Numbers.subtract(var49, var50, (SubLObject)module0603.ONE_INTEGER) : var50);
                                var52 = Vectors.aref(var47, var51);
                                if (module0603.NIL == module0065.f4749(var52) || module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$)) {
                                    if (module0603.NIL != module0065.f4749(var52)) {
                                        var52 = (SubLObject)module0603.$ic40$;
                                    }
                                    module0012.note_percent_progress(var42, var41);
                                    var42 = Numbers.add(var42, (SubLObject)module0603.ONE_INTEGER);
                                    if (module0603.NIL != var29) {
                                        module0012.f425();
                                    }
                                    if (module0603.NIL != module0158.f10287(var52, var27, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL)) {
                                        var29 = (SubLObject)module0603.T;
                                    }
                                }
                            }
                        }
                        final SubLObject var52_53 = var43_44;
                        if (module0603.NIL == module0065.f4777(var52_53) || module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$)) {
                            final SubLObject var53 = module0065.f4738(var52_53);
                            SubLObject var54 = module0065.f4739(var52_53);
                            final SubLObject var55 = module0065.f4734(var52_53);
                            final SubLObject var56 = (SubLObject)((module0603.NIL != module0065.f4773((SubLObject)module0603.$ic40$)) ? module0603.NIL : module0603.$ic40$);
                            while (var54.numL(var55)) {
                                final SubLObject var57 = Hashtables.gethash_without_values(var54, var53, var56);
                                if (module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$) || module0603.NIL == module0065.f4749(var57)) {
                                    module0012.note_percent_progress(var42, var41);
                                    var42 = Numbers.add(var42, (SubLObject)module0603.ONE_INTEGER);
                                    if (module0603.NIL != var29) {
                                        module0012.f425();
                                    }
                                    if (module0603.NIL != module0158.f10287(var57, var27, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL)) {
                                        var29 = (SubLObject)module0603.T;
                                    }
                                }
                                var54 = Numbers.add(var54, (SubLObject)module0603.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var46, var28);
                    module0012.$g77$.rebind(var45, var28);
                    module0012.$g76$.rebind(var44, var28);
                    module0012.$g75$.rebind(var43, var28);
                }
            }
            catch (Throwable var58) {
                var38 = Errors.handleThrowable(var58, (SubLObject)module0603.$ic37$);
            }
            finally {
                var28.throwStack.pop();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL == var29);
    }
    
    public static SubLObject f36861(final SubLObject var26) {
        if (module0603.NIL != module0128.f8449(var26)) {
            final SubLObject var27 = module0166.f10743(var26);
            if (var27.isString()) {
                return var27;
            }
            if (module0603.NIL != module0167.f10813(var26)) {
                return module0038.f2698(PrintLow.format((SubLObject)module0603.NIL, (SubLObject)module0603.$ic41$, module0172.f10915(var26)));
            }
            return module0038.f2698(PrintLow.format((SubLObject)module0603.NIL, (SubLObject)module0603.$ic41$, var26));
        }
        else {
            if (module0603.NIL != module0210.f13594(var26)) {
                return module0038.f2698(PrintLow.format((SubLObject)module0603.NIL, (SubLObject)module0603.$ic41$, var26));
            }
            if (module0603.NIL != module0038.f2653(var26)) {
                return var26;
            }
            if (module0603.NIL == var26) {
                return (SubLObject)module0603.$ic42$;
            }
            return PrintLow.format((SubLObject)module0603.NIL, (SubLObject)module0603.$ic41$, var26);
        }
    }
    
    public static SubLObject f36862(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0603.NIL;
        final SubLObject var30 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind((SubLObject)module0603.$ic0$, var28);
            module0147.$g2095$.bind(module0603.$ic1$, var28);
            var29 = module0259.f16854(var27, module0603.$ic6$, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var31, var28);
            module0147.$g2094$.rebind(var30, var28);
        }
        if (module0603.NIL != module0173.f10969(var27) && module0603.NIL != var29) {
            SubLObject var32 = (SubLObject)module0603.NIL;
            final SubLObject var33 = module0158.f10289(var27);
            if (var33.eql((SubLObject)module0603.$ic35$)) {
                if (module0603.NIL != module0158.f10270(var27, (SubLObject)module0603.NIL)) {
                    final SubLObject var34 = module0158.f10271(var27);
                    SubLObject var35 = (SubLObject)module0603.NIL;
                    try {
                        var35 = module0158.f10316(var34, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL);
                        SubLObject var36 = (SubLObject)module0603.NIL;
                        final SubLObject var37 = (SubLObject)module0603.NIL;
                        while (module0603.NIL == var36) {
                            final SubLObject var38 = module0052.f3695(var35, var37);
                            final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                            if (module0603.NIL != var39) {
                                final SubLObject var40 = f36838(var38);
                                var32 = conses_high.union(var32, module0035.f2399(var40, Symbols.symbol_function((SubLObject)module0603.$ic34$), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
                            }
                            var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL == var39);
                        }
                    }
                    finally {
                        final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0603.T, var28);
                            if (module0603.NIL != var35) {
                                module0158.f10319(var35);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var41, var28);
                        }
                    }
                }
            }
            else if (var33.eql((SubLObject)module0603.$ic36$) && module0603.NIL != module0158.f10286(var27, (SubLObject)module0603.NIL)) {
                final SubLObject var42 = module0174.f11010();
                final SubLObject var43 = (SubLObject)module0603.$ic38$;
                final SubLObject var44 = module0065.f4733(var42);
                SubLObject var45 = (SubLObject)module0603.ZERO_INTEGER;
                assert module0603.NIL != Types.stringp(var43) : var43;
                final SubLObject var46 = module0012.$g75$.currentBinding(var28);
                final SubLObject var47 = module0012.$g76$.currentBinding(var28);
                final SubLObject var48 = module0012.$g77$.currentBinding(var28);
                final SubLObject var49 = module0012.$g78$.currentBinding(var28);
                try {
                    module0012.$g75$.bind((SubLObject)module0603.ZERO_INTEGER, var28);
                    module0012.$g76$.bind((SubLObject)module0603.NIL, var28);
                    module0012.$g77$.bind((SubLObject)module0603.T, var28);
                    module0012.$g78$.bind(Time.get_universal_time(), var28);
                    module0012.f478(var43);
                    final SubLObject var43_61 = var42;
                    if (module0603.NIL == module0065.f4772(var43_61, (SubLObject)module0603.$ic40$)) {
                        final SubLObject var45_62 = var43_61;
                        if (module0603.NIL == module0065.f4775(var45_62, (SubLObject)module0603.$ic40$)) {
                            final SubLObject var50 = module0065.f4740(var45_62);
                            final SubLObject var51 = (SubLObject)module0603.NIL;
                            SubLObject var52;
                            SubLObject var53;
                            SubLObject var54;
                            SubLObject var55;
                            SubLObject var56;
                            for (var52 = Sequences.length(var50), var53 = (SubLObject)module0603.NIL, var53 = (SubLObject)module0603.ZERO_INTEGER; var53.numL(var52); var53 = Numbers.add(var53, (SubLObject)module0603.ONE_INTEGER)) {
                                var54 = ((module0603.NIL != var51) ? Numbers.subtract(var52, var53, (SubLObject)module0603.ONE_INTEGER) : var53);
                                var55 = Vectors.aref(var50, var54);
                                if (module0603.NIL == module0065.f4749(var55) || module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$)) {
                                    if (module0603.NIL != module0065.f4749(var55)) {
                                        var55 = (SubLObject)module0603.$ic40$;
                                    }
                                    module0012.note_percent_progress(var45, var44);
                                    var45 = Numbers.add(var45, (SubLObject)module0603.ONE_INTEGER);
                                    if (module0603.NIL != module0158.f10287(var55, var27, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL)) {
                                        var56 = f36838(var55);
                                        var32 = conses_high.union(var32, module0035.f2399(var56, Symbols.symbol_function((SubLObject)module0603.$ic34$), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
                                    }
                                }
                            }
                        }
                        final SubLObject var52_63 = var43_61;
                        if (module0603.NIL == module0065.f4777(var52_63) || module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$)) {
                            final SubLObject var57 = module0065.f4738(var52_63);
                            SubLObject var58 = module0065.f4739(var52_63);
                            final SubLObject var59 = module0065.f4734(var52_63);
                            final SubLObject var60 = (SubLObject)((module0603.NIL != module0065.f4773((SubLObject)module0603.$ic40$)) ? module0603.NIL : module0603.$ic40$);
                            while (var58.numL(var59)) {
                                final SubLObject var61 = Hashtables.gethash_without_values(var58, var57, var60);
                                if (module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$) || module0603.NIL == module0065.f4749(var61)) {
                                    module0012.note_percent_progress(var45, var44);
                                    var45 = Numbers.add(var45, (SubLObject)module0603.ONE_INTEGER);
                                    if (module0603.NIL != module0158.f10287(var61, var27, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL)) {
                                        final SubLObject var62 = f36838(var61);
                                        var32 = conses_high.union(var32, module0035.f2399(var62, Symbols.symbol_function((SubLObject)module0603.$ic34$), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED), (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
                                    }
                                }
                                var58 = Numbers.add(var58, (SubLObject)module0603.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var49, var28);
                    module0012.$g77$.rebind(var48, var28);
                    module0012.$g76$.rebind(var47, var28);
                    module0012.$g75$.rebind(var46, var28);
                }
            }
            return Sort.sort(conses_high.copy_list(var32), Symbols.symbol_function((SubLObject)module0603.$ic43$), Symbols.symbol_function((SubLObject)module0603.$ic44$));
        }
        Errors.warn((SubLObject)module0603.$ic45$, var27);
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36863(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0603.NIL;
        final SubLObject var30 = module0158.f10289(var27);
        if (var30.eql((SubLObject)module0603.$ic35$)) {
            if (module0603.NIL != module0158.f10270(var27, (SubLObject)module0603.NIL)) {
                final SubLObject var31 = module0158.f10271(var27);
                SubLObject var32 = (SubLObject)module0603.NIL;
                try {
                    var32 = module0158.f10316(var31, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL);
                    SubLObject var33 = (SubLObject)module0603.NIL;
                    final SubLObject var34 = (SubLObject)module0603.NIL;
                    while (module0603.NIL == var33) {
                        final SubLObject var35 = module0052.f3695(var32, var34);
                        final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                        if (module0603.NIL != var36) {
                            var29 = (SubLObject)ConsesLow.cons(module0174.f11025(var35), var29);
                        }
                        var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL == var36);
                    }
                }
                finally {
                    final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0603.T, var28);
                        if (module0603.NIL != var32) {
                            module0158.f10319(var32);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var37, var28);
                    }
                }
            }
        }
        else if (var30.eql((SubLObject)module0603.$ic36$) && module0603.NIL != module0158.f10286(var27, (SubLObject)module0603.NIL)) {
            final SubLObject var38 = module0174.f11010();
            final SubLObject var39 = (SubLObject)module0603.$ic38$;
            final SubLObject var40 = module0065.f4733(var38);
            SubLObject var41 = (SubLObject)module0603.ZERO_INTEGER;
            assert module0603.NIL != Types.stringp(var39) : var39;
            final SubLObject var42 = module0012.$g75$.currentBinding(var28);
            final SubLObject var43 = module0012.$g76$.currentBinding(var28);
            final SubLObject var44 = module0012.$g77$.currentBinding(var28);
            final SubLObject var45 = module0012.$g78$.currentBinding(var28);
            try {
                module0012.$g75$.bind((SubLObject)module0603.ZERO_INTEGER, var28);
                module0012.$g76$.bind((SubLObject)module0603.NIL, var28);
                module0012.$g77$.bind((SubLObject)module0603.T, var28);
                module0012.$g78$.bind(Time.get_universal_time(), var28);
                module0012.f478(var39);
                final SubLObject var43_65 = var38;
                if (module0603.NIL == module0065.f4772(var43_65, (SubLObject)module0603.$ic40$)) {
                    final SubLObject var45_66 = var43_65;
                    if (module0603.NIL == module0065.f4775(var45_66, (SubLObject)module0603.$ic40$)) {
                        final SubLObject var46 = module0065.f4740(var45_66);
                        final SubLObject var47 = (SubLObject)module0603.NIL;
                        SubLObject var48;
                        SubLObject var49;
                        SubLObject var50;
                        SubLObject var51;
                        for (var48 = Sequences.length(var46), var49 = (SubLObject)module0603.NIL, var49 = (SubLObject)module0603.ZERO_INTEGER; var49.numL(var48); var49 = Numbers.add(var49, (SubLObject)module0603.ONE_INTEGER)) {
                            var50 = ((module0603.NIL != var47) ? Numbers.subtract(var48, var49, (SubLObject)module0603.ONE_INTEGER) : var49);
                            var51 = Vectors.aref(var46, var50);
                            if (module0603.NIL == module0065.f4749(var51) || module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$)) {
                                if (module0603.NIL != module0065.f4749(var51)) {
                                    var51 = (SubLObject)module0603.$ic40$;
                                }
                                module0012.note_percent_progress(var41, var40);
                                var41 = Numbers.add(var41, (SubLObject)module0603.ONE_INTEGER);
                                if (module0603.NIL != module0158.f10287(var51, var27, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL)) {
                                    var29 = (SubLObject)ConsesLow.cons(module0174.f11025(var51), var29);
                                }
                            }
                        }
                    }
                    final SubLObject var52_67 = var43_65;
                    if (module0603.NIL == module0065.f4777(var52_67) || module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$)) {
                        final SubLObject var52 = module0065.f4738(var52_67);
                        SubLObject var53 = module0065.f4739(var52_67);
                        final SubLObject var54 = module0065.f4734(var52_67);
                        final SubLObject var55 = (SubLObject)((module0603.NIL != module0065.f4773((SubLObject)module0603.$ic40$)) ? module0603.NIL : module0603.$ic40$);
                        while (var53.numL(var54)) {
                            final SubLObject var56 = Hashtables.gethash_without_values(var53, var52, var55);
                            if (module0603.NIL == module0065.f4773((SubLObject)module0603.$ic40$) || module0603.NIL == module0065.f4749(var56)) {
                                module0012.note_percent_progress(var41, var40);
                                var41 = Numbers.add(var41, (SubLObject)module0603.ONE_INTEGER);
                                if (module0603.NIL != module0158.f10287(var56, var27, (SubLObject)module0603.NIL, (SubLObject)module0603.NIL)) {
                                    var29 = (SubLObject)ConsesLow.cons(module0174.f11025(var56), var29);
                                }
                            }
                            var53 = Numbers.add(var53, (SubLObject)module0603.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var45, var28);
                module0012.$g77$.rebind(var44, var28);
                module0012.$g76$.rebind(var43, var28);
                module0012.$g75$.rebind(var42, var28);
            }
        }
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f36864(final SubLObject var68, final SubLObject var27) {
        if (module0603.NIL != module0538.f33373(var68, var27)) {
            return module0543.f33657(var68, var27);
        }
        return (SubLObject)module0603.T;
    }
    
    public static SubLObject f36865(final SubLObject var68, final SubLObject var27, SubLObject var69, SubLObject var70) {
        if (var69 == module0603.UNPROVIDED) {
            var69 = (SubLObject)module0603.$ic46$;
        }
        if (var70 == module0603.UNPROVIDED) {
            var70 = (SubLObject)module0603.NIL;
        }
        if (module0603.NIL == module0538.f33373(var68, var27)) {
            return module0543.f33628(var68, var27, var69, var70);
        }
        return (SubLObject)module0603.T;
    }
    
    public static SubLObject f36866(final SubLObject var68, final SubLObject var27) {
        if (module0603.NIL != module0538.f33373(var68, var27)) {
            return module0543.f33658(var68, var27);
        }
        return (SubLObject)module0603.T;
    }
    
    public static SubLObject f36867(final SubLObject var68, final SubLObject var27, SubLObject var69, SubLObject var70) {
        if (var69 == module0603.UNPROVIDED) {
            var69 = (SubLObject)module0603.$ic46$;
        }
        if (var70 == module0603.UNPROVIDED) {
            var70 = (SubLObject)module0603.NIL;
        }
        if (module0603.NIL == module0538.f33373(var68, var27)) {
            return module0543.f33631(var68, var27, var69, var70);
        }
        return (SubLObject)module0603.T;
    }
    
    public static SubLObject f36868(final SubLObject var68, final SubLObject var27, SubLObject var69, SubLObject var70, SubLObject var71, SubLObject var72, SubLObject var73) {
        if (var69 == module0603.UNPROVIDED) {
            var69 = (SubLObject)module0603.$ic46$;
        }
        if (var70 == module0603.UNPROVIDED) {
            var70 = (SubLObject)module0603.NIL;
        }
        if (var71 == module0603.UNPROVIDED) {
            var71 = (SubLObject)module0603.T;
        }
        if (var72 == module0603.UNPROVIDED) {
            var72 = (SubLObject)module0603.NIL;
        }
        if (var73 == module0603.UNPROVIDED) {
            var73 = (SubLObject)module0603.NIL;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)module0603.NIL;
        final SubLObject var76 = module0131.$g1531$.currentBinding(var74);
        final SubLObject var77 = module0110.$g1374$.currentBinding(var74);
        try {
            module0131.$g1531$.bind(var71, var74);
            module0110.$g1374$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL == var72), var74);
            if (module0603.NIL != var73) {
                var75 = module0538.f33349(var68, var27, var69, var70);
            }
            else {
                final SubLObject var5_75 = module0018.$g696$.currentBinding(var74);
                final SubLObject var6_76 = module0271.$g2562$.currentBinding(var74);
                final SubLObject var78 = module0144.$g1752$.currentBinding(var74);
                final SubLObject var79 = module0271.$g2560$.currentBinding(var74);
                final SubLObject var80 = module0271.$g2561$.currentBinding(var74);
                final SubLObject var81 = module0271.$g2563$.currentBinding(var74);
                final SubLObject var82 = module0146.$g2055$.currentBinding(var74);
                final SubLObject var83 = module0144.$g1771$.currentBinding(var74);
                final SubLObject var84 = module0144.$g1769$.currentBinding(var74);
                final SubLObject var85 = module0152.$g2107$.currentBinding(var74);
                final SubLObject var86 = module0110.$g1374$.currentBinding(var74);
                try {
                    module0018.$g696$.bind((SubLObject)module0603.NIL, var74);
                    module0271.$g2562$.bind((SubLObject)module0603.NIL, var74);
                    module0144.$g1752$.bind((SubLObject)module0603.NIL, var74);
                    module0271.$g2560$.bind((SubLObject)module0603.NIL, var74);
                    module0271.$g2561$.bind((SubLObject)module0603.NIL, var74);
                    module0271.$g2563$.bind((SubLObject)module0603.NIL, var74);
                    module0146.$g2055$.bind((SubLObject)module0603.NIL, var74);
                    module0144.$g1771$.bind((SubLObject)module0603.NIL, var74);
                    module0144.$g1769$.bind((SubLObject)module0603.NIL, var74);
                    module0152.$g2107$.bind((SubLObject)module0603.NIL, var74);
                    module0110.$g1374$.bind((SubLObject)module0603.T, var74);
                    var75 = module0538.f33349(var68, var27, var69, var70);
                }
                finally {
                    module0110.$g1374$.rebind(var86, var74);
                    module0152.$g2107$.rebind(var85, var74);
                    module0144.$g1769$.rebind(var84, var74);
                    module0144.$g1771$.rebind(var83, var74);
                    module0146.$g2055$.rebind(var82, var74);
                    module0271.$g2563$.rebind(var81, var74);
                    module0271.$g2561$.rebind(var80, var74);
                    module0271.$g2560$.rebind(var79, var74);
                    module0144.$g1752$.rebind(var78, var74);
                    module0271.$g2562$.rebind(var6_76, var74);
                    module0018.$g696$.rebind(var5_75, var74);
                }
            }
        }
        finally {
            module0110.$g1374$.rebind(var77, var74);
            module0131.$g1531$.rebind(var76, var74);
        }
        return var75;
    }
    
    public static SubLObject f36869(final SubLObject var13) {
        if (module0603.NIL != module0259.f16854(module0178.f11335(var13), module0603.$ic47$, module0178.f11287(var13), (SubLObject)module0603.UNPROVIDED)) {
            module0731.f44777();
        }
        return (SubLObject)module0603.$ic48$;
    }
    
    public static SubLObject f36870(final SubLObject var84) {
        return module0656.f39943(var84, (SubLObject)module0603.UNPROVIDED);
    }
    
    public static SubLObject f36871(final SubLObject var84) {
        return f36870(var84);
    }
    
    public static SubLObject f36872(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        final SubLObject var87 = module0075.f5235(var85);
        SubLObject var88 = (SubLObject)module0603.NIL;
        SubLObject var89 = var87;
        SubLObject var90 = (SubLObject)module0603.NIL;
        var90 = var89.first();
        while (module0603.NIL != var89) {
            final SubLObject var91 = f36871(var90);
            if (module0603.NIL != var91) {
                var88 = (SubLObject)ConsesLow.cons(var91, var88);
            }
            else {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var86), (SubLObject)module0603.$ic49$, var90);
            }
            var89 = var89.rest();
            var90 = var89.first();
        }
        return Sequences.nreverse(var88);
    }
    
    public static SubLObject f36873(final SubLObject var88, SubLObject var89, SubLObject var90, SubLObject var91) {
        if (var89 == module0603.UNPROVIDED) {
            var89 = (SubLObject)module0603.$ic50$;
        }
        if (var90 == module0603.UNPROVIDED) {
            var90 = (SubLObject)module0603.ZERO_INTEGER;
        }
        if (var91 == module0603.UNPROVIDED) {
            var91 = (SubLObject)module0603.NIL;
        }
        return reader.read_from_string_ignoring_errors(var88, (SubLObject)module0603.NIL, var89, var90, var91);
    }
    
    public static SubLObject f36874(final SubLObject var92) {
        return reader.read_from_string_ignoring_errors(module0038.f2933(var92), (SubLObject)module0603.NIL, (SubLObject)module0603.NIL, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED);
    }
    
    public static SubLObject f36875(final SubLObject var93) {
        assert module0603.NIL != Types.stringp(var93) : var93;
        SubLObject var94 = f36871(var93);
        if (module0603.NIL == module0173.f10955(var94)) {
            module0285.f18993(f36874(var93), (SubLObject)module0603.UNPROVIDED);
            var94 = f36871(var93);
        }
        return var94;
    }
    
    public static SubLObject f36876(final SubLObject var58, SubLObject var95) {
        if (var95 == module0603.UNPROVIDED) {
            var95 = module0603.$ic51$;
        }
        assert module0603.NIL != module0128.f8463(var95, (SubLObject)module0603.UNPROVIDED) : var95;
        SubLObject var96 = module0166.f10737(var58);
        if (module0603.NIL == module0128.f8463(var96, (SubLObject)module0603.UNPROVIDED)) {
            var96 = var95;
        }
        return var96;
    }
    
    public static SubLObject f36877(final SubLObject var97) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL != module0202.f12589(var97, module0603.$ic53$) || module0603.NIL != module0202.f12589(var97, module0603.$ic54$));
    }
    
    public static SubLObject f36878(final SubLObject var97) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0603.NIL != module0202.f12589(module0205.f13144(var97), module0603.$ic53$) || module0603.NIL != module0202.f12589(module0205.f13144(var97), module0603.$ic54$));
    }
    
    public static SubLObject f36879(final SubLObject var98) {
        final SubLObject var99 = var98.isString() ? Sequences.cconcatenate((SubLObject)module0603.$ic56$, new SubLObject[] { var98, module0603.$ic56$ }) : var98;
        final SubLObject var100 = module0205.f13144(var98);
        SubLObject var101 = (SubLObject)module0603.NIL;
        if (var99.isNumber() || var99.isString()) {
            var101 = (SubLObject)ConsesLow.cons(module0038.f2624(var99), var101);
        }
        else {
            var101 = (SubLObject)ConsesLow.cons(module0770.f49049(var98, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED, (SubLObject)module0603.UNPROVIDED), var101);
        }
        var101 = (SubLObject)ConsesLow.cons(module0213.f13918(var100), var101);
        var101 = (SubLObject)ConsesLow.cons(var100, var101);
        return var101;
    }
    
    public static SubLObject f36880(final SubLObject var101) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        SubLObject var103 = (SubLObject)module0603.NIL;
        final SubLObject var104 = module0580.$g4361$.currentBinding(var102);
        try {
            module0580.$g4361$.bind((SubLObject)module0603.NIL, var102);
            var102.resetMultipleValues();
            final SubLObject var5_102 = module0580.$g4362$.currentBinding(var102);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var102);
                final SubLObject var105 = var102.secondMultipleValue();
                var102.resetMultipleValues();
                try {
                    var102.resetMultipleValues();
                    final SubLObject var5_103 = module0580.$g4358$.currentBinding(var102);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var102);
                        final SubLObject var106 = var102.secondMultipleValue();
                        var102.resetMultipleValues();
                        final SubLObject var5_104 = module0580.$g4359$.currentBinding(var102);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var102);
                            final SubLObject var107 = module0580.$g4358$.getDynamicValue(var102);
                            final SubLObject var5_105 = module0034.$g879$.currentBinding(var102);
                            try {
                                module0034.$g879$.bind(var107, var102);
                                SubLObject var108 = (SubLObject)module0603.NIL;
                                if (module0603.NIL != var107 && module0603.NIL == module0034.f1842(var107)) {
                                    var108 = module0034.f1869(var107);
                                    final SubLObject var109 = Threads.current_process();
                                    if (module0603.NIL == var108) {
                                        module0034.f1873(var107, var109);
                                    }
                                    else if (!var108.eql(var109)) {
                                        Errors.error((SubLObject)module0603.$ic58$);
                                    }
                                }
                                try {
                                    var103 = Mapping.mapcar((SubLObject)module0603.$ic55$, var101);
                                }
                                finally {
                                    final SubLObject var5_106 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0603.T, var102);
                                        if (module0603.NIL != var107 && module0603.NIL == var108) {
                                            module0034.f1873(var107, (SubLObject)module0603.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var5_106, var102);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var5_105, var102);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var5_104, var102);
                        }
                        if (var106 == module0603.$ic59$ && module0603.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var102))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var102));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var5_103, var102);
                    }
                }
                finally {
                    final SubLObject var5_107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0603.T, var102);
                        if (module0603.NIL == var105) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var102));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var5_107, var102);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var5_102, var102);
            }
        }
        finally {
            module0580.$g4361$.rebind(var104, var102);
        }
        return var103;
    }
    
    public static SubLObject f36881(final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = f36879(var98);
        final SubLObject var101 = module0601.$g4652$.currentBinding(var99);
        final SubLObject var102 = module0601.$g4654$.currentBinding(var99);
        try {
            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var99), module0601.$g4652$.getDynamicValue(var99)), var99);
            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var99), var99);
            module0601.f36758((SubLObject)module0603.$ic61$, (SubLObject)ConsesLow.list((SubLObject)module0603.$ic62$, conses_high.third(var100), (SubLObject)module0603.$ic63$, module0038.f2624(var100.first()), (SubLObject)module0603.$ic64$, Sequences.cconcatenate((SubLObject)module0603.$ic65$, module0589.f35898(conses_high.second(var100), (SubLObject)module0603.T))), (SubLObject)module0603.T, (SubLObject)module0603.NIL);
        }
        finally {
            module0601.$g4654$.rebind(var102, var99);
            module0601.$g4652$.rebind(var101, var99);
        }
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36882() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36837", "S#40637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36838", "S#40638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36839", "S#40639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36840", "S#40640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36841", "S#40641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36842", "S#40642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36843", "S#40643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36844", "S#40644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36845", "S#40645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36846", "S#40646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36847", "S#40647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36848", "S#40648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36849", "S#40649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36850", "S#40650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36851", "S#40651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36852", "S#40652", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36853", "S#39059", 1, 0, false);
        new $f36853$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36854", "S#40653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36855", "S#40654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36856", "S#40655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36857", "S#40656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36858", "S#16700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36859", "S#40657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36860", "S#40658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36861", "S#16701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36862", "S#40659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36863", "S#40660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36864", "S#40661", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36865", "S#40662", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36866", "S#40663", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36867", "S#40664", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36868", "S#40665", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36869", "S#19272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36870", "S#40666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36871", "FORT-FOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36872", "S#40667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36873", "S#40668", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36874", "S#40669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36875", "S#40670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36876", "S#40671", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36877", "S#39903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36878", "S#40672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36879", "GET-CYC-TERM-EXTERNAL-IDENTIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36880", "GET-CYC-TERM-EXTERNAL-IDENITIFIERS-FOR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0603", "f36881", "SERIALIZE-EXTERNAL-XML-TAG-FOR-CYCL-TERM", 1, 0, false);
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36883() {
        module0603.$g4665$ = SubLFiles.deflexical("S#40673", Vectors.make_vector((SubLObject)module0603.$ic13$, (SubLObject)module0603.NIL));
        module0603.$g4666$ = SubLFiles.defparameter("S#40674", (SubLObject)module0603.NIL);
        return (SubLObject)module0603.NIL;
    }
    
    public static SubLObject f36884() {
        Structures.register_method(module0603.$g4665$.getGlobalValue(), module0128.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0603.$ic16$));
        Structures.register_method(module0603.$g4665$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0603.$ic17$));
        Structures.register_method(module0603.$g4665$.getGlobalValue(), module0193.$g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0603.$ic20$));
        Structures.register_method(module0603.$g4665$.getGlobalValue(), module0174.$g2194$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0603.$ic22$));
        Structures.register_method(module0603.$g4665$.getGlobalValue(), module0184.$g2229$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0603.$ic24$));
        f36850((SubLObject)module0603.$ic15$, (SubLObject)module0603.$ic26$);
        f36850((SubLObject)module0603.$ic18$, (SubLObject)module0603.$ic27$);
        f36850((SubLObject)module0603.$ic19$, (SubLObject)module0603.$ic28$);
        f36850((SubLObject)module0603.$ic21$, (SubLObject)module0603.$ic29$);
        f36850((SubLObject)module0603.$ic23$, (SubLObject)module0603.$ic30$);
        module0002.f38((SubLObject)module0603.$ic55$);
        module0002.f38((SubLObject)module0603.$ic57$);
        module0002.f38((SubLObject)module0603.$ic60$);
        return (SubLObject)module0603.NIL;
    }
    
    public void declareFunctions() {
        f36882();
    }
    
    public void initializeVariables() {
        f36883();
    }
    
    public void runTopLevelForms() {
        f36884();
    }
    
    static {
        me = (SubLFile)new module0603();
        module0603.$g4665$ = null;
        module0603.$g4666$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic2$ = SubLObjectFactory.makeString("~%Collecting proprietary constants ... ");
        $ic3$ = SubLObjectFactory.makeString("~%  ~s ... ");
        $ic4$ = SubLObjectFactory.makeString("~s found.");
        $ic5$ = SubLObjectFactory.makeString("~%Preparing to kill ~s proprietary constants.  Go ahead? ");
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic7$ = SubLObjectFactory.makeString("~%~s terms killed.");
        $ic8$ = SubLObjectFactory.makeString("~%Done.");
        $ic9$ = SubLObjectFactory.makeString("~%Returning to Lisp Interactor.");
        $ic10$ = SubLObjectFactory.makeSymbol("S#127", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic12$ = SubLObjectFactory.makeSymbol("NART-P");
        $ic13$ = SubLObjectFactory.makeInteger(256);
        $ic14$ = SubLObjectFactory.makeString("~S is not a KB datastructure object");
        $ic15$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic16$ = SubLObjectFactory.makeSymbol("S#40643", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#40644", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("NART");
        $ic19$ = SubLObjectFactory.makeKeyword("VARIABLE");
        $ic20$ = SubLObjectFactory.makeSymbol("S#40646", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic22$ = SubLObjectFactory.makeSymbol("S#40647", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("DEDUCTION");
        $ic24$ = SubLObjectFactory.makeSymbol("S#40648", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic26$ = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $ic27$ = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $ic28$ = SubLObjectFactory.makeSymbol("FIND-VARIABLE-BY-ID");
        $ic29$ = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $ic30$ = SubLObjectFactory.makeSymbol("FIND-DEDUCTION-BY-ID");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P"));
        $ic32$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic33$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic34$ = SubLObjectFactory.makeSymbol("S#40656", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("MT");
        $ic36$ = SubLObjectFactory.makeKeyword("BROAD-MT");
        $ic37$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic38$ = SubLObjectFactory.makeString("do-broad-mt-index");
        $ic39$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic40$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic41$ = SubLObjectFactory.makeString("~a");
        $ic42$ = SubLObjectFactory.makeString("");
        $ic43$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic44$ = SubLObjectFactory.makeSymbol("S#16701", "CYC");
        $ic45$ = SubLObjectFactory.makeString("~s is not a microtheory.");
        $ic46$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpeechPart"));
        $ic48$ = SubLObjectFactory.makeKeyword("CHECKED");
        $ic49$ = SubLObjectFactory.makeString("~&'~a' does not refer to a valid term~%");
        $ic50$ = SubLObjectFactory.makeKeyword("EOF");
        $ic51$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DeadTerm"));
        $ic52$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic53$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $ic54$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $ic55$ = SubLObjectFactory.makeSymbol("GET-CYC-TERM-EXTERNAL-IDENTIFIERS");
        $ic56$ = SubLObjectFactory.makeString("\"");
        $ic57$ = SubLObjectFactory.makeSymbol("GET-CYC-TERM-EXTERNAL-IDENITIFIERS-FOR-LIST");
        $ic58$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic59$ = SubLObjectFactory.makeKeyword("NEW");
        $ic60$ = SubLObjectFactory.makeSymbol("SERIALIZE-EXTERNAL-XML-TAG-FOR-CYCL-TERM");
        $ic61$ = SubLObjectFactory.makeString("concept");
        $ic62$ = SubLObjectFactory.makeString("nl");
        $ic63$ = SubLObjectFactory.makeString("cycl");
        $ic64$ = SubLObjectFactory.makeString("uri");
        $ic65$ = SubLObjectFactory.makeString("urn:cyc:/cycapi/concept/");
    }
    
    public static final class $f36853$UnaryFunction extends UnaryFunction
    {
        public $f36853$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39059"));
        }
        
        public SubLObject processItem(final SubLObject var25) {
            return module0603.f36853(var25);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0603.class
	Total time: 532 ms
	
	Decompiled with Procyon 0.5.32.
*/