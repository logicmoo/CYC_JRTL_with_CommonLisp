package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0285 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0285";
    public static final String myFingerPrint = "103ccc0688d816c7b37589bc231d9e053aaa135a5e97e1f472cfb9f3c2505278";
    private static SubLSymbol $g2635$;
    private static SubLSymbol $g2636$;
    public static SubLSymbol $g2613$;
    private static SubLSymbol $g2637$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLList $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLFloat $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLInteger $ic107$;
    private static final SubLInteger $ic108$;
    private static final SubLFloat $ic109$;
    private static final SubLInteger $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    
    public static SubLObject f18867(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0202.f12590(var1) : var1;
        return f18868(var1, var2);
    }
    
    public static SubLObject f18869(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0202.f12590(var1) : var1;
        return f18870(var1, var2, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f18871(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var3 = (SubLObject)NIL;
        var3 = f18872(var1, var2, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL);
        return var3;
    }
    
    public static SubLObject f18873(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18874(var4, var2);
    }
    
    public static SubLObject f18875(SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0147.$g2095$.currentBinding(var6);
        try {
            module0147.$g2095$.bind(var2, var6);
            if (NIL != module0202.f12590(var5)) {
                var5 = module0202.f12763(var5);
            }
            final SubLObject var7_8 = module0146.$g2031$.currentBinding(var6);
            final SubLObject var8 = module0146.$g2003$.currentBinding(var6);
            try {
                module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var6);
                module0146.$g2003$.bind((SubLObject)NIL, var6);
                var5 = module0276.f18296(var5);
                if (NIL != module0146.$g2014$.getDynamicValue(var6)) {
                    var5 = f18876(var5, var2);
                }
                var5 = f18877(var5);
                var5 = f18878(var5, (SubLObject)makeBoolean(NIL == module0146.$g2010$.getDynamicValue(var6)));
            }
            finally {
                module0146.$g2003$.rebind(var8, var6);
                module0146.$g2031$.rebind(var7_8, var6);
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var6);
        }
        return var5;
    }
    
    public static SubLObject f18879(final SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18880(var5, var2);
    }
    
    public static SubLObject f18881(final SubLObject var5, final SubLObject var2) {
        return conses_high.copy_tree(f18875(var5, var2));
    }
    
    public static SubLObject f18880(final SubLObject var5, final SubLObject var2) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == var7) {
            return f18881(var5, var2);
        }
        var8 = module0034.f1857(var7, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
        if (NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)$ic10$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var7, (SubLObject)$ic10$, var8);
        }
        final SubLObject var9 = module0034.f1782(var5, var2);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)UNPROVIDED);
        if (var10 != $ic11$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var5.equal(var13.first())) {
                    var13 = var13.rest();
                    if (NIL != var13 && NIL == var13.rest() && var2.equal(var13.first())) {
                        return module0034.f1959(var14);
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18881(var5, var2)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var5, var2));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f18882(final SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0018.$g696$.currentBinding(var6);
        try {
            module0018.$g696$.bind((SubLObject)T, var6);
            var7 = f18875(var5, var2);
        }
        finally {
            module0018.$g696$.rebind(var8, var6);
        }
        return var7;
    }
    
    public static SubLObject f18883(final SubLObject var5) {
        final SubLObject var6 = f18875(var5, (SubLObject)UNPROVIDED);
        assert NIL != module0173.f10955(var6) : var6;
        return var6;
    }
    
    public static SubLObject f18884(final SubLObject var20, final SubLObject var2) {
        return f18885(var20, var2);
    }
    
    public static SubLObject f18886(final SubLObject var20, final SubLObject var2) {
        return f18887(var20, var2);
    }
    
    public static SubLObject f18888(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18872(var1, var2, (SubLObject)NIL, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18868(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18872(var4, var2, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18872(final SubLObject var4, SubLObject var2, SubLObject var21, SubLObject var22, SubLObject var23, SubLObject var24) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)T;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (NIL == module0152.$g2101$.getDynamicValue(var25) && NIL == module0146.$g1986$.getDynamicValue(var25)) {
            f18889();
        }
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)makeBoolean(NIL == var24);
        SubLObject var30 = (SubLObject)NIL;
        var2 = module0162.f10628(var2);
        if (NIL != var24 && NIL == var2) {
            var29 = (SubLObject)NIL;
        }
        final SubLObject var31 = module0146.$g1986$.currentBinding(var25);
        final SubLObject var32 = module0146.$g2042$.currentBinding(var25);
        try {
            module0146.$g1986$.bind((SubLObject)T, var25);
            module0146.$g2042$.bind(module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var25);
            final SubLObject var33 = module0146.$g2042$.getDynamicValue(var25);
            final SubLObject var7_30 = module0034.$g879$.currentBinding(var25);
            try {
                module0034.$g879$.bind(var33, var25);
                SubLObject var34 = (SubLObject)NIL;
                if (NIL != var33 && NIL == module0034.f1842(var33)) {
                    var34 = module0034.f1869(var33);
                    final SubLObject var35 = Threads.current_process();
                    if (NIL == var34) {
                        module0034.f1873(var33, var35);
                    }
                    else if (!var34.eql(var35)) {
                        Errors.error((SubLObject)$ic13$);
                    }
                }
                try {
                    final SubLObject var36 = var2;
                    final SubLObject var7_31 = module0147.$g2094$.currentBinding(var25);
                    final SubLObject var9_35 = module0147.$g2095$.currentBinding(var25);
                    final SubLObject var37 = module0146.$g1992$.currentBinding(var25);
                    try {
                        module0147.$g2094$.bind(module0147.f9531(var36), var25);
                        module0147.$g2095$.bind(module0147.f9534(var36), var25);
                        module0146.$g1992$.bind((SubLObject)NIL, var25);
                        var30 = ((NIL != var22) ? var4 : module0202.f12763(var4));
                        final SubLObject var7_32 = module0146.$g2031$.currentBinding(var25);
                        final SubLObject var9_36 = module0146.$g2003$.currentBinding(var25);
                        try {
                            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var25);
                            module0146.$g2003$.bind((SubLObject)NIL, var25);
                            if (NIL != var24) {
                                final SubLObject var7_33 = module0271.$g2564$.currentBinding(var25);
                                final SubLObject var9_37 = module0271.$g2560$.currentBinding(var25);
                                try {
                                    module0271.$g2564$.bind(f18890(), var25);
                                    module0271.$g2560$.bind(f18891((SubLObject)UNPROVIDED), var25);
                                    var29 = f18892(var4, module0147.$g2095$.getDynamicValue(var25));
                                    if (NIL == var29) {
                                        var25.resetMultipleValues();
                                        final SubLObject var38 = module0276.f18294(var30, Symbols.symbol_function((SubLObject)$ic14$), module0147.$g2095$.getDynamicValue(var25));
                                        final SubLObject var39 = var25.secondMultipleValue();
                                        var25.resetMultipleValues();
                                        if (NIL != var39) {
                                            var29 = (SubLObject)T;
                                            var30 = var38;
                                        }
                                    }
                                }
                                finally {
                                    module0271.$g2560$.rebind(var9_37, var25);
                                    module0271.$g2564$.rebind(var7_33, var25);
                                }
                            }
                            if (NIL != var29) {
                                var26 = var30;
                                SubLObject var40 = (SubLObject)NIL;
                                SubLObject var41 = (SubLObject)ZERO_INTEGER;
                                while (NIL == var40) {
                                    var25.resetMultipleValues();
                                    final SubLObject var45_46 = f18893(var26, var2, (SubLObject)$ic15$, var23);
                                    final SubLObject var47_48 = var25.secondMultipleValue();
                                    var25.resetMultipleValues();
                                    var26 = var45_46;
                                    var2 = var47_48;
                                    var26 = module0282.f18716(var26);
                                    var25.resetMultipleValues();
                                    final SubLObject var49_50 = f18894(var26, var2);
                                    final SubLObject var51_52 = var25.secondMultipleValue();
                                    var25.resetMultipleValues();
                                    var26 = var49_50;
                                    var2 = var51_52;
                                    if (var41.numGE(module0146.$g2029$.getDynamicValue(var25))) {
                                        var40 = (SubLObject)T;
                                    }
                                    else {
                                        var40 = f18895(var26, var23);
                                    }
                                    if (NIL == var40) {
                                        var26 = module0289.f19433(module0279.f18497(var26));
                                    }
                                    var41 = Numbers.add(var41, (SubLObject)ONE_INTEGER);
                                }
                                var27 = module0146.$g1992$.getDynamicValue(var25);
                                if (NIL != var21) {
                                    var28 = module0146.$g2003$.getDynamicValue(var25);
                                }
                            }
                        }
                        finally {
                            module0146.$g2003$.rebind(var9_36, var25);
                            module0146.$g2031$.rebind(var7_32, var25);
                        }
                    }
                    finally {
                        module0146.$g1992$.rebind(var37, var25);
                        module0147.$g2095$.rebind(var9_35, var25);
                        module0147.$g2094$.rebind(var7_31, var25);
                    }
                }
                finally {
                    final SubLObject var7_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                        if (NIL != var33 && NIL == var34) {
                            module0034.f1873(var33, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_34, var25);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_30, var25);
            }
        }
        finally {
            module0146.$g2042$.rebind(var32, var25);
            module0146.$g1986$.rebind(var31, var25);
        }
        if (NIL == var23) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != module0146.$g2070$.getDynamicValue(var25)) {
            f18896(var26);
        }
        return Values.values(var26, var27, var28, var2);
    }
    
    public static SubLObject f18896(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (NIL != module0205.f13145((SubLObject)$ic16$, var54, (SubLObject)T, (SubLObject)UNPROVIDED)) {
            final SubLObject var56 = module0146.$g2070$.currentBinding(var55);
            try {
                module0146.$g2070$.bind((SubLObject)NIL, var55);
                final SubLObject var57 = module0205.f13189(var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var58 = module0205.f13183(var54, (SubLObject)$ic20$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var59 = (SubLObject)NIL;
                var59 = var58.first();
                while (NIL != var58) {
                    if (NIL == module0288.f19338((SubLObject)ConsesLow.list($ic17$, var59), (SubLObject)UNPROVIDED)) {
                        SubLObject var60 = (SubLObject)NIL;
                        SubLObject var14_58 = var57;
                        SubLObject var61 = (SubLObject)NIL;
                        var61 = var14_58.first();
                        while (NIL != var14_58) {
                            if (!var61.eql(var59)) {
                                var60 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic18$, var59, var61), var60);
                            }
                            var14_58 = var14_58.rest();
                            var61 = var14_58.first();
                        }
                        var60 = module0276.f18287(var60, (SubLObject)UNPROVIDED);
                        module0540.f33517(var60, $ic19$, (SubLObject)UNPROVIDED);
                    }
                    var58 = var58.rest();
                    var59 = var58.first();
                }
            }
            finally {
                module0146.$g2070$.rebind(var56, var55);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18895(final SubLObject var54, final SubLObject var59) {
        if (NIL == var59) {
            return (SubLObject)T;
        }
        if (NIL != module0206.f13427(var54)) {
            return (SubLObject)T;
        }
        if (NIL != module0205.f13145((SubLObject)$ic21$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var60 = (SubLObject)ZERO_INTEGER;
        SubLObject var61 = (SubLObject)ZERO_INTEGER;
        SubLObject var62 = module0279.f18498(var54);
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            SubLObject var14_63 = module0232.f15306(var63);
            SubLObject var64 = (SubLObject)NIL;
            var64 = var14_63.first();
            while (NIL != var14_63) {
                final SubLObject var65 = module0279.f18578(var64, (SubLObject)UNPROVIDED);
                if (NIL != module0202.f12595(var65) || NIL != module0202.f12606(var65)) {
                    return (SubLObject)NIL;
                }
                if (NIL != module0202.f12883(var64, (SubLObject)UNPROVIDED) && NIL != module0161.f10484(module0202.f12906(var64))) {
                    var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER);
                }
                else {
                    var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                }
                var14_63 = var14_63.rest();
                var64 = var14_63.first();
            }
            SubLObject var14_64 = module0232.f15308(var63);
            var64 = (SubLObject)NIL;
            var64 = var14_64.first();
            while (NIL != var14_64) {
                final SubLObject var65 = module0279.f18578(var64, (SubLObject)UNPROVIDED);
                if (NIL != module0202.f12595(var65) || NIL != module0202.f12606(var65)) {
                    return (SubLObject)NIL;
                }
                if (NIL != module0202.f12883(var64, (SubLObject)UNPROVIDED) && NIL != module0161.f10484(module0202.f12906(var64))) {
                    var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER);
                }
                else {
                    var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                }
                var14_64 = var14_64.rest();
                var64 = var14_64.first();
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        if (var60.numGE((SubLObject)ONE_INTEGER) && var61.numE((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f18897(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f18872(var4, var2, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED);
        final SubLObject var7 = var5.secondMultipleValue();
        final SubLObject var8 = var5.thirdMultipleValue();
        final SubLObject var2_69 = var5.fourthMultipleValue();
        var5.resetMultipleValues();
        return Values.values(var6, var2_69);
    }
    
    public static SubLObject f18898(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18872(var1, var2, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18874(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var5 = (SubLObject)NIL;
        var5 = f18872(var4, var2, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        return var5;
    }
    
    public static SubLObject f18899(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return conses_high.copy_tree(f18900(var4, var2));
    }
    
    public static SubLObject f18901(final SubLObject var4, final SubLObject var2) {
        return f18874(var4, var2);
    }
    
    public static SubLObject f18900(final SubLObject var4, final SubLObject var2) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0034.$g879$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)NIL;
        if (NIL == var6) {
            return f18901(var4, var2);
        }
        var7 = module0034.f1857(var6, (SubLObject)$ic22$, (SubLObject)UNPROVIDED);
        if (NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)$ic22$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var6, (SubLObject)$ic22$, var7);
        }
        final SubLObject var8 = module0034.f1782(var4, var2);
        final SubLObject var9 = module0034.f1814(var7, var8, (SubLObject)UNPROVIDED);
        if (var9 != $ic11$) {
            SubLObject var10 = var9;
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL != var10) {
                SubLObject var12 = var11.first();
                final SubLObject var13 = conses_high.second(var11);
                if (var4.equal(var12.first())) {
                    var12 = var12.rest();
                    if (NIL != var12 && NIL == var12.rest() && var2.equal(var12.first())) {
                        return module0034.f1959(var13);
                    }
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        final SubLObject var14 = Values.arg2(var5.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18901(var4, var2)));
        module0034.f1836(var7, var8, var9, var14, (SubLObject)ConsesLow.list(var4, var2));
        return module0034.f1959(var14);
    }
    
    public static SubLObject f18902(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f18872(var4, var2, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL);
        final SubLObject var7 = var5.secondMultipleValue();
        final SubLObject var8 = var5.thirdMultipleValue();
        final SubLObject var2_70 = var5.fourthMultipleValue();
        var5.resetMultipleValues();
        return Values.values(var6, var2_70);
    }
    
    public static SubLObject f18903(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return conses_high.copy_tree(f18904(var4, var2));
    }
    
    public static SubLObject f18905(final SubLObject var4, final SubLObject var2) {
        return f18906(var4, var2);
    }
    
    public static SubLObject f18904(final SubLObject var4, final SubLObject var2) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0034.$g879$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)NIL;
        if (NIL == var6) {
            return f18905(var4, var2);
        }
        var7 = module0034.f1857(var6, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
        if (NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)$ic23$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var6, (SubLObject)$ic23$, var7);
        }
        final SubLObject var8 = module0034.f1782(var4, var2);
        final SubLObject var9 = module0034.f1814(var7, var8, (SubLObject)UNPROVIDED);
        if (var9 != $ic11$) {
            SubLObject var10 = var9;
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL != var10) {
                SubLObject var12 = var11.first();
                final SubLObject var13 = conses_high.second(var11);
                if (var4.equal(var12.first())) {
                    var12 = var12.rest();
                    if (NIL != var12 && NIL == var12.rest() && var2.equal(var12.first())) {
                        return module0034.f1959(var13);
                    }
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        final SubLObject var14 = Values.arg2(var5.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18905(var4, var2)));
        module0034.f1836(var7, var8, var9, var14, (SubLObject)ConsesLow.list(var4, var2));
        return module0034.f1959(var14);
    }
    
    public static SubLObject f18906(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g698$.currentBinding(var3);
        try {
            module0018.$g698$.bind((SubLObject)T, var3);
            var4 = f18907(f18870(var1, var2, (SubLObject)NIL, (SubLObject)T), var1);
        }
        finally {
            module0018.$g698$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18908(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g698$.currentBinding(var3);
        try {
            module0018.$g698$.bind((SubLObject)T, var3);
            var4 = f18875(var2, module0132.$g1548$.getGlobalValue());
            if (NIL != var4) {
                var4 = module0162.f10628(var4);
            }
        }
        finally {
            module0018.$g698$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18909(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0018.$g698$.currentBinding(var5);
        try {
            module0018.$g698$.bind((SubLObject)T, var5);
            var5.resetMultipleValues();
            final SubLObject var71_72 = f18910(var4, var2);
            final SubLObject var73_74 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            var6 = var71_72;
            var2 = var73_74;
            var6 = f18907(var6, var4);
        }
        finally {
            module0018.$g698$.rebind(var7, var5);
        }
        return Values.values(var6, var2);
    }
    
    public static SubLObject f18911(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g696$.currentBinding(var3);
        final SubLObject var6 = module0018.$g698$.currentBinding(var3);
        try {
            module0018.$g696$.bind((SubLObject)T, var3);
            module0018.$g698$.bind((SubLObject)NIL, var3);
            var4 = f18872(var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0018.$g698$.rebind(var6, var3);
            module0018.$g696$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18912(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0146.$g2070$.currentBinding(var3);
        try {
            module0146.$g2070$.bind((SubLObject)T, var3);
            var4 = f18911(var1, var2);
        }
        finally {
            module0146.$g2070$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18913(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g696$.currentBinding(var3);
        final SubLObject var6 = module0018.$g698$.currentBinding(var3);
        try {
            module0018.$g696$.bind((SubLObject)T, var3);
            module0018.$g698$.bind((SubLObject)NIL, var3);
            var4 = f18914(var2);
        }
        finally {
            module0018.$g698$.rebind(var6, var3);
            module0018.$g696$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18914(SubLObject var2) {
        var2 = f18875(var2, module0132.$g1548$.getGlobalValue());
        if (NIL != var2) {
            var2 = module0162.f10628(var2);
        }
        return var2;
    }
    
    public static SubLObject f18885(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0018.$g696$.currentBinding(var5);
        final SubLObject var8 = module0018.$g698$.currentBinding(var5);
        try {
            module0018.$g696$.bind((SubLObject)T, var5);
            module0018.$g698$.bind((SubLObject)NIL, var5);
            var5.resetMultipleValues();
            final SubLObject var75_76 = f18897(var4, var2);
            final SubLObject var77_78 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            var6 = var75_76;
            var2 = var77_78;
        }
        finally {
            module0018.$g698$.rebind(var8, var5);
            module0018.$g696$.rebind(var7, var5);
        }
        return Values.values(var6, var2);
    }
    
    public static SubLObject f18915(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0146.$g2070$.currentBinding(var5);
        try {
            module0146.$g2070$.bind((SubLObject)T, var5);
            var5.resetMultipleValues();
            final SubLObject var79_80 = f18885(var4, var2);
            final SubLObject var81_82 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            var6 = var79_80;
            var2 = var81_82;
        }
        finally {
            module0146.$g2070$.rebind(var7, var5);
        }
        return Values.values(var6, var2);
    }
    
    public static SubLObject f18887(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0018.$g696$.currentBinding(var5);
        final SubLObject var8 = module0018.$g698$.currentBinding(var5);
        try {
            module0018.$g696$.bind((SubLObject)T, var5);
            module0018.$g698$.bind((SubLObject)NIL, var5);
            var5.resetMultipleValues();
            final SubLObject var83_84 = f18902(var4, var2);
            final SubLObject var85_86 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            var6 = var83_84;
            var2 = var85_86;
        }
        finally {
            module0018.$g698$.rebind(var8, var5);
            module0018.$g696$.rebind(var7, var5);
        }
        return Values.values(var6, var2);
    }
    
    public static SubLObject f18916(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g697$.currentBinding(var3);
        try {
            module0018.$g697$.bind((SubLObject)T, var3);
            var4 = f18874(var1, var2);
        }
        finally {
            module0018.$g697$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18917(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0018.$g697$.currentBinding(var5);
        try {
            module0018.$g697$.bind((SubLObject)T, var5);
            var5.resetMultipleValues();
            final SubLObject var87_88 = f18902(var4, var2);
            final SubLObject var89_90 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            var6 = var87_88;
            var2 = var89_90;
        }
        finally {
            module0018.$g697$.rebind(var7, var5);
        }
        return Values.values(var6, var2);
    }
    
    public static SubLObject f18918(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18870(var1, var2, (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f18870(final SubLObject var1, SubLObject var2, SubLObject var22, SubLObject var23) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (NIL == module0152.$g2101$.getDynamicValue(var24) && NIL == module0146.$g1986$.getDynamicValue(var24)) {
            f18889();
        }
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        var2 = f18908(var2);
        final SubLObject var28 = module0146.$g1986$.currentBinding(var24);
        final SubLObject var29 = module0146.$g2042$.currentBinding(var24);
        try {
            module0146.$g1986$.bind((SubLObject)T, var24);
            module0146.$g2042$.bind(module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var24);
            final SubLObject var30 = module0146.$g2042$.getDynamicValue(var24);
            final SubLObject var7_91 = module0034.$g879$.currentBinding(var24);
            try {
                module0034.$g879$.bind(var30, var24);
                SubLObject var31 = (SubLObject)NIL;
                if (NIL != var30 && NIL == module0034.f1842(var30)) {
                    var31 = module0034.f1869(var30);
                    final SubLObject var32 = Threads.current_process();
                    if (NIL == var31) {
                        module0034.f1873(var30, var32);
                    }
                    else if (!var31.eql(var32)) {
                        Errors.error((SubLObject)$ic13$);
                    }
                }
                try {
                    final SubLObject var7_92 = module0018.$g699$.currentBinding(var24);
                    try {
                        module0018.$g699$.bind((SubLObject)T, var24);
                        final SubLObject var33 = var2;
                        final SubLObject var7_93 = module0147.$g2095$.currentBinding(var24);
                        final SubLObject var9_95 = module0147.$g2094$.currentBinding(var24);
                        final SubLObject var34 = module0147.$g2096$.currentBinding(var24);
                        final SubLObject var35 = module0018.$g696$.currentBinding(var24);
                        final SubLObject var36 = module0271.$g2562$.currentBinding(var24);
                        final SubLObject var37 = module0144.$g1752$.currentBinding(var24);
                        final SubLObject var38 = module0271.$g2560$.currentBinding(var24);
                        final SubLObject var39 = module0271.$g2561$.currentBinding(var24);
                        final SubLObject var40 = module0271.$g2563$.currentBinding(var24);
                        final SubLObject var41 = module0146.$g2055$.currentBinding(var24);
                        final SubLObject var42 = module0144.$g1771$.currentBinding(var24);
                        final SubLObject var43 = module0144.$g1769$.currentBinding(var24);
                        final SubLObject var44 = module0152.$g2107$.currentBinding(var24);
                        final SubLObject var45 = module0110.$g1374$.currentBinding(var24);
                        final SubLObject var46 = module0146.$g1992$.currentBinding(var24);
                        final SubLObject var47 = module0146.$g2031$.currentBinding(var24);
                        final SubLObject var48 = module0146.$g2003$.currentBinding(var24);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var33), var24);
                            module0147.$g2094$.bind(module0147.f9546(var33), var24);
                            module0147.$g2096$.bind(module0147.f9549(var33), var24);
                            module0018.$g696$.bind((SubLObject)NIL, var24);
                            module0271.$g2562$.bind((SubLObject)NIL, var24);
                            module0144.$g1752$.bind((SubLObject)NIL, var24);
                            module0271.$g2560$.bind((SubLObject)NIL, var24);
                            module0271.$g2561$.bind((SubLObject)NIL, var24);
                            module0271.$g2563$.bind((SubLObject)NIL, var24);
                            module0146.$g2055$.bind((SubLObject)NIL, var24);
                            module0144.$g1771$.bind((SubLObject)NIL, var24);
                            module0144.$g1769$.bind((SubLObject)NIL, var24);
                            module0152.$g2107$.bind((SubLObject)NIL, var24);
                            module0110.$g1374$.bind((SubLObject)T, var24);
                            module0146.$g1992$.bind((SubLObject)NIL, var24);
                            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var24);
                            module0146.$g2003$.bind((SubLObject)NIL, var24);
                            SubLObject var49 = module0274.f18101(var1, (SubLObject)UNPROVIDED);
                            var27 = ((NIL != var22) ? var1 : module0202.f12763(var1));
                            if (NIL == var49) {
                                var24.resetMultipleValues();
                                final SubLObject var50 = module0276.f18294(var27, Symbols.symbol_function((SubLObject)$ic24$), (SubLObject)UNPROVIDED);
                                final SubLObject var51 = var24.secondMultipleValue();
                                var24.resetMultipleValues();
                                if (NIL != var51) {
                                    var49 = (SubLObject)T;
                                    var27 = var50;
                                }
                            }
                            if (NIL != var49) {
                                var25 = var27;
                                SubLObject var52 = (SubLObject)NIL;
                                SubLObject var53 = (SubLObject)ZERO_INTEGER;
                                while (NIL == var52) {
                                    var24.resetMultipleValues();
                                    final SubLObject var110_111 = f18893(var25, var2, (SubLObject)$ic25$, var23);
                                    final SubLObject var112_113 = var24.secondMultipleValue();
                                    var24.resetMultipleValues();
                                    var25 = var110_111;
                                    var2 = var112_113;
                                    var25 = module0282.f18727(var25);
                                    var24.resetMultipleValues();
                                    final SubLObject var114_115 = f18919(var25, var2);
                                    final SubLObject var116_117 = var24.secondMultipleValue();
                                    var24.resetMultipleValues();
                                    var25 = var114_115;
                                    var2 = var116_117;
                                    if (var53.numGE(module0146.$g2029$.getDynamicValue(var24))) {
                                        var52 = (SubLObject)T;
                                    }
                                    else {
                                        var52 = f18895(var25, var23);
                                    }
                                    if (NIL == var52) {
                                        var25 = module0289.f19434(module0279.f18497(var25));
                                    }
                                    var53 = Numbers.add(var53, (SubLObject)ONE_INTEGER);
                                }
                                var26 = module0146.$g1992$.getDynamicValue(var24);
                            }
                        }
                        finally {
                            module0146.$g2003$.rebind(var48, var24);
                            module0146.$g2031$.rebind(var47, var24);
                            module0146.$g1992$.rebind(var46, var24);
                            module0110.$g1374$.rebind(var45, var24);
                            module0152.$g2107$.rebind(var44, var24);
                            module0144.$g1769$.rebind(var43, var24);
                            module0144.$g1771$.rebind(var42, var24);
                            module0146.$g2055$.rebind(var41, var24);
                            module0271.$g2563$.rebind(var40, var24);
                            module0271.$g2561$.rebind(var39, var24);
                            module0271.$g2560$.rebind(var38, var24);
                            module0144.$g1752$.rebind(var37, var24);
                            module0271.$g2562$.rebind(var36, var24);
                            module0018.$g696$.rebind(var35, var24);
                            module0147.$g2096$.rebind(var34, var24);
                            module0147.$g2094$.rebind(var9_95, var24);
                            module0147.$g2095$.rebind(var7_93, var24);
                        }
                    }
                    finally {
                        module0018.$g699$.rebind(var7_92, var24);
                    }
                }
                finally {
                    final SubLObject var7_94 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var24);
                        if (NIL != var30 && NIL == var31) {
                            module0034.f1873(var30, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_94, var24);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var7_91, var24);
            }
        }
        finally {
            module0146.$g2042$.rebind(var29, var24);
            module0146.$g1986$.rebind(var28, var24);
        }
        if (NIL == var23) {
            var2 = (SubLObject)NIL;
        }
        return Values.values(var25, var26, var2);
    }
    
    public static SubLObject f18910(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f18870(var4, var2, (SubLObject)NIL, (SubLObject)T);
        final SubLObject var7 = var5.secondMultipleValue();
        final SubLObject var2_119 = var5.thirdMultipleValue();
        var5.resetMultipleValues();
        return Values.values(var6, var2_119);
    }
    
    public static SubLObject f18920(final SubLObject var120, SubLObject var2, SubLObject var22) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13576(var120, (SubLObject)UNPROVIDED)) {
            return Values.values(f18875(var120, var2), (SubLObject)NIL);
        }
        if (NIL == module0201.f12580(var120) && NIL != module0206.f13425(var120)) {
            final SubLObject var121 = f18872(var120, var2, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return Values.values(var121, module0279.f18495(var121));
        }
        return Values.values(var120, (SubLObject)NIL);
    }
    
    public static SubLObject f18893(SubLObject var4, SubLObject var2, final SubLObject var121, final SubLObject var23) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        if (NIL != var23) {
            var122.resetMultipleValues();
            final SubLObject var122_123 = module0279.f18581(var4, var2);
            final SubLObject var124_125 = var122.secondMultipleValue();
            var122.resetMultipleValues();
            var4 = var122_123;
            var2 = var124_125;
        }
        SubLObject var123 = (SubLObject)NIL;
        while (NIL == var123) {
            var4 = module0276.f18296(var4);
            if (var121.eql((SubLObject)$ic15$)) {
                var122.resetMultipleValues();
                final SubLObject var128_129 = module0282.f18737(var4, var2);
                final SubLObject var130_131 = var122.secondMultipleValue();
                var122.resetMultipleValues();
                var4 = var128_129;
                var2 = var130_131;
            }
            else if (var121.eql((SubLObject)$ic25$)) {
                var122.resetMultipleValues();
                final SubLObject var132_133 = module0282.f18740(var4, var2);
                final SubLObject var134_135 = var122.secondMultipleValue();
                var122.resetMultipleValues();
                var4 = var132_133;
                var2 = var134_135;
            }
            else {
                Errors.error((SubLObject)$ic26$, var121);
            }
            if (NIL == var23) {
                var123 = (SubLObject)T;
            }
            else {
                var122.resetMultipleValues();
                final SubLObject var124 = module0279.f18581(var4, var2);
                final SubLObject var125 = var122.secondMultipleValue();
                var122.resetMultipleValues();
                if (var4.eql(var124) && var2.eql(var125)) {
                    var123 = (SubLObject)T;
                }
                else {
                    var4 = var124;
                    var2 = module0162.f10628(var125);
                }
            }
        }
        var2 = module0162.f10628(var2);
        return Values.values(var4, var2);
    }
    
    public static SubLObject f18907(final SubLObject var138, final SubLObject var139) {
        if (var138.isCons() && NIL != module0202.f12590(var139)) {
            SubLObject var140 = var138;
            SubLObject var141 = (SubLObject)NIL;
            var141 = var140.first();
            while (NIL != var140) {
                final SubLObject var142 = conses_high.third(var141);
                final SubLObject var143 = module0202.f12942(var139, (SubLObject)UNPROVIDED);
                final SubLObject var144 = module0035.f2220(var142, var143, (SubLObject)UNPROVIDED);
                if (NIL != var144) {
                    final SubLObject var145 = module0035.f2220(var142, var144, (SubLObject)UNPROVIDED);
                    module0035.f2044((SubLObject)TWO_INTEGER, var145, var141);
                }
                var140 = var140.rest();
                var141 = var140.first();
            }
        }
        return var138;
    }
    
    public static SubLObject f18889() {
        module0282.f18750();
        module0288.f19356();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18892(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0152.$g2131$.currentBinding(var3);
        try {
            module0152.$g2131$.bind((SubLObject)NIL, var3);
            if (NIL != module0146.$g2050$.getDynamicValue(var3)) {
                var4 = module0274.f18101(var1, (SubLObject)UNPROVIDED);
            }
            else {
                var4 = (SubLObject)makeBoolean((NIL != module0152.f9721() && NIL != module0274.f18077(var1, var2, (SubLObject)UNPROVIDED)) || NIL != module0274.f18060(var1, var2, (SubLObject)UNPROVIDED));
            }
        }
        finally {
            module0152.$g2131$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18890() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0271.$g2564$.getDynamicValue(var6);
    }
    
    public static SubLObject f18891(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != f18921(var2)) ? NIL : makeBoolean(NIL != module0146.$g1988$.getDynamicValue(var3) || (NIL != module0271.$g2560$.getDynamicValue(var3) && NIL != module0018.$g696$.getDynamicValue(var3))));
    }
    
    public static SubLObject f18922(SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (NIL != module0146.$g2021$.getDynamicValue(var146)) {
            var145 = f18923(var145);
            var145 = f18924(var145);
            var145 = f18925(var145);
            var145 = f18926(var145);
            var145 = f18927(var145);
            var145 = f18925(var145);
        }
        return var145;
    }
    
    public static SubLObject f18923(final SubLObject var145) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)$ic27$), var145);
    }
    
    public static SubLObject f18928(final SubLObject var62) {
        return module0232.f15326(f18929(module0232.f15306(var62)), f18929(module0232.f15308(var62)));
    }
    
    public static SubLObject f18929(final SubLObject var147) {
        SubLObject var148 = (SubLObject)NIL;
        SubLObject var149 = Sequences.reverse(var147);
        SubLObject var150 = (SubLObject)NIL;
        var150 = var149.first();
        while (NIL != var149) {
            var148 = (SubLObject)ConsesLow.cons(f18930(var150), var148);
            var149 = var149.rest();
            var150 = var149.first();
        }
        return var148;
    }
    
    public static SubLObject f18930(final SubLObject var148) {
        SubLObject var149 = var148;
        final SubLObject var150 = module0035.f2439(Symbols.symbol_function((SubLObject)$ic28$), var149, (SubLObject)UNPROVIDED);
        SubLObject var151 = (SubLObject)NIL;
        if (NIL != var150 && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic29$), var150, (SubLObject)UNPROVIDED)) {
            var151 = module0205.f13203(var150, (SubLObject)UNPROVIDED);
            var149 = f18930(conses_high.subst(var151, var150, var149, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        final SubLObject var152 = module0035.f2439(Symbols.symbol_function((SubLObject)$ic30$), var149, (SubLObject)UNPROVIDED);
        SubLObject var153 = (SubLObject)NIL;
        if (NIL != var152) {
            var153 = (SubLObject)ConsesLow.list($ic31$, (SubLObject)ConsesLow.list($ic32$, module0205.f13203(var152, (SubLObject)UNPROVIDED)));
            var149 = f18930(conses_high.subst(var153, var152, var149, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var149;
    }
    
    public static SubLObject f18931(final SubLObject var5, SubLObject var153) {
        if (var153 == UNPROVIDED) {
            var153 = (SubLObject)NIL;
        }
        final SubLThread var154 = SubLProcess.currentSubLThread();
        SubLObject var155 = (SubLObject)NIL;
        var155 = f18930(var5);
        if (NIL != var155 && NIL != var153) {
            var155 = f18932(var155, (SubLObject)UNPROVIDED).first();
            if (NIL != var155 && module0205.f13132(var155).eql($ic31$)) {
                final SubLObject var156 = module0206.$g2330$.currentBinding(var154);
                try {
                    module0206.$g2330$.bind((SubLObject)T, var154);
                    var155 = module0205.f13147(var155, Symbols.symbol_function((SubLObject)$ic33$), Symbols.symbol_function((SubLObject)$ic34$), (SubLObject)NIL, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0206.$g2330$.rebind(var156, var154);
                }
            }
        }
        return var155;
    }
    
    public static SubLObject f18933(final SubLObject var5, SubLObject var153) {
        if (var153 == UNPROVIDED) {
            var153 = (SubLObject)NIL;
        }
        if (NIL == module0206.f13467(var5)) {
            return var5;
        }
        final SubLObject var154 = f18931(var5, var153);
        if (NIL != var154) {
            return module0205.f13203(var154, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18924(final SubLObject var145) {
        if (NIL != f18934()) {
            return var145;
        }
        return module0035.f2076(Symbols.symbol_function((SubLObject)$ic35$), var145);
    }
    
    public static SubLObject f18934() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == module0146.$g2015$.getDynamicValue(var6) && NIL == module0146.$g2014$.getDynamicValue(var6));
    }
    
    public static SubLObject f18935(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = $g2635$.currentBinding(var63);
        try {
            $g2635$.bind((SubLObject)$ic36$, var63);
            var64 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic37$), module0232.f15306(var62));
        }
        finally {
            $g2635$.rebind(var66, var63);
        }
        var66 = $g2635$.currentBinding(var63);
        try {
            $g2635$.bind((SubLObject)$ic38$, var63);
            var65 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic37$), module0232.f15308(var62));
        }
        finally {
            $g2635$.rebind(var66, var63);
        }
        var63.resetMultipleValues();
        final SubLObject var158_159 = f18936(var64, var65);
        final SubLObject var160_161 = var63.secondMultipleValue();
        var63.resetMultipleValues();
        var64 = var158_159;
        var65 = var160_161;
        return module0232.f15305(var64, var65);
    }
    
    public static SubLObject f18936(SubLObject var156, SubLObject var157) {
        if (NIL != module0035.f2369((SubLObject)$ic39$, var156, (SubLObject)UNPROVIDED) || NIL != module0035.f2369((SubLObject)$ic39$, var157, (SubLObject)UNPROVIDED)) {
            SubLObject var158 = (SubLObject)NIL;
            SubLObject var159 = (SubLObject)NIL;
            SubLObject var160 = var157;
            SubLObject var161 = (SubLObject)NIL;
            var161 = var160.first();
            while (NIL != var160) {
                if (NIL != module0202.f12592(var161)) {
                    var158 = (SubLObject)ConsesLow.cons(module0205.f13338(var161), var158);
                }
                else {
                    var159 = (SubLObject)ConsesLow.cons(var161, var159);
                }
                var160 = var160.rest();
                var161 = var160.first();
            }
            var160 = var156;
            SubLObject var162 = (SubLObject)NIL;
            var162 = var160.first();
            while (NIL != var160) {
                if (NIL != module0202.f12592(var162)) {
                    var159 = (SubLObject)ConsesLow.cons(module0205.f13338(var162), var159);
                }
                else {
                    var158 = (SubLObject)ConsesLow.cons(var162, var158);
                }
                var160 = var160.rest();
                var162 = var160.first();
            }
            var156 = Sequences.nreverse(var158);
            var157 = Sequences.nreverse(var159);
        }
        return Values.values(var156, var157);
    }
    
    public static SubLObject f18937(SubLObject var148, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        if (NIL != module0146.$g2015$.getDynamicValue(var149)) {
            var149.resetMultipleValues();
            final SubLObject var150 = module0279.f18578(var148, var2);
            final SubLObject var151 = var149.secondMultipleValue();
            var149.resetMultipleValues();
            if (NIL != module0206.f13489(var150)) {
                final SubLObject var152 = $g2635$.getDynamicValue(var149);
                var149.resetMultipleValues();
                final SubLObject var153 = module0162.f10633(var150, var152, var151);
                final SubLObject var154 = var149.secondMultipleValue();
                var149.resetMultipleValues();
                if (NIL != module0161.f10514(var154, var2)) {
                    var148 = var153;
                }
                else {
                    var148 = module0202.f12782(var154, var153);
                }
                if (var152 == $ic36$) {
                    var148 = module0205.f13338(var148);
                }
            }
        }
        if (NIL != module0146.$g2014$.getDynamicValue(var149)) {
            return f18876(var148, var2);
        }
        return var148;
    }
    
    public static SubLObject f18938(final SubLObject var172, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18876(var172, var2);
    }
    
    public static SubLObject f18876(final SubLObject var173, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12932(var173)) {
            module0202.f12747((SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var173, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var173;
        }
        if (NIL != module0202.f12639(var173)) {
            return var173;
        }
        final SubLObject var175 = module0202.f12707(var173, (SubLObject)UNPROVIDED);
        final SubLObject var173_176 = (NIL != var175) ? module0202.f12712(var173) : var173;
        SubLObject var176 = (SubLObject)NIL;
        final SubLObject var177 = module0205.f13132(var173_176);
        SubLObject var178 = (SubLObject)ZERO_INTEGER;
        SubLObject var179 = module0205.f13180(var173_176, (SubLObject)UNPROVIDED);
        SubLObject var180 = (SubLObject)NIL;
        var180 = var179.first();
        while (NIL != var179) {
            final SubLObject var181 = module0152.$g2120$.currentBinding(var174);
            try {
                module0152.$g2120$.bind(module0279.f18444(var177, var178, (SubLObject)UNPROVIDED), var174);
                if (NIL != module0279.f18515(var180)) {
                    var176 = (SubLObject)ConsesLow.cons(var180, var176);
                }
                else if (NIL != module0155.f9776(var180, (SubLObject)UNPROVIDED)) {
                    var176 = (SubLObject)ConsesLow.cons(f18938(var180, var2), var176);
                }
                else if (NIL != module0210.f13606(var180, (SubLObject)UNPROVIDED)) {
                    var176 = (SubLObject)ConsesLow.cons(module0289.f19436(var180, var2), var176);
                }
                else if (NIL != module0202.f12937(var180)) {
                    var176 = (SubLObject)ConsesLow.cons(f18937(var180, var2), var176);
                }
                else {
                    var176 = (SubLObject)ConsesLow.cons(var180, var176);
                }
            }
            finally {
                module0152.$g2120$.rebind(var181, var174);
            }
            var178 = Numbers.add(var178, (SubLObject)ONE_INTEGER);
            var179 = var179.rest();
            var180 = var179.first();
        }
        var176 = Sequences.nreverse(var176);
        if (NIL != var175) {
            return module0202.f12711(var175, var176);
        }
        return var176;
    }
    
    public static SubLObject f18925(final SubLObject var145) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)$ic41$), var145);
    }
    
    public static SubLObject f18939(final SubLObject var62) {
        return f18940(module0202.f12765(var62));
    }
    
    public static SubLObject f18940(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if ((NIL == module0146.$g2000$.getDynamicValue(var63) && NIL != module0204.f13083(var62)) || NIL != f18941(var62)) {
            return var62;
        }
        return module0232.f15326(f18942(module0232.f15306(var62)), f18942(module0232.f15308(var62)));
    }
    
    public static SubLObject f18941(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0204.f13044(var62) && NIL != conses_high.member(module0205.f13136(module0204.f13047(var62)), $g2636$.getDynamicValue(var63), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0202.f12665(module0204.f13047(var62)));
    }
    
    public static SubLObject f18942(final SubLObject var147) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)$ic43$), var147);
    }
    
    public static SubLObject f18943(final SubLObject var148) {
        return f18944(module0202.f12763(var148));
    }
    
    public static SubLObject f18944(final SubLObject var148) {
        final SubLObject var149 = module0202.f12707(var148, (SubLObject)UNPROVIDED);
        final SubLObject var148_179 = (NIL != var149) ? module0202.f12712(var148) : var148;
        SubLObject var150 = (SubLObject)NIL;
        final SubLObject var151 = module0202.f12832(var148_179, (SubLObject)UNPROVIDED);
        final SubLObject var152 = module0279.f18446(var151, (SubLObject)UNPROVIDED);
        final SubLObject var153 = f18945(module0202.f12829(var148_179, (SubLObject)UNPROVIDED), var152);
        if (NIL != module0269.f17760(var151)) {
            var150 = module0202.f12767(var151, f18946(var153), (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0269.f17781(var151)) {
            var150 = module0202.f12767(var151, f18947(var151, var153, Symbols.symbol_function((SubLObject)$ic44$)), (SubLObject)UNPROVIDED);
        }
        else {
            var150 = module0202.f12767(var151, var153, (SubLObject)UNPROVIDED);
        }
        if (NIL != var149) {
            return module0202.f12711(var149, var150);
        }
        return var150;
    }
    
    public static SubLObject f18948(final SubLObject var183) {
        final SubLObject var184 = module0202.f12763(var183);
        final SubLObject var185 = module0202.f12707(var184, (SubLObject)UNPROVIDED);
        final SubLObject var186 = var184;
        final SubLObject var148_184 = (NIL != var185) ? module0202.f12712(var186) : var186;
        SubLObject var187 = (SubLObject)NIL;
        final SubLObject var188 = module0202.f12832(var148_184, (SubLObject)UNPROVIDED);
        final SubLObject var189 = module0202.f12829(var148_184, (SubLObject)UNPROVIDED);
        if (NIL != module0269.f17760(var188)) {
            var187 = module0202.f12767(var188, f18946(var189), (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0269.f17781(var188)) {
            var187 = module0202.f12767(var188, f18947(var188, var189, Symbols.symbol_function((SubLObject)$ic44$)), (SubLObject)UNPROVIDED);
        }
        else {
            var187 = module0202.f12767(var188, var189, (SubLObject)UNPROVIDED);
        }
        if (NIL != var185) {
            return module0202.f12711(var185, var187);
        }
        return var187;
    }
    
    public static SubLObject f18946(final SubLObject var185) {
        return Sort.sort(var185, Symbols.symbol_function((SubLObject)$ic44$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18945(final SubLObject var185, final SubLObject var181) {
        SubLObject var186 = (SubLObject)NIL;
        SubLObject var187 = (SubLObject)NIL;
        SubLObject var188 = (SubLObject)NIL;
        SubLObject var189 = (SubLObject)NIL;
        var187 = var185;
        var188 = var187.first();
        for (var189 = (SubLObject)ZERO_INTEGER; NIL != var187; var187 = var187.rest(), var188 = var187.first(), var189 = Numbers.add((SubLObject)ONE_INTEGER, var189)) {
            if (NIL != module0004.f104(Numbers.add(var189, (SubLObject)ONE_INTEGER), var181, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var186 = (SubLObject)ConsesLow.cons(var188, var186);
            }
            else {
                var186 = (SubLObject)ConsesLow.cons(f18877(var188), var186);
            }
        }
        return Sequences.nreverse(var186);
    }
    
    public static SubLObject f18877(final SubLObject var5) {
        if (NIL != module0202.f12639(var5)) {
            return var5;
        }
        if (NIL != module0210.f13576(var5, (SubLObject)UNPROVIDED)) {
            return f18949(var5);
        }
        if (NIL != module0202.f12929(var5)) {
            return f18950(var5);
        }
        return var5;
    }
    
    public static SubLObject f18951(final SubLObject var188) {
        return (SubLObject)makeBoolean(ONE_INTEGER.numE(module0205.f13360(var188, (SubLObject)UNPROVIDED)) && ONE_INTEGER.numE(module0205.f13360(module0205.f13277(var188, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) && NIL != module0279.f18532(module0205.f13276(var188), module0205.f13276(module0205.f13277(var188, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18952(final SubLObject var188) {
        final SubLObject var189 = module0205.f13276(var188);
        final SubLObject var190 = module0205.f13276(module0205.f13277(var188, (SubLObject)UNPROVIDED));
        if (NIL != f18953(var189, var190)) {
            return var188;
        }
        final SubLObject var191 = module0205.f13277(module0205.f13277(var188, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        return module0202.f12784(var190, module0202.f12784(var189, var191));
    }
    
    public static SubLObject f18949(final SubLObject var188) {
        final SubLObject var189 = module0202.f12707(var188, (SubLObject)UNPROVIDED);
        final SubLObject var188_192 = (NIL != var189) ? module0202.f12712(var188) : var188;
        SubLObject var190 = (SubLObject)NIL;
        final SubLObject var191 = module0205.f13276(var188_192);
        final SubLObject var192 = module0279.f18446(var191, (SubLObject)UNPROVIDED);
        final SubLObject var193 = f18945(module0205.f13304(var188_192, (SubLObject)UNPROVIDED), var192);
        if (NIL != f18951(var188_192)) {
            var190 = f18952(var188_192);
        }
        else if (NIL != module0226.f14806(var191)) {
            var190 = module0202.f12786(var191, Sort.sort(var193, Symbols.symbol_function((SubLObject)$ic44$), (SubLObject)UNPROVIDED));
        }
        else if (NIL != module0269.f17781(var191)) {
            var190 = module0202.f12786(var191, f18947(var191, var193, Symbols.symbol_function((SubLObject)$ic44$)));
        }
        else if (var193.eql(module0205.f13304(var188_192, (SubLObject)UNPROVIDED))) {
            var190 = var188_192;
        }
        else {
            var190 = module0202.f12786(var191, var193);
        }
        if (NIL != var189) {
            return module0202.f12711(var189, var190);
        }
        return var190;
    }
    
    public static SubLObject f18954(final SubLObject var194) {
        return f18950(module0202.f12763(var194));
    }
    
    public static SubLObject f18950(final SubLObject var194) {
        final SubLObject var195 = module0205.f13136(var194);
        final SubLObject var196 = module0279.f18446(var195, (SubLObject)UNPROVIDED);
        final SubLObject var197 = module0202.f12707(var194, (SubLObject)UNPROVIDED);
        final SubLObject var198 = f18945(module0205.f13207(var194, (SubLObject)$ic46$), var196);
        final SubLObject var199 = module0202.f12683(var195, var198, var197);
        return f18955(var199);
    }
    
    public static SubLObject f18955(final SubLObject var194) {
        final SubLObject var195 = module0202.f12707(var194, (SubLObject)UNPROVIDED);
        final SubLObject var194_198 = (NIL != var195) ? module0202.f12712(var194) : var194;
        SubLObject var196 = (SubLObject)NIL;
        final SubLObject var197 = module0205.f13136(var194_198);
        final SubLObject var198 = module0205.f13207(var194_198, (SubLObject)UNPROVIDED);
        if (NIL != module0269.f17760(var197)) {
            var196 = module0202.f12683(var197, Sort.sort(var198, Symbols.symbol_function((SubLObject)$ic44$), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0269.f17781(var197)) {
            var196 = module0202.f12683(var197, f18947(var197, var198, Symbols.symbol_function((SubLObject)$ic44$)), (SubLObject)UNPROVIDED);
        }
        else {
            var196 = var194_198;
        }
        if (NIL != var195) {
            return module0202.f12711(var195, var196);
        }
        return var196;
    }
    
    public static SubLObject f18947(final SubLObject var173, SubLObject var185, final SubLObject var199) {
        SubLObject var201;
        final SubLObject var200 = var201 = f18956(var173, var185);
        SubLObject var202 = (SubLObject)NIL;
        var202 = var201.first();
        while (NIL != var201) {
            SubLObject var203 = (SubLObject)NIL;
            SubLObject var204;
            SubLObject var205;
            for (var204 = Sequences.length(var185), var205 = (SubLObject)NIL, var205 = (SubLObject)ZERO_INTEGER; var205.numL(var204); var205 = Numbers.add(var205, (SubLObject)ONE_INTEGER)) {
                if (NIL != module0004.f104(Numbers.add((SubLObject)ONE_INTEGER, var205), var202, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var203 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var205, var185), var203);
                }
            }
            var203 = Sort.sort(var203, var199, (SubLObject)UNPROVIDED);
            SubLObject var206 = (SubLObject)NIL;
            SubLObject var207 = (SubLObject)NIL;
            SubLObject var208 = (SubLObject)NIL;
            var206 = (SubLObject)ZERO_INTEGER;
            for (var207 = var202, var208 = var207.first(); NIL != var208; var208 = var207.first()) {
                var185 = module0035.f2044(Numbers.subtract(var208, (SubLObject)ONE_INTEGER), ConsesLow.nth(var206, var203), var185);
                var206 = Numbers.add((SubLObject)ONE_INTEGER, var206);
                var207 = var207.rest();
            }
            var201 = var201.rest();
            var202 = var201.first();
        }
        return var185;
    }
    
    public static SubLObject f18957(final SubLObject var194) {
        final SubLObject var195 = module0205.f13136(var194);
        final SubLObject var196 = module0205.f13207(var194, (SubLObject)$ic46$);
        if (NIL != module0269.f17760(var195)) {
            return (SubLObject)ConsesLow.list(module0035.f2167(Sequences.length(var196), (SubLObject)ONE_INTEGER));
        }
        if (NIL != module0269.f17781(var195)) {
            return f18956(var195, var196);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18958(final SubLObject var194, final SubLObject var2, final SubLObject var206) {
        final SubLThread var207 = SubLProcess.currentSubLThread();
        SubLObject var208 = (SubLObject)T;
        if (NIL != var206 && NIL == module0202.f12970(var194, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var209 = module0205.f13203(var194, (SubLObject)UNPROVIDED);
            final SubLObject var210 = module0205.f13207(var194, (SubLObject)UNPROVIDED).rest();
            final SubLObject var211 = module0035.f2409(var210, (SubLObject)UNPROVIDED);
            if (var211.isInteger()) {
                SubLObject var212 = f18959(var209, var2);
                if (NIL == module0004.f104(var194, var212, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var212 = ConsesLow.nconc(var212, (SubLObject)ConsesLow.list(var194));
                }
                var207.resetMultipleValues();
                final SubLObject var213 = f18960((SubLObject)ConsesLow.make_list(var211, (SubLObject)$ic47$), var212, var206);
                final SubLObject var214 = var207.secondMultipleValue();
                var207.resetMultipleValues();
                if (NIL != var214) {
                    var208 = (SubLObject)NIL;
                    SubLObject var215 = var214;
                    SubLObject var216 = (SubLObject)NIL;
                    var216 = var215.first();
                    while (NIL != var215) {
                        module0274.f18082(var216);
                        var215 = var215.rest();
                        var216 = var215.first();
                    }
                }
            }
        }
        return var208;
    }
    
    public static SubLObject f18956(final SubLObject var173, final SubLObject var182) {
        return f18960(var182, f18959(var173, (SubLObject)UNPROVIDED), (SubLObject)NIL);
    }
    
    public static SubLObject f18960(final SubLObject var182, final SubLObject var210, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)NIL;
        }
        SubLObject var211 = (SubLObject)NIL;
        SubLObject var212 = (SubLObject)NIL;
        SubLObject var213 = (SubLObject)NIL;
        SubLObject var214 = (SubLObject)NIL;
        SubLObject var215 = (SubLObject)NIL;
        SubLObject var216 = (SubLObject)NIL;
        SubLObject var217 = var210;
        SubLObject var218 = (SubLObject)NIL;
        var218 = var217.first();
        while (NIL != var217) {
            SubLObject var219 = var218;
            SubLObject var220 = (SubLObject)NIL;
            if ($ic48$.eql(module0205.f13136(var218))) {
                if (NIL != var214) {
                    var212 = (SubLObject)T;
                    if (NIL != var206) {
                        var211 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic49$, var218, var214), var211);
                    }
                }
                var214 = var218;
                var219 = module0202.f12763(var219);
                final SubLObject var221 = module0035.f2409(module0205.f13207(var218, (SubLObject)UNPROVIDED).rest(), (SubLObject)UNPROVIDED);
                SubLObject var222;
                SubLObject var223;
                SubLObject var224;
                for (var222 = Sequences.length(var182), var223 = (SubLObject)NIL, var223 = (SubLObject)ZERO_INTEGER; var223.numL(var222); var223 = Numbers.add(var223, (SubLObject)ONE_INTEGER)) {
                    var224 = Numbers.add(var223, (SubLObject)ONE_INTEGER);
                    if (var224.numG(var221)) {
                        var219 = ConsesLow.nconc(var219, (SubLObject)ConsesLow.list(var224));
                    }
                }
            }
            SubLObject var14_225;
            final SubLObject var223_224 = var14_225 = module0205.f13207(var219, (SubLObject)$ic46$);
            SubLObject var225 = (SubLObject)NIL;
            var225 = var14_225.first();
            while (NIL != var14_225) {
                if (var225.isInteger()) {
                    if (NIL != module0004.f104(var225, var213, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var212 = (SubLObject)T;
                        if (NIL != var206) {
                            var211 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic50$, var218, var225, conses_high.assoc(var225, var215, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest()), var211);
                        }
                    }
                    if (NIL == module0004.f104(var225, var220, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var220 = (SubLObject)ConsesLow.cons(var225, var220);
                        var213 = (SubLObject)ConsesLow.cons(var225, var213);
                        var215 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var225, var218), var215);
                    }
                }
                var14_225 = var14_225.rest();
                var225 = var14_225.first();
            }
            if (NIL != var220) {
                var216 = (SubLObject)ConsesLow.cons(Sort.sort(var220, Symbols.symbol_function((SubLObject)$ic51$), (SubLObject)UNPROVIDED), var216);
            }
            var217 = var217.rest();
            var218 = var217.first();
        }
        if (NIL != var212) {
            var216 = module0035.f2286(var216, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return Values.values(var216, var211);
    }
    
    public static SubLObject f18959(final SubLObject var173, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        SubLObject var175 = (SubLObject)NIL;
        final SubLObject var176 = var2;
        final SubLObject var177 = module0147.$g2094$.currentBinding(var174);
        final SubLObject var178 = module0147.$g2095$.currentBinding(var174);
        try {
            module0147.$g2094$.bind(module0147.f9531(var176), var174);
            module0147.$g2095$.bind(module0147.f9534(var176), var174);
            final SubLObject var179 = module0219.f14509(var173, (SubLObject)ONE_INTEGER, $ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var180 = module0219.f14509(var173, (SubLObject)ONE_INTEGER, $ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var175 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic53$), ConsesLow.nconc(var179, var180));
        }
        finally {
            module0147.$g2095$.rebind(var178, var174);
            module0147.$g2094$.rebind(var177, var174);
        }
        return var175;
    }
    
    public static SubLObject f18953(final SubLObject var229, final SubLObject var230) {
        final SubLThread var231 = SubLProcess.currentSubLThread();
        if (NIL == module0146.$g1985$.getDynamicValue(var231)) {
            return f18963(var229, var230);
        }
        if (NIL != module0205.f13141(var229)) {
            return f18953(module0205.f13144(var229), var230);
        }
        if (NIL != module0205.f13141(var230)) {
            return f18953(var229, module0205.f13144(var230));
        }
        if (var229.isAtom()) {
            if (var230.isAtom()) {
                return f18961(var229, var230);
            }
            return (SubLObject)T;
        }
        else {
            if (var230.isAtom()) {
                return (SubLObject)NIL;
            }
            return f18962(var229, var230);
        }
    }
    
    public static SubLObject f18962(final SubLObject var231, final SubLObject var232) {
        final SubLObject var233 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic54$), var231, (SubLObject)UNPROVIDED);
        final SubLObject var234 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic54$), var232, (SubLObject)UNPROVIDED);
        if (var233.numL(var234)) {
            return (SubLObject)T;
        }
        if (var233.numG(var234)) {
            return (SubLObject)NIL;
        }
        final SubLObject var235 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic55$), var231, (SubLObject)UNPROVIDED);
        final SubLObject var236 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic55$), var232, (SubLObject)UNPROVIDED);
        if (var235.numL(var236)) {
            return (SubLObject)T;
        }
        if (var235.numG(var236)) {
            return (SubLObject)NIL;
        }
        if (module0205.f13132(var231).equal(module0205.f13132(var232))) {
            return f18953(module0205.f13207(var231, (SubLObject)UNPROVIDED), module0205.f13207(var232, (SubLObject)UNPROVIDED));
        }
        return f18953(module0205.f13132(var231), module0205.f13132(var232));
    }
    
    public static SubLObject f18964(final SubLObject var237, final SubLObject var238) {
        return constants_high_oc.f10760(var237, var238);
    }
    
    public static SubLObject f18961(final SubLObject var239, final SubLObject var240) {
        if (NIL != module0167.f10813(var239)) {
            return f18953(module0172.f10920(var239), var240);
        }
        if (NIL != module0167.f10813(var240)) {
            return f18953(var239, module0172.f10920(var240));
        }
        if (NIL != module0201.f12581(var239)) {
            return f18953(module0193.f12082(var239), var240);
        }
        if (NIL != module0201.f12581(var240)) {
            return f18953(var239, module0193.f12082(var240));
        }
        if (NIL != constant_handles_oc.f8449(var239)) {
            if (NIL != constant_handles_oc.f8449(var240)) {
                return f18964(var239, var240);
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != constant_handles_oc.f8449(var240)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0201.f12546(var239)) {
                if (NIL != module0201.f12546(var240)) {
                    module0202.f12747((SubLObject)FIVE_INTEGER, (SubLObject)$ic56$, var239, var240, (SubLObject)UNPROVIDED);
                    return Strings.string_lessp(Symbols.symbol_name(var239), Symbols.symbol_name(var240), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return (SubLObject)T;
            }
            else {
                if (NIL != module0201.f12546(var240)) {
                    return (SubLObject)NIL;
                }
                if (var239.isSymbol()) {
                    if (var240.isSymbol()) {
                        return Strings.string_lessp(Symbols.symbol_name(var239), Symbols.symbol_name(var240), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    return (SubLObject)T;
                }
                else {
                    if (var240.isSymbol()) {
                        return (SubLObject)NIL;
                    }
                    if (var239.isNumber()) {
                        if (var240.isNumber()) {
                            return Numbers.numL(var239, var240);
                        }
                        return (SubLObject)T;
                    }
                    else {
                        if (var240.isNumber()) {
                            return (SubLObject)NIL;
                        }
                        if (var239.isChar()) {
                            if (var240.isChar()) {
                                return Characters.char_lessp(var239, var240);
                            }
                            return (SubLObject)T;
                        }
                        else {
                            if (var240.isChar()) {
                                return (SubLObject)NIL;
                            }
                            if (var239.isString()) {
                                if (var240.isString()) {
                                    return Strings.string_lessp(var239, var240, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                return (SubLObject)T;
                            }
                            else {
                                if (var240.isString()) {
                                    return (SubLObject)NIL;
                                }
                                module0202.f12747((SubLObject)FIVE_INTEGER, (SubLObject)$ic57$, var239, var240, (SubLObject)UNPROVIDED);
                                return Strings.string_lessp(module0038.f2638(var239), module0038.f2638(var240), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static SubLObject f18965(final SubLObject var229, final SubLObject var230) {
        return f18953(var229, var230);
    }
    
    public static SubLObject f18966(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)NIL;
        final SubLObject var65 = module0146.$g2030$.currentBinding(var63);
        try {
            module0146.$g2030$.bind(module0204.f13087(var62, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var63);
            var64 = f18967(f18968((SubLObject)ConsesLow.list(module0202.f12765(var62)), (SubLObject)NIL).first());
        }
        finally {
            module0146.$g2030$.rebind(var65, var63);
        }
        return var64;
    }
    
    public static SubLObject f18926(final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (NIL == module0146.$g2020$.getDynamicValue(var146) || (NIL != module0035.f1997(var145) && NIL != module0204.f13044(var145.first()) && NIL == module0202.f12665(module0204.f13047(var145.first())))) {
            return var145;
        }
        SubLObject var147 = (SubLObject)NIL;
        final SubLObject var148 = $g2613$.currentBinding(var146);
        try {
            $g2613$.bind((SubLObject)NIL, var146);
            var147 = f18969(f18968(var145, (SubLObject)T));
        }
        finally {
            $g2613$.rebind(var148, var146);
        }
        return var147;
    }
    
    public static SubLObject f18969(final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var147 = (SubLObject)NIL;
        final SubLObject var148 = module0146.$g2030$.currentBinding(var146);
        try {
            module0146.$g2030$.bind(f18970(var145), var146);
            var147 = ((NIL != module0146.$g2016$.getDynamicValue(var146)) ? module0035.f2076(Symbols.symbol_function((SubLObject)$ic59$), var145) : var145);
        }
        finally {
            module0146.$g2030$.rebind(var148, var146);
        }
        return var147;
    }
    
    public static SubLObject f18970(final SubLObject var145) {
        SubLObject var146 = (SubLObject)NIL;
        SubLObject var147 = var145;
        SubLObject var148 = (SubLObject)NIL;
        var148 = var147.first();
        while (NIL != var147) {
            SubLObject var14_241 = module0035.f2076(Symbols.symbol_function((SubLObject)$ic60$), module0204.f13087(var148, Symbols.symbol_function((SubLObject)$ic54$), (SubLObject)UNPROVIDED));
            SubLObject var149 = (SubLObject)NIL;
            var149 = var14_241.first();
            while (NIL != var14_241) {
                final SubLObject var150 = var149;
                if (NIL == conses_high.member(var150, var146, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var146 = (SubLObject)ConsesLow.cons(var150, var146);
                }
                var14_241 = var14_241.rest();
                var149 = var14_241.first();
            }
            var147 = var147.rest();
            var148 = var147.first();
        }
        return var146;
    }
    
    public static SubLObject f18967(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12689(var62, Symbols.symbol_function((SubLObject)$ic54$))) {
            return var62;
        }
        final SubLObject var64 = f18971(var62);
        if (NIL != var64) {
            var63.resetMultipleValues();
            SubLObject var65 = module0204.f13065(var62);
            SubLObject var66 = var63.secondMultipleValue();
            var63.resetMultipleValues();
            SubLObject var67 = (NIL != module0018.f980()) ? var66 : var65;
            SubLObject var68 = var64;
            SubLObject var69 = (SubLObject)NIL;
            var69 = var68.first();
            while (NIL != var68) {
                if (NIL != f18972(var69, var62, (SubLObject)UNPROVIDED)) {
                    if (NIL == module0279.f18502(var69, var67)) {
                        var67 = module0035.f2084(module0279.f18506(var69), var67);
                    }
                }
                else if (NIL != f18973(var69, var62, (SubLObject)UNPROVIDED) && NIL == module0279.f18504(var69, var67, Symbols.symbol_function((SubLObject)$ic61$)) && NIL != module0279.f18505(var69, var67, Symbols.symbol_function((SubLObject)$ic61$))) {
                    var67 = module0035.f2084(module0279.f18510(var69), var67);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
            if (NIL != module0018.f980()) {
                var66 = var67;
            }
            else {
                var65 = var67;
            }
            return (SubLObject)ConsesLow.list(var65, var66);
        }
        return var62;
    }
    
    public static SubLObject f18974(final SubLObject var247, final SubLObject var248) {
        final SubLThread var249 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(var247.equal(var248) || NIL != ((NIL != module0146.$g2003$.getDynamicValue(var249)) ? Equality.equal(f18975(var247, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f18975(var248, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL));
    }
    
    public static SubLObject f18972(final SubLObject var246, final SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = Symbols.symbol_function((SubLObject)$ic54$);
        }
        final SubLThread var250 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12590(var246)) {
            final SubLObject var251 = module0205.f13276(var246);
            if (NIL != module0279.f18533(var251, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            if (NIL != Functions.funcall(var249, var251)) {
                if (NIL != module0146.$g2036$.getDynamicValue(var250)) {
                    return module0256.f16604($ic62$, module0307.f20797(var251, var62, module0147.$g2095$.getDynamicValue(var250)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                SubLObject var252 = module0256.f16604($ic62$, module0307.f20797(var251, var62, module0147.$g2095$.getDynamicValue(var250)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var252) {
                    final SubLObject var253 = module0152.$g2108$.currentBinding(var250);
                    final SubLObject var254 = module0144.$g1796$.currentBinding(var250);
                    try {
                        module0152.$g2108$.bind((SubLObject)NIL, var250);
                        module0144.$g1796$.bind((SubLObject)NIL, var250);
                        var252 = module0256.f16604($ic63$, module0303.f20162(var246, var62, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0144.$g1796$.rebind(var254, var250);
                        module0152.$g2108$.rebind(var253, var250);
                    }
                }
                return var252;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18973(final SubLObject var246, final SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = Symbols.symbol_function((SubLObject)$ic54$);
        }
        final SubLThread var250 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12590(var246)) {
            final SubLObject var251 = module0205.f13276(var246);
            if (NIL != module0279.f18543(var251, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            if (NIL != Functions.funcall(var249, var251)) {
                return module0256.f16604($ic64$, module0307.f20797(var251, var62, module0147.$g2095$.getDynamicValue(var250)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18976() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0018.$g696$.getDynamicValue(var6) || NIL != module0146.$g2019$.getDynamicValue(var6));
    }
    
    public static SubLObject f18977(final SubLObject var173, final SubLObject var251, SubLObject var252) {
        if (var252 == UNPROVIDED) {
            var252 = (SubLObject)T;
        }
        final SubLThread var253 = SubLProcess.currentSubLThread();
        SubLObject var254 = (SubLObject)NIL;
        final SubLObject var255 = module0147.$g2094$.currentBinding(var253);
        final SubLObject var256 = module0147.$g2096$.currentBinding(var253);
        try {
            module0147.$g2094$.bind((SubLObject)$ic65$, var253);
            module0147.$g2096$.bind(var251, var253);
            var254 = f18878(module0202.f12763(var173), var252);
        }
        finally {
            module0147.$g2096$.rebind(var256, var253);
            module0147.$g2094$.rebind(var255, var253);
        }
        return var254;
    }
    
    public static SubLObject f18878(SubLObject var173, SubLObject var252) {
        if (var252 == UNPROVIDED) {
            var252 = (SubLObject)T;
        }
        if (NIL != module0202.f12932(var173)) {
            SubLObject var253 = (SubLObject)NIL;
            SubLObject var254 = (SubLObject)ConsesLow.cons(var173, f18978(var173, (SubLObject)UNPROVIDED));
            SubLObject var255 = (SubLObject)NIL;
            var255 = var254.first();
            while (NIL != var254) {
                if (NIL == module0202.f12639(var173)) {
                    if (!var255.isAtom()) {
                        if (NIL != module0279.f18534(var255, (SubLObject)UNPROVIDED)) {
                            var253 = (SubLObject)ConsesLow.cons(var255, var253);
                        }
                    }
                }
                var254 = var254.rest();
                var255 = var254.first();
            }
            if (NIL != var253) {
                var253 = Sequences.delete_duplicates(var253, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var173 = f18979(var253, var173, var252);
            }
            return var173;
        }
        module0202.f12747((SubLObject)FOUR_INTEGER, (SubLObject)$ic66$, var173, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var173;
    }
    
    public static SubLObject f18979(final SubLObject var253, SubLObject var173, final SubLObject var252) {
        SubLObject var254;
        SubLObject var255;
        for (var254 = (SubLObject)NIL, var255 = (SubLObject)NIL, var254 = var253, var255 = var254.first(); NIL != var255; var255 = var254.first()) {
            var173 = f18981(var255, var173, var252);
            var254 = f18980(var255, var254.rest());
        }
        return var173;
    }
    
    public static SubLObject f18981(final SubLObject var246, final SubLObject var173, final SubLObject var252) {
        final SubLThread var253 = SubLProcess.currentSubLThread();
        if (NIL == f18976()) {
            return f18982(f18983(var246), var246, var173, var252);
        }
        if (NIL != module0210.f13618(var246)) {
            return f18982(f18984(var246), var246, var173, var252);
        }
        if (NIL != module0146.$g2050$.getDynamicValue(var253)) {
            return f18982(f18983(var246), var246, var173, var252);
        }
        return var173;
    }
    
    public static SubLObject f18985(final SubLObject var145, final SubLObject var2) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var147 = (SubLObject)NIL;
        final SubLObject var148 = module0147.$g2094$.currentBinding(var146);
        final SubLObject var149 = module0147.$g2095$.currentBinding(var146);
        try {
            module0147.$g2094$.bind((SubLObject)$ic67$, var146);
            module0147.$g2095$.bind(var2, var146);
            var147 = f18968(module0202.f12766(var145), (SubLObject)NIL);
        }
        finally {
            module0147.$g2095$.rebind(var149, var146);
            module0147.$g2094$.rebind(var148, var146);
        }
        return var147;
    }
    
    public static SubLObject f18968(SubLObject var145, final SubLObject var255) {
        final SubLThread var256 = SubLProcess.currentSubLThread();
        SubLObject var257 = (SubLObject)NIL;
        SubLObject var258 = (SubLObject)NIL;
        SubLObject var259 = module0035.f2079(Symbols.symbol_function((SubLObject)$ic68$), var145, Symbols.symbol_function((SubLObject)EQUAL));
        SubLObject var260 = (SubLObject)NIL;
        var260 = var259.first();
        while (NIL != var259) {
            if (NIL == module0202.f12639(var260)) {
                if (!var260.isAtom()) {
                    if (NIL != var255 && NIL != module0210.f13591(module0205.f13276(var260))) {
                        var257 = (SubLObject)ConsesLow.cons(var260, var257);
                    }
                    else if (NIL != module0279.f18534(var260, (SubLObject)UNPROVIDED)) {
                        var258 = (SubLObject)ConsesLow.cons(var260, var258);
                    }
                }
            }
            var259 = var259.rest();
            var260 = var259.first();
        }
        if (NIL != var258) {
            var258 = Sort.sort(var258, Symbols.symbol_function((SubLObject)$ic51$), (SubLObject)$ic69$);
            var145 = f18986(var258, var145);
        }
        if (NIL != var257) {
            SubLObject var261 = (SubLObject)NIL;
            try {
                var256.throwStack.push($ic70$);
                var145 = module0287.f19151(var257, var145, module0147.$g2095$.getDynamicValue(var256), module0018.$g696$.getDynamicValue(var256));
            }
            catch (Throwable var262) {
                var261 = Errors.handleThrowable(var262, (SubLObject)$ic70$);
            }
            finally {
                var256.throwStack.pop();
            }
            if (NIL != var261) {
                if (NIL != module0152.$g2115$.getDynamicValue(var256)) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic71$, var261));
                }
                return (SubLObject)NIL;
            }
        }
        return var145;
    }
    
    public static SubLObject f18986(final SubLObject var253, SubLObject var145) {
        SubLObject var254;
        SubLObject var255;
        for (var254 = (SubLObject)NIL, var255 = (SubLObject)NIL, var254 = var253, var255 = var254.first(); NIL != var255; var255 = var254.first()) {
            var145 = f18987(var255, var145);
            var254 = f18980(var255, var254.rest());
        }
        return var145;
    }
    
    public static SubLObject f18980(final SubLObject var246, final SubLObject var254) {
        if (NIL == f18976()) {
            return conses_high.subst(f18983(var246), var246, var254, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        if (NIL == module0210.f13618(var246)) {
            return var254;
        }
        return conses_high.subst(f18984(var246), var246, var254, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18988(final SubLObject var246, final SubLObject var145) {
        return f18987(module0202.f12763(var246), module0202.f12766(var145));
    }
    
    public static SubLObject f18987(final SubLObject var246, final SubLObject var145) {
        final SubLThread var247 = SubLProcess.currentSubLThread();
        if (NIL == f18976()) {
            return f18989(f18990(var246), var246, var145);
        }
        if (NIL != module0210.f13618(var246)) {
            return f18989(f18984(var246), var246, var145);
        }
        if (NIL != module0146.$g2050$.getDynamicValue(var247)) {
            return f18989(f18990(var246), var246, var145);
        }
        return var145;
    }
    
    public static SubLObject f18990(final SubLObject var246) {
        return f18983(module0202.f12763(var246));
    }
    
    public static SubLObject f18983(SubLObject var246) {
        SubLObject var247 = var246;
        if (NIL != module0035.f2014(var246) && NIL != module0269.f17790(module0205.f13276(var246))) {
            SubLObject var248 = f18991(var246);
            SubLObject var249 = (SubLObject)NIL;
            var249 = var248.first();
            while (NIL != var248) {
                if (NIL != module0279.f18534(var249, (SubLObject)UNPROVIDED)) {
                    final SubLObject var250 = f18983(var249);
                    if (!var250.equal(var249)) {
                        var246 = conses_high.nsubst(var250, var249, var246, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    }
                }
                var248 = var248.rest();
                var249 = var248.first();
            }
            if (NIL != module0210.f13595(var246, (SubLObject)UNPROVIDED)) {
                final SubLObject var251 = module0279.f18568(var246);
                if (NIL != var251) {
                    var247 = var251;
                }
            }
        }
        return var247;
    }
    
    public static SubLObject f18984(final SubLObject var246) {
        return f18992(var246, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18993(final SubLObject var261, SubLObject var262) {
        if (var262 == UNPROVIDED) {
            var262 = (SubLObject)NIL;
        }
        return f18992(var261, (SubLObject)T, (SubLObject)T, var262);
    }
    
    public static SubLObject f18994(final SubLObject var261) {
        module0561.f34587();
        return f18992(var261, (SubLObject)NIL, (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f18992(SubLObject var246, final SubLObject var263, final SubLObject var264, SubLObject var262) {
        if (var262 == UNPROVIDED) {
            var262 = (SubLObject)NIL;
        }
        if (NIL != module0167.f10813(var246)) {
            return var246;
        }
        if (NIL != var262) {
            module0561.f34587();
        }
        SubLObject var265 = Sort.sort(f18991(var246), Symbols.symbol_function((SubLObject)$ic72$), (SubLObject)$ic73$);
        SubLObject var266 = (SubLObject)NIL;
        var266 = var265.first();
        while (NIL != var265) {
            final SubLObject var267 = f18992(var266, var263, var264, var262);
            if (!var267.equal(var266)) {
                var246 = conses_high.subst(var267, var266, var246, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            }
            var265 = var265.rest();
            var266 = var265.first();
        }
        if (NIL != var263) {
            var246 = f18995(var246);
        }
        if (NIL == var262 && NIL == module0279.f18534(var246, (SubLObject)UNPROVIDED)) {
            return var246;
        }
        final SubLObject var268 = f18975(var246, (SubLObject)NIL, (SubLObject)T);
        if (NIL != var264) {
            return f18996(var268);
        }
        final SubLObject var269 = module0172.f10916(var268);
        return (NIL != var269) ? var269 : var246;
    }
    
    public static SubLObject f18995(final SubLObject var261) {
        return f18954(var261);
    }
    
    public static SubLObject f18996(final SubLObject var266) {
        SubLObject var267 = module0172.f10916(var266);
        if (NIL == module0167.f10813(var267)) {
            var267 = f18997(var266);
        }
        return var267;
    }
    
    public static SubLObject f18997(final SubLObject var266) {
        final SubLThread var267 = SubLProcess.currentSubLThread();
        if (NIL != module0131.$g1540$.getDynamicValue(var267)) {
            module0131.f8588((SubLObject)ConsesLow.list((SubLObject)$ic74$, module0035.f2241(var266)));
        }
        final SubLObject var268 = module0168.f10836(var266);
        module0540.f33517(module0202.f12768($ic75$, var268, var266), module0132.$g1558$.getGlobalValue(), (SubLObject)$ic76$);
        return var268;
    }
    
    public static SubLObject f18998(SubLObject var246) {
        SubLObject var247 = f18999(var246);
        SubLObject var248 = (SubLObject)NIL;
        var248 = var247.first();
        while (NIL != var247) {
            if (NIL != module0210.f13571(var248)) {
                final SubLObject var249 = f18998(var248);
                if (!var249.equal(var248)) {
                    var246 = conses_high.subst(var249, var248, var246, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                }
            }
            var247 = var247.rest();
            var248 = var247.first();
        }
        if (NIL != module0279.f18534(var246, (SubLObject)UNPROVIDED)) {
            return f18993(var246, (SubLObject)UNPROVIDED);
        }
        return var246;
    }
    
    public static SubLObject f18999(final SubLObject var246) {
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = var246.rest();
        SubLObject var249 = (SubLObject)NIL;
        var249 = var248.first();
        while (NIL != var248) {
            if (NIL != module0210.f13571(var249)) {
                var247 = (SubLObject)ConsesLow.cons(var249, var247);
            }
            var248 = var248.rest();
            var249 = var248.first();
        }
        return Sequences.nreverse(var247);
    }
    
    public static SubLObject f18991(final SubLObject var246) {
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = var246.rest();
        SubLObject var249 = (SubLObject)NIL;
        var249 = var248.first();
        while (NIL != var248) {
            if (NIL != module0210.f13571(var249)) {
                var247 = (SubLObject)ConsesLow.cons(var249, var247);
            }
            var248 = var248.rest();
            var249 = var248.first();
        }
        return var247;
    }
    
    public static SubLObject f19000(final SubLObject var246) {
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = var246.rest();
        SubLObject var249 = (SubLObject)NIL;
        var249 = var248.first();
        while (NIL != var248) {
            if (NIL != module0210.f13571(var249)) {
                var247 = (SubLObject)ConsesLow.cons(var249, var247);
                SubLObject var14_267 = f18991(var249);
                SubLObject var250 = (SubLObject)NIL;
                var250 = var14_267.first();
                while (NIL != var14_267) {
                    var247 = (SubLObject)ConsesLow.cons(var250, var247);
                    var14_267 = var14_267.rest();
                    var250 = var14_267.first();
                }
            }
            var248 = var248.rest();
            var249 = var248.first();
        }
        return var247;
    }
    
    public static SubLObject f19001(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var56) && NIL == module0035.f2370(Symbols.symbol_function((SubLObject)$ic12$), var55, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic77$);
        }
        return Sort.sort(conses_high.copy_list(var55), Symbols.symbol_function((SubLObject)$ic78$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19002(final SubLObject var268, final SubLObject var269) {
        if (NIL != constant_handles_oc.f8449(var268) && NIL != constant_handles_oc.f8449(var269)) {
            return f18964(var268, var269);
        }
        if (NIL != module0167.f10813(var268) && NIL != module0167.f10813(var269)) {
            return Numbers.numL(module0167.f10803(var268), module0167.f10803(var269));
        }
        return constant_handles_oc.f8449(var268);
    }
    
    public static SubLObject f18971(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)NIL;
        final SubLObject var65 = module0146.$g2012$.currentBinding(var63);
        try {
            module0146.$g2012$.bind((SubLObject)T, var63);
            var64 = conses_high.union(f19003(module0232.f15306(var62)), f19003(module0232.f15308(var62)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        finally {
            module0146.$g2012$.rebind(var65, var63);
        }
        return var64;
    }
    
    public static SubLObject f19003(final SubLObject var147) {
        return module0035.f2077(Symbols.symbol_function((SubLObject)$ic79$), var147);
    }
    
    public static SubLObject f19004(final SubLObject var148) {
        return Sequences.delete_if(Symbols.symbol_function((SubLObject)$ic80$), f19005(var148, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19006(final SubLObject var62) {
        return conses_high.nunion(module0035.f2078(Symbols.symbol_function((SubLObject)$ic81$), module0232.f15306(var62), Symbols.symbol_function((SubLObject)EQUAL)), module0035.f2078(Symbols.symbol_function((SubLObject)$ic81$), module0232.f15308(var62), Symbols.symbol_function((SubLObject)EQUAL)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19005(final SubLObject var148, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var149 = f18978(var148, var2);
        if (NIL != f19007(var148, var2) && NIL == conses_high.member(var148, var149, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            var149 = (SubLObject)ConsesLow.cons(var148, var149);
        }
        return var149;
    }
    
    public static SubLObject f19008(final SubLObject var188, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18978(var188, var2);
    }
    
    public static SubLObject f18978(final SubLObject var173, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12590(var173) && NIL == f19009(var173) && NIL != module0202.f12929(var173)) {
            SubLObject var175 = (SubLObject)NIL;
            SubLObject var176 = (SubLObject)ZERO_INTEGER;
            final SubLObject var177 = module0205.f13132(var173);
            if (NIL == module0146.$g2012$.getDynamicValue(var174) || !var177.eql($ic82$)) {
                SubLObject var178 = module0205.f13180(var173, (SubLObject)UNPROVIDED);
                SubLObject var179 = (SubLObject)NIL;
                var179 = var178.first();
                while (NIL != var178) {
                    final SubLObject var180 = (SubLObject)((NIL != module0173.f10955(var177)) ? module0226.f14903(var176, var177, var2) : NIL);
                    final SubLObject var181 = module0152.$g2121$.currentBinding(var174);
                    final SubLObject var182 = module0152.$g2120$.currentBinding(var174);
                    try {
                        module0152.$g2121$.bind((SubLObject)makeBoolean(NIL != module0152.$g2121$.getDynamicValue(var174) || NIL != module0303.f20189(var177, var180)), var174);
                        module0152.$g2120$.bind((SubLObject)makeBoolean(NIL != module0152.$g2120$.getDynamicValue(var174) || NIL != module0303.f20191(var177, var180)), var174);
                        if (NIL != f19010(var179, var177, var176, var2)) {
                            var175 = (SubLObject)ConsesLow.cons(var179, var175);
                        }
                        if (NIL == module0146.$g2012$.getDynamicValue(var174) || NIL == module0202.f12977(var179)) {
                            if (NIL == module0146.$g2012$.getDynamicValue(var174) || NIL == module0279.f18544(var179, var2)) {
                                if (NIL == f19011(var179, var177, var176, var2)) {
                                    if (NIL != module0210.f13576(var179, (SubLObject)UNPROVIDED)) {
                                        var175 = module0035.f2216(var175, f18978(var179, var2), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                                    }
                                    else if (NIL != module0210.f13606(var179, (SubLObject)UNPROVIDED)) {
                                        var175 = module0035.f2216(var175, f18978(var179, var2), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                                    }
                                    else if (NIL != module0202.f12937(var179)) {
                                        var175 = module0035.f2216(var175, f19005(var179, var2), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        module0152.$g2120$.rebind(var182, var174);
                        module0152.$g2121$.rebind(var181, var174);
                    }
                    var176 = Numbers.add(var176, (SubLObject)ONE_INTEGER);
                    var178 = var178.rest();
                    var179 = var178.first();
                }
            }
            return var175;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19009(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == module0202.f12665(var1));
    }
    
    public static SubLObject f19010(final SubLObject var5, final SubLObject var180, final SubLObject var270, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var5.isAtom()) {
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12981(var180, var270)) {
            return (SubLObject)NIL;
        }
        if (NIL != f19011(var5, var180, var270, var2)) {
            return (SubLObject)NIL;
        }
        return f19007(var5, var2);
    }
    
    public static SubLObject f19011(final SubLObject var5, final SubLObject var180, final SubLObject var270, final SubLObject var2) {
        if (var180.eql($ic83$)) {
            return (SubLObject)T;
        }
        if (var180.eql($ic84$)) {
            return (SubLObject)T;
        }
        if (NIL != module0279.f18485(var180, var270, var2)) {
            return (SubLObject)T;
        }
        if (NIL == module0202.f12689(var5, (SubLObject)UNPROVIDED) && NIL != module0279.f18486(var180, var270, var2) && NIL == module0202.f12691(var5, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19007(final SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (var5.isAtom()) {
            return (SubLObject)NIL;
        }
        if (NIL != module0210.f13589(var5)) {
            return module0146.$g2018$.getDynamicValue(var6);
        }
        if (NIL != module0210.f13594(var5) && NIL != module0172.f10921(var5)) {
            return (SubLObject)T;
        }
        if (NIL != module0279.f18534(var5, var2)) {
            if (NIL != module0131.f8587()) {
                return f19012(var5, var2);
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != module0279.f18544(var5, var2)) {
                return (SubLObject)T;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f19012(final SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f19013(module0205.f13276(var5), var2);
    }
    
    public static SubLObject f19013(final SubLObject var172, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var173 = SubLProcess.currentSubLThread();
        final SubLObject var174 = module0528.f32909();
        return (SubLObject)makeBoolean(NIL != module0018.$g61$.getDynamicValue(var173) || NIL != module0226.f14878(var172, var2) || (NIL != var174 && NIL != module0226.f14880(var172, var174, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f18989(final SubLObject var273, final SubLObject var274, final SubLObject var145) {
        if (var273.equal(var274)) {
            return var145;
        }
        SubLObject var275 = (SubLObject)NIL;
        SubLObject var276 = var145;
        SubLObject var277 = (SubLObject)NIL;
        var277 = var276.first();
        while (NIL != var276) {
            var275 = (SubLObject)ConsesLow.cons(f19014(var273, var274, var277), var275);
            var276 = var276.rest();
            var277 = var276.first();
        }
        return Sequences.nreverse(var275);
    }
    
    public static SubLObject f19014(final SubLObject var273, final SubLObject var274, final SubLObject var62) {
        SubLObject var275 = (SubLObject)NIL;
        SubLObject var276 = (SubLObject)NIL;
        SubLObject var277 = module0232.f15308(var62);
        SubLObject var278 = (SubLObject)NIL;
        var278 = var277.first();
        while (NIL != var277) {
            var275 = (SubLObject)ConsesLow.cons(f19015(var273, var274, var278), var275);
            var277 = var277.rest();
            var278 = var277.first();
        }
        var277 = module0232.f15306(var62);
        var278 = (SubLObject)NIL;
        var278 = var277.first();
        while (NIL != var277) {
            var276 = (SubLObject)ConsesLow.cons(f19015(var273, var274, var278), var276);
            var277 = var277.rest();
            var278 = var277.first();
        }
        return (SubLObject)ConsesLow.list(Sequences.nreverse(var276), Sequences.nreverse(var275));
    }
    
    public static SubLObject f18982(final SubLObject var273, final SubLObject var274, final SubLObject var173, SubLObject var277) {
        if (var277 == UNPROVIDED) {
            var277 = (SubLObject)NIL;
        }
        if (NIL != var277 && var173.equal(var274)) {
            return var273;
        }
        final SubLObject var278 = module0205.f13132(var173);
        final SubLObject var279 = module0202.f12707(var173, (SubLObject)UNPROVIDED);
        SubLObject var280 = (SubLObject)ZERO_INTEGER;
        SubLObject var281 = (SubLObject)NIL;
        SubLObject var282 = module0205.f13180(var173, (SubLObject)UNPROVIDED);
        SubLObject var283 = (SubLObject)NIL;
        var283 = var282.first();
        while (NIL != var282) {
            if (NIL == module0202.f12639(var173)) {
                if (NIL == var279 || !var283.equal(var279)) {
                    if (var283.equal(var274) && NIL != f19010(var283, var278, var280, (SubLObject)UNPROVIDED)) {
                        var281 = (SubLObject)ConsesLow.cons(var273, var281);
                    }
                    else if (NIL != module0202.f12937(var283)) {
                        var281 = (SubLObject)ConsesLow.cons(f19015(var273, var274, var283), var281);
                    }
                    else if (NIL != module0210.f13576(var283, (SubLObject)UNPROVIDED)) {
                        var281 = (SubLObject)ConsesLow.cons(f19016(var273, var274, var283), var281);
                    }
                    else if (NIL != module0210.f13606(var283, (SubLObject)UNPROVIDED) && NIL != module0202.f12929(var283)) {
                        var281 = (SubLObject)ConsesLow.cons(f18982(var273, var274, var283, (SubLObject)UNPROVIDED), var281);
                    }
                    else {
                        var281 = (SubLObject)ConsesLow.cons(var283, var281);
                    }
                }
            }
            var280 = Numbers.add(var280, (SubLObject)ONE_INTEGER);
            var282 = var282.rest();
            var283 = var282.first();
        }
        var281 = Sequences.nreverse(var281);
        if (NIL != var279) {
            var281 = module0202.f12711(var279, var281);
        }
        return var281;
    }
    
    public static SubLObject f19015(final SubLObject var273, final SubLObject var274, final SubLObject var148) {
        return f18982(var273, var274, var148, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19016(final SubLObject var273, final SubLObject var274, final SubLObject var188) {
        final SubLObject var275 = module0205.f13276(var188);
        final SubLObject var276 = module0202.f12707(var188, (SubLObject)UNPROVIDED);
        SubLObject var277 = (SubLObject)ZERO_INTEGER;
        SubLObject var278 = (SubLObject)NIL;
        SubLObject var279 = module0205.f13180(var188, (SubLObject)UNPROVIDED);
        SubLObject var280 = (SubLObject)NIL;
        var280 = var279.first();
        while (NIL != var279) {
            if (NIL == var276 || !var280.equal(var276)) {
                if (var280.equal(var274) && NIL != f19010(var280, var275, var277, (SubLObject)UNPROVIDED)) {
                    var278 = (SubLObject)ConsesLow.cons(var273, var278);
                }
                else if (NIL != module0202.f12937(var280)) {
                    var278 = (SubLObject)ConsesLow.cons(f19015(var273, var274, var280), var278);
                }
                else if (NIL != module0210.f13576(var280, (SubLObject)UNPROVIDED)) {
                    var278 = (SubLObject)ConsesLow.cons(f19016(var273, var274, var280), var278);
                }
                else if (NIL != module0210.f13606(var280, (SubLObject)UNPROVIDED) && NIL != module0202.f12929(var280)) {
                    var278 = (SubLObject)ConsesLow.cons(f18982(var273, var274, var280, (SubLObject)UNPROVIDED), var278);
                }
                else {
                    var278 = (SubLObject)ConsesLow.cons(var280, var278);
                }
            }
            var277 = Numbers.add(var277, (SubLObject)ONE_INTEGER);
            var279 = var279.rest();
            var280 = var279.first();
        }
        var278 = Sequences.nreverse(var278);
        if (NIL != var276) {
            var278 = module0202.f12711(var276, var278);
        }
        return var278;
    }
    
    public static SubLObject f18927(final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (NIL != module0146.$g2020$.getDynamicValue(var146)) {
            return module0035.f2076(Symbols.symbol_function((SubLObject)$ic85$), var145);
        }
        return var145;
    }
    
    public static SubLObject f19017(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = f19018(var62);
        if (NIL != var64) {
            final SubLObject var65 = module0232.f15306(var62);
            final SubLObject var66 = module0232.f15308(var62);
            SubLObject var67 = (SubLObject)NIL;
            final SubLObject var68 = module0144.$g1799$.currentBinding(var63);
            final SubLObject var69 = module0146.$g2003$.currentBinding(var63);
            try {
                module0144.$g1799$.bind((SubLObject)makeBoolean(NIL != module0144.$g1799$.getDynamicValue(var63) || (NIL != var65 && NIL != var66)), var63);
                module0146.$g2003$.bind(f19019(module0146.$g2003$.getDynamicValue(var63), var65, var66), var63);
                var67 = module0232.f15326(f19020(var64, var65), f19020(var64, var66));
            }
            finally {
                module0146.$g2003$.rebind(var69, var63);
                module0144.$g1799$.rebind(var68, var63);
            }
            return var67;
        }
        return var62;
    }
    
    public static SubLObject f19018(final SubLObject var62) {
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (NIL != module0018.f980()) ? module0232.f15308(var62) : module0232.f15306(var62);
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            if (NIL != f19021(var65)) {
                var63 = (SubLObject)ConsesLow.cons(module0202.f12829(var65, (SubLObject)UNPROVIDED), var63);
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        return Sequences.nreverse(var63);
    }
    
    public static SubLObject f19020(final SubLObject var280, final SubLObject var147) {
        final SubLThread var281 = SubLProcess.currentSubLThread();
        SubLObject var282 = (SubLObject)NIL;
        final SubLObject var283 = module0144.$g1799$.currentBinding(var281);
        try {
            module0144.$g1799$.bind((SubLObject)makeBoolean(NIL != module0144.$g1799$.getDynamicValue(var281) || NIL == module0035.f1997(var147)), var281);
            SubLObject var284 = Sequences.reverse(var147);
            SubLObject var285 = (SubLObject)NIL;
            var285 = var284.first();
            while (NIL != var284) {
                final SubLObject var286 = module0202.f12834(var285, (SubLObject)UNPROVIDED);
                SubLObject var287;
                SubLObject var288;
                SubLObject var290;
                SubLObject var289;
                SubLObject var291;
                SubLObject var292;
                SubLObject var293;
                SubLObject var14_285;
                SubLObject var294;
                for (var287 = (SubLObject)NIL, var288 = (SubLObject)NIL, var287 = var280, var288 = var287.first(); NIL != var288; var288 = var287.first()) {
                    var289 = (var290 = var288);
                    var291 = (SubLObject)NIL;
                    var292 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var290, var289, (SubLObject)$ic86$);
                    var291 = var290.first();
                    var290 = var290.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var290, var289, (SubLObject)$ic86$);
                    var292 = var290.first();
                    var290 = var290.rest();
                    if (NIL == var290) {
                        if (NIL == f19021(var285) || (!var286.eql(var291) && NIL == module0004.f104(var286, var287, (SubLObject)EQL, (SubLObject)$ic87$))) {
                            var293 = conses_high.subst(var291, var292, var285, Symbols.symbol_function((SubLObject)$ic61$), (SubLObject)UNPROVIDED);
                            if (NIL != module0279.f18515(var293)) {
                                var293 = module0279.f18522(var293, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != module0274.f18101(var293, (SubLObject)UNPROVIDED) && NIL != module0274.f18104(var293, (SubLObject)UNPROVIDED) && NIL == f19022(var293)) {
                                var287 = conses_high.subst(var291, var292, var287, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                                var285 = var293;
                                var14_285 = var282;
                                var294 = (SubLObject)NIL;
                                var294 = var14_285.first();
                                while (NIL != var14_285) {
                                    if (NIL != f19021(var294)) {
                                        conses_high.nsubst(var291, var292, module0202.f12835(var294, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                                    }
                                    var14_285 = var14_285.rest();
                                    var294 = var14_285.first();
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var289, (SubLObject)$ic86$);
                    }
                    var287 = var287.rest();
                }
                var282 = (SubLObject)ConsesLow.cons(var285, var282);
                var284 = var284.rest();
                var285 = var284.first();
            }
        }
        finally {
            module0144.$g1799$.rebind(var283, var281);
        }
        return var282;
    }
    
    public static SubLObject f19021(final SubLObject var148) {
        return (SubLObject)makeBoolean(NIL != module0202.f12871(var148) || NIL != module0202.f12877(var148, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f19022(final SubLObject var148) {
        return module0205.f13334(var148, (SubLObject)$ic88$);
    }
    
    public static SubLObject f19019(final SubLObject var287, final SubLObject var156, final SubLObject var157) {
        SubLObject var288 = (SubLObject)NIL;
        SubLObject var289 = var287;
        SubLObject var290 = (SubLObject)NIL;
        var290 = var289.first();
        while (NIL != var289) {
            SubLObject var292;
            final SubLObject var291 = var292 = var290;
            SubLObject var293 = (SubLObject)NIL;
            SubLObject var294 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var292, var291, (SubLObject)$ic89$);
            var293 = var292.first();
            var292 = (var294 = var292.rest());
            SubLObject var295 = (SubLObject)NIL;
            if (NIL == var295) {
                SubLObject var296 = var156;
                SubLObject var297 = (SubLObject)NIL;
                var297 = var296.first();
                while (NIL == var295 && NIL != var296) {
                    if (NIL != f19023(var294, var297)) {
                        var295 = (SubLObject)T;
                    }
                    var296 = var296.rest();
                    var297 = var296.first();
                }
            }
            if (NIL == var295) {
                SubLObject var296 = var157;
                SubLObject var297 = (SubLObject)NIL;
                var297 = var296.first();
                while (NIL == var295 && NIL != var296) {
                    if (NIL != f19023(var294, var297)) {
                        var295 = (SubLObject)T;
                    }
                    var296 = var296.rest();
                    var297 = var296.first();
                }
            }
            if (NIL != var295) {
                var288 = (SubLObject)ConsesLow.cons(var290, var288);
            }
            var289 = var289.rest();
            var290 = var289.first();
        }
        return Sequences.nreverse(var288);
    }
    
    public static SubLObject f19023(final SubLObject var296, final SubLObject var148) {
        final SubLThread var297 = SubLProcess.currentSubLThread();
        SubLObject var298 = (SubLObject)NIL;
        final SubLObject var299 = $g2637$.currentBinding(var297);
        try {
            $g2637$.bind(var296, var297);
            var298 = module0035.sublisp_boolean(module0205.f13145((SubLObject)$ic90$, var148, (SubLObject)NIL, (SubLObject)UNPROVIDED));
        }
        finally {
            $g2637$.rebind(var299, var297);
        }
        return var298;
    }
    
    public static SubLObject f19024(final SubLObject var298) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12590(var298)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0206.f13501(module0205.f13136(var298)) && NIL != module0004.f104($g2637$.getDynamicValue(var299), module0205.f13203(var298, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        final SubLObject var300 = module0202.f12724($g2637$.getDynamicValue(var299), var298, (SubLObject)UNPROVIDED);
        return module0226.f15101(module0205.f13136(var298), var300, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19025(final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (NIL == module0146.$g2022$.getDynamicValue(var146)) {
            return var145;
        }
        final SubLObject var147 = f19026(var145);
        if (NIL != module0146.$g2023$.getDynamicValue(var146)) {
            return f19027(var147);
        }
        return var147;
    }
    
    public static SubLObject f19028(final SubLObject var145) {
        return Sort.sort(f19026(module0202.f12766(var145)), Symbols.symbol_function((SubLObject)$ic91$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19029(final SubLObject var300, final SubLObject var301) {
        if (Sequences.length(var300).numL(Sequences.length(var301))) {
            return (SubLObject)T;
        }
        return Strings.string_lessp(module0038.f2638(var300), module0038.f2638(var301), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19026(final SubLObject var145) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)$ic92$), var145);
    }
    
    public static SubLObject f19030(final SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        return f19031(module0202.f12765(var62), var249);
    }
    
    public static SubLObject f19032(SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        final SubLThread var250 = SubLProcess.currentSubLThread();
        final SubLObject var251 = module0146.$g2020$.currentBinding(var250);
        try {
            module0146.$g2020$.bind((SubLObject)NIL, var250);
            var62 = module0035.f2113(f18922((SubLObject)ConsesLow.list(var62)));
        }
        finally {
            module0146.$g2020$.rebind(var251, var250);
        }
        return f19030(var62, var249);
    }
    
    public static SubLObject f19031(final SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)NIL;
        final SubLObject var252 = module0146.$g1991$.currentBinding(var250);
        try {
            module0146.$g1991$.bind(var249, var250);
            var250.resetMultipleValues();
            final SubLObject var253 = module0204.f13065(var62);
            final SubLObject var254 = var250.secondMultipleValue();
            var250.resetMultipleValues();
            var251 = Sequences.cconcatenate(module0035.f2076(Symbols.symbol_function((SubLObject)$ic93$), var253), var254);
            var251 = f19033(var251, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var251 = f19034(var251);
            var251 = f19035(var251);
            var251 = module0282.f18719(var251);
        }
        finally {
            module0146.$g1991$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f19035(final SubLObject var147) {
        SubLObject var148 = (SubLObject)NIL;
        SubLObject var149 = (SubLObject)NIL;
        SubLObject var150 = var147;
        SubLObject var151 = (SubLObject)NIL;
        var151 = var150.first();
        while (NIL != var150) {
            if (NIL != module0202.f12592(var151) && NIL != module0202.f12871(conses_high.second(var151))) {
                var149 = (SubLObject)ConsesLow.cons(var151, var149);
            }
            else {
                var148 = (SubLObject)ConsesLow.cons(var151, var148);
            }
            var150 = var150.rest();
            var151 = var150.first();
        }
        return ConsesLow.nconc(Sequences.nreverse(var148), Sequences.nreverse(var149));
    }
    
    public static SubLObject f19034(final SubLObject var147) {
        SubLObject var148 = (SubLObject)NIL;
        SubLObject var149 = (SubLObject)NIL;
        SubLObject var150 = var147;
        SubLObject var151 = (SubLObject)NIL;
        var151 = var150.first();
        while (NIL != var150) {
            if (NIL != module0202.f12592(var151) && NIL != module0202.f12877(conses_high.second(var151), (SubLObject)UNPROVIDED)) {
                var149 = (SubLObject)ConsesLow.cons(var151, var149);
            }
            else {
                var148 = (SubLObject)ConsesLow.cons(var151, var148);
            }
            var150 = var150.rest();
            var151 = var150.first();
        }
        return ConsesLow.nconc(Sequences.nreverse(var148), Sequences.nreverse(var149));
    }
    
    public static SubLObject f19033(final SubLObject var147, SubLObject var304, SubLObject var305, SubLObject var306, SubLObject var307) {
        if (var304 == UNPROVIDED) {
            var304 = (SubLObject)NIL;
        }
        if (var305 == UNPROVIDED) {
            var305 = (SubLObject)NIL;
        }
        if (var306 == UNPROVIDED) {
            var306 = (SubLObject)NIL;
        }
        if (var307 == UNPROVIDED) {
            var307 = var147;
        }
        if (NIL == var147) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var147)) {
            return var147;
        }
        final SubLObject var308 = f19036(var147, var304, var305, var306, var307);
        return (SubLObject)ConsesLow.cons(var308, f19033(Sequences.remove(var308, var147, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f19037(var308, var304), f19038(var308, var304), (SubLObject)ConsesLow.cons(var308, var306), var307));
    }
    
    public static SubLObject f19036(final SubLObject var147, SubLObject var304, SubLObject var305, SubLObject var306, SubLObject var307) {
        if (var304 == UNPROVIDED) {
            var304 = (SubLObject)NIL;
        }
        if (var305 == UNPROVIDED) {
            var305 = (SubLObject)NIL;
        }
        if (var306 == UNPROVIDED) {
            var306 = (SubLObject)NIL;
        }
        if (var307 == UNPROVIDED) {
            var307 = (SubLObject)NIL;
        }
        final SubLThread var308 = SubLProcess.currentSubLThread();
        SubLObject var309 = (SubLObject)NIL;
        final SubLObject var310 = (SubLObject)NIL;
        var309 = f19039(var147, var304, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic94$);
            }
            return var309.first();
        }
        var309 = f19040(var309);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic95$);
            }
            return var309.first();
        }
        var309 = f19041(var309);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic96$);
            }
            return var309.first();
        }
        var309 = f19042(var309, var305);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic97$);
            }
            return var309.first();
        }
        var309 = f19043(var309, var307);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic98$);
            }
            return var309.first();
        }
        var309 = f19044(var309, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic99$);
            }
            return var309.first();
        }
        if (NIL == module0146.$g1985$.getDynamicValue(var308)) {
            return f19045(var309, var147, (SubLObject)UNPROVIDED);
        }
        var309 = module0284.f18861(var309);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic100$);
            }
            return var309.first();
        }
        var309 = module0284.f18861(var147);
        if (NIL != module0035.f1997(var309)) {
            if (NIL != var310) {
                Errors.warn((SubLObject)$ic101$);
            }
            return var309.first();
        }
        return module0284.f18862(var309, var306);
    }
    
    public static SubLObject f19037(final SubLObject var148, SubLObject var304) {
        if (var304 == UNPROVIDED) {
            var304 = (SubLObject)NIL;
        }
        final SubLObject var305 = module0035.f2218(module0202.f12945(var148, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var304, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var305)) {
            return ConsesLow.append(var304, var305);
        }
        return var304;
    }
    
    public static SubLObject f19038(final SubLObject var148, SubLObject var305) {
        if (var305 == UNPROVIDED) {
            var305 = (SubLObject)NIL;
        }
        return ConsesLow.nconc(module0035.f2218(module0202.f12945(var148, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var305, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var305);
    }
    
    public static SubLObject f19046(final SubLObject var311, final SubLObject var304) {
        SubLObject var312 = module0035.f2218(var311, var304, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var313 = var311;
        SubLObject var314 = (SubLObject)NIL;
        var314 = var313.first();
        while (NIL != var313) {
            if (NIL != module0210.f13589(var314)) {
                SubLObject var315 = (SubLObject)NIL;
                if (NIL == var315) {
                    SubLObject var316 = conses_high.second(var314);
                    SubLObject var317 = (SubLObject)NIL;
                    var317 = var316.first();
                    while (NIL == var315 && NIL != var316) {
                        if (NIL == module0004.f104(var317, var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var315 = (SubLObject)T;
                        }
                        var316 = var316.rest();
                        var317 = var316.first();
                    }
                }
                if (NIL == var315) {
                    var312 = Sequences.remove(var314, var312, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            var313 = var313.rest();
            var314 = var313.first();
        }
        return var312;
    }
    
    public static SubLObject f19039(final SubLObject var147, SubLObject var304, SubLObject var249) {
        if (var304 == UNPROVIDED) {
            var304 = (SubLObject)NIL;
        }
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        SubLObject var305 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var306 = f19047(module0202.f12945(var305.first(), var249, (SubLObject)UNPROVIDED), var304);
        SubLObject var307 = (SubLObject)NIL;
        SubLObject var308 = var147.rest();
        SubLObject var309 = (SubLObject)NIL;
        var309 = var308.first();
        while (NIL != var308) {
            var307 = f19047(module0202.f12945(var309, var249, (SubLObject)UNPROVIDED), var304);
            if (var307.numE(var306)) {
                var305 = (SubLObject)ConsesLow.cons(var309, var305);
            }
            else if (var307.numL(var306)) {
                var306 = var307;
                var305 = (SubLObject)ConsesLow.list(var309);
            }
            var308 = var308.rest();
            var309 = var308.first();
        }
        return Sequences.reverse(var305);
    }
    
    public static SubLObject f19047(final SubLObject var311, final SubLObject var304) {
        return Sequences.length(f19046(var311, var304));
    }
    
    public static SubLObject f19048(final SubLObject var311, final SubLObject var304) {
        return Numbers.add(Sequences.length(f19046(var311, var304)), Numbers.multiply((SubLObject)$ic102$, Sequences.length(conses_high.intersection(var311, var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f19040(final SubLObject var147) {
        if (NIL != module0035.f1997(var147)) {
            return var147;
        }
        SubLObject var148 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var149 = module0202.f12839(var148.first(), (SubLObject)UNPROVIDED);
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var151 = var147.rest();
        SubLObject var152 = (SubLObject)NIL;
        var152 = var151.first();
        while (NIL != var151) {
            var150 = module0202.f12839(var152, (SubLObject)UNPROVIDED);
            if (var150.numE(var149)) {
                var148 = (SubLObject)ConsesLow.cons(var152, var148);
            }
            else if (var150.numL(var149)) {
                var149 = var150;
                var148 = (SubLObject)ConsesLow.list(var152);
            }
            var151 = var151.rest();
            var152 = var151.first();
        }
        return Sequences.reverse(var148);
    }
    
    public static SubLObject f19041(final SubLObject var147) {
        if (NIL != module0035.f1997(var147)) {
            return var147;
        }
        SubLObject var148 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var149 = f19049(module0202.f12829(var147.first(), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var151 = var147.rest();
        SubLObject var152 = (SubLObject)NIL;
        var152 = var151.first();
        while (NIL != var151) {
            var150 = f19049(module0202.f12829(var152, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            if (var150.numE(var149)) {
                var148 = (SubLObject)ConsesLow.cons(var152, var148);
            }
            else if (var150.numG(var149)) {
                var149 = var150;
                var148 = (SubLObject)ConsesLow.list(var152);
            }
            var151 = var151.rest();
            var152 = var151.first();
        }
        return Sequences.reverse(var148);
    }
    
    public static SubLObject f19049(final SubLObject var318, SubLObject var319) {
        if (var319 == UNPROVIDED) {
            var319 = var318.first();
        }
        SubLObject var320 = (SubLObject)ZERO_INTEGER;
        final SubLObject var321 = Sequences.length(var318);
        final SubLObject var322 = module0035.f2124(var321, f19050(var321, (SubLObject)TEN_INTEGER));
        SubLObject var323;
        for (var323 = (SubLObject)NIL, var323 = (SubLObject)ZERO_INTEGER; var323.numL(var321); var323 = Numbers.add(var323, (SubLObject)ONE_INTEGER)) {
            if (var319.equal(ConsesLow.nth(var323, var318))) {
                var320 = Numbers.add(var320, ConsesLow.nth(Numbers.subtract(var321, var323, (SubLObject)ONE_INTEGER), var322));
            }
        }
        return var320;
    }
    
    public static SubLObject f19050(final SubLObject var322, SubLObject var323) {
        if (var323 == UNPROVIDED) {
            var323 = (SubLObject)TEN_INTEGER;
        }
        SubLObject var324 = (SubLObject)NIL;
        SubLObject var325 = (SubLObject)ONE_INTEGER;
        SubLObject var326;
        for (var326 = (SubLObject)NIL, var326 = (SubLObject)ZERO_INTEGER; var326.numL(var322); var326 = Numbers.add(var326, (SubLObject)ONE_INTEGER)) {
            var324 = (SubLObject)ConsesLow.cons(var325, var324);
            var325 = Numbers.multiply(var325, var323);
        }
        return Sequences.nreverse(var324);
    }
    
    public static SubLObject f19042(final SubLObject var147, SubLObject var305) {
        if (var305 == UNPROVIDED) {
            var305 = (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var147)) {
            return var147;
        }
        SubLObject var306 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var307 = f19051(module0202.f12829(var147.first(), (SubLObject)UNPROVIDED), var305);
        SubLObject var308 = (SubLObject)NIL;
        SubLObject var309 = var147.rest();
        SubLObject var310 = (SubLObject)NIL;
        var310 = var309.first();
        while (NIL != var309) {
            var308 = f19051(module0202.f12829(var310, (SubLObject)UNPROVIDED), var305);
            if (var308.numE(var307)) {
                var306 = (SubLObject)ConsesLow.cons(var310, var306);
            }
            else if (var308.numG(var307)) {
                var307 = var308;
                var306 = (SubLObject)ConsesLow.list(var310);
            }
            var309 = var309.rest();
            var310 = var309.first();
        }
        return Sequences.reverse(var306);
    }
    
    public static SubLObject f19051(final SubLObject var311, final SubLObject var305) {
        SubLObject var312 = (SubLObject)ZERO_INTEGER;
        SubLObject var313 = (SubLObject)ZERO_INTEGER;
        SubLObject var314 = Sequences.reverse(var311);
        SubLObject var315 = (SubLObject)NIL;
        var315 = var314.first();
        while (NIL != var314) {
            var313 = Numbers.add(var313, (SubLObject)ONE_INTEGER);
            var312 = Numbers.add(var312, Numbers.multiply(Sequences.length(conses_high.member(var315, var305, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)), var313));
            var314 = var314.rest();
            var315 = var314.first();
        }
        return var312;
    }
    
    public static SubLObject f19043(final SubLObject var147, SubLObject var326) {
        if (var326 == UNPROVIDED) {
            var326 = var147;
        }
        return f19052(f19053(var147), f19053(var326));
    }
    
    public static SubLObject f19053(final SubLObject var147) {
        return Sort.stable_sort(conses_high.copy_list(var147), Symbols.symbol_function((SubLObject)$ic103$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19054(final SubLObject var327, final SubLObject var328) {
        if (NIL != module0202.f12592(var327) && NIL == module0202.f12592(var328)) {
            return (SubLObject)T;
        }
        if (NIL == module0202.f12592(var327) && NIL != module0202.f12592(var328)) {
            return (SubLObject)NIL;
        }
        if (!module0202.f12833(var327, (SubLObject)UNPROVIDED).equal(module0202.f12833(var328, (SubLObject)UNPROVIDED))) {
            return f19055(module0202.f12833(var327, (SubLObject)UNPROVIDED), module0202.f12833(var328, (SubLObject)UNPROVIDED));
        }
        return f18965(module0202.f12829(var327, (SubLObject)UNPROVIDED), module0202.f12829(var328, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f19055(final SubLObject var329, final SubLObject var330) {
        if (NIL == module0173.f10955(var329) || NIL == module0173.f10955(var330)) {
            return f18965(var329, var330);
        }
        final SubLObject var331 = Sequences.position(var329, module0146.$g2033$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var332 = Sequences.position(var330, module0146.$g2033$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var331 && NIL != var332) {
            return Numbers.numG(var332, var331);
        }
        if (NIL != var331) {
            return (SubLObject)T;
        }
        if (NIL != var332) {
            return (SubLObject)NIL;
        }
        final SubLObject var333 = module0225.f14739(var329);
        final SubLObject var334 = module0225.f14739(var330);
        if (!var333.eql(var334)) {
            if (NIL != var333 && NIL != var334) {
                return Numbers.numG(var334, var333);
            }
            if (NIL != var333) {
                return (SubLObject)T;
            }
            if (NIL != var334) {
                return (SubLObject)NIL;
            }
        }
        if (NIL != constant_handles_oc.f8449(var329) && NIL != module0167.f10813(var330)) {
            return (SubLObject)T;
        }
        if (NIL != module0167.f10813(var329) && NIL != constant_handles_oc.f8449(var330)) {
            return (SubLObject)T;
        }
        if (NIL != constant_handles_oc.f8449(var329) && NIL != constant_handles_oc.f8449(var330)) {
            return f18964(var329, var330);
        }
        if (NIL != module0167.f10813(var329) && NIL != module0167.f10813(var330)) {
            return f18965(module0172.f10915(var329), module0172.f10915(var330));
        }
        module0202.f12747((SubLObject)ONE_INTEGER, (SubLObject)$ic104$, var329, var330, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19052(final SubLObject var147, SubLObject var326) {
        if (var326 == UNPROVIDED) {
            var326 = var147;
        }
        if (NIL != module0035.f1997(var147)) {
            return var147;
        }
        SubLObject var327 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var328 = f19056(var147.first(), var326, (SubLObject)UNPROVIDED);
        SubLObject var329 = (SubLObject)NIL;
        SubLObject var330 = var147.rest();
        SubLObject var331 = (SubLObject)NIL;
        var331 = var330.first();
        while (NIL != var330) {
            var329 = f19056(var331, var326, (SubLObject)UNPROVIDED);
            if (var329.numE(var328)) {
                var327 = (SubLObject)ConsesLow.cons(var331, var327);
            }
            else if (var329.numG(var328)) {
                var328 = var329;
                var327 = (SubLObject)ConsesLow.list(var331);
            }
            var330 = var330.rest();
            var331 = var330.first();
        }
        return Sequences.reverse(var327);
    }
    
    public static SubLObject f19056(final SubLObject var148, final SubLObject var147, SubLObject var335) {
        if (var335 == UNPROVIDED) {
            var335 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var336 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var336) && NIL == module0004.f104(var148, var147, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic105$, var148, var147);
        }
        final SubLObject var337 = module0202.f12829(var148, (SubLObject)UNPROVIDED);
        SubLObject var338 = f19049(var337, (SubLObject)UNPROVIDED);
        final SubLObject var339 = Sequences.remove(var148, var147, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var340 = (SubLObject)ZERO_INTEGER;
        SubLObject var341 = (SubLObject)NIL;
        SubLObject var342 = (SubLObject)NIL;
        SubLObject var343 = (SubLObject)NIL;
        SubLObject var344 = (SubLObject)NIL;
        SubLObject var345 = (SubLObject)NIL;
        SubLObject var346 = (SubLObject)NIL;
        SubLObject var347 = Sequences.remove_duplicates(var337, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var348 = (SubLObject)NIL;
        var348 = var347.first();
        while (NIL != var347) {
            var340 = Numbers.add(var340, (SubLObject)ONE_INTEGER);
            SubLObject var14_343 = var339;
            SubLObject var349 = (SubLObject)NIL;
            var349 = var14_343.first();
            while (NIL != var14_343) {
                var345 = (SubLObject)NIL;
                var342 = (SubLObject)NIL;
                SubLObject var14_344 = module0202.f12829(var349, (SubLObject)UNPROVIDED);
                SubLObject var350 = (SubLObject)NIL;
                var350 = var14_344.first();
                while (NIL != var14_344) {
                    if (NIL != module0004.f104(var350, var337, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                        var345 = (SubLObject)T;
                    }
                    else {
                        final SubLObject var351 = var350;
                        if (NIL == conses_high.member(var351, var342, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var342 = (SubLObject)ConsesLow.cons(var351, var342);
                        }
                    }
                    var14_344 = var14_344.rest();
                    var350 = var14_344.first();
                }
                if (NIL != var345) {
                    var344 = f19049(module0202.f12829(var349, (SubLObject)UNPROVIDED), var348);
                    var338 = Numbers.add(var338, Numbers.divide(var344, var340));
                    if (NIL != var342) {
                        var346 = (SubLObject)ConsesLow.cons(var349, var346);
                        SubLObject var14_345 = var342;
                        var350 = (SubLObject)NIL;
                        var350 = var14_345.first();
                        while (NIL != var14_345) {
                            var343 = conses_high.assoc(var350, var341, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED).rest();
                            if (NIL != var343) {
                                ConsesLow.rplacd(conses_high.assoc(var350, var341, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), Numbers.add(var343, var344));
                            }
                            else {
                                var341 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var350, var344), var341);
                            }
                            var14_345 = var14_345.rest();
                            var350 = var14_345.first();
                        }
                    }
                }
                var14_343 = var14_343.rest();
                var349 = var14_343.first();
            }
            var347 = var347.rest();
            var348 = var347.first();
        }
        final SubLObject var352 = f19057(var341, Symbols.symbol_function((SubLObject)$ic106$), Symbols.symbol_function((SubLObject)$ic87$));
        SubLObject var353 = (SubLObject)NIL;
        SubLObject var354 = (SubLObject)ZERO_INTEGER;
        SubLObject var355 = var346;
        SubLObject var356 = (SubLObject)NIL;
        var356 = var355.first();
        while (NIL != var355) {
            var344 = f19049(module0205.f13180(var356, (SubLObject)UNPROVIDED), var352);
            if (var344.numG(var354)) {
                var354 = var344;
                var353 = var356;
            }
            var355 = var355.rest();
            var356 = var355.first();
        }
        if (NIL != var353) {
            var338 = Numbers.divide(Numbers.add(var338, f19056(var353, var339, Numbers.multiply(var335, (SubLObject)TEN_INTEGER))), var335);
        }
        return var338;
    }
    
    public static SubLObject f19057(final SubLObject var348, SubLObject var349, SubLObject var350) {
        if (var349 == UNPROVIDED) {
            var349 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var350 == UNPROVIDED) {
            var350 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        SubLObject var351 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var352 = (SubLObject)NIL;
        SubLObject var353 = (SubLObject)NIL;
        SubLObject var354 = var348;
        SubLObject var355 = (SubLObject)NIL;
        var355 = var354.first();
        while (NIL != var354) {
            var352 = Functions.funcall(var349, var355);
            if (var352.numG(var351)) {
                var351 = var352;
                var353 = Functions.funcall(var350, var355);
            }
            var354 = var354.rest();
            var355 = var354.first();
        }
        return var353;
    }
    
    public static SubLObject f19044(final SubLObject var147, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        if (NIL != module0035.f1997(var147)) {
            return var147;
        }
        final SubLObject var250 = var147.first();
        SubLObject var251 = (SubLObject)ConsesLow.list(var250);
        SubLObject var252 = f19058(var250, var249, (SubLObject)UNPROVIDED);
        SubLObject var253 = var147.rest();
        SubLObject var254 = (SubLObject)NIL;
        var254 = var253.first();
        while (NIL != var253) {
            final SubLObject var255 = f19058(var254, var249, (SubLObject)UNPROVIDED);
            if (var255.numE(var252)) {
                var251 = (SubLObject)ConsesLow.cons(var254, var251);
            }
            else if (var255.numL(var252)) {
                var252 = var255;
                var251 = (SubLObject)ConsesLow.list(var254);
            }
            var253 = var253.rest();
            var254 = var253.first();
        }
        return Sequences.reverse(var251);
    }
    
    public static SubLObject f19058(final SubLObject var298, SubLObject var249, SubLObject var353) {
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        if (var353 == UNPROVIDED) {
            var353 = (SubLObject)ONE_INTEGER;
        }
        if (NIL == var298) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL != constant_handles_oc.f8449(var298)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (NIL != Functions.funcall(var249, var298)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (NIL != module0167.f10813(var298)) {
            return Numbers.add((SubLObject)FIVE_INTEGER, Numbers.divide(f19058(module0172.f10915(var298), var249, var353), (SubLObject)TWO_INTEGER));
        }
        if (var298.isString()) {
            return Numbers.add((SubLObject)FOUR_INTEGER, Numbers.divide(Sequences.length(var298), (SubLObject)TWO_INTEGER));
        }
        if (NIL != assertion_handles_oc.f11035(var298)) {
            return Numbers.add((SubLObject)$ic107$, f19058(module0538.f33478(var298, (SubLObject)UNPROVIDED), var249, var353));
        }
        if (var298.isAtom()) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var298.isCons()) {
            return Numbers.add((SubLObject)$ic108$, f19058(var298.first(), var249, var353), Numbers.multiply(var353, f19058(var298.rest(), var249, Numbers.multiply(var353, (SubLObject)$ic109$))));
        }
        return (SubLObject)$ic110$;
    }
    
    public static SubLObject f19059(final SubLObject var147) {
        SubLObject var148 = (SubLObject)NIL;
        SubLObject var149 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var150 = var147;
        SubLObject var151 = (SubLObject)NIL;
        var151 = var150.first();
        while (NIL != var150) {
            final SubLObject var152 = Sequences.position(module0202.f12833(var151, (SubLObject)UNPROVIDED), module0146.$g2033$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var152) {
                if (var149.numG(var152)) {
                    var149 = var152;
                    var148 = (SubLObject)ConsesLow.list(var151);
                }
                else if (var149.numE(var152)) {
                    var148 = (SubLObject)ConsesLow.cons(var151, var148);
                }
            }
            var150 = var150.rest();
            var151 = var150.first();
        }
        if (NIL != module0035.f1997(var148)) {
            return var148.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19027(final SubLObject var145) {
        return var145;
    }
    
    public static SubLObject f19060(final SubLObject var145) {
        return f19061(var145);
    }
    
    public static SubLObject f19061(final SubLObject var145) {
        SubLObject var146 = (SubLObject)NIL;
        SubLObject var147 = var145;
        SubLObject var148 = (SubLObject)NIL;
        var148 = var147.first();
        while (NIL != var147) {
            var146 = (SubLObject)ConsesLow.cons(f19062(var148, var145, (SubLObject)UNPROVIDED), var146);
            var147 = var147.rest();
            var148 = var147.first();
        }
        return Sequences.nreverse(var146);
    }
    
    public static SubLObject f19063(final SubLObject var296, final SubLObject var120) {
        final SubLThread var297 = SubLProcess.currentSubLThread();
        SubLObject var298 = (SubLObject)NIL;
        SubLObject var299 = (SubLObject)NIL;
        if (NIL == var299) {
            SubLObject var300 = f19064(var296, module0146.$g2003$.getDynamicValue(var297));
            SubLObject var301 = (SubLObject)NIL;
            var301 = var300.first();
            while (NIL == var299 && NIL != var300) {
                if (NIL != module0035.f2434(var301, var120)) {
                    if (NIL != var298 || NIL != module0035.f2434(var296, var120)) {
                        var299 = (SubLObject)T;
                    }
                    var298 = (SubLObject)ConsesLow.cons(var301, var298);
                }
                var300 = var300.rest();
                var301 = var300.first();
            }
        }
        return Values.values(var298, var299);
    }
    
    public static SubLObject f19065(final SubLObject var120, SubLObject var357, SubLObject var358) {
        if (var357 == UNPROVIDED) {
            var357 = (SubLObject)NIL;
        }
        if (var358 == UNPROVIDED) {
            var358 = (SubLObject)NIL;
        }
        final SubLThread var359 = SubLProcess.currentSubLThread();
        SubLObject var360 = (SubLObject)NIL;
        SubLObject var361 = module0035.f2269(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic87$), module0146.$g2003$.getDynamicValue(var359)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var362 = (SubLObject)NIL;
        var362 = var361.first();
        while (NIL != var361) {
            var359.resetMultipleValues();
            final SubLObject var363 = f19063(var362, var120);
            final SubLObject var364 = var359.secondMultipleValue();
            var359.resetMultipleValues();
            if ((NIL != var358 || NIL == var364) && NIL != var363) {
                SubLObject var14_360 = var363;
                SubLObject var365 = (SubLObject)NIL;
                var365 = var14_360.first();
                while (NIL != var14_360) {
                    var360 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var365, var362), var360);
                    if (NIL != var357) {
                        module0146.$g2003$.setDynamicValue(conses_high.nsubst(var362, var365, module0146.$g2003$.getDynamicValue(var359), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var359);
                    }
                    var14_360 = var14_360.rest();
                    var365 = var14_360.first();
                }
            }
            var361 = var361.rest();
            var362 = var361.first();
        }
        return var360;
    }
    
    public static SubLObject f19066(final SubLObject var362, final SubLObject var363, SubLObject var357, SubLObject var358) {
        if (var357 == UNPROVIDED) {
            var357 = (SubLObject)NIL;
        }
        if (var358 == UNPROVIDED) {
            var358 = (SubLObject)NIL;
        }
        final SubLThread var364 = SubLProcess.currentSubLThread();
        final SubLObject var365 = f19065(var363, var357, var358);
        if (NIL != var365) {
            final SubLObject var366 = module0146.$g2024$.currentBinding(var364);
            try {
                module0146.$g2024$.bind((SubLObject)NIL, var364);
                module0205.f13255(var365, var362, (SubLObject)UNPROVIDED);
            }
            finally {
                module0146.$g2024$.rebind(var366, var364);
            }
        }
        return var362;
    }
    
    public static SubLObject f19067(final SubLObject var362, final SubLObject var363) {
        final SubLThread var364 = SubLProcess.currentSubLThread();
        SubLObject var365 = (SubLObject)NIL;
        final SubLObject var366 = module0146.$g2031$.currentBinding(var364);
        final SubLObject var367 = module0146.$g2003$.currentBinding(var364);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var364);
            module0146.$g2003$.bind((SubLObject)NIL, var364);
            var365 = f19066(var362, var363, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        finally {
            module0146.$g2003$.rebind(var367, var364);
            module0146.$g2031$.rebind(var366, var364);
        }
        return var365;
    }
    
    public static SubLObject f19068(final SubLObject var120, SubLObject var357, SubLObject var358) {
        if (var357 == UNPROVIDED) {
            var357 = (SubLObject)NIL;
        }
        if (var358 == UNPROVIDED) {
            var358 = (SubLObject)NIL;
        }
        return f19066(var120, var120, var357, var358);
    }
    
    public static SubLObject f18975(final SubLObject var120, SubLObject var357, SubLObject var358) {
        if (var357 == UNPROVIDED) {
            var357 = (SubLObject)NIL;
        }
        if (var358 == UNPROVIDED) {
            var358 = (SubLObject)NIL;
        }
        return f19068(module0202.f12702(var120), var357, var358);
    }
    
    public static SubLObject f19069(final SubLObject var120) {
        return f19068(var120, (SubLObject)NIL, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19070(final SubLObject var296) {
        return Symbols.gentemp(module0038.f2638(var296));
    }
    
    public static SubLObject f19071(final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0146.$g2031$.currentBinding(var146);
        final SubLObject var148 = module0146.$g2003$.currentBinding(var146);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var146);
            module0146.$g2003$.bind((SubLObject)NIL, var146);
            return f19061(var145);
        }
        finally {
            module0146.$g2003$.rebind(var148, var146);
            module0146.$g2031$.rebind(var147, var146);
        }
    }
    
    public static SubLObject f18932(final SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = (SubLObject)NIL;
        }
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)NIL;
        final SubLObject var252 = module0146.$g2031$.currentBinding(var250);
        final SubLObject var253 = module0146.$g2003$.currentBinding(var250);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var250);
            module0146.$g2003$.bind((SubLObject)NIL, var250);
            var251 = f19072(module0202.f12765(var62), var249);
        }
        finally {
            module0146.$g2003$.rebind(var253, var250);
            module0146.$g2031$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f19072(final SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = (SubLObject)NIL;
        }
        return f19062(var62, var62, var249);
    }
    
    public static SubLObject f19062(SubLObject var62, final SubLObject var364, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = (SubLObject)NIL;
        }
        final SubLThread var365 = SubLProcess.currentSubLThread();
        SubLObject var366 = (SubLObject)NIL;
        SubLObject var367 = (SubLObject)NIL;
        SubLObject var368 = (SubLObject)NIL;
        var62 = f19066(var62, var364, (SubLObject)T, (SubLObject)UNPROVIDED);
        if (NIL != module0146.$g2024$.getDynamicValue(var365)) {
            SubLObject var369 = (SubLObject)NIL;
            SubLObject var370 = (SubLObject)NIL;
            SubLObject var371 = (SubLObject)NIL;
            SubLObject var372 = (SubLObject)ZERO_INTEGER;
            final SubLObject var373 = (NIL != var249) ? f19073(var62, var249) : f19073(var62, Symbols.symbol_function((SubLObject)$ic112$));
            if (NIL != var373) {
                var368 = f19074();
                var367 = module0035.f2220(var373, var368, (SubLObject)UNPROVIDED);
                SubLObject var374 = module0205.f13188(var62, Symbols.symbol_function((SubLObject)$ic113$), (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var375 = (SubLObject)NIL;
                var375 = var374.first();
                while (NIL != var374) {
                    SubLObject var14_371 = module0178.f11348(var375);
                    SubLObject var376 = (SubLObject)NIL;
                    var376 = var14_371.first();
                    while (NIL != var14_371) {
                        if (NIL != module0004.f104(var376, var373, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var366 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var376, module0279.f18441(var372, (SubLObject)UNPROVIDED)), var366);
                            var372 = Numbers.add(var372, (SubLObject)ONE_INTEGER);
                        }
                        var14_371 = var14_371.rest();
                        var376 = var14_371.first();
                    }
                    var374 = var374.rest();
                    var375 = var374.first();
                }
                var374 = var373;
                SubLObject var377 = (SubLObject)NIL;
                var377 = var374.first();
                while (NIL != var374) {
                    if (NIL == conses_high.assoc(var377, var366, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL != module0210.f13589(var377)) {
                            module0202.f12747((SubLObject)TWO_INTEGER, (SubLObject)$ic114$, var377, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            var371 = conses_high.last(var377, (SubLObject)UNPROVIDED).first();
                            var370 = conses_high.rassoc(var371, module0146.$g2003$.getDynamicValue(var365), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
                            if (NIL != var370) {
                                var366 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var371, module0279.f18441(var372, (SubLObject)UNPROVIDED)), var366);
                                var369 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var371, var370), var369);
                                var372 = Numbers.add(var372, (SubLObject)ONE_INTEGER);
                            }
                        }
                        else {
                            var366 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var377, module0279.f18441(var372, (SubLObject)UNPROVIDED)), var366);
                            var372 = Numbers.add(var372, (SubLObject)ONE_INTEGER);
                        }
                    }
                    var374 = var374.rest();
                    var377 = var374.first();
                }
                var62 = module0205.f13255(var366, var62, (SubLObject)UNPROVIDED);
                var366 = Sequences.nreverse(conses_high.sublis(var369, var366, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        if (NIL != module0018.$g698$.getDynamicValue(var365)) {
            return (SubLObject)ConsesLow.list(var62, var366, f19075(var366, f19075(var366, var367)));
        }
        return (SubLObject)ConsesLow.list(var62, var366);
    }
    
    public static SubLObject f19074() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic106$), module0146.$g2003$.getDynamicValue(var6));
    }
    
    public static SubLObject f19075(final SubLObject var359, final SubLObject var311) {
        SubLObject var360 = (SubLObject)NIL;
        SubLObject var361 = var359;
        SubLObject var362 = (SubLObject)NIL;
        var362 = var361.first();
        while (NIL != var361) {
            if (NIL != module0004.f104(var362.first(), var311, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var360 = (SubLObject)ConsesLow.cons(var362.first(), var360);
            }
            var361 = var361.rest();
            var362 = var361.first();
        }
        return Sequences.nreverse(var360);
    }
    
    public static SubLObject f19076(final SubLObject var359, final SubLObject var311) {
        SubLObject var360 = (SubLObject)NIL;
        SubLObject var361 = var359;
        SubLObject var362 = (SubLObject)NIL;
        var362 = var361.first();
        while (NIL != var361) {
            if (NIL == module0004.f104(var362.first(), var311, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var360 = (SubLObject)ConsesLow.cons(var362.first(), var360);
            }
            var361 = var361.rest();
            var362 = var361.first();
        }
        return Sequences.nreverse(var360);
    }
    
    public static SubLObject f19064(final SubLObject var319, final SubLObject var372) {
        SubLObject var373 = (SubLObject)NIL;
        SubLObject var374 = var372;
        SubLObject var375 = (SubLObject)NIL;
        var375 = var374.first();
        while (NIL != var374) {
            if (var319.eql(var375.first())) {
                var373 = (SubLObject)ConsesLow.cons(var375.rest(), var373);
            }
            var374 = var374.rest();
            var375 = var374.first();
        }
        return Sequences.nreverse(var373);
    }
    
    public static SubLObject f19073(final SubLObject var62, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = Symbols.symbol_function((SubLObject)$ic54$);
        }
        if (NIL == module0035.f2439(var249, var62, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return module0204.f13087(var62, var249, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19077(final SubLObject var1) {
        module0035.f2258(Symbols.symbol_function((SubLObject)$ic54$), Symbols.symbol_function((SubLObject)$ic115$), var1, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19078(final SubLObject var373) {
        final SubLThread var374 = SubLProcess.currentSubLThread();
        var374.resetMultipleValues();
        final SubLObject var375 = f19079(var373);
        final SubLObject var376 = var374.secondMultipleValue();
        var374.resetMultipleValues();
        if (var375.isInteger() && var376.isSymbol() && var375.numGE((SubLObject)ZERO_INTEGER)) {
            final SubLObject var377 = Hashtables.gethash(var376, module0146.$g2031$.getDynamicValue(var374), (SubLObject)UNPROVIDED);
            if (!var377.isInteger() || var375.numG(var377)) {
                Hashtables.sethash(var376, module0146.$g2031$.getDynamicValue(var374), var375);
                return var375;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19079(final SubLObject var319) {
        if (var319.isSymbol()) {
            SubLObject var320;
            SubLObject var321;
            SubLObject var322;
            SubLObject var323;
            for (var320 = Symbols.symbol_name(var319), var321 = (SubLObject)NIL, var322 = (SubLObject)NIL, var323 = (SubLObject)NIL, var321 = module0038.f2702((SubLObject)Characters.CHAR_hyphen, var320, (SubLObject)UNPROVIDED), var322 = (SubLObject)(var321.isInteger() ? Numbers.add((SubLObject)ONE_INTEGER, var321) : NIL), var323 = (SubLObject)(var322.isInteger() ? module0038.f2720(Symbols.symbol_function((SubLObject)$ic116$), var320, var322, (SubLObject)UNPROVIDED) : NIL); NIL != var322 && (NIL == module0035.f2002(var320, var322, (SubLObject)UNPROVIDED) || NIL == Characters.digit_char_p(Vectors.aref(var320, var322), (SubLObject)UNPROVIDED) || NIL != var323); var322 = (SubLObject)(var321.isInteger() ? Numbers.add((SubLObject)ONE_INTEGER, var321) : NIL), var323 = (SubLObject)(var322.isInteger() ? module0038.f2720(Symbols.symbol_function((SubLObject)$ic116$), var320, var322, (SubLObject)UNPROVIDED) : NIL)) {
                var321 = module0038.f2702((SubLObject)Characters.CHAR_hyphen, var320, var322);
            }
            if (var322.isInteger()) {
                final SubLObject var324 = reader.read_from_string(module0038.f2623(var320, var322, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var324.isInteger()) {
                    return Values.values(var324, Packages.intern(module0038.f2623(var320, (SubLObject)ZERO_INTEGER, var321), (SubLObject)UNPROVIDED));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18894(final SubLObject var145, final SubLObject var2) {
        return f19080(var145, var2, (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f18919(final SubLObject var145, final SubLObject var2) {
        return f19080(var145, var2, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f19080(SubLObject var145, SubLObject var2, final SubLObject var379, final SubLObject var380) {
        final SubLThread var381 = SubLProcess.currentSubLThread();
        final SubLObject var382 = var2;
        final SubLObject var383 = module0147.$g2095$.currentBinding(var381);
        final SubLObject var384 = module0147.$g2094$.currentBinding(var381);
        final SubLObject var385 = module0147.$g2096$.currentBinding(var381);
        try {
            module0147.$g2095$.bind(module0147.f9545(var382), var381);
            module0147.$g2094$.bind(module0147.f9546(var382), var381);
            module0147.$g2096$.bind(module0147.f9549(var382), var381);
            if (NIL == module0206.f13427(var145)) {
                if (NIL != var379 && NIL != f19081(var145)) {
                    var145 = (SubLObject)ConsesLow.list(var145);
                }
                else {
                    if (NIL != var380) {
                        var145 = module0286.f19107(var145);
                    }
                    var145 = module0288.f19367(var145);
                    var145 = f18922(var145);
                    var145 = f19025(var145);
                    var145 = f19060(var145);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var385, var381);
            module0147.$g2094$.rebind(var384, var381);
            module0147.$g2095$.rebind(var383, var381);
        }
        var381.resetMultipleValues();
        final SubLObject var381_382 = f19082(var145, var2);
        final SubLObject var383_384 = var381.secondMultipleValue();
        var381.resetMultipleValues();
        var145 = var381_382;
        var2 = var383_384;
        var381.resetMultipleValues();
        final SubLObject var385_386 = f19083(var145, var2);
        final SubLObject var387_388 = var381.secondMultipleValue();
        var381.resetMultipleValues();
        var145 = var385_386;
        var2 = var387_388;
        var381.resetMultipleValues();
        final SubLObject var389_390 = f19084(var145, var2);
        final SubLObject var391_392 = var381.secondMultipleValue();
        var381.resetMultipleValues();
        var145 = var389_390;
        var2 = var391_392;
        return Values.values(var145, var2);
    }
    
    public static SubLObject f19081(final SubLObject var145) {
        if (NIL != module0035.f1997(var145)) {
            final SubLObject var146 = var145.first();
            if (NIL != module0204.f13044(var146)) {
                final SubLObject var147 = module0232.f15308(var146).first();
                return (SubLObject)makeBoolean(NIL != module0004.f104(module0205.f13136(var147), (SubLObject)$ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0202.f12689(var147, Symbols.symbol_function((SubLObject)$ic54$)) && NIL == module0202.f12665(var147));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19082(final SubLObject var145, final SubLObject var393) {
        return Values.values(var145, var393);
    }
    
    public static SubLObject f19083(final SubLObject var394, SubLObject var2) {
        final SubLObject var395 = module0279.f18498(var394);
        if (NIL == module0204.f13059(var395) && NIL != module0279.f18591(var395)) {
            var2 = $ic19$;
        }
        return Values.values(var394, var2);
    }
    
    public static SubLObject f19084(final SubLObject var145, final SubLObject var2) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (NIL == var145 || NIL != module0206.f13427(var145)) {
            return Values.values(var145, var2);
        }
        SubLObject var147 = (SubLObject)NIL;
        final SubLObject var148 = module0206.$g2324$.currentBinding(var146);
        try {
            module0206.$g2324$.bind((SubLObject)NIL, var146);
            SubLObject var149 = var145;
            SubLObject var150 = (SubLObject)NIL;
            var150 = var149.first();
            while (NIL != var149) {
                final SubLObject var151 = var150.first();
                SubLObject var152;
                SubLObject var153;
                SubLObject var154;
                for (var152 = (SubLObject)NIL, var153 = (SubLObject)NIL, var153 = module0232.f15306(var151); NIL == var152 && NIL != var153; var153 = var153.rest()) {
                    var154 = var153.first();
                    if (NIL == module0206.f13425(var154)) {
                        var152 = (SubLObject)T;
                    }
                }
                for (var153 = (SubLObject)NIL, var153 = module0232.f15308(var151); NIL == var152 && NIL != var153; var153 = var153.rest()) {
                    var154 = var153.first();
                    if (NIL == module0206.f13425(var154)) {
                        var152 = (SubLObject)T;
                    }
                }
                if (NIL == var152) {
                    var147 = (SubLObject)ConsesLow.cons(var150, var147);
                }
                var149 = var149.rest();
                var150 = var149.first();
            }
        }
        finally {
            module0206.$g2324$.rebind(var148, var146);
        }
        return Values.values(Sequences.nreverse(var147), var2);
    }
    
    public static SubLObject f18921(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return (SubLObject)makeBoolean(NIL != module0018.f980() && NIL != module0348.f23381(var2));
    }
    
    public static SubLObject f19085(final SubLObject var370) {
        final SubLThread var371 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var370) : var370;
        var371.resetMultipleValues();
        final SubLObject var372 = module0289.f19396(var370);
        final SubLObject var373 = var371.secondMultipleValue();
        var371.resetMultipleValues();
        return (SubLObject)makeBoolean(NIL == module0035.f2169(var370, module0538.f33373(var372, var373)));
    }
    
    public static SubLObject f19086(final SubLObject var370) {
        assert NIL != assertion_handles_oc.f11035(var370) : var370;
        return (SubLObject)makeBoolean(NIL == module0004.f104(var370, module0543.f33697(module0290.f19495(var370), module0178.f11287(var370)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f19087(SubLObject var229, SubLObject var230) {
        if (NIL != module0202.f12590(var229)) {
            var229 = module0202.f12763(var229);
        }
        if (NIL != module0202.f12590(var230)) {
            var230 = module0202.f12763(var230);
        }
        return Equality.equal(f18877(var229), f18877(var230));
    }
    
    public static SubLObject f19088(final SubLObject var400, final SubLObject var401, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = Symbols.symbol_function((SubLObject)$ic117$);
        }
        return Equality.equal(f18932(f19030(f18939(f19017(f18939(module0202.f12765(var400)))), var249), (SubLObject)UNPROVIDED).first(), f18932(f19030(f18939(f19017(f18939(module0202.f12765(var401)))), var249), (SubLObject)UNPROVIDED).first());
    }
    
    public static SubLObject f19089(final SubLObject var147) {
        SubLObject var148 = (SubLObject)NIL;
        SubLObject var149 = (SubLObject)NIL;
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var151 = var147;
        SubLObject var152 = (SubLObject)NIL;
        var152 = var151.first();
        while (NIL != var151) {
            final SubLObject var153 = module0202.f12839(var152, (SubLObject)UNPROVIDED);
            if (NIL == module0004.f104(var153, var150, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != module0004.f104(var153, var149, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var154 = Sequences.position(var153, var149, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var149 = module0035.f2045(var154, var149);
                    var148 = module0035.f2045(var154, var148);
                    var150 = (SubLObject)ConsesLow.cons(var153, var150);
                }
                else {
                    var149 = (SubLObject)ConsesLow.cons(var153, var149);
                    var148 = (SubLObject)ConsesLow.cons(var152, var148);
                }
            }
            var151 = var151.rest();
            var152 = var151.first();
        }
        if (NIL != var149) {
            return ConsesLow.nth(Sequences.position(Functions.apply(Symbols.symbol_function((SubLObject)$ic118$), var149), var149, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var148);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19090(final SubLObject var147) {
        final SubLObject var148 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic119$), var147);
        SubLObject var149 = (SubLObject)NIL;
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var151 = var148;
        SubLObject var152 = (SubLObject)NIL;
        var152 = var151.first();
        while (NIL != var151) {
            if (NIL == module0004.f104(var152, var150, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                if (NIL != module0004.f104(var152, var149, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var149 = Sequences.delete(var152, var149, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var150 = (SubLObject)ConsesLow.cons(var152, var150);
                }
                else {
                    var149 = (SubLObject)ConsesLow.cons(var152, var149);
                }
            }
            var151 = var151.rest();
            var152 = var151.first();
        }
        if (NIL != var149) {
            return ConsesLow.nth(Sequences.position(module0035.f2400(var149), var148, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var147);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19045(final SubLObject var147, SubLObject var410, SubLObject var249) {
        if (var410 == UNPROVIDED) {
            var410 = (SubLObject)NIL;
        }
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        final SubLObject var411 = f19059(var147);
        if (NIL != var411) {
            return var411;
        }
        return f19091(var147, var410, var249);
    }
    
    public static SubLObject f19091(final SubLObject var147, SubLObject var410, SubLObject var249) {
        if (var410 == UNPROVIDED) {
            var410 = (SubLObject)NIL;
        }
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        if (NIL != module0035.f1997(var147)) {
            return var147.first();
        }
        return f19092(var147, var410, var249);
    }
    
    public static SubLObject f19092(final SubLObject var147, SubLObject var410, SubLObject var249) {
        if (var410 == UNPROVIDED) {
            var410 = var147;
        }
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        SubLObject var411 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var412 = module0038.f2638(module0202.f12941(var411.first(), var249));
        SubLObject var413 = var147.rest();
        SubLObject var414 = (SubLObject)NIL;
        var414 = var413.first();
        while (NIL != var413) {
            final SubLObject var415 = module0038.f2638(module0202.f12941(var414, var249));
            if (NIL != Strings.stringL(var415, var412, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var412 = var415;
                var411 = (SubLObject)ConsesLow.list(var414);
            }
            else if (NIL != Strings.stringE(var415, var412, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var411 = (SubLObject)ConsesLow.cons(var414, var411);
            }
            var413 = var413.rest();
            var414 = var413.first();
        }
        if (NIL != module0035.f1997(var411)) {
            return var411.first();
        }
        final SubLObject var416 = f19093(module0035.f2218(var147, var411, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        if (NIL != module0035.f1997(var416)) {
            return var416.first();
        }
        final SubLObject var417 = f19093(module0035.f2218(var410, var147, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        if (NIL != module0035.f1997(var417)) {
            return var417.first();
        }
        final SubLObject var418 = f19093(var410);
        if (NIL != module0035.f1997(var418)) {
            return var418.first();
        }
        final SubLObject var419 = (NIL != var411) ? Sequences.length(var411) : Numbers.$most_positive_fixnum$.getGlobalValue();
        final SubLObject var420 = (NIL != var416) ? Sequences.length(var416) : Numbers.$most_positive_fixnum$.getGlobalValue();
        final SubLObject var421 = (NIL != var417) ? Sequences.length(var417) : Numbers.$most_positive_fixnum$.getGlobalValue();
        final SubLObject var422 = (NIL != var418) ? Sequences.length(var418) : Numbers.$most_positive_fixnum$.getGlobalValue();
        final SubLObject var423 = Numbers.min(var419, new SubLObject[] { var420, var421, var422 });
        if (var423.numE(var419)) {
            return f19094(f19053(var411), var249);
        }
        if (var423.numE(var420)) {
            return f19094(f19053(var416), var249);
        }
        if (var423.numE(var421)) {
            return f19094(f19053(var417), var249);
        }
        if (var423.numE(var422)) {
            return f19094(f19053(var418), var249);
        }
        return f19094(f19053(var147), var249);
    }
    
    public static SubLObject f19094(final SubLObject var147, SubLObject var249) {
        if (var249 == UNPROVIDED) {
            var249 = module0146.$g1991$.getDynamicValue();
        }
        if (NIL != module0035.f2439(var249, var147, (SubLObject)UNPROVIDED)) {
            return f19092(var147, var147, Symbols.symbol_function((SubLObject)$ic120$));
        }
        return var147.first();
    }
    
    public static SubLObject f18963(final SubLObject var229, final SubLObject var230) {
        if (var229.isAtom()) {
            if (var230.isAtom()) {
                return f19095(var229, var230);
            }
            return (SubLObject)T;
        }
        else {
            if (var230.isAtom()) {
                return (SubLObject)NIL;
            }
            return f19096(var229, var230);
        }
    }
    
    public static SubLObject f19095(final SubLObject var239, final SubLObject var240) {
        final SubLThread var241 = SubLProcess.currentSubLThread();
        if (NIL == module0146.$g2037$.getDynamicValue(var241) && var239.equal(var240)) {
            return (SubLObject)T;
        }
        if (NIL != constant_handles_oc.f8449(var239)) {
            if (NIL != constant_handles_oc.f8449(var240)) {
                return f18964(var239, var240);
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != constant_handles_oc.f8449(var240)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0167.f10813(var239)) {
                if (NIL != module0167.f10813(var240)) {
                    return Numbers.numL(module0167.f10803(var239), module0167.f10803(var240));
                }
                return (SubLObject)T;
            }
            else {
                if (NIL != module0167.f10813(var240)) {
                    return (SubLObject)NIL;
                }
                if (NIL != module0201.f12546(var239)) {
                    if (NIL != module0201.f12546(var240)) {
                        return Strings.string_lessp(Symbols.symbol_name(var239), Symbols.symbol_name(var240), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    return (SubLObject)T;
                }
                else {
                    if (NIL != module0201.f12546(var240)) {
                        return (SubLObject)NIL;
                    }
                    if (NIL != module0201.f12581(var239)) {
                        if (NIL != module0201.f12581(var240)) {
                            return Numbers.numL(module0193.f12073(var239), module0193.f12073(var240));
                        }
                        return (SubLObject)T;
                    }
                    else {
                        if (NIL != module0201.f12581(var239)) {
                            return (SubLObject)NIL;
                        }
                        if (var239.isSymbol()) {
                            if (var240.isSymbol()) {
                                return Strings.string_lessp(Symbols.symbol_name(var239), Symbols.symbol_name(var240), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            return (SubLObject)T;
                        }
                        else {
                            if (var240.isSymbol()) {
                                return (SubLObject)NIL;
                            }
                            if (var239.isNumber()) {
                                if (var240.isNumber()) {
                                    return Numbers.numL(var239, var240);
                                }
                                return (SubLObject)T;
                            }
                            else {
                                if (var240.isNumber()) {
                                    return (SubLObject)NIL;
                                }
                                if (var239.isChar()) {
                                    if (var240.isChar()) {
                                        return Characters.char_lessp(var239, var240);
                                    }
                                    return (SubLObject)T;
                                }
                                else {
                                    if (var240.isChar()) {
                                        return (SubLObject)NIL;
                                    }
                                    if (var239.isString()) {
                                        if (var240.isString()) {
                                            return Strings.string_lessp(var239, var240, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        return (SubLObject)T;
                                    }
                                    else {
                                        if (var240.isString()) {
                                            return (SubLObject)NIL;
                                        }
                                        return Strings.string_lessp(module0038.f2638(var239), module0038.f2638(var240), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static SubLObject f19096(final SubLObject var420, final SubLObject var421) {
        final SubLObject var422 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic54$), var420, (SubLObject)UNPROVIDED);
        final SubLObject var423 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic54$), var421, (SubLObject)UNPROVIDED);
        if (var422.numL(var423)) {
            return (SubLObject)T;
        }
        if (var422.numG(var423)) {
            return (SubLObject)NIL;
        }
        final SubLObject var424 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic55$), var420, (SubLObject)UNPROVIDED);
        final SubLObject var425 = module0035.f2451(Symbols.symbol_function((SubLObject)$ic55$), var421, (SubLObject)UNPROVIDED);
        if (var424.numL(var425)) {
            return (SubLObject)T;
        }
        if (var424.numG(var425)) {
            return (SubLObject)NIL;
        }
        if (!var420.first().equal(var421.first()) && NIL != f18953(var420.first(), var421.first())) {
            return (SubLObject)T;
        }
        if (!var420.first().equal(var421.first()) && NIL != f18953(var421.first(), var420.first())) {
            return (SubLObject)NIL;
        }
        return f18953(var420.rest(), var421.rest());
    }
    
    public static SubLObject f19093(final SubLObject var147) {
        SubLObject var148;
        SubLObject var149;
        for (var148 = (SubLObject)NIL, var149 = (SubLObject)NIL, var148 = f19097(var147), var149 = module0035.f2218(var147, var148, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED); NIL == module0035.f1997(var148) && NIL != var149; var148 = f19097(var149), var149 = module0035.f2218(var149, var148, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {}
        if (NIL != var148) {
            return var148;
        }
        if (NIL != var149) {
            return var149;
        }
        if (NIL != var147) {
            return var147;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19097(final SubLObject var147) {
        if (NIL == var147) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var147)) {
            return var147;
        }
        final SubLObject var148 = f19098(var147);
        if (NIL != module0035.f1997(var148)) {
            return var148;
        }
        final SubLObject var149 = f19099(var147);
        if (NIL != module0035.f1997(var149)) {
            return var149;
        }
        if (Sequences.length(var148).numLE(Sequences.length(var149))) {
            return var148;
        }
        return var149;
    }
    
    public static SubLObject f19098(final SubLObject var147) {
        SubLObject var148 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var149 = f19100(var148.first());
        SubLObject var150 = var147.rest();
        SubLObject var151 = (SubLObject)NIL;
        var151 = var150.first();
        while (NIL != var150) {
            final SubLObject var152 = f19100(var151);
            if (var152.numL(var149)) {
                var149 = var152;
                var148 = (SubLObject)ConsesLow.list(var151);
            }
            else if (var152.numE(var149)) {
                var148 = (SubLObject)ConsesLow.cons(var151, var148);
            }
            var150 = var150.rest();
            var151 = var150.first();
        }
        return var148;
    }
    
    public static SubLObject f19101(final SubLObject var428) {
        return module0035.f2419(var428, Symbols.symbol_function((SubLObject)$ic121$));
    }
    
    public static SubLObject f19102(final SubLObject var429, final SubLObject var430) {
        if (var429.eql(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            return (SubLObject)NIL;
        }
        if (var430.eql(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            return (SubLObject)T;
        }
        return constants_high_oc.f10760(var429, var430);
    }
    
    public static SubLObject f19103(final SubLObject var429, final SubLObject var430) {
        return (SubLObject)makeBoolean(NIL == f19102(var429, var430) && !var429.equal(var430));
    }
    
    public static SubLObject f19099(final SubLObject var147) {
        SubLObject var148 = (SubLObject)ConsesLow.list(var147.first());
        SubLObject var149 = f19100(var148.first());
        SubLObject var150 = var147.rest();
        SubLObject var151 = (SubLObject)NIL;
        var151 = var150.first();
        while (NIL != var150) {
            final SubLObject var152 = f19100(var151);
            if (NIL != f19103(var152, var149)) {
                var149 = var152;
                var148 = (SubLObject)ConsesLow.list(var151);
            }
            else if (var152.equal(var149)) {
                var148 = (SubLObject)ConsesLow.cons(var151, var148);
            }
            var150 = var150.rest();
            var151 = var150.first();
        }
        return var148;
    }
    
    public static SubLObject f19100(final SubLObject var183) {
        final SubLObject var184 = module0205.f13183(var183, Symbols.symbol_function((SubLObject)$ic122$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var185 = f19101(var184);
        if (NIL != constants_high_oc.f10734(var185)) {
            return var185;
        }
        return Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    
    public static SubLObject f19104() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18867", "EL-TO-HL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18869", "EL-TO-HL-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18871", "S#21490", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18873", "S#21491", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18875", "CANONICALIZE-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18879", "S#21043", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18881", "S#21492", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18880", "S#21493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18882", "S#21494", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18883", "S#21495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18884", "S#14914", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18886", "S#21496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18888", "S#21497", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18868", "CANONICALIZE-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18872", "S#21498", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18896", "S#21499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18895", "S#21500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18897", "CANONICALIZE-CYCL-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18898", "S#21056", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18874", "CANONICALIZE-WF-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18899", "S#21044", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18901", "S#21501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18900", "S#21502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18902", "S#21503", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18903", "S#21045", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18905", "S#21504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18904", "S#21505", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18906", "CANONICALIZE-ASK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18908", "S#21506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18909", "S#21054", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18911", "S#21507", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18912", "TEST-CANONICALIZE-ASSERT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18913", "S#13460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18914", "S#21050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18885", "S#21508", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18915", "TEST-CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18887", "S#21509", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18916", "S#21510", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18917", "S#21511", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18918", "S#21512", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18870", "CANONICALIZE-QUERY", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18910", "CANONICALIZE-QUERY-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18920", "S#21513", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18893", "S#21514", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18907", "S#21515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18889", "S#20634", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18892", "S#20876", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18890", "S#21516", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18891", "S#20643", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18922", "S#21517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18923", "S#21518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18928", "S#21468", 1, 0, false);
        new $f18928$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18929", "S#21519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18930", "S#21520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18931", "S#21521", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18933", "S#19517", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18924", "S#21522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18934", "S#21523", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18935", "S#21469", 1, 0, false);
        new $f18935$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18936", "S#21524", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18937", "S#21470", 1, 1, false);
        new $f18937$UnaryFunction();
        new $f18937$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18938", "S#21525", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18876", "S#21526", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18925", "S#21527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18939", "S#21048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18940", "S#21471", 1, 0, false);
        new $f18940$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18941", "S#21528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18942", "S#21529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18943", "S#16037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18944", "S#21472", 1, 0, false);
        new $f18944$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18948", "S#16038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18946", "S#15490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18945", "S#21530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18877", "S#21531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18951", "S#16034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18952", "S#21532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18949", "S#21533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18954", "S#21534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18950", "S#21535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18955", "S#21536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18947", "S#21537", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18957", "S#16036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18958", "S#20652", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18956", "S#21538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18960", "S#21539", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18959", "S#21540", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18953", "S#21473", 2, 0, false);
        new $f18953$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18962", "S#21541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18964", "S#21542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18961", "S#21543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18965", "S#21544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18966", "S#21545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18926", "S#21546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18969", "S#21547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18970", "S#21548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18967", "S#21549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18974", "EQUAL-WRT-SVM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18972", "S#21550", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18973", "S#21551", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18976", "S#21552", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18977", "S#21553", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18878", "S#21554", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18979", "S#21555", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18981", "S#21556", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18985", "S#21557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18968", "S#21558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18986", "S#21559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18980", "S#21560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18988", "S#21561", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18987", "S#21562", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18990", "S#21563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18983", "S#21564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18984", "S#21565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18993", "CYC-FIND-OR-CREATE-NART", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18994", "S#21566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18992", "S#21049", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18995", "S#21567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18996", "S#21568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18997", "S#21569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18998", "S#21570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18999", "S#21571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18991", "S#21572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19000", "S#21573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19001", "S#21574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19002", "S#21575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18971", "S#21576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19003", "S#21577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19004", "S#21478", 1, 0, false);
        new $f19004$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19006", "S#21578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19005", "S#21479", 1, 1, false);
        new $f19005$UnaryFunction();
        new $f19005$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19008", "S#21579", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18978", "S#21580", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19009", "S#21581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19010", "S#21582", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19011", "S#21583", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19007", "S#21584", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19012", "S#21585", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19013", "S#21586", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18989", "S#21587", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19014", "S#21588", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18982", "S#21589", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19015", "S#21590", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19016", "S#21591", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18927", "S#21592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19017", "S#21593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19018", "S#21594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19020", "S#21595", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19021", "S#21596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19022", "S#21597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19019", "S#21598", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19023", "S#21599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19024", "S#21600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19025", "S#21601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19028", "S#21602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19029", "S#21603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19026", "S#21604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19030", "S#21047", 1, 1, false);
        new $f19030$UnaryFunction();
        new $f19030$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19032", "S#21605", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19031", "S#21606", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19035", "S#21607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19034", "S#21608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19033", "S#21609", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19036", "S#21610", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19037", "S#21611", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19038", "S#21612", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19046", "S#21613", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19039", "S#21614", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19047", "S#21615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19048", "S#21616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19040", "S#21617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19041", "S#21618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19049", "S#21619", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19050", "S#21620", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19042", "S#21621", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19051", "S#21622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19043", "S#21623", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19053", "S#21624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19054", "S#21483", 2, 0, false);
        new $f19054$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19055", "S#21625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19052", "S#21626", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19056", "S#21627", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19057", "S#21628", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19044", "S#21629", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19058", "S#21630", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19059", "S#21375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19027", "S#21631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19060", "S#21632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19061", "S#21633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19063", "S#21634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19065", "S#21635", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19066", "S#21636", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19067", "S#21637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19068", "S#21244", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18975", "S#21638", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19069", "S#21249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19070", "S#21040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19071", "S#21639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18932", "S#18222", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19072", "S#21640", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19062", "S#21484", 2, 1, false);
        new $f19062$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19074", "S#21641", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19075", "S#21642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19076", "S#21643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19064", "S#21644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19073", "S#21645", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19077", "S#21243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19078", "S#21485", 1, 0, false);
        new $f19078$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19079", "S#21246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18894", "S#21646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18919", "S#21647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19080", "S#21648", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19081", "S#21649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19082", "S#21650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19083", "S#21651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19084", "S#21652", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18921", "S#21653", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19085", "S#21654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19086", "S#21655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19087", "S#21656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19088", "S#21657", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19089", "S#21658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19090", "S#21659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19045", "S#21660", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19091", "S#21661", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19092", "S#21662", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19094", "S#21663", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f18963", "S#21664", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19095", "S#21665", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19096", "S#21666", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19093", "S#21667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19097", "S#21668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19098", "S#21669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19101", "S#21670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19102", "S#21671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19103", "S#21672", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19099", "S#21673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0285", "f19100", "S#21674", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19105() {
        $g2635$ = SubLFiles.defparameter("S#21675", (SubLObject)NIL);
        $g2636$ = SubLFiles.defparameter("S#21676", (SubLObject)$ic42$);
        $g2613$ = SubLFiles.defparameter("S#21677", (SubLObject)$ic58$);
        $g2637$ = SubLFiles.defparameter("S#21678", (SubLObject)$ic58$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19106() {
        module0012.f368((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic5$, (SubLObject)$ic2$, (SubLObject)$ic6$, (SubLObject)$ic4$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)NIL, (SubLObject)NIL);
        module0034.f1895((SubLObject)$ic10$);
        module0034.f1895((SubLObject)$ic22$);
        module0034.f1895((SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f19104();
    }
    
    public void initializeVariables() {
        f19105();
    }
    
    public void runTopLevelForms() {
        f19106();
    }
    
    static {
        me = (SubLFile)new module0285();
        $g2635$ = null;
        $g2636$ = null;
        $g2613$ = null;
        $g2637$ = null;
        $ic0$ = makeSymbol("S#12753", "CYC");
        $ic1$ = makeSymbol("EL-TO-HL");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic3$ = makeString("Translate el expression FORMULA into its equivalent canonical hl expressions");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("S#12753", "CYC")));
        $ic5$ = makeSymbol("EL-TO-HL-QUERY");
        $ic6$ = makeString("Translate el query FORMULA into its equivalent hl expressions");
        $ic7$ = makeSymbol("CANONICALIZE-TERM");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("*MT*")));
        $ic9$ = makeString("Converts the EL term TERM to its canonical HL representation.\n   @return HL term");
        $ic10$ = makeSymbol("S#21493", "CYC");
        $ic11$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic12$ = makeSymbol("FORT-P");
        $ic13$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic14$ = makeSymbol("S#20876", "CYC");
        $ic15$ = makeKeyword("CNF");
        $ic16$ = makeSymbol("S#16405", "CYC");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("skolem"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("termDependsOn"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic20$ = makeSymbol("SKOLEM-FUNCTION-P");
        $ic21$ = makeSymbol("S#16278", "CYC");
        $ic22$ = makeSymbol("S#21502", "CYC");
        $ic23$ = makeSymbol("S#21505", "CYC");
        $ic24$ = makeSymbol("EL-WFF-SYNTAX?");
        $ic25$ = makeKeyword("DNF");
        $ic26$ = makeString("Unknown clausal form ~s");
        $ic27$ = makeSymbol("S#21468", "CYC");
        $ic28$ = makeSymbol("S#16276", "CYC");
        $ic29$ = makeSymbol("S#12629", "CYC");
        $ic30$ = makeSymbol("S#16275", "CYC");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("Quote"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("EscapeQuote"));
        $ic33$ = makeSymbol("S#15534", "CYC");
        $ic34$ = makeSymbol("S#13440", "CYC");
        $ic35$ = makeSymbol("S#21469", "CYC");
        $ic36$ = makeKeyword("NEG");
        $ic37$ = makeSymbol("S#21470", "CYC");
        $ic38$ = makeKeyword("POS");
        $ic39$ = makeSymbol("S#13439", "CYC");
        $ic40$ = makeString("Tried to canonicalize the formula terms of ~A, but it did not have the syntax of an EL relation.");
        $ic41$ = makeSymbol("S#21471", "CYC");
        $ic42$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")));
        $ic43$ = makeSymbol("S#21472", "CYC");
        $ic44$ = makeSymbol("S#21473", "CYC");
        $ic45$ = makeKeyword("HELLO-YOU-SILLY-COMPILER");
        $ic46$ = makeKeyword("IGNORE");
        $ic47$ = makeKeyword("DUMMY");
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("commutativeInArgsAndRest"));
        $ic49$ = makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");
        $ic50$ = makeKeyword("CYCLIC-COMMUTATIVE-IN-ARGS");
        $ic51$ = makeSymbol("<");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("commutativeInArgs"));
        $ic53$ = makeSymbol("GAF-FORMULA");
        $ic54$ = makeSymbol("EL-VAR?");
        $ic55$ = makeSymbol("ATOM");
        $ic56$ = makeString("warning: trying to sort the variables ~A and ~A~%");
        $ic57$ = makeString("warning: trying to string-sort the atoms ~A and ~A~%");
        $ic58$ = makeKeyword("UNINITIALIZED");
        $ic59$ = makeSymbol("S#21549", "CYC");
        $ic60$ = makeSymbol("S#3851", "CYC");
        $ic61$ = makeSymbol("EQUAL-WRT-SVM");
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("ReifiableFunction"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("CycLReifiableDenotationalTerm"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("EvaluatableFunction"));
        $ic65$ = makeSymbol("S#12280", "CYC");
        $ic66$ = makeString("Tried to reify functions within ~A, but it was not a relation expression.");
        $ic67$ = makeSymbol("S#12278", "CYC");
        $ic68$ = makeSymbol("S#21578", "CYC");
        $ic69$ = makeSymbol("S#17970", "CYC");
        $ic70$ = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $ic71$ = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SCOPE-OF-SKOLEM");
        $ic72$ = makeSymbol(">");
        $ic73$ = makeSymbol("S#17964", "CYC");
        $ic74$ = makeSymbol("S#13730", "CYC");
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic76$ = ConsesLow.list((SubLObject)makeKeyword("STRENGTH"), (SubLObject)makeKeyword("MONOTONIC"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("FORWARD"));
        $ic77$ = makeString("SORT-BY-ID called on list containing non-forts");
        $ic78$ = makeSymbol("S#21575", "CYC");
        $ic79$ = makeSymbol("S#21478", "CYC");
        $ic80$ = makeSymbol("S#15616", "CYC");
        $ic81$ = makeSymbol("S#21479", "CYC");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("ExpandSubLFn"));
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
        $ic85$ = makeSymbol("S#21593", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#21679", "CYC"));
        $ic87$ = makeSymbol("CAR");
        $ic88$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), constant_handles_oc.f8479((SubLObject)makeString("evaluate")));
        $ic89$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#21680", "CYC"), (SubLObject)makeSymbol("S#21681", "CYC"));
        $ic90$ = makeSymbol("S#21600", "CYC");
        $ic91$ = makeSymbol("S#21603", "CYC");
        $ic92$ = makeSymbol("S#21047", "CYC");
        $ic93$ = makeSymbol("S#16020", "CYC");
        $ic94$ = makeString("most-constrained-literals succeeded!");
        $ic95$ = makeString("fewest-arg-literals succeeded!");
        $ic96$ = makeString("left-weighted-literals succeeded!");
        $ic97$ = makeString("left-connected-literals succeeded!");
        $ic98$ = makeString("left-rooted-literals succeeded!");
        $ic99$ = makeString("least-complex-literals succeeded!");
        $ic100$ = makeString("penultimate-resort-literals-1 succeeded!");
        $ic101$ = makeString("penultimate-resort-literals-2 succeeded!");
        $ic102$ = (SubLFloat)makeDouble(0.1);
        $ic103$ = makeSymbol("S#21483", "CYC");
        $ic104$ = makeString("Got a fort that was neither a nart nor a constant.  It was one of these: ~a or ~a");
        $ic105$ = makeString("~s is not an element of ~s");
        $ic106$ = makeSymbol("CDR");
        $ic107$ = makeInteger(1000);
        $ic108$ = makeInteger(100);
        $ic109$ = (SubLFloat)makeDouble(0.9);
        $ic110$ = makeInteger(10000);
        $ic111$ = makeSymbol("S#5859", "CYC");
        $ic112$ = makeSymbol("S#21041", "CYC");
        $ic113$ = makeSymbol("ASSERTION-P");
        $ic114$ = makeString("~s treated as variable in rename-clause-vars");
        $ic115$ = makeSymbol("S#21485", "CYC");
        $ic116$ = makeSymbol("S#3936", "CYC");
        $ic117$ = makeSymbol("VARIABLE-P");
        $ic118$ = makeSymbol("MIN");
        $ic119$ = makeSymbol("S#3695", "CYC");
        $ic120$ = makeSymbol("FALSE");
        $ic121$ = makeSymbol("S#13570", "CYC");
        $ic122$ = makeSymbol("CONSTANT-P");
    }
    
    public static final class $f18928$UnaryFunction extends UnaryFunction
    {
        public $f18928$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21468"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f18928(var146);
        }
    }
    
    public static final class $f18935$UnaryFunction extends UnaryFunction
    {
        public $f18935$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21469"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f18935(var146);
        }
    }
    
    public static final class $f18937$UnaryFunction extends UnaryFunction
    {
        public $f18937$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21470"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f18937(var146, (SubLObject)$f18937$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f18937$BinaryFunction extends BinaryFunction
    {
        public $f18937$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21470"));
        }
        
        public SubLObject processItem(final SubLObject var146, final SubLObject var171) {
            return f18937(var146, var171);
        }
    }
    
    public static final class $f18940$UnaryFunction extends UnaryFunction
    {
        public $f18940$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21471"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f18940(var146);
        }
    }
    
    public static final class $f18944$UnaryFunction extends UnaryFunction
    {
        public $f18944$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21472"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f18944(var146);
        }
    }
    
    public static final class $f18953$BinaryFunction extends BinaryFunction
    {
        public $f18953$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21473"));
        }
        
        public SubLObject processItem(final SubLObject var146, final SubLObject var171) {
            return f18953(var146, var171);
        }
    }
    
    public static final class $f19004$UnaryFunction extends UnaryFunction
    {
        public $f19004$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21478"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f19004(var146);
        }
    }
    
    public static final class $f19005$UnaryFunction extends UnaryFunction
    {
        public $f19005$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21479"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f19005(var146, (SubLObject)$f19005$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f19005$BinaryFunction extends BinaryFunction
    {
        public $f19005$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21479"));
        }
        
        public SubLObject processItem(final SubLObject var146, final SubLObject var171) {
            return f19005(var146, var171);
        }
    }
    
    public static final class $f19030$UnaryFunction extends UnaryFunction
    {
        public $f19030$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21047"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f19030(var146, (SubLObject)$f19030$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f19030$BinaryFunction extends BinaryFunction
    {
        public $f19030$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21047"));
        }
        
        public SubLObject processItem(final SubLObject var146, final SubLObject var171) {
            return f19030(var146, var171);
        }
    }
    
    public static final class $f19054$BinaryFunction extends BinaryFunction
    {
        public $f19054$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21483"));
        }
        
        public SubLObject processItem(final SubLObject var146, final SubLObject var171) {
            return f19054(var146, var171);
        }
    }
    
    public static final class $f19062$BinaryFunction extends BinaryFunction
    {
        public $f19062$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21484"));
        }
        
        public SubLObject processItem(final SubLObject var146, final SubLObject var171) {
            return f19062(var146, var171, (SubLObject)$f19062$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f19078$UnaryFunction extends UnaryFunction
    {
        public $f19078$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21485"));
        }
        
        public SubLObject processItem(final SubLObject var146) {
            return f19078(var146);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1492 ms
	
	Decompiled with Procyon 0.5.32.
*/