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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0160 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0160";
    public static final String myFingerPrint = "4ca2bdc371772237f3ae14ef6f3afd91d05f25f55c3878ba78cfc98404e4efdb";
    public static SubLSymbol $g2152$;
    private static SubLSymbol $g2153$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
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
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLInteger $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLFloat $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
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
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    
    public static SubLObject f10378(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0160.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0160.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0160.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0160.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0160.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0160.$ic2$, var6)), ConsesLow.append(var7, (SubLObject)module0160.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0160.$ic0$);
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10379(final SubLObject var8, final SubLObject var9) {
        compatibility.default_struct_print_function(var8, var9, (SubLObject)module0160.ZERO_INTEGER);
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10380(final SubLObject var8) {
        return (SubLObject)((var8.getClass() == $sX13152_native.class) ? module0160.T : module0160.NIL);
    }
    
    public static SubLObject f10381(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField2();
    }
    
    public static SubLObject f10382(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField3();
    }
    
    public static SubLObject f10383(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField4();
    }
    
    public static SubLObject f10384(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField5();
    }
    
    public static SubLObject f10385(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField6();
    }
    
    public static SubLObject f10386(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField7();
    }
    
    public static SubLObject f10387(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField8();
    }
    
    public static SubLObject f10388(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField9();
    }
    
    public static SubLObject f10389(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField10();
    }
    
    public static SubLObject f10390(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField11();
    }
    
    public static SubLObject f10391(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField12();
    }
    
    public static SubLObject f10392(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField13();
    }
    
    public static SubLObject f10393(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField14();
    }
    
    public static SubLObject f10394(final SubLObject var8) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.getField15();
    }
    
    public static SubLObject f10395(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField2(var11);
    }
    
    public static SubLObject f10396(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField3(var11);
    }
    
    public static SubLObject f10397(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField4(var11);
    }
    
    public static SubLObject f10398(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField5(var11);
    }
    
    public static SubLObject f10399(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField6(var11);
    }
    
    public static SubLObject f10400(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField7(var11);
    }
    
    public static SubLObject f10401(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField8(var11);
    }
    
    public static SubLObject f10402(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField9(var11);
    }
    
    public static SubLObject f10403(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField10(var11);
    }
    
    public static SubLObject f10404(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField11(var11);
    }
    
    public static SubLObject f10405(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField12(var11);
    }
    
    public static SubLObject f10406(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField13(var11);
    }
    
    public static SubLObject f10407(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField14(var11);
    }
    
    public static SubLObject f10408(final SubLObject var8, final SubLObject var11) {
        assert module0160.NIL != f10380(var8) : var8;
        return var8.setField15(var11);
    }
    
    public static SubLObject f10409(SubLObject var12) {
        if (var12 == module0160.UNPROVIDED) {
            var12 = (SubLObject)module0160.NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX13152_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)module0160.NIL, var14 = var12; module0160.NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)module0160.$ic40$)) {
                f10395(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic41$)) {
                f10396(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic42$)) {
                f10397(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic43$)) {
                f10398(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic44$)) {
                f10399(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic45$)) {
                f10400(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic46$)) {
                f10401(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic47$)) {
                f10402(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic48$)) {
                f10403(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic49$)) {
                f10404(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic50$)) {
                f10405(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic51$)) {
                f10406(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic52$)) {
                f10407(var13, var16);
            }
            else if (var17.eql((SubLObject)module0160.$ic53$)) {
                f10408(var13, var16);
            }
            else {
                Errors.error((SubLObject)module0160.$ic54$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f10410(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic55$, (SubLObject)module0160.$ic56$, (SubLObject)module0160.FOURTEEN_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic40$, f10381(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic41$, f10382(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic42$, f10383(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic43$, f10384(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic44$, f10385(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic45$, f10386(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic46$, f10387(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic47$, f10388(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic48$, f10389(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic49$, f10390(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic50$, f10391(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic51$, f10392(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic52$, f10393(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic57$, (SubLObject)module0160.$ic53$, f10394(var18));
        Functions.funcall(var19, var18, (SubLObject)module0160.$ic58$, (SubLObject)module0160.$ic56$, (SubLObject)module0160.FOURTEEN_INTEGER);
        return var18;
    }
    
    public static SubLObject f10411(final SubLObject var18, final SubLObject var19) {
        return f10410(var18, var19);
    }
    
    public static SubLObject f10412(final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        assert module0160.NIL != Types.stringp(var20) : var20;
        assert module0160.NIL != module0004.f106(var21) : var21;
        assert module0160.NIL != module0004.f105(var22) : var22;
        assert module0160.NIL != module0004.f105(var23) : var23;
        assert module0160.NIL != Symbols.fboundp(var24) : var24;
        final SubLObject var26 = f10409((SubLObject)module0160.UNPROVIDED);
        f10395(var26, var20);
        f10396(var26, Locks.make_lock(Sequences.cconcatenate(var20, (SubLObject)module0160.$ic64$)));
        f10397(var26, var22);
        f10406(var26, var23);
        f10413(var26, var21, var25);
        f10399(var26, (SubLObject)module0160.$ic65$);
        f10401(var26, (SubLObject)module0160.NIL);
        f10402(var26, (SubLObject)module0160.ZERO_INTEGER);
        f10403(var26, var24);
        f10404(var26, (SubLObject)module0160.NIL);
        f10405(var26, (SubLObject)module0160.NIL);
        return var26;
    }
    
    public static SubLObject f10414(final SubLObject var6, final SubLObject var26, final SubLObject var27) {
        assert module0160.NIL != module0004.f105(var26) : var26;
        assert module0160.NIL != module0004.f105(var27) : var27;
        assert module0160.NIL != f10380(var6) : var6;
        final SubLObject var28 = f10415(var6);
        SubLObject var29 = (SubLObject)module0160.NIL;
        try {
            var29 = Locks.seize_lock(var28);
            final SubLObject var30 = f10416(var6);
            if (module0160.NIL != var30) {
                module0095.f6850(var30, var26, var27);
            }
        }
        finally {
            if (module0160.NIL != var29) {
                Locks.release_lock(var28);
            }
        }
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10417(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        final SubLObject var7 = f10415(var6);
        SubLObject var8 = (SubLObject)module0160.NIL;
        try {
            var8 = Locks.seize_lock(var7);
            final SubLObject var9 = f10416(var6);
            if (module0160.NIL != var9) {
                module0095.f6847(var9);
            }
        }
        finally {
            if (module0160.NIL != var8) {
                Locks.release_lock(var7);
            }
        }
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10418(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        SubLObject var7 = (SubLObject)module0160.NIL;
        final SubLObject var8 = f10415(var6);
        SubLObject var9 = (SubLObject)module0160.NIL;
        try {
            var9 = Locks.seize_lock(var8);
            final SubLObject var10 = f10416(var6);
            var7 = (SubLObject)SubLObjectFactory.makeBoolean(module0160.NIL != var10 && module0160.NIL != module0095.f6851(var10));
        }
        finally {
            if (module0160.NIL != var9) {
                Locks.release_lock(var8);
            }
        }
        return var7;
    }
    
    public static SubLObject f10413(final SubLObject var6, final SubLObject var21, final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0160.NIL;
        final SubLObject var38 = f10415(var6);
        SubLObject var39 = (SubLObject)module0160.NIL;
        try {
            var39 = Locks.seize_lock(var38);
            final SubLObject var40 = f10419(var6);
            if (module0160.NIL == module0065.f4719(var40)) {
                f10398(var6, module0065.f4745(var21, (SubLObject)module0160.ZERO_INTEGER));
                var37 = (SubLObject)module0160.T;
            }
            var37 = f10420(var6, (SubLObject)module0160.NIL, var21);
        }
        finally {
            if (module0160.NIL != var39) {
                Locks.release_lock(var38);
            }
        }
        return var37;
    }
    
    public static SubLObject f10420(final SubLObject var6, SubLObject var41, SubLObject var21) {
        if (var41 == module0160.UNPROVIDED) {
            var41 = (SubLObject)module0160.NIL;
        }
        if (var21 == module0160.UNPROVIDED) {
            var21 = (SubLObject)module0160.NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (!var21.isFixnum()) {
            var21 = module0065.f4739(f10419(var6));
        }
        SubLObject var43 = (SubLObject)module0160.NIL;
        if (module0160.NIL != var41 && module0160.NIL == module0065.f4719(f10421(var6))) {
            f10399(var6, module0065.f4745(var21, (SubLObject)module0160.ZERO_INTEGER));
            var43 = (SubLObject)module0160.T;
        }
        if (module0160.NIL == module0089.f6045(f10422(var6))) {
            final SubLObject var44 = f10423(var6, var21);
            final SubLObject var45 = Storage.$current_area$.currentBinding(var42);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), var42);
                f10400(var6, module0089.f6073(var44, Symbols.symbol_function((SubLObject)module0160.EQ)));
            }
            finally {
                Storage.$current_area$.rebind(var45, var42);
            }
        }
        return var43;
    }
    
    public static SubLObject f10423(final SubLObject var6, final SubLObject var45) {
        SubLObject var46 = Numbers.multiply(Numbers.integerDivide(var45, (SubLObject)module0160.$ic67$), f10424(var6));
        final SubLObject var47 = f10425(var6);
        if (module0160.NIL != var47 && var46.numG(var47)) {
            var46 = var47;
        }
        if (var46.numL(module0160.$g2153$.getGlobalValue())) {
            var46 = module0160.$g2153$.getGlobalValue();
        }
        return var46;
    }
    
    public static SubLObject f10426(final SubLObject var6, final SubLObject var47, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        if (module0160.NIL == Errors.$ignore_mustsP$.getDynamicValue(var49) && module0160.NIL != module0038.f2673(var47, (SubLObject)module0160.$ic68$, (SubLObject)module0160.UNPROVIDED)) {
            Errors.error((SubLObject)module0160.$ic69$, var47);
        }
        if (module0160.NIL == Errors.$ignore_mustsP$.getDynamicValue(var49) && module0160.NIL != module0038.f2673(var48, (SubLObject)module0160.$ic68$, (SubLObject)module0160.UNPROVIDED)) {
            Errors.error((SubLObject)module0160.$ic69$, var48);
        }
        final SubLObject var50 = module0107.f7597(var47, (SubLObject)module0160.$ic68$);
        final SubLObject var51 = module0107.f7597(var48, (SubLObject)module0160.$ic68$);
        SubLObject var52 = (SubLObject)module0160.NIL;
        final SubLObject var53 = f10415(var6);
        SubLObject var54 = (SubLObject)module0160.NIL;
        try {
            var54 = Locks.seize_lock(var53);
            if (module0160.NIL != Filesys.probe_file(var50) && module0160.NIL != Filesys.probe_file(var51)) {
                final SubLObject var55 = f10387(var6);
                if (module0160.NIL != module0095.f6844(var55)) {
                    module0095.f6849(var55);
                }
                final SubLObject var56 = f10427(var50, var51);
                f10401(var6, var56);
                f10402(var6, module0095.f6854(var56));
                var52 = f10428(var56);
            }
        }
        finally {
            if (module0160.NIL != var54) {
                Locks.release_lock(var53);
            }
        }
        return var52;
    }
    
    public static SubLObject f10429(final SubLObject var20, final SubLObject var22, final SubLObject var23, final SubLObject var40, final SubLObject var55, final SubLObject var56, final SubLObject var24) {
        final SubLObject var57 = f10409((SubLObject)module0160.UNPROVIDED);
        f10395(var57, var20);
        f10396(var57, Locks.make_lock(Sequences.cconcatenate(var20, (SubLObject)module0160.$ic64$)));
        f10397(var57, var22);
        f10406(var57, var23);
        f10398(var57, var40);
        f10400(var57, var55);
        f10399(var57, var56);
        f10401(var57, (SubLObject)module0160.$ic65$);
        f10402(var57, (SubLObject)module0160.ZERO_INTEGER);
        f10403(var57, var24);
        f10404(var57, (SubLObject)module0160.NIL);
        f10405(var57, (SubLObject)module0160.NIL);
        return var57;
    }
    
    public static SubLObject f10430(final SubLObject var6, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        assert module0160.NIL != module0004.f106(var57) : var57;
        final SubLObject var59 = Numbers.ceiling(Numbers.add(var57, Numbers.multiply(var57, (SubLObject)module0160.$ic71$)), (SubLObject)module0160.UNPROVIDED);
        final SubLObject var60 = f10415(var6);
        SubLObject var61 = (SubLObject)module0160.NIL;
        try {
            var61 = Locks.seize_lock(var60);
            final SubLObject var62 = f10419(var6);
            module0065.f4741(var62, var57);
            final SubLObject var63 = Storage.$current_area$.currentBinding(var58);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), var58);
                module0065.f4760(var62, var59);
            }
            finally {
                Storage.$current_area$.rebind(var63, var58);
            }
        }
        finally {
            if (module0160.NIL != var61) {
                Locks.release_lock(var60);
            }
        }
        return var59;
    }
    
    public static SubLObject f10431(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0160.NIL;
        final SubLObject var8 = f10415(var6);
        SubLObject var9 = (SubLObject)module0160.NIL;
        try {
            var9 = Locks.seize_lock(var8);
            final SubLObject var10 = f10421(var6);
            if (module0160.NIL != module0065.f4719(var10)) {
                module0065.f4762(var10);
            }
            final SubLObject var11 = f10422(var6);
            if (module0160.NIL != module0089.f6045(var11)) {
                module0089.f6092(var11);
            }
            final SubLObject var12 = f10419(var6);
            var7 = module0065.f4762(var12);
        }
        finally {
            if (module0160.NIL != var9) {
                Locks.release_lock(var8);
            }
        }
        return var7;
    }
    
    public static SubLObject f10432(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10381(var6);
    }
    
    public static SubLObject f10415(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10382(var6);
    }
    
    public static SubLObject f10424(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10383(var6);
    }
    
    public static SubLObject f10425(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10392(var6);
    }
    
    public static SubLObject f10419(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10384(var6);
    }
    
    public static SubLObject f10421(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10385(var6);
    }
    
    public static SubLObject f10422(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10386(var6);
    }
    
    public static SubLObject f10416(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10387(var6);
    }
    
    public static SubLObject f10433(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10388(var6);
    }
    
    public static SubLObject f10434(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10389(var6);
    }
    
    public static SubLObject f10435(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10390(var6);
    }
    
    public static SubLObject f10436(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        return f10391(var6);
    }
    
    public static SubLObject f10437(final SubLObject var6) {
        return module0065.f4719(f10421(var6));
    }
    
    public static SubLObject f10438(final SubLObject var6) {
        final SubLObject var7 = f10419(var6);
        if (module0160.NIL == module0065.f4719(var7)) {
            return (SubLObject)module0160.ZERO_INTEGER;
        }
        return module0065.f4733(var7);
    }
    
    public static SubLObject f10439(final SubLObject var6, final SubLObject var63) {
        return module0107.f7629(module0065.f4750(f10419(var6), var63, module0107.f7627()));
    }
    
    public static SubLObject f10440(final SubLObject var6, final SubLObject var63) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0160.NIL != module0107.f7629(module0065.f4750(f10419(var6), var63, module0107.f7627())) || module0160.NIL != f10441(var6, var63));
    }
    
    public static SubLObject f10442(final SubLObject var6, final SubLObject var63) {
        SubLObject var64 = (SubLObject)module0160.NIL;
        final SubLObject var65 = f10415(var6);
        SubLObject var66 = (SubLObject)module0160.NIL;
        try {
            var66 = Locks.seize_lock(var65);
            final SubLObject var67 = f10419(var6);
            var64 = module0065.f4750(var67, var63, module0107.f7627());
            if (module0160.NIL != module0107.f7628(var64)) {
                if (module0160.NIL != f10441(var6, var63)) {
                    f10443(var6, var63);
                    var64 = module0065.f4750(var67, var63, (SubLObject)module0160.UNPROVIDED);
                }
                else {
                    var64 = (SubLObject)module0160.NIL;
                }
            }
            else {
                f10444(var6, var63);
            }
        }
        finally {
            if (module0160.NIL != var66) {
                Locks.release_lock(var65);
            }
        }
        return var64;
    }
    
    public static SubLObject f10445(final SubLObject var6) {
        assert module0160.NIL != f10380(var6) : var6;
        SubLObject var7 = (SubLObject)module0160.NIL;
        final SubLObject var8 = f10415(var6);
        SubLObject var9 = (SubLObject)module0160.NIL;
        try {
            var9 = Locks.seize_lock(var8);
            var7 = module0095.f6844(f10416(var6));
        }
        finally {
            if (module0160.NIL != var9) {
                Locks.release_lock(var8);
            }
        }
        if (module0160.NIL != var7) {
            return (SubLObject)module0160.NIL;
        }
        final SubLObject var10 = f10419(var6);
        if (module0160.NIL != module0065.f4719(var10) && module0065.f4733(var10).isPositive()) {
            return (SubLObject)module0160.NIL;
        }
        return (SubLObject)module0160.T;
    }
    
    public static SubLObject f10446(final SubLObject var6) {
        if (module0160.NIL == f10437(var6)) {
            final SubLObject var7 = f10415(var6);
            SubLObject var8 = (SubLObject)module0160.NIL;
            try {
                var8 = Locks.seize_lock(var7);
                f10420(var6, (SubLObject)module0160.T, (SubLObject)module0160.UNPROVIDED);
            }
            finally {
                if (module0160.NIL != var8) {
                    Locks.release_lock(var7);
                }
            }
        }
        return (SubLObject)module0160.T;
    }
    
    public static SubLObject f10447(final SubLObject var6) {
        if (module0160.NIL != f10437(var6)) {
            final SubLObject var7 = f10415(var6);
            SubLObject var8 = (SubLObject)module0160.NIL;
            try {
                var8 = Locks.seize_lock(var7);
                f10399(var6, (SubLObject)module0160.NIL);
            }
            finally {
                if (module0160.NIL != var8) {
                    Locks.release_lock(var7);
                }
            }
        }
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10448(final SubLObject var6, final SubLObject var63, final SubLObject var75) {
        final SubLObject var76 = f10415(var6);
        SubLObject var77 = (SubLObject)module0160.NIL;
        try {
            var77 = Locks.seize_lock(var76);
            module0065.f4753(f10419(var6), var63, var75);
        }
        finally {
            if (module0160.NIL != var77) {
                Locks.release_lock(var76);
            }
        }
        return var75;
    }
    
    public static SubLObject f10449(final SubLObject var6, final SubLObject var63) {
        SubLObject var64 = (SubLObject)module0160.NIL;
        final SubLObject var65 = f10415(var6);
        SubLObject var66 = (SubLObject)module0160.NIL;
        try {
            var66 = Locks.seize_lock(var65);
            var64 = module0065.f4761(f10419(var6), var63);
            f10450(var6, var63);
        }
        finally {
            if (module0160.NIL != var66) {
                Locks.release_lock(var65);
            }
        }
        return var64;
    }
    
    public static SubLObject f10427(final SubLObject var81, final SubLObject var82) {
        return module0095.f6845(var81, var82, (SubLObject)module0160.UNPROVIDED, (SubLObject)module0160.UNPROVIDED, (SubLObject)module0160.UNPROVIDED, (SubLObject)module0160.UNPROVIDED);
    }
    
    public static SubLObject f10451(final SubLObject var54) {
        return module0095.f6852(var54);
    }
    
    public static SubLObject f10428(final SubLObject var83) {
        return module0095.f6844(var83);
    }
    
    public static SubLObject f10452(final SubLObject var6, final SubLObject var63) {
        final SubLObject var64 = module0095.f6858(f10416(var6), var63);
        final SubLObject var65 = module0021.f1060(var64, (SubLObject)module0160.UNPROVIDED, (SubLObject)module0160.UNPROVIDED);
        if (!var65.isFixnum() || !var65.numE(var63)) {
            Errors.error((SubLObject)module0160.$ic72$, var63, var64, var65);
        }
        final SubLObject var66 = f10434(var6);
        Functions.funcall(var66, var63, var64);
        return var63;
    }
    
    public static SubLObject f10441(final SubLObject var6, final SubLObject var63) {
        return Numbers.numL(var63, f10433(var6));
    }
    
    public static SubLObject f10444(final SubLObject var6, final SubLObject var63) {
        if (module0160.NIL != f10437(var6)) {
            f10453(var6, var63);
        }
        final SubLObject var64 = f10422(var6);
        if (module0160.NIL != module0089.f6045(var64) && module0160.NIL != f10441(var6, var63)) {
            module0089.f6079(var64, var63, (SubLObject)module0160.UNPROVIDED);
        }
        return var63;
    }
    
    public static SubLObject f10450(final SubLObject var6, final SubLObject var63) {
        final SubLObject var64 = f10422(var6);
        if (module0160.NIL != module0089.f6045(var64) && module0160.NIL != f10441(var6, var63)) {
            module0089.f6087(var64, var63);
        }
        return var63;
    }
    
    public static SubLObject f10454(final SubLObject var6, final SubLObject var63) {
        final SubLObject var64 = f10415(var6);
        SubLObject var65 = (SubLObject)module0160.NIL;
        try {
            var65 = Locks.seize_lock(var64);
            final SubLObject var66 = f10422(var6);
            if (module0160.NIL != module0089.f6045(var66) && module0160.NIL != f10441(var6, var63)) {
                module0089.f6087(var66, var63);
            }
        }
        finally {
            if (module0160.NIL != var65) {
                Locks.release_lock(var64);
            }
        }
        return var63;
    }
    
    public static SubLObject f10455(final SubLObject var6) {
        f10404(var6, (SubLObject)module0160.T);
        return (SubLObject)module0160.T;
    }
    
    public static SubLObject f10456(final SubLObject var6) {
        f10404(var6, (SubLObject)module0160.NIL);
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10457(final SubLObject var6) {
        f10405(var6, (SubLObject)module0160.ZERO_INTEGER);
        return (SubLObject)module0160.ZERO_INTEGER;
    }
    
    public static SubLObject f10458(final SubLObject var6) {
        return f10433(var6);
    }
    
    public static SubLObject f10443(final SubLObject var6, final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        final SubLObject var65 = module0111.$g1394$.currentBinding(var64);
        final SubLObject var66 = module0111.$g1396$.currentBinding(var64);
        final SubLObject var67 = module0111.$g1398$.currentBinding(var64);
        final SubLObject var68 = module0111.$g1400$.currentBinding(var64);
        final SubLObject var69 = module0111.$g1402$.currentBinding(var64);
        final SubLObject var70 = module0111.$g1404$.currentBinding(var64);
        try {
            module0111.$g1394$.bind((SubLObject)module0160.NIL, var64);
            module0111.$g1396$.bind((SubLObject)module0160.NIL, var64);
            module0111.$g1398$.bind((SubLObject)module0160.NIL, var64);
            module0111.$g1400$.bind((SubLObject)module0160.NIL, var64);
            module0111.$g1402$.bind((SubLObject)module0160.NIL, var64);
            module0111.$g1404$.bind((SubLObject)module0160.NIL, var64);
            if (module0160.NIL != f10435(var6)) {
                f10459(var6, var63);
            }
            else {
                f10460(var6, var63);
            }
        }
        finally {
            module0111.$g1404$.rebind(var70, var64);
            module0111.$g1402$.rebind(var69, var64);
            module0111.$g1400$.rebind(var68, var64);
            module0111.$g1398$.rebind(var67, var64);
            module0111.$g1396$.rebind(var66, var64);
            module0111.$g1394$.rebind(var65, var64);
        }
        return var63;
    }
    
    public static SubLObject f10459(final SubLObject var6, final SubLObject var63) {
        SubLObject var64 = (SubLObject)module0160.NIL;
        final SubLObject var65 = Time.get_internal_real_time();
        f10460(var6, var63);
        var64 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var65), time_high.$internal_time_units_per_second$.getGlobalValue());
        f10405(var6, Numbers.add(f10391(var6), var64));
        return var63;
    }
    
    public static SubLObject f10460(final SubLObject var6, final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        final SubLObject var65 = module0021.$g777$.currentBinding(var64);
        try {
            module0021.$g777$.bind((SubLObject)module0160.NIL, var64);
            module0021.f1151(module0107.f7590());
            f10452(var6, var63);
        }
        finally {
            module0021.$g777$.rebind(var65, var64);
        }
        f10453(var6, var63);
        var64.resetMultipleValues();
        final SubLObject var66 = module0089.f6085(f10422(var6), var63, var63);
        final SubLObject var67 = var64.secondMultipleValue();
        final SubLObject var68 = var64.thirdMultipleValue();
        var64.resetMultipleValues();
        if (var66.isFixnum()) {
            f10461(var6, var66);
        }
        return var63;
    }
    
    public static SubLObject f10461(final SubLObject var6, final SubLObject var95) {
        module0065.f4761(f10419(var6), var95);
        return var95;
    }
    
    public static SubLObject f10462(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0160.NIL;
        final SubLObject var8 = f10415(var6);
        SubLObject var9 = (SubLObject)module0160.NIL;
        try {
            var9 = Locks.seize_lock(var8);
            var7 = f10463(var6);
        }
        finally {
            if (module0160.NIL != var9) {
                Locks.release_lock(var8);
            }
        }
        return var7;
    }
    
    public static SubLObject f10463(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0160.NIL;
        final SubLObject var10;
        final SubLObject var9 = var10 = f10422(var6);
        final SubLObject var11 = (SubLObject)module0160.$ic73$;
        SubLObject var12 = module0089.f6097(var10, var11);
        SubLObject var13 = (SubLObject)module0160.NIL;
        SubLObject var14 = (SubLObject)module0160.NIL;
        while (module0160.NIL == module0089.f6098(var10, var12)) {
            var13 = module0089.f6099(var12);
            var14 = module0089.f6100(var12);
            var12 = module0089.f6101(var12, var11);
            var8 = (SubLObject)ConsesLow.cons(var13, var8);
        }
        final SubLObject var15;
        var8 = (var15 = Sort.sort(var8, Symbols.symbol_function((SubLObject)module0160.$ic74$), (SubLObject)module0160.UNPROVIDED));
        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)module0160.$ic75$, new SubLObject[] { f10432(var6), module0160.$ic76$ }), var7);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var7);
        module0012.$g83$.setDynamicValue(Sequences.length(var15), var7);
        module0012.$g84$.setDynamicValue((SubLObject)module0160.ZERO_INTEGER, var7);
        final SubLObject var16 = module0012.$g75$.currentBinding(var7);
        final SubLObject var17 = module0012.$g76$.currentBinding(var7);
        final SubLObject var18 = module0012.$g77$.currentBinding(var7);
        final SubLObject var19 = module0012.$g78$.currentBinding(var7);
        try {
            module0012.$g75$.bind((SubLObject)module0160.ZERO_INTEGER, var7);
            module0012.$g76$.bind((SubLObject)module0160.NIL, var7);
            module0012.$g77$.bind((SubLObject)module0160.T, var7);
            module0012.$g78$.bind(Time.get_universal_time(), var7);
            module0012.f478(module0012.$g82$.getDynamicValue(var7));
            SubLObject var20 = var15;
            SubLObject var21 = (SubLObject)module0160.NIL;
            var21 = var20.first();
            while (module0160.NIL != var20) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var7), module0012.$g83$.getDynamicValue(var7));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var7), (SubLObject)module0160.ONE_INTEGER), var7);
                module0089.f6087(var9, var21);
                f10461(var6, var21);
                var20 = var20.rest();
                var21 = var20.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var19, var7);
            module0012.$g77$.rebind(var18, var7);
            module0012.$g76$.rebind(var17, var7);
            module0012.$g75$.rebind(var16, var7);
        }
        return Sequences.length(var8);
    }
    
    public static SubLObject f10453(final SubLObject var6, final SubLObject var63) {
        if (module0160.NIL != f10437(var6)) {
            final SubLObject var64 = f10421(var6);
            final SubLObject var65 = module0065.f4750(var64, var63, (SubLObject)module0160.UNPROVIDED);
            final SubLObject var66 = (SubLObject)((module0160.NIL != var65) ? module0048.f_1X(var65) : module0160.ONE_INTEGER);
            module0065.f4753(var64, var63, var66);
            return var63;
        }
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10464(final SubLObject var6, final SubLObject var110, SubLObject var111) {
        if (var111 == module0160.UNPROVIDED) {
            var111 = (SubLObject)module0160.NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)module0160.ZERO_INTEGER;
        final SubLObject var114 = Sequences.cconcatenate((SubLObject)module0160.$ic77$, new SubLObject[] { f10432(var6), module0160.$ic78$ });
        final SubLObject var115 = f10419(var6);
        final SubLObject var116 = var114;
        final SubLObject var117 = module0065.f4733(var115);
        SubLObject var118 = (SubLObject)module0160.ZERO_INTEGER;
        assert module0160.NIL != Types.stringp(var116) : var116;
        final SubLObject var119 = module0012.$g75$.currentBinding(var112);
        final SubLObject var120 = module0012.$g76$.currentBinding(var112);
        final SubLObject var121 = module0012.$g77$.currentBinding(var112);
        final SubLObject var122 = module0012.$g78$.currentBinding(var112);
        try {
            module0012.$g75$.bind((SubLObject)module0160.ZERO_INTEGER, var112);
            module0012.$g76$.bind((SubLObject)module0160.NIL, var112);
            module0012.$g77$.bind((SubLObject)module0160.T, var112);
            module0012.$g78$.bind(Time.get_universal_time(), var112);
            module0012.f478(var116);
            final SubLObject var118_119 = var115;
            if (module0160.NIL == module0065.f4772(var118_119, (SubLObject)module0160.$ic79$)) {
                final SubLObject var120_121 = var118_119;
                if (module0160.NIL == module0065.f4775(var120_121, (SubLObject)module0160.$ic79$)) {
                    final SubLObject var123 = module0065.f4740(var120_121);
                    final SubLObject var124 = (SubLObject)module0160.NIL;
                    SubLObject var125;
                    SubLObject var126;
                    SubLObject var127;
                    SubLObject var128;
                    for (var125 = Sequences.length(var123), var126 = (SubLObject)module0160.NIL, var126 = (SubLObject)module0160.ZERO_INTEGER; var126.numL(var125); var126 = Numbers.add(var126, (SubLObject)module0160.ONE_INTEGER)) {
                        var127 = ((module0160.NIL != var124) ? Numbers.subtract(var125, var126, (SubLObject)module0160.ONE_INTEGER) : var126);
                        var128 = Vectors.aref(var123, var127);
                        if (module0160.NIL == module0065.f4749(var128) || module0160.NIL == module0065.f4773((SubLObject)module0160.$ic79$)) {
                            if (module0160.NIL != module0065.f4749(var128)) {
                                var128 = (SubLObject)module0160.$ic79$;
                            }
                            module0012.note_percent_progress(var118, var117);
                            var118 = Numbers.add(var118, (SubLObject)module0160.ONE_INTEGER);
                            if (module0160.NIL != var128 && module0160.NIL == Functions.funcall(var110, var128)) {
                                var113 = Numbers.add(var113, (SubLObject)module0160.ONE_INTEGER);
                                if (module0160.NIL != var111) {
                                    Errors.warn((SubLObject)module0160.$ic80$, var127, var128);
                                    f10461(var6, var127);
                                }
                                else {
                                    Errors.warn((SubLObject)module0160.$ic81$, var127, var128);
                                }
                            }
                        }
                    }
                }
                final SubLObject var126_127 = var118_119;
                if (module0160.NIL == module0065.f4777(var126_127)) {
                    final SubLObject var129 = module0065.f4738(var126_127);
                    SubLObject var130 = (SubLObject)module0160.NIL;
                    SubLObject var131 = (SubLObject)module0160.NIL;
                    final Iterator var132 = Hashtables.getEntrySetIterator(var129);
                    try {
                        while (Hashtables.iteratorHasNext(var132)) {
                            final Map.Entry var133 = Hashtables.iteratorNextEntry(var132);
                            var130 = Hashtables.getEntryKey(var133);
                            var131 = Hashtables.getEntryValue(var133);
                            module0012.note_percent_progress(var118, var117);
                            var118 = Numbers.add(var118, (SubLObject)module0160.ONE_INTEGER);
                            if (module0160.NIL != var131 && module0160.NIL == Functions.funcall(var110, var131)) {
                                var113 = Numbers.add(var113, (SubLObject)module0160.ONE_INTEGER);
                                if (module0160.NIL != var111) {
                                    Errors.warn((SubLObject)module0160.$ic80$, var130, var131);
                                    f10461(var6, var130);
                                }
                                else {
                                    Errors.warn((SubLObject)module0160.$ic81$, var130, var131);
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var132);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var122, var112);
            module0012.$g77$.rebind(var121, var112);
            module0012.$g76$.rebind(var120, var112);
            module0012.$g75$.rebind(var119, var112);
        }
        return Values.values(Numbers.numE(var113, (SubLObject)module0160.ZERO_INTEGER), var113);
    }
    
    public static SubLObject f10465(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0160.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0160.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0160.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0160.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)module0160.$ic82$;
            final SubLObject var9 = (SubLObject)module0160.$ic83$;
            final SubLObject var10 = (SubLObject)module0160.$ic84$;
            return (SubLObject)ConsesLow.list((SubLObject)module0160.$ic85$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, var6), (SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)module0160.$ic86$, var8)), (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)module0160.$ic87$, var8))), (SubLObject)ConsesLow.list((SubLObject)module0160.$ic88$, (SubLObject)ConsesLow.listS((SubLObject)module0160.$ic89$, (SubLObject)ConsesLow.list((SubLObject)module0160.$ic90$, var8), (SubLObject)ConsesLow.list((SubLObject)module0160.$ic91$, var8), ConsesLow.append(var7, (SubLObject)module0160.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0160.$ic89$, (SubLObject)ConsesLow.list((SubLObject)module0160.$ic92$, var9, (SubLObject)ConsesLow.list((SubLObject)module0160.$ic93$, var8)), (SubLObject)ConsesLow.list((SubLObject)module0160.$ic92$, (SubLObject)ConsesLow.list((SubLObject)module0160.$ic94$, var10), (SubLObject)ConsesLow.listS((SubLObject)module0160.$ic95$, var8, (SubLObject)module0160.$ic96$)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0160.$ic0$);
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10466(final SubLObject var6, SubLObject var9, SubLObject var137) {
        if (var9 == module0160.UNPROVIDED) {
            var9 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var137 == module0160.UNPROVIDED) {
            var137 = (SubLObject)module0160.NIL;
        }
        final SubLObject var138 = f10387(var6);
        module0096.f7005(var138, var9, var137);
        return var6;
    }
    
    public static SubLObject f10467(final SubLObject var6, final SubLObject var63) {
        final SubLObject var64 = f10387(var6);
        return module0096.f7006(var64, var63);
    }
    
    public static SubLObject f10468() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0160", "f10378", "S#13154");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10379", "S#13155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10380", "S#13153", 1, 0, false);
        new $f10380$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10381", "S#13156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10382", "S#13157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10383", "S#13158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10384", "S#13159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10385", "S#13160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10386", "S#13161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10387", "S#13162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10388", "S#13163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10389", "S#13164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10390", "S#13165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10391", "S#13166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10392", "S#13167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10393", "S#13168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10394", "S#13169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10395", "S#13170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10396", "S#13171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10397", "S#13172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10398", "S#13173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10399", "S#13174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10400", "S#13175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10401", "S#13176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10402", "S#13177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10403", "S#13178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10404", "S#13179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10405", "S#13180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10406", "S#13181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10407", "S#13182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10408", "S#13183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10409", "S#13184", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10410", "S#13185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10411", "S#13186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10412", "S#13187", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10414", "S#13188", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10417", "S#13189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10418", "S#13190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10413", "S#13191", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10420", "S#13192", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10423", "S#13193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10426", "S#13194", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10429", "S#13195", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10430", "S#13196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10431", "S#13197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10432", "S#13198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10415", "S#13199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10424", "S#13200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10425", "S#13201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10419", "S#13202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10421", "S#13203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10422", "S#13204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10416", "S#13205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10433", "S#13206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10434", "S#13207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10435", "S#13208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10436", "S#13209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10437", "S#13210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10438", "S#13211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10439", "S#13212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10440", "S#13213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10442", "S#13214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10445", "S#13215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10446", "S#13216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10447", "S#13217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10448", "S#13218", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10449", "S#13219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10427", "S#13220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10451", "S#13221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10428", "S#13222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10452", "S#13223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10441", "S#13224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10444", "S#13225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10450", "S#13226", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10454", "S#13227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10455", "S#13228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10456", "S#13229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10457", "S#13230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10458", "S#13231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10443", "S#13232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10459", "S#13233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10460", "S#13234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10461", "S#13235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10462", "S#13236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10463", "S#13237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10453", "S#13238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10464", "S#13239", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0160", "f10465", "S#13240");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10466", "S#13241", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0160", "f10467", "S#13242", 2, 0, false);
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10469() {
        module0160.$g2152$ = SubLFiles.defconstant("S#13243", (SubLObject)module0160.$ic3$);
        module0160.$g2153$ = SubLFiles.deflexical("S#13244", (SubLObject)module0160.$ic66$);
        return (SubLObject)module0160.NIL;
    }
    
    public static SubLObject f10470() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0160.$g2152$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0160.$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0160.$ic11$);
        Structures.def_csetf((SubLObject)module0160.$ic12$, (SubLObject)module0160.$ic13$);
        Structures.def_csetf((SubLObject)module0160.$ic14$, (SubLObject)module0160.$ic15$);
        Structures.def_csetf((SubLObject)module0160.$ic16$, (SubLObject)module0160.$ic17$);
        Structures.def_csetf((SubLObject)module0160.$ic18$, (SubLObject)module0160.$ic19$);
        Structures.def_csetf((SubLObject)module0160.$ic20$, (SubLObject)module0160.$ic21$);
        Structures.def_csetf((SubLObject)module0160.$ic22$, (SubLObject)module0160.$ic23$);
        Structures.def_csetf((SubLObject)module0160.$ic24$, (SubLObject)module0160.$ic25$);
        Structures.def_csetf((SubLObject)module0160.$ic26$, (SubLObject)module0160.$ic27$);
        Structures.def_csetf((SubLObject)module0160.$ic28$, (SubLObject)module0160.$ic29$);
        Structures.def_csetf((SubLObject)module0160.$ic30$, (SubLObject)module0160.$ic31$);
        Structures.def_csetf((SubLObject)module0160.$ic32$, (SubLObject)module0160.$ic33$);
        Structures.def_csetf((SubLObject)module0160.$ic34$, (SubLObject)module0160.$ic35$);
        Structures.def_csetf((SubLObject)module0160.$ic36$, (SubLObject)module0160.$ic37$);
        Structures.def_csetf((SubLObject)module0160.$ic38$, (SubLObject)module0160.$ic39$);
        Equality.identity((SubLObject)module0160.$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0160.$g2152$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0160.$ic59$));
        module0002.f35((SubLObject)module0160.$ic70$, (SubLObject)module0160.NIL);
        return (SubLObject)module0160.NIL;
    }
    
    public void declareFunctions() {
        f10468();
    }
    
    public void initializeVariables() {
        f10469();
    }
    
    public void runTopLevelForms() {
        f10470();
    }
    
    static {
        me = (SubLFile)new module0160();
        module0160.$g2152$ = null;
        module0160.$g2153$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13245", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic2$ = SubLObjectFactory.makeSymbol("S#13199", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#13152", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#13153", "CYC");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#13246", "CYC"), SubLObjectFactory.makeSymbol("S#13247", "CYC"), SubLObjectFactory.makeSymbol("S#13248", "CYC"), SubLObjectFactory.makeSymbol("S#13249", "CYC"), SubLObjectFactory.makeSymbol("S#13250", "CYC"), SubLObjectFactory.makeSymbol("S#8813", "CYC"), SubLObjectFactory.makeSymbol("S#13251", "CYC"), SubLObjectFactory.makeSymbol("S#13252", "CYC"), SubLObjectFactory.makeSymbol("S#13253", "CYC"), SubLObjectFactory.makeSymbol("S#13254", "CYC"), SubLObjectFactory.makeSymbol("S#13255", "CYC"), SubLObjectFactory.makeSymbol("S#13256", "CYC"), SubLObjectFactory.makeSymbol("S#13257", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("CONTENT-LOCK"), SubLObjectFactory.makeKeyword("LRU-SIZE-PERCENTAGE"), SubLObjectFactory.makeKeyword("CONTENT-TABLE"), SubLObjectFactory.makeKeyword("USAGE-TABLE"), SubLObjectFactory.makeKeyword("LRU-INFORMATION"), SubLObjectFactory.makeKeyword("FILE-VECTOR"), SubLObjectFactory.makeKeyword("ID-THRESHOLD"), SubLObjectFactory.makeKeyword("LOAD-FUNC"), SubLObjectFactory.makeKeyword("METER-SWAP-TIME?"), SubLObjectFactory.makeKeyword("SWAP-TIME"), SubLObjectFactory.makeKeyword("LRU-SIZE-MAX"), SubLObjectFactory.makeKeyword("DUMMY2"), SubLObjectFactory.makeKeyword("DUMMY3") });
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#13156", "CYC"), SubLObjectFactory.makeSymbol("S#13157", "CYC"), SubLObjectFactory.makeSymbol("S#13158", "CYC"), SubLObjectFactory.makeSymbol("S#13159", "CYC"), SubLObjectFactory.makeSymbol("S#13160", "CYC"), SubLObjectFactory.makeSymbol("S#13161", "CYC"), SubLObjectFactory.makeSymbol("S#13162", "CYC"), SubLObjectFactory.makeSymbol("S#13163", "CYC"), SubLObjectFactory.makeSymbol("S#13164", "CYC"), SubLObjectFactory.makeSymbol("S#13165", "CYC"), SubLObjectFactory.makeSymbol("S#13166", "CYC"), SubLObjectFactory.makeSymbol("S#13167", "CYC"), SubLObjectFactory.makeSymbol("S#13168", "CYC"), SubLObjectFactory.makeSymbol("S#13169", "CYC") });
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#13170", "CYC"), SubLObjectFactory.makeSymbol("S#13171", "CYC"), SubLObjectFactory.makeSymbol("S#13172", "CYC"), SubLObjectFactory.makeSymbol("S#13173", "CYC"), SubLObjectFactory.makeSymbol("S#13174", "CYC"), SubLObjectFactory.makeSymbol("S#13175", "CYC"), SubLObjectFactory.makeSymbol("S#13176", "CYC"), SubLObjectFactory.makeSymbol("S#13177", "CYC"), SubLObjectFactory.makeSymbol("S#13178", "CYC"), SubLObjectFactory.makeSymbol("S#13179", "CYC"), SubLObjectFactory.makeSymbol("S#13180", "CYC"), SubLObjectFactory.makeSymbol("S#13181", "CYC"), SubLObjectFactory.makeSymbol("S#13182", "CYC"), SubLObjectFactory.makeSymbol("S#13183", "CYC") });
        $ic9$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic10$ = SubLObjectFactory.makeSymbol("S#13155", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#13153", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#13156", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#13170", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#13157", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#13171", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#13158", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#13172", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#13159", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#13173", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#13160", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#13174", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#13161", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#13175", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#13162", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#13176", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#13163", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#13177", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#13164", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#13178", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#13165", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#13179", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#13166", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#13180", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#13167", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#13181", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#13168", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#13182", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#13169", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#13183", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("NAME");
        $ic41$ = SubLObjectFactory.makeKeyword("CONTENT-LOCK");
        $ic42$ = SubLObjectFactory.makeKeyword("LRU-SIZE-PERCENTAGE");
        $ic43$ = SubLObjectFactory.makeKeyword("CONTENT-TABLE");
        $ic44$ = SubLObjectFactory.makeKeyword("USAGE-TABLE");
        $ic45$ = SubLObjectFactory.makeKeyword("LRU-INFORMATION");
        $ic46$ = SubLObjectFactory.makeKeyword("FILE-VECTOR");
        $ic47$ = SubLObjectFactory.makeKeyword("ID-THRESHOLD");
        $ic48$ = SubLObjectFactory.makeKeyword("LOAD-FUNC");
        $ic49$ = SubLObjectFactory.makeKeyword("METER-SWAP-TIME?");
        $ic50$ = SubLObjectFactory.makeKeyword("SWAP-TIME");
        $ic51$ = SubLObjectFactory.makeKeyword("LRU-SIZE-MAX");
        $ic52$ = SubLObjectFactory.makeKeyword("DUMMY2");
        $ic53$ = SubLObjectFactory.makeKeyword("DUMMY3");
        $ic54$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic55$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic56$ = SubLObjectFactory.makeSymbol("S#13184", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic58$ = SubLObjectFactory.makeKeyword("END");
        $ic59$ = SubLObjectFactory.makeSymbol("S#13186", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic61$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic62$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic63$ = SubLObjectFactory.makeSymbol("FBOUNDP");
        $ic64$ = SubLObjectFactory.makeString(" content manager lock");
        $ic65$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic66$ = SubLObjectFactory.makeInteger(212);
        $ic67$ = SubLObjectFactory.makeInteger(100);
        $ic68$ = SubLObjectFactory.makeString("cfasl");
        $ic69$ = SubLObjectFactory.makeString("Got ~s, expected an extensionless filename");
        $ic70$ = SubLObjectFactory.makeSymbol("S#13195", "CYC");
        $ic71$ = (SubLFloat)SubLObjectFactory.makeDouble(0.05);
        $ic72$ = SubLObjectFactory.makeString("We did not manage to swap the KB object ~D back in from the CFASL stream ~A; got ~D instead.");
        $ic73$ = SubLObjectFactory.makeKeyword("NEWEST");
        $ic74$ = SubLObjectFactory.makeSymbol("<");
        $ic75$ = SubLObjectFactory.makeString("Swapping out ");
        $ic76$ = SubLObjectFactory.makeString(" objects");
        $ic77$ = SubLObjectFactory.makeString("Verifying integrity of ");
        $ic78$ = SubLObjectFactory.makeString(" content table");
        $ic79$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic80$ = SubLObjectFactory.makeString("Entry ~a is invalid: ~a, repairing");
        $ic81$ = SubLObjectFactory.makeString("Entry ~a is invalid: ~a");
        $ic82$ = SubLObjectFactory.makeUninternedSymbol("US#7570B50");
        $ic83$ = SubLObjectFactory.makeUninternedSymbol("US#353B442");
        $ic84$ = SubLObjectFactory.makeUninternedSymbol("US#7014416");
        $ic85$ = SubLObjectFactory.makeSymbol("CLET");
        $ic86$ = SubLObjectFactory.makeSymbol("S#13210", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#13190", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic89$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic90$ = SubLObjectFactory.makeSymbol("S#13217", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#13189", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic93$ = SubLObjectFactory.makeSymbol("S#13216", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic95$ = SubLObjectFactory.makeSymbol("S#13188", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2048), (SubLObject)SubLObjectFactory.makeInteger(256));
    }
    
    public static final class $sX13152_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $content_lock;
        public SubLObject $lru_size_percentage;
        public SubLObject $content_table;
        public SubLObject $usage_table;
        public SubLObject $lru_information;
        public SubLObject $file_vector;
        public SubLObject $id_threshold;
        public SubLObject $load_func;
        public SubLObject $meter_swap_timeP;
        public SubLObject $swap_time;
        public SubLObject $lru_size_max;
        public SubLObject $dummy2;
        public SubLObject $dummy3;
        private static final SubLStructDeclNative structDecl;
        
        public $sX13152_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$content_lock = (SubLObject)CommonSymbols.NIL;
            this.$lru_size_percentage = (SubLObject)CommonSymbols.NIL;
            this.$content_table = (SubLObject)CommonSymbols.NIL;
            this.$usage_table = (SubLObject)CommonSymbols.NIL;
            this.$lru_information = (SubLObject)CommonSymbols.NIL;
            this.$file_vector = (SubLObject)CommonSymbols.NIL;
            this.$id_threshold = (SubLObject)CommonSymbols.NIL;
            this.$load_func = (SubLObject)CommonSymbols.NIL;
            this.$meter_swap_timeP = (SubLObject)CommonSymbols.NIL;
            this.$swap_time = (SubLObject)CommonSymbols.NIL;
            this.$lru_size_max = (SubLObject)CommonSymbols.NIL;
            this.$dummy2 = (SubLObject)CommonSymbols.NIL;
            this.$dummy3 = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX13152_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$content_lock;
        }
        
        public SubLObject getField4() {
            return this.$lru_size_percentage;
        }
        
        public SubLObject getField5() {
            return this.$content_table;
        }
        
        public SubLObject getField6() {
            return this.$usage_table;
        }
        
        public SubLObject getField7() {
            return this.$lru_information;
        }
        
        public SubLObject getField8() {
            return this.$file_vector;
        }
        
        public SubLObject getField9() {
            return this.$id_threshold;
        }
        
        public SubLObject getField10() {
            return this.$load_func;
        }
        
        public SubLObject getField11() {
            return this.$meter_swap_timeP;
        }
        
        public SubLObject getField12() {
            return this.$swap_time;
        }
        
        public SubLObject getField13() {
            return this.$lru_size_max;
        }
        
        public SubLObject getField14() {
            return this.$dummy2;
        }
        
        public SubLObject getField15() {
            return this.$dummy3;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$content_lock = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lru_size_percentage = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$content_table = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$usage_table = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$lru_information = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$file_vector = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$id_threshold = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$load_func = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$meter_swap_timeP = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$swap_time = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$lru_size_max = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$dummy2 = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$dummy3 = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX13152_native.class, module0160.$ic3$, module0160.$ic4$, module0160.$ic5$, module0160.$ic6$, new String[] { "$name", "$content_lock", "$lru_size_percentage", "$content_table", "$usage_table", "$lru_information", "$file_vector", "$id_threshold", "$load_func", "$meter_swap_timeP", "$swap_time", "$lru_size_max", "$dummy2", "$dummy3" }, module0160.$ic7$, module0160.$ic8$, module0160.$ic9$);
        }
    }
    
    public static final class $f10380$UnaryFunction extends UnaryFunction
    {
        public $f10380$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13153"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0160.f10380(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0160.class
	Total time: 345 ms
	
	Decompiled with Procyon 0.5.32.
*/