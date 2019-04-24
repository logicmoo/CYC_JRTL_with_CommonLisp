package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0282 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0282";
    public static final String myFingerPrint = "5fbe907d266877da5c4ab6a990a89853ee3ee51d56021335c57357c13d2fd81a";
    public static SubLSymbol $g2615$;
    public static SubLSymbol $g2616$;
    private static SubLSymbol $g2617$;
    private static SubLSymbol $g2618$;
    private static SubLSymbol $g2619$;
    private static SubLSymbol $g2620$;
    private static SubLSymbol $g2621$;
    private static SubLSymbol $g2622$;
    private static SubLSymbol $g2623$;
    private static SubLSymbol $g2624$;
    private static SubLSymbol $g2625$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLInteger $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLInteger $ic71$;
    private static final SubLSymbol $ic72$;
    
    public static SubLObject f18664(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0282.NIL;
        final SubLObject var4 = module0282.$g2618$.currentBinding(var2);
        try {
            module0282.$g2618$.bind(var1, var2);
            var3 = f18665(var1);
        }
        finally {
            module0282.$g2618$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f18665(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0282.NIL != module0279.f18520(var1)) {
            if (module0282.NIL != f18666(var1, module0282.$g2619$.getDynamicValue(var2), module0282.$g2618$.getDynamicValue(var2))) {
                return module0202.f12668(var1);
            }
            return module0279.f18522(var1, (SubLObject)module0282.UNPROVIDED);
        }
        else {
            if (module0282.NIL == module0202.f12590(var1)) {
                return var1;
            }
            final SubLObject var3 = module0202.f12707(var1, (SubLObject)module0282.UNPROVIDED);
            final SubLObject var1_8 = (module0282.NIL != var3) ? module0202.f12712(var1) : var1;
            SubLObject var4 = (SubLObject)module0282.NIL;
            if (module0282.NIL != module0202.f12597(var1_8) && module0282.NIL != module0202.f12652(module0205.f13380(var1_8, (SubLObject)module0282.UNPROVIDED))) {
                SubLObject var5 = (SubLObject)module0282.NIL;
                final SubLObject var6 = module0282.$g2619$.currentBinding(var2);
                try {
                    module0282.$g2619$.bind(var1_8, var2);
                    final SubLObject var4_10 = module0018.$g698$.currentBinding(var2);
                    try {
                        module0018.$g698$.bind((SubLObject)module0282.T, var2);
                        var5 = module0202.f12771(module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic3$), var1_8, (SubLObject)module0282.ONE_INTEGER));
                    }
                    finally {
                        module0018.$g698$.rebind(var4_10, var2);
                    }
                    var4 = module0202.f12772((SubLObject)ConsesLow.list(var5, module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic3$), var1_8, (SubLObject)module0282.TWO_INTEGER)));
                }
                finally {
                    module0282.$g2619$.rebind(var6, var2);
                }
            }
            else if (module0282.NIL != module0202.f12597(var1_8)) {
                SubLObject var5 = (SubLObject)module0282.NIL;
                final SubLObject var6 = module0282.$g2619$.currentBinding(var2);
                try {
                    module0282.$g2619$.bind(var1_8, var2);
                    final SubLObject var4_11 = module0144.$g1801$.currentBinding(var2);
                    final SubLObject var7 = module0144.$g1803$.currentBinding(var2);
                    final SubLObject var8 = module0146.$g2032$.currentBinding(var2);
                    try {
                        module0144.$g1801$.bind((SubLObject)module0282.T, var2);
                        module0144.$g1803$.bind(module0146.$g2032$.getDynamicValue(var2), var2);
                        module0146.$g2032$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0282.NIL == module0146.$g2032$.getDynamicValue(var2)), var2);
                        var5 = module0202.f12771(module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic3$), var1_8, (SubLObject)module0282.ONE_INTEGER));
                    }
                    finally {
                        module0146.$g2032$.rebind(var8, var2);
                        module0144.$g1803$.rebind(var7, var2);
                        module0144.$g1801$.rebind(var4_11, var2);
                    }
                    var4 = module0202.f12772((SubLObject)ConsesLow.list(var5, module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic3$), var1_8, (SubLObject)module0282.TWO_INTEGER)));
                }
                finally {
                    module0282.$g2619$.rebind(var6, var2);
                }
            }
            else {
                var4 = module0202.f12813(Symbols.symbol_function((SubLObject)module0282.$ic3$), var1_8);
            }
            if (module0282.NIL != var3) {
                return module0202.f12711(var3, var4);
            }
            return var4;
        }
    }
    
    public static SubLObject f18666(final SubLObject var14, final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0282.NIL == module0282.$g2620$.getDynamicValue(var17)) {
            return (SubLObject)module0282.NIL;
        }
        if (var15.eql(var16) && module0282.NIL != module0107.f7629(var15) && module0282.NIL != module0202.f12606(var14)) {
            final SubLObject var18 = module0202.f12744(var14);
            return Types.sublisp_null(module0205.f13220(var18, module0205.f13204(var15, (SubLObject)module0282.UNPROVIDED), (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED));
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18667(final SubLObject var1) {
        return f18668(module0202.f12763(var1));
    }
    
    public static SubLObject f18668(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12707(var1, (SubLObject)module0282.UNPROVIDED);
        final SubLObject var1_18 = (module0282.NIL != var3) ? module0202.f12712(var1) : var1;
        SubLObject var4 = (SubLObject)module0282.NIL;
        if (module0282.NIL != module0279.f18520(var1_18)) {
            var4 = module0279.f18522(var1_18, (SubLObject)module0282.UNPROVIDED);
        }
        else if (module0282.NIL == module0202.f12590(var1_18)) {
            var4 = var1_18;
        }
        else if (module0282.NIL != module0279.f18517(var1_18, (SubLObject)module0282.UNPROVIDED)) {
            var4 = f18669(var1_18);
        }
        else if (module0282.NIL != module0279.f18518(var1_18)) {
            if (module0282.NIL != module0279.f18525()) {
                var4 = f18669(var1_18);
            }
            else {
                final SubLObject var5 = module0146.$g2027$.currentBinding(var2);
                final SubLObject var6 = module0146.$g2028$.currentBinding(var2);
                try {
                    module0146.$g2027$.bind((SubLObject)module0282.NIL, var2);
                    module0146.$g2028$.bind((SubLObject)module0282.NIL, var2);
                    var4 = module0202.f12643(module0205.f13136(var1_18), module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic4$), var1_18, (SubLObject)module0282.ONE_INTEGER));
                }
                finally {
                    module0146.$g2028$.rebind(var6, var2);
                    module0146.$g2027$.rebind(var5, var2);
                }
            }
        }
        else if (module0282.NIL != module0202.f12597(var1_18)) {
            var4 = f18668(f18664(var1_18));
        }
        else if (module0282.NIL != module0202.f12592(var1_18)) {
            if (module0282.NIL != module0205.f13126(var1_18, (SubLObject)module0282.ONE_INTEGER)) {
                var4 = var1_18;
            }
            else {
                SubLObject var7 = (SubLObject)module0282.NIL;
                final SubLObject var8 = module0146.$g2032$.currentBinding(var2);
                try {
                    module0146.$g2032$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0282.NIL == module0146.$g2032$.getDynamicValue(var2)), var2);
                    var7 = f18670(var1_18);
                }
                finally {
                    module0146.$g2032$.rebind(var8, var2);
                }
                if (module0282.NIL != module0202.f12592(var7)) {
                    var4 = var7;
                }
                else {
                    var4 = f18668(var7);
                }
            }
        }
        else {
            var4 = module0202.f12813(Symbols.symbol_function((SubLObject)module0282.$ic4$), var1_18);
        }
        if (module0282.NIL != var3) {
            return module0202.f12711(var3, var4);
        }
        return var4;
    }
    
    public static SubLObject f18671(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (var1.eql(module0282.$ic6$)) {
            return module0282.$ic7$;
        }
        if (var1.eql(module0282.$ic7$)) {
            return module0282.$ic6$;
        }
        if (module0282.NIL != module0279.f18520(var1)) {
            return f18672(var1);
        }
        if (module0282.NIL != module0202.f12595(var1)) {
            return f18673(var1);
        }
        if (module0282.NIL != module0202.f12594(var1)) {
            return f18674(var1);
        }
        if (module0282.NIL != module0202.f12592(var1)) {
            SubLObject var3 = (SubLObject)module0282.NIL;
            final SubLObject var4 = module0146.$g2032$.currentBinding(var2);
            try {
                module0146.$g2032$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0282.NIL == module0146.$g2032$.getDynamicValue(var2)), var2);
                var3 = f18670(f18675(var1));
            }
            finally {
                module0146.$g2032$.rebind(var4, var2);
            }
            return var3;
        }
        if (module0282.NIL != module0202.f12605(var1)) {
            return f18676(var1);
        }
        if (module0282.NIL != module0202.f12606(var1)) {
            return f18677(var1);
        }
        if (module0282.NIL != module0202.f12607(var1)) {
            return f18678(var1);
        }
        if (module0282.NIL != module0202.f12609(var1)) {
            return f18679(var1);
        }
        if (module0282.NIL != module0202.f12610(var1)) {
            return f18680(var1);
        }
        if (module0282.NIL != module0279.f18517(var1, (SubLObject)module0282.UNPROVIDED)) {
            return f18669(var1);
        }
        if (module0282.NIL != module0279.f18518(var1)) {
            return f18681(var1);
        }
        if (module0282.NIL != module0202.f12597(var1)) {
            return module0289.f19431(f18668(f18664(module0205.f13338(var1))));
        }
        return module0202.f12771(var1);
    }
    
    public static SubLObject f18670(final SubLObject var1) {
        if (module0282.NIL == module0202.f12592(var1)) {
            return var1;
        }
        return f18671(module0205.f13203(var1, (SubLObject)module0282.$ic8$));
    }
    
    public static SubLObject f18682(final SubLObject var1) {
        if (module0282.NIL != module0202.f12605(var1)) {
            return f18676(var1);
        }
        if (module0282.NIL != module0202.f12606(var1)) {
            return f18677(var1);
        }
        if (module0282.NIL != module0202.f12607(var1)) {
            return f18678(var1);
        }
        if (module0282.NIL != module0202.f12609(var1)) {
            return f18679(var1);
        }
        if (module0282.NIL != module0202.f12610(var1)) {
            return f18680(var1);
        }
        module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic9$, var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
        return var1;
    }
    
    public static SubLObject f18683(final SubLObject var1) {
        return module0202.f12771(var1);
    }
    
    public static SubLObject f18675(final SubLObject var20) {
        return module0205.f13203(var20, (SubLObject)module0282.UNPROVIDED);
    }
    
    public static SubLObject f18684(final SubLObject var21) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0282.$ic10$), var21);
    }
    
    public static SubLObject f18673(final SubLObject var22) {
        return module0276.f18281(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0282.$ic11$), module0205.f13207(var22, (SubLObject)module0282.UNPROVIDED)), (SubLObject)module0282.UNPROVIDED);
    }
    
    public static SubLObject f18685(final SubLObject var22) {
        return module0276.f18281(module0035.f2076(Symbols.symbol_function((SubLObject)module0282.$ic11$), module0205.f13207(var22, (SubLObject)module0282.UNPROVIDED)), (SubLObject)module0282.UNPROVIDED);
    }
    
    public static SubLObject f18674(final SubLObject var23) {
        return module0276.f18288(module0035.f2076(Symbols.symbol_function((SubLObject)module0282.$ic11$), module0205.f13207(var23, (SubLObject)module0282.UNPROVIDED)), (SubLObject)module0282.UNPROVIDED);
    }
    
    public static SubLObject f18676(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        var25.resetMultipleValues();
        final SubLObject var26 = module0202.f12796(var24);
        final SubLObject var27 = var25.secondMultipleValue();
        final SubLObject var28 = var25.thirdMultipleValue();
        var25.resetMultipleValues();
        return module0202.f12776(var27, f18671(var28));
    }
    
    public static SubLObject f18677(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        final SubLObject var16 = module0202.f12796(var14);
        final SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        return module0202.f12775(var17, f18671(var18));
    }
    
    public static SubLObject f18678(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        var29.resetMultipleValues();
        final SubLObject var30 = module0202.f12797(var28);
        final SubLObject var31 = var29.secondMultipleValue();
        final SubLObject var32 = var29.thirdMultipleValue();
        final SubLObject var33 = var29.fourthMultipleValue();
        var29.resetMultipleValues();
        if (!var31.isInteger()) {
            return module0202.f12780(module0202.f12768(module0282.$ic12$, var31, (SubLObject)module0282.ONE_INTEGER), var32, var33);
        }
        if (var31.numE((SubLObject)module0282.ONE_INTEGER)) {
            return module0202.f12775(var32, f18671(var33));
        }
        if (var31.numG((SubLObject)module0282.ONE_INTEGER)) {
            return module0202.f12780(Numbers.subtract(var31, (SubLObject)module0282.ONE_INTEGER), var32, var33);
        }
        module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic13$, var28, var31, (SubLObject)module0282.UNPROVIDED);
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18679(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        var31.resetMultipleValues();
        final SubLObject var32 = module0202.f12797(var30);
        final SubLObject var33 = var31.secondMultipleValue();
        final SubLObject var34 = var31.thirdMultipleValue();
        final SubLObject var35 = var31.fourthMultipleValue();
        var31.resetMultipleValues();
        if (!var33.isInteger()) {
            return module0202.f12779(module0202.f12768(module0282.$ic14$, var33, (SubLObject)module0282.ONE_INTEGER), var34, var35);
        }
        if (var33.numG((SubLObject)module0282.ZERO_INTEGER)) {
            return module0202.f12779(Numbers.add(var33, (SubLObject)module0282.ONE_INTEGER), var34, var35);
        }
        module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic13$, var30, var33, (SubLObject)module0282.UNPROVIDED);
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18680(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        var32.resetMultipleValues();
        final SubLObject var33 = module0202.f12797(var31);
        final SubLObject var34 = var32.secondMultipleValue();
        final SubLObject var35 = var32.thirdMultipleValue();
        final SubLObject var36 = var32.fourthMultipleValue();
        var32.resetMultipleValues();
        if (!var34.isInteger()) {
            return module0276.f18281((SubLObject)ConsesLow.list(module0202.f12779(module0202.f12768(module0282.$ic14$, var34, (SubLObject)module0282.ONE_INTEGER), var35, var36), module0202.f12780(module0202.f12768(module0282.$ic12$, var34, (SubLObject)module0282.ONE_INTEGER), var35, var36)), (SubLObject)module0282.UNPROVIDED);
        }
        if (var34.numE((SubLObject)module0282.ONE_INTEGER)) {
            return module0276.f18281((SubLObject)ConsesLow.list(module0202.f12775(var35, f18671(var36)), module0202.f12779((SubLObject)module0282.TWO_INTEGER, var35, var36)), (SubLObject)module0282.UNPROVIDED);
        }
        if (var34.numG((SubLObject)module0282.ONE_INTEGER)) {
            return module0276.f18281((SubLObject)ConsesLow.list(module0202.f12779(Numbers.add(var34, (SubLObject)module0282.ONE_INTEGER), var35, var36), module0202.f12780(Numbers.subtract(var34, (SubLObject)module0282.ONE_INTEGER), var35, var36)), (SubLObject)module0282.UNPROVIDED);
        }
        module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic13$, var31, var34, (SubLObject)module0282.UNPROVIDED);
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18681(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0282.NIL;
        final SubLObject var4 = module0146.$g2028$.currentBinding(var2);
        final SubLObject var5 = module0146.$g2032$.currentBinding(var2);
        try {
            module0146.$g2028$.bind((SubLObject)module0282.NIL, var2);
            module0146.$g2032$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0282.NIL == module0146.$g2032$.getDynamicValue(var2)), var2);
            var3 = f18668(module0205.f13379(var1, (SubLObject)module0282.UNPROVIDED));
        }
        finally {
            module0146.$g2032$.rebind(var5, var2);
            module0146.$g2028$.rebind(var4, var2);
        }
        return f18683(module0202.f12643(module0205.f13378(var1), var3));
    }
    
    public static SubLObject f18672(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0282.NIL != module0018.$g698$.getDynamicValue(var2) && module0282.NIL != module0202.f12627(var1)) {
            return module0279.f18524(f18682(var1));
        }
        return f18683(module0279.f18522(var1, (SubLObject)module0282.UNPROVIDED));
    }
    
    public static SubLObject f18669(final SubLObject var1) {
        if (module0282.NIL == module0202.f12593(var1)) {
            return var1;
        }
        final SubLObject var2 = module0205.f13378(var1);
        final SubLObject var3 = module0205.f13379(var1, (SubLObject)module0282.UNPROVIDED);
        if (module0282.NIL != module0279.f18517(var1, (SubLObject)module0282.UNPROVIDED)) {
            final SubLObject var4 = module0205.f13379(var3, (SubLObject)module0282.UNPROVIDED);
            return f18683(module0202.f12643(var2, var4));
        }
        if (module0282.NIL != module0202.f12592(var3)) {
            final SubLObject var4 = f18668(module0205.f13379(var3, (SubLObject)module0282.UNPROVIDED));
            return f18683(module0202.f12643(var2, var4));
        }
        if (module0282.NIL != module0202.f12670(var3)) {
            final SubLObject var4 = f18682(var3);
            return f18683(module0202.f12643(var2, var4));
        }
        return var1;
    }
    
    public static SubLObject f18686(final SubLObject var1) {
        if (module0282.NIL != f18687()) {
            return f18688(var1);
        }
        return f18689(var1);
    }
    
    public static SubLObject f18689(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0202.f12911(var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0282.NIL;
        var5 = var4.first();
        while (module0282.NIL != var4) {
            var1 = module0202.f12775(var5, var1);
            if (module0282.$g2617$.getDynamicValue(var2).isList()) {
                module0282.$g2617$.setDynamicValue((SubLObject)ConsesLow.cons(var5, module0282.$g2617$.getDynamicValue(var2)), var2);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var1;
    }
    
    public static SubLObject f18688(final SubLObject var1) {
        return module0202.f12913(var1);
    }
    
    public static SubLObject f18687() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0146.$g2026$.getDynamicValue(var2);
    }
    
    public static SubLObject f18690(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0282.NIL != module0202.f12590(var1) : var1;
        SubLObject var3 = (SubLObject)module0282.NIL;
        final SubLObject var4 = module0146.$g2024$.currentBinding(var2);
        final SubLObject var5 = module0146.$g2031$.currentBinding(var2);
        final SubLObject var6 = module0146.$g2003$.currentBinding(var2);
        try {
            module0146.$g2024$.bind((SubLObject)module0282.NIL, var2);
            module0146.$g2031$.bind((module0282.NIL != module0146.$g2031$.getDynamicValue(var2)) ? module0146.$g2031$.getDynamicValue(var2) : Hashtables.make_hash_table((SubLObject)module0282.$ic16$, Symbols.symbol_function((SubLObject)module0282.EQL), (SubLObject)module0282.UNPROVIDED), var2);
            module0146.$g2003$.bind((SubLObject)((module0282.NIL != module0146.$g2003$.getDynamicValue(var2)) ? module0146.$g2003$.getDynamicValue(var2) : module0282.NIL), var2);
            var3 = f18691(conses_high.copy_tree(var1));
        }
        finally {
            module0146.$g2003$.rebind(var6, var2);
            module0146.$g2031$.rebind(var5, var2);
            module0146.$g2024$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f18691(final SubLObject var1) {
        if (module0282.NIL != module0202.f12689(var1, (SubLObject)module0282.UNPROVIDED)) {
            return var1;
        }
        final SubLObject var2 = module0202.f12707(var1, (SubLObject)module0282.UNPROVIDED);
        final SubLObject var1_38 = (module0282.NIL != var2) ? module0202.f12712(var1) : var1;
        SubLObject var3 = (SubLObject)module0282.NIL;
        module0285.f19077(var1_38);
        var3 = f18692(var1_38);
        var3 = module0285.f19068(var3, (SubLObject)module0282.T, (SubLObject)module0282.UNPROVIDED);
        if (module0282.NIL != var2) {
            return module0202.f12711(var2, var3);
        }
        return var3;
    }
    
    public static SubLObject f18692(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0282.NIL == module0202.f12590(var1)) {
            return var1;
        }
        if (module0282.NIL != module0206.f13473(var1) || module0282.NIL != module0206.f13471(var1)) {
            SubLObject var3 = (SubLObject)module0282.NIL;
            final SubLObject var4 = module0146.$g1984$.currentBinding(var2);
            try {
                module0146.$g1984$.bind((SubLObject)module0282.NIL, var2);
                var3 = module0202.f12643(module0205.f13132(var1), f18692(module0205.f13203(var1, (SubLObject)module0282.UNPROVIDED)));
            }
            finally {
                module0146.$g1984$.rebind(var4, var2);
            }
            return var3;
        }
        if (module0282.NIL != module0206.f13472(var1)) {
            if (module0282.NIL == module0035.f2439((SubLObject)module0282.$ic17$, var1, (SubLObject)module0282.UNPROVIDED)) {
                return var1;
            }
            SubLObject var3 = (SubLObject)module0282.NIL;
            final SubLObject var4 = module0146.$g1984$.currentBinding(var2);
            try {
                module0146.$g1984$.bind((SubLObject)module0282.T, var2);
                var3 = module0202.f12643(module0282.$ic18$, f18692(module0205.f13203(var1, (SubLObject)module0282.UNPROVIDED)));
            }
            finally {
                module0146.$g1984$.rebind(var4, var2);
            }
            return var3;
        }
        else {
            if (module0282.NIL != module0202.f12620(var1)) {
                var2.resetMultipleValues();
                final SubLObject var5 = module0202.f12796(var1);
                final SubLObject var6 = var2.secondMultipleValue();
                final SubLObject var7 = var2.thirdMultipleValue();
                var2.resetMultipleValues();
                final SubLObject var8 = module0202.f12815((SubLObject)module0282.$ic19$, var1, (SubLObject)module0282.TWO_INTEGER);
                final SubLObject var9 = f18693(var6);
                final SubLObject var10 = f18694(var6);
                final SubLObject var11 = f18694(var9);
                SubLObject var12 = (SubLObject)module0282.NIL;
                f18695(var10, var11);
                final SubLObject var13 = module0146.$g2024$.currentBinding(var2);
                try {
                    module0146.$g2024$.bind((SubLObject)module0282.NIL, var2);
                    var12 = module0202.f12768(var5, var9, module0205.f13248(var11, var10, var8, (SubLObject)module0282.UNPROVIDED));
                }
                finally {
                    module0146.$g2024$.rebind(var13, var2);
                }
                return var12;
            }
            if (module0282.NIL != module0202.f12623(var1)) {
                var2.resetMultipleValues();
                final SubLObject var5 = module0202.f12797(var1);
                final SubLObject var14 = var2.secondMultipleValue();
                final SubLObject var15 = var2.thirdMultipleValue();
                final SubLObject var16 = var2.fourthMultipleValue();
                var2.resetMultipleValues();
                final SubLObject var17 = module0202.f12815((SubLObject)module0282.$ic19$, var1, (SubLObject)module0282.THREE_INTEGER);
                final SubLObject var18 = f18693(var15);
                final SubLObject var19 = f18694(var15);
                final SubLObject var20 = f18694(var18);
                SubLObject var21 = (SubLObject)module0282.NIL;
                f18695(var19, var20);
                final SubLObject var22 = module0146.$g2024$.currentBinding(var2);
                try {
                    module0146.$g2024$.bind((SubLObject)module0282.NIL, var2);
                    var21 = module0202.f12769(var5, var14, var18, module0205.f13248(var20, var19, var17, (SubLObject)module0282.UNPROVIDED));
                }
                finally {
                    module0146.$g2024$.rebind(var22, var2);
                }
                return var21;
            }
            if (module0282.NIL != module0270.f17857(var1)) {
                final SubLObject var23 = module0270.f17859(var1);
                final SubLObject var24 = Mapping.mapcar((SubLObject)module0282.$ic20$, var23);
                final SubLObject var25 = module0270.f17858(module0205.f13136(var1));
                final SubLObject var26 = Mapping.mapcar((SubLObject)module0282.$ic21$, var23);
                final SubLObject var27 = Mapping.mapcar((SubLObject)module0282.$ic21$, var24);
                SubLObject var28 = (SubLObject)module0282.NIL;
                final SubLObject var29 = module0205.f13180(var1, (SubLObject)module0282.$ic22$);
                SubLObject var30 = (SubLObject)module0282.NIL;
                SubLObject var31 = (SubLObject)module0282.NIL;
                SubLObject var32 = (SubLObject)module0282.NIL;
                var30 = var29;
                var31 = var30.first();
                for (var32 = (SubLObject)module0282.ZERO_INTEGER; module0282.NIL != var30; var30 = var30.rest(), var31 = var30.first(), var32 = module0048.f_1X(var32)) {
                    if (module0282.NIL != module0004.f104(var32, var25, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
                        var28 = (SubLObject)ConsesLow.cons(var31, var28);
                    }
                    else {
                        var28 = (SubLObject)ConsesLow.cons(module0202.f12815((SubLObject)module0282.$ic19$, var1, var32), var28);
                    }
                }
                f18696(var26, var27);
                return Sequences.nreverse(module0205.f13257(conses_high.pairlis(var26, var27, (SubLObject)module0282.UNPROVIDED), var28, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED));
            }
            return module0202.f12814((SubLObject)module0282.$ic19$, var1);
        }
    }
    
    public static SubLObject f18693(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0282.NIL == module0146.$g1984$.getDynamicValue(var18)) {
            return f18697(var17);
        }
        if (module0282.NIL != module0206.f13473(var17) || module0282.NIL != module0206.f13471(var17)) {
            return module0202.f12643(module0205.f13132(var17), f18697(module0205.f13203(var17, (SubLObject)module0282.UNPROVIDED)));
        }
        return var17;
    }
    
    public static SubLObject f18694(final SubLObject var17) {
        if (module0282.NIL != module0206.f13473(var17) || module0282.NIL != module0206.f13471(var17)) {
            return module0205.f13203(var17, (SubLObject)module0282.UNPROVIDED);
        }
        return var17;
    }
    
    public static SubLObject f18695(final SubLObject var40, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        module0146.$g2003$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var40, var42), module0146.$g2003$.getDynamicValue(var43)), var43);
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18696(final SubLObject var55, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        module0146.$g2003$.setDynamicValue(ConsesLow.append(conses_high.pairlis(var55, var56, (SubLObject)module0282.UNPROVIDED), module0146.$g2003$.getDynamicValue(var57)), var57);
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18697(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        SubLObject var19 = module0285.f19079(var17);
        SubLObject var20 = var18.secondMultipleValue();
        var18.resetMultipleValues();
        if (module0282.NIL == var20) {
            var20 = var17;
        }
        if (module0282.NIL == var19) {
            var19 = (SubLObject)module0282.ZERO_INTEGER;
        }
        SubLObject var21 = Hashtables.gethash(var20, module0146.$g2031$.getDynamicValue(var18), (SubLObject)module0282.UNPROVIDED);
        if (module0282.NIL == var21) {
            var21 = (SubLObject)module0282.MINUS_ONE_INTEGER;
        }
        var21 = Numbers.max(var21, var19);
        var21 = Numbers.add(var21, (SubLObject)module0282.ONE_INTEGER);
        Hashtables.sethash(var20, module0146.$g2031$.getDynamicValue(var18), var21);
        final SubLObject var22 = var21.isZero() ? module0006.f202(module0201.f12576(var20)) : Sequences.cconcatenate(module0006.f203(module0201.f12576(var20)), new SubLObject[] { module0282.$ic23$, module0006.f203(module0038.f2618(var21)) });
        if (module0282.NIL != module0201.f12570(var20)) {
            return module0201.f12573(var22);
        }
        return module0201.f12550(var22);
    }
    
    public static SubLObject f18698(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0282.NIL != module0146.$g2017$.getDynamicValue(var2)) {
            if (module0282.NIL == module0035.f2439((SubLObject)module0282.$ic24$, var1, (SubLObject)module0282.UNPROVIDED)) {
                return var1;
            }
            SubLObject var3 = (SubLObject)module0282.NIL;
            try {
                var2.throwStack.push(module0282.$ic25$);
                try {
                    var2.throwStack.push(module0282.$ic26$);
                    try {
                        var2.throwStack.push(module0282.$ic27$);
                        final SubLObject var4 = module0282.$g2621$.currentBinding(var2);
                        try {
                            module0282.$g2621$.bind((SubLObject)module0282.NIL, var2);
                            var1 = f18699(var1);
                        }
                        finally {
                            module0282.$g2621$.rebind(var4, var2);
                        }
                    }
                    catch (Throwable var5) {
                        var3 = Errors.handleThrowable(var5, (SubLObject)module0282.$ic27$);
                    }
                    finally {
                        var2.throwStack.pop();
                    }
                }
                catch (Throwable var5) {
                    var3 = Errors.handleThrowable(var5, (SubLObject)module0282.$ic26$);
                }
                finally {
                    var2.throwStack.pop();
                }
            }
            catch (Throwable var5) {
                var3 = Errors.handleThrowable(var5, (SubLObject)module0282.$ic25$);
            }
            finally {
                var2.throwStack.pop();
            }
            if (module0282.NIL != var3) {
                if (module0282.NIL != module0152.$g2115$.getDynamicValue(var2)) {
                    module0274.f18082(var3);
                }
                return (SubLObject)module0282.NIL;
            }
        }
        return var1;
    }
    
    public static SubLObject f18699(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = var1;
        final SubLObject var4 = module0282.$g2621$.currentBinding(var2);
        final SubLObject var5 = module0144.$g1796$.currentBinding(var2);
        final SubLObject var6 = module0144.$g1795$.currentBinding(var2);
        final SubLObject var7 = module0152.$g2116$.currentBinding(var2);
        final SubLObject var8 = module0152.$g2115$.currentBinding(var2);
        try {
            module0282.$g2621$.bind(module0282.$g2621$.getDynamicValue(var2), var2);
            module0144.$g1796$.bind((SubLObject)module0282.NIL, var2);
            module0144.$g1795$.bind((SubLObject)module0282.NIL, var2);
            module0152.$g2116$.bind((SubLObject)module0282.NIL, var2);
            module0152.$g2115$.bind((SubLObject)module0282.NIL, var2);
            if (module0282.NIL != module0202.f12605(var1)) {
                var2.resetMultipleValues();
                final SubLObject var9 = module0202.f12796(var1);
                final SubLObject var10 = var2.secondMultipleValue();
                final SubLObject var11 = var2.thirdMultipleValue();
                var2.resetMultipleValues();
                module0282.$g2621$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var9, (SubLObject)module0282.NIL, var10, module0202.f12955(var11, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED), module0202.f12954(var11, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)), module0282.$g2621$.getDynamicValue(var2)), var2);
                var3 = module0202.f12775(var10, module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic28$), var1, (SubLObject)module0282.TWO_INTEGER));
            }
            else if (module0282.NIL != module0202.f12606(var1)) {
                var2.resetMultipleValues();
                final SubLObject var9 = module0202.f12796(var1);
                final SubLObject var10 = var2.secondMultipleValue();
                final SubLObject var11 = var2.thirdMultipleValue();
                var2.resetMultipleValues();
                module0282.$g2621$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var9, (SubLObject)module0282.NIL, var10, module0202.f12955(var11, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED), module0202.f12954(var11, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)), module0282.$g2621$.getDynamicValue(var2)), var2);
                var3 = module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic28$), var1, (SubLObject)module0282.TWO_INTEGER);
            }
            else if (module0282.NIL != module0202.f12623(var1)) {
                var2.resetMultipleValues();
                final SubLObject var9 = module0202.f12797(var1);
                final SubLObject var12 = var2.secondMultipleValue();
                final SubLObject var13 = var2.thirdMultipleValue();
                final SubLObject var14 = var2.fourthMultipleValue();
                var2.resetMultipleValues();
                module0282.$g2621$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var9, var12, var13, module0202.f12955(var14, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED), module0202.f12954(var14, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)), module0282.$g2621$.getDynamicValue(var2)), var2);
                var3 = module0202.f12815(Symbols.symbol_function((SubLObject)module0282.$ic28$), var1, (SubLObject)module0282.THREE_INTEGER);
            }
            else if (module0282.NIL != module0202.f12635(var1)) {
                var3 = module0202.f12811(Symbols.symbol_function((SubLObject)module0282.$ic28$), var1);
            }
            else if (module0282.NIL != module0018.f979() && module0282.NIL != module0202.f12883(var1, (SubLObject)module0282.UNPROVIDED)) {
                var2.resetMultipleValues();
                final SubLObject var15 = module0202.f12796(var1);
                final SubLObject var16 = var2.secondMultipleValue();
                final SubLObject var17 = var2.thirdMultipleValue();
                var2.resetMultipleValues();
                final SubLObject var18 = f18699(var17);
                var3 = f18700(module0202.f12782(var16, var18), module0282.$g2621$.getDynamicValue(var2));
            }
            else if (module0282.NIL != module0206.f13433(var1)) {
                var3 = f18700(var1, module0282.$g2621$.getDynamicValue(var2));
            }
            else if (module0282.NIL != module0207.f13510(var1)) {
                var3 = f18700(var1, module0282.$g2621$.getDynamicValue(var2));
            }
            else {
                module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic29$, var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
            }
        }
        finally {
            module0152.$g2115$.rebind(var8, var2);
            module0152.$g2116$.rebind(var7, var2);
            module0144.$g1795$.rebind(var6, var2);
            module0144.$g1796$.rebind(var5, var2);
            module0282.$g2621$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f18700(final SubLObject var1, final SubLObject var70) {
        SubLObject var71 = var1;
        SubLObject var72 = (SubLObject)module0282.NIL;
        SubLObject var73 = (SubLObject)module0282.NIL;
        SubLObject var74 = (SubLObject)module0282.NIL;
        SubLObject var75 = (SubLObject)module0282.NIL;
        SubLObject var76 = (SubLObject)module0282.NIL;
        SubLObject var77 = (SubLObject)module0282.NIL;
        SubLObject var78 = (SubLObject)module0282.NIL;
        var72 = var70;
        var73 = var72.first();
        var74 = var73.first();
        var75 = conses_high.second(var73);
        var76 = conses_high.third(var73);
        var77 = conses_high.fourth(var73);
        var78 = conses_high.fifth(var73);
        while (module0282.NIL != var72) {
            if (module0282.NIL != module0202.f12624(var74)) {
                var71 = f18701(var71, var74, var75, var76, var77, var78, var72);
            }
            var72 = var72.rest();
            var73 = var72.first();
            var74 = var73.first();
            var75 = conses_high.second(var73);
            var76 = conses_high.third(var73);
            var77 = conses_high.fourth(var73);
            var78 = conses_high.fifth(var73);
        }
        return var71;
    }
    
    public static SubLObject f18701(final SubLObject var1, final SubLObject var73, final SubLObject var74, final SubLObject var75, final SubLObject var76, final SubLObject var77, final SubLObject var71) {
        if (module0282.NIL != f18702()) {
            return var1;
        }
        if (module0282.NIL != module0202.f12956(var75, var1) && module0282.NIL != f18703()) {
            Dynamic.sublisp_throw((SubLObject)module0282.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0282.$ic27$, var75, var1));
        }
        else {
            SubLObject var78 = (SubLObject)module0282.NIL;
            SubLObject var79 = (SubLObject)module0282.NIL;
            SubLObject var80 = var71;
            SubLObject var81 = (SubLObject)module0282.NIL;
            var81 = var80.first();
            while (module0282.NIL != var80) {
                final SubLObject var82 = var81.first();
                final SubLObject var83 = conses_high.third(var81);
                final SubLObject var84 = conses_high.fourth(var81);
                final SubLObject var85 = conses_high.fifth(var81);
                if (module0282.$ic30$.eql(var82)) {
                    final SubLObject var87;
                    final SubLObject var86 = var87 = f18704(var83, var76, var84, var77, var85);
                    if (!var87.eql((SubLObject)module0282.$ic31$)) {
                        if (var87.eql((SubLObject)module0282.$ic32$)) {
                            var78 = (SubLObject)ConsesLow.cons(var83, var78);
                        }
                        else if (var87.eql((SubLObject)module0282.$ic33$)) {
                            var79 = (SubLObject)ConsesLow.cons(var83, var79);
                        }
                        else if (var87.eql((SubLObject)module0282.$ic34$)) {
                            Dynamic.sublisp_throw((SubLObject)module0282.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0282.$ic26$, var83, var75, var1));
                        }
                        else if (var87.eql((SubLObject)module0282.$ic35$)) {
                            module0202.f12747((SubLObject)module0282.ONE_INTEGER, (SubLObject)module0282.$ic36$, var83, var1, (SubLObject)module0282.UNPROVIDED);
                        }
                    }
                }
                var80 = var80.rest();
                var81 = var80.first();
            }
            if (Sequences.length(var79).numG((SubLObject)module0282.ONE_INTEGER)) {
                Dynamic.sublisp_throw((SubLObject)module0282.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0282.$ic25$, var75, var79));
            }
            else {
                if (module0282.NIL != f18705() && module0282.NIL == var78 && module0282.NIL == var79) {
                    return var1;
                }
                return module0205.f13248(f18706(var75, var78, var73, var74, var79.first()), var75, module0202.f12702(var1), Symbols.symbol_function((SubLObject)module0282.EQUAL));
            }
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18704(final SubLObject var17, final SubLObject var86, final SubLObject var87, final SubLObject var88, final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)module0282.$ic35$;
        if (module0282.NIL != conses_high.member(var17, var86, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
            if (module0282.NIL != module0004.f104(var17, var88, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED) || module0282.NIL != conses_high.member(var17, var89, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
                var91 = (SubLObject)module0282.$ic34$;
            }
            else {
                var91 = (SubLObject)module0282.$ic32$;
            }
        }
        else if (module0282.NIL != conses_high.member(var17, var88, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
            if (module0282.NIL != module0004.f104(var17, var87, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
                var91 = (SubLObject)module0282.$ic34$;
            }
            else {
                var91 = (SubLObject)module0282.$ic33$;
            }
        }
        else if (module0282.NIL != module0146.$g1994$.getDynamicValue(var90)) {
            var91 = (SubLObject)module0282.$ic31$;
        }
        else if (module0282.NIL != conses_high.member(var17, var87, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
            if (module0282.NIL != module0004.f104(var17, var89, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
                var91 = (SubLObject)module0282.$ic34$;
            }
            else {
                var91 = (SubLObject)module0282.$ic32$;
            }
        }
        else if (module0282.NIL != conses_high.member(var17, var89, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
            var91 = (SubLObject)module0282.$ic33$;
        }
        else {
            var91 = (SubLObject)module0282.$ic31$;
        }
        return var91;
    }
    
    public static SubLObject f18706(final SubLObject var17, final SubLObject var90, final SubLObject var81, final SubLObject var65, final SubLObject var91) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        if (module0282.NIL == var90 && module0282.NIL == var91 && module0282.NIL != module0146.$g1999$.getDynamicValue(var92)) {
            Errors.warn((SubLObject)module0282.$ic37$);
            return (SubLObject)module0282.NIL;
        }
        SubLObject var93 = (SubLObject)module0282.NIL;
        if (module0282.$ic38$.eql(var81)) {
            var93 = module0202.f12769(module0282.$ic39$, var90, var17, var91);
        }
        else {
            if (module0282.NIL == module0131.f8560() || module0282.NIL == module0202.f12621(var81)) {
                module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic41$, var81, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
                return (SubLObject)module0282.NIL;
            }
            var93 = module0202.f12770(module0282.$ic40$, var90, var17, var91, module0203.f13022(var81, var65));
        }
        return var93;
    }
    
    public static SubLObject f18702() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((module0282.NIL != module0018.$g698$.getDynamicValue(var2) && module0282.NIL == module0146.$g1995$.getDynamicValue(var2)) || module0282.NIL != module0146.$g1996$.getDynamicValue(var2));
    }
    
    public static SubLObject f18705() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0282.NIL != f18702() || module0282.NIL != module0146.$g1997$.getDynamicValue(var2));
    }
    
    public static SubLObject f18703() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0282.T == module0146.$g1998$.getDynamicValue(var2)) {
            return (SubLObject)module0282.T;
        }
        if (module0282.NIL == module0146.$g1998$.getDynamicValue(var2)) {
            return (SubLObject)module0282.NIL;
        }
        if (module0282.$ic42$ == module0146.$g1998$.getDynamicValue(var2)) {
            return module0018.f981();
        }
        return Errors.error((SubLObject)module0282.$ic43$, module0146.$g1998$.getDynamicValue(var2));
    }
    
    public static SubLObject f18707(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0282.NIL != module0202.f12605(var1)) {
            final SubLObject var3 = module0202.f12815((SubLObject)module0282.$ic44$, var1, module0202.f12749(var1));
            if (module0282.NIL != module0146.$g2025$.getDynamicValue(var2)) {
                return var3;
            }
            if (!module0282.$g2617$.getDynamicValue(var2).isList()) {
                return var3;
            }
            if (module0282.NIL != conses_high.member(module0202.f12744(var1), module0282.$g2617$.getDynamicValue(var2), (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED)) {
                return var3;
            }
            return module0202.f12775(module0202.f12744(var1), var3);
        }
        else {
            if (module0282.NIL != module0202.f12595(var1) || module0282.NIL != module0202.f12594(var1)) {
                return module0202.f12810((SubLObject)module0282.$ic44$, var1);
            }
            if (module0282.NIL != module0202.f12627(var1) || module0282.NIL != module0202.f12635(var1)) {
                return var1;
            }
            if (module0282.NIL != module0206.f13487(var1)) {
                return var1;
            }
            if (module0282.NIL != module0207.f13510(var1)) {
                return var1;
            }
            module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic45$, var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
            return var1;
        }
    }
    
    public static SubLObject f18708(final SubLObject var1) {
        if (module0282.NIL != f18709(var1)) {
            return f18710(var1);
        }
        return f18711(var1);
    }
    
    public static SubLObject f18711(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0282.NIL;
        final SubLObject var4 = module0144.$g1796$.currentBinding(var2);
        final SubLObject var5 = module0144.$g1795$.currentBinding(var2);
        final SubLObject var6 = module0152.$g2116$.currentBinding(var2);
        final SubLObject var7 = module0152.$g2115$.currentBinding(var2);
        try {
            module0144.$g1796$.bind((SubLObject)module0282.NIL, var2);
            module0144.$g1795$.bind((SubLObject)module0282.NIL, var2);
            module0152.$g2116$.bind((SubLObject)module0282.NIL, var2);
            module0152.$g2115$.bind((SubLObject)module0282.NIL, var2);
            if (module0282.NIL != module0202.f12595(var1)) {
                var3 = module0202.f12800((SubLObject)module0282.$ic46$, var1, (SubLObject)module0282.UNPROVIDED);
            }
            else if (module0282.NIL != module0202.f12594(var1)) {
                if (module0282.NIL != module0205.f13126(var1, (SubLObject)module0282.ONE_INTEGER)) {
                    var3 = var1;
                }
                else {
                    var1 = module0202.f12800((SubLObject)module0282.$ic46$, var1, (SubLObject)module0282.UNPROVIDED);
                    final SubLObject var8 = f18712(module0205.f13207(var1, (SubLObject)module0282.UNPROVIDED));
                    if (module0282.NIL != var8) {
                        final SubLObject var9 = Sequences.delete(var8, module0205.f13207(var1, (SubLObject)module0282.UNPROVIDED), (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
                        if (module0282.NIL != var9) {
                            SubLObject var10 = (SubLObject)module0282.NIL;
                            SubLObject var12;
                            final SubLObject var11 = var12 = module0205.f13207(var8, (SubLObject)module0282.$ic22$);
                            SubLObject var13 = (SubLObject)module0282.NIL;
                            var13 = var12.first();
                            while (module0282.NIL != var12) {
                                final SubLObject var14 = (SubLObject)ConsesLow.cons(var13, var9);
                                var10 = (SubLObject)ConsesLow.cons(module0276.f18280(var14, (SubLObject)module0282.UNPROVIDED), var10);
                                var12 = var12.rest();
                                var13 = var12.first();
                            }
                            var3 = module0276.f18288(module0035.f2076((SubLObject)module0282.$ic46$, var10), (SubLObject)module0282.UNPROVIDED);
                        }
                        else {
                            var3 = var8;
                        }
                    }
                    else {
                        var3 = var1;
                    }
                }
            }
            else if (module0282.NIL != module0202.f12627(var1) || module0282.NIL != module0202.f12635(var1)) {
                var3 = var1;
            }
            else if (module0282.NIL != module0207.f13522(var1)) {
                var3 = var1;
            }
            else if (module0282.NIL != module0207.f13510(var1)) {
                var3 = var1;
            }
            else {
                module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic47$, var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
                var3 = var1;
            }
        }
        finally {
            module0152.$g2115$.rebind(var7, var2);
            module0152.$g2116$.rebind(var6, var2);
            module0144.$g1795$.rebind(var5, var2);
            module0144.$g1796$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f18712(final SubLObject var98) {
        return Sequences.find_if(Symbols.symbol_function((SubLObject)module0282.$ic48$), var98, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
    }
    
    public static SubLObject f18709(final SubLObject var1) {
        if (module0282.NIL != module0202.f12594(var1)) {
            return f18713(var1, (SubLObject)module0282.$ic48$);
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18710(final SubLObject var1) {
        return Dynamic.sublisp_throw((SubLObject)module0282.$ic49$, var1);
    }
    
    public static SubLObject f18713(final SubLObject var1, final SubLObject var99) {
        final SubLObject var100 = Sequences.count_if(var99, module0205.f13207(var1, (SubLObject)module0282.UNPROVIDED), (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
        if (var100.numGE((SubLObject)module0282.FIVE_INTEGER)) {
            final SubLObject var101 = module0035.remove_if_not(var99, module0205.f13207(var1, (SubLObject)module0282.UNPROVIDED), (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
            if (module0282.NIL != var101) {
                final SubLObject var102 = f18714(var101);
                if (var102.numG((SubLObject)module0282.ONE_INTEGER)) {
                    final SubLObject var103 = Numbers.expt(var102, var100);
                    if (var103.numG(module0282.$g2622$.getGlobalValue())) {
                        return (SubLObject)module0282.T;
                    }
                }
            }
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18714(final SubLObject var103) {
        return module0048.f3383(var103, (SubLObject)module0282.$ic51$);
    }
    
    public static SubLObject f18715(SubLObject var1) {
        if (module0282.NIL == module0202.f12595(var1)) {
            var1 = module0202.f12773((SubLObject)ConsesLow.list(var1));
        }
        SubLObject var2 = (SubLObject)module0282.NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13207(var1, (SubLObject)module0282.$ic22$);
        SubLObject var5 = (SubLObject)module0282.NIL;
        var5 = var4.first();
        while (module0282.NIL != var4) {
            if (module0282.NIL != module0202.f12594(var5)) {
                var2 = (SubLObject)ConsesLow.cons(var5, var2);
            }
            else {
                var2 = (SubLObject)ConsesLow.cons(module0202.f12772((SubLObject)ConsesLow.list(var5)), var2);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return module0202.f12773(var2);
    }
    
    public static SubLObject f18716(SubLObject var1) {
        if (module0282.NIL == var1 || var1.eql(module0282.$ic6$) || var1.eql(module0282.$ic7$)) {
            return var1;
        }
        if (module0282.NIL != module0201.f12546(var1)) {
            var1 = module0279.f18522(var1, (SubLObject)module0282.UNPROVIDED);
        }
        var1 = f18715(var1);
        if (module0282.NIL == module0202.f12595(var1)) {
            module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic52$, var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
            return (SubLObject)module0282.NIL;
        }
        SubLObject var2 = (SubLObject)module0282.NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13207(var1, (SubLObject)module0282.$ic22$);
        SubLObject var5 = (SubLObject)module0282.NIL;
        var5 = var4.first();
        while (module0282.NIL != var4) {
            if (module0282.NIL == module0202.f12594(var5)) {
                module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic53$, var5, var1, (SubLObject)module0282.UNPROVIDED);
                return (SubLObject)module0282.NIL;
            }
            var2 = (SubLObject)ConsesLow.cons(f18717(module0205.f13207(var5, (SubLObject)module0282.UNPROVIDED)), var2);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f18718(final SubLObject var106) {
        return f18717(var106);
    }
    
    public static SubLObject f18719(final SubLObject var106) {
        return f18720(var106);
    }
    
    public static SubLObject f18721(final SubLObject var1) {
        if (module0282.NIL != f18722(var1)) {
            return f18723(var1);
        }
        return f18724(var1);
    }
    
    public static SubLObject f18724(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0282.NIL;
        final SubLObject var4 = module0144.$g1796$.currentBinding(var2);
        final SubLObject var5 = module0144.$g1795$.currentBinding(var2);
        final SubLObject var6 = module0152.$g2116$.currentBinding(var2);
        final SubLObject var7 = module0152.$g2115$.currentBinding(var2);
        try {
            module0144.$g1796$.bind((SubLObject)module0282.NIL, var2);
            module0144.$g1795$.bind((SubLObject)module0282.NIL, var2);
            module0152.$g2116$.bind((SubLObject)module0282.NIL, var2);
            module0152.$g2115$.bind((SubLObject)module0282.NIL, var2);
            if (module0282.NIL != module0202.f12594(var1)) {
                var3 = module0202.f12800((SubLObject)module0282.$ic54$, var1, (SubLObject)module0282.UNPROVIDED);
            }
            else if (module0282.NIL != module0202.f12595(var1)) {
                if (module0282.NIL != module0205.f13126(var1, (SubLObject)module0282.ONE_INTEGER)) {
                    var3 = var1;
                }
                else {
                    var1 = module0202.f12800((SubLObject)module0282.$ic54$, var1, (SubLObject)module0282.UNPROVIDED);
                    final SubLObject var8 = f18725(module0205.f13207(var1, (SubLObject)module0282.UNPROVIDED));
                    if (module0282.NIL != var8) {
                        final SubLObject var9 = Sequences.delete(var8, module0205.f13207(var1, (SubLObject)module0282.UNPROVIDED), Symbols.symbol_function((SubLObject)module0282.EQUAL), (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
                        if (module0282.NIL != var9) {
                            SubLObject var10 = (SubLObject)module0282.NIL;
                            SubLObject var12;
                            final SubLObject var11 = var12 = module0205.f13207(var8, (SubLObject)module0282.$ic22$);
                            SubLObject var13 = (SubLObject)module0282.NIL;
                            var13 = var12.first();
                            while (module0282.NIL != var12) {
                                final SubLObject var14 = (SubLObject)ConsesLow.cons(var13, var9);
                                var10 = (SubLObject)ConsesLow.cons(module0276.f18287(var14, (SubLObject)module0282.UNPROVIDED), var10);
                                var12 = var12.rest();
                                var13 = var12.first();
                            }
                            var3 = module0276.f18281(module0035.f2076((SubLObject)module0282.$ic54$, var10), (SubLObject)module0282.UNPROVIDED);
                        }
                        else {
                            var3 = var8;
                        }
                    }
                    else {
                        var3 = var1;
                    }
                }
            }
            else if (module0282.NIL != module0202.f12627(var1) || module0282.NIL != module0202.f12635(var1)) {
                var3 = var1;
            }
            else if (module0282.NIL != module0207.f13522(var1)) {
                var3 = var1;
            }
            else if (module0282.NIL != module0207.f13510(var1)) {
                var3 = var1;
            }
            else {
                module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic55$, var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
                var3 = var1;
            }
        }
        finally {
            module0152.$g2115$.rebind(var7, var2);
            module0152.$g2116$.rebind(var6, var2);
            module0144.$g1795$.rebind(var5, var2);
            module0144.$g1796$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f18725(final SubLObject var98) {
        return Sequences.find_if(Symbols.symbol_function((SubLObject)module0282.$ic56$), var98, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
    }
    
    public static SubLObject f18722(final SubLObject var1) {
        if (module0282.NIL != module0202.f12595(var1)) {
            return f18713(var1, (SubLObject)module0282.$ic56$);
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18723(final SubLObject var1) {
        return Dynamic.sublisp_throw((SubLObject)module0282.$ic57$, var1);
    }
    
    public static SubLObject f18726(SubLObject var1) {
        if (module0282.NIL == module0202.f12594(var1)) {
            var1 = module0202.f12772((SubLObject)ConsesLow.list(var1));
        }
        SubLObject var2 = (SubLObject)module0282.NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13207(var1, (SubLObject)module0282.$ic22$);
        SubLObject var5 = (SubLObject)module0282.NIL;
        var5 = var4.first();
        while (module0282.NIL != var4) {
            if (module0282.NIL != module0202.f12595(var5)) {
                var2 = (SubLObject)ConsesLow.cons(var5, var2);
            }
            else {
                var2 = (SubLObject)ConsesLow.cons(module0202.f12773((SubLObject)ConsesLow.list(var5)), var2);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return module0202.f12772(var2);
    }
    
    public static SubLObject f18727(SubLObject var1) {
        if (module0282.NIL == var1 || var1.eql(module0282.$ic6$) || var1.eql(module0282.$ic7$)) {
            return var1;
        }
        if (module0282.NIL != module0201.f12546(var1)) {
            var1 = module0279.f18522(var1, (SubLObject)module0282.UNPROVIDED);
        }
        var1 = f18726(var1);
        if (module0282.NIL == module0202.f12594(var1)) {
            module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic58$, var1, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
            return (SubLObject)module0282.NIL;
        }
        SubLObject var2 = (SubLObject)module0282.NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13207(var1, (SubLObject)module0282.$ic22$);
        SubLObject var5 = (SubLObject)module0282.NIL;
        var5 = var4.first();
        while (module0282.NIL != var4) {
            if (module0282.NIL == module0202.f12595(var5)) {
                module0202.f12747((SubLObject)module0282.FOUR_INTEGER, (SubLObject)module0282.$ic59$, var5, var1, (SubLObject)module0282.UNPROVIDED);
                return (SubLObject)module0282.NIL;
            }
            var2 = (SubLObject)ConsesLow.cons(f18717(module0205.f13207(var5, (SubLObject)module0282.UNPROVIDED)), var2);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f18728(final SubLObject var106) {
        return f18717(var106);
    }
    
    public static SubLObject f18729() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0282.$g2623$.getDynamicValue(var2);
    }
    
    public static SubLObject f18730() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0282.$g2624$.getDynamicValue(var2);
    }
    
    public static SubLObject f18731(SubLObject var1, SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = module0282.$g2623$.currentBinding(var68);
        final SubLObject var70 = module0282.$g2624$.currentBinding(var68);
        try {
            module0282.$g2623$.bind(var1, var68);
            module0282.$g2624$.bind(var67, var68);
            var68.resetMultipleValues();
            final SubLObject var110_111 = f18732(var1, var67);
            final SubLObject var112_113 = var68.secondMultipleValue();
            var68.resetMultipleValues();
            var1 = var110_111;
            var67 = var112_113;
            var68.resetMultipleValues();
            final SubLObject var114_115 = module0281.f18657(var1, var67);
            final SubLObject var116_117 = var68.secondMultipleValue();
            var68.resetMultipleValues();
            var1 = var114_115;
            var67 = var116_117;
        }
        finally {
            module0282.$g2624$.rebind(var70, var68);
            module0282.$g2623$.rebind(var69, var68);
        }
        var1 = module0276.f18302(var1, (SubLObject)module0282.UNPROVIDED);
        return Values.values(var1, var67);
    }
    
    public static SubLObject f18732(SubLObject var1, SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        var68.resetMultipleValues();
        final SubLObject var118_119 = module0280.f18636(var1, var67);
        final SubLObject var120_121 = var68.secondMultipleValue();
        var68.resetMultipleValues();
        var1 = var118_119;
        var67 = var120_121;
        var1 = module0276.f18302(var1, (SubLObject)module0282.UNPROVIDED);
        var1 = f18664(var1);
        var1 = module0276.f18302(var1, (SubLObject)module0282.UNPROVIDED);
        var1 = f18668(var1);
        var1 = f18691(var1);
        final SubLObject var69 = module0282.$g2617$.currentBinding(var68);
        try {
            module0282.$g2617$.bind((SubLObject)module0282.NIL, var68);
            var1 = f18686(var1);
            var1 = f18698(var1);
            var1 = f18707(var1);
        }
        finally {
            module0282.$g2617$.rebind(var69, var68);
        }
        return Values.values(var1, var67);
    }
    
    public static SubLObject f18733(final SubLObject var122) {
        if (module0282.$ic6$.eql(var122)) {
            return var122;
        }
        if (module0282.$ic7$.eql(var122)) {
            return var122;
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0282.$ic60$), var122);
    }
    
    public static SubLObject f18717(final SubLObject var106) {
        final SubLObject var107 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0282.$ic61$), module0202.f12842(var106));
        final SubLObject var108 = module0202.f12843(var106);
        return module0232.f15319(var107, var108);
    }
    
    public static SubLObject f18720(final SubLObject var106) {
        final SubLObject var107 = module0035.f2076(Symbols.symbol_function((SubLObject)module0282.$ic61$), module0202.f12842(var106));
        final SubLObject var108 = module0202.f12843(var106);
        return module0232.f15319(var107, var108);
    }
    
    public static SubLObject f18734(final SubLObject var1, final SubLObject var67) {
        final SubLObject var68 = module0202.f12707(var1, (SubLObject)module0282.UNPROVIDED);
        final SubLObject var1_127;
        final SubLObject var69 = var1_127 = ((module0282.NIL != var68) ? ConsesLow.append(module0202.f12712(var1), (SubLObject)ConsesLow.list(var68)) : var1);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0282.NIL != module0202.f12590(var1_127) && module0282.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)module0282.$ic15$), var1_127, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED) && module0282.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)module0282.$ic62$), var1_127, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED) && module0282.NIL != module0269.f17706(module0205.f13132(var1_127)) && module0282.NIL == module0280.f18633(var1_127, var67, (SubLObject)module0282.T));
    }
    
    public static SubLObject f18735(SubLObject var1, SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = module0146.$g2031$.currentBinding(var68);
        final SubLObject var70 = module0146.$g2003$.currentBinding(var68);
        try {
            module0146.$g2031$.bind((module0282.NIL != module0146.$g2031$.getDynamicValue(var68)) ? module0146.$g2031$.getDynamicValue(var68) : Hashtables.make_hash_table((SubLObject)module0282.$ic16$, Symbols.symbol_function((SubLObject)module0282.EQL), (SubLObject)module0282.UNPROVIDED), var68);
            module0146.$g2003$.bind((SubLObject)((module0282.NIL != module0146.$g2003$.getDynamicValue(var68)) ? module0146.$g2003$.getDynamicValue(var68) : module0282.NIL), var68);
            var68.resetMultipleValues();
            final SubLObject var128_129 = f18736(var1, var67, (SubLObject)module0282.NIL);
            final SubLObject var130_131 = var68.secondMultipleValue();
            var68.resetMultipleValues();
            var1 = var128_129;
            var67 = var130_131;
        }
        finally {
            module0146.$g2003$.rebind(var70, var68);
            module0146.$g2031$.rebind(var69, var68);
        }
        return Values.values(var1, var67);
    }
    
    public static SubLObject f18737(final SubLObject var1, final SubLObject var67) {
        return f18736(var1, var67, (SubLObject)module0282.T);
    }
    
    public static SubLObject f18736(SubLObject var1, SubLObject var67, final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        if (module0282.NIL == var132) {
            var1 = module0202.f12764(var1);
        }
        if (module0282.NIL != f18734(var1, var67)) {
            var1 = module0276.f18313(var1, (SubLObject)module0282.UNPROVIDED);
        }
        else {
            var133.resetMultipleValues();
            final SubLObject var133_134 = f18731(var1, var67);
            final SubLObject var135_136 = var133.secondMultipleValue();
            var133.resetMultipleValues();
            var1 = var133_134;
            var67 = var135_136;
            if (module0282.NIL != module0151.f9690()) {
                var1 = f18708(var1);
            }
            else {
                SubLObject var134 = (SubLObject)module0282.NIL;
                try {
                    var133.throwStack.push(module0282.$ic49$);
                    var1 = f18708(var1);
                }
                catch (Throwable var135) {
                    var134 = Errors.handleThrowable(var135, (SubLObject)module0282.$ic49$);
                }
                finally {
                    var133.throwStack.pop();
                }
                if (module0282.NIL != var134) {
                    var1 = (SubLObject)module0282.NIL;
                }
            }
            var1 = module0276.f18302(var1, (SubLObject)module0282.UNPROVIDED);
        }
        return Values.values(var1, var67);
    }
    
    public static SubLObject f18738(SubLObject var1, SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = module0146.$g2031$.currentBinding(var68);
        final SubLObject var70 = module0146.$g2003$.currentBinding(var68);
        try {
            module0146.$g2031$.bind((module0282.NIL != module0146.$g2031$.getDynamicValue(var68)) ? module0146.$g2031$.getDynamicValue(var68) : Hashtables.make_hash_table((SubLObject)module0282.$ic16$, Symbols.symbol_function((SubLObject)module0282.EQL), (SubLObject)module0282.UNPROVIDED), var68);
            module0146.$g2003$.bind((SubLObject)((module0282.NIL != module0146.$g2003$.getDynamicValue(var68)) ? module0146.$g2003$.getDynamicValue(var68) : module0282.NIL), var68);
            var68.resetMultipleValues();
            final SubLObject var137_138 = f18739(var1, var67, (SubLObject)module0282.NIL);
            final SubLObject var139_140 = var68.secondMultipleValue();
            var68.resetMultipleValues();
            var1 = var137_138;
            var67 = var139_140;
        }
        finally {
            module0146.$g2003$.rebind(var70, var68);
            module0146.$g2031$.rebind(var69, var68);
        }
        return Values.values(var1, var67);
    }
    
    public static SubLObject f18740(final SubLObject var1, final SubLObject var67) {
        return f18739(var1, var67, (SubLObject)module0282.T);
    }
    
    public static SubLObject f18739(SubLObject var1, SubLObject var67, final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        if (module0282.NIL == var132) {
            var1 = module0202.f12764(var1);
        }
        if (module0282.NIL != f18734(var1, var67)) {
            var1 = module0276.f18313(var1, (SubLObject)module0282.UNPROVIDED);
        }
        else {
            var133.resetMultipleValues();
            final SubLObject var141_142 = f18731(var1, var67);
            final SubLObject var143_144 = var133.secondMultipleValue();
            var133.resetMultipleValues();
            var1 = var141_142;
            var67 = var143_144;
            if (module0282.NIL != module0151.f9690()) {
                var1 = f18721(var1);
            }
            else {
                SubLObject var134 = (SubLObject)module0282.NIL;
                try {
                    var133.throwStack.push(module0282.$ic57$);
                    var1 = f18721(var1);
                }
                catch (Throwable var135) {
                    var134 = Errors.handleThrowable(var135, (SubLObject)module0282.$ic57$);
                }
                finally {
                    var133.throwStack.pop();
                }
                if (module0282.NIL != var134) {
                    var1 = (SubLObject)module0282.NIL;
                }
            }
            var1 = module0276.f18302(var1, (SubLObject)module0282.UNPROVIDED);
        }
        return Values.values(var1, var67);
    }
    
    public static SubLObject f18741(final SubLObject var1, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        SubLObject var69 = module0202.f12764(var1);
        final SubLObject var70 = (SubLObject)module0282.NIL;
        final SubLObject var71 = module0146.$g2031$.currentBinding(var68);
        final SubLObject var72 = module0146.$g2003$.currentBinding(var68);
        try {
            module0146.$g2031$.bind(Hashtables.make_hash_table((SubLObject)module0282.FOUR_INTEGER, Symbols.symbol_function((SubLObject)module0282.EQL), (SubLObject)module0282.UNPROVIDED), var68);
            module0146.$g2003$.bind((SubLObject)module0282.NIL, var68);
            var69 = module0280.f18636(var69, var67);
            var69 = f18664(var69);
            var69 = f18668(var69);
            var69 = f18689(var69);
            var69 = f18691(var69);
            var69 = f18698(var69);
            var69 = module0285.f19069(var69);
            var69 = f18707(var69);
            var69 = f18742(var69);
        }
        finally {
            module0146.$g2003$.rebind(var72, var68);
            module0146.$g2031$.rebind(var71, var68);
        }
        return var70;
    }
    
    public static SubLObject f18742(final SubLObject var1) {
        if (module0282.NIL == module0279.f18520(var1)) {
            if (!var1.isAtom()) {
                if (module0282.NIL == module0202.f12592(var1)) {
                    if (module0282.NIL != module0202.f12595(var1) || module0282.NIL != module0202.f12594(var1)) {
                        return module0035.f2077(Symbols.symbol_function((SubLObject)module0282.$ic63$), module0205.f13207(var1, (SubLObject)module0282.UNPROVIDED));
                    }
                    if (module0282.NIL != module0202.f12605(var1)) {
                        return (SubLObject)ConsesLow.cons(module0202.f12744(var1), f18742(module0202.f12668(var1)));
                    }
                }
            }
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18743(final SubLObject var146) {
        return Sort.sort(conses_high.copy_list(var146), Symbols.symbol_function((SubLObject)module0282.$ic64$), Symbols.symbol_function((SubLObject)module0282.$ic65$));
    }
    
    public static SubLObject f18744(final SubLObject var147, final SubLObject var148, SubLObject var149) {
        if (var149 == module0282.UNPROVIDED) {
            var149 = module0282.$ic66$;
        }
        if (var147.isCons() && module0282.NIL != module0035.f2014(var148)) {
            SubLObject var150 = (SubLObject)module0282.NIL;
            SubLObject var151 = var148;
            SubLObject var152 = (SubLObject)module0282.NIL;
            var152 = var151.first();
            while (module0282.NIL != var151) {
                var150 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var149, var152, var147), var150);
                var151 = var151.rest();
                var152 = var151.first();
            }
            return Sequences.nreverse(var150);
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18745(final SubLObject var1, final SubLObject var67, SubLObject var151) {
        if (var151 == module0282.UNPROVIDED) {
            var151 = (SubLObject)module0282.$ic67$;
        }
        final SubLObject var152 = var151;
        if (var152.eql((SubLObject)module0282.$ic67$)) {
            return f18746(var1, var67);
        }
        if (var152.eql((SubLObject)module0282.$ic68$)) {
            return f18747(var1, var67);
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18746(final SubLObject var1, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        if (module0282.NIL != module0282.$g2616$.getDynamicValue(var68)) {
            return f18748(var1, var67);
        }
        return f18749(var1, var67);
    }
    
    public static SubLObject f18750() {
        final SubLObject var152 = module0282.$g2625$.getGlobalValue();
        if (module0282.NIL != var152) {
            module0034.f1818(var152);
        }
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18751(final SubLObject var1, final SubLObject var67) {
        return module0034.f1829(module0282.$g2625$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var67), (SubLObject)module0282.UNPROVIDED, (SubLObject)module0282.UNPROVIDED);
    }
    
    public static SubLObject f18752(final SubLObject var1, final SubLObject var67) {
        return f18749(var1, var67);
    }
    
    public static SubLObject f18748(final SubLObject var1, final SubLObject var67) {
        SubLObject var68 = module0282.$g2625$.getGlobalValue();
        if (module0282.NIL == var68) {
            var68 = module0034.f1934((SubLObject)module0282.$ic69$, (SubLObject)module0282.$ic70$, (SubLObject)module0282.NIL, (SubLObject)module0282.EQUAL, (SubLObject)module0282.TWO_INTEGER, (SubLObject)module0282.$ic71$);
        }
        final SubLObject var69 = module0034.f1782(var1, var67);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)module0282.UNPROVIDED);
        if (var70 != module0282.$ic72$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)module0282.NIL;
            var72 = var71.first();
            while (module0282.NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var1.equal(var73.first())) {
                    var73 = var73.rest();
                    if (module0282.NIL != var73 && module0282.NIL == var73.rest() && var67.equal(var73.first())) {
                        return module0034.f1959(var74);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18752(var1, var67)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var1, var67));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f18749(final SubLObject var1, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        var68.resetMultipleValues();
        final SubLObject var69 = f18735(var1, var67);
        final SubLObject var70 = var68.secondMultipleValue();
        var68.resetMultipleValues();
        return Values.values(f18716(var69), var70);
    }
    
    public static SubLObject f18747(final SubLObject var1, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        var68.resetMultipleValues();
        final SubLObject var69 = f18738(var1, var67);
        final SubLObject var70 = var68.secondMultipleValue();
        var68.resetMultipleValues();
        return Values.values(f18727(var69), var70);
    }
    
    public static SubLObject f18753() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18664", "S#21240", 1, 0, false);
        new $f18664$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18665", "S#21250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18666", "S#21251", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18667", "S#21042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18668", "S#21241", 1, 0, false);
        new $f18668$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18671", "S#21252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18670", "S#21253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18682", "S#21254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18683", "S#16020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18675", "S#21255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18684", "S#21256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18673", "S#21257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18685", "S#21258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18674", "S#21259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18676", "S#21260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18677", "S#21261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18678", "S#21262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18679", "S#21263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18680", "S#21264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18681", "S#21265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18672", "S#21266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18669", "S#21267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18686", "S#21268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18689", "S#21269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18688", "S#21270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18687", "S#21271", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18690", "S#15538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18691", "S#21272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18692", "S#21245", 1, 0, false);
        new $f18692$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18693", "S#21273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18694", "S#21274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18695", "S#21275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18696", "S#21276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18697", "S#20883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18698", "S#21277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18699", "S#21278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18700", "S#21279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18701", "S#21280", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18704", "S#21281", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18706", "S#21282", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18702", "S#21283", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18705", "S#21284", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18703", "S#21285", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18707", "S#21247", 1, 0, false);
        new $f18707$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18708", "S#21286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18711", "S#21287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18712", "S#21288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18709", "S#21289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18710", "S#21290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18713", "S#21291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18714", "S#21292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18715", "S#20885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18716", "S#21293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18718", "S#21294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18719", "S#21295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18721", "S#21248", 1, 0, false);
        new $f18721$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18724", "S#21296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18725", "S#21297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18722", "S#21298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18723", "S#21299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18726", "S#21300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18727", "S#21301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18728", "S#21302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18729", "S#21234", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18730", "S#21235", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18731", "S#21303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18732", "S#21304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18733", "S#21305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18717", "S#21306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18720", "S#21307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18734", "S#21308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18735", "S#20884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18737", "S#21309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18736", "S#21310", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18738", "S#21311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18740", "S#21312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18739", "S#21313", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18741", "S#21314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18742", "S#21315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18743", "S#21316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18744", "S#21317", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18745", "S#21318", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18746", "S#21319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18750", "S#21320", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18751", "S#21321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18752", "S#21322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18748", "S#21323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18749", "S#21324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0282", "f18747", "S#16453", 2, 0, false);
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18754() {
        module0282.$g2615$ = SubLFiles.defparameter("S#21325", (SubLObject)module0282.$ic0$);
        module0282.$g2616$ = SubLFiles.defparameter("S#21326", (SubLObject)module0282.T);
        module0282.$g2617$ = SubLFiles.defparameter("S#21327", (SubLObject)module0282.$ic1$);
        module0282.$g2618$ = SubLFiles.defparameter("S#21328", (SubLObject)module0282.$ic2$);
        module0282.$g2619$ = SubLFiles.defparameter("S#21329", (SubLObject)module0282.$ic2$);
        module0282.$g2620$ = SubLFiles.defparameter("S#21330", (SubLObject)module0282.T);
        module0282.$g2621$ = SubLFiles.defparameter("S#21331", (SubLObject)module0282.NIL);
        module0282.$g2622$ = SubLFiles.deflexical("S#21332", (SubLObject)module0282.$ic50$);
        module0282.$g2623$ = SubLFiles.defparameter("S#21333", (SubLObject)module0282.NIL);
        module0282.$g2624$ = SubLFiles.defparameter("S#21334", (SubLObject)module0282.NIL);
        module0282.$g2625$ = SubLFiles.deflexical("S#21335", (SubLObject)module0282.NIL);
        return (SubLObject)module0282.NIL;
    }
    
    public static SubLObject f18755() {
        module0034.f1909((SubLObject)module0282.$ic69$);
        return (SubLObject)module0282.NIL;
    }
    
    public void declareFunctions() {
        f18753();
    }
    
    public void initializeVariables() {
        f18754();
    }
    
    public void runTopLevelForms() {
        f18755();
    }
    
    static {
        me = (SubLFile)new module0282();
        module0282.$g2615$ = null;
        module0282.$g2616$ = null;
        module0282.$g2617$ = null;
        module0282.$g2618$ = null;
        module0282.$g2619$ = null;
        module0282.$g2620$ = null;
        module0282.$g2621$ = null;
        module0282.$g2622$ = null;
        module0282.$g2623$ = null;
        module0282.$g2624$ = null;
        module0282.$g2625$ = null;
        $ic0$ = SubLObjectFactory.makeString("el-var");
        $ic1$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic2$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic3$ = SubLObjectFactory.makeSymbol("S#21250", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#21241", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("HELLO-YOU-SILLY-COMPILER");
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic8$ = SubLObjectFactory.makeKeyword("REGULARIZE");
        $ic9$ = SubLObjectFactory.makeString("~s is not a quantified sentence");
        $ic10$ = SubLObjectFactory.makeSymbol("S#21255", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#21252", "CYC");
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DifferenceFn"));
        $ic13$ = SubLObjectFactory.makeString("~s contained the invalid bound ~D");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PlusFn"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic16$ = SubLObjectFactory.makeInteger(32);
        $ic17$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#21245", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#21273", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#21274", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic23$ = SubLObjectFactory.makeString("-");
        $ic24$ = SubLObjectFactory.makeSymbol("S#15480", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $ic26$ = SubLObjectFactory.makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");
        $ic27$ = SubLObjectFactory.makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");
        $ic28$ = SubLObjectFactory.makeSymbol("S#21278", "CYC");
        $ic29$ = SubLObjectFactory.makeString("Unexpected sentence type in existentials-out-int: ~S");
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic31$ = SubLObjectFactory.makeKeyword("NEITHER");
        $ic32$ = SubLObjectFactory.makeKeyword("TERM");
        $ic33$ = SubLObjectFactory.makeKeyword("SEQ");
        $ic34$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic35$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic36$ = SubLObjectFactory.makeString("Skolemizer failed to classify variable ~a in sentence ~a~%");
        $ic37$ = SubLObjectFactory.makeString("skolem constants not yet supported");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn"));
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn"));
        $ic41$ = SubLObjectFactory.makeString("make-skolem-fn-fn doesn't know how to handle the quantifier ~S");
        $ic42$ = SubLObjectFactory.makeKeyword("ASSERT-ONLY");
        $ic43$ = SubLObjectFactory.makeString("Unexpected value for *forbid-quantified-sequence-variables?*: ~s");
        $ic44$ = SubLObjectFactory.makeSymbol("S#21247", "CYC");
        $ic45$ = SubLObjectFactory.makeString("Got the unexpected sentence ~S in universals-out.");
        $ic46$ = SubLObjectFactory.makeSymbol("S#21286", "CYC");
        $ic47$ = SubLObjectFactory.makeString("Got the unexpected sentence ~S in disjunctions-in.");
        $ic48$ = SubLObjectFactory.makeSymbol("S#13276", "CYC");
        $ic49$ = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");
        $ic50$ = SubLObjectFactory.makeInteger(200000);
        $ic51$ = SubLObjectFactory.makeSymbol("S#15640", "CYC");
        $ic52$ = SubLObjectFactory.makeString("~s is not a conjunction, so it is not a CNF sentence.");
        $ic53$ = SubLObjectFactory.makeString("~s is not a disjunction, so ~S is not a CNF sentence.");
        $ic54$ = SubLObjectFactory.makeSymbol("S#21248", "CYC");
        $ic55$ = SubLObjectFactory.makeString("Got the unexpected formula ~S in conjunctions-in.");
        $ic56$ = SubLObjectFactory.makeSymbol("S#15477", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");
        $ic58$ = SubLObjectFactory.makeString("~s is not a disjunction, so it is not a DNF sentence.");
        $ic59$ = SubLObjectFactory.makeString("~s is not a conjunction, so ~S is not a DNF sentence.");
        $ic60$ = SubLObjectFactory.makeSymbol("S#21306", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#13440", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic63$ = SubLObjectFactory.makeSymbol("S#21315", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic65$ = SubLObjectFactory.makeSymbol("S#3851", "CYC");
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic67$ = SubLObjectFactory.makeKeyword("CNF");
        $ic68$ = SubLObjectFactory.makeKeyword("DNF");
        $ic69$ = SubLObjectFactory.makeSymbol("S#21323", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#21335", "CYC");
        $ic71$ = SubLObjectFactory.makeInteger(48);
        $ic72$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
    }
    
    public static final class $f18664$UnaryFunction extends UnaryFunction
    {
        public $f18664$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21240"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0282.f18664(var5);
        }
    }
    
    public static final class $f18668$UnaryFunction extends UnaryFunction
    {
        public $f18668$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21241"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0282.f18668(var5);
        }
    }
    
    public static final class $f18692$UnaryFunction extends UnaryFunction
    {
        public $f18692$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21245"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0282.f18692(var5);
        }
    }
    
    public static final class $f18707$UnaryFunction extends UnaryFunction
    {
        public $f18707$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21247"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0282.f18707(var5);
        }
    }
    
    public static final class $f18721$UnaryFunction extends UnaryFunction
    {
        public $f18721$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21248"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0282.f18721(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0282.class
	Total time: 483 ms
	
	Decompiled with Procyon 0.5.32.
*/