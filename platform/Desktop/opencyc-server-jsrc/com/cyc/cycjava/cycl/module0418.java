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

public final class module0418 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0418";
    public static final String myFingerPrint = "dc54e4831a502e78fc5673ea1670398e0012c2e6a33b47b49ec0266dc91cf724";
    public static SubLSymbol $g3411$;
    private static SubLSymbol $g3412$;
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
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    
    
    public static SubLObject f29255(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0418.ZERO_INTEGER);
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29256(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX32431_native.class) ? module0418.T : module0418.NIL);
    }
    
    public static SubLObject f29257(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f29258(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f29259(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f29260(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f29261(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f29262(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f29263(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f29264(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f29265(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f29266(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f29267(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f29268(final SubLObject var1) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f29269(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f29270(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f29271(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f29272(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f29273(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f29274(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f29275(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f29276(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f29277(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f29278(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f29279(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f29280(final SubLObject var1, final SubLObject var4) {
        assert module0418.NIL != f29256(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f29281(SubLObject var5) {
        if (var5 == module0418.UNPROVIDED) {
            var5 = (SubLObject)module0418.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX32431_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0418.NIL, var7 = var5; module0418.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0418.$ic33$)) {
                f29269(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic34$)) {
                f29270(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic35$)) {
                f29271(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic36$)) {
                f29272(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic37$)) {
                f29273(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic38$)) {
                f29274(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic39$)) {
                f29275(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic40$)) {
                f29276(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic41$)) {
                f29277(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic42$)) {
                f29278(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic43$)) {
                f29279(var6, var9);
            }
            else if (var10.eql((SubLObject)module0418.$ic44$)) {
                f29280(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0418.$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f29282(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic46$, (SubLObject)module0418.$ic47$, (SubLObject)module0418.TWELVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic33$, f29257(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic34$, f29258(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic35$, f29259(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic36$, f29260(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic37$, f29261(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic38$, f29262(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic39$, f29263(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic40$, f29264(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic41$, f29265(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic42$, f29266(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic43$, f29267(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic48$, (SubLObject)module0418.$ic44$, f29268(var11));
        Functions.funcall(var12, var11, (SubLObject)module0418.$ic49$, (SubLObject)module0418.$ic47$, (SubLObject)module0418.TWELVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f29283(final SubLObject var11, final SubLObject var12) {
        return f29282(var11, var12);
    }
    
    public static SubLObject f29284() {
        SubLObject var13 = module0030.f1625(module0418.$g3412$.getGlobalValue());
        var13 = Sort.sort(var13, Symbols.symbol_function((SubLObject)module0418.$ic53$), Symbols.symbol_function((SubLObject)module0418.$ic54$));
        return var13;
    }
    
    public static SubLObject f29285(final SubLObject var14) {
        SubLObject var15 = conses_high.copy_list(Hashtables.gethash(var14, module0418.$g3412$.getGlobalValue(), (SubLObject)module0418.UNPROVIDED));
        var15 = Sort.sort(var15, Symbols.symbol_function((SubLObject)module0418.$ic55$), Symbols.symbol_function((SubLObject)module0418.$ic11$));
        return var15;
    }
    
    public static SubLObject f29286(final SubLObject var14) {
        return module0035.sublisp_boolean(Hashtables.gethash(var14, module0418.$g3412$.getGlobalValue(), (SubLObject)module0418.UNPROVIDED));
    }
    
    public static SubLObject f29287(final SubLObject var16) {
        return (SubLObject)ConsesLow.list(module0340.f22825(f29257(var16)), f29258(var16));
    }
    
    public static SubLObject f29288(final SubLObject var16) {
        return f29260(var16);
    }
    
    public static SubLObject f29289(final SubLObject var16) {
        return f29259(var16);
    }
    
    public static SubLObject f29290(final SubLObject var16) {
        return f29264(var16);
    }
    
    public static SubLObject f29291(final SubLObject var16) {
        return f29262(var16);
    }
    
    public static SubLObject f29292(final SubLObject var16) {
        return f29263(var16);
    }
    
    public static SubLObject f29293(final SubLObject var16) {
        return f29268(var16);
    }
    
    public static SubLObject f29294(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0418.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0418.$ic56$), f29288(var16), (SubLObject)module0418.UNPROVIDED) || module0418.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0418.$ic56$), f29289(var16), (SubLObject)module0418.UNPROVIDED));
    }
    
    public static SubLObject f29295(final SubLObject var16) {
        return Sequences.remove_duplicates(ConsesLow.append(module0205.f13183(f29288(var16), (SubLObject)module0418.$ic56$, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED), module0205.f13183(f29289(var16), (SubLObject)module0418.$ic56$, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED)), (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED);
    }
    
    public static SubLObject f29296(final SubLObject var17, final SubLObject var18) {
        SubLObject var20;
        final SubLObject var19 = var20 = var17.rest();
        SubLObject var21 = (SubLObject)module0418.NIL;
        SubLObject var22 = (SubLObject)module0418.NIL;
        SubLObject var23 = (SubLObject)module0418.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0418.$ic57$);
        var21 = var20.first();
        var20 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0418.$ic57$);
        var22 = var20.first();
        var20 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0418.$ic57$);
        var23 = var20.first();
        var20 = var20.rest();
        SubLObject var24 = (SubLObject)module0418.NIL;
        SubLObject var25 = var20;
        SubLObject var26 = (SubLObject)module0418.NIL;
        SubLObject var27_28 = (SubLObject)module0418.NIL;
        while (module0418.NIL != var25) {
            cdestructuring_bind.destructuring_bind_must_consp(var25, var19, (SubLObject)module0418.$ic57$);
            var27_28 = var25.first();
            var25 = var25.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var25, var19, (SubLObject)module0418.$ic57$);
            if (module0418.NIL == conses_high.member(var27_28, (SubLObject)module0418.$ic58$, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED)) {
                var26 = (SubLObject)module0418.T;
            }
            if (var27_28 == module0418.$ic59$) {
                var24 = var25.first();
            }
            var25 = var25.rest();
        }
        if (module0418.NIL != var26 && module0418.NIL == var24) {
            cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0418.$ic57$);
        }
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic36$, var20);
        final SubLObject var28 = (module0418.NIL != var27) ? conses_high.cadr(var27) : module0418.$ic60$;
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic37$, var20);
        final SubLObject var30 = (SubLObject)((module0418.NIL != var29) ? conses_high.cadr(var29) : module0418.NIL);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic39$, var20);
        final SubLObject var32 = (SubLObject)((module0418.NIL != var31) ? conses_high.cadr(var31) : module0418.$ic61$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic40$, var20);
        final SubLObject var34 = (SubLObject)((module0418.NIL != var33) ? conses_high.cadr(var33) : module0418.NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic38$, var20);
        final SubLObject var36 = (SubLObject)((module0418.NIL != var35) ? conses_high.cadr(var35) : module0418.NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic62$, var20);
        final SubLObject var38 = (SubLObject)((module0418.NIL != var37) ? conses_high.cadr(var37) : module0418.NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic63$, var20);
        final SubLObject var40 = (SubLObject)((module0418.NIL != var39) ? conses_high.cadr(var39) : module0418.NIL);
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic43$, var20);
        final SubLObject var42 = (SubLObject)((module0418.NIL != var41) ? conses_high.cadr(var41) : module0418.NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)module0418.$ic44$, var20);
        final SubLObject var44 = (SubLObject)((module0418.NIL != var43) ? conses_high.cadr(var43) : module0418.T);
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0418.$ic64$, var21, var22, var23, var28, var30, var32, var34, var36, var38, var40, var42, var44 });
    }
    
    public static SubLObject f29297(final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var30, final SubLObject var32, final SubLObject var34, final SubLObject var36, final SubLObject var38, final SubLObject var47, final SubLObject var48, final SubLObject var44, final SubLObject var46) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        if (module0418.NIL != var38 && !module0418.areAssertionsDisabledFor(me) && module0418.NIL == Types.stringp(var38)) {
            throw new AssertionError(var38);
        }
        assert module0418.NIL != module0029.f1472(var34) : var34;
        assert module0418.NIL != module0421.f29459(var36) : var36;
        if (module0418.NIL != var47 && !module0418.areAssertionsDisabledFor(me) && module0418.NIL == module0004.f105(var47)) {
            throw new AssertionError(var47);
        }
        if (module0418.NIL != var48 && !module0418.areAssertionsDisabledFor(me) && module0418.NIL == module0051.f3603(var48)) {
            throw new AssertionError(var48);
        }
        if (module0418.NIL != var44 && !module0418.areAssertionsDisabledFor(me) && module0418.NIL == Types.stringp(var44)) {
            throw new AssertionError(var44);
        }
        assert module0418.NIL != Types.booleanp(var46) : var46;
        final SubLObject var50 = module0340.f22786(var21);
        if (module0418.NIL != module0340.f22976(var50)) {
            final SubLObject var51 = f29281((SubLObject)ConsesLow.list(new SubLObject[] { module0418.$ic33$, var50, module0418.$ic34$, var22, module0418.$ic35$, var23, module0418.$ic36$, var30, module0418.$ic37$, var32, module0418.$ic39$, var34, module0418.$ic40$, var36, module0418.$ic38$, var38, module0418.$ic41$, var47, module0418.$ic42$, var48, module0418.$ic43$, var44, module0418.$ic44$, var46 }));
            SubLObject var52 = Hashtables.gethash(var50, module0418.$g3412$.getGlobalValue(), (SubLObject)module0418.UNPROVIDED);
            var52 = Sequences.delete(var22, var52, Symbols.symbol_function((SubLObject)module0418.EQL), Symbols.symbol_function((SubLObject)module0418.$ic11$), (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED);
            var52 = (SubLObject)ConsesLow.cons(var51, var52);
            Hashtables.sethash(var50, module0418.$g3412$.getGlobalValue(), var52);
            module0029.f1506(module0029.$g836$.getDynamicValue(var49), var51);
            return var51;
        }
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29298() {
        Hashtables.clrhash(module0418.$g3412$.getGlobalValue());
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29299(SubLObject var52, SubLObject var2, SubLObject var53, SubLObject var54) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var53 == module0418.UNPROVIDED) {
            var53 = module0029.$g835$.getDynamicValue();
        }
        if (var54 == module0418.UNPROVIDED) {
            var54 = (SubLObject)module0418.NIL;
        }
        assert module0418.NIL != module0029.f1474(var52) : var52;
        return module0029.f1577(var2, (SubLObject)module0418.$ic74$, (SubLObject)module0418.NIL, var52, var53, (SubLObject)module0418.NIL, var54, (SubLObject)module0418.$ic75$, (SubLObject)module0418.NIL, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED);
    }
    
    public static SubLObject f29300(final SubLObject var21, SubLObject var52, SubLObject var2) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29301(var21, var52, var2, (SubLObject)module0418.T, (SubLObject)module0418.UNPROVIDED);
    }
    
    public static SubLObject f29302(final SubLObject var21, SubLObject var52, SubLObject var2) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29301(var21, var52, var2, (SubLObject)module0418.T, (SubLObject)module0418.T);
    }
    
    public static SubLObject f29301(final SubLObject var21, SubLObject var52, SubLObject var2, SubLObject var55, SubLObject var56) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var55 == module0418.UNPROVIDED) {
            var55 = (SubLObject)module0418.NIL;
        }
        if (var56 == module0418.UNPROVIDED) {
            var56 = (SubLObject)module0418.NIL;
        }
        assert module0418.NIL != module0029.f1474(var52) : var52;
        final SubLObject var57 = module0340.f22786(var21);
        if (module0418.NIL != module0340.f22976(var57)) {
            return f29303(var57, var52, var2, var55, var56);
        }
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29303(final SubLObject var14, final SubLObject var52, final SubLObject var2, final SubLObject var55, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0418.$ic76$;
        SubLObject var59 = (SubLObject)module0418.NIL;
        SubLObject var60 = f29285(var14);
        SubLObject var61 = (SubLObject)module0418.NIL;
        var61 = var60.first();
        while (module0418.NIL != var60) {
            var57.resetMultipleValues();
            final SubLObject var62 = f29304(var61, var52, var2, var55, var56);
            final SubLObject var63 = var57.secondMultipleValue();
            var57.resetMultipleValues();
            var59 = (SubLObject)ConsesLow.cons(var63, var59);
            if (var62 != module0418.$ic76$) {
                var58 = var62;
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        return Values.values(var58, Sequences.nreverse(var59));
    }
    
    public static SubLObject f29305(final SubLObject var21, final SubLObject var62, SubLObject var52, SubLObject var2) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29306(var21, var62, var52, var2, (SubLObject)module0418.T, (SubLObject)module0418.UNPROVIDED);
    }
    
    public static SubLObject f29307(final SubLObject var21, final SubLObject var62, SubLObject var52, SubLObject var2) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29306(var21, var62, var52, var2, (SubLObject)module0418.T, (SubLObject)module0418.T);
    }
    
    public static SubLObject f29306(final SubLObject var21, final SubLObject var62, SubLObject var52, SubLObject var2, SubLObject var55, SubLObject var56) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var55 == module0418.UNPROVIDED) {
            var55 = (SubLObject)module0418.NIL;
        }
        if (var56 == module0418.UNPROVIDED) {
            var56 = (SubLObject)module0418.NIL;
        }
        assert module0418.NIL != module0029.f1474(var52) : var52;
        final SubLObject var63 = module0340.f22786(var21);
        SubLObject var64 = (SubLObject)module0418.NIL;
        if (module0418.NIL != module0340.f22976(var63) && module0418.NIL == var64) {
            SubLObject var65 = f29285(var63);
            SubLObject var66 = (SubLObject)module0418.NIL;
            var66 = var65.first();
            while (module0418.NIL == var64 && module0418.NIL != var65) {
                if (var62.numE(f29258(var66))) {
                    var64 = var66;
                }
                var65 = var65.rest();
                var66 = var65.first();
            }
        }
        return f29304(var64, var52, var2, var55, var56);
    }
    
    public static SubLObject f29304(final SubLObject var16, SubLObject var52, SubLObject var2, SubLObject var55, SubLObject var56) {
        if (var52 == module0418.UNPROVIDED) {
            var52 = (SubLObject)module0418.$ic72$;
        }
        if (var2 == module0418.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var55 == module0418.UNPROVIDED) {
            var55 = (SubLObject)module0418.NIL;
        }
        if (var56 == module0418.UNPROVIDED) {
            var56 = (SubLObject)module0418.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        assert module0418.NIL != f29256(var16) : var16;
        assert module0418.NIL != module0029.f1474(var52) : var52;
        final SubLObject var58 = f29287(var16);
        SubLObject var59 = (SubLObject)module0418.NIL;
        SubLObject var60 = (SubLObject)module0418.NIL;
        if (module0418.NIL == f29308(var16)) {
            var60 = (SubLObject)module0418.$ic77$;
        }
        else if (module0418.NIL != f29294(var16)) {
            var60 = (SubLObject)module0418.$ic78$;
        }
        else {
            final SubLObject var61 = f29257(var16);
            final SubLObject var62 = f29259(var16);
            final SubLObject var63 = f29260(var16);
            final SubLObject var64 = f29261(var16);
            final SubLObject var65 = print_high.$print_pretty$.currentBinding(var57);
            try {
                print_high.$print_pretty$.bind((SubLObject)module0418.NIL, var57);
                f29309(var16, var52, var2);
                var57.resetMultipleValues();
                final SubLObject var66_67 = f29310(var61, var62, var63, var64, var55, var56);
                final SubLObject var68_69 = var57.secondMultipleValue();
                var57.resetMultipleValues();
                var60 = var66_67;
                var59 = var68_69;
                f29311(var16, var60, var59, var52, var2);
            }
            finally {
                print_high.$print_pretty$.rebind(var65, var57);
            }
        }
        final SubLObject var66 = module0029.f1535((SubLObject)module0418.$ic75$, var58, var60, var59);
        return Values.values(var60, var66);
    }
    
    public static SubLObject f29308(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f29263(var16);
        if (module0418.NIL == module0421.f29447(var18, module0029.$g835$.getDynamicValue(var17))) {
            return (SubLObject)module0418.NIL;
        }
        return (SubLObject)module0418.T;
    }
    
    public static SubLObject f29310(final SubLObject var14, final SubLObject var23, final SubLObject var30, final SubLObject var32, final SubLObject var55, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0418.$ic79$;
        SubLObject var59 = (SubLObject)module0418.NIL;
        SubLObject var60 = (SubLObject)module0418.NIL;
        try {
            var57.throwStack.push(module0418.$ic80$);
            final SubLObject var61 = Errors.$error_handler$.currentBinding(var57);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0418.$ic81$), var57);
                try {
                    var57.resetMultipleValues();
                    final SubLObject var62 = f29312(var23, var30, var32, var56);
                    final SubLObject var63 = var57.secondMultipleValue();
                    var57.resetMultipleValues();
                    var59 = var63;
                    if (module0418.NIL != module0411.f28581(var62, var14)) {
                        var58 = (SubLObject)module0418.$ic76$;
                    }
                    else {
                        var58 = (SubLObject)module0418.$ic82$;
                    }
                    if (module0418.NIL == var55) {
                        oc_inference_datastructures_inference.f25476(var62);
                    }
                }
                catch (Throwable var64) {
                    Errors.handleThrowable(var64, (SubLObject)module0418.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var61, var57);
            }
        }
        catch (Throwable var65) {
            var60 = Errors.handleThrowable(var65, (SubLObject)module0418.$ic80$);
        }
        finally {
            var57.throwStack.pop();
        }
        return Values.values(var58, var59);
    }
    
    public static SubLObject f29312(final SubLObject var23, SubLObject var30, SubLObject var32, SubLObject var56) {
        if (var30 == module0418.UNPROVIDED) {
            var30 = (SubLObject)module0418.NIL;
        }
        if (var32 == module0418.UNPROVIDED) {
            var32 = (SubLObject)module0418.NIL;
        }
        if (var56 == module0418.UNPROVIDED) {
            var56 = (SubLObject)module0418.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0408.f28423(var23);
        var32 = conses_high.copy_list(var32);
        var32 = conses_high.putf(var32, (SubLObject)module0418.$ic83$, var58);
        var32 = conses_high.putf(var32, (SubLObject)module0418.$ic84$, (SubLObject)module0418.T);
        var32 = conses_high.putf(var32, (SubLObject)module0418.$ic85$, (SubLObject)module0418.ONE_INTEGER);
        var32 = conses_high.putf(var32, (SubLObject)module0418.$ic86$, (SubLObject)module0418.NIL);
        if (module0418.NIL != var56) {
            var32 = conses_high.putf(var32, (SubLObject)module0418.$ic87$, (SubLObject)module0418.T);
            var32 = module0035.f2340(var32, (SubLObject)module0418.$ic88$);
        }
        SubLObject var59 = (SubLObject)module0418.NIL;
        SubLObject var60 = (SubLObject)module0418.NIL;
        SubLObject var61 = (SubLObject)module0418.NIL;
        SubLObject var62 = (SubLObject)module0418.NIL;
        final SubLObject var63 = Time.get_internal_real_time();
        var57.resetMultipleValues();
        final SubLObject var80_81 = module0409.f28506(var23, var30, var32);
        final SubLObject var82_83 = var57.secondMultipleValue();
        final SubLObject var84_85 = var57.thirdMultipleValue();
        var57.resetMultipleValues();
        var60 = var80_81;
        var61 = var82_83;
        var62 = var84_85;
        var59 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var63), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var62, var59);
    }
    
    public static SubLObject f29309(final SubLObject var16, final SubLObject var52, final SubLObject var2) {
        if (var52.eql((SubLObject)module0418.$ic72$)) {
            final SubLObject var53 = f29257(var16);
            final SubLObject var54 = module0340.f22825(var53);
            final SubLObject var55 = f29258(var16);
            PrintLow.format(var2, (SubLObject)module0418.$ic89$, var54, var55);
            streams_high.force_output(var2);
        }
        else if (!var52.eql((SubLObject)module0418.$ic90$)) {
            PrintLow.format(var2, (SubLObject)module0418.$ic91$, var52);
        }
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29311(final SubLObject var16, final SubLObject var57, final SubLObject var64, final SubLObject var52, final SubLObject var2) {
        if (var52.eql((SubLObject)module0418.$ic72$)) {
            PrintLow.format(var2, (SubLObject)module0418.$ic92$, var57, var64);
            streams_high.force_output(var2);
        }
        else if (var52.eql((SubLObject)module0418.$ic90$)) {
            final SubLObject var65 = f29257(var16);
            final SubLObject var66 = module0340.f22825(var65);
            final SubLObject var67 = f29258(var16);
            final SubLObject var68 = f29264(var16);
            PrintLow.format(var2, (SubLObject)module0418.$ic93$, new SubLObject[] { var57, var66, var67, var64, var68 });
            streams_high.force_output(var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)module0418.$ic91$, var52);
        }
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29313() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29255", "S#32432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29256", "S#2625", 1, 0, false);
        new $f29256$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29257", "S#32433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29258", "S#32434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29259", "S#32435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29260", "S#32436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29261", "S#32437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29262", "S#32438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29263", "S#32439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29264", "S#32440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29265", "S#32441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29266", "S#32442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29267", "S#32443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29268", "S#32444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29269", "S#32445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29270", "S#32446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29271", "S#32447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29272", "S#32448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29273", "S#32449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29274", "S#32450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29275", "S#32451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29276", "S#32452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29277", "S#32453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29278", "S#32454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29279", "S#32455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29280", "S#32456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29281", "S#32457", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29282", "S#32458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29283", "S#32459", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29284", "S#32460", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29285", "S#32461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29286", "S#32462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29287", "S#2631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29288", "S#32463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29289", "S#32464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29290", "S#2645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29291", "S#2659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29292", "S#2638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29293", "S#2652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29294", "S#2667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29295", "S#2674", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0418", "f29296", "DEFINE-TRANSFORMATION-MODULE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29297", "S#32465", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29298", "S#32466", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29299", "S#32467", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29300", "S#32468", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29302", "S#32469", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29301", "S#32470", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29303", "S#32471", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29305", "S#32472", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29307", "S#32473", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29306", "S#32474", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29304", "S#9332", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29308", "S#32475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29310", "S#32476", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29312", "S#32477", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29309", "S#32478", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0418", "f29311", "S#32479", 5, 0, false);
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29314() {
        module0418.$g3411$ = SubLFiles.defconstant("S#32480", (SubLObject)module0418.$ic0$);
        module0418.$g3412$ = SubLFiles.deflexical("S#32481", (module0418.NIL != Symbols.boundp((SubLObject)module0418.$ic51$)) ? module0418.$g3412$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0418.$ic52$, (SubLObject)module0418.UNPROVIDED, (SubLObject)module0418.UNPROVIDED));
        return (SubLObject)module0418.NIL;
    }
    
    public static SubLObject f29315() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0418.$g3411$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0418.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0418.$ic8$);
        Structures.def_csetf((SubLObject)module0418.$ic9$, (SubLObject)module0418.$ic10$);
        Structures.def_csetf((SubLObject)module0418.$ic11$, (SubLObject)module0418.$ic12$);
        Structures.def_csetf((SubLObject)module0418.$ic13$, (SubLObject)module0418.$ic14$);
        Structures.def_csetf((SubLObject)module0418.$ic15$, (SubLObject)module0418.$ic16$);
        Structures.def_csetf((SubLObject)module0418.$ic17$, (SubLObject)module0418.$ic18$);
        Structures.def_csetf((SubLObject)module0418.$ic19$, (SubLObject)module0418.$ic20$);
        Structures.def_csetf((SubLObject)module0418.$ic21$, (SubLObject)module0418.$ic22$);
        Structures.def_csetf((SubLObject)module0418.$ic23$, (SubLObject)module0418.$ic24$);
        Structures.def_csetf((SubLObject)module0418.$ic25$, (SubLObject)module0418.$ic26$);
        Structures.def_csetf((SubLObject)module0418.$ic27$, (SubLObject)module0418.$ic28$);
        Structures.def_csetf((SubLObject)module0418.$ic29$, (SubLObject)module0418.$ic30$);
        Structures.def_csetf((SubLObject)module0418.$ic31$, (SubLObject)module0418.$ic32$);
        Equality.identity((SubLObject)module0418.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0418.$g3411$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0418.$ic50$));
        module0003.f57((SubLObject)module0418.$ic51$);
        module0002.f50((SubLObject)module0418.$ic64$, (SubLObject)module0418.$ic65$);
        return (SubLObject)module0418.NIL;
    }
    
    public void declareFunctions() {
        f29313();
    }
    
    public void initializeVariables() {
        f29314();
    }
    
    public void runTopLevelForms() {
        f29315();
    }
    
    static {
        me = (SubLFile)new module0418();
        module0418.$g3411$ = null;
        module0418.$g3412$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#32431", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#2625", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#14781", "CYC"), SubLObjectFactory.makeSymbol("S#1519", "CYC"), SubLObjectFactory.makeSymbol("S#14349", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#5852", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#2607", "CYC"), SubLObjectFactory.makeSymbol("S#2605", "CYC"), SubLObjectFactory.makeSymbol("S#32372", "CYC"), SubLObjectFactory.makeSymbol("S#32373", "CYC"), SubLObjectFactory.makeSymbol("CREATOR"), SubLObjectFactory.makeSymbol("S#2608", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("HL-MODULE"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("BUG-NUMBER"), SubLObjectFactory.makeKeyword("CREATION-DATE"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#32433", "CYC"), SubLObjectFactory.makeSymbol("S#32434", "CYC"), SubLObjectFactory.makeSymbol("S#32435", "CYC"), SubLObjectFactory.makeSymbol("S#32436", "CYC"), SubLObjectFactory.makeSymbol("S#32437", "CYC"), SubLObjectFactory.makeSymbol("S#32438", "CYC"), SubLObjectFactory.makeSymbol("S#32439", "CYC"), SubLObjectFactory.makeSymbol("S#32440", "CYC"), SubLObjectFactory.makeSymbol("S#32441", "CYC"), SubLObjectFactory.makeSymbol("S#32442", "CYC"), SubLObjectFactory.makeSymbol("S#32443", "CYC"), SubLObjectFactory.makeSymbol("S#32444", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#32445", "CYC"), SubLObjectFactory.makeSymbol("S#32446", "CYC"), SubLObjectFactory.makeSymbol("S#32447", "CYC"), SubLObjectFactory.makeSymbol("S#32448", "CYC"), SubLObjectFactory.makeSymbol("S#32449", "CYC"), SubLObjectFactory.makeSymbol("S#32450", "CYC"), SubLObjectFactory.makeSymbol("S#32451", "CYC"), SubLObjectFactory.makeSymbol("S#32452", "CYC"), SubLObjectFactory.makeSymbol("S#32453", "CYC"), SubLObjectFactory.makeSymbol("S#32454", "CYC"), SubLObjectFactory.makeSymbol("S#32455", "CYC"), SubLObjectFactory.makeSymbol("S#32456", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#32432", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#2625", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#32433", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#32445", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#32434", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#32446", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#32435", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#32447", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#32436", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#32448", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#32437", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#32449", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#32438", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#32450", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#32439", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#32451", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#32440", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#32452", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#32441", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#32453", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#32442", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#32454", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#32443", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#32455", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#32444", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#32456", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("HL-MODULE");
        $ic34$ = SubLObjectFactory.makeKeyword("ID");
        $ic35$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic36$ = SubLObjectFactory.makeKeyword("MT");
        $ic37$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic38$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic39$ = SubLObjectFactory.makeKeyword("KB");
        $ic40$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic41$ = SubLObjectFactory.makeKeyword("BUG-NUMBER");
        $ic42$ = SubLObjectFactory.makeKeyword("CREATION-DATE");
        $ic43$ = SubLObjectFactory.makeKeyword("CREATOR");
        $ic44$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic45$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic46$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic47$ = SubLObjectFactory.makeSymbol("S#32457", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic49$ = SubLObjectFactory.makeKeyword("END");
        $ic50$ = SubLObjectFactory.makeSymbol("S#32459", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#32481", "CYC");
        $ic52$ = SubLObjectFactory.makeInteger(100);
        $ic53$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("HL-MODULE-NAME");
        $ic55$ = SubLObjectFactory.makeSymbol("<");
        $ic56$ = SubLObjectFactory.makeSymbol("S#2609", "CYC");
        $ic57$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#1519", "CYC"), SubLObjectFactory.makeSymbol("S#14349", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), SubLObjectFactory.makeSymbol("S#5852", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2607", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TINY")), SubLObjectFactory.makeSymbol("S#2605", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#32378", "CYC"), SubLObjectFactory.makeSymbol("S#32379", "CYC"), SubLObjectFactory.makeSymbol("CREATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2608", "CYC"), (SubLObject)module0418.T) });
        $ic58$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("BUG"), SubLObjectFactory.makeKeyword("CREATED"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?") });
        $ic59$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic60$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic61$ = SubLObjectFactory.makeKeyword("TINY");
        $ic62$ = SubLObjectFactory.makeKeyword("BUG");
        $ic63$ = SubLObjectFactory.makeKeyword("CREATED");
        $ic64$ = SubLObjectFactory.makeSymbol("S#32465", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST");
        $ic66$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic67$ = SubLObjectFactory.makeSymbol("S#2526", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#32272", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic70$ = SubLObjectFactory.makeSymbol("S#4999", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic72$ = SubLObjectFactory.makeKeyword("STANDARD");
        $ic73$ = SubLObjectFactory.makeSymbol("S#2688", "CYC");
        $ic74$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic75$ = SubLObjectFactory.makeKeyword("TMT");
        $ic76$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic77$ = SubLObjectFactory.makeKeyword("NOT-RUN");
        $ic78$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic79$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic80$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic81$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic82$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic83$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic84$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic85$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic86$ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic87$ = SubLObjectFactory.makeKeyword("BLOCK?");
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)module0418.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)module0418.NIL);
        $ic89$ = SubLObjectFactory.makeString("~&:TMT ~S ~S -> ");
        $ic90$ = SubLObjectFactory.makeKeyword("POST-BUILD");
        $ic91$ = SubLObjectFactory.makeString("Unknown output format ~A");
        $ic92$ = SubLObjectFactory.makeString("~S (~,3f)~%");
        $ic93$ = SubLObjectFactory.makeString("~S :TMT (~S ~S) (~,3f) :OWNER ~S~%");
    }
    
    public static final class $sX32431_native extends SubLStructNative
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
        private static final SubLStructDeclNative structDecl;
        
        public $sX32431_native() {
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
            return (SubLStructDecl)$sX32431_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX32431_native.class, module0418.$ic0$, module0418.$ic1$, module0418.$ic2$, module0418.$ic3$, new String[] { "$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, module0418.$ic4$, module0418.$ic5$, module0418.$ic6$);
        }
    }
    
    public static final class $f29256$UnaryFunction extends UnaryFunction
    {
        public $f29256$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2625"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0418.f29256(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0418.class
	Total time: 288 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/