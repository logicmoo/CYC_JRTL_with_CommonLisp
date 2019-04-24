package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0754 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0754";
    public static final String myFingerPrint = "ca98336589858368d3a1d9bcf420fb16078f47e6337067760ea7f8bbc3da582a";
    public static SubLSymbol $g6062$;
    private static SubLSymbol $g6063$;
    public static SubLSymbol $g6064$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
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
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLInteger $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLInteger $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLInteger $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLInteger $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLList $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    
    public static SubLObject f47284(final SubLObject var1, final SubLObject var2) {
        f47285(var1, var2, (SubLObject)module0754.ZERO_INTEGER);
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47286(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX51734_native.class) ? module0754.T : module0754.NIL);
    }
    
    public static SubLObject f47287(final SubLObject var1) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f47288(final SubLObject var1) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f47289(final SubLObject var1) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f47290(final SubLObject var1) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f47291(final SubLObject var1) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f47292(final SubLObject var1, final SubLObject var4) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f47293(final SubLObject var1, final SubLObject var4) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f47294(final SubLObject var1, final SubLObject var4) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f47295(final SubLObject var1, final SubLObject var4) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f47296(final SubLObject var1, final SubLObject var4) {
        assert module0754.NIL != f47286(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f47297(SubLObject var5) {
        if (var5 == module0754.UNPROVIDED) {
            var5 = (SubLObject)module0754.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX51734_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0754.NIL, var7 = var5; module0754.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0754.$ic19$)) {
                f47292(var6, var9);
            }
            else if (var10.eql((SubLObject)module0754.$ic20$)) {
                f47293(var6, var9);
            }
            else if (var10.eql((SubLObject)module0754.$ic21$)) {
                f47294(var6, var9);
            }
            else if (var10.eql((SubLObject)module0754.$ic22$)) {
                f47295(var6, var9);
            }
            else if (var10.eql((SubLObject)module0754.$ic23$)) {
                f47296(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0754.$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f47298(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0754.$ic25$, (SubLObject)module0754.$ic26$, (SubLObject)module0754.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0754.$ic27$, (SubLObject)module0754.$ic19$, f47287(var11));
        Functions.funcall(var12, var11, (SubLObject)module0754.$ic27$, (SubLObject)module0754.$ic20$, f47288(var11));
        Functions.funcall(var12, var11, (SubLObject)module0754.$ic27$, (SubLObject)module0754.$ic21$, f47289(var11));
        Functions.funcall(var12, var11, (SubLObject)module0754.$ic27$, (SubLObject)module0754.$ic22$, f47290(var11));
        Functions.funcall(var12, var11, (SubLObject)module0754.$ic27$, (SubLObject)module0754.$ic23$, f47291(var11));
        Functions.funcall(var12, var11, (SubLObject)module0754.$ic28$, (SubLObject)module0754.$ic26$, (SubLObject)module0754.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f47299(final SubLObject var11, final SubLObject var12) {
        return f47298(var11, var12);
    }
    
    public static SubLObject f47285(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)module0754.$ic30$, new SubLObject[] { f47287(var13), f47288(var13), f47291(var13), f47289(var13) });
        return var13;
    }
    
    public static SubLObject f47300(final SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var16 == module0754.UNPROVIDED) {
            var16 = f47301();
        }
        if (var17 == module0754.UNPROVIDED) {
            var17 = module0751.f46691();
        }
        if (var18 == module0754.UNPROVIDED) {
            var18 = (SubLObject)module0754.NIL;
        }
        if (var19 == module0754.UNPROVIDED) {
            var19 = (SubLObject)module0754.NIL;
        }
        final SubLObject var20 = f47297((SubLObject)module0754.UNPROVIDED);
        f47292(var20, var15);
        f47293(var20, var16);
        f47296(var20, var17);
        f47294(var20, var18);
        f47295(var20, var19);
        return var20;
    }
    
    public static SubLObject f47302(final SubLObject var21) {
        final SubLObject var22 = f47287(var21);
        final SubLObject var23 = f47288(var21);
        final SubLObject var24 = f47291(var21);
        final SubLObject var25 = f47289(var21);
        final SubLObject var26 = f47290(var21);
        return f47300(var22, var23, var24, var25, var26);
    }
    
    public static SubLObject f47303(final SubLObject var13, final SubLObject var16) {
        f47293(var13, var16);
        return var13;
    }
    
    public static SubLObject f47304(final SubLObject var13, final SubLObject var23) {
        f47296(var13, var23);
        return var13;
    }
    
    public static SubLObject f47305(final SubLObject var13, final SubLObject var18) {
        f47294(var13, var18);
        return var13;
    }
    
    public static SubLObject f47306() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        module0067.f4881(module0579.$g4323$.getDynamicValue(var24));
        return module0579.$g4323$.getDynamicValue(var24);
    }
    
    public static SubLObject f47301() {
        return module0754.$g6063$.getGlobalValue();
    }
    
    public static SubLObject f47307() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return module0067.f4902(module0579.$g4323$.getDynamicValue(var24));
    }
    
    public static SubLObject f47308(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0754.NIL == module0201.f12546(var15)) {
            final SubLObject var17 = Sequences.cconcatenate((SubLObject)module0754.$ic32$, new SubLObject[] { module0006.f205((SubLObject)module0754.ONE_INTEGER), module0754.$ic33$, module0006.f203((SubLObject)module0754.$ic34$) });
            module0578.f35476(var17, (SubLObject)ConsesLow.list(var15));
        }
        return (SubLObject)((module0754.NIL != module0201.f12546(var15)) ? module0067.f4884(module0579.$g4323$.getDynamicValue(var16), var15, (SubLObject)module0754.UNPROVIDED) : module0754.NIL);
    }
    
    public static SubLObject f47309(final SubLObject var26) {
        return Mapping.mapcar((SubLObject)module0754.$ic0$, var26);
    }
    
    public static SubLObject f47310(final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0579.f35510() && module0754.NIL != f47308(var15));
    }
    
    public static SubLObject f47311(final SubLObject var15) {
        return Equality.eq(f47312(var15), f47301());
    }
    
    public static SubLObject f47313(final SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var16 == module0754.UNPROVIDED) {
            var16 = f47301();
        }
        if (var17 == module0754.UNPROVIDED) {
            var17 = module0751.f46691();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0754.NIL != module0578.f35470((SubLObject)module0754.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0754.T, (SubLObject)module0754.$ic35$, var15, var16);
        }
        final SubLObject var19 = f47308(var15);
        final SubLObject var20 = (module0754.NIL != var19) ? f47302(var19) : f47300(var15, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        f47303(var20, var16);
        f47304(var20, var17);
        module0067.f4886(module0579.$g4323$.getDynamicValue(var18), var15, var20);
        f47314(var15, var16);
        return module0579.$g4323$.getDynamicValue(var18);
    }
    
    public static SubLObject f47315(final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f47308(var15);
        final SubLObject var19 = (module0754.NIL != var18) ? f47302(var18) : f47300(var15, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        f47303(var19, var16);
        if (module0754.NIL == var18) {
            f47304(var19, module0751.f46691());
        }
        module0067.f4886(module0579.$g4323$.getDynamicValue(var17), var15, var19);
        f47314(var15, var16);
        return module0579.$g4323$.getDynamicValue(var17);
    }
    
    public static SubLObject f47316(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        module0067.f4887(module0579.$g4323$.getDynamicValue(var16), var15);
        return module0579.$g4323$.getDynamicValue(var16);
    }
    
    public static SubLObject f47317(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        Mapping.mapcar((SubLObject)module0754.$ic36$, var26);
        return module0579.$g4323$.getDynamicValue(var27);
    }
    
    public static SubLObject f47318(final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != f47310(var15) && module0754.NIL != conses_high.member(f47319(var15), (SubLObject)module0754.$ic37$, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED));
    }
    
    public static SubLObject f47320(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0754.NIL == module0579.f35503(var18)) {
            if (module0754.NIL != module0578.f35470((SubLObject)module0754.TWO_INTEGER) && module0754.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0754.$ic38$, var18, module0579.f35504());
            }
            return (SubLObject)module0754.NIL;
        }
        final SubLObject var20 = f47308(var15);
        final SubLObject var21 = (module0754.NIL != var20) ? f47302(var20) : f47300(var15, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        f47305(var21, var18);
        module0067.f4886(module0579.$g4323$.getDynamicValue(var19), var15, var21);
        return module0579.$g4323$.getDynamicValue(var19);
    }
    
    public static SubLObject f47321(final SubLObject var29) {
        if (module0754.NIL != module0751.f46684(var29, module0754.$ic39$, (SubLObject)module0754.UNPROVIDED)) {
            return (SubLObject)module0754.$ic40$;
        }
        if (var29.eql(module0754.$ic41$)) {
            return (SubLObject)module0754.$ic42$;
        }
        return (SubLObject)module0754.$ic43$;
    }
    
    public static SubLObject f47322(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (module0754.NIL != module0202.f12590(var30) && module0754.NIL != module0212.f13762(module0205.f13132(var30))) {
            final SubLObject var32 = module0205.f13132(var30);
            final SubLObject var33 = module0226.f15099(var32, module0579.$g4262$.getDynamicValue(var31));
            final SubLObject var34 = (SubLObject)((module0754.NIL != var33) ? f47321(var32) : module0754.NIL);
            SubLObject var35 = (SubLObject)module0754.ZERO_INTEGER;
            SubLObject var37;
            final SubLObject var36 = var37 = module0205.f13207(var30, (SubLObject)module0754.$ic44$);
            SubLObject var38 = (SubLObject)module0754.NIL;
            var38 = var37.first();
            while (module0754.NIL != var37) {
                var35 = Numbers.add(var35, (SubLObject)module0754.ONE_INTEGER);
                if (module0754.NIL != conses_high.member(var35, var33, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED)) {
                    if (module0754.NIL != module0201.f12546(var38) && module0754.NIL == f47319(var38)) {
                        f47320(var38, var34);
                    }
                }
                else if (module0754.NIL != module0202.f12590(var38)) {
                    f47322(var38);
                }
                var37 = var37.rest();
                var38 = var37.first();
            }
        }
        return var30;
    }
    
    public static SubLObject f47323(final SubLObject var36) {
        SubLObject var37 = Sequences.remove_if((SubLObject)module0754.$ic45$, f47324(var36, (SubLObject)module0754.UNPROVIDED), (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL != module0772.f49148(var36)) {
            final SubLObject var38 = module0751.f46787(module0205.f13203(var36, (SubLObject)module0754.UNPROVIDED));
            var37 = conses_high.set_difference(var37, var38, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        }
        SubLObject var39 = var37;
        SubLObject var40 = (SubLObject)module0754.NIL;
        var40 = var39.first();
        while (module0754.NIL != var39) {
            if (module0754.NIL != module0578.f35470((SubLObject)module0754.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0754.T, (SubLObject)module0754.$ic46$, var40);
            }
            f47320(var40, (SubLObject)module0754.$ic47$);
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var37;
    }
    
    public static SubLObject f47325(final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0201.f12546(var15) && module0754.$ic47$ == f47319(var15));
    }
    
    public static SubLObject f47326(final SubLObject var15) {
        return Equality.eq((SubLObject)module0754.$ic40$, f47319(var15));
    }
    
    public static SubLObject f47327(final SubLObject var15, final SubLObject var30) {
        final SubLObject var31 = module0035.f2443(var15, f47328(var30, (SubLObject)module0754.UNPROVIDED), (SubLObject)module0754.ONE_INTEGER, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var31) {
            f47329(var15);
        }
        return var31;
    }
    
    public static SubLObject f47329(final SubLObject var15) {
        final SubLObject var16 = f47308(var15);
        if (module0754.NIL != f47286(var16)) {
            f47295(var16, (SubLObject)module0754.T);
        }
        else if (module0754.NIL != module0578.f35470((SubLObject)module0754.ONE_INTEGER) && module0754.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0754.$ic48$, var15);
        }
        return var16;
    }
    
    public static SubLObject f47330(final SubLObject var15) {
        final SubLObject var16 = f47308(var15);
        return (SubLObject)((module0754.NIL != var16) ? f47290(var16) : module0754.NIL);
    }
    
    public static SubLObject f47331(final SubLObject var42, final SubLObject var43) {
        SubLObject var45;
        final SubLObject var44 = var45 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0754.$ic49$);
        final SubLObject var46 = var45.rest();
        var45 = var45.first();
        SubLObject var47 = (SubLObject)module0754.NIL;
        SubLObject var48 = (SubLObject)module0754.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0754.$ic49$);
        var47 = var45.first();
        var45 = var45.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0754.$ic49$);
        var48 = var45.first();
        var45 = var45.rest();
        final SubLObject var49 = (SubLObject)(var45.isCons() ? var45.first() : module0754.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var45, var44, (SubLObject)module0754.$ic49$);
        var45 = var45.rest();
        if (module0754.NIL == var45) {
            final SubLObject var50;
            var45 = (var50 = var46);
            return (SubLObject)ConsesLow.listS((SubLObject)module0754.$ic50$, (SubLObject)ConsesLow.list(var47, var48, (SubLObject)module0754.$ic51$, var49), ConsesLow.append(var50, (SubLObject)module0754.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var44, (SubLObject)module0754.$ic49$);
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47319(final SubLObject var15) {
        final SubLObject var16 = f47308(var15);
        return (SubLObject)((module0754.NIL != var16) ? f47289(var16) : module0754.NIL);
    }
    
    public static SubLObject f47312(final SubLObject var15) {
        final SubLObject var16 = f47308(var15);
        return (module0754.NIL != var16) ? f47288(var16) : f47301();
    }
    
    public static SubLObject f47332(final SubLObject var15) {
        final SubLObject var16 = f47308(var15);
        SubLObject var17 = (module0754.NIL != var16) ? f47288(var16) : f47301();
        while (module0754.NIL != module0201.f12546(var17)) {
            final SubLObject var18 = f47312(var17);
            if (module0754.NIL != module0751.f46676(var18)) {
                var17 = module0205.f13277(var18, (SubLObject)module0754.UNPROVIDED);
            }
            else {
                var17 = f47301();
            }
        }
        return var17;
    }
    
    public static SubLObject f47333(final SubLObject var15) {
        final SubLObject var16 = f47308(var15);
        final SubLObject var17 = (module0754.NIL != var16) ? f47291(var16) : module0751.f46691();
        return var17;
    }
    
    public static SubLObject f47334(final SubLObject var51) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0201.f12546(var51) && module0754.NIL == f47310(var51));
    }
    
    public static SubLObject f47335(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0579.f35510() && Sequences.count(var16, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0754.$ic11$), module0067.f4903(module0579.$g4323$.getDynamicValue(var17))), Symbols.symbol_function((SubLObject)module0754.$ic52$), (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED).numG((SubLObject)module0754.ONE_INTEGER));
    }
    
    public static SubLObject f47336(final SubLObject var51) {
        final SubLObject var52 = module0767.f48799(var51, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        final SubLObject var53 = module0756.f47713(var52, (SubLObject)module0754.UNPROVIDED);
        SubLObject var54 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var54) {
            SubLObject var55 = module0755.f47395(var51);
            SubLObject var56 = (SubLObject)module0754.NIL;
            var56 = var55.first();
            while (module0754.NIL == var54 && module0754.NIL != var55) {
                if (module0754.NIL != module0756.f47497(var56, (SubLObject)module0754.UNPROVIDED)) {
                    var54 = Equality.equal(var53, module0756.f47480(var56, (SubLObject)module0754.UNPROVIDED));
                }
                var55 = var55.rest();
                var56 = var55.first();
            }
        }
        return var54;
    }
    
    public static SubLObject f47337(final SubLObject var57, final SubLObject var15) {
        return module0038.f2668(module0756.f47713(module0767.f48799(var15, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED), (SubLObject)module0754.NIL), var57, Symbols.symbol_function((SubLObject)module0754.EQUAL), (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
    }
    
    public static SubLObject f47338(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0754.NIL != module0579.f35498()) {
            return (SubLObject)module0754.T;
        }
        if (module0754.NIL != f47339(var15)) {
            return (SubLObject)module0754.T;
        }
        if (module0754.NIL != f47325(var15)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL == module0579.$g4326$.getDynamicValue(var16));
        }
        if (module0754.NIL != f47330(var15)) {
            return (SubLObject)module0754.NIL;
        }
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47340(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18;
        for (var18 = module0066.f4838(module0067.f4891(module0579.$g4323$.getDynamicValue(var17))); module0754.NIL == module0066.f4841(var18); var18 = module0066.f4840(var18)) {
            var17.resetMultipleValues();
            final SubLObject var19 = module0066.f4839(var18);
            final SubLObject var20 = var17.secondMultipleValue();
            var17.resetMultipleValues();
            if (!f47288(var20).equal(var16) || module0754.NIL == module0755.f47386(var19)) {
                return (SubLObject)module0754.NIL;
            }
            SubLObject var21 = module0755.f47395(var19);
            SubLObject var22 = (SubLObject)module0754.NIL;
            var22 = var21.first();
            while (module0754.NIL != var21) {
                if (module0754.NIL != module0756.f47497(var22, (SubLObject)module0754.UNPROVIDED) && module0754.NIL != f47337(module0756.f47480(var22, (SubLObject)module0754.NIL), var19)) {
                    return (SubLObject)module0754.T;
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        module0066.f4842(var18);
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47339(final SubLObject var15) {
        final SubLObject var16 = module0755.f47395(var15);
        SubLObject var17 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var17) {
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)module0754.NIL;
            var19 = var18.first();
            while (module0754.NIL == var17 && module0754.NIL != var18) {
                if (module0754.NIL != module0756.f47497(var19, (SubLObject)module0754.UNPROVIDED)) {
                    var17 = f47337(module0756.f47480(var19, (SubLObject)module0754.NIL), var15);
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return var17;
    }
    
    public static SubLObject f47341(final SubLObject var15) {
        final SubLObject var16 = module0755.f47395(var15);
        SubLObject var17 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var17) {
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)module0754.NIL;
            var19 = var18.first();
            while (module0754.NIL == var17 && module0754.NIL != var18) {
                if (module0754.NIL == module0756.f47497(var19, (SubLObject)module0754.UNPROVIDED) || module0754.NIL == f47337(module0756.f47480(var19, (SubLObject)module0754.NIL), var15)) {
                    var17 = (SubLObject)module0754.T;
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return var17;
    }
    
    public static SubLObject f47342(final SubLObject var57, final SubLObject var63, SubLObject var64, SubLObject var65) {
        if (var64 == module0754.UNPROVIDED) {
            var64 = (SubLObject)module0754.$ic54$;
        }
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0754.NIL;
        final SubLObject var68 = module0584.$g4396$.currentBinding(var66);
        final SubLObject var69 = module0579.$g4299$.currentBinding(var66);
        final SubLObject var70 = module0584.$g4390$.currentBinding(var66);
        try {
            module0584.$g4396$.bind(var65, var66);
            module0579.$g4299$.bind((SubLObject)module0754.T, var66);
            module0584.$g4390$.bind(var64, var66);
            final SubLObject var71 = module0580.f35545();
            final SubLObject var67_71 = module0034.$g879$.currentBinding(var66);
            try {
                module0034.$g879$.bind(var71, var66);
                SubLObject var72 = (SubLObject)module0754.NIL;
                if (module0754.NIL != var71 && module0754.NIL == module0034.f1842(var71)) {
                    var72 = module0034.f1869(var71);
                    final SubLObject var73 = Threads.current_process();
                    if (module0754.NIL == var72) {
                        module0034.f1873(var71, var73);
                    }
                    else if (!var72.eql(var73)) {
                        Errors.error((SubLObject)module0754.$ic55$);
                    }
                }
                try {
                    var67 = module0731.f44746(module0581.f35681(var57, (SubLObject)module0754.$ic56$), var63, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
                }
                finally {
                    final SubLObject var67_72 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0754.T, var66);
                        if (module0754.NIL != var71 && module0754.NIL == var72) {
                            module0034.f1873(var71, (SubLObject)module0754.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var67_72, var66);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var67_71, var66);
            }
        }
        finally {
            module0584.$g4390$.rebind(var70, var66);
            module0579.$g4299$.rebind(var69, var66);
            module0584.$g4396$.rebind(var68, var66);
        }
        return var67;
    }
    
    public static SubLObject f47343(final SubLObject var57, final SubLObject var63, SubLObject var64, SubLObject var65) {
        if (var64 == module0754.UNPROVIDED) {
            var64 = (SubLObject)module0754.$ic54$;
        }
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0034.$g879$.getDynamicValue(var66);
        SubLObject var68 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var67) {
            return f47342(var57, var63, var64, var65);
        }
        var68 = module0034.f1857(var67, (SubLObject)module0754.$ic53$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var68) {
            var68 = module0034.f1807(module0034.f1842(var67), (SubLObject)module0754.$ic53$, (SubLObject)module0754.FOUR_INTEGER, (SubLObject)module0754.$ic57$, (SubLObject)module0754.EQUAL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var67, (SubLObject)module0754.$ic53$, var68);
        }
        final SubLObject var69 = module0034.f1780(var57, var63, var64, var65);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)module0754.UNPROVIDED);
        if (var70 != module0754.$ic58$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)module0754.NIL;
            var72 = var71.first();
            while (module0754.NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var57.equal(var73.first())) {
                    var73 = var73.rest();
                    if (var63.equal(var73.first())) {
                        var73 = var73.rest();
                        if (var64.equal(var73.first())) {
                            var73 = var73.rest();
                            if (module0754.NIL != var73 && module0754.NIL == var73.rest() && var65.equal(var73.first())) {
                                return module0034.f1959(var74);
                            }
                        }
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(var66.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47342(var57, var63, var64, var65)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var57, var63, var64, var65));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f47344(final SubLObject var15) {
        final SubLObject var16 = module0755.f47395(var15);
        SubLObject var17 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var17) {
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)module0754.NIL;
            var19 = var18.first();
            while (module0754.NIL == var17 && module0754.NIL != var18) {
                if (module0754.NIL != module0756.f47497(var19, (SubLObject)module0754.UNPROVIDED)) {
                    var17 = f47343(module0756.f47480(var19, (SubLObject)module0754.NIL), module0754.$ic59$, (SubLObject)module0754.$ic54$, (SubLObject)module0754.UNPROVIDED);
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return var17;
    }
    
    public static SubLObject f47345(final SubLObject var84, final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        module0754.$g6064$.setDynamicValue(module0035.f2063(module0754.$g6064$.getDynamicValue(var86), var84, var85, (SubLObject)module0754.UNPROVIDED), var86);
        return module0754.$g6064$.getDynamicValue(var86);
    }
    
    public static SubLObject f47346(final SubLObject var84, final SubLObject var85, SubLObject var86) {
        if (var86 == module0754.UNPROVIDED) {
            var86 = (SubLObject)module0754.T;
        }
        if (module0754.NIL != var86) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != f47347(var84, var85) || module0754.NIL != f47347(var85, var84));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(!var84.eql(var85));
    }
    
    public static SubLObject f47347(final SubLObject var84, final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        return Equality.eql(var85, module0035.f2293(module0754.$g6064$.getDynamicValue(var86), var84, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED));
    }
    
    public static SubLObject f47314(final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0754.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var17))) {
            module0084.f5765(module0579.$g4324$.getDynamicValue(var17), var15, var16, Symbols.symbol_function((SubLObject)module0754.EQUAL), (SubLObject)module0754.UNPROVIDED);
            if (module0754.NIL != module0578.f35470((SubLObject)module0754.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0754.T, (SubLObject)module0754.$ic60$, var15, var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f47348(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0754.NIL;
        if (module0754.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var16))) {
            final SubLObject var18 = f47312(var15);
            SubLObject var19 = (SubLObject)module0754.NIL;
            SubLObject var20 = f47349(var18);
            SubLObject var21 = (SubLObject)module0754.NIL;
            var21 = var20.first();
            while (module0754.NIL != var20) {
                if (var21.equal(var15)) {
                    var19 = (SubLObject)module0754.T;
                }
                else {
                    var17 = (SubLObject)ConsesLow.cons(var21, var17);
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        return var17;
    }
    
    public static SubLObject f47349(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0754.NIL;
        SubLObject var19;
        for (var19 = module0066.f4838(module0067.f4891(module0579.$g4324$.getDynamicValue(var17))); module0754.NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
            var17.resetMultipleValues();
            final SubLObject var20 = module0066.f4839(var19);
            final SubLObject var21 = var17.secondMultipleValue();
            var17.resetMultipleValues();
            SubLObject var22 = var21;
            SubLObject var23 = (SubLObject)module0754.NIL;
            var23 = var22.first();
            while (module0754.NIL != var22) {
                if (module0754.NIL != module0751.f46669(var23, var16, (SubLObject)module0754.UNPROVIDED)) {
                    var18 = (SubLObject)ConsesLow.cons(var20, var18);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        module0066.f4842(var19);
        return var18;
    }
    
    public static SubLObject f47350(final SubLObject var15) {
        final SubLObject var16 = module0755.f47395(var15);
        SubLObject var17 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var17) {
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)module0754.NIL;
            var19 = var18.first();
            while (module0754.NIL == var17 && module0754.NIL != var18) {
                if (module0754.NIL != module0756.f47497(var19, (SubLObject)module0754.UNPROVIDED)) {
                    final SubLObject var20 = module0756.f47480(var19, (SubLObject)module0754.NIL);
                    if (module0754.NIL != module0038.f2668((SubLObject)module0754.$ic61$, var20, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED) && (module0754.NIL != module0038.f2668((SubLObject)module0754.$ic62$, var20, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED) || module0754.NIL != module0038.f2684((SubLObject)module0754.$ic63$, var20) || module0754.NIL != module0038.f2668((SubLObject)module0754.$ic64$, var20, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED) || module0754.NIL != module0038.f2684((SubLObject)module0754.$ic65$, var20))) {
                        var17 = (SubLObject)module0754.T;
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return var17;
    }
    
    public static SubLObject f47351(final SubLObject var30, SubLObject var93) {
        if (var93 == module0754.UNPROVIDED) {
            var93 = (SubLObject)module0754.NIL;
        }
        SubLObject var94 = (SubLObject)module0754.NIL;
        if (module0754.NIL == module0167.f10813(var30)) {
            if (module0754.NIL != module0206.f13425(var30)) {
                var94 = module0202.f12911(var30, var93, (SubLObject)module0754.$ic67$, (SubLObject)module0754.UNPROVIDED);
            }
            else if (module0754.NIL != module0172.f10917(var30)) {
                var94 = module0202.f12968(var30, var93, (SubLObject)module0754.$ic67$, (SubLObject)module0754.UNPROVIDED);
            }
        }
        return var94;
    }
    
    public static SubLObject f47324(final SubLObject var30, SubLObject var93) {
        if (var93 == module0754.UNPROVIDED) {
            var93 = (SubLObject)module0754.NIL;
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        final SubLObject var95 = module0034.$g879$.getDynamicValue(var94);
        SubLObject var96 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var95) {
            return f47351(var30, var93);
        }
        var96 = module0034.f1857(var95, (SubLObject)module0754.$ic66$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var96) {
            var96 = module0034.f1807(module0034.f1842(var95), (SubLObject)module0754.$ic66$, (SubLObject)module0754.TWO_INTEGER, (SubLObject)module0754.$ic68$, (SubLObject)module0754.EQUAL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var95, (SubLObject)module0754.$ic66$, var96);
        }
        final SubLObject var97 = module0034.f1782(var30, var93);
        final SubLObject var98 = module0034.f1814(var96, var97, (SubLObject)module0754.UNPROVIDED);
        if (var98 != module0754.$ic58$) {
            SubLObject var99 = var98;
            SubLObject var100 = (SubLObject)module0754.NIL;
            var100 = var99.first();
            while (module0754.NIL != var99) {
                SubLObject var101 = var100.first();
                final SubLObject var102 = conses_high.second(var100);
                if (var30.equal(var101.first())) {
                    var101 = var101.rest();
                    if (module0754.NIL != var101 && module0754.NIL == var101.rest() && var93.equal(var101.first())) {
                        return module0034.f1959(var102);
                    }
                }
                var99 = var99.rest();
                var100 = var99.first();
            }
        }
        final SubLObject var103 = Values.arg2(var94.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47351(var30, var93)));
        module0034.f1836(var96, var97, var98, var103, (SubLObject)ConsesLow.list(var30, var93));
        return module0034.f1959(var103);
    }
    
    public static SubLObject f47352(final SubLObject var15, final SubLObject var30) {
        if (module0754.NIL != module0751.f46614(var30)) {
            return (SubLObject)module0754.NIL;
        }
        SubLObject var31 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var31) {
            SubLObject var32;
            SubLObject var33;
            for (var32 = module0205.f13397(var15, var30, Symbols.symbol_function((SubLObject)module0754.EQL)), var33 = (SubLObject)module0754.NIL, var33 = var32.first(); module0754.NIL == var31 && module0754.NIL != var32; var31 = (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL == f47353(var33, var30)), var32 = var32.rest(), var33 = var32.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL == var31);
    }
    
    public static SubLObject f47353(final SubLObject var22, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0205.f13132(var30);
        final SubLObject var33 = var22.first();
        if (module0754.NIL != f47354(var32, var33, module0579.$g4262$.getDynamicValue(var31))) {
            return (SubLObject)module0754.T;
        }
        if (module0754.NIL != module0035.f1997(var22) && (module0754.NIL != f47355(var32, var33) || (var22.equal((SubLObject)module0754.$ic69$) && module0754.NIL != module0337.f22630(var30, (SubLObject)module0754.$ic70$)))) {
            return (SubLObject)module0754.T;
        }
        if (module0754.NIL != module0035.f2002(var22, (SubLObject)module0754.ONE_INTEGER, (SubLObject)module0754.UNPROVIDED)) {
            final SubLObject var34 = module0205.f13134(var30, var33, (SubLObject)module0754.UNPROVIDED);
            return f47356(var22.rest(), var34);
        }
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47357(final SubLObject var99) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0212.f13762(var99) && module0754.NIL != module0751.f46847((SubLObject)ConsesLow.list(module0754.$ic71$, var99), (SubLObject)module0754.UNPROVIDED));
    }
    
    public static SubLObject f47356(final SubLObject var22, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0205.f13132(var30);
        final SubLObject var33 = var22.first();
        if (module0754.NIL != f47354(var32, var33, module0579.$g4262$.getDynamicValue(var31))) {
            return (SubLObject)module0754.T;
        }
        if (module0754.NIL != module0035.f2002(var22, (SubLObject)module0754.ONE_INTEGER, (SubLObject)module0754.UNPROVIDED)) {
            final SubLObject var34 = module0205.f13134(var30, var33, (SubLObject)module0754.UNPROVIDED);
            return f47356(var22.rest(), var34);
        }
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47358(final SubLObject var29, final SubLObject var97, final SubLObject var65) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0212.f13762(var29) && module0754.NIL != conses_high.member(var97, module0226.f15099(var29, var65), Symbols.symbol_function((SubLObject)module0754.EQL), (SubLObject)module0754.UNPROVIDED));
    }
    
    public static SubLObject f47354(final SubLObject var29, final SubLObject var97, final SubLObject var65) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        final SubLObject var99 = module0034.$g879$.getDynamicValue(var98);
        SubLObject var100 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var99) {
            return f47358(var29, var97, var65);
        }
        var100 = module0034.f1857(var99, (SubLObject)module0754.$ic72$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var100) {
            var100 = module0034.f1807(module0034.f1842(var99), (SubLObject)module0754.$ic72$, (SubLObject)module0754.THREE_INTEGER, (SubLObject)module0754.$ic73$, (SubLObject)module0754.EQL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var99, (SubLObject)module0754.$ic72$, var100);
        }
        final SubLObject var101 = module0034.f1781(var29, var97, var65);
        final SubLObject var102 = module0034.f1814(var100, var101, (SubLObject)module0754.UNPROVIDED);
        if (var102 != module0754.$ic58$) {
            SubLObject var103 = var102;
            SubLObject var104 = (SubLObject)module0754.NIL;
            var104 = var103.first();
            while (module0754.NIL != var103) {
                SubLObject var105 = var104.first();
                final SubLObject var106 = conses_high.second(var104);
                if (var29.eql(var105.first())) {
                    var105 = var105.rest();
                    if (var97.eql(var105.first())) {
                        var105 = var105.rest();
                        if (module0754.NIL != var105 && module0754.NIL == var105.rest() && var65.eql(var105.first())) {
                            return module0034.f1959(var106);
                        }
                    }
                }
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        final SubLObject var107 = Values.arg2(var98.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47358(var29, var97, var65)));
        module0034.f1836(var100, var101, var102, var107, (SubLObject)ConsesLow.list(var29, var97, var65));
        return module0034.f1959(var107);
    }
    
    public static SubLObject f47359(final SubLObject var29, final SubLObject var97) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0212.f13762(var29) && module0754.NIL != module0226.f14837(var29, var97));
    }
    
    public static SubLObject f47355(final SubLObject var29, final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        final SubLObject var99 = module0034.$g879$.getDynamicValue(var98);
        SubLObject var100 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var99) {
            return f47359(var29, var97);
        }
        var100 = module0034.f1857(var99, (SubLObject)module0754.$ic74$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var100) {
            var100 = module0034.f1807(module0034.f1842(var99), (SubLObject)module0754.$ic74$, (SubLObject)module0754.TWO_INTEGER, (SubLObject)module0754.$ic73$, (SubLObject)module0754.EQL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var99, (SubLObject)module0754.$ic74$, var100);
        }
        final SubLObject var101 = module0034.f1782(var29, var97);
        final SubLObject var102 = module0034.f1814(var100, var101, (SubLObject)module0754.UNPROVIDED);
        if (var102 != module0754.$ic58$) {
            SubLObject var103 = var102;
            SubLObject var104 = (SubLObject)module0754.NIL;
            var104 = var103.first();
            while (module0754.NIL != var103) {
                SubLObject var105 = var104.first();
                final SubLObject var106 = conses_high.second(var104);
                if (var29.eql(var105.first())) {
                    var105 = var105.rest();
                    if (module0754.NIL != var105 && module0754.NIL == var105.rest() && var97.eql(var105.first())) {
                        return module0034.f1959(var106);
                    }
                }
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        final SubLObject var107 = Values.arg2(var98.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47359(var29, var97)));
        module0034.f1836(var100, var101, var102, var107, (SubLObject)ConsesLow.list(var29, var97));
        return module0034.f1959(var107);
    }
    
    public static SubLObject f47360(final SubLObject var15, final SubLObject var30, SubLObject var65, SubLObject var100, SubLObject var101, SubLObject var102) {
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0147.$g2095$.getDynamicValue();
        }
        if (var100 == module0754.UNPROVIDED) {
            var100 = (SubLObject)module0754.T;
        }
        if (var101 == module0754.UNPROVIDED) {
            var101 = (SubLObject)module0754.NIL;
        }
        if (var102 == module0754.UNPROVIDED) {
            var102 = (SubLObject)module0754.$ic75$;
        }
        final SubLThread var103 = SubLProcess.currentSubLThread();
        SubLObject var104 = (SubLObject)module0754.NIL;
        final SubLObject var105 = module0077.f5313(Symbols.symbol_function((SubLObject)module0754.EQUAL), (SubLObject)module0754.UNPROVIDED);
        final SubLObject var106 = f47328(var30, (SubLObject)module0754.T);
        final SubLObject var107 = (SubLObject)((module0754.NIL != module0202.f12604(var106) || module0754.NIL != module0202.f12597(var106)) ? module0754.$ic76$ : module0754.$ic77$);
        var103.resetMultipleValues();
        final SubLObject var108 = f47361(var106, var65, var107);
        final SubLObject var109 = var103.secondMultipleValue();
        var103.resetMultipleValues();
        if (var108.isList()) {
            SubLObject var110 = (SubLObject)module0754.NIL;
            SubLObject var111 = (SubLObject)module0754.NIL;
            SubLObject var112 = (SubLObject)module0754.NIL;
            var110 = var108;
            var111 = var110.first();
            for (var112 = (SubLObject)module0754.ZERO_INTEGER; module0754.NIL != var110; var110 = var110.rest(), var111 = var110.first(), var112 = Numbers.add((SubLObject)module0754.ONE_INTEGER, var112)) {
                SubLObject var114;
                final SubLObject var113 = var114 = var111;
                SubLObject var115 = (SubLObject)module0754.NIL;
                SubLObject var116 = (SubLObject)module0754.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0754.$ic78$);
                var115 = var114.first();
                var114 = var114.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0754.$ic78$);
                var116 = var114.first();
                var114 = var114.rest();
                if (module0754.NIL == var114) {
                    final SubLObject var117 = (module0754.NIL != var115) ? var115 : var116;
                    SubLObject var118 = (SubLObject)module0754.NIL;
                    SubLObject var119 = var117;
                    SubLObject var120 = (SubLObject)module0754.NIL;
                    var120 = var119.first();
                    while (module0754.NIL != var119) {
                        if (module0754.NIL != module0205.f13220(var15, var120, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED)) {
                            var103.resetMultipleValues();
                            final SubLObject var121 = f47362(var15, var120, var117, var109, var100, var102);
                            final SubLObject var122 = var103.secondMultipleValue();
                            var103.resetMultipleValues();
                            var118 = ConsesLow.append(var118, var121, var122);
                            module0078.f5374(var122, var105);
                        }
                        var119 = var119.rest();
                        var120 = var119.first();
                    }
                    if (var112.eql((SubLObject)module0754.ZERO_INTEGER) || var107 == module0754.$ic76$) {
                        var104 = ConsesLow.append(var104, var118);
                    }
                    else {
                        var104 = module0751.f47079(f47363(ConsesLow.append(var104, var118)), (SubLObject)module0754.NIL, var65, (SubLObject)module0754.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var113, (SubLObject)module0754.$ic78$);
                }
            }
        }
        var104 = module0035.delete_if_not(var102, Sequences.delete(module0754.$ic79$, var104, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED), (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL != Sequences.find_if((SubLObject)module0754.$ic80$, var104, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED)) {
            if (module0754.NIL != module0578.f35470((SubLObject)module0754.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0754.T, (SubLObject)module0754.$ic81$, var104);
            }
            var104 = module0035.remove_if_not((SubLObject)module0754.$ic80$, var104, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        }
        if (module0754.NIL == var101 && module0754.NIL == module0077.f5316(var105)) {
            var104 = f47364(var105, var104, var65);
        }
        return Sort.sort(f47363(var104), (SubLObject)module0754.$ic82$, (SubLObject)module0754.UNPROVIDED);
    }
    
    public static SubLObject f47364(final SubLObject var90, SubLObject var66, final SubLObject var65) {
        for (SubLObject var91 = (SubLObject)module0754.NIL, var92 = (SubLObject)module0754.ZERO_INTEGER, var93 = (SubLObject)module0754.TEN_INTEGER; module0754.NIL == var91 && !var92.numGE(var93); var91 = (SubLObject)module0754.T) {
            var92 = Numbers.add(var92, (SubLObject)module0754.ONE_INTEGER);
            SubLObject var94 = (SubLObject)module0754.NIL;
            SubLObject var95 = var66;
            SubLObject var96 = (SubLObject)module0754.NIL;
            var96 = var95.first();
            while (module0754.NIL != var95) {
                if (module0754.NIL != module0077.f5320(var96, var90)) {
                    var94 = (SubLObject)ConsesLow.cons(var96, var94);
                }
                var95 = var95.rest();
                var96 = var95.first();
            }
            if (module0754.NIL == module0035.f2012(var94)) {
                var95 = var94;
                var96 = (SubLObject)module0754.NIL;
                var96 = var95.first();
                while (module0754.NIL != var95) {
                    var66 = Sequences.delete(var96, var66, Symbols.symbol_function((SubLObject)module0754.EQUAL), (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
                    var66 = ConsesLow.append(var66, f47365(var96, var65));
                    var95 = var95.rest();
                    var96 = var95.first();
                }
            }
        }
        return var66;
    }
    
    public static SubLObject f47366(final SubLObject var123, final SubLObject var65, final SubLObject var124) {
        return module0282.f18745(var123, var65, var124);
    }
    
    public static SubLObject f47361(final SubLObject var123, final SubLObject var65, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0034.$g879$.getDynamicValue(var125);
        SubLObject var127 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var126) {
            return f47366(var123, var65, var124);
        }
        var127 = module0034.f1857(var126, (SubLObject)module0754.$ic83$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var127) {
            var127 = module0034.f1807(module0034.f1842(var126), (SubLObject)module0754.$ic83$, (SubLObject)module0754.THREE_INTEGER, (SubLObject)module0754.$ic84$, (SubLObject)module0754.EQUAL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var126, (SubLObject)module0754.$ic83$, var127);
        }
        final SubLObject var128 = module0034.f1781(var123, var65, var124);
        final SubLObject var129 = module0034.f1814(var127, var128, (SubLObject)module0754.UNPROVIDED);
        if (var129 != module0754.$ic58$) {
            SubLObject var130 = var129;
            SubLObject var131 = (SubLObject)module0754.NIL;
            var131 = var130.first();
            while (module0754.NIL != var130) {
                SubLObject var132 = var131.first();
                final SubLObject var133 = conses_high.second(var131);
                if (var123.equal(var132.first())) {
                    var132 = var132.rest();
                    if (var65.equal(var132.first())) {
                        var132 = var132.rest();
                        if (module0754.NIL != var132 && module0754.NIL == var132.rest() && var124.equal(var132.first())) {
                            return module0034.f1959(var133);
                        }
                    }
                }
                var130 = var130.rest();
                var131 = var130.first();
            }
        }
        final SubLObject var134 = Values.arg2(var125.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47366(var123, var65, var124)));
        module0034.f1836(var127, var128, var129, var134, (SubLObject)ConsesLow.list(var123, var65, var124));
        return module0034.f1959(var134);
    }
    
    public static SubLObject f47367(final SubLObject var15, final SubLObject var116, final SubLObject var125, final SubLObject var65, SubLObject var100, SubLObject var102) {
        if (var100 == module0754.UNPROVIDED) {
            var100 = (SubLObject)module0754.T;
        }
        if (var102 == module0754.UNPROVIDED) {
            var102 = (SubLObject)module0754.$ic75$;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = (SubLObject)module0754.NIL;
        SubLObject var128 = (SubLObject)module0754.NIL;
        final SubLObject var129 = module0205.f13136(var116);
        final SubLObject var130 = module0205.f13357(var116, var15, Symbols.symbol_function((SubLObject)module0754.EQL)).first();
        if (module0754.NIL != module0173.f10955(var129) && var130.isInteger()) {
            var127 = ConsesLow.append(module0226.f14882(var129, var130, var65), var127);
            SubLObject var131 = module0226.f14935(var129, var130, var65);
            SubLObject var132 = (SubLObject)module0754.NIL;
            var132 = var131.first();
            while (module0754.NIL != var131) {
                final SubLObject var133 = module0751.f46677(var132);
                if (module0754.NIL == conses_high.member(var133, var127, Symbols.symbol_function((SubLObject)module0754.EQUAL), Symbols.symbol_function((SubLObject)module0754.IDENTITY))) {
                    var127 = (SubLObject)ConsesLow.cons(var133, var127);
                }
                var131 = var131.rest();
                var132 = var131.first();
            }
        }
        if (module0754.NIL != module0751.f46684(var129, module0754.$ic86$, (SubLObject)module0754.UNPROVIDED)) {
            var127 = (SubLObject)ConsesLow.cons(module0754.$ic87$, var127);
        }
        if (module0754.NIL != var100 && module0754.NIL != module0751.f46706(var116, var15, var102)) {
            var128 = (SubLObject)ConsesLow.cons(module0751.f46689(var116), var128);
        }
        var126.resetMultipleValues();
        final SubLObject var134 = f47368(var15, var116, var125, var65, var100);
        final SubLObject var135 = var126.secondMultipleValue();
        var126.resetMultipleValues();
        var127 = Sequences.cconcatenate(var127, var134);
        var128 = Sequences.cconcatenate(var128, var135);
        return Values.values(Sort.sort(f47363(var127), (SubLObject)module0754.$ic82$, (SubLObject)module0754.UNPROVIDED), Sort.sort(f47363(var128), (SubLObject)module0754.$ic82$, (SubLObject)module0754.UNPROVIDED));
    }
    
    public static SubLObject f47362(final SubLObject var15, final SubLObject var116, final SubLObject var125, final SubLObject var65, SubLObject var100, SubLObject var102) {
        if (var100 == module0754.UNPROVIDED) {
            var100 = (SubLObject)module0754.T;
        }
        if (var102 == module0754.UNPROVIDED) {
            var102 = (SubLObject)module0754.$ic75$;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        final SubLObject var127 = module0034.$g879$.getDynamicValue(var126);
        SubLObject var128 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var127) {
            return f47367(var15, var116, var125, var65, var100, var102);
        }
        var128 = module0034.f1857(var127, (SubLObject)module0754.$ic85$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var128) {
            var128 = module0034.f1807(module0034.f1842(var127), (SubLObject)module0754.$ic85$, (SubLObject)module0754.SIX_INTEGER, (SubLObject)module0754.$ic88$, (SubLObject)module0754.EQUAL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var127, (SubLObject)module0754.$ic85$, var128);
        }
        final SubLObject var129 = module0034.f1778(var15, var116, var125, var65, var100, var102);
        final SubLObject var130 = module0034.f1814(var128, var129, (SubLObject)module0754.UNPROVIDED);
        if (var130 != module0754.$ic58$) {
            SubLObject var131 = var130;
            SubLObject var132 = (SubLObject)module0754.NIL;
            var132 = var131.first();
            while (module0754.NIL != var131) {
                SubLObject var133 = var132.first();
                final SubLObject var134 = conses_high.second(var132);
                if (var15.equal(var133.first())) {
                    var133 = var133.rest();
                    if (var116.equal(var133.first())) {
                        var133 = var133.rest();
                        if (var125.equal(var133.first())) {
                            var133 = var133.rest();
                            if (var65.equal(var133.first())) {
                                var133 = var133.rest();
                                if (var100.equal(var133.first())) {
                                    var133 = var133.rest();
                                    if (module0754.NIL != var133 && module0754.NIL == var133.rest() && var102.equal(var133.first())) {
                                        return module0034.f1959(var134);
                                    }
                                }
                            }
                        }
                    }
                }
                var131 = var131.rest();
                var132 = var131.first();
            }
        }
        final SubLObject var135 = Values.arg2(var126.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47367(var15, var116, var125, var65, var100, var102)));
        module0034.f1836(var128, var129, var130, var135, (SubLObject)ConsesLow.list(var15, var116, var125, var65, var100, var102));
        return module0034.f1959(var135);
    }
    
    public static SubLObject f47365(final SubLObject var130, SubLObject var65) {
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0579.$g4262$.getDynamicValue();
        }
        if (module0754.NIL != module0212.f13762(var130)) {
            return module0256.f16524(var130, var65, (SubLObject)module0754.UNPROVIDED);
        }
        if (module0754.NIL != module0751.f46676(var130)) {
            final SubLObject var131 = module0751.f46905(var130);
            return (SubLObject)((module0754.NIL != module0751.f46676(var131)) ? module0754.NIL : Mapping.mapcar((SubLObject)module0754.$ic89$, f47365(var131, var65)));
        }
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47368(final SubLObject var15, final SubLObject var116, final SubLObject var125, final SubLObject var65, final SubLObject var100) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = (SubLObject)module0754.NIL;
        SubLObject var128 = (SubLObject)module0754.NIL;
        final SubLObject var129 = (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != var100 && module0754.NIL != f47369(module0205.f13132(var116), (SubLObject)module0754.UNPROVIDED));
        SubLObject var131;
        final SubLObject var130 = var131 = module0205.f13180(var116, (SubLObject)module0754.$ic44$);
        SubLObject var132 = (SubLObject)module0754.NIL;
        var132 = var131.first();
        while (module0754.NIL != var131) {
            if (module0754.NIL != module0202.f12925(var132)) {
                var126.resetMultipleValues();
                final SubLObject var133 = f47362(var15, var132, var125, var65, var129, (SubLObject)module0754.UNPROVIDED);
                final SubLObject var134 = var126.secondMultipleValue();
                var126.resetMultipleValues();
                var127 = ConsesLow.append(var127, var133);
                var128 = ConsesLow.append(var128, var134);
            }
            if (module0754.NIL != module0202.f12590(var132)) {
                var126.resetMultipleValues();
                final SubLObject var133 = f47368(var15, var132, var125, var65, var129);
                final SubLObject var134 = var126.secondMultipleValue();
                var126.resetMultipleValues();
                var127 = ConsesLow.append(var127, var133);
                var128 = ConsesLow.append(var128, var134);
            }
            var131 = var131.rest();
            var132 = var131.first();
        }
        return Values.values(var127, var128);
    }
    
    public static SubLObject f47370(final SubLObject var29, SubLObject var65) {
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0579.$g4262$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0754.NIL != module0173.f10955(var29) && (module0754.NIL != conses_high.member(var29, (SubLObject)module0754.$ic91$, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED) || module0754.NIL != conses_high.member(var29, (SubLObject)module0754.$ic92$, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED) || (module0754.NIL != module0269.f17706(var29) && (module0754.NIL != module0751.f46849(var29, module0754.$ic93$, var65) || module0754.NIL != module0751.f46849(var29, module0754.$ic94$, var65) || module0754.NIL != module0751.f46849(var29, module0754.$ic95$, var65) || module0754.NIL != module0751.f46849(var29, module0754.$ic96$, var65)))));
    }
    
    public static SubLObject f47369(final SubLObject var29, SubLObject var65) {
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0034.$g879$.getDynamicValue(var66);
        SubLObject var68 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var67) {
            return f47370(var29, var65);
        }
        var68 = module0034.f1857(var67, (SubLObject)module0754.$ic90$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var68) {
            var68 = module0034.f1807(module0034.f1842(var67), (SubLObject)module0754.$ic90$, (SubLObject)module0754.TWO_INTEGER, (SubLObject)module0754.$ic73$, (SubLObject)module0754.EQL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var67, (SubLObject)module0754.$ic90$, var68);
        }
        final SubLObject var69 = module0034.f1782(var29, var65);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)module0754.UNPROVIDED);
        if (var70 != module0754.$ic58$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)module0754.NIL;
            var72 = var71.first();
            while (module0754.NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var29.eql(var73.first())) {
                    var73 = var73.rest();
                    if (module0754.NIL != var73 && module0754.NIL == var73.rest() && var65.eql(var73.first())) {
                        return module0034.f1959(var74);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(var66.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47370(var29, var65)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var29, var65));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f47328(SubLObject var30, SubLObject var135) {
        if (var135 == module0754.UNPROVIDED) {
            var135 = (SubLObject)module0754.NIL;
        }
        if (module0754.NIL != var135) {
            return module0205.f13147(var30, (SubLObject)module0754.$ic97$, (SubLObject)module0754.$ic98$, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED);
        }
        while (module0754.NIL != module0202.f12606(var30)) {
            var30 = module0202.f12668(var30);
        }
        return var30;
    }
    
    public static SubLObject f47363(SubLObject var136) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        if (!var136.isList()) {
            return (SubLObject)module0754.NIL;
        }
        SubLObject var138 = (SubLObject)module0754.NIL;
        SubLObject var139 = (SubLObject)module0754.NIL;
        var138 = (SubLObject)module0754.NIL;
        for (var139 = Sequences.delete_duplicates(var136, Symbols.symbol_function((SubLObject)module0754.EQUAL), (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED, (SubLObject)module0754.UNPROVIDED).first(); module0754.NIL != var139; var139 = var136.first()) {
            var136 = var136.rest();
            final SubLObject var140 = module0147.f9540(module0579.$g4262$.getDynamicValue(var137));
            final SubLObject var141 = module0147.$g2095$.currentBinding(var137);
            final SubLObject var142 = module0147.$g2094$.currentBinding(var137);
            final SubLObject var143 = module0147.$g2096$.currentBinding(var137);
            try {
                module0147.$g2095$.bind(module0147.f9545(var140), var137);
                module0147.$g2094$.bind(module0147.f9546(var140), var137);
                module0147.$g2096$.bind(module0147.f9549(var140), var137);
                if (module0754.NIL == module0004.f104(var139, var136, (SubLObject)module0754.$ic52$, (SubLObject)module0754.UNPROVIDED) && module0754.NIL == conses_high.member(var139, var138, (SubLObject)module0754.$ic52$, (SubLObject)module0754.UNPROVIDED)) {
                    var138 = (SubLObject)ConsesLow.cons(var139, var138);
                }
            }
            finally {
                module0147.$g2096$.rebind(var143, var137);
                module0147.$g2094$.rebind(var142, var137);
                module0147.$g2095$.rebind(var141, var137);
            }
            var138 = var138;
        }
        return var138;
    }
    
    public static SubLObject f47371(final SubLObject var15, final SubLObject var30, SubLObject var65, SubLObject var100, SubLObject var101, SubLObject var102) {
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0579.$g4262$.getDynamicValue();
        }
        if (var100 == module0754.UNPROVIDED) {
            var100 = (SubLObject)module0754.T;
        }
        if (var101 == module0754.UNPROVIDED) {
            var101 = (SubLObject)module0754.NIL;
        }
        if (var102 == module0754.UNPROVIDED) {
            var102 = (SubLObject)module0754.$ic75$;
        }
        final SubLObject var103 = f47360(var15, var30, var65, var100, var101, var102);
        final SubLObject var104 = f47372(var103, (SubLObject)module0754.UNPROVIDED);
        final SubLObject var105 = (module0754.NIL != var104) ? var104 : f47301();
        if (module0754.NIL != module0578.f35470((SubLObject)module0754.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0754.T, (SubLObject)module0754.$ic100$, new SubLObject[] { var15, var103, var105 });
        }
        return var105;
    }
    
    public static SubLObject f47373(final SubLObject var15, final SubLObject var30, SubLObject var65, SubLObject var100, SubLObject var101, SubLObject var102) {
        if (var65 == module0754.UNPROVIDED) {
            var65 = module0579.$g4262$.getDynamicValue();
        }
        if (var100 == module0754.UNPROVIDED) {
            var100 = (SubLObject)module0754.T;
        }
        if (var101 == module0754.UNPROVIDED) {
            var101 = (SubLObject)module0754.NIL;
        }
        if (var102 == module0754.UNPROVIDED) {
            var102 = (SubLObject)module0754.$ic75$;
        }
        final SubLThread var103 = SubLProcess.currentSubLThread();
        final SubLObject var104 = module0034.$g879$.getDynamicValue(var103);
        SubLObject var105 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var104) {
            return f47371(var15, var30, var65, var100, var101, var102);
        }
        var105 = module0034.f1857(var104, (SubLObject)module0754.$ic99$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var105) {
            var105 = module0034.f1807(module0034.f1842(var104), (SubLObject)module0754.$ic99$, (SubLObject)module0754.SIX_INTEGER, (SubLObject)module0754.$ic68$, (SubLObject)module0754.EQUAL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var104, (SubLObject)module0754.$ic99$, var105);
        }
        final SubLObject var106 = module0034.f1778(var15, var30, var65, var100, var101, var102);
        final SubLObject var107 = module0034.f1814(var105, var106, (SubLObject)module0754.UNPROVIDED);
        if (var107 != module0754.$ic58$) {
            SubLObject var108 = var107;
            SubLObject var109 = (SubLObject)module0754.NIL;
            var109 = var108.first();
            while (module0754.NIL != var108) {
                SubLObject var110 = var109.first();
                final SubLObject var111 = conses_high.second(var109);
                if (var15.equal(var110.first())) {
                    var110 = var110.rest();
                    if (var30.equal(var110.first())) {
                        var110 = var110.rest();
                        if (var65.equal(var110.first())) {
                            var110 = var110.rest();
                            if (var100.equal(var110.first())) {
                                var110 = var110.rest();
                                if (var101.equal(var110.first())) {
                                    var110 = var110.rest();
                                    if (module0754.NIL != var110 && module0754.NIL == var110.rest() && var102.equal(var110.first())) {
                                        return module0034.f1959(var111);
                                    }
                                }
                            }
                        }
                    }
                }
                var108 = var108.rest();
                var109 = var108.first();
            }
        }
        final SubLObject var112 = Values.arg2(var103.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47371(var15, var30, var65, var100, var101, var102)));
        module0034.f1836(var105, var106, var107, var112, (SubLObject)ConsesLow.list(var15, var30, var65, var100, var101, var102));
        return module0034.f1959(var112);
    }
    
    public static SubLObject f47374(final SubLObject var142, SubLObject var143) {
        if (var143 == module0754.UNPROVIDED) {
            var143 = (SubLObject)module0754.$ic82$;
        }
        SubLObject var144 = var142.first();
        SubLObject var145 = var142.rest();
        SubLObject var146 = (SubLObject)module0754.NIL;
        var146 = var145.first();
        while (module0754.NIL != var145) {
            final SubLObject var147 = var143;
            if (var147.eql((SubLObject)module0754.$ic102$) || var147.eql((SubLObject)module0754.$ic82$)) {
                if (module0754.NIL != module0751.f46890(var146, var144)) {
                    var144 = var146;
                }
            }
            else if (module0754.NIL != Functions.funcall(var143, var146, var144)) {
                var144 = var146;
            }
            var145 = var145.rest();
            var146 = var145.first();
        }
        return var144;
    }
    
    public static SubLObject f47372(final SubLObject var142, SubLObject var143) {
        if (var143 == module0754.UNPROVIDED) {
            var143 = (SubLObject)module0754.$ic82$;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        final SubLObject var145 = module0034.$g879$.getDynamicValue(var144);
        SubLObject var146 = (SubLObject)module0754.NIL;
        if (module0754.NIL == var145) {
            return f47374(var142, var143);
        }
        var146 = module0034.f1857(var145, (SubLObject)module0754.$ic101$, (SubLObject)module0754.UNPROVIDED);
        if (module0754.NIL == var146) {
            var146 = module0034.f1807(module0034.f1842(var145), (SubLObject)module0754.$ic101$, (SubLObject)module0754.TWO_INTEGER, (SubLObject)module0754.$ic88$, (SubLObject)module0754.EQUAL, (SubLObject)module0754.UNPROVIDED);
            module0034.f1860(var145, (SubLObject)module0754.$ic101$, var146);
        }
        final SubLObject var147 = module0034.f1782(var142, var143);
        final SubLObject var148 = module0034.f1814(var146, var147, (SubLObject)module0754.UNPROVIDED);
        if (var148 != module0754.$ic58$) {
            SubLObject var149 = var148;
            SubLObject var150 = (SubLObject)module0754.NIL;
            var150 = var149.first();
            while (module0754.NIL != var149) {
                SubLObject var151 = var150.first();
                final SubLObject var152 = conses_high.second(var150);
                if (var142.equal(var151.first())) {
                    var151 = var151.rest();
                    if (module0754.NIL != var151 && module0754.NIL == var151.rest() && var143.equal(var151.first())) {
                        return module0034.f1959(var152);
                    }
                }
                var149 = var149.rest();
                var150 = var149.first();
            }
        }
        final SubLObject var153 = Values.arg2(var144.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47374(var142, var143)));
        module0034.f1836(var146, var147, var148, var153, (SubLObject)ConsesLow.list(var142, var143));
        return module0034.f1959(var153);
    }
    
    public static SubLObject f47375() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47284", "S#51741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47286", "S#51735", 1, 0, false);
        new $f47286$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47287", "S#51742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47288", "S#51743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47289", "S#51744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47290", "S#51745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47291", "S#51746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47292", "S#51747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47293", "S#51748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47294", "S#51749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47295", "S#51750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47296", "S#51751", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47297", "S#51752", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47298", "S#51753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47299", "S#51754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47285", "S#51755", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47300", "S#51756", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47302", "S#51757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47303", "S#51758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47304", "S#51759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47305", "S#51760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47306", "S#39080", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47301", "S#50948", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47307", "S#39299", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47308", "S#51734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47309", "S#51761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47310", "S#50965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47311", "S#51694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47313", "S#51762", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47315", "S#51763", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47316", "S#39081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47317", "S#51764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47318", "S#51765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47320", "S#51766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47321", "S#51767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47322", "S#51768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47323", "S#51769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47325", "S#51770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47326", "S#51771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47327", "S#51772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47329", "S#51773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47330", "S#51774", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0754", "f47331", "S#51775");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47319", "S#51776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47312", "S#51006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47332", "S#51777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47333", "S#51778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47334", "S#51779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47335", "S#51780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47336", "S#51781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47337", "S#51782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47338", "S#51783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47340", "S#51784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47339", "S#51785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47341", "S#51786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47342", "S#51787", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47343", "S#50944", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47344", "S#51788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47345", "S#51789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47346", "S#51790", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47347", "S#51791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47314", "S#51792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47348", "S#51793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47349", "S#51794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47350", "S#51795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47351", "S#51796", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47324", "S#50966", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47352", "S#51797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47353", "S#51798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47357", "S#50952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47356", "S#51799", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47358", "S#51800", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47354", "S#51801", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47359", "S#51802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47355", "S#51803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47360", "S#50977", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47364", "S#51804", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47366", "S#51805", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47361", "S#51806", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47367", "S#51807", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47362", "S#51808", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47365", "S#51809", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47368", "S#51810", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47370", "S#51811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47369", "S#51812", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47328", "S#51813", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47363", "S#51814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47371", "S#51815", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47373", "S#51816", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47374", "S#51817", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0754", "f47372", "S#51818", 1, 1, false);
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47376() {
        module0754.$g6062$ = SubLFiles.defconstant("S#51819", (SubLObject)module0754.$ic0$);
        module0754.$g6063$ = SubLFiles.defconstant("S#51820", module0754.$ic31$);
        module0754.$g6064$ = SubLFiles.defvar("S#39300", (SubLObject)module0754.NIL);
        return (SubLObject)module0754.NIL;
    }
    
    public static SubLObject f47377() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0754.$g6062$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0754.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0754.$ic8$);
        Structures.def_csetf((SubLObject)module0754.$ic9$, (SubLObject)module0754.$ic10$);
        Structures.def_csetf((SubLObject)module0754.$ic11$, (SubLObject)module0754.$ic12$);
        Structures.def_csetf((SubLObject)module0754.$ic13$, (SubLObject)module0754.$ic14$);
        Structures.def_csetf((SubLObject)module0754.$ic15$, (SubLObject)module0754.$ic16$);
        Structures.def_csetf((SubLObject)module0754.$ic17$, (SubLObject)module0754.$ic18$);
        Equality.identity((SubLObject)module0754.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0754.$g6062$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0754.$ic29$));
        module0034.f1895((SubLObject)module0754.$ic53$);
        module0034.f1895((SubLObject)module0754.$ic66$);
        module0034.f1895((SubLObject)module0754.$ic72$);
        module0034.f1895((SubLObject)module0754.$ic74$);
        module0034.f1895((SubLObject)module0754.$ic83$);
        module0034.f1895((SubLObject)module0754.$ic85$);
        module0034.f1895((SubLObject)module0754.$ic90$);
        module0034.f1895((SubLObject)module0754.$ic99$);
        module0034.f1895((SubLObject)module0754.$ic101$);
        return (SubLObject)module0754.NIL;
    }
    
    public void declareFunctions() {
        f47375();
    }
    
    public void initializeVariables() {
        f47376();
    }
    
    public void runTopLevelForms() {
        f47377();
    }
    
    static {
        me = (SubLFile)new module0754();
        module0754.$g6062$ = null;
        module0754.$g6063$ = null;
        module0754.$g6064$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#51734", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#51735", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#22105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51821", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VAR"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("QUANTIFIER"), (SubLObject)SubLObjectFactory.makeKeyword("SINGLE-USE?"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51742", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51743", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51744", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51745", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51746", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51747", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51748", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51749", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51751", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#51755", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#51741", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#51735", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#51742", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#51747", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#51743", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#51748", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#51744", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#51749", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#51745", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#51750", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#51746", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#51751", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("VAR");
        $ic20$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic21$ = SubLObjectFactory.makeKeyword("QUANTIFIER");
        $ic22$ = SubLObjectFactory.makeKeyword("SINGLE-USE?");
        $ic23$ = SubLObjectFactory.makeKeyword("ARG-POSITION");
        $ic24$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic25$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic26$ = SubLObjectFactory.makeSymbol("S#51752", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic28$ = SubLObjectFactory.makeKeyword("END");
        $ic29$ = SubLObjectFactory.makeSymbol("S#51754", "CYC");
        $ic30$ = SubLObjectFactory.makeString("#<PPH-VAR-ENTRY: ~S ~S ~S ~S>");
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic32$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic33$ = SubLObjectFactory.makeString(") ");
        $ic34$ = SubLObjectFactory.makeString("Non EL var: ~S");
        $ic35$ = SubLObjectFactory.makeString("Registering ~S as ~S.~%");
        $ic36$ = SubLObjectFactory.makeSymbol("S#39081", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENTIAL"), (SubLObject)SubLObjectFactory.makeKeyword("NO"));
        $ic38$ = SubLObjectFactory.makeString("~&~S is not a quantifier keyword among ~S");
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier"));
        $ic40$ = SubLObjectFactory.makeKeyword("EXISTENTIAL");
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic42$ = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $ic43$ = SubLObjectFactory.makeKeyword("SCOPED");
        $ic44$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic45$ = SubLObjectFactory.makeSymbol("S#51771", "CYC");
        $ic46$ = SubLObjectFactory.makeString("~&Registering ~S as a query var.~%");
        $ic47$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic48$ = SubLObjectFactory.makeString("PPH-REGISTER-VAR-AS-USED-ONLY-ONCE called on var ~S with no PPH-VAR-ENTRY~%");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51822", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#51823", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic50$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic51$ = SubLObjectFactory.makeSymbol("S#39025", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#51007", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#50944", "CYC");
        $ic54$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic55$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic56$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic57$ = SubLObjectFactory.makeInteger(128);
        $ic58$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic59$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $ic60$ = SubLObjectFactory.makeString("~&Noted: ~S is a ~S.~%");
        $ic61$ = SubLObjectFactory.makeString("other");
        $ic62$ = SubLObjectFactory.makeString(" other ");
        $ic63$ = SubLObjectFactory.makeString("other ");
        $ic64$ = SubLObjectFactory.makeString(" another");
        $ic65$ = SubLObjectFactory.makeString("another");
        $ic66$ = SubLObjectFactory.makeSymbol("S#50966", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic68$ = SubLObjectFactory.makeInteger(98);
        $ic69$ = ConsesLow.list((SubLObject)module0754.ONE_INTEGER);
        $ic70$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#50952", "CYC")));
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedCollection"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#51801", "CYC");
        $ic73$ = SubLObjectFactory.makeInteger(200);
        $ic74$ = SubLObjectFactory.makeSymbol("S#51803", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#50953", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("CNF");
        $ic77$ = SubLObjectFactory.makeKeyword("DNF");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $ic79$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLVariable"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#44567", "CYC");
        $ic81$ = SubLObjectFactory.makeString("Removing non-SpecsFn terms from ~S");
        $ic82$ = SubLObjectFactory.makeSymbol("S#51389", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#51806", "CYC");
        $ic84$ = SubLObjectFactory.makeInteger(32);
        $ic85$ = SubLObjectFactory.makeSymbol("S#51808", "CYC");
        $ic86$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FamilyRelationSlot"));
        $ic87$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Agent-Generic"));
        $ic88$ = SubLObjectFactory.makeInteger(100);
        $ic89$ = SubLObjectFactory.makeSymbol("S#51085", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#51812", "CYC");
        $ic91$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll")));
        $ic92$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")));
        $ic93$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("extentCardinality"));
        $ic94$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $ic95$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("holdsSometimeDuring"));
        $ic96$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic97$ = SubLObjectFactory.makeSymbol("S#13455", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#13456", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#51816", "CYC");
        $ic100$ = SubLObjectFactory.makeString("Constraints on ~S are ~S;~%, choosing ~S~%");
        $ic101$ = SubLObjectFactory.makeSymbol("S#51818", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("QUOTE");
    }
    
    public static final class $sX51734_native extends SubLStructNative
    {
        public SubLObject $var;
        public SubLObject $type;
        public SubLObject $quantifier;
        public SubLObject $single_useP;
        public SubLObject $arg_position;
        private static final SubLStructDeclNative structDecl;
        
        public $sX51734_native() {
            this.$var = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$quantifier = (SubLObject)CommonSymbols.NIL;
            this.$single_useP = (SubLObject)CommonSymbols.NIL;
            this.$arg_position = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX51734_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$var;
        }
        
        public SubLObject getField3() {
            return this.$type;
        }
        
        public SubLObject getField4() {
            return this.$quantifier;
        }
        
        public SubLObject getField5() {
            return this.$single_useP;
        }
        
        public SubLObject getField6() {
            return this.$arg_position;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$var = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$quantifier = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$single_useP = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$arg_position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX51734_native.class, module0754.$ic0$, module0754.$ic1$, module0754.$ic2$, module0754.$ic3$, new String[] { "$var", "$type", "$quantifier", "$single_useP", "$arg_position" }, module0754.$ic4$, module0754.$ic5$, module0754.$ic6$);
        }
    }
    
    public static final class $f47286$UnaryFunction extends UnaryFunction
    {
        public $f47286$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51735"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0754.f47286(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0754.class
	Total time: 550 ms
	
	Decompiled with Procyon 0.5.32.
*/