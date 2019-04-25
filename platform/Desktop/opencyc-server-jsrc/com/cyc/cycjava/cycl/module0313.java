package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0313 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0313";
    public static final String myFingerPrint = "0015213ac1be0d11435befd5f06bbfd4416edfb8463191fae2cc3fd99b852137";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    
    
    public static SubLObject f21137(final SubLObject var1) {
        if (NIL != module0205.f13155(var1)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21138(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0004.f104(var2, module0145.$g1896$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21139(final SubLObject var4) {
        if (var4.eql((SubLObject)$ic0$)) {
            return (SubLObject)$ic1$;
        }
        if (var4.eql((SubLObject)$ic2$)) {
            return (SubLObject)$ic3$;
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return (SubLObject)$ic5$;
        }
        if (var4.eql((SubLObject)$ic6$)) {
            return (SubLObject)$ic7$;
        }
        if (var4.eql((SubLObject)$ic8$)) {
            return (SubLObject)$ic9$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21140() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0145.$g1894$.getDynamicValue(var3);
        if (var4.eql((SubLObject)$ic10$)) {
            return module0226.f14795(module0145.$g1888$.getDynamicValue(var3));
        }
        if (var4.eql((SubLObject)$ic11$)) {
            SubLObject var5 = (SubLObject)NIL;
            if (NIL == var5) {
                SubLObject var6 = module0145.$g1893$.getDynamicValue(var3);
                SubLObject var7 = (SubLObject)NIL;
                var7 = var6.first();
                while (NIL == var5 && NIL != var6) {
                    SubLObject var9;
                    final SubLObject var8 = var9 = var7;
                    final SubLObject var10 = module0145.$g1888$.currentBinding(var3);
                    final SubLObject var11 = module0145.$g1891$.currentBinding(var3);
                    final SubLObject var12 = module0145.$g1892$.currentBinding(var3);
                    try {
                        module0145.$g1888$.bind((SubLObject)NIL, var3);
                        module0145.$g1891$.bind((SubLObject)NIL, var3);
                        module0145.$g1892$.bind((SubLObject)NIL, var3);
                        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic12$);
                        module0145.$g1888$.setDynamicValue(var9.first(), var3);
                        var9 = var9.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic12$);
                        module0145.$g1891$.setDynamicValue(var9.first(), var3);
                        var9 = var9.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic12$);
                        module0145.$g1892$.setDynamicValue(var9.first(), var3);
                        var9 = var9.rest();
                        if (NIL == var9) {
                            var5 = (SubLObject)makeBoolean(NIL == module0226.f14795(module0145.$g1888$.getDynamicValue(var3)));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic12$);
                        }
                    }
                    finally {
                        module0145.$g1892$.rebind(var12, var3);
                        module0145.$g1891$.rebind(var11, var3);
                        module0145.$g1888$.rebind(var10, var3);
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
            return (SubLObject)makeBoolean(NIL == var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21141(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0145.$g1894$.getDynamicValue(var15);
        if (var16.eql((SubLObject)$ic10$)) {
            return module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
        }
        if (var16.eql((SubLObject)$ic11$)) {
            SubLObject var17 = (SubLObject)NIL;
            if (NIL == var17) {
                SubLObject var18 = module0145.$g1893$.getDynamicValue(var15);
                SubLObject var19 = (SubLObject)NIL;
                var19 = var18.first();
                while (NIL == var17 && NIL != var18) {
                    SubLObject var21;
                    final SubLObject var20 = var21 = var19;
                    final SubLObject var22 = module0145.$g1888$.currentBinding(var15);
                    final SubLObject var23 = module0145.$g1891$.currentBinding(var15);
                    final SubLObject var24 = module0145.$g1892$.currentBinding(var15);
                    try {
                        module0145.$g1888$.bind((SubLObject)NIL, var15);
                        module0145.$g1891$.bind((SubLObject)NIL, var15);
                        module0145.$g1892$.bind((SubLObject)NIL, var15);
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1888$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1891$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1892$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        if (NIL == var21) {
                            var17 = module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic12$);
                        }
                    }
                    finally {
                        module0145.$g1892$.rebind(var24, var15);
                        module0145.$g1891$.rebind(var23, var15);
                        module0145.$g1888$.rebind(var22, var15);
                    }
                    var18 = var18.rest();
                    var19 = var18.first();
                }
            }
            return var17;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21142(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0145.$g1894$.getDynamicValue(var15);
        if (var16.eql((SubLObject)$ic10$)) {
            return module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
        }
        if (var16.eql((SubLObject)$ic11$)) {
            SubLObject var17 = (SubLObject)NIL;
            if (NIL == var17) {
                SubLObject var18 = module0145.$g1893$.getDynamicValue(var15);
                SubLObject var19 = (SubLObject)NIL;
                var19 = var18.first();
                while (NIL == var17 && NIL != var18) {
                    SubLObject var21;
                    final SubLObject var20 = var21 = var19;
                    final SubLObject var22 = module0145.$g1888$.currentBinding(var15);
                    final SubLObject var23 = module0145.$g1891$.currentBinding(var15);
                    final SubLObject var24 = module0145.$g1892$.currentBinding(var15);
                    try {
                        module0145.$g1888$.bind((SubLObject)NIL, var15);
                        module0145.$g1891$.bind((SubLObject)NIL, var15);
                        module0145.$g1892$.bind((SubLObject)NIL, var15);
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1888$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1891$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1892$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        if (NIL == var21) {
                            var17 = module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic12$);
                        }
                    }
                    finally {
                        module0145.$g1892$.rebind(var24, var15);
                        module0145.$g1891$.rebind(var23, var15);
                        module0145.$g1888$.rebind(var22, var15);
                    }
                    var18 = var18.rest();
                    var19 = var18.first();
                }
            }
            return var17;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21143(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0309.f20944(module0145.$g1948$.getDynamicValue(var15), var14, module0145.$g1951$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21144(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0309.f20944(module0145.$g1948$.getDynamicValue(var15), var14, module0145.$g1952$.getDynamicValue(var15), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21145(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0145.$g1894$.getDynamicValue(var15);
        if (var16.eql((SubLObject)$ic10$)) {
            return (SubLObject)makeBoolean(NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)UNPROVIDED) || NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)UNPROVIDED));
        }
        if (var16.eql((SubLObject)$ic11$)) {
            SubLObject var17 = (SubLObject)NIL;
            if (NIL == var17) {
                SubLObject var18 = module0145.$g1893$.getDynamicValue(var15);
                SubLObject var19 = (SubLObject)NIL;
                var19 = var18.first();
                while (NIL == var17 && NIL != var18) {
                    SubLObject var21;
                    final SubLObject var20 = var21 = var19;
                    final SubLObject var22 = module0145.$g1888$.currentBinding(var15);
                    final SubLObject var23 = module0145.$g1891$.currentBinding(var15);
                    final SubLObject var24 = module0145.$g1892$.currentBinding(var15);
                    try {
                        module0145.$g1888$.bind((SubLObject)NIL, var15);
                        module0145.$g1891$.bind((SubLObject)NIL, var15);
                        module0145.$g1892$.bind((SubLObject)NIL, var15);
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1888$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1891$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic12$);
                        module0145.$g1892$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        if (NIL == var21) {
                            var17 = (SubLObject)makeBoolean(NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)UNPROVIDED) || NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)UNPROVIDED));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic12$);
                        }
                    }
                    finally {
                        module0145.$g1892$.rebind(var24, var15);
                        module0145.$g1891$.rebind(var23, var15);
                        module0145.$g1888$.rebind(var22, var15);
                    }
                    var18 = var18.rest();
                    var19 = var18.first();
                }
            }
            return var17;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21146(final SubLObject var4, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0145.$g1894$.getDynamicValue(var23);
        if (var24.eql((SubLObject)$ic10$)) {
            return f21147(var4, var22);
        }
        if (var24.eql((SubLObject)$ic11$)) {
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = module0145.$g1893$.getDynamicValue(var23);
            SubLObject var27 = (SubLObject)NIL;
            var27 = var26.first();
            while (NIL != var26) {
                SubLObject var29;
                final SubLObject var28 = var29 = var27;
                final SubLObject var30 = module0145.$g1888$.currentBinding(var23);
                final SubLObject var31 = module0145.$g1891$.currentBinding(var23);
                final SubLObject var32 = module0145.$g1892$.currentBinding(var23);
                try {
                    module0145.$g1888$.bind((SubLObject)NIL, var23);
                    module0145.$g1891$.bind((SubLObject)NIL, var23);
                    module0145.$g1892$.bind((SubLObject)NIL, var23);
                    cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic12$);
                    module0145.$g1888$.setDynamicValue(var29.first(), var23);
                    var29 = var29.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic12$);
                    module0145.$g1891$.setDynamicValue(var29.first(), var23);
                    var29 = var29.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic12$);
                    module0145.$g1892$.setDynamicValue(var29.first(), var23);
                    var29 = var29.rest();
                    if (NIL == var29) {
                        if (var4 == $ic0$ && NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1891$.getDynamicValue(var23), (SubLObject)UNPROVIDED)) {
                            var25 = (SubLObject)ConsesLow.cons(f21147(var4, var22), var25);
                        }
                        else if (var4 == $ic2$ && NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1892$.getDynamicValue(var23), (SubLObject)UNPROVIDED)) {
                            var25 = (SubLObject)ConsesLow.cons(f21147(var4, var22), var25);
                        }
                        else if (var4 == $ic4$ && NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1891$.getDynamicValue(var23), (SubLObject)UNPROVIDED) && NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1892$.getDynamicValue(var23), (SubLObject)UNPROVIDED)) {
                            var25 = (SubLObject)ConsesLow.cons(f21147(var4, var22), var25);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic12$);
                    }
                }
                finally {
                    module0145.$g1892$.rebind(var32, var23);
                    module0145.$g1891$.rebind(var31, var23);
                    module0145.$g1888$.rebind(var30, var23);
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
            return Functions.apply(Symbols.symbol_function((SubLObject)$ic13$), Sequences.nreverse(var25));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21147(final SubLObject var4, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (var4.eql((SubLObject)$ic0$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
        }
        if (var4.eql((SubLObject)$ic2$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
        }
        if (var4.eql((SubLObject)$ic6$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
        }
        if (var4.eql((SubLObject)$ic8$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
        }
        if (var4.eql((SubLObject)$ic14$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21148(SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic15$;
        }
        return Hashtables.make_hash_table(var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21149(final SubLObject var22) {
        return (SubLObject)makeBoolean(NIL == f21150(var22));
    }
    
    public static SubLObject f21150(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = module0145.$g1902$.currentBinding(var23);
        try {
            module0145.$g1902$.bind((SubLObject)T, var23);
            if (NIL != Symbols.symbol_function((SubLObject)$ic16$) && !areAssertionsDisabledFor(me) && NIL == Types.function_spec_p(Symbols.symbol_function((SubLObject)$ic16$))) {
                throw new AssertionError(Symbols.symbol_function((SubLObject)$ic16$));
            }
            final SubLObject var11_29 = module0145.$g1905$.currentBinding(var23);
            try {
                module0145.$g1905$.bind(Symbols.symbol_function((SubLObject)$ic16$), var23);
                final SubLObject var26 = module0145.$g1895$.getDynamicValue(var23);
                if (var26.eql((SubLObject)$ic18$)) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && NIL == f21138((SubLObject)$ic19$)) {
                        Errors.error((SubLObject)$ic20$, (SubLObject)$ic19$);
                    }
                    final SubLObject var11_30 = module0145.$g1895$.currentBinding(var23);
                    try {
                        module0145.$g1895$.bind((SubLObject)$ic19$, var23);
                        assert NIL != Types.function_spec_p((SubLObject)$ic21$) : $ic21$;
                        final SubLObject var11_31 = module0145.$g1904$.currentBinding(var23);
                        try {
                            module0145.$g1904$.bind((SubLObject)$ic21$, var23);
                            module0314.f21168(var22, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0145.$g1904$.rebind(var11_31, var23);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var11_30, var23);
                    }
                }
                else if (var26.eql((SubLObject)$ic19$)) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && NIL == f21138((SubLObject)$ic18$)) {
                        Errors.error((SubLObject)$ic20$, (SubLObject)$ic18$);
                    }
                    final SubLObject var11_32 = module0145.$g1895$.currentBinding(var23);
                    try {
                        module0145.$g1895$.bind((SubLObject)$ic18$, var23);
                        assert NIL != Types.function_spec_p((SubLObject)$ic21$) : $ic21$;
                        final SubLObject var11_33 = module0145.$g1904$.currentBinding(var23);
                        try {
                            module0145.$g1904$.bind((SubLObject)$ic21$, var23);
                            module0314.f21168(var22, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0145.$g1904$.rebind(var11_33, var23);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var11_32, var23);
                    }
                }
                else {
                    f21151((SubLObject)FIVE_INTEGER, (SubLObject)$ic22$, module0145.$g1895$.getDynamicValue(var23), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0145.$g1905$.rebind(var11_29, var23);
            }
            var24 = module0145.$g1902$.getDynamicValue(var23);
        }
        finally {
            module0145.$g1902$.rebind(var25, var23);
        }
        return var24;
    }
    
    public static SubLObject f21152(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0145.$g1905$.getDynamicValue(var23).isFunctionSpec() && NIL == f21153(var22)) {
            module0145.$g1902$.setDynamicValue((SubLObject)NIL, var23);
            module0314.f21182((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21154(final SubLObject var14, final SubLObject var4, final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0145.$g1941$.getDynamicValue(var35).numGE(var34)) {
            final SubLObject var36 = f21139(var4);
            if (var36.isFunctionSpec() && NIL == Functions.funcall(var36, var14)) {
                f21155(var34, (SubLObject)$ic23$, (SubLObject)$ic24$, f21146(var4, var14), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)$ic25$, (SubLObject)NIL);
            }
        }
        else if ((var4.eql((SubLObject)$ic0$) || var4.eql((SubLObject)$ic2$) || var4.eql((SubLObject)$ic6$) || var4.eql((SubLObject)$ic8$)) && NIL == f21137(var14)) {
            Dynamic.sublisp_throw((SubLObject)$ic25$, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21153(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0145.$g1905$.getDynamicValue(var23);
        if (var24.eql((SubLObject)$ic26$) || var24.eql((SubLObject)$ic27$)) {
            return module0314.f21168(var22, (SubLObject)UNPROVIDED);
        }
        if (var24.eql((SubLObject)$ic26$) || var24.eql((SubLObject)$ic28$)) {
            return module0314.f21218(var22, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)(module0145.$g1905$.getDynamicValue(var23).isFunctionSpec() ? Functions.funcall(module0145.$g1905$.getDynamicValue(var23), var22) : NIL);
    }
    
    public static SubLObject f21156(final SubLObject var22, final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = module0145.$g1909$.getDynamicValue(var37);
        if (var38.eql((SubLObject)$ic26$) || var38.eql((SubLObject)EQ)) {
            return Equality.eq(var22, var36);
        }
        return (SubLObject)(module0145.$g1909$.getDynamicValue(var37).isFunctionSpec() ? Functions.funcall(module0145.$g1909$.getDynamicValue(var37), var22, var36) : NIL);
    }
    
    public static SubLObject f21157(final SubLObject var37, final SubLObject var22) {
        if (var37.eql((SubLObject)$ic26$) || var37.eql((SubLObject)$ic29$)) {
            return module0314.f21170(var22);
        }
        if (var37.eql((SubLObject)$ic26$) || var37.eql((SubLObject)$ic30$)) {
            return module0314.f21181(var22);
        }
        if (var37.eql((SubLObject)$ic26$) || var37.eql((SubLObject)$ic31$)) {
            return module0314.f21222(var22);
        }
        if (var37.eql((SubLObject)$ic26$) || var37.eql((SubLObject)$ic32$)) {
            return module0314.f21204(var22);
        }
        return Functions.funcall(var37, var22);
    }
    
    public static SubLObject f21158(final SubLObject var34, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var44).numGE(var34)) {
            PrintLow.format((SubLObject)T, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21151(final SubLObject var34, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var44).numGE(var34)) {
            Errors.cerror((SubLObject)$ic33$, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        else if (Numbers.add((SubLObject)TWO_INTEGER, module0145.$g1940$.getDynamicValue(var44)).numGE(var34)) {
            Errors.warn(var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21155(final SubLObject var34, final SubLObject var44, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var45).numGE(var34)) {
            Errors.cerror(var44, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        else if (Numbers.add((SubLObject)TWO_INTEGER, module0145.$g1940$.getDynamicValue(var45)).numGE(var34)) {
            Errors.warn(var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21159(final SubLObject var34, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var44).numGE(var34)) {
            Functions.apply((SubLObject)$ic34$, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21160() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21137", "S#23760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21138", "S#12574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21139", "S#23761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21140", "S#23762", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21141", "S#23763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21142", "S#23764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21143", "S#23765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21144", "S#23766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21145", "S#23767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21146", "S#23768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21147", "S#23769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21148", "S#23770", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21149", "S#23771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21150", "S#23772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21152", "S#23773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21154", "S#12579", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21153", "S#23774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21156", "S#23775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21157", "S#23776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21158", "S#23777", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21151", "S#11994", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21155", "S#23778", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0313", "f21159", "S#23779", 2, 5, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21161() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21162() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21160();
    }
    
    public void initializeVariables() {
        f21161();
    }
    
    public void runTopLevelForms() {
        f21162();
    }
    
    static {
        me = (SubLFile)new module0313();
        $ic0$ = makeKeyword("GT-INDEX");
        $ic1$ = makeSymbol("S#23763", "CYC");
        $ic2$ = makeKeyword("GT-GATHER");
        $ic3$ = makeSymbol("S#23764", "CYC");
        $ic4$ = makeKeyword("GT-EITHER");
        $ic5$ = makeSymbol("S#23767", "CYC");
        $ic6$ = makeKeyword("TT-INDEX");
        $ic7$ = makeSymbol("S#23765", "CYC");
        $ic8$ = makeKeyword("TT-GATHER");
        $ic9$ = makeSymbol("S#23766", "CYC");
        $ic10$ = makeKeyword("ASSERTION");
        $ic11$ = makeKeyword("ACCESSORS");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#12012", "CYC"), (SubLObject)makeSymbol("S#12015", "CYC"), (SubLObject)makeSymbol("S#12016", "CYC"));
        $ic13$ = makeSymbol("CCONCATENATE");
        $ic14$ = makeKeyword("TT-EITHER");
        $ic15$ = makeInteger(128);
        $ic16$ = makeSymbol("S#23780", "CYC");
        $ic17$ = makeSymbol("FUNCTION-SPEC-P");
        $ic18$ = makeKeyword("SUPERIOR");
        $ic19$ = makeKeyword("INFERIOR");
        $ic20$ = makeString("invalid gt mode: ~a");
        $ic21$ = makeSymbol("S#23773", "CYC");
        $ic22$ = makeString("illegal value of *gt-mode*");
        $ic23$ = makeString("skip gt query");
        $ic24$ = makeString("(gt type violaton) ~a");
        $ic25$ = makeKeyword("GT-ERROR");
        $ic26$ = makeSymbol("QUOTE");
        $ic27$ = makeSymbol("S#23754", "CYC");
        $ic28$ = makeSymbol("S#23755", "CYC");
        $ic29$ = makeSymbol("S#23756", "CYC");
        $ic30$ = makeSymbol("S#23757", "CYC");
        $ic31$ = makeSymbol("S#23758", "CYC");
        $ic32$ = makeSymbol("S#23759", "CYC");
        $ic33$ = makeString("continue anyway");
        $ic34$ = makeSymbol("WARN");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 187 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/