package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0105 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0105";
    public static final String myFingerPrint = "2ac8f164f1526d5c3a6a7a4cad1f7ac922f3f00f5ad725279cfd15bdc5ff455f";
    public static SubLSymbol $g1350$;
    private static SubLSymbol $g1351$;
    private static SubLSymbol $g1352$;
    public static SubLSymbol $g1353$;
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
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    
    public static SubLObject f7461(final SubLObject var1, final SubLObject var2) {
        f7462(var1, var2, (SubLObject)module0105.ZERO_INTEGER);
        return (SubLObject)module0105.NIL;
    }
    
    public static SubLObject f7463(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX9392_native.class) ? module0105.T : module0105.NIL);
    }
    
    public static SubLObject f7464(final SubLObject var1) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f7465(final SubLObject var1) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f7466(final SubLObject var1) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f7467(final SubLObject var1) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f7468(final SubLObject var1, final SubLObject var4) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f7469(final SubLObject var1, final SubLObject var4) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f7470(final SubLObject var1, final SubLObject var4) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f7471(final SubLObject var1, final SubLObject var4) {
        assert module0105.NIL != f7463(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f7472(SubLObject var5) {
        if (var5 == module0105.UNPROVIDED) {
            var5 = (SubLObject)module0105.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX9392_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0105.NIL, var7 = var5; module0105.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0105.$ic17$)) {
                f7468(var6, var9);
            }
            else if (var10.eql((SubLObject)module0105.$ic18$)) {
                f7469(var6, var9);
            }
            else if (var10.eql((SubLObject)module0105.$ic19$)) {
                f7470(var6, var9);
            }
            else if (var10.eql((SubLObject)module0105.$ic20$)) {
                f7471(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0105.$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f7473(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic22$, (SubLObject)module0105.$ic23$, (SubLObject)module0105.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic24$, (SubLObject)module0105.$ic17$, f7464(var11));
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic24$, (SubLObject)module0105.$ic18$, f7465(var11));
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic24$, (SubLObject)module0105.$ic19$, f7466(var11));
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic24$, (SubLObject)module0105.$ic20$, f7467(var11));
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic25$, (SubLObject)module0105.$ic23$, (SubLObject)module0105.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f7474(final SubLObject var11, final SubLObject var12) {
        return f7473(var11, var12);
    }
    
    public static SubLObject f7475(final SubLObject var13) {
        return Equality.eq(module0105.$g1351$.getGlobalValue(), var13);
    }
    
    public static SubLObject f7476(final SubLObject var14, SubLObject var15, SubLObject var16) {
        if (var15 == module0105.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0105.$ic29$);
        }
        if (var16 == module0105.UNPROVIDED) {
            var16 = Symbols.symbol_function((SubLObject)module0105.IDENTITY);
        }
        final SubLObject var17 = f7472((SubLObject)module0105.UNPROVIDED);
        f7468(var17, module0105.$g1352$.getGlobalValue());
        f7469(var17, Vectors.make_vector(var14, module0105.$g1351$.getGlobalValue()));
        f7470(var17, var15);
        f7471(var17, var16);
        return var17;
    }
    
    public static SubLObject f7477(final SubLObject var18) {
        final SubLObject var19 = f7472((SubLObject)module0105.UNPROVIDED);
        f7468(var19, f7464(var18));
        f7470(var19, f7466(var18));
        f7471(var19, f7467(var18));
        f7469(var19, Sequences.copy_seq(f7465(var18)));
        return var19;
    }
    
    public static SubLObject f7462(final SubLObject var19, final SubLObject var2, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0105.NIL != print_high.$print_readably$.getDynamicValue(var21)) {
            print_high.print_not_readable(var19, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0105.$ic30$, var2, (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ((SubLObject)module0105.$ic32$, var2);
            print_high.princ(f7466(var19), var2);
            final SubLObject var22 = f7467(var19);
            if (!var22.eql(Symbols.symbol_function((SubLObject)module0105.IDENTITY)) && var22 != module0105.IDENTITY) {
                streams_high.write_string((SubLObject)module0105.$ic33$, var2, (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
                print_high.princ(var22, var2);
            }
            streams_high.write_string((SubLObject)module0105.$ic34$, var2, (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
            print_high.princ(f7478(var19), var2);
            streams_high.write_string((SubLObject)module0105.$ic35$, var2, (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
            print_high.princ(f7479(var19), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var19), new SubLObject[] { module0105.$ic31$, var2, module0105.$ic36$, module0105.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var19;
    }
    
    public static SubLObject f7480(final SubLObject var14, SubLObject var15, SubLObject var16) {
        if (var15 == module0105.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0105.$ic29$);
        }
        if (var16 == module0105.UNPROVIDED) {
            var16 = Symbols.symbol_function((SubLObject)module0105.IDENTITY);
        }
        assert module0105.NIL != Types.fixnump(var14) : var14;
        assert module0105.NIL != Types.function_spec_p(var15) : var15;
        assert module0105.NIL != Types.function_spec_p(var16) : var16;
        return f7476(Numbers.add(var14, (SubLObject)module0105.ONE_INTEGER), var15, var16);
    }
    
    public static SubLObject f7481(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        final SubLObject var18 = f7465(var17);
        SubLObject var19;
        SubLObject var20;
        for (var19 = Sequences.length(var18), var20 = (SubLObject)module0105.NIL, var20 = (SubLObject)module0105.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0105.ONE_INTEGER)) {
            Vectors.set_aref(var18, var20, module0105.$g1351$.getGlobalValue());
        }
        f7468(var17, module0105.$g1352$.getGlobalValue());
        return var17;
    }
    
    public static SubLObject f7483(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        return f7477(var17);
    }
    
    public static SubLObject f7482(final SubLObject var19) {
        return f7463(var19);
    }
    
    public static SubLObject f7479(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        return Numbers.subtract(Sequences.length(f7465(var17)), (SubLObject)module0105.ONE_INTEGER);
    }
    
    public static SubLObject f7478(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        return Numbers.subtract(f7464(var17), (SubLObject)module0105.ONE_INTEGER);
    }
    
    public static SubLObject f7484(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        return f7466(var17);
    }
    
    public static SubLObject f7485(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        return f7467(var17);
    }
    
    public static SubLObject f7486(final SubLObject var17, final SubLObject var29, final SubLObject var30) {
        return Functions.funcall(f7466(var17), var29, var30);
    }
    
    public static SubLObject f7487(final SubLObject var17, final SubLObject var19) {
        return Functions.funcall(f7467(var17), var19);
    }
    
    public static SubLObject f7488(final SubLObject var17) {
        return Numbers.zerop(f7478(var17));
    }
    
    public static SubLObject f7489(final SubLObject var17) {
        return Numbers.numE(f7478(var17), f7479(var17));
    }
    
    public static SubLObject f7490(final SubLObject var14, SubLObject var16) {
        if (var16 == module0105.UNPROVIDED) {
            var16 = Symbols.symbol_function((SubLObject)module0105.IDENTITY);
        }
        return f7480(var14, Symbols.symbol_function((SubLObject)module0105.$ic29$), var16);
    }
    
    public static SubLObject f7491(final SubLObject var14, SubLObject var16) {
        if (var16 == module0105.UNPROVIDED) {
            var16 = Symbols.symbol_function((SubLObject)module0105.IDENTITY);
        }
        return f7480(var14, Symbols.symbol_function((SubLObject)module0105.$ic40$), var16);
    }
    
    public static SubLObject f7492(final SubLObject var31, final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        if (module0105.NIL != f7489(var17)) {
            Errors.error((SubLObject)module0105.$ic41$, var17);
        }
        final SubLObject var32 = f7464(var17);
        f7468(var17, Numbers.add(f7464(var17), (SubLObject)module0105.ONE_INTEGER));
        Vectors.set_aref(f7465(var17), var32, var31);
        f7493(var17, var32);
        return var17;
    }
    
    public static SubLObject f7494(final SubLObject var31, final SubLObject var17) {
        return f7492(var31, var17);
    }
    
    public static SubLObject f7495(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        if (module0105.NIL != f7488(var17)) {
            return (SubLObject)module0105.NIL;
        }
        return f7496(var17);
    }
    
    public static SubLObject f7497(final SubLObject var17) {
        return f7498(var17);
    }
    
    public static SubLObject f7498(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        if (module0105.NIL != f7488(var17)) {
            Errors.error((SubLObject)module0105.$ic42$, var17);
        }
        final SubLObject var18 = f7496(var17);
        final SubLObject var19 = f7499(var17);
        if (module0105.NIL == f7488(var17)) {
            f7500(var17, var19);
            f7501(var17, module0105.$g1352$.getGlobalValue());
        }
        return var18;
    }
    
    public static SubLObject f7502(final SubLObject var13, final SubLObject var17, SubLObject var34, SubLObject var16) {
        if (var34 == module0105.UNPROVIDED) {
            var34 = Symbols.symbol_function((SubLObject)module0105.EQL);
        }
        if (var16 == module0105.UNPROVIDED) {
            var16 = Symbols.symbol_function((SubLObject)module0105.IDENTITY);
        }
        assert module0105.NIL != f7482(var17) : var17;
        final SubLObject var35 = f7465(var17);
        final SubLObject var36 = f7464(var17);
        return Sequences.find(var13, var35, var34, var16, module0105.$g1352$.getGlobalValue(), var36);
    }
    
    public static SubLObject f7503(final SubLObject var13, final SubLObject var17, final SubLObject var37, SubLObject var34) {
        if (var34 == module0105.UNPROVIDED) {
            var34 = Symbols.symbol_function((SubLObject)module0105.EQUAL);
        }
        assert module0105.NIL != f7482(var17) : var17;
        final SubLObject var38 = f7504(var17, var13, var37, var34, (SubLObject)module0105.UNPROVIDED);
        if (module0105.NIL != var38) {
            final SubLObject var39 = f7487(var17, var13);
            if (module0105.NIL != f7486(var17, var37, var39)) {
                f7505(var17, var38);
            }
            else {
                f7506(var17, var38);
            }
        }
        return module0035.sublisp_boolean(var38);
    }
    
    public static SubLObject f7507(final SubLObject var13, final SubLObject var17, final SubLObject var34, final SubLObject var16) {
        final SubLObject var35 = f7465(var17);
        final SubLObject var36 = f7464(var17);
        return Sequences.position(var13, var35, var34, var16, module0105.$g1352$.getGlobalValue(), var36);
    }
    
    public static SubLObject f7506(final SubLObject var17, final SubLObject var32) {
        return f7501(var17, var32);
    }
    
    public static SubLObject f7505(final SubLObject var17, final SubLObject var32) {
        return f7493(var17, var32);
    }
    
    public static SubLObject f7508(final SubLObject var17, SubLObject var39) {
        if (var39 == module0105.UNPROVIDED) {
            var39 = (SubLObject)module0105.NIL;
        }
        assert module0105.NIL != f7482(var17) : var17;
        return module0052.f3689(f7509(var17, module0035.sublisp_boolean(var39)), (SubLObject)module0105.$ic43$, (SubLObject)module0105.$ic44$, (SubLObject)module0105.UNPROVIDED);
    }
    
    public static SubLObject f7509(final SubLObject var17, final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0105.NIL;
        SubLObject var41 = (SubLObject)module0105.NIL;
        SubLObject var42 = (SubLObject)module0105.NIL;
        final SubLObject var43 = (SubLObject)module0105.ZERO_INTEGER;
        if (module0105.NIL == f7488(var17)) {
            final SubLObject var44 = Numbers.multiply((SubLObject)module0105.THREE_INTEGER, Numbers.ceiling(Numbers.log(f7478(var17), (SubLObject)module0105.TWO_INTEGER), (SubLObject)module0105.UNPROVIDED));
            var41 = Vectors.make_vector(var44, (SubLObject)module0105.UNPROVIDED);
            var42 = Vectors.make_vector(var44, (SubLObject)module0105.UNPROVIDED);
        }
        var40 = (SubLObject)ConsesLow.list(var43, var42, var41, var17, var39);
        if (module0105.NIL == f7488(var17)) {
            f7510(var40, (SubLObject)module0105.$ic45$, module0105.$g1352$.getGlobalValue());
            f7511(var40);
        }
        return var40;
    }
    
    public static SubLObject f7512(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0105.$ic46$ != f7513(var40)) {
            Errors.error((SubLObject)module0105.$ic47$);
        }
        final SubLObject var42 = f7514(var40);
        f7515(var40);
        f7511(var40);
        return Values.values(var42, var40, (SubLObject)module0105.NIL);
    }
    
    public static SubLObject f7511(final SubLObject var40) {
        for (SubLObject var41 = ConsesLow.nth((SubLObject)module0105.ZERO_INTEGER, var40); !var41.isZero(); var41 = ConsesLow.nth((SubLObject)module0105.ZERO_INTEGER, var40)) {
            final SubLObject var42 = f7513(var40);
            if (var42 == module0105.$ic46$) {
                return var40;
            }
            if (var42 != module0105.$ic45$) {
                Errors.error((SubLObject)module0105.$ic48$, var42);
            }
            f7516(var40);
        }
        return var40;
    }
    
    public static SubLObject f7516(final SubLObject var40) {
        SubLObject var41 = (SubLObject)module0105.NIL;
        SubLObject var42 = (SubLObject)module0105.NIL;
        SubLObject var43 = (SubLObject)module0105.NIL;
        SubLObject var44 = (SubLObject)module0105.NIL;
        SubLObject var45 = (SubLObject)module0105.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var40, (SubLObject)module0105.$ic49$);
        var41 = var40.first();
        SubLObject var46 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var46, var40, (SubLObject)module0105.$ic49$);
        var42 = var46.first();
        var46 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var46, var40, (SubLObject)module0105.$ic49$);
        var43 = var46.first();
        var46 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var46, var40, (SubLObject)module0105.$ic49$);
        var44 = var46.first();
        var46 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var46, var40, (SubLObject)module0105.$ic49$);
        var45 = var46.first();
        var46 = var46.rest();
        if (module0105.NIL == var46) {
            final SubLObject var47 = f7478(var44);
            final SubLObject var48 = f7517(var40);
            f7515(var40);
            SubLObject var49 = (SubLObject)module0105.NIL;
            SubLObject var50 = (SubLObject)module0105.NIL;
            final SubLObject var51 = Numbers.add(var48, var48);
            final SubLObject var52 = Numbers.add(var51, (SubLObject)module0105.ONE_INTEGER);
            var49 = ((module0105.NIL != var45) ? var52 : var51);
            var50 = ((module0105.NIL != var45) ? var51 : var52);
            if (var50.numLE(var47)) {
                f7510(var40, (SubLObject)module0105.$ic45$, var50);
            }
            if (var49.numLE(var47)) {
                f7510(var40, (SubLObject)module0105.$ic45$, var49);
            }
            f7510(var40, (SubLObject)module0105.$ic46$, var48);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0105.$ic49$);
        }
        return var40;
    }
    
    public static SubLObject f7510(final SubLObject var40, final SubLObject var55, final SubLObject var45) {
        SubLObject var56 = (SubLObject)module0105.NIL;
        SubLObject var57 = (SubLObject)module0105.NIL;
        SubLObject var58 = (SubLObject)module0105.NIL;
        SubLObject var59 = (SubLObject)module0105.NIL;
        SubLObject var60 = (SubLObject)module0105.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var40, (SubLObject)module0105.$ic49$);
        var56 = var40.first();
        SubLObject var61 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var61, var40, (SubLObject)module0105.$ic49$);
        var57 = var61.first();
        var61 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var61, var40, (SubLObject)module0105.$ic49$);
        var58 = var61.first();
        var61 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var61, var40, (SubLObject)module0105.$ic49$);
        var59 = var61.first();
        var61 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var61, var40, (SubLObject)module0105.$ic49$);
        var60 = var61.first();
        var61 = var61.rest();
        if (module0105.NIL == var61) {
            Vectors.set_aref(var57, var56, var55);
            Vectors.set_aref(var58, var56, var45);
            var56 = Numbers.add(var56, (SubLObject)module0105.ONE_INTEGER);
            ConsesLow.set_nth((SubLObject)module0105.ZERO_INTEGER, var40, var56);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0105.$ic49$);
        }
        return var40;
    }
    
    public static SubLObject f7515(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)module0105.NIL;
        SubLObject var43 = (SubLObject)module0105.NIL;
        SubLObject var44 = (SubLObject)module0105.NIL;
        SubLObject var45 = (SubLObject)module0105.NIL;
        SubLObject var46 = (SubLObject)module0105.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var40, (SubLObject)module0105.$ic49$);
        var42 = var40.first();
        SubLObject var47 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var43 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var44 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var45 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var46 = var47.first();
        var47 = var47.rest();
        if (module0105.NIL == var47) {
            if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && !var42.isPositive()) {
                Errors.error((SubLObject)module0105.$ic50$);
            }
            Vectors.set_aref(var43, var42, (SubLObject)module0105.NIL);
            Vectors.set_aref(var44, var42, (SubLObject)module0105.NIL);
            var42 = Numbers.subtract(var42, (SubLObject)module0105.ONE_INTEGER);
            ConsesLow.set_nth((SubLObject)module0105.ZERO_INTEGER, var40, var42);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0105.$ic49$);
        }
        return var40;
    }
    
    public static SubLObject f7513(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)module0105.NIL;
        SubLObject var43 = (SubLObject)module0105.NIL;
        SubLObject var44 = (SubLObject)module0105.NIL;
        SubLObject var45 = (SubLObject)module0105.NIL;
        SubLObject var46 = (SubLObject)module0105.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var40, (SubLObject)module0105.$ic49$);
        var42 = var40.first();
        SubLObject var47 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var43 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var44 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var45 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var46 = var47.first();
        var47 = var47.rest();
        if (module0105.NIL == var47) {
            if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && !var42.isPositive()) {
                Errors.error((SubLObject)module0105.$ic50$);
            }
            return Vectors.aref(var43, Numbers.subtract(var42, (SubLObject)module0105.ONE_INTEGER));
        }
        cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0105.$ic49$);
        return (SubLObject)module0105.NIL;
    }
    
    public static SubLObject f7517(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)module0105.NIL;
        SubLObject var43 = (SubLObject)module0105.NIL;
        SubLObject var44 = (SubLObject)module0105.NIL;
        SubLObject var45 = (SubLObject)module0105.NIL;
        SubLObject var46 = (SubLObject)module0105.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var40, (SubLObject)module0105.$ic49$);
        var42 = var40.first();
        SubLObject var47 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var43 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var44 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var45 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0105.$ic49$);
        var46 = var47.first();
        var47 = var47.rest();
        if (module0105.NIL == var47) {
            if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && !var42.isPositive()) {
                Errors.error((SubLObject)module0105.$ic50$);
            }
            return Vectors.aref(var44, Numbers.subtract(var42, (SubLObject)module0105.ONE_INTEGER));
        }
        cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0105.$ic49$);
        return (SubLObject)module0105.NIL;
    }
    
    public static SubLObject f7514(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = f7517(var40);
        final SubLObject var43 = ConsesLow.nth((SubLObject)module0105.THREE_INTEGER, var40);
        if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0105.NIL == f7482(var43)) {
            Errors.error((SubLObject)module0105.$ic51$);
        }
        final SubLObject var44 = f7465(var43);
        return Vectors.aref(var44, var42);
    }
    
    public static SubLObject f7518(final SubLObject var40) {
        final SubLObject var41 = ConsesLow.nth((SubLObject)module0105.ZERO_INTEGER, var40);
        return Numbers.zerop(var41);
    }
    
    public static SubLObject f7519(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        final SubLObject var18 = f7483(var17);
        SubLObject var19 = (SubLObject)module0105.NIL;
        while (module0105.NIL == f7488(var18)) {
            final SubLObject var20 = f7498(var18);
            var19 = (SubLObject)ConsesLow.cons(Functions.funcall(f7485(var18), var20), var19);
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f7520(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        return Mapping.mapcar(f7485(var17), f7521(var17));
    }
    
    public static SubLObject f7521(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        final SubLObject var18 = f7465(var17);
        final SubLObject var19 = f7464(var17);
        SubLObject var20 = (SubLObject)module0105.NIL;
        final SubLObject var21 = var18;
        final SubLObject var22 = (SubLObject)module0105.NIL;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        for (var23 = Sequences.length(var21), var24 = (SubLObject)module0105.NIL, var24 = (SubLObject)module0105.ZERO_INTEGER; var24.numL(var23); var24 = Numbers.add(var24, (SubLObject)module0105.ONE_INTEGER)) {
            var25 = ((module0105.NIL != var22) ? Numbers.subtract(var23, var24, (SubLObject)module0105.ONE_INTEGER) : var24);
            var26 = Vectors.aref(var21, var25);
            if (module0105.$g1352$.getGlobalValue().numLE(var25) && var25.numL(var19)) {
                var20 = (SubLObject)ConsesLow.cons(var26, var20);
            }
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f7522(final SubLObject var17) {
        assert module0105.NIL != f7482(var17) : var17;
        final SubLObject var18 = f7483(var17);
        SubLObject var19 = (SubLObject)module0105.NIL;
        while (module0105.NIL == f7488(var18)) {
            final SubLObject var20 = f7498(var18);
            var19 = (SubLObject)ConsesLow.cons(var20, var19);
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f7496(final SubLObject var17) {
        return Vectors.aref(f7465(var17), module0105.$g1352$.getGlobalValue());
    }
    
    public static SubLObject f7500(final SubLObject var17, final SubLObject var31) {
        return Vectors.set_aref(f7465(var17), module0105.$g1352$.getGlobalValue(), var31);
    }
    
    public static SubLObject f7499(final SubLObject var17) {
        final SubLObject var18 = Numbers.subtract(f7464(var17), (SubLObject)module0105.ONE_INTEGER);
        final SubLObject var19 = Vectors.aref(f7465(var17), var18);
        Vectors.set_aref(f7465(var17), var18, module0105.$g1351$.getGlobalValue());
        f7468(var17, var18);
        return var19;
    }
    
    public static SubLObject f7493(final SubLObject var17, SubLObject var32) {
        final SubLObject var33 = f7465(var17);
        final SubLObject var34 = Vectors.aref(var33, var32);
        for (SubLObject var35 = f7487(var17, var34), var36 = Numbers.integerDivide(var32, (SubLObject)module0105.TWO_INTEGER), var37 = (SubLObject)(var36.isPositive() ? f7487(var17, Vectors.aref(var33, var36)) : module0105.NIL); var36.isPositive() && module0105.NIL != f7486(var17, var37, var35); var36 = Numbers.integerDivide(var32, (SubLObject)module0105.TWO_INTEGER), var37 = (SubLObject)(var36.isPositive() ? f7487(var17, Vectors.aref(var33, var36)) : module0105.NIL)) {
            Vectors.set_aref(var33, var32, Vectors.aref(var33, var36));
            var32 = var36;
        }
        Vectors.set_aref(var33, var32, var34);
        return var17;
    }
    
    public static SubLObject f7501(final SubLObject var17, SubLObject var32) {
        final SubLObject var33 = f7465(var17);
        final SubLObject var34 = Vectors.aref(var33, var32);
        final SubLObject var35 = f7487(var17, var34);
        final SubLObject var36 = f7464(var17);
        final SubLObject var37 = Numbers.integerDivide(var36, (SubLObject)module0105.TWO_INTEGER);
        SubLObject var38 = (SubLObject)module0105.NIL;
        while (var32.numLE(var37) && module0105.NIL == var38) {
            SubLObject var39 = Numbers.add(var32, var32);
            if (var39.numL(var36)) {
                SubLObject var41;
                final SubLObject var40 = var41 = Vectors.aref(var33, var39);
                SubLObject var43;
                final SubLObject var42 = var43 = f7487(var17, var40);
                final SubLObject var44 = Numbers.add(var39, (SubLObject)module0105.ONE_INTEGER);
                if (var44.numL(var36)) {
                    final SubLObject var45 = Vectors.aref(var33, var44);
                    if (module0105.NIL == f7475(var45)) {
                        final SubLObject var46 = f7487(var17, var45);
                        if (module0105.NIL != f7486(var17, var42, var46) && !var42.equal(var46)) {
                            var39 = var44;
                            var41 = var45;
                            var43 = var46;
                        }
                    }
                }
                if (module0105.NIL != f7486(var17, var35, var43)) {
                    Vectors.set_aref(var33, var32, var41);
                    var32 = var39;
                }
                else {
                    var38 = (SubLObject)module0105.T;
                }
            }
            else {
                var38 = (SubLObject)module0105.T;
            }
        }
        Vectors.set_aref(var33, var32, var34);
        return var17;
    }
    
    public static SubLObject f7504(final SubLObject var17, final SubLObject var31, final SubLObject var90, SubLObject var34, SubLObject var32) {
        if (var34 == module0105.UNPROVIDED) {
            var34 = Symbols.symbol_function((SubLObject)module0105.EQUAL);
        }
        if (var32 == module0105.UNPROVIDED) {
            var32 = module0105.$g1352$.getGlobalValue();
        }
        final SubLObject var91 = f7465(var17);
        final SubLObject var92 = f7464(var17);
        final SubLObject var93 = Vectors.aref(var91, var32);
        if (module0105.NIL != Functions.funcall(var34, var31, var93)) {
            return var32;
        }
        if (module0105.NIL == f7486(var17, var90, f7487(var17, var93))) {
            return (SubLObject)module0105.NIL;
        }
        final SubLObject var94 = Numbers.add(var32, var32);
        if (!var94.numL(var92)) {
            return (SubLObject)module0105.NIL;
        }
        final SubLObject var95 = f7504(var17, var31, var90, var34, var94);
        if (module0105.NIL != var95) {
            return var95;
        }
        final SubLObject var96 = Numbers.add((SubLObject)module0105.ONE_INTEGER, var94);
        if (var96.numL(var92)) {
            return f7504(var17, var31, var90, var34, var96);
        }
        return (SubLObject)module0105.NIL;
    }
    
    public static SubLObject f7523(final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var94) {
        if (var15 == module0105.UNPROVIDED) {
            var15 = Symbols.symbol_function((SubLObject)module0105.$ic29$);
        }
        if (var16 == module0105.UNPROVIDED) {
            var16 = Symbols.symbol_function((SubLObject)module0105.IDENTITY);
        }
        if (var94 == module0105.UNPROVIDED) {
            var94 = Symbols.symbol_function((SubLObject)module0105.IDENTITY);
        }
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = Vectors.make_vector(var14, (SubLObject)module0105.UNPROVIDED);
        final SubLObject var97 = f7480(var14, var15, var16);
        if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var95) && module0105.NIL == f7488(var97)) {
            Errors.error((SubLObject)module0105.$ic60$);
        }
        SubLObject var98;
        SubLObject var99;
        SubLObject var100;
        for (var98 = (SubLObject)module0105.NIL, var98 = (SubLObject)module0105.ZERO_INTEGER; var98.numL(var14); var98 = Numbers.add(var98, (SubLObject)module0105.ONE_INTEGER)) {
            var99 = random.random(var14);
            var100 = Functions.funcall(var94, var99);
            Vectors.set_aref(var96, var98, var100);
            f7492(var100, var97);
        }
        if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var95) && module0105.NIL == f7489(var97)) {
            Errors.error((SubLObject)module0105.$ic61$);
        }
        final SubLObject var101 = var96;
        final SubLObject var102 = (SubLObject)module0105.NIL;
        SubLObject var103;
        SubLObject var104;
        SubLObject var105;
        SubLObject var106;
        for (var103 = Sequences.length(var101), var104 = (SubLObject)module0105.NIL, var104 = (SubLObject)module0105.ZERO_INTEGER; var104.numL(var103); var104 = Numbers.add(var104, (SubLObject)module0105.ONE_INTEGER)) {
            var105 = ((module0105.NIL != var102) ? Numbers.subtract(var103, var104, (SubLObject)module0105.ONE_INTEGER) : var104);
            var106 = Vectors.aref(var101, var105);
            if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var95) && module0105.NIL == f7502(var106, var97, Symbols.symbol_function((SubLObject)module0105.EQUAL), (SubLObject)module0105.UNPROVIDED)) {
                Errors.error((SubLObject)module0105.$ic62$, var106);
            }
            if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var95) && !f7504(var97, var106, Functions.funcall(var16, var106), (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED).isFixnum()) {
                Errors.error((SubLObject)module0105.$ic63$, var106);
            }
        }
        var96 = Sort.sort(var96, var15, var16);
        SubLObject var107;
        for (var98 = (SubLObject)module0105.NIL, var98 = (SubLObject)module0105.ZERO_INTEGER; var98.numL(var14); var98 = Numbers.add(var98, (SubLObject)module0105.ONE_INTEGER)) {
            var107 = f7498(var97);
            if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var95) && !var107.equal(Vectors.aref(var96, Numbers.subtract(var14, var98, (SubLObject)module0105.ONE_INTEGER)))) {
                Errors.error((SubLObject)module0105.$ic64$, var98, Vectors.aref(var96, var98), var107);
            }
        }
        if (module0105.NIL == Errors.$ignore_mustsP$.getDynamicValue(var95) && module0105.NIL == f7488(var97)) {
            Errors.error((SubLObject)module0105.$ic65$);
        }
        return (SubLObject)module0105.$ic66$;
    }
    
    public static SubLObject f7524(final SubLObject var100) {
        final SubLObject var101 = f7491(Sequences.length(var100), Symbols.symbol_function((SubLObject)module0105.$ic69$));
        final SubLObject var102 = Sort.sort(module0038.f2658(var100), Symbols.symbol_function((SubLObject)module0105.$ic70$), Symbols.symbol_function((SubLObject)module0105.$ic69$));
        SubLObject var104_105;
        SubLObject var103;
        SubLObject var104;
        SubLObject var105;
        for (var103 = (var104_105 = Sequences.length(var100)), var104 = (SubLObject)module0105.NIL, var104 = (SubLObject)module0105.ZERO_INTEGER; !var104.numGE(var104_105); var104 = module0048.f_1X(var104)) {
            var105 = Strings.sublisp_char(var100, var104);
            f7494(var105, var101);
        }
        SubLObject var106 = (SubLObject)module0105.ZERO_INTEGER;
        final SubLObject var107 = var102;
        SubLObject var104_106;
        SubLObject var108;
        SubLObject var109;
        SubLObject var110;
        SubLObject var111;
        for (var108 = (var104_106 = Sequences.length(var107)), var109 = (SubLObject)module0105.NIL, var109 = (SubLObject)module0105.ZERO_INTEGER; !var109.numGE(var104_106); var109 = module0048.f_1X(var109)) {
            var110 = Strings.sublisp_char(var107, var109);
            var111 = f7498(var101);
            if (module0105.NIL == Characters.charE(var110, var111)) {
                Errors.warn((SubLObject)module0105.$ic71$, var101, var102, var106);
                return (SubLObject)module0105.NIL;
            }
            var106 = Numbers.add(var106, (SubLObject)module0105.ONE_INTEGER);
        }
        return (SubLObject)module0105.$ic66$;
    }
    
    public static SubLObject f7525(final SubLObject var1, final SubLObject var2) {
        f7526(var1, var2, (SubLObject)module0105.ZERO_INTEGER);
        return (SubLObject)module0105.NIL;
    }
    
    public static SubLObject f7527(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX9394_native.class) ? module0105.T : module0105.NIL);
    }
    
    public static SubLObject f7528(final SubLObject var1) {
        assert module0105.NIL != f7527(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f7529(final SubLObject var1) {
        assert module0105.NIL != f7527(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f7530(final SubLObject var1, final SubLObject var4) {
        assert module0105.NIL != f7527(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f7531(final SubLObject var1, final SubLObject var4) {
        assert module0105.NIL != f7527(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f7532(SubLObject var5) {
        if (var5 == module0105.UNPROVIDED) {
            var5 = (SubLObject)module0105.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX9394_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0105.NIL, var7 = var5; module0105.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0105.$ic87$)) {
                f7530(var6, var9);
            }
            else if (var10.eql((SubLObject)module0105.$ic88$)) {
                f7531(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0105.$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f7533(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic22$, (SubLObject)module0105.$ic89$, (SubLObject)module0105.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic24$, (SubLObject)module0105.$ic87$, f7528(var11));
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic24$, (SubLObject)module0105.$ic88$, f7529(var11));
        Functions.funcall(var12, var11, (SubLObject)module0105.$ic25$, (SubLObject)module0105.$ic89$, (SubLObject)module0105.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f7534(final SubLObject var11, final SubLObject var12) {
        return f7533(var11, var12);
    }
    
    public static SubLObject f7526(final SubLObject var19, final SubLObject var2, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0105.NIL != print_high.$print_readably$.getDynamicValue(var21)) {
            print_high.print_not_readable(var19, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0105.$ic30$, var2, (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var19), new SubLObject[] { module0105.$ic31$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0105.$ic91$, var2, (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
            print_high.princ(f7535(var19), var2);
            streams_high.write_string((SubLObject)module0105.$ic92$, var2, (SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
            print_high.princ(f7536(var19), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var19), new SubLObject[] { module0105.$ic31$, var2, module0105.$ic36$, module0105.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var19;
    }
    
    public static SubLObject f7535(final SubLObject var118) {
        assert module0105.NIL != f7527(var118) : var118;
        return f7528(var118);
    }
    
    public static SubLObject f7537(final SubLObject var118, final SubLObject var119) {
        assert module0105.NIL != f7527(var118) : var118;
        f7530(var118, var119);
        return f7528(var118);
    }
    
    public static SubLObject f7536(final SubLObject var118) {
        assert module0105.NIL != f7527(var118) : var118;
        return f7529(var118);
    }
    
    public static SubLObject f7538(final SubLObject var120, final SubLObject var97) {
        assert module0105.NIL != Types.numberp(var120) : var120;
        final SubLObject var121 = f7532((SubLObject)module0105.UNPROVIDED);
        f7530(var121, var120);
        f7531(var121, var97);
        return var121;
    }
    
    public static SubLObject f7539(final SubLObject var122, SubLObject var123) {
        if (var123 == module0105.UNPROVIDED) {
            var123 = (SubLObject)module0105.NIL;
        }
        if (var122 == module0105.$ic94$) {
            return f7539(module0107.f7574(), var123);
        }
        final SubLObject var124 = (SubLObject)module0105.$ic95$;
        final SubLObject var125 = (SubLObject)ConsesLow.list(var122, Sequences.reverse(var122));
        final SubLObject var126 = (SubLObject)ConsesLow.list((SubLObject)module0105.T, (SubLObject)module0105.NIL);
        SubLObject var127 = (SubLObject)module0105.NIL;
        SubLObject var128 = var125;
        SubLObject var129 = (SubLObject)module0105.NIL;
        var129 = var128.first();
        while (module0105.NIL != var128) {
            SubLObject var128_129 = var124;
            SubLObject var130 = (SubLObject)module0105.NIL;
            var130 = var128_129.first();
            while (module0105.NIL != var128_129) {
                SubLObject var128_130 = var126;
                SubLObject var131 = (SubLObject)module0105.NIL;
                var131 = var128_130.first();
                while (module0105.NIL != var128_130) {
                    var127 = f7540(var129, var130, var123, var131);
                    if (!var127.eql(var130)) {
                        return (SubLObject)module0105.$ic96$;
                    }
                    var128_130 = var128_130.rest();
                    var131 = var128_130.first();
                }
                var128_129 = var128_129.rest();
                var130 = var128_129.first();
            }
            var128 = var128.rest();
            var129 = var128.first();
        }
        return (SubLObject)module0105.$ic66$;
    }
    
    public static SubLObject f7540(final SubLObject var100, final SubLObject var14, SubLObject var123, SubLObject var131) {
        if (var123 == module0105.UNPROVIDED) {
            var123 = (SubLObject)module0105.NIL;
        }
        if (var131 == module0105.UNPROVIDED) {
            var131 = (SubLObject)module0105.T;
        }
        final SubLObject var132 = module0067.f4880((SubLObject)module0105.UNPROVIDED, (SubLObject)module0105.UNPROVIDED);
        final SubLObject var133 = (module0105.NIL != var131) ? f7491(var14, Symbols.symbol_function((SubLObject)module0105.$ic97$)) : f7490(var14, Symbols.symbol_function((SubLObject)module0105.$ic97$));
        if (module0105.NIL != var123) {
            Errors.warn((SubLObject)module0105.$ic98$, (SubLObject)((module0105.NIL != var131) ? module0105.$ic99$ : module0105.$ic100$), var14, var100);
        }
        SubLObject var104_133;
        SubLObject var134;
        SubLObject var135;
        SubLObject var136;
        SubLObject var137;
        SubLObject var138;
        SubLObject var139;
        SubLObject var140;
        SubLObject var141;
        SubLObject var142;
        SubLObject var143;
        for (var134 = (var104_133 = Sequences.length(var100)), var135 = (SubLObject)module0105.NIL, var135 = (SubLObject)module0105.ZERO_INTEGER; !var135.numGE(var104_133); var135 = module0048.f_1X(var135)) {
            var136 = Strings.sublisp_char(var100, var135);
            var137 = module0067.f4884(var132, var136, (SubLObject)module0105.UNPROVIDED);
            if (module0105.NIL == var137) {
                var137 = f7538((SubLObject)((module0105.NIL != var131) ? module0105.ONE_INTEGER : var14), var136);
                module0067.f4886(var132, var136, var137);
                if (module0105.NIL != f7489(var133)) {
                    var138 = f7498(var133);
                    module0067.f4887(var132, f7529(var138));
                    if (module0105.NIL != var123) {
                        Errors.warn((SubLObject)module0105.$ic101$, var138);
                    }
                }
                f7494(var137, var133);
                if (module0105.NIL != var123) {
                    Errors.warn((SubLObject)module0105.$ic102$, var137, f7478(var133));
                }
            }
            else {
                var139 = f7535(var137);
                var140 = ((module0105.NIL != var131) ? Numbers.add(var139, (SubLObject)module0105.ONE_INTEGER) : Numbers.subtract(var139, (SubLObject)module0105.ONE_INTEGER));
                var141 = (SubLObject)module0105.NIL;
                var142 = (SubLObject)module0105.NIL;
                try {
                    var142 = streams_high.make_private_string_output_stream();
                    print_high.princ(f7521(var133), var142);
                    var141 = streams_high.get_output_stream_string(var142);
                }
                finally {
                    var143 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0105.T);
                        streams_high.close(var142, (SubLObject)module0105.UNPROVIDED);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var143);
                    }
                }
                f7537(var137, var140);
                if (module0105.NIL == f7503(var137, var133, var139, (SubLObject)module0105.UNPROVIDED) && module0105.NIL != var123) {
                    Errors.error((SubLObject)module0105.$ic103$, new SubLObject[] { var137, var139, var140, var141, f7521(var133) });
                }
            }
            f7541(var133, var131);
        }
        return var14;
    }
    
    public static SubLObject f7541(final SubLObject var139, SubLObject var131) {
        if (var131 == module0105.UNPROVIDED) {
            var131 = (SubLObject)module0105.T;
        }
        final SubLObject var141;
        final SubLObject var140 = var141 = f7483(var139);
        final SubLObject var142 = (module0105.NIL != var131) ? Symbols.symbol_function((SubLObject)module0105.$ic29$) : Symbols.symbol_function((SubLObject)module0105.$ic40$);
        final SubLObject var143 = (SubLObject)((module0105.NIL != var131) ? module0105.$ic104$ : module0105.$ic105$);
        SubLObject var144 = (module0105.NIL != var131) ? Numbers.$most_negative_fixnum$.getGlobalValue() : Numbers.$most_positive_fixnum$.getGlobalValue();
        while (module0105.NIL == f7488(var141)) {
            final SubLObject var145 = f7498(var141);
            final SubLObject var146 = f7535(var145);
            if (module0105.NIL == Functions.funcall(var142, var144, var146)) {
                Errors.error((SubLObject)module0105.$ic106$, new SubLObject[] { var144, var143, var146, f7521(var139) });
            }
            var144 = var146;
        }
        return (SubLObject)module0105.T;
    }
    
    public static SubLObject f7542() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7461", "S#9397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7463", "S#9393", 1, 0, false);
        new $f7463$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7464", "S#9398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7465", "S#9399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7466", "S#9400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7467", "S#9401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7468", "S#9402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7469", "S#9403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7470", "S#9404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7471", "S#9405", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7472", "S#9406", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7473", "S#9407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7474", "S#9408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7475", "S#9409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7476", "S#9410", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7477", "S#9411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7462", "S#9412", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7480", "S#9413", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7481", "S#9414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7483", "S#9415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7482", "S#9416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7479", "S#9417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7478", "S#9418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7484", "S#9419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7485", "S#9420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7486", "S#9421", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7487", "S#9422", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7488", "S#9423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7489", "S#9424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7490", "S#9425", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7491", "S#9426", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7492", "S#9427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7494", "S#9428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7495", "S#9429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7497", "S#9430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7498", "S#9431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7502", "S#9432", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7503", "S#9433", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7507", "S#9434", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7506", "S#9435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7505", "S#9436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7508", "S#9437", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7509", "S#9438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7512", "S#9439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7511", "S#9440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7516", "S#9441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7510", "S#9442", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7515", "S#9443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7513", "S#9444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7517", "S#9445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7514", "S#9446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7518", "S#9447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7519", "S#9448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7520", "S#9449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7521", "S#9450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7522", "S#9451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7496", "S#9452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7500", "S#9453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7499", "S#9454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7493", "S#9455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7501", "S#9456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7504", "S#9457", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7523", "S#9458", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7524", "S#9459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7525", "S#9460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7527", "S#9395", 1, 0, false);
        new $f7527$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7528", "S#9461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7529", "S#9462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7530", "S#9463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7531", "S#9464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7532", "S#9465", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7533", "S#9466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7534", "S#9467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7526", "S#9468", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7535", "S#9469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7537", "S#9470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7536", "S#9471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7538", "S#9472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7539", "S#9473", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7540", "S#9474", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0105", "f7541", "S#9475", 1, 1, false);
        return (SubLObject)module0105.NIL;
    }
    
    public static SubLObject f7543() {
        module0105.$g1350$ = SubLFiles.defconstant("S#9476", (SubLObject)module0105.$ic0$);
        module0105.$g1351$ = SubLFiles.deflexical("S#9477", (module0105.NIL != Symbols.boundp((SubLObject)module0105.$ic27$)) ? module0105.$g1351$.getGlobalValue() : Symbols.make_symbol((SubLObject)module0105.$ic28$));
        module0105.$g1352$ = SubLFiles.deflexical("S#9478", (SubLObject)module0105.ONE_INTEGER);
        module0105.$g1353$ = SubLFiles.defconstant("S#9479", (SubLObject)module0105.$ic74$);
        return (SubLObject)module0105.NIL;
    }
    
    public static SubLObject f7544() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0105.$g1350$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0105.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0105.$ic8$);
        Structures.def_csetf((SubLObject)module0105.$ic9$, (SubLObject)module0105.$ic10$);
        Structures.def_csetf((SubLObject)module0105.$ic11$, (SubLObject)module0105.$ic12$);
        Structures.def_csetf((SubLObject)module0105.$ic13$, (SubLObject)module0105.$ic14$);
        Structures.def_csetf((SubLObject)module0105.$ic15$, (SubLObject)module0105.$ic16$);
        Equality.identity((SubLObject)module0105.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0105.$g1350$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0105.$ic26$));
        module0003.f57((SubLObject)module0105.$ic27$);
        module0027.f1449((SubLObject)module0105.$ic52$, (SubLObject)ConsesLow.list(new SubLObject[] { module0105.$ic53$, module0105.NIL, module0105.$ic54$, module0105.NIL, module0105.$ic55$, module0105.NIL, module0105.$ic56$, module0105.$ic57$, module0105.$ic58$, module0105.T }), (SubLObject)module0105.$ic59$);
        module0027.f1449((SubLObject)module0105.$ic67$, (SubLObject)ConsesLow.list(new SubLObject[] { module0105.$ic53$, module0105.NIL, module0105.$ic54$, module0105.NIL, module0105.$ic55$, module0105.NIL, module0105.$ic56$, module0105.$ic57$, module0105.$ic58$, module0105.T }), (SubLObject)module0105.$ic68$);
        module0027.f1449((SubLObject)module0105.$ic72$, (SubLObject)ConsesLow.list(new SubLObject[] { module0105.$ic53$, module0105.NIL, module0105.$ic54$, module0105.NIL, module0105.$ic55$, module0105.NIL, module0105.$ic56$, module0105.$ic57$, module0105.$ic58$, module0105.T }), (SubLObject)module0105.$ic73$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0105.$g1353$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0105.$ic81$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0105.$ic82$);
        Structures.def_csetf((SubLObject)module0105.$ic83$, (SubLObject)module0105.$ic84$);
        Structures.def_csetf((SubLObject)module0105.$ic85$, (SubLObject)module0105.$ic86$);
        Equality.identity((SubLObject)module0105.$ic74$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0105.$g1353$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0105.$ic90$));
        return (SubLObject)module0105.NIL;
    }
    
    public void declareFunctions() {
        f7542();
    }
    
    public void initializeVariables() {
        f7543();
    }
    
    public void runTopLevelForms() {
        f7544();
    }
    
    static {
        me = (SubLFile)new module0105();
        module0105.$g1350$ = null;
        module0105.$g1351$ = null;
        module0105.$g1352$ = null;
        module0105.$g1353$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#9392", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#9393", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5217", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEXT"), (SubLObject)SubLObjectFactory.makeKeyword("NODES"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9399", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9400", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9401", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9403", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9404", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9405", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#9412", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#9397", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9393", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#9398", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#9402", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#9399", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#9403", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#9400", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#9404", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#9401", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#9405", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("NEXT");
        $ic18$ = SubLObjectFactory.makeKeyword("NODES");
        $ic19$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic20$ = SubLObjectFactory.makeKeyword("KEY");
        $ic21$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic22$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic23$ = SubLObjectFactory.makeSymbol("S#9406", "CYC");
        $ic24$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic25$ = SubLObjectFactory.makeKeyword("END");
        $ic26$ = SubLObjectFactory.makeSymbol("S#9408", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#9477", "CYC");
        $ic28$ = SubLObjectFactory.makeString("Empty Heap Element");
        $ic29$ = SubLObjectFactory.makeSymbol("<=");
        $ic30$ = SubLObjectFactory.makeString("#<");
        $ic31$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic32$ = SubLObjectFactory.makeString("HEAP ");
        $ic33$ = SubLObjectFactory.makeString(" of key ");
        $ic34$ = SubLObjectFactory.makeString(" ");
        $ic35$ = SubLObjectFactory.makeString("/");
        $ic36$ = SubLObjectFactory.makeKeyword("BASE");
        $ic37$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic38$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic39$ = SubLObjectFactory.makeSymbol("S#9416", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol(">=");
        $ic41$ = SubLObjectFactory.makeString("The heap ~A is full; must remove item before insert.");
        $ic42$ = SubLObjectFactory.makeString("Cannot remove an item from empty heap ~A.");
        $ic43$ = SubLObjectFactory.makeSymbol("S#9447", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#9439", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("EXPAND");
        $ic46$ = SubLObjectFactory.makeKeyword("SHOW");
        $ic47$ = SubLObjectFactory.makeString("Error in heap iterator: iterator-next called without :SHOW on top.");
        $ic48$ = SubLObjectFactory.makeString("Invalid sate transition: unknown code ~A on action stack in heap iterator.");
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9480", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9481", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9482", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9483", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9484", "CYC"));
        $ic50$ = SubLObjectFactory.makeString("Error: stack underflow during heap iteration.");
        $ic51$ = SubLObjectFactory.makeString("Error in heap iterator state.");
        $ic52$ = SubLObjectFactory.makeSymbol("S#9458", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("TEST");
        $ic54$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic55$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic56$ = SubLObjectFactory.makeKeyword("KB");
        $ic57$ = SubLObjectFactory.makeKeyword("TINY");
        $ic58$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0105.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0105.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic60$ = SubLObjectFactory.makeString("The heap is not empty after creation.");
        $ic61$ = SubLObjectFactory.makeString("The heap is not full after population");
        $ic62$ = SubLObjectFactory.makeString("Cannot find element ~A in the heap.");
        $ic63$ = SubLObjectFactory.makeString("Cannot determine index of element ~A in the heap.");
        $ic64$ = SubLObjectFactory.makeString("The heap and the vector disagree on priority of item #~A: vector sez ~A, heap sez ~A");
        $ic65$ = SubLObjectFactory.makeString("The heap is not empty after removing all");
        $ic66$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic67$ = SubLObjectFactory.makeSymbol("S#9459", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("asortingexample")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("there was a king who ruled the land his majesty was in command")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("flying flags from every steeple showering silver on the people")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic69$ = SubLObjectFactory.makeSymbol("CHAR-CODE");
        $ic70$ = SubLObjectFactory.makeSymbol("<");
        $ic71$ = SubLObjectFactory.makeString("Heap ~A and reference string ~A differ at position ~D.");
        $ic72$ = SubLObjectFactory.makeSymbol("S#9473", "CYC");
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("asortingexample")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("there was a king who ruled the land his majesty was in command")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("flying flags from every steeple showering silver on the people")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COPYRIGHT-NOTICE")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic74$ = SubLObjectFactory.makeSymbol("S#9394", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#9395", "CYC");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9485", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIORITY"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"));
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9461", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9462", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9463", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9464", "CYC"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#9468", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#9460", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9395", "CYC"));
        $ic83$ = SubLObjectFactory.makeSymbol("S#9461", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#9463", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#9462", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#9464", "CYC");
        $ic87$ = SubLObjectFactory.makeKeyword("PRIORITY");
        $ic88$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic89$ = SubLObjectFactory.makeSymbol("S#9465", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#9467", "CYC");
        $ic91$ = SubLObjectFactory.makeString(" priority ");
        $ic92$ = SubLObjectFactory.makeString(" value ");
        $ic93$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic94$ = SubLObjectFactory.makeKeyword("COPYRIGHT-NOTICE");
        $ic95$ = ConsesLow.list((SubLObject)module0105.FIVE_INTEGER, (SubLObject)module0105.TEN_INTEGER, (SubLObject)module0105.FIFTEEN_INTEGER, (SubLObject)module0105.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(25));
        $ic96$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic97$ = SubLObjectFactory.makeSymbol("S#9469", "CYC");
        $ic98$ = SubLObjectFactory.makeString("Doing a ~A heap of size ~D on string ~A.~%");
        $ic99$ = SubLObjectFactory.makeString("min");
        $ic100$ = SubLObjectFactory.makeString("max");
        $ic101$ = SubLObjectFactory.makeString("~A lost and left.");
        $ic102$ = SubLObjectFactory.makeString("Adding ~A to heap -> elements.");
        $ic103$ = SubLObjectFactory.makeString("Changing the priority of ~A from ~D to ~D had no effect on reconsider.~%Prior: ~A~%Current: ~A~%");
        $ic104$ = SubLObjectFactory.makeString("<=");
        $ic105$ = SubLObjectFactory.makeString(">=");
        $ic106$ = SubLObjectFactory.makeString("The heap is not in proper order: ~D is not ~A ~D.~%Heap: ~A");
    }
    
    public static final class $sX9392_native extends SubLStructNative
    {
        public SubLObject $next;
        public SubLObject $nodes;
        public SubLObject $predicate;
        public SubLObject $key;
        private static final SubLStructDeclNative structDecl;
        
        public $sX9392_native() {
            this.$next = (SubLObject)CommonSymbols.NIL;
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$key = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX9392_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$next;
        }
        
        public SubLObject getField3() {
            return this.$nodes;
        }
        
        public SubLObject getField4() {
            return this.$predicate;
        }
        
        public SubLObject getField5() {
            return this.$key;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$next = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$nodes = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$predicate = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$key = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX9392_native.class, module0105.$ic0$, module0105.$ic1$, module0105.$ic2$, module0105.$ic3$, new String[] { "$next", "$nodes", "$predicate", "$key" }, module0105.$ic4$, module0105.$ic5$, module0105.$ic6$);
        }
    }
    
    public static final class $f7463$UnaryFunction extends UnaryFunction
    {
        public $f7463$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9393"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0105.f7463(var3);
        }
    }
    
    public static final class $sX9394_native extends SubLStructNative
    {
        public SubLObject $priority;
        public SubLObject $value;
        private static final SubLStructDeclNative structDecl;
        
        public $sX9394_native() {
            this.$priority = (SubLObject)CommonSymbols.NIL;
            this.$value = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX9394_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$priority;
        }
        
        public SubLObject getField3() {
            return this.$value;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$priority = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$value = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX9394_native.class, module0105.$ic74$, module0105.$ic75$, module0105.$ic76$, module0105.$ic77$, new String[] { "$priority", "$value" }, module0105.$ic78$, module0105.$ic79$, module0105.$ic80$);
        }
    }
    
    public static final class $f7527$UnaryFunction extends UnaryFunction
    {
        public $f7527$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#9395"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0105.f7527(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0105.class
	Total time: 329 ms
	
	Decompiled with Procyon 0.5.32.
*/