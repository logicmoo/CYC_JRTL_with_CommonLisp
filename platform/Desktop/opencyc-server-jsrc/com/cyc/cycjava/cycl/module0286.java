package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0286 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0286";
    public static final String myFingerPrint = "e28f1b417a3ed09648b28ee6e5dbc461ac1fa06d5d344fbc03fd3ff70b1429aa";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    
    public static SubLObject f19107(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0286.NIL == module0146.$g2075$.getDynamicValue(var2)) {
            return var1;
        }
        if (module0286.NIL != f19108(var1, (SubLObject)module0286.UNPROVIDED)) {
            return f19109(var1);
        }
        if (module0286.NIL != f19110(var1, (SubLObject)module0286.UNPROVIDED)) {
            return f19111(var1);
        }
        return Mapping.mapcar((SubLObject)module0286.$ic0$, var1);
    }
    
    public static SubLObject f19108(final SubLObject var1, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2091$.getDynamicValue(var4) && module0286.NIL != module0035.f1997(var1)) {
            SubLObject var6;
            final SubLObject var5 = var6 = var1.first();
            SubLObject var7 = (SubLObject)module0286.NIL;
            SubLObject var8 = (SubLObject)module0286.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0286.$ic2$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0286.$ic2$);
            var8 = var6.first();
            var6 = var6.rest();
            if (module0286.NIL == var6) {
                if (module0286.NIL != module0035.f1997(var7) && module0286.NIL != module0035.f1997(var8)) {
                    final SubLObject var9 = var7.first();
                    if (module0286.NIL != module0202.f12859(var9)) {
                        final SubLObject var10 = module0202.f12834(var9, (SubLObject)module0286.UNPROVIDED);
                        final SubLObject var11 = module0202.f12835(var9, (SubLObject)module0286.UNPROVIDED);
                        if (module0286.NIL != Functions.funcall(var3, var10) && module0286.NIL != module0269.f17705(var11)) {
                            final SubLObject var12 = var8.first();
                            final SubLObject var13 = module0202.f12829(var12, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var14 = module0202.f12833(var12, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var15 = Sequences.position(var10, var12, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                            if (module0286.NIL != module0269.f17706(var14) && module0286.NIL != module0035.f2185(var10, var13, (SubLObject)module0286.UNPROVIDED) && module0286.NIL != f19112(var15)) {
                                SubLObject var16 = (SubLObject)module0286.NIL;
                                if (module0286.NIL == var16) {
                                    SubLObject var17;
                                    SubLObject var18;
                                    for (var17 = var13, var18 = (SubLObject)module0286.NIL, var18 = var17.first(); module0286.NIL == var16 && module0286.NIL != var17; var16 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var10) && module0286.NIL == module0210.f13589(var18)), var17 = var17.rest(), var18 = var17.first()) {}
                                }
                                return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL == var16);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0286.$ic2$);
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19109(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2091$.getDynamicValue(var2)) {
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0286.$ic3$);
            final SubLObject var3 = var1.rest();
            SubLObject var4 = var1.first();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic3$);
            final SubLObject var21_22 = var4.rest();
            var4 = var4.first();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic3$);
            final SubLObject var23_24 = var4.rest();
            var4 = var4.first();
            SubLObject var5 = (SubLObject)module0286.NIL;
            SubLObject var6 = (SubLObject)module0286.NIL;
            SubLObject var7 = (SubLObject)module0286.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic3$);
            var5 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic3$);
            var6 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic3$);
            var7 = var4.first();
            var4 = var4.rest();
            if (module0286.NIL == var4) {
                var4 = var23_24;
                if (module0286.NIL == var4) {
                    var4 = var21_22;
                    cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic3$);
                    final SubLObject var26_27 = var4.rest();
                    var4 = var4.first();
                    SubLObject var8 = (SubLObject)module0286.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic3$);
                    var8 = var4.first();
                    var4 = var4.rest();
                    if (module0286.NIL == var4) {
                        var4 = var26_27;
                        if (module0286.NIL == var4) {
                            var4 = var3;
                            if (module0286.NIL == var4) {
                                final SubLObject var9 = module0202.f12833(var8, (SubLObject)module0286.UNPROVIDED);
                                final SubLObject var10 = f19112(Sequences.position(var6, var8, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED));
                                return (SubLObject)ConsesLow.list(f19113(module0202.f12768(var10, var7, var9), (SubLObject)module0286.UNPROVIDED));
                            }
                            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic3$);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic3$);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic3$);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic3$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic3$);
            }
            return (SubLObject)module0286.NIL;
        }
        return var1;
    }
    
    public static SubLObject f19112(final SubLObject var17) {
        if (var17.eql((SubLObject)module0286.ONE_INTEGER)) {
            return module0286.$ic4$;
        }
        if (var17.eql((SubLObject)module0286.TWO_INTEGER)) {
            return module0286.$ic5$;
        }
        module0202.f12747((SubLObject)module0286.THREE_INTEGER, (SubLObject)module0286.$ic6$, var17, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19110(final SubLObject var1, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2090$.getDynamicValue(var4) && module0286.NIL != module0035.f1998(var1)) {
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0286.$ic7$);
            final SubLObject var5 = var1.rest();
            SubLObject var6 = var1.first();
            SubLObject var7 = (SubLObject)module0286.NIL;
            SubLObject var8 = (SubLObject)module0286.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0286.$ic7$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0286.$ic7$);
            var8 = var6.first();
            var6 = var6.rest();
            if (module0286.NIL == var6) {
                var6 = var5;
                cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0286.$ic7$);
                final SubLObject var35_36 = var6.rest();
                var6 = var6.first();
                SubLObject var9 = (SubLObject)module0286.NIL;
                SubLObject var10 = (SubLObject)module0286.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0286.$ic7$);
                var9 = var6.first();
                var6 = var6.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0286.$ic7$);
                var10 = var6.first();
                var6 = var6.rest();
                if (module0286.NIL == var6) {
                    var6 = var35_36;
                    if (module0286.NIL == var6) {
                        if (module0286.NIL != module0035.f1997(var7) && module0286.NIL != module0035.f1997(var8) && module0286.NIL != module0035.f1997(var9) && module0286.NIL != module0035.f1997(var10)) {
                            final SubLObject var11 = var7.first();
                            final SubLObject var12 = var9.first();
                            if (module0286.NIL != module0202.f12859(var11) && var11.equal(var12)) {
                                final SubLObject var13 = module0202.f12834(var11, (SubLObject)module0286.UNPROVIDED);
                                final SubLObject var14 = module0202.f12835(var11, (SubLObject)module0286.UNPROVIDED);
                                if (module0286.NIL != Functions.funcall(var3, var13) && module0286.NIL != module0269.f17705(var14)) {
                                    final SubLObject var15 = var8.first();
                                    final SubLObject var16 = var10.first();
                                    SubLObject var17 = (SubLObject)module0286.NIL;
                                    SubLObject var18 = (SubLObject)module0286.NIL;
                                    if (module0286.NIL != module0202.f12859(var15)) {
                                        var17 = var15;
                                        var18 = var16;
                                    }
                                    else if (module0286.NIL != module0202.f12859(var16)) {
                                        var17 = var16;
                                        var18 = var15;
                                    }
                                    if (module0286.NIL != var17 && module0286.NIL != module0202.f12857(var18)) {
                                        final SubLObject var19 = module0202.f12834(var17, (SubLObject)module0286.UNPROVIDED);
                                        final SubLObject var20 = module0202.f12835(var17, (SubLObject)module0286.UNPROVIDED);
                                        final SubLObject var21 = module0202.f12833(var18, (SubLObject)module0286.UNPROVIDED);
                                        final SubLObject var22 = module0202.f12829(var18, (SubLObject)module0286.UNPROVIDED);
                                        final SubLObject var23 = Sequences.position(var13, var18, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                                        if (module0286.NIL != module0210.f13589(var19) && module0286.NIL != module0269.f17705(var20) && module0286.NIL != module0269.f17706(var21) && module0286.NIL != module0035.f2185(var19, var22, Symbols.symbol_function((SubLObject)module0286.EQUAL)) && module0286.NIL != f19114(var23, module0287.f19158(var19))) {
                                            SubLObject var24 = (SubLObject)module0286.NIL;
                                            if (module0286.NIL == var24) {
                                                SubLObject var25;
                                                SubLObject var26;
                                                for (var25 = var22, var26 = (SubLObject)module0286.NIL, var26 = var25.first(); module0286.NIL == var24 && module0286.NIL != var25; var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var26.eql(var13) && !var26.equal(var19)), var25 = var25.rest(), var26 = var25.first()) {}
                                            }
                                            return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL == var24);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic7$);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic7$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic7$);
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19111(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2090$.getDynamicValue(var2)) {
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0286.$ic8$);
            final SubLObject var3 = var1.rest();
            SubLObject var4 = var1.first();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
            final SubLObject var50_51 = var4.rest();
            var4 = var4.first();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
            final SubLObject var52_53 = var4.rest();
            var4 = var4.first();
            SubLObject var5 = (SubLObject)module0286.NIL;
            SubLObject var6 = (SubLObject)module0286.NIL;
            SubLObject var7 = (SubLObject)module0286.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
            var5 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
            var6 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
            var7 = var4.first();
            var4 = var4.rest();
            if (module0286.NIL == var4) {
                var4 = var52_53;
                if (module0286.NIL == var4) {
                    var4 = var50_51;
                    cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
                    final SubLObject var54_55 = var4.rest();
                    var4 = var4.first();
                    SubLObject var8 = (SubLObject)module0286.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
                    var8 = var4.first();
                    var4 = var4.rest();
                    if (module0286.NIL == var4) {
                        var4 = var54_55;
                        if (module0286.NIL == var4) {
                            var4 = var3;
                            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
                            final SubLObject var56_57 = var4.rest();
                            var4 = var4.first();
                            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
                            final SubLObject var58_59 = var4.rest();
                            var4 = var4.first();
                            SubLObject var9 = (SubLObject)module0286.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
                            var9 = var4.first();
                            var4 = var4.rest();
                            if (module0286.NIL == var4) {
                                var4 = var58_59;
                                cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
                                final SubLObject var60_61 = var4.rest();
                                var4 = var4.first();
                                SubLObject var10 = (SubLObject)module0286.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0286.$ic8$);
                                var10 = var4.first();
                                var4 = var4.rest();
                                if (module0286.NIL == var4) {
                                    var4 = var60_61;
                                    if (module0286.NIL == var4) {
                                        var4 = var56_57;
                                        if (module0286.NIL == var4) {
                                            SubLObject var11 = (SubLObject)module0286.NIL;
                                            SubLObject var12 = (SubLObject)module0286.NIL;
                                            if (module0286.NIL != module0202.f12859(var8)) {
                                                var11 = var8;
                                                var12 = var10;
                                            }
                                            else if (module0286.NIL != module0202.f12859(var10)) {
                                                var11 = var10;
                                                var12 = var8;
                                            }
                                            final SubLObject var13 = module0202.f12835(var11, (SubLObject)module0286.UNPROVIDED);
                                            final SubLObject var14 = module0202.f12833(var12, (SubLObject)module0286.UNPROVIDED);
                                            final SubLObject var15 = Sequences.position(var6, var12, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                                            final SubLObject var16 = module0287.f19158(module0202.f12834(var11, (SubLObject)module0286.UNPROVIDED));
                                            final SubLObject var17 = f19114(var15, var16);
                                            return (SubLObject)ConsesLow.list(f19113(f19115(var17, var14, var7, var13, var16), (SubLObject)module0286.UNPROVIDED));
                                        }
                                        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0286.$ic8$);
            }
            return (SubLObject)module0286.NIL;
        }
        return var1;
    }
    
    public static SubLObject f19114(final SubLObject var63, SubLObject var62) {
        if (var62 == module0286.UNPROVIDED) {
            var62 = (SubLObject)module0286.NIL;
        }
        if (var63.eql((SubLObject)module0286.ONE_INTEGER)) {
            if (module0286.NIL == var62) {
                return module0286.$ic9$;
            }
            if (module0286.NIL != module0131.f8560() && module0286.NIL != module0203.f13014(var62)) {
                return module0286.$ic10$;
            }
            if (module0286.NIL != module0131.f8560() && module0286.NIL != module0203.f13018(var62)) {
                return module0286.$ic11$;
            }
            return module0286.$ic12$;
        }
        else {
            if (!var63.eql((SubLObject)module0286.TWO_INTEGER)) {
                module0202.f12747((SubLObject)module0286.THREE_INTEGER, (SubLObject)module0286.$ic17$, var63, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                return (SubLObject)module0286.NIL;
            }
            if (module0286.NIL == var62) {
                return module0286.$ic13$;
            }
            if (module0286.NIL != module0131.f8560() && module0286.NIL != module0203.f13014(var62)) {
                return module0286.$ic14$;
            }
            if (module0286.NIL != module0131.f8560() && module0286.NIL != module0203.f13018(var62)) {
                return module0286.$ic15$;
            }
            return module0286.$ic16$;
        }
    }
    
    public static SubLObject f19115(final SubLObject var28, final SubLObject var13, final SubLObject var10, final SubLObject var46, SubLObject var62) {
        if (var62 == module0286.UNPROVIDED) {
            var62 = (SubLObject)module0286.NIL;
        }
        if (var28.eql(module0286.$ic9$)) {
            return module0202.f12769(var28, var13, var10, var46);
        }
        if (var28.eql(module0286.$ic12$)) {
            return module0202.f12770(var28, var13, var10, var46, var62);
        }
        if (module0286.NIL != module0131.f8560() && var28.eql(module0286.$ic10$)) {
            return module0202.f12770(var28, var13, var10, var46, module0203.f13017(var62));
        }
        if (module0286.NIL != module0131.f8560() && var28.eql(module0286.$ic11$)) {
            return module0202.f12770(var28, var13, var10, var46, module0203.f13021(var62));
        }
        if (var28.eql(module0286.$ic13$)) {
            return module0202.f12769(var28, var13, var46, var10);
        }
        if (var28.eql(module0286.$ic16$)) {
            return module0202.f12770(var28, var13, var46, var10, var62);
        }
        if (module0286.NIL != module0131.f8560() && var28.eql(module0286.$ic14$)) {
            return module0202.f12770(var28, var13, var46, var10, module0203.f13017(var62));
        }
        if (module0286.NIL != module0131.f8560() && var28.eql(module0286.$ic15$)) {
            return module0202.f12770(var28, var13, var46, var10, module0203.f13021(var62));
        }
        module0202.f12747((SubLObject)module0286.THREE_INTEGER, (SubLObject)module0286.$ic18$, var28, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19116(final SubLObject var64) {
        if (module0286.NIL != f19117(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19118(var64);
        }
        if (module0286.NIL != f19119(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19120(var64);
        }
        if (module0286.NIL != f19121(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19122(var64);
        }
        if (module0286.NIL != f19123(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19124(var64);
        }
        if (module0286.NIL != f19125(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19126(var64);
        }
        if (module0286.NIL != f19127(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19128(var64);
        }
        if (module0286.NIL != f19129(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19130(var64);
        }
        if (module0286.NIL != f19131(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19132(var64);
        }
        if (module0286.NIL != f19133(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19134(var64);
        }
        if (module0286.NIL != f19135(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19136(var64);
        }
        if (module0286.NIL != f19137(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19138(var64);
        }
        if (module0286.NIL != f19139(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19140(var64);
        }
        if (module0286.NIL != f19141(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19142(var64);
        }
        if (module0286.NIL != f19143(var64, (SubLObject)module0286.UNPROVIDED)) {
            return f19144(var64);
        }
        return var64;
    }
    
    public static SubLObject f19117(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2076$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1997(var66) && module0286.NIL != module0035.f1997(var67)) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = var67.first();
                final SubLObject var70 = module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED);
                return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL != module0202.f12859(var68) && module0286.NIL != module0202.f12859(var69) && module0286.NIL != Functions.funcall(var3, var70) && var70.eql(module0202.f12834(var69, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0269.f17705(module0202.f12835(var68, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0269.f17705(module0202.f12835(var69, (SubLObject)module0286.UNPROVIDED)));
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19118(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2076$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic19$, module0202.f12835(module0232.f15306(var64).first(), (SubLObject)module0286.UNPROVIDED), module0202.f12835(module0232.f15308(var64).first(), (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19119(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2079$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1997(var66) && module0286.NIL != module0035.f1997(var67)) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = var67.first();
                final SubLObject var70 = module0202.f12829(var68, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var71 = module0202.f12829(var69, (SubLObject)module0286.UNPROVIDED);
                if (module0286.NIL == module0035.f2370(var3, var70, (SubLObject)module0286.UNPROVIDED)) {
                    return (SubLObject)module0286.NIL;
                }
                if (var70.equal(var71)) {
                    return (SubLObject)module0286.T;
                }
                if (module0286.NIL != module0269.f17760(module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED))) {
                    return module0035.f2201(var70, var71, (SubLObject)module0286.UNPROVIDED);
                }
                if (module0286.NIL != module0269.f17760(module0202.f12833(var69, (SubLObject)module0286.UNPROVIDED))) {
                    return module0035.f2201(var70, var71, (SubLObject)module0286.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19120(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2079$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic20$, module0202.f12833(module0232.f15306(var64).first(), (SubLObject)module0286.UNPROVIDED), module0202.f12833(module0232.f15308(var64).first(), (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19121(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2080$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1997(var66) && module0286.NIL != module0035.f1997(var67)) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = var67.first();
                final SubLObject var70 = module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var71 = module0202.f12833(var69, (SubLObject)module0286.UNPROVIDED);
                if (!var70.eql(var71) && module0286.NIL == module0226.f14797(var70) && module0286.NIL == module0226.f14797(var70)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL != module0202.f12857(var68) && module0286.NIL != module0202.f12857(var69) && module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED).eql(module0202.f12835(var69, (SubLObject)module0286.UNPROVIDED)) && module0202.f12835(var68, (SubLObject)module0286.UNPROVIDED).eql(module0202.f12834(var69, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != Functions.funcall(var3, module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != Functions.funcall(var3, module0202.f12835(var68, (SubLObject)module0286.UNPROVIDED)));
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19122(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2080$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic21$, module0202.f12833(module0232.f15306(var64).first(), (SubLObject)module0286.UNPROVIDED), module0202.f12833(module0232.f15308(var64).first(), (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19123(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2077$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1997(var66) && module0286.NIL != module0035.f1997(var67)) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = var67.first();
                return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL != module0202.f12859(var69) && module0286.NIL != module0269.f17706(module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0269.f17705(module0202.f12835(var69, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0226.f14903(f19145(var68, var69, var3), (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED));
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19145(final SubLObject var8, final SubLObject var11, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        if (module0286.NIL != module0035.f2370(var3, module0202.f12829(var8, (SubLObject)module0286.UNPROVIDED), (SubLObject)module0286.UNPROVIDED)) {
            final SubLObject var12 = (SubLObject)module0286.NIL;
            final SubLObject var13 = module0202.f12834(var11, (SubLObject)module0286.UNPROVIDED);
            if (module0286.NIL == var12) {
                SubLObject var14 = module0146.$g1959$.getGlobalValue();
                SubLObject var15 = (SubLObject)module0286.NIL;
                var15 = var14.first();
                while (module0286.NIL == var12 && module0286.NIL != var14) {
                    final SubLObject var16 = ConsesLow.nth(var15, var8);
                    if (var16.eql(var13) && module0286.NIL != module0035.f2185(var16, var8, (SubLObject)module0286.UNPROVIDED)) {
                        return var15;
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19124(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2077$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64).first();
            final SubLObject var67 = module0232.f15308(var64).first();
            final SubLObject var68 = f19145(var66, var67, (SubLObject)module0286.UNPROVIDED);
            final SubLObject var69 = module0226.f14903(var68, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
            return f19113(module0202.f12768(var69, module0202.f12833(var66, (SubLObject)module0286.UNPROVIDED), module0202.f12835(var67, (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19127(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2078$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1997(var66) && module0286.NIL != module0035.f1997(var67)) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = var67.first();
                return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL != module0202.f12865(var69) && module0286.NIL != module0226.f14792(module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0269.f17705(module0202.f12835(var69, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0226.f14947(f19145(var68, var69, var3), (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED));
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19128(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2078$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64).first();
            final SubLObject var67 = module0232.f15308(var64).first();
            final SubLObject var68 = f19145(var66, var67, (SubLObject)module0286.UNPROVIDED);
            final SubLObject var69 = module0226.f14947(var68, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
            return f19113(module0202.f12768(var69, module0202.f12833(var66, (SubLObject)module0286.UNPROVIDED), module0202.f12835(var67, (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19125(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2081$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1998(var66) && module0286.NIL != module0035.f1997(var67)) {
                final SubLObject var68 = var67.first();
                if (module0286.NIL != module0202.f12859(var68)) {
                    final SubLObject var69 = module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED);
                    final SubLObject var70 = module0202.f12835(var68, (SubLObject)module0286.UNPROVIDED);
                    if (module0286.NIL != Functions.funcall(var3, var69) && module0286.NIL != module0269.f17705(var70)) {
                        SubLObject var71 = (SubLObject)module0286.NIL;
                        SubLObject var72 = (SubLObject)module0286.NIL;
                        if (module0286.NIL != module0202.f12859(var66.first())) {
                            var71 = var66.first();
                            var72 = conses_high.second(var66);
                        }
                        else if (module0286.NIL != module0202.f12859(conses_high.second(var66))) {
                            var71 = conses_high.second(var66);
                            var72 = var66.first();
                        }
                        if (module0286.NIL != var71) {
                            final SubLObject var73 = module0202.f12834(var71, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var74 = module0202.f12835(var71, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var75 = module0202.f12833(var72, (SubLObject)module0286.UNPROVIDED);
                            if (module0286.NIL != Functions.funcall(var3, var73) && module0286.NIL != module0269.f17705(var74) && module0286.NIL != module0269.f17706(var75)) {
                                final SubLObject var76 = Sequences.position(var73, var72, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                                final SubLObject var77 = Sequences.position(var69, var72, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                                final SubLObject var78 = module0303.f20126(var76, var77);
                                if (module0286.NIL != var78) {
                                    return (SubLObject)module0286.T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19126(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2081$.getDynamicValue(var65)) {
            SubLObject var66 = (SubLObject)module0286.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var64, var64, (SubLObject)module0286.$ic22$);
            var66 = var64.first();
            SubLObject var67 = var64.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var64, (SubLObject)module0286.$ic22$);
            final SubLObject var68 = var67.rest();
            var67 = var67.first();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var64, (SubLObject)module0286.$ic22$);
            final SubLObject var85_86 = var67.rest();
            var67 = var67.first();
            SubLObject var69 = (SubLObject)module0286.NIL;
            SubLObject var70 = (SubLObject)module0286.NIL;
            SubLObject var71 = (SubLObject)module0286.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var67, var64, (SubLObject)module0286.$ic22$);
            var69 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var64, (SubLObject)module0286.$ic22$);
            var70 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var64, (SubLObject)module0286.$ic22$);
            var71 = var67.first();
            var67 = var67.rest();
            if (module0286.NIL == var67) {
                var67 = var85_86;
                if (module0286.NIL == var67) {
                    var67 = var68;
                    if (module0286.NIL == var67) {
                        SubLObject var72 = (SubLObject)module0286.NIL;
                        SubLObject var73 = (SubLObject)module0286.NIL;
                        if (module0286.NIL != module0202.f12859(var66.first())) {
                            var72 = var66.first();
                            var73 = conses_high.second(var66);
                        }
                        else if (module0286.NIL != module0202.f12859(conses_high.second(var66))) {
                            var72 = conses_high.second(var66);
                            var73 = var66.first();
                        }
                        SubLObject var90_91;
                        final SubLObject var88_89 = var90_91 = var72;
                        SubLObject var74 = (SubLObject)module0286.NIL;
                        SubLObject var75 = (SubLObject)module0286.NIL;
                        SubLObject var76 = (SubLObject)module0286.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var90_91, var88_89, (SubLObject)module0286.$ic23$);
                        var74 = var90_91.first();
                        var90_91 = var90_91.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var90_91, var88_89, (SubLObject)module0286.$ic23$);
                        var75 = var90_91.first();
                        var90_91 = var90_91.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var90_91, var88_89, (SubLObject)module0286.$ic23$);
                        var76 = var90_91.first();
                        var90_91 = var90_91.rest();
                        if (module0286.NIL == var90_91) {
                            final SubLObject var77 = module0202.f12833(var73, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var78 = Sequences.position(var75, var73, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var79 = Sequences.position(var70, var73, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var80 = module0303.f20126(var78, var79);
                            return f19113(module0202.f12769(var80, var77, var76, var71), (SubLObject)module0286.UNPROVIDED);
                        }
                        cdestructuring_bind.cdestructuring_bind_error(var88_89, (SubLObject)module0286.$ic23$);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var64, (SubLObject)module0286.$ic22$);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var64, (SubLObject)module0286.$ic22$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var64, (SubLObject)module0286.$ic22$);
            }
            return (SubLObject)module0286.NIL;
        }
        return var64;
    }
    
    public static SubLObject f19129(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2082$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1998(var66) && module0286.NIL == var67) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = conses_high.second(var66);
                return (SubLObject)SubLObjectFactory.makeBoolean(module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED).eql(module0202.f12834(var69, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0202.f12859(var68) && module0286.NIL != module0202.f12859(var69) && module0286.NIL != Functions.funcall(var3, module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0269.f17705(module0202.f12835(var68, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0269.f17705(module0202.f12835(var69, (SubLObject)module0286.UNPROVIDED)));
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19130(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2082$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic24$, module0202.f12835(module0232.f15306(var64).first(), (SubLObject)module0286.UNPROVIDED), module0202.f12835(conses_high.second(module0232.f15306(var64)), (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19131(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2083$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1998(var66) && module0286.NIL == var67) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = conses_high.second(var66);
                final SubLObject var70 = module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var71 = module0202.f12833(var69, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var72 = module0202.f12829(var68, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var73 = module0202.f12829(var69, (SubLObject)module0286.UNPROVIDED);
                return (SubLObject)SubLObjectFactory.makeBoolean(!var70.eql(var71) && module0286.NIL != module0269.f17706(var70) && module0286.NIL != module0269.f17706(var71) && module0286.NIL != module0035.f2370(var3, var72, (SubLObject)module0286.UNPROVIDED) && (var72.equal(var73) || ((module0286.NIL != module0269.f17760(var70) || module0286.NIL != module0269.f17760(var71)) && module0286.NIL != module0035.f2201(var72, var73, (SubLObject)module0286.UNPROVIDED))));
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19132(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2083$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic25$, module0202.f12833(module0232.f15306(var64).first(), (SubLObject)module0286.UNPROVIDED), module0202.f12833(conses_high.second(module0232.f15306(var64)), (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19133(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2084$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1998(var66) && module0286.NIL == var67) {
                final SubLObject var68 = var66.first();
                final SubLObject var69 = conses_high.second(var66);
                final SubLObject var70 = module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var71 = module0202.f12833(var69, (SubLObject)module0286.UNPROVIDED);
                if (module0286.NIL != module0202.f12857(var68) && module0286.NIL != module0202.f12857(var69) && module0286.NIL != module0269.f17706(var70) && module0286.NIL != module0269.f17706(var71)) {
                    final SubLObject var72 = module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED);
                    final SubLObject var73 = module0202.f12835(var68, (SubLObject)module0286.UNPROVIDED);
                    final SubLObject var74 = module0202.f12834(var69, (SubLObject)module0286.UNPROVIDED);
                    final SubLObject var75 = module0202.f12835(var69, (SubLObject)module0286.UNPROVIDED);
                    return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL != Functions.funcall(var3, var72) && module0286.NIL != Functions.funcall(var3, var73) && var72.eql(var75) && var73.eql(var74));
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19134(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2084$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic26$, module0202.f12833(module0232.f15306(var64).first(), (SubLObject)module0286.UNPROVIDED), module0202.f12833(conses_high.second(module0232.f15306(var64)), (SubLObject)module0286.UNPROVIDED)), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19135(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2085$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1997(var67)) {
                final SubLObject var68 = var67.first();
                if (module0286.NIL != module0202.f12853(var68)) {
                    final SubLObject var69 = module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED);
                    if (module0286.NIL != Functions.funcall(var3, var69)) {
                        final SubLObject var70 = module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED);
                        if (module0286.NIL != module0269.f17706(var70)) {
                            return f19146(var70, var69, var66, var3);
                        }
                    }
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19146(final SubLObject var13, final SubLObject var9, final SubLObject var6, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        SubLObject var14 = (SubLObject)module0286.NIL;
        SubLObject var15 = (SubLObject)module0286.NIL;
        SubLObject var16 = (SubLObject)module0286.NIL;
        SubLObject var17 = (SubLObject)module0286.NIL;
        if (module0286.NIL == var14) {
            SubLObject var18 = var6;
            SubLObject var19 = (SubLObject)module0286.NIL;
            var19 = var18.first();
            while (module0286.NIL == var14 && module0286.NIL != var18) {
                final SubLObject var20 = module0202.f12834(var19, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var21 = module0202.f12835(var19, (SubLObject)module0286.UNPROVIDED);
                if (module0286.NIL != module0202.f12859(var19)) {
                    if (var9.eql(var20)) {
                        var15 = (SubLObject)ConsesLow.cons(var21, var15);
                    }
                    else {
                        var14 = (SubLObject)module0286.T;
                    }
                }
                else if (module0286.NIL != module0202.f12881(var19) && var13.eql(var20) && module0286.NIL != Functions.funcall(var3, var21)) {
                    final SubLObject var22 = module0202.f12833(var19, (SubLObject)module0286.UNPROVIDED);
                    if (var22.eql(module0286.$ic27$)) {
                        var16 = (SubLObject)ConsesLow.cons(var21, var16);
                        final SubLObject var23 = module0286.$ic27$;
                        if (module0286.NIL == conses_high.member(var23, var17, Symbols.symbol_function((SubLObject)module0286.EQL), Symbols.symbol_function((SubLObject)module0286.IDENTITY))) {
                            var17 = (SubLObject)ConsesLow.cons(var23, var17);
                        }
                    }
                    else if (var22.eql(module0286.$ic28$)) {
                        var16 = (SubLObject)ConsesLow.cons(var21, var16);
                        final SubLObject var23 = module0286.$ic28$;
                        if (module0286.NIL == conses_high.member(var23, var17, Symbols.symbol_function((SubLObject)module0286.EQL), Symbols.symbol_function((SubLObject)module0286.IDENTITY))) {
                            var17 = (SubLObject)ConsesLow.cons(var23, var17);
                        }
                    }
                    else {
                        var14 = (SubLObject)module0286.T;
                    }
                }
                else {
                    var14 = (SubLObject)module0286.T;
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        if (module0286.NIL == var14) {
            SubLObject var24 = (SubLObject)((module0286.NIL != var15) ? module0286.NIL : var16);
            final SubLObject var25 = (SubLObject)((module0286.NIL != var24) ? module0286.NIL : module0226.f14918(var13, (SubLObject)module0286.UNPROVIDED));
            if (module0286.NIL == var24) {
                SubLObject var26 = var15;
                SubLObject var27 = (SubLObject)module0286.NIL;
                var27 = var26.first();
                while (module0286.NIL == var24 && module0286.NIL != var26) {
                    if (module0286.NIL != module0269.f17705(var27)) {
                        var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL == module0256.f16608(var27, var25, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED));
                    }
                    else if (module0286.NIL == Functions.funcall(var3, var27) || module0286.NIL == module0004.f104(var27, var16, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED)) {
                        var24 = (SubLObject)module0286.T;
                    }
                    var26 = var26.rest();
                    var27 = var26.first();
                }
            }
            if (module0286.NIL == module0035.f1998(var17) && module0286.NIL == var24) {
                SubLObject var26 = var17;
                SubLObject var28 = (SubLObject)module0286.NIL;
                var28 = var26.first();
                while (module0286.NIL == var24 && module0286.NIL != var26) {
                    final SubLObject var29 = module0220.f14566(var13, var28, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED);
                    if (module0286.NIL == var24) {
                        SubLObject var16_112;
                        SubLObject var30;
                        for (var16_112 = var29, var30 = (SubLObject)module0286.NIL, var30 = var16_112.first(); module0286.NIL == var24 && module0286.NIL != var16_112; var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL == module0256.f16608(var30, var25, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED)), var16_112 = var16_112.rest(), var30 = var16_112.first()) {}
                    }
                    var26 = var26.rest();
                    var28 = var26.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL == var24);
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19136(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2085$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic29$, module0202.f12833(module0232.f15308(var64).first(), (SubLObject)module0286.UNPROVIDED), module0286.$ic30$), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19137(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2088$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            final SubLObject var68 = module0202.f12852(var66);
            if (module0286.NIL == var67 && module0286.NIL != module0035.f1997(var68)) {
                final SubLObject var69 = var68.first();
                final SubLObject var70 = (SubLObject)((module0286.NIL != var69) ? module0202.f12834(var69, (SubLObject)module0286.UNPROVIDED) : module0286.NIL);
                if (module0286.NIL != Functions.funcall(var3, var70)) {
                    final SubLObject var71 = module0202.f12833(var69, (SubLObject)module0286.UNPROVIDED);
                    if (module0286.NIL != module0269.f17706(var71)) {
                        return f19146(var71, var70, Sequences.remove(var69, var66, Symbols.symbol_function((SubLObject)module0286.EQUAL), (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED, (SubLObject)module0286.UNPROVIDED), (SubLObject)module0286.UNPROVIDED);
                    }
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19138(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2088$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic29$, module0202.f12833(module0202.f12852(module0232.f15306(var64)).first(), (SubLObject)module0286.UNPROVIDED), module0286.$ic31$), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19139(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2087$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            if (module0286.NIL != module0035.f1997(var67) && module0286.NIL != module0035.f1998(var66)) {
                final SubLObject var68 = var67.first();
                final SubLObject var69 = module0202.f12834(var68, (SubLObject)module0286.UNPROVIDED);
                final SubLObject var70 = module0202.f12835(var68, (SubLObject)module0286.UNPROVIDED);
                if (module0286.NIL != Functions.funcall(var3, var69) && module0286.NIL != Functions.funcall(var3, var70) && module0286.NIL != module0202.f12857(var68)) {
                    final SubLObject var71 = module0202.f12833(var68, (SubLObject)module0286.UNPROVIDED);
                    if (module0286.NIL != module0269.f17706(var71)) {
                        final SubLObject var72 = var66.first();
                        final SubLObject var73 = conses_high.second(var66);
                        if (var71.eql(module0202.f12833(var72, (SubLObject)module0286.UNPROVIDED)) && var71.eql(module0202.f12833(var73, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0202.f12857(var72) && module0286.NIL != module0202.f12857(var73)) {
                            final SubLObject var74 = module0202.f12834(var72, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var75 = module0202.f12835(var72, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var76 = module0202.f12834(var73, (SubLObject)module0286.UNPROVIDED);
                            final SubLObject var77 = module0202.f12835(var73, (SubLObject)module0286.UNPROVIDED);
                            return (SubLObject)SubLObjectFactory.makeBoolean((var69.eql(var74) && var70.eql(var77) && var75.eql(var76) && module0286.NIL != Functions.funcall(var3, var75)) || (var69.eql(var76) && var70.eql(var75) && var74.eql(var77) && module0286.NIL != Functions.funcall(var3, var74)));
                        }
                    }
                }
            }
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19140(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2087$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic29$, module0202.f12833(module0232.f15308(var64).first(), (SubLObject)module0286.UNPROVIDED), module0286.$ic32$), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19141(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2086$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL != module0035.f1997(var66) && module0286.NIL != module0035.f1997(var67) && module0286.NIL != f19147(var66.first(), var67.first(), var3));
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19147(final SubLObject var124, final SubLObject var125, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLObject var126 = module0202.f12833(var124, (SubLObject)module0286.UNPROVIDED);
        if (module0286.NIL != module0202.f12857(var124) && module0286.NIL != module0202.f12857(var125) && var126.eql(module0202.f12833(var125, (SubLObject)module0286.UNPROVIDED)) && module0286.NIL != module0269.f17706(var126)) {
            final SubLObject var127 = module0202.f12834(var124, (SubLObject)module0286.UNPROVIDED);
            final SubLObject var128 = module0202.f12835(var124, (SubLObject)module0286.UNPROVIDED);
            final SubLObject var129 = module0202.f12834(var125, (SubLObject)module0286.UNPROVIDED);
            final SubLObject var130 = module0202.f12835(var125, (SubLObject)module0286.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(var127.eql(var130) && var128.eql(var129) && module0286.NIL != Functions.funcall(var3, var127) && module0286.NIL != Functions.funcall(var3, var128));
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19142(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2086$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic29$, module0202.f12833(module0232.f15308(var64).first(), (SubLObject)module0286.UNPROVIDED), module0286.$ic33$), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19143(final SubLObject var64, SubLObject var3) {
        if (var3 == module0286.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0286.$ic1$);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2089$.getDynamicValue(var65)) {
            final SubLObject var66 = module0232.f15306(var64);
            final SubLObject var67 = module0232.f15308(var64);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0286.NIL == var67 && module0286.NIL != module0035.f1998(var66) && module0286.NIL != f19147(var66.first(), conses_high.second(var66), var3));
        }
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19144(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0286.NIL != module0146.$g2089$.getDynamicValue(var65)) {
            return f19113(module0202.f12768(module0286.$ic29$, module0202.f12833(module0232.f15306(var64).first(), (SubLObject)module0286.UNPROVIDED), module0286.$ic34$), (SubLObject)module0286.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f19113(final SubLObject var11, SubLObject var6) {
        if (var6 == module0286.UNPROVIDED) {
            var6 = (SubLObject)module0286.NIL;
        }
        return module0232.f15326(var6, (SubLObject)ConsesLow.list(var11));
    }
    
    public static SubLObject f19148() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19107", "S#21486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19108", "S#21683", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19109", "S#21684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19112", "S#21685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19110", "S#21686", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19111", "S#21687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19114", "S#21688", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19115", "S#21689", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19116", "S#21690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19117", "S#21691", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19118", "S#21692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19119", "S#21693", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19120", "S#21694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19121", "S#21695", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19122", "S#21696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19123", "S#21697", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19145", "S#21698", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19124", "S#21699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19127", "S#21700", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19128", "S#21701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19125", "S#21702", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19126", "S#21703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19129", "S#21704", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19130", "S#21705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19131", "S#21706", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19132", "S#21707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19133", "S#21708", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19134", "S#21709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19135", "S#21710", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19146", "S#21711", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19136", "S#21712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19137", "S#21713", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19138", "S#21714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19139", "S#21715", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19140", "S#21716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19141", "S#21717", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19147", "S#21718", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19142", "S#21719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19143", "S#21720", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19144", "S#21721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0286", "f19113", "S#21722", 1, 1, false);
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19149() {
        return (SubLObject)module0286.NIL;
    }
    
    public static SubLObject f19150() {
        return (SubLObject)module0286.NIL;
    }
    
    public void declareFunctions() {
        f19148();
    }
    
    public void initializeVariables() {
        f19149();
    }
    
    public void runTopLevelForms() {
        f19150();
    }
    
    static {
        me = (SubLFile)new module0286();
        $ic0$ = SubLObjectFactory.makeSymbol("S#21690", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21723", "CYC"))));
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred"));
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("requiredArg2Pred"));
        $ic6$ = SubLObjectFactory.makeString("invalid required-arg-pred index: ~s");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21724", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21725", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21726", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21727", "CYC")));
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21728", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21729", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21730", "CYC"))));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMin"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMax"));
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount"));
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationExistsAll"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationExistsMinAll"));
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationExistsMaxAll"));
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationExistsCountAll"));
        $ic17$ = SubLObjectFactory.makeString("invalid relation-type index: ~s");
        $ic18$ = SubLObjectFactory.makeString("invalid relation-type rule-macro-pred: ~s");
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21731", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21732", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21733", "CYC"))));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21734", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21735", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21736", "CYC"));
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate"));
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IrreflexiveBinaryPredicate"));
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate"));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0286.class
	Total time: 309 ms
	
	Decompiled with Procyon 0.5.32.
*/