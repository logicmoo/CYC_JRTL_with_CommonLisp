package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0147 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0147";
    public static final String myFingerPrint = "bbcc1bc12b00075c3e16eab9f9b60bec2ae819a76dfd0259f0b903b330b84dbe";
    public static SubLSymbol $g2094$;
    public static SubLSymbol $g2095$;
    public static SubLSymbol $g2096$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLString $ic35$;
    private static final SubLList $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    
    
    public static SubLObject f9490(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic1$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0147.$ic3$, var5)), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9491(final SubLObject var7, final SubLObject var8) {
        return Equality.eq(var7, var8);
    }
    
    public static SubLObject f9492(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return f9491(module0147.$g2094$.getDynamicValue(var9), var8);
    }
    
    public static SubLObject f9493(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0147.$ic5$, var5)), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9494(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic8$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0147.$ic9$, var5)), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9495() {
        return module0132.$g1548$.getGlobalValue();
    }
    
    public static SubLObject f9496() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0147.$g2095$.getDynamicValue(var9);
    }
    
    public static SubLObject f9497() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0147.$g2096$.getDynamicValue(var9);
    }
    
    public static SubLObject f9498() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0147.$g2094$.getDynamicValue(var9);
    }
    
    public static SubLObject f9499(final SubLObject var12) {
        return (SubLObject)module0147.T;
    }
    
    public static SubLObject f9500(final SubLObject var12) {
        return (SubLObject)module0147.T;
    }
    
    public static SubLObject f9501(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return module0161.f10513(module0147.$g2095$.getDynamicValue(var13), var12);
    }
    
    public static SubLObject f9502(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return module0004.f104(var12, module0147.$g2096$.getDynamicValue(var13), (SubLObject)module0147.$ic11$, (SubLObject)module0147.UNPROVIDED);
    }
    
    public static SubLObject f9503(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL != module0161.f10513(var12, module0147.$g2095$.getDynamicValue(var13))) {
            return (SubLObject)module0147.T;
        }
        final SubLObject var14 = module0132.f8596(module0147.$g2095$.getDynamicValue(var13));
        final SubLObject var15 = module0132.f8596(var12);
        if (module0147.NIL != var14 && module0147.NIL != var15) {
            return module0132.f8599(var12, module0147.$g2095$.getDynamicValue(var13));
        }
        if (module0147.NIL != var15) {
            return (SubLObject)module0147.T;
        }
        if (module0147.NIL != var14) {
            return (SubLObject)module0147.NIL;
        }
        return module0263.f17409(module0147.$g2095$.getDynamicValue(var13), var12);
    }
    
    public static SubLObject f9504(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL != module0161.f10513(var12, module0147.$g2095$.getDynamicValue(var13))) {
            return (SubLObject)module0147.T;
        }
        final SubLObject var14 = module0132.f8596(module0147.$g2095$.getDynamicValue(var13));
        final SubLObject var15 = module0132.f8596(var12);
        if (module0147.NIL != var14 && module0147.NIL != var15) {
            if (module0147.NIL != module0132.f8600(var12) && module0147.NIL != module0132.f8600(module0147.$g2095$.getDynamicValue(var13))) {
                return (SubLObject)module0147.T;
            }
            return module0132.f8597(var12, module0147.$g2095$.getDynamicValue(var13));
        }
        else {
            if (module0147.NIL != var14) {
                return (SubLObject)module0147.T;
            }
            if (module0147.NIL != var15) {
                return (SubLObject)module0147.NIL;
            }
            return module0263.f17409(var12, module0147.$g2095$.getDynamicValue(var13));
        }
    }
    
    public static SubLObject f9505(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL != module0132.f8600(var12) && module0147.NIL != Sequences.find_if((SubLObject)module0147.$ic12$, module0147.$g2096$.getDynamicValue(var13), (SubLObject)module0147.UNPROVIDED, (SubLObject)module0147.UNPROVIDED, (SubLObject)module0147.UNPROVIDED)) {
            return (SubLObject)module0147.T;
        }
        if (module0147.NIL != module0132.f8596(var12)) {
            if (module0147.NIL != module0147.$g2096$.getDynamicValue(var13) && module0147.NIL != module0035.find_if_not((SubLObject)module0147.$ic13$, module0147.$g2096$.getDynamicValue(var13), (SubLObject)module0147.UNPROVIDED, (SubLObject)module0147.UNPROVIDED, (SubLObject)module0147.UNPROVIDED)) {
                return (SubLObject)module0147.T;
            }
            SubLObject var14 = module0147.$g2096$.getDynamicValue(var13);
            SubLObject var15 = (SubLObject)module0147.NIL;
            var15 = var14.first();
            while (module0147.NIL != var14) {
                if (module0147.NIL != module0132.f8597(var15, var12)) {
                    return (SubLObject)module0147.T;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        SubLObject var14 = module0147.$g2096$.getDynamicValue(var13);
        SubLObject var15 = (SubLObject)module0147.NIL;
        var15 = var14.first();
        while (module0147.NIL != var14) {
            if (module0147.NIL != module0263.f17409(var15, var12)) {
                return (SubLObject)module0147.T;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0147.NIL;
    }
    
    public static SubLObject f9506(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0161.f10557(var12);
        if (module0147.NIL == f9503(var14)) {
            return (SubLObject)module0147.NIL;
        }
        final SubLObject var15 = module0161.f10586(module0147.$g2095$.getDynamicValue(var13));
        if (module0147.NIL != module0161.f10535(var15)) {
            return (SubLObject)module0147.T;
        }
        final SubLObject var16 = module0161.f10586(var12);
        if (module0147.NIL != var16) {
            final SubLObject var17 = module0161.f10588(var15);
            final SubLObject var18 = module0161.f10543(var17, module0147.$ic14$);
            return module0267.f17586(var16, var18);
        }
        return (SubLObject)module0147.T;
    }
    
    public static SubLObject f9507(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0147.$g2094$.getDynamicValue(var13);
        if (module0147.NIL == var14) {
            return f9503(var12);
        }
        final SubLObject var15 = var14;
        if (var15.eql((SubLObject)module0147.$ic15$)) {
            return f9503(var12);
        }
        if (var15.eql((SubLObject)module0147.$ic16$)) {
            return f9500(var12);
        }
        if (var15.eql((SubLObject)module0147.$ic17$)) {
            return f9499(var12);
        }
        if (var15.eql((SubLObject)module0147.$ic18$)) {
            return f9501(var12);
        }
        if (var15.eql((SubLObject)module0147.$ic19$)) {
            return f9502(var12);
        }
        if (var15.eql((SubLObject)module0147.$ic20$)) {
            return f9505(var12);
        }
        if (var15.eql((SubLObject)module0147.$ic21$)) {
            return f9506(var12);
        }
        return Functions.funcall(var14, var12);
    }
    
    public static SubLObject f9508(final SubLObject var26) {
        if (module0147.NIL != assertion_handles_oc.f11035(var26)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0147.NIL != f9509() || module0147.NIL != f9507(module0178.f11287(var26)));
        }
        return (SubLObject)module0147.NIL;
    }
    
    public static SubLObject f9510() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0147.NIL == module0147.$g2094$.getDynamicValue(var9)) {
            return (SubLObject)module0147.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0147.NIL != f9492((SubLObject)module0147.$ic15$) && module0147.$g2095$.getDynamicValue(var9).eql(module0132.$g1546$.getGlobalValue()));
    }
    
    public static SubLObject f9511() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0147.NIL == module0147.$g2094$.getDynamicValue(var9) || module0147.NIL != f9492((SubLObject)module0147.$ic15$));
    }
    
    public static SubLObject f9512() {
        return f9492((SubLObject)module0147.$ic16$);
    }
    
    public static SubLObject f9513() {
        return f9492((SubLObject)module0147.$ic17$);
    }
    
    public static SubLObject f9509() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0147.NIL != f9492((SubLObject)module0147.$ic17$) || module0147.NIL != f9492((SubLObject)module0147.$ic16$));
    }
    
    public static SubLObject f9514() {
        return f9492((SubLObject)module0147.$ic19$);
    }
    
    public static SubLObject f9515() {
        return f9492((SubLObject)module0147.$ic20$);
    }
    
    public static SubLObject f9516() {
        return f9492((SubLObject)module0147.$ic21$);
    }
    
    public static SubLObject f9517() {
        return f9492((SubLObject)module0147.$ic22$);
    }
    
    public static SubLObject f9518() {
        return f9492((SubLObject)module0147.$ic18$);
    }
    
    public static SubLObject f9519(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic24$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9520(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic29$, var5), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9521(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic26$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9522(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic31$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, module0147.$ic32$, ConsesLow.append(var5, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9523(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic36$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, module0147.$ic37$, ConsesLow.append(var5, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9524(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic40$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9525(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic8$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic43$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic6$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9526(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic8$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic46$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic6$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9527(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic47$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic49$, var5), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9528(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic50$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9529(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)module0147.$ic51$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL)));
    }
    
    public static SubLObject f9530(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (module0147.NIL == var5) {
            return reader.bq_cons((SubLObject)module0147.$ic52$, ConsesLow.append(var6, (SubLObject)module0147.NIL));
        }
        final SubLObject var7 = (SubLObject)module0147.$ic53$;
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic54$, var7), (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic55$, var7), ConsesLow.append(var6, (SubLObject)module0147.NIL))));
    }
    
    public static SubLObject f9531(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL == var12 || module0147.NIL != f9532(var12) || module0147.NIL != f9533(var12) || module0147.NIL != f9515() || module0147.NIL != f9516()) {
            return module0147.$g2094$.getDynamicValue(var13);
        }
        return (SubLObject)module0147.$ic15$;
    }
    
    public static SubLObject f9534(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return (module0147.NIL != var12) ? var12 : module0147.$g2095$.getDynamicValue(var13);
    }
    
    public static SubLObject f9535(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (module0147.NIL == var5) {
            return reader.bq_cons((SubLObject)module0147.$ic52$, ConsesLow.append(var6, (SubLObject)module0147.NIL));
        }
        final SubLObject var7 = (SubLObject)module0147.$ic57$;
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic58$, var7), (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic59$, var7), ConsesLow.append(var6, (SubLObject)module0147.NIL))));
    }
    
    public static SubLObject f9536(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL == var12) {
            return module0147.$g2094$.getDynamicValue(var13);
        }
        assert module0147.NIL != module0161.f10481(var12) : var12;
        return (SubLObject)module0147.$ic18$;
    }
    
    public static SubLObject f9537(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return (module0147.NIL != var12) ? var12 : module0147.$g2095$.getDynamicValue(var13);
    }
    
    public static SubLObject f9538(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic62$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic63$, var5), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9539(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic64$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic66$, var5), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9540(final SubLObject var12) {
        return (module0147.NIL != var12) ? var12 : Errors.error((SubLObject)module0147.$ic67$);
    }
    
    public static SubLObject f9541(final SubLObject var31) {
        return (module0147.NIL != module0161.f10479(var31)) ? module0162.f10628(var31) : var31;
    }
    
    public static SubLObject f9542(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic62$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9543(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (module0147.NIL == var5) {
            return reader.bq_cons((SubLObject)module0147.$ic52$, ConsesLow.append(var6, (SubLObject)module0147.NIL));
        }
        final SubLObject var7 = (SubLObject)module0147.$ic70$;
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)module0147.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic71$, var7), (SubLObject)ConsesLow.list((SubLObject)module0147.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic72$, var7), (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic73$, var7), ConsesLow.append(var6, (SubLObject)module0147.NIL)))));
    }
    
    public static SubLObject f9544(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic74$, (SubLObject)ConsesLow.list((SubLObject)module0147.$ic29$, var5), ConsesLow.append(var6, (SubLObject)module0147.NIL));
    }
    
    public static SubLObject f9545(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL != var12 && !module0147.areAssertionsDisabledFor(me) && module0147.NIL == module0161.f10480(var12)) {
            throw new AssertionError(var12);
        }
        if (module0147.NIL == var12) {
            return module0147.$g2095$.getDynamicValue(var13);
        }
        return var12;
    }
    
    public static SubLObject f9546(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL == var12) {
            return module0147.$g2094$.getDynamicValue(var13);
        }
        if (module0147.NIL != f9532(var12)) {
            return (SubLObject)module0147.$ic16$;
        }
        if (module0147.NIL != f9533(var12)) {
            return (SubLObject)module0147.$ic17$;
        }
        if (module0147.NIL != f9547(var12)) {
            return (SubLObject)module0147.$ic20$;
        }
        if (module0147.NIL != f9548(var12)) {
            return (SubLObject)module0147.$ic21$;
        }
        return (SubLObject)module0147.$ic15$;
    }
    
    public static SubLObject f9549(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL == var12) {
            return module0147.$g2096$.getDynamicValue(var13);
        }
        if (module0147.NIL != f9547(var12)) {
            return module0161.f10522(var12);
        }
        return (SubLObject)module0147.NIL;
    }
    
    public static SubLObject f9550(final SubLObject var12) {
        return Values.values(f9546(var12), f9545(var12), f9549(var12));
    }
    
    public static SubLObject f9532(final SubLObject var12) {
        return Equality.eq((SubLObject)module0147.$ic80$, module0348.f23380(var12));
    }
    
    public static SubLObject f9533(final SubLObject var12) {
        return Equality.eq((SubLObject)module0147.$ic82$, module0348.f23380(var12));
    }
    
    public static SubLObject f9547(final SubLObject var12) {
        return Equality.eq((SubLObject)module0147.$ic84$, module0348.f23380(var12));
    }
    
    public static SubLObject f9548(final SubLObject var12) {
        return Equality.eq((SubLObject)module0147.$ic86$, module0348.f23380(var12));
    }
    
    public static SubLObject f9551() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0147.NIL != f9513()) {
            return module0147.$ic32$;
        }
        if (module0147.NIL != f9512()) {
            return module0147.$ic37$;
        }
        if (module0147.NIL != f9515()) {
            return module0202.f12720(module0147.$ic87$, module0147.$g2096$.getDynamicValue(var9), (SubLObject)module0147.UNPROVIDED);
        }
        if (module0147.NIL != f9511()) {
            return module0147.$g2095$.getDynamicValue(var9);
        }
        return module0147.$g2095$.getDynamicValue(var9);
    }
    
    public static SubLObject f9552(SubLObject var12) {
        if (var12 == module0147.UNPROVIDED) {
            var12 = (SubLObject)module0147.NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0147.NIL != f9513()) {
            return module0147.$g2094$.getDynamicValue(var13);
        }
        if (module0147.NIL != f9512()) {
            return module0147.$g2094$.getDynamicValue(var13);
        }
        if (module0147.NIL != f9515()) {
            return module0202.f12720(module0147.$ic87$, module0147.$g2096$.getDynamicValue(var13), (SubLObject)module0147.UNPROVIDED);
        }
        if (module0147.NIL != var12) {
            return var12;
        }
        if (module0147.NIL != module0147.$g2095$.getDynamicValue(var13)) {
            return module0147.$g2095$.getDynamicValue(var13);
        }
        return (SubLObject)module0147.NIL;
    }
    
    public static SubLObject f9553(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)module0147.NIL;
        final SubLObject var15 = f9540(var12);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var13);
        final SubLObject var17 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var18 = module0147.$g2096$.currentBinding(var13);
        try {
            module0147.$g2095$.bind(f9545(var15), var13);
            module0147.$g2094$.bind(f9546(var15), var13);
            module0147.$g2096$.bind(f9549(var15), var13);
            var14 = f9552((SubLObject)module0147.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var18, var13);
            module0147.$g2094$.rebind(var17, var13);
            module0147.$g2095$.rebind(var16, var13);
        }
        return var14;
    }
    
    public static SubLObject f9554(final SubLObject var66) {
        if (module0147.NIL != f9491(var66, (SubLObject)module0147.$ic17$)) {
            return module0147.$ic32$;
        }
        if (module0147.NIL != f9491(var66, (SubLObject)module0147.$ic16$)) {
            return module0147.$ic37$;
        }
        return var66;
    }
    
    public static SubLObject f9555(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic88$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0147.$ic90$, var5, (SubLObject)module0147.$ic91$), reader.bq_cons((SubLObject)module0147.$ic33$, ConsesLow.append(var6, (SubLObject)module0147.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0147.$ic90$, var5, (SubLObject)module0147.$ic92$), reader.bq_cons((SubLObject)module0147.$ic38$, ConsesLow.append(var6, (SubLObject)module0147.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0147.$ic93$, var5), (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic94$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0147.T, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic26$, var5, ConsesLow.append(var6, (SubLObject)module0147.NIL))));
    }
    
    public static SubLObject f9556(final SubLObject var73, final SubLObject var74) {
        return module0004.f104(module0178.f11287(var73), var74, (SubLObject)module0147.UNPROVIDED, (SubLObject)module0147.UNPROVIDED);
    }
    
    public static SubLObject f9557(final SubLObject var12) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0147.NIL != f9532(var12) || module0147.NIL != f9533(var12));
    }
    
    public static SubLObject f9558(final SubLObject var12) {
        if (module0147.NIL != f9557(var12)) {
            return module0132.$g1547$.getGlobalValue();
        }
        return var12;
    }
    
    public static SubLObject f9559(final SubLObject var12, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)module0147.NIL;
        final SubLObject var78 = f9540(var12);
        final SubLObject var79 = module0147.$g2095$.currentBinding(var76);
        final SubLObject var80 = module0147.$g2094$.currentBinding(var76);
        final SubLObject var81 = module0147.$g2096$.currentBinding(var76);
        try {
            module0147.$g2095$.bind(f9545(var78), var76);
            module0147.$g2094$.bind(f9546(var78), var76);
            module0147.$g2096$.bind(f9549(var78), var76);
            var77 = f9507(var75);
        }
        finally {
            module0147.$g2096$.rebind(var81, var76);
            module0147.$g2094$.rebind(var80, var76);
            module0147.$g2095$.rebind(var79, var76);
        }
        return var77;
    }
    
    public static SubLObject f9560(final SubLObject var74) {
        SubLObject var75 = (SubLObject)module0147.NIL;
        if (module0147.NIL == var75) {
            SubLObject var76 = var74;
            SubLObject var77 = (SubLObject)module0147.NIL;
            var77 = var76.first();
            while (module0147.NIL == var75 && module0147.NIL != var76) {
                if (module0147.NIL != f9507(var77)) {
                    var75 = (SubLObject)module0147.T;
                }
                var76 = var76.rest();
                var77 = var76.first();
            }
        }
        return var75;
    }
    
    public static SubLObject f9561(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic95$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0147.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0147.$ic95$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0147.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0147.$ic33$, (SubLObject)ConsesLow.listS((SubLObject)module0147.$ic96$, reader.bq_cons(var6, (SubLObject)module0147.$ic97$), ConsesLow.append(var7, (SubLObject)module0147.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0147.$ic95$);
        return (SubLObject)module0147.NIL;
    }
    
    public static SubLObject f9562() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9490", "WITH-MT-FUNCTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9491", "S#12268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9492", "S#12269", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9493", "IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9494", "S#12270");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9495", "S#12271", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9496", "CURRENT-MT-RELEVANCE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9497", "S#12272", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9498", "S#12273", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9499", "S#12274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9500", "S#12275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9501", "S#12276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9502", "S#12277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9503", "S#12278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9504", "S#12279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9505", "S#12280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9506", "S#12281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9507", "RELEVANT-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9508", "S#12282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9510", "S#12283", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9511", "S#12284", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9512", "S#11715", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9513", "S#11714", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9509", "S#12285", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9514", "S#12286", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9515", "S#12287", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9516", "S#12288", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9517", "S#12289", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9518", "S#12290", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9519", "WITH-GENL-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9520", "S#12291");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9521", "WITH-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9522", "WITH-ALL-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9523", "WITH-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9524", "WITH-JUST-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9525", "WITH-MT-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9526", "S#12292");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9527", "S#12293");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9528", "S#12294");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9529", "S#12295");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9530", "S#12296");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9531", "S#12297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9534", "S#12298", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9535", "S#12299");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9536", "S#12300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9537", "S#12301", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9538", "WITH-INFERENCE-MT-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9539", "S#12302");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9540", "S#12303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9541", "S#12304", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9542", "S#11680");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9543", "S#12305");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9544", "S#12306");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9545", "S#12307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9546", "S#12308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9549", "S#12309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9550", "S#12310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9532", "S#12311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9533", "S#12312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9547", "S#12313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9548", "S#12314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9551", "S#12315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9552", "S#12316", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9553", "S#12317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9554", "S#12318", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9555", "S#12319");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9556", "S#12320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9557", "S#12321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9558", "S#12322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9559", "S#12323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0147", "f9560", "S#12324", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0147", "f9561", "MAP-MTS");
        return (SubLObject)module0147.NIL;
    }
    
    public static SubLObject f9563() {
        module0147.$g2094$ = SubLFiles.defparameter("S#9973", (SubLObject)module0147.NIL);
        module0147.$g2095$ = SubLFiles.defparameter("*MT*", module0132.$g1546$.getGlobalValue());
        module0147.$g2096$ = SubLFiles.defparameter("S#12325", (SubLObject)module0147.NIL);
        return (SubLObject)module0147.NIL;
    }
    
    public static SubLObject f9564() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0147.$ic0$);
        module0132.f8593(module0147.$g2095$.getDynamicValue(), (SubLObject)module0147.UNPROVIDED);
        module0002.f50((SubLObject)module0147.$ic6$, (SubLObject)module0147.$ic7$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0147.$ic10$);
        module0012.f375((SubLObject)module0147.$ic26$, (SubLObject)module0147.$ic4$, (SubLObject)module0147.$ic27$);
        module0012.f375((SubLObject)module0147.$ic30$, (SubLObject)module0147.$ic4$, (SubLObject)module0147.$ic27$);
        module0012.f375((SubLObject)module0147.$ic33$, (SubLObject)module0147.$ic34$, (SubLObject)module0147.$ic35$);
        module0012.f375((SubLObject)module0147.$ic38$, (SubLObject)module0147.$ic34$, (SubLObject)module0147.$ic39$);
        module0012.f375((SubLObject)module0147.$ic41$, (SubLObject)module0147.$ic4$, (SubLObject)module0147.$ic42$);
        module0012.f375((SubLObject)module0147.$ic44$, (SubLObject)module0147.$ic8$, (SubLObject)module0147.$ic45$);
        module0002.f50((SubLObject)module0147.$ic54$, (SubLObject)module0147.$ic56$);
        module0002.f50((SubLObject)module0147.$ic55$, (SubLObject)module0147.$ic56$);
        module0002.f50((SubLObject)module0147.$ic58$, (SubLObject)module0147.$ic60$);
        module0002.f50((SubLObject)module0147.$ic59$, (SubLObject)module0147.$ic60$);
        module0012.f375((SubLObject)module0147.$ic64$, (SubLObject)module0147.$ic4$, (SubLObject)module0147.$ic65$);
        module0002.f50((SubLObject)module0147.$ic63$, (SubLObject)module0147.$ic64$);
        module0002.f50((SubLObject)module0147.$ic66$, (SubLObject)module0147.$ic68$);
        module0002.f50((SubLObject)module0147.$ic62$, (SubLObject)module0147.$ic69$);
        module0002.f50((SubLObject)module0147.$ic71$, (SubLObject)module0147.$ic62$);
        module0002.f50((SubLObject)module0147.$ic72$, (SubLObject)module0147.$ic62$);
        module0002.f50((SubLObject)module0147.$ic73$, (SubLObject)module0147.$ic62$);
        module0002.f35((SubLObject)module0147.$ic76$, (SubLObject)module0147.$ic77$);
        module0002.f50((SubLObject)module0147.$ic78$, (SubLObject)module0147.$ic79$);
        module0002.f50((SubLObject)module0147.$ic81$, (SubLObject)module0147.$ic79$);
        module0002.f50((SubLObject)module0147.$ic83$, (SubLObject)module0147.$ic79$);
        module0002.f50((SubLObject)module0147.$ic85$, (SubLObject)module0147.$ic79$);
        module0012.f375((SubLObject)module0147.$ic98$, (SubLObject)module0147.$ic95$, (SubLObject)module0147.$ic99$);
        return (SubLObject)module0147.NIL;
    }
    
    public void declareFunctions() {
        f9562();
    }
    
    public void initializeVariables() {
        f9563();
    }
    
    public void runTopLevelForms() {
        f9564();
    }
    
    static {
        me = (SubLFile)new module0147();
        module0147.$g2094$ = null;
        module0147.$g2095$ = null;
        module0147.$g2096$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12268", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12269", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic2$ = SubLObjectFactory.makeSymbol("CLET");
        $ic3$ = SubLObjectFactory.makeSymbol("S#9973", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("*MT*");
        $ic6$ = SubLObjectFactory.makeSymbol("S#12270", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12292", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12305", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12326", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#12325", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12275", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12276", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12277", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12278", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12279", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12280", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic12$ = SubLObjectFactory.makeSymbol("S#10715", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#10714", "CYC");
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#12277", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#12280", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#12281", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#12279", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("WITH-MT-FUNCTION");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12278", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("IN-MT");
        $ic26$ = SubLObjectFactory.makeSymbol("WITH-GENL-MTS");
        $ic27$ = SubLObjectFactory.makeString("MT and all its genl mts are relevant within BODY.");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12327", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT");
        $ic30$ = SubLObjectFactory.makeSymbol("WITH-MT");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12274", "CYC"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic33$ = SubLObjectFactory.makeSymbol("WITH-ALL-MTS");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic35$ = SubLObjectFactory.makeString("All mts are relevant within BODY.");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12275", "CYC"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic38$ = SubLObjectFactory.makeSymbol("WITH-ANY-MT");
        $ic39$ = SubLObjectFactory.makeString("Any mt can be used for relevance for a particular inference within &BODY.");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12276", "CYC"));
        $ic41$ = SubLObjectFactory.makeSymbol("WITH-JUST-MT");
        $ic42$ = SubLObjectFactory.makeString("Only MT is relevant within BODY (no genl mts).");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12277", "CYC"));
        $ic44$ = SubLObjectFactory.makeSymbol("WITH-MT-LIST");
        $ic45$ = SubLObjectFactory.makeString("Each mt in the list MT-LIST is relevant within BODY (no genl mts).");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12280", "CYC"));
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12328", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#12292", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#12266", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12281", "CYC"));
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12279", "CYC"));
        $ic52$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic53$ = SubLObjectFactory.makeUninternedSymbol("US#346C856");
        $ic54$ = SubLObjectFactory.makeSymbol("S#12297", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#12298", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#12296", "CYC");
        $ic57$ = SubLObjectFactory.makeUninternedSymbol("US#346C856");
        $ic58$ = SubLObjectFactory.makeSymbol("S#12300", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#12301", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#12299", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#12305", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#12303", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $ic65$ = SubLObjectFactory.makeString("BODY evaluated with the same relevance used for inferences in MT.\n   This is like @xref with-genl-mts, except it is special-cased to\n   @xref with-all-mts when the mt is #$EverythingPSC,\n   @xref with-any-mt when the mt is #$InferencePSC.\n   Also, with-inference-mt-relevance errors if passed NIL for an mt.");
        $ic66$ = SubLObjectFactory.makeSymbol("S#12304", "CYC");
        $ic67$ = SubLObjectFactory.makeString("No microtheory was specified.");
        $ic68$ = SubLObjectFactory.makeSymbol("S#12302", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11680", "CYC"));
        $ic70$ = SubLObjectFactory.makeUninternedSymbol("US#346C856");
        $ic71$ = SubLObjectFactory.makeSymbol("S#12307", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#12308", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#12309", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#11680", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#12265", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#12310", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12307", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12309", "CYC"));
        $ic78$ = SubLObjectFactory.makeSymbol("S#12311", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12305", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12296", "CYC"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#12329", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#12312", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#12330", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#12313", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#12331", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#12314", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#12332", "CYC");
        $ic87$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12316", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic89$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic90$ = SubLObjectFactory.makeSymbol("S#12268", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12274", "CYC")));
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12275", "CYC")));
        $ic93$ = SubLObjectFactory.makeSymbol("S#12333", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#12293", "CYC");
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic96$ = SubLObjectFactory.makeSymbol("DO-ALL-FORT-INSTANCES");
        $ic97$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $ic98$ = SubLObjectFactory.makeSymbol("MAP-MTS");
        $ic99$ = SubLObjectFactory.makeString("Iterate over all microtheories, binding VAR to an mt and executing BODY.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0147.class
	Total time: 225 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/