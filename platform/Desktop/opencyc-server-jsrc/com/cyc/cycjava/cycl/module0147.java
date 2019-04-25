package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9491(final SubLObject var7, final SubLObject var8) {
        return Equality.eq(var7, var8);
    }
    
    public static SubLObject f9492(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return f9491($g2094$.getDynamicValue(var9), var8);
    }
    
    public static SubLObject f9493(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9494(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic9$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9495() {
        return module0132.$g1548$.getGlobalValue();
    }
    
    public static SubLObject f9496() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return $g2095$.getDynamicValue(var9);
    }
    
    public static SubLObject f9497() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return $g2096$.getDynamicValue(var9);
    }
    
    public static SubLObject f9498() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return $g2094$.getDynamicValue(var9);
    }
    
    public static SubLObject f9499(final SubLObject var12) {
        return (SubLObject)T;
    }
    
    public static SubLObject f9500(final SubLObject var12) {
        return (SubLObject)T;
    }
    
    public static SubLObject f9501(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return module0161.f10513($g2095$.getDynamicValue(var13), var12);
    }
    
    public static SubLObject f9502(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return module0004.f104(var12, $g2096$.getDynamicValue(var13), (SubLObject)$ic11$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9503(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0161.f10513(var12, $g2095$.getDynamicValue(var13))) {
            return (SubLObject)T;
        }
        final SubLObject var14 = module0132.f8596($g2095$.getDynamicValue(var13));
        final SubLObject var15 = module0132.f8596(var12);
        if (NIL != var14 && NIL != var15) {
            return module0132.f8599(var12, $g2095$.getDynamicValue(var13));
        }
        if (NIL != var15) {
            return (SubLObject)T;
        }
        if (NIL != var14) {
            return (SubLObject)NIL;
        }
        return module0263.f17409($g2095$.getDynamicValue(var13), var12);
    }
    
    public static SubLObject f9504(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0161.f10513(var12, $g2095$.getDynamicValue(var13))) {
            return (SubLObject)T;
        }
        final SubLObject var14 = module0132.f8596($g2095$.getDynamicValue(var13));
        final SubLObject var15 = module0132.f8596(var12);
        if (NIL != var14 && NIL != var15) {
            if (NIL != module0132.f8600(var12) && NIL != module0132.f8600($g2095$.getDynamicValue(var13))) {
                return (SubLObject)T;
            }
            return module0132.f8597(var12, $g2095$.getDynamicValue(var13));
        }
        else {
            if (NIL != var14) {
                return (SubLObject)T;
            }
            if (NIL != var15) {
                return (SubLObject)NIL;
            }
            return module0263.f17409(var12, $g2095$.getDynamicValue(var13));
        }
    }
    
    public static SubLObject f9505(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != module0132.f8600(var12) && NIL != Sequences.find_if((SubLObject)$ic12$, $g2096$.getDynamicValue(var13), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0132.f8596(var12)) {
            if (NIL != $g2096$.getDynamicValue(var13) && NIL != module0035.find_if_not((SubLObject)$ic13$, $g2096$.getDynamicValue(var13), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            SubLObject var14 = $g2096$.getDynamicValue(var13);
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL != module0132.f8597(var15, var12)) {
                    return (SubLObject)T;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        SubLObject var14 = $g2096$.getDynamicValue(var13);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            if (NIL != module0263.f17409(var15, var12)) {
                return (SubLObject)T;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9506(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0161.f10557(var12);
        if (NIL == f9503(var14)) {
            return (SubLObject)NIL;
        }
        final SubLObject var15 = module0161.f10586($g2095$.getDynamicValue(var13));
        if (NIL != module0161.f10535(var15)) {
            return (SubLObject)T;
        }
        final SubLObject var16 = module0161.f10586(var12);
        if (NIL != var16) {
            final SubLObject var17 = module0161.f10588(var15);
            final SubLObject var18 = module0161.f10543(var17, $ic14$);
            return module0267.f17586(var16, var18);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f9507(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = $g2094$.getDynamicValue(var13);
        if (NIL == var14) {
            return f9503(var12);
        }
        final SubLObject var15 = var14;
        if (var15.eql((SubLObject)$ic15$)) {
            return f9503(var12);
        }
        if (var15.eql((SubLObject)$ic16$)) {
            return f9500(var12);
        }
        if (var15.eql((SubLObject)$ic17$)) {
            return f9499(var12);
        }
        if (var15.eql((SubLObject)$ic18$)) {
            return f9501(var12);
        }
        if (var15.eql((SubLObject)$ic19$)) {
            return f9502(var12);
        }
        if (var15.eql((SubLObject)$ic20$)) {
            return f9505(var12);
        }
        if (var15.eql((SubLObject)$ic21$)) {
            return f9506(var12);
        }
        return Functions.funcall(var14, var12);
    }
    
    public static SubLObject f9508(final SubLObject var26) {
        if (NIL != assertion_handles_oc.f11035(var26)) {
            return (SubLObject)makeBoolean(NIL != f9509() || NIL != f9507(module0178.f11287(var26)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9510() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == $g2094$.getDynamicValue(var9)) {
            return (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL != f9492((SubLObject)$ic15$) && $g2095$.getDynamicValue(var9).eql(module0132.$g1546$.getGlobalValue()));
    }
    
    public static SubLObject f9511() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == $g2094$.getDynamicValue(var9) || NIL != f9492((SubLObject)$ic15$));
    }
    
    public static SubLObject f9512() {
        return f9492((SubLObject)$ic16$);
    }
    
    public static SubLObject f9513() {
        return f9492((SubLObject)$ic17$);
    }
    
    public static SubLObject f9509() {
        return (SubLObject)makeBoolean(NIL != f9492((SubLObject)$ic17$) || NIL != f9492((SubLObject)$ic16$));
    }
    
    public static SubLObject f9514() {
        return f9492((SubLObject)$ic19$);
    }
    
    public static SubLObject f9515() {
        return f9492((SubLObject)$ic20$);
    }
    
    public static SubLObject f9516() {
        return f9492((SubLObject)$ic21$);
    }
    
    public static SubLObject f9517() {
        return f9492((SubLObject)$ic22$);
    }
    
    public static SubLObject f9518() {
        return f9492((SubLObject)$ic18$);
    }
    
    public static SubLObject f9519(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)ConsesLow.listS((SubLObject)$ic25$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9520(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9521(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic26$, var5, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9522(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic31$, (SubLObject)ConsesLow.listS((SubLObject)$ic25$, $ic32$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9523(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic36$, (SubLObject)ConsesLow.listS((SubLObject)$ic25$, $ic37$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9524(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic40$, (SubLObject)ConsesLow.listS((SubLObject)$ic25$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9525(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic43$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9526(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic46$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9527(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9528(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic50$, (SubLObject)ConsesLow.listS((SubLObject)$ic25$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9529(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic51$, (SubLObject)ConsesLow.listS((SubLObject)$ic25$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9530(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (NIL == var5) {
            return reader.bq_cons((SubLObject)$ic52$, ConsesLow.append(var6, (SubLObject)NIL));
        }
        final SubLObject var7 = (SubLObject)$ic53$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic54$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)$ic55$, var7), ConsesLow.append(var6, (SubLObject)NIL))));
    }
    
    public static SubLObject f9531(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL == var12 || NIL != f9532(var12) || NIL != f9533(var12) || NIL != f9515() || NIL != f9516()) {
            return $g2094$.getDynamicValue(var13);
        }
        return (SubLObject)$ic15$;
    }
    
    public static SubLObject f9534(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return (NIL != var12) ? var12 : $g2095$.getDynamicValue(var13);
    }
    
    public static SubLObject f9535(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (NIL == var5) {
            return reader.bq_cons((SubLObject)$ic52$, ConsesLow.append(var6, (SubLObject)NIL));
        }
        final SubLObject var7 = (SubLObject)$ic57$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic58$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)$ic59$, var7), ConsesLow.append(var6, (SubLObject)NIL))));
    }
    
    public static SubLObject f9536(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL == var12) {
            return $g2094$.getDynamicValue(var13);
        }
        assert NIL != module0161.f10481(var12) : var12;
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f9537(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return (NIL != var12) ? var12 : $g2095$.getDynamicValue(var13);
    }
    
    public static SubLObject f9538(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic62$, (SubLObject)ConsesLow.list((SubLObject)$ic63$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9539(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic64$, (SubLObject)ConsesLow.list((SubLObject)$ic66$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9540(final SubLObject var12) {
        return (NIL != var12) ? var12 : Errors.error((SubLObject)$ic67$);
    }
    
    public static SubLObject f9541(final SubLObject var31) {
        return (NIL != module0161.f10479(var31)) ? module0162.f10628(var31) : var31;
    }
    
    public static SubLObject f9542(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic62$, var5, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9543(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (NIL == var5) {
            return reader.bq_cons((SubLObject)$ic52$, ConsesLow.append(var6, (SubLObject)NIL));
        }
        final SubLObject var7 = (SubLObject)$ic70$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic73$, var7), ConsesLow.append(var6, (SubLObject)NIL)))));
    }
    
    public static SubLObject f9544(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic74$, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9545(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != var12 && !areAssertionsDisabledFor(me) && NIL == module0161.f10480(var12)) {
            throw new AssertionError(var12);
        }
        if (NIL == var12) {
            return $g2095$.getDynamicValue(var13);
        }
        return var12;
    }
    
    public static SubLObject f9546(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL == var12) {
            return $g2094$.getDynamicValue(var13);
        }
        if (NIL != f9532(var12)) {
            return (SubLObject)$ic16$;
        }
        if (NIL != f9533(var12)) {
            return (SubLObject)$ic17$;
        }
        if (NIL != f9547(var12)) {
            return (SubLObject)$ic20$;
        }
        if (NIL != f9548(var12)) {
            return (SubLObject)$ic21$;
        }
        return (SubLObject)$ic15$;
    }
    
    public static SubLObject f9549(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL == var12) {
            return $g2096$.getDynamicValue(var13);
        }
        if (NIL != f9547(var12)) {
            return module0161.f10522(var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9550(final SubLObject var12) {
        return Values.values(f9546(var12), f9545(var12), f9549(var12));
    }
    
    public static SubLObject f9532(final SubLObject var12) {
        return Equality.eq((SubLObject)$ic80$, module0348.f23380(var12));
    }
    
    public static SubLObject f9533(final SubLObject var12) {
        return Equality.eq((SubLObject)$ic82$, module0348.f23380(var12));
    }
    
    public static SubLObject f9547(final SubLObject var12) {
        return Equality.eq((SubLObject)$ic84$, module0348.f23380(var12));
    }
    
    public static SubLObject f9548(final SubLObject var12) {
        return Equality.eq((SubLObject)$ic86$, module0348.f23380(var12));
    }
    
    public static SubLObject f9551() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != f9513()) {
            return $ic32$;
        }
        if (NIL != f9512()) {
            return $ic37$;
        }
        if (NIL != f9515()) {
            return module0202.f12720($ic87$, $g2096$.getDynamicValue(var9), (SubLObject)UNPROVIDED);
        }
        if (NIL != f9511()) {
            return $g2095$.getDynamicValue(var9);
        }
        return $g2095$.getDynamicValue(var9);
    }
    
    public static SubLObject f9552(SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL != f9513()) {
            return $g2094$.getDynamicValue(var13);
        }
        if (NIL != f9512()) {
            return $g2094$.getDynamicValue(var13);
        }
        if (NIL != f9515()) {
            return module0202.f12720($ic87$, $g2096$.getDynamicValue(var13), (SubLObject)UNPROVIDED);
        }
        if (NIL != var12) {
            return var12;
        }
        if (NIL != $g2095$.getDynamicValue(var13)) {
            return $g2095$.getDynamicValue(var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9553(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = f9540(var12);
        final SubLObject var16 = $g2095$.currentBinding(var13);
        final SubLObject var17 = $g2094$.currentBinding(var13);
        final SubLObject var18 = $g2096$.currentBinding(var13);
        try {
            $g2095$.bind(f9545(var15), var13);
            $g2094$.bind(f9546(var15), var13);
            $g2096$.bind(f9549(var15), var13);
            var14 = f9552((SubLObject)UNPROVIDED);
        }
        finally {
            $g2096$.rebind(var18, var13);
            $g2094$.rebind(var17, var13);
            $g2095$.rebind(var16, var13);
        }
        return var14;
    }
    
    public static SubLObject f9554(final SubLObject var66) {
        if (NIL != f9491(var66, (SubLObject)$ic17$)) {
            return $ic32$;
        }
        if (NIL != f9491(var66, (SubLObject)$ic16$)) {
            return $ic37$;
        }
        return var66;
    }
    
    public static SubLObject f9555(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic88$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic90$, var5, (SubLObject)$ic91$), reader.bq_cons((SubLObject)$ic33$, ConsesLow.append(var6, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic90$, var5, (SubLObject)$ic92$), reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var6, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic93$, var5), (SubLObject)ConsesLow.listS((SubLObject)$ic94$, var5, ConsesLow.append(var6, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.listS((SubLObject)$ic26$, var5, ConsesLow.append(var6, (SubLObject)NIL))));
    }
    
    public static SubLObject f9556(final SubLObject var73, final SubLObject var74) {
        return module0004.f104(module0178.f11287(var73), var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9557(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f9532(var12) || NIL != f9533(var12));
    }
    
    public static SubLObject f9558(final SubLObject var12) {
        if (NIL != f9557(var12)) {
            return module0132.$g1547$.getGlobalValue();
        }
        return var12;
    }
    
    public static SubLObject f9559(final SubLObject var12, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)NIL;
        final SubLObject var78 = f9540(var12);
        final SubLObject var79 = $g2095$.currentBinding(var76);
        final SubLObject var80 = $g2094$.currentBinding(var76);
        final SubLObject var81 = $g2096$.currentBinding(var76);
        try {
            $g2095$.bind(f9545(var78), var76);
            $g2094$.bind(f9546(var78), var76);
            $g2096$.bind(f9549(var78), var76);
            var77 = f9507(var75);
        }
        finally {
            $g2096$.rebind(var81, var76);
            $g2094$.rebind(var80, var76);
            $g2095$.rebind(var79, var76);
        }
        return var77;
    }
    
    public static SubLObject f9560(final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        if (NIL == var75) {
            SubLObject var76 = var74;
            SubLObject var77 = (SubLObject)NIL;
            var77 = var76.first();
            while (NIL == var75 && NIL != var76) {
                if (NIL != f9507(var77)) {
                    var75 = (SubLObject)T;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic95$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic95$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)ConsesLow.listS((SubLObject)$ic96$, reader.bq_cons(var6, (SubLObject)$ic97$), ConsesLow.append(var7, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic95$);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9563() {
        $g2094$ = SubLFiles.defparameter("S#9973", (SubLObject)NIL);
        $g2095$ = SubLFiles.defparameter("*MT*", module0132.$g1546$.getGlobalValue());
        $g2096$ = SubLFiles.defparameter("S#12325", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9564() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic0$);
        module0132.f8593($g2095$.getDynamicValue(), (SubLObject)UNPROVIDED);
        module0002.f50((SubLObject)$ic6$, (SubLObject)$ic7$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic10$);
        module0012.f375((SubLObject)$ic26$, (SubLObject)$ic4$, (SubLObject)$ic27$);
        module0012.f375((SubLObject)$ic30$, (SubLObject)$ic4$, (SubLObject)$ic27$);
        module0012.f375((SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)$ic35$);
        module0012.f375((SubLObject)$ic38$, (SubLObject)$ic34$, (SubLObject)$ic39$);
        module0012.f375((SubLObject)$ic41$, (SubLObject)$ic4$, (SubLObject)$ic42$);
        module0012.f375((SubLObject)$ic44$, (SubLObject)$ic8$, (SubLObject)$ic45$);
        module0002.f50((SubLObject)$ic54$, (SubLObject)$ic56$);
        module0002.f50((SubLObject)$ic55$, (SubLObject)$ic56$);
        module0002.f50((SubLObject)$ic58$, (SubLObject)$ic60$);
        module0002.f50((SubLObject)$ic59$, (SubLObject)$ic60$);
        module0012.f375((SubLObject)$ic64$, (SubLObject)$ic4$, (SubLObject)$ic65$);
        module0002.f50((SubLObject)$ic63$, (SubLObject)$ic64$);
        module0002.f50((SubLObject)$ic66$, (SubLObject)$ic68$);
        module0002.f50((SubLObject)$ic62$, (SubLObject)$ic69$);
        module0002.f50((SubLObject)$ic71$, (SubLObject)$ic62$);
        module0002.f50((SubLObject)$ic72$, (SubLObject)$ic62$);
        module0002.f50((SubLObject)$ic73$, (SubLObject)$ic62$);
        module0002.f35((SubLObject)$ic76$, (SubLObject)$ic77$);
        module0002.f50((SubLObject)$ic78$, (SubLObject)$ic79$);
        module0002.f50((SubLObject)$ic81$, (SubLObject)$ic79$);
        module0002.f50((SubLObject)$ic83$, (SubLObject)$ic79$);
        module0002.f50((SubLObject)$ic85$, (SubLObject)$ic79$);
        module0012.f375((SubLObject)$ic98$, (SubLObject)$ic95$, (SubLObject)$ic99$);
        return (SubLObject)NIL;
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
        $g2094$ = null;
        $g2095$ = null;
        $g2096$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#12268", "CYC"), (SubLObject)makeSymbol("S#12269", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = makeSymbol("CLET");
        $ic3$ = makeSymbol("S#9973", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic5$ = makeSymbol("*MT*");
        $ic6$ = makeSymbol("S#12270", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT-LIST"), (SubLObject)makeSymbol("S#12292", "CYC"), (SubLObject)makeSymbol("S#12305", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#12326", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = makeSymbol("S#12325", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#12274", "CYC"), (SubLObject)makeSymbol("S#12275", "CYC"), (SubLObject)makeSymbol("S#12276", "CYC"), (SubLObject)makeSymbol("S#12277", "CYC"), (SubLObject)makeSymbol("S#12278", "CYC"), (SubLObject)makeSymbol("S#12279", "CYC"), (SubLObject)makeSymbol("S#12280", "CYC"));
        $ic11$ = makeSymbol("HLMT-EQUAL");
        $ic12$ = makeSymbol("S#10715", "CYC");
        $ic13$ = makeSymbol("S#10714", "CYC");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("TimePoint"));
        $ic15$ = makeSymbol("S#12278", "CYC");
        $ic16$ = makeSymbol("S#12275", "CYC");
        $ic17$ = makeSymbol("S#12274", "CYC");
        $ic18$ = makeSymbol("S#12276", "CYC");
        $ic19$ = makeSymbol("S#12277", "CYC");
        $ic20$ = makeSymbol("S#12280", "CYC");
        $ic21$ = makeSymbol("S#12281", "CYC");
        $ic22$ = makeSymbol("S#12279", "CYC");
        $ic23$ = makeSymbol("WITH-MT-FUNCTION");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12278", "CYC"));
        $ic25$ = makeSymbol("IN-MT");
        $ic26$ = makeSymbol("WITH-GENL-MTS");
        $ic27$ = makeString("MT and all its genl mts are relevant within BODY.");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#12327", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic29$ = makeSymbol("CANONICALIZE-HLMT");
        $ic30$ = makeSymbol("WITH-MT");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12274", "CYC"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic33$ = makeSymbol("WITH-ALL-MTS");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic35$ = makeString("All mts are relevant within BODY.");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12275", "CYC"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic38$ = makeSymbol("WITH-ANY-MT");
        $ic39$ = makeString("Any mt can be used for relevance for a particular inference within &BODY.");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12276", "CYC"));
        $ic41$ = makeSymbol("WITH-JUST-MT");
        $ic42$ = makeString("Only MT is relevant within BODY (no genl mts).");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12277", "CYC"));
        $ic44$ = makeSymbol("WITH-MT-LIST");
        $ic45$ = makeString("Each mt in the list MT-LIST is relevant within BODY (no genl mts).");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12280", "CYC"));
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("S#12328", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic48$ = makeSymbol("S#12292", "CYC");
        $ic49$ = makeSymbol("S#12266", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12281", "CYC"));
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12279", "CYC"));
        $ic52$ = makeSymbol("PROGN");
        $ic53$ = makeUninternedSymbol("US#346C856");
        $ic54$ = makeSymbol("S#12297", "CYC");
        $ic55$ = makeSymbol("S#12298", "CYC");
        $ic56$ = makeSymbol("S#12296", "CYC");
        $ic57$ = makeUninternedSymbol("US#346C856");
        $ic58$ = makeSymbol("S#12300", "CYC");
        $ic59$ = makeSymbol("S#12301", "CYC");
        $ic60$ = makeSymbol("S#12299", "CYC");
        $ic61$ = makeSymbol("S#12263", "CYC");
        $ic62$ = makeSymbol("S#12305", "CYC");
        $ic63$ = makeSymbol("S#12303", "CYC");
        $ic64$ = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $ic65$ = makeString("BODY evaluated with the same relevance used for inferences in MT.\n   This is like @xref with-genl-mts, except it is special-cased to\n   @xref with-all-mts when the mt is #$EverythingPSC,\n   @xref with-any-mt when the mt is #$InferencePSC.\n   Also, with-inference-mt-relevance errors if passed NIL for an mt.");
        $ic66$ = makeSymbol("S#12304", "CYC");
        $ic67$ = makeString("No microtheory was specified.");
        $ic68$ = makeSymbol("S#12302", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), (SubLObject)makeSymbol("S#11680", "CYC"));
        $ic70$ = makeUninternedSymbol("US#346C856");
        $ic71$ = makeSymbol("S#12307", "CYC");
        $ic72$ = makeSymbol("S#12308", "CYC");
        $ic73$ = makeSymbol("S#12309", "CYC");
        $ic74$ = makeSymbol("S#11680", "CYC");
        $ic75$ = makeSymbol("S#12265", "CYC");
        $ic76$ = makeSymbol("S#12310", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("S#12308", "CYC"), (SubLObject)makeSymbol("S#12307", "CYC"), (SubLObject)makeSymbol("S#12309", "CYC"));
        $ic78$ = makeSymbol("S#12311", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#12305", "CYC"), (SubLObject)makeSymbol("S#12296", "CYC"));
        $ic80$ = makeSymbol("S#12329", "CYC");
        $ic81$ = makeSymbol("S#12312", "CYC");
        $ic82$ = makeSymbol("S#12330", "CYC");
        $ic83$ = makeSymbol("S#12313", "CYC");
        $ic84$ = makeSymbol("S#12331", "CYC");
        $ic85$ = makeSymbol("S#12314", "CYC");
        $ic86$ = makeSymbol("S#12332", "CYC");
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#12316", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic89$ = makeSymbol("PCOND");
        $ic90$ = makeSymbol("S#12268", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12274", "CYC")));
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12275", "CYC")));
        $ic93$ = makeSymbol("S#12333", "CYC");
        $ic94$ = makeSymbol("S#12293", "CYC");
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic96$ = makeSymbol("DO-ALL-FORT-INSTANCES");
        $ic97$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Microtheory")));
        $ic98$ = makeSymbol("MAP-MTS");
        $ic99$ = makeString("Iterate over all microtheories, binding VAR to an mt and executing BODY.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 225 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/