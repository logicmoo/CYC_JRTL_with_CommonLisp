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
        assert module0345.NIL != module0191.f11910(var1) : var1;
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)module0345.ONE_INTEGER);
            module0343.f23199(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23230(final SubLObject var1, final SubLObject var2) {
        assert module0345.NIL != module0191.f11910(var1) : var1;
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)module0345.ONE_INTEGER);
            module0343.f23200(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23231(final SubLObject var1, final SubLObject var2) {
        assert module0345.NIL != module0191.f11910(var1) : var1;
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)module0345.ONE_INTEGER);
            module0344.f23220(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23232(final SubLObject var1, final SubLObject var2) {
        assert module0345.NIL != module0191.f11910(var1) : var1;
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)module0345.ONE_INTEGER);
            module0344.f23221(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23233(final SubLObject var1, final SubLObject var2) {
        return f23234(var1, var2);
    }
    
    public static SubLObject f23234(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0034.f1945()) {
            f23235(var1, var2);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23235(final SubLObject var1, final SubLObject var2) {
        module0262.f17359();
        module0263.f17417(var1, var2);
        module0264.f17444();
        module0258.f16769();
        module0318.f21444();
        SubLObject var3 = module0034.$g884$.getGlobalValue();
        SubLObject var4 = (SubLObject)module0345.NIL;
        var4 = var3.first();
        while (module0345.NIL != var3) {
            if (module0345.NIL != Symbols.fboundp(var4)) {
                Functions.funcall(var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23236(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0345.NIL == module0345.$g2959$.getDynamicValue(var3)) {
            final SubLObject var4 = module0345.$g2959$.currentBinding(var3);
            try {
                module0345.$g2959$.bind((SubLObject)module0345.T, var3);
                SubLObject var5 = module0034.$g887$.getGlobalValue();
                SubLObject var6 = (SubLObject)module0345.NIL;
                var6 = var5.first();
                while (module0345.NIL != var5) {
                    if (module0345.NIL != Symbols.fboundp(var6)) {
                        Functions.funcall(var6);
                    }
                    var5 = var5.rest();
                    var6 = var5.first();
                }
                f23237();
                f23238();
            }
            finally {
                module0345.$g2959$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23239(final SubLObject var1, final SubLObject var2) {
        f23237();
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23237() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (module0345.NIL == module0345.$g2960$.getDynamicValue(var6)) {
            final SubLObject var7 = module0345.$g2960$.currentBinding(var6);
            try {
                module0345.$g2960$.bind((SubLObject)module0345.T, var6);
                module0258.f16769();
                SubLObject var8 = module0034.$g889$.getGlobalValue();
                SubLObject var9 = (SubLObject)module0345.NIL;
                var9 = var8.first();
                while (module0345.NIL != var8) {
                    if (module0345.NIL != Symbols.fboundp(var9)) {
                        Functions.funcall(var9);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            finally {
                module0345.$g2960$.rebind(var7, var6);
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23240(final SubLObject var1, final SubLObject var2) {
        f23238();
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23238() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (module0345.NIL == module0345.$g2961$.getDynamicValue(var6)) {
            final SubLObject var7 = module0345.$g2961$.currentBinding(var6);
            try {
                module0345.$g2961$.bind((SubLObject)module0345.T, var6);
                SubLObject var8 = module0034.$g890$.getGlobalValue();
                SubLObject var9 = (SubLObject)module0345.NIL;
                var9 = var8.first();
                while (module0345.NIL != var8) {
                    if (module0345.NIL != Symbols.fboundp(var9)) {
                        Functions.funcall(var9);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            finally {
                module0345.$g2961$.rebind(var7, var6);
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23241(final SubLObject var1, final SubLObject var2) {
        module0264.f17444();
        module0318.f21444();
        SubLObject var3 = module0034.$g886$.getGlobalValue();
        SubLObject var4 = (SubLObject)module0345.NIL;
        var4 = var3.first();
        while (module0345.NIL != var3) {
            if (module0345.NIL != Symbols.fboundp(var4)) {
                Functions.funcall(var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23242(final SubLObject var1, final SubLObject var2) {
        module0322.f21801(var2);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23243(final SubLObject var1, final SubLObject var2) {
        module0322.f21804(var2);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23244(final SubLObject var1, final SubLObject var2) {
        module0322.f21803(var2);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23245(final SubLObject var1, final SubLObject var2) {
        module0322.f21805(var2);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23246(final SubLObject var1, final SubLObject var2) {
        module0318.f21444();
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23247(final SubLObject var1, final SubLObject var2) {
        module0318.f21444();
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23248(final SubLObject var1, final SubLObject var2) {
        module0318.f21447();
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23249(final SubLObject var1, final SubLObject var2) {
        module0318.f21447();
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23250(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0178.f11334(var2);
        if (module0345.NIL == module0123.f8350(var3)) {
            module0540.f33510(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23251(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)module0345.ONE_INTEGER);
            final SubLObject var4 = module0178.f11331(var2, (SubLObject)module0345.TWO_INTEGER);
            module0543.f33695(var4, var3);
            return (SubLObject)module0345.NIL;
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23252(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11331(var2, (SubLObject)module0345.ONE_INTEGER);
            final SubLObject var4 = module0178.f11331(var2, (SubLObject)module0345.TWO_INTEGER);
            module0543.f33696(var4, var3);
            return (SubLObject)module0345.NIL;
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23253(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic22$, var2);
    }
    
    public static SubLObject f23255(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic24$, var2);
    }
    
    public static SubLObject f23256(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic26$, var2);
    }
    
    public static SubLObject f23257(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic28$, var2);
    }
    
    public static SubLObject f23258(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic30$, var2);
    }
    
    public static SubLObject f23259(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic32$, var2);
    }
    
    public static SubLObject f23260(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic34$, var2);
    }
    
    public static SubLObject f23261(final SubLObject var1, final SubLObject var2) {
        return f23254(module0345.$ic36$, var2);
    }
    
    public static SubLObject f23262(final SubLObject var1, final SubLObject var2) {
        return f23263(module0345.$ic22$, var2);
    }
    
    public static SubLObject f23264(final SubLObject var1, final SubLObject var2) {
        return f23263(module0345.$ic24$, var2);
    }
    
    public static SubLObject f23265(final SubLObject var1, final SubLObject var2) {
        return f23263(module0345.$ic28$, var2);
    }
    
    public static SubLObject f23266(final SubLObject var1, final SubLObject var2) {
        return f23263(module0345.$ic30$, var2);
    }
    
    public static SubLObject f23267(final SubLObject var1, final SubLObject var2) {
        return f23263(module0345.$ic34$, var2);
    }
    
    public static SubLObject f23254(final SubLObject var13, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var14 = module0178.f11285(var2);
            final SubLObject var15 = module0178.f11287(var2);
            final SubLObject var16 = module0178.f11291(var2);
            if (module0202.f12839(var14, (SubLObject)module0345.UNPROVIDED).numE((SubLObject)module0345.TWO_INTEGER)) {
                SubLObject var18;
                final SubLObject var17 = var18 = var14;
                SubLObject var19 = (SubLObject)module0345.NIL;
                SubLObject var20 = (SubLObject)module0345.NIL;
                SubLObject var21 = (SubLObject)module0345.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0345.$ic43$);
                var19 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0345.$ic43$);
                var20 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0345.$ic43$);
                var21 = var18.first();
                var18 = var18.rest();
                if (module0345.NIL == var18) {
                    if (module0345.NIL != module0260.f17091(var19, var13, var15, (SubLObject)module0345.UNPROVIDED)) {
                        final SubLObject var22 = (SubLObject)ConsesLow.list(var13, var20, var21);
                        final SubLObject var23 = (SubLObject)ConsesLow.list(module0345.$ic30$, var19, var13);
                        final SubLObject var24 = module0538.f33420((SubLObject)module0345.$ic44$, var23, var15, (SubLObject)module0345.$ic45$);
                        final SubLObject var25 = (SubLObject)ConsesLow.list(var2, var24);
                        module0538.f33372(var22, var15, var25, var16, (SubLObject)module0345.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0345.$ic43$);
                }
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23263(final SubLObject var13, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var14 = module0178.f11285(var2);
            final SubLObject var15 = module0178.f11287(var2);
            final SubLObject var16 = module0178.f11291(var2);
            if (module0202.f12839(var14, (SubLObject)module0345.UNPROVIDED).numE((SubLObject)module0345.TWO_INTEGER)) {
                SubLObject var18;
                final SubLObject var17 = var18 = var14;
                SubLObject var19 = (SubLObject)module0345.NIL;
                SubLObject var20 = (SubLObject)module0345.NIL;
                SubLObject var21 = (SubLObject)module0345.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0345.$ic43$);
                var19 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0345.$ic43$);
                var20 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0345.$ic43$);
                var21 = var18.first();
                var18 = var18.rest();
                if (module0345.NIL == var18) {
                    if (module0345.NIL != module0260.f17094(var19, var13, var15, (SubLObject)module0345.UNPROVIDED)) {
                        final SubLObject var22 = (SubLObject)ConsesLow.list(var13, var21, var20);
                        final SubLObject var23 = (SubLObject)ConsesLow.list(module0345.$ic34$, var19, var13);
                        final SubLObject var24 = module0538.f33420((SubLObject)module0345.$ic44$, var23, var15, (SubLObject)module0345.$ic45$);
                        final SubLObject var25 = (SubLObject)ConsesLow.list(var2, var24);
                        module0538.f33372(var22, var15, var25, var16, (SubLObject)module0345.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0345.$ic43$);
                }
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23268(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13635(var2)) {
            final SubLObject var3 = module0538.f33478(var2, (SubLObject)module0345.UNPROVIDED);
            final SubLObject var4 = module0178.f11291(var2);
            SubLObject var6;
            final SubLObject var5 = var6 = var3;
            SubLObject var7 = (SubLObject)module0345.NIL;
            SubLObject var8 = (SubLObject)module0345.NIL;
            SubLObject var9 = (SubLObject)module0345.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0345.$ic46$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0345.$ic46$);
            var8 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0345.$ic46$);
            var9 = var6.first();
            var6 = var6.rest();
            if (module0345.NIL == var6) {
                if (var7.eql(module0345.$ic47$)) {
                    final SubLObject var10 = f23269(var8);
                    final SubLObject var11 = (SubLObject)ConsesLow.list(var10, var2);
                    module0538.f33372(var9, var8, var11, var4, (SubLObject)module0345.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0345.$ic46$);
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23269(final SubLObject var15) {
        final SubLObject var16 = (SubLObject)ConsesLow.listS(module0345.$ic49$, (SubLObject)ConsesLow.listS(module0345.$ic47$, var15, (SubLObject)module0345.$ic50$), (SubLObject)module0345.$ic50$);
        return module0538.f33420((SubLObject)module0345.$ic51$, var16, var15, (SubLObject)module0345.$ic45$);
    }
    
    public static SubLObject f23270(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var4 = module0178.f11287(var2);
            final SubLObject var5 = module0178.f11334(var2);
            final SubLObject var6 = module0178.f11335(var2);
            final SubLObject var7 = f23271(var5, var4);
            final SubLObject var8 = f23272();
            final SubLObject var9 = (SubLObject)ConsesLow.list(var8, var2);
            final SubLObject var10 = module0528.f32898();
            assert module0345.NIL != module0055.f4006(var10) : var10;
            final SubLObject var11 = module0131.$g1538$.currentBinding(var3);
            try {
                module0131.$g1538$.bind(var10, var3);
                module0538.f33372(var6, var4, var9, var7, (SubLObject)module0345.UNPROVIDED);
            }
            finally {
                module0131.$g1538$.rebind(var11, var3);
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23272() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0345.$g2962$.getDynamicValue(var6);
        return module0538.f33420((SubLObject)module0345.$ic51$, var7, module0345.$g2963$.getGlobalValue(), (SubLObject)module0345.$ic45$);
    }
    
    public static SubLObject f23273(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0345.NIL == module0174.f11035(var35) && module0345.$g2962$.getDynamicValue(var36).equal(module0191.f11969(var35)));
    }
    
    public static SubLObject f23271(final SubLObject var36, SubLObject var15) {
        if (var15 == module0345.UNPROVIDED) {
            var15 = (SubLObject)module0345.NIL;
        }
        assert module0345.NIL != module0173.f10955(var36) : var36;
        final SubLObject var38;
        final SubLObject var37 = var38 = module0220.f14557(var36, module0345.$ic59$, var15, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED);
        if (var38.eql(module0345.$ic60$)) {
            return (SubLObject)module0345.$ic61$;
        }
        if (var38.eql(module0345.$ic62$)) {
            return (SubLObject)module0345.$ic63$;
        }
        return (SubLObject)module0345.$ic63$;
    }
    
    public static SubLObject f23274(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11287(var2);
            final SubLObject var4 = module0178.f11334(var2);
            final SubLObject var5 = module0178.f11335(var2);
            final SubLObject var6 = f23275(var4, var3);
            final SubLObject var7 = var5;
            if (var7.eql(module0345.$ic60$)) {
                SubLObject var8 = var6;
                SubLObject var9 = (SubLObject)module0345.NIL;
                var9 = var8.first();
                while (module0345.NIL != var8) {
                    module0342.f23133(var9, (SubLObject)module0345.$ic61$);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
                module0528.f32921();
            }
            else if (var7.eql(module0345.$ic62$)) {
                SubLObject var8 = var6;
                SubLObject var9 = (SubLObject)module0345.NIL;
                var9 = var8.first();
                while (module0345.NIL != var8) {
                    module0342.f23133(var9, (SubLObject)module0345.$ic63$);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23276(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11287(var2);
            final SubLObject var4 = module0178.f11334(var2);
            SubLObject var6;
            final SubLObject var5 = var6 = f23275(var4, var3);
            SubLObject var7 = (SubLObject)module0345.NIL;
            var7 = var6.first();
            while (module0345.NIL != var6) {
                module0342.f23133(var7, (SubLObject)module0345.$ic63$);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23275(final SubLObject var31, SubLObject var15) {
        if (var15 == module0345.UNPROVIDED) {
            var15 = (SubLObject)module0345.NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0345.NIL;
        final SubLObject var34 = var15;
        final SubLObject var35 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind(module0147.f9531(var34), var32);
            module0147.$g2095$.bind(module0147.f9534(var34), var32);
            final SubLObject var37 = module0345.$ic57$;
            if (module0345.NIL != module0158.f10010(var31, (SubLObject)module0345.ONE_INTEGER, var37)) {
                final SubLObject var38 = module0158.f10011(var31, (SubLObject)module0345.ONE_INTEGER, var37);
                SubLObject var39 = (SubLObject)module0345.NIL;
                final SubLObject var40 = (SubLObject)module0345.NIL;
                while (module0345.NIL == var39) {
                    final SubLObject var41 = module0052.f3695(var38, var40);
                    final SubLObject var42 = (SubLObject)SubLObjectFactory.makeBoolean(!var40.eql(var41));
                    if (module0345.NIL != var42) {
                        SubLObject var43 = (SubLObject)module0345.NIL;
                        try {
                            var43 = module0158.f10316(var41, (SubLObject)module0345.$ic66$, (SubLObject)module0345.$ic67$, (SubLObject)module0345.NIL);
                            SubLObject var45_50 = (SubLObject)module0345.NIL;
                            final SubLObject var46_51 = (SubLObject)module0345.NIL;
                            while (module0345.NIL == var45_50) {
                                final SubLObject var44 = module0052.f3695(var43, var46_51);
                                final SubLObject var48_53 = (SubLObject)SubLObjectFactory.makeBoolean(!var46_51.eql(var44));
                                if (module0345.NIL != var48_53) {
                                    final SubLObject var45 = module0178.f11300(var44);
                                    SubLObject var46;
                                    SubLObject var47;
                                    SubLObject var48;
                                    for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0345.NIL, var47 = module0032.f1742(var46, var45); module0345.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                        var48 = module0032.f1745(var46, var47);
                                        if (module0345.NIL != module0032.f1746(var47, var48) && module0345.NIL != f23277(var48)) {
                                            var33 = (SubLObject)ConsesLow.cons(module0188.f11781(var48), var33);
                                        }
                                    }
                                }
                                var45_50 = (SubLObject)SubLObjectFactory.makeBoolean(module0345.NIL == var48_53);
                            }
                        }
                        finally {
                            final SubLObject var7_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0345.T, var32);
                                if (module0345.NIL != var43) {
                                    module0158.f10319(var43);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_58, var32);
                            }
                        }
                    }
                    var39 = (SubLObject)SubLObjectFactory.makeBoolean(module0345.NIL == var42);
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
        assert module0345.NIL != module0184.f11659(var57) : var57;
        return Sequences.find_if(Symbols.symbol_function((SubLObject)module0345.$ic69$), module0188.f11770(var57), (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED);
    }
    
    public static SubLObject f23278(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            if (module0345.NIL != module0173.f10955(var3) && module0345.NIL == module0123.f8350(var3)) {
                final SubLObject var4 = module0178.f11335(var2);
                if (module0345.NIL != module0173.f10955(var4) && module0345.NIL != module0123.f8350(var4)) {
                    return module0540.f33510(var3);
                }
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23279(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13635(var2) && module0345.NIL != module0178.f11373(var2, var1)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14749(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23280(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL == module0226.f15088(var2, (SubLObject)module0345.$ic67$)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14750(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23281(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13635(var2) && module0345.NIL != module0178.f11373(var2, var1)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14760(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23282(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL == module0226.f15088(var2, (SubLObject)module0345.$ic67$)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0225.f14761(var3);
        }
        return var2;
    }
    
    public static SubLObject f23283(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13635(var2) && module0345.NIL != module0178.f11373(var2, var1)) {
            final SubLObject var3 = module0178.f11334(var2);
            final SubLObject var4 = module0178.f11335(var2);
            module0225.f14771(var3, var4);
        }
        return var2;
    }
    
    public static SubLObject f23284(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL == module0226.f15088(var2, (SubLObject)module0345.$ic67$)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0225.f14772(var3);
        }
        return var2;
    }
    
    public static SubLObject f23285(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20177(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23286(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20178(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23287(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20185(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23288(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13638(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            module0303.f20186(var3);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23289(final SubLObject var1, final SubLObject var2) {
        return module0277.f18380(var2);
    }
    
    public static SubLObject f23290(final SubLObject var1, final SubLObject var2) {
        return module0277.f18382(var2);
    }
    
    public static SubLObject f23291(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            if (module0345.NIL != module0762.f48211(var3, (SubLObject)module0345.UNPROVIDED)) {
                module0763.f48253(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f23292(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0178.f11284(var2)) {
            final SubLObject var3 = module0178.f11334(var2);
            if (module0345.NIL != module0762.f48211(var3, (SubLObject)module0345.UNPROVIDED)) {
                module0763.f48253(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f23293(final SubLObject var1, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (module0345.NIL == module0004.f104(var1, module0178.f11299(var66), (SubLObject)module0345.$ic85$, (SubLObject)module0345.UNPROVIDED) && module0345.NIL != module0211.f13635(var66)) {
            final SubLObject var68 = module0178.f11334(var66);
            final SubLObject var69 = module0178.f11335(var66);
            final SubLObject var70 = module0178.f11287(var69);
            if (module0345.NIL == module0220.f14557(var68, module0345.$ic86$, var70, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED)) {
                final SubLObject var71 = module0279.f18490((SubLObject)module0345.$ic87$, var70);
                SubLObject var72 = (SubLObject)module0345.T;
                if (module0345.NIL != var71) {
                    final SubLObject var73 = module0289.f19396(var69);
                    final SubLObject var74 = Sequences.remove(var69, module0220.f14566(var68, module0345.$ic88$, var70, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED), (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED);
                    SubLObject var75 = (SubLObject)module0345.NIL;
                    SubLObject var76 = (SubLObject)module0345.NIL;
                    if (module0345.NIL != var74) {
                        SubLObject var77 = (SubLObject)module0345.NIL;
                        if (module0345.NIL == var77) {
                            SubLObject var78;
                            SubLObject var79;
                            for (var78 = var74, var79 = (SubLObject)module0345.NIL, var79 = var78.first(); module0345.NIL == var77 && module0345.NIL != var78; var77 = (SubLObject)SubLObjectFactory.makeBoolean(!var73.equal(module0289.f19396(var79))), var78 = var78.rest(), var79 = var78.first()) {}
                        }
                        var72 = (SubLObject)SubLObjectFactory.makeBoolean(module0345.NIL == var77);
                    }
                    if (module0345.NIL != var72) {
                        final SubLObject var80 = module0147.$g2094$.currentBinding(var67);
                        final SubLObject var81 = module0147.$g2095$.currentBinding(var67);
                        try {
                            module0147.$g2094$.bind((SubLObject)module0345.$ic89$, var67);
                            module0147.$g2095$.bind(var70, var67);
                            module0274.f18061();
                            var75 = module0282.f18745(var73, var70, (SubLObject)module0345.$ic90$);
                        }
                        finally {
                            module0147.$g2095$.rebind(var81, var67);
                            module0147.$g2094$.rebind(var80, var67);
                        }
                        if (var75.isList() && module0345.NIL != module0035.f1997(Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0345.$ic91$), var75), Symbols.symbol_function((SubLObject)module0345.EQUAL), (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED))) {
                            SubLObject var82 = (SubLObject)module0345.NIL;
                            SubLObject var83 = (SubLObject)module0345.NIL;
                            final SubLObject var84 = var75.first();
                            final SubLObject var85 = module0232.f15306(var84);
                            if (module0345.NIL == var82) {
                                SubLObject var86 = var85;
                                SubLObject var87 = (SubLObject)module0345.NIL;
                                var87 = var86.first();
                                while (module0345.NIL == var82 && module0345.NIL != var86) {
                                    if (var68.eql(module0202.f12833(var87, (SubLObject)module0345.UNPROVIDED))) {
                                        SubLObject var88 = (SubLObject)module0345.ZERO_INTEGER;
                                        SubLObject var89 = (SubLObject)module0345.NIL;
                                        if (module0345.NIL == var89) {
                                            SubLObject var74_83 = module0202.f12829(var87, (SubLObject)module0345.UNPROVIDED);
                                            SubLObject var90 = (SubLObject)module0345.NIL;
                                            var90 = var74_83.first();
                                            while (module0345.NIL == var89 && module0345.NIL != var74_83) {
                                                var88 = Numbers.add(var88, (SubLObject)module0345.ONE_INTEGER);
                                                if (module0345.NIL != module0201.f12546(var90)) {
                                                    var83 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var90, module0303.f20123(var88)), var83);
                                                }
                                                else {
                                                    var89 = (SubLObject)module0345.T;
                                                }
                                                var74_83 = var74_83.rest();
                                                var90 = var74_83.first();
                                            }
                                        }
                                        if (module0345.NIL == var89) {
                                            var82 = var87;
                                        }
                                    }
                                    var86 = var86.rest();
                                    var87 = var86.first();
                                }
                            }
                            if (module0345.NIL != var82 && module0345.NIL != var83) {
                                final SubLObject var91 = module0152.$g2121$.currentBinding(var67);
                                try {
                                    module0152.$g2121$.bind((SubLObject)module0345.T, var67);
                                    final SubLObject var7_85 = module0147.$g2094$.currentBinding(var67);
                                    final SubLObject var92 = module0147.$g2095$.currentBinding(var67);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)module0345.$ic89$, var67);
                                        module0147.$g2095$.bind(var70, var67);
                                        var76 = module0276.f18293(conses_high.sublis(var83, conses_high.subst(module0345.$ic92$, var82, var73, Symbols.symbol_function((SubLObject)module0345.EQUAL), (SubLObject)module0345.UNPROVIDED), (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED), (SubLObject)module0345.UNPROVIDED);
                                    }
                                    finally {
                                        module0147.$g2095$.rebind(var92, var67);
                                        module0147.$g2094$.rebind(var7_85, var67);
                                    }
                                    if (module0345.NIL != module0202.f12590(var76) && module0345.NIL != module0274.f18060(var76, var70, (SubLObject)module0345.UNPROVIDED) && module0345.NIL == module0035.f2428(var68, var76, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED)) {
                                        module0538.f33372((SubLObject)ConsesLow.list(module0345.$ic86$, var68, var76), var70, (SubLObject)ConsesLow.list(var66, var71), (SubLObject)module0345.$ic61$, (SubLObject)module0345.T);
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
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23294(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0291.f19546() && module0345.NIL != module0291.f19562(var2)) {
            module0291.f19565(var2);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23295(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0291.f19546()) {
            module0291.f19567(var2);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23296(final SubLObject var1, final SubLObject var2) {
        if (module0345.NIL != module0211.f13635(var2)) {
            final SubLObject var3 = module0538.f33478(var2, (SubLObject)module0345.UNPROVIDED);
            final SubLObject var4 = module0178.f11287(var2);
            SubLObject var6;
            final SubLObject var5 = var6 = var3;
            SubLObject var7 = (SubLObject)module0345.NIL;
            SubLObject var8 = (SubLObject)module0345.NIL;
            SubLObject var9 = (SubLObject)module0345.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0345.$ic96$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0345.$ic96$);
            var8 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0345.$ic96$);
            var9 = var6.first();
            var6 = var6.rest();
            if (module0345.NIL == var6) {
                if (var7.eql(module0345.$ic97$) && module0345.NIL != module0202.f12589(var9, module0345.$ic98$)) {
                    SubLObject var93_94;
                    final SubLObject var91_92 = var93_94 = var9;
                    SubLObject var10 = (SubLObject)module0345.NIL;
                    SubLObject var11 = (SubLObject)module0345.NIL;
                    SubLObject var12 = (SubLObject)module0345.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)module0345.$ic99$);
                    var10 = var93_94.first();
                    var93_94 = var93_94.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)module0345.$ic99$);
                    var11 = var93_94.first();
                    var93_94 = var93_94.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)module0345.$ic99$);
                    var12 = var93_94.first();
                    var93_94 = var93_94.rest();
                    if (module0345.NIL == var93_94) {
                        final SubLObject var13 = module0205.f13250(var8, var11, var12, (SubLObject)module0345.UNPROVIDED, (SubLObject)module0345.UNPROVIDED);
                        module0538.f33372(var13, var4, (SubLObject)ConsesLow.list(var2), (SubLObject)module0345.$ic61$, (SubLObject)module0345.T);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var91_92, (SubLObject)module0345.$ic99$);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0345.$ic96$);
            }
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23297(final SubLObject var1, final SubLObject var2) {
        module0610.f37212();
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23298(final SubLObject var1, final SubLObject var2) {
        assert module0345.NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        assert module0345.NIL != module0178.f11290(var3) : var3;
        module0508.f32426(var3, (SubLObject)module0345.T);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23299(final SubLObject var1, final SubLObject var2) {
        assert module0345.NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        assert module0345.NIL != module0178.f11290(var3) : var3;
        module0508.f32429(var3, (SubLObject)module0345.T);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23300(final SubLObject var1, final SubLObject var2) {
        assert module0345.NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        final SubLObject var4 = module0178.f11335(var2);
        final SubLObject var5 = Guids.string_to_guid(var4);
        if (module0345.NIL != module0128.f8449(var3)) {
            module0165.f10727(var3, var5);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23301(final SubLObject var1, final SubLObject var2) {
        assert module0345.NIL != module0178.f11284(var2) : var2;
        final SubLObject var3 = module0178.f11334(var2);
        final SubLObject var4 = module0178.f11335(var2);
        final SubLObject var5 = Guids.string_to_guid(var4);
        if (module0345.NIL != module0128.f8449(var3)) {
            module0165.f10728(var3, var5);
        }
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23302(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0178.f11334(var2);
        final SubLObject var5 = module0178.f11300(var4);
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = module0032.f1741(var5), var7 = (SubLObject)module0345.NIL, var7 = module0032.f1742(var6, var5); module0345.NIL == module0032.f1744(var6, var7); var7 = module0032.f1743(var7)) {
            var8 = module0032.f1745(var6, var7);
            if (module0345.NIL != module0032.f1746(var7, var8)) {
                module0342.f23153(var8);
            }
        }
        final SubLObject var9 = module0131.$g60$.currentBinding(var3);
        final SubLObject var10 = module0018.$g61$.currentBinding(var3);
        try {
            module0131.$g60$.bind((SubLObject)module0345.NIL, var3);
            module0018.$g61$.bind((SubLObject)module0345.NIL, var3);
            final SubLObject var11 = module0528.f32898();
            assert module0345.NIL != module0055.f4006(var11) : var11;
            final SubLObject var7_103 = module0131.$g1538$.currentBinding(var3);
            final SubLObject var42_104 = module0012.$g59$.currentBinding(var3);
            try {
                module0131.$g1538$.bind(var11, var3);
                module0012.$g59$.bind((SubLObject)module0345.NIL, var3);
                try {
                    module0528.f32923(var4, (SubLObject)module0345.UNPROVIDED);
                }
                finally {
                    final SubLObject var7_104 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0345.T, var3);
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
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23303(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0178.f11334(var2);
        final SubLObject var5 = module0131.$g60$.currentBinding(var3);
        final SubLObject var6 = module0018.$g61$.currentBinding(var3);
        try {
            module0131.$g60$.bind((SubLObject)module0345.NIL, var3);
            module0018.$g61$.bind((SubLObject)module0345.NIL, var3);
            final SubLObject var7 = module0528.f32898();
            assert module0345.NIL != module0055.f4006(var7) : var7;
            final SubLObject var7_106 = module0131.$g1538$.currentBinding(var3);
            final SubLObject var42_107 = module0012.$g59$.currentBinding(var3);
            try {
                module0131.$g1538$.bind(var7, var3);
                module0012.$g59$.bind((SubLObject)module0345.NIL, var3);
                try {
                    module0528.f32923(var4, (SubLObject)module0345.UNPROVIDED);
                }
                finally {
                    final SubLObject var7_107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0345.T, var3);
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
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23304(final SubLObject var1, final SubLObject var2) {
        module0322.f21821(var2);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23305(final SubLObject var1, final SubLObject var2) {
        module0322.f21826(var2);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23306(final SubLObject var1, final SubLObject var2) {
        module0322.f21823(var2);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23307(final SubLObject var1, final SubLObject var2) {
        module0322.f21824(var2);
        return (SubLObject)module0345.NIL;
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
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23309() {
        module0345.$g2958$ = SubLFiles.deflexical("S#25975", (SubLObject)module0345.$ic0$);
        module0345.$g2959$ = SubLFiles.defparameter("S#25976", (SubLObject)module0345.NIL);
        module0345.$g2960$ = SubLFiles.defparameter("S#25977", (SubLObject)module0345.NIL);
        module0345.$g2961$ = SubLFiles.defparameter("S#25978", (SubLObject)module0345.NIL);
        module0345.$g2962$ = SubLFiles.defparameter("S#25979", (SubLObject)module0345.$ic54$);
        module0345.$g2963$ = SubLFiles.deflexical("S#25980", (module0345.NIL != Symbols.boundp((SubLObject)module0345.$ic55$)) ? module0345.$g2963$.getGlobalValue() : module0345.$ic56$);
        return (SubLObject)module0345.NIL;
    }
    
    public static SubLObject f23310() {
        SubLObject var4 = module0345.$g2958$.getGlobalValue();
        SubLObject var5 = (SubLObject)module0345.NIL;
        var5 = var4.first();
        while (module0345.NIL != var4) {
            module0012.f416(var5);
            var4 = var4.rest();
            var5 = var4.first();
        }
        module0012.f416((SubLObject)module0345.$ic2$);
        module0012.f416((SubLObject)module0345.$ic3$);
        module0012.f416((SubLObject)module0345.$ic4$);
        module0012.f416((SubLObject)module0345.$ic5$);
        module0012.f416((SubLObject)module0345.$ic6$);
        module0012.f416((SubLObject)module0345.$ic7$);
        module0012.f416((SubLObject)module0345.$ic8$);
        module0012.f416((SubLObject)module0345.$ic9$);
        module0012.f416((SubLObject)module0345.$ic10$);
        module0012.f416((SubLObject)module0345.$ic11$);
        module0012.f416((SubLObject)module0345.$ic12$);
        module0012.f416((SubLObject)module0345.$ic13$);
        module0012.f416((SubLObject)module0345.$ic14$);
        module0012.f416((SubLObject)module0345.$ic15$);
        module0012.f416((SubLObject)module0345.$ic16$);
        module0012.f416((SubLObject)module0345.$ic17$);
        module0012.f416((SubLObject)module0345.$ic18$);
        module0012.f416((SubLObject)module0345.$ic19$);
        module0012.f416((SubLObject)module0345.$ic20$);
        module0012.f416((SubLObject)module0345.$ic21$);
        module0012.f416((SubLObject)module0345.$ic23$);
        module0012.f416((SubLObject)module0345.$ic25$);
        module0012.f416((SubLObject)module0345.$ic27$);
        module0012.f416((SubLObject)module0345.$ic29$);
        module0012.f416((SubLObject)module0345.$ic31$);
        module0012.f416((SubLObject)module0345.$ic33$);
        module0012.f416((SubLObject)module0345.$ic35$);
        module0012.f416((SubLObject)module0345.$ic37$);
        module0012.f416((SubLObject)module0345.$ic38$);
        module0012.f416((SubLObject)module0345.$ic39$);
        module0012.f416((SubLObject)module0345.$ic40$);
        module0012.f416((SubLObject)module0345.$ic41$);
        module0012.f416((SubLObject)module0345.$ic42$);
        module0012.f416((SubLObject)module0345.$ic48$);
        module0012.f416((SubLObject)module0345.$ic53$);
        module0003.f57((SubLObject)module0345.$ic55$);
        module0132.f8593((SubLObject)module0345.$ic55$, module0345.$ic57$);
        module0012.f416((SubLObject)module0345.$ic64$);
        module0012.f416((SubLObject)module0345.$ic65$);
        module0012.f416((SubLObject)module0345.$ic70$);
        module0012.f416((SubLObject)module0345.$ic71$);
        module0012.f416((SubLObject)module0345.$ic72$);
        module0012.f416((SubLObject)module0345.$ic73$);
        module0012.f416((SubLObject)module0345.$ic74$);
        module0012.f416((SubLObject)module0345.$ic75$);
        module0012.f416((SubLObject)module0345.$ic76$);
        module0012.f416((SubLObject)module0345.$ic77$);
        module0012.f416((SubLObject)module0345.$ic78$);
        module0012.f416((SubLObject)module0345.$ic79$);
        module0012.f416((SubLObject)module0345.$ic80$);
        module0012.f416((SubLObject)module0345.$ic81$);
        module0012.f416((SubLObject)module0345.$ic82$);
        module0012.f416((SubLObject)module0345.$ic83$);
        module0012.f416((SubLObject)module0345.$ic84$);
        module0012.f416((SubLObject)module0345.$ic93$);
        module0012.f416((SubLObject)module0345.$ic94$);
        module0012.f416((SubLObject)module0345.$ic95$);
        module0012.f416((SubLObject)module0345.$ic100$);
        module0012.f416((SubLObject)module0345.$ic101$);
        module0012.f416((SubLObject)module0345.$ic104$);
        module0012.f416((SubLObject)module0345.$ic105$);
        module0012.f416((SubLObject)module0345.$ic106$);
        module0012.f416((SubLObject)module0345.$ic107$);
        module0012.f416((SubLObject)module0345.$ic108$);
        module0012.f416((SubLObject)module0345.$ic109$);
        module0012.f416((SubLObject)module0345.$ic110$);
        module0012.f416((SubLObject)module0345.$ic111$);
        module0012.f416((SubLObject)module0345.$ic112$);
        module0012.f416((SubLObject)module0345.$ic113$);
        return (SubLObject)module0345.NIL;
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
        module0345.$g2958$ = null;
        module0345.$g2959$ = null;
        module0345.$g2960$ = null;
        module0345.$g2961$ = null;
        module0345.$g2962$ = null;
        module0345.$g2963$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-PARAPHRASE-CACHES"));
        $ic1$ = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $ic2$ = SubLObjectFactory.makeSymbol("DECACHE-AFTER-ADDINGS");
        $ic3$ = SubLObjectFactory.makeSymbol("DECACHE-AFTER-REMOVINGS");
        $ic4$ = SubLObjectFactory.makeSymbol("DECACHE-RULE-AFTER-ADDINGS");
        $ic5$ = SubLObjectFactory.makeSymbol("DECACHE-RULE-AFTER-REMOVINGS");
        $ic6$ = SubLObjectFactory.makeSymbol("CLEAR-MT-DEPENDENT-CACHES");
        $ic7$ = SubLObjectFactory.makeSymbol("CLEAR-GENLS-DEPENDENT-CACHES");
        $ic8$ = SubLObjectFactory.makeSymbol("CLEAR-ISA-DEPENDENT-CACHES");
        $ic9$ = SubLObjectFactory.makeSymbol("CLEAR-QUOTED-ISA-DEPENDENT-CACHES");
        $ic10$ = SubLObjectFactory.makeSymbol("CLEAR-GENL-PRED-DEPENDENT-CACHES");
        $ic11$ = SubLObjectFactory.makeSymbol("ADD-TRANSITIVE-VIA-ARG");
        $ic12$ = SubLObjectFactory.makeSymbol("REMOVE-TRANSITIVE-VIA-ARG");
        $ic13$ = SubLObjectFactory.makeSymbol("ADD-TRANSITIVE-VIA-ARG-INVERSE");
        $ic14$ = SubLObjectFactory.makeSymbol("REMOVE-TRANSITIVE-VIA-ARG-INVERSE");
        $ic15$ = SubLObjectFactory.makeSymbol("CLEAR-CACHED-TVA-CHECKS");
        $ic16$ = SubLObjectFactory.makeSymbol("CLEAR-CACHED-SOME-TVA-CHECKS");
        $ic17$ = SubLObjectFactory.makeSymbol("CLEAR-CACHED-CVA-CHECKS");
        $ic18$ = SubLObjectFactory.makeSymbol("CLEAR-CACHED-SOME-CVA-CHECKS");
        $ic19$ = SubLObjectFactory.makeSymbol("SKOLEM-AFTER-REMOVING");
        $ic20$ = SubLObjectFactory.makeSymbol("ADD-OLD-CONSTANT-NAME");
        $ic21$ = SubLObjectFactory.makeSymbol("REMOVE-OLD-CONSTANT-NAME");
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic23$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-ISA");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic25$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLS");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $ic27$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-DISJOINTWITH");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic29$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLMT");
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic31$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLPREDS");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic33$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-NEGATIONPREDS");
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic35$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLINVERSE");
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic37$ = SubLObjectFactory.makeSymbol("PROPAGATE-TO-NEGATIONINVERSE");
        $ic38$ = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-ISA");
        $ic39$ = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLS");
        $ic40$ = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLMT");
        $ic41$ = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLPREDS");
        $ic42$ = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLINVERSE");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"));
        $ic44$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic45$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25981", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic48$ = SubLObjectFactory.makeSymbol("ADD-IST");
        $ic49$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $ic51$ = SubLObjectFactory.makeKeyword("CODE");
        $ic52$ = SubLObjectFactory.makeSymbol("S#690", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("ADD-TRUE-RULE");
        $ic54$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueRule")), (SubLObject)SubLObjectFactory.makeSymbol("?TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $ic55$ = SubLObjectFactory.makeSymbol("S#25980", "CYC");
        $ic56$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CoreCycLMt"));
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueRule"));
        $ic58$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic59$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ruleTemplateDirection"));
        $ic60$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Forward-AssertionDirection"));
        $ic61$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic62$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Backward-AssertionDirection"));
        $ic63$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic64$ = SubLObjectFactory.makeSymbol("ADD-RULE-TEMPLATE-DIRECTION");
        $ic65$ = SubLObjectFactory.makeSymbol("REMOVE-RULE-TEMPLATE-DIRECTION");
        $ic66$ = SubLObjectFactory.makeKeyword("GAF");
        $ic67$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic68$ = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $ic69$ = SubLObjectFactory.makeSymbol("S#25971", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("REMOVE-DEPENDENT-TERM");
        $ic71$ = SubLObjectFactory.makeSymbol("ADD-ARITY");
        $ic72$ = SubLObjectFactory.makeSymbol("REMOVE-ARITY");
        $ic73$ = SubLObjectFactory.makeSymbol("ADD-ARITY-MIN");
        $ic74$ = SubLObjectFactory.makeSymbol("REMOVE-ARITY-MIN");
        $ic75$ = SubLObjectFactory.makeSymbol("ADD-ARITY-MAX");
        $ic76$ = SubLObjectFactory.makeSymbol("REMOVE-ARITY-MAX");
        $ic77$ = SubLObjectFactory.makeSymbol("INTER-ARG-ISA-AFTER-ADDING");
        $ic78$ = SubLObjectFactory.makeSymbol("INTER-ARG-ISA-AFTER-REMOVING");
        $ic79$ = SubLObjectFactory.makeSymbol("INTER-ARG-FORMAT-AFTER-ADDING");
        $ic80$ = SubLObjectFactory.makeSymbol("INTER-ARG-FORMAT-AFTER-REMOVING");
        $ic81$ = SubLObjectFactory.makeSymbol("ADD-TO-CONTRACTION-HT");
        $ic82$ = SubLObjectFactory.makeSymbol("REMOVE-FROM-CONTRACTION-HT");
        $ic83$ = SubLObjectFactory.makeSymbol("ADD-GEN-TEMPLATE-EXPANSION");
        $ic84$ = SubLObjectFactory.makeSymbol("REMOVE-GEN-TEMPLATE-EXPANSION");
        $ic85$ = SubLObjectFactory.makeSymbol("S#3302", "CYC");
        $ic86$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("expansion"));
        $ic87$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("afterAdding")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("expansionAxiom")), (SubLObject)SubLObjectFactory.makeSymbol("ADD-EXPANSION-AXIOM"));
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("expansionAxiom"));
        $ic89$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic90$ = SubLObjectFactory.makeKeyword("CNF");
        $ic91$ = SubLObjectFactory.makeSymbol("NEG-LITS");
        $ic92$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic93$ = SubLObjectFactory.makeSymbol("ADD-EXPANSION-AXIOM");
        $ic94$ = SubLObjectFactory.makeSymbol("CYC-ADD-REFORMULATION-ASSERTION");
        $ic95$ = SubLObjectFactory.makeSymbol("CYC-REMOVE-REFORMULATION-ASSERTION");
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25982", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25983", "CYC"));
        $ic97$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $ic98$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#19644", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10996", "CYC"));
        $ic100$ = SubLObjectFactory.makeSymbol("CYC-ADD-ELEMENT-OF");
        $ic101$ = SubLObjectFactory.makeSymbol("CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES");
        $ic102$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("CYC-ADD-KNOWN-ANTECEDENT-RULE");
        $ic105$ = SubLObjectFactory.makeSymbol("CYC-REMOVE-KNOWN-ANTECEDENT-RULE");
        $ic106$ = SubLObjectFactory.makeSymbol("ADD-MERGED-CONSTANT-GUID");
        $ic107$ = SubLObjectFactory.makeSymbol("REMOVE-MERGED-CONSTANT-GUID");
        $ic108$ = SubLObjectFactory.makeSymbol("CYC-EXCEPT-ADDED");
        $ic109$ = SubLObjectFactory.makeSymbol("CYC-EXCEPT-REMOVED");
        $ic110$ = SubLObjectFactory.makeSymbol("ADD-RELATION-INSTANCE-ALL");
        $ic111$ = SubLObjectFactory.makeSymbol("REMOVE-RELATION-INSTANCE-ALL");
        $ic112$ = SubLObjectFactory.makeSymbol("ADD-RELATION-ALL-INSTANCE");
        $ic113$ = SubLObjectFactory.makeSymbol("REMOVE-RELATION-ALL-INSTANCE");
    }
    
    public static final class $f23239$BinaryFunction extends BinaryFunction
    {
        public $f23239$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-ISA-DEPENDENT-CACHES"));
        }
        
        public SubLObject processItem(final SubLObject var8, final SubLObject var9) {
            return module0345.f23239(var8, var9);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0345.class
	Total time: 469 ms
	
	Decompiled with Procyon 0.5.32.
*/