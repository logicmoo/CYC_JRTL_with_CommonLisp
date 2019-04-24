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
        f4360(var1, var2, (SubLObject)module0060.ZERO_INTEGER);
        return (SubLObject)module0060.NIL;
    }
    
    public static SubLObject f4361(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5860_native.class) ? module0060.T : module0060.NIL);
    }
    
    public static SubLObject f4362(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4363(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4364(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4365(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4366(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f4367(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f4368(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f4369(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f4370(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f4371(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f4372(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f4373(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f4374(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f4375(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f4376(final SubLObject var1) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f4377(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4378(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4379(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4380(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4381(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f4382(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f4383(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f4384(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f4385(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f4386(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f4387(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f4388(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f4389(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f4390(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f4391(final SubLObject var1, final SubLObject var4) {
        assert module0060.NIL != f4361(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f4392(SubLObject var5) {
        if (var5 == module0060.UNPROVIDED) {
            var5 = (SubLObject)module0060.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5860_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0060.NIL, var7 = var5; module0060.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0060.$ic39$)) {
                f4377(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic40$)) {
                f4378(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic41$)) {
                f4379(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic42$)) {
                f4380(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic43$)) {
                f4381(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic44$)) {
                f4382(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic45$)) {
                f4383(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic46$)) {
                f4384(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic47$)) {
                f4385(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic48$)) {
                f4386(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic49$)) {
                f4387(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic50$)) {
                f4388(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic51$)) {
                f4389(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic52$)) {
                f4390(var6, var9);
            }
            else if (var10.eql((SubLObject)module0060.$ic53$)) {
                f4391(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0060.$ic54$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4393(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic55$, (SubLObject)module0060.$ic56$, (SubLObject)module0060.FIFTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic39$, f4362(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic40$, f4363(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic41$, f4364(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic42$, f4365(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic43$, f4366(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic44$, f4367(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic45$, f4368(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic46$, f4369(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic47$, f4370(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic48$, f4371(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic49$, f4372(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic50$, f4373(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic51$, f4374(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic52$, f4375(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic57$, (SubLObject)module0060.$ic53$, f4376(var11));
        Functions.funcall(var12, var11, (SubLObject)module0060.$ic58$, (SubLObject)module0060.$ic56$, (SubLObject)module0060.FIFTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f4394(final SubLObject var11, final SubLObject var12) {
        return f4393(var11, var12);
    }
    
    public static SubLObject f4360(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        streams_high.write_string((SubLObject)module0060.$ic60$, var2, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
        PrintLow.format(var2, (SubLObject)module0060.$ic61$, new SubLObject[] { f4363(var13), f4372(var13), f4364(var13), f4365(var13), f4362(var13) });
        streams_high.write_string((SubLObject)module0060.$ic62$, var2, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f4395(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean((var13.isStream() && module0060.NIL != streams_high.input_stream_p(var13)) || var13 == module0060.$ic63$ || var13.isString());
    }
    
    public static SubLObject f4396(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean((var13.isStream() && module0060.NIL != streams_high.output_stream_p(var13)) || var13 == module0060.$ic63$ || var13.isString());
    }
    
    public static SubLObject f4397(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean((var13.isStream() && module0060.NIL != streams_high.output_stream_p(var13)) || var13 == module0060.$ic63$ || var13 == module0060.$ic64$ || var13.isString());
    }
    
    public static SubLObject f4398(final SubLObject var13) {
        return module0004.f104(var13, module0060.$g1051$.getGlobalValue(), (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
    }
    
    public static SubLObject f4399(final SubLObject var13) {
        return f4361(var13);
    }
    
    public static SubLObject f4400() {
        final SubLObject var15 = module0060.$g1052$.getGlobalValue();
        SubLObject var16 = (SubLObject)module0060.NIL;
        try {
            var16 = Locks.seize_lock(var15);
            module0060.$g1053$.setGlobalValue((SubLObject)module0060.NIL);
        }
        finally {
            if (module0060.NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return module0060.$g1053$.getGlobalValue();
    }
    
    public static SubLObject f4401() {
        SubLObject var17 = (SubLObject)module0060.NIL;
        final SubLObject var18 = module0060.$g1052$.getGlobalValue();
        SubLObject var19 = (SubLObject)module0060.NIL;
        try {
            var19 = Locks.seize_lock(var18);
            var17 = conses_high.copy_list(module0060.$g1053$.getGlobalValue());
        }
        finally {
            if (module0060.NIL != var19) {
                Locks.release_lock(var18);
            }
        }
        return var17;
    }
    
    public static SubLObject f4402() {
        SubLObject var20 = f4401();
        SubLObject var21 = (SubLObject)module0060.NIL;
        var21 = var20.first();
        while (module0060.NIL != var20) {
            PrintLow.format((SubLObject)module0060.T, (SubLObject)module0060.$ic69$, new SubLObject[] { f4403(var21), f4404(var21), f4405(var21), f4406(var21) });
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)module0060.NIL;
    }
    
    public static SubLObject f4407(final SubLObject var22) {
        SubLObject var23 = (SubLObject)module0060.NIL;
        SubLObject var24 = f4401();
        SubLObject var25 = (SubLObject)module0060.NIL;
        var25 = var24.first();
        while (module0060.NIL != var24) {
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
        SubLObject var24 = (SubLObject)module0060.NIL;
        var24 = var23.first();
        while (module0060.NIL != var23) {
            f4409(var24);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return (SubLObject)module0060.NIL;
    }
    
    public static SubLObject f4410(final SubLObject var21) {
        final SubLObject var22 = module0060.$g1052$.getGlobalValue();
        SubLObject var23 = (SubLObject)module0060.NIL;
        try {
            var23 = Locks.seize_lock(var22);
            module0060.$g1053$.setGlobalValue((SubLObject)ConsesLow.cons(var21, module0060.$g1053$.getGlobalValue()));
        }
        finally {
            if (module0060.NIL != var23) {
                Locks.release_lock(var22);
            }
        }
        return var21;
    }
    
    public static SubLObject f4411(final SubLObject var21, SubLObject var27) {
        if (var27 == module0060.UNPROVIDED) {
            var27 = (SubLObject)module0060.NIL;
        }
        final SubLObject var28 = module0060.$g1052$.getGlobalValue();
        SubLObject var29 = (SubLObject)module0060.NIL;
        try {
            var29 = Locks.seize_lock(var28);
            if (module0060.NIL != var27 && module0060.NIL == Sequences.find(var21, module0060.$g1053$.getGlobalValue(), (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED)) {
                Errors.error((SubLObject)module0060.$ic70$, var21);
            }
            module0060.$g1053$.setGlobalValue(Sequences.delete(var21, module0060.$g1053$.getGlobalValue(), (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED));
        }
        finally {
            if (module0060.NIL != var29) {
                Locks.release_lock(var28);
            }
        }
        return var21;
    }
    
    public static SubLObject f4412(final SubLObject var22, final SubLObject var30, SubLObject var31, SubLObject var32, SubLObject var33, SubLObject var34) {
        if (var31 == module0060.UNPROVIDED) {
            var31 = (SubLObject)module0060.NIL;
        }
        if (var32 == module0060.UNPROVIDED) {
            var32 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var33 == module0060.UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var34 == module0060.UNPROVIDED) {
            var34 = (SubLObject)module0060.$ic64$;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        assert module0060.NIL != Types.stringp(var22) : var22;
        assert module0060.NIL != Types.stringp(var30) : var30;
        assert module0060.NIL != Types.sequencep(var31) : var31;
        assert module0060.NIL != f4395(var32) : var32;
        assert module0060.NIL != f4397(var34) : var34;
        assert module0060.NIL != f4396(var33) : var33;
        final SubLObject var36 = f4392((SubLObject)module0060.UNPROVIDED);
        f4388(var36, Time.get_internal_real_time());
        f4387(var36, (SubLObject)module0060.$ic76$);
        f4378(var36, var22);
        f4379(var36, var30);
        f4380(var36, var31);
        if (var32.isString() || var32 == module0060.$ic63$) {
            f4382(var36, var32);
        }
        if (var33.isString() || var33 == module0060.$ic63$) {
            f4384(var36, var33);
        }
        if (var34.isString() || var34 == module0060.$ic63$) {
            f4386(var36, var34);
        }
        var35.resetMultipleValues();
        final SubLObject var37 = f4413(var30, var31, var32, var33, var34);
        final SubLObject var38 = var35.secondMultipleValue();
        final SubLObject var39 = var35.thirdMultipleValue();
        final SubLObject var40 = var35.fourthMultipleValue();
        var35.resetMultipleValues();
        f4377(var36, var40);
        if (module0060.NIL != f4414(var40)) {
            f4387(var36, (SubLObject)module0060.$ic77$);
            f4410(var36);
        }
        else {
            f4387(var36, (SubLObject)module0060.$ic78$);
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
        assert module0060.NIL != f4399(var21) : var21;
        f4416(var21, (SubLObject)module0060.UNPROVIDED);
        return Equality.eq((SubLObject)module0060.$ic77$, f4372(var21));
    }
    
    public static SubLObject f4417(final SubLObject var40) {
        SubLObject var41 = var40;
        SubLObject var42 = (SubLObject)module0060.NIL;
        var42 = var41.first();
        while (module0060.NIL != var41) {
            f4418(var42);
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var40;
    }
    
    public static SubLObject f4418(final SubLObject var21) {
        while (module0060.NIL != f4415(var21)) {
            Threads.sleep((SubLObject)module0060.$ic80$);
        }
        return f4419(var21);
    }
    
    public static SubLObject f4413(final SubLObject var30, final SubLObject var31, final SubLObject var41, final SubLObject var42, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = f4420();
        final SubLObject var46 = var41.eql(StreamsLow.$null_input$.getDynamicValue(var44)) ? var45 : var41;
        final SubLObject var47 = var42.eql(StreamsLow.$null_output$.getDynamicValue(var44)) ? var45 : var42;
        final SubLObject var48 = var43.eql(StreamsLow.$null_output$.getDynamicValue(var44)) ? var45 : var43;
        if (module0060.NIL == Processes.external_processes_supportedP()) {
            return Errors.error((SubLObject)module0060.$ic81$);
        }
        return Processes.run_external_process(var30, var31, var46, var47, var48);
    }
    
    public static SubLObject f4420() {
        return Filesys.canonical_null_file_stream_path();
    }
    
    public static SubLObject f4421(final SubLObject var30, final SubLObject var31) {
        SubLObject var32 = (SubLObject)module0060.NIL;
        SubLObject var33 = (SubLObject)module0060.NIL;
        try {
            var33 = streams_high.make_private_string_output_stream();
            streams_high.write_string(module0038.f2624(var30), var33, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
            if (var31.isSequence()) {
                for (SubLObject var34 = var31, var35 = (SubLObject)(var34.isList() ? module0060.NIL : Sequences.length(var34)), var36 = (SubLObject)module0060.ZERO_INTEGER, var37 = module0005.f149(var36, var35, var34); module0060.NIL == var37; var37 = module0005.f149(var36, var35, var34)) {
                    final SubLObject var38 = module0005.f150(var36, var34);
                    streams_high.write_string((SubLObject)module0060.$ic82$, var33, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
                    streams_high.write_string(module0038.f2624(var38), var33, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
                    var34 = module0005.f151(var34);
                    var36 = Numbers.add(var36, (SubLObject)module0060.ONE_INTEGER);
                }
            }
            else {
                streams_high.write_string((SubLObject)module0060.$ic82$, var33, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
                streams_high.write_string(module0038.f2624(var31), var33, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED);
            }
            var32 = streams_high.get_output_stream_string(var33);
        }
        finally {
            final SubLObject var39 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0060.T);
                streams_high.close(var33, (SubLObject)module0060.UNPROVIDED);
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
        if (var55 == module0060.UNPROVIDED) {
            var55 = (SubLObject)module0060.NIL;
        }
        if (module0060.$ic77$ == f4372(var21)) {
            final SubLObject var56 = f4424(var21, var55);
            if (var56.isFixnum()) {
                f4389(var21, Time.get_internal_real_time());
                f4390(var21, var56);
                f4387(var21, (SubLObject)module0060.$ic83$);
                f4411(var21, (SubLObject)module0060.UNPROVIDED);
            }
        }
        return var21;
    }
    
    public static SubLObject f4424(final SubLObject var21, SubLObject var55) {
        if (var55 == module0060.UNPROVIDED) {
            var55 = (SubLObject)module0060.NIL;
        }
        final SubLThread var56 = SubLProcess.currentSubLThread();
        var56.resetMultipleValues();
        SubLObject var57 = f4425(var21, var55);
        final SubLObject var58 = var56.secondMultipleValue();
        var56.resetMultipleValues();
        if (!var58.eql(f4362(var21))) {
            var57 = (SubLObject)module0060.MINUS_ONE_INTEGER;
        }
        return var57;
    }
    
    public static SubLObject f4425(final SubLObject var21, final SubLObject var55) {
        if (module0060.NIL == Processes.external_processes_supportedP()) {
            return Errors.error((SubLObject)module0060.$ic84$);
        }
        return Processes.get_external_process_status(f4362(var21), var55);
    }
    
    public static SubLObject f4409(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        if (module0060.NIL != f4415(var21)) {
            f4426(var21);
        }
        return var21;
    }
    
    public static SubLObject f4427(final SubLObject var21) {
        if (module0060.NIL == f4415(var21)) {
            if (module0060.NIL != f4428(var21) && f4429(var21).isStream()) {
                streams_high.close(f4429(var21), (SubLObject)module0060.UNPROVIDED);
            }
            f4381(var21, (SubLObject)module0060.NIL);
            if (module0060.NIL != f4430(var21) && f4431(var21).isStream()) {
                streams_high.close(f4431(var21), (SubLObject)module0060.UNPROVIDED);
            }
            f4383(var21, (SubLObject)module0060.NIL);
            if (module0060.NIL != f4432(var21) && f4433(var21).isStream()) {
                streams_high.close(f4433(var21), (SubLObject)module0060.UNPROVIDED);
            }
            f4385(var21, (SubLObject)module0060.NIL);
        }
        return var21;
    }
    
    public static SubLObject f4434(final SubLObject var24) {
        if (module0060.NIL != f4415(var24)) {
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
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0060.$ic85$);
        final SubLObject var63 = var62.rest();
        var62 = var62.first();
        SubLObject var64 = (SubLObject)module0060.NIL;
        SubLObject var65 = (SubLObject)module0060.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0060.$ic85$);
        var64 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0060.$ic85$);
        var65 = var62.first();
        var62 = var62.rest();
        SubLObject var66 = (SubLObject)module0060.NIL;
        SubLObject var67 = var62;
        SubLObject var68 = (SubLObject)module0060.NIL;
        SubLObject var69_70 = (SubLObject)module0060.NIL;
        while (module0060.NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)module0060.$ic85$);
            var69_70 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)module0060.$ic85$);
            if (module0060.NIL == conses_high.member(var69_70, (SubLObject)module0060.$ic86$, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED)) {
                var68 = (SubLObject)module0060.T;
            }
            if (var69_70 == module0060.$ic87$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (module0060.NIL != var68 && module0060.NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)module0060.$ic85$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic88$, var62);
        final SubLObject var70 = (SubLObject)((module0060.NIL != var69) ? conses_high.cadr(var69) : module0060.NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic40$, var62);
        final SubLObject var72 = (SubLObject)((module0060.NIL != var71) ? conses_high.cadr(var71) : module0060.$ic89$);
        final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic90$, var62);
        final SubLObject var74 = (SubLObject)((module0060.NIL != var73) ? conses_high.cadr(var73) : module0060.$ic91$);
        final SubLObject var75 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic92$, var62);
        final SubLObject var76 = (SubLObject)((module0060.NIL != var75) ? conses_high.cadr(var75) : module0060.$ic93$);
        final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic94$, var62);
        final SubLObject var78 = (SubLObject)((module0060.NIL != var77) ? conses_high.cadr(var77) : module0060.$ic64$);
        final SubLObject var79;
        var62 = (var79 = var63);
        return (SubLObject)ConsesLow.list((SubLObject)module0060.$ic95$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var64, (SubLObject)ConsesLow.list((SubLObject)module0060.$ic96$, var72, var65, var70, var74, var76, var78))), (SubLObject)ConsesLow.list((SubLObject)module0060.$ic97$, reader.bq_cons((SubLObject)module0060.$ic98$, ConsesLow.append(var79, (SubLObject)module0060.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0060.$ic99$, var64)));
    }
    
    public static SubLObject f4436(final SubLObject var59, final SubLObject var60) {
        SubLObject var62;
        final SubLObject var61 = var62 = var59.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0060.$ic85$);
        final SubLObject var63 = var62.rest();
        var62 = var62.first();
        SubLObject var64 = (SubLObject)module0060.NIL;
        SubLObject var65 = (SubLObject)module0060.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0060.$ic85$);
        var64 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0060.$ic85$);
        var65 = var62.first();
        var62 = var62.rest();
        SubLObject var66 = (SubLObject)module0060.NIL;
        SubLObject var67 = var62;
        SubLObject var68 = (SubLObject)module0060.NIL;
        SubLObject var83_84 = (SubLObject)module0060.NIL;
        while (module0060.NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)module0060.$ic85$);
            var83_84 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var61, (SubLObject)module0060.$ic85$);
            if (module0060.NIL == conses_high.member(var83_84, (SubLObject)module0060.$ic86$, (SubLObject)module0060.UNPROVIDED, (SubLObject)module0060.UNPROVIDED)) {
                var68 = (SubLObject)module0060.T;
            }
            if (var83_84 == module0060.$ic87$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (module0060.NIL != var68 && module0060.NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)module0060.$ic85$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic88$, var62);
        final SubLObject var70 = (SubLObject)((module0060.NIL != var69) ? conses_high.cadr(var69) : module0060.NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic40$, var62);
        final SubLObject var72 = (SubLObject)((module0060.NIL != var71) ? conses_high.cadr(var71) : module0060.$ic89$);
        final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic90$, var62);
        final SubLObject var74 = (SubLObject)((module0060.NIL != var73) ? conses_high.cadr(var73) : module0060.$ic91$);
        final SubLObject var75 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic92$, var62);
        final SubLObject var76 = (SubLObject)((module0060.NIL != var75) ? conses_high.cadr(var75) : module0060.$ic93$);
        final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)module0060.$ic94$, var62);
        final SubLObject var78 = (SubLObject)((module0060.NIL != var77) ? conses_high.cadr(var77) : module0060.$ic64$);
        final SubLObject var79;
        var62 = (var79 = var63);
        return (SubLObject)ConsesLow.list((SubLObject)module0060.$ic100$, (SubLObject)ConsesLow.list(new SubLObject[] { var64, var65, module0060.$ic88$, var70, module0060.$ic40$, var72, module0060.$ic90$, var74, module0060.$ic92$, var76, module0060.$ic94$, var78 }), (SubLObject)ConsesLow.list((SubLObject)module0060.$ic101$, var64), reader.bq_cons((SubLObject)module0060.$ic98$, ConsesLow.append(var79, (SubLObject)module0060.NIL)));
    }
    
    public static SubLObject f4437(final SubLObject var65, SubLObject var31, SubLObject var32, SubLObject var33, SubLObject var34) {
        if (var31 == module0060.UNPROVIDED) {
            var31 = (SubLObject)module0060.NIL;
        }
        if (var32 == module0060.UNPROVIDED) {
            var32 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var33 == module0060.UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var34 == module0060.UNPROVIDED) {
            var34 = (SubLObject)module0060.$ic64$;
        }
        SubLObject var66 = (SubLObject)module0060.MINUS_ONE_INTEGER;
        final SubLObject var67 = f4412((SubLObject)module0060.$ic102$, var65, var31, var32, var33, var34);
        try {
            f4418(var67);
            var66 = f4419(var67);
        }
        finally {
            final SubLObject var68 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0060.T);
                f4434(var67);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var68);
            }
        }
        return var66;
    }
    
    public static SubLObject f4438(final SubLObject var65, SubLObject var31, SubLObject var90, SubLObject var32, SubLObject var33, SubLObject var34) {
        if (var31 == module0060.UNPROVIDED) {
            var31 = (SubLObject)module0060.NIL;
        }
        if (var90 == module0060.UNPROVIDED) {
            var90 = (SubLObject)module0060.ZERO_INTEGER;
        }
        if (var32 == module0060.UNPROVIDED) {
            var32 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var33 == module0060.UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var34 == module0060.UNPROVIDED) {
            var34 = (SubLObject)module0060.$ic64$;
        }
        final SubLObject var91 = f4437(var65, var31, var32, var33, var34);
        return Equality.eql(var91, var90);
    }
    
    public static SubLObject f4439(final SubLObject var65, SubLObject var31, SubLObject var90, SubLObject var32) {
        if (var31 == module0060.UNPROVIDED) {
            var31 = (SubLObject)module0060.NIL;
        }
        if (var90 == module0060.UNPROVIDED) {
            var90 = (SubLObject)module0060.ZERO_INTEGER;
        }
        if (var32 == module0060.UNPROVIDED) {
            var32 = StreamsLow.$null_input$.getDynamicValue();
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)module0060.MINUS_ONE_INTEGER;
        final SubLObject var93 = module0075.f5184((SubLObject)module0060.UNPROVIDED);
        final SubLObject var94 = Sequences.cconcatenate((SubLObject)module0060.$ic103$, module0006.f203(var93));
        final SubLObject var95 = f4412(var94, var65, var31, var32, var93, (SubLObject)module0060.$ic64$);
        try {
            f4418(var95);
            var92 = f4419(var95);
        }
        finally {
            final SubLObject var96 = Threads.$is_thread_performing_cleanupP$.currentBinding(var91);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0060.T, var91);
                f4434(var95);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var96, var91);
            }
        }
        final SubLObject var97 = module0075.f5235(var93);
        final SubLObject var98 = Equality.eql(var92, var90);
        SubLObject var99 = (SubLObject)module0060.NIL;
        try {
            var91.throwStack.push(module0060.$ic104$);
            final SubLObject var96 = Errors.$error_handler$.currentBinding(var91);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0060.$ic105$), var91);
                try {
                    Filesys.delete_file(var93);
                }
                catch (Throwable var100) {
                    Errors.handleThrowable(var100, (SubLObject)module0060.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var96, var91);
            }
        }
        catch (Throwable var101) {
            var99 = Errors.handleThrowable(var101, (SubLObject)module0060.$ic104$);
        }
        finally {
            var91.throwStack.pop();
        }
        return Values.values(var97, var98);
    }
    
    public static SubLObject f4404(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4362(var21);
    }
    
    public static SubLObject f4423(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4365(var21);
    }
    
    public static SubLObject f4419(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4375(var21);
    }
    
    public static SubLObject f4440(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4374(var21);
    }
    
    public static SubLObject f4403(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4363(var21);
    }
    
    public static SubLObject f4422(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4364(var21);
    }
    
    public static SubLObject f4441(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4373(var21);
    }
    
    public static SubLObject f4406(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        f4416(var21, (SubLObject)module0060.UNPROVIDED);
        return f4372(var21);
    }
    
    public static SubLObject f4432(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4371(var21);
    }
    
    public static SubLObject f4433(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4370(var21);
    }
    
    public static SubLObject f4428(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4367(var21);
    }
    
    public static SubLObject f4429(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4366(var21);
    }
    
    public static SubLObject f4430(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4369(var21);
    }
    
    public static SubLObject f4431(final SubLObject var21) {
        assert module0060.NIL != f4399(var21) : var21;
        return f4368(var21);
    }
    
    public static SubLObject f4442(final SubLObject var97, SubLObject var98, SubLObject var99) {
        if (var98 == module0060.UNPROVIDED) {
            var98 = (SubLObject)module0060.NIL;
        }
        if (var99 == module0060.UNPROVIDED) {
            var99 = (SubLObject)module0060.NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)module0060.NIL;
        final SubLObject var102 = module0060.$g1054$.currentBinding(var100);
        try {
            module0060.$g1054$.bind(var97, var100);
            var101 = Processes.fork_process((SubLObject)module0060.$ic107$, var98, var99);
        }
        finally {
            module0060.$g1054$.rebind(var102, var100);
        }
        return var101;
    }
    
    public static SubLObject f4443() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        final SubLObject var36 = module0060.$g1054$.getDynamicValue(var35);
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
        return (SubLObject)module0060.NIL;
    }
    
    public static SubLObject f4445() {
        module0060.$g1050$ = SubLFiles.defconstant("S#5946", (SubLObject)module0060.$ic0$);
        module0060.$g1051$ = SubLFiles.defconstant("S#5947", (SubLObject)module0060.$ic65$);
        module0060.$g1052$ = SubLFiles.deflexical("S#5948", (module0060.NIL != Symbols.boundp((SubLObject)module0060.$ic66$)) ? module0060.$g1052$.getGlobalValue() : Locks.make_lock((SubLObject)module0060.$ic67$));
        module0060.$g1053$ = SubLFiles.deflexical("S#5949", (SubLObject)((module0060.NIL != Symbols.boundp((SubLObject)module0060.$ic68$)) ? module0060.$g1053$.getGlobalValue() : module0060.NIL));
        module0060.$g1054$ = SubLFiles.defparameter("S#5950", (SubLObject)module0060.NIL);
        return (SubLObject)module0060.NIL;
    }
    
    public static SubLObject f4446() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0060.$g1050$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0060.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0060.$ic8$);
        Structures.def_csetf((SubLObject)module0060.$ic9$, (SubLObject)module0060.$ic10$);
        Structures.def_csetf((SubLObject)module0060.$ic11$, (SubLObject)module0060.$ic12$);
        Structures.def_csetf((SubLObject)module0060.$ic13$, (SubLObject)module0060.$ic14$);
        Structures.def_csetf((SubLObject)module0060.$ic15$, (SubLObject)module0060.$ic16$);
        Structures.def_csetf((SubLObject)module0060.$ic17$, (SubLObject)module0060.$ic18$);
        Structures.def_csetf((SubLObject)module0060.$ic19$, (SubLObject)module0060.$ic20$);
        Structures.def_csetf((SubLObject)module0060.$ic21$, (SubLObject)module0060.$ic22$);
        Structures.def_csetf((SubLObject)module0060.$ic23$, (SubLObject)module0060.$ic24$);
        Structures.def_csetf((SubLObject)module0060.$ic25$, (SubLObject)module0060.$ic26$);
        Structures.def_csetf((SubLObject)module0060.$ic27$, (SubLObject)module0060.$ic28$);
        Structures.def_csetf((SubLObject)module0060.$ic29$, (SubLObject)module0060.$ic30$);
        Structures.def_csetf((SubLObject)module0060.$ic31$, (SubLObject)module0060.$ic32$);
        Structures.def_csetf((SubLObject)module0060.$ic33$, (SubLObject)module0060.$ic34$);
        Structures.def_csetf((SubLObject)module0060.$ic35$, (SubLObject)module0060.$ic36$);
        Structures.def_csetf((SubLObject)module0060.$ic37$, (SubLObject)module0060.$ic38$);
        Equality.identity((SubLObject)module0060.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0060.$g1050$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0060.$ic59$));
        module0003.f57((SubLObject)module0060.$ic66$);
        module0003.f57((SubLObject)module0060.$ic68$);
        module0002.f38((SubLObject)module0060.$ic106$);
        module0012.f419((SubLObject)module0060.$ic107$);
        return (SubLObject)module0060.NIL;
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
        module0060.$g1050$ = null;
        module0060.$g1051$ = null;
        module0060.$g1052$ = null;
        module0060.$g1053$ = null;
        module0060.$g1054$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#5860", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#5861", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#1519", "CYC"), SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#5951", "CYC"), SubLObjectFactory.makeSymbol("S#160", "CYC"), SubLObjectFactory.makeSymbol("S#5952", "CYC"), SubLObjectFactory.makeSymbol("S#5953", "CYC"), SubLObjectFactory.makeSymbol("S#5954", "CYC"), SubLObjectFactory.makeSymbol("S#5955", "CYC"), SubLObjectFactory.makeSymbol("S#5956", "CYC"), SubLObjectFactory.makeSymbol("S#5957", "CYC"), SubLObjectFactory.makeSymbol("S#5846", "CYC"), SubLObjectFactory.makeSymbol("S#5958", "CYC"), SubLObjectFactory.makeSymbol("S#5959", "CYC"), SubLObjectFactory.makeSymbol("S#5960", "CYC"), SubLObjectFactory.makeSymbol("S#5852", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("PROGRAM"), SubLObjectFactory.makeKeyword("ARGUMENTS"), SubLObjectFactory.makeKeyword("STDIN-STREAM"), SubLObjectFactory.makeKeyword("STDIN-FILENAME"), SubLObjectFactory.makeKeyword("STDOUT-STREAM"), SubLObjectFactory.makeKeyword("STDOUT-FILENAME"), SubLObjectFactory.makeKeyword("STDERR-STREAM"), SubLObjectFactory.makeKeyword("STDERR-FILENAME"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("STARTED"), SubLObjectFactory.makeKeyword("FINISHED"), SubLObjectFactory.makeKeyword("EXIT-CODE"), SubLObjectFactory.makeKeyword("PROPERTIES") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#5865", "CYC"), SubLObjectFactory.makeSymbol("S#5866", "CYC"), SubLObjectFactory.makeSymbol("S#5867", "CYC"), SubLObjectFactory.makeSymbol("S#5868", "CYC"), SubLObjectFactory.makeSymbol("S#5869", "CYC"), SubLObjectFactory.makeSymbol("S#5870", "CYC"), SubLObjectFactory.makeSymbol("S#5871", "CYC"), SubLObjectFactory.makeSymbol("S#5872", "CYC"), SubLObjectFactory.makeSymbol("S#5873", "CYC"), SubLObjectFactory.makeSymbol("S#5874", "CYC"), SubLObjectFactory.makeSymbol("S#5875", "CYC"), SubLObjectFactory.makeSymbol("S#5876", "CYC"), SubLObjectFactory.makeSymbol("S#5877", "CYC"), SubLObjectFactory.makeSymbol("S#5878", "CYC"), SubLObjectFactory.makeSymbol("S#5879", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#5880", "CYC"), SubLObjectFactory.makeSymbol("S#5881", "CYC"), SubLObjectFactory.makeSymbol("S#5882", "CYC"), SubLObjectFactory.makeSymbol("S#5883", "CYC"), SubLObjectFactory.makeSymbol("S#5884", "CYC"), SubLObjectFactory.makeSymbol("S#5885", "CYC"), SubLObjectFactory.makeSymbol("S#5886", "CYC"), SubLObjectFactory.makeSymbol("S#5887", "CYC"), SubLObjectFactory.makeSymbol("S#5888", "CYC"), SubLObjectFactory.makeSymbol("S#5889", "CYC"), SubLObjectFactory.makeSymbol("S#5890", "CYC"), SubLObjectFactory.makeSymbol("S#5891", "CYC"), SubLObjectFactory.makeSymbol("S#5892", "CYC"), SubLObjectFactory.makeSymbol("S#5893", "CYC"), SubLObjectFactory.makeSymbol("S#5894", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#5898", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#5864", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5861", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#5865", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#5880", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#5866", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#5881", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#5867", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#5882", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#5868", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#5883", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#5869", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#5884", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#5870", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#5885", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#5871", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#5886", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#5872", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#5887", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#5873", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#5888", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#5874", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#5889", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#5875", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#5890", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#5876", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#5891", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#5877", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#5892", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#5878", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#5893", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#5879", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#5894", "CYC");
        $ic39$ = SubLObjectFactory.makeKeyword("ID");
        $ic40$ = SubLObjectFactory.makeKeyword("NAME");
        $ic41$ = SubLObjectFactory.makeKeyword("PROGRAM");
        $ic42$ = SubLObjectFactory.makeKeyword("ARGUMENTS");
        $ic43$ = SubLObjectFactory.makeKeyword("STDIN-STREAM");
        $ic44$ = SubLObjectFactory.makeKeyword("STDIN-FILENAME");
        $ic45$ = SubLObjectFactory.makeKeyword("STDOUT-STREAM");
        $ic46$ = SubLObjectFactory.makeKeyword("STDOUT-FILENAME");
        $ic47$ = SubLObjectFactory.makeKeyword("STDERR-STREAM");
        $ic48$ = SubLObjectFactory.makeKeyword("STDERR-FILENAME");
        $ic49$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic50$ = SubLObjectFactory.makeKeyword("STARTED");
        $ic51$ = SubLObjectFactory.makeKeyword("FINISHED");
        $ic52$ = SubLObjectFactory.makeKeyword("EXIT-CODE");
        $ic53$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic54$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic55$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic56$ = SubLObjectFactory.makeSymbol("S#5895", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic58$ = SubLObjectFactory.makeKeyword("END");
        $ic59$ = SubLObjectFactory.makeSymbol("S#5897", "CYC");
        $ic60$ = SubLObjectFactory.makeString("#<OS-PROCESS ");
        $ic61$ = SubLObjectFactory.makeString("~A ~S ~A ~S ~A");
        $ic62$ = SubLObjectFactory.makeString(">");
        $ic63$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic64$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INITIALIZING"), (SubLObject)SubLObjectFactory.makeKeyword("RUNNING"), (SubLObject)SubLObjectFactory.makeKeyword("DEAD"), (SubLObject)SubLObjectFactory.makeKeyword("FAILURE"));
        $ic66$ = SubLObjectFactory.makeSymbol("S#5948", "CYC");
        $ic67$ = SubLObjectFactory.makeString("OS Process enumeration lock");
        $ic68$ = SubLObjectFactory.makeSymbol("S#5949", "CYC");
        $ic69$ = SubLObjectFactory.makeString("~A (~A): ~A ~A~%");
        $ic70$ = SubLObjectFactory.makeString("Trying to remove missing OS process ~A from active process list");
        $ic71$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic72$ = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $ic73$ = SubLObjectFactory.makeSymbol("S#5899", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#5901", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#5900", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("INITIALIZING");
        $ic77$ = SubLObjectFactory.makeKeyword("RUNNING");
        $ic78$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic79$ = SubLObjectFactory.makeSymbol("S#5903", "CYC");
        $ic80$ = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $ic81$ = SubLObjectFactory.makeString("Currently not implemented for this port.");
        $ic82$ = SubLObjectFactory.makeString(" ");
        $ic83$ = SubLObjectFactory.makeKeyword("DEAD");
        $ic84$ = SubLObjectFactory.makeString("Currently not implemented.");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5961", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5962", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)module0060.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeString("My OS process")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5963", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-INPUT*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5964", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5965", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGS"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("STDIN"), (SubLObject)SubLObjectFactory.makeKeyword("STDOUT"), (SubLObject)SubLObjectFactory.makeKeyword("STDERR"));
        $ic87$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic88$ = SubLObjectFactory.makeKeyword("ARGS");
        $ic89$ = SubLObjectFactory.makeString("My OS process");
        $ic90$ = SubLObjectFactory.makeKeyword("STDIN");
        $ic91$ = SubLObjectFactory.makeSymbol("*STANDARD-INPUT*");
        $ic92$ = SubLObjectFactory.makeKeyword("STDOUT");
        $ic93$ = SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*");
        $ic94$ = SubLObjectFactory.makeKeyword("STDERR");
        $ic95$ = SubLObjectFactory.makeSymbol("CLET");
        $ic96$ = SubLObjectFactory.makeSymbol("S#5911", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic98$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic99$ = SubLObjectFactory.makeSymbol("S#5925", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("S#5927", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("S#5915", "CYC");
        $ic102$ = SubLObjectFactory.makeString("My system-eval OS Process");
        $ic103$ = SubLObjectFactory.makeString("My system-eval OS Process outputting to ");
        $ic104$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic105$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic106$ = SubLObjectFactory.makeSymbol("FORK-CYC-SERVER-PROCESS");
        $ic107$ = SubLObjectFactory.makeSymbol("S#5945", "CYC");
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
            structDecl = Structures.makeStructDeclNative((Class)$sX5860_native.class, module0060.$ic0$, module0060.$ic1$, module0060.$ic2$, module0060.$ic3$, new String[] { "$id", "$name", "$program", "$arguments", "$stdin_stream", "$stdin_filename", "$stdout_stream", "$stdout_filename", "$stderr_stream", "$stderr_filename", "$status", "$started", "$finished", "$exit_code", "$properties" }, module0060.$ic4$, module0060.$ic5$, module0060.$ic6$);
        }
    }
    
    public static final class $f4361$UnaryFunction extends UnaryFunction
    {
        public $f4361$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5861"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0060.f4361(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0060.class
	Total time: 317 ms
	
	Decompiled with Procyon 0.5.32.
*/