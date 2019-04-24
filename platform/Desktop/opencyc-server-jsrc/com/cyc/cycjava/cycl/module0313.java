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
        if (module0313.NIL != module0205.f13155(var1)) {
            return (SubLObject)module0313.T;
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21138(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0004.f104(var2, module0145.$g1896$.getDynamicValue(var3), (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED);
    }
    
    public static SubLObject f21139(final SubLObject var4) {
        if (var4.eql((SubLObject)module0313.$ic0$)) {
            return (SubLObject)module0313.$ic1$;
        }
        if (var4.eql((SubLObject)module0313.$ic2$)) {
            return (SubLObject)module0313.$ic3$;
        }
        if (var4.eql((SubLObject)module0313.$ic4$)) {
            return (SubLObject)module0313.$ic5$;
        }
        if (var4.eql((SubLObject)module0313.$ic6$)) {
            return (SubLObject)module0313.$ic7$;
        }
        if (var4.eql((SubLObject)module0313.$ic8$)) {
            return (SubLObject)module0313.$ic9$;
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21140() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0145.$g1894$.getDynamicValue(var3);
        if (var4.eql((SubLObject)module0313.$ic10$)) {
            return module0226.f14795(module0145.$g1888$.getDynamicValue(var3));
        }
        if (var4.eql((SubLObject)module0313.$ic11$)) {
            SubLObject var5 = (SubLObject)module0313.NIL;
            if (module0313.NIL == var5) {
                SubLObject var6 = module0145.$g1893$.getDynamicValue(var3);
                SubLObject var7 = (SubLObject)module0313.NIL;
                var7 = var6.first();
                while (module0313.NIL == var5 && module0313.NIL != var6) {
                    SubLObject var9;
                    final SubLObject var8 = var9 = var7;
                    final SubLObject var10 = module0145.$g1888$.currentBinding(var3);
                    final SubLObject var11 = module0145.$g1891$.currentBinding(var3);
                    final SubLObject var12 = module0145.$g1892$.currentBinding(var3);
                    try {
                        module0145.$g1888$.bind((SubLObject)module0313.NIL, var3);
                        module0145.$g1891$.bind((SubLObject)module0313.NIL, var3);
                        module0145.$g1892$.bind((SubLObject)module0313.NIL, var3);
                        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0313.$ic12$);
                        module0145.$g1888$.setDynamicValue(var9.first(), var3);
                        var9 = var9.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0313.$ic12$);
                        module0145.$g1891$.setDynamicValue(var9.first(), var3);
                        var9 = var9.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0313.$ic12$);
                        module0145.$g1892$.setDynamicValue(var9.first(), var3);
                        var9 = var9.rest();
                        if (module0313.NIL == var9) {
                            var5 = (SubLObject)SubLObjectFactory.makeBoolean(module0313.NIL == module0226.f14795(module0145.$g1888$.getDynamicValue(var3)));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0313.$ic12$);
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
            return (SubLObject)SubLObjectFactory.makeBoolean(module0313.NIL == var5);
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21141(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0145.$g1894$.getDynamicValue(var15);
        if (var16.eql((SubLObject)module0313.$ic10$)) {
            return module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED);
        }
        if (var16.eql((SubLObject)module0313.$ic11$)) {
            SubLObject var17 = (SubLObject)module0313.NIL;
            if (module0313.NIL == var17) {
                SubLObject var18 = module0145.$g1893$.getDynamicValue(var15);
                SubLObject var19 = (SubLObject)module0313.NIL;
                var19 = var18.first();
                while (module0313.NIL == var17 && module0313.NIL != var18) {
                    SubLObject var21;
                    final SubLObject var20 = var21 = var19;
                    final SubLObject var22 = module0145.$g1888$.currentBinding(var15);
                    final SubLObject var23 = module0145.$g1891$.currentBinding(var15);
                    final SubLObject var24 = module0145.$g1892$.currentBinding(var15);
                    try {
                        module0145.$g1888$.bind((SubLObject)module0313.NIL, var15);
                        module0145.$g1891$.bind((SubLObject)module0313.NIL, var15);
                        module0145.$g1892$.bind((SubLObject)module0313.NIL, var15);
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1888$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1891$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1892$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        if (module0313.NIL == var21) {
                            var17 = module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0313.$ic12$);
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
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21142(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0145.$g1894$.getDynamicValue(var15);
        if (var16.eql((SubLObject)module0313.$ic10$)) {
            return module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED);
        }
        if (var16.eql((SubLObject)module0313.$ic11$)) {
            SubLObject var17 = (SubLObject)module0313.NIL;
            if (module0313.NIL == var17) {
                SubLObject var18 = module0145.$g1893$.getDynamicValue(var15);
                SubLObject var19 = (SubLObject)module0313.NIL;
                var19 = var18.first();
                while (module0313.NIL == var17 && module0313.NIL != var18) {
                    SubLObject var21;
                    final SubLObject var20 = var21 = var19;
                    final SubLObject var22 = module0145.$g1888$.currentBinding(var15);
                    final SubLObject var23 = module0145.$g1891$.currentBinding(var15);
                    final SubLObject var24 = module0145.$g1892$.currentBinding(var15);
                    try {
                        module0145.$g1888$.bind((SubLObject)module0313.NIL, var15);
                        module0145.$g1891$.bind((SubLObject)module0313.NIL, var15);
                        module0145.$g1892$.bind((SubLObject)module0313.NIL, var15);
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1888$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1891$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1892$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        if (module0313.NIL == var21) {
                            var17 = module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0313.$ic12$);
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
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21143(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0309.f20944(module0145.$g1948$.getDynamicValue(var15), var14, module0145.$g1951$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED);
    }
    
    public static SubLObject f21144(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0309.f20944(module0145.$g1948$.getDynamicValue(var15), var14, module0145.$g1952$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED);
    }
    
    public static SubLObject f21145(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0145.$g1894$.getDynamicValue(var15);
        if (var16.eql((SubLObject)module0313.$ic10$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0313.NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED) || module0313.NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED));
        }
        if (var16.eql((SubLObject)module0313.$ic11$)) {
            SubLObject var17 = (SubLObject)module0313.NIL;
            if (module0313.NIL == var17) {
                SubLObject var18 = module0145.$g1893$.getDynamicValue(var15);
                SubLObject var19 = (SubLObject)module0313.NIL;
                var19 = var18.first();
                while (module0313.NIL == var17 && module0313.NIL != var18) {
                    SubLObject var21;
                    final SubLObject var20 = var21 = var19;
                    final SubLObject var22 = module0145.$g1888$.currentBinding(var15);
                    final SubLObject var23 = module0145.$g1891$.currentBinding(var15);
                    final SubLObject var24 = module0145.$g1892$.currentBinding(var15);
                    try {
                        module0145.$g1888$.bind((SubLObject)module0313.NIL, var15);
                        module0145.$g1891$.bind((SubLObject)module0313.NIL, var15);
                        module0145.$g1892$.bind((SubLObject)module0313.NIL, var15);
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1888$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1891$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0313.$ic12$);
                        module0145.$g1892$.setDynamicValue(var21.first(), var15);
                        var21 = var21.rest();
                        if (module0313.NIL == var21) {
                            var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0313.NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1891$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED) || module0313.NIL != module0309.f20944(module0145.$g1888$.getDynamicValue(var15), var14, module0145.$g1892$.getDynamicValue(var15), (SubLObject)module0313.UNPROVIDED));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0313.$ic12$);
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
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21146(final SubLObject var4, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0145.$g1894$.getDynamicValue(var23);
        if (var24.eql((SubLObject)module0313.$ic10$)) {
            return f21147(var4, var22);
        }
        if (var24.eql((SubLObject)module0313.$ic11$)) {
            SubLObject var25 = (SubLObject)module0313.NIL;
            SubLObject var26 = module0145.$g1893$.getDynamicValue(var23);
            SubLObject var27 = (SubLObject)module0313.NIL;
            var27 = var26.first();
            while (module0313.NIL != var26) {
                SubLObject var29;
                final SubLObject var28 = var29 = var27;
                final SubLObject var30 = module0145.$g1888$.currentBinding(var23);
                final SubLObject var31 = module0145.$g1891$.currentBinding(var23);
                final SubLObject var32 = module0145.$g1892$.currentBinding(var23);
                try {
                    module0145.$g1888$.bind((SubLObject)module0313.NIL, var23);
                    module0145.$g1891$.bind((SubLObject)module0313.NIL, var23);
                    module0145.$g1892$.bind((SubLObject)module0313.NIL, var23);
                    cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0313.$ic12$);
                    module0145.$g1888$.setDynamicValue(var29.first(), var23);
                    var29 = var29.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0313.$ic12$);
                    module0145.$g1891$.setDynamicValue(var29.first(), var23);
                    var29 = var29.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0313.$ic12$);
                    module0145.$g1892$.setDynamicValue(var29.first(), var23);
                    var29 = var29.rest();
                    if (module0313.NIL == var29) {
                        if (var4 == module0313.$ic0$ && module0313.NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1891$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED)) {
                            var25 = (SubLObject)ConsesLow.cons(f21147(var4, var22), var25);
                        }
                        else if (var4 == module0313.$ic2$ && module0313.NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1892$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED)) {
                            var25 = (SubLObject)ConsesLow.cons(f21147(var4, var22), var25);
                        }
                        else if (var4 == module0313.$ic4$ && module0313.NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1891$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED) && module0313.NIL == module0309.f20944(module0145.$g1888$.getDynamicValue(var23), var22, module0145.$g1892$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED)) {
                            var25 = (SubLObject)ConsesLow.cons(f21147(var4, var22), var25);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0313.$ic12$);
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
            return Functions.apply(Symbols.symbol_function((SubLObject)module0313.$ic13$), Sequences.nreverse(var25));
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21147(final SubLObject var4, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (var4.eql((SubLObject)module0313.$ic0$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED);
        }
        if (var4.eql((SubLObject)module0313.$ic2$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED);
        }
        if (var4.eql((SubLObject)module0313.$ic4$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED);
        }
        if (var4.eql((SubLObject)module0313.$ic6$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED);
        }
        if (var4.eql((SubLObject)module0313.$ic8$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED);
        }
        if (var4.eql((SubLObject)module0313.$ic14$)) {
            return module0274.f18210(module0144.$g1852$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED);
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21148(SubLObject var27) {
        if (var27 == module0313.UNPROVIDED) {
            var27 = (SubLObject)module0313.$ic15$;
        }
        return Hashtables.make_hash_table(var27, (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED);
    }
    
    public static SubLObject f21149(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0313.NIL == f21150(var22));
    }
    
    public static SubLObject f21150(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0313.NIL;
        final SubLObject var25 = module0145.$g1902$.currentBinding(var23);
        try {
            module0145.$g1902$.bind((SubLObject)module0313.T, var23);
            if (module0313.NIL != Symbols.symbol_function((SubLObject)module0313.$ic16$) && !module0313.areAssertionsDisabledFor(me) && module0313.NIL == Types.function_spec_p(Symbols.symbol_function((SubLObject)module0313.$ic16$))) {
                throw new AssertionError(Symbols.symbol_function((SubLObject)module0313.$ic16$));
            }
            final SubLObject var11_29 = module0145.$g1905$.currentBinding(var23);
            try {
                module0145.$g1905$.bind(Symbols.symbol_function((SubLObject)module0313.$ic16$), var23);
                final SubLObject var26 = module0145.$g1895$.getDynamicValue(var23);
                if (var26.eql((SubLObject)module0313.$ic18$)) {
                    if (module0313.NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && module0313.NIL == f21138((SubLObject)module0313.$ic19$)) {
                        Errors.error((SubLObject)module0313.$ic20$, (SubLObject)module0313.$ic19$);
                    }
                    final SubLObject var11_30 = module0145.$g1895$.currentBinding(var23);
                    try {
                        module0145.$g1895$.bind((SubLObject)module0313.$ic19$, var23);
                        assert module0313.NIL != Types.function_spec_p((SubLObject)module0313.$ic21$) : module0313.$ic21$;
                        final SubLObject var11_31 = module0145.$g1904$.currentBinding(var23);
                        try {
                            module0145.$g1904$.bind((SubLObject)module0313.$ic21$, var23);
                            module0314.f21168(var22, (SubLObject)module0313.UNPROVIDED);
                        }
                        finally {
                            module0145.$g1904$.rebind(var11_31, var23);
                        }
                    }
                    finally {
                        module0145.$g1895$.rebind(var11_30, var23);
                    }
                }
                else if (var26.eql((SubLObject)module0313.$ic19$)) {
                    if (module0313.NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && module0313.NIL == f21138((SubLObject)module0313.$ic18$)) {
                        Errors.error((SubLObject)module0313.$ic20$, (SubLObject)module0313.$ic18$);
                    }
                    final SubLObject var11_32 = module0145.$g1895$.currentBinding(var23);
                    try {
                        module0145.$g1895$.bind((SubLObject)module0313.$ic18$, var23);
                        assert module0313.NIL != Types.function_spec_p((SubLObject)module0313.$ic21$) : module0313.$ic21$;
                        final SubLObject var11_33 = module0145.$g1904$.currentBinding(var23);
                        try {
                            module0145.$g1904$.bind((SubLObject)module0313.$ic21$, var23);
                            module0314.f21168(var22, (SubLObject)module0313.UNPROVIDED);
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
                    f21151((SubLObject)module0313.FIVE_INTEGER, (SubLObject)module0313.$ic22$, module0145.$g1895$.getDynamicValue(var23), (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED);
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
        if (module0145.$g1905$.getDynamicValue(var23).isFunctionSpec() && module0313.NIL == f21153(var22)) {
            module0145.$g1902$.setDynamicValue((SubLObject)module0313.NIL, var23);
            module0314.f21182((SubLObject)module0313.UNPROVIDED);
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21154(final SubLObject var14, final SubLObject var4, final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0145.$g1941$.getDynamicValue(var35).numGE(var34)) {
            final SubLObject var36 = f21139(var4);
            if (var36.isFunctionSpec() && module0313.NIL == Functions.funcall(var36, var14)) {
                f21155(var34, (SubLObject)module0313.$ic23$, (SubLObject)module0313.$ic24$, f21146(var4, var14), (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED, (SubLObject)module0313.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)module0313.$ic25$, (SubLObject)module0313.NIL);
            }
        }
        else if ((var4.eql((SubLObject)module0313.$ic0$) || var4.eql((SubLObject)module0313.$ic2$) || var4.eql((SubLObject)module0313.$ic6$) || var4.eql((SubLObject)module0313.$ic8$)) && module0313.NIL == f21137(var14)) {
            Dynamic.sublisp_throw((SubLObject)module0313.$ic25$, (SubLObject)module0313.NIL);
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21153(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0145.$g1905$.getDynamicValue(var23);
        if (var24.eql((SubLObject)module0313.$ic26$) || var24.eql((SubLObject)module0313.$ic27$)) {
            return module0314.f21168(var22, (SubLObject)module0313.UNPROVIDED);
        }
        if (var24.eql((SubLObject)module0313.$ic26$) || var24.eql((SubLObject)module0313.$ic28$)) {
            return module0314.f21218(var22, (SubLObject)module0313.UNPROVIDED);
        }
        return (SubLObject)(module0145.$g1905$.getDynamicValue(var23).isFunctionSpec() ? Functions.funcall(module0145.$g1905$.getDynamicValue(var23), var22) : module0313.NIL);
    }
    
    public static SubLObject f21156(final SubLObject var22, final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = module0145.$g1909$.getDynamicValue(var37);
        if (var38.eql((SubLObject)module0313.$ic26$) || var38.eql((SubLObject)module0313.EQ)) {
            return Equality.eq(var22, var36);
        }
        return (SubLObject)(module0145.$g1909$.getDynamicValue(var37).isFunctionSpec() ? Functions.funcall(module0145.$g1909$.getDynamicValue(var37), var22, var36) : module0313.NIL);
    }
    
    public static SubLObject f21157(final SubLObject var37, final SubLObject var22) {
        if (var37.eql((SubLObject)module0313.$ic26$) || var37.eql((SubLObject)module0313.$ic29$)) {
            return module0314.f21170(var22);
        }
        if (var37.eql((SubLObject)module0313.$ic26$) || var37.eql((SubLObject)module0313.$ic30$)) {
            return module0314.f21181(var22);
        }
        if (var37.eql((SubLObject)module0313.$ic26$) || var37.eql((SubLObject)module0313.$ic31$)) {
            return module0314.f21222(var22);
        }
        if (var37.eql((SubLObject)module0313.$ic26$) || var37.eql((SubLObject)module0313.$ic32$)) {
            return module0314.f21204(var22);
        }
        return Functions.funcall(var37, var22);
    }
    
    public static SubLObject f21158(final SubLObject var34, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == module0313.UNPROVIDED) {
            var39 = (SubLObject)module0313.NIL;
        }
        if (var40 == module0313.UNPROVIDED) {
            var40 = (SubLObject)module0313.NIL;
        }
        if (var41 == module0313.UNPROVIDED) {
            var41 = (SubLObject)module0313.NIL;
        }
        if (var42 == module0313.UNPROVIDED) {
            var42 = (SubLObject)module0313.NIL;
        }
        if (var43 == module0313.UNPROVIDED) {
            var43 = (SubLObject)module0313.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var44).numGE(var34)) {
            PrintLow.format((SubLObject)module0313.T, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
            return (SubLObject)module0313.NIL;
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21151(final SubLObject var34, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == module0313.UNPROVIDED) {
            var39 = (SubLObject)module0313.NIL;
        }
        if (var40 == module0313.UNPROVIDED) {
            var40 = (SubLObject)module0313.NIL;
        }
        if (var41 == module0313.UNPROVIDED) {
            var41 = (SubLObject)module0313.NIL;
        }
        if (var42 == module0313.UNPROVIDED) {
            var42 = (SubLObject)module0313.NIL;
        }
        if (var43 == module0313.UNPROVIDED) {
            var43 = (SubLObject)module0313.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var44).numGE(var34)) {
            Errors.cerror((SubLObject)module0313.$ic33$, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        else if (Numbers.add((SubLObject)module0313.TWO_INTEGER, module0145.$g1940$.getDynamicValue(var44)).numGE(var34)) {
            Errors.warn(var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21155(final SubLObject var34, final SubLObject var44, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == module0313.UNPROVIDED) {
            var39 = (SubLObject)module0313.NIL;
        }
        if (var40 == module0313.UNPROVIDED) {
            var40 = (SubLObject)module0313.NIL;
        }
        if (var41 == module0313.UNPROVIDED) {
            var41 = (SubLObject)module0313.NIL;
        }
        if (var42 == module0313.UNPROVIDED) {
            var42 = (SubLObject)module0313.NIL;
        }
        if (var43 == module0313.UNPROVIDED) {
            var43 = (SubLObject)module0313.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var45).numGE(var34)) {
            Errors.cerror(var44, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        else if (Numbers.add((SubLObject)module0313.TWO_INTEGER, module0145.$g1940$.getDynamicValue(var45)).numGE(var34)) {
            Errors.warn(var38, new SubLObject[] { var39, var40, var41, var42, var43 });
        }
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21159(final SubLObject var34, final SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var39 == module0313.UNPROVIDED) {
            var39 = (SubLObject)module0313.NIL;
        }
        if (var40 == module0313.UNPROVIDED) {
            var40 = (SubLObject)module0313.NIL;
        }
        if (var41 == module0313.UNPROVIDED) {
            var41 = (SubLObject)module0313.NIL;
        }
        if (var42 == module0313.UNPROVIDED) {
            var42 = (SubLObject)module0313.NIL;
        }
        if (var43 == module0313.UNPROVIDED) {
            var43 = (SubLObject)module0313.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0145.$g1940$.getDynamicValue(var44).numGE(var34)) {
            Functions.apply((SubLObject)module0313.$ic34$, var38, new SubLObject[] { var39, var40, var41, var42, var43 });
            return (SubLObject)module0313.NIL;
        }
        return (SubLObject)module0313.NIL;
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
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21161() {
        return (SubLObject)module0313.NIL;
    }
    
    public static SubLObject f21162() {
        return (SubLObject)module0313.NIL;
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
        $ic0$ = SubLObjectFactory.makeKeyword("GT-INDEX");
        $ic1$ = SubLObjectFactory.makeSymbol("S#23763", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("GT-GATHER");
        $ic3$ = SubLObjectFactory.makeSymbol("S#23764", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("GT-EITHER");
        $ic5$ = SubLObjectFactory.makeSymbol("S#23767", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("TT-INDEX");
        $ic7$ = SubLObjectFactory.makeSymbol("S#23765", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("TT-GATHER");
        $ic9$ = SubLObjectFactory.makeSymbol("S#23766", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic11$ = SubLObjectFactory.makeKeyword("ACCESSORS");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12012", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12015", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12016", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic14$ = SubLObjectFactory.makeKeyword("TT-EITHER");
        $ic15$ = SubLObjectFactory.makeInteger(128);
        $ic16$ = SubLObjectFactory.makeSymbol("S#23780", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic18$ = SubLObjectFactory.makeKeyword("SUPERIOR");
        $ic19$ = SubLObjectFactory.makeKeyword("INFERIOR");
        $ic20$ = SubLObjectFactory.makeString("invalid gt mode: ~a");
        $ic21$ = SubLObjectFactory.makeSymbol("S#23773", "CYC");
        $ic22$ = SubLObjectFactory.makeString("illegal value of *gt-mode*");
        $ic23$ = SubLObjectFactory.makeString("skip gt query");
        $ic24$ = SubLObjectFactory.makeString("(gt type violaton) ~a");
        $ic25$ = SubLObjectFactory.makeKeyword("GT-ERROR");
        $ic26$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic27$ = SubLObjectFactory.makeSymbol("S#23754", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#23755", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#23756", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#23757", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#23758", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#23759", "CYC");
        $ic33$ = SubLObjectFactory.makeString("continue anyway");
        $ic34$ = SubLObjectFactory.makeSymbol("WARN");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0313.class
	Total time: 187 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/