package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0039 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0039";
    public static final String myFingerPrint = "7ac6a277d475d2556d89c19751c3fd541b93830c1dde71da799f645e591ec595";
    private static SubLSymbol $g937$;
    public static SubLSymbol $g938$;
    public static SubLSymbol $g939$;
    private static SubLSymbol $g940$;
    private static SubLSymbol $g941$;
    private static SubLSymbol $g942$;
    private static SubLSymbol $g943$;
    private static SubLSymbol $g944$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLInteger $ic52$;
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
    private static final SubLInteger $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLInteger $ic67$;
    private static final SubLInteger $ic68$;
    private static final SubLInteger $ic69$;
    private static final SubLInteger $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLInteger $ic74$;
    private static final SubLInteger $ic75$;
    private static final SubLInteger $ic76$;
    private static final SubLInteger $ic77$;
    private static final SubLInteger $ic78$;
    private static final SubLInteger $ic79$;
    private static final SubLInteger $ic80$;
    private static final SubLInteger $ic81$;
    private static final SubLInteger $ic82$;
    private static final SubLInteger $ic83$;
    private static final SubLInteger $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLInteger $ic86$;
    private static final SubLInteger $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLInteger $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLInteger $ic94$;
    private static final SubLInteger $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLInteger $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLInteger $ic100$;
    private static final SubLInteger $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLInteger $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLInteger $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLInteger $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLInteger $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    
    public static SubLObject f2978(final SubLObject var1, final SubLObject var2) {
        f2979(var1, var2, (SubLObject)module0039.ZERO_INTEGER);
        return (SubLObject)module0039.NIL;
    }
    
    public static SubLObject f2980(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX4337_native.class) ? module0039.T : module0039.NIL);
    }
    
    public static SubLObject f2981(final SubLObject var1) {
        assert module0039.NIL != f2980(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f2982(final SubLObject var1, final SubLObject var4) {
        assert module0039.NIL != f2980(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f2983(SubLObject var5) {
        if (var5 == module0039.UNPROVIDED) {
            var5 = (SubLObject)module0039.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX4337_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0039.NIL, var7 = var5; module0039.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0039.$ic12$)) {
                f2982(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0039.$ic13$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f2984(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0039.$ic14$, (SubLObject)module0039.$ic15$, (SubLObject)module0039.ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0039.$ic16$, (SubLObject)module0039.$ic12$, f2981(var11));
        Functions.funcall(var12, var11, (SubLObject)module0039.$ic17$, (SubLObject)module0039.$ic15$, (SubLObject)module0039.ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f2985(final SubLObject var11, final SubLObject var12) {
        return f2984(var11, var12);
    }
    
    public static SubLObject f2986(final SubLObject var13) {
        SubLObject var14 = (SubLObject)module0039.ZERO_INTEGER;
        if (module0039.NIL != f2987(var13)) {
            var14 = var13;
        }
        else {
            if (!var13.isChar()) {
                return (SubLObject)module0039.NIL;
            }
            var14 = Characters.char_code(var13);
        }
        final SubLObject var15 = f2983((SubLObject)module0039.UNPROVIDED);
        f2982(var15, var14);
        return var15;
    }
    
    public static SubLObject f2979(final SubLObject var16, final SubLObject var2, final SubLObject var17) {
        final SubLObject var18 = f2981(var16);
        if (var18.numG((SubLObject)module0039.FIFTEEN_INTEGER)) {
            PrintLow.format(var2, (SubLObject)module0039.$ic19$, f2981(var16));
        }
        else {
            PrintLow.format(var2, (SubLObject)module0039.$ic20$, f2981(var16));
        }
        return var16;
    }
    
    public static SubLObject f2988(final SubLObject var13) {
        assert module0039.NIL != f2980(var13) : var13;
        return f2981(var13);
    }
    
    public static SubLObject f2989(final SubLObject var13, final SubLObject var18) {
        assert module0039.NIL != f2980(var13) : var13;
        assert module0039.NIL != f2987(var18) : var18;
        f2982(var13, var18);
        return var13;
    }
    
    public static SubLObject f2990(final SubLObject var1, final SubLObject var2) {
        f2991(var1, var2, (SubLObject)module0039.ZERO_INTEGER);
        return (SubLObject)module0039.NIL;
    }
    
    public static SubLObject f2992(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX4339_native.class) ? module0039.T : module0039.NIL);
    }
    
    public static SubLObject f2993(final SubLObject var1) {
        assert module0039.NIL != f2992(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f2994(final SubLObject var1, final SubLObject var4) {
        assert module0039.NIL != f2992(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f2995(SubLObject var5) {
        if (var5 == module0039.UNPROVIDED) {
            var5 = (SubLObject)module0039.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX4339_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0039.NIL, var7 = var5; module0039.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0039.$ic33$)) {
                f2994(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0039.$ic13$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f2996(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0039.$ic14$, (SubLObject)module0039.$ic34$, (SubLObject)module0039.ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0039.$ic16$, (SubLObject)module0039.$ic33$, f2993(var11));
        Functions.funcall(var12, var11, (SubLObject)module0039.$ic17$, (SubLObject)module0039.$ic34$, (SubLObject)module0039.ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f2997(final SubLObject var11, final SubLObject var12) {
        return f2996(var11, var12);
    }
    
    public static SubLObject f2998(final SubLObject var22) {
        SubLObject var23 = (SubLObject)module0039.NIL;
        if (module0039.NIL != f2987(var22)) {
            var23 = Vectors.make_vector((SubLObject)module0039.ONE_INTEGER, (SubLObject)module0039.UNPROVIDED);
            Vectors.set_aref(var22, (SubLObject)module0039.ZERO_INTEGER, var22);
        }
        else if (var22.isChar()) {
            var23 = Vectors.make_vector((SubLObject)module0039.ONE_INTEGER, (SubLObject)module0039.UNPROVIDED);
            Vectors.set_aref(var23, (SubLObject)module0039.ZERO_INTEGER, Characters.char_code(var22));
        }
        else if (module0039.NIL != f2999(var22)) {
            var23 = var22;
        }
        else {
            if (!var22.isString()) {
                return (SubLObject)module0039.NIL;
            }
            final SubLObject var24 = f3000(var22);
            if (module0039.NIL == var24) {
                return (SubLObject)module0039.NIL;
            }
            var23 = var24;
        }
        final SubLObject var25 = f2995((SubLObject)module0039.UNPROVIDED);
        f2994(var25, var23);
        return var25;
    }
    
    public static SubLObject f2991(final SubLObject var16, final SubLObject var2, final SubLObject var17) {
        PrintLow.format(var2, (SubLObject)module0039.$ic36$, f3001(f2993(var16)));
        return var16;
    }
    
    public static SubLObject f3002(final SubLObject var26) {
        assert module0039.NIL != f2992(var26) : var26;
        return f2993(var26);
    }
    
    public static SubLObject f3003(final SubLObject var26, final SubLObject var22) {
        assert module0039.NIL != f2992(var26) : var26;
        assert module0039.NIL != f2999(var22) : var22;
        f2994(var26, var22);
        return var26;
    }
    
    public static SubLObject f2999(final SubLObject var16) {
        if (!var16.isVector()) {
            return (SubLObject)module0039.NIL;
        }
        SubLObject var17;
        SubLObject var18;
        for (var17 = Sequences.length(var16), var18 = (SubLObject)module0039.NIL, var18 = (SubLObject)module0039.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)module0039.ONE_INTEGER)) {
            if (module0039.NIL == f2987(Vectors.aref(var16, var18))) {
                return (SubLObject)module0039.NIL;
            }
        }
        return (SubLObject)module0039.T;
    }
    
    public static SubLObject f3004(final SubLObject var16) {
        if (!var16.isVector()) {
            return (SubLObject)module0039.NIL;
        }
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var17 = Sequences.length(var16), var18 = (SubLObject)module0039.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, var19)) {
            var19 = f3005(var16, var18);
            if (var19.isNegative()) {
                return (SubLObject)module0039.NIL;
            }
        }
        if (var18.numG(var17)) {
            return (SubLObject)module0039.NIL;
        }
        return (SubLObject)module0039.T;
    }
    
    public static SubLObject f3006(final SubLObject var16) {
        if (!var16.isString()) {
            return (SubLObject)module0039.NIL;
        }
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var17 = Sequences.length(var16), var18 = (SubLObject)module0039.NIL, var18 = (SubLObject)module0039.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)module0039.ONE_INTEGER)) {
            var19 = Strings.sublisp_char(var16, var18);
            if (module0039.NIL == f3007(var19)) {
                return (SubLObject)module0039.NIL;
            }
        }
        return (SubLObject)module0039.T;
    }
    
    public static SubLObject f3008(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var16.isString() && module0039.NIL == f3006(var16));
    }
    
    public static SubLObject f3009(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var16.isChar() && module0039.NIL != f3007(var16));
    }
    
    public static SubLObject f3010(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var16.isChar() && module0039.NIL == f3007(var16));
    }
    
    public static SubLObject f3011(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var16.isInteger() && var16.numLE((SubLObject)module0039.$ic38$));
    }
    
    public static SubLObject f3007(final SubLObject var18) {
        return Numbers.numLE(Characters.char_code(var18), (SubLObject)module0039.$ic38$);
    }
    
    public static SubLObject f3012(final SubLObject var32) {
        SubLObject var33 = (SubLObject)module0039.NIL;
        SubLObject var34 = module0107.f7627();
        SubLObject var35 = module0107.f7627();
        SubLObject var36 = (SubLObject)module0039.NIL;
        final SubLObject var37 = Sequences.length(var32);
        if (module0039.NIL == var36) {
            SubLObject var39_40;
            SubLObject var38;
            SubLObject var39;
            for (var39_40 = var37, var38 = (SubLObject)module0039.NIL, var38 = (SubLObject)module0039.ZERO_INTEGER; module0039.NIL == var36 && !var38.numGE(var39_40); var38 = module0048.f_1X(var38)) {
                var39 = Strings.sublisp_char(var32, var38);
                if (var39.eql((SubLObject)Characters.CHAR_ampersand)) {
                    var33 = (SubLObject)module0039.T;
                    var34 = module0107.f7627();
                    var35 = module0107.f7627();
                }
                else if (module0039.NIL != var33) {
                    if (var39.eql((SubLObject)Characters.CHAR_semicolon)) {
                        var36 = (SubLObject)module0039.T;
                    }
                    else if (module0039.NIL != Characters.digit_char_p(var39, (SubLObject)module0039.UNPROVIDED)) {
                        if (module0039.NIL != module0107.f7628(var34)) {
                            var34 = (SubLObject)module0039.NIL;
                        }
                        else if (module0039.NIL != module0107.f7628(var35)) {
                            var35 = (SubLObject)module0039.NIL;
                        }
                    }
                    else if (var39.eql((SubLObject)Characters.CHAR_x) && module0039.NIL != module0107.f7629(var34) && module0039.NIL != var34 && module0039.NIL != module0107.f7628(var35)) {
                        var35 = (SubLObject)module0039.T;
                    }
                    else if (module0039.NIL != Characters.alpha_char_p(var39)) {
                        if (module0039.NIL != module0107.f7628(var34)) {
                            var34 = (SubLObject)module0039.NIL;
                        }
                        else if (module0039.NIL != var34 && (module0039.NIL.eql(var35) || module0039.NIL == module0038.f2791(var39))) {
                            var33 = (SubLObject)module0039.NIL;
                            var34 = module0107.f7627();
                            var35 = module0107.f7627();
                        }
                    }
                    else if (Characters.CHAR_hash.eql(var39) && module0039.NIL != module0107.f7628(var34)) {
                        var34 = (SubLObject)module0039.T;
                    }
                    else {
                        var33 = (SubLObject)module0039.NIL;
                        var34 = module0107.f7627();
                        var35 = module0107.f7627();
                    }
                }
            }
        }
        return var36;
    }
    
    public static SubLObject f3013(final SubLObject var32) {
        if (module0039.NIL != f3006(var32) && module0039.NIL != f3012(var32)) {
            return (SubLObject)module0039.$ic47$;
        }
        if (module0039.NIL != f3008(var32) && module0039.NIL != f3012(var32)) {
            return (SubLObject)module0039.$ic48$;
        }
        if (module0039.NIL != module0206.f13479(var32)) {
            return (SubLObject)module0039.$ic49$;
        }
        if (module0039.NIL != f3008(var32)) {
            return (SubLObject)module0039.$ic50$;
        }
        return (SubLObject)module0039.$ic51$;
    }
    
    public static SubLObject f3014(final SubLObject var16) {
        if (module0039.NIL == f3015(var16)) {
            return (SubLObject)module0039.NIL;
        }
        final SubLObject var18;
        final SubLObject var17 = var18 = f3000(var16);
        final SubLObject var19 = (SubLObject)module0039.NIL;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        for (var20 = Sequences.length(var18), var21 = (SubLObject)module0039.NIL, var21 = (SubLObject)module0039.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0039.ONE_INTEGER)) {
            var22 = ((module0039.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0039.ONE_INTEGER) : var21);
            var23 = Vectors.aref(var18, var22);
            if (var23.numGE((SubLObject)module0039.$ic52$)) {
                return (SubLObject)module0039.NIL;
            }
        }
        return (SubLObject)module0039.T;
    }
    
    public static SubLObject f3015(final SubLObject var16) {
        if (!var16.isString()) {
            return (SubLObject)module0039.NIL;
        }
        SubLObject var17 = (SubLObject)module0039.$ic53$;
        SubLObject var18 = (SubLObject)module0039.NIL;
        SubLObject var19 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var20 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var10_52;
        SubLObject var10_53;
        for (var21 = Sequences.length(var16), var22 = (SubLObject)module0039.NIL, var22 = (SubLObject)module0039.ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)module0039.ONE_INTEGER)) {
            var18 = Vectors.aref(var16, var22);
            var23 = var17;
            if (var23.eql((SubLObject)module0039.$ic53$)) {
                var10_52 = var18;
                if (var10_52.eql((SubLObject)Characters.CHAR_ampersand)) {
                    var17 = (SubLObject)module0039.$ic54$;
                }
            }
            else if (var23.eql((SubLObject)module0039.$ic54$)) {
                var10_53 = var18;
                if (var10_53.eql((SubLObject)Characters.CHAR_u) || var10_53.eql((SubLObject)Characters.CHAR_U)) {
                    var17 = (SubLObject)module0039.$ic55$;
                    var19 = (SubLObject)module0039.ZERO_INTEGER;
                    var20 = (SubLObject)module0039.ZERO_INTEGER;
                }
                else {
                    var17 = (SubLObject)module0039.$ic53$;
                }
            }
            else if (var23.eql((SubLObject)module0039.$ic55$)) {
                if (var18.eql((SubLObject)Characters.CHAR_semicolon)) {
                    var17 = (SubLObject)module0039.$ic53$;
                    if (module0039.NIL == f2987(var20) || !var19.numG((SubLObject)module0039.ONE_INTEGER) || !var19.numL((SubLObject)module0039.SEVEN_INTEGER)) {
                        return (SubLObject)module0039.NIL;
                    }
                }
                else if (module0039.NIL == module0038.f2791(var18)) {
                    return (SubLObject)module0039.NIL;
                }
            }
            var19 = Numbers.add(var19, (SubLObject)module0039.ONE_INTEGER);
        }
        var23 = var17;
        if (var23.eql((SubLObject)module0039.$ic55$) || var23.eql((SubLObject)module0039.$ic54$)) {
            return (SubLObject)module0039.NIL;
        }
        return (SubLObject)module0039.T;
    }
    
    public static SubLObject f3000(final SubLObject var16) {
        if (!var16.isString()) {
            return (SubLObject)module0039.NIL;
        }
        SubLObject var17 = (SubLObject)module0039.$ic53$;
        SubLObject var18 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var19 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var20 = (SubLObject)module0039.NIL;
        SubLObject var21 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var39_56;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        SubLObject var10_57;
        SubLObject var10_58;
        for (var22 = (var39_56 = Sequences.length(var16)), var23 = (SubLObject)module0039.NIL, var23 = (SubLObject)module0039.ZERO_INTEGER; !var23.numGE(var39_56); var23 = module0048.f_1X(var23)) {
            var24 = Strings.sublisp_char(var16, var23);
            var25 = var17;
            if (var25.eql((SubLObject)module0039.$ic53$)) {
                var10_57 = var24;
                if (var10_57.eql((SubLObject)Characters.CHAR_ampersand)) {
                    var17 = (SubLObject)module0039.$ic54$;
                }
                else if (!var10_57.eql((SubLObject)Characters.CHAR_backslash)) {
                    var20 = (SubLObject)ConsesLow.cons(Characters.char_code(var24), var20);
                    var21 = Numbers.add(var21, (SubLObject)module0039.ONE_INTEGER);
                }
            }
            else if (var25.eql((SubLObject)module0039.$ic54$)) {
                var10_58 = var24;
                if (var10_58.eql((SubLObject)Characters.CHAR_u) || var10_58.eql((SubLObject)Characters.CHAR_U)) {
                    var17 = (SubLObject)module0039.$ic55$;
                    var18 = (SubLObject)module0039.ZERO_INTEGER;
                    var19 = (SubLObject)module0039.ZERO_INTEGER;
                }
                else {
                    var17 = (SubLObject)module0039.$ic53$;
                    var20 = (SubLObject)ConsesLow.cons(Characters.char_code((SubLObject)Characters.CHAR_ampersand), var20);
                    var20 = (SubLObject)ConsesLow.cons(Characters.char_code(var24), var20);
                    var21 = Numbers.add(var21, (SubLObject)module0039.TWO_INTEGER);
                }
            }
            else if (var25.eql((SubLObject)module0039.$ic55$)) {
                if (var24.eql((SubLObject)Characters.CHAR_semicolon)) {
                    var17 = (SubLObject)module0039.$ic53$;
                    if (module0039.NIL == f2987(var19) || !var18.numG((SubLObject)module0039.ONE_INTEGER) || !var18.numL((SubLObject)module0039.SEVEN_INTEGER)) {
                        return (SubLObject)module0039.NIL;
                    }
                    var20 = (SubLObject)ConsesLow.cons(var19, var20);
                    var21 = Numbers.add(var21, (SubLObject)module0039.ONE_INTEGER);
                }
                else {
                    if (module0039.NIL == module0038.f2791(var24)) {
                        return (SubLObject)module0039.NIL;
                    }
                    var19 = Numbers.add(Numbers.ash(var19, (SubLObject)module0039.FOUR_INTEGER), module0038.f2793(var24));
                }
                var18 = Numbers.add(var18, (SubLObject)module0039.ONE_INTEGER);
            }
        }
        final SubLObject var26 = var17;
        if (var26.eql((SubLObject)module0039.$ic56$) || var26.eql((SubLObject)module0039.$ic54$)) {
            return (SubLObject)module0039.NIL;
        }
        return f3016(Sequences.nreverse(var20), var21);
    }
    
    public static SubLObject f3017(final SubLObject var59, SubLObject var60, SubLObject var61) {
        if (var60 == module0039.UNPROVIDED) {
            var60 = module0039.$g940$.getGlobalValue();
        }
        if (var61 == module0039.UNPROVIDED) {
            var61 = module0039.$g941$.getDynamicValue();
        }
        assert module0039.NIL != f3015(var59) : var59;
        assert module0039.NIL != f3009(var60) : var60;
        final SubLObject var62 = f3000(var59);
        final SubLObject var63 = Sequences.length(var62);
        final SubLObject var64 = Strings.make_string(var63, var60);
        final SubLObject var65 = var62;
        final SubLObject var66 = (SubLObject)module0039.NIL;
        SubLObject var45_63;
        SubLObject var67;
        SubLObject var68;
        SubLObject var69;
        for (var45_63 = Sequences.length(var65), var67 = (SubLObject)module0039.NIL, var67 = (SubLObject)module0039.ZERO_INTEGER; var67.numL(var45_63); var67 = Numbers.add(var67, (SubLObject)module0039.ONE_INTEGER)) {
            var68 = ((module0039.NIL != var66) ? Numbers.subtract(var45_63, var67, (SubLObject)module0039.ONE_INTEGER) : var67);
            var69 = Vectors.aref(var65, var68);
            if (var69.numGE((SubLObject)module0039.$ic52$) && module0039.NIL != module0035.f2293(var61, var69, (SubLObject)module0039.EQ, (SubLObject)module0039.NIL)) {
                Strings.set_char(var64, var68, Characters.code_char(module0035.f2293(var61, var69, (SubLObject)module0039.EQ, (SubLObject)module0039.NIL)));
            }
            else if (var69.numL((SubLObject)module0039.$ic52$)) {
                Strings.set_char(var64, var68, Characters.code_char(var69));
            }
        }
        return var64;
    }
    
    public static SubLObject f3001(final SubLObject var65) {
        SubLObject var66 = (SubLObject)module0039.NIL;
        SubLObject var67 = (SubLObject)module0039.NIL;
        try {
            var67 = streams_high.make_private_string_output_stream();
            final SubLObject var68 = (SubLObject)module0039.NIL;
            SubLObject var69;
            SubLObject var70;
            SubLObject var71;
            SubLObject var72;
            SubLObject var73;
            for (var69 = Sequences.length(var65), var70 = (SubLObject)module0039.NIL, var70 = (SubLObject)module0039.ZERO_INTEGER; var70.numL(var69); var70 = Numbers.add(var70, (SubLObject)module0039.ONE_INTEGER)) {
                var71 = ((module0039.NIL != var68) ? Numbers.subtract(var69, var70, (SubLObject)module0039.ONE_INTEGER) : var70);
                var72 = Vectors.aref(var65, var71);
                if (var72.eql(Characters.char_code((SubLObject)Characters.CHAR_quotation))) {
                    print_high.princ((SubLObject)module0039.$ic60$, var67);
                }
                else if (var72.eql(Characters.char_code((SubLObject)Characters.CHAR_backslash))) {
                    print_high.princ((SubLObject)module0039.$ic61$, var67);
                }
                else if (var72.eql(Characters.char_code((SubLObject)Characters.CHAR_ampersand))) {
                    print_high.princ((SubLObject)module0039.$ic62$, var67);
                }
                else if (var72.numGE((SubLObject)module0039.$ic63$) && var72.numLE((SubLObject)module0039.$ic38$)) {
                    print_high.princ(Strings.make_string((SubLObject)module0039.ONE_INTEGER, Characters.code_char(var72)), var67);
                }
                else {
                    var73 = Strings.string_upcase(module0048.f3425(var72), (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED);
                    if (Sequences.length(var73).eql((SubLObject)module0039.ONE_INTEGER)) {
                        var73 = Sequences.cconcatenate((SubLObject)module0039.$ic64$, var73);
                    }
                    PrintLow.format(var67, (SubLObject)module0039.$ic65$, var73);
                }
            }
            var66 = streams_high.get_output_stream_string(var67);
        }
        finally {
            final SubLObject var74 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0039.T);
                streams_high.close(var67, (SubLObject)module0039.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var74);
            }
        }
        return var66;
    }
    
    public static SubLObject f3016(final SubLObject var69, final SubLObject var55) {
        final SubLObject var70 = Vectors.make_vector(var55, (SubLObject)module0039.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var72 = var69;
        SubLObject var73 = (SubLObject)module0039.NIL;
        var73 = var72.first();
        while (module0039.NIL != var72) {
            Vectors.set_aref(var70, var71, var73);
            var71 = Numbers.add(var71, (SubLObject)module0039.ONE_INTEGER);
            var72 = var72.rest();
            var73 = var72.first();
        }
        return var70;
    }
    
    public static SubLObject f3018(final SubLObject var65, SubLObject var71, SubLObject var72) {
        if (var71 == module0039.UNPROVIDED) {
            var71 = (SubLObject)module0039.ZERO_INTEGER;
        }
        if (var72 == module0039.UNPROVIDED) {
            var72 = (SubLObject)module0039.NIL;
        }
        assert module0039.NIL != f2999(var65) : var65;
        if (module0039.NIL == var72) {
            var72 = Numbers.subtract(Sequences.length(var65), (SubLObject)module0039.ONE_INTEGER);
        }
        SubLObject var73 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var74 = (SubLObject)module0039.NIL;
        SubLObject var75 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var77;
        for (SubLObject var76 = var71; var76.numLE(var72); var76 = Numbers.add(var76, (SubLObject)module0039.ONE_INTEGER), var73 = Numbers.add(var73, f3019(var77))) {
            var77 = Vectors.aref(var65, var76);
        }
        var74 = Vectors.make_vector(var73, (SubLObject)module0039.UNPROVIDED);
        for (SubLObject var76 = var71; var76.numLE(var72); var76 = Numbers.add(var76, (SubLObject)module0039.ONE_INTEGER), var75 = f3020(var74, var75, var77)) {
            var77 = Vectors.aref(var65, var76);
        }
        return var74;
    }
    
    public static SubLObject f3021(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        assert module0039.NIL != f3004(var77) : var77;
        final SubLObject var79 = Sequences.length(var77);
        SubLObject var80 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var81 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var82 = (SubLObject)module0039.ZERO_INTEGER;
        SubLObject var83 = (SubLObject)module0039.NIL;
        while (var80.numL(var79)) {
            final SubLObject var84 = f3005(var77, var80);
            var81 = Numbers.add(var81, (SubLObject)module0039.ONE_INTEGER);
            var80 = Numbers.add(var80, var84);
        }
        var83 = Vectors.make_vector(var81, (SubLObject)module0039.UNPROVIDED);
        var80 = (SubLObject)module0039.ZERO_INTEGER;
        while (var80.numL(var79)) {
            var78.resetMultipleValues();
            final SubLObject var85 = f3022(var77, var80);
            final SubLObject var86 = var78.secondMultipleValue();
            final SubLObject var87 = var78.thirdMultipleValue();
            var78.resetMultipleValues();
            var80 = var86;
            Vectors.set_aref(var83, var82, var85);
            var82 = Numbers.add(var82, (SubLObject)module0039.ONE_INTEGER);
        }
        return var83;
    }
    
    public static SubLObject f3023(final SubLObject var13) {
        assert module0039.NIL != f2980(var13) : var13;
        return f2981(var13);
    }
    
    public static SubLObject f3024(final SubLObject var13) {
        assert module0039.NIL != f2987(var13) : var13;
        return f2986(var13);
    }
    
    public static SubLObject f2987(final SubLObject var13) {
        if (!var13.isInteger()) {
            return (SubLObject)module0039.NIL;
        }
        if (var13.isNegative()) {
            return (SubLObject)module0039.NIL;
        }
        return module0040.f3066(var13);
    }
    
    public static SubLObject f3019(final SubLObject var13) {
        assert module0039.NIL != f2987(var13) : var13;
        if (var13.numLE((SubLObject)module0039.$ic38$)) {
            return (SubLObject)module0039.ONE_INTEGER;
        }
        if (var13.numLE((SubLObject)module0039.$ic67$)) {
            return (SubLObject)module0039.TWO_INTEGER;
        }
        if (var13.numLE((SubLObject)module0039.$ic68$)) {
            return (SubLObject)module0039.THREE_INTEGER;
        }
        if (var13.numLE((SubLObject)module0039.$ic69$)) {
            return (SubLObject)module0039.FOUR_INTEGER;
        }
        if (var13.numLE((SubLObject)module0039.$ic70$)) {
            return (SubLObject)module0039.FIVE_INTEGER;
        }
        return (SubLObject)module0039.SIX_INTEGER;
    }
    
    public static SubLObject f3025(final SubLObject var13) {
        assert module0039.NIL != f2987(var13) : var13;
        final SubLObject var14 = Vectors.make_vector(f3019(var13), (SubLObject)module0039.UNPROVIDED);
        f3020(var14, (SubLObject)module0039.ZERO_INTEGER, var13);
        return var14;
    }
    
    public static SubLObject f3026(final SubLObject var83) {
        PrintLow.format((SubLObject)module0039.T, (SubLObject)module0039.$ic71$);
        SubLObject var84;
        SubLObject var85;
        for (var84 = Sequences.length(var83), var85 = (SubLObject)module0039.NIL, var85 = (SubLObject)module0039.ZERO_INTEGER; var85.numL(var84); var85 = Numbers.add(var85, (SubLObject)module0039.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0039.T, (SubLObject)module0039.$ic72$, Vectors.aref(var83, var85));
        }
        PrintLow.format((SubLObject)module0039.T, (SubLObject)module0039.$ic73$);
        return (SubLObject)module0039.NIL;
    }
    
    public static SubLObject f3020(final SubLObject var84, final SubLObject var75, final SubLObject var13) {
        if (var13.numLE((SubLObject)module0039.$ic38$)) {
            Vectors.set_aref(var84, var75, var13);
            return Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER);
        }
        if (var13.numLE((SubLObject)module0039.$ic67$)) {
            Vectors.set_aref(var84, var75, Numbers.logior((SubLObject)module0039.$ic74$, Numbers.ash(var13, (SubLObject)module0039.$ic75$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(var13, (SubLObject)module0039.$ic76$)));
            return Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER);
        }
        if (var13.numLE((SubLObject)module0039.$ic68$)) {
            Vectors.set_aref(var84, var75, Numbers.logior((SubLObject)module0039.$ic77$, Numbers.ash(var13, (SubLObject)module0039.$ic78$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(Numbers.ash(var13, (SubLObject)module0039.$ic75$), (SubLObject)module0039.$ic76$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(var13, (SubLObject)module0039.$ic76$)));
            return Numbers.add(var75, (SubLObject)module0039.THREE_INTEGER);
        }
        if (var13.numLE((SubLObject)module0039.$ic69$)) {
            Vectors.set_aref(var84, var75, Numbers.logior((SubLObject)module0039.$ic79$, Numbers.ash(var13, (SubLObject)module0039.$ic80$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(Numbers.ash(var13, (SubLObject)module0039.$ic78$), (SubLObject)module0039.$ic76$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(Numbers.ash(var13, (SubLObject)module0039.$ic75$), (SubLObject)module0039.$ic76$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.THREE_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(var13, (SubLObject)module0039.$ic76$)));
            return Numbers.add(var75, (SubLObject)module0039.FOUR_INTEGER);
        }
        if (var13.numLE((SubLObject)module0039.$ic70$)) {
            Vectors.set_aref(var84, var75, Numbers.logior((SubLObject)module0039.$ic81$, Numbers.ash(var13, (SubLObject)module0039.$ic82$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(Numbers.ash(var13, (SubLObject)module0039.$ic80$), (SubLObject)module0039.$ic76$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(Numbers.ash(var13, (SubLObject)module0039.$ic78$), (SubLObject)module0039.$ic76$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.THREE_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(Numbers.ash(var13, (SubLObject)module0039.$ic75$), (SubLObject)module0039.$ic76$)));
            Vectors.set_aref(var84, Numbers.add(var75, (SubLObject)module0039.FOUR_INTEGER), Numbers.logior((SubLObject)module0039.$ic52$, Numbers.logand(var13, (SubLObject)module0039.$ic76$)));
            return Numbers.add(var75, (SubLObject)module0039.FIVE_INTEGER);
        }
        return Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER);
    }
    
    public static SubLObject f3005(final SubLObject var84, final SubLObject var75) {
        if (!var84.isVector()) {
            return (SubLObject)module0039.MINUS_ONE_INTEGER;
        }
        final SubLObject var85 = Sequences.length(var84);
        SubLObject var86 = (SubLObject)module0039.ZERO_INTEGER;
        if (var75.numGE(var85) || var75.isNegative()) {
            return (SubLObject)module0039.MINUS_ONE_INTEGER;
        }
        final SubLObject var87 = Vectors.aref(var84, var75);
        var86 = f3027(var87);
        if (var86.isNegative()) {
            return var86;
        }
        if (Numbers.add(var75, var86).numG(var85)) {
            return (SubLObject)module0039.MINUS_ONE_INTEGER;
        }
        SubLObject var88;
        SubLObject var89;
        SubLObject var90;
        SubLObject var91;
        for (var88 = Numbers.add(var86, (SubLObject)module0039.MINUS_ONE_INTEGER), var89 = (SubLObject)module0039.NIL, var89 = (SubLObject)module0039.ZERO_INTEGER; var89.numL(var88); var89 = Numbers.add(var89, (SubLObject)module0039.ONE_INTEGER)) {
            var90 = Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER, var89));
            var91 = Numbers.logand((SubLObject)module0039.$ic74$, var90);
            if (!var91.numE((SubLObject)module0039.$ic52$)) {
                return (SubLObject)module0039.MINUS_ONE_INTEGER;
            }
        }
        return var86;
    }
    
    public static SubLObject f3027(final SubLObject var85) {
        if (module0039.NIL == module0048.f3285(var85)) {
            return (SubLObject)module0039.MINUS_ONE_INTEGER;
        }
        if (Numbers.logand((SubLObject)module0039.$ic52$, var85).numE((SubLObject)module0039.ZERO_INTEGER)) {
            return (SubLObject)module0039.ONE_INTEGER;
        }
        if (Numbers.logand((SubLObject)module0039.$ic77$, var85).numE((SubLObject)module0039.$ic74$)) {
            return (SubLObject)(var85.numG((SubLObject)module0039.$ic83$) ? module0039.TWO_INTEGER : module0039.MINUS_ONE_INTEGER);
        }
        if (Numbers.logand((SubLObject)module0039.$ic79$, var85).numE((SubLObject)module0039.$ic77$)) {
            return (SubLObject)module0039.THREE_INTEGER;
        }
        if (Numbers.logand((SubLObject)module0039.$ic81$, var85).numE((SubLObject)module0039.$ic79$)) {
            return (SubLObject)(var85.numL((SubLObject)module0039.$ic84$) ? module0039.FOUR_INTEGER : module0039.MINUS_ONE_INTEGER);
        }
        return (SubLObject)module0039.MINUS_ONE_INTEGER;
    }
    
    public static SubLObject f3028(final SubLObject var84, SubLObject var75, SubLObject var72) {
        if (var75 == module0039.UNPROVIDED) {
            var75 = (SubLObject)module0039.ZERO_INTEGER;
        }
        if (var72 == module0039.UNPROVIDED) {
            var72 = Numbers.subtract(Sequences.length(var84), (SubLObject)module0039.ONE_INTEGER);
        }
        SubLObject var85;
        SubLObject var86;
        for (var85 = Numbers.add(Numbers.subtract(var72, var75), (SubLObject)module0039.ONE_INTEGER), var86 = (SubLObject)module0039.NIL, var86 = (SubLObject)module0039.ZERO_INTEGER; var86.numL(var85); var86 = Numbers.add(var86, (SubLObject)module0039.ONE_INTEGER)) {
            if (module0039.NIL == f3029(var84, Numbers.add(var75, var86))) {
                return (SubLObject)module0039.NIL;
            }
        }
        return (SubLObject)module0039.T;
    }
    
    public static SubLObject f3029(final SubLObject var84, final SubLObject var75) {
        return Numbers.numE((SubLObject)module0039.ONE_INTEGER, f3005(var84, var75));
    }
    
    public static SubLObject f3030(final SubLObject var42, SubLObject var75, SubLObject var72) {
        if (var75 == module0039.UNPROVIDED) {
            var75 = (SubLObject)module0039.ZERO_INTEGER;
        }
        if (var72 == module0039.UNPROVIDED) {
            var72 = Numbers.subtract(Sequences.length(var42), (SubLObject)module0039.ONE_INTEGER);
        }
        SubLObject var76;
        SubLObject var77;
        for (var76 = Numbers.add(Numbers.subtract(var72, var75), (SubLObject)module0039.ONE_INTEGER), var77 = (SubLObject)module0039.NIL, var77 = (SubLObject)module0039.ZERO_INTEGER; var77.numL(var76); var77 = Numbers.add(var77, (SubLObject)module0039.ONE_INTEGER)) {
            if (module0039.NIL == f3031(Vectors.aref(var42, Numbers.add(var75, var77)))) {
                return (SubLObject)module0039.NIL;
            }
        }
        return (SubLObject)module0039.T;
    }
    
    public static SubLObject f3031(final SubLObject var88) {
        if (module0039.NIL != f2987(var88)) {
            return Numbers.numLE(var88, (SubLObject)module0039.$ic38$);
        }
        return (SubLObject)module0039.NIL;
    }
    
    public static SubLObject f3032(final SubLObject var84, final SubLObject var75) {
        return Numbers.plusp(f3005(var84, var75));
    }
    
    public static SubLObject f3033(final SubLObject var84, final SubLObject var75) {
        assert module0039.NIL != Types.vectorp(var84) : var84;
        SubLObject var85;
        SubLObject var86;
        for (var85 = Sequences.length(var84), var86 = var75; var86.numL(var85) && Numbers.logand((SubLObject)module0039.$ic74$, Vectors.aref(var84, var86)).numE((SubLObject)module0039.$ic52$); var86 = Numbers.add(var86, (SubLObject)module0039.ONE_INTEGER)) {}
        if (var86.numGE(var85)) {
            return Values.values((SubLObject)module0039.MINUS_ONE_INTEGER, var85);
        }
        return f3022(var84, var86);
    }
    
    public static SubLObject f3034(final SubLObject var84, final SubLObject var75) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0039.NIL != Types.vectorp(var84) : var84;
        final SubLObject var86 = Sequences.length(var84);
        SubLObject var87 = var75;
        if (var87.numGE(var86)) {
            return Values.values((SubLObject)module0039.MINUS_ONE_INTEGER, (SubLObject)module0039.MINUS_ONE_INTEGER);
        }
        while (var87.numGE((SubLObject)module0039.ZERO_INTEGER) && Numbers.logand((SubLObject)module0039.$ic74$, Vectors.aref(var84, var87)).numE((SubLObject)module0039.$ic52$)) {
            var87 = Numbers.subtract(var87, (SubLObject)module0039.ONE_INTEGER);
        }
        if (var87.numL((SubLObject)module0039.ZERO_INTEGER)) {
            return Values.values((SubLObject)module0039.MINUS_ONE_INTEGER, (SubLObject)module0039.MINUS_ONE_INTEGER);
        }
        var85.resetMultipleValues();
        final SubLObject var88 = f3022(var84, var87);
        final SubLObject var89 = var85.secondMultipleValue();
        final SubLObject var29_89 = var85.thirdMultipleValue();
        var85.resetMultipleValues();
        return Values.values(var88, Numbers.subtract(Numbers.subtract(var89, var29_89), (SubLObject)module0039.ONE_INTEGER));
    }
    
    public static SubLObject f3022(final SubLObject var84, final SubLObject var75) {
        final SubLObject var86;
        final SubLObject var85 = var86 = f3005(var84, var75);
        if (var86.eql((SubLObject)module0039.ONE_INTEGER)) {
            return Values.values(Vectors.aref(var84, var75), Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER), var85);
        }
        if (var86.eql((SubLObject)module0039.TWO_INTEGER)) {
            return Values.values(Numbers.add(Numbers.ash(Numbers.logand(Vectors.aref(var84, var75), (SubLObject)module0039.$ic86$), (SubLObject)module0039.SIX_INTEGER), Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER)), (SubLObject)module0039.$ic76$)), Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER), var85);
        }
        if (var86.eql((SubLObject)module0039.THREE_INTEGER)) {
            return Values.values(Numbers.add(Numbers.ash(Numbers.logand(Vectors.aref(var84, var75), (SubLObject)module0039.FIFTEEN_INTEGER), (SubLObject)module0039.TWELVE_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER)), (SubLObject)module0039.$ic76$), (SubLObject)module0039.SIX_INTEGER), Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER)), (SubLObject)module0039.$ic76$)), Numbers.add(var75, (SubLObject)module0039.THREE_INTEGER), var85);
        }
        if (var86.eql((SubLObject)module0039.FOUR_INTEGER)) {
            return Values.values(Numbers.add(new SubLObject[] { Numbers.ash(Numbers.logand(Vectors.aref(var84, var75), (SubLObject)module0039.SEVEN_INTEGER), (SubLObject)module0039.EIGHTEEN_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER)), (SubLObject)module0039.$ic76$), (SubLObject)module0039.TWELVE_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER)), (SubLObject)module0039.$ic76$), (SubLObject)module0039.SIX_INTEGER), Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.THREE_INTEGER)), (SubLObject)module0039.$ic76$) }), Numbers.add(var75, (SubLObject)module0039.FOUR_INTEGER), var85);
        }
        if (var86.eql((SubLObject)module0039.FIVE_INTEGER)) {
            return Values.values(Numbers.add(new SubLObject[] { Numbers.ash(Numbers.logand(Vectors.aref(var84, var75), (SubLObject)module0039.THREE_INTEGER), (SubLObject)module0039.$ic87$), Numbers.ash(Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER)), (SubLObject)module0039.$ic76$), (SubLObject)module0039.EIGHTEEN_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.TWO_INTEGER)), (SubLObject)module0039.$ic76$), (SubLObject)module0039.TWELVE_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.THREE_INTEGER)), (SubLObject)module0039.$ic76$), (SubLObject)module0039.SIX_INTEGER), Numbers.logand(Vectors.aref(var84, Numbers.add(var75, (SubLObject)module0039.FOUR_INTEGER)), (SubLObject)module0039.$ic76$) }), Numbers.add(var75, (SubLObject)module0039.FOUR_INTEGER), var85);
        }
        return Values.values((SubLObject)module0039.MINUS_ONE_INTEGER, Numbers.add(var75, (SubLObject)module0039.ONE_INTEGER), var85);
    }
    
    public static SubLObject f3035(final SubLObject var69, SubLObject var29) {
        if (var29 == module0039.UNPROVIDED) {
            var29 = Sequences.length(var69);
        }
        final SubLObject var70 = Strings.make_string(var29, (SubLObject)module0039.UNPROVIDED);
        SubLObject var71 = var69;
        SubLObject var72;
        for (var72 = (SubLObject)module0039.NIL, var72 = (SubLObject)module0039.ZERO_INTEGER; var72.numL(var29); var72 = Numbers.add(var72, (SubLObject)module0039.ONE_INTEGER)) {
            Vectors.set_aref(var70, var72, var71.first());
            var71 = var71.rest();
        }
        return var70;
    }
    
    public static SubLObject f3036(final SubLObject var42) {
        SubLObject var43 = (SubLObject)module0039.NIL;
        SubLObject var44 = (SubLObject)module0039.NIL;
        try {
            var44 = streams_high.make_private_string_output_stream();
            final SubLObject var45 = (SubLObject)module0039.NIL;
            SubLObject var46;
            SubLObject var47;
            SubLObject var48;
            SubLObject var49;
            SubLObject var50;
            for (var46 = Sequences.length(var42), var47 = (SubLObject)module0039.NIL, var47 = (SubLObject)module0039.ZERO_INTEGER; var47.numL(var46); var47 = Numbers.add(var47, (SubLObject)module0039.ONE_INTEGER)) {
                var48 = ((module0039.NIL != var45) ? Numbers.subtract(var46, var47, (SubLObject)module0039.ONE_INTEGER) : var47);
                var49 = Vectors.aref(var42, var48);
                if (var49.numGE((SubLObject)module0039.$ic63$) && var49.numL((SubLObject)module0039.$ic52$) && module0039.NIL == module0004.f104(var49, (SubLObject)module0039.$ic88$, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED)) {
                    print_high.princ(Characters.code_char(var49), var44);
                }
                else {
                    print_high.princ((SubLObject)module0039.$ic89$, var44);
                    var50 = module0048.f3425(var49);
                    if (Sequences.length(var50).numLE((SubLObject)module0039.ONE_INTEGER)) {
                        print_high.princ((SubLObject)Characters.CHAR_0, var44);
                    }
                    print_high.princ(var50, var44);
                    print_high.princ((SubLObject)Characters.CHAR_semicolon, var44);
                }
            }
            var43 = streams_high.get_output_stream_string(var44);
        }
        finally {
            final SubLObject var51 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0039.T);
                streams_high.close(var44, (SubLObject)module0039.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var51);
            }
        }
        return var43;
    }
    
    public static SubLObject f3037(final SubLObject var93) {
        return f3038(f3001(f3002(var93)));
    }
    
    public static SubLObject f3039(final SubLObject var93) {
        return f3017(f3001(f3002(var93)), (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED);
    }
    
    public static SubLObject f3038(final SubLObject var32) {
        return f3040(f3041(var32));
    }
    
    public static SubLObject f3041(final SubLObject var32) {
        final SubLObject var33 = f3000(var32);
        return f3036(var33);
    }
    
    public static SubLObject f3042(final SubLObject var92) {
        final SubLObject var93 = f3043(var92);
        return (SubLObject)((module0039.NIL != var93) ? f3018(var93, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED) : module0039.NIL);
    }
    
    public static SubLObject f3044(final SubLObject var95) {
        return f3021(f3045(var95));
    }
    
    public static SubLObject f3043(final SubLObject var92) {
        return f3046(f3044(var92));
    }
    
    public static SubLObject f3047(final SubLObject var96) {
        return f3048(f3018(f3043(var96), (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED));
    }
    
    public static SubLObject f3046(final SubLObject var42) {
        SubLObject var43 = (SubLObject)module0039.NIL;
        SubLObject var44 = (SubLObject)module0039.$ic53$;
        SubLObject var45 = (SubLObject)module0039.NIL;
        final SubLObject var46 = (SubLObject)module0039.NIL;
        SubLObject var47;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        SubLObject var10_98;
        SubLObject var10_99;
        SubLObject var10_100;
        SubLObject var52;
        SubLObject var53;
        SubLObject var10_101;
        SubLObject var54;
        SubLObject var55;
        for (var47 = Sequences.length(var42), var48 = (SubLObject)module0039.NIL, var48 = (SubLObject)module0039.ZERO_INTEGER; var48.numL(var47); var48 = Numbers.add(var48, (SubLObject)module0039.ONE_INTEGER)) {
            var49 = ((module0039.NIL != var46) ? Numbers.subtract(var47, var48, (SubLObject)module0039.ONE_INTEGER) : var48);
            var50 = Vectors.aref(var42, var49);
            var51 = var44;
            if (var51.eql((SubLObject)module0039.$ic53$)) {
                var10_98 = var50;
                if (var10_98.eql((SubLObject)module0039.$ic90$)) {
                    var44 = (SubLObject)module0039.$ic91$;
                }
                else if (var10_98.eql((SubLObject)module0039.$ic92$)) {
                    var43 = (SubLObject)ConsesLow.cons(var50, var43);
                    var44 = (SubLObject)module0039.$ic93$;
                }
                else {
                    var43 = (SubLObject)ConsesLow.cons(var50, var43);
                }
            }
            else if (var51.eql((SubLObject)module0039.$ic93$)) {
                var43 = (SubLObject)ConsesLow.cons(var50, var43);
                if (var50.eql((SubLObject)module0039.$ic94$)) {
                    var44 = (SubLObject)module0039.$ic53$;
                }
            }
            else if (var51.eql((SubLObject)module0039.$ic91$)) {
                var45 = (SubLObject)module0039.NIL;
                var10_99 = var50;
                if (var10_99.eql((SubLObject)module0039.$ic95$)) {
                    var44 = (SubLObject)module0039.$ic96$;
                }
                else {
                    var45 = (SubLObject)ConsesLow.cons(var50, var45);
                    var44 = (SubLObject)module0039.$ic97$;
                }
            }
            else if (var51.eql((SubLObject)module0039.$ic96$)) {
                if (var50.numE((SubLObject)module0039.$ic98$)) {
                    var44 = (SubLObject)module0039.$ic99$;
                }
                else {
                    if (!var50.numGE((SubLObject)module0039.$ic100$) || !var50.numLE((SubLObject)module0039.$ic101$)) {
                        return (SubLObject)module0039.NIL;
                    }
                    var44 = (SubLObject)module0039.$ic102$;
                    var45 = (SubLObject)ConsesLow.cons(var50, var45);
                }
            }
            else if (var51.eql((SubLObject)module0039.$ic99$) || var51.eql((SubLObject)module0039.$ic102$)) {
                var10_100 = var50;
                if (var10_100.eql((SubLObject)module0039.$ic103$)) {
                    var52 = f3035(Mapping.mapcar((SubLObject)module0039.$ic104$, Sequences.nreverse(var45)), (SubLObject)module0039.UNPROVIDED);
                    var53 = ((var44 == module0039.$ic99$) ? module0048.f3439(var52) : reader.read_from_string(var52, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED));
                    var43 = (SubLObject)ConsesLow.cons(var53, var43);
                    var44 = (SubLObject)module0039.$ic53$;
                }
                else {
                    var45 = (SubLObject)ConsesLow.cons(var50, var45);
                }
            }
            else if (var51.eql((SubLObject)module0039.$ic97$)) {
                var10_101 = var50;
                if (var10_101.eql((SubLObject)module0039.$ic103$)) {
                    var44 = (SubLObject)module0039.$ic53$;
                    var54 = f3035(Mapping.mapcar((SubLObject)module0039.$ic104$, Sequences.nreverse(var45)), (SubLObject)module0039.UNPROVIDED);
                    var55 = f3049(var54);
                    if (module0039.NIL == var55) {
                        return (SubLObject)module0039.NIL;
                    }
                    var43 = (SubLObject)ConsesLow.cons(var55, var43);
                }
                else {
                    var45 = (SubLObject)ConsesLow.cons(var50, var45);
                }
            }
        }
        if (var44 != module0039.$ic53$) {
            return (SubLObject)module0039.NIL;
        }
        return module0035.f2105(Sequences.nreverse(var43));
    }
    
    public static SubLObject f3048(final SubLObject var106) {
        return module0037.f2586(var106);
    }
    
    public static SubLObject f3045(final SubLObject var95) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = Sequences.find((SubLObject)module0039.$ic105$, var95, Symbols.symbol_function((SubLObject)module0039.$ic106$), Symbols.symbol_function((SubLObject)module0039.$ic107$), (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED);
        if (module0039.NIL == Errors.$ignore_mustsP$.getDynamicValue(var96) && module0039.NIL != var97) {
            Errors.error((SubLObject)module0039.$ic108$, var97, Characters.char_code(var97));
        }
        return f3050(var95);
    }
    
    public static SubLObject f3050(final SubLObject var32) {
        assert module0039.NIL != Types.stringp(var32) : var32;
        final SubLObject var33 = Vectors.make_vector(Sequences.length(var32), (SubLObject)module0039.UNPROVIDED);
        SubLObject var39_108;
        SubLObject var34;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        for (var34 = (var39_108 = Sequences.length(var32)), var35 = (SubLObject)module0039.NIL, var35 = (SubLObject)module0039.ZERO_INTEGER; !var35.numGE(var39_108); var35 = module0048.f_1X(var35)) {
            var36 = Strings.sublisp_char(var32, var35);
            var37 = Characters.char_code(var36);
            Vectors.set_aref(var33, var35, var37);
        }
        return var33;
    }
    
    public static SubLObject f3051(final SubLObject var95) {
        return f3017(f3052(var95), (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED);
    }
    
    public static SubLObject f3052(final SubLObject var95) {
        return f3001(f3021(f3045(var95)));
    }
    
    public static SubLObject f3040(final SubLObject var92) {
        if (module0039.NIL == Sequences.find((SubLObject)Characters.CHAR_ampersand, var92, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED)) {
            return var92;
        }
        final SubLObject var93 = f3042(var92);
        if (module0039.NIL == var93) {
            return (SubLObject)module0039.NIL;
        }
        return f3048(var93);
    }
    
    public static SubLObject f3053(final SubLObject var59) {
        final SubLObject var60 = f3000(var59);
        final SubLObject var61 = (SubLObject)((module0039.NIL != var60) ? f3018(var60, (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED) : module0039.NIL);
        return (SubLObject)((module0039.NIL != var61) ? f3048(var61) : module0039.NIL);
    }
    
    public static SubLObject f3054(final SubLObject var92) {
        return f3052(f3040(var92));
    }
    
    public static SubLObject f3049(final SubLObject var110) {
        return module0035.f2294(module0039.$g942$.getGlobalValue(), var110, Symbols.symbol_function((SubLObject)module0039.EQUAL), (SubLObject)module0039.NIL);
    }
    
    public static SubLObject f3055(final SubLObject var111) {
        return module0035.f2305(module0039.$g942$.getGlobalValue(), var111, Symbols.symbol_function((SubLObject)module0039.EQL), (SubLObject)module0039.NIL);
    }
    
    public static SubLObject f3056(final SubLObject var112, final SubLObject var113) {
        final SubLObject var114 = f3002(var112);
        final SubLObject var115 = Sequences.length(var114);
        final SubLObject var116 = f3002(var113);
        final SubLObject var117 = Sequences.length(var116);
        final SubLObject var118 = Vectors.make_vector(Numbers.add(var115, var117), (SubLObject)module0039.UNPROVIDED);
        SubLObject var119 = var114;
        SubLObject var120 = (SubLObject)module0039.NIL;
        SubLObject var121;
        SubLObject var122;
        SubLObject var123;
        SubLObject var124;
        for (var121 = Sequences.length(var119), var122 = (SubLObject)module0039.NIL, var122 = (SubLObject)module0039.ZERO_INTEGER; var122.numL(var121); var122 = Numbers.add(var122, (SubLObject)module0039.ONE_INTEGER)) {
            var123 = ((module0039.NIL != var120) ? Numbers.subtract(var121, var122, (SubLObject)module0039.ONE_INTEGER) : var122);
            var124 = Vectors.aref(var119, var123);
            Vectors.set_aref(var118, var123, var124);
        }
        var119 = var116;
        var120 = (SubLObject)module0039.NIL;
        SubLObject var125;
        for (var121 = Sequences.length(var119), var122 = (SubLObject)module0039.NIL, var122 = (SubLObject)module0039.ZERO_INTEGER; var122.numL(var121); var122 = Numbers.add(var122, (SubLObject)module0039.ONE_INTEGER)) {
            var123 = ((module0039.NIL != var120) ? Numbers.subtract(var121, var122, (SubLObject)module0039.ONE_INTEGER) : var122);
            var124 = Vectors.aref(var119, var123);
            var125 = Numbers.add(var123, var115);
            Vectors.set_aref(var118, var125, var124);
        }
        return f2998(var118);
    }
    
    public static SubLObject f3057(final SubLObject var16, final SubLObject var2) {
        return f3058(var16, var2);
    }
    
    public static SubLObject f3058(final SubLObject var88, final SubLObject var2) {
        module0021.f1086(module0039.$g943$.getGlobalValue(), var2);
        final SubLObject var89 = f3025(f2981(var88));
        final SubLObject var90 = Sequences.length(var89);
        module0021.f1038(var90, var2);
        SubLObject var91;
        for (var91 = (SubLObject)module0039.NIL, var91 = (SubLObject)module0039.ZERO_INTEGER; var91.numL(var90); var91 = Numbers.add(var91, (SubLObject)module0039.ONE_INTEGER)) {
            module0021.f1086(Vectors.aref(var89, var91), var2);
        }
        return var88;
    }
    
    public static SubLObject f3059(final SubLObject var2) {
        final SubLObject var3 = module0021.f1090(var2);
        SubLObject var4 = (SubLObject)module0039.NIL;
        SubLObject var5 = (SubLObject)module0039.NIL;
        var4 = Vectors.make_vector(var3, (SubLObject)module0039.UNPROVIDED);
        SubLObject var6;
        SubLObject var7;
        for (var6 = (SubLObject)module0039.NIL, var6 = (SubLObject)module0039.ZERO_INTEGER; var6.numL(var3); var6 = Numbers.add(var6, (SubLObject)module0039.ONE_INTEGER)) {
            var7 = module0021.f1092(var2);
            if (module0039.NIL != module0048.f3285(var7)) {
                Vectors.set_aref(var4, var6, var7);
            }
            else {
                Errors.error((SubLObject)module0039.$ic114$, var3, Numbers.add(var6, (SubLObject)module0039.ONE_INTEGER));
            }
        }
        final SubLObject var8 = f3022(var4, (SubLObject)module0039.ZERO_INTEGER);
        var5 = f2986(var8);
        return var5;
    }
    
    public static SubLObject f3060(final SubLObject var16, final SubLObject var2) {
        return f3061(var16, var2);
    }
    
    public static SubLObject f3061(final SubLObject var93, final SubLObject var2) {
        module0021.f1086(module0039.$g944$.getGlobalValue(), var2);
        final SubLObject var94 = f3018(f2993(var93), (SubLObject)module0039.UNPROVIDED, (SubLObject)module0039.UNPROVIDED);
        final SubLObject var95 = Sequences.length(var94);
        module0021.f1038(var95, var2);
        SubLObject var96;
        for (var96 = (SubLObject)module0039.NIL, var96 = (SubLObject)module0039.ZERO_INTEGER; var96.numL(var95); var96 = Numbers.add(var96, (SubLObject)module0039.ONE_INTEGER)) {
            module0021.f1086(Vectors.aref(var94, var96), var2);
        }
        return var93;
    }
    
    public static SubLObject f3062(final SubLObject var2) {
        final SubLObject var3 = module0021.f1090(var2);
        SubLObject var4 = (SubLObject)module0039.NIL;
        SubLObject var5 = (SubLObject)module0039.NIL;
        var4 = Vectors.make_vector(var3, (SubLObject)module0039.UNPROVIDED);
        SubLObject var6;
        SubLObject var7;
        for (var6 = (SubLObject)module0039.NIL, var6 = (SubLObject)module0039.ZERO_INTEGER; var6.numL(var3); var6 = Numbers.add(var6, (SubLObject)module0039.ONE_INTEGER)) {
            var7 = module0021.f1092(var2);
            if (module0039.NIL != module0048.f3285(var7)) {
                Vectors.set_aref(var4, var6, var7);
            }
            else {
                Errors.error((SubLObject)module0039.$ic114$, var3, Numbers.add(var6, (SubLObject)module0039.ONE_INTEGER));
            }
        }
        final SubLObject var8 = f3021(var4);
        var5 = f2998(var8);
        return var5;
    }
    
    public static SubLObject f3063() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2978", "S#4346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2980", "S#4338", 1, 0, false);
        new $f2980$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2981", "S#4347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2982", "S#4348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2983", "S#4349", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2984", "S#4350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2985", "S#4351", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2986", "S#4352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2979", "S#4353", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2988", "S#4354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2989", "S#4355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2990", "S#4356", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2992", "S#4340", 1, 0, false);
        new $f2992$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2993", "S#4357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2994", "S#4358", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2995", "S#4359", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2996", "S#4360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2997", "S#4361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2998", "S#4362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2991", "S#4363", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3002", "S#4364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3003", "S#4365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2999", "S#4366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3004", "S#4367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3006", "S#4368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3008", "S#3946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3009", "S#4369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3010", "S#3950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3011", "S#4370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3007", "S#4371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3012", "S#4372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3013", "S#4373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3014", "S#4374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3015", "S#4375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3000", "S#4376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3017", "S#4377", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3001", "UNICODE-VECTOR-TO-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3016", "S#4378", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3018", "S#3948", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3021", "S#4379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3023", "S#4380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3024", "S#4381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f2987", "S#4382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3019", "S#4383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3025", "S#4384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3026", "S#4385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3020", "S#4386", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3005", "S#4387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3027", "S#4388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3028", "S#4389", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3029", "S#4390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3030", "S#4391", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3031", "S#4392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3032", "S#4393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3033", "S#4394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3034", "S#4395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3022", "S#4396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3035", "S#4397", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3036", "S#4398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3037", "S#4399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3039", "S#4400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3038", "S#4401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3041", "S#4402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3042", "S#4403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3044", "S#3949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3043", "HTML-ESCAPED-TO-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3047", "S#4404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3046", "S#4405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3048", "S#3947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3045", "S#4406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3050", "S#4407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3051", "S#4408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3052", "S#4409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3040", "S#4410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3053", "S#4411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3054", "S#4412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3049", "S#4413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3055", "S#4414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3056", "S#4415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3057", "S#4416", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3058", "S#4417", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3059", "S#4418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3060", "S#4419", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3061", "S#4420", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0039", "f3062", "S#4421", 1, 0, false);
        return (SubLObject)module0039.NIL;
    }
    
    public static SubLObject f3064() {
        module0039.$g937$ = SubLFiles.defconstant("S#4422", (SubLObject)module0039.$ic0$);
        module0039.$g938$ = SubLFiles.defconstant("S#4423", (SubLObject)module0039.$ic1$);
        module0039.$g939$ = SubLFiles.defconstant("S#4424", (SubLObject)module0039.$ic22$);
        module0039.$g940$ = SubLFiles.deflexical("S#4425", (SubLObject)Characters.CHAR_tilde);
        module0039.$g941$ = SubLFiles.defparameter("S#4426", (SubLObject)module0039.$ic59$);
        module0039.$g942$ = SubLFiles.deflexical("S#4427", module0039.$ic110$);
        module0039.$g943$ = SubLFiles.defconstant("S#4428", (SubLObject)module0039.$ic111$);
        module0039.$g944$ = SubLFiles.defconstant("S#4429", (SubLObject)module0039.$ic115$);
        return (SubLObject)module0039.NIL;
    }
    
    public static SubLObject f3065() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0039.$g938$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0039.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0039.$ic9$);
        Structures.def_csetf((SubLObject)module0039.$ic10$, (SubLObject)module0039.$ic11$);
        Equality.identity((SubLObject)module0039.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0039.$g938$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0039.$ic18$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0039.$g939$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0039.$ic29$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0039.$ic30$);
        Structures.def_csetf((SubLObject)module0039.$ic31$, (SubLObject)module0039.$ic32$);
        Equality.identity((SubLObject)module0039.$ic22$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0039.$g939$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0039.$ic35$));
        module0027.f1449((SubLObject)module0039.$ic39$, (SubLObject)ConsesLow.list(new SubLObject[] { module0039.$ic40$, Symbols.symbol_function((SubLObject)module0039.EQUAL), module0039.$ic41$, module0039.NIL, module0039.$ic42$, module0039.NIL, module0039.$ic43$, module0039.$ic44$, module0039.$ic45$, module0039.T }), (SubLObject)module0039.$ic46$);
        module0021.f1098(module0039.$g943$.getGlobalValue(), (SubLObject)module0039.$ic112$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0039.$g938$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0039.$ic113$));
        module0021.f1098(module0039.$g944$.getGlobalValue(), (SubLObject)module0039.$ic116$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0039.$g939$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0039.$ic117$));
        return (SubLObject)module0039.NIL;
    }
    
    private static SubLObject _constant_110_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("AElig"), (SubLObject)SubLObjectFactory.makeInteger(198)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Aacute"), (SubLObject)SubLObjectFactory.makeInteger(193)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Acirc"), (SubLObject)SubLObjectFactory.makeInteger(194)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Agrave"), (SubLObject)SubLObjectFactory.makeInteger(192)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Alpha"), (SubLObject)SubLObjectFactory.makeInteger(913)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Aring"), (SubLObject)SubLObjectFactory.makeInteger(197)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Atilde"), (SubLObject)SubLObjectFactory.makeInteger(195)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Auml"), (SubLObject)SubLObjectFactory.makeInteger(196)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Beta"), (SubLObject)SubLObjectFactory.makeInteger(914)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ccedil"), (SubLObject)SubLObjectFactory.makeInteger(199)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Chi"), (SubLObject)SubLObjectFactory.makeInteger(935)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Dagger"), (SubLObject)SubLObjectFactory.makeInteger(8225)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Delta"), (SubLObject)SubLObjectFactory.makeInteger(916)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ETH"), (SubLObject)SubLObjectFactory.makeInteger(208)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Eacute"), (SubLObject)SubLObjectFactory.makeInteger(201)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ecirc"), (SubLObject)SubLObjectFactory.makeInteger(202)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Egrave"), (SubLObject)SubLObjectFactory.makeInteger(200)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Epsilon"), (SubLObject)SubLObjectFactory.makeInteger(917)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Eta"), (SubLObject)SubLObjectFactory.makeInteger(919)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Euml"), (SubLObject)SubLObjectFactory.makeInteger(203)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Gamma"), (SubLObject)SubLObjectFactory.makeInteger(915)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Iacute"), (SubLObject)SubLObjectFactory.makeInteger(205)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Icirc"), (SubLObject)SubLObjectFactory.makeInteger(206)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Igrave"), (SubLObject)SubLObjectFactory.makeInteger(204)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Iota"), (SubLObject)SubLObjectFactory.makeInteger(921)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Iuml"), (SubLObject)SubLObjectFactory.makeInteger(207)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Kappa"), (SubLObject)SubLObjectFactory.makeInteger(922)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Lambda"), (SubLObject)SubLObjectFactory.makeInteger(923)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Mu"), (SubLObject)SubLObjectFactory.makeInteger(924)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ntilde"), (SubLObject)SubLObjectFactory.makeInteger(209)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Nu"), (SubLObject)SubLObjectFactory.makeInteger(925)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("OElig"), (SubLObject)SubLObjectFactory.makeInteger(338)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Oacute"), (SubLObject)SubLObjectFactory.makeInteger(211)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ocirc"), (SubLObject)SubLObjectFactory.makeInteger(212)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ograve"), (SubLObject)SubLObjectFactory.makeInteger(210)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Omega"), (SubLObject)SubLObjectFactory.makeInteger(937)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Omicron"), (SubLObject)SubLObjectFactory.makeInteger(927)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Oslash"), (SubLObject)SubLObjectFactory.makeInteger(216)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Otilde"), (SubLObject)SubLObjectFactory.makeInteger(213)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ouml"), (SubLObject)SubLObjectFactory.makeInteger(214)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Phi"), (SubLObject)SubLObjectFactory.makeInteger(934)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Pi"), (SubLObject)SubLObjectFactory.makeInteger(928)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Prime"), (SubLObject)SubLObjectFactory.makeInteger(8243)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Psi"), (SubLObject)SubLObjectFactory.makeInteger(936)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Rho"), (SubLObject)SubLObjectFactory.makeInteger(929)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Scaron"), (SubLObject)SubLObjectFactory.makeInteger(352)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Sigma"), (SubLObject)SubLObjectFactory.makeInteger(931)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("THORN"), (SubLObject)SubLObjectFactory.makeInteger(222)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Tau"), (SubLObject)SubLObjectFactory.makeInteger(932)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Theta"), (SubLObject)SubLObjectFactory.makeInteger(920)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Uacute"), (SubLObject)SubLObjectFactory.makeInteger(218)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ucirc"), (SubLObject)SubLObjectFactory.makeInteger(219)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ugrave"), (SubLObject)SubLObjectFactory.makeInteger(217)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Upsilon"), (SubLObject)SubLObjectFactory.makeInteger(933)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Uuml"), (SubLObject)SubLObjectFactory.makeInteger(220)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Xi"), (SubLObject)SubLObjectFactory.makeInteger(926)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Yacute"), (SubLObject)SubLObjectFactory.makeInteger(221)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Yuml"), (SubLObject)SubLObjectFactory.makeInteger(376)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Zeta"), (SubLObject)SubLObjectFactory.makeInteger(918)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("aacute"), (SubLObject)SubLObjectFactory.makeInteger(225)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("acirc"), (SubLObject)SubLObjectFactory.makeInteger(226)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("acute"), (SubLObject)SubLObjectFactory.makeInteger(180)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("aelig"), (SubLObject)SubLObjectFactory.makeInteger(230)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("agrave"), (SubLObject)SubLObjectFactory.makeInteger(224)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("alefsym"), (SubLObject)SubLObjectFactory.makeInteger(8501)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("alpha"), (SubLObject)SubLObjectFactory.makeInteger(945)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("amp"), (SubLObject)SubLObjectFactory.makeInteger(38)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("and"), (SubLObject)SubLObjectFactory.makeInteger(8743)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ang"), (SubLObject)SubLObjectFactory.makeInteger(8736)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("aring"), (SubLObject)SubLObjectFactory.makeInteger(229)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("asymp"), (SubLObject)SubLObjectFactory.makeInteger(8776)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("atilde"), (SubLObject)SubLObjectFactory.makeInteger(227)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("auml"), (SubLObject)SubLObjectFactory.makeInteger(228)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bdquo"), (SubLObject)SubLObjectFactory.makeInteger(8222)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("beta"), (SubLObject)SubLObjectFactory.makeInteger(946)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("brvbar"), (SubLObject)SubLObjectFactory.makeInteger(166)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bull"), (SubLObject)SubLObjectFactory.makeInteger(8226)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cap"), (SubLObject)SubLObjectFactory.makeInteger(8745)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ccedil"), (SubLObject)SubLObjectFactory.makeInteger(231)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cedil"), (SubLObject)SubLObjectFactory.makeInteger(184)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cent"), (SubLObject)SubLObjectFactory.makeInteger(162)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("chi"), (SubLObject)SubLObjectFactory.makeInteger(967)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("circ"), (SubLObject)SubLObjectFactory.makeInteger(710)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("clubs"), (SubLObject)SubLObjectFactory.makeInteger(9827)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cong"), (SubLObject)SubLObjectFactory.makeInteger(8773)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("copy"), (SubLObject)SubLObjectFactory.makeInteger(169)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("crarr"), (SubLObject)SubLObjectFactory.makeInteger(8629)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cup"), (SubLObject)SubLObjectFactory.makeInteger(8746)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("curren"), (SubLObject)SubLObjectFactory.makeInteger(164)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("dArr"), (SubLObject)SubLObjectFactory.makeInteger(8659)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("dagger"), (SubLObject)SubLObjectFactory.makeInteger(8224)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("darr"), (SubLObject)SubLObjectFactory.makeInteger(8595)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("deg"), (SubLObject)SubLObjectFactory.makeInteger(176)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("delta"), (SubLObject)SubLObjectFactory.makeInteger(948)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("diams"), (SubLObject)SubLObjectFactory.makeInteger(9830)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("divide"), (SubLObject)SubLObjectFactory.makeInteger(247)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eacute"), (SubLObject)SubLObjectFactory.makeInteger(233)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ecirc"), (SubLObject)SubLObjectFactory.makeInteger(234)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("egrave"), (SubLObject)SubLObjectFactory.makeInteger(232)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("empty"), (SubLObject)SubLObjectFactory.makeInteger(8709)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("emsp"), (SubLObject)SubLObjectFactory.makeInteger(8195)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ensp"), (SubLObject)SubLObjectFactory.makeInteger(8194)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("epsilon"), (SubLObject)SubLObjectFactory.makeInteger(949)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("equiv"), (SubLObject)SubLObjectFactory.makeInteger(8801)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eta"), (SubLObject)SubLObjectFactory.makeInteger(951)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eth"), (SubLObject)SubLObjectFactory.makeInteger(240)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("euml"), (SubLObject)SubLObjectFactory.makeInteger(235)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("euro"), (SubLObject)SubLObjectFactory.makeInteger(8364)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("exist"), (SubLObject)SubLObjectFactory.makeInteger(8707)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("fnof"), (SubLObject)SubLObjectFactory.makeInteger(402)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("forall"), (SubLObject)SubLObjectFactory.makeInteger(8704)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frac12"), (SubLObject)SubLObjectFactory.makeInteger(189)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frac14"), (SubLObject)SubLObjectFactory.makeInteger(188)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frac34"), (SubLObject)SubLObjectFactory.makeInteger(190)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frasl"), (SubLObject)SubLObjectFactory.makeInteger(8260)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("gamma"), (SubLObject)SubLObjectFactory.makeInteger(947)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ge"), (SubLObject)SubLObjectFactory.makeInteger(8805)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("gt"), (SubLObject)SubLObjectFactory.makeInteger(62)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("hArr"), (SubLObject)SubLObjectFactory.makeInteger(8660)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("harr"), (SubLObject)SubLObjectFactory.makeInteger(8596)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("hearts"), (SubLObject)SubLObjectFactory.makeInteger(9829)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("hellip"), (SubLObject)SubLObjectFactory.makeInteger(8230)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iacute"), (SubLObject)SubLObjectFactory.makeInteger(237)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("icirc"), (SubLObject)SubLObjectFactory.makeInteger(238)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iexcl"), (SubLObject)SubLObjectFactory.makeInteger(161)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("igrave"), (SubLObject)SubLObjectFactory.makeInteger(236)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("image"), (SubLObject)SubLObjectFactory.makeInteger(8465)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("infin"), (SubLObject)SubLObjectFactory.makeInteger(8734)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("int"), (SubLObject)SubLObjectFactory.makeInteger(8747)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iota"), (SubLObject)SubLObjectFactory.makeInteger(953)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iquest"), (SubLObject)SubLObjectFactory.makeInteger(191)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("isin"), (SubLObject)SubLObjectFactory.makeInteger(8712)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iuml"), (SubLObject)SubLObjectFactory.makeInteger(239)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("kappa"), (SubLObject)SubLObjectFactory.makeInteger(954)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lArr"), (SubLObject)SubLObjectFactory.makeInteger(8656)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lambda"), (SubLObject)SubLObjectFactory.makeInteger(955)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lang"), (SubLObject)SubLObjectFactory.makeInteger(9001)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("laquo"), (SubLObject)SubLObjectFactory.makeInteger(171)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("larr"), (SubLObject)SubLObjectFactory.makeInteger(8592)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lceil"), (SubLObject)SubLObjectFactory.makeInteger(8968)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ldquo"), (SubLObject)SubLObjectFactory.makeInteger(8220)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("le"), (SubLObject)SubLObjectFactory.makeInteger(8804)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lfloor"), (SubLObject)SubLObjectFactory.makeInteger(8970)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lowast"), (SubLObject)SubLObjectFactory.makeInteger(8727)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("loz"), (SubLObject)SubLObjectFactory.makeInteger(9674)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lrm"), (SubLObject)SubLObjectFactory.makeInteger(8206)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lsaquo"), (SubLObject)SubLObjectFactory.makeInteger(8249)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lsquo"), (SubLObject)SubLObjectFactory.makeInteger(8216)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lt"), (SubLObject)SubLObjectFactory.makeInteger(60)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("macr"), (SubLObject)SubLObjectFactory.makeInteger(175)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("mdash"), (SubLObject)SubLObjectFactory.makeInteger(8212)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("micro"), (SubLObject)SubLObjectFactory.makeInteger(181)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("middot"), (SubLObject)SubLObjectFactory.makeInteger(183)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("minus"), (SubLObject)SubLObjectFactory.makeInteger(8722)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("mu"), (SubLObject)SubLObjectFactory.makeInteger(956)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nabla"), (SubLObject)SubLObjectFactory.makeInteger(8711)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nbsp"), (SubLObject)SubLObjectFactory.makeInteger(160)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ndash"), (SubLObject)SubLObjectFactory.makeInteger(8211)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ne"), (SubLObject)SubLObjectFactory.makeInteger(8800)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ni"), (SubLObject)SubLObjectFactory.makeInteger(8715)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("not"), (SubLObject)SubLObjectFactory.makeInteger(172)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("notin"), (SubLObject)SubLObjectFactory.makeInteger(8713)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nsub"), (SubLObject)SubLObjectFactory.makeInteger(8836)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ntilde"), (SubLObject)SubLObjectFactory.makeInteger(241)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nu"), (SubLObject)SubLObjectFactory.makeInteger(957)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oacute"), (SubLObject)SubLObjectFactory.makeInteger(243)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ocirc"), (SubLObject)SubLObjectFactory.makeInteger(244)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oelig"), (SubLObject)SubLObjectFactory.makeInteger(339)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ograve"), (SubLObject)SubLObjectFactory.makeInteger(242)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oline"), (SubLObject)SubLObjectFactory.makeInteger(8254)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("omega"), (SubLObject)SubLObjectFactory.makeInteger(969)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("omicron"), (SubLObject)SubLObjectFactory.makeInteger(959)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oplus"), (SubLObject)SubLObjectFactory.makeInteger(8853)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("or"), (SubLObject)SubLObjectFactory.makeInteger(8744)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ordf"), (SubLObject)SubLObjectFactory.makeInteger(170)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ordm"), (SubLObject)SubLObjectFactory.makeInteger(186)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oslash"), (SubLObject)SubLObjectFactory.makeInteger(248)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("otilde"), (SubLObject)SubLObjectFactory.makeInteger(245)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("otimes"), (SubLObject)SubLObjectFactory.makeInteger(8855)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ouml"), (SubLObject)SubLObjectFactory.makeInteger(246)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("para"), (SubLObject)SubLObjectFactory.makeInteger(182)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("part"), (SubLObject)SubLObjectFactory.makeInteger(8706)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("permil"), (SubLObject)SubLObjectFactory.makeInteger(8240)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("perp"), (SubLObject)SubLObjectFactory.makeInteger(8869)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("phi"), (SubLObject)SubLObjectFactory.makeInteger(966)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("pi"), (SubLObject)SubLObjectFactory.makeInteger(960)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("piv"), (SubLObject)SubLObjectFactory.makeInteger(982)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("plusmn"), (SubLObject)SubLObjectFactory.makeInteger(177)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("pound"), (SubLObject)SubLObjectFactory.makeInteger(163)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("prime"), (SubLObject)SubLObjectFactory.makeInteger(8242)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("prod"), (SubLObject)SubLObjectFactory.makeInteger(8719)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("prop"), (SubLObject)SubLObjectFactory.makeInteger(8733)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("psi"), (SubLObject)SubLObjectFactory.makeInteger(968)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("quot"), (SubLObject)SubLObjectFactory.makeInteger(34)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rArr"), (SubLObject)SubLObjectFactory.makeInteger(8658)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("radic"), (SubLObject)SubLObjectFactory.makeInteger(8730)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rang"), (SubLObject)SubLObjectFactory.makeInteger(9002)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("raquo"), (SubLObject)SubLObjectFactory.makeInteger(187)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rarr"), (SubLObject)SubLObjectFactory.makeInteger(8594)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rceil"), (SubLObject)SubLObjectFactory.makeInteger(8969)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdquo"), (SubLObject)SubLObjectFactory.makeInteger(8221)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("real"), (SubLObject)SubLObjectFactory.makeInteger(8476)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("reg"), (SubLObject)SubLObjectFactory.makeInteger(174)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rfloor"), (SubLObject)SubLObjectFactory.makeInteger(8971)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rho"), (SubLObject)SubLObjectFactory.makeInteger(961)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rlm"), (SubLObject)SubLObjectFactory.makeInteger(8207)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rsaquo"), (SubLObject)SubLObjectFactory.makeInteger(8250)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rsquo"), (SubLObject)SubLObjectFactory.makeInteger(8217)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sbquo"), (SubLObject)SubLObjectFactory.makeInteger(8218)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("scaron"), (SubLObject)SubLObjectFactory.makeInteger(353)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sdot"), (SubLObject)SubLObjectFactory.makeInteger(8901)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sect"), (SubLObject)SubLObjectFactory.makeInteger(167)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("shy"), (SubLObject)SubLObjectFactory.makeInteger(173)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sigma"), (SubLObject)SubLObjectFactory.makeInteger(963)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sigmaf"), (SubLObject)SubLObjectFactory.makeInteger(962)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sim"), (SubLObject)SubLObjectFactory.makeInteger(8764)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("spades"), (SubLObject)SubLObjectFactory.makeInteger(9824)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sub"), (SubLObject)SubLObjectFactory.makeInteger(8834)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sube"), (SubLObject)SubLObjectFactory.makeInteger(8838)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sum"), (SubLObject)SubLObjectFactory.makeInteger(8721)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup"), (SubLObject)SubLObjectFactory.makeInteger(8835)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup1"), (SubLObject)SubLObjectFactory.makeInteger(185)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup2"), (SubLObject)SubLObjectFactory.makeInteger(178)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup3"), (SubLObject)SubLObjectFactory.makeInteger(179)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("supe"), (SubLObject)SubLObjectFactory.makeInteger(8839)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("szlig"), (SubLObject)SubLObjectFactory.makeInteger(223)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("tau"), (SubLObject)SubLObjectFactory.makeInteger(964)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("there4"), (SubLObject)SubLObjectFactory.makeInteger(8756)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("theta"), (SubLObject)SubLObjectFactory.makeInteger(952)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("thetasym"), (SubLObject)SubLObjectFactory.makeInteger(977)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("thinsp"), (SubLObject)SubLObjectFactory.makeInteger(8201)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("thorn"), (SubLObject)SubLObjectFactory.makeInteger(254)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("tilde"), (SubLObject)SubLObjectFactory.makeInteger(732)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("times"), (SubLObject)SubLObjectFactory.makeInteger(215)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("trade"), (SubLObject)SubLObjectFactory.makeInteger(8482)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uArr"), (SubLObject)SubLObjectFactory.makeInteger(8657)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uacute"), (SubLObject)SubLObjectFactory.makeInteger(250)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uarr"), (SubLObject)SubLObjectFactory.makeInteger(8593)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ucirc"), (SubLObject)SubLObjectFactory.makeInteger(251)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ugrave"), (SubLObject)SubLObjectFactory.makeInteger(249)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uml"), (SubLObject)SubLObjectFactory.makeInteger(168)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("upsih"), (SubLObject)SubLObjectFactory.makeInteger(978)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("upsilon"), (SubLObject)SubLObjectFactory.makeInteger(965)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uuml"), (SubLObject)SubLObjectFactory.makeInteger(252)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("weierp"), (SubLObject)SubLObjectFactory.makeInteger(8472)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xi"), (SubLObject)SubLObjectFactory.makeInteger(958)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("yacute"), (SubLObject)SubLObjectFactory.makeInteger(253)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("yen"), (SubLObject)SubLObjectFactory.makeInteger(165)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("yuml"), (SubLObject)SubLObjectFactory.makeInteger(255)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zeta"), (SubLObject)SubLObjectFactory.makeInteger(950)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwj"), (SubLObject)SubLObjectFactory.makeInteger(8205)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwnj"), (SubLObject)SubLObjectFactory.makeInteger(8204)) });
    }
    
    public void declareFunctions() {
        f3063();
    }
    
    public void initializeVariables() {
        f3064();
    }
    
    public void runTopLevelForms() {
        f3065();
    }
    
    static {
        me = (SubLFile)new module0039();
        module0039.$g937$ = null;
        module0039.$g938$ = null;
        module0039.$g939$ = null;
        module0039.$g940$ = null;
        module0039.$g941$ = null;
        module0039.$g942$ = null;
        module0039.$g943$ = null;
        module0039.$g944$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(1114111);
        $ic1$ = SubLObjectFactory.makeSymbol("S#4337", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#4338", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4430", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UCHAR"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4347", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4348", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#4353", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#4346", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#4338", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#4347", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#4348", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("UCHAR");
        $ic13$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic14$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic15$ = SubLObjectFactory.makeSymbol("S#4349", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic17$ = SubLObjectFactory.makeKeyword("END");
        $ic18$ = SubLObjectFactory.makeSymbol("S#4351", "CYC");
        $ic19$ = SubLObjectFactory.makeString("#u~x");
        $ic20$ = SubLObjectFactory.makeString("#u0~x");
        $ic21$ = SubLObjectFactory.makeSymbol("S#4382", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#4339", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#4340", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4431", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VECT"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4357", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4358", "CYC"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#4363", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#4356", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#4340", "CYC"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#4357", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#4358", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("VECT");
        $ic34$ = SubLObjectFactory.makeSymbol("S#4359", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#4361", "CYC");
        $ic36$ = SubLObjectFactory.makeString("#u\"~a\"");
        $ic37$ = SubLObjectFactory.makeSymbol("S#4366", "CYC");
        $ic38$ = SubLObjectFactory.makeInteger(127);
        $ic39$ = SubLObjectFactory.makeSymbol("S#4372", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("TEST");
        $ic41$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic42$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic43$ = SubLObjectFactory.makeKeyword("KB");
        $ic44$ = SubLObjectFactory.makeKeyword("TINY");
        $ic45$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo &bar; bam")), (SubLObject)module0039.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&#x2014;J")), (SubLObject)module0039.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&J")), (SubLObject)module0039.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&amp;J")), (SubLObject)module0039.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&#151;J")), (SubLObject)module0039.T));
        $ic47$ = SubLObjectFactory.makeKeyword("HTML-ESCAPED-ASCII");
        $ic48$ = SubLObjectFactory.makeKeyword("ESCAPED-PROBABLY-UTF8");
        $ic49$ = SubLObjectFactory.makeKeyword("SUBL-STRING");
        $ic50$ = SubLObjectFactory.makeKeyword("PROBABLY-UTF8");
        $ic51$ = SubLObjectFactory.makeKeyword("UNK");
        $ic52$ = SubLObjectFactory.makeInteger(128);
        $ic53$ = SubLObjectFactory.makeKeyword("OPEN");
        $ic54$ = SubLObjectFactory.makeKeyword("START-UNICODE");
        $ic55$ = SubLObjectFactory.makeKeyword("UNICODE-CHAR");
        $ic56$ = SubLObjectFactory.makeKeyword("UNICDE-CHAR");
        $ic57$ = SubLObjectFactory.makeSymbol("S#4375", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#4369", "CYC");
        $ic59$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(183), (SubLObject)SubLObjectFactory.makeInteger(42)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(192), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(193), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(194), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(195), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(196), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(197), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(200), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(201), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(202), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(203), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(204), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(205), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(206), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(207), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(209), (SubLObject)SubLObjectFactory.makeInteger(78)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(210), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(211), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(213), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(214), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(216), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(217), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(218), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(219), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(220), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(221), (SubLObject)SubLObjectFactory.makeInteger(89)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(224), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(225), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(226), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(227), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(228), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(229), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(231), (SubLObject)SubLObjectFactory.makeInteger(99)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(232), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(233), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(234), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(235), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(236), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(237), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(238), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(239), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(240), (SubLObject)SubLObjectFactory.makeInteger(100)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(241), (SubLObject)SubLObjectFactory.makeInteger(110)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(242), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(243), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(244), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(245), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(246), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(248), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(249), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(250), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(251), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(252), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(253), (SubLObject)SubLObjectFactory.makeInteger(121)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(255), (SubLObject)SubLObjectFactory.makeInteger(121)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(323), (SubLObject)SubLObjectFactory.makeInteger(110)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(324), (SubLObject)SubLObjectFactory.makeInteger(110)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(8217), (SubLObject)SubLObjectFactory.makeInteger(39)) });
        $ic60$ = SubLObjectFactory.makeString("\\\"");
        $ic61$ = SubLObjectFactory.makeString("\\\\");
        $ic62$ = SubLObjectFactory.makeString("&u26;");
        $ic63$ = SubLObjectFactory.makeInteger(32);
        $ic64$ = SubLObjectFactory.makeString("0");
        $ic65$ = SubLObjectFactory.makeString("&u~A;");
        $ic66$ = SubLObjectFactory.makeSymbol("S#4367", "CYC");
        $ic67$ = SubLObjectFactory.makeInteger(2047);
        $ic68$ = SubLObjectFactory.makeInteger(65535);
        $ic69$ = SubLObjectFactory.makeInteger(2097151);
        $ic70$ = SubLObjectFactory.makeInteger(67108863);
        $ic71$ = SubLObjectFactory.makeString("#(");
        $ic72$ = SubLObjectFactory.makeString("#x~x ");
        $ic73$ = SubLObjectFactory.makeString(")~%");
        $ic74$ = SubLObjectFactory.makeInteger(192);
        $ic75$ = SubLObjectFactory.makeInteger(-6);
        $ic76$ = SubLObjectFactory.makeInteger(63);
        $ic77$ = SubLObjectFactory.makeInteger(224);
        $ic78$ = SubLObjectFactory.makeInteger(-12);
        $ic79$ = SubLObjectFactory.makeInteger(240);
        $ic80$ = SubLObjectFactory.makeInteger(-18);
        $ic81$ = SubLObjectFactory.makeInteger(248);
        $ic82$ = SubLObjectFactory.makeInteger(-24);
        $ic83$ = SubLObjectFactory.makeInteger(193);
        $ic84$ = SubLObjectFactory.makeInteger(245);
        $ic85$ = SubLObjectFactory.makeSymbol("VECTORP");
        $ic86$ = SubLObjectFactory.makeInteger(31);
        $ic87$ = SubLObjectFactory.makeInteger(24);
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(38), (SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)SubLObjectFactory.makeInteger(60), (SubLObject)SubLObjectFactory.makeInteger(62));
        $ic89$ = SubLObjectFactory.makeString("&#x");
        $ic90$ = SubLObjectFactory.makeInteger(38);
        $ic91$ = SubLObjectFactory.makeKeyword("START-HTML-ESCAPE");
        $ic92$ = SubLObjectFactory.makeInteger(60);
        $ic93$ = SubLObjectFactory.makeKeyword("INSIDE-TAG");
        $ic94$ = SubLObjectFactory.makeInteger(62);
        $ic95$ = SubLObjectFactory.makeInteger(35);
        $ic96$ = SubLObjectFactory.makeKeyword("HTML-NUMERIC-ESCAPE-START");
        $ic97$ = SubLObjectFactory.makeKeyword("ENTITY-ESCAPE");
        $ic98$ = SubLObjectFactory.makeInteger(120);
        $ic99$ = SubLObjectFactory.makeKeyword("HTML-HEXADECIMAL-ESCAPE");
        $ic100$ = SubLObjectFactory.makeInteger(48);
        $ic101$ = SubLObjectFactory.makeInteger(57);
        $ic102$ = SubLObjectFactory.makeKeyword("HTML-DECIMAL-ESCAPE");
        $ic103$ = SubLObjectFactory.makeInteger(59);
        $ic104$ = SubLObjectFactory.makeSymbol("CODE-CHAR");
        $ic105$ = SubLObjectFactory.makeInteger(256);
        $ic106$ = SubLObjectFactory.makeSymbol("<=");
        $ic107$ = SubLObjectFactory.makeSymbol("CHAR-CODE");
        $ic108$ = SubLObjectFactory.makeString("~S (code: ~S) is not a valid utf8 character");
        $ic109$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic110$ = _constant_110_initializer();
        $ic111$ = SubLObjectFactory.makeInteger(52);
        $ic112$ = SubLObjectFactory.makeSymbol("S#4418", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#4416", "CYC");
        $ic114$ = SubLObjectFactory.makeString("Invalid unicode character, expected ~A bytes, got ~A only.");
        $ic115$ = SubLObjectFactory.makeInteger(53);
        $ic116$ = SubLObjectFactory.makeSymbol("S#4421", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#4419", "CYC");
    }
    
    public static final class $sX4337_native extends SubLStructNative
    {
        public SubLObject $uchar;
        private static final SubLStructDeclNative structDecl;
        
        public $sX4337_native() {
            this.$uchar = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX4337_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$uchar;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$uchar = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX4337_native.class, module0039.$ic1$, module0039.$ic2$, module0039.$ic3$, module0039.$ic4$, new String[] { "$uchar" }, module0039.$ic5$, module0039.$ic6$, module0039.$ic7$);
        }
    }
    
    public static final class $f2980$UnaryFunction extends UnaryFunction
    {
        public $f2980$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#4338"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0039.f2980(var3);
        }
    }
    
    public static final class $sX4339_native extends SubLStructNative
    {
        public SubLObject $vect;
        private static final SubLStructDeclNative structDecl;
        
        public $sX4339_native() {
            this.$vect = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX4339_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$vect;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$vect = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX4339_native.class, module0039.$ic22$, module0039.$ic23$, module0039.$ic24$, module0039.$ic25$, new String[] { "$vect" }, module0039.$ic26$, module0039.$ic27$, module0039.$ic28$);
        }
    }
    
    public static final class $f2992$UnaryFunction extends UnaryFunction
    {
        public $f2992$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#4340"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0039.f2992(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0039.class
	Total time: 491 ms
	
	Decompiled with Procyon 0.5.32.
*/