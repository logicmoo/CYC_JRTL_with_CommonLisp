package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0210 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0210";
    public static final String myFingerPrint = "6c6c47cb106fcdec6f46ac7dc4409886a3814edeb7119bf866a3b42b408b9f00";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLString $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    
    public static SubLObject f13565(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0173.f10955(var1) || module0210.NIL == var1 || module0210.NIL != module0202.f12590(var1));
    }
    
    public static SubLObject f13566(final SubLObject var1) {
        return module0174.f11035(var1);
    }
    
    public static SubLObject f13567(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var3.isChar() || var3.isString() || var3.isNumber() || var3.isSymbol() || var3.isCons());
    }
    
    public static SubLObject f13568(final SubLObject var3) {
        if (module0210.NIL != module0173.f10955(var3)) {
            return module0269.f17706(var3);
        }
        return f13569(var3);
    }
    
    public static SubLObject f13570(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0173.f10955(var4) && module0210.NIL != module0269.f17779(var4));
    }
    
    public static SubLObject f13569(final SubLObject var4) {
        if (module0210.NIL != var4) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0173.f10955(var4) || module0210.NIL != module0201.f12546(var4) || module0210.NIL != f13571(var4));
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13572(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0205.f13155(var5) || module0210.NIL != module0172.f10917(var5) || module0210.NIL != module0193.f12067(var5) || module0210.NIL != f13567(var5));
    }
    
    public static SubLObject f13573(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13569(var4) || module0210.NIL != module0206.f13466(var4));
    }
    
    public static SubLObject f13574(final SubLObject var4, SubLObject var6) {
        if (var6 == module0210.UNPROVIDED) {
            var6 = (SubLObject)module0210.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13573(var4) || module0210.NIL != module0274.f18101(var4, var6));
    }
    
    public static SubLObject f13575(final SubLObject var1) {
        if (module0210.NIL != module0173.f10955(var1)) {
            return module0226.f14792(var1);
        }
        if (module0210.NIL != f13576(var1, (SubLObject)module0210.UNPROVIDED)) {
            return module0259.f16892(var1, module0210.$ic7$, module0132.$g1555$.getGlobalValue(), (SubLObject)module0210.UNPROVIDED);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13577(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0202.f12590(var4) && module0210.NIL != f13578(module0205.f13132(var4)));
    }
    
    public static SubLObject f13579(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13577(var4) && module0210.NIL == module0205.f13304(var4, (SubLObject)module0210.UNPROVIDED));
    }
    
    public static SubLObject f13580(final SubLObject var4) {
        return f13579(module0228.f15205(var4));
    }
    
    public static SubLObject f13581(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13577(var4) && module0210.NIL != module0205.f13304(var4, (SubLObject)module0210.UNPROVIDED));
    }
    
    public static SubLObject f13578(final SubLObject var7) {
        if (module0210.NIL != module0173.f10955(var7)) {
            return module0269.f17801(var7);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13582(final SubLObject var8, SubLObject var9, SubLObject var10) {
        if (var9 == module0210.UNPROVIDED) {
            var9 = (SubLObject)module0210.NIL;
        }
        if (var10 == module0210.UNPROVIDED) {
            var10 = (SubLObject)module0210.NIL;
        }
        if (module0210.NIL != module0173.f10955(var8)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0269.f17801(var8) || module0210.NIL != ((module0210.NIL != var9) ? module0220.f14581(module0210.$ic8$, var8, module0210.$ic9$, (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED) : module0210.NIL) || module0210.NIL != ((module0210.NIL != var9) ? module0220.f14581(module0210.$ic8$, var8, module0210.$ic10$, (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED) : module0210.NIL) || module0210.NIL != ((module0210.NIL != var10) ? ((module0210.NIL != module0245.f15831(var8, module0210.$ic8$)) ? module0210.NIL : f13583(var8)) : module0210.NIL));
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13583(final SubLObject var11) {
        if (module0210.NIL != module0128.f8449(var11)) {
            final SubLObject var12 = module0166.f10743(var11);
            if (var12.isString()) {
                return module0038.f2684(var12, (SubLObject)module0210.$ic11$);
            }
        }
        else if (module0210.NIL != module0167.f10813(var11)) {
            return f13583(module0205.f13276(var11));
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13584(final SubLObject var11) {
        if (module0210.NIL != module0167.f10813(var11)) {
            return f13584(module0205.f13276(var11));
        }
        if (module0210.NIL != module0128.f8449(var11) && module0210.NIL != f13583(var11)) {
            return f13582(var11, (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13585(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0167.f10813(var4) && module0210.NIL != f13578(module0205.f13276(var4)));
    }
    
    public static SubLObject f13586(final SubLObject var4) {
        if (module0210.NIL != module0167.f10813(var4)) {
            final SubLObject var5 = module0205.f13276(var4);
            if (module0210.NIL != f13583(var5)) {
                return f13585(var4);
            }
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13587(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13586(var4) || (module0210.NIL != module0172.f10917(var4) && module0210.NIL != f13583(module0205.f13276(var4))));
    }
    
    public static SubLObject f13588(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13577(var4) || module0210.NIL != f13589(var4));
    }
    
    public static SubLObject f13589(final SubLObject var4) {
        return f13590(var4);
    }
    
    public static SubLObject f13590(final SubLObject var4) {
        if (module0210.NIL != module0035.f2014(var4) && Sequences.length(var4).numGE((SubLObject)module0210.FOUR_INTEGER) && Sequences.length(var4).numLE((SubLObject)module0210.FIVE_INTEGER)) {
            SubLObject var5 = (SubLObject)module0210.NIL;
            SubLObject var6 = (SubLObject)module0210.NIL;
            SubLObject var7 = (SubLObject)module0210.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var4, (SubLObject)module0210.$ic12$);
            var5 = var4.first();
            SubLObject var8 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var4, (SubLObject)module0210.$ic12$);
            var6 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var4, (SubLObject)module0210.$ic12$);
            var7 = var8.first();
            var8 = var8.rest();
            final SubLObject var9 = (SubLObject)(var8.isCons() ? var8.first() : module0210.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var8, var4, (SubLObject)module0210.$ic12$);
            var8 = var8.rest();
            final SubLObject var10 = (SubLObject)(var8.isCons() ? var8.first() : module0210.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var8, var4, (SubLObject)module0210.$ic12$);
            var8 = var8.rest();
            if (module0210.NIL == var8) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13591(var5) && var6.isList() && module0210.NIL != module0201.f12546(var7));
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0210.$ic12$);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13592(final SubLObject var20) {
        if (var20.isCons()) {
            return conses_high.second(var20);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13591(final SubLObject var3) {
        return module0004.f104(var3, module0146.$g1967$.getGlobalValue(), (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED);
    }
    
    public static SubLObject f13593(final SubLObject var21, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        if (module0210.NIL != module0202.f12659(var21) && module0210.NIL == module0202.f12707(var21, (SubLObject)module0210.UNPROVIDED) && module0210.NIL == module0035.f2438(var22, var21, (SubLObject)module0210.UNPROVIDED)) {
            return f13576(var21, var22);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13594(final SubLObject var1) {
        return f13593(var1, Symbols.symbol_function((SubLObject)module0210.$ic14$));
    }
    
    public static SubLObject f13595(final SubLObject var1, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13576(var1, var22) && module0210.NIL != module0202.f12691(var1, var22));
    }
    
    public static SubLObject f13596(final SubLObject var1, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13576(var1, var22) && module0210.NIL == module0202.f12691(var1, var22));
    }
    
    public static SubLObject f13597(final SubLObject var24, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic15$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13576(var24, var22) && module0210.NIL == f13593(var24, var22));
    }
    
    public static SubLObject f13598(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0202.f12659(var1) && module0210.NIL != module0269.f17725(module0205.f13276(var1)));
    }
    
    public static SubLObject f13599(final SubLObject var24, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic14$);
        }
        return f13576(var24, var22);
    }
    
    public static SubLObject f13576(final SubLObject var24, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic15$);
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0210.NIL != module0202.f12659(var24)) {
            final SubLObject var26 = module0205.f13276(var24);
            SubLObject var27 = Functions.funcall(var22, var26);
            if (module0210.NIL == var27) {
                final SubLObject var28 = module0147.$g2094$.currentBinding(var25);
                final SubLObject var29 = module0147.$g2095$.currentBinding(var25);
                try {
                    module0147.$g2094$.bind((SubLObject)module0210.$ic16$, var25);
                    module0147.$g2095$.bind(module0210.$ic17$, var25);
                    var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0269.f17725(var26) || module0210.NIL != ((module0210.NIL != module0173.f10955(var26)) ? module0210.NIL : f13600(var26, (SubLObject)module0210.NIL)));
                }
                finally {
                    module0147.$g2095$.rebind(var29, var25);
                    module0147.$g2094$.rebind(var28, var25);
                }
            }
            return var27;
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13600(final SubLObject var13, SubLObject var6) {
        if (var6 == module0210.UNPROVIDED) {
            var6 = (SubLObject)module0210.NIL;
        }
        if (module0210.NIL != module0173.f10955(var13)) {
            return f13600(module0228.f15205(var13), var6);
        }
        if (module0210.NIL != f13576(var13, (SubLObject)module0210.UNPROVIDED)) {
            return module0256.f16604(module0210.$ic18$, module0226.f14990(module0205.f13276(var13), var6), (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13571(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((module0210.NIL != f13601(var4, (SubLObject)module0210.UNPROVIDED) && (module0210.NIL != module0201.f12580(module0205.f13276(var4)) || module0210.NIL != f13602(module0205.f13276(var4))) && (module0210.NIL == module0152.$g2101$.getDynamicValue(var5) || module0210.NIL != f13603(var4))) || module0210.NIL != module0205.f13330(var4));
    }
    
    public static SubLObject f13602(final SubLObject var3) {
        if (module0210.NIL != module0173.f10955(var3)) {
            return module0269.f17708(var3);
        }
        return f13569(var3);
    }
    
    public static SubLObject f13604(final SubLObject var4) {
        return f13605(var4);
    }
    
    public static SubLObject f13603(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0034.$g879$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0210.NIL;
        if (module0210.NIL == var6) {
            return f13604(var4);
        }
        var7 = module0034.f1857(var6, (SubLObject)module0210.$ic19$, (SubLObject)module0210.UNPROVIDED);
        if (module0210.NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)module0210.$ic19$, (SubLObject)module0210.ONE_INTEGER, (SubLObject)module0210.NIL, (SubLObject)module0210.EQUAL, (SubLObject)module0210.UNPROVIDED);
            module0034.f1860(var6, (SubLObject)module0210.$ic19$, var7);
        }
        SubLObject var8 = module0034.f1814(var7, var4, (SubLObject)module0210.$ic20$);
        if (var8 == module0210.$ic20$) {
            var8 = Values.arg2(var5.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13604(var4)));
            module0034.f1816(var7, var4, var8, (SubLObject)module0210.UNPROVIDED);
        }
        return module0034.f1959(var8);
    }
    
    public static SubLObject f13605(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0210.NIL != module0228.f15212(var4)) {
            return (SubLObject)module0210.T;
        }
        if (module0210.NIL != module0152.$g2101$.getDynamicValue(var5)) {
            module0274.f18082((SubLObject)ConsesLow.list((SubLObject)module0210.$ic21$, var4));
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13606(final SubLObject var32, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic15$);
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0210.NIL != module0202.f12660(var32)) {
            final SubLObject var34 = module0205.f13132(var32);
            SubLObject var35 = Functions.funcall(var22, var34);
            if (module0210.NIL == var35) {
                final SubLObject var36 = module0147.$g2094$.currentBinding(var33);
                final SubLObject var37 = module0147.$g2095$.currentBinding(var33);
                try {
                    module0147.$g2094$.bind((SubLObject)module0210.$ic16$, var33);
                    module0147.$g2095$.bind(module0210.$ic17$, var33);
                    var35 = (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0269.f17736(var34) || module0210.NIL != module0269.f17706(var34) || module0210.NIL != module0269.f17718(var34, (SubLObject)module0210.UNPROVIDED));
                }
                finally {
                    module0147.$g2095$.rebind(var37, var33);
                    module0147.$g2094$.rebind(var36, var33);
                }
            }
            return var35;
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13607(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == module0205.f13145((SubLObject)module0210.$ic22$, var1, (SubLObject)module0210.UNPROVIDED, (SubLObject)module0210.UNPROVIDED));
    }
    
    public static SubLObject f13608(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0202.f12590(var1) && module0210.NIL != module0128.f8449(module0205.f13136(var1)));
    }
    
    public static SubLObject f13609(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0202.f12590(var1) && module0210.NIL == module0128.f8449(module0205.f13136(var1)));
    }
    
    public static SubLObject f13610(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0210.ZERO_INTEGER;
        SubLObject var37 = module0232.f15306(var35);
        SubLObject var38 = (SubLObject)module0210.NIL;
        var38 = var37.first();
        while (module0210.NIL != var37) {
            final SubLObject var39 = (SubLObject)module0210.$ic23$;
            if (module0210.NIL != f13611(var38)) {
                return (SubLObject)module0210.NIL;
            }
            var36 = Numbers.add(var36, (SubLObject)module0210.ONE_INTEGER);
            var37 = var37.rest();
            var38 = var37.first();
        }
        var36 = (SubLObject)module0210.ZERO_INTEGER;
        var37 = module0232.f15308(var35);
        var38 = (SubLObject)module0210.NIL;
        var38 = var37.first();
        while (module0210.NIL != var37) {
            final SubLObject var39 = (SubLObject)module0210.$ic24$;
            if (module0210.NIL != f13611(var38)) {
                return (SubLObject)module0210.NIL;
            }
            var36 = Numbers.add(var36, (SubLObject)module0210.ONE_INTEGER);
            var37 = var37.rest();
            var38 = var37.first();
        }
        return (SubLObject)module0210.T;
    }
    
    public static SubLObject f13612(final SubLObject var40) {
        if (module0210.NIL != module0178.f11284(var40)) {
            return f13607(module0178.f11328(var40));
        }
        return f13610(module0178.f11282(var40));
    }
    
    public static SubLObject f13611(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == f13607(var1));
    }
    
    public static SubLObject f13613(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == f13610(var35));
    }
    
    public static SubLObject f13614(final SubLObject var40) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == f13612(var40));
    }
    
    public static SubLObject f13601(final SubLObject var4, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((module0210.NIL != module0146.$g1981$.getDynamicValue(var23) && module0210.NIL != f13615(var4, var22) && module0210.NIL != module0202.f12933(var4)) || module0210.NIL != module0035.f2014(var4));
    }
    
    public static SubLObject f13615(final SubLObject var41, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        if (!var41.isCons()) {
            return (SubLObject)module0210.NIL;
        }
        final SubLObject var42 = var41.rest();
        if (var42.isCons()) {
            return f13615(var42, var22);
        }
        if (module0210.NIL == var42) {
            return (SubLObject)module0210.NIL;
        }
        return Functions.funcall(var22, var42);
    }
    
    public static SubLObject f13616(final SubLObject var4, SubLObject var6) {
        if (var6 == module0210.UNPROVIDED) {
            var6 = (SubLObject)module0210.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0552.f34136(var4, var6) || (module0210.NIL != module0131.f8560() && module0210.NIL != module0259.f16854(var4, module0210.$ic25$, var6, (SubLObject)module0210.UNPROVIDED)));
    }
    
    public static SubLObject f13617(final SubLObject var43) {
        return f13618(var43);
    }
    
    public static SubLObject f13618(final SubLObject var43) {
        return f13619(var43);
    }
    
    public static SubLObject f13619(final SubLObject var1) {
        return module0202.f12691(var1, (SubLObject)module0210.$ic26$);
    }
    
    public static SubLObject f13620(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != module0201.f12546(var1) || module0210.NIL != module0201.f12581(var1) || module0210.NIL != module0201.f12568(var1) || module0210.NIL != module0201.f12582(var1) || module0210.NIL != f13589(var1));
    }
    
    public static SubLObject f13621(final SubLObject var1, SubLObject var6) {
        if (var6 == module0210.UNPROVIDED) {
            var6 = (SubLObject)module0210.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL != f13572(var1) || module0210.NIL != f13574(var1, var6));
    }
    
    public static SubLObject f13622(final SubLObject var1, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        if (module0210.NIL != module0174.f11035(var1)) {
            return module0178.f11322(var1);
        }
        if (module0210.NIL != module0167.f10813(var1)) {
            return f13622(module0172.f10920(var1), (SubLObject)module0210.UNPROVIDED);
        }
        if (var1.isAtom()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == Functions.funcall(var22, var1));
        }
        if (module0210.NIL != f13574(var1, (SubLObject)module0210.UNPROVIDED)) {
            return module0202.f12689(var1, var22);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13623(final SubLObject var1, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        if (module0210.NIL != module0174.f11035(var1)) {
            return module0202.f12691(module0289.f19396(var1), (SubLObject)module0210.UNPROVIDED);
        }
        if (module0210.NIL != module0167.f10813(var1)) {
            return f13595(module0172.f10920(var1), (SubLObject)module0210.UNPROVIDED);
        }
        if (var1.isAtom()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == Functions.funcall(var22, var1));
        }
        if (module0210.NIL != f13574(var1, (SubLObject)module0210.UNPROVIDED)) {
            return module0202.f12691(var1, var22);
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13624(final SubLObject var1, SubLObject var22) {
        if (var22 == module0210.UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)module0210.$ic13$);
        }
        if (module0210.NIL != module0174.f11035(var1)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == module0202.f12691(module0289.f19396(var1), (SubLObject)module0210.UNPROVIDED));
        }
        if (module0210.NIL != module0167.f10813(var1)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == f13595(module0172.f10920(var1), (SubLObject)module0210.UNPROVIDED));
        }
        if (var1.isAtom()) {
            return Functions.funcall(var22, var1);
        }
        if (module0210.NIL != f13574(var1, (SubLObject)module0210.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0210.NIL == module0202.f12691(var1, var22));
        }
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13625() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13565", "EL-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13566", "S#16400", 1, 0, false);
        new $f13566$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13567", "S#16412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13568", "S#16413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13570", "S#15520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13569", "S#16414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13572", "HL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13573", "S#16029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13574", "S#16415", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13575", "S#16416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13577", "S#16417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13579", "S#16402", 1, 0, false);
        new $f13579$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13580", "S#16403", 1, 0, false);
        new $f13580$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13581", "S#16418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13578", "REIFIED-SKOLEM-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13582", "S#13552", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13583", "S#16419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13584", "S#16405", 1, 0, false);
        new $f13584$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13585", "SKOLEM-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13586", "FAST-SKOLEM-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13587", "S#16406", 1, 0, false);
        new $f13587$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13588", "S#16420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13589", "S#15529", 1, 0, false);
        new $f13589$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13590", "S#16421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13592", "S#16422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13591", "S#16423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13593", "S#12589", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13594", "S#12590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13595", "S#12592", 1, 1, false);
        new $f13595$UnaryFunction();
        new $f13595$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13596", "S#12597", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13597", "S#12599", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13598", "S#12598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13599", "S#12588", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13576", "S#12585", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13600", "S#16424", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13571", "S#15521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13602", "S#16425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13604", "S#16426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13603", "S#16427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13605", "S#16428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13606", "S#15530", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13607", "S#16429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13608", "S#16430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13609", "S#16431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13610", "S#16432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13612", "S#16433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13611", "S#16434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13613", "S#16435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13614", "S#16436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13601", "S#15511", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13615", "S#16437", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13616", "S#16438", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13617", "S#16439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13618", "S#16440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13619", "S#16441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13620", "S#15917", 1, 0, false);
        new $f13620$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13621", "S#16442", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13622", "S#16443", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13623", "S#16444", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0210", "f13624", "S#16445", 1, 1, false);
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13626() {
        return (SubLObject)module0210.NIL;
    }
    
    public static SubLObject f13627() {
        module0012.f368((SubLObject)module0210.$ic0$, (SubLObject)module0210.$ic1$, (SubLObject)module0210.$ic2$, (SubLObject)module0210.NIL, (SubLObject)module0210.$ic3$);
        module0012.f368((SubLObject)module0210.$ic4$, (SubLObject)module0210.$ic5$, (SubLObject)module0210.$ic6$, (SubLObject)module0210.NIL, (SubLObject)module0210.$ic3$);
        module0034.f1895((SubLObject)module0210.$ic19$);
        return (SubLObject)module0210.NIL;
    }
    
    public void declareFunctions() {
        f13625();
    }
    
    public void initializeVariables() {
        f13626();
    }
    
    public void runTopLevelForms() {
        f13627();
    }
    
    static {
        me = (SubLFile)new module0210();
        $ic0$ = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"));
        $ic2$ = SubLObjectFactory.makeString("Returns t iff OBJECT is a fort or an EL formula.");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic4$ = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#671", "CYC"));
        $ic6$ = SubLObjectFactory.makeString("Returns T if the OBJ is a valid CycL HL term.");
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFuncN"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $ic11$ = SubLObjectFactory.makeString("SKF");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16446", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#16447", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic15$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic16$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic17$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#16427", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic21$ = SubLObjectFactory.makeKeyword("MAL-FN-NESTING");
        $ic22$ = SubLObjectFactory.makeSymbol("S#16431", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("NEG");
        $ic24$ = SubLObjectFactory.makeKeyword("POS");
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#15917", "CYC");
    }
    
    public static final class $f13566$UnaryFunction extends UnaryFunction
    {
        public $f13566$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16400"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13566(var2);
        }
    }
    
    public static final class $f13579$UnaryFunction extends UnaryFunction
    {
        public $f13579$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16402"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13579(var2);
        }
    }
    
    public static final class $f13580$UnaryFunction extends UnaryFunction
    {
        public $f13580$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16403"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13580(var2);
        }
    }
    
    public static final class $f13584$UnaryFunction extends UnaryFunction
    {
        public $f13584$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16405"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13584(var2);
        }
    }
    
    public static final class $f13587$UnaryFunction extends UnaryFunction
    {
        public $f13587$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16406"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13587(var2);
        }
    }
    
    public static final class $f13589$UnaryFunction extends UnaryFunction
    {
        public $f13589$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15529"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13589(var2);
        }
    }
    
    public static final class $f13595$UnaryFunction extends UnaryFunction
    {
        public $f13595$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12592"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13595(var2, (SubLObject)$f13595$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f13595$BinaryFunction extends BinaryFunction
    {
        public $f13595$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12592"));
        }
        
        public SubLObject processItem(final SubLObject var2, final SubLObject var23) {
            return module0210.f13595(var2, var23);
        }
    }
    
    public static final class $f13620$UnaryFunction extends UnaryFunction
    {
        public $f13620$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15917"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0210.f13620(var2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0210.class
	Total time: 267 ms
	
	Decompiled with Procyon 0.5.32.
*/