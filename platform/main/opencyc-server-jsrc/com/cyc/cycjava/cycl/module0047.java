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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0047 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0047";
    public static final String myFingerPrint = "c2a44db541156d70e90d3f3530ba484fac8b52b33a48eb3ddb9273375d86d7ab";
    public static SubLSymbol $g975$;
    public static SubLSymbol $g976$;
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
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
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
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLList $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    
    
    public static SubLObject f3183(final SubLObject var1, final SubLObject var2) {
        f3184(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3185(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX295_native.class) ? T : NIL);
    }
    
    public static SubLObject f3186(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3187(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3188(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3189(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f3190(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f3191(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f3192(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f3193(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f3194(final SubLObject var1) {
        assert NIL != f3185(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f3195(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3196(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3197(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3198(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f3199(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f3200(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f3201(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f3202(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f3203(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3185(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f3204(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX295_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic27$)) {
                f3195(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f3196(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f3197(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic30$)) {
                f3198(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic31$)) {
                f3199(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic32$)) {
                f3200(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic33$)) {
                f3201(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic34$)) {
                f3202(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f3203(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic36$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3205(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)NINE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic27$, f3186(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic28$, f3187(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic29$, f3188(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic30$, f3189(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic31$, f3190(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic32$, f3191(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic33$, f3192(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic34$, f3193(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic35$, f3194(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic40$, (SubLObject)$ic38$, (SubLObject)NINE_INTEGER);
        return var11;
    }
    
    public static SubLObject f3206(final SubLObject var11, final SubLObject var12) {
        return f3205(var11, var12);
    }
    
    public static SubLObject f3184(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)$ic42$);
        return var13;
    }
    
    public static SubLObject f3207(SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19, SubLObject var20) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)$ic43$;
        }
        if (var20 == UNPROVIDED) {
            var20 = module0046.$g971$.getGlobalValue();
        }
        if (NIL != var15 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var15)) {
            throw new AssertionError(var15);
        }
        if (NIL != var16 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var16)) {
            throw new AssertionError(var16);
        }
        if (NIL != var17 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var17)) {
            throw new AssertionError(var17);
        }
        if (NIL != var18 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var18)) {
            throw new AssertionError(var18);
        }
        assert NIL != Types.stringp(var19) : var19;
        assert NIL != Types.integerp(var20) : var20;
        final SubLObject var21 = f3204((SubLObject)UNPROVIDED);
        f3195(var21, var15);
        f3196(var21, (SubLObject)((NIL != var16) ? ConsesLow.list(var16) : NIL));
        f3197(var21, (SubLObject)NIL);
        f3198(var21, (SubLObject)NIL);
        f3199(var21, var17);
        f3201(var21, var19);
        f3202(var21, var20);
        f3203(var21, (SubLObject)((NIL != var18) ? ConsesLow.list(f3208(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL));
        return var21;
    }
    
    public static SubLObject f3209(final SubLObject var21, final SubLObject var15) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.stringp(var15) : var15;
        f3195(var21, var15);
        return var21;
    }
    
    public static SubLObject f3210(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3186(var21);
    }
    
    public static SubLObject f3211(final SubLObject var21, final SubLObject var16) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.stringp(var16) : var16;
        if (NIL == conses_high.member(var16, f3187(var21), Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
            f3196(var21, (SubLObject)ConsesLow.cons(var16, f3187(var21)));
        }
        return var21;
    }
    
    public static SubLObject f3212(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3187(var21);
    }
    
    public static SubLObject f3213(final SubLObject var21, final SubLObject var23) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.stringp(var23) : var23;
        if (NIL == conses_high.member(var23, f3188(var21), Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
            f3197(var21, (SubLObject)ConsesLow.cons(var23, f3188(var21)));
        }
        return var21;
    }
    
    public static SubLObject f3214(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3188(var21);
    }
    
    public static SubLObject f3215(final SubLObject var21, final SubLObject var24) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.stringp(var24) : var24;
        if (NIL == conses_high.member(var24, f3189(var21), Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
            f3198(var21, (SubLObject)ConsesLow.cons(var24, f3189(var21)));
        }
        return var21;
    }
    
    public static SubLObject f3216(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3189(var21);
    }
    
    public static SubLObject f3217(final SubLObject var21, final SubLObject var17) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.stringp(var17) : var17;
        f3199(var21, var17);
        return var21;
    }
    
    public static SubLObject f3218(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3190(var21);
    }
    
    public static SubLObject f3219(final SubLObject var21, final SubLObject var25) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.stringp(var25) : var25;
        if (NIL == conses_high.member(var25, f3191(var21), Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
            f3200(var21, (SubLObject)ConsesLow.cons(var25, f3191(var21)));
        }
        return var21;
    }
    
    public static SubLObject f3220(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3191(var21);
    }
    
    public static SubLObject f3221(final SubLObject var21, final SubLObject var19) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.stringp(var19) : var19;
        f3201(var21, var19);
        return var21;
    }
    
    public static SubLObject f3222(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3192(var21);
    }
    
    public static SubLObject f3223(final SubLObject var21, final SubLObject var20) {
        assert NIL != f3185(var21) : var21;
        assert NIL != Types.integerp(var20) : var20;
        f3202(var21, var20);
        return var21;
    }
    
    public static SubLObject f3224(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3193(var21);
    }
    
    public static SubLObject f3225(final SubLObject var21, final SubLObject var26) {
        assert NIL != f3185(var21) : var21;
        assert NIL != f3226(var26) : var26;
        f3203(var21, module0035.f2083(var26, f3194(var21)));
        return var21;
    }
    
    public static SubLObject f3227(final SubLObject var21) {
        assert NIL != f3185(var21) : var21;
        return f3194(var21);
    }
    
    public static SubLObject f3228(final SubLObject var21, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)TEN_INTEGER;
        }
        assert NIL != f3185(var21) : var21;
        f3229(var21);
        return f3230(var21, var27);
    }
    
    public static SubLObject f3231(final SubLObject var28, final SubLObject var29) {
        assert NIL != module0035.f2015(var28) : var28;
        SubLObject var30 = var28;
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            assert NIL != f3226(var31) : var31;
            var30 = var30.rest();
            var31 = var30.first();
        }
        final SubLObject var32 = Guids.guid_to_string(Guids.new_guid());
        PrintLow.format(var29, (SubLObject)$ic48$, var32);
        module0038.f2833(var29);
        module0038.f2833(var29);
        print_high.princ((SubLObject)$ic49$, var29);
        var30 = var28;
        SubLObject var33 = (SubLObject)NIL;
        var33 = var30.first();
        while (NIL != var30) {
            f3232(var33, var29, var32);
            var30 = var30.rest();
            var33 = var30.first();
        }
        module0038.f2833(var29);
        PrintLow.format(var29, (SubLObject)$ic50$, var32);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3233(final SubLObject var13) {
        return f3234(var13);
    }
    
    public static SubLObject f3234(final SubLObject var21) {
        return Sxhash.sxhash(f3186(var21));
    }
    
    public static SubLObject f3229(final SubLObject var21) {
        final SubLObject var22 = (SubLObject)T;
        final SubLObject var23 = (SubLObject)NIL;
        return Values.values(var22, var23);
    }
    
    public static SubLObject f3230(final SubLObject var21, final SubLObject var27) {
        return module0046.f3173(f3210(var21), f3212(var21), f3227(var21), f3218(var21), f3222(var21), f3220(var21), f3224(var21), var27, f3214(var21), f3216(var21));
    }
    
    public static SubLObject f3235(final SubLObject var1, final SubLObject var2) {
        f3236(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3226(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX4570_native.class) ? T : NIL);
    }
    
    public static SubLObject f3237(final SubLObject var1) {
        assert NIL != f3226(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3238(final SubLObject var1) {
        assert NIL != f3226(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3239(final SubLObject var1) {
        assert NIL != f3226(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3240(final SubLObject var1) {
        assert NIL != f3226(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f3241(final SubLObject var1) {
        assert NIL != f3226(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f3242(final SubLObject var1) {
        assert NIL != f3226(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f3243(final SubLObject var1) {
        assert NIL != f3226(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f3244(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3226(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3245(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3226(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3246(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3226(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3247(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3226(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f3248(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3226(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f3249(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3226(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f3250(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3226(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f3251(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX4570_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic74$)) {
                f3244(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic75$)) {
                f3245(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic76$)) {
                f3246(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic77$)) {
                f3247(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic78$)) {
                f3248(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic79$)) {
                f3249(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic80$)) {
                f3250(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic36$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3252(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic81$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic74$, f3237(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic75$, f3238(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic76$, f3239(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic77$, f3240(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic78$, f3241(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic79$, f3242(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic39$, (SubLObject)$ic80$, f3243(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic40$, (SubLObject)$ic81$, (SubLObject)SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f3253(final SubLObject var11, final SubLObject var12) {
        return f3252(var11, var12);
    }
    
    public static SubLObject f3236(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        PrintLow.format(var2, (SubLObject)$ic83$, f3254(var13));
        PrintLow.format(var2, (SubLObject)$ic84$);
        return var13;
    }
    
    public static SubLObject f3208(final SubLObject var39, SubLObject var40, SubLObject var41) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic85$;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic86$;
        }
        assert NIL != Types.stringp(var39) : var39;
        assert NIL != Types.stringp(var40) : var40;
        assert NIL != f3255(var41) : var41;
        return f3256(var40, (SubLObject)$ic88$, var41, var39, (SubLObject)$ic89$);
    }
    
    public static SubLObject f3257(final SubLObject var42, SubLObject var40, SubLObject var43, SubLObject var41) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic85$;
        }
        if (var43 == UNPROVIDED) {
            var43 = module0075.f5232(var42);
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic86$;
        }
        assert NIL != Types.stringp(var42) : var42;
        assert NIL != Types.stringp(var40) : var40;
        assert NIL != f3255(var41) : var41;
        final SubLObject var44 = f3256(var40, (SubLObject)$ic90$, var41, var42, (SubLObject)$ic91$);
        f3258(var44, var43);
        return var44;
    }
    
    public static SubLObject f3259(final SubLObject var45) {
        return (SubLObject)makeBoolean(var45.isKeyword() && NIL != conses_high.member(var45, (SubLObject)$ic92$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f3255(final SubLObject var45) {
        return (SubLObject)makeBoolean(var45.isString() && NIL != conses_high.member(var45, (SubLObject)$ic93$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f3256(final SubLObject var40, final SubLObject var46, final SubLObject var41, final SubLObject var39, final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var48) && NIL == module0038.f2684(var40, (SubLObject)$ic94$)) {
            Errors.error((SubLObject)$ic95$, var40);
        }
        final SubLObject var49 = f3251((SubLObject)UNPROVIDED);
        f3244(var49, var40);
        f3245(var49, (SubLObject)NIL);
        f3246(var49, var46);
        f3247(var49, (SubLObject)NIL);
        f3248(var49, var41);
        f3249(var49, var39);
        f3250(var49, var47);
        return var49;
    }
    
    public static SubLObject f3260(final SubLObject var44) {
        assert NIL != f3226(var44) : var44;
        return f3237(var44);
    }
    
    public static SubLObject f3261(final SubLObject var44, final SubLObject var40) {
        assert NIL != f3226(var44) : var44;
        assert NIL != Types.stringp(var40) : var40;
        f3244(var44, var40);
        return var44;
    }
    
    public static SubLObject f3262(final SubLObject var44) {
        assert NIL != f3226(var44) : var44;
        return f3240(var44);
    }
    
    public static SubLObject f3258(final SubLObject var44, final SubLObject var43) {
        return f3263(var44, (SubLObject)$ic96$, var43);
    }
    
    public static SubLObject f3254(final SubLObject var44) {
        assert NIL != f3226(var44) : var44;
        return f3239(var44);
    }
    
    public static SubLObject f3264(final SubLObject var44) {
        assert NIL != f3226(var44) : var44;
        return f3241(var44);
    }
    
    public static SubLObject f3265(final SubLObject var44) {
        assert NIL != f3226(var44) : var44;
        return f3242(var44);
    }
    
    public static SubLObject f3266(final SubLObject var44) {
        assert NIL != f3226(var44) : var44;
        return f3243(var44);
    }
    
    public static SubLObject f3267(final SubLObject var13) {
        return f3268(var13);
    }
    
    public static SubLObject f3268(final SubLObject var44) {
        return Sxhash.sxhash(f3237(var44));
    }
    
    public static SubLObject f3263(final SubLObject var44, final SubLObject var49, final SubLObject var50) {
        SubLObject var51 = f3262(var44);
        var51 = conses_high.putf(var51, var49, var50);
        f3247(var44, var51);
        return var51;
    }
    
    public static SubLObject f3232(final SubLObject var44, final SubLObject var29, final SubLObject var33) {
        module0038.f2833(var29);
        PrintLow.format(var29, (SubLObject)$ic98$, var33);
        f3269(var44, var29);
        f3270(var44, var29);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3269(final SubLObject var44, final SubLObject var29) {
        module0038.f2833(var29);
        PrintLow.format(var29, (SubLObject)$ic99$, f3260(var44));
        module0038.f2833(var29);
        PrintLow.format(var29, (SubLObject)$ic100$, f3264(var44));
        module0038.f2833(var29);
        PrintLow.format(var29, (SubLObject)$ic101$, f3254(var44));
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        for (var45 = (SubLObject)NIL, var45 = f3262(var44); NIL != var45; var45 = conses_high.cddr(var45)) {
            var46 = var45.first();
            var47 = conses_high.cadr(var45);
            print_high.princ((SubLObject)$ic102$, var29);
            module0038.f2833(var29);
            PrintLow.format(var29, (SubLObject)$ic103$, var46, var47);
        }
        module0038.f2833(var29);
        module0038.f2833(var29);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3270(final SubLObject var44, final SubLObject var29) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        final SubLObject var46 = f3266(var44);
        if (var46.eql((SubLObject)$ic89$)) {
            print_high.princ(f3265(var44), var29);
        }
        else if (var46.eql((SubLObject)$ic91$)) {
            if (NIL != module0038.f2684(f3260(var44), (SubLObject)$ic94$)) {
                SubLObject var47 = (SubLObject)NIL;
                try {
                    final SubLObject var48 = stream_macros.$stream_requires_locking$.currentBinding(var45);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var45);
                        var47 = compatibility.open_text(f3265(var44), (SubLObject)$ic104$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var48, var45);
                    }
                    if (!var47.isStream()) {
                        Errors.error((SubLObject)$ic105$, f3265(var44));
                    }
                    final SubLObject var49 = var47;
                    SubLObject var50 = (SubLObject)NIL;
                    while (NIL == var50) {
                        final SubLObject var51 = streams_high.read_line(var49, (SubLObject)NIL, (SubLObject)$ic106$, (SubLObject)UNPROVIDED);
                        if (var51.isString()) {
                            print_high.princ(var51, var29);
                            module0038.f2833(var29);
                        }
                        else {
                            var50 = (SubLObject)T;
                        }
                    }
                }
                finally {
                    final SubLObject var52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var45);
                        if (var47.isStream()) {
                            streams_high.close(var47, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var52, var45);
                    }
                }
            }
            else {
                Errors.error((SubLObject)$ic107$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3271() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3183", "S#4572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3185", "S#4569", 1, 0, false);
        new $f3185$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3186", "S#4573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3187", "S#4574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3188", "S#4575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3189", "S#4576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3190", "S#4577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3191", "S#4578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3192", "S#4579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3193", "S#4580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3194", "S#4581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3195", "S#4582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3196", "S#4583", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3197", "S#4584", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3198", "S#4585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3199", "S#4586", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3200", "S#4587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3201", "S#4588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3202", "S#4589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3203", "S#4590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3204", "S#4591", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3205", "S#4592", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3206", "S#4593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3184", "S#4594", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3207", "S#4595", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3209", "S#4596", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3210", "S#4597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3211", "S#4598", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3212", "S#4599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3213", "S#4600", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3214", "S#4601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3215", "S#4602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3216", "S#4603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3217", "S#4604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3218", "S#4605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3219", "S#4606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3220", "S#4607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3221", "S#4608", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3222", "S#4609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3223", "S#4610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3224", "S#4611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3225", "S#4612", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3227", "S#4613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3228", "S#4614", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3231", "S#4535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3233", "S#4615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3234", "S#4616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3229", "S#4617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3230", "S#4618", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3235", "S#4619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3226", "S#4568", 1, 0, false);
        new $f3226$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3237", "S#4620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3238", "S#4621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3239", "S#4622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3240", "S#4623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3241", "S#4624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3242", "S#4625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3243", "S#4626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3244", "S#4627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3245", "S#4628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3246", "S#4629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3247", "S#4630", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3248", "S#4631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3249", "S#4632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3250", "S#4633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3251", "S#4634", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3252", "S#4635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3253", "S#4636", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3236", "S#4637", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3208", "S#4638", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3257", "S#4639", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3259", "S#4640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3255", "S#4641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3256", "S#4642", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3260", "S#4643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3261", "S#4644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3262", "S#4645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3258", "S#4646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3254", "S#4647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3264", "S#4648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3265", "S#4649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3266", "S#4650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3267", "S#4651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3268", "S#4652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3263", "S#4653", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3232", "S#4654", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3269", "S#4655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0047", "f3270", "S#4656", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3272() {
        $g975$ = SubLFiles.defconstant("S#4657", (SubLObject)$ic0$);
        $g976$ = SubLFiles.defconstant("S#4658", (SubLObject)$ic52$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3273() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g975$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g975$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic41$));
        module0012.f419((SubLObject)$ic6$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g975$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic51$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g976$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic58$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic59$);
        Structures.def_csetf((SubLObject)$ic60$, (SubLObject)$ic61$);
        Structures.def_csetf((SubLObject)$ic62$, (SubLObject)$ic63$);
        Structures.def_csetf((SubLObject)$ic64$, (SubLObject)$ic65$);
        Structures.def_csetf((SubLObject)$ic66$, (SubLObject)$ic67$);
        Structures.def_csetf((SubLObject)$ic68$, (SubLObject)$ic69$);
        Structures.def_csetf((SubLObject)$ic70$, (SubLObject)$ic71$);
        Structures.def_csetf((SubLObject)$ic72$, (SubLObject)$ic73$);
        Equality.identity((SubLObject)$ic52$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g976$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic82$));
        module0012.f419((SubLObject)$ic57$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g976$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic97$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f3271();
    }
    
    public void initializeVariables() {
        f3272();
    }
    
    public void runTopLevelForms() {
        f3273();
    }
    
    static {
        me = (SubLFile)new module0047();
        $g975$ = null;
        $g976$ = null;
        $ic0$ = makeSymbol("S#295", "CYC");
        $ic1$ = makeSymbol("S#4569", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#4562", "CYC"), makeSymbol("S#4563", "CYC"), makeSymbol("S#4564", "CYC"), makeSymbol("S#4565", "CYC"), makeSymbol("S#4566", "CYC"), makeSymbol("S#4567", "CYC"), makeSymbol("S#57", "CYC"), makeSymbol("S#58", "CYC"), makeSymbol("S#4659", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("FROM"), makeKeyword("TO"), makeKeyword("CC"), makeKeyword("BCC"), makeKeyword("SUBJECT"), makeKeyword("ADDITIONAL-HEADERS"), makeKeyword("HOST"), makeKeyword("PORT"), makeKeyword("PARTS") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#4573", "CYC"), makeSymbol("S#4574", "CYC"), makeSymbol("S#4575", "CYC"), makeSymbol("S#4576", "CYC"), makeSymbol("S#4577", "CYC"), makeSymbol("S#4578", "CYC"), makeSymbol("S#4579", "CYC"), makeSymbol("S#4580", "CYC"), makeSymbol("S#4581", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#4582", "CYC"), makeSymbol("S#4583", "CYC"), makeSymbol("S#4584", "CYC"), makeSymbol("S#4585", "CYC"), makeSymbol("S#4586", "CYC"), makeSymbol("S#4587", "CYC"), makeSymbol("S#4588", "CYC"), makeSymbol("S#4589", "CYC"), makeSymbol("S#4590", "CYC") });
        $ic6$ = makeSymbol("S#4594", "CYC");
        $ic7$ = makeSymbol("S#4572", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#4569", "CYC"));
        $ic9$ = makeSymbol("S#4573", "CYC");
        $ic10$ = makeSymbol("S#4582", "CYC");
        $ic11$ = makeSymbol("S#4574", "CYC");
        $ic12$ = makeSymbol("S#4583", "CYC");
        $ic13$ = makeSymbol("S#4575", "CYC");
        $ic14$ = makeSymbol("S#4584", "CYC");
        $ic15$ = makeSymbol("S#4576", "CYC");
        $ic16$ = makeSymbol("S#4585", "CYC");
        $ic17$ = makeSymbol("S#4577", "CYC");
        $ic18$ = makeSymbol("S#4586", "CYC");
        $ic19$ = makeSymbol("S#4578", "CYC");
        $ic20$ = makeSymbol("S#4587", "CYC");
        $ic21$ = makeSymbol("S#4579", "CYC");
        $ic22$ = makeSymbol("S#4588", "CYC");
        $ic23$ = makeSymbol("S#4580", "CYC");
        $ic24$ = makeSymbol("S#4589", "CYC");
        $ic25$ = makeSymbol("S#4581", "CYC");
        $ic26$ = makeSymbol("S#4590", "CYC");
        $ic27$ = makeKeyword("FROM");
        $ic28$ = makeKeyword("TO");
        $ic29$ = makeKeyword("CC");
        $ic30$ = makeKeyword("BCC");
        $ic31$ = makeKeyword("SUBJECT");
        $ic32$ = makeKeyword("ADDITIONAL-HEADERS");
        $ic33$ = makeKeyword("HOST");
        $ic34$ = makeKeyword("PORT");
        $ic35$ = makeKeyword("PARTS");
        $ic36$ = makeString("Invalid slot ~S for construction function");
        $ic37$ = makeKeyword("BEGIN");
        $ic38$ = makeSymbol("S#4591", "CYC");
        $ic39$ = makeKeyword("SLOT");
        $ic40$ = makeKeyword("END");
        $ic41$ = makeSymbol("S#4593", "CYC");
        $ic42$ = makeString("<MESSAGE>");
        $ic43$ = makeString("localhost");
        $ic44$ = makeSymbol("STRINGP");
        $ic45$ = makeSymbol("INTEGERP");
        $ic46$ = makeSymbol("S#4568", "CYC");
        $ic47$ = makeSymbol("S#747", "CYC");
        $ic48$ = makeString("Content-Type: multipart/mixed;~% boundary=~S");
        $ic49$ = makeString("This is a multi-part message in MIME format.");
        $ic50$ = makeString("--~A--");
        $ic51$ = makeSymbol("S#4615", "CYC");
        $ic52$ = makeSymbol("S#4570", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#4660", "CYC"), (SubLObject)makeSymbol("S#4661", "CYC"), (SubLObject)makeSymbol("S#4662", "CYC"), (SubLObject)makeSymbol("S#4663", "CYC"), (SubLObject)makeSymbol("S#4664", "CYC"), (SubLObject)makeSymbol("S#1625", "CYC"), (SubLObject)makeSymbol("S#4665", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)makeKeyword("CONTENT-TYPE"), (SubLObject)makeKeyword("CONTENT-TYPE-PARAMETERS"), (SubLObject)makeKeyword("DISPOSITION"), (SubLObject)makeKeyword("CONTENT-DISPOSITION-PARAMETERS"), (SubLObject)makeKeyword("ENCODING"), (SubLObject)makeKeyword("DATA"), (SubLObject)makeKeyword("DATA-TYPE"));
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#4620", "CYC"), (SubLObject)makeSymbol("S#4621", "CYC"), (SubLObject)makeSymbol("S#4622", "CYC"), (SubLObject)makeSymbol("S#4623", "CYC"), (SubLObject)makeSymbol("S#4624", "CYC"), (SubLObject)makeSymbol("S#4625", "CYC"), (SubLObject)makeSymbol("S#4626", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#4627", "CYC"), (SubLObject)makeSymbol("S#4628", "CYC"), (SubLObject)makeSymbol("S#4629", "CYC"), (SubLObject)makeSymbol("S#4630", "CYC"), (SubLObject)makeSymbol("S#4631", "CYC"), (SubLObject)makeSymbol("S#4632", "CYC"), (SubLObject)makeSymbol("S#4633", "CYC"));
        $ic57$ = makeSymbol("S#4637", "CYC");
        $ic58$ = makeSymbol("S#4619", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#4568", "CYC"));
        $ic60$ = makeSymbol("S#4620", "CYC");
        $ic61$ = makeSymbol("S#4627", "CYC");
        $ic62$ = makeSymbol("S#4621", "CYC");
        $ic63$ = makeSymbol("S#4628", "CYC");
        $ic64$ = makeSymbol("S#4622", "CYC");
        $ic65$ = makeSymbol("S#4629", "CYC");
        $ic66$ = makeSymbol("S#4623", "CYC");
        $ic67$ = makeSymbol("S#4630", "CYC");
        $ic68$ = makeSymbol("S#4624", "CYC");
        $ic69$ = makeSymbol("S#4631", "CYC");
        $ic70$ = makeSymbol("S#4625", "CYC");
        $ic71$ = makeSymbol("S#4632", "CYC");
        $ic72$ = makeSymbol("S#4626", "CYC");
        $ic73$ = makeSymbol("S#4633", "CYC");
        $ic74$ = makeKeyword("CONTENT-TYPE");
        $ic75$ = makeKeyword("CONTENT-TYPE-PARAMETERS");
        $ic76$ = makeKeyword("DISPOSITION");
        $ic77$ = makeKeyword("CONTENT-DISPOSITION-PARAMETERS");
        $ic78$ = makeKeyword("ENCODING");
        $ic79$ = makeKeyword("DATA");
        $ic80$ = makeKeyword("DATA-TYPE");
        $ic81$ = makeSymbol("S#4634", "CYC");
        $ic82$ = makeSymbol("S#4636", "CYC");
        $ic83$ = makeString("<MESSAGE-PART (~A)");
        $ic84$ = makeString(">");
        $ic85$ = makeString("text/plain");
        $ic86$ = makeString("7bit");
        $ic87$ = makeSymbol("S#4641", "CYC");
        $ic88$ = makeString("inline");
        $ic89$ = makeKeyword("STRING");
        $ic90$ = makeString("attachment");
        $ic91$ = makeKeyword("FILE");
        $ic92$ = ConsesLow.list((SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("FILE"));
        $ic93$ = ConsesLow.list((SubLObject)makeString("7bit"), (SubLObject)makeString("8bit"), (SubLObject)makeString("binary"));
        $ic94$ = makeString("text/");
        $ic95$ = makeString("Non-text content types not implemented yet. Content type must start with text/. Not ~S");
        $ic96$ = makeKeyword("FILENAME");
        $ic97$ = makeSymbol("S#4651", "CYC");
        $ic98$ = makeString("--~A");
        $ic99$ = makeString("Content-Type: ~A");
        $ic100$ = makeString("Content-Transfer-Encoding: ~A");
        $ic101$ = makeString("Content-Disposition: ~A");
        $ic102$ = makeString(";");
        $ic103$ = makeString(" ~A=~S");
        $ic104$ = makeKeyword("INPUT");
        $ic105$ = makeString("Unable to open ~S");
        $ic106$ = makeKeyword("EOF");
        $ic107$ = makeString("Only know how to send textual message body parts.");
    }
    
    public static final class $sX295_native extends SubLStructNative
    {
        public SubLObject $from;
        public SubLObject $to;
        public SubLObject $cc;
        public SubLObject $bcc;
        public SubLObject $subject;
        public SubLObject $additional_headers;
        public SubLObject $host;
        public SubLObject $port;
        public SubLObject $parts;
        private static final SubLStructDeclNative structDecl;
        
        public $sX295_native() {
            this.$from = (SubLObject)CommonSymbols.NIL;
            this.$to = (SubLObject)CommonSymbols.NIL;
            this.$cc = (SubLObject)CommonSymbols.NIL;
            this.$bcc = (SubLObject)CommonSymbols.NIL;
            this.$subject = (SubLObject)CommonSymbols.NIL;
            this.$additional_headers = (SubLObject)CommonSymbols.NIL;
            this.$host = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$parts = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX295_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$from;
        }
        
        public SubLObject getField3() {
            return this.$to;
        }
        
        public SubLObject getField4() {
            return this.$cc;
        }
        
        public SubLObject getField5() {
            return this.$bcc;
        }
        
        public SubLObject getField6() {
            return this.$subject;
        }
        
        public SubLObject getField7() {
            return this.$additional_headers;
        }
        
        public SubLObject getField8() {
            return this.$host;
        }
        
        public SubLObject getField9() {
            return this.$port;
        }
        
        public SubLObject getField10() {
            return this.$parts;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$from = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$to = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$cc = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$bcc = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$subject = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$additional_headers = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$host = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$port = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$parts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX295_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$from", "$to", "$cc", "$bcc", "$subject", "$additional_headers", "$host", "$port", "$parts" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f3185$UnaryFunction extends UnaryFunction
    {
        public $f3185$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#4569"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3185(var3);
        }
    }
    
    public static final class $sX4570_native extends SubLStructNative
    {
        public SubLObject $content_type;
        public SubLObject $content_type_parameters;
        public SubLObject $disposition;
        public SubLObject $content_disposition_parameters;
        public SubLObject $encoding;
        public SubLObject $data;
        public SubLObject $data_type;
        private static final SubLStructDeclNative structDecl;
        
        public $sX4570_native() {
            this.$content_type = (SubLObject)CommonSymbols.NIL;
            this.$content_type_parameters = (SubLObject)CommonSymbols.NIL;
            this.$disposition = (SubLObject)CommonSymbols.NIL;
            this.$content_disposition_parameters = (SubLObject)CommonSymbols.NIL;
            this.$encoding = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
            this.$data_type = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX4570_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$content_type;
        }
        
        public SubLObject getField3() {
            return this.$content_type_parameters;
        }
        
        public SubLObject getField4() {
            return this.$disposition;
        }
        
        public SubLObject getField5() {
            return this.$content_disposition_parameters;
        }
        
        public SubLObject getField6() {
            return this.$encoding;
        }
        
        public SubLObject getField7() {
            return this.$data;
        }
        
        public SubLObject getField8() {
            return this.$data_type;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$content_type = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$content_type_parameters = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$disposition = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$content_disposition_parameters = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$encoding = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$data = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$data_type = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX4570_native.class, $ic52$, $ic46$, $ic53$, $ic54$, new String[] { "$content_type", "$content_type_parameters", "$disposition", "$content_disposition_parameters", "$encoding", "$data", "$data_type" }, $ic55$, $ic56$, $ic57$);
        }
    }
    
    public static final class $f3226$UnaryFunction extends UnaryFunction
    {
        public $f3226$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#4568"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3226(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 273 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/