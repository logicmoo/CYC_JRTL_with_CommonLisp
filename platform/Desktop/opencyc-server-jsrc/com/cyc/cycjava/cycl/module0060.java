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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0060 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0060";
    public static final String myFingerPrint = "175f2dec46f9b5e54e7bcbc3f6d65e75d0e56a6a2b1a689894bf45738506f5e7";
    public static SubLSymbol $g1050$;
    private static SubLSymbol $g1051$;
    private static SubLSymbol $g1052$;
    private static SubLSymbol $g1053$;
    private static SubLSymbol $g1054$;
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
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLFloat $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    
    public static SubLObject f4359(final SubLObject var1, final SubLObject var2) {
        f4360(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4361(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5860_native.class) ? T : NIL);
    }
    
    public static SubLObject f4362(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4363(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4364(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4365(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4366(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f4367(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f4368(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f4369(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f4370(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f4371(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f4372(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f4373(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f4374(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f4375(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f4376(final SubLObject var1) {
        assert NIL != f4361(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f4377(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4378(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4379(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4380(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4381(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f4382(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f4383(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f4384(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f4385(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f4386(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f4387(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f4388(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f4389(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f4390(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f4391(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4361(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f4392(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5860_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic39$)) {
                f4377(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f4378(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f4379(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f4380(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f4381(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f4382(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f4383(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic46$)) {
                f4384(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic47$)) {
                f4385(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic48$)) {
                f4386(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic49$)) {
                f4387(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic50$)) {
                f4388(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic51$)) {
                f4389(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic52$)) {
                f4390(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic53$)) {
                f4391(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic54$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4393(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic39$, f4362(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic40$, f4363(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic41$, f4364(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic42$, f4365(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic43$, f4366(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic44$, f4367(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic45$, f4368(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic46$, f4369(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic47$, f4370(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic48$, f4371(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic49$, f4372(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic50$, f4373(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic51$, f4374(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic52$, f4375(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic53$, f4376(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic58$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f4394(final SubLObject var11, final SubLObject var12) {
        return f4393(var11, var12);
    }
    
    public static SubLObject f4360(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        streams_high.write_string((SubLObject)$ic60$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        PrintLow.format(var2, (SubLObject)$ic61$, new SubLObject[] { f4363(var13), f4372(var13), f4364(var13), f4365(var13), f4362(var13) });
        streams_high.write_string((SubLObject)$ic62$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f4395(final SubLObject var13) {
        return (SubLObject)makeBoolean((var13.isStream() && NIL != streams_high.input_stream_p(var13)) || var13 == $ic63$ || var13.isString());
    }
    
    public static SubLObject f4396(final SubLObject var13) {
        return (SubLObject)makeBoolean((var13.isStream() && NIL != streams_high.output_stream_p(var13)) || var13 == $ic63$ || var13.isString());
    }
    
    public static SubLObject f4397(final SubLObject var13) {
        return (SubLObject)makeBoolean((var13.isStream() && NIL != streams_high.output_stream_p(var13)) || var13 == $ic63$ || var13 == $ic64$ || var13.isString());
    }
    
    public static SubLObject f4398(final SubLObject var13) {
        return module0004.f104(var13, $g1051$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f4399(final SubLObject var13) {
        return f4361(var13);
    }
    
    public static SubLObject f4400() {
        final SubLObject var15 = $g1052$.getGlobalValue();
        SubLObject var16 = (SubLObject)NIL;
        try {
            var16 = Locks.seize_lock(var15);
            $g1053$.setGlobalValue((SubLObject)NIL);
        }
        finally {
            if (NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return $g1053$.getGlobalValue();
    }
    
    public static SubLObject f4401() {
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = $g1052$.getGlobalValue();
        SubLObject var19 = (SubLObject)NIL;
        try {
            var19 = Locks.seize_lock(var18);
            var17 = conses_high.copy_list($g1053$.getGlobalValue());
        }
        finally {
            if (NIL != var19) {
                Locks.release_lock(var18);
            }
        }
        return var17;
    }
    
    public static SubLObject f4402() {
        SubLObject var20 = f4401();
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic69$, new SubLObject[] { f4403(var21), f4404(var21), f4405(var21), f4406(var21) });
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4407(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = f4401();
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            if (f4403(var25).equal(var22)) {
                var23 = (SubLObject)ConsesLow.cons(var25, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var23;
    }
    
    public static SubLObject f4408(final SubLObject var22) {
        SubLObject var23 = f4407(var22);
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            f4409(var24);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4410(final SubLObject var21) {
        final SubLObject var22 = $g1052$.getGlobalValue();
        SubLObject var23 = (SubLObject)NIL;
        try {
            var23 = Locks.seize_lock(var22);
            $g1053$.setGlobalValue((SubLObject)ConsesLow.cons(var21, $g1053$.getGlobalValue()));
        }
        finally {
            if (NIL != var23) {
                Locks.release_lock(var22);
            }
        }
        return var21;
    }
    
    public static SubLObject f4411(final SubLObject var21, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLObject var28 = $g1052$.getGlobalValue();
        SubLObject var29 = (SubLObject)NIL;
        try {
            var29 = Locks.seize_lock(var28);
            if (NIL != var27 && NIL == Sequences.find(var21, $g1053$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic70$, var21);
            }
            $g1053$.setGlobalValue(Sequences.delete(var21, $g1053$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var29) {
                Locks.release_lock(var28);
            }
        }
        return var21;
    }
    
    public static SubLObject f4412(final SubLObject var22, final SubLObject var30, SubLObject var31, SubLObject var32, SubLObject var33, SubLObject var34) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var32 == UNPROVIDED) {
            var32 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var33 == UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)$ic64$;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var22) : var22;
        assert NIL != Types.stringp(var30) : var30;
        assert NIL != Types.sequencep(var31) : var31;
        assert NIL != f4395(var32) : var32;
        assert NIL != f4397(var34) : var34;
        assert NIL != f4396(var33) : var33;
        final SubLObject var36 = f4392((SubLObject)UNPROVIDED);
        f4388(var36, Time.get_internal_real_time());
        f4387(var36, (SubLObject)$ic76$);
        f4378(var36, var22);
        f4379(var36, var30);
        f4380(var36, var31);
        if (var32.isString() || var32 == $ic63$) {
            f4382(var36, var32);
        }
        if (var33.isString() || var33 == $ic63$) {
            f4384(var36, var33);
        }
        if (var34.isString() || var34 == $ic63$) {
            f4386(var36, var34);
        }
        var35.resetMultipleValues();
        final SubLObject var37 = f4413(var30, var31, var32, var33, var34);
        final SubLObject var38 = var35.secondMultipleValue();
        final SubLObject var39 = var35.thirdMultipleValue();
        final SubLObject var40 = var35.fourthMultipleValue();
        var35.resetMultipleValues();
        f4377(var36, var40);
        if (NIL != f4414(var40)) {
            f4387(var36, (SubLObject)$ic77$);
            f4410(var36);
        }
        else {
            f4387(var36, (SubLObject)$ic78$);
        }
        f4381(var36, var37);
        f4383(var36, var38);
        f4385(var36, var39);
        return var36;
    }
    
    public static SubLObject f4414(final SubLObject var39) {
        return Types.integerp(var39);
    }
    
    public static SubLObject f4415(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        f4416(var21, (SubLObject)UNPROVIDED);
        return Equality.eq((SubLObject)$ic77$, f4372(var21));
    }
    
    public static SubLObject f4417(final SubLObject var40) {
        SubLObject var41 = var40;
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            f4418(var42);
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var40;
    }
    
    public static SubLObject f4418(final SubLObject var21) {
        while (NIL != f4415(var21)) {
            Threads.sleep((SubLObject)$ic80$);
        }
        return f4419(var21);
    }
    
    public static SubLObject f4413(final SubLObject var30, final SubLObject var31, final SubLObject var41, final SubLObject var42, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = f4420();
        final SubLObject var46 = var41.eql(StreamsLow.$null_input$.getDynamicValue(var44)) ? var45 : var41;
        final SubLObject var47 = var42.eql(StreamsLow.$null_output$.getDynamicValue(var44)) ? var45 : var42;
        final SubLObject var48 = var43.eql(StreamsLow.$null_output$.getDynamicValue(var44)) ? var45 : var43;
        if (NIL == Processes.external_processes_supportedP()) {
            return Errors.error((SubLObject)$ic81$);
        }
        return Processes.run_external_process(var30, var31, var46, var47, var48);
    }
    
    public static SubLObject f4420() {
        return Filesys.canonical_null_file_stream_path();
    }
    
    public static SubLObject f4421(final SubLObject var30, final SubLObject var31) {
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        try {
            var33 = streams_high.make_private_string_output_stream();
            streams_high.write_string(module0038.f2624(var30), var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var31.isSequence()) {
                for (SubLObject var34 = var31, var35 = (SubLObject)(var34.isList() ? NIL : Sequences.length(var34)), var36 = (SubLObject)ZERO_INTEGER, var37 = module0005.f149(var36, var35, var34); NIL == var37; var37 = module0005.f149(var36, var35, var34)) {
                    final SubLObject var38 = module0005.f150(var36, var34);
                    streams_high.write_string((SubLObject)$ic82$, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    streams_high.write_string(module0038.f2624(var38), var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var34 = module0005.f151(var34);
                    var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER);
                }
            }
            else {
                streams_high.write_string((SubLObject)$ic82$, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.write_string(module0038.f2624(var31), var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var32 = streams_high.get_output_stream_string(var33);
        }
        finally {
            final SubLObject var39 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var33, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var39);
            }
        }
        return var32;
    }
    
    public static SubLObject f4405(final SubLObject var21) {
        final SubLObject var22 = f4422(var21);
        final SubLObject var23 = f4423(var21);
        return f4421(var22, var23);
    }
    
    public static SubLObject f4416(final SubLObject var21, SubLObject var55) {
        if (var55 == UNPROVIDED) {
            var55 = (SubLObject)NIL;
        }
        if ($ic77$ == f4372(var21)) {
            final SubLObject var56 = f4424(var21, var55);
            if (var56.isFixnum()) {
                f4389(var21, Time.get_internal_real_time());
                f4390(var21, var56);
                f4387(var21, (SubLObject)$ic83$);
                f4411(var21, (SubLObject)UNPROVIDED);
            }
        }
        return var21;
    }
    
    public static SubLObject f4424(final SubLObject var21, SubLObject var55) {
        if (var55 == UNPROVIDED) {
            var55 = (SubLObject)NIL;
        }
        final SubLThread var56 = SubLProcess.currentSubLThread();
        var56.resetMultipleValues();
        SubLObject var57 = f4425(var21, var55);
        final SubLObject var58 = var56.secondMultipleValue();
        var56.resetMultipleValues();
        if (!var58.eql(f4362(var21))) {
            var57 = (SubLObject)MINUS_ONE_INTEGER;
        }
        return var57;
    }
    
    public static SubLObject f4425(final SubLObject var21, final SubLObject var55) {
        if (NIL == Processes.external_processes_supportedP()) {
            return Errors.error((SubLObject)$ic84$);
        }
        return Processes.get_external_process_status(f4362(var21), var55);
    }
    
    public static SubLObject f4409(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        if (NIL != f4415(var21)) {
            f4426(var21);
        }
        return var21;
    }
    
    public static SubLObject f4427(final SubLObject var21) {
        if (NIL == f4415(var21)) {
            if (NIL != f4428(var21) && f4429(var21).isStream()) {
                streams_high.close(f4429(var21), (SubLObject)UNPROVIDED);
            }
            f4381(var21, (SubLObject)NIL);
            if (NIL != f4430(var21) && f4431(var21).isStream()) {
                streams_high.close(f4431(var21), (SubLObject)UNPROVIDED);
            }
            f4383(var21, (SubLObject)NIL);
            if (NIL != f4432(var21) && f4433(var21).isStream()) {
                streams_high.close(f4433(var21), (SubLObject)UNPROVIDED);
            }
            f4385(var21, (SubLObject)NIL);
        }
        return var21;
    }
    
    public static SubLObject f4434(final SubLObject var24) {
        if (NIL != f4415(var24)) {
            f4409(var24);
        }
        return f4427(var24);
    }
    
    public static SubLObject f4426(final SubLObject var21) {
        final SubLObject var22 = f4404(var21);
        final SubLObject var23 = Processes.kill_external_process(var22);
        f4416(var21, var23);
        return var21;
    }
    
    public static SubLObject f4435(final SubLObject var59, final SubLObject var60) {
        SubLObject var62;
        final SubLObject var61 = var62 = var59.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic85$);
        final SubLObject var63 = var62.rest();
        var62 = var62.first();
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic85$);
        var64 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic85$);
        var65 = var62.first();
        var62 = var62.rest();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = var62;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69_70 = (SubLObject)NIL;
        while (NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)$ic85$);
            var69_70 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)$ic85$);
            if (NIL == conses_high.member(var69_70, (SubLObject)$ic86$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var68 = (SubLObject)T;
            }
            if (var69_70 == $ic87$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (NIL != var68 && NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)$ic85$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var62);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? conses_high.cadr(var69) : NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var62);
        final SubLObject var72 = (SubLObject)((NIL != var71) ? conses_high.cadr(var71) : $ic89$);
        final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var62);
        final SubLObject var74 = (SubLObject)((NIL != var73) ? conses_high.cadr(var73) : $ic91$);
        final SubLObject var75 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var62);
        final SubLObject var76 = (SubLObject)((NIL != var75) ? conses_high.cadr(var75) : $ic93$);
        final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var62);
        final SubLObject var78 = (SubLObject)((NIL != var77) ? conses_high.cadr(var77) : $ic64$);
        final SubLObject var79;
        var62 = (var79 = var63);
        return (SubLObject)ConsesLow.list((SubLObject)$ic95$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var64, (SubLObject)ConsesLow.list((SubLObject)$ic96$, var72, var65, var70, var74, var76, var78))), (SubLObject)ConsesLow.list((SubLObject)$ic97$, reader.bq_cons((SubLObject)$ic98$, ConsesLow.append(var79, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic99$, var64)));
    }
    
    public static SubLObject f4436(final SubLObject var59, final SubLObject var60) {
        SubLObject var62;
        final SubLObject var61 = var62 = var59.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic85$);
        final SubLObject var63 = var62.rest();
        var62 = var62.first();
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic85$);
        var64 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic85$);
        var65 = var62.first();
        var62 = var62.rest();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = var62;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var83_84 = (SubLObject)NIL;
        while (NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)$ic85$);
            var83_84 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)$ic85$);
            if (NIL == conses_high.member(var83_84, (SubLObject)$ic86$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var68 = (SubLObject)T;
            }
            if (var83_84 == $ic87$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (NIL != var68 && NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)$ic85$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var62);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? conses_high.cadr(var69) : NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var62);
        final SubLObject var72 = (SubLObject)((NIL != var71) ? conses_high.cadr(var71) : $ic89$);
        final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var62);
        final SubLObject var74 = (SubLObject)((NIL != var73) ? conses_high.cadr(var73) : $ic91$);
        final SubLObject var75 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var62);
        final SubLObject var76 = (SubLObject)((NIL != var75) ? conses_high.cadr(var75) : $ic93$);
        final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var62);
        final SubLObject var78 = (SubLObject)((NIL != var77) ? conses_high.cadr(var77) : $ic64$);
        final SubLObject var79;
        var62 = (var79 = var63);
        return (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)ConsesLow.list(new SubLObject[] { var64, var65, $ic88$, var70, $ic40$, var72, $ic90$, var74, $ic92$, var76, $ic94$, var78 }), (SubLObject)ConsesLow.list((SubLObject)$ic101$, var64), reader.bq_cons((SubLObject)$ic98$, ConsesLow.append(var79, (SubLObject)NIL)));
    }
    
    public static SubLObject f4437(final SubLObject var65, SubLObject var31, SubLObject var32, SubLObject var33, SubLObject var34) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var32 == UNPROVIDED) {
            var32 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var33 == UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)$ic64$;
        }
        SubLObject var66 = (SubLObject)MINUS_ONE_INTEGER;
        final SubLObject var67 = f4412((SubLObject)$ic102$, var65, var31, var32, var33, var34);
        try {
            f4418(var67);
            var66 = f4419(var67);
        }
        finally {
            final SubLObject var68 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f4434(var67);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var68);
            }
        }
        return var66;
    }
    
    public static SubLObject f4438(final SubLObject var65, SubLObject var31, SubLObject var90, SubLObject var32, SubLObject var33, SubLObject var34) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)ZERO_INTEGER;
        }
        if (var32 == UNPROVIDED) {
            var32 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var33 == UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)$ic64$;
        }
        final SubLObject var91 = f4437(var65, var31, var32, var33, var34);
        return Equality.eql(var91, var90);
    }
    
    public static SubLObject f4439(final SubLObject var65, SubLObject var31, SubLObject var90, SubLObject var32) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)ZERO_INTEGER;
        }
        if (var32 == UNPROVIDED) {
            var32 = StreamsLow.$null_input$.getDynamicValue();
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)MINUS_ONE_INTEGER;
        final SubLObject var93 = module0075.f5184((SubLObject)UNPROVIDED);
        final SubLObject var94 = Sequences.cconcatenate((SubLObject)$ic103$, module0006.f203(var93));
        final SubLObject var95 = f4412(var94, var65, var31, var32, var93, (SubLObject)$ic64$);
        try {
            f4418(var95);
            var92 = f4419(var95);
        }
        finally {
            final SubLObject var96 = Threads.$is_thread_performing_cleanupP$.currentBinding(var91);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var91);
                f4434(var95);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var96, var91);
            }
        }
        final SubLObject var97 = module0075.f5235(var93);
        final SubLObject var98 = Equality.eql(var92, var90);
        SubLObject var99 = (SubLObject)NIL;
        try {
            var91.throwStack.push($ic104$);
            final SubLObject var96 = Errors.$error_handler$.currentBinding(var91);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic105$), var91);
                try {
                    Filesys.delete_file(var93);
                }
                catch (Throwable var100) {
                    Errors.handleThrowable(var100, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var96, var91);
            }
        }
        catch (Throwable var101) {
            var99 = Errors.handleThrowable(var101, (SubLObject)$ic104$);
        }
        finally {
            var91.throwStack.pop();
        }
        return Values.values(var97, var98);
    }
    
    public static SubLObject f4404(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4362(var21);
    }
    
    public static SubLObject f4423(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4365(var21);
    }
    
    public static SubLObject f4419(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4375(var21);
    }
    
    public static SubLObject f4440(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4374(var21);
    }
    
    public static SubLObject f4403(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4363(var21);
    }
    
    public static SubLObject f4422(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4364(var21);
    }
    
    public static SubLObject f4441(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4373(var21);
    }
    
    public static SubLObject f4406(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        f4416(var21, (SubLObject)UNPROVIDED);
        return f4372(var21);
    }
    
    public static SubLObject f4432(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4371(var21);
    }
    
    public static SubLObject f4433(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4370(var21);
    }
    
    public static SubLObject f4428(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4367(var21);
    }
    
    public static SubLObject f4429(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4366(var21);
    }
    
    public static SubLObject f4430(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4369(var21);
    }
    
    public static SubLObject f4431(final SubLObject var21) {
        assert NIL != f4399(var21) : var21;
        return f4368(var21);
    }
    
    public static SubLObject f4442(final SubLObject var97, SubLObject var98, SubLObject var99) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)NIL;
        final SubLObject var102 = $g1054$.currentBinding(var100);
        try {
            $g1054$.bind(var97, var100);
            var101 = Processes.fork_process((SubLObject)$ic107$, var98, var99);
        }
        finally {
            $g1054$.rebind(var102, var100);
        }
        return var101;
    }
    
    public static SubLObject f4443() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        final SubLObject var36 = $g1054$.getDynamicValue(var35);
        module0107.f7585();
        return Functions.funcall(var36);
    }
    
    public static SubLObject f4444() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4359", "S#5864", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4361", "S#5861", 1, 0, false);
        new $f4361$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4362", "S#5865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4363", "S#5866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4364", "S#5867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4365", "S#5868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4366", "S#5869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4367", "S#5870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4368", "S#5871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4369", "S#5872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4370", "S#5873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4371", "S#5874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4372", "S#5875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4373", "S#5876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4374", "S#5877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4375", "S#5878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4376", "S#5879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4377", "S#5880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4378", "S#5881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4379", "S#5882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4380", "S#5883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4381", "S#5884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4382", "S#5885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4383", "S#5886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4384", "S#5887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4385", "S#5888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4386", "S#5889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4387", "S#5890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4388", "S#5891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4389", "S#5892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4390", "S#5893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4391", "S#5894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4392", "S#5895", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4393", "S#5896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4394", "S#5897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4360", "S#5898", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4395", "S#5899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4396", "S#5900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4397", "S#5901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4398", "S#5902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4399", "S#5903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4400", "S#5904", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4401", "S#5905", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4402", "S#5906", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4407", "S#5907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4408", "S#5908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4410", "S#5909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4411", "S#5910", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4412", "S#5911", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4414", "S#5912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4415", "S#5913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4417", "S#5914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4418", "S#5915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4413", "S#5916", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4420", "S#5917", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4421", "S#5918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4405", "S#5919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4416", "S#5920", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4424", "S#5921", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4425", "S#5922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4409", "S#5923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4427", "S#5924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4434", "S#5925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4426", "S#5926", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0060", "f4435", "S#5927");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0060", "f4436", "S#5928");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4437", "S#5929", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4438", "S#5930", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4439", "S#4536", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4404", "S#5931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4423", "S#5932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4419", "S#5933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4440", "S#5934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4403", "S#5935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4422", "S#5936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4441", "S#5937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4406", "S#5938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4432", "S#5939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4433", "S#5940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4428", "S#5941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4429", "S#5942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4430", "S#5943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4431", "S#5944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4442", "FORK-CYC-SERVER-PROCESS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0060", "f4443", "S#5945", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4445() {
        $g1050$ = SubLFiles.defconstant("S#5946", (SubLObject)$ic0$);
        $g1051$ = SubLFiles.defconstant("S#5947", (SubLObject)$ic65$);
        $g1052$ = SubLFiles.deflexical("S#5948", (NIL != Symbols.boundp((SubLObject)$ic66$)) ? $g1052$.getGlobalValue() : Locks.make_lock((SubLObject)$ic67$));
        $g1053$ = SubLFiles.deflexical("S#5949", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic68$)) ? $g1053$.getGlobalValue() : NIL));
        $g1054$ = SubLFiles.defparameter("S#5950", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4446() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1050$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
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
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1050$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$));
        module0003.f57((SubLObject)$ic66$);
        module0003.f57((SubLObject)$ic68$);
        module0002.f38((SubLObject)$ic106$);
        module0012.f419((SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4444();
    }
    
    public void initializeVariables() {
        f4445();
    }
    
    public void runTopLevelForms() {
        f4446();
    }
    
    static {
        me = (SubLFile)new module0060();
        $g1050$ = null;
        $g1051$ = null;
        $g1052$ = null;
        $g1053$ = null;
        $g1054$ = null;
        $ic0$ = makeSymbol("S#5860", "CYC");
        $ic1$ = makeSymbol("S#5861", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#1519", "CYC"), makeSymbol("S#29", "CYC"), makeSymbol("S#5951", "CYC"), makeSymbol("S#160", "CYC"), makeSymbol("S#5952", "CYC"), makeSymbol("S#5953", "CYC"), makeSymbol("S#5954", "CYC"), makeSymbol("S#5955", "CYC"), makeSymbol("S#5956", "CYC"), makeSymbol("S#5957", "CYC"), makeSymbol("S#5846", "CYC"), makeSymbol("S#5958", "CYC"), makeSymbol("S#5959", "CYC"), makeSymbol("S#5960", "CYC"), makeSymbol("S#5852", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("ID"), makeKeyword("NAME"), makeKeyword("PROGRAM"), makeKeyword("ARGUMENTS"), makeKeyword("STDIN-STREAM"), makeKeyword("STDIN-FILENAME"), makeKeyword("STDOUT-STREAM"), makeKeyword("STDOUT-FILENAME"), makeKeyword("STDERR-STREAM"), makeKeyword("STDERR-FILENAME"), makeKeyword("STATUS"), makeKeyword("STARTED"), makeKeyword("FINISHED"), makeKeyword("EXIT-CODE"), makeKeyword("PROPERTIES") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#5865", "CYC"), makeSymbol("S#5866", "CYC"), makeSymbol("S#5867", "CYC"), makeSymbol("S#5868", "CYC"), makeSymbol("S#5869", "CYC"), makeSymbol("S#5870", "CYC"), makeSymbol("S#5871", "CYC"), makeSymbol("S#5872", "CYC"), makeSymbol("S#5873", "CYC"), makeSymbol("S#5874", "CYC"), makeSymbol("S#5875", "CYC"), makeSymbol("S#5876", "CYC"), makeSymbol("S#5877", "CYC"), makeSymbol("S#5878", "CYC"), makeSymbol("S#5879", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#5880", "CYC"), makeSymbol("S#5881", "CYC"), makeSymbol("S#5882", "CYC"), makeSymbol("S#5883", "CYC"), makeSymbol("S#5884", "CYC"), makeSymbol("S#5885", "CYC"), makeSymbol("S#5886", "CYC"), makeSymbol("S#5887", "CYC"), makeSymbol("S#5888", "CYC"), makeSymbol("S#5889", "CYC"), makeSymbol("S#5890", "CYC"), makeSymbol("S#5891", "CYC"), makeSymbol("S#5892", "CYC"), makeSymbol("S#5893", "CYC"), makeSymbol("S#5894", "CYC") });
        $ic6$ = makeSymbol("S#5898", "CYC");
        $ic7$ = makeSymbol("S#5864", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5861", "CYC"));
        $ic9$ = makeSymbol("S#5865", "CYC");
        $ic10$ = makeSymbol("S#5880", "CYC");
        $ic11$ = makeSymbol("S#5866", "CYC");
        $ic12$ = makeSymbol("S#5881", "CYC");
        $ic13$ = makeSymbol("S#5867", "CYC");
        $ic14$ = makeSymbol("S#5882", "CYC");
        $ic15$ = makeSymbol("S#5868", "CYC");
        $ic16$ = makeSymbol("S#5883", "CYC");
        $ic17$ = makeSymbol("S#5869", "CYC");
        $ic18$ = makeSymbol("S#5884", "CYC");
        $ic19$ = makeSymbol("S#5870", "CYC");
        $ic20$ = makeSymbol("S#5885", "CYC");
        $ic21$ = makeSymbol("S#5871", "CYC");
        $ic22$ = makeSymbol("S#5886", "CYC");
        $ic23$ = makeSymbol("S#5872", "CYC");
        $ic24$ = makeSymbol("S#5887", "CYC");
        $ic25$ = makeSymbol("S#5873", "CYC");
        $ic26$ = makeSymbol("S#5888", "CYC");
        $ic27$ = makeSymbol("S#5874", "CYC");
        $ic28$ = makeSymbol("S#5889", "CYC");
        $ic29$ = makeSymbol("S#5875", "CYC");
        $ic30$ = makeSymbol("S#5890", "CYC");
        $ic31$ = makeSymbol("S#5876", "CYC");
        $ic32$ = makeSymbol("S#5891", "CYC");
        $ic33$ = makeSymbol("S#5877", "CYC");
        $ic34$ = makeSymbol("S#5892", "CYC");
        $ic35$ = makeSymbol("S#5878", "CYC");
        $ic36$ = makeSymbol("S#5893", "CYC");
        $ic37$ = makeSymbol("S#5879", "CYC");
        $ic38$ = makeSymbol("S#5894", "CYC");
        $ic39$ = makeKeyword("ID");
        $ic40$ = makeKeyword("NAME");
        $ic41$ = makeKeyword("PROGRAM");
        $ic42$ = makeKeyword("ARGUMENTS");
        $ic43$ = makeKeyword("STDIN-STREAM");
        $ic44$ = makeKeyword("STDIN-FILENAME");
        $ic45$ = makeKeyword("STDOUT-STREAM");
        $ic46$ = makeKeyword("STDOUT-FILENAME");
        $ic47$ = makeKeyword("STDERR-STREAM");
        $ic48$ = makeKeyword("STDERR-FILENAME");
        $ic49$ = makeKeyword("STATUS");
        $ic50$ = makeKeyword("STARTED");
        $ic51$ = makeKeyword("FINISHED");
        $ic52$ = makeKeyword("EXIT-CODE");
        $ic53$ = makeKeyword("PROPERTIES");
        $ic54$ = makeString("Invalid slot ~S for construction function");
        $ic55$ = makeKeyword("BEGIN");
        $ic56$ = makeSymbol("S#5895", "CYC");
        $ic57$ = makeKeyword("SLOT");
        $ic58$ = makeKeyword("END");
        $ic59$ = makeSymbol("S#5897", "CYC");
        $ic60$ = makeString("#<OS-PROCESS ");
        $ic61$ = makeString("~A ~S ~A ~S ~A");
        $ic62$ = makeString(">");
        $ic63$ = makeKeyword("STREAM");
        $ic64$ = makeKeyword("OUTPUT");
        $ic65$ = ConsesLow.list((SubLObject)makeKeyword("INITIALIZING"), (SubLObject)makeKeyword("RUNNING"), (SubLObject)makeKeyword("DEAD"), (SubLObject)makeKeyword("FAILURE"));
        $ic66$ = makeSymbol("S#5948", "CYC");
        $ic67$ = makeString("OS Process enumeration lock");
        $ic68$ = makeSymbol("S#5949", "CYC");
        $ic69$ = makeString("~A (~A): ~A ~A~%");
        $ic70$ = makeString("Trying to remove missing OS process ~A from active process list");
        $ic71$ = makeSymbol("STRINGP");
        $ic72$ = makeSymbol("SEQUENCEP");
        $ic73$ = makeSymbol("S#5899", "CYC");
        $ic74$ = makeSymbol("S#5901", "CYC");
        $ic75$ = makeSymbol("S#5900", "CYC");
        $ic76$ = makeKeyword("INITIALIZING");
        $ic77$ = makeKeyword("RUNNING");
        $ic78$ = makeKeyword("FAILURE");
        $ic79$ = makeSymbol("S#5903", "CYC");
        $ic80$ = (SubLFloat)makeDouble(0.1);
        $ic81$ = makeString("Currently not implemented for this port.");
        $ic82$ = makeString(" ");
        $ic83$ = makeKeyword("DEAD");
        $ic84$ = makeString("Currently not implemented.");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5961", "CYC"), (SubLObject)makeSymbol("S#5962", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#105", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeString("My OS process")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5963", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-INPUT*"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5964", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5965", "CYC"), (SubLObject)makeKeyword("OUTPUT"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic86$ = ConsesLow.list((SubLObject)makeKeyword("ARGS"), (SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("STDIN"), (SubLObject)makeKeyword("STDOUT"), (SubLObject)makeKeyword("STDERR"));
        $ic87$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic88$ = makeKeyword("ARGS");
        $ic89$ = makeString("My OS process");
        $ic90$ = makeKeyword("STDIN");
        $ic91$ = makeSymbol("*STANDARD-INPUT*");
        $ic92$ = makeKeyword("STDOUT");
        $ic93$ = makeSymbol("*STANDARD-OUTPUT*");
        $ic94$ = makeKeyword("STDERR");
        $ic95$ = makeSymbol("CLET");
        $ic96$ = makeSymbol("S#5911", "CYC");
        $ic97$ = makeSymbol("CUNWIND-PROTECT");
        $ic98$ = makeSymbol("PROGN");
        $ic99$ = makeSymbol("S#5925", "CYC");
        $ic100$ = makeSymbol("S#5927", "CYC");
        $ic101$ = makeSymbol("S#5915", "CYC");
        $ic102$ = makeString("My system-eval OS Process");
        $ic103$ = makeString("My system-eval OS Process outputting to ");
        $ic104$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic105$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic106$ = makeSymbol("FORK-CYC-SERVER-PROCESS");
        $ic107$ = makeSymbol("S#5945", "CYC");
    }
    
    public static final class $sX5860_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $name;
        public SubLObject $program;
        public SubLObject $arguments;
        public SubLObject $stdin_stream;
        public SubLObject $stdin_filename;
        public SubLObject $stdout_stream;
        public SubLObject $stdout_filename;
        public SubLObject $stderr_stream;
        public SubLObject $stderr_filename;
        public SubLObject $status;
        public SubLObject $started;
        public SubLObject $finished;
        public SubLObject $exit_code;
        public SubLObject $properties;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5860_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$program = (SubLObject)CommonSymbols.NIL;
            this.$arguments = (SubLObject)CommonSymbols.NIL;
            this.$stdin_stream = (SubLObject)CommonSymbols.NIL;
            this.$stdin_filename = (SubLObject)CommonSymbols.NIL;
            this.$stdout_stream = (SubLObject)CommonSymbols.NIL;
            this.$stdout_filename = (SubLObject)CommonSymbols.NIL;
            this.$stderr_stream = (SubLObject)CommonSymbols.NIL;
            this.$stderr_filename = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$started = (SubLObject)CommonSymbols.NIL;
            this.$finished = (SubLObject)CommonSymbols.NIL;
            this.$exit_code = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5860_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$name;
        }
        
        public SubLObject getField4() {
            return this.$program;
        }
        
        public SubLObject getField5() {
            return this.$arguments;
        }
        
        public SubLObject getField6() {
            return this.$stdin_stream;
        }
        
        public SubLObject getField7() {
            return this.$stdin_filename;
        }
        
        public SubLObject getField8() {
            return this.$stdout_stream;
        }
        
        public SubLObject getField9() {
            return this.$stdout_filename;
        }
        
        public SubLObject getField10() {
            return this.$stderr_stream;
        }
        
        public SubLObject getField11() {
            return this.$stderr_filename;
        }
        
        public SubLObject getField12() {
            return this.$status;
        }
        
        public SubLObject getField13() {
            return this.$started;
        }
        
        public SubLObject getField14() {
            return this.$finished;
        }
        
        public SubLObject getField15() {
            return this.$exit_code;
        }
        
        public SubLObject getField16() {
            return this.$properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$program = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$arguments = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$stdin_stream = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$stdin_filename = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$stdout_stream = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$stdout_filename = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$stderr_stream = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$stderr_filename = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$started = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$finished = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$exit_code = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5860_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$id", "$name", "$program", "$arguments", "$stdin_stream", "$stdin_filename", "$stdout_stream", "$stdout_filename", "$stderr_stream", "$stderr_filename", "$status", "$started", "$finished", "$exit_code", "$properties" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f4361$UnaryFunction extends UnaryFunction
    {
        public $f4361$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5861"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f4361(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 317 ms
	
	Decompiled with Procyon 0.5.32.
*/