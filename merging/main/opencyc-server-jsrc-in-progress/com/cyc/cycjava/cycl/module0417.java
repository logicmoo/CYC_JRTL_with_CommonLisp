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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0417 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0417";
    public static final String myFingerPrint = "cb8623307e9d895a2bbf639e03923a42be799f39efa08ba8125069f186ef91c6";
    public static SubLSymbol $g3409$;
    private static SubLSymbol $g3410$;
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
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
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
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
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
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    
    
    public static SubLObject f29190(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29191(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX32380_native.class) ? T : NIL);
    }
    
    public static SubLObject f29192(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f29193(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f29194(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f29195(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f29196(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f29197(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f29198(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f29199(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f29200(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f29201(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f29202(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f29203(final SubLObject var1) {
        assert NIL != f29191(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f29204(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f29205(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f29206(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f29207(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f29208(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f29209(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f29210(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f29211(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f29212(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f29213(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f29214(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f29215(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29191(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f29216(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX32380_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic33$)) {
                f29204(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic34$)) {
                f29205(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f29206(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f29207(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic37$)) {
                f29208(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f29209(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f29210(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f29211(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f29212(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f29213(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f29214(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f29215(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f29217(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic33$, f29192(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic34$, f29193(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic35$, f29194(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic36$, f29195(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic37$, f29196(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic38$, f29197(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic39$, f29198(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic40$, f29199(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic41$, f29200(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic42$, f29201(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic43$, f29202(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic48$, (SubLObject)$ic44$, f29203(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic47$, (SubLObject)TWELVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f29218(final SubLObject var11, final SubLObject var12) {
        return f29217(var11, var12);
    }
    
    public static SubLObject f29219() {
        SubLObject var13 = module0030.f1625($g3410$.getGlobalValue());
        var13 = Sort.sort(var13, Symbols.symbol_function((SubLObject)$ic53$), Symbols.symbol_function((SubLObject)$ic54$));
        return var13;
    }
    
    public static SubLObject f29220(final SubLObject var14) {
        SubLObject var15 = conses_high.copy_list(Hashtables.gethash(var14, $g3410$.getGlobalValue(), (SubLObject)UNPROVIDED));
        var15 = Sort.sort(var15, Symbols.symbol_function((SubLObject)$ic55$), Symbols.symbol_function((SubLObject)$ic11$));
        return var15;
    }
    
    public static SubLObject f29221(final SubLObject var14) {
        return module0035.sublisp_boolean(Hashtables.gethash(var14, $g3410$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29222(final SubLObject var16) {
        return (SubLObject)ConsesLow.list(module0340.f22825(f29192(var16)), f29193(var16));
    }
    
    public static SubLObject f29223(final SubLObject var16) {
        return f29195(var16);
    }
    
    public static SubLObject f29224(final SubLObject var16) {
        return f29194(var16);
    }
    
    public static SubLObject f29225(final SubLObject var16) {
        return f29199(var16);
    }
    
    public static SubLObject f29226(final SubLObject var16) {
        return f29197(var16);
    }
    
    public static SubLObject f29227(final SubLObject var16) {
        return f29198(var16);
    }
    
    public static SubLObject f29228(final SubLObject var16) {
        return f29203(var16);
    }
    
    public static SubLObject f29229(final SubLObject var16) {
        final SubLObject var17 = f29192(var16);
        if (NIL != var17) {
            final SubLObject var18 = module0340.f22877(var17);
            return var18;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29230(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != module0035.f2439((SubLObject)$ic56$, f29223(var16), (SubLObject)UNPROVIDED) || NIL != module0035.f2439((SubLObject)$ic56$, f29224(var16), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29231(final SubLObject var16) {
        return Sequences.remove_duplicates(ConsesLow.append(module0205.f13183(f29223(var16), (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0205.f13183(f29224(var16), (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29232(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic57$);
        var22 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic57$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic57$);
        var24 = var21.first();
        var21 = var21.rest();
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = var21;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28_29 = (SubLObject)NIL;
        while (NIL != var26) {
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)$ic57$);
            var28_29 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)$ic57$);
            if (NIL == conses_high.member(var28_29, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var27 = (SubLObject)T;
            }
            if (var28_29 == $ic59$) {
                var25 = var26.first();
            }
            var26 = var26.rest();
        }
        if (NIL != var27 && NIL == var25) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic57$);
        }
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic36$, var21);
        final SubLObject var29 = (NIL != var28) ? conses_high.cadr(var28) : $ic60$;
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var21);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var21);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : $ic61$);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var21);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var21);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic62$, var21);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic63$, var21);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : NIL);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)$ic43$, var21);
        final SubLObject var43 = (SubLObject)((NIL != var42) ? conses_high.cadr(var42) : NIL);
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)$ic44$, var21);
        final SubLObject var45 = (SubLObject)((NIL != var44) ? conses_high.cadr(var44) : T);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic64$, var22, var23, var24, var29, var31, var33, var35, var37, var39, var41, var43, var45 });
    }
    
    public static SubLObject f29233(final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var31, final SubLObject var33, final SubLObject var35, final SubLObject var37, final SubLObject var39, final SubLObject var48, final SubLObject var49, final SubLObject var45, final SubLObject var47) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (NIL != var39 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var39)) {
            throw new AssertionError(var39);
        }
        assert NIL != module0029.f1472(var35) : var35;
        assert NIL != module0421.f29459(var37) : var37;
        if (NIL != var48 && !areAssertionsDisabledFor(me) && NIL == module0004.f105(var48)) {
            throw new AssertionError(var48);
        }
        if (NIL != var49 && !areAssertionsDisabledFor(me) && NIL == module0051.f3603(var49)) {
            throw new AssertionError(var49);
        }
        if (NIL != var45 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var45)) {
            throw new AssertionError(var45);
        }
        assert NIL != Types.booleanp(var47) : var47;
        final SubLObject var51 = module0340.f22786(var22);
        if (NIL != module0340.f22913(var51)) {
            final SubLObject var52 = f29216((SubLObject)ConsesLow.list(new SubLObject[] { $ic33$, var51, $ic34$, var23, $ic35$, var24, $ic36$, var31, $ic37$, var33, $ic38$, var39, $ic39$, var35, $ic40$, var37, $ic41$, var48, $ic42$, var49, $ic43$, var45, $ic44$, var47 }));
            SubLObject var53 = Hashtables.gethash(var51, $g3410$.getGlobalValue(), (SubLObject)UNPROVIDED);
            var53 = Sequences.delete(var23, var53, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var53 = (SubLObject)ConsesLow.cons(var52, var53);
            Hashtables.sethash(var51, $g3410$.getGlobalValue(), var53);
            module0029.f1506(module0029.$g836$.getDynamicValue(var50), var52);
            return var52;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29234(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = module0340.f22786(var22);
        SubLObject var55 = Hashtables.gethash(var54, $g3410$.getGlobalValue(), (SubLObject)UNPROVIDED);
        var55 = Sequences.delete(var53, var55, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        Hashtables.sethash(var54, $g3410$.getGlobalValue(), var55);
        return Sequences.length(var55);
    }
    
    public static SubLObject f29235() {
        Hashtables.clrhash($g3410$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29236(SubLObject var54, SubLObject var2, SubLObject var55, SubLObject var56) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var55 == UNPROVIDED) {
            var55 = module0029.$g835$.getDynamicValue();
        }
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        assert NIL != module0029.f1474(var54) : var54;
        return module0029.f1577(var2, (SubLObject)$ic75$, (SubLObject)NIL, var54, var55, (SubLObject)NIL, var56, (SubLObject)$ic76$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29237(final SubLObject var57, SubLObject var54, SubLObject var2, SubLObject var58, SubLObject var59) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        assert NIL != module0029.f1474(var54) : var54;
        final SubLObject var61 = module0340.f22928(var57);
        SubLObject var62 = (SubLObject)$ic78$;
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = var61;
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            var60.resetMultipleValues();
            final SubLObject var66 = f29238(var65, var54, var2, var58, var59);
            final SubLObject var67 = var60.secondMultipleValue();
            var60.resetMultipleValues();
            var63 = ConsesLow.nconc(var63, var67);
            if (var66 != $ic78$) {
                var62 = var66;
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        return Values.values(var62, var63);
    }
    
    public static SubLObject f29239(final SubLObject var22, SubLObject var54, SubLObject var2) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29240(var22, var54, var2, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29241(final SubLObject var22, SubLObject var54, SubLObject var2) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29240(var22, var54, var2, (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f29240(final SubLObject var22, SubLObject var54, SubLObject var2, SubLObject var58, SubLObject var59) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        assert NIL != module0029.f1474(var54) : var54;
        final SubLObject var60 = module0340.f22786(var22);
        if (NIL != module0340.f22913(var60)) {
            return f29238(var60, var54, var2, var58, var59);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29238(final SubLObject var14, final SubLObject var54, final SubLObject var2, final SubLObject var58, final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        SubLObject var61 = (SubLObject)$ic78$;
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = f29220(var14);
        SubLObject var64 = (SubLObject)NIL;
        var64 = var63.first();
        while (NIL != var63) {
            var60.resetMultipleValues();
            final SubLObject var65 = f29242(var64, var54, var2, var58, var59);
            final SubLObject var66 = var60.secondMultipleValue();
            var60.resetMultipleValues();
            var62 = (SubLObject)ConsesLow.cons(var66, var62);
            if (var65 != $ic78$ && var65 != $ic79$) {
                var61 = var65;
            }
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Values.values(var61, Sequences.nreverse(var62));
    }
    
    public static SubLObject f29243(final SubLObject var22, final SubLObject var53, SubLObject var54, SubLObject var2) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29244(var22, var53, var54, var2, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29245(final SubLObject var22, final SubLObject var53, SubLObject var54, SubLObject var2) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29244(var22, var53, var54, var2, (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f29244(final SubLObject var22, final SubLObject var53, SubLObject var54, SubLObject var2, SubLObject var58, SubLObject var59) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        assert NIL != module0029.f1474(var54) : var54;
        final SubLObject var60 = module0340.f22786(var22);
        SubLObject var61 = (SubLObject)NIL;
        if (NIL != module0340.f22913(var60) && NIL == var61) {
            SubLObject var62 = f29220(var60);
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL == var61 && NIL != var62) {
                if (var53.numE(f29193(var63))) {
                    var61 = var63;
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
        }
        return f29242(var61, var54, var2, var58, var59);
    }
    
    public static SubLObject f29242(final SubLObject var16, SubLObject var54, SubLObject var2, SubLObject var58, SubLObject var59) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic73$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        assert NIL != f29191(var16) : var16;
        assert NIL != module0029.f1474(var54) : var54;
        final SubLObject var61 = f29222(var16);
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        if (NIL == f29246(var16)) {
            var63 = (SubLObject)$ic79$;
        }
        else if (NIL != f29230(var16)) {
            var63 = (SubLObject)$ic80$;
        }
        else {
            final SubLObject var64 = f29192(var16);
            final SubLObject var65 = f29194(var16);
            final SubLObject var66 = f29195(var16);
            final SubLObject var67 = f29196(var16);
            final SubLObject var68 = print_high.$print_pretty$.currentBinding(var60);
            try {
                print_high.$print_pretty$.bind((SubLObject)NIL, var60);
                f29247(var16, var54, var2);
                var60.resetMultipleValues();
                final SubLObject var69_70 = f29248(var64, var65, var66, var67, var58, var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var71_72 = var60.secondMultipleValue();
                var60.resetMultipleValues();
                var63 = var69_70;
                var62 = var71_72;
                f29249(var16, var63, var62, var54, var2);
            }
            finally {
                print_high.$print_pretty$.rebind(var68, var60);
            }
        }
        final SubLObject var69 = module0029.f1535((SubLObject)$ic76$, var61, var63, var62);
        return Values.values(var63, var69);
    }
    
    public static SubLObject f29246(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f29198(var16);
        if (NIL == module0421.f29447(var18, module0029.$g835$.getDynamicValue(var17))) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29248(final SubLObject var14, final SubLObject var24, SubLObject var31, SubLObject var33, SubLObject var58, SubLObject var59, SubLObject var74, SubLObject var75) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var74 == UNPROVIDED) {
            var74 = (SubLObject)$ic81$;
        }
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        var76.resetMultipleValues();
        final SubLObject var77 = f29250(var14, var24, var31, var33, var58, var59, var74, var75);
        final SubLObject var78 = var76.secondMultipleValue();
        var76.resetMultipleValues();
        final SubLObject var79 = var77;
        if (var79.eql((SubLObject)$ic82$)) {
            return Values.values(var77, var78);
        }
        if (var79.eql((SubLObject)$ic78$)) {
            return Values.values(var77, var78);
        }
        return Values.values((SubLObject)$ic83$, var78);
    }
    
    public static SubLObject f29250(final SubLObject var14, final SubLObject var24, final SubLObject var31, final SubLObject var33, final SubLObject var58, final SubLObject var59, final SubLObject var74, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)$ic82$;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        try {
            var76.throwStack.push($ic84$);
            final SubLObject var80 = Errors.$error_handler$.currentBinding(var76);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic85$), var76);
                try {
                    var76.resetMultipleValues();
                    final SubLObject var81 = f29251(var24, var31, var33, var59);
                    final SubLObject var82 = var76.secondMultipleValue();
                    final SubLObject var83 = var76.thirdMultipleValue();
                    final SubLObject var84 = var76.fourthMultipleValue();
                    var76.resetMultipleValues();
                    var78 = var82;
                    if ($ic81$ != var74 && NIL == module0233.f15365(var83, var74)) {
                        var77 = (SubLObject)$ic86$;
                    }
                    else if (NIL != var75 && !var84.equal(var75)) {
                        var77 = (SubLObject)$ic87$;
                    }
                    else if (NIL == module0411.f28580(var81, var14)) {
                        var77 = (SubLObject)$ic88$;
                    }
                    else {
                        var77 = (SubLObject)$ic78$;
                    }
                    if (NIL == var58) {
                        inference_datastructures_inference_oc.f25476(var81);
                    }
                }
                catch (Throwable var85) {
                    Errors.handleThrowable(var85, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var80, var76);
            }
        }
        catch (Throwable var86) {
            var79 = Errors.handleThrowable(var86, (SubLObject)$ic84$);
        }
        finally {
            var76.throwStack.pop();
        }
        return Values.values(var77, var78);
    }
    
    public static SubLObject f29251(final SubLObject var24, SubLObject var31, SubLObject var33, SubLObject var59) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = module0408.f28423(var24);
        var33 = conses_high.copy_list(var33);
        var33 = conses_high.putf(var33, (SubLObject)$ic89$, var61);
        var33 = conses_high.putf(var33, (SubLObject)$ic90$, (SubLObject)T);
        var33 = conses_high.putf(var33, (SubLObject)$ic91$, (SubLObject)NIL);
        if (NIL != var59) {
            var33 = conses_high.putf(var33, (SubLObject)$ic92$, (SubLObject)T);
        }
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        final SubLObject var66 = Time.get_internal_real_time();
        var60.resetMultipleValues();
        final SubLObject var86_87 = module0409.f28506(var24, var31, var33);
        final SubLObject var88_89 = var60.secondMultipleValue();
        final SubLObject var90_91 = var60.thirdMultipleValue();
        var60.resetMultipleValues();
        var63 = var86_87;
        var64 = var88_89;
        var65 = var90_91;
        var62 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var66), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var65, var62, var63, var64);
    }
    
    public static SubLObject f29247(final SubLObject var16, final SubLObject var54, final SubLObject var2) {
        if (var54.eql((SubLObject)$ic73$)) {
            final SubLObject var55 = f29192(var16);
            final SubLObject var56 = module0340.f22825(var55);
            final SubLObject var57 = f29193(var16);
            PrintLow.format(var2, (SubLObject)$ic93$, var56, var57);
            streams_high.force_output(var2);
        }
        else if (!var54.eql((SubLObject)$ic94$)) {
            PrintLow.format(var2, (SubLObject)$ic95$, var54);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29249(final SubLObject var16, final SubLObject var60, final SubLObject var67, final SubLObject var54, final SubLObject var2) {
        if (var54.eql((SubLObject)$ic73$)) {
            PrintLow.format(var2, (SubLObject)$ic96$, var60, var67);
            streams_high.force_output(var2);
        }
        else if (var54.eql((SubLObject)$ic94$)) {
            final SubLObject var68 = f29192(var16);
            final SubLObject var69 = module0340.f22825(var68);
            final SubLObject var70 = f29193(var16);
            final SubLObject var71 = f29199(var16);
            PrintLow.format(var2, (SubLObject)$ic97$, new SubLObject[] { var60, var69, var70, var67, var71 });
            streams_high.force_output(var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic95$, var54);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29252() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29190", "S#32381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29191", "S#2623", 1, 0, false);
        new $f29191$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29192", "S#32382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29193", "S#32383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29194", "S#32384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29195", "S#32385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29196", "S#32386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29197", "S#32387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29198", "S#32388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29199", "S#32389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29200", "S#32390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29201", "S#32391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29202", "S#32392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29203", "S#32393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29204", "S#32394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29205", "S#32395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29206", "S#32396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29207", "S#32397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29208", "S#32398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29209", "S#32399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29210", "S#32400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29211", "S#32401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29212", "S#32402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29213", "S#32403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29214", "S#32404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29215", "S#32405", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29216", "S#32406", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29217", "S#32407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29218", "S#32408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29219", "S#32409", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29220", "S#32410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29221", "S#32411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29222", "S#2630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29223", "S#32412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29224", "S#32413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29225", "S#2644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29226", "S#2658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29227", "S#2637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29228", "S#2651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29229", "S#2811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29230", "S#2666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29231", "S#2673", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0417", "f29232", "DEFINE-REMOVAL-MODULE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29233", "DEFINE-REMOVAL-MODULE-TEST-INT", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29234", "S#32414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29235", "S#32415", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29236", "RUN-ALL-REMOVAL-MODULE-TESTS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29237", "RUN-REMOVAL-MODULE-TESTS-FOR-PRED", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29239", "S#32416", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29241", "S#32417", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29240", "S#32418", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29238", "S#32419", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29243", "S#32420", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29245", "S#32421", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29244", "S#32422", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29242", "S#9331", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29246", "S#32423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29248", "S#32424", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29250", "S#32425", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29251", "S#32426", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29247", "S#32427", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0417", "f29249", "S#32428", 5, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29253() {
        $g3409$ = SubLFiles.defconstant("S#32429", (SubLObject)$ic0$);
        $g3410$ = SubLFiles.deflexical("S#32430", (NIL != Symbols.boundp((SubLObject)$ic51$)) ? $g3410$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29254() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3409$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
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
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3409$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic50$));
        module0003.f57((SubLObject)$ic51$);
        module0012.f375((SubLObject)$ic65$, (SubLObject)$ic57$, (SubLObject)$ic66$);
        module0002.f38((SubLObject)$ic64$);
        module0002.f50((SubLObject)$ic64$, (SubLObject)$ic65$);
        module0002.f38((SubLObject)$ic77$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f29252();
    }
    
    public void initializeVariables() {
        f29253();
    }
    
    public void runTopLevelForms() {
        f29254();
    }
    
    static {
        me = (SubLFile)new module0417();
        $g3409$ = null;
        $g3410$ = null;
        $ic0$ = makeSymbol("S#32380", "CYC");
        $ic1$ = makeSymbol("S#2623", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#14781", "CYC"), makeSymbol("S#1519", "CYC"), makeSymbol("S#14349", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("S#5852", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#2607", "CYC"), makeSymbol("S#2605", "CYC"), makeSymbol("S#32372", "CYC"), makeSymbol("S#32373", "CYC"), makeSymbol("CREATOR"), makeSymbol("S#2608", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#32382", "CYC"), makeSymbol("S#32383", "CYC"), makeSymbol("S#32384", "CYC"), makeSymbol("S#32385", "CYC"), makeSymbol("S#32386", "CYC"), makeSymbol("S#32387", "CYC"), makeSymbol("S#32388", "CYC"), makeSymbol("S#32389", "CYC"), makeSymbol("S#32390", "CYC"), makeSymbol("S#32391", "CYC"), makeSymbol("S#32392", "CYC"), makeSymbol("S#32393", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#32394", "CYC"), makeSymbol("S#32395", "CYC"), makeSymbol("S#32396", "CYC"), makeSymbol("S#32397", "CYC"), makeSymbol("S#32398", "CYC"), makeSymbol("S#32399", "CYC"), makeSymbol("S#32400", "CYC"), makeSymbol("S#32401", "CYC"), makeSymbol("S#32402", "CYC"), makeSymbol("S#32403", "CYC"), makeSymbol("S#32404", "CYC"), makeSymbol("S#32405", "CYC") });
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#32381", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2623", "CYC"));
        $ic9$ = makeSymbol("S#32382", "CYC");
        $ic10$ = makeSymbol("S#32394", "CYC");
        $ic11$ = makeSymbol("S#32383", "CYC");
        $ic12$ = makeSymbol("S#32395", "CYC");
        $ic13$ = makeSymbol("S#32384", "CYC");
        $ic14$ = makeSymbol("S#32396", "CYC");
        $ic15$ = makeSymbol("S#32385", "CYC");
        $ic16$ = makeSymbol("S#32397", "CYC");
        $ic17$ = makeSymbol("S#32386", "CYC");
        $ic18$ = makeSymbol("S#32398", "CYC");
        $ic19$ = makeSymbol("S#32387", "CYC");
        $ic20$ = makeSymbol("S#32399", "CYC");
        $ic21$ = makeSymbol("S#32388", "CYC");
        $ic22$ = makeSymbol("S#32400", "CYC");
        $ic23$ = makeSymbol("S#32389", "CYC");
        $ic24$ = makeSymbol("S#32401", "CYC");
        $ic25$ = makeSymbol("S#32390", "CYC");
        $ic26$ = makeSymbol("S#32402", "CYC");
        $ic27$ = makeSymbol("S#32391", "CYC");
        $ic28$ = makeSymbol("S#32403", "CYC");
        $ic29$ = makeSymbol("S#32392", "CYC");
        $ic30$ = makeSymbol("S#32404", "CYC");
        $ic31$ = makeSymbol("S#32393", "CYC");
        $ic32$ = makeSymbol("S#32405", "CYC");
        $ic33$ = makeKeyword("HL-MODULE");
        $ic34$ = makeKeyword("ID");
        $ic35$ = makeKeyword("SENTENCE");
        $ic36$ = makeKeyword("MT");
        $ic37$ = makeKeyword("PROPERTIES");
        $ic38$ = makeKeyword("COMMENT");
        $ic39$ = makeKeyword("KB");
        $ic40$ = makeKeyword("OWNER");
        $ic41$ = makeKeyword("BUG-NUMBER");
        $ic42$ = makeKeyword("CREATION-DATE");
        $ic43$ = makeKeyword("CREATOR");
        $ic44$ = makeKeyword("WORKING?");
        $ic45$ = makeString("Invalid slot ~S for construction function");
        $ic46$ = makeKeyword("BEGIN");
        $ic47$ = makeSymbol("S#32406", "CYC");
        $ic48$ = makeKeyword("SLOT");
        $ic49$ = makeKeyword("END");
        $ic50$ = makeSymbol("S#32408", "CYC");
        $ic51$ = makeSymbol("S#32430", "CYC");
        $ic52$ = makeInteger(100);
        $ic53$ = makeSymbol("S#3846", "CYC");
        $ic54$ = makeSymbol("HL-MODULE-NAME");
        $ic55$ = makeSymbol("<");
        $ic56$ = makeSymbol("S#2609", "CYC");
        $ic57$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#29", "CYC"), makeSymbol("S#1519", "CYC"), makeSymbol("S#14349", "CYC"), makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("BaseKB"))), makeSymbol("S#5852", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("TINY")), makeSymbol("S#2605", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#32378", "CYC"), makeSymbol("S#32379", "CYC"), makeSymbol("CREATOR"), ConsesLow.list((SubLObject)makeSymbol("S#2608", "CYC"), (SubLObject)T) });
        $ic58$ = ConsesLow.list(new SubLObject[] { makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });
        $ic59$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic61$ = makeKeyword("TINY");
        $ic62$ = makeKeyword("BUG");
        $ic63$ = makeKeyword("CREATED");
        $ic64$ = makeSymbol("DEFINE-REMOVAL-MODULE-TEST-INT");
        $ic65$ = makeSymbol("DEFINE-REMOVAL-MODULE-TEST");
        $ic66$ = makeString("Define a removal module test number ID for the module named NAME.\n   The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\n  PROPERTIES, if not nil, specifies additional query properties to pass in.");
        $ic67$ = makeSymbol("STRINGP");
        $ic68$ = makeSymbol("S#2526", "CYC");
        $ic69$ = makeSymbol("S#32272", "CYC");
        $ic70$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic71$ = makeSymbol("S#4999", "CYC");
        $ic72$ = makeSymbol("BOOLEANP");
        $ic73$ = makeKeyword("STANDARD");
        $ic74$ = makeSymbol("S#2688", "CYC");
        $ic75$ = makeKeyword("TERSE");
        $ic76$ = makeKeyword("RMT");
        $ic77$ = makeSymbol("RUN-REMOVAL-MODULE-TESTS-FOR-PRED");
        $ic78$ = makeKeyword("SUCCESS");
        $ic79$ = makeKeyword("NOT-RUN");
        $ic80$ = makeKeyword("INVALID");
        $ic81$ = makeKeyword("UNSPECIFIED");
        $ic82$ = makeKeyword("ERROR");
        $ic83$ = makeKeyword("FAILURE");
        $ic84$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic85$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic86$ = makeKeyword("FAILURE-BINDINGS");
        $ic87$ = makeKeyword("FAILURE-HALT-REASON");
        $ic88$ = makeKeyword("FAILURE-REMOVAL-MODULE");
        $ic89$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic90$ = makeKeyword("BROWSABLE?");
        $ic91$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic92$ = makeKeyword("BLOCK?");
        $ic93$ = makeString("~&:RMT ~S ~S -> ");
        $ic94$ = makeKeyword("POST-BUILD");
        $ic95$ = makeString("Unknown output format ~A");
        $ic96$ = makeString("~S (~,3f)~%");
        $ic97$ = makeString("~S :RMT (~S ~S) (~,3f) :OWNER ~S~%");
    }
    
    public static final class $sX32380_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $id;
        public SubLObject $sentence;
        public SubLObject $mt;
        public SubLObject $properties;
        public SubLObject $comment;
        public SubLObject $kb;
        public SubLObject $owner;
        public SubLObject $bug_number;
        public SubLObject $creation_date;
        public SubLObject $creator;
        public SubLObject $workingP;
        public static final SubLStructDeclNative structDecl;
        
        public $sX32380_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
            this.$bug_number = (SubLObject)CommonSymbols.NIL;
            this.$creation_date = (SubLObject)CommonSymbols.NIL;
            this.$creator = (SubLObject)CommonSymbols.NIL;
            this.$workingP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$hl_module;
        }
        
        public SubLObject getField3() {
            return this.$id;
        }
        
        public SubLObject getField4() {
            return this.$sentence;
        }
        
        public SubLObject getField5() {
            return this.$mt;
        }
        
        public SubLObject getField6() {
            return this.$properties;
        }
        
        public SubLObject getField7() {
            return this.$comment;
        }
        
        public SubLObject getField8() {
            return this.$kb;
        }
        
        public SubLObject getField9() {
            return this.$owner;
        }
        
        public SubLObject getField10() {
            return this.$bug_number;
        }
        
        public SubLObject getField11() {
            return this.$creation_date;
        }
        
        public SubLObject getField12() {
            return this.$creator;
        }
        
        public SubLObject getField13() {
            return this.$workingP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$properties = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$kb = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$owner = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$bug_number = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$creation_date = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$creator = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$workingP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX32380_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f29191$UnaryFunction extends UnaryFunction
    {
        public $f29191$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2623"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f29191(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 314 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/