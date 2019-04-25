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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
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

public final class module0422 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0422";
    public static final String myFingerPrint = "1c1dd61986e15e833eef2f0e32e6dede0c605c1ea7642f87a7bcd03132df060b";
    public static SubLSymbol $g3438$;
    private static SubLSymbol $g3439$;
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
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
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
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    
    
    public static SubLObject f29473(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29474(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX32604_native.class) ? T : NIL);
    }
    
    public static SubLObject f29475(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f29476(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f29477(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f29478(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f29479(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f29480(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f29481(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f29482(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f29483(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f29484(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f29485(final SubLObject var1) {
        assert NIL != f29474(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f29486(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f29487(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f29488(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f29489(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f29490(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f29491(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f29492(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f29493(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f29494(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f29495(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f29496(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29474(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f29497(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX32604_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic31$)) {
                f29486(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic32$)) {
                f29487(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic33$)) {
                f29488(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic34$)) {
                f29489(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f29490(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f29491(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic37$)) {
                f29492(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f29493(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f29494(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f29495(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f29496(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic42$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f29498(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)ELEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic31$, f29475(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic32$, f29476(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic33$, f29477(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic34$, f29478(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic35$, f29479(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic36$, f29480(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic37$, f29481(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic38$, f29482(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic39$, f29483(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic40$, f29484(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic45$, (SubLObject)$ic41$, f29485(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic44$, (SubLObject)ELEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f29499(final SubLObject var11, final SubLObject var12) {
        return f29498(var11, var12);
    }
    
    public static SubLObject f29500() {
        SubLObject var13 = module0030.f1625($g3439$.getGlobalValue());
        var13 = Sort.sort(var13, Symbols.symbol_function((SubLObject)$ic50$), Symbols.symbol_function((SubLObject)$ic51$));
        return var13;
    }
    
    public static SubLObject f29501(final SubLObject var14) {
        SubLObject var15 = conses_high.copy_list(Hashtables.gethash(var14, $g3439$.getGlobalValue(), (SubLObject)UNPROVIDED));
        var15 = Sort.sort(var15, Symbols.symbol_function((SubLObject)$ic52$), Symbols.symbol_function((SubLObject)$ic11$));
        return var15;
    }
    
    public static SubLObject f29502(final SubLObject var14) {
        return module0035.sublisp_boolean(Hashtables.gethash(var14, $g3439$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29503(final SubLObject var16) {
        return (SubLObject)ConsesLow.list(module0340.f22825(f29475(var16)), f29476(var16), (SubLObject)$ic53$);
    }
    
    public static SubLObject f29504(final SubLObject var16) {
        return f29478(var16);
    }
    
    public static SubLObject f29505(final SubLObject var16) {
        return f29477(var16);
    }
    
    public static SubLObject f29506(final SubLObject var16) {
        return f29481(var16);
    }
    
    public static SubLObject f29507(final SubLObject var16) {
        return f29479(var16);
    }
    
    public static SubLObject f29508(final SubLObject var16) {
        return f29480(var16);
    }
    
    public static SubLObject f29509(final SubLObject var16) {
        return f29485(var16);
    }
    
    public static SubLObject f29510(final SubLObject var16) {
        final SubLObject var17 = f29475(var16);
        if (NIL != var17) {
            final SubLObject var18 = module0340.f22877(var17);
            return var18;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29511(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != module0035.f2439((SubLObject)$ic54$, f29504(var16), (SubLObject)UNPROVIDED) || NIL != module0035.f2439((SubLObject)$ic54$, f29505(var16), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29512(final SubLObject var16) {
        return Sequences.remove_duplicates(ConsesLow.append(module0205.f13183(f29504(var16), (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0205.f13183(f29505(var16), (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29513(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic55$);
        var22 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic55$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic55$);
        var24 = var21.first();
        var21 = var21.rest();
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = var21;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28_29 = (SubLObject)NIL;
        while (NIL != var26) {
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)$ic55$);
            var28_29 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)$ic55$);
            if (NIL == conses_high.member(var28_29, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var27 = (SubLObject)T;
            }
            if (var28_29 == $ic57$) {
                var25 = var26.first();
            }
            var26 = var26.rest();
        }
        if (NIL != var27 && NIL == var25) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic55$);
        }
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic34$, var21);
        final SubLObject var29 = (NIL != var28) ? conses_high.cadr(var28) : $ic58$;
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic36$, var21);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : $ic59$);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var21);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var21);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic60$, var21);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic61$, var21);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var21);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : NIL);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)$ic41$, var21);
        final SubLObject var43 = (SubLObject)((NIL != var42) ? conses_high.cadr(var42) : T);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic62$, var22, var23, var24, var29, var31, var33, var35, var37, var39, var41, var43 });
    }
    
    public static SubLObject f29514(final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var31, final SubLObject var33, final SubLObject var35, final SubLObject var37, final SubLObject var46, final SubLObject var47, final SubLObject var43, final SubLObject var45) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (NIL != var37 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var37)) {
            throw new AssertionError(var37);
        }
        assert NIL != module0029.f1472(var33) : var33;
        assert NIL != module0421.f29459(var35) : var35;
        if (NIL != var46 && !areAssertionsDisabledFor(me) && NIL == module0004.f105(var46)) {
            throw new AssertionError(var46);
        }
        if (NIL != var47 && !areAssertionsDisabledFor(me) && NIL == module0051.f3603(var47)) {
            throw new AssertionError(var47);
        }
        if (NIL != var43 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var43)) {
            throw new AssertionError(var43);
        }
        assert NIL != Types.booleanp(var45) : var45;
        final SubLObject var49 = module0340.f22786(var22);
        if (NIL != module0340.f22913(var49)) {
            final SubLObject var50 = f29497((SubLObject)ConsesLow.list(new SubLObject[] { $ic31$, var49, $ic32$, var23, $ic33$, var24, $ic34$, var31, $ic35$, var37, $ic36$, var33, $ic37$, var35, $ic38$, var46, $ic39$, var47, $ic40$, var43, $ic41$, var45 }));
            SubLObject var51 = Hashtables.gethash(var49, $g3439$.getGlobalValue(), (SubLObject)UNPROVIDED);
            var51 = Sequences.delete(var23, var51, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var51 = (SubLObject)ConsesLow.cons(var50, var51);
            Hashtables.sethash(var49, $g3439$.getGlobalValue(), var51);
            module0029.f1506(module0029.$g836$.getDynamicValue(var48), var50);
            return var50;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29515() {
        Hashtables.clrhash($g3439$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29516(SubLObject var51, SubLObject var2, SubLObject var52, SubLObject var53) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic70$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var52 == UNPROVIDED) {
            var52 = module0029.$g835$.getDynamicValue();
        }
        if (var53 == UNPROVIDED) {
            var53 = (SubLObject)NIL;
        }
        assert NIL != module0029.f1474(var51) : var51;
        return module0029.f1577(var2, (SubLObject)$ic72$, (SubLObject)NIL, var51, var52, (SubLObject)NIL, var53, (SubLObject)$ic73$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29517(final SubLObject var54, SubLObject var51, SubLObject var2) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic70$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != module0029.f1474(var51) : var51;
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var57;
        final SubLObject var56 = var57 = module0340.f22928(var54);
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            final SubLObject var59 = f29518(var58, var51, var2);
            var55 = ConsesLow.nconc(var55, var59);
            var57 = var57.rest();
            var58 = var57.first();
        }
        return var55;
    }
    
    public static SubLObject f29519(final SubLObject var22, SubLObject var51, SubLObject var2) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic70$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29520(var22, var51, var2);
    }
    
    public static SubLObject f29520(final SubLObject var22, SubLObject var51, SubLObject var2) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic70$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != module0029.f1474(var51) : var51;
        SubLObject var52 = (SubLObject)NIL;
        final SubLObject var53 = module0340.f22786(var22);
        if (NIL != module0340.f22913(var53)) {
            final SubLObject var54 = f29518(var53, var51, var2);
            var52 = ConsesLow.nconc(var52, var54);
        }
        return var52;
    }
    
    public static SubLObject f29518(final SubLObject var14, final SubLObject var51, final SubLObject var2) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = f29501(var14);
        SubLObject var54 = (SubLObject)NIL;
        var54 = var53.first();
        while (NIL != var53) {
            final SubLObject var55 = f29521(var54, var51, var2);
            var52 = (SubLObject)ConsesLow.cons(var55, var52);
            var53 = var53.rest();
            var54 = var53.first();
        }
        return Sequences.nreverse(var52);
    }
    
    public static SubLObject f29522(final SubLObject var22, final SubLObject var59, SubLObject var51, SubLObject var2) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic70$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29523(var22, var59, var51, var2);
    }
    
    public static SubLObject f29523(final SubLObject var22, final SubLObject var59, SubLObject var51, SubLObject var2) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic70$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != module0029.f1474(var51) : var51;
        final SubLObject var60 = module0340.f22786(var22);
        SubLObject var61 = (SubLObject)NIL;
        if (NIL != module0340.f22913(var60) && NIL == var61) {
            SubLObject var62 = f29501(var60);
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL == var61 && NIL != var62) {
                if (var59.numE(f29476(var63))) {
                    var61 = var63;
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
        }
        return f29521(var61, var51, var2);
    }
    
    public static SubLObject f29521(final SubLObject var16, SubLObject var51, SubLObject var2) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic70$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        assert NIL != f29474(var16) : var16;
        assert NIL != module0029.f1474(var51) : var51;
        final SubLObject var53 = f29503(var16);
        if (NIL == f29524(var16)) {
            return module0029.f1535((SubLObject)$ic73$, var53, (SubLObject)$ic74$, (SubLObject)NIL);
        }
        if (NIL != f29511(var16)) {
            return module0029.f1535((SubLObject)$ic73$, var53, (SubLObject)$ic75$, (SubLObject)NIL);
        }
        final SubLObject var54 = f29475(var16);
        final SubLObject var55 = f29477(var16);
        final SubLObject var56 = f29478(var16);
        f29525(var16, var51, var2);
        var52.resetMultipleValues();
        final SubLObject var57 = f29526(var54, var55, var56);
        final SubLObject var58 = var52.secondMultipleValue();
        var52.resetMultipleValues();
        final SubLObject var59 = module0029.f1535((SubLObject)$ic73$, var53, var57, var58);
        f29527(var16, var57, var58, var51, var2);
        return var59;
    }
    
    public static SubLObject f29524(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f29480(var16);
        if (NIL == module0421.f29447(var18, module0029.$g835$.getDynamicValue(var17))) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29526(final SubLObject var14, final SubLObject var24, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)$ic76$;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        try {
            var32.throwStack.push($ic77$);
            final SubLObject var36 = Errors.$error_handler$.currentBinding(var32);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic78$), var32);
                try {
                    final SubLObject var37 = Time.get_internal_real_time();
                    final SubLObject var38 = module0147.f9540(var31);
                    final SubLObject var66_69 = module0147.$g2095$.currentBinding(var32);
                    final SubLObject var39 = module0147.$g2094$.currentBinding(var32);
                    final SubLObject var40 = module0147.$g2096$.currentBinding(var32);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var38), var32);
                        module0147.$g2094$.bind(module0147.f9546(var38), var32);
                        module0147.$g2096$.bind(module0147.f9549(var38), var32);
                        final SubLObject var41 = module0340.f22861(var14, var24, (SubLObject)$ic79$);
                        SubLObject var42 = (SubLObject)ZERO_INTEGER;
                        var32.resetMultipleValues();
                        final SubLObject var43 = module0376.f26673((SubLObject)$ic80$, var14, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var44 = var32.secondMultipleValue();
                        var32.resetMultipleValues();
                        if (NIL != var43) {
                            if (var43.isList()) {
                                var42 = Sequences.length(var43);
                            }
                            else if (NIL != module0052.f3674(var43)) {
                                SubLObject var45 = (SubLObject)ZERO_INTEGER;
                                final SubLObject var66_70 = module0347.$g2970$.currentBinding(var32);
                                try {
                                    module0347.$g2970$.bind((SubLObject)$ic79$, var32);
                                    SubLObject var48;
                                    for (SubLObject var46 = (SubLObject)NIL; NIL == var46; var46 = (SubLObject)makeBoolean(NIL == var48)) {
                                        var32.resetMultipleValues();
                                        final SubLObject var47 = module0052.f3693(var43);
                                        var48 = var32.secondMultipleValue();
                                        var32.resetMultipleValues();
                                        if (NIL != var48) {
                                            var32.resetMultipleValues();
                                            final SubLObject var49 = module0376.f26673((SubLObject)$ic81$, var24, var14, var47, var44, (SubLObject)UNPROVIDED);
                                            final SubLObject var50 = var32.secondMultipleValue();
                                            final SubLObject var51 = var32.thirdMultipleValue();
                                            final SubLObject var52 = var32.fourthMultipleValue();
                                            var32.resetMultipleValues();
                                            if (NIL != var49) {
                                                var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
                                            }
                                            var42 = var45;
                                        }
                                    }
                                }
                                finally {
                                    module0347.$g2970$.rebind(var66_70, var32);
                                }
                            }
                        }
                        var33 = f29528(var41, var42);
                    }
                    finally {
                        module0147.$g2096$.rebind(var40, var32);
                        module0147.$g2094$.rebind(var39, var32);
                        module0147.$g2095$.rebind(var66_69, var32);
                    }
                    var34 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var37), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                catch (Throwable var53) {
                    Errors.handleThrowable(var53, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var36, var32);
            }
        }
        catch (Throwable var54) {
            var35 = Errors.handleThrowable(var54, (SubLObject)$ic77$);
        }
        finally {
            var32.throwStack.pop();
        }
        return Values.values(var33, var34);
    }
    
    public static SubLObject f29528(final SubLObject var72, final SubLObject var73) {
        if (var72.numLE(Numbers.multiply(var73, (SubLObject)THREE_INTEGER)) && var72.numGE(Numbers.subtract(var73, (SubLObject)THREE_INTEGER))) {
            return (SubLObject)$ic82$;
        }
        return (SubLObject)$ic83$;
    }
    
    public static SubLObject f29525(final SubLObject var16, final SubLObject var51, final SubLObject var2) {
        if (var51.eql((SubLObject)$ic70$)) {
            final SubLObject var52 = f29475(var16);
            final SubLObject var53 = module0340.f22825(var52);
            final SubLObject var54 = f29476(var16);
            PrintLow.format(var2, (SubLObject)$ic84$, var53, var54);
            streams_high.force_output(var2);
        }
        else if (!var51.eql((SubLObject)$ic85$)) {
            PrintLow.format(var2, (SubLObject)$ic86$, var51);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29527(final SubLObject var16, final SubLObject var61, final SubLObject var62, final SubLObject var51, final SubLObject var2) {
        if (var51.eql((SubLObject)$ic70$)) {
            PrintLow.format(var2, (SubLObject)$ic87$, var61, var62);
            streams_high.force_output(var2);
        }
        else if (var51.eql((SubLObject)$ic85$)) {
            final SubLObject var63 = f29475(var16);
            final SubLObject var64 = module0340.f22825(var63);
            final SubLObject var65 = f29476(var16);
            final SubLObject var66 = f29481(var16);
            PrintLow.format(var2, (SubLObject)$ic88$, new SubLObject[] { var61, var64, var65, var62, var66 });
            streams_high.force_output(var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic86$, var51);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29529() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29473", "S#32605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29474", "S#2624", 1, 0, false);
        new $f29474$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29475", "S#32606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29476", "S#32607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29477", "S#32608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29478", "S#32609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29479", "S#32610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29480", "S#32611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29481", "S#32612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29482", "S#32613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29483", "S#32614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29484", "S#32615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29485", "S#32616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29486", "S#32617", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29487", "S#32618", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29488", "S#32619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29489", "S#32620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29490", "S#32621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29491", "S#32622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29492", "S#32623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29493", "S#32624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29494", "S#32625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29495", "S#32626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29496", "S#32627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29497", "S#32628", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29498", "S#32629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29499", "S#32630", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29500", "S#32631", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29501", "S#32632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29502", "S#32633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29503", "S#2632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29504", "S#32634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29505", "S#32635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29506", "S#2646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29507", "S#2660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29508", "S#2639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29509", "S#2653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29510", "S#2812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29511", "S#2668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29512", "S#2675", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0422", "f29513", "DEFINE-REMOVAL-MODULE-COST-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29514", "S#32636", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29515", "S#32637", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29516", "S#32638", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29517", "S#32639", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29519", "S#32640", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29520", "S#32641", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29518", "S#32642", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29522", "S#32643", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29523", "S#32644", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29521", "S#9333", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29524", "S#32645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29526", "S#32646", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29528", "S#32647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29525", "S#32648", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0422", "f29527", "S#32649", 5, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29530() {
        $g3438$ = SubLFiles.defconstant("S#32650", (SubLObject)$ic0$);
        $g3439$ = SubLFiles.deflexical("S#32651", (NIL != Symbols.boundp((SubLObject)$ic48$)) ? $g3439$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29531() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3438$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
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
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3438$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic47$));
        module0003.f57((SubLObject)$ic48$);
        module0002.f50((SubLObject)$ic62$, (SubLObject)$ic63$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f29529();
    }
    
    public void initializeVariables() {
        f29530();
    }
    
    public void runTopLevelForms() {
        f29531();
    }
    
    static {
        me = (SubLFile)new module0422();
        $g3438$ = null;
        $g3439$ = null;
        $ic0$ = makeSymbol("S#32604", "CYC");
        $ic1$ = makeSymbol("S#2624", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#14781", "CYC"), makeSymbol("S#1519", "CYC"), makeSymbol("S#14349", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#2607", "CYC"), makeSymbol("S#2605", "CYC"), makeSymbol("S#32372", "CYC"), makeSymbol("S#32373", "CYC"), makeSymbol("CREATOR"), makeSymbol("S#2608", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#32606", "CYC"), makeSymbol("S#32607", "CYC"), makeSymbol("S#32608", "CYC"), makeSymbol("S#32609", "CYC"), makeSymbol("S#32610", "CYC"), makeSymbol("S#32611", "CYC"), makeSymbol("S#32612", "CYC"), makeSymbol("S#32613", "CYC"), makeSymbol("S#32614", "CYC"), makeSymbol("S#32615", "CYC"), makeSymbol("S#32616", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#32617", "CYC"), makeSymbol("S#32618", "CYC"), makeSymbol("S#32619", "CYC"), makeSymbol("S#32620", "CYC"), makeSymbol("S#32621", "CYC"), makeSymbol("S#32622", "CYC"), makeSymbol("S#32623", "CYC"), makeSymbol("S#32624", "CYC"), makeSymbol("S#32625", "CYC"), makeSymbol("S#32626", "CYC"), makeSymbol("S#32627", "CYC") });
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#32605", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2624", "CYC"));
        $ic9$ = makeSymbol("S#32606", "CYC");
        $ic10$ = makeSymbol("S#32617", "CYC");
        $ic11$ = makeSymbol("S#32607", "CYC");
        $ic12$ = makeSymbol("S#32618", "CYC");
        $ic13$ = makeSymbol("S#32608", "CYC");
        $ic14$ = makeSymbol("S#32619", "CYC");
        $ic15$ = makeSymbol("S#32609", "CYC");
        $ic16$ = makeSymbol("S#32620", "CYC");
        $ic17$ = makeSymbol("S#32610", "CYC");
        $ic18$ = makeSymbol("S#32621", "CYC");
        $ic19$ = makeSymbol("S#32611", "CYC");
        $ic20$ = makeSymbol("S#32622", "CYC");
        $ic21$ = makeSymbol("S#32612", "CYC");
        $ic22$ = makeSymbol("S#32623", "CYC");
        $ic23$ = makeSymbol("S#32613", "CYC");
        $ic24$ = makeSymbol("S#32624", "CYC");
        $ic25$ = makeSymbol("S#32614", "CYC");
        $ic26$ = makeSymbol("S#32625", "CYC");
        $ic27$ = makeSymbol("S#32615", "CYC");
        $ic28$ = makeSymbol("S#32626", "CYC");
        $ic29$ = makeSymbol("S#32616", "CYC");
        $ic30$ = makeSymbol("S#32627", "CYC");
        $ic31$ = makeKeyword("HL-MODULE");
        $ic32$ = makeKeyword("ID");
        $ic33$ = makeKeyword("SENTENCE");
        $ic34$ = makeKeyword("MT");
        $ic35$ = makeKeyword("COMMENT");
        $ic36$ = makeKeyword("KB");
        $ic37$ = makeKeyword("OWNER");
        $ic38$ = makeKeyword("BUG-NUMBER");
        $ic39$ = makeKeyword("CREATION-DATE");
        $ic40$ = makeKeyword("CREATOR");
        $ic41$ = makeKeyword("WORKING?");
        $ic42$ = makeString("Invalid slot ~S for construction function");
        $ic43$ = makeKeyword("BEGIN");
        $ic44$ = makeSymbol("S#32628", "CYC");
        $ic45$ = makeKeyword("SLOT");
        $ic46$ = makeKeyword("END");
        $ic47$ = makeSymbol("S#32630", "CYC");
        $ic48$ = makeSymbol("S#32651", "CYC");
        $ic49$ = makeInteger(100);
        $ic50$ = makeSymbol("S#3846", "CYC");
        $ic51$ = makeSymbol("HL-MODULE-NAME");
        $ic52$ = makeSymbol("<");
        $ic53$ = makeKeyword("COST");
        $ic54$ = makeSymbol("S#2609", "CYC");
        $ic55$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#29", "CYC"), makeSymbol("S#1519", "CYC"), makeSymbol("S#14349", "CYC"), makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"))), ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("TINY")), makeSymbol("S#2605", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#32378", "CYC"), makeSymbol("S#32379", "CYC"), makeSymbol("CREATOR"), ConsesLow.list((SubLObject)makeSymbol("S#2608", "CYC"), (SubLObject)T) });
        $ic56$ = ConsesLow.list((SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("OWNER"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("BUG"), (SubLObject)makeKeyword("CREATED"), (SubLObject)makeKeyword("CREATOR"), (SubLObject)makeKeyword("WORKING?"));
        $ic57$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic59$ = makeKeyword("TINY");
        $ic60$ = makeKeyword("BUG");
        $ic61$ = makeKeyword("CREATED");
        $ic62$ = makeSymbol("S#32636", "CYC");
        $ic63$ = makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST");
        $ic64$ = makeSymbol("STRINGP");
        $ic65$ = makeSymbol("S#2526", "CYC");
        $ic66$ = makeSymbol("S#32272", "CYC");
        $ic67$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic68$ = makeSymbol("S#4999", "CYC");
        $ic69$ = makeSymbol("BOOLEANP");
        $ic70$ = makeKeyword("STANDARD");
        $ic71$ = makeSymbol("S#2688", "CYC");
        $ic72$ = makeKeyword("TERSE");
        $ic73$ = makeKeyword("RMCT");
        $ic74$ = makeKeyword("NOT-RUN");
        $ic75$ = makeKeyword("INVALID");
        $ic76$ = makeKeyword("ERROR");
        $ic77$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic78$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic79$ = makeKeyword("POS");
        $ic80$ = makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");
        $ic81$ = makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");
        $ic82$ = makeKeyword("SUCCESS");
        $ic83$ = makeKeyword("FAILURE");
        $ic84$ = makeString("~&:RMCT ~S ~S -> ");
        $ic85$ = makeKeyword("POST-BUILD");
        $ic86$ = makeString("Unknown output format ~A");
        $ic87$ = makeString("~S (~,3f)~%");
        $ic88$ = makeString("~S :RMCT (~S ~S) (~,3f) :OWNER ~S~%");
    }
    
    public static final class $sX32604_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $id;
        public SubLObject $sentence;
        public SubLObject $mt;
        public SubLObject $comment;
        public SubLObject $kb;
        public SubLObject $owner;
        public SubLObject $bug_number;
        public SubLObject $creation_date;
        public SubLObject $creator;
        public SubLObject $workingP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX32604_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
            this.$bug_number = (SubLObject)CommonSymbols.NIL;
            this.$creation_date = (SubLObject)CommonSymbols.NIL;
            this.$creator = (SubLObject)CommonSymbols.NIL;
            this.$workingP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX32604_native.structDecl;
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
            return this.$comment;
        }
        
        public SubLObject getField7() {
            return this.$kb;
        }
        
        public SubLObject getField8() {
            return this.$owner;
        }
        
        public SubLObject getField9() {
            return this.$bug_number;
        }
        
        public SubLObject getField10() {
            return this.$creation_date;
        }
        
        public SubLObject getField11() {
            return this.$creator;
        }
        
        public SubLObject getField12() {
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
            return this.$comment = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$kb = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$owner = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$bug_number = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$creation_date = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$creator = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$workingP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX32604_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$hl_module", "$id", "$sentence", "$mt", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f29474$UnaryFunction extends UnaryFunction
    {
        public $f29474$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2624"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f29474(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 280 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/