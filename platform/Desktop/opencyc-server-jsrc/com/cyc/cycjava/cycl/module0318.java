package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0318 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0318";
    public static final String myFingerPrint = "bea099afa1783c33a55afd413548efe3f42a2d02ba50c6cbc3b9f20ca9a6ec82";
    private static SubLSymbol $g2803$;
    private static SubLSymbol $g2804$;
    private static SubLSymbol $g2805$;
    private static SubLSymbol $g2806$;
    private static SubLSymbol $g2807$;
    public static SubLSymbol $g2808$;
    private static SubLSymbol $g2809$;
    private static SubLSymbol $g2810$;
    private static SubLSymbol $g2811$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    
    public static SubLObject f21423() {
        return module0318.$g2803$.getGlobalValue();
    }
    
    public static SubLObject f21424(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic1$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0318.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic1$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0318.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0318.NIL;
        SubLObject var10_11 = (SubLObject)module0318.NIL;
        while (module0318.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0318.$ic1$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0318.$ic1$);
            if (module0318.NIL == conses_high.member(var10_11, (SubLObject)module0318.$ic2$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED)) {
                var9 = (SubLObject)module0318.T;
            }
            if (var10_11 == module0318.$ic3$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0318.NIL != var9 && module0318.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0318.$ic1$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0318.$ic4$, var4);
        final SubLObject var11 = (SubLObject)((module0318.NIL != var10) ? conses_high.cadr(var10) : module0318.NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0318.$ic5$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0318.$ic6$, var11), ConsesLow.append(var12, (SubLObject)module0318.NIL));
    }
    
    public static SubLObject f21425() {
        return module0318.$g2804$.getGlobalValue();
    }
    
    public static SubLObject f21426() {
        return module0318.$g2805$.getGlobalValue();
    }
    
    public static SubLObject f21427() {
        return module0318.$g2806$.getGlobalValue();
    }
    
    public static SubLObject f21428(final SubLObject var15, final SubLObject var16, final SubLObject var6, final SubLObject var17, final SubLObject var18) {
        if (module0318.NIL != module0202.f12895(var15)) {
            return (SubLObject)module0318.NIL;
        }
        final SubLObject var19 = f21429(var17, var18);
        if (module0318.NIL != f21430(var16, var6, var15, var19) && module0318.NIL == f21431(var19)) {
            return (SubLObject)module0318.NIL;
        }
        return (SubLObject)module0318.T;
    }
    
    public static SubLObject f21430(final SubLObject var16, final SubLObject var20, final SubLObject var15, final SubLObject var17) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0318.NIL != module0318.$g2807$.getDynamicValue(var21) || module0318.NIL != module0035.sublisp_boolean(module0217.f14426(module0202.f12683(module0318.$ic10$, (SubLObject)ConsesLow.list(var16, var20, var15, var17), (SubLObject)module0318.UNPROVIDED))));
    }
    
    public static SubLObject f21431(final SubLObject var17) {
        final SubLObject var18 = module0321.f21689(var17);
        if (module0318.NIL != var18) {
            return Equality.eq(var18, (SubLObject)module0318.T);
        }
        final SubLObject var19 = module0304.f20285(module0321.f21688(var17), var17, module0321.f21684(), (SubLObject)module0318.UNPROVIDED);
        if (module0318.NIL != var19) {
            module0321.f21690(var17);
        }
        else {
            module0321.f21691(var17);
        }
        return Equality.eq(var19, (SubLObject)module0318.T);
    }
    
    public static SubLObject f21432(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0318.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic12$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0318.$ic13$, (SubLObject)ConsesLow.listS((SubLObject)module0318.$ic14$, var5, (SubLObject)module0318.$ic15$), (SubLObject)ConsesLow.listS((SubLObject)module0318.$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0318.$ic17$, var5)), ConsesLow.append(var6, (SubLObject)module0318.NIL)));
    }
    
    public static SubLObject f21433(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return Numbers.numL(var27, module0318.$g2808$.getDynamicValue(var28));
    }
    
    public static SubLObject f21434(final SubLObject var6) {
        return module0269.f17806(var6);
    }
    
    public static SubLObject f21435(final SubLObject var6) {
        return module0226.f14807(var6);
    }
    
    public static SubLObject f21436(final SubLObject var28) {
        return module0269.f17806(module0178.f11335(var28));
    }
    
    public static SubLObject f21437(final SubLObject var28) {
        return module0226.f14807(module0178.f11335(var28));
    }
    
    public static SubLObject f21438(final SubLObject var30) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0318.NIL != module0220.f14549(var30, module0318.$ic18$, (SubLObject)module0318.$ic19$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED) || module0318.NIL != module0220.f14549(var30, module0318.$ic20$, (SubLObject)module0318.$ic19$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED));
    }
    
    public static SubLObject f21439(final SubLObject var30) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0318.NIL != module0220.f14549(var30, module0318.$ic21$, (SubLObject)module0318.$ic22$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED) || module0318.NIL != module0220.f14549(var30, module0318.$ic23$, (SubLObject)module0318.$ic22$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED));
    }
    
    public static SubLObject f21440(final SubLObject var30) {
        return f21441(var30, (SubLObject)module0318.UNPROVIDED);
    }
    
    public static SubLObject f21442(final SubLObject var30) {
        return f21443(var30, (SubLObject)module0318.UNPROVIDED);
    }
    
    public static SubLObject f21444() {
        final SubLObject var31 = module0318.$g2809$.getGlobalValue();
        if (module0318.NIL != var31) {
            module0034.f1818(var31);
        }
        return (SubLObject)module0318.NIL;
    }
    
    public static SubLObject f21445(final SubLObject var30, SubLObject var32) {
        if (var32 == module0318.UNPROVIDED) {
            var32 = module0147.f9552((SubLObject)module0318.UNPROVIDED);
        }
        return module0034.f1829(module0318.$g2809$.getGlobalValue(), (SubLObject)ConsesLow.list(var30, var32), (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
    }
    
    public static SubLObject f21446(final SubLObject var30, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0318.NIL;
        if (module0318.NIL != module0147.f9491(var32, (SubLObject)module0318.$ic25$)) {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic25$, var33);
                module0147.$g2095$.bind(module0318.$ic26$, var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic27$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        else if (module0318.NIL != module0147.f9491(var32, (SubLObject)module0318.$ic28$)) {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic28$, var33);
                module0147.$g2095$.bind(module0318.$ic29$, var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic27$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        else if (module0318.NIL != module0161.f10488(var32)) {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic30$, var33);
                module0147.$g2096$.bind(module0161.f10522(var32), var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic27$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        else {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic31$, var33);
                module0147.$g2095$.bind(var32, var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic27$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        return var34;
    }
    
    public static SubLObject f21441(final SubLObject var30, SubLObject var32) {
        if (var32 == module0318.UNPROVIDED) {
            var32 = module0147.f9552((SubLObject)module0318.UNPROVIDED);
        }
        SubLObject var33 = module0318.$g2809$.getGlobalValue();
        if (module0318.NIL == var33) {
            var33 = module0034.f1934((SubLObject)module0318.$ic24$, (SubLObject)module0318.$ic32$, (SubLObject)module0318.NIL, (SubLObject)module0318.EQUAL, (SubLObject)module0318.TWO_INTEGER, (SubLObject)module0318.$ic33$);
            module0034.f1940((SubLObject)module0318.$ic34$);
        }
        final SubLObject var34 = module0034.f1782(var30, var32);
        final SubLObject var35 = module0034.f1814(var33, var34, (SubLObject)module0318.UNPROVIDED);
        if (var35 != module0318.$ic35$) {
            SubLObject var36 = var35;
            SubLObject var37 = (SubLObject)module0318.NIL;
            var37 = var36.first();
            while (module0318.NIL != var36) {
                SubLObject var38 = var37.first();
                final SubLObject var39 = conses_high.second(var37);
                if (var30.equal(var38.first())) {
                    var38 = var38.rest();
                    if (module0318.NIL != var38 && module0318.NIL == var38.rest() && var32.equal(var38.first())) {
                        return module0034.f1959(var39);
                    }
                }
                var36 = var36.rest();
                var37 = var36.first();
            }
        }
        final SubLObject var40 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21446(var30, var32)));
        module0034.f1836(var33, var34, var35, var40, (SubLObject)ConsesLow.list(var30, var32));
        return module0034.f1959(var40);
    }
    
    public static SubLObject f21447() {
        final SubLObject var31 = module0318.$g2810$.getGlobalValue();
        if (module0318.NIL != var31) {
            module0034.f1818(var31);
        }
        return (SubLObject)module0318.NIL;
    }
    
    public static SubLObject f21448(final SubLObject var30, SubLObject var32) {
        if (var32 == module0318.UNPROVIDED) {
            var32 = module0147.f9552((SubLObject)module0318.UNPROVIDED);
        }
        return module0034.f1829(module0318.$g2810$.getGlobalValue(), (SubLObject)ConsesLow.list(var30, var32), (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
    }
    
    public static SubLObject f21449(final SubLObject var30, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0318.NIL;
        if (module0318.NIL != module0147.f9491(var32, (SubLObject)module0318.$ic25$)) {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic25$, var33);
                module0147.$g2095$.bind(module0318.$ic26$, var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic37$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        else if (module0318.NIL != module0147.f9491(var32, (SubLObject)module0318.$ic28$)) {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic28$, var33);
                module0147.$g2095$.bind(module0318.$ic29$, var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic37$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        else if (module0318.NIL != module0161.f10488(var32)) {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic30$, var33);
                module0147.$g2096$.bind(module0161.f10522(var32), var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic37$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        else {
            final SubLObject var35 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
            try {
                module0147.$g2094$.bind((SubLObject)module0318.$ic31$, var33);
                module0147.$g2095$.bind(var32, var33);
                var34 = module0260.f17066(var30, (SubLObject)module0318.$ic37$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var36, var33);
                module0147.$g2094$.rebind(var35, var33);
            }
        }
        return var34;
    }
    
    public static SubLObject f21443(final SubLObject var30, SubLObject var32) {
        if (var32 == module0318.UNPROVIDED) {
            var32 = module0147.f9552((SubLObject)module0318.UNPROVIDED);
        }
        SubLObject var33 = module0318.$g2810$.getGlobalValue();
        if (module0318.NIL == var33) {
            var33 = module0034.f1934((SubLObject)module0318.$ic36$, (SubLObject)module0318.$ic38$, (SubLObject)module0318.NIL, (SubLObject)module0318.EQUAL, (SubLObject)module0318.TWO_INTEGER, (SubLObject)module0318.$ic33$);
            module0034.f1940((SubLObject)module0318.$ic39$);
        }
        final SubLObject var34 = module0034.f1782(var30, var32);
        final SubLObject var35 = module0034.f1814(var33, var34, (SubLObject)module0318.UNPROVIDED);
        if (var35 != module0318.$ic35$) {
            SubLObject var36 = var35;
            SubLObject var37 = (SubLObject)module0318.NIL;
            var37 = var36.first();
            while (module0318.NIL != var36) {
                SubLObject var38 = var37.first();
                final SubLObject var39 = conses_high.second(var37);
                if (var30.equal(var38.first())) {
                    var38 = var38.rest();
                    if (module0318.NIL != var38 && module0318.NIL == var38.rest() && var32.equal(var38.first())) {
                        return module0034.f1959(var39);
                    }
                }
                var36 = var36.rest();
                var37 = var36.first();
            }
        }
        final SubLObject var40 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21449(var30, var32)));
        module0034.f1836(var33, var34, var35, var40, (SubLObject)ConsesLow.list(var30, var32));
        return module0034.f1959(var40);
    }
    
    public static SubLObject f21450(final SubLObject var30, SubLObject var44) {
        if (var44 == module0318.UNPROVIDED) {
            var44 = (SubLObject)module0318.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0318.NIL == var44) {
            return f21451(var30, module0147.$g2095$.getDynamicValue(var45), module0147.$g2094$.getDynamicValue(var45), (SubLObject)module0318.UNPROVIDED);
        }
        SubLObject var46 = (SubLObject)module0318.NIL;
        SubLObject var47 = (SubLObject)module0318.NIL;
        SubLObject var48 = module0261.f17214(var30, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
        SubLObject var49 = (SubLObject)module0318.NIL;
        var49 = var48.first();
        while (module0318.NIL != var48) {
            var45.resetMultipleValues();
            final SubLObject var50 = f21451(var49, module0147.$g2095$.getDynamicValue(var45), module0147.$g2094$.getDynamicValue(var45), (SubLObject)module0318.UNPROVIDED);
            final SubLObject var51 = var45.secondMultipleValue();
            var45.resetMultipleValues();
            SubLObject var39_50 = var50;
            SubLObject var52 = (SubLObject)module0318.NIL;
            var52 = var39_50.first();
            while (module0318.NIL != var39_50) {
                final SubLObject var53 = var52;
                if (module0318.NIL == conses_high.member(var53, var46, Symbols.symbol_function((SubLObject)module0318.EQL), Symbols.symbol_function((SubLObject)module0318.IDENTITY))) {
                    var46 = (SubLObject)ConsesLow.cons(var53, var46);
                }
                var39_50 = var39_50.rest();
                var52 = var39_50.first();
            }
            SubLObject var39_51 = var51;
            SubLObject var54 = (SubLObject)module0318.NIL;
            var54 = var39_51.first();
            while (module0318.NIL != var39_51) {
                final SubLObject var53 = var54;
                if (module0318.NIL == conses_high.member(var53, var47, Symbols.symbol_function((SubLObject)module0318.EQL), Symbols.symbol_function((SubLObject)module0318.IDENTITY))) {
                    var47 = (SubLObject)ConsesLow.cons(var53, var47);
                }
                var39_51 = var39_51.rest();
                var54 = var39_51.first();
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        var48 = module0261.f17215(var30, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
        SubLObject var55 = (SubLObject)module0318.NIL;
        var55 = var48.first();
        while (module0318.NIL != var48) {
            var45.resetMultipleValues();
            final SubLObject var56 = f21451(var55, module0147.$g2095$.getDynamicValue(var45), module0147.$g2094$.getDynamicValue(var45), (SubLObject)module0318.T);
            final SubLObject var57 = var45.secondMultipleValue();
            var45.resetMultipleValues();
            SubLObject var39_52 = var57;
            SubLObject var52 = (SubLObject)module0318.NIL;
            var52 = var39_52.first();
            while (module0318.NIL != var39_52) {
                final SubLObject var53 = var52;
                if (module0318.NIL == conses_high.member(var53, var46, Symbols.symbol_function((SubLObject)module0318.EQL), Symbols.symbol_function((SubLObject)module0318.IDENTITY))) {
                    var46 = (SubLObject)ConsesLow.cons(var53, var46);
                }
                var39_52 = var39_52.rest();
                var52 = var39_52.first();
            }
            SubLObject var39_53 = var56;
            SubLObject var54 = (SubLObject)module0318.NIL;
            var54 = var39_53.first();
            while (module0318.NIL != var39_53) {
                final SubLObject var53 = var54;
                if (module0318.NIL == conses_high.member(var53, var47, Symbols.symbol_function((SubLObject)module0318.EQL), Symbols.symbol_function((SubLObject)module0318.IDENTITY))) {
                    var47 = (SubLObject)ConsesLow.cons(var53, var47);
                }
                var39_53 = var39_53.rest();
                var54 = var39_53.first();
            }
            var48 = var48.rest();
            var55 = var48.first();
        }
        return Values.values(module0260.f17027(var46, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED), module0260.f17027(var47, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED));
    }
    
    public static SubLObject f21452() {
        final SubLObject var31 = module0318.$g2811$.getGlobalValue();
        if (module0318.NIL != var31) {
            module0034.f1818(var31);
        }
        return (SubLObject)module0318.NIL;
    }
    
    public static SubLObject f21453(final SubLObject var30, final SubLObject var58, final SubLObject var59, SubLObject var60) {
        if (var60 == module0318.UNPROVIDED) {
            var60 = (SubLObject)module0318.NIL;
        }
        return module0034.f1829(module0318.$g2811$.getGlobalValue(), (SubLObject)ConsesLow.list(var30, var58, var59, var60), (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
    }
    
    public static SubLObject f21454(final SubLObject var30, final SubLObject var58, final SubLObject var59, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (module0318.NIL != f21438(var30) || module0318.NIL != f21439(var30)) {
            return Values.values((SubLObject)ConsesLow.list(var30), (SubLObject)module0318.NIL);
        }
        SubLObject var62 = (SubLObject)module0318.NIL;
        SubLObject var63 = (SubLObject)module0318.NIL;
        final SubLObject var64 = (SubLObject)module0318.$ic43$;
        final SubLObject var65 = module0056.f4145(var64);
        SubLObject var66 = (SubLObject)module0318.NIL;
        final SubLObject var67 = module0139.$g1635$.currentBinding(var61);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var61);
            final SubLObject var68 = (SubLObject)module0318.NIL;
            final SubLObject var34_66 = module0141.$g1714$.currentBinding(var61);
            final SubLObject var69 = module0141.$g1715$.currentBinding(var61);
            try {
                module0141.$g1714$.bind((module0318.NIL != var68) ? var68 : module0141.f9283(), var61);
                module0141.$g1715$.bind((SubLObject)((module0318.NIL != var68) ? module0318.$ic44$ : module0141.$g1715$.getDynamicValue(var61)), var61);
                if (module0318.NIL != var68 && module0318.NIL != module0136.f8864() && module0318.NIL == module0141.f9279(var68)) {
                    final SubLObject var70 = module0136.$g1591$.getDynamicValue(var61);
                    if (var70.eql((SubLObject)module0318.$ic45$)) {
                        module0136.f8870((SubLObject)module0318.ONE_INTEGER, (SubLObject)module0318.$ic46$, var68, (SubLObject)module0318.$ic47$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                    }
                    else if (var70.eql((SubLObject)module0318.$ic48$)) {
                        module0136.f8871((SubLObject)module0318.ONE_INTEGER, (SubLObject)module0318.$ic49$, (SubLObject)module0318.$ic46$, var68, (SubLObject)module0318.$ic47$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                    }
                    else if (var70.eql((SubLObject)module0318.$ic50$)) {
                        Errors.warn((SubLObject)module0318.$ic46$, var68, (SubLObject)module0318.$ic47$);
                    }
                    else {
                        Errors.warn((SubLObject)module0318.$ic51$, module0136.$g1591$.getDynamicValue(var61));
                        Errors.cerror((SubLObject)module0318.$ic49$, (SubLObject)module0318.$ic46$, var68, (SubLObject)module0318.$ic47$);
                    }
                }
                final SubLObject var34_67 = module0141.$g1670$.currentBinding(var61);
                final SubLObject var35_69 = module0141.$g1671$.currentBinding(var61);
                final SubLObject var71 = module0141.$g1672$.currentBinding(var61);
                final SubLObject var72 = module0141.$g1674$.currentBinding(var61);
                final SubLObject var73 = module0137.$g1605$.currentBinding(var61);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0318.$ic52$), var61);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0318.$ic52$)), var61);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0318.$ic52$)), var61);
                    module0141.$g1674$.bind((SubLObject)module0318.NIL, var61);
                    module0137.$g1605$.bind(module0137.f8955(module0318.$ic52$), var61);
                    if (module0318.NIL != module0136.f8865() || module0318.NIL != module0244.f15795(var30, module0137.f8955((SubLObject)module0318.UNPROVIDED))) {
                        final SubLObject var34_68 = module0141.$g1677$.currentBinding(var61);
                        final SubLObject var35_70 = module0138.$g1619$.currentBinding(var61);
                        final SubLObject var70_75 = module0141.$g1674$.currentBinding(var61);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var61);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0318.$ic52$)), var61);
                            module0141.$g1674$.bind((SubLObject)module0318.NIL, var61);
                            module0249.f16055(var30, (SubLObject)module0318.UNPROVIDED);
                            for (var66 = (SubLObject)ConsesLow.list(var30, module0141.f9195()); module0318.NIL != var66; var66 = module0056.f4150(var65)) {
                                final SubLObject var61_76 = var66.first();
                                final SubLObject var74 = conses_high.second(var66);
                                final SubLObject var75 = var61_76;
                                final SubLObject var34_69 = module0141.$g1674$.currentBinding(var61);
                                try {
                                    module0141.$g1674$.bind(var74, var61);
                                    final SubLObject var76 = var74;
                                    if (module0318.NIL != f21438(var75) || module0318.NIL != f21439(var75)) {
                                        if (!SubLObjectFactory.makeBoolean(module0318.NIL == var76).eql((SubLObject)SubLObjectFactory.makeBoolean(module0318.NIL == var60))) {
                                            var63 = (SubLObject)ConsesLow.cons(var75, var63);
                                        }
                                        else {
                                            var62 = (SubLObject)ConsesLow.cons(var75, var62);
                                        }
                                    }
                                    SubLObject var78;
                                    final SubLObject var77 = var78 = module0200.f12443(module0137.f8955(module0318.$ic52$));
                                    SubLObject var79 = (SubLObject)module0318.NIL;
                                    var79 = var78.first();
                                    while (module0318.NIL != var78) {
                                        final SubLObject var34_70 = module0137.$g1605$.currentBinding(var61);
                                        final SubLObject var35_71 = module0141.$g1674$.currentBinding(var61);
                                        try {
                                            module0137.$g1605$.bind(var79, var61);
                                            module0141.$g1674$.bind((SubLObject)((module0318.NIL != module0141.f9205((SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0318.NIL == module0141.$g1674$.getDynamicValue(var61)) : module0141.$g1674$.getDynamicValue(var61)), var61);
                                            final SubLObject var80 = module0228.f15229(var61_76);
                                            if (module0318.NIL != module0138.f8992(var80)) {
                                                final SubLObject var81 = module0242.f15664(var80, module0137.f8955((SubLObject)module0318.UNPROVIDED));
                                                if (module0318.NIL != var81) {
                                                    final SubLObject var82 = module0245.f15834(var81, module0138.f8979(), module0137.f8955((SubLObject)module0318.UNPROVIDED));
                                                    if (module0318.NIL != var82) {
                                                        SubLObject var83;
                                                        for (var83 = module0066.f4838(module0067.f4891(var82)); module0318.NIL == module0066.f4841(var83); var83 = module0066.f4840(var83)) {
                                                            var61.resetMultipleValues();
                                                            final SubLObject var89_90 = module0066.f4839(var83);
                                                            final SubLObject var84 = var61.secondMultipleValue();
                                                            var61.resetMultipleValues();
                                                            if (module0318.NIL != module0147.f9507(var89_90)) {
                                                                final SubLObject var34_71 = module0138.$g1623$.currentBinding(var61);
                                                                try {
                                                                    module0138.$g1623$.bind(var89_90, var61);
                                                                    SubLObject var88_93;
                                                                    for (var88_93 = module0066.f4838(module0067.f4891(var84)); module0318.NIL == module0066.f4841(var88_93); var88_93 = module0066.f4840(var88_93)) {
                                                                        var61.resetMultipleValues();
                                                                        final SubLObject var85 = module0066.f4839(var88_93);
                                                                        final SubLObject var86 = var61.secondMultipleValue();
                                                                        var61.resetMultipleValues();
                                                                        if (module0318.NIL != module0141.f9289(var85)) {
                                                                            final SubLObject var34_72 = module0138.$g1624$.currentBinding(var61);
                                                                            try {
                                                                                module0138.$g1624$.bind(var85, var61);
                                                                                final SubLObject var87 = var86;
                                                                                if (module0318.NIL != module0077.f5302(var87)) {
                                                                                    final SubLObject var88 = module0077.f5333(var87);
                                                                                    SubLObject var89;
                                                                                    SubLObject var90;
                                                                                    SubLObject var91;
                                                                                    for (var89 = module0032.f1741(var88), var90 = (SubLObject)module0318.NIL, var90 = module0032.f1742(var89, var88); module0318.NIL == module0032.f1744(var89, var90); var90 = module0032.f1743(var90)) {
                                                                                        var91 = module0032.f1745(var89, var90);
                                                                                        if (module0318.NIL != module0032.f1746(var90, var91) && module0318.NIL == module0249.f16059(var91, (SubLObject)module0318.UNPROVIDED)) {
                                                                                            module0249.f16055(var91, (SubLObject)module0318.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var91, module0141.f9195()), var65);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var87.isList()) {
                                                                                    SubLObject var92 = var87;
                                                                                    SubLObject var93 = (SubLObject)module0318.NIL;
                                                                                    var93 = var92.first();
                                                                                    while (module0318.NIL != var92) {
                                                                                        if (module0318.NIL == module0249.f16059(var93, (SubLObject)module0318.UNPROVIDED)) {
                                                                                            module0249.f16055(var93, (SubLObject)module0318.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var93, module0141.f9195()), var65);
                                                                                        }
                                                                                        var92 = var92.rest();
                                                                                        var93 = var92.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0318.$ic53$, var87);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var34_72, var61);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var88_93);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var34_71, var61);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var83);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0318.FIVE_INTEGER, (SubLObject)module0318.$ic54$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                                                }
                                            }
                                            else if (module0318.NIL != module0155.f9785(var80, (SubLObject)module0318.UNPROVIDED)) {
                                                SubLObject var39_104;
                                                final SubLObject var94 = var39_104 = ((module0318.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)module0318.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var61), module0137.f8955((SubLObject)module0318.UNPROVIDED)));
                                                SubLObject var95 = (SubLObject)module0318.NIL;
                                                var95 = var39_104.first();
                                                while (module0318.NIL != var39_104) {
                                                    final SubLObject var34_73 = module0138.$g1625$.currentBinding(var61);
                                                    try {
                                                        module0138.$g1625$.bind(var95, var61);
                                                        final SubLObject var97;
                                                        final SubLObject var96 = var97 = Functions.funcall(var95, var80);
                                                        if (module0318.NIL != module0077.f5302(var97)) {
                                                            final SubLObject var98 = module0077.f5333(var97);
                                                            SubLObject var99;
                                                            SubLObject var100;
                                                            SubLObject var101;
                                                            for (var99 = module0032.f1741(var98), var100 = (SubLObject)module0318.NIL, var100 = module0032.f1742(var99, var98); module0318.NIL == module0032.f1744(var99, var100); var100 = module0032.f1743(var100)) {
                                                                var101 = module0032.f1745(var99, var100);
                                                                if (module0318.NIL != module0032.f1746(var100, var101) && module0318.NIL == module0249.f16059(var101, (SubLObject)module0318.UNPROVIDED)) {
                                                                    module0249.f16055(var101, (SubLObject)module0318.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var101, module0141.f9195()), var65);
                                                                }
                                                            }
                                                        }
                                                        else if (var97.isList()) {
                                                            SubLObject var102 = var97;
                                                            SubLObject var103 = (SubLObject)module0318.NIL;
                                                            var103 = var102.first();
                                                            while (module0318.NIL != var102) {
                                                                if (module0318.NIL == module0249.f16059(var103, (SubLObject)module0318.UNPROVIDED)) {
                                                                    module0249.f16055(var103, (SubLObject)module0318.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var103, module0141.f9195()), var65);
                                                                }
                                                                var102 = var102.rest();
                                                                var103 = var102.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0318.$ic53$, var97);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var34_73, var61);
                                                    }
                                                    var39_104 = var39_104.rest();
                                                    var95 = var39_104.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var35_71, var61);
                                            module0137.$g1605$.rebind(var34_70, var61);
                                        }
                                        var78 = var78.rest();
                                        var79 = var78.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var34_69, var61);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var70_75, var61);
                            module0138.$g1619$.rebind(var35_70, var61);
                            module0141.$g1677$.rebind(var34_68, var61);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0318.TWO_INTEGER, (SubLObject)module0318.$ic55$, var30, module0244.f15748(module0137.f8955((SubLObject)module0318.UNPROVIDED)), (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var73, var61);
                    module0141.$g1674$.rebind(var72, var61);
                    module0141.$g1672$.rebind(var71, var61);
                    module0141.$g1671$.rebind(var35_69, var61);
                    module0141.$g1670$.rebind(var34_67, var61);
                }
            }
            finally {
                module0141.$g1715$.rebind(var69, var61);
                module0141.$g1714$.rebind(var34_66, var61);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var61));
        }
        finally {
            module0139.$g1635$.rebind(var67, var61);
        }
        return Values.values(module0260.f17027(var62, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED), module0260.f17027(var63, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED));
    }
    
    public static SubLObject f21451(final SubLObject var30, final SubLObject var58, final SubLObject var59, SubLObject var60) {
        if (var60 == module0318.UNPROVIDED) {
            var60 = (SubLObject)module0318.NIL;
        }
        SubLObject var61 = module0318.$g2811$.getGlobalValue();
        if (module0318.NIL == var61) {
            var61 = module0034.f1934((SubLObject)module0318.$ic40$, (SubLObject)module0318.$ic56$, (SubLObject)module0318.NIL, (SubLObject)module0318.EQUAL, (SubLObject)module0318.FOUR_INTEGER, (SubLObject)module0318.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0318.$ic57$);
        }
        final SubLObject var62 = module0034.f1780(var30, var58, var59, var60);
        final SubLObject var63 = module0034.f1814(var61, var62, (SubLObject)module0318.UNPROVIDED);
        if (var63 != module0318.$ic35$) {
            SubLObject var64 = var63;
            SubLObject var65 = (SubLObject)module0318.NIL;
            var65 = var64.first();
            while (module0318.NIL != var64) {
                SubLObject var66 = var65.first();
                final SubLObject var67 = conses_high.second(var65);
                if (var30.equal(var66.first())) {
                    var66 = var66.rest();
                    if (var58.equal(var66.first())) {
                        var66 = var66.rest();
                        if (var59.equal(var66.first())) {
                            var66 = var66.rest();
                            if (module0318.NIL != var66 && module0318.NIL == var66.rest() && var60.equal(var66.first())) {
                                return module0034.f1959(var67);
                            }
                        }
                    }
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
        }
        final SubLObject var68 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21454(var30, var58, var59, var60)));
        module0034.f1836(var61, var62, var63, var68, (SubLObject)ConsesLow.list(var30, var58, var59, var60));
        return module0034.f1959(var68);
    }
    
    public static SubLObject f21455(final SubLObject var16, final SubLObject var20, final SubLObject var17, final SubLObject var18) {
        return (SubLObject)((module0318.NIL != module0222.f14635(var16, var20, (SubLObject)module0318.ONE_INTEGER, (SubLObject)module0318.UNPROVIDED)) ? module0220.f14593(var20, var16, f21429(var17, var18), (SubLObject)module0318.ONE_INTEGER, (SubLObject)module0318.THREE_INTEGER, (SubLObject)module0318.TWO_INTEGER, (SubLObject)module0318.UNPROVIDED) : module0318.NIL);
    }
    
    public static SubLObject f21456(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic58$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0318.NIL;
        SubLObject var7 = (SubLObject)module0318.NIL;
        SubLObject var8 = (SubLObject)module0318.NIL;
        SubLObject var9 = (SubLObject)module0318.NIL;
        SubLObject var10 = (SubLObject)module0318.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic58$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic58$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic58$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic58$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic58$);
        var10 = var4.first();
        var4 = var4.rest();
        if (module0318.NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0318.$ic59$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0318.$ic60$, var7, var8, var9, var10)), ConsesLow.append(var11, (SubLObject)module0318.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0318.$ic58$);
        return (SubLObject)module0318.NIL;
    }
    
    public static SubLObject f21457(final SubLObject var6, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return f21458(var6, var17, module0147.$g2095$.getDynamicValue(var18), module0147.$g2094$.getDynamicValue(var18));
    }
    
    public static SubLObject f21459(final SubLObject var6, final SubLObject var17, final SubLObject var58, final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        SubLObject var61 = (SubLObject)module0318.NIL;
        if (module0318.NIL == var61) {
            final SubLObject var62 = (SubLObject)module0318.$ic43$;
            final SubLObject var63 = module0056.f4145(var62);
            SubLObject var64 = (SubLObject)module0318.NIL;
            final SubLObject var65 = module0139.$g1635$.currentBinding(var60);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var60);
                final SubLObject var66 = (SubLObject)module0318.NIL;
                final SubLObject var34_112 = module0141.$g1714$.currentBinding(var60);
                final SubLObject var67 = module0141.$g1715$.currentBinding(var60);
                try {
                    module0141.$g1714$.bind((module0318.NIL != var66) ? var66 : module0141.f9283(), var60);
                    module0141.$g1715$.bind((SubLObject)((module0318.NIL != var66) ? module0318.$ic44$ : module0141.$g1715$.getDynamicValue(var60)), var60);
                    if (module0318.NIL != var66 && module0318.NIL != module0136.f8864() && module0318.NIL == module0141.f9279(var66)) {
                        final SubLObject var68 = module0136.$g1591$.getDynamicValue(var60);
                        if (var68.eql((SubLObject)module0318.$ic45$)) {
                            module0136.f8870((SubLObject)module0318.ONE_INTEGER, (SubLObject)module0318.$ic46$, var66, (SubLObject)module0318.$ic47$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                        }
                        else if (var68.eql((SubLObject)module0318.$ic48$)) {
                            module0136.f8871((SubLObject)module0318.ONE_INTEGER, (SubLObject)module0318.$ic49$, (SubLObject)module0318.$ic46$, var66, (SubLObject)module0318.$ic47$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                        }
                        else if (var68.eql((SubLObject)module0318.$ic50$)) {
                            Errors.warn((SubLObject)module0318.$ic46$, var66, (SubLObject)module0318.$ic47$);
                        }
                        else {
                            Errors.warn((SubLObject)module0318.$ic51$, module0136.$g1591$.getDynamicValue(var60));
                            Errors.cerror((SubLObject)module0318.$ic49$, (SubLObject)module0318.$ic46$, var66, (SubLObject)module0318.$ic47$);
                        }
                    }
                    final SubLObject var34_113 = module0141.$g1670$.currentBinding(var60);
                    final SubLObject var35_114 = module0141.$g1671$.currentBinding(var60);
                    final SubLObject var69 = module0141.$g1672$.currentBinding(var60);
                    final SubLObject var70 = module0141.$g1674$.currentBinding(var60);
                    final SubLObject var71 = module0137.$g1605$.currentBinding(var60);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0318.$ic52$), var60);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0318.$ic52$)), var60);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0318.$ic52$)), var60);
                        module0141.$g1674$.bind((SubLObject)module0318.NIL, var60);
                        module0137.$g1605$.bind(module0137.f8955(module0318.$ic52$), var60);
                        if (module0318.NIL != module0136.f8865() || module0318.NIL != module0244.f15795(var6, module0137.f8955((SubLObject)module0318.UNPROVIDED))) {
                            final SubLObject var34_114 = module0141.$g1677$.currentBinding(var60);
                            final SubLObject var35_115 = module0138.$g1619$.currentBinding(var60);
                            final SubLObject var70_117 = module0141.$g1674$.currentBinding(var60);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var60);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0318.$ic52$)), var60);
                                module0141.$g1674$.bind((SubLObject)module0318.NIL, var60);
                                module0249.f16055(var6, (SubLObject)module0318.UNPROVIDED);
                                for (var64 = (SubLObject)ConsesLow.list(var6, module0141.f9195()); module0318.NIL != var64 && module0318.NIL == var61; var64 = module0056.f4150(var63)) {
                                    final SubLObject var61_118 = var64.first();
                                    final SubLObject var72 = conses_high.second(var64);
                                    final SubLObject var73 = var61_118;
                                    final SubLObject var34_115 = module0141.$g1674$.currentBinding(var60);
                                    try {
                                        module0141.$g1674$.bind(var72, var60);
                                        final SubLObject var74 = var72;
                                        if (module0318.NIL == var61) {
                                            SubLObject var75 = f21423();
                                            SubLObject var76 = (SubLObject)module0318.NIL;
                                            var76 = var75.first();
                                            while (module0318.NIL == var61 && module0318.NIL != var75) {
                                                if (module0318.NIL != f21455(var76, var73, var17, var74)) {
                                                    var61 = (SubLObject)module0318.T;
                                                }
                                                var75 = var75.rest();
                                                var76 = var75.first();
                                            }
                                        }
                                        final SubLObject var77 = module0200.f12443(module0137.f8955(module0318.$ic52$));
                                        SubLObject var78;
                                        SubLObject var79;
                                        SubLObject var34_116;
                                        SubLObject var35_116;
                                        SubLObject var80;
                                        SubLObject var81;
                                        SubLObject var82;
                                        SubLObject var83;
                                        SubLObject var89_125;
                                        SubLObject var84;
                                        SubLObject var34_117;
                                        SubLObject var88_127;
                                        SubLObject var85;
                                        SubLObject var86;
                                        SubLObject var34_118;
                                        SubLObject var87;
                                        SubLObject var88;
                                        SubLObject var89;
                                        SubLObject var90;
                                        SubLObject var91;
                                        SubLObject var92;
                                        SubLObject var93;
                                        SubLObject var94;
                                        SubLObject var122_129;
                                        SubLObject var95;
                                        SubLObject var34_119;
                                        SubLObject var97;
                                        SubLObject var96;
                                        SubLObject var98;
                                        SubLObject var99;
                                        SubLObject var100;
                                        SubLObject var101;
                                        SubLObject var102;
                                        SubLObject var103;
                                        for (var78 = (SubLObject)module0318.NIL, var78 = var77; module0318.NIL == var61 && module0318.NIL != var78; var78 = var78.rest()) {
                                            var79 = var78.first();
                                            var34_116 = module0137.$g1605$.currentBinding(var60);
                                            var35_116 = module0141.$g1674$.currentBinding(var60);
                                            try {
                                                module0137.$g1605$.bind(var79, var60);
                                                module0141.$g1674$.bind((SubLObject)((module0318.NIL != module0141.f9205((SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0318.NIL == module0141.$g1674$.getDynamicValue(var60)) : module0141.$g1674$.getDynamicValue(var60)), var60);
                                                var80 = module0228.f15229(var61_118);
                                                if (module0318.NIL != module0138.f8992(var80)) {
                                                    var81 = module0242.f15664(var80, module0137.f8955((SubLObject)module0318.UNPROVIDED));
                                                    if (module0318.NIL != var81) {
                                                        var82 = module0245.f15834(var81, module0138.f8979(), module0137.f8955((SubLObject)module0318.UNPROVIDED));
                                                        if (module0318.NIL != var82) {
                                                            for (var83 = module0066.f4838(module0067.f4891(var82)); module0318.NIL == var61 && module0318.NIL == module0066.f4841(var83); var83 = module0066.f4840(var83)) {
                                                                var60.resetMultipleValues();
                                                                var89_125 = module0066.f4839(var83);
                                                                var84 = var60.secondMultipleValue();
                                                                var60.resetMultipleValues();
                                                                if (module0318.NIL != module0147.f9507(var89_125)) {
                                                                    var34_117 = module0138.$g1623$.currentBinding(var60);
                                                                    try {
                                                                        module0138.$g1623$.bind(var89_125, var60);
                                                                        for (var88_127 = module0066.f4838(module0067.f4891(var84)); module0318.NIL == var61 && module0318.NIL == module0066.f4841(var88_127); var88_127 = module0066.f4840(var88_127)) {
                                                                            var60.resetMultipleValues();
                                                                            var85 = module0066.f4839(var88_127);
                                                                            var86 = var60.secondMultipleValue();
                                                                            var60.resetMultipleValues();
                                                                            if (module0318.NIL != module0141.f9289(var85)) {
                                                                                var34_118 = module0138.$g1624$.currentBinding(var60);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var85, var60);
                                                                                    var87 = var86;
                                                                                    if (module0318.NIL != module0077.f5302(var87)) {
                                                                                        var88 = module0077.f5333(var87);
                                                                                        for (var89 = module0032.f1741(var88), var90 = (SubLObject)module0318.NIL, var90 = module0032.f1742(var89, var88); module0318.NIL == var61 && module0318.NIL == module0032.f1744(var89, var90); var90 = module0032.f1743(var90)) {
                                                                                            var91 = module0032.f1745(var89, var90);
                                                                                            if (module0318.NIL != module0032.f1746(var90, var91) && module0318.NIL == module0249.f16059(var91, (SubLObject)module0318.UNPROVIDED)) {
                                                                                                module0249.f16055(var91, (SubLObject)module0318.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var91, module0141.f9195()), var63);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var87.isList()) {
                                                                                        if (module0318.NIL == var61) {
                                                                                            var92 = var87;
                                                                                            var93 = (SubLObject)module0318.NIL;
                                                                                            var93 = var92.first();
                                                                                            while (module0318.NIL == var61 && module0318.NIL != var92) {
                                                                                                if (module0318.NIL == module0249.f16059(var93, (SubLObject)module0318.UNPROVIDED)) {
                                                                                                    module0249.f16055(var93, (SubLObject)module0318.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var93, module0141.f9195()), var63);
                                                                                                }
                                                                                                var92 = var92.rest();
                                                                                                var93 = var92.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0318.$ic53$, var87);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var34_118, var60);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var88_127);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var34_117, var60);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var83);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0318.FIVE_INTEGER, (SubLObject)module0318.$ic54$, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0318.NIL != module0155.f9785(var80, (SubLObject)module0318.UNPROVIDED)) {
                                                    var94 = ((module0318.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var60), module0137.f8955((SubLObject)module0318.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var60), module0137.f8955((SubLObject)module0318.UNPROVIDED)));
                                                    for (var122_129 = (SubLObject)module0318.NIL, var122_129 = var94; module0318.NIL == var61 && module0318.NIL != var122_129; var122_129 = var122_129.rest()) {
                                                        var95 = var122_129.first();
                                                        var34_119 = module0138.$g1625$.currentBinding(var60);
                                                        try {
                                                            module0138.$g1625$.bind(var95, var60);
                                                            var96 = (var97 = Functions.funcall(var95, var80));
                                                            if (module0318.NIL != module0077.f5302(var97)) {
                                                                var98 = module0077.f5333(var97);
                                                                for (var99 = module0032.f1741(var98), var100 = (SubLObject)module0318.NIL, var100 = module0032.f1742(var99, var98); module0318.NIL == var61 && module0318.NIL == module0032.f1744(var99, var100); var100 = module0032.f1743(var100)) {
                                                                    var101 = module0032.f1745(var99, var100);
                                                                    if (module0318.NIL != module0032.f1746(var100, var101) && module0318.NIL == module0249.f16059(var101, (SubLObject)module0318.UNPROVIDED)) {
                                                                        module0249.f16055(var101, (SubLObject)module0318.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var101, module0141.f9195()), var63);
                                                                    }
                                                                }
                                                            }
                                                            else if (var97.isList()) {
                                                                if (module0318.NIL == var61) {
                                                                    var102 = var97;
                                                                    var103 = (SubLObject)module0318.NIL;
                                                                    var103 = var102.first();
                                                                    while (module0318.NIL == var61 && module0318.NIL != var102) {
                                                                        if (module0318.NIL == module0249.f16059(var103, (SubLObject)module0318.UNPROVIDED)) {
                                                                            module0249.f16055(var103, (SubLObject)module0318.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var103, module0141.f9195()), var63);
                                                                        }
                                                                        var102 = var102.rest();
                                                                        var103 = var102.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0318.$ic53$, var97);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var34_119, var60);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var35_116, var60);
                                                module0137.$g1605$.rebind(var34_116, var60);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var34_115, var60);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var70_117, var60);
                                module0138.$g1619$.rebind(var35_115, var60);
                                module0141.$g1677$.rebind(var34_114, var60);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0318.TWO_INTEGER, (SubLObject)module0318.$ic55$, var6, module0244.f15748(module0137.f8955((SubLObject)module0318.UNPROVIDED)), (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var71, var60);
                        module0141.$g1674$.rebind(var70, var60);
                        module0141.$g1672$.rebind(var69, var60);
                        module0141.$g1671$.rebind(var35_114, var60);
                        module0141.$g1670$.rebind(var34_113, var60);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var67, var60);
                    module0141.$g1714$.rebind(var34_112, var60);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var60));
            }
            finally {
                module0139.$g1635$.rebind(var65, var60);
            }
        }
        return var61;
    }
    
    public static SubLObject f21458(final SubLObject var6, final SubLObject var17, final SubLObject var58, final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = module0034.$g879$.getDynamicValue(var60);
        SubLObject var62 = (SubLObject)module0318.NIL;
        if (module0318.NIL == var61) {
            return f21459(var6, var17, var58, var59);
        }
        var62 = module0034.f1857(var61, (SubLObject)module0318.$ic61$, (SubLObject)module0318.UNPROVIDED);
        if (module0318.NIL == var62) {
            var62 = module0034.f1807(module0034.f1842(var61), (SubLObject)module0318.$ic61$, (SubLObject)module0318.FOUR_INTEGER, (SubLObject)module0318.NIL, (SubLObject)module0318.EQUAL, (SubLObject)module0318.UNPROVIDED);
            module0034.f1860(var61, (SubLObject)module0318.$ic61$, var62);
        }
        final SubLObject var63 = module0034.f1780(var6, var17, var58, var59);
        final SubLObject var64 = module0034.f1814(var62, var63, (SubLObject)module0318.UNPROVIDED);
        if (var64 != module0318.$ic35$) {
            SubLObject var65 = var64;
            SubLObject var66 = (SubLObject)module0318.NIL;
            var66 = var65.first();
            while (module0318.NIL != var65) {
                SubLObject var67 = var66.first();
                final SubLObject var68 = conses_high.second(var66);
                if (var6.equal(var67.first())) {
                    var67 = var67.rest();
                    if (var17.equal(var67.first())) {
                        var67 = var67.rest();
                        if (var58.equal(var67.first())) {
                            var67 = var67.rest();
                            if (module0318.NIL != var67 && module0318.NIL == var67.rest() && var59.equal(var67.first())) {
                                return module0034.f1959(var68);
                            }
                        }
                    }
                }
                var65 = var65.rest();
                var66 = var65.first();
            }
        }
        final SubLObject var69 = Values.arg2(var60.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21459(var6, var17, var58, var59)));
        module0034.f1836(var62, var63, var64, var69, (SubLObject)ConsesLow.list(var6, var17, var58, var59));
        return module0034.f1959(var69);
    }
    
    public static SubLObject f21460(final SubLObject var16) {
        if (var16.eql(module0318.$ic18$) || var16.eql(module0318.$ic21$)) {
            return (SubLObject)module0318.$ic62$;
        }
        if (var16.eql(module0318.$ic20$) || var16.eql(module0318.$ic23$)) {
            return (SubLObject)module0318.$ic63$;
        }
        return Errors.cerror((SubLObject)module0318.$ic64$, (SubLObject)module0318.$ic65$, var16);
    }
    
    public static SubLObject f21461(final SubLObject var136) {
        if (var136.eql((SubLObject)module0318.$ic63$)) {
            return (SubLObject)module0318.$ic66$;
        }
        if (var136.eql((SubLObject)module0318.$ic62$)) {
            return (SubLObject)module0318.$ic67$;
        }
        return Errors.cerror((SubLObject)module0318.$ic64$, (SubLObject)module0318.$ic68$, var136);
    }
    
    public static SubLObject f21462(final SubLObject var136) {
        return var136;
    }
    
    public static SubLObject f21463(final SubLObject var136) {
        if (var136.eql((SubLObject)module0318.$ic63$)) {
            return (SubLObject)module0318.$ic62$;
        }
        if (var136.eql((SubLObject)module0318.$ic62$)) {
            return (SubLObject)module0318.$ic63$;
        }
        return Errors.cerror((SubLObject)module0318.$ic64$, (SubLObject)module0318.$ic68$, var136);
    }
    
    public static SubLObject f21429(final SubLObject var17, final SubLObject var18) {
        if (module0318.NIL != var18) {
            return module0107.f7613(var17);
        }
        return var17;
    }
    
    public static SubLObject f21464(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic69$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0318.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0318.$ic69$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0318.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0318.$ic59$, reader.bq_cons(var6, (SubLObject)module0318.$ic70$), ConsesLow.append(var7, (SubLObject)module0318.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0318.$ic69$);
        return (SubLObject)module0318.NIL;
    }
    
    public static SubLObject f21465(final SubLObject var141) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0318.NIL != module0139.f9079(var141) || module0318.NIL != module0241.f15630(var141));
    }
    
    public static SubLObject f21466(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0318.NIL;
        SubLObject var145 = module0321.f21685();
        SubLObject var146 = (SubLObject)module0318.NIL;
        var146 = var145.first();
        while (module0318.NIL != var145) {
            SubLObject var148;
            final SubLObject var147 = var148 = var146;
            SubLObject var149 = (SubLObject)module0318.NIL;
            SubLObject var150 = (SubLObject)module0318.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var148, var147, (SubLObject)module0318.$ic71$);
            var149 = var148.first();
            var148 = var148.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var148, var147, (SubLObject)module0318.$ic71$);
            var150 = var148.first();
            var148 = var148.rest();
            if (module0318.NIL == var148) {
                final SubLObject var151 = f21429(var150, module0141.f9195());
                final SubLObject var152 = module0205.f13384(var142, var151, (SubLObject)module0318.UNPROVIDED);
                var143.resetMultipleValues();
                final SubLObject var153 = module0235.f15474(var149, var152, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
                final SubLObject var154 = var143.secondMultipleValue();
                var143.resetMultipleValues();
                var144 = ConsesLow.nconc(var153, var144);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var147, (SubLObject)module0318.$ic71$);
            }
            var145 = var145.rest();
            var146 = var145.first();
        }
        return var144;
    }
    
    public static SubLObject f21467(final SubLObject var6) {
        if (module0318.NIL != module0244.f15730(var6)) {
            return module0244.f15790(var6);
        }
        if (module0318.NIL != module0269.f17806(var6)) {
            return (SubLObject)module0318.$ic72$;
        }
        return (SubLObject)module0318.$ic73$;
    }
    
    public static SubLObject f21468(final SubLObject var151, final SubLObject var152, final SubLObject var18) {
        final SubLObject var153 = (SubLObject)SubLObjectFactory.makeBoolean((module0318.NIL == var18 && module0318.NIL != module0261.f17248(var151, var152, (SubLObject)module0318.UNPROVIDED)) || (module0318.NIL != var18 && module0318.NIL != module0261.f17250(var151, var152, (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED)));
        final SubLObject var154 = (module0318.NIL != var153) ? ((module0318.NIL != var18) ? module0318.$ic74$ : module0318.$ic75$) : ((module0318.NIL != var18) ? module0318.$ic76$ : module0318.$ic52$);
        return module0191.f11990((SubLObject)module0318.$ic77$, (SubLObject)ConsesLow.list(var154, var151, var152), (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
    }
    
    public static SubLObject f21469(final SubLObject var6, final SubLObject var18) {
        return f21468(var6, module0321.f21684(), var18);
    }
    
    public static SubLObject f21470(final SubLObject var16, final SubLObject var6, final SubLObject var15, final SubLObject var17) {
        if (var6.eql(var15)) {
            return module0191.f11990((SubLObject)module0318.$ic78$, (SubLObject)ConsesLow.list(var16, var6, var15, var17), (SubLObject)module0318.UNPROVIDED, (SubLObject)module0318.UNPROVIDED);
        }
        return module0217.f14426((SubLObject)ConsesLow.list(var16, var6, var15, var17));
    }
    
    public static SubLObject f21471() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21423", "S#23950", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0318", "f21424", "S#23951");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21425", "S#23952", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21426", "S#23953", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21427", "S#23954", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21428", "S#23955", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21430", "S#23956", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21431", "S#23957", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0318", "f21432", "WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21433", "S#23958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21434", "S#23959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21435", "S#23960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21436", "S#23943", 1, 0, false);
        new $f21436$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21437", "S#23961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21438", "S#23944", 1, 0, false);
        new $f21438$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21439", "S#23945", 1, 0, false);
        new $f21439$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21440", "S#23962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21442", "S#23963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21444", "S#23946", 0, 0, false);
        new $f21444$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21445", "S#23964", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21446", "S#23965", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21441", "S#23966", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21447", "S#23947", 0, 0, false);
        new $f21447$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21448", "S#23967", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21449", "S#23968", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21443", "S#23969", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21450", "S#23970", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21452", "S#23948", 0, 0, false);
        new $f21452$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21453", "S#23971", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21454", "S#23972", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21451", "S#23973", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21455", "S#23974", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0318", "f21456", "S#23975");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21457", "S#23976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21459", "S#23977", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21458", "S#23978", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21460", "S#23979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21461", "S#23980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21462", "S#23981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21463", "S#23982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21429", "S#23983", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0318", "f21464", "S#23984");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21465", "S#23985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21466", "S#23986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21467", "S#23987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21468", "S#23988", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21469", "S#23989", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0318", "f21470", "S#23990", 4, 0, false);
        return (SubLObject)module0318.NIL;
    }
    
    public static SubLObject f21472() {
        module0318.$g2803$ = SubLFiles.deflexical("S#23991", (SubLObject)module0318.$ic0$);
        module0318.$g2804$ = SubLFiles.deflexical("S#23992", (SubLObject)((module0318.NIL != Symbols.boundp((SubLObject)module0318.$ic7$)) ? module0318.$g2804$.getGlobalValue() : module0318.NIL));
        module0318.$g2805$ = SubLFiles.deflexical("S#23993", (SubLObject)((module0318.NIL != Symbols.boundp((SubLObject)module0318.$ic8$)) ? module0318.$g2805$.getGlobalValue() : module0318.T));
        module0318.$g2806$ = SubLFiles.deflexical("S#23994", (SubLObject)((module0318.NIL != Symbols.boundp((SubLObject)module0318.$ic9$)) ? module0318.$g2806$.getGlobalValue() : module0318.NIL));
        module0318.$g2807$ = SubLFiles.defparameter("S#23995", (SubLObject)module0318.NIL);
        module0318.$g2808$ = SubLFiles.defparameter("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*", (SubLObject)module0318.$ic11$);
        module0318.$g2809$ = SubLFiles.deflexical("S#23996", (SubLObject)module0318.NIL);
        module0318.$g2810$ = SubLFiles.deflexical("S#23997", (SubLObject)module0318.NIL);
        module0318.$g2811$ = SubLFiles.deflexical("S#23998", (SubLObject)module0318.NIL);
        return (SubLObject)module0318.NIL;
    }
    
    public static SubLObject f21473() {
        module0003.f57((SubLObject)module0318.$ic7$);
        module0003.f57((SubLObject)module0318.$ic8$);
        module0003.f57((SubLObject)module0318.$ic9$);
        module0034.f1909((SubLObject)module0318.$ic24$);
        module0034.f1909((SubLObject)module0318.$ic36$);
        module0034.f1909((SubLObject)module0318.$ic40$);
        module0034.f1895((SubLObject)module0318.$ic61$);
        return (SubLObject)module0318.NIL;
    }
    
    public void declareFunctions() {
        f21471();
    }
    
    public void initializeVariables() {
        f21472();
    }
    
    public void runTopLevelForms() {
        f21473();
    }
    
    static {
        me = (SubLFile)new module0318();
        module0318.$g2803$ = null;
        module0318.$g2804$ = null;
        module0318.$g2805$ = null;
        module0318.$g2806$ = null;
        module0318.$g2807$ = null;
        module0318.$g2808$ = null;
        module0318.$g2809$ = null;
        module0318.$g2810$ = null;
        module0318.$g2811$ = null;
        $ic0$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArg")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArg")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse")));
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic3$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = SubLObjectFactory.makeKeyword("DONE");
        $ic5$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23950", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#23992", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#23993", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#23994", "CYC");
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("argAdmittanceTestedDuringTransitiveViaInference"));
        $ic11$ = SubLObjectFactory.makeInteger(1500);
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic14$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic16$ = SubLObjectFactory.makeSymbol("CLET");
        $ic17$ = SubLObjectFactory.makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#23943", "CYC");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArg"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#23961", "CYC");
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#23966", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#23944", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic30$ = SubLObjectFactory.makeSymbol("S#12280", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#23996", "CYC");
        $ic33$ = SubLObjectFactory.makeInteger(100);
        $ic34$ = SubLObjectFactory.makeSymbol("S#23946", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic36$ = SubLObjectFactory.makeSymbol("S#23969", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#23945", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#23997", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#23947", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#23973", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic42$ = SubLObjectFactory.makeKeyword("STACK");
        $ic43$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic44$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic46$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic47$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic49$ = SubLObjectFactory.makeString("continue anyway");
        $ic50$ = SubLObjectFactory.makeKeyword("WARN");
        $ic51$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic53$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic54$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic55$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic56$ = SubLObjectFactory.makeSymbol("S#23998", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#23948", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23999", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24000", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24001", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic59$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic60$ = SubLObjectFactory.makeSymbol("S#23974", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#23978", "CYC");
        $ic62$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic63$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic64$ = SubLObjectFactory.makeString("Continue");
        $ic65$ = SubLObjectFactory.makeString("Error in tva-pred : ~a");
        $ic66$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic67$ = SubLObjectFactory.makeKeyword("INVERSE");
        $ic68$ = SubLObjectFactory.makeString("Error in direction : ~a");
        $ic69$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15202", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic70$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24002", "CYC")));
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"));
        $ic72$ = SubLObjectFactory.makeKeyword("TRANSITIVITY");
        $ic73$ = SubLObjectFactory.makeKeyword("CONTEXTUAL-TRANSITIVITY");
        $ic74$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic75$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic77$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic78$ = SubLObjectFactory.makeKeyword("CODE");
    }
    
    public static final class $f21436$UnaryFunction extends UnaryFunction
    {
        public $f21436$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23943"));
        }
        
        public SubLObject processItem(final SubLObject var29) {
            return module0318.f21436(var29);
        }
    }
    
    public static final class $f21438$UnaryFunction extends UnaryFunction
    {
        public $f21438$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23944"));
        }
        
        public SubLObject processItem(final SubLObject var29) {
            return module0318.f21438(var29);
        }
    }
    
    public static final class $f21439$UnaryFunction extends UnaryFunction
    {
        public $f21439$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23945"));
        }
        
        public SubLObject processItem(final SubLObject var29) {
            return module0318.f21439(var29);
        }
    }
    
    public static final class $f21444$ZeroArityFunction extends ZeroArityFunction
    {
        public $f21444$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23946"));
        }
        
        public SubLObject processItem() {
            return module0318.f21444();
        }
    }
    
    public static final class $f21447$ZeroArityFunction extends ZeroArityFunction
    {
        public $f21447$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23947"));
        }
        
        public SubLObject processItem() {
            return module0318.f21447();
        }
    }
    
    public static final class $f21452$ZeroArityFunction extends ZeroArityFunction
    {
        public $f21452$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23948"));
        }
        
        public SubLObject processItem() {
            return module0318.f21452();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0318.class
	Total time: 758 ms
	
	Decompiled with Procyon 0.5.32.
*/