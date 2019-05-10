package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0345 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0345";
    public static final String myFingerPrint = "9acc06b0034914a4bdd1970b1638e70fe584baae3c86bd24dfb0723daeae02dc";
    private static SubLSymbol $g2958$;
    private static SubLSymbol $g2959$;
    private static SubLSymbol $g2960$;
    private static SubLSymbol $g2961$;
    private static SubLSymbol $g2962$;
    public static SubLSymbol $g2963$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLList $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    
    public static SubLObject f23229(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0191.f11910(var1) : var1;
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)ONE_INTEGER);
            module0343.f23199(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23230(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0191.f11910(var1) : var1;
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)ONE_INTEGER);
            module0343.f23200(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23231(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0191.f11910(var1) : var1;
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)ONE_INTEGER);
            module0344.f23220(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23232(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0191.f11910(var1) : var1;
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)ONE_INTEGER);
            module0344.f23221(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23233(final SubLObject var1, final SubLObject var2) {
        return f23234(var1, var2);
    }
    
    public static SubLObject f23234(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0034.f1945()) {
            f23235(var1, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23235(final SubLObject var1, final SubLObject var2) {
        module0262.f17359();
        module0263.f17417(var1, var2);
        module0264.f17444();
        module0258.f16769();
        module0318.f21444();
        SubLObject var3 = module0034.$g884$.getGlobalValue();
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != Symbols.fboundp(var4)) {
                Functions.funcall(var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23236(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2959$.getDynamicValue(var3)) {
            final SubLObject var4 = $g2959$.currentBinding(var3);
            try {
                $g2959$.bind((SubLObject)T, var3);
                SubLObject var5 = module0034.$g887$.getGlobalValue();
                SubLObject var6 = (SubLObject)NIL;
                var6 = var5.first();
                while (NIL != var5) {
                    if (NIL != Symbols.fboundp(var6)) {
                        Functions.funcall(var6);
                    }
                    var5 = var5.rest();
                    var6 = var5.first();
                }
                f23237();
                f23238();
            }
            finally {
                $g2959$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23239(final SubLObject var1, final SubLObject var2) {
        f23237();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23237() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL == $g2960$.getDynamicValue(var6)) {
            final SubLObject var7 = $g2960$.currentBinding(var6);
            try {
                $g2960$.bind((SubLObject)T, var6);
                module0258.f16769();
                SubLObject var8 = module0034.$g889$.getGlobalValue();
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    if (NIL != Symbols.fboundp(var9)) {
                        Functions.funcall(var9);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            finally {
                $g2960$.rebind(var7, var6);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23240(final SubLObject var1, final SubLObject var2) {
        f23238();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23238() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL == $g2961$.getDynamicValue(var6)) {
            final SubLObject var7 = $g2961$.currentBinding(var6);
            try {
                $g2961$.bind((SubLObject)T, var6);
                SubLObject var8 = module0034.$g890$.getGlobalValue();
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    if (NIL != Symbols.fboundp(var9)) {
                        Functions.funcall(var9);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            finally {
                $g2961$.rebind(var7, var6);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23241(final SubLObject var1, final SubLObject var2) {
        module0264.f17444();
        module0318.f21444();
        SubLObject var3 = module0034.$g886$.getGlobalValue();
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != Symbols.fboundp(var4)) {
                Functions.funcall(var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23242(final SubLObject var1, final SubLObject var2) {
        module0322.f21801(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23243(final SubLObject var1, final SubLObject var2) {
        module0322.f21804(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23244(final SubLObject var1, final SubLObject var2) {
        module0322.f21803(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23245(final SubLObject var1, final SubLObject var2) {
        module0322.f21805(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23246(final SubLObject var1, final SubLObject var2) {
        module0318.f21444();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23247(final SubLObject var1, final SubLObject var2) {
        module0318.f21444();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23248(final SubLObject var1, final SubLObject var2) {
        module0318.f21447();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23249(final SubLObject var1, final SubLObject var2) {
        module0318.f21447();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23250(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0178.f11334(var2);
        if (NIL == module0123.f8350(var3)) {
            module0540.f33510(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23251(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)ONE_INTEGER);
            final SubLObject var4 = module0178.f11331(var2, (SubLObject)TWO_INTEGER);
            module0543.f33695(var4, var3);
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23252(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)ONE_INTEGER);
            final SubLObject var4 = module0178.f11331(var2, (SubLObject)TWO_INTEGER);
            module0543.f33696(var4, var3);
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23253(final SubLObject var1, final SubLObject var2) {
        return f23254($ic22$, var2);
    }
    
    public static SubLObject f23255(final SubLObject var1, final SubLObject var2) {
        return f23254($ic24$, var2);
    }
    
    public static SubLObject f23256(final SubLObject var1, final SubLObject var2) {
        return f23254($ic26$, var2);
    }
    
    public static SubLObject f23257(final SubLObject var1, final SubLObject var2) {
        return f23254($ic28$, var2);
    }
    
    public static SubLObject f23258(final SubLObject var1, final SubLObject var2) {
        return f23254($ic30$, var2);
    }
    
    public static SubLObject f23259(final SubLObject var1, final SubLObject var2) {
        return f23254($ic32$, var2);
    }
    
    public static SubLObject f23260(final SubLObject var1, final SubLObject var2) {
        return f23254($ic34$, var2);
    }
    
    public static SubLObject f23261(final SubLObject var1, final SubLObject var2) {
        return f23254($ic36$, var2);
    }
    
    public static SubLObject f23262(final SubLObject var1, final SubLObject var2) {
        return f23263($ic22$, var2);
    }
    
    public static SubLObject f23264(final SubLObject var1, final SubLObject var2) {
        return f23263($ic24$, var2);
    }
    
    public static SubLObject f23265(final SubLObject var1, final SubLObject var2) {
        return f23263($ic28$, var2);
    }
    
    public static SubLObject f23266(final SubLObject var1, final SubLObject var2) {
        return f23263($ic30$, var2);
    }
    
    public static SubLObject f23267(final SubLObject var1, final SubLObject var2) {
        return f23263($ic34$, var2);
    }
    
    public static SubLObject f23254(final SubLObject var13, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var14 = module0178.f11285(var2);
            final SubLObject var15 = module0178.f11287(var2);
            final SubLObject var16 = module0178.f11291(var2);
            if (module0202.f12839(var14, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER)) {
                SubLObject var18;
                final SubLObject var17 = var18 = var14;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic43$);
                var19 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic43$);
                var20 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic43$);
                var21 = var18.first();
                var18 = var18.rest();
                if (NIL == var18) {
                    if (NIL != module0260.f17091(var19, var13, var15, (SubLObject)UNPROVIDED)) {
                        final SubLObject var22 = (SubLObject)ConsesLow.list(var13, var20, var21);
                        final SubLObject var23 = (SubLObject)ConsesLow.list($ic30$, var19, var13);
                        final SubLObject var24 = module0538.f33420((SubLObject)$ic44$, var23, var15, (SubLObject)$ic45$);
                        final SubLObject var25 = (SubLObject)ConsesLow.list(var2, var24);
                        module0538.f33372(var22, var15, var25, var16, (SubLObject)UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic43$);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23263(final SubLObject var13, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var14 = module0178.f11285(var2);
            final SubLObject var15 = module0178.f11287(var2);
            final SubLObject var16 = module0178.f11291(var2);
            if (module0202.f12839(var14, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER)) {
                SubLObject var18;
                final SubLObject var17 = var18 = var14;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic43$);
                var19 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic43$);
                var20 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic43$);
                var21 = var18.first();
                var18 = var18.rest();
                if (NIL == var18) {
                    if (NIL != module0260.f17094(var19, var13, var15, (SubLObject)UNPROVIDED)) {
                        final SubLObject var22 = (SubLObject)ConsesLow.list(var13, var21, var20);
                        final SubLObject var23 = (SubLObject)ConsesLow.list($ic34$, var19, var13);
                        final SubLObject var24 = module0538.f33420((SubLObject)$ic44$, var23, var15, (SubLObject)$ic45$);
                        final SubLObject var25 = (SubLObject)ConsesLow.list(var2, var24);
                        module0538.f33372(var22, var15, var25, var16, (SubLObject)UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic43$);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23268(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13635(var2)) {
            final SubLObject var3 = module0538.f33478(var2, (SubLObject)UNPROVIDED);
            final SubLObject var4 = module0178.f11291(var2);
            SubLObject var6;
            final SubLObject var5 = var6 = var3;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic46$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic46$);
            var8 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic46$);
            var9 = var6.first();
            var6 = var6.rest();
            if (NIL == var6) {
                if (var7.eql($ic47$)) {
                    final SubLObject var10 = f23269(var8);
                    final SubLObject var11 = (SubLObject)ConsesLow.list(var10, var2);
                    module0538.f33372(var9, var8, var11, var4, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic46$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23269(final SubLObject var15) {
        final SubLObject var16 = (SubLObject)ConsesLow.listS($ic49$, (SubLObject)ConsesLow.listS($ic47$, var15, (SubLObject)$ic50$), (SubLObject)$ic50$);
        return module0538.f33420((SubLObject)$ic51$, var16, var15, (SubLObject)$ic45$);
    }
    
    public static SubLObject f23270(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var4 = module0178.f11287(var2);
            final SubLObject var5 = module0178.f11334(var2);
            final SubLObject var6 = module0178.f11335(var2);
            final SubLObject var7 = f23271(var5, var4);
            final SubLObject var8 = f23272();
            final SubLObject var9 = (SubLObject)ConsesLow.list(var8, var2);
            final SubLObject var10 = module0528.f32898();
            assert NIL != module0055.f4006(var10) : var10;
            final SubLObject var11 = module0131.$g1538$.currentBinding(var3);
            try {
                module0131.$g1538$.bind(var10, var3);
                module0538.f33372(var6, var4, var9, var7, (SubLObject)UNPROVIDED);
            }
            finally {
                module0131.$g1538$.rebind(var11, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23272() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = $g2962$.getDynamicValue(var6);
        return module0538.f33420((SubLObject)$ic51$, var7, $g2963$.getGlobalValue(), (SubLObject)$ic45$);
    }
    
    public static SubLObject f23273(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == assertion_handles_oc.f11035(var35) && $g2962$.getDynamicValue(var36).equal(module0191.f11969(var35)));
    }
    
    public static SubLObject f23271(final SubLObject var36, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var36) : var36;
        final SubLObject var38;
        final SubLObject var37 = var38 = module0220.f14557(var36, $ic59$, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var38.eql($ic60$)) {
            return (SubLObject)$ic61$;
        }
        if (var38.eql($ic62$)) {
            return (SubLObject)$ic63$;
        }
        return (SubLObject)$ic63$;
    }
    
    public static SubLObject f23274(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11287(var2);
            final SubLObject var4 = module0178.f11334(var2);
            final SubLObject var5 = module0178.f11335(var2);
            final SubLObject var6 = f23275(var4, var3);
            final SubLObject var7 = var5;
            if (var7.eql($ic60$)) {
                SubLObject var8 = var6;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    module0342.f23133(var9, (SubLObject)$ic61$);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
                module0528.f32921();
            }
            else if (var7.eql($ic62$)) {
                SubLObject var8 = var6;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    module0342.f23133(var9, (SubLObject)$ic63$);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23276(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11287(var2);
            final SubLObject var4 = module0178.f11334(var2);
            SubLObject var6;
            final SubLObject var5 = var6 = f23275(var4, var3);
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                module0342.f23133(var7, (SubLObject)$ic63$);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23275(final SubLObject var31, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = var15;
        final SubLObject var35 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind(module0147.f9531(var34), var32);
            module0147.$g2095$.bind(module0147.f9534(var34), var32);
            final SubLObject var37 = $ic57$;
            if (NIL != module0158.f10010(var31, (SubLObject)ONE_INTEGER, var37)) {
                final SubLObject var38 = module0158.f10011(var31, (SubLObject)ONE_INTEGER, var37);
                SubLObject var39 = (SubLObject)NIL;
                final SubLObject var40 = (SubLObject)NIL;
                while (NIL == var39) {
                    final SubLObject var41 = module0052.f3695(var38, var40);
                    final SubLObject var42 = (SubLObject)makeBoolean(!var40.eql(var41));
                    if (NIL != var42) {
                        SubLObject var43 = (SubLObject)NIL;
                        try {
                            var43 = module0158.f10316(var41, (SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)NIL);
                            SubLObject var45_50 = (SubLObject)NIL;
                            final SubLObject var46_51 = (SubLObject)NIL;
                            while (NIL == var45_50) {
                                final SubLObject var44 = module0052.f3695(var43, var46_51);
                                final SubLObject var48_53 = (SubLObject)makeBoolean(!var46_51.eql(var44));
                                if (NIL != var48_53) {
                                    final SubLObject var45 = module0178.f11300(var44);
                                    SubLObject var46;
                                    SubLObject var47;
                                    SubLObject var48;
                                    for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                        var48 = module0032.f1745(var46, var47);
                                        if (NIL != module0032.f1746(var47, var48) && NIL != f23277(var48)) {
                                            var33 = (SubLObject)ConsesLow.cons(module0188.f11781(var48), var33);
                                        }
                                    }
                                }
                                var45_50 = (SubLObject)makeBoolean(NIL == var48_53);
                            }
                        }
                        finally {
                            final SubLObject var7_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var32);
                                if (NIL != var43) {
                                    module0158.f10319(var43);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_58, var32);
                            }
                        }
                    }
                    var39 = (SubLObject)makeBoolean(NIL == var42);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var36, var32);
            module0147.$g2094$.rebind(var35, var32);
        }
        return Sequences.nreverse(var33);
    }
    
    public static SubLObject f23277(final SubLObject var57) {
        assert NIL != deduction_handles_oc.f11659(var57) : var57;
        return Sequences.find_if(Symbols.symbol_function((SubLObject)$ic69$), module0188.f11770(var57), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23278(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            if (NIL != module0173.f10955(var3) && NIL == module0123.f8350(var3)) {
                final SubLObject var4 = module0178.f11335(var2);
                if (NIL != module0173.f10955(var4) && NIL != module0123.f8350(var4)) {
                    return module0540.f33510(var3);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23279(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13635(var2) && NIL != module0178.f11373(var2, var1)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14749(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23280(final SubLObject var1, final SubLObject var2) {
        if (NIL == module0226.f15088(var2, (SubLObject)$ic67$)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14750(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23281(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13635(var2) && NIL != module0178.f11373(var2, var1)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14760(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23282(final SubLObject var1, final SubLObject var2) {
        if (NIL == module0226.f15088(var2, (SubLObject)$ic67$)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0225.f14761(var3);
        }
        return var2;
    }
    
    public static SubLObject f23283(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13635(var2) && NIL != module0178.f11373(var2, var1)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14771(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23284(final SubLObject var1, final SubLObject var2) {
        if (NIL == module0226.f15088(var2, (SubLObject)$ic67$)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0225.f14772(var3);
        }
        return var2;
    }
    
    public static SubLObject f23285(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20177(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23286(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20178(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23287(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20185(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23288(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20186(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23289(final SubLObject var1, final SubLObject var2) {
        return module0277.f18380(var2);
    }
    
    public static SubLObject f23290(final SubLObject var1, final SubLObject var2) {
        return module0277.f18382(var2);
    }
    
    public static SubLObject f23291(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            if (NIL != module0762.f48211(var3, (SubLObject)UNPROVIDED)) {
                module0763.f48253(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f23292(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            if (NIL != module0762.f48211(var3, (SubLObject)UNPROVIDED)) {
                module0763.f48253(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f23293(final SubLObject var1, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL == module0004.f104(var1, module0178.f11299(var66), (SubLObject)$ic85$, (SubLObject)UNPROVIDED) && NIL != module0211.f13635(var66)) {
            final SubLObject var68 = module0178.f11334(var66);
            final SubLObject var69 = module0178.f11335(var66);
            final SubLObject var70 = module0178.f11287(var69);
            if (NIL == module0220.f14557(var68, $ic86$, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var71 = module0279.f18490((SubLObject)$ic87$, var70);
                SubLObject var72 = (SubLObject)T;
                if (NIL != var71) {
                    final SubLObject var73 = module0289.f19396(var69);
                    final SubLObject var74 = Sequences.remove(var69, module0220.f14566(var68, $ic88$, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var75 = (SubLObject)NIL;
                    SubLObject var76 = (SubLObject)NIL;
                    if (NIL != var74) {
                        SubLObject var77 = (SubLObject)NIL;
                        if (NIL == var77) {
                            SubLObject var78;
                            SubLObject var79;
                            for (var78 = var74, var79 = (SubLObject)NIL, var79 = var78.first(); NIL == var77 && NIL != var78; var77 = (SubLObject)makeBoolean(!var73.equal(module0289.f19396(var79))), var78 = var78.rest(), var79 = var78.first()) {}
                        }
                        var72 = (SubLObject)makeBoolean(NIL == var77);
                    }
                    if (NIL != var72) {
                        final SubLObject var80 = module0147.$g2094$.currentBinding(var67);
                        final SubLObject var81 = module0147.$g2095$.currentBinding(var67);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic89$, var67);
                            module0147.$g2095$.bind(var70, var67);
                            module0274.f18061();
                            var75 = module0282.f18745(var73, var70, (SubLObject)$ic90$);
                        }
                        finally {
                            module0147.$g2095$.rebind(var81, var67);
                            module0147.$g2094$.rebind(var80, var67);
                        }
                        if (var75.isList() && NIL != module0035.f1997(Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic91$), var75), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                            SubLObject var82 = (SubLObject)NIL;
                            SubLObject var83 = (SubLObject)NIL;
                            final SubLObject var84 = var75.first();
                            final SubLObject var85 = module0232.f15306(var84);
                            if (NIL == var82) {
                                SubLObject var86 = var85;
                                SubLObject var87 = (SubLObject)NIL;
                                var87 = var86.first();
                                while (NIL == var82 && NIL != var86) {
                                    if (var68.eql(module0202.f12833(var87, (SubLObject)UNPROVIDED))) {
                                        SubLObject var88 = (SubLObject)ZERO_INTEGER;
                                        SubLObject var89 = (SubLObject)NIL;
                                        if (NIL == var89) {
                                            SubLObject var74_83 = module0202.f12829(var87, (SubLObject)UNPROVIDED);
                                            SubLObject var90 = (SubLObject)NIL;
                                            var90 = var74_83.first();
                                            while (NIL == var89 && NIL != var74_83) {
                                                var88 = Numbers.add(var88, (SubLObject)ONE_INTEGER);
                                                if (NIL != module0201.f12546(var90)) {
                                                    var83 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var90, module0303.f20123(var88)), var83);
                                                }
                                                else {
                                                    var89 = (SubLObject)T;
                                                }
                                                var74_83 = var74_83.rest();
                                                var90 = var74_83.first();
                                            }
                                        }
                                        if (NIL == var89) {
                                            var82 = var87;
                                        }
                                    }
                                    var86 = var86.rest();
                                    var87 = var86.first();
                                }
                            }
                            if (NIL != var82 && NIL != var83) {
                                final SubLObject var91 = module0152.$g2121$.currentBinding(var67);
                                try {
                                    module0152.$g2121$.bind((SubLObject)T, var67);
                                    final SubLObject var7_85 = module0147.$g2094$.currentBinding(var67);
                                    final SubLObject var92 = module0147.$g2095$.currentBinding(var67);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)$ic89$, var67);
                                        module0147.$g2095$.bind(var70, var67);
                                        var76 = module0276.f18293(conses_high.sublis(var83, conses_high.subst($ic92$, var82, var73, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0147.$g2095$.rebind(var92, var67);
                                        module0147.$g2094$.rebind(var7_85, var67);
                                    }
                                    if (NIL != module0202.f12590(var76) && NIL != module0274.f18060(var76, var70, (SubLObject)UNPROVIDED) && NIL == module0035.f2428(var68, var76, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        module0538.f33372((SubLObject)ConsesLow.list($ic86$, var68, var76), var70, (SubLObject)ConsesLow.list(var66, var71), (SubLObject)$ic61$, (SubLObject)T);
                                    }
                                }
                                finally {
                                    module0152.$g2121$.rebind(var91, var67);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23294(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0291.f19546() && NIL != module0291.f19562(var2)) {
            module0291.f19565(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23295(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0291.f19546()) {
            module0291.f19567(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23296(final SubLObject var1, final SubLObject var2) {
        if (NIL != module0211.f13635(var2)) {
            final SubLObject var3 = module0538.f33478(var2, (SubLObject)UNPROVIDED);
            final SubLObject var4 = module0178.f11287(var2);
            SubLObject var6;
            final SubLObject var5 = var6 = var3;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic96$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic96$);
            var8 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic96$);
            var9 = var6.first();
            var6 = var6.rest();
            if (NIL == var6) {
                if (var7.eql($ic97$) && NIL != module0202.f12589(var9, $ic98$)) {
                    SubLObject var93_94;
                    final SubLObject var91_92 = var93_94 = var9;
                    SubLObject var10 = (SubLObject)NIL;
                    SubLObject var11 = (SubLObject)NIL;
                    SubLObject var12 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)$ic99$);
                    var10 = var93_94.first();
                    var93_94 = var93_94.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)$ic99$);
                    var11 = var93_94.first();
                    var93_94 = var93_94.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)$ic99$);
                    var12 = var93_94.first();
                    var93_94 = var93_94.rest();
                    if (NIL == var93_94) {
                        final SubLObject var13 = module0205.f13250(var8, var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0538.f33372(var13, var4, (SubLObject)ConsesLow.list(var2), (SubLObject)$ic61$, (SubLObject)T);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var91_92, (SubLObject)$ic99$);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic96$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23297(final SubLObject var1, final SubLObject var2) {
        module0610.f37212();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23298(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        assert NIL != module0178.f11290(var3) : var3;
        module0508.f32426(var3, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23299(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        assert NIL != module0178.f11290(var3) : var3;
        module0508.f32429(var3, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23300(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        final SubLObject var4 = module0178.f11335(var2);
        final SubLObject var5 = Guids.string_to_guid(var4);
        if (NIL != constant_handles_oc.f8449(var3)) {
            module0165.f10727(var3, var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23301(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        final SubLObject var4 = module0178.f11335(var2);
        final SubLObject var5 = Guids.string_to_guid(var4);
        if (NIL != constant_handles_oc.f8449(var3)) {
            module0165.f10728(var3, var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23302(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0178.f11334(var2);
        final SubLObject var5 = module0178.f11300(var4);
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = module0032.f1741(var5), var7 = (SubLObject)NIL, var7 = module0032.f1742(var6, var5); NIL == module0032.f1744(var6, var7); var7 = module0032.f1743(var7)) {
            var8 = module0032.f1745(var6, var7);
            if (NIL != module0032.f1746(var7, var8)) {
                module0342.f23153(var8);
            }
        }
        final SubLObject var9 = module0131.$g60$.currentBinding(var3);
        final SubLObject var10 = module0018.$g61$.currentBinding(var3);
        try {
            module0131.$g60$.bind((SubLObject)NIL, var3);
            module0018.$g61$.bind((SubLObject)NIL, var3);
            final SubLObject var11 = module0528.f32898();
            assert NIL != module0055.f4006(var11) : var11;
            final SubLObject var7_103 = module0131.$g1538$.currentBinding(var3);
            final SubLObject var42_104 = module0012.$g59$.currentBinding(var3);
            try {
                module0131.$g1538$.bind(var11, var3);
                module0012.$g59$.bind((SubLObject)NIL, var3);
                try {
                    module0528.f32923(var4, (SubLObject)UNPROVIDED);
                }
                finally {
                    final SubLObject var7_104 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                        module0528.f32915();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_104, var3);
                    }
                }
            }
            finally {
                module0012.$g59$.rebind(var42_104, var3);
                module0131.$g1538$.rebind(var7_103, var3);
            }
        }
        finally {
            module0018.$g61$.rebind(var10, var3);
            module0131.$g60$.rebind(var9, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23303(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0178.f11334(var2);
        final SubLObject var5 = module0131.$g60$.currentBinding(var3);
        final SubLObject var6 = module0018.$g61$.currentBinding(var3);
        try {
            module0131.$g60$.bind((SubLObject)NIL, var3);
            module0018.$g61$.bind((SubLObject)NIL, var3);
            final SubLObject var7 = module0528.f32898();
            assert NIL != module0055.f4006(var7) : var7;
            final SubLObject var7_106 = module0131.$g1538$.currentBinding(var3);
            final SubLObject var42_107 = module0012.$g59$.currentBinding(var3);
            try {
                module0131.$g1538$.bind(var7, var3);
                module0012.$g59$.bind((SubLObject)NIL, var3);
                try {
                    module0528.f32923(var4, (SubLObject)UNPROVIDED);
                }
                finally {
                    final SubLObject var7_107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                        module0528.f32915();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var7_107, var3);
                    }
                }
            }
            finally {
                module0012.$g59$.rebind(var42_107, var3);
                module0131.$g1538$.rebind(var7_106, var3);
            }
        }
        finally {
            module0018.$g61$.rebind(var6, var3);
            module0131.$g60$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23304(final SubLObject var1, final SubLObject var2) {
        module0322.f21821(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23305(final SubLObject var1, final SubLObject var2) {
        module0322.f21826(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23306(final SubLObject var1, final SubLObject var2) {
        module0322.f21823(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23307(final SubLObject var1, final SubLObject var2) {
        module0322.f21824(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23308() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23229", "DECACHE-AFTER-ADDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23230", "DECACHE-AFTER-REMOVINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23231", "DECACHE-RULE-AFTER-ADDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23232", "DECACHE-RULE-AFTER-REMOVINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23233", "CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23234", "S#25963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23235", "S#25964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23236", "CLEAR-GENLS-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23239", "CLEAR-ISA-DEPENDENT-CACHES", 2, 0, false);
        new $f23239$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23237", "S#25965", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23240", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23238", "S#25966", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23241", "CLEAR-GENL-PRED-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23242", "ADD-TRANSITIVE-VIA-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23243", "REMOVE-TRANSITIVE-VIA-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23244", "ADD-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23245", "REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23246", "CLEAR-CACHED-TVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23247", "CLEAR-CACHED-SOME-TVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23248", "CLEAR-CACHED-CVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23249", "CLEAR-CACHED-SOME-CVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23250", "SKOLEM-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23251", "ADD-OLD-CONSTANT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23252", "REMOVE-OLD-CONSTANT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23253", "PROPAGATE-TO-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23255", "PROPAGATE-TO-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23256", "PROPAGATE-TO-DISJOINTWITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23257", "PROPAGATE-TO-GENLMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23258", "PROPAGATE-TO-GENLPREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23259", "PROPAGATE-TO-NEGATIONPREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23260", "PROPAGATE-TO-GENLINVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23261", "PROPAGATE-TO-NEGATIONINVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23262", "PROPAGATE-INVERSE-TO-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23264", "PROPAGATE-INVERSE-TO-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23265", "PROPAGATE-INVERSE-TO-GENLMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23266", "PROPAGATE-INVERSE-TO-GENLPREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23267", "PROPAGATE-INVERSE-TO-GENLINVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23254", "S#25967", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23263", "S#25968", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23268", "ADD-IST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23269", "S#25969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23270", "ADD-TRUE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23272", "S#25970", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23273", "S#25971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23271", "S#25972", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23274", "ADD-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23276", "REMOVE-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23275", "S#25973", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23277", "S#25974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23278", "REMOVE-DEPENDENT-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23279", "ADD-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23280", "REMOVE-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23281", "ADD-ARITY-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23282", "REMOVE-ARITY-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23283", "ADD-ARITY-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23284", "REMOVE-ARITY-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23285", "INTER-ARG-ISA-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23286", "INTER-ARG-ISA-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23287", "INTER-ARG-FORMAT-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23288", "INTER-ARG-FORMAT-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23289", "ADD-TO-CONTRACTION-HT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23290", "REMOVE-FROM-CONTRACTION-HT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23291", "ADD-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23292", "REMOVE-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23293", "ADD-EXPANSION-AXIOM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23294", "CYC-ADD-REFORMULATION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23295", "CYC-REMOVE-REFORMULATION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23296", "CYC-ADD-ELEMENT-OF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23297", "CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23298", "CYC-ADD-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23299", "CYC-REMOVE-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23300", "ADD-MERGED-CONSTANT-GUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23301", "REMOVE-MERGED-CONSTANT-GUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23302", "CYC-EXCEPT-ADDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23303", "CYC-EXCEPT-REMOVED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23304", "ADD-RELATION-INSTANCE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23305", "REMOVE-RELATION-INSTANCE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23306", "ADD-RELATION-ALL-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0345", "f23307", "REMOVE-RELATION-ALL-INSTANCE", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23309() {
        $g2958$ = SubLFiles.deflexical("S#25975", (SubLObject)$ic0$);
        $g2959$ = SubLFiles.defparameter("S#25976", (SubLObject)NIL);
        $g2960$ = SubLFiles.defparameter("S#25977", (SubLObject)NIL);
        $g2961$ = SubLFiles.defparameter("S#25978", (SubLObject)NIL);
        $g2962$ = SubLFiles.defparameter("S#25979", (SubLObject)$ic54$);
        $g2963$ = SubLFiles.deflexical("S#25980", (NIL != Symbols.boundp((SubLObject)$ic55$)) ? $g2963$.getGlobalValue() : $ic56$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23310() {
        SubLObject var4 = $g2958$.getGlobalValue();
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            module0012.f416(var5);
            var4 = var4.rest();
            var5 = var4.first();
        }
        module0012.f416((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic3$);
        module0012.f416((SubLObject)$ic4$);
        module0012.f416((SubLObject)$ic5$);
        module0012.f416((SubLObject)$ic6$);
        module0012.f416((SubLObject)$ic7$);
        module0012.f416((SubLObject)$ic8$);
        module0012.f416((SubLObject)$ic9$);
        module0012.f416((SubLObject)$ic10$);
        module0012.f416((SubLObject)$ic11$);
        module0012.f416((SubLObject)$ic12$);
        module0012.f416((SubLObject)$ic13$);
        module0012.f416((SubLObject)$ic14$);
        module0012.f416((SubLObject)$ic15$);
        module0012.f416((SubLObject)$ic16$);
        module0012.f416((SubLObject)$ic17$);
        module0012.f416((SubLObject)$ic18$);
        module0012.f416((SubLObject)$ic19$);
        module0012.f416((SubLObject)$ic20$);
        module0012.f416((SubLObject)$ic21$);
        module0012.f416((SubLObject)$ic23$);
        module0012.f416((SubLObject)$ic25$);
        module0012.f416((SubLObject)$ic27$);
        module0012.f416((SubLObject)$ic29$);
        module0012.f416((SubLObject)$ic31$);
        module0012.f416((SubLObject)$ic33$);
        module0012.f416((SubLObject)$ic35$);
        module0012.f416((SubLObject)$ic37$);
        module0012.f416((SubLObject)$ic38$);
        module0012.f416((SubLObject)$ic39$);
        module0012.f416((SubLObject)$ic40$);
        module0012.f416((SubLObject)$ic41$);
        module0012.f416((SubLObject)$ic42$);
        module0012.f416((SubLObject)$ic48$);
        module0012.f416((SubLObject)$ic53$);
        module0003.f57((SubLObject)$ic55$);
        module0132.f8593((SubLObject)$ic55$, $ic57$);
        module0012.f416((SubLObject)$ic64$);
        module0012.f416((SubLObject)$ic65$);
        module0012.f416((SubLObject)$ic70$);
        module0012.f416((SubLObject)$ic71$);
        module0012.f416((SubLObject)$ic72$);
        module0012.f416((SubLObject)$ic73$);
        module0012.f416((SubLObject)$ic74$);
        module0012.f416((SubLObject)$ic75$);
        module0012.f416((SubLObject)$ic76$);
        module0012.f416((SubLObject)$ic77$);
        module0012.f416((SubLObject)$ic78$);
        module0012.f416((SubLObject)$ic79$);
        module0012.f416((SubLObject)$ic80$);
        module0012.f416((SubLObject)$ic81$);
        module0012.f416((SubLObject)$ic82$);
        module0012.f416((SubLObject)$ic83$);
        module0012.f416((SubLObject)$ic84$);
        module0012.f416((SubLObject)$ic93$);
        module0012.f416((SubLObject)$ic94$);
        module0012.f416((SubLObject)$ic95$);
        module0012.f416((SubLObject)$ic100$);
        module0012.f416((SubLObject)$ic101$);
        module0012.f416((SubLObject)$ic104$);
        module0012.f416((SubLObject)$ic105$);
        module0012.f416((SubLObject)$ic106$);
        module0012.f416((SubLObject)$ic107$);
        module0012.f416((SubLObject)$ic108$);
        module0012.f416((SubLObject)$ic109$);
        module0012.f416((SubLObject)$ic110$);
        module0012.f416((SubLObject)$ic111$);
        module0012.f416((SubLObject)$ic112$);
        module0012.f416((SubLObject)$ic113$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23308();
    }
    
    public void initializeVariables() {
        f23309();
    }
    
    public void runTopLevelForms() {
        f23310();
    }
    
    static {
        me = (SubLFile)new module0345();
        $g2958$ = null;
        $g2959$ = null;
        $g2960$ = null;
        $g2961$ = null;
        $g2962$ = null;
        $g2963$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("CLEAR-PARAPHRASE-CACHES"));
        $ic1$ = makeSymbol("ARGUMENT-P");
        $ic2$ = makeSymbol("DECACHE-AFTER-ADDINGS");
        $ic3$ = makeSymbol("DECACHE-AFTER-REMOVINGS");
        $ic4$ = makeSymbol("DECACHE-RULE-AFTER-ADDINGS");
        $ic5$ = makeSymbol("DECACHE-RULE-AFTER-REMOVINGS");
        $ic6$ = makeSymbol("CLEAR-MT-DEPENDENT-CACHES");
        $ic7$ = makeSymbol("CLEAR-GENLS-DEPENDENT-CACHES");
        $ic8$ = makeSymbol("CLEAR-ISA-DEPENDENT-CACHES");
        $ic9$ = makeSymbol("CLEAR-QUOTED-ISA-DEPENDENT-CACHES");
        $ic10$ = makeSymbol("CLEAR-GENL-PRED-DEPENDENT-CACHES");
        $ic11$ = makeSymbol("ADD-TRANSITIVE-VIA-ARG");
        $ic12$ = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG");
        $ic13$ = makeSymbol("ADD-TRANSITIVE-VIA-ARG-INVERSE");
        $ic14$ = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG-INVERSE");
        $ic15$ = makeSymbol("CLEAR-CACHED-TVA-CHECKS");
        $ic16$ = makeSymbol("CLEAR-CACHED-SOME-TVA-CHECKS");
        $ic17$ = makeSymbol("CLEAR-CACHED-CVA-CHECKS");
        $ic18$ = makeSymbol("CLEAR-CACHED-SOME-CVA-CHECKS");
        $ic19$ = makeSymbol("SKOLEM-AFTER-REMOVING");
        $ic20$ = makeSymbol("ADD-OLD-CONSTANT-NAME");
        $ic21$ = makeSymbol("REMOVE-OLD-CONSTANT-NAME");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic23$ = makeSymbol("PROPAGATE-TO-ISA");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic25$ = makeSymbol("PROPAGATE-TO-GENLS");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("disjointWith"));
        $ic27$ = makeSymbol("PROPAGATE-TO-DISJOINTWITH");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic29$ = makeSymbol("PROPAGATE-TO-GENLMT");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic31$ = makeSymbol("PROPAGATE-TO-GENLPREDS");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("negationPreds"));
        $ic33$ = makeSymbol("PROPAGATE-TO-NEGATIONPREDS");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic35$ = makeSymbol("PROPAGATE-TO-GENLINVERSE");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic37$ = makeSymbol("PROPAGATE-TO-NEGATIONINVERSE");
        $ic38$ = makeSymbol("PROPAGATE-INVERSE-TO-ISA");
        $ic39$ = makeSymbol("PROPAGATE-INVERSE-TO-GENLS");
        $ic40$ = makeSymbol("PROPAGATE-INVERSE-TO-GENLMT");
        $ic41$ = makeSymbol("PROPAGATE-INVERSE-TO-GENLPREDS");
        $ic42$ = makeSymbol("PROPAGATE-INVERSE-TO-GENLINVERSE");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic44$ = makeKeyword("GENLPREDS");
        $ic45$ = makeKeyword("MONOTONIC");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("S#25981", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic48$ = makeSymbol("ADD-IST");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("?FORMULA"));
        $ic51$ = makeKeyword("CODE");
        $ic52$ = makeSymbol("S#690", "CYC");
        $ic53$ = makeSymbol("ADD-TRUE-RULE");
        $ic54$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueRule")), (SubLObject)makeSymbol("?TEMPLATE"), (SubLObject)makeSymbol("?FORMULA")), (SubLObject)makeSymbol("?FORMULA"));
        $ic55$ = makeSymbol("S#25980", "CYC");
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("CoreCycLMt"));
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("trueRule"));
        $ic58$ = makeSymbol("FORT-P");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("ruleTemplateDirection"));
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("Forward-AssertionDirection"));
        $ic61$ = makeKeyword("FORWARD");
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("Backward-AssertionDirection"));
        $ic63$ = makeKeyword("BACKWARD");
        $ic64$ = makeSymbol("ADD-RULE-TEMPLATE-DIRECTION");
        $ic65$ = makeSymbol("REMOVE-RULE-TEMPLATE-DIRECTION");
        $ic66$ = makeKeyword("GAF");
        $ic67$ = makeKeyword("TRUE");
        $ic68$ = makeSymbol("DEDUCTION-P");
        $ic69$ = makeSymbol("S#25971", "CYC");
        $ic70$ = makeSymbol("REMOVE-DEPENDENT-TERM");
        $ic71$ = makeSymbol("ADD-ARITY");
        $ic72$ = makeSymbol("REMOVE-ARITY");
        $ic73$ = makeSymbol("ADD-ARITY-MIN");
        $ic74$ = makeSymbol("REMOVE-ARITY-MIN");
        $ic75$ = makeSymbol("ADD-ARITY-MAX");
        $ic76$ = makeSymbol("REMOVE-ARITY-MAX");
        $ic77$ = makeSymbol("INTER-ARG-ISA-AFTER-ADDING");
        $ic78$ = makeSymbol("INTER-ARG-ISA-AFTER-REMOVING");
        $ic79$ = makeSymbol("INTER-ARG-FORMAT-AFTER-ADDING");
        $ic80$ = makeSymbol("INTER-ARG-FORMAT-AFTER-REMOVING");
        $ic81$ = makeSymbol("ADD-TO-CONTRACTION-HT");
        $ic82$ = makeSymbol("REMOVE-FROM-CONTRACTION-HT");
        $ic83$ = makeSymbol("ADD-GEN-TEMPLATE-EXPANSION");
        $ic84$ = makeSymbol("REMOVE-GEN-TEMPLATE-EXPANSION");
        $ic85$ = makeSymbol("S#3302", "CYC");
        $ic86$ = constant_handles_oc.f8479((SubLObject)makeString("expansion"));
        $ic87$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("afterAdding")), constant_handles_oc.f8479((SubLObject)makeString("expansionAxiom")), (SubLObject)makeSymbol("ADD-EXPANSION-AXIOM"));
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("expansionAxiom"));
        $ic89$ = makeSymbol("S#12278", "CYC");
        $ic90$ = makeKeyword("CNF");
        $ic91$ = makeSymbol("NEG-LITS");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic93$ = makeSymbol("ADD-EXPANSION-AXIOM");
        $ic94$ = makeSymbol("CYC-ADD-REFORMULATION-ASSERTION");
        $ic95$ = makeSymbol("CYC-REMOVE-REFORMULATION-ASSERTION");
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("S#25982", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#25983", "CYC"));
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic98$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic99$ = ConsesLow.list((SubLObject)makeSymbol("S#19644", "CYC"), (SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#10996", "CYC"));
        $ic100$ = makeSymbol("CYC-ADD-ELEMENT-OF");
        $ic101$ = makeSymbol("CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES");
        $ic102$ = makeSymbol("S#11995", "CYC");
        $ic103$ = makeSymbol("S#12732", "CYC");
        $ic104$ = makeSymbol("CYC-ADD-KNOWN-ANTECEDENT-RULE");
        $ic105$ = makeSymbol("CYC-REMOVE-KNOWN-ANTECEDENT-RULE");
        $ic106$ = makeSymbol("ADD-MERGED-CONSTANT-GUID");
        $ic107$ = makeSymbol("REMOVE-MERGED-CONSTANT-GUID");
        $ic108$ = makeSymbol("CYC-EXCEPT-ADDED");
        $ic109$ = makeSymbol("CYC-EXCEPT-REMOVED");
        $ic110$ = makeSymbol("ADD-RELATION-INSTANCE-ALL");
        $ic111$ = makeSymbol("REMOVE-RELATION-INSTANCE-ALL");
        $ic112$ = makeSymbol("ADD-RELATION-ALL-INSTANCE");
        $ic113$ = makeSymbol("REMOVE-RELATION-ALL-INSTANCE");
    }
    
    public static final class $f23239$BinaryFunction extends BinaryFunction
    {
        public $f23239$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-ISA-DEPENDENT-CACHES"));
        }
        
        public SubLObject processItem(final SubLObject var8, final SubLObject var9) {
            return f23239(var8, var9);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 469 ms
	
	Decompiled with Procyon 0.5.32.
*/