package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0525 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0525";
    public static final String myFingerPrint = "64150b517921aafc03ccb194e35b4ab97cd7d32f26e125dd32752486080fcc6b";
    private static SubLSymbol $g3860$;
    private static SubLSymbol $g3861$;
    private static SubLSymbol $g3862$;
    private static SubLSymbol $g3863$;
    private static SubLSymbol $g3864$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
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
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    
    public static SubLObject f32677(final SubLObject var1, final SubLObject var2) {
        if (!var1.eql(var2)) {
            final SubLObject var3 = (SubLObject)ConsesLow.list(module0525.$ic0$, var1, var2);
            final SubLObject var4 = module0191.f11990((SubLObject)module0525.$ic1$, var3, (SubLObject)module0525.UNPROVIDED, (SubLObject)module0525.UNPROVIDED);
            final SubLObject var5 = (SubLObject)ConsesLow.list(var4);
            return var5;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32678(final SubLObject var6, final SubLObject var7) {
        if (!var6.eql(var7)) {
            final SubLObject var8 = (SubLObject)ConsesLow.list(module0525.$ic2$, var6, var7);
            final SubLObject var9 = module0191.f11990((SubLObject)module0525.$ic3$, var8, module0132.$g1548$.getGlobalValue(), (SubLObject)module0525.UNPROVIDED);
            final SubLObject var10 = (SubLObject)ConsesLow.list(var9);
            return var10;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32679(final SubLObject var8, final SubLObject var9) {
        if (!var8.eql(var9)) {
            final SubLObject var10 = (SubLObject)ConsesLow.list(module0525.$ic4$, var8, var9);
            final SubLObject var11 = module0191.f11990((SubLObject)module0525.$ic5$, var10, (SubLObject)module0525.UNPROVIDED, (SubLObject)module0525.UNPROVIDED);
            final SubLObject var12 = (SubLObject)ConsesLow.list(var11);
            return var12;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32680(final SubLObject var8, final SubLObject var10) {
        if (!var8.eql(var10)) {
            final SubLObject var11 = (SubLObject)ConsesLow.list(module0525.$ic6$, var8, var10);
            final SubLObject var12 = module0191.f11990((SubLObject)module0525.$ic5$, var11, (SubLObject)module0525.UNPROVIDED, (SubLObject)module0525.UNPROVIDED);
            final SubLObject var13 = (SubLObject)ConsesLow.list(var12);
            return var13;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32681(final SubLObject var11, final SubLObject var12) {
        final SubLObject var13 = (SubLObject)ConsesLow.list(module0525.$ic7$, var11, var12);
        final SubLObject var14 = module0191.f11990((SubLObject)module0525.$ic8$, var13, (SubLObject)module0525.UNPROVIDED, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var15 = (SubLObject)ConsesLow.list(var14);
        return var15;
    }
    
    public static SubLObject f32682(final SubLObject var13) {
        return module0435.f30618(var13, module0525.$ic9$);
    }
    
    public static SubLObject f32683(final SubLObject var13) {
        if (module0525.NIL != module0349.f23389(var13)) {
            return module0435.f30618(var13, module0525.$ic10$);
        }
        if (module0525.NIL != module0349.f23390(var13)) {
            return module0435.f30618(var13, module0525.$ic11$);
        }
        if (module0525.NIL != module0349.f23392(var13)) {
            return ConsesLow.append(module0435.f30618(var13, module0525.$ic12$), module0439.f30678(var13));
        }
        Errors.error((SubLObject)module0525.$ic13$, var13);
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32684(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0525.NIL == module0525.$g3860$.getDynamicValue(var15)) {
            return module0220.f14603(var14);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32685(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL != module0340.f22976(var16) && module0525.$ic14$.eql(module0340.f22849(var16)));
    }
    
    public static SubLObject f32686(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL != module0377.f26776(var16) && module0525.NIL != f32685(module0373.f26181(var16)));
    }
    
    public static SubLObject f32687(final SubLObject var17, final SubLObject var18) {
        SubLObject var20;
        final SubLObject var19 = var20 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic15$);
        final SubLObject var21 = var20.rest();
        var20 = var20.first();
        SubLObject var22 = (SubLObject)module0525.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic15$);
        var22 = var20.first();
        var20 = var20.rest();
        if (module0525.NIL == var20) {
            final SubLObject var23;
            var20 = (var23 = var21);
            return (SubLObject)ConsesLow.listS((SubLObject)module0525.$ic16$, reader.bq_cons(var22, (SubLObject)module0525.$ic17$), ConsesLow.append(var23, (SubLObject)module0525.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0525.$ic15$);
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32688(final SubLObject var17, final SubLObject var18) {
        SubLObject var20;
        final SubLObject var19 = var20 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic18$);
        final SubLObject var21 = var20.rest();
        var20 = var20.first();
        SubLObject var22 = (SubLObject)module0525.NIL;
        SubLObject var23 = (SubLObject)module0525.NIL;
        SubLObject var24 = (SubLObject)module0525.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic18$);
        var22 = var20.first();
        var20 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic18$);
        var23 = var20.first();
        var20 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic18$);
        var24 = var20.first();
        var20 = var20.rest();
        SubLObject var25 = (SubLObject)module0525.NIL;
        SubLObject var26 = var20;
        SubLObject var27 = (SubLObject)module0525.NIL;
        SubLObject var33_34 = (SubLObject)module0525.NIL;
        while (module0525.NIL != var26) {
            cdestructuring_bind.destructuring_bind_must_consp(var26, var19, (SubLObject)module0525.$ic18$);
            var33_34 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var19, (SubLObject)module0525.$ic18$);
            if (module0525.NIL == conses_high.member(var33_34, (SubLObject)module0525.$ic19$, (SubLObject)module0525.UNPROVIDED, (SubLObject)module0525.UNPROVIDED)) {
                var27 = (SubLObject)module0525.T;
            }
            if (var33_34 == module0525.$ic20$) {
                var25 = var26.first();
            }
            var26 = var26.rest();
        }
        if (module0525.NIL != var27 && module0525.NIL == var25) {
            cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0525.$ic18$);
        }
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0525.$ic21$, var20);
        final SubLObject var29 = (SubLObject)((module0525.NIL != var28) ? conses_high.cadr(var28) : module0525.NIL);
        final SubLObject var30;
        var20 = (var30 = var21);
        if (module0525.NIL != var29) {
            final SubLObject var31 = (SubLObject)module0525.$ic22$;
            return (SubLObject)ConsesLow.list((SubLObject)module0525.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, var29)), (SubLObject)ConsesLow.list((SubLObject)module0525.$ic24$, (SubLObject)ConsesLow.list(var22, var23, var24), (SubLObject)ConsesLow.listS((SubLObject)module0525.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0525.EQL, var31, (SubLObject)ConsesLow.list((SubLObject)module0525.$ic26$, var22)), ConsesLow.append(var30, (SubLObject)module0525.NIL))));
        }
        final SubLObject var32 = (SubLObject)module0525.$ic27$;
        return (SubLObject)ConsesLow.list((SubLObject)module0525.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var32, var23)), (SubLObject)ConsesLow.list((SubLObject)module0525.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0525.$ic28$, var32), (SubLObject)ConsesLow.listS((SubLObject)module0525.$ic29$, (SubLObject)ConsesLow.list(var22, var32, (SubLObject)module0525.$ic30$, var24, (SubLObject)module0525.$ic21$, var29), ConsesLow.append(var30, (SubLObject)module0525.NIL))));
    }
    
    public static SubLObject f32689(final SubLObject var17, final SubLObject var18) {
        SubLObject var20;
        final SubLObject var19 = var20 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic31$);
        final SubLObject var21 = var20.rest();
        var20 = var20.first();
        SubLObject var22 = (SubLObject)module0525.NIL;
        SubLObject var23 = (SubLObject)module0525.NIL;
        SubLObject var24 = (SubLObject)module0525.NIL;
        SubLObject var25 = (SubLObject)module0525.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic31$);
        var22 = var20.first();
        var20 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic31$);
        var23 = var20.first();
        var20 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic31$);
        var24 = var20.first();
        var20 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0525.$ic31$);
        var25 = var20.first();
        var20 = var20.rest();
        if (module0525.NIL == var20) {
            final SubLObject var26;
            var20 = (var26 = var21);
            final SubLObject var27 = (SubLObject)module0525.$ic32$;
            final SubLObject var28 = (SubLObject)module0525.$ic33$;
            final SubLObject var29 = (SubLObject)module0525.$ic34$;
            return (SubLObject)ConsesLow.list((SubLObject)module0525.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, var25), (SubLObject)ConsesLow.list(var29, var24)), (SubLObject)ConsesLow.list((SubLObject)module0525.$ic35$, (SubLObject)ConsesLow.list(var27), (SubLObject)ConsesLow.list((SubLObject)module0525.$ic36$, (SubLObject)ConsesLow.list(var23, var29, (SubLObject)module0525.$ic30$, var28, (SubLObject)module0525.$ic37$, var27), (SubLObject)ConsesLow.listS((SubLObject)module0525.$ic24$, (SubLObject)ConsesLow.list(var22, var23, var28, (SubLObject)module0525.$ic21$, var29), ConsesLow.append(var26, (SubLObject)module0525.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0525.$ic31$);
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32690() {
        return module0032.f1726((SubLObject)module0525.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0525.EQL));
    }
    
    public static SubLObject f32691(final SubLObject var28, final SubLObject var42) {
        return module0032.f1736(var28, var42, Symbols.symbol_function((SubLObject)module0525.EQL));
    }
    
    public static SubLObject f32692(final SubLObject var42) {
        final SubLObject var43 = module0032.f1753(var42);
        return f32693(var43);
    }
    
    public static SubLObject f32693(final SubLObject var43) {
        if (module0525.NIL != module0339.f22757()) {
            return Sort.sort(var43, (SubLObject)module0525.$ic38$, (SubLObject)module0525.UNPROVIDED);
        }
        return Sort.sort(var43, (SubLObject)module0525.$ic39$, (SubLObject)module0525.UNPROVIDED);
    }
    
    public static SubLObject f32694(final SubLObject var44, final SubLObject var45) {
        return module0389.f27671(module0339.f22757(), var44, var45);
    }
    
    public static SubLObject f32695(final SubLObject var46) {
        return f32696(var46);
    }
    
    public static SubLObject f32697(final SubLObject var46) {
        return f32696(var46);
    }
    
    public static SubLObject f32698(final SubLObject var46) {
        return f32699(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32700(final SubLObject var46) {
        return f32699(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32701(final SubLObject var46) {
        return f32702(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32703(final SubLObject var46) {
        return f32702(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32704(final SubLObject var46, final SubLObject var28) {
        return f32705(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32706(final SubLObject var46, final SubLObject var28) {
        return f32705(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32707(final SubLObject var46, final SubLObject var28) {
        return f32708(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32709(final SubLObject var46, final SubLObject var28) {
        return f32708(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32696(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == module0018.$g655$.getDynamicValue(var47) || module0525.NIL == module0193.f12105(var46) || module0525.NIL == f32684(var46));
    }
    
    public static SubLObject f32699(final SubLObject var46, final SubLObject var29) {
        return module0217.f14266(module0205.f13333(var46), var29);
    }
    
    public static SubLObject f32702(final SubLObject var46, final SubLObject var29) {
        return conses_high.copy_list(f32710(module0205.f13333(var46), var29));
    }
    
    public static SubLObject f32711(final SubLObject var13, final SubLObject var29) {
        SubLObject var30 = f32690();
        SubLObject var31 = module0351.f23567();
        SubLObject var32 = (SubLObject)module0525.NIL;
        var32 = var31.first();
        while (module0525.NIL != var31) {
            if (module0525.NIL != module0158.f10084(var13, var29, var32)) {
                final SubLObject var33 = module0158.f10085(var13, var29, var32);
                SubLObject var34 = (SubLObject)module0525.NIL;
                final SubLObject var35 = (SubLObject)module0525.NIL;
                while (module0525.NIL == var34) {
                    final SubLObject var36 = module0052.f3695(var33, var35);
                    final SubLObject var37 = (SubLObject)SubLObjectFactory.makeBoolean(!var35.eql(var36));
                    if (module0525.NIL != var37) {
                        SubLObject var38 = (SubLObject)module0525.NIL;
                        try {
                            var38 = module0158.f10316(var36, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var32);
                            SubLObject var52_57 = (SubLObject)module0525.NIL;
                            final SubLObject var53_58 = (SubLObject)module0525.NIL;
                            while (module0525.NIL == var52_57) {
                                final SubLObject var39 = module0052.f3695(var38, var53_58);
                                final SubLObject var55_59 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_58.eql(var39));
                                if (module0525.NIL != var55_59) {
                                    var30 = f32691(var39, var30);
                                }
                                var52_57 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_59);
                            }
                        }
                        finally {
                            final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                if (module0525.NIL != var38) {
                                    module0158.f10319(var38);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                            }
                        }
                    }
                    var34 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var37);
                }
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return f32692(var30);
    }
    
    public static SubLObject f32710(final SubLObject var13, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0034.$g879$.getDynamicValue(var30);
        SubLObject var32 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var31) {
            return f32711(var13, var29);
        }
        var32 = module0034.f1857(var31, (SubLObject)module0525.$ic45$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var32) {
            var32 = module0034.f1807(module0034.f1842(var31), (SubLObject)module0525.$ic45$, (SubLObject)module0525.TWO_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var31, (SubLObject)module0525.$ic45$, var32);
        }
        final SubLObject var33 = module0034.f1782(var13, var29);
        final SubLObject var34 = module0034.f1814(var32, var33, (SubLObject)module0525.UNPROVIDED);
        if (var34 != module0525.$ic47$) {
            SubLObject var35 = var34;
            SubLObject var36 = (SubLObject)module0525.NIL;
            var36 = var35.first();
            while (module0525.NIL != var35) {
                SubLObject var37 = var36.first();
                final SubLObject var38 = conses_high.second(var36);
                if (var13.eql(var37.first())) {
                    var37 = var37.rest();
                    if (module0525.NIL != var37 && module0525.NIL == var37.rest() && var29.eql(var37.first())) {
                        return module0034.f1959(var38);
                    }
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
        }
        final SubLObject var39 = Values.arg2(var30.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32711(var13, var29)));
        module0034.f1836(var32, var33, var34, var39, (SubLObject)ConsesLow.list(var13, var29));
        return module0034.f1959(var39);
    }
    
    public static SubLObject f32705(final SubLObject var46, final SubLObject var29, final SubLObject var28) {
        final SubLObject var48;
        final SubLObject var47 = var48 = module0205.f13333(var46);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var49 = module0178.f11282(var28);
            if (module0525.$ic40$ == var29) {
                SubLObject var50 = module0232.f15308(var49);
                SubLObject var51 = (SubLObject)module0525.NIL;
                var51 = var50.first();
                while (module0525.NIL != var50) {
                    if (var48.eql(module0205.f13333(var51)) && module0525.NIL != module0234.f15434(var46, var51)) {
                        return (SubLObject)module0525.T;
                    }
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            else if (module0525.$ic14$ == var29) {
                SubLObject var50 = module0232.f15306(var49);
                SubLObject var51 = (SubLObject)module0525.NIL;
                var51 = var50.first();
                while (module0525.NIL != var50) {
                    if (var48.eql(module0205.f13333(var51)) && module0525.NIL != module0234.f15434(var46, var51)) {
                        return (SubLObject)module0525.T;
                    }
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            else {
                Errors.error((SubLObject)module0525.$ic48$, var29);
            }
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32708(final SubLObject var46, final SubLObject var29, final SubLObject var28) {
        final SubLObject var48;
        final SubLObject var47 = var48 = module0205.f13333(var46);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var49 = module0178.f11282(var28);
            if (module0525.$ic40$ == var29) {
                SubLObject var50 = module0232.f15308(var49);
                SubLObject var51 = (SubLObject)module0525.NIL;
                var51 = var50.first();
                while (module0525.NIL != var50) {
                    if (var48.eql(module0205.f13333(var51))) {
                        final SubLObject var52 = module0235.f15479(var46, var51);
                        if (module0525.NIL != var52) {
                            module0347.f23328(var28, var51, var29, var52, (SubLObject)module0525.UNPROVIDED);
                        }
                    }
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            else if (module0525.$ic14$ == var29) {
                SubLObject var50 = module0232.f15306(var49);
                SubLObject var51 = (SubLObject)module0525.NIL;
                var51 = var50.first();
                while (module0525.NIL != var50) {
                    if (var48.eql(module0205.f13333(var51))) {
                        final SubLObject var52 = module0235.f15479(var46, var51);
                        if (module0525.NIL != var52) {
                            module0347.f23328(var28, var51, var29, var52, (SubLObject)module0525.UNPROVIDED);
                        }
                    }
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            else {
                Errors.error((SubLObject)module0525.$ic48$, var29);
            }
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32712(final SubLObject var46) {
        return f32713(var46);
    }
    
    public static SubLObject f32714(final SubLObject var46) {
        return f32713(var46);
    }
    
    public static SubLObject f32715(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13333(var46);
        var47.resetMultipleValues();
        final SubLObject var49 = module0349.f23421(var48, (SubLObject)module0525.$ic40$);
        final SubLObject var50 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        return var50;
    }
    
    public static SubLObject f32716(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13333(var46);
        var47.resetMultipleValues();
        final SubLObject var49 = module0349.f23420(var48, (SubLObject)module0525.$ic14$);
        final SubLObject var50 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        return var50;
    }
    
    public static SubLObject f32717(final SubLObject var46) {
        return conses_high.copy_list(f32718(module0205.f13333(var46)));
    }
    
    public static SubLObject f32719(final SubLObject var13) {
        SubLObject var14 = f32690();
        SubLObject var15 = module0349.f23421(var13, (SubLObject)module0525.$ic40$);
        SubLObject var16 = (SubLObject)module0525.NIL;
        var16 = var15.first();
        while (module0525.NIL != var15) {
            SubLObject var49_79 = module0351.f23567();
            SubLObject var17 = (SubLObject)module0525.NIL;
            var17 = var49_79.first();
            while (module0525.NIL != var49_79) {
                if (module0525.NIL != module0158.f10084(var16, (SubLObject)module0525.$ic40$, var17)) {
                    final SubLObject var18 = module0158.f10085(var16, (SubLObject)module0525.$ic40$, var17);
                    SubLObject var19 = (SubLObject)module0525.NIL;
                    final SubLObject var20 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var19) {
                        final SubLObject var21 = module0052.f3695(var18, var20);
                        final SubLObject var22 = (SubLObject)SubLObjectFactory.makeBoolean(!var20.eql(var21));
                        if (module0525.NIL != var22) {
                            SubLObject var23 = (SubLObject)module0525.NIL;
                            try {
                                var23 = module0158.f10316(var21, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var17);
                                SubLObject var52_80 = (SubLObject)module0525.NIL;
                                final SubLObject var53_81 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_80) {
                                    final SubLObject var24 = module0052.f3695(var23, var53_81);
                                    final SubLObject var55_82 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_81.eql(var24));
                                    if (module0525.NIL != var55_82) {
                                        var14 = f32691(var24, var14);
                                    }
                                    var52_80 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_82);
                                }
                            }
                            finally {
                                final SubLObject var25 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var23) {
                                        module0158.f10319(var23);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var25);
                                }
                            }
                        }
                        var19 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var22);
                    }
                }
                var49_79 = var49_79.rest();
                var17 = var49_79.first();
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return f32692(var14);
    }
    
    public static SubLObject f32718(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0034.$g879$.getDynamicValue(var14);
        SubLObject var16 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var15) {
            return f32719(var13);
        }
        var16 = module0034.f1857(var15, (SubLObject)module0525.$ic49$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)module0525.$ic49$, (SubLObject)module0525.ONE_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var15, (SubLObject)module0525.$ic49$, var16);
        }
        SubLObject var17 = module0034.f1814(var16, var13, (SubLObject)module0525.$ic47$);
        if (var17 == module0525.$ic47$) {
            var17 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32719(var13)));
            module0034.f1816(var16, var13, var17, (SubLObject)module0525.UNPROVIDED);
        }
        return module0034.f1959(var17);
    }
    
    public static SubLObject f32720(final SubLObject var46) {
        final SubLObject var47 = module0205.f13333(var46);
        SubLObject var48 = f32690();
        SubLObject var49 = module0349.f23420(var47, (SubLObject)module0525.$ic14$);
        SubLObject var50 = (SubLObject)module0525.NIL;
        var50 = var49.first();
        while (module0525.NIL != var49) {
            SubLObject var49_86 = module0351.f23567();
            SubLObject var51 = (SubLObject)module0525.NIL;
            var51 = var49_86.first();
            while (module0525.NIL != var49_86) {
                if (module0525.NIL != module0158.f10084(var50, (SubLObject)module0525.$ic14$, var51)) {
                    final SubLObject var52 = module0158.f10085(var50, (SubLObject)module0525.$ic14$, var51);
                    SubLObject var53 = (SubLObject)module0525.NIL;
                    final SubLObject var54 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var53) {
                        final SubLObject var55 = module0052.f3695(var52, var54);
                        final SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(!var54.eql(var55));
                        if (module0525.NIL != var56) {
                            SubLObject var57 = (SubLObject)module0525.NIL;
                            try {
                                var57 = module0158.f10316(var55, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var51);
                                SubLObject var52_87 = (SubLObject)module0525.NIL;
                                final SubLObject var53_88 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_87) {
                                    final SubLObject var58 = module0052.f3695(var57, var53_88);
                                    final SubLObject var55_89 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_88.eql(var58));
                                    if (module0525.NIL != var55_89) {
                                        var48 = f32691(var58, var48);
                                    }
                                    var52_87 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_89);
                                }
                            }
                            finally {
                                final SubLObject var59 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var57) {
                                        module0158.f10319(var57);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var59);
                                }
                            }
                        }
                        var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var56);
                    }
                }
                var49_86 = var49_86.rest();
                var51 = var49_86.first();
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return f32692(var48);
    }
    
    public static SubLObject f32721(final SubLObject var46, final SubLObject var28) {
        final SubLObject var47 = module0205.f13333(var46);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var48 = module0178.f11282(var28);
            SubLObject var49 = module0232.f15308(var48);
            SubLObject var50 = (SubLObject)module0525.NIL;
            var50 = var49.first();
            while (module0525.NIL != var49) {
                final SubLObject var51 = module0205.f13333(var50);
                if (module0525.NIL != f32722(var51, var47, (SubLObject)module0525.UNPROVIDED)) {
                    final SubLObject var52 = module0202.f12817((SubLObject)module0525.ZERO_INTEGER, var51, var46);
                    final SubLObject var53 = module0235.f15479(var52, var50);
                    if (module0525.NIL != var53) {
                        return Values.values(var53, var50, var51, var47);
                    }
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32723(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32721(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32724(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32721(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var52 = f32679(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic40$, var48, var52);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32725(final SubLObject var46, final SubLObject var28) {
        final SubLObject var47 = module0205.f13333(var46);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var48 = module0178.f11282(var28);
            SubLObject var49 = module0232.f15306(var48);
            SubLObject var50 = (SubLObject)module0525.NIL;
            var50 = var49.first();
            while (module0525.NIL != var49) {
                final SubLObject var51 = module0205.f13333(var50);
                if (module0525.NIL != f32722(var47, var51, (SubLObject)module0525.UNPROVIDED)) {
                    final SubLObject var52 = module0202.f12817((SubLObject)module0525.ZERO_INTEGER, var51, var46);
                    final SubLObject var53 = module0235.f15479(var52, var50);
                    if (module0525.NIL != var53) {
                        return Values.values(var53, var50, var47, var51);
                    }
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32726(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32725(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32727(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32725(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var52 = f32679(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic14$, var48, var52);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32713(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == module0018.$g655$.getDynamicValue(var47) || module0525.NIL == module0193.f12105(var46) || module0525.NIL == f32684(var46));
    }
    
    public static SubLObject f32728(final SubLObject var8, final SubLObject var9, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = module0147.$g2095$.getDynamicValue();
        }
        if (!var8.eql(var9) && module0525.NIL != module0173.f10955(var8) && module0525.NIL != module0173.f10955(var9) && module0525.NIL != module0269.f17706(var8) && module0525.NIL != module0269.f17706(var9)) {
            return module0260.f17089(var8, var9, var92, (SubLObject)module0525.UNPROVIDED);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32722(final SubLObject var8, final SubLObject var9, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        final SubLObject var94 = module0034.$g879$.getDynamicValue(var93);
        SubLObject var95 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var94) {
            return f32728(var8, var9, var92);
        }
        var95 = module0034.f1857(var94, (SubLObject)module0525.$ic54$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var95) {
            var95 = module0034.f1807(module0034.f1842(var94), (SubLObject)module0525.$ic54$, (SubLObject)module0525.THREE_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var94, (SubLObject)module0525.$ic54$, var95);
        }
        final SubLObject var96 = module0034.f1781(var8, var9, var92);
        final SubLObject var97 = module0034.f1814(var95, var96, (SubLObject)module0525.UNPROVIDED);
        if (var97 != module0525.$ic47$) {
            SubLObject var98 = var97;
            SubLObject var99 = (SubLObject)module0525.NIL;
            var99 = var98.first();
            while (module0525.NIL != var98) {
                SubLObject var100 = var99.first();
                final SubLObject var101 = conses_high.second(var99);
                if (var8.eql(var100.first())) {
                    var100 = var100.rest();
                    if (var9.eql(var100.first())) {
                        var100 = var100.rest();
                        if (module0525.NIL != var100 && module0525.NIL == var100.rest() && var92.eql(var100.first())) {
                            return module0034.f1959(var101);
                        }
                    }
                }
                var98 = var98.rest();
                var99 = var98.first();
            }
        }
        final SubLObject var102 = Values.arg2(var93.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32728(var8, var9, var92)));
        module0034.f1836(var95, var96, var97, var102, (SubLObject)ConsesLow.list(var8, var9, var92));
        return module0034.f1959(var102);
    }
    
    public static SubLObject f32729(final SubLObject var46) {
        return f32713(var46);
    }
    
    public static SubLObject f32730(final SubLObject var46) {
        return f32713(var46);
    }
    
    public static SubLObject f32731(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13333(var46);
        var47.resetMultipleValues();
        final SubLObject var49 = module0349.f23426(var48, (SubLObject)module0525.$ic40$);
        final SubLObject var50 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        return var50;
    }
    
    public static SubLObject f32732(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13333(var46);
        var47.resetMultipleValues();
        final SubLObject var49 = module0349.f23425(var48, (SubLObject)module0525.$ic14$);
        final SubLObject var50 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        return var50;
    }
    
    public static SubLObject f32733(final SubLObject var46) {
        return conses_high.copy_list(f32734(module0205.f13333(var46)));
    }
    
    public static SubLObject f32735(final SubLObject var13) {
        SubLObject var14 = f32690();
        SubLObject var15 = module0349.f23426(var13, (SubLObject)module0525.$ic40$);
        SubLObject var16 = (SubLObject)module0525.NIL;
        var16 = var15.first();
        while (module0525.NIL != var15) {
            SubLObject var49_95 = module0351.f23567();
            SubLObject var17 = (SubLObject)module0525.NIL;
            var17 = var49_95.first();
            while (module0525.NIL != var49_95) {
                if (module0525.NIL != module0158.f10084(var16, (SubLObject)module0525.$ic40$, var17)) {
                    final SubLObject var18 = module0158.f10085(var16, (SubLObject)module0525.$ic40$, var17);
                    SubLObject var19 = (SubLObject)module0525.NIL;
                    final SubLObject var20 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var19) {
                        final SubLObject var21 = module0052.f3695(var18, var20);
                        final SubLObject var22 = (SubLObject)SubLObjectFactory.makeBoolean(!var20.eql(var21));
                        if (module0525.NIL != var22) {
                            SubLObject var23 = (SubLObject)module0525.NIL;
                            try {
                                var23 = module0158.f10316(var21, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var17);
                                SubLObject var52_96 = (SubLObject)module0525.NIL;
                                final SubLObject var53_97 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_96) {
                                    final SubLObject var24 = module0052.f3695(var23, var53_97);
                                    final SubLObject var55_98 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_97.eql(var24));
                                    if (module0525.NIL != var55_98) {
                                        var14 = f32691(var24, var14);
                                    }
                                    var52_96 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_98);
                                }
                            }
                            finally {
                                final SubLObject var25 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var23) {
                                        module0158.f10319(var23);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var25);
                                }
                            }
                        }
                        var19 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var22);
                    }
                }
                var49_95 = var49_95.rest();
                var17 = var49_95.first();
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return f32692(var14);
    }
    
    public static SubLObject f32734(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0034.$g879$.getDynamicValue(var14);
        SubLObject var16 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var15) {
            return f32735(var13);
        }
        var16 = module0034.f1857(var15, (SubLObject)module0525.$ic55$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)module0525.$ic55$, (SubLObject)module0525.ONE_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var15, (SubLObject)module0525.$ic55$, var16);
        }
        SubLObject var17 = module0034.f1814(var16, var13, (SubLObject)module0525.$ic47$);
        if (var17 == module0525.$ic47$) {
            var17 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32735(var13)));
            module0034.f1816(var16, var13, var17, (SubLObject)module0525.UNPROVIDED);
        }
        return module0034.f1959(var17);
    }
    
    public static SubLObject f32736(final SubLObject var46) {
        final SubLObject var47 = module0205.f13333(var46);
        SubLObject var48 = f32690();
        SubLObject var49 = module0349.f23425(var47, (SubLObject)module0525.$ic14$);
        SubLObject var50 = (SubLObject)module0525.NIL;
        var50 = var49.first();
        while (module0525.NIL != var49) {
            SubLObject var49_99 = module0351.f23567();
            SubLObject var51 = (SubLObject)module0525.NIL;
            var51 = var49_99.first();
            while (module0525.NIL != var49_99) {
                if (module0525.NIL != module0158.f10084(var50, (SubLObject)module0525.$ic14$, var51)) {
                    final SubLObject var52 = module0158.f10085(var50, (SubLObject)module0525.$ic14$, var51);
                    SubLObject var53 = (SubLObject)module0525.NIL;
                    final SubLObject var54 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var53) {
                        final SubLObject var55 = module0052.f3695(var52, var54);
                        final SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(!var54.eql(var55));
                        if (module0525.NIL != var56) {
                            SubLObject var57 = (SubLObject)module0525.NIL;
                            try {
                                var57 = module0158.f10316(var55, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var51);
                                SubLObject var52_100 = (SubLObject)module0525.NIL;
                                final SubLObject var53_101 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_100) {
                                    final SubLObject var58 = module0052.f3695(var57, var53_101);
                                    final SubLObject var55_102 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_101.eql(var58));
                                    if (module0525.NIL != var55_102) {
                                        var48 = f32691(var58, var48);
                                    }
                                    var52_100 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_102);
                                }
                            }
                            finally {
                                final SubLObject var59 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var57) {
                                        module0158.f10319(var57);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var59);
                                }
                            }
                        }
                        var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var56);
                    }
                }
                var49_99 = var49_99.rest();
                var51 = var49_99.first();
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return f32692(var48);
    }
    
    public static SubLObject f32737(final SubLObject var46, final SubLObject var28) {
        final SubLObject var47 = module0439.f30674(var46);
        final SubLObject var48 = module0205.f13333(var47);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var49 = module0178.f11282(var28);
            SubLObject var50 = module0232.f15308(var49);
            SubLObject var51 = (SubLObject)module0525.NIL;
            var51 = var50.first();
            while (module0525.NIL != var50) {
                final SubLObject var52 = module0205.f13333(var51);
                if (module0525.NIL != f32738(var52, var48, (SubLObject)module0525.UNPROVIDED)) {
                    final SubLObject var53 = module0202.f12817((SubLObject)module0525.ZERO_INTEGER, var52, var47);
                    final SubLObject var54 = module0235.f15479(var53, var51);
                    if (module0525.NIL != var54) {
                        return Values.values(var54, var51, var52, var48);
                    }
                }
                var50 = var50.rest();
                var51 = var50.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32739(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32737(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32740(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32737(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var52 = f32680(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic40$, var48, var52);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32741(final SubLObject var46, final SubLObject var28) {
        final SubLObject var47 = module0439.f30674(var46);
        final SubLObject var48 = module0205.f13333(var47);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var49 = module0178.f11282(var28);
            SubLObject var50 = module0232.f15306(var49);
            SubLObject var51 = (SubLObject)module0525.NIL;
            var51 = var50.first();
            while (module0525.NIL != var50) {
                final SubLObject var52 = module0205.f13333(var51);
                if (module0525.NIL != f32738(var48, var52, (SubLObject)module0525.UNPROVIDED)) {
                    final SubLObject var53 = module0202.f12817((SubLObject)module0525.ZERO_INTEGER, var52, var47);
                    final SubLObject var54 = module0235.f15479(var53, var51);
                    if (module0525.NIL != var54) {
                        return Values.values(var54, var51, var48, var52);
                    }
                }
                var50 = var50.rest();
                var51 = var50.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32742(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32741(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32743(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32741(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var52 = f32680(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic14$, var48, var52);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32744(final SubLObject var8, final SubLObject var10, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = module0147.$g2095$.getDynamicValue();
        }
        if (!var8.eql(var10) && module0525.NIL != module0173.f10955(var8) && module0525.NIL != module0173.f10955(var10) && module0525.NIL != module0269.f17706(var8) && module0525.NIL != module0269.f17706(var10)) {
            return module0260.f17094(var8, var10, var92, (SubLObject)module0525.UNPROVIDED);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32738(final SubLObject var8, final SubLObject var10, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        final SubLObject var94 = module0034.$g879$.getDynamicValue(var93);
        SubLObject var95 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var94) {
            return f32744(var8, var10, var92);
        }
        var95 = module0034.f1857(var94, (SubLObject)module0525.$ic60$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var95) {
            var95 = module0034.f1807(module0034.f1842(var94), (SubLObject)module0525.$ic60$, (SubLObject)module0525.THREE_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var94, (SubLObject)module0525.$ic60$, var95);
        }
        final SubLObject var96 = module0034.f1781(var8, var10, var92);
        final SubLObject var97 = module0034.f1814(var95, var96, (SubLObject)module0525.UNPROVIDED);
        if (var97 != module0525.$ic47$) {
            SubLObject var98 = var97;
            SubLObject var99 = (SubLObject)module0525.NIL;
            var99 = var98.first();
            while (module0525.NIL != var98) {
                SubLObject var100 = var99.first();
                final SubLObject var101 = conses_high.second(var99);
                if (var8.eql(var100.first())) {
                    var100 = var100.rest();
                    if (var10.eql(var100.first())) {
                        var100 = var100.rest();
                        if (module0525.NIL != var100 && module0525.NIL == var100.rest() && var92.eql(var100.first())) {
                            return module0034.f1959(var101);
                        }
                    }
                }
                var98 = var98.rest();
                var99 = var98.first();
            }
        }
        final SubLObject var102 = Values.arg2(var93.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32744(var8, var10, var92)));
        module0034.f1836(var95, var96, var97, var102, (SubLObject)ConsesLow.list(var8, var10, var92));
        return module0034.f1959(var102);
    }
    
    public static SubLObject f32745(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == module0018.$g655$.getDynamicValue(var47) || module0525.NIL == module0193.f12105(var46) || module0525.NIL == f32684(var46));
    }
    
    public static SubLObject f32746(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13333(var46);
        var47.resetMultipleValues();
        final SubLObject var49 = module0349.f23430(var48, (SubLObject)module0525.$ic40$);
        final SubLObject var50 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        return var50;
    }
    
    public static SubLObject f32747(final SubLObject var46) {
        final SubLObject var47 = module0205.f13333(var46);
        SubLObject var48 = f32690();
        SubLObject var49 = module0349.f23430(var47, (SubLObject)module0525.$ic40$);
        SubLObject var50 = (SubLObject)module0525.NIL;
        var50 = var49.first();
        while (module0525.NIL != var49) {
            SubLObject var49_105 = module0351.f23567();
            SubLObject var51 = (SubLObject)module0525.NIL;
            var51 = var49_105.first();
            while (module0525.NIL != var49_105) {
                if (module0525.NIL != module0158.f10084(var50, (SubLObject)module0525.$ic40$, var51)) {
                    final SubLObject var52 = module0158.f10085(var50, (SubLObject)module0525.$ic40$, var51);
                    SubLObject var53 = (SubLObject)module0525.NIL;
                    final SubLObject var54 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var53) {
                        final SubLObject var55 = module0052.f3695(var52, var54);
                        final SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(!var54.eql(var55));
                        if (module0525.NIL != var56) {
                            SubLObject var57 = (SubLObject)module0525.NIL;
                            try {
                                var57 = module0158.f10316(var55, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var51);
                                SubLObject var52_106 = (SubLObject)module0525.NIL;
                                final SubLObject var53_107 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_106) {
                                    final SubLObject var58 = module0052.f3695(var57, var53_107);
                                    final SubLObject var55_108 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_107.eql(var58));
                                    if (module0525.NIL != var55_108) {
                                        var48 = f32691(var58, var48);
                                    }
                                    var52_106 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_108);
                                }
                            }
                            finally {
                                final SubLObject var59 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var57) {
                                        module0158.f10319(var57);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var59);
                                }
                            }
                        }
                        var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var56);
                    }
                }
                var49_105 = var49_105.rest();
                var51 = var49_105.first();
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return f32692(var48);
    }
    
    public static SubLObject f32748(final SubLObject var46, final SubLObject var28) {
        final SubLObject var47 = module0205.f13333(var46);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var48 = module0178.f11282(var28);
            SubLObject var49 = module0232.f15308(var48);
            SubLObject var50 = (SubLObject)module0525.NIL;
            var50 = var49.first();
            while (module0525.NIL != var49) {
                final SubLObject var51 = module0205.f13333(var50);
                if (module0525.NIL != module0261.f17246(var51, var47, (SubLObject)module0525.UNPROVIDED, (SubLObject)module0525.UNPROVIDED)) {
                    final SubLObject var52 = module0202.f12817((SubLObject)module0525.ZERO_INTEGER, var51, var46);
                    final SubLObject var53 = module0235.f15479(var52, var50);
                    if (module0525.NIL != var53) {
                        return Values.values(var53, var50, var51, var47);
                    }
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32749(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32748(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32750(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32748(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var52 = f32681(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic40$, var48, var52);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32751(final SubLObject var46, final SubLObject var29) {
        SubLObject var47 = (SubLObject)module0525.ZERO_INTEGER;
        if (module0525.NIL != module0202.f12598(var46)) {
            final SubLObject var48 = module0439.f30674(var46);
            var47 = Numbers.add(var47, f32699(var48, var29));
        }
        else {
            SubLObject var49 = module0205.f13275(var46, (SubLObject)module0525.UNPROVIDED);
            SubLObject var50 = (SubLObject)module0525.NIL;
            var50 = var49.first();
            while (module0525.NIL != var49) {
                if (!var50.equal(var46)) {
                    var47 = Numbers.add(var47, f32699(var50, var29));
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        return var47;
    }
    
    public static SubLObject f32752(final SubLObject var46, final SubLObject var29) {
        final SubLObject var47 = module0205.f13333(var46);
        SubLObject var48 = f32690();
        SubLObject var49 = module0351.f23567();
        SubLObject var50 = (SubLObject)module0525.NIL;
        var50 = var49.first();
        while (module0525.NIL != var49) {
            if (module0525.NIL != module0158.f10084(var47, var29, var50)) {
                final SubLObject var51 = module0158.f10085(var47, var29, var50);
                SubLObject var52 = (SubLObject)module0525.NIL;
                final SubLObject var53 = (SubLObject)module0525.NIL;
                while (module0525.NIL == var52) {
                    final SubLObject var54 = module0052.f3695(var51, var53);
                    final SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(!var53.eql(var54));
                    if (module0525.NIL != var55) {
                        SubLObject var56 = (SubLObject)module0525.NIL;
                        try {
                            var56 = module0158.f10316(var54, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var50);
                            SubLObject var52_111 = (SubLObject)module0525.NIL;
                            final SubLObject var53_112 = (SubLObject)module0525.NIL;
                            while (module0525.NIL == var52_111) {
                                final SubLObject var57 = module0052.f3695(var56, var53_112);
                                final SubLObject var55_113 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_112.eql(var57));
                                if (module0525.NIL != var55_113) {
                                    var48 = f32691(var57, var48);
                                }
                                var52_111 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_113);
                            }
                        }
                        finally {
                            final SubLObject var58 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                if (module0525.NIL != var56) {
                                    module0158.f10319(var56);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var58);
                            }
                        }
                    }
                    var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55);
                }
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return f32692(var48);
    }
    
    public static SubLObject f32753(final SubLObject var46, final SubLObject var29, final SubLObject var28) {
        final SubLObject var47 = module0205.f13333(var46);
        if (module0525.NIL != module0202.f12598(var46)) {
            final SubLObject var48 = module0439.f30674(var46);
            final SubLObject var49 = var47;
            if (module0525.NIL != module0351.f23566(var28)) {
                final SubLObject var50 = module0178.f11282(var28);
                if (module0525.$ic40$ == var29) {
                    SubLObject var51 = module0232.f15308(var50);
                    SubLObject var52 = (SubLObject)module0525.NIL;
                    var52 = var51.first();
                    while (module0525.NIL != var51) {
                        if (var49.eql(module0205.f13333(var52))) {
                            final SubLObject var53 = module0235.f15479(var48, var52);
                            if (module0525.NIL != var53) {
                                return Values.values(var53, var52, var47);
                            }
                        }
                        var51 = var51.rest();
                        var52 = var51.first();
                    }
                }
                else if (module0525.$ic14$ == var29) {
                    SubLObject var51 = module0232.f15306(var50);
                    SubLObject var52 = (SubLObject)module0525.NIL;
                    var52 = var51.first();
                    while (module0525.NIL != var51) {
                        if (var49.eql(module0205.f13333(var52))) {
                            final SubLObject var53 = module0235.f15479(var48, var52);
                            if (module0525.NIL != var53) {
                                return Values.values(var53, var52, var47);
                            }
                        }
                        var51 = var51.rest();
                        var52 = var51.first();
                    }
                }
                else {
                    Errors.error((SubLObject)module0525.$ic48$, var29);
                }
            }
        }
        else {
            SubLObject var54 = module0205.f13275(var46, (SubLObject)module0525.UNPROVIDED);
            SubLObject var55 = (SubLObject)module0525.NIL;
            var55 = var54.first();
            while (module0525.NIL != var54) {
                if (!var55.equal(var46)) {
                    final SubLObject var56 = var47;
                    if (module0525.NIL != module0351.f23566(var28)) {
                        final SubLObject var57 = module0178.f11282(var28);
                        if (module0525.$ic40$ == var29) {
                            SubLObject var49_114 = module0232.f15308(var57);
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            var58 = var49_114.first();
                            while (module0525.NIL != var49_114) {
                                if (var56.eql(module0205.f13333(var58))) {
                                    final SubLObject var59 = module0235.f15479(var55, var58);
                                    if (module0525.NIL != var59) {
                                        return Values.values(var59, var58, var47);
                                    }
                                }
                                var49_114 = var49_114.rest();
                                var58 = var49_114.first();
                            }
                        }
                        else if (module0525.$ic14$ == var29) {
                            SubLObject var49_115 = module0232.f15306(var57);
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            var58 = var49_115.first();
                            while (module0525.NIL != var49_115) {
                                if (var56.eql(module0205.f13333(var58))) {
                                    final SubLObject var59 = module0235.f15479(var55, var58);
                                    if (module0525.NIL != var59) {
                                        return Values.values(var59, var58, var47);
                                    }
                                }
                                var49_115 = var49_115.rest();
                                var58 = var49_115.first();
                            }
                        }
                        else {
                            Errors.error((SubLObject)module0525.$ic48$, var29);
                        }
                    }
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32754(final SubLObject var46, final SubLObject var29, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32753(var46, var29, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32755(final SubLObject var46, final SubLObject var29, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32753(var46, var29, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            module0347.f23328(var28, var49, var29, var48, f32683(var50));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32756(final SubLObject var46) {
        return f32751(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32757(final SubLObject var46) {
        return f32751(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32758(final SubLObject var46) {
        return f32752(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32759(final SubLObject var46) {
        return f32752(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32760(final SubLObject var46, final SubLObject var28) {
        return f32754(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32761(final SubLObject var46, final SubLObject var28) {
        return f32754(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32762(final SubLObject var46, final SubLObject var28) {
        return f32755(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32763(final SubLObject var46, final SubLObject var28) {
        return f32755(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32764(final SubLObject var46) {
        return f32751(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32765(final SubLObject var46) {
        return f32751(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32766(final SubLObject var46) {
        return f32752(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32767(final SubLObject var46) {
        return f32752(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32768(final SubLObject var46, final SubLObject var28) {
        return f32754(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32769(final SubLObject var46, final SubLObject var28) {
        return f32754(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32770(final SubLObject var46, final SubLObject var28) {
        return f32755(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32771(final SubLObject var46, final SubLObject var28) {
        return f32755(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32772(final SubLObject var46) {
        return f32751(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32773(final SubLObject var46) {
        return f32751(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32774(final SubLObject var46) {
        return f32752(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32775(final SubLObject var46) {
        return f32752(var46, (SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32776(final SubLObject var46, final SubLObject var28) {
        return f32754(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32777(final SubLObject var46, final SubLObject var28) {
        return f32754(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32778(final SubLObject var46, final SubLObject var28) {
        return f32755(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32779(final SubLObject var46, final SubLObject var28) {
        return f32755(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32780(final SubLObject var46) {
        return f32699(var46, (SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32781(final SubLObject var46) {
        final SubLObject var47 = module0205.f13333(var46);
        SubLObject var48 = f32690();
        SubLObject var49 = module0351.f23567();
        SubLObject var50 = (SubLObject)module0525.NIL;
        var50 = var49.first();
        while (module0525.NIL != var49) {
            if (module0525.NIL != module0158.f10084(var47, (SubLObject)module0525.$ic40$, var50)) {
                final SubLObject var51 = module0158.f10085(var47, (SubLObject)module0525.$ic40$, var50);
                SubLObject var52 = (SubLObject)module0525.NIL;
                final SubLObject var53 = (SubLObject)module0525.NIL;
                while (module0525.NIL == var52) {
                    final SubLObject var54 = module0052.f3695(var51, var53);
                    final SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(!var53.eql(var54));
                    if (module0525.NIL != var55) {
                        SubLObject var56 = (SubLObject)module0525.NIL;
                        try {
                            var56 = module0158.f10316(var54, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var50);
                            SubLObject var52_116 = (SubLObject)module0525.NIL;
                            final SubLObject var53_117 = (SubLObject)module0525.NIL;
                            while (module0525.NIL == var52_116) {
                                final SubLObject var57 = module0052.f3695(var56, var53_117);
                                final SubLObject var55_118 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_117.eql(var57));
                                if (module0525.NIL != var55_118) {
                                    var48 = f32691(var57, var48);
                                }
                                var52_116 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_118);
                            }
                        }
                        finally {
                            final SubLObject var58 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                if (module0525.NIL != var56) {
                                    module0158.f10319(var56);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var58);
                            }
                        }
                    }
                    var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55);
                }
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return f32692(var48);
    }
    
    public static SubLObject f32782(final SubLObject var46, final SubLObject var28) {
        final SubLObject var47 = module0205.f13333(var46);
        if (module0525.NIL != module0202.f12598(var46)) {
            final SubLObject var48 = module0439.f30674(var46);
            final SubLObject var49 = var47;
            if (module0525.NIL != module0351.f23566(var28)) {
                final SubLObject var50 = module0178.f11282(var28);
                SubLObject var51 = module0232.f15308(var50);
                SubLObject var52 = (SubLObject)module0525.NIL;
                var52 = var51.first();
                while (module0525.NIL != var51) {
                    if (var49.eql(module0205.f13333(var52))) {
                        final SubLObject var53 = module0235.f15479(var48, var52);
                        if (module0525.NIL != var53) {
                            return Values.values(var53, var52, var47);
                        }
                    }
                    var51 = var51.rest();
                    var52 = var51.first();
                }
            }
        }
        else {
            SubLObject var54 = module0205.f13275(var46, (SubLObject)module0525.UNPROVIDED);
            SubLObject var55 = (SubLObject)module0525.NIL;
            var55 = var54.first();
            while (module0525.NIL != var54) {
                if (!var55.equal(var46)) {
                    final SubLObject var56 = var47;
                    if (module0525.NIL != module0351.f23566(var28)) {
                        final SubLObject var57 = module0178.f11282(var28);
                        SubLObject var49_120 = module0232.f15308(var57);
                        SubLObject var58 = (SubLObject)module0525.NIL;
                        var58 = var49_120.first();
                        while (module0525.NIL != var49_120) {
                            if (var56.eql(module0205.f13333(var58))) {
                                final SubLObject var59 = module0235.f15479(var55, var58);
                                if (module0525.NIL != var59) {
                                    return Values.values(var59, var58, var47);
                                }
                            }
                            var49_120 = var49_120.rest();
                            var58 = var49_120.first();
                        }
                    }
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32783(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32782(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32784(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32782(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic40$, var48, f32682(var50));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32785(final SubLObject var121) {
        final SubLObject var122 = module0340.f22825(var121);
        return module0004.f104(var122, module0525.$g3861$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0525.EQL), (SubLObject)module0525.UNPROVIDED);
    }
    
    public static SubLObject f32786(final SubLObject var123) {
        return module0004.f104(var123, module0525.$g3861$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0525.EQL), (SubLObject)module0525.UNPROVIDED);
    }
    
    public static SubLObject f32787(final SubLObject var46) {
        return f32788(var46);
    }
    
    public static SubLObject f32789(final SubLObject var46) {
        return f32788(var46);
    }
    
    public static SubLObject f32790(final SubLObject var46) {
        return f32791((SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32792(final SubLObject var46) {
        return f32791((SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32793(final SubLObject var46) {
        return f32794((SubLObject)module0525.$ic40$);
    }
    
    public static SubLObject f32795(final SubLObject var46) {
        return f32794((SubLObject)module0525.$ic14$);
    }
    
    public static SubLObject f32796(final SubLObject var46, final SubLObject var28) {
        return f32797((SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32798(final SubLObject var46, final SubLObject var28) {
        return f32797((SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32799(final SubLObject var46, final SubLObject var28) {
        return f32800(var46, (SubLObject)module0525.$ic40$, var28);
    }
    
    public static SubLObject f32801(final SubLObject var46, final SubLObject var28) {
        return f32800(var46, (SubLObject)module0525.$ic14$, var28);
    }
    
    public static SubLObject f32788(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL != module0018.$g648$.getDynamicValue(var47) && (module0525.NIL == module0018.$g655$.getDynamicValue(var47) || module0525.NIL == module0193.f12105(var46) || module0525.NIL == f32684(var46)));
    }
    
    public static SubLObject f32791(final SubLObject var29) {
        return module0223.f14676(var29);
    }
    
    public static SubLObject f32802(final SubLObject var29) {
        SubLObject var30 = f32690();
        SubLObject var31 = module0351.f23567();
        SubLObject var32 = (SubLObject)module0525.NIL;
        var32 = var31.first();
        while (module0525.NIL != var31) {
            if (module0525.NIL != module0158.f10244(var29, var32)) {
                final SubLObject var33 = module0158.f10245(var29, var32);
                SubLObject var34 = (SubLObject)module0525.NIL;
                final SubLObject var35 = (SubLObject)module0525.NIL;
                while (module0525.NIL == var34) {
                    final SubLObject var36 = module0052.f3695(var33, var35);
                    final SubLObject var37 = (SubLObject)SubLObjectFactory.makeBoolean(!var35.eql(var36));
                    if (module0525.NIL != var37) {
                        SubLObject var38 = (SubLObject)module0525.NIL;
                        try {
                            var38 = module0158.f10316(var36, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var32);
                            SubLObject var52_125 = (SubLObject)module0525.NIL;
                            final SubLObject var53_126 = (SubLObject)module0525.NIL;
                            while (module0525.NIL == var52_125) {
                                final SubLObject var39 = module0052.f3695(var38, var53_126);
                                final SubLObject var55_127 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_126.eql(var39));
                                if (module0525.NIL != var55_127) {
                                    var30 = f32691(var39, var30);
                                }
                                var52_125 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_127);
                            }
                        }
                        finally {
                            final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                if (module0525.NIL != var38) {
                                    module0158.f10319(var38);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                            }
                        }
                    }
                    var34 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var37);
                }
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return f32692(var30);
    }
    
    public static SubLObject f32794(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0034.$g879$.getDynamicValue(var30);
        SubLObject var32 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var31) {
            return f32802(var29);
        }
        var32 = module0034.f1857(var31, (SubLObject)module0525.$ic82$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var32) {
            var32 = module0034.f1807(module0034.f1842(var31), (SubLObject)module0525.$ic82$, (SubLObject)module0525.ONE_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var31, (SubLObject)module0525.$ic82$, var32);
        }
        SubLObject var33 = module0034.f1814(var32, var29, (SubLObject)module0525.$ic47$);
        if (var33 == module0525.$ic47$) {
            var33 = Values.arg2(var30.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32802(var29)));
            module0034.f1816(var32, var29, var33, (SubLObject)module0525.UNPROVIDED);
        }
        return module0034.f1959(var33);
    }
    
    public static SubLObject f32797(final SubLObject var29, final SubLObject var28) {
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var30 = module0178.f11282(var28);
            if (module0525.$ic40$ == var29) {
                SubLObject var31 = module0232.f15308(var30);
                SubLObject var32 = (SubLObject)module0525.NIL;
                var32 = var31.first();
                while (module0525.NIL != var31) {
                    if (module0525.NIL != module0223.f14689(var32)) {
                        return (SubLObject)module0525.T;
                    }
                    var31 = var31.rest();
                    var32 = var31.first();
                }
            }
            else if (module0525.$ic14$ == var29) {
                SubLObject var31 = module0232.f15306(var30);
                SubLObject var32 = (SubLObject)module0525.NIL;
                var32 = var31.first();
                while (module0525.NIL != var31) {
                    if (module0525.NIL != module0223.f14689(var32)) {
                        return (SubLObject)module0525.T;
                    }
                    var31 = var31.rest();
                    var32 = var31.first();
                }
            }
            else {
                Errors.error((SubLObject)module0525.$ic48$, var29);
            }
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32800(final SubLObject var46, final SubLObject var29, final SubLObject var28) {
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var47 = module0178.f11282(var28);
            if (module0525.$ic40$ == var29) {
                SubLObject var48 = module0232.f15308(var47);
                SubLObject var49 = (SubLObject)module0525.NIL;
                var49 = var48.first();
                while (module0525.NIL != var48) {
                    if (module0525.NIL != module0223.f14689(var49)) {
                        final SubLObject var50 = module0235.f15479(var46, var49);
                        if (module0525.NIL != var50) {
                            module0347.f23328(var28, var49, var29, var50, (SubLObject)module0525.UNPROVIDED);
                        }
                    }
                    var48 = var48.rest();
                    var49 = var48.first();
                }
            }
            else if (module0525.$ic14$ == var29) {
                SubLObject var48 = module0232.f15306(var47);
                SubLObject var49 = (SubLObject)module0525.NIL;
                var49 = var48.first();
                while (module0525.NIL != var48) {
                    if (module0525.NIL != module0223.f14689(var49)) {
                        final SubLObject var50 = module0235.f15479(var46, var49);
                        if (module0525.NIL != var50) {
                            module0347.f23328(var28, var49, var29, var50, (SubLObject)module0525.UNPROVIDED);
                        }
                    }
                    var48 = var48.rest();
                    var49 = var48.first();
                }
            }
            else {
                Errors.error((SubLObject)module0525.$ic48$, var29);
            }
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32803(final SubLObject var123) {
        return module0004.f104(var123, module0525.$g3862$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0525.EQL), (SubLObject)module0525.UNPROVIDED);
    }
    
    public static SubLObject f32804(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL != module0018.$g644$.getDynamicValue(var47) || module0525.NIL != module0349.f23477(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED), module0147.$g2095$.getDynamicValue(var47)));
    }
    
    public static SubLObject f32805(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return module0018.$g644$.getDynamicValue(var47);
    }
    
    public static SubLObject f32806(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (module0525.NIL != module0349.f23463(var46, module0147.$g2095$.getDynamicValue(var47))) {
            return f32807(var46, module0147.$g2095$.getDynamicValue(var47));
        }
        return module0549.f33901(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32808(final SubLObject var46) {
        return module0549.f33899(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32809(final SubLObject var128, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = (SubLObject)module0525.NIL;
        }
        return module0256.f16552(var128, var92, (SubLObject)module0525.UNPROVIDED);
    }
    
    public static SubLObject f32810(final SubLObject var128, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = (SubLObject)module0525.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        final SubLObject var130 = module0034.$g879$.getDynamicValue(var129);
        SubLObject var131 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var130) {
            return f32809(var128, var92);
        }
        var131 = module0034.f1857(var130, (SubLObject)module0525.$ic84$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var131) {
            var131 = module0034.f1807(module0034.f1842(var130), (SubLObject)module0525.$ic84$, (SubLObject)module0525.TWO_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var130, (SubLObject)module0525.$ic84$, var131);
        }
        final SubLObject var132 = module0034.f1782(var128, var92);
        final SubLObject var133 = module0034.f1814(var131, var132, (SubLObject)module0525.UNPROVIDED);
        if (var133 != module0525.$ic47$) {
            SubLObject var134 = var133;
            SubLObject var135 = (SubLObject)module0525.NIL;
            var135 = var134.first();
            while (module0525.NIL != var134) {
                SubLObject var136 = var135.first();
                final SubLObject var137 = conses_high.second(var135);
                if (var128.eql(var136.first())) {
                    var136 = var136.rest();
                    if (module0525.NIL != var136 && module0525.NIL == var136.rest() && var92.eql(var136.first())) {
                        return module0034.f1959(var137);
                    }
                }
                var134 = var134.rest();
                var135 = var134.first();
            }
        }
        final SubLObject var138 = Values.arg2(var129.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32809(var128, var92)));
        module0034.f1836(var131, var132, var133, var138, (SubLObject)ConsesLow.list(var128, var92));
        return module0034.f1959(var138);
    }
    
    public static SubLObject f32811(final SubLObject var46, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var94 = (SubLObject)module0525.NIL;
        final SubLObject var95 = module0147.$g2095$.currentBinding(var93);
        final SubLObject var96 = module0147.$g2094$.currentBinding(var93);
        final SubLObject var97 = module0147.$g2096$.currentBinding(var93);
        try {
            module0147.$g2095$.bind(module0147.f9545(var92), var93);
            module0147.$g2094$.bind(module0147.f9546(var92), var93);
            module0147.$g2096$.bind(module0147.f9549(var92), var93);
            var94 = Sequences.length(f32812(var46));
        }
        finally {
            module0147.$g2096$.rebind(var97, var93);
            module0147.$g2094$.rebind(var96, var93);
            module0147.$g2095$.rebind(var95, var93);
        }
        return var94;
    }
    
    public static SubLObject f32807(final SubLObject var46, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        final SubLObject var94 = module0034.$g879$.getDynamicValue(var93);
        SubLObject var95 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var94) {
            return f32811(var46, var92);
        }
        var95 = module0034.f1857(var94, (SubLObject)module0525.$ic85$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var95) {
            var95 = module0034.f1807(module0034.f1842(var94), (SubLObject)module0525.$ic85$, (SubLObject)module0525.TWO_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQUAL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var94, (SubLObject)module0525.$ic85$, var95);
        }
        final SubLObject var96 = module0034.f1782(var46, var92);
        final SubLObject var97 = module0034.f1814(var95, var96, (SubLObject)module0525.UNPROVIDED);
        if (var97 != module0525.$ic47$) {
            SubLObject var98 = var97;
            SubLObject var99 = (SubLObject)module0525.NIL;
            var99 = var98.first();
            while (module0525.NIL != var98) {
                SubLObject var100 = var99.first();
                final SubLObject var101 = conses_high.second(var99);
                if (var46.equal(var100.first())) {
                    var100 = var100.rest();
                    if (module0525.NIL != var100 && module0525.NIL == var100.rest() && var92.equal(var100.first())) {
                        return module0034.f1959(var101);
                    }
                }
                var98 = var98.rest();
                var99 = var98.first();
            }
        }
        final SubLObject var102 = Values.arg2(var93.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32811(var46, var92)));
        module0034.f1836(var95, var96, var97, var102, (SubLObject)ConsesLow.list(var46, var92));
        return module0034.f1959(var102);
    }
    
    public static SubLObject f32812(final SubLObject var46) {
        SubLObject var47 = f32690();
        final SubLObject var48 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        SubLObject var50;
        final SubLObject var49 = var50 = f32810(var48, (SubLObject)module0525.NIL);
        SubLObject var51 = (SubLObject)module0525.NIL;
        var51 = var50.first();
        while (module0525.NIL != var50) {
            SubLObject var49_136 = module0351.f23567();
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var49_136.first();
            while (module0525.NIL != var49_136) {
                if (module0525.NIL != module0158.f10135(var51, (SubLObject)module0525.$ic40$, var52)) {
                    final SubLObject var53 = module0158.f10137(var51, (SubLObject)module0525.$ic40$, var52);
                    SubLObject var54 = (SubLObject)module0525.NIL;
                    final SubLObject var55 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var54) {
                        final SubLObject var56 = module0052.f3695(var53, var55);
                        final SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(!var55.eql(var56));
                        if (module0525.NIL != var57) {
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            try {
                                var58 = module0158.f10316(var56, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var52);
                                SubLObject var52_138 = (SubLObject)module0525.NIL;
                                final SubLObject var53_139 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_138) {
                                    final SubLObject var59 = module0052.f3695(var58, var53_139);
                                    final SubLObject var55_140 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_139.eql(var59));
                                    if (module0525.NIL != var55_140) {
                                        var47 = f32691(var59, var47);
                                    }
                                    var52_138 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_140);
                                }
                            }
                            finally {
                                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var58) {
                                        module0158.f10319(var58);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
                                }
                            }
                        }
                        var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var57);
                    }
                }
                var49_136 = var49_136.rest();
                var52 = var49_136.first();
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return f32692(var47);
    }
    
    public static SubLObject f32813(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13387(var46, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var49 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var50 = module0178.f11282(var28);
            SubLObject var51 = module0232.f15308(var50);
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var51.first();
            while (module0525.NIL != var51) {
                if (module0525.$ic86$.eql(module0205.f13333(var52))) {
                    final SubLObject var53 = module0205.f13388(var52, (SubLObject)module0525.UNPROVIDED);
                    if (module0525.NIL != module0193.f12105(var53) && module0525.NIL != module0256.f16596(var53, var49, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED)) {
                        var47.resetMultipleValues();
                        final SubLObject var54 = module0235.f15474(var48, module0205.f13387(var52, (SubLObject)module0525.UNPROVIDED), (SubLObject)module0525.NIL, (SubLObject)module0525.T);
                        final SubLObject var55 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        if (module0525.NIL != var54) {
                            return Values.values(var54, var52, var49, var53, var55);
                        }
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32814(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32813(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32815(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32813(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var53 = f32677(var51, var50);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic40$, var48, ConsesLow.append(var53, var52));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32816(final SubLObject var46) {
        SubLObject var47 = f32690();
        final SubLObject var48 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        SubLObject var50;
        final SubLObject var49 = var50 = module0256.f16531(var48, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED);
        SubLObject var51 = (SubLObject)module0525.NIL;
        var51 = var50.first();
        while (module0525.NIL != var50) {
            SubLObject var49_146 = module0351.f23567();
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var49_146.first();
            while (module0525.NIL != var49_146) {
                if (module0525.NIL != module0158.f10135(var51, (SubLObject)module0525.$ic14$, var52)) {
                    final SubLObject var53 = module0158.f10137(var51, (SubLObject)module0525.$ic14$, var52);
                    SubLObject var54 = (SubLObject)module0525.NIL;
                    final SubLObject var55 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var54) {
                        final SubLObject var56 = module0052.f3695(var53, var55);
                        final SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(!var55.eql(var56));
                        if (module0525.NIL != var57) {
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            try {
                                var58 = module0158.f10316(var56, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var52);
                                SubLObject var52_147 = (SubLObject)module0525.NIL;
                                final SubLObject var53_148 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_147) {
                                    final SubLObject var59 = module0052.f3695(var58, var53_148);
                                    final SubLObject var55_149 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_148.eql(var59));
                                    if (module0525.NIL != var55_149) {
                                        var47 = f32691(var59, var47);
                                    }
                                    var52_147 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_149);
                                }
                            }
                            finally {
                                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var58) {
                                        module0158.f10319(var58);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
                                }
                            }
                        }
                        var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var57);
                    }
                }
                var49_146 = var49_146.rest();
                var52 = var49_146.first();
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return f32692(var47);
    }
    
    public static SubLObject f32817(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13387(var46, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var49 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var50 = module0178.f11282(var28);
            SubLObject var51 = module0232.f15306(var50);
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var51.first();
            while (module0525.NIL != var51) {
                if (module0525.$ic86$.eql(module0205.f13333(var52))) {
                    final SubLObject var53 = module0205.f13388(var52, (SubLObject)module0525.UNPROVIDED);
                    if (module0525.NIL != module0193.f12105(var53) && module0525.NIL != module0256.f16596(var49, var53, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED)) {
                        var47.resetMultipleValues();
                        final SubLObject var54 = module0235.f15474(var48, module0205.f13387(var52, (SubLObject)module0525.UNPROVIDED), (SubLObject)module0525.NIL, (SubLObject)module0525.T);
                        final SubLObject var55 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        if (module0525.NIL != var54) {
                            return Values.values(var54, var52, var49, var53, var55);
                        }
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32818(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32817(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32819(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32817(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var53 = f32677(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic14$, var48, ConsesLow.append(var53, var52));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32820(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return module0018.$g644$.getDynamicValue(var47);
    }
    
    public static SubLObject f32821(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return module0018.$g644$.getDynamicValue(var47);
    }
    
    public static SubLObject f32822(final SubLObject var46) {
        return module0549.f33901(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32823(final SubLObject var46) {
        return module0549.f33899(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32824(final SubLObject var46) {
        SubLObject var47 = f32690();
        final SubLObject var48 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        SubLObject var50;
        final SubLObject var49 = var50 = f32810(var48, (SubLObject)module0525.NIL);
        SubLObject var51 = (SubLObject)module0525.NIL;
        var51 = var50.first();
        while (module0525.NIL != var50) {
            SubLObject var49_150 = module0351.f23567();
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var49_150.first();
            while (module0525.NIL != var49_150) {
                if (module0525.NIL != module0158.f10143(var51, (SubLObject)module0525.$ic40$, var52)) {
                    final SubLObject var53 = module0158.f10144(var51, (SubLObject)module0525.$ic40$, var52);
                    SubLObject var54 = (SubLObject)module0525.NIL;
                    final SubLObject var55 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var54) {
                        final SubLObject var56 = module0052.f3695(var53, var55);
                        final SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(!var55.eql(var56));
                        if (module0525.NIL != var57) {
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            try {
                                var58 = module0158.f10316(var56, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var52);
                                SubLObject var52_152 = (SubLObject)module0525.NIL;
                                final SubLObject var53_153 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_152) {
                                    final SubLObject var59 = module0052.f3695(var58, var53_153);
                                    final SubLObject var55_154 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_153.eql(var59));
                                    if (module0525.NIL != var55_154) {
                                        var47 = f32691(var59, var47);
                                    }
                                    var52_152 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_154);
                                }
                            }
                            finally {
                                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var58) {
                                        module0158.f10319(var58);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
                                }
                            }
                        }
                        var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var57);
                    }
                }
                var49_150 = var49_150.rest();
                var52 = var49_150.first();
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return f32692(var47);
    }
    
    public static SubLObject f32825(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13387(var46, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var49 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var50 = module0178.f11282(var28);
            SubLObject var51 = module0232.f15308(var50);
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var51.first();
            while (module0525.NIL != var51) {
                if (module0525.$ic0$.eql(module0205.f13333(var52))) {
                    final SubLObject var53 = module0205.f13388(var52, (SubLObject)module0525.UNPROVIDED);
                    if (module0525.NIL != module0193.f12105(var53) && module0525.NIL != module0256.f16596(var53, var49, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED)) {
                        var47.resetMultipleValues();
                        final SubLObject var54 = module0235.f15474(var48, module0205.f13387(var52, (SubLObject)module0525.UNPROVIDED), (SubLObject)module0525.NIL, (SubLObject)module0525.T);
                        final SubLObject var55 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        if (module0525.NIL != var54) {
                            return Values.values(var54, var52, var49, var53, var55);
                        }
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32826(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32825(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32827(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32825(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var53 = f32677(var51, var50);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic40$, var48, ConsesLow.append(var53, var52));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32828(final SubLObject var46) {
        SubLObject var47 = f32690();
        final SubLObject var48 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        SubLObject var50;
        final SubLObject var49 = var50 = module0256.f16531(var48, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED);
        SubLObject var51 = (SubLObject)module0525.NIL;
        var51 = var50.first();
        while (module0525.NIL != var50) {
            SubLObject var49_155 = module0351.f23567();
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var49_155.first();
            while (module0525.NIL != var49_155) {
                if (module0525.NIL != module0158.f10143(var51, (SubLObject)module0525.$ic14$, var52)) {
                    final SubLObject var53 = module0158.f10144(var51, (SubLObject)module0525.$ic14$, var52);
                    SubLObject var54 = (SubLObject)module0525.NIL;
                    final SubLObject var55 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var54) {
                        final SubLObject var56 = module0052.f3695(var53, var55);
                        final SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(!var55.eql(var56));
                        if (module0525.NIL != var57) {
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            try {
                                var58 = module0158.f10316(var56, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var52);
                                SubLObject var52_156 = (SubLObject)module0525.NIL;
                                final SubLObject var53_157 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_156) {
                                    final SubLObject var59 = module0052.f3695(var58, var53_157);
                                    final SubLObject var55_158 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_157.eql(var59));
                                    if (module0525.NIL != var55_158) {
                                        var47 = f32691(var59, var47);
                                    }
                                    var52_156 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_158);
                                }
                            }
                            finally {
                                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var58) {
                                        module0158.f10319(var58);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
                                }
                            }
                        }
                        var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var57);
                    }
                }
                var49_155 = var49_155.rest();
                var52 = var49_155.first();
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return f32692(var47);
    }
    
    public static SubLObject f32829(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13387(var46, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var49 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var50 = module0178.f11282(var28);
            SubLObject var51 = module0232.f15306(var50);
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var51.first();
            while (module0525.NIL != var51) {
                if (module0525.$ic0$.eql(module0205.f13333(var52))) {
                    final SubLObject var53 = module0205.f13388(var52, (SubLObject)module0525.UNPROVIDED);
                    if (module0525.NIL != module0193.f12105(var53) && module0525.NIL != module0256.f16596(var49, var53, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED)) {
                        var47.resetMultipleValues();
                        final SubLObject var54 = module0235.f15474(var48, module0205.f13387(var52, (SubLObject)module0525.UNPROVIDED), (SubLObject)module0525.NIL, (SubLObject)module0525.T);
                        final SubLObject var55 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        if (module0525.NIL != var54) {
                            return Values.values(var54, var52, var49, var53, var55);
                        }
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32830(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32829(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32831(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32829(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var53 = f32677(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic14$, var48, ConsesLow.append(var53, var52));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32832(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return module0018.$g644$.getDynamicValue(var47);
    }
    
    public static SubLObject f32833(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        return module0018.$g644$.getDynamicValue(var47);
    }
    
    public static SubLObject f32834(final SubLObject var46) {
        return module0549.f33901(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32835(final SubLObject var46) {
        return module0549.f33899(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32836(final SubLObject var159, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = (SubLObject)module0525.NIL;
        }
        return module0262.f17312(var159, var92, (SubLObject)module0525.UNPROVIDED);
    }
    
    public static SubLObject f32837(final SubLObject var159, SubLObject var92) {
        if (var92 == module0525.UNPROVIDED) {
            var92 = (SubLObject)module0525.NIL;
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = module0034.$g879$.getDynamicValue(var160);
        SubLObject var162 = (SubLObject)module0525.NIL;
        if (module0525.NIL == var161) {
            return f32836(var159, var92);
        }
        var162 = module0034.f1857(var161, (SubLObject)module0525.$ic95$, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL == var162) {
            var162 = module0034.f1807(module0034.f1842(var161), (SubLObject)module0525.$ic95$, (SubLObject)module0525.TWO_INTEGER, (SubLObject)module0525.NIL, (SubLObject)module0525.EQL, (SubLObject)module0525.UNPROVIDED);
            module0034.f1860(var161, (SubLObject)module0525.$ic95$, var162);
        }
        final SubLObject var163 = module0034.f1782(var159, var92);
        final SubLObject var164 = module0034.f1814(var162, var163, (SubLObject)module0525.UNPROVIDED);
        if (var164 != module0525.$ic47$) {
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0525.NIL;
            var166 = var165.first();
            while (module0525.NIL != var165) {
                SubLObject var167 = var166.first();
                final SubLObject var168 = conses_high.second(var166);
                if (var159.eql(var167.first())) {
                    var167 = var167.rest();
                    if (module0525.NIL != var167 && module0525.NIL == var167.rest() && var92.eql(var167.first())) {
                        return module0034.f1959(var168);
                    }
                }
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        final SubLObject var169 = Values.arg2(var160.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32836(var159, var92)));
        module0034.f1836(var162, var163, var164, var169, (SubLObject)ConsesLow.list(var159, var92));
        return module0034.f1959(var169);
    }
    
    public static SubLObject f32838(final SubLObject var46) {
        SubLObject var47 = f32690();
        final SubLObject var48 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        SubLObject var50;
        final SubLObject var49 = var50 = f32837(var48, (SubLObject)module0525.NIL);
        SubLObject var51 = (SubLObject)module0525.NIL;
        var51 = var50.first();
        while (module0525.NIL != var50) {
            SubLObject var49_162 = module0351.f23567();
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var49_162.first();
            while (module0525.NIL != var49_162) {
                if (module0525.NIL != module0158.f10146(var51, (SubLObject)module0525.$ic40$, var52)) {
                    final SubLObject var53 = module0158.f10147(var51, (SubLObject)module0525.$ic40$, var52);
                    SubLObject var54 = (SubLObject)module0525.NIL;
                    final SubLObject var55 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var54) {
                        final SubLObject var56 = module0052.f3695(var53, var55);
                        final SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(!var55.eql(var56));
                        if (module0525.NIL != var57) {
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            try {
                                var58 = module0158.f10316(var56, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var52);
                                SubLObject var52_164 = (SubLObject)module0525.NIL;
                                final SubLObject var53_165 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_164) {
                                    final SubLObject var59 = module0052.f3695(var58, var53_165);
                                    final SubLObject var55_166 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_165.eql(var59));
                                    if (module0525.NIL != var55_166) {
                                        var47 = f32691(var59, var47);
                                    }
                                    var52_164 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_166);
                                }
                            }
                            finally {
                                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var58) {
                                        module0158.f10319(var58);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
                                }
                            }
                        }
                        var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var57);
                    }
                }
                var49_162 = var49_162.rest();
                var52 = var49_162.first();
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return f32692(var47);
    }
    
    public static SubLObject f32839(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13387(var46, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var49 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var50 = module0178.f11282(var28);
            SubLObject var51 = module0232.f15308(var50);
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var51.first();
            while (module0525.NIL != var51) {
                if (module0525.$ic2$.eql(module0205.f13333(var52))) {
                    final SubLObject var53 = module0205.f13388(var52, (SubLObject)module0525.UNPROVIDED);
                    if (module0525.NIL != module0193.f12105(var53) && module0525.NIL != module0262.f17336(var53, var49, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED)) {
                        var47.resetMultipleValues();
                        final SubLObject var54 = module0235.f15474(var48, module0205.f13387(var52, (SubLObject)module0525.UNPROVIDED), (SubLObject)module0525.NIL, (SubLObject)module0525.T);
                        final SubLObject var55 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        if (module0525.NIL != var54) {
                            return Values.values(var54, var52, var49, var53, var55);
                        }
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32840(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32839(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32841(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32839(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var53 = f32678(var51, var50);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic40$, var48, ConsesLow.append(var53, var52));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32842(final SubLObject var46) {
        SubLObject var47 = f32690();
        final SubLObject var48 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        SubLObject var50;
        final SubLObject var49 = var50 = module0262.f17311(var48, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED);
        SubLObject var51 = (SubLObject)module0525.NIL;
        var51 = var50.first();
        while (module0525.NIL != var50) {
            SubLObject var49_170 = module0351.f23567();
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var49_170.first();
            while (module0525.NIL != var49_170) {
                if (module0525.NIL != module0158.f10146(var51, (SubLObject)module0525.$ic14$, var52)) {
                    final SubLObject var53 = module0158.f10147(var51, (SubLObject)module0525.$ic14$, var52);
                    SubLObject var54 = (SubLObject)module0525.NIL;
                    final SubLObject var55 = (SubLObject)module0525.NIL;
                    while (module0525.NIL == var54) {
                        final SubLObject var56 = module0052.f3695(var53, var55);
                        final SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(!var55.eql(var56));
                        if (module0525.NIL != var57) {
                            SubLObject var58 = (SubLObject)module0525.NIL;
                            try {
                                var58 = module0158.f10316(var56, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var52);
                                SubLObject var52_171 = (SubLObject)module0525.NIL;
                                final SubLObject var53_172 = (SubLObject)module0525.NIL;
                                while (module0525.NIL == var52_171) {
                                    final SubLObject var59 = module0052.f3695(var58, var53_172);
                                    final SubLObject var55_173 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_172.eql(var59));
                                    if (module0525.NIL != var55_173) {
                                        var47 = f32691(var59, var47);
                                    }
                                    var52_171 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_173);
                                }
                            }
                            finally {
                                final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                    if (module0525.NIL != var58) {
                                        module0158.f10319(var58);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
                                }
                            }
                        }
                        var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var57);
                    }
                }
                var49_170 = var49_170.rest();
                var52 = var49_170.first();
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return f32692(var47);
    }
    
    public static SubLObject f32843(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13387(var46, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var49 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var50 = module0178.f11282(var28);
            SubLObject var51 = module0232.f15306(var50);
            SubLObject var52 = (SubLObject)module0525.NIL;
            var52 = var51.first();
            while (module0525.NIL != var51) {
                if (module0525.$ic2$.eql(module0205.f13333(var52))) {
                    final SubLObject var53 = module0205.f13388(var52, (SubLObject)module0525.UNPROVIDED);
                    if (module0525.NIL != module0193.f12105(var53) && module0525.NIL != module0262.f17336(var49, var53, (SubLObject)module0525.NIL, (SubLObject)module0525.UNPROVIDED)) {
                        var47.resetMultipleValues();
                        final SubLObject var54 = module0235.f15474(var48, module0205.f13387(var52, (SubLObject)module0525.UNPROVIDED), (SubLObject)module0525.NIL, (SubLObject)module0525.T);
                        final SubLObject var55 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        if (module0525.NIL != var54) {
                            return Values.values(var54, var52, var49, var53, var55);
                        }
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32844(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32843(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32845(final SubLObject var46, final SubLObject var28) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = f32843(var46, var28);
        final SubLObject var49 = var47.secondMultipleValue();
        final SubLObject var50 = var47.thirdMultipleValue();
        final SubLObject var51 = var47.fourthMultipleValue();
        final SubLObject var52 = var47.fifthMultipleValue();
        var47.resetMultipleValues();
        if (module0525.NIL != var48) {
            final SubLObject var53 = f32678(var50, var51);
            module0347.f23328(var28, var49, (SubLObject)module0525.$ic14$, var48, ConsesLow.append(var53, var52));
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32846(final SubLObject var46) {
        return module0217.f14320(module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32847(final SubLObject var46) {
        final SubLObject var47 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        SubLObject var48 = f32690();
        SubLObject var49 = module0351.f23567();
        SubLObject var50 = (SubLObject)module0525.NIL;
        var50 = var49.first();
        while (module0525.NIL != var49) {
            if (module0525.NIL != module0158.f10198(var47, var50)) {
                final SubLObject var51 = module0158.f10199(var47, var50);
                SubLObject var52 = (SubLObject)module0525.NIL;
                final SubLObject var53 = (SubLObject)module0525.NIL;
                while (module0525.NIL == var52) {
                    final SubLObject var54 = module0052.f3695(var51, var53);
                    final SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(!var53.eql(var54));
                    if (module0525.NIL != var55) {
                        SubLObject var56 = (SubLObject)module0525.NIL;
                        try {
                            var56 = module0158.f10316(var54, (SubLObject)module0525.$ic46$, (SubLObject)module0525.NIL, var50);
                            SubLObject var52_176 = (SubLObject)module0525.NIL;
                            final SubLObject var53_177 = (SubLObject)module0525.NIL;
                            while (module0525.NIL == var52_176) {
                                final SubLObject var57 = module0052.f3695(var56, var53_177);
                                final SubLObject var55_179 = (SubLObject)SubLObjectFactory.makeBoolean(!var53_177.eql(var57));
                                if (module0525.NIL != var55_179) {
                                    var48 = f32691(var57, var48);
                                }
                                var52_176 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55_179);
                            }
                        }
                        finally {
                            final SubLObject var58 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0525.T);
                                if (module0525.NIL != var56) {
                                    module0158.f10319(var56);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var58);
                            }
                        }
                    }
                    var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL == var55);
                }
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return f32692(var48);
    }
    
    public static SubLObject f32848(final SubLObject var46, final SubLObject var178) {
        final SubLObject var179 = module0205.f13388(var46, (SubLObject)module0525.UNPROVIDED);
        final SubLObject var180 = module0525.$ic100$;
        if (module0525.NIL != module0351.f23566(var178)) {
            final SubLObject var181 = module0178.f11282(var178);
            SubLObject var182 = module0232.f15308(var181);
            SubLObject var183 = (SubLObject)module0525.NIL;
            var183 = var182.first();
            while (module0525.NIL != var182) {
                if (var180.eql(module0205.f13333(var183)) && var179.eql(module0205.f13388(var183, (SubLObject)module0525.UNPROVIDED))) {
                    final SubLObject var184 = module0235.f15479(var46, var183);
                    if (module0525.NIL != var184) {
                        return Values.values(var184, var183);
                    }
                }
                var182 = var182.rest();
                var183 = var182.first();
            }
        }
        return Values.values((SubLObject)module0525.NIL, (SubLObject)module0525.NIL);
    }
    
    public static SubLObject f32849(final SubLObject var46, final SubLObject var178) {
        final SubLThread var179 = SubLProcess.currentSubLThread();
        var179.resetMultipleValues();
        final SubLObject var180 = f32848(var46, var178);
        final SubLObject var181 = var179.secondMultipleValue();
        var179.resetMultipleValues();
        if (module0525.NIL != var180) {
            return (SubLObject)module0525.T;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32850(final SubLObject var46, final SubLObject var178) {
        final SubLThread var179 = SubLProcess.currentSubLThread();
        var179.resetMultipleValues();
        final SubLObject var180 = f32848(var46, var178);
        final SubLObject var181 = var179.secondMultipleValue();
        var179.resetMultipleValues();
        if (module0525.NIL != var180) {
            module0347.f23328(var178, var181, (SubLObject)module0525.$ic40$, var180, (SubLObject)module0525.UNPROVIDED);
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32851(final SubLObject var46, SubLObject var29) {
        if (var29 == module0525.UNPROVIDED) {
            var29 = (SubLObject)module0525.NIL;
        }
        final SubLObject var47 = module0373.f26113();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0525.NIL != var47 && module0525.NIL != module0361.f24171(var47) && module0525.NIL != module0536.f33285(var46, (SubLObject)module0525.UNPROVIDED, (SubLObject)module0525.UNPROVIDED));
    }
    
    public static SubLObject f32852() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0525.NIL != module0525.$g3864$.getDynamicValue(var15)) {
            return module0525.$g3864$.getDynamicValue(var15);
        }
        final SubLObject var16 = module0538.f33373(module0525.$g3863$.getDynamicValue(var15), module0132.$g1546$.getGlobalValue());
        if (module0525.NIL != var16) {
            module0525.$g3864$.setDynamicValue(var16, var15);
            return var16;
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32853(final SubLObject var46) {
        return f32852();
    }
    
    public static SubLObject f32854(final SubLObject var46, final SubLObject var28) {
        return module0004.f104(var28, f32852(), Symbols.symbol_function((SubLObject)module0525.EQL), (SubLObject)module0525.UNPROVIDED);
    }
    
    public static SubLObject f32855(final SubLObject var46, final SubLObject var28) {
        final SubLObject var47 = module0205.f13333(var46);
        final SubLObject var48 = (SubLObject)module0525.$ic40$;
        final SubLObject var49 = var47;
        if (module0525.NIL != module0351.f23566(var28)) {
            final SubLObject var50 = module0178.f11282(var28);
            if (module0525.$ic40$ == var48) {
                SubLObject var51 = module0232.f15308(var50);
                SubLObject var52 = (SubLObject)module0525.NIL;
                var52 = var51.first();
                while (module0525.NIL != var51) {
                    if (var49.eql(module0205.f13333(var52))) {
                        final SubLObject var53 = module0235.f15479(var46, var52);
                        if (module0525.NIL != var53) {
                            module0347.f23328(var28, var52, var48, var53, (SubLObject)module0525.UNPROVIDED);
                        }
                    }
                    var51 = var51.rest();
                    var52 = var51.first();
                }
            }
            else if (module0525.$ic14$ == var48) {
                SubLObject var51 = module0232.f15306(var50);
                SubLObject var52 = (SubLObject)module0525.NIL;
                var52 = var51.first();
                while (module0525.NIL != var51) {
                    if (var49.eql(module0205.f13333(var52))) {
                        final SubLObject var53 = module0235.f15479(var46, var52);
                        if (module0525.NIL != var53) {
                            module0347.f23328(var28, var52, var48, var53, (SubLObject)module0525.UNPROVIDED);
                        }
                    }
                    var51 = var51.rest();
                    var52 = var51.first();
                }
            }
            else {
                Errors.error((SubLObject)module0525.$ic48$, var48);
            }
        }
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32856() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32677", "S#36136", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32678", "S#36137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32679", "S#36138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32680", "S#36139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32681", "S#36140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32682", "S#36141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32683", "S#36142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32684", "S#36143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32685", "S#36144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32686", "S#29251", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0525", "f32687", "S#36145");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0525", "f32688", "S#36146");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0525", "f32689", "S#36147");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32690", "S#36148", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32691", "S#36149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32692", "S#36150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32693", "S#29934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32694", "S#36151", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32695", "S#36122", 1, 0, false);
        new $f32695$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32697", "S#36152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32698", "S#36123", 1, 0, false);
        new $f32698$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32700", "S#36153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32701", "S#36124", 1, 0, false);
        new $f32701$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32703", "S#36154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32704", "S#36125", 2, 0, false);
        new $f32704$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32706", "S#36155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32707", "S#36126", 2, 0, false);
        new $f32707$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32709", "S#36156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32696", "S#36157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32699", "S#36158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32702", "S#36159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32711", "S#36160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32710", "S#36161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32705", "S#36162", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32708", "S#36163", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32712", "S#36127", 1, 0, false);
        new $f32712$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32714", "S#36164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32715", "S#36128", 1, 0, false);
        new $f32715$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32716", "S#36165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32717", "S#36129", 1, 0, false);
        new $f32717$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32719", "S#36166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32718", "S#36167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32720", "S#36168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32721", "S#36169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32723", "S#36170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32724", "S#36171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32725", "S#36172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32726", "S#36173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32727", "S#36174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32713", "S#36175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32728", "S#36176", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32722", "S#36177", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32729", "S#36178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32730", "S#36179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32731", "S#36180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32732", "S#36181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32733", "S#36182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32735", "S#36183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32734", "S#36184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32736", "S#36185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32737", "S#36186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32739", "S#36187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32740", "S#36188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32741", "S#36189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32742", "S#36190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32743", "S#36191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32744", "S#36192", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32738", "S#36193", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32745", "S#36194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32746", "S#36195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32747", "S#36196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32748", "S#36197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32749", "S#36198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32750", "S#36199", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32751", "S#36200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32752", "S#36201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32753", "S#36202", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32754", "S#36203", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32755", "S#36204", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32756", "S#36130", 1, 0, false);
        new $f32756$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32757", "S#36205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32758", "S#36131", 1, 0, false);
        new $f32758$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32759", "S#36206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32760", "S#36132", 2, 0, false);
        new $f32760$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32761", "S#36207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32762", "S#36133", 2, 0, false);
        new $f32762$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32763", "S#36208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32764", "S#36209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32765", "S#36210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32766", "S#36211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32767", "S#36212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32768", "S#36213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32769", "S#36214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32770", "S#36215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32771", "S#36216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32772", "S#36217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32773", "S#36218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32774", "S#36219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32775", "S#36220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32776", "S#36221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32777", "S#36222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32778", "S#36223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32779", "S#36224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32780", "S#36225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32781", "S#36226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32782", "S#36227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32783", "S#36228", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32784", "S#36229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32785", "S#30358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32786", "S#31808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32787", "S#36134", 1, 0, false);
        new $f32787$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32789", "S#36230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32790", "S#36135", 1, 0, false);
        new $f32790$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32792", "S#36231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32793", "S#36232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32795", "S#36233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32796", "S#36234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32798", "S#36235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32799", "S#36236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32801", "S#36237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32788", "S#36238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32791", "S#36239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32802", "S#36240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32794", "S#36241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32797", "S#36242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32800", "S#36243", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32803", "S#31809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32804", "S#36244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32805", "S#36245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32806", "S#36246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32808", "S#36247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32809", "S#36248", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32810", "S#36249", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32811", "S#36250", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32807", "S#36251", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32812", "S#36252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32813", "S#36253", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32814", "S#36254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32815", "S#36255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32816", "S#36256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32817", "S#36257", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32818", "S#36258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32819", "S#36259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32820", "S#36260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32821", "S#36261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32822", "S#36262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32823", "S#36263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32824", "S#36264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32825", "S#36265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32826", "S#36266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32827", "S#36267", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32828", "S#36268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32829", "S#36269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32830", "S#36270", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32831", "S#36271", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32832", "S#36272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32833", "S#36273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32834", "S#36274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32835", "S#36275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32836", "S#36276", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32837", "S#36277", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32838", "S#36278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32839", "S#36279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32840", "S#36280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32841", "S#36281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32842", "S#36282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32843", "S#36283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32844", "S#36284", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32845", "S#36285", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32846", "S#36286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32847", "S#36287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32848", "S#36288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32849", "S#36289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32850", "S#36290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32851", "S#36291", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32852", "S#36292", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32853", "S#36293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32854", "S#36294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0525", "f32855", "S#36295", 2, 0, false);
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32857() {
        module0525.$g3860$ = SubLFiles.defparameter("S#36296", (SubLObject)module0525.T);
        module0525.$g3861$ = SubLFiles.deflexical("S#36297", (SubLObject)module0525.$ic77$);
        module0525.$g3862$ = SubLFiles.deflexical("S#36298", (SubLObject)module0525.$ic83$);
        module0525.$g3863$ = SubLFiles.defparameter("S#36299", (SubLObject)module0525.$ic103$);
        module0525.$g3864$ = SubLFiles.defparameter("S#36300", (SubLObject)module0525.NIL);
        return (SubLObject)module0525.NIL;
    }
    
    public static SubLObject f32858() {
        module0340.f22978((SubLObject)module0525.$ic41$, (SubLObject)module0525.$ic42$);
        module0340.f22978((SubLObject)module0525.$ic43$, (SubLObject)module0525.$ic44$);
        module0034.f1895((SubLObject)module0525.$ic45$);
        module0034.f1895((SubLObject)module0525.$ic49$);
        module0340.f22978((SubLObject)module0525.$ic50$, (SubLObject)module0525.$ic51$);
        module0340.f22978((SubLObject)module0525.$ic52$, (SubLObject)module0525.$ic53$);
        module0034.f1895((SubLObject)module0525.$ic54$);
        module0034.f1895((SubLObject)module0525.$ic55$);
        module0340.f22978((SubLObject)module0525.$ic56$, (SubLObject)module0525.$ic57$);
        module0340.f22978((SubLObject)module0525.$ic58$, (SubLObject)module0525.$ic59$);
        module0034.f1895((SubLObject)module0525.$ic60$);
        module0340.f22978((SubLObject)module0525.$ic61$, (SubLObject)module0525.$ic62$);
        module0340.f22978((SubLObject)module0525.$ic63$, (SubLObject)module0525.$ic64$);
        module0340.f22978((SubLObject)module0525.$ic65$, (SubLObject)module0525.$ic66$);
        module0340.f22978((SubLObject)module0525.$ic67$, (SubLObject)module0525.$ic68$);
        module0340.f22978((SubLObject)module0525.$ic69$, (SubLObject)module0525.$ic70$);
        module0340.f22978((SubLObject)module0525.$ic71$, (SubLObject)module0525.$ic72$);
        module0340.f22978((SubLObject)module0525.$ic73$, (SubLObject)module0525.$ic74$);
        module0340.f22978((SubLObject)module0525.$ic75$, (SubLObject)module0525.$ic76$);
        module0340.f22978((SubLObject)module0525.$ic78$, (SubLObject)module0525.$ic79$);
        module0340.f22978((SubLObject)module0525.$ic80$, (SubLObject)module0525.$ic81$);
        module0034.f1895((SubLObject)module0525.$ic82$);
        module0034.f1895((SubLObject)module0525.$ic84$);
        module0034.f1895((SubLObject)module0525.$ic85$);
        module0340.f22978((SubLObject)module0525.$ic87$, (SubLObject)module0525.$ic88$);
        module0340.f22978((SubLObject)module0525.$ic89$, (SubLObject)module0525.$ic90$);
        module0340.f22978((SubLObject)module0525.$ic91$, (SubLObject)module0525.$ic92$);
        module0340.f22978((SubLObject)module0525.$ic93$, (SubLObject)module0525.$ic94$);
        module0034.f1895((SubLObject)module0525.$ic95$);
        module0340.f22978((SubLObject)module0525.$ic96$, (SubLObject)module0525.$ic97$);
        module0340.f22978((SubLObject)module0525.$ic98$, (SubLObject)module0525.$ic99$);
        module0340.f22978((SubLObject)module0525.$ic101$, (SubLObject)module0525.$ic102$);
        module0340.f22978((SubLObject)module0525.$ic104$, (SubLObject)module0525.$ic105$);
        return (SubLObject)module0525.NIL;
    }
    
    public void declareFunctions() {
        f32856();
    }
    
    public void initializeVariables() {
        f32857();
    }
    
    public void runTopLevelForms() {
        f32858();
    }
    
    static {
        me = (SubLFile)new module0525();
        module0525.$g3860$ = null;
        module0525.$g3861$ = null;
        module0525.$g3862$ = null;
        module0525.$g3863$ = null;
        module0525.$g3864$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic1$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic3$ = SubLObjectFactory.makeKeyword("GENLMT");
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic5$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic8$ = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CommutativePredicate"));
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativePredicate"));
        $ic13$ = SubLObjectFactory.makeString("Unexpected commutative predicate ~s");
        $ic14$ = SubLObjectFactory.makeKeyword("NEG");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15361", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26253", "CYC")));
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36301", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"));
        $ic20$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic21$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#2D65271");
        $ic23$ = SubLObjectFactory.makeSymbol("CLET");
        $ic24$ = SubLObjectFactory.makeSymbol("S#36146", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic26$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic27$ = SubLObjectFactory.makeUninternedSymbol("US#1631606");
        $ic28$ = SubLObjectFactory.makeSymbol("S#26252", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#14114", "CYC");
        $ic30$ = SubLObjectFactory.makeKeyword("SENSE");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36301", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16577", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic32$ = SubLObjectFactory.makeUninternedSymbol("US#5BF3736");
        $ic33$ = SubLObjectFactory.makeUninternedSymbol("US#7D5F893");
        $ic34$ = SubLObjectFactory.makeUninternedSymbol("US#2D65271");
        $ic35$ = SubLObjectFactory.makeSymbol("S#36145", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("DO-PREDICATE-RULE-INDEX");
        $ic37$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic38$ = SubLObjectFactory.makeSymbol("S#36151", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#30764", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("POS");
        $ic41$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-POS");
        $ic42$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36122", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36123", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36124", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36125", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36126", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$likesAsFriend #$AbrahamLincoln ?WHO)\nfrom a rule concluding to #$likesAsFriend") });
        $ic43$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-NEG");
        $ic44$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36152", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36153", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36154", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36155", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36156", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom a rule concluding from #$likesAsFriend") });
        $ic45$ = SubLObjectFactory.makeSymbol("S#36161", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("RULE");
        $ic47$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic48$ = SubLObjectFactory.makeString("Invalid sense ~s");
        $ic49$ = SubLObjectFactory.makeSymbol("S#36167", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLPREDS-POS");
        $ic51$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36127", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36128", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36129", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36170", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36171", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$acquaintedWith #$AbrahamLincoln ?WHO)\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding to #$likesAsFriend") });
        $ic52$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLPREDS-NEG");
        $ic53$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26081", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36164", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36165", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36168", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36173", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36174", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding from #$acquaintedWith") });
        $ic54$ = SubLObjectFactory.makeSymbol("S#36177", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#36184", "CYC");
        $ic56$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLINVERSE-POS");
        $ic57$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26074", "CYC")))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36178", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36180", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36182", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36187", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36188", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$awareOfExistenceOf #$MarvinMinsky ?WHO)\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding to #$studentOf") });
        $ic58$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-GENLINVERSE-NEG");
        $ic59$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26081", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26074", "CYC")))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36179", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36181", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36185", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36190", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36191", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$studentOf #$MarvinMinsky ?WHO))\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding from #$awareOfExistenceOf") });
        $ic60$ = SubLObjectFactory.makeSymbol("S#36193", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-NEGATIONPREDS-NEG");
        $ic62$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26101", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36194", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36195", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36196", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36198", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36199", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some negationPreds,\neither asserted or inferrable via genlPreds,\nfrom a rule concluding to a negationPred of <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$negationPreds #$likesAsFriend #$hates)\nand a rule concluding to #$hates") });
        $ic63$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-SYMMETRY-POS");
        $ic64$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26074", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36130", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36131", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36132", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36133", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$bordersOn #$Canada ?WHAT)\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding to #$bordersOn") });
        $ic65$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-SYMMETRY-NEG");
        $ic66$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26074", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36205", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36206", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36207", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36208", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$bordersOn #$Canada ?WHAT))\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding from #$bordersOn") });
        $ic67$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-COMMUTATIVE-POS");
        $ic68$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26075", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36209", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36211", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36213", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36215", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <args>)\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$collinear <point A> <point B> <point C>)\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding to #$collinear") });
        $ic69$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-COMMUTATIVE-NEG");
        $ic70$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26075", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36210", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36212", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36214", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36216", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <args>))\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$collinear <point A> <point B> <point C>))\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding from #$collinear") });
        $ic71$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS");
        $ic72$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26076", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36217", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36219", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36221", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36223", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding to #$distanceBetween") });
        $ic73$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG");
        $ic74$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26076", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36218", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36220", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36222", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36224", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding from #$distanceBetween") });
        $ic75$ = SubLObjectFactory.makeKeyword("TRANS-PREDICATE-ASYMMETRY");
        $ic76$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26095", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36225", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36226", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36228", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36229", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$AsymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$northOf ?WHAT #$Canada))\nfrom (#$isa #$northOf #$AsymmetricBinaryPredicate)\nand a rule concluding to #$northOf") });
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-NEG"));
        $ic78$ = SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-POS");
        $ic79$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36134", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36135", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36232", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36234", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36236", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<whatever> . <whatever>)\nfrom a rule concluding to a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$implies\n      (#$and (#$isa ?ORDER #$MathematicalOrdering) (#$baseSet ?ORDER ?SET)\n       (#$orderingRelations ?ORDER ?PRED) (#$elementOf ?X ?SET)\n       (#$elementOf ?Y ?SET) (?PRED ?X ?Y) (#$elementOf ?Z ?SET)\n       (?PRED ?Y ?Z))\n      (?PRED ?X ?Z))") });
        $ic80$ = SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-NEG");
        $ic81$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36230", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36231", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36233", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36235", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36237", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<whatever> . <whatever>))\nfrom a rule concluding from a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("no current example") });
        $ic82$ = SubLObjectFactory.makeSymbol("S#36241", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANS-ISA-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-ISA-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENLS-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENLS-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENL-MT-POS"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-GENL-MT-NEG"));
        $ic84$ = SubLObjectFactory.makeSymbol("S#36249", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#36251", "CYC");
        $ic86$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic87$ = SubLObjectFactory.makeKeyword("TRANS-ISA-POS");
        $ic88$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36244", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36246", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36252", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36254", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36255", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the isa rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa #$AbrahamLincoln #$FamousPerson)\nfrom (#$genls #$UnitedStatesPresident #$FamousPerson)\nand a rule concluding to #$isa #$UnitedStatesPresident") });
        $ic89$ = SubLObjectFactory.makeKeyword("TRANS-ISA-NEG");
        $ic90$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36245", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36247", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36256", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36258", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36259", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$isa <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the isa rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$isa #$AbrahamLincoln #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from #$isa #$EuropeanPerson") });
        $ic91$ = SubLObjectFactory.makeKeyword("TRANS-GENLS-POS");
        $ic92$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36260", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36262", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36264", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36266", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36267", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the genls rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls #$UnitedStatesPresident #$FamousPerson)\nfrom (#$genls #$WorldLeader #$FamousPerson)\nand a rule concluding to (#$genls ?X #$WorldLeader)") });
        $ic93$ = SubLObjectFactory.makeKeyword("TRANS-GENLS-NEG");
        $ic94$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36261", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36263", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36268", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36270", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36271", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genls <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the genls rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$genls #$UnitedStatesPresident #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from (#$genls ?X #$EuropeanPerson)") });
        $ic95$ = SubLObjectFactory.makeSymbol("S#36277", "CYC");
        $ic96$ = SubLObjectFactory.makeKeyword("TRANS-GENL-MT-POS");
        $ic97$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36272", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36274", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36278", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36280", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36281", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlMt <whatever> <microtheory>)\nwhere <microtheory> is a FORT\nfrom a rule concluding to a spec of <microtheory>\nusing the genlMt rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt #$UnitedStatesPresidentsMt #$FamousPeopleMt)\nfrom (#$genlMt #$WorldLeadersMt #$FamousPeopleMt)\nand a rule concluding to (#$genlMt ?X #$WorldLeadersMt)") });
        $ic98$ = SubLObjectFactory.makeKeyword("TRANS-GENL-MT-NEG");
        $ic99$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36273", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36275", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36282", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36284", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36285", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genlMt <whatever> <microtheory>))\nwhere <microtheory> is a FORT\nfrom a rule concluding from a genl of <microtheory>\nusing the genlMt rule indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$genlMt #$UnitedStatesPresidentsMt #$FrenchPeopleMt))\nfrom (#$genlMt #$FrenchPeopleMt #$EuropeanPeopleMt)\nand a rule concluding from (#$genlMt ?X #$EuropeanPeopleMt)") });
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $ic101$ = SubLObjectFactory.makeKeyword("TRANS-ABNORMAL");
        $ic102$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("abnormal")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("abnormal")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36286", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36287", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36289", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36290", "CYC") });
        $ic103$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("?SUBSET")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SUBSET"), (SubLObject)SubLObjectFactory.makeSymbol("?SUPERSET"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("?SUPERSET")));
        $ic104$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ABDUCTION-TO-SPECS");
        $ic105$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0525.TWO_INTEGER, SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#36291", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34310", "CYC"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("S#36293", "CYC"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("S#36294", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36295", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isa <fort> <fully-bound>)\n   where the asent is deemed abducible, and the problem store allows abduction,\n   using #$genls rules."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa #$GeorgeWBush #$Parent)") });
    }
    
    public static final class $f32695$UnaryFunction extends UnaryFunction
    {
        public $f32695$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36122"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32695(var47);
        }
    }
    
    public static final class $f32698$UnaryFunction extends UnaryFunction
    {
        public $f32698$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36123"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32698(var47);
        }
    }
    
    public static final class $f32701$UnaryFunction extends UnaryFunction
    {
        public $f32701$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36124"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32701(var47);
        }
    }
    
    public static final class $f32704$BinaryFunction extends BinaryFunction
    {
        public $f32704$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36125"));
        }
        
        public SubLObject processItem(final SubLObject var47, final SubLObject var48) {
            return module0525.f32704(var47, var48);
        }
    }
    
    public static final class $f32707$BinaryFunction extends BinaryFunction
    {
        public $f32707$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36126"));
        }
        
        public SubLObject processItem(final SubLObject var47, final SubLObject var48) {
            return module0525.f32707(var47, var48);
        }
    }
    
    public static final class $f32712$UnaryFunction extends UnaryFunction
    {
        public $f32712$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36127"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32712(var47);
        }
    }
    
    public static final class $f32715$UnaryFunction extends UnaryFunction
    {
        public $f32715$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36128"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32715(var47);
        }
    }
    
    public static final class $f32717$UnaryFunction extends UnaryFunction
    {
        public $f32717$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36129"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32717(var47);
        }
    }
    
    public static final class $f32756$UnaryFunction extends UnaryFunction
    {
        public $f32756$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36130"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32756(var47);
        }
    }
    
    public static final class $f32758$UnaryFunction extends UnaryFunction
    {
        public $f32758$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36131"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32758(var47);
        }
    }
    
    public static final class $f32760$BinaryFunction extends BinaryFunction
    {
        public $f32760$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36132"));
        }
        
        public SubLObject processItem(final SubLObject var47, final SubLObject var48) {
            return module0525.f32760(var47, var48);
        }
    }
    
    public static final class $f32762$BinaryFunction extends BinaryFunction
    {
        public $f32762$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36133"));
        }
        
        public SubLObject processItem(final SubLObject var47, final SubLObject var48) {
            return module0525.f32762(var47, var48);
        }
    }
    
    public static final class $f32787$UnaryFunction extends UnaryFunction
    {
        public $f32787$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36134"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32787(var47);
        }
    }
    
    public static final class $f32790$UnaryFunction extends UnaryFunction
    {
        public $f32790$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36135"));
        }
        
        public SubLObject processItem(final SubLObject var47) {
            return module0525.f32790(var47);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0525.class
	Total time: 1084 ms
	
	Decompiled with Procyon 0.5.32.
*/