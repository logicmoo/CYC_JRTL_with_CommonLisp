package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0548 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0548";
    public static final String myFingerPrint = "6386048e9850e818b566eabb8a0a5599f893635359d4110b4a8ab4b704ec406a";
    public static SubLSymbol $g3978$;
    private static SubLSymbol $g3979$;
    private static SubLSymbol $g3980$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLFloat $ic43$;
    private static final SubLFloat $ic44$;
    private static final SubLList $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    
    public static SubLObject f33817(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = conses_high.getf(var2, (SubLObject)module0548.$ic0$, (SubLObject)module0548.$ic1$);
        SubLObject var4 = conses_high.copy_list(var2);
        var4 = conses_high.remf(var4, (SubLObject)module0548.$ic0$);
        var4 = conses_high.putf(var4, (SubLObject)module0548.$ic2$, (SubLObject)ConsesLow.list(var3));
        return f33818((SubLObject)ConsesLow.list(var1), var4);
    }
    
    public static SubLObject f33819(final SubLObject var5, final SubLObject var2) {
        return f33817(f33820(var5), var2);
    }
    
    public static SubLObject f33818(final SubLObject var6, final SubLObject var2) {
        final SubLObject var7 = Sequences.length(var6);
        final SubLObject var8 = module0035.f2522(var6);
        final SubLObject var9 = f33821(var2);
        f33822(var9, var8, (SubLObject)module0548.UNPROVIDED);
        final SubLObject var10 = f33823(var2);
        final SubLObject var11 = f33824(var2);
        f33825(var10, var9, var2, var7);
        return f33826(var10, var11);
    }
    
    public static SubLObject f33827(final SubLObject var6, final SubLObject var2) {
        final SubLObject var7 = Sequences.length(var6);
        final SubLObject var8 = module0035.f2522(var6);
        final SubLObject var9 = f33821(var2);
        f33822(var9, var8, (SubLObject)module0548.UNPROVIDED);
        final SubLObject var10 = f33823(var2);
        final SubLObject var11 = f33824(var2);
        f33828(var10, var9, var2, var7);
        return f33826(var10, var11);
    }
    
    public static SubLObject f33829(final SubLObject var6, final SubLObject var2) {
        final SubLObject var7 = Sequences.length(var6);
        final SubLObject var8 = module0035.f2522(var6);
        final SubLObject var9 = f33821(var2);
        f33822(var9, var8, (SubLObject)module0548.UNPROVIDED);
        final SubLObject var10 = f33823(var2);
        final SubLObject var11 = f33824(var2);
        f33830(var10, var9, var2, var7);
        return f33826(var10, var11);
    }
    
    public static SubLObject f33831(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = f33821(var2);
        final SubLObject var4 = module0035.f2521(var1);
        f33822(var3, var4, (SubLObject)module0548.UNPROVIDED);
        final SubLObject var5 = f33823(var2);
        final SubLObject var6 = f33824(var2);
        f33832(var5, var3, var2);
        return f33826(var5, var6);
    }
    
    public static SubLObject f33833(final SubLObject var14, final SubLObject var2, SubLObject var15) {
        if (var15 == module0548.UNPROVIDED) {
            var15 = (SubLObject)module0548.T;
        }
        final SubLObject var16 = (module0548.NIL != var15) ? f33834(var14) : var14;
        final SubLObject var17 = f33835(Mapping.mapcar((SubLObject)module0548.$ic3$, var16));
        return f33818(var17, var2);
    }
    
    public static SubLObject f33836(final SubLObject var17, final SubLObject var18, final SubLObject var19, SubLObject var2, SubLObject var11) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        if (var11 == module0548.UNPROVIDED) {
            var11 = (SubLObject)module0548.NIL;
        }
        final SubLObject var20 = f33837(var17, var18, var19, var2);
        final SubLObject var21 = f33823(var2);
        f33838(var21, var20, var2);
        return f33826(var21, var11);
    }
    
    public static SubLObject f33839(final SubLObject var20, final SubLObject var21, final SubLObject var22, SubLObject var2) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        final SubLObject var23 = f33840(var20, (SubLObject)ConsesLow.list(var21, var22), var2);
        final SubLObject var24 = f33823(var2);
        final SubLObject var25 = f33824(var2);
        f33838(var24, var23, var2);
        return f33826(var24, var25);
    }
    
    public static SubLObject f33841(final SubLObject var17, final SubLObject var18, final SubLObject var19, SubLObject var2, SubLObject var23, SubLObject var11) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        if (var23 == module0548.UNPROVIDED) {
            var23 = (SubLObject)module0548.$ic4$;
        }
        if (var11 == module0548.UNPROVIDED) {
            var11 = (SubLObject)module0548.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0548.NIL == Errors.$ignore_mustsP$.getDynamicValue(var24) && module0548.NIL == conses_high.member(var23, (SubLObject)module0548.$ic5$, (SubLObject)module0548.UNPROVIDED, (SubLObject)module0548.UNPROVIDED)) {
            Errors.error((SubLObject)module0548.$ic6$);
        }
        final SubLObject var25 = f33837(var17, var18, var19, var2);
        final SubLObject var26 = f33823(var2);
        f33842(var26, var25, var2, var23);
        return f33826(var26, var11);
    }
    
    public static SubLObject f33843(final SubLObject var25, final SubLObject var19, SubLObject var2, SubLObject var23) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        if (var23 == module0548.UNPROVIDED) {
            var23 = (SubLObject)module0548.$ic7$;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (module0548.NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && module0548.NIL == conses_high.member(var23, (SubLObject)module0548.$ic8$, (SubLObject)module0548.UNPROVIDED, (SubLObject)module0548.UNPROVIDED)) {
            Errors.error((SubLObject)module0548.$ic6$);
        }
        if (module0548.NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && !Sequences.length(var25).numG((SubLObject)module0548.ONE_INTEGER)) {
            Errors.error((SubLObject)module0548.$ic9$);
        }
        final SubLObject var27 = f33844(var25, var19, var23);
        return f33827(var27, var2);
    }
    
    public static SubLObject f33845(final SubLObject var20, final SubLObject var26, SubLObject var2, SubLObject var23, SubLObject var11) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        if (var23 == module0548.UNPROVIDED) {
            var23 = (SubLObject)module0548.$ic10$;
        }
        if (var11 == module0548.UNPROVIDED) {
            var11 = (SubLObject)module0548.NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0548.NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && var23 != module0548.$ic10$ && module0548.NIL == conses_high.member(var23, var26, (SubLObject)module0548.UNPROVIDED, (SubLObject)module0548.UNPROVIDED)) {
            Errors.error((SubLObject)module0548.$ic6$);
        }
        final SubLObject var28 = f33840(var20, var26, var2);
        final SubLObject var29 = f33823(var2);
        f33846(var29, var28, var2, var23, var26);
        return f33826(var29, var11);
    }
    
    public static SubLObject f33847(final SubLObject var20, final SubLObject var19, SubLObject var27, SubLObject var2, SubLObject var11) {
        if (var27 == module0548.UNPROVIDED) {
            var27 = (SubLObject)module0548.NIL;
        }
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        if (var11 == module0548.UNPROVIDED) {
            var11 = (SubLObject)module0548.NIL;
        }
        if (module0548.NIL == var27) {
            var27 = (SubLObject)ConsesLow.list(Symbols.symbol_function((SubLObject)module0548.$ic11$));
        }
        final SubLObject var28 = f33848(var20, var19, var27, var2);
        final SubLObject var29 = f33823(var2);
        f33849(var29, var28, var2, var27);
        return f33826(var29, var11);
    }
    
    public static SubLObject f33850(final SubLObject var20, final SubLObject var19, SubLObject var2, SubLObject var28) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        if (var28 == module0548.UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)module0548.$ic12$);
        }
        final SubLObject var29 = module0424.f29696(var20);
        final SubLObject var30 = module0424.f29955(var20);
        return f33851(var29, var30, var19, var2, var28);
    }
    
    public static SubLObject f33851(final SubLObject var29, final SubLObject var30, final SubLObject var19, SubLObject var2, final SubLObject var28) {
        final SubLObject var32;
        final SubLObject var31 = var32 = var2;
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0548.$ic13$, var32);
        final SubLObject var34 = (SubLObject)((module0548.NIL != var33) ? conses_high.cadr(var33) : module0548.T);
        final SubLObject var35 = module0424.f29687(var29, var19, (SubLObject)module0548.UNPROVIDED);
        final SubLObject var36 = module0424.f29687(var30, var19, (SubLObject)module0548.UNPROVIDED);
        final SubLObject var37 = (SubLObject)ConsesLow.list(var35, var36);
        final SubLObject var38 = (module0548.NIL != var34) ? f33834(var37) : var37;
        SubLObject var38_39;
        final SubLObject var36_37 = var38_39 = var38;
        SubLObject var39 = (SubLObject)module0548.NIL;
        SubLObject var40 = (SubLObject)module0548.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var38_39, var36_37, (SubLObject)module0548.$ic14$);
        var39 = var38_39.first();
        var38_39 = var38_39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38_39, var36_37, (SubLObject)module0548.$ic14$);
        var40 = var38_39.first();
        var38_39 = var38_39.rest();
        if (module0548.NIL == var38_39) {
            final SubLObject var41 = Sort.sort(var39, var28, (SubLObject)module0548.UNPROVIDED);
            final SubLObject var42 = Sort.sort(var40, var28, (SubLObject)module0548.UNPROVIDED);
            final SubLObject var43 = f33820(var41);
            final SubLObject var44 = f33820(var42);
            final SubLObject var45 = f33835((SubLObject)ConsesLow.list(var44, var43));
            if (module0548.NIL == conses_high.getf(var2, (SubLObject)module0548.$ic2$, (SubLObject)module0548.UNPROVIDED)) {
                var2 = conses_high.copy_list(var2);
                var2 = conses_high.putf(var2, (SubLObject)module0548.$ic2$, (SubLObject)module0548.$ic15$);
            }
            return f33818(var45, var2);
        }
        cdestructuring_bind.cdestructuring_bind_error(var36_37, (SubLObject)module0548.$ic14$);
        return (SubLObject)module0548.NIL;
    }
    
    public static SubLObject f33852(final SubLObject var20, final SubLObject var46, final SubLObject var19, SubLObject var2, SubLObject var28) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        if (var28 == module0548.UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)module0548.$ic12$);
        }
        final SubLObject var47 = module0424.f29688(module0424.f29696(var46));
        final SubLObject var48 = module0424.f29955(var20);
        final SubLObject var49 = module0424.f29952(var48, (SubLObject)module0548.$ic16$, (SubLObject)module0548.$ic17$, (SubLObject)module0548.UNPROVIDED);
        final SubLObject var50 = module0424.f29693(var49, var47, (SubLObject)module0548.NIL);
        final SubLObject var51 = module0424.f29693(var49, var47, (SubLObject)module0548.T);
        if (module0548.NIL == module0424.f29678(var50)) {
            Errors.warn((SubLObject)module0548.$ic18$);
            return (SubLObject)module0548.NIL;
        }
        return f33851(var50, var51, var19, var2, var28);
    }
    
    public static SubLObject f33853(final SubLObject var51, final SubLObject var52, SubLObject var2) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        final SubLObject var53 = (SubLObject)module0548.$ic19$;
        final SubLObject var54 = (SubLObject)module0548.$ic20$;
        f33854(var51, var53);
        f33855(var54, var53, var2, var52, var51);
        return f33856(var54, var52);
    }
    
    public static SubLObject f33837(final SubLObject var17, final SubLObject var18, final SubLObject var19, SubLObject var2) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        final SubLObject var20 = f33857(var17, var18, var19);
        final SubLObject var21 = f33858(var2, var19);
        return f33859(var20, var2, var21);
    }
    
    public static SubLObject f33859(final SubLObject var8, final SubLObject var2, final SubLObject var53) {
        final SubLObject var54 = f33821(var2);
        final SubLObject var55 = module0035.f2521(var8);
        return f33822(var54, var55, var53);
    }
    
    public static SubLObject f33857(final SubLObject var17, final SubLObject var18, final SubLObject var19) {
        SubLObject var20 = (SubLObject)module0548.NIL;
        SubLObject var21 = module0424.f29678(var17);
        SubLObject var22 = (SubLObject)module0548.NIL;
        var22 = var21.first();
        while (module0548.NIL != var21) {
            final SubLObject var23 = module0424.f29629(var22);
            final SubLObject var24 = module0424.f29801(var18, var23);
            final SubLObject var25 = module0424.f29640(var22, var19, (SubLObject)module0548.UNPROVIDED);
            final SubLObject var26 = module0424.f29640(var24, var19, (SubLObject)module0548.UNPROVIDED);
            if (module0548.NIL != var25 && module0548.NIL != var26) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, var26), var20);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f33860(final SubLObject var25, final SubLObject var19) {
        SubLObject var26 = (SubLObject)module0548.NIL;
        final SubLObject var27 = var25.first();
        final SubLObject var28 = module0424.f29687(var27, (SubLObject)module0548.$ic21$, (SubLObject)module0548.UNPROVIDED);
        SubLObject var29 = (SubLObject)module0548.ZERO_INTEGER;
        SubLObject var30 = (SubLObject)module0548.NIL;
        SubLObject var31 = (SubLObject)module0548.NIL;
        SubLObject var32 = (SubLObject)module0548.NIL;
        SubLObject var33 = var28;
        SubLObject var34 = (SubLObject)module0548.NIL;
        var34 = var33.first();
        while (module0548.NIL != var33) {
            var30 = module0424.f29801(var27, var34);
            var31 = module0424.f29640(var30, var19, (SubLObject)module0548.UNPROVIDED);
            if (module0548.NIL != var31) {
                var32 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, var31), var32);
            }
            var29 = Numbers.add(var29, (SubLObject)module0548.ONE_INTEGER);
            var33 = var33.rest();
            var34 = var33.first();
        }
        var26 = (SubLObject)ConsesLow.cons(var32, var26);
        var33 = var25.rest();
        SubLObject var35 = (SubLObject)module0548.NIL;
        var35 = var33.first();
        while (module0548.NIL != var33) {
            var29 = (SubLObject)module0548.ZERO_INTEGER;
            SubLObject var55_68 = var28;
            SubLObject var36 = (SubLObject)module0548.NIL;
            var36 = var55_68.first();
            while (module0548.NIL != var55_68) {
                var30 = module0424.f29801(var35, var36);
                var31 = module0424.f29640(var30, var19, (SubLObject)module0548.UNPROVIDED);
                if (module0548.NIL != var31) {
                    var32 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, var31), var32);
                }
                var29 = Numbers.add(var29, (SubLObject)module0548.ONE_INTEGER);
                var55_68 = var55_68.rest();
                var36 = var55_68.first();
            }
            var26 = (SubLObject)ConsesLow.cons(var32, var26);
            var33 = var33.rest();
            var35 = var33.first();
        }
        return Sequences.nreverse(var26);
    }
    
    public static SubLObject f33844(final SubLObject var25, final SubLObject var19, final SubLObject var23) {
        SubLObject var26 = (SubLObject)module0548.NIL;
        SubLObject var27 = (SubLObject)module0548.NIL;
        SubLObject var28 = (SubLObject)module0548.NIL;
        var27 = module0424.f30006(var25.first(), var19);
        SubLObject var29 = (SubLObject)module0548.ZERO_INTEGER;
        SubLObject var30 = (SubLObject)module0548.NIL;
        SubLObject var31 = (SubLObject)module0548.NIL;
        SubLObject var32 = var27;
        SubLObject var33 = (SubLObject)module0548.NIL;
        var33 = var32.first();
        while (module0548.NIL != var32) {
            var30 = module0424.f29640(var33, var19, (SubLObject)module0548.UNPROVIDED);
            if (module0548.NIL != var30) {
                var31 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, var30), var31);
            }
            var29 = Numbers.add(var29, (SubLObject)module0548.ONE_INTEGER);
            var32 = var32.rest();
            var33 = var32.first();
        }
        var26 = (SubLObject)ConsesLow.cons(var31, var26);
        var32 = var25.rest();
        SubLObject var34 = (SubLObject)module0548.NIL;
        var34 = var32.first();
        while (module0548.NIL != var32) {
            var29 = (SubLObject)module0548.ZERO_INTEGER;
            if (var23.eql((SubLObject)module0548.$ic10$)) {
                SubLObject var55_72;
                var28 = (var55_72 = module0424.f30006(var34, var19));
                SubLObject var35 = (SubLObject)module0548.NIL;
                var35 = var55_72.first();
                while (module0548.NIL != var55_72) {
                    var30 = module0424.f29640(var35, var19, (SubLObject)module0548.UNPROVIDED);
                    if (module0548.NIL != var30) {
                        var31 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, var30), var31);
                    }
                    var29 = Numbers.add(var29, (SubLObject)module0548.ONE_INTEGER);
                    var55_72 = var55_72.rest();
                    var35 = var55_72.first();
                }
            }
            else if (var23.eql((SubLObject)module0548.$ic7$)) {
                SubLObject var55_73 = var27;
                SubLObject var35 = (SubLObject)module0548.NIL;
                var35 = var55_73.first();
                while (module0548.NIL != var55_73) {
                    final SubLObject var36 = module0424.f29801(var34, module0424.f29640(var35, (SubLObject)module0548.$ic21$, (SubLObject)module0548.UNPROVIDED));
                    var30 = module0424.f29640(var36, var19, (SubLObject)module0548.UNPROVIDED);
                    if (module0548.NIL != var30) {
                        var31 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, var30), var31);
                    }
                    var29 = Numbers.add(var29, (SubLObject)module0548.ONE_INTEGER);
                    var55_73 = var55_73.rest();
                    var35 = var55_73.first();
                }
            }
            var26 = (SubLObject)ConsesLow.cons(var31, var26);
            var32 = var32.rest();
            var34 = var32.first();
        }
        return Sequences.nreverse(var26);
    }
    
    public static SubLObject f33858(final SubLObject var2, final SubLObject var19) {
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0548.$ic22$, var2);
        final SubLObject var21 = (SubLObject)((module0548.NIL != var20) ? conses_high.cadr(var20) : module0548.$ic23$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0548.$ic24$, var2);
        final SubLObject var23 = (SubLObject)((module0548.NIL != var22) ? conses_high.cadr(var22) : module0548.$ic25$);
        final SubLObject var24 = Sequences.cconcatenate((SubLObject)module0548.$ic26$, module0006.f203(var21));
        final SubLObject var25 = Sequences.cconcatenate((SubLObject)module0548.$ic27$, module0006.f203(var23));
        final SubLObject var26 = Sequences.cconcatenate((SubLObject)module0548.$ic28$, module0006.f205(var19));
        final SubLObject var27 = (SubLObject)ConsesLow.list(var24, var25, var26);
        return var27;
    }
    
    public static SubLObject f33840(final SubLObject var20, final SubLObject var26, final SubLObject var2) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0548.NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && module0548.NIL == module0035.f1994(var26, (SubLObject)module0548.TEN_INTEGER, (SubLObject)module0548.UNPROVIDED)) {
            Errors.error((SubLObject)module0548.$ic29$, var26);
        }
        final SubLObject var28 = f33861(var20, var26);
        final SubLObject var29 = f33862(var2, var26);
        return f33863(var28, var2, var29);
    }
    
    public static SubLObject f33863(final SubLObject var8, final SubLObject var2, final SubLObject var53) {
        final SubLObject var54 = f33821(var2);
        final SubLObject var55 = module0035.f2521(var8);
        return f33822(var54, var55, var53);
    }
    
    public static SubLObject f33861(final SubLObject var20, final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0548.NIL;
        SubLObject var29;
        final SubLObject var28 = var29 = module0424.f29678(var20);
        SubLObject var30 = (SubLObject)module0548.NIL;
        var30 = var29.first();
        while (module0548.NIL != var29) {
            SubLObject var31 = (SubLObject)module0548.NIL;
            SubLObject var55_84 = var26;
            SubLObject var32 = (SubLObject)module0548.NIL;
            var32 = var55_84.first();
            while (module0548.NIL != var55_84) {
                final SubLObject var33 = module0424.f29640(var30, var32, (SubLObject)module0548.UNPROVIDED);
                var31 = (SubLObject)ConsesLow.cons(var33, var31);
                var55_84 = var55_84.rest();
                var32 = var55_84.first();
            }
            if (module0548.NIL == module0035.member_if_not(Symbols.symbol_function((SubLObject)module0548.$ic30$), var31, (SubLObject)module0548.UNPROVIDED)) {
                var27 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var31), var27);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f33862(final SubLObject var2, final SubLObject var26) {
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0548.$ic24$, var2);
        final SubLObject var28 = (SubLObject)((module0548.NIL != var27) ? conses_high.cadr(var27) : module0548.$ic25$);
        final SubLObject var29 = Sequences.cconcatenate((SubLObject)module0548.$ic27$, module0006.f203(var28));
        final SubLObject var30 = Sequences.cconcatenate((SubLObject)module0548.$ic31$, module0006.f205(var26));
        final SubLObject var31 = (SubLObject)ConsesLow.list(var29, var30);
        return var31;
    }
    
    public static SubLObject f33848(final SubLObject var20, final SubLObject var19, final SubLObject var27, SubLObject var2) {
        if (var2 == module0548.UNPROVIDED) {
            var2 = (SubLObject)module0548.NIL;
        }
        final SubLObject var28 = f33864(var20, var19);
        final SubLObject var29 = f33865(var2, var19);
        return f33866(var28, var2, var29, var27);
    }
    
    public static SubLObject f33866(final SubLObject var8, final SubLObject var2, final SubLObject var53, final SubLObject var27) {
        final SubLObject var54 = f33821(var2);
        final SubLObject var55 = f33867(var8, var27);
        return f33822(var54, var55, var53);
    }
    
    public static SubLObject f33865(final SubLObject var2, final SubLObject var19) {
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0548.$ic24$, var2);
        final SubLObject var21 = (SubLObject)((module0548.NIL != var20) ? conses_high.cadr(var20) : module0548.$ic25$);
        final SubLObject var22 = Sequences.cconcatenate((SubLObject)module0548.$ic27$, module0006.f203(var21));
        final SubLObject var23 = Sequences.cconcatenate((SubLObject)module0548.$ic28$, module0006.f205(var19));
        final SubLObject var24 = Sequences.copy_seq((SubLObject)module0548.$ic32$);
        final SubLObject var25 = (SubLObject)ConsesLow.list(var22, var23, var24);
        return var25;
    }
    
    public static SubLObject f33864(final SubLObject var20, final SubLObject var19) {
        SubLObject var21 = (SubLObject)module0548.NIL;
        SubLObject var23;
        final SubLObject var22 = var23 = module0424.f29678(var20);
        SubLObject var24 = (SubLObject)module0548.NIL;
        var24 = var23.first();
        while (module0548.NIL != var23) {
            final SubLObject var25 = module0424.f29629(var24);
            final SubLObject var26 = module0424.f29640(var24, var19, (SubLObject)module0548.UNPROVIDED);
            if (var26.isNumber()) {
                var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, var26), var21);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return Sequences.nreverse(var21);
    }
    
    public static SubLObject f33867(final SubLObject var8, final SubLObject var27) {
        SubLObject var28 = (SubLObject)module0548.NIL;
        final SubLObject var29 = Sort.stable_sort(conses_high.copy_list(var8), Symbols.symbol_function((SubLObject)module0548.$ic33$), Symbols.symbol_function((SubLObject)module0548.$ic34$));
        final SubLObject var30 = module0067.f4880((SubLObject)module0548.UNPROVIDED, (SubLObject)module0548.UNPROVIDED);
        SubLObject var31 = (SubLObject)module0548.NIL;
        SubLObject var32 = (SubLObject)module0548.NIL;
        SubLObject var33 = (SubLObject)module0548.NIL;
        var31 = var29;
        var32 = var31.first();
        for (var33 = (SubLObject)module0548.ZERO_INTEGER; module0548.NIL != var31; var31 = var31.rest(), var32 = var31.first(), var33 = Numbers.add((SubLObject)module0548.ONE_INTEGER, var33)) {
            module0067.f4886(var30, var32, var33);
        }
        final SubLObject var34 = module0035.f2520(var29, var27, Symbols.symbol_function((SubLObject)module0548.$ic35$));
        SubLObject var35 = (SubLObject)module0548.NIL;
        SubLObject var36 = (SubLObject)module0548.NIL;
        SubLObject var37 = (SubLObject)module0548.NIL;
        var35 = var34;
        var36 = var35.first();
        for (var37 = (SubLObject)module0548.ZERO_INTEGER; module0548.NIL != var35; var35 = var35.rest(), var36 = var35.first(), var37 = Numbers.add((SubLObject)module0548.ONE_INTEGER, var37)) {
            if (!var37.isZero()) {
                final SubLObject var38 = Sequences.cconcatenate((SubLObject)module0548.$ic36$, module0006.f203(var37));
                var28 = (SubLObject)ConsesLow.cons(var38, var28);
            }
            if (module0548.NIL == var36) {
                Errors.warn((SubLObject)module0548.$ic37$, var37);
            }
            SubLObject var39 = var36;
            SubLObject var40 = (SubLObject)module0548.NIL;
            var40 = var39.first();
            while (module0548.NIL != var39) {
                final SubLObject var41 = module0067.f4884(var30, var40, (SubLObject)module0548.UNPROVIDED);
                SubLObject var43;
                final SubLObject var42 = var43 = var40;
                SubLObject var44 = (SubLObject)module0548.NIL;
                SubLObject var45 = (SubLObject)module0548.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0548.$ic38$);
                var44 = var43.first();
                var43 = var43.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0548.$ic38$);
                var45 = var43.first();
                var43 = var43.rest();
                if (module0548.NIL == var43) {
                    var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var41, var45), var28);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0548.$ic38$);
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        return Sequences.nreverse(var28);
    }
    
    public static SubLObject f33854(final SubLObject var51, final SubLObject var9) {
        final SubLObject var52 = f33868(var51);
        return f33822(var9, var52, (SubLObject)module0548.UNPROVIDED);
    }
    
    public static SubLObject f33868(final SubLObject var51) {
        SubLObject var52 = (SubLObject)module0548.NIL;
        final SubLObject var53 = module0369.f25492(var51);
        if (module0548.NIL == module0065.f4772(var53, (SubLObject)module0548.$ic39$)) {
            final SubLObject var106_107 = var53;
            if (module0548.NIL == module0065.f4775(var106_107, (SubLObject)module0548.$ic39$)) {
                final SubLObject var54 = module0065.f4740(var106_107);
                final SubLObject var55 = (SubLObject)module0548.NIL;
                SubLObject var56;
                SubLObject var57;
                SubLObject var58;
                SubLObject var59;
                SubLObject var114_115;
                SubLObject var60;
                for (var56 = Sequences.length(var54), var57 = (SubLObject)module0548.NIL, var57 = (SubLObject)module0548.ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)module0548.ONE_INTEGER)) {
                    var58 = ((module0548.NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)module0548.ONE_INTEGER) : var57);
                    var59 = Vectors.aref(var54, var58);
                    if (module0548.NIL == module0065.f4749(var59) || module0548.NIL == module0065.f4773((SubLObject)module0548.$ic39$)) {
                        if (module0548.NIL != module0065.f4749(var59)) {
                            var59 = (SubLObject)module0548.$ic39$;
                        }
                        var114_115 = module0369.f25629(var59);
                        var60 = module0369.f25623(var59, (SubLObject)module0548.NIL);
                        var52 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var60, var114_115), var52);
                    }
                }
            }
            final SubLObject var117_118 = var53;
            if (module0548.NIL == module0065.f4777(var117_118) || module0548.NIL == module0065.f4773((SubLObject)module0548.$ic39$)) {
                final SubLObject var61 = module0065.f4738(var117_118);
                SubLObject var62 = module0065.f4739(var117_118);
                final SubLObject var63 = module0065.f4734(var117_118);
                final SubLObject var64 = (SubLObject)((module0548.NIL != module0065.f4773((SubLObject)module0548.$ic39$)) ? module0548.NIL : module0548.$ic39$);
                while (var62.numL(var63)) {
                    final SubLObject var65 = Hashtables.gethash_without_values(var62, var61, var64);
                    if (module0548.NIL == module0065.f4773((SubLObject)module0548.$ic39$) || module0548.NIL == module0065.f4749(var65)) {
                        final SubLObject var114_116 = module0369.f25629(var65);
                        final SubLObject var66 = module0369.f25623(var65, (SubLObject)module0548.NIL);
                        var52 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var66, var114_116), var52);
                    }
                    var62 = Numbers.add(var62, (SubLObject)module0548.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var52);
    }
    
    public static SubLObject f33822(final SubLObject var9, final SubLObject var8, SubLObject var53) {
        if (var53 == module0548.UNPROVIDED) {
            var53 = (SubLObject)module0548.NIL;
        }
        return f33869();
    }
    
    public static SubLObject f33870(final SubLObject var20, final SubLObject var19) {
        SubLObject var21 = (SubLObject)module0548.NIL;
        SubLObject var22 = (SubLObject)module0548.NIL;
        SubLObject var23 = (SubLObject)module0548.NIL;
        SubLObject var24 = (SubLObject)module0548.NIL;
        var22 = module0424.f29678(var20);
        var23 = var22.first();
        for (var24 = (SubLObject)module0548.ZERO_INTEGER; module0548.NIL != var22; var22 = var22.rest(), var23 = var22.first(), var24 = Numbers.add((SubLObject)module0548.ONE_INTEGER, var24)) {
            final SubLObject var25 = module0424.f29640(var23, var19, (SubLObject)module0548.UNPROVIDED);
            final SubLObject var26 = (SubLObject)ConsesLow.list(var24, var25);
            var21 = (SubLObject)ConsesLow.cons(var26, var21);
        }
        return Sequences.nreverse(var21);
    }
    
    public static SubLObject f33820(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0548.NIL;
        SubLObject var7 = (SubLObject)module0548.NIL;
        SubLObject var8 = (SubLObject)module0548.NIL;
        SubLObject var9 = (SubLObject)module0548.NIL;
        var7 = var5;
        var8 = var7.first();
        for (var9 = (SubLObject)module0548.ZERO_INTEGER; module0548.NIL != var7; var7 = var7.rest(), var8 = var7.first(), var9 = Numbers.add((SubLObject)module0548.ONE_INTEGER, var9)) {
            var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var9, var8), var6);
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f33835(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0548.NIL;
        final SubLObject var8 = module0048.f3381(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0548.$ic41$), var6), (SubLObject)module0548.UNPROVIDED);
        SubLObject var9 = var6;
        SubLObject var10 = (SubLObject)module0548.NIL;
        var10 = var9.first();
        while (module0548.NIL != var9) {
            final SubLObject var11 = module0035.f2105(var10);
            final SubLObject var12 = Sequences.length(var11);
            SubLObject var13 = (SubLObject)module0548.NIL;
            SubLObject var14 = (SubLObject)module0548.NIL;
            SubLObject var15;
            SubLObject var16;
            for (var15 = (SubLObject)module0548.NIL, var15 = (SubLObject)module0548.ZERO_INTEGER; var15.numL(var8); var15 = Numbers.add(var15, (SubLObject)module0548.ONE_INTEGER)) {
                if (var15.numL(var12)) {
                    var16 = Vectors.aref(var11, var15);
                    var14 = (SubLObject)ConsesLow.cons(var16, var14);
                    var13 = var16;
                }
                else {
                    var14 = (SubLObject)ConsesLow.cons(var13, var14);
                }
            }
            var7 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var14), var7);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var7);
    }
    
    public static SubLObject f33834(final SubLObject var132) {
        SubLObject var133 = (SubLObject)module0548.NIL;
        final SubLObject var134 = module0048.f3381(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0548.$ic41$), var132), (SubLObject)module0548.UNPROVIDED);
        SubLObject var135 = var132;
        SubLObject var136 = (SubLObject)module0548.NIL;
        var136 = var135.first();
        while (module0548.NIL != var135) {
            final SubLObject var137 = Numbers.round(Numbers.divide(var134, Sequences.length(var136)), (SubLObject)module0548.UNPROVIDED);
            if (var137.numG((SubLObject)module0548.ONE_INTEGER)) {
                SubLObject var138 = (SubLObject)module0548.NIL;
                SubLObject var55_137 = var136;
                SubLObject var139 = (SubLObject)module0548.NIL;
                var139 = var55_137.first();
                while (module0548.NIL != var55_137) {
                    SubLObject var140;
                    for (var140 = (SubLObject)module0548.NIL, var140 = (SubLObject)module0548.ZERO_INTEGER; var140.numL(var137); var140 = Numbers.add(var140, (SubLObject)module0548.ONE_INTEGER)) {
                        var138 = (SubLObject)ConsesLow.cons(var139, var138);
                    }
                    var55_137 = var55_137.rest();
                    var139 = var55_137.first();
                }
                var133 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var138), var133);
            }
            else {
                var133 = (SubLObject)ConsesLow.cons(var136, var133);
            }
            var135 = var135.rest();
            var136 = var135.first();
        }
        return Sequences.nreverse(var133);
    }
    
    public static SubLObject f33825(final SubLObject var10, final SubLObject var9, final SubLObject var2, final SubLObject var7) {
        return f33869();
    }
    
    public static SubLObject f33830(final SubLObject var10, final SubLObject var9, final SubLObject var2, final SubLObject var7) {
        return f33869();
    }
    
    public static SubLObject f33832(final SubLObject var10, final SubLObject var9, final SubLObject var2) {
        return f33869();
    }
    
    public static SubLObject f33838(final SubLObject var10, final SubLObject var9, final SubLObject var2) {
        return f33869();
    }
    
    public static SubLObject f33828(final SubLObject var10, final SubLObject var9, final SubLObject var2, final SubLObject var7) {
        return f33869();
    }
    
    public static SubLObject f33842(final SubLObject var10, final SubLObject var9, final SubLObject var2, final SubLObject var23) {
        return f33869();
    }
    
    public static SubLObject f33846(final SubLObject var10, final SubLObject var9, final SubLObject var2, final SubLObject var23, final SubLObject var26) {
        return f33869();
    }
    
    public static SubLObject f33849(final SubLObject var10, final SubLObject var9, final SubLObject var2, final SubLObject var27) {
        return f33869();
    }
    
    public static SubLObject f33855(final SubLObject var10, final SubLObject var9, final SubLObject var2, final SubLObject var52, final SubLObject var51) {
        return f33869();
    }
    
    public static SubLObject f33871(final SubLObject var1) {
        SubLObject var2 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var3 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var4 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var5 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var6 = var1;
        SubLObject var7 = (SubLObject)module0548.NIL;
        var7 = var6.first();
        while (module0548.NIL != var6) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)module0548.NIL;
            SubLObject var11 = (SubLObject)module0548.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0548.$ic42$);
            var10 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0548.$ic42$);
            var11 = var9.first();
            var9 = var9.rest();
            if (module0548.NIL == var9) {
                if (var10.isNumber() && var11.isNumber()) {
                    if (var10.numG(var3)) {
                        var3 = var10;
                    }
                    if (var11.numG(var5)) {
                        var5 = var11;
                    }
                    if (var10.numL(var2)) {
                        var2 = var10;
                    }
                    if (var11.numL(var4)) {
                        var4 = var11;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0548.$ic42$);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        final SubLObject var12 = Numbers.subtract(var3, var2);
        final SubLObject var13 = Numbers.add(var2, Numbers.multiply((SubLObject)module0548.$ic43$, var12));
        final SubLObject var14 = Numbers.subtract(var5, var4);
        final SubLObject var15 = Numbers.add(var5, Numbers.multiply((SubLObject)module0548.$ic44$, var14));
        return (SubLObject)ConsesLow.list(var13, var15);
    }
    
    public static SubLObject f33872(final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0548.NIL;
        SubLObject var10 = (SubLObject)module0548.NIL;
        SubLObject var11 = (SubLObject)module0548.NIL;
        SubLObject var12 = (SubLObject)module0548.NIL;
        var10 = var8;
        var11 = var10.first();
        for (var12 = (SubLObject)module0548.ZERO_INTEGER; module0548.NIL != var10; var10 = var10.rest(), var11 = var10.first(), var12 = Numbers.add((SubLObject)module0548.ONE_INTEGER, var12)) {
            SubLObject var14;
            final SubLObject var13 = var14 = var11;
            SubLObject var15 = (SubLObject)module0548.NIL;
            SubLObject var16 = (SubLObject)module0548.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0548.$ic45$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0548.$ic45$);
            var16 = var14.first();
            var14 = var14.rest();
            if (module0548.NIL == var14) {
                var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var12, var16), var9);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0548.$ic45$);
            }
        }
        return f33871(Sequences.nreverse(var9));
    }
    
    public static SubLObject f33873(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)module0548.$ic47$, module0548.$g3979$.getGlobalValue());
    }
    
    public static SubLObject f33824(final SubLObject var2) {
        return conses_high.getf(var2, (SubLObject)module0548.$ic48$, (SubLObject)module0548.NIL);
    }
    
    public static SubLObject f33874(final SubLObject var154, final SubLObject var155, SubLObject var156) {
        if (var156 == module0548.UNPROVIDED) {
            var156 = module0548.$g3980$.getGlobalValue();
        }
        return Sequences.cconcatenate(var156, new SubLObject[] { var154, module0548.$ic50$, var155 });
    }
    
    public static SubLObject f33875(final SubLObject var154) {
        return f33874(var154, (SubLObject)module0548.$ic51$, (SubLObject)module0548.UNPROVIDED);
    }
    
    public static SubLObject f33821(final SubLObject var2) {
        final SubLObject var3 = f33873(var2);
        return f33875(var3);
    }
    
    public static SubLObject f33876(final SubLObject var154) {
        return f33874(var154, (SubLObject)module0548.$ic46$, (SubLObject)module0548.UNPROVIDED);
    }
    
    public static SubLObject f33823(final SubLObject var2) {
        final SubLObject var3 = f33873(var2);
        return f33876(var3);
    }
    
    public static SubLObject f33826(final SubLObject var10, final SubLObject var11) {
        return f33869();
    }
    
    public static SubLObject f33856(final SubLObject var10, final SubLObject var52) {
        final SubLObject var53 = f33877(var52);
        return (SubLObject)((module0548.NIL != f33878(var10)) ? var53 : module0548.NIL);
    }
    
    public static SubLObject f33878(final SubLObject var10) {
        return f33869();
    }
    
    public static SubLObject f33879() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        var24.resetMultipleValues();
        final SubLObject var25 = f33880();
        final SubLObject var26 = var24.secondMultipleValue();
        var24.resetMultipleValues();
        return var25;
    }
    
    public static SubLObject f33877(final SubLObject var52) {
        final SubLObject var53 = f33881();
        return Sequences.cconcatenate(var52, var53);
    }
    
    public static SubLObject f33881() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        var24.resetMultipleValues();
        final SubLObject var25 = f33880();
        final SubLObject var26 = var24.secondMultipleValue();
        var24.resetMultipleValues();
        return var26;
    }
    
    public static SubLObject f33880() {
        return f33869();
    }
    
    public static SubLObject f33882() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0548.NIL != Processes.external_processes_supportedP() && module0548.NIL != f33883());
    }
    
    public static SubLObject f33883() {
        return (SubLObject)module0548.NIL;
    }
    
    public static SubLObject f33869() {
        return Errors.warn((SubLObject)module0548.$ic52$);
    }
    
    public static SubLObject f33884() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33817", "S#37218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33819", "S#33414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33818", "S#28961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33827", "S#37219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33829", "S#28962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33831", "S#37220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33833", "S#37221", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33836", "S#33273", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33839", "S#37222", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33841", "S#33274", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33843", "S#37223", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33845", "S#33275", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33847", "S#33276", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33850", "S#33412", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33851", "S#37224", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33852", "S#33413", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33853", "S#37225", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33837", "S#37226", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33859", "S#37227", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33857", "S#37228", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33860", "S#37229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33844", "S#37230", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33858", "S#37231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33840", "S#37232", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33863", "S#37233", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33861", "S#37234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33862", "S#37235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33848", "S#37236", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33866", "S#37237", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33865", "S#37238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33864", "S#37239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33867", "S#37240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33854", "S#37241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33868", "S#37242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33822", "S#37243", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33870", "S#37244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33820", "S#29144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33835", "S#37245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33834", "S#37246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33825", "S#37247", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33830", "S#37248", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33832", "S#37249", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33838", "S#37250", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33828", "S#37251", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33842", "S#37252", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33846", "S#37253", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33849", "S#37254", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33855", "S#37255", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33871", "S#37256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33872", "S#37257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33873", "S#37258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33824", "S#37259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33874", "S#37260", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33875", "S#37261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33821", "S#37262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33876", "S#37263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33823", "S#37264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33826", "S#37265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33856", "S#37266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33878", "S#37267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33879", "S#37268", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33877", "S#37269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33881", "S#37270", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33880", "S#37271", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33882", "S#37272", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33883", "S#37273", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0548", "f33869", "S#37274", 0, 0, false);
        return (SubLObject)module0548.NIL;
    }
    
    public static SubLObject f33885() {
        module0548.$g3978$ = SubLFiles.deflexical("S#37275", (SubLObject)module0548.$ic40$);
        module0548.$g3979$ = SubLFiles.deflexical("S#37276", (SubLObject)module0548.$ic46$);
        module0548.$g3980$ = SubLFiles.deflexical("S#37277", (SubLObject)module0548.$ic49$);
        return (SubLObject)module0548.NIL;
    }
    
    public static SubLObject f33886() {
        return (SubLObject)module0548.NIL;
    }
    
    public void declareFunctions() {
        f33884();
    }
    
    public void initializeVariables() {
        f33885();
    }
    
    public void runTopLevelForms() {
        f33886();
    }
    
    static {
        me = (SubLFile)new module0548();
        module0548.$g3978$ = null;
        module0548.$g3979$ = null;
        module0548.$g3980$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("LINE-LABEL");
        $ic1$ = SubLObjectFactory.makeString("");
        $ic2$ = SubLObjectFactory.makeKeyword("LINE-LABELS");
        $ic3$ = SubLObjectFactory.makeSymbol("S#29144", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("BASELINE"), (SubLObject)SubLObjectFactory.makeKeyword("EXPERIMENT"));
        $ic6$ = SubLObjectFactory.makeString("Invalid sort-by parameter.");
        $ic7$ = SubLObjectFactory.makeKeyword("FIRST");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("FIRST"));
        $ic9$ = SubLObjectFactory.makeString("There should be atleast 2 runs specified");
        $ic10$ = SubLObjectFactory.makeKeyword("ALL");
        $ic11$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic12$ = SubLObjectFactory.makeSymbol("S#3700", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("SCALE?");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37278", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37279", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unanswerable"), (SubLObject)SubLObjectFactory.makeString("answerable"));
        $ic16$ = SubLObjectFactory.makeString("timed out");
        $ic17$ = SubLObjectFactory.makeSymbol("S#32819", "CYC");
        $ic18$ = SubLObjectFactory.makeString("No oracularly answerable timed-out queries");
        $ic19$ = SubLObjectFactory.makeString("/tmp/inference_answer_timeline.data");
        $ic20$ = SubLObjectFactory.makeString("/tmp/inference_answer_timeline.plot");
        $ic21$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic22$ = SubLObjectFactory.makeKeyword("BASELINE-NAME");
        $ic23$ = SubLObjectFactory.makeString("baseline");
        $ic24$ = SubLObjectFactory.makeKeyword("EXPERIMENT-NAME");
        $ic25$ = SubLObjectFactory.makeString("experiment");
        $ic26$ = SubLObjectFactory.makeString("baseline   = ");
        $ic27$ = SubLObjectFactory.makeString("experiment = ");
        $ic28$ = SubLObjectFactory.makeString("property   = ");
        $ic29$ = SubLObjectFactory.makeString("Cannot handle more than 10 properties, got ~s");
        $ic30$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic31$ = SubLObjectFactory.makeString("properties = ");
        $ic32$ = SubLObjectFactory.makeString("classification 0");
        $ic33$ = SubLObjectFactory.makeSymbol("<");
        $ic34$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic35$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic36$ = SubLObjectFactory.makeString("classification ");
        $ic37$ = SubLObjectFactory.makeString("Classification ~S was empty");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7306", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic39$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic40$ = SubLObjectFactory.makeString("/cyc/top/data/kb-stats/");
        $ic41$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9941", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9942", "CYC"));
        $ic43$ = (SubLFloat)SubLObjectFactory.makeDouble(0.3);
        $ic44$ = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37280", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic46$ = SubLObjectFactory.makeString("plot");
        $ic47$ = SubLObjectFactory.makeKeyword("PLOT-NAME");
        $ic48$ = SubLObjectFactory.makeKeyword("DISPLAY");
        $ic49$ = SubLObjectFactory.makeString("/tmp/");
        $ic50$ = SubLObjectFactory.makeString(".");
        $ic51$ = SubLObjectFactory.makeString("dat");
        $ic52$ = SubLObjectFactory.makeString("External plotting not enabled in this image");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0548.class
	Total time: 237 ms
	
	Decompiled with Procyon 0.5.32.
*/